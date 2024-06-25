package jpashop;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="ORDERS")
public class Order {
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ORDER_ID")
    private Long id;

    private Date orderDate;

    @ManyToOne
    @JoinColumn(name="MEMBER_ID")
    private Member member;

    @OneToOne
    @JoinColumn(name="DELIVERY_ID")
    private Delivery delivery;





    public void addOrderMember(Member member){
        this.member = member;
        member.getOrders().add(this);
    }


    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

}
