package Dao;

import model.Transaction;

import java.util.List;

public class transaction implements demoCS3DAO<Transaction> {
    @Override
    public List<Transaction> selectAll() {
        return null;
    }

    @Override
    public void insert(Transaction transaction) {

    }

    @Override
    public boolean update(Transaction transaction) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
