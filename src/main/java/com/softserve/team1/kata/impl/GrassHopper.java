package com.softserve.team1.kata.impl;

import java.util.Scanner;

public class GrassHopper extends BaseKata {

    public static String weatherInfo(int temp) {
        double c = (5.0 * temp - 160.0) / 9.0;
        if(c <= 0) return (c + " is freezing temperature");
        else return (c + " is above freezing temperature");
    }

    @Override
    public void test() {
        System.out.println("Enter temperature: ");
        Scanner in = new Scanner(System.in);

        int temp = in.nextInt();
        System.out.println(weatherInfo(temp));
    }
}
