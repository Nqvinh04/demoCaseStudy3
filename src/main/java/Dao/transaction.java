package Dao;

import model.Transaction;

import java.util.List;

public class transaction implements demoCS3DAO<Transaction> {
    private String jdbcURL = "jdbc:mysql://localhost:3306/demo?useSSl=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "123456";

    private  static final String INSERT_TRANSACTION_SQL = "INSERT INTO transaction" +
            " (id, status, user_id, user_name,\n" +
            " user_email, user_phone, amount,\n" +
            " payment, payment_info, message,\n" +
            " security, created) VALUES" +"(?,?,?,?,?,?,?,?,?,?,?,?);";
    //    private static final String SELECT_ORDER_BY_ID = "select id,name,email,country from orders where id =?;";
    private static final String SELECT_ALL_TRANSACTION = "select * from transaction;";
    private static final String DELETE_TRANSACTION_SQL = "delete from transaction where id = ?;";
    private static final String UPDATE_TRANSACTION_SQL = "update transaction set * where id = ?;";
    //    private static final String FIND_ORDER_BY_COUNTRY = "select * from orders where country = ?;";
//    private static final String SORT_BY_NAME = "select * from orders order by name;";
    @Override
    public List<Transaction> selectAll() {
        return null;
    }

    @Override
    public void insert(Transaction transaction) {

    }

    @Override
    public  void update(Transaction transaction) {
        
    }

    @Override
    public  void delete(int id) {
        
    }
}
