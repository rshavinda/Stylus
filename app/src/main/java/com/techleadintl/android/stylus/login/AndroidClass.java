package com.techleadintl.android.stylus.login;

import android.graphics.Bitmap;

public class AndroidClass {
    //Pascal Case - UserData
    //UserIdData
    //UserIDData X

    private boolean aBoolean; // 1 bit | 1 byte - True/False

    private byte aByte; // 1 byte | limit 256 | -128 to 127

    private short aShort; // 2 bytes | Short aShortClass;
    private char aChar; // 2 bytes | Character

    private int anInt; // 4 byte | Integer*
    private float aFloat; // 4 bytes | 7 digits after decimal point

    private long aLong = 1639989130; // 8 byte | Long* // Unix Timestamp

    private double aDouble; // 8 bytes | 15 digits after decimal point | Double*

    private String data = "2021-12-17 10.35.52 am";

    private double currentSalary;

    //Access modifiers
    // private, package (package private/ default modifier) , protected, public

    private int data1 = 10;
    int data2 = 20;
    protected int data3 = 30;
    public int data4 = 40;

   // ALT + Insert

    //Recommended
    public AndroidClass() {
    }


    public AndroidClass(boolean aBoolean, byte aByte, short aShort, char aChar, int anInt, float aFloat, long aLong, double aDouble, String data) {
        this.aBoolean = aBoolean;
        this.aByte = aByte;
        this.aShort = aShort;
        this.aChar = aChar;
        this.anInt = anInt;
        this.aFloat = aFloat;
        this.aLong = aLong;
        this.aDouble = aDouble;
        this.data = data;
    }

    public boolean isaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public byte getaByte() {
        return aByte;
    }

    public void setaByte(byte aByte) {
        this.aByte = aByte;
    }

    public short getaShort() {
        return aShort;
    }

    public void setaShort(short aShort) {
        this.aShort = aShort;
    }

    public char getaChar() {
        return aChar;
    }

    public void setaChar(char aChar) {
        this.aChar = aChar;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public float getaFloat() {
        return aFloat;
    }

    public void setaFloat(float aFloat) {
        this.aFloat = aFloat;
    }

    public long getaLong() {
        return aLong;
    }

    public void setaLong(long aLong) {
        this.aLong = aLong;
    }

    public double getaDouble() {
        return aDouble;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(double currentSalary) {
        this.currentSalary = currentSalary;
    }
}
