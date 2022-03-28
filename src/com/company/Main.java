package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        Diet child1 = new Diet();

       int selection = 0;

while(selection != 4) {

    System.out.println("=========================\n        Main Menu        \n=========================");
    System.out.println("1. Add Record \n2. View Record \n3. View All Record \n4. Exit");
    Scanner sel = new Scanner(System.in);
    selection = sel.nextInt();
    System.out.println("Selection:" + selection);

    if(selection == 1) {
        System.out.println("=========================\n       Add Record        \n=========================");
        System.out.println("Enter date");
        Scanner date = new Scanner(System.in);
        String dt = date.nextLine();

        System.out.println("Enter weight");
        Scanner weight = new Scanner(System.in);
        int wt = weight.nextInt();

        addRecord(child1, dt, wt);
    }

    else if(selection == 2){
        System.out.println("=========================\n       View Record       \n=========================");
        System.out.println("Enter date");
        Scanner date = new Scanner(System.in);
        String dt = date.nextLine();
        System.out.println(ViewRecord(child1, dt));
    }

    else if(selection == 3){
        System.out.println("=========================\n     View All Record     \n=========================");
        System.out.println(ViewAllRecord(child1));
    }
}
    }

    private static void addRecord(Diet child1, String dt, int wt) {
        child1.addEntry(dt, wt);
    }

    private static String ViewRecord(Diet child1, String dat) {
        return child1.getEntry(dat);
    }

    private static String ViewAllRecord(Diet child1) {
        return child1.viewList();
    }
}
