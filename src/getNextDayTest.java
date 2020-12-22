import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class getNextDayTest {
    @Test
    @DisplayName("Case 1-1-2018")
    void getNextDayCase1() {
        int dayTest = 1;
        int monthTest = 1;
        int yearTest =2018;
        String expected = "2-1-2018";
        String result = getNextDay.nextDayCalculator(dayTest, monthTest, yearTest);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Case 31-1-2018")
    void getNextDayCase2() {
        int dayTest = 31;
        int monthTest = 1;
        int yearTest = 2018;
        String expected = "1-2-2018";
        String result = getNextDay.nextDayCalculator(dayTest, monthTest, yearTest);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Case 31-1-2018")
    void getNextDayCase3() {
        int dayTest = 30;
        int monthTest = 4;
        int yearTest = 2018;
        String expected = "1-5-2018";
        String result = getNextDay.nextDayCalculator(dayTest, monthTest, yearTest);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Case 28-2-2018")
    void getNextDayCase4() {
        int dayTest = 28;
        int monthTest = 2;
        int yearTest = 2018;
        String expected = "1-3-2018";
        String result = getNextDay.nextDayCalculator(dayTest, monthTest, yearTest);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Case 31-12-2018")
    void getNextDayCase5() {
        int dayTest = 31;
        int monthTest = 12;
        int yearTest = 2018;
        String expected = "1-1-2019";
        String result = getNextDay.nextDayCalculator(dayTest, monthTest, yearTest);
        assertEquals(expected, result);
    }




}