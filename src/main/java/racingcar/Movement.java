package racingcar;

public enum Movement {
    STOP, FORWARD;

    public static final int CUT_OFF_POINT = 4;

    public static Movement isStopOrForward(int number) {
        if (number >= CUT_OFF_POINT) {
            return FORWARD;
        }
        return STOP;
    }
}
