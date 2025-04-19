package com.ibanfr.liftbutton;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LiftTest {

    @Test
    void doors_should_be_OPEN_when_Lift_is_created() {

        //when
        Lift lift = new Lift();

        //then
        assertThat(lift.doors())
                .as("doors should be CLOSED")
                .isEqualTo(DoorStatus.OPEN);

    }

    @Test
    void lights_should_be_OFF_when_Lift_is_created() {

        //when
        Lift lift = new Lift();

        //then
        assertThat(lift.lights())
                .as("lights should be OFF")
                .isEqualTo(LightStatus.OFF);

    }

    @Test
    void should_close_the_Lift_doors() {
        //given
        Lift lift = new Lift();

        //when
        lift.closeDoors();

        //then
        assertThat(lift.doors())
                .as("doors should be CLOSED")
                .isEqualTo(DoorStatus.CLOSED);

    }

    @Test
    void should_switch_lights_ON_when_button_is_pressed_and_doors_are_CLOSED() {
        //given
        Lift lift = new Lift();

        //given
        lift.closeDoors();

        //when
        lift.pressButton();

        //then
        assertThat(lift.lights())
                .as("lights should be ON")
                .isEqualTo(LightStatus.ON);

    }

    @Test
    void should_OPEN_the_lift_doors_when_lift_arrives() {
        //given
        Lift lift = new Lift();

        //when
        lift.arrive();

        //then
        assertThat(lift.doors())
                .as("doors should be OPEN")
                .isEqualTo(DoorStatus.OPEN);

    }

    @Test
    void should_switch_OFF_the_lights_when_lift_arrives() {
        //given
        Lift lift = new Lift();

        //given
        lift.pressButton();

        //when
        lift.arrive();

        //then
        assertThat(lift.lights())
                .as("lights should be OFF")
                .isEqualTo(LightStatus.OFF);

    }

    @Test
    void lights_should_be_OFF_when_button_is_pressed_AND_doors_are_OPEN() {
        //given
        Lift lift = new Lift();

        //given
        lift.pressButton();

        //given
        lift.arrive();

        //when
        lift.pressButton();

        //then
        assertThat(lift.lights())
                .as("lights should be OFF")
                .isEqualTo(LightStatus.OFF);

    }
}
