package org.example;

public class ExceptionHW2 {

    public static void g() throws Exception {
        throw new Exception("Произошла ошибка g");
    }

    public static void f() throws Exception {
        try {
            g();
        } catch (Exception e) {
            throw new Exception("Произошла ошибка f");
        }
    }


    public static void main(String[] args) {

        try {
            f();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
