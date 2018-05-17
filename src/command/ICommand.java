package command;

import controller.ExecuteResult;
import controller.SessionRequestContent;
import javax.servlet.http.HttpServletRequest;

	public interface ICommand {

	    ExecuteResult execute(SessionRequestContent content);

	}

