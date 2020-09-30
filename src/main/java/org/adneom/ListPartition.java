package org.adneom;


import java.util.ArrayList;
 import java.util.Iterator;
import java.util.List;




public class ListPartition {


    public static List<List<Integer>> partition(List<Integer> liste, Integer taille) {
        List<List<Integer>> in = new ArrayList<>();
        ArrayList<Integer> in2  = new ArrayList<>();
        int i;

        Iterator<Integer> iterator = liste.iterator();
        while (iterator.hasNext()){
            in2.clear();
            for(i=0;i < taille && iterator.hasNext();i++){
                in2.add(iterator.next());
            }
            in.add((List<Integer>) in2.clone());
        }


        return in;

    }




}
