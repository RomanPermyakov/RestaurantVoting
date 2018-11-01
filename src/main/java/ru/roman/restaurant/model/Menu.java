package ru.roman.restaurant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "menus")
public class Menu {
    @Id
    private int id;

    @NotEmpty
    @Column(name = "dish1", nullable = false)
    private String dish1;

    @NotEmpty
    @Column(name = "dish2", nullable = false)
    private String dish2;

    @Column(name = "dish3")
    private String dish3;

    @Column(name = "dish4")
    private String dish4;

    @Column(name = "dish5")
    private String dish5;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDish1() {
        return dish1;
    }

    public void setDish1(String dish1) {
        this.dish1 = dish1;
    }

    public String getDish2() {
        return dish2;
    }

    public void setDish2(String dish2) {
        this.dish2 = dish2;
    }

    public String getDish3() {
        return dish3;
    }

    public void setDish3(String dish3) {
        this.dish3 = dish3;
    }

    public String getDish4() {
        return dish4;
    }

    public void setDish4(String dish4) {
        this.dish4 = dish4;
    }

    public String getDish5() {
        return dish5;
    }

    public void setDish5(String dish5) {
        this.dish5 = dish5;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", dish1='" + dish1 + '\'' +
                ", dish2='" + dish2 + '\'' +
                ", dish3='" + dish3 + '\'' +
                ", dish4='" + dish4 + '\'' +
                ", dish5='" + dish5 + '\'' +
                '}';
    }
}
