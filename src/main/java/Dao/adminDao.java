package Dao;

import model.Admin;

import java.util.List;

public class adminDao implements demoCS3DAO<Admin> {
    private String jdbcURL= "jdbc:mysql://localhost:3306/demo?useSSl=false";
    private String jdbcUserName="root";
    private String jdbcPassword="123456";

    private static final String SELECT_ALL_ADMIN = "select * from admin";
    private static final String DELETE_ADMIN_BY_ID = "delete from admin where = ?;";
    private static final String UPDATE_ADMIN_SQL = "update admin set id=?, name=?, passWord=? ";





    @Override
    public List<Admin> selectAll() {
        return null;
    }

    @Override
    public void insert(Admin admin) {

    }

    @Override
    public void update(Admin admin) {

    }

    @Override
    public void delete(int id) {

    }
}
