package Dao;

import model.Product;

import java.util.List;

public class productDao implements demoCS3DAO<Product> {
    private final String jdbcURL = "jdbc:mysql://localhost:3306/demo?useSSl=false";
    private final String jdbcUsername = "root";
    private final String jdbcPassword = "123456";

    private  static final String INSERT_USERS_SQL = "INSERT INTO product" +
            " (id, catalog_id, name, price,image_link, image_list, created) VALUES" +"(?,?,?,?,?,?,?);";
//    private static final String SELECT_USER_BY_ID = "select id,name,email,country from users where id =?";
    private static final String SELECT_ALL_USERS = "select * from product";
    private static final String DELETE_USERS_SQL = "delete from product where id = ?;";
    private static final String UPDATE_USERS_SQL = "update product set " +
            " (id, catalog_id, name, price,image_link, image_list, created) VALUES" +"(?,?,?,?,?,?,?);";
//    private static final String FIND_USER_BY_COUNTRY = "select * from product where country = ?;";
//    private static final String SORT_BY_NAME = "select * from product order by name;";
    @Override
    public List<Product> selectAll() {
        return null;
    }

    @Override
    public void insert(Product product) {

    }

    @Override
    public void update(Product product) {
    }

    @Override
    public void delete(int id) {
    }
}
