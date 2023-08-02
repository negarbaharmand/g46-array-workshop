package com.baharmand;

import java.util.Arrays;

public class NameRepository {

    private static String[] names = new String[0];

    public static int getSize() {
        return names.length;
    }

    public static void setNames(String[] newNames) {
        names = Arrays.copyOf(newNames, newNames.length);
    }

    public static void clear() {
        names = new String[0];
    }

    public static String[] findAll() {
        return Arrays.copyOf(names, names.length);
    }

    public static String find(final String fullName) {
        for (String name : names) {
            if (name.equals(fullName)) {
                return name; //return the name if found
            }
        }
        return null; //return null if the name is not found
    }
    public static boolean add(final String fullName) {
        for (String name : names) {
            if (name.equals(fullName)) {
                return false; //return false if the array already includes the name
            }
        }
        names = Arrays.copyOf(names, names.length + 1);
        names[names.length - 1] = fullName;
        return true; //return true as the name is added successfully
    }
}
