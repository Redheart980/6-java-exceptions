package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        codeWithNPE();
         */
    }

    static void codeWithNPE() {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        Object nullRef = null;
        nullRef.toString(); //Получаем NPE из-за обращения к нулевой ссылке
    }
}
