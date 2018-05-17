package dao;

import exeptions.DaoException;

public interface IDaoFactory {
	IUserDao getUserDao(ConnectionWrapp wrapp) throws DaoException;
	IQuestionDao getQuestionDao(ConnectionWrapp wrapp) throws DaoException;
}
