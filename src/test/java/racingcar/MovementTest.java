package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.domain.Movement;

import static org.assertj.core.api.Assertions.*;

public class MovementTest {

    public static final int STOP = 3;
    public static final int MOVING_FORWARD = 4;

    @Test
    public void stop() {
        Movement movement = Movement.isStopOrForward(STOP);
        assertThat(movement).isEqualTo(Movement.STOP);
    }

    @Test
    public void forward() {
        Movement movement = Movement.isStopOrForward(MOVING_FORWARD);
        assertThat(movement).isEqualTo(Movement.FORWARD);
    }

}
