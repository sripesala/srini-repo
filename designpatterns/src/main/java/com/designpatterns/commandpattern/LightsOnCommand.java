package com.designpatterns.commandpattern;

public class LightsOnCommand implements Command{

	Light light;
	LightsOnCommand(Light light){
		this.light = light;
	}
	
	public void execute() {
		this.light.setLightson(true);
		System.out.println("Lights on");
	}

	
}
