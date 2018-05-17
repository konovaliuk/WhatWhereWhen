package dao;

import beans.Questions;
import exeptions.DaoException;


public interface IQuestionDao {
	 Questions  getQuestionById(int id)throws DaoException;
	 }