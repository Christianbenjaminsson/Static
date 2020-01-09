package com.example.udemy;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {

        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is Instance number " + StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("2nd Instance");
        System.out.println(secondInstance.getName() + " is Instance number " + StaticTest.getNumInstances());

        StaticTest thirdInstance = new StaticTest("3nd Instance");
        System.out.println(thirdInstance.getName() + " is Instance number " + StaticTest.getNumInstances());

        int answer = multiply(6);
        System.out.println("The answer is answer " + answer);
        System.out.println("Multiplayer is " + multiplier);
    }

    public static int multiply(int number) {
        return number * multiplier;
    }
}
