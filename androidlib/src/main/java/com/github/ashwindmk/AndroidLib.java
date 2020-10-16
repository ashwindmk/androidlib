package com.github.ashwindmk;

import android.util.Log;

import java.math.BigDecimal;

public class AndroidLib {
    public static void log(String msg) {
        Log.w("AndroidLib", msg);
    }

    public static void log(String tag, String msg) {
        Log.w(tag, msg);
    }

    public static void log(String tag1, String tag2, String msg) {
        Log.w(tag1, "tag2: " + msg);
    }

    public static String echo(String msg) {
        return msg;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static BigDecimal add(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }
}
