package entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Invoice.class)
public abstract class Invoice_ {

	public static volatile SingularAttribute<Invoice, Double> price;
	public static volatile SingularAttribute<Invoice, InvoiceItem> invoice_item_id;
	public static volatile SingularAttribute<Invoice, String> id;

	public static final String PRICE = "price";
	public static final String INVOICE_ITEM_ID = "invoice_item_id";
	public static final String ID = "id";

}

