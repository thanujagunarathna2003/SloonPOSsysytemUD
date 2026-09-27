package entity;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Booking.class)
public abstract class Booking_ {

	public static volatile SingularAttribute<Booking, LocalDate> date;
	public static volatile SingularAttribute<Booking, LocalTime> start_time;
	public static volatile SingularAttribute<Booking, LocalTime> end_time;
	public static volatile SingularAttribute<Booking, WorkingStatus> working_status_id;
	public static volatile SingularAttribute<Booking, String> id;
	public static volatile SingularAttribute<Booking, Customer> customer_id;
	public static volatile SingularAttribute<Booking, BookingStatus> booking_status_id;

	public static final String DATE = "date";
	public static final String START_TIME = "start_time";
	public static final String END_TIME = "end_time";
	public static final String WORKING_STATUS_ID = "working_status_id";
	public static final String ID = "id";
	public static final String CUSTOMER_ID = "customer_id";
	public static final String BOOKING_STATUS_ID = "booking_status_id";

}

