package HW1;

import java.util.Scanner;

public class NameAndHobby {
    public static void main(String[] args) {
        System.out.println("Please enter your name");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("What is Your favorite hobby?");
        String hobby = scanner.nextLine();

        System.out.println(name + " have hobby - " + hobby);










    }
}
