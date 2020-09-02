package Dao;

import model.User;

import java.util.List;

public class userDao implements demoCS3DAO<User> {
    @Override
    public List<User> selectAll() {
        return null;
    }

    @Override
    public void insert(User user) {

    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
