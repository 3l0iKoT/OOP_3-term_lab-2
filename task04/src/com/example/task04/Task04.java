package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        float result = 0;

        switch (operation) {
            case ("+"): return result = a + b;
            case ("-"): return result = a - b;
            case ("/"): return result = (float) a / b;
            case ("*"): return result = a * b;
            default: return result;
        }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        float result = calculate(-25, 5, "/");
        System.out.println(result);
        */
    }

}
