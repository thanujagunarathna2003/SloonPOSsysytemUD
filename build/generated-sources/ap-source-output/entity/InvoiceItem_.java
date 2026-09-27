package entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(InvoiceItem.class)
public abstract class InvoiceItem_ {

	public static volatile SingularAttribute<InvoiceItem, Booking> booking_id;
	public static volatile SingularAttribute<InvoiceItem, CustomerWantCategory> cus_want_category_id;
	public static volatile SingularAttribute<InvoiceItem, Integer> id;

	public static final String BOOKING_ID = "booking_id";
	public static final String CUS_WANT_CATEGORY_ID = "cus_want_category_id";
	public static final String ID = "id";

}

