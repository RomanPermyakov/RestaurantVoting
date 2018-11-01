package ru.roman.restaurant.model;

import org.hibernate.annotations.Columns;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;

@NamedQueries({
        @NamedQuery(name = Restaurant.ALL_SORTED, query = "SELECT r FROM ru.roman.restaurant.model.Restaurant r")
})
@Entity
@Table(name = "restaurants")
public class Restaurant {
    public final static String ALL_SORTED = "GetAll";

    @Id
    private int id;

    @NotBlank
    @Size(min = 2, max = 100)
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "votes", nullable = false, columnDefinition = "integer default 0")
    private int votes;

    @CollectionTable(name = "menu", joinColumns = @JoinColumn(name = "rest_id"))
    @ElementCollection(fetch = FetchType.LAZY)
    private List<String> menu;


    public List<String> getMenu() {
        return menu;
    }

    public void setMenu(List<String> menu) {
        this.menu = menu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }
}
