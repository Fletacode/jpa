package jpashop;


import jakarta.persistence.*;

@Entity
public class Delivery {

    @Id
    @GeneratedValue
    @Column(name="DELIVERY_ID")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    private String street;

    private String zipcode;

    private String deliveryStatus;


}
