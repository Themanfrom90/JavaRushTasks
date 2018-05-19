package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        Iterator<Cat> iterator = cats.iterator();
        cats.remove(iterator.next());

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        HashSet<Cat> setCat = new HashSet<>();
        setCat.add(new Cat());
        setCat.add(new Cat());
        setCat.add(new Cat());
        return setCat;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

    // step 1 - пункт 1
    public static class Cat {
        Cat() {

        }
    }
}
