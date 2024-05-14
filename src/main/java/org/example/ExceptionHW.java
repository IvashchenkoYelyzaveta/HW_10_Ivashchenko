package org.example;

public class ExceptionHW {

    public static void main(String[] args) {

        try {
            throw new Exception("Произошла ошибка!");
        } catch (Exception error) {
            System.out.println("Исключение поймано: " + error.getMessage());
        } finally {
            System.out.println("Блок finally выполнен.");
        }

    }

}
