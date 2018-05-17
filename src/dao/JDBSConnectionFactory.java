package dao;

import exeptions.DaoException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class JDBSConnectionFactory implements IConnectionFactory {
	protected DataSource dataSource;
    protected ConnectionWrapp connection;

    private JDBSConnectionFactory() throws DaoException{
        try{
            Context initCtx = new InitialContext();
            Context envCtx = (Context) initCtx.lookup("java:comp/env");

            dataSource = (DataSource)
                    envCtx.lookup("jdbc/libraryDB");
        }catch (Exception e){
            throw new DaoException("Error while creating");
        }
    }

	@Override
	public ConnectionWrapp getConnection() throws DaoException {
		throw new DaoException("Some Error:((");
	}

	@Override
	public void closeConnection() throws DaoException {
		
		throw new DaoException("Some Error:((");
	}

    
    
}
