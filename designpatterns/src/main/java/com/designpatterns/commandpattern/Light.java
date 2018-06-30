package com.designpatterns.commandpattern;

public class Light {
	boolean lightson;
	boolean lightsoff;
	public boolean isLightson() {
		return lightson;
	}
	public void setLightson(boolean lightson) {
		this.lightson = lightson;
	}
	public boolean isLightsoff() {
		return lightsoff;
	}
	public void setLightsoff(boolean lightsoff) {
		this.lightsoff = lightsoff;
	}
}
