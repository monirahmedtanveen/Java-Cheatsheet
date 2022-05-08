package com.monirtanveen;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<>();
        addInOrder(placeToVisit, "Dhaka");
        addInOrder(placeToVisit, "Gazipur");
        addInOrder(placeToVisit, "Rangamati");
        addInOrder(placeToVisit, "Bandarban");
        addInOrder(placeToVisit, "Khagrachori");
        addInOrder(placeToVisit, "Chittogong");
        addInOrder(placeToVisit, "Sylhet");

//        placeToVisit.add("Dhaka");
//        placeToVisit.add("Gazipur");
//        placeToVisit.add("Rangamati");
//        placeToVisit.add("Bandarban");
//        placeToVisit.add("Khagrachori");
//        placeToVisit.add("Chittogong");
//        placeToVisit.add("Sylhet");

//        printList(placeToVisit);

//        placeToVisit.add(1, "Saint Martin");
        addInOrder(placeToVisit, "Ahmedabad");
        addInOrder(placeToVisit, "Dhaka");

//        placeToVisit.remove(4);
        printList(placeToVisit);

        visit(placeToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now Visiting: " + i.next());
        }
        System.out.println("====================================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                System.out.println(newCity + " is already included as destination");
                return false;
            } else if (comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                // move on next city
            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.getFirst() == "") {
            System.out.println("No cities in the iteration list");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            boolean goingForward = true;
            switch (action) {
                case 0:
                    System.out.println("Holiday is over");
                    quit = true;
                    break;
                case 1:
                    if ( ! goingForward ) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                            goingForward = true;
                        }
                    }

                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                            goingForward = false;
                        }
                    }

                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }
}
