package Dao;

import model.Order;

import java.util.List;

public class orderDao implements demoCS3DAO<Order> {
    @Override
    public List<Order> selectAll() {
        return null;
    }

    @Override
    public void insert(Order order) {

    }

    @Override
    public boolean update(Order order) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
