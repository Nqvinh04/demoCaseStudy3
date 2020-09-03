package Dao;

import model.Catalog;

import java.util.List;

public class catalogDao implements demoCS3DAO<Catalog> {
    private final String  jdbcURL = "jdbc:mysql://localhost:3306/demo?useSSl=false";
    private final String jdbcUsername = "root";
    private final String jdbcPassword = "123456";

    private  static final String INSERT_CATALOG = "INSERT INTO catalog" +
            " (id, name, parent_id) VALUES" +"(?,?,?);";
//    private static final String SELECT_USER_BY_ID = "select id,name,email,country from users where id =?";
    private static final String SELECT_ALL_CATALOG = "select * from catalog;";
    private static final String DELETE_CATALOG_SQL = "delete from catalog where id = ?;";
    private static final String UPDATE_CATALOG_SQL = "update catalog set name = ?,parent_id where id = ?;";
//    private static final String FIND_USER_BY_COUNTRY = "select * from users where country = ?;";
//    private static final String SORT_BY_NAME = "select * from users order by name;";
    @Override
    public List<Catalog> selectAll() {

        return null;
    }

    @Override
    public void insert(Catalog catalog) {

    }

    @Override
    public boolean update(Catalog catalog) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
