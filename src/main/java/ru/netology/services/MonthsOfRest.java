package ru.netology.services;

public class MonthsOfRest {
    public int calcMonths(int income, int expenses, int threshold) {
        int money = 0;
        int count = 0;

        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {
                count++;
                money = (money - expenses) / 3;
                System.out.println("Месяц " + month + " Буду отдыхать.");
            }
            else {
                money = money + income - expenses;
                System.out.println("Месяц " + month);
            }
        }
        return count;
    }
}
