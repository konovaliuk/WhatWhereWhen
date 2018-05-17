package dao;

import beans.User;
import exeptions.DaoException;

public class UserDao implements IUserDao {
	private ConnectionWrapp wrapp;
	private static final String SQL_SELECT_ALL =
            "SELECT * FROM user";
    private static final String SQL_SELECT_BY_ID =
            "SELECT * FROM user WHERE id=?";
    private static final String SQL_SELECT_BY_USERNAME =
            "SELECT * FROM user WHERE username=?";
    private static final String SQL_SELECT_BY_EMAIL =
            "SELECT * FROM user WHERE email=?";
    
    
	public UserDao(ConnectionWrapp wrapp) {
		super();
		this.wrapp = wrapp;
	}


	@Override
	public User getByEmail(String email) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	

	}
	
