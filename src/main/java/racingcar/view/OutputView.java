package racingcar.view;


import java.util.List;

public class OutputView {

    public static final String DASH = "-";
    public static final String DELIMITER = " : ";
    public static final String FINAL_WINNER_MSG = "최종 우승자";

    public static void printRaceResult(String carName, int carPosition) {
        StringBuilder positionFormat = new StringBuilder();
        for (int i = 0; i < carPosition; i++) {
            positionFormat.append(DASH);
        }
        System.out.println(carName + DELIMITER + positionFormat);
    }

    public static void printWinners(List<String> winnerNames) {
        String result = winnerNames.stream()
                .reduce("", (s1, s2) -> s1 + ", " + s2)
                .substring(2);
        System.out.println(FINAL_WINNER_MSG + DELIMITER + result);
    }
}
