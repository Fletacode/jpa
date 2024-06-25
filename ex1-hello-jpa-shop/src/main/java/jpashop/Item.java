package jpashop;


import jakarta.persistence.*;

@Entity
@Inheritance(strategy= InheritanceType.JOINED)
//@Inheritance(strategy= InheritanceType.SINGLE_TABLE) //단일 테이블 전략
@DiscriminatorColumn //Dtype 생성
public abstract class Item {
    @Id
    @GeneratedValue
    @Column(name="ITEM_ID")
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;



    public Long getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }





}
