package Dao;

import model.Catalog;

import java.util.List;

public class catalogDao implements demoCS3DAO<Catalog> {
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
