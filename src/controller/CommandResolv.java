package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import command.ICommand;

public class CommandResolv {
	Map<String, ICommand> commands = new HashMap<>();

    public CommandResolv() {
}

	

	public static ICommand getCommand(HttpServletRequest req) {
		// TODO Auto-generated method stub
		return null;
	}
}
