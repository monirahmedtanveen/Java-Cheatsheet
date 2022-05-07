package com.monirtanveen;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

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

        printList(placeToVisit);

//        placeToVisit.add(1, "Saint Martin");
        addInOrder(placeToVisit, "Ahmedabad");
        addInOrder(placeToVisit, "Dhaka");

//        placeToVisit.remove(4);
        printList(placeToVisit);
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
}
