package ru.roman.restaurant.repository;

import ru.roman.restaurant.model.Restaurant;

import java.util.List;

public interface RestaurantRepository {
    // null if updated meal do not belong to userId
    Restaurant save(Restaurant meal);

    // false if meal do not belong to userId
    boolean delete(int id);

    // null if meal do not belong to userId
    Restaurant get(int id);

    // ORDERED dateTime desc
    List<Restaurant> getAll();

    void update(Restaurant restaurant);

    Restaurant getByName(String name);

    //TODO setMenu();
}
