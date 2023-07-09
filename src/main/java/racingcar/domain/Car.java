package racingcar.domain;

public class Car {
    public static final int MAX_NAME_LENGTH = 5;
    public static final int INITIAL_POSITION = 0;
    public static final int FORWARD_ADDED_VALUE = 1;
    public static final String NAME_BY_OVERSIZE_ERROR_MSG = "[ERROR] 이름은 5자 이하여야 한다.";
    private final String name;
    private int position = INITIAL_POSITION;

    public Car(String name) {
        validate(name);
        this.name = name;
    }

    private void validate(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(NAME_BY_OVERSIZE_ERROR_MSG);
        }
    }

    // 추가 기능 구현
    public void takeAction(Movement movement) {
        if (movement == Movement.FORWARD) {
            this.position += FORWARD_ADDED_VALUE;
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return this.position;
    }
}
