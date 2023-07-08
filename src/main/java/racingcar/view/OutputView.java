package racingcar.view;

public class OutputView {

    public static final String DASH = "-";

    public static void printRaceResult(String carName, int carPosition) {
        StringBuilder positionFormat = new StringBuilder();
        for (int i = 0; i < carPosition; i++) {
            positionFormat.append(DASH);
        }
        System.out.println(carName + " : " + positionFormat);
    }
}
