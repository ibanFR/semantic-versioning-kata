package com.ibanfr.liftbutton;

public class Lift {

    private DoorStatus doorStatus;

    public Lift() {
        doorStatus = DoorStatus.CLOSED;
    }

    public DoorStatus doors() {
        return doorStatus;
    }
}
