package jpashop;

import jakarta.persistence.*;

@Entity
public class OrderItem {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ORDER_ITEM_ID")
    private Long id;




    private int itemPrice;

    private int count;

    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    private Order order;


    @ManyToOne
    @JoinColumn(name="ITEM_ID")
    private Item item;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }







    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }





}
