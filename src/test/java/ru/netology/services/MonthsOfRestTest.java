package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class MonthsOfRestTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/rest.csv")
    public void testMonthsOfRest(int income, int expenses, int threshold, int expected) {
        MonthsOfRest service = new MonthsOfRest();

        int actual = service.calcMonths(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
