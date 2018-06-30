package com.designpatterns.commandpattern;

public class LightsOffCommand implements Command{

	Light light;
	LightsOffCommand(Light light){
		this.light = light;
	}
	
	public void execute() {
		this.light.setLightsoff(true);
		System.out.println("Lights off");
	}

	
}
