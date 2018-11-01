package ru.roman.restaurant.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.roman.restaurant.model.Restaurant;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class RestaurantRepositoryImpl implements RestaurantRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Restaurant save(Restaurant meal) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Restaurant get(int id) {
        return null;
    }

    @Override
    public List<Restaurant> getAll() {
        return entityManager.createNamedQuery(Restaurant.ALL_SORTED, Restaurant.class).getResultList();
    }

    @Override
    public void update(Restaurant restaurant) {

    }

    @Override
    public Restaurant getByName(String name) {
        return null;
    }
}
