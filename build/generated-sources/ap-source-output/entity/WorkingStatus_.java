package entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(WorkingStatus.class)
public abstract class WorkingStatus_ {

	public static volatile SingularAttribute<WorkingStatus, Integer> id;
	public static volatile SingularAttribute<WorkingStatus, String> status;

	public static final String ID = "id";
	public static final String STATUS = "status";

}

