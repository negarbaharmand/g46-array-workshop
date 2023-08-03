package com.baharmand;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Example usage for Part 1:
        String[] newNames = {"Negar Baharmand", "Jane Smith", "Joe Tori"};
        NameRepository.setNames(newNames);
        System.out.println("Size of names array: " + NameRepository.getSize());

        String[] allNames = NameRepository.findAll();
        System.out.println("All Names: " + Arrays.toString(allNames));

        NameRepository.clear();
        System.out.println("Size after clearing: " + NameRepository.getSize());

        // Example usage for Part 2:
        NameRepository.add("Erik Svensson");
        NameRepository.add("John Doe");
        NameRepository.add("Jane Smith");

        System.out.println("Find name 'Erik Svensson': " + NameRepository.find("Erik Svensson")); // Should print 'Erik Svensson'
        System.out.println("Find name 'John Doe': " + NameRepository.find("John Doe")); // Should print 'John Doe'
        System.out.println("Find name 'Jane Smith': " + NameRepository.find("Jane Smith")); // Should print 'Jane Smith'
        System.out.println("Find name 'Alice Johnson': " + NameRepository.find("Alice Johnson")); // Should print null

        boolean added = NameRepository.add("Alice Johnson");
        System.out.println("Adding 'Alice Johnson': " + added); // Should print true
        added = NameRepository.add("Erik Svensson");
        System.out.println("Adding 'Erik Svensson' again: " + added); // Should print false

        // Test case to check if the add method works properly
        added = NameRepository.add("John Doe");
        System.out.println("Adding 'John Doe' again: " + added); // Should print false
    }
}
