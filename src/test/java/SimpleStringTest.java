import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleStringTest {

    SimpleString simpleString;

    @BeforeEach
    void setUp() {
        simpleString = new SimpleString();
    }

    @AfterEach
    void tearDown() {
        simpleString = null;
    }

    @DisplayName("Typical case")
    @Test
    void TestReturnMultipleTimesWithTypicalCase() {
        String result = simpleString.returnMultipleTimes("abc", 3);
        assertEquals("abcabcabc", result);
    }

    @DisplayName("Input is null")
    @Test
    void TestReturnMultipleTimesWithNullInput() {
        String result = simpleString.returnMultipleTimes(null, 3);
        assertEquals("文字列を入力して下さい", result);
    }

    @DisplayName("Input is empty")
    @Test
    void TestReturnMultipleTimesWithEmptyInput() {
        String result = simpleString.returnMultipleTimes("", 3);
        assertEquals("", result);
    }

    @DisplayName("Multiple times is over 4")
    @Test
    void TestReturnMultipleTimesWithOver4Times() {
        String result = simpleString.returnMultipleTimes("abc", 5);
        assertEquals("最大4回までです", result);
    }
}