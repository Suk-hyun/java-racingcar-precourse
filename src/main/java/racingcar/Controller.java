package racingcar;

import racingcar.view.InputView;


public class Controller {
    Cars cars;

    public void makeCars() {
        String carNameInput = InputView.requestCarNameInput();

        String[] carNames = carNameInput.split(",");
        cars = new Cars(carNames);
    }



}
