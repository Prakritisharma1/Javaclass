package Arraylist;

import java.beans.JavaBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList1 {
    public void list() {

        //ArrayList<Integer> java = new Arraylist<Integer>();
        ArrayList<Integer> java = new ArrayList<>();
        java.add(4);
        java.add(5);
        java.add(5);
        java.add(7);
        System.out.println(java);
        java.remove(2);
        System.out.println(java);
        Collections.sort(java);
        System.out.println(java);

        for(int c : java ){

            System.out.println(c);
        }
    }

}
