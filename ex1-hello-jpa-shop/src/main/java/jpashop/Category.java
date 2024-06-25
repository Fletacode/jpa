package jpashop;


import jakarta.persistence.*;

import java.util.*;


@Entity
public class Category {

    @Id @GeneratedValue()
    @Column(name="CATEGORY_ID")
    private Long id;

    private String name;

    @ManyToMany @JoinTable(name="CATEGORY_ITEM",
                            joinColumns =  @JoinColumn(name="CATEGORY_ID"),
                            inverseJoinColumns = @JoinColumn(name="ITEM_ID")
    )
    List<Item> items = new ArrayList<Item>();



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
}
