package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.Movement;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class WinnerTest {

    @Test
    void getWinners() {
        String[] carNames = new String[3];
        carNames[0] = "simba";
        carNames[1] = "dog";
        carNames[2] = "aeong";
        Cars cars = new Cars(carNames);
        List<Car> carList = cars.getCars();

        Car simba = carList.get(0);
        simba.takeAction(Movement.FORWARD);
        simba.takeAction(Movement.FORWARD);

        Car dog = carList.get(1);
        dog.takeAction(Movement.FORWARD);

        Car aeong = carList.get(2);
        aeong.takeAction(Movement.FORWARD);
        aeong.takeAction(Movement.FORWARD);

        assertThat(cars.getWinners()).containsExactly(simba, aeong);
    }
}
