package com.company;

import java.util.ArrayList;

public class Diet {

    ArrayList<Entry> entrylist;

    public Diet() {
        entrylist = new ArrayList<>();
    }

    public ArrayList<Entry> getDiets() {
        return entrylist;
    }

    public void addEntry(String date, int weight) {
          Entry en1 = new Entry(date, weight);
          entrylist.add(en1);
    }

    public String Printlist(){
        String totnames = " ";
        for(Entry a : entrylist)
            totnames = totnames + "\n" + a.toString();

        return totnames;
    }

    public String getEntry(String endate) {
        String enresult = " ";
        for(int i = 0; i<entrylist.size(); i++){
            if(entrylist.get(i).getDate().equals(endate))
              enresult = entrylist.get(i).toString();
        }
        if(enresult.equals(" "))
           return "null";
        else
            return enresult;
    }

    public String viewList() {
        String listofentries = " ";
        String weightdifferential = " ";
        for(int i = 0; i<=entrylist.size()-1; i++){
                listofentries = listofentries + " " + entrylist.get(i).toString() + " ";
            }
        for(int j = 1; j<=entrylist.size()-1; j++){
            weightdifferential = weightdifferential + " " +
                    Integer.toString(entrylist.get(j).getWeight()-entrylist.get(j-1).getWeight())
                    + " ";
        }


        String netweight = Integer.toString(entrylist.get(entrylist.size()-1).getWeight()
                - entrylist.get(0).getWeight());

        return "all entries= " + listofentries.toString() + "\nweight different between all consecutive values"
                + weightdifferential + "\nnet gain/loss= " + netweight;
    }

}
