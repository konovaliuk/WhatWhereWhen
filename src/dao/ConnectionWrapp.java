package dao;
import java.sql.*;



public class ConnectionWrapp implements AutoCloseable{
	private Connection connection;

 public ConnectionWrapp(Connection connection) {
		super();
		this.connection = connection;
	}

	public Statement createStatement() throws SQLException {
        if (connection != null) {
            Statement statement = connection.createStatement();
            if (statement != null) {
                return statement;
            }
        }
        throw new SQLException("connection or statement is null");
    }

    public PreparedStatement prepareStatement(String s) throws SQLException {
        if (connection != null) {
            PreparedStatement preparedStatement = connection.prepareStatement(s);
            if (preparedStatement != null) {
                return preparedStatement;
            }
        }
        throw new SQLException("connection or preparedStatement is null");
    }


    public void commit() throws SQLException {
        connection.commit();
    }

    public void closeStatement(Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                System.err.println("statement is null " + e);
            }
        }
    }

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		if (connection != null) {
            connection.close();
            }
	}
}
