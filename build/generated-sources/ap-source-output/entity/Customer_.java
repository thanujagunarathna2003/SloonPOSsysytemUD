package entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Customer.class)
public abstract class Customer_ {

	public static volatile SingularAttribute<Customer, String> fname;
	public static volatile SingularAttribute<Customer, String> lname;
	public static volatile SingularAttribute<Customer, Gender> gender;
	public static volatile SingularAttribute<Customer, String> mobile;
	public static volatile SingularAttribute<Customer, String> id;
	public static volatile SingularAttribute<Customer, AgeStatus> ageStatus;

	public static final String FNAME = "fname";
	public static final String LNAME = "lname";
	public static final String GENDER = "gender";
	public static final String MOBILE = "mobile";
	public static final String ID = "id";
	public static final String AGE_STATUS = "ageStatus";

}

