package listdemo.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class Remove {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(23);
        set.add(34);
        set.add(56);

        set.remove(23);

        System.out.println("HashSet after removing one element" + set);

        set.clear();

        System.out.println("HashSet after removing all elements" + set);
    }
}
