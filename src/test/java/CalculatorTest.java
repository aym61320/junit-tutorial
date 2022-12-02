import org.junit.jupiter.api.*;
import static jp.sample.matcher.IsDate.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.concurrent.TimeUnit;

class CalculatorTest {

    @BeforeEach
    void setUp() throws Exception {
        System.out.println("before");
    }

    @Test
    void multiplyで3と4の乗算結果が取得できる() {
        // fail("TODO テスト実装する");
        Calculator calc = new Calculator();
        int expected = 12;
        int actual = calc.multiply(3, 4);
        assertThat(actual, is(expected));
    }

    @Test
    @Disabled("未実装など")
    void multiplyで5と7の乗算結果が取得できる() {
        Calculator calc = new Calculator();
        int expected = 35;
        int actual = calc.multiply(5, 7);
        assertThat(actual, is(expected));
    }

    @Test
    void divideで3と2の除算結果が取得できる() {
        Calculator calc = new Calculator();
        float expected = 1.5f;
        float actual = calc.divide(3, 2);
        assertThat(actual, is(expected));
    }

    @Test
    void divideで5と0のときIllegalArgumentExceptionを送出する() {
        Calculator calc = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calc.divide(5, 0));
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void timeout() {
        int actual = 100;
        assertThat(actual, is(100));
    }

    @AfterEach
    void tearDown() throws Exception {
        System.out.println("after");
    }

    @Test
    void 日付の比較() throws Exception {
        Date date = new Date();
        assertThat(date, is(dateOf(2011, 2, 10)));
    }
}
