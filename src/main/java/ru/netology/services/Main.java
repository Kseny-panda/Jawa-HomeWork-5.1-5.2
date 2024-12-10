package ru.netology.services;
import ru.netology.services.CountService;

public class Main {
    public static void main(String[] args) {

        CountService service = new CountService();
        System.out.println("В этом году я отдыхал: " +service.calculate(10_000, 3_000, 20_000) + " месяца");
        System.out.println(("В этом году я отдыхал: " +service.calculate(100_000, 60_000, 150_000) + " месяца"));
    }
}