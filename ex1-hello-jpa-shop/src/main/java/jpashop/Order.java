package jpashop;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Order {

    @Id @GeneratedValue
    @Column(name="ORDER_ID")
    private Long id;


    @ManyToOne
    @JoinColumn(name="MEMBER_ID")
    private Member member;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems = new ArrayList<OrderItem>();

    @OneToOne()
    @JoinColumn(name="DELIVERY_ID")
    private Delivery delivery;

    private Date orderDate;

    private String status;


}
