package racingcar;


import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(String[] carNames) {
        List<Car> carWithNames = mapCarWithName(carNames);
        cars = new ArrayList<>(carWithNames);
    }

    private List<Car> mapCarWithName(String[] carNames) {
        List<Car> carWithNames = new ArrayList<>();
        for (String carName : carNames) {
            carWithNames.add(new Car(carName));
        }
        return carWithNames;
    }

    public void race() {
        for (Car car : cars) {
            int randomNumber = Randoms.pickNumberInRange(0, 9);
            Movement movement = Movement.isStopOrForward(randomNumber);
            car.takeAction(movement);
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getWinners() {
        List<Car> winners = new ArrayList<>();
        for (Car car : cars) {
            if (isWinner(car)) {
                winners.add(car);
            }
        }
        return winners;
    }

    private boolean isWinner(Car car) {
        return car.getPosition() == getWinnerPosition();
    }

    private Integer getWinnerPosition() {
        return cars.stream()
                .map(Car::getPosition)
                .max(Comparator.naturalOrder())
                .get();
    }
}
