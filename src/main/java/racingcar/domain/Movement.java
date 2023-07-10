package racingcar.domain;

public enum Movement {
    STOP, FORWARD;

    public static final int CUT_OFF_POINT = 4;

    public static Movement isStopOrForward(int number) {
        if (number >= CUT_OFF_POINT) {
            return FORWARD;
        }
        return STOP;
    }

    public static Boolean isForward(Movement movement) {
        return movement == FORWARD;
    }
}
