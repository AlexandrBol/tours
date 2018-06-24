package ua.org.tours.DAO.api;

import ua.org.tours.model.Entity;

import java.util.List;

public interface DAO<K, T extends Entity<K>> {

    List<T> getAll();

    T getById(K key);

    void save(T entity);

    void delete(K key);

    void update(T entity);

    T getBy(String fieldName, String value);
}
