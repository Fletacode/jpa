package jpashop;

import jakarta.persistence.Entity;

@Entity
public class Book extends Item{

    private String ISBN;
    private String author;

}
