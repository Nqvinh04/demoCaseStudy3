package Dao;

import java.sql.SQLException;
import java.util.List;

public interface demoCS3DAO<T> {
    // CRUD
    List<T> selectAll();
    void insert(T t);
    boolean update(T t) throws SQLException;
    boolean delete(int id) throws SQLException;
}
