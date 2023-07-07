package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;


public class ValidationTest {

    public static final String NAME_BY_OVERSIZE = "abcdef";

    @Test
    public void 자동차_이름은_5자_이하여야한다() {
        assertThatThrownBy(
                () -> new Car(NAME_BY_OVERSIZE)
        ).isInstanceOf(IllegalArgumentException.class);
    }
}
