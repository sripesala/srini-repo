package com.designpatterns.commandpattern;

public class User {

	public static void main(String[] args) {
		Light light = new Light();
		LightsOffCommand lightoff = new LightsOffCommand(light);
		LightsOnCommand lighton = new LightsOnCommand(light);
		
		RemoteController remote = new RemoteController();
		remote.setCommand(lightoff);
		remote.pressButton();
		remote.setCommand(lighton);
		remote.pressButton();

	}

}
