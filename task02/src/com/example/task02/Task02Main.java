package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        System.out.println(getSeason(-5));
    }

    static String getSeason(int monthNumber) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        try{
            if (monthNumber < 1 || monthNumber > 12)
                throw new IllegalArgumentException(String.valueOf(monthNumber));
        }
        catch (IllegalArgumentException argumentException){
            //return "monthNumber " + monthNumber + " is invalid, month number should be between 1..12";
            return "monthNumber " + argumentException.getMessage() + " is invalid, month number should be between 1..12";
        }
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                return "зима";
            case 3:
            case 4:
            case 5:
                return "весна";
            case 6:
            case 7:
            case 8:
                return "лето";
            case 9:
            case 10:
            case 11:
                return "осень";
            default:
                return "";
        }
    }
}