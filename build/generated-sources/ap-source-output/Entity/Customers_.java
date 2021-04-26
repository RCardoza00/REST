package Entity;

import Entity.Employees;
import Entity.Orders;
import Entity.Payments;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-25T23:31:26")
@StaticMetamodel(Customers.class)
public class Customers_ { 

    public static volatile SingularAttribute<Customers, String> country;
    public static volatile SingularAttribute<Customers, String> city;
    public static volatile SingularAttribute<Customers, String> contactFirstName;
    public static volatile SingularAttribute<Customers, String> postalCode;
    public static volatile SingularAttribute<Customers, Employees> salesRepEmployeeNumber;
    public static volatile CollectionAttribute<Customers, Orders> ordersCollection;
    public static volatile SingularAttribute<Customers, Integer> customerNumber;
    public static volatile SingularAttribute<Customers, String> customerName;
    public static volatile SingularAttribute<Customers, String> phone;
    public static volatile CollectionAttribute<Customers, Payments> paymentsCollection;
    public static volatile SingularAttribute<Customers, String> addressLine1;
    public static volatile SingularAttribute<Customers, BigDecimal> creditLimit;
    public static volatile SingularAttribute<Customers, String> contactLastName;
    public static volatile SingularAttribute<Customers, String> addressLine2;
    public static volatile SingularAttribute<Customers, String> state;

}