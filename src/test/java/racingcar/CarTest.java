package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {
    @Test
    public void forward() {
        Car car = new Car("simba");
        car.takeAction(Movement.FORWARD);
        car.takeAction(Movement.FORWARD);
        car.takeAction(Movement.FORWARD);
        assertThat(car.getPosition()).isEqualTo(3);
    }

    @Test
    public void stop() {
        Car car = new Car("simba");
        car.takeAction(Movement.STOP);
        assertThat(car.getPosition()).isEqualTo(0);
    }
}
