package dao;

import beans.User;
import exeptions.DaoException;

public interface IUserDao {
    User getByEmail(String email) throws DaoException;
}
