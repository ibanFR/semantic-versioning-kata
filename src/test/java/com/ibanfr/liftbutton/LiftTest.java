package com.ibanfr.liftbutton;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LiftTest {

    //TEST LIST
    //[] - doors should be CLOSED when Lift is created
    //[] - should switch lights ON when button is pressed and doors are CLOSED
    //[] - should OPEN the lift doors when lift arrives
    //[] - should switch OFF the lights when lift arrives
    //[] - lights should be OFF when button is pressed and doors are OPEN

    /**
     * doors should be CLOSED when Lift is created
     */
    @Test
    void doors_should_be_CLOSED_when_Lift_is_created() {

        //given

        //when

        //then
        assertThat(true)
                .as("doors should be CLOSED")
                .isEqualTo(false);

    }
}
