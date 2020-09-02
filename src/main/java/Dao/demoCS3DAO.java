package Dao;

import java.util.List;

public interface demoCS3DAO<T> {
    // CRUD
    List<T> selectAll();
    void insert(T t);
    boolean update(T t);
    boolean delete(int id);
}
