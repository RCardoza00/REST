package Entity;

import Entity.Customers;
import Entity.PaymentsPK;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-25T23:31:26")
@StaticMetamodel(Payments.class)
public class Payments_ { 

    public static volatile SingularAttribute<Payments, BigDecimal> amount;
    public static volatile SingularAttribute<Payments, PaymentsPK> paymentsPK;
    public static volatile SingularAttribute<Payments, Customers> customers;
    public static volatile SingularAttribute<Payments, Date> paymentDate;

}