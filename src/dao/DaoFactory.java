package dao;

import exeptions.DaoException;

public class DaoFactory implements IDaoFactory {

	@Override
	public IUserDao getUserDao(ConnectionWrapp wrapp) throws DaoException {
		return new UserDao(wrapp);
	}

	@Override
	public IQuestionDao getQuestionDao(ConnectionWrapp wrapp) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}


	
}
