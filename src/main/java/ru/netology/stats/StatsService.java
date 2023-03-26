package ru.netology.stats;

public class StatsService {
    public int revenue(int[] money) {
        int revenueForTheYear = 0;
        for (int i = 0; i < money.length; i++) {
            revenueForTheYear += money[i];
        }
        return revenueForTheYear;
    }

    public int averageMonthlySales(int[] money) {
        int revenueForTheYear = 0;
        for (int i = 0; i < money.length; i++) {
            revenueForTheYear += money[i];
        }
        return revenueForTheYear / money.length;
    }

    public int salesForTheMaximumAmount(int[] money) {
        int maxDay = 0;
        for (int i = 0; i < money.length; i++) {
            if (money[i] >= money[maxDay]) {
                maxDay = i;
            }
        }
        return maxDay;
    }

    public int salesForTheMinimumAmount(int[] money) {
        int minDay = 0;
        for (int i = 0; i < money.length; i++) {
            if (money[i] <= money[minDay]) {
                minDay = i;
            }
        }
        return minDay;
    }

    public int salesBelowAverage(int[] money) {
        int numberOfMonths = 0;
        int minDay = averageMonthlySales(money);
        for (int i = 0; i < money.length; i++) {
            if (money[i] < minDay) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }

    public int salesAreAboveAverage(int[] money) {
        int numberOfMonths = 0;
        int minDay = averageMonthlySales(money);
        for (int i = 0; i < money.length; i++) {
            if (money[i] > minDay) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }
}
