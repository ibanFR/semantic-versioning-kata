package com.ibanfr.liftbutton;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LiftTest {

    //TEST LIST
    //[X] - doors should be CLOSED when Lift is created
    //[X] - lights should be OFF when Lift is created
    //[] - should switch lights ON when button is pressed
    //[] - should OPEN the lift doors when lift arrives
    //[] - should switch OFF the lights when lift arrives
    //[] - lights should be OFF when button is pressed AND doors are OPEN

    /**
     * doors should be CLOSED when Lift is created
     */
    @Test
    void doors_should_be_CLOSED_when_Lift_is_created() {

        //when
        Lift lift = new Lift();

        //then
        assertThat(lift.doors())
                .as("doors should be CLOSED")
                .isEqualTo(DoorStatus.CLOSED);

    }

    /**
     * lights should be OFF when Lift is created
     */
    @Test
    void lights_should_be_OFF_when_Lift_is_created() {

        //when
        Lift lift = new Lift();

        //then
        assertThat(lift.lights())
                .as("lights should be OFF")
                .isEqualTo(LightStatus.OFF);

    }

    /**
     * should switch lights ON when button is pressed
     */
    @Test
    void should_switch_lights_ON_when_button_is_pressed() {
        //given
        Lift lift = new Lift();

        //when
        lift.pressButton();

        //then
        assertThat(lift.lights())
                .as("lights should be ON")
                .isEqualTo(LightStatus.ON);

    }

}
