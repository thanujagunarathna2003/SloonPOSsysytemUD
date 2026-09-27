package model;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;
import util.HibernateUtil;

public class IDGenerator {

    public static String generateId( String prefix, String entityName) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String newId = prefix + "_000001"; // default if table empty

        try {
            // HQL to get all IDs from entity
            Query<String> query = session.createQuery(
                    "SELECT e.id FROM " + entityName + " e", String.class
            );

            List<String> ids = query.getResultList();

            if (!ids.isEmpty()) {
                // Extract numeric part and find max
                int max = ids.stream()
                        .filter(id -> id.startsWith(prefix + "_"))
                        .map(id -> id.substring((prefix + "_").length()))  // remove prefix_
                        .map(Integer::parseInt)
                        .max(Integer::compareTo)
                        .orElse(0);

                // Generate next ID
                newId = prefix + "_" + String.format("%06d", max + 1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return newId;
    }
}
