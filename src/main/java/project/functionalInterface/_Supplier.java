package project.functionalInterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {

        System.out.println(getDBConnectionUrl());
        //Supplier
        System.out.println(getDBConnectionUrl.get());

    }

    static Supplier<String> getDBConnectionUrl=()->"jdbc://localhost:5432/users";

    static String getDBConnectionUrl(){
        return "jdbc://localhost:5432/users";
    }
}
