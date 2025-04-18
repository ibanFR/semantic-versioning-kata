package com.ibanfr.liftbutton;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LiftButtonTest {

    //TEST LIST
    //[] - doors should be OPEN when Lift is created
    //[] - should CLOSE the lift doors
    //[] - should switch lights ON when button is pressed
    //[] - should OPEN the lift doors when lift arrives
    //[] - should switch OFF the lights when doors OPEN
    //[] - lights should be ON when button is pressed AND doors are CLOSED
    //[] - lights should be OFF when button is pressed AND doors are OPEN

    /**
     * doors should be OPEN when Lift is created
     */
    @Test
    void doors_should_be_OPEN_when_Lift_is_created() {

        //given

        //when

        //then
        assertThat(true)
                .as("doors should be OPEN")
                .isEqualTo(false);

    }
}
