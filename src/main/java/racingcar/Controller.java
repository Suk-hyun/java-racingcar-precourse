package racingcar;

import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;


public class Controller {
    private Cars cars;

    public void makeCars() {
        String carNameInput = InputView.requestCarNameInput();

        String[] carNames = carNameInput.split(",");
        cars = new Cars(carNames);
    }

    public void playGame() {
        String trialNumberInput = InputView.requestTrialNumber();
        int trialNumber = Integer.parseInt(trialNumberInput);
        play(trialNumber);
    }

    public void wrappingUpGame() {
        List<Car> winners = cars.getWinners();

    }

    private void play(int trialNumber) {
        for (int i = 0; i < trialNumber; i++) {
            cars.race();
            List<Car> allCars = cars.getCars();
            printRaceResult(allCars);
        }
    }

    private void printRaceResult(List<Car> allCars) {
        for (Car car : allCars) {
            OutputView.printRaceResult(car.getName(), car.getPosition());
        }
    }
}
