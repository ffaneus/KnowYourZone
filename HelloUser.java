package exercises;

import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {

        Scanner your_name = new Scanner(System.in);

        String name = " ";

        System.out.println("What's your name?");

        name = your_name.nextLine();

        System.out.println("Hello " + name);