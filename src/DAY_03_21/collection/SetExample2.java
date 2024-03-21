package DAY_03_21.collection;

import lombok.Data;

import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample2 {
    public static void main(String[] args) {
        Set<String> strSet = new HashSet<>();

        strSet.add("Hello");
        strSet.add("World");
        System.out.println(strSet.add("Hello"));
        System.out.println(strSet);

        for(String str : strSet) {
            System.out.println(str);
        }
        Iterator<String> it = strSet.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}