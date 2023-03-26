package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void revenueForTwelveMonths() {
        StatsService service = new StatsService();
        int[] money = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedYear = 180;
        int actualYear = service.revenue(money);
        Assertions.assertEquals(expectedYear, actualYear);
    }

    @Test
    public void averageAnnualRevenue() {
        StatsService service = new StatsService();
        int[] money = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedYear = 15;
        int actualYear = service.averageMonthlySales(money);
        Assertions.assertEquals(expectedYear, actualYear);
    }

    @Test
    public void maximumAmountPerYear() {
        StatsService service = new StatsService();
        int[] money = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedYear = 7;
        int actualYear = service.salesForTheMaximumAmount(money);
        Assertions.assertEquals(expectedYear, actualYear);
    }

    @Test
    public void minimumAmountPerYear() {
        StatsService service = new StatsService();
        int[] money = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedYear = 8;
        int actualYear = service.salesForTheMinimumAmount(money);
        Assertions.assertEquals(expectedYear, actualYear);
    }

    @Test
    public void salesWereBelowAverage() {
        StatsService service = new StatsService();
        int[] money = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedYear = 5;
        int actualYear = service.salesBelowAverage(money);
        Assertions.assertEquals(expectedYear, actualYear);
    }

    @Test
    public void salesWereAboveAverage() {
        StatsService service = new StatsService();
        int[] money = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedYear = 5;
        int actualYear = service.salesAreAboveAverage(money);
        Assertions.assertEquals(expectedYear, actualYear);
    }

}
