package Dao;

import model.Admin;

import java.util.List;

public class adminDao implements demoCS3DAO<Admin> {
    private String jdbcURL= "jdbc:mysql://localhost:3306/demo?useSSl=false";
    private String jdbcUserName="root";
    private String jdbcPassword="123456";

    private static final String SELECT_ALL_ADMIN = "select * from admin";





    @Override
    public List<Admin> selectAll() {
        return null;
    }

    @Override
    public void insert(Admin admin) {

    }

    @Override
    public boolean update(Admin admin) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
