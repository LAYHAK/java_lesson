package listdemo.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        System.out.println("Inserting 23 in the HashSet:  " + set.add(23));
        System.out.println("Inserting 34 in the HashSet:  " + set.add(34));
        System.out.println("Inserting 23 in the HashSet:  " + set.add(23));

        System.out.println(set);
        //Fetch Element
        System.out.println(set.contains(23));
    }
}
