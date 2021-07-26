package com.techzgamecoding.chatbot;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hey There I am Chatbot");

        String timestamp = new SimpleDateFormat("dd:mm:yyyy hh:mm:ss").format(Calendar.getInstance().getTime());
        boolean running = true;
        String input;
        String tgc = "TechzGameCoding";

        while (running == true){
            System.out.println(" ");
            input = sc.nextLine();

            try {
                if (input.equals("Hi")) {
                    System.out.println("Hi there!");
                } else if (input.equals("hi")) {
                    System.out.println("Hi there!");
                } else if (input.equals("Bye")) {
                    System.out.println("Bye sir Have a Good day");
                    running = false;
                } else if (input.equals("bye")) {
                    System.out.println("Bye sir Have a Good day");
                    running = false;
                } else if (input.equals("time")) {
                    System.out.println("dd:mm:yyyy hh:mm:ss");
                    System.out.println(timestamp);
                } else if (input.equals("Open java ide")) {
                    System.out.println("Ya sure sir");
                    File file = new File("C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2020.2\\bin\\idea64.exe");
                    Desktop.getDesktop().open(file);
                } else if (input.equals("Open python ide")) {
                    System.out.println("Ya sure sir");
                    System.out.println("Opening PyCharm");
                    File file = new File("C:\\Program Files\\JetBrains\\PyCharm Community Edition 2020.3.3\\bin\\pycharm64.exe");
                    Desktop.getDesktop().open(file);
                } else if (input.equals("open code")) {
                    System.out.println("Ya sure sir");
                    System.out.println("Opening VS");
                    File file = new File("C:\\Users\\sanR\\AppData\\Local\\Programs\\Microsoft VS Code\\Code.exe");
                    Desktop.getDesktop().open(file);
                } else if (input.equals("open google")) {
                    URI uri = new URI("http://www.google.com");

                    java.awt.Desktop.getDesktop().browse(uri);
                    System.out.println("Web page opened in browser");
                }else if (input.equals("Open google")) {
                    URI uri = new URI("http://www.google.com");

                    java.awt.Desktop.getDesktop().browse(uri);
                    System.out.println("Web page opened in browser");
                } else if (input.equals("open online chatbot")) {
                    URI ur = new URI("https://chatbot.techzgamecoding.ml/");

                    java.awt.Desktop.getDesktop().browse(ur);
                    System.out.println("Opened Online chatbot <b>enjoy!</b>");
                }else if (input.equals("Open TechzGameCoding")){
                    URI u = new URI("https://techzgamecoding.ml/");

                    java.awt.Desktop.getDesktop().browse(u);
                    System.out.println("Opening "+ tgc);
                }
                else {
                    System.out.println("Sorry I don't Understand");
                }


            }
            catch(Exception e){
                e.printStackTrace();
            }
        }

        System.out.println("sir please give me next command");

    }
}

