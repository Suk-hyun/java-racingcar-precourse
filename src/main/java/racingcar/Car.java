package racingcar;

public class Car {
    public static final int MAX_NAME_LENGTH = 5;
    private final String name;
    private int position = 0;

    public Car(String name) {
        validate(name);
        this.name = name;
    }

    private void validate(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("[ERROR] 이름은 5자 이하여야 한다.");
        }
    }

    // 추가 기능 구현
    public void takeAction(Movement movement) {
        if (movement == Movement.FORWARD) {
            this.position += 1;
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return this.position;
    }
}
