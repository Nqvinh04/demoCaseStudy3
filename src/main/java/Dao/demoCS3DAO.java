package Dao;

import java.util.List;

public interface demoCS3DAO<T> {
    // CRUD
    List<T> selectAll();
    void insert(T t);
    void update(T t);
    void delete(int id);
}
