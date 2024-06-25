package jpashop;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Item {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ITEM_ID")
    private Long id;

    private String name;
    private String price;
    private String stockQunantity;

    @OneToMany(mappedBy = "item")
    private List<OrderItem> orderItems = new ArrayList<OrderItem>();


    @ManyToMany(mappedBy = "items")
    private List<Category> categories = new ArrayList<Category>();



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStockQunantity() {
        return stockQunantity;
    }

    public void setStockQunantity(String stockQunantity) {
        this.stockQunantity = stockQunantity;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }




}
