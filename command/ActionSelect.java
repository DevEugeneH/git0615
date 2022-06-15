package org.project.command;

public class ActionSelect extends ExecuteCommand{
	@Override
	public void executeQuery() {
		System.out.println("회원 조회");
	}
}
