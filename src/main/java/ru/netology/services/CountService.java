package ru.netology.services;

public class CountService {
    public int calculate(int income, int expenses, int threshold) {

         // income - доход от работы
         // expenses - месячные траты
         // threshold - минимальная сумма на счету для отдыха

        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 1; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3; // если отдыхаем
            } else {
                money = money + income - expenses; // если не отдыхаем
            }
        }
        return count;
    }
}
