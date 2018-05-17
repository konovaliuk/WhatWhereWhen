package dao;

import beans.Questions;
import exeptions.DaoException;

public class QuestionDao implements IQuestionDao {

	private ConnectionWrapp wrapp;
	private static final String SQL_SELECT_ALL =
            "SELECT * FROM questions";
    private static final String SQL_SELECT_BY_ID =
            "SELECT * FROM questions WHERE id=?";
    
    
	
	public QuestionDao(ConnectionWrapp wrapp) {
		super();
		this.wrapp = wrapp;
	}



	@Override
	public Questions getQuestionById(int id) throws DaoException {
		
		return null;
	}

}
