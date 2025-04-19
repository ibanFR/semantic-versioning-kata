package com.ibanfr.liftbutton;

public class Lift {

    private DoorStatus doorStatus;
    private LightStatus lightStatus;

    public Lift() {
        doorStatus = DoorStatus.CLOSED;
        lightStatus = LightStatus.OFF;
    }

    public DoorStatus doors() {
        return doorStatus;
    }

    public void pressButton() {

    }

    public LightStatus lights() {
        return lightStatus;
    }
}
