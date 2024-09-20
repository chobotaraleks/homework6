package app;

public class Main {

    public static void main(String[] args) {
        int sum = 0; // змінна для накопичення суми

        // Цикл від 1 до 6, включно
        for (int i = 1; i <= 6; i++) {
            sum += i; // додати поточне число до суми
            System.out.println(i + ") Num is " + i + ", sum is " + sum);
        }

        // Виведення підсумкової суми
        System.out.println("------------------------");
        System.out.println("Sum of numbers is " + sum);
    }
}

