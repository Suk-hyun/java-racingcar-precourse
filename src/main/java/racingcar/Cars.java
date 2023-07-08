package racingcar;


import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(String[] carNames) {
        List<Car> tmpList = new ArrayList<>();
        for (String carName : carNames) {
            tmpList.add(new Car(carName));
        }
        cars = new ArrayList<>(tmpList);
    }
}
