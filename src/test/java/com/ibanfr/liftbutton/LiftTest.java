package com.ibanfr.liftbutton;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LiftTest {

    //TEST LIST
    //[X] - doors should be CLOSED when Lift is created
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
}
