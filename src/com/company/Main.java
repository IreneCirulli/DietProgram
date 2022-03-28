package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        Diet child1 = new Diet();

        Entry a  = new Entry( "Jan 1", 30);
        Entry c  = new Entry("Jan 15", 25);
        Entry b  = new Entry("Jan 18", 19);
        Entry d = new Entry("Jan 27", 36);

       child1.entrylist.add(a);
       child1.entrylist.add(c);
       child1.entrylist.add(b);
       child1.entrylist.add(d);

        System.out.println(child1.viewList());

    }
}
