package entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Gender.class)
public abstract class Gender_ {

	public static volatile SingularAttribute<Gender, Integer> id;
	public static volatile SingularAttribute<Gender, String> gender_name;

	public static final String ID = "id";
	public static final String GENDER_NAME = "gender_name";

}

