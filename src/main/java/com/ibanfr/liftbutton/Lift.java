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
        if (doorStatus == DoorStatus.OPEN) {
            return;
        }
        lightStatus = LightStatus.ON;
    }

    public LightStatus lights() {
        return lightStatus;
    }

    public void arrive() {
        doorStatus = DoorStatus.OPEN;
        lightStatus = LightStatus.OFF;
    }
}
