package com.swag.core.utils;

import org.apache.commons.lang3.RandomStringUtils;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;

public class Generator {

    public static int genInt(int from, int to) {
        return new Random().nextInt((to - from) + 1) + from;
    }

    public static String getRandomStringNumber() {
        return RandomStringUtils.randomNumeric(10);
    }

    public static String genString(int length) {
        return RandomStringUtils.randomAlphabetic(length);
    }

    public static String getRandomStringNumber(int length) {
        return RandomStringUtils.randomNumeric(length);
    }

    public static String genAccountNumber() {
        return genInt(1, 9) + RandomStringUtils.randomNumeric(11);
    }

    public static String genMobilePhone(int length) {
        return "555" + getRandomStringNumber(7);
    }

    public static String genEmail() {
        return "testemail+" + getRandomStringNumber(7) + "@mail.com";
    }

    public static float genFloat(double from, double to, int precision) {
        float number = genFloat(from, to);
        return (float) Math.round(number * Math.pow(10, precision)) / (float) Math.pow(10, precision);
    }

    private static float genFloat(double from, double to) {
        float tmp = .0f;
        if (to >= from)
            tmp = (float) (from + (Math.random() * (to - from)));
        return tmp;
    }

    public static int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    public static String getRandomFromList(List<String> l) {
        return l.get(createRandomIntBetween(0, l.size() - 1));
    }

    public static String getRandomFromArray(String[] a) {
        return a[(createRandomIntBetween(0, a.length - 1))];
    }

    public static String genAddress() {
        return "Test " + Generator.genString(4) + " Avenue, " + Generator.genInt(1, 1000);
    }

    public static long genLong(long from, long to) {
        long tmp = 0;
        if (to >= from)
            tmp = from + Math.round((Math.random() * (to - from)));
        return tmp;
    }

    public static String getRandomFormattedDecimalStringValue(String pattern) {
        Random ran = new Random();
        DecimalFormat df = new DecimalFormat(pattern);
        return String.valueOf(df.format(ran.nextFloat() * 100));
    }
}
