package dao;

import exeptions.DaoException;

public interface IConnectionFactory {
	ConnectionWrapp getConnection() throws DaoException;
    void closeConnection() throws DaoException;

}
