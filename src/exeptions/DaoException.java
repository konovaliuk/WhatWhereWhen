package exeptions;

import java.sql.SQLException;

public class DaoException extends SQLException {
	String message = "Someting with Dao went wrong :(((";

	public DaoException(String message) {
		super();
		this.message = message;
	}
	

   
}
