package Entity;

import Entity.Customers;
import Entity.Orderdetails;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-25T23:31:26")
@StaticMetamodel(Orders.class)
public class Orders_ { 

    public static volatile CollectionAttribute<Orders, Orderdetails> orderdetailsCollection;
    public static volatile SingularAttribute<Orders, String> comments;
    public static volatile SingularAttribute<Orders, Integer> orderNumber;
    public static volatile SingularAttribute<Orders, Date> requiredDate;
    public static volatile SingularAttribute<Orders, Customers> customerNumber;
    public static volatile SingularAttribute<Orders, Date> orderDate;
    public static volatile SingularAttribute<Orders, Date> shippedDate;
    public static volatile SingularAttribute<Orders, String> status;

}