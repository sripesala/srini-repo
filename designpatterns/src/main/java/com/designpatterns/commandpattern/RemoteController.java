package com.designpatterns.commandpattern;

public class RemoteController {

	private Command command;
	
	public void setCommand(Command command){
		this.command = command;
	}
	public void pressButton(){
		this.command.execute();
	}
}
