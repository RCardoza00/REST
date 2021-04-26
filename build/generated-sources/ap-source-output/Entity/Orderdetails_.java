package Entity;

import Entity.OrderdetailsPK;
import Entity.Orders;
import Entity.Products;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-25T23:31:26")
@StaticMetamodel(Orderdetails.class)
public class Orderdetails_ { 

    public static volatile SingularAttribute<Orderdetails, OrderdetailsPK> orderdetailsPK;
    public static volatile SingularAttribute<Orderdetails, Integer> quantityOrdered;
    public static volatile SingularAttribute<Orderdetails, Orders> orders;
    public static volatile SingularAttribute<Orderdetails, Short> orderLineNumber;
    public static volatile SingularAttribute<Orderdetails, BigDecimal> priceEach;
    public static volatile SingularAttribute<Orderdetails, Products> products;

}