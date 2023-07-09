package racingcar;

import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.List;


public class Controller {
    private Cars cars;

    public void run() {
        try {
            makeCars();
            playGame();
            wrappingUpGame();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void makeCars() {
        OutputView.printRequestForCarNameMsg();
        String carNameInput = InputView.requestCarNameInput();

        String[] carNames = carNameInput.split(",");
        cars = new Cars(carNames);
    }

    public void playGame() {
        OutputView.printAskTrialNumberMsg();
        String trialNumberInput = InputView.requestTrialNumber();
        int trialNumber = Integer.parseInt(trialNumberInput);
        play(trialNumber);
    }

    public void wrappingUpGame() {
        List<Car> winners = cars.getWinners();
        List<String> winnerNames = getWinnerNames(winners);
        OutputView.printWinners(winnerNames);
    }

    private List<String> getWinnerNames(List<Car> winners) {
        List<String> winnerNames = new ArrayList<>();
        for (Car winner : winners) {
            winnerNames.add(winner.getName());
        }
        return winnerNames;
    }

    private void play(int trialNumber) {
        OutputView.printRaceResultMsg();
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
        System.out.println();
    }
}
