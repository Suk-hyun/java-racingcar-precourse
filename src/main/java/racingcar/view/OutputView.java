package racingcar.view;


import java.util.List;

public class OutputView {

    public static final String DASH = "-";
    public static final String DELIMITER = " : ";
    public static final String FINAL_WINNER_MSG = "최종 우승자";

    public static void printRequestForCarNameMsg() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public static void printAskTrialNumberMsg() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public static void printRaceResultMsg() {
        System.out.println();
        System.out.println("실행 결과");
    }

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
