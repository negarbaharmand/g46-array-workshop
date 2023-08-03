package com.baharmand;

import java.util.Arrays;


public class NameRepository {

    //Part 1
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
    //End of Part 1

    //Part 2
    public static String find(final String fullName) {
        for (String name : names) {
            if (name.equalsIgnoreCase(fullName)) {
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
    //End of Part 2

    //Part 3

    /**
     * Find all names that match the given firstNAme
     * @param firstName The first name we are searching fot
     * @return An array containing all matching names
     */
     public static String[] findByFirstName(final String firstName) {
      String[] matches = new String[0];
      for (String fullName : names) {
          //fullName.split
          if (fullName.startsWith(firstName + " ")) {
              matches = Arrays.copyOf(matches, matches.length + 1);
              matches[matches.length - 1] = fullName;
          }
      }
      return matches;
    }

    public static String[] findByLastName(final String lastName) {
        String[] matches = new String[0];
        for (String fullName : names) {
            if (fullName.endsWith(" " + lastName)) {
                matches = Arrays.copyOf(matches, matches.length + 1);
                matches[matches.length - 1] = fullName;
            }
        }
        return matches;
    }

}
