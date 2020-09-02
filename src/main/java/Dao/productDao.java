package Dao;

import model.Product;

import java.util.List;

public class productDao implements demoCS3DAO<Product> {
    @Override
    public List<Product> selectAll() {
        return null;
    }

    @Override
    public void insert(Product product) {

    }

    @Override
    public boolean update(Product product) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
