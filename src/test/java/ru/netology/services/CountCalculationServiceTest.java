package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CountCalculationServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/monthCount.csv")
    public void MonthCount(int income, int expenses, int threshold, int expected) {
        CountService service = new CountService();

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

//    @Test
//    public void MonthCount_10_000() {
//
//        CountService service = new CountService();
//
//        int income = 10_000;
//        int expenses = 3_000;
//        int threshold = 20_000;
//
//        int expected = 3;
//
//        int actual = service.calculate(income, expenses, threshold);
//        Assertions.assertEquals(expected, actual);
//    }
//    @Test
//    public void MonthCount_100_000 () {
//
//        CountService service = new CountService();
//
//        int income = 100_000;
//        int expenses = 60_000;
//        int threshold = 150_000;
//
//       int expected = 2;
//
//        int actual = service.calculate(income, expenses, threshold);
//        Assertions.assertEquals(expected, actual);
//    }

    }
}