package com.company;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import javax.script.ScriptException;

import static java.lang.System.*;

class Main {
    public static void main(String[] args) {


        javax.script.ScriptEngineManager mgr = new javax.script.ScriptEngineManager();
        javax.script.ScriptEngine engine = mgr.getEngineByName("JavaScript");


        Scanner scanner = new Scanner(System.in);
        String  teqsti = scanner.nextLine();
        out.println(teqsti);


        try {
            out.println(engine.eval(teqsti));
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        try (PrintWriter out = new PrintWriter("file.txt")) {
            out.println(teqsti);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}