package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class MovementTest {

    @Test
    public void stop() {
        Movement movement = Movement.isStopOrForward(3);
        assertThat(movement).isEqualTo(Movement.STOP);
    }

    @Test
    public void forward() {
        Movement movement = Movement.isStopOrForward(4);
        assertThat(movement).isEqualTo(Movement.FORWARD);
    }

}
