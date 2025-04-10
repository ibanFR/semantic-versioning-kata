package com.ibanfr.liftbutton;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LiftButtonTest {

    //TEST LIST
    // [] - doors should be CLOSED when lift is created
    // [] - lights should be OFF when lift is created
    // [] - should OPEN the lift doors
    // [] - press button when lift doors CLOSED: light should turn ON
    // [] - press button when light already ON and doors CLOSED : light should stay ON
    // [] - when doors OPEN light should turn OFF
    // [] - press button when lift doors open: light should be OFF

    @Test
    void doors_should_be_closed_when_lift_is_created() {

        //when
        Lift lift = new Lift();

        //then
        assertThat(lift.doors())
                .isEqualTo(DoorStatus.CLOSED);
    }
}
