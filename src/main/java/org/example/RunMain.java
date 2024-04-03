package org.example;


import ru.nsu.lispMachine.RunFramework;

public class RunMain {
    public static void main(String[] args) {

        RunFramework.SetDefaultHandler();
        RunFramework.SetFiles("src/main/resources/lispExample.lisp","src/test/java/JavaOutExample.java");
        RunFramework.SetCustomHandler("RAWJAVA", new CustomHandler());
        RunFramework.Translate();
    }
}