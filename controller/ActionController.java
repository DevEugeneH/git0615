package org.project.controller;

import java.util.Scanner;

import org.project.command.*;

public class ActionController {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
				
		while (true) {
			
			System.out.println("Please insert (insert,select,delete,update)");
		
			String query = scn.next();
		
			if (query.equals("insert")) {
				ExecuteCommand insert = new ActionInsert();
				insert.executeQuery();
			}else if (query.equals("select")) {
				ExecuteCommand select = new ActionSelect();	
				select.executeQuery();
			}else if (query.equals("update")) {
				ExecuteCommand update = new ActionUpdate();
				update.executeQuery();
			}else if (query.equals("delete")) {
				ExecuteCommand delete = new ActionDelete();
				delete.executeQuery();
			}else if (query.equals("exit")) {
				System.out.println("Program Exit");
				break;
			} else {
				System.out.println("uncorrect message");
			}
			
		}
		scn.close();
	}
}
