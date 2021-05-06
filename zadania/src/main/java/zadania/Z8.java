package zadania;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Z8 {
    public static void main(String[] args) {
        String[] drzewa = {"brzoza", "modrzew", "grab", "buk", "wierzba" };
        List<String> list = Arrays.asList(drzewa);
        printGeneric(list);
        printIterator(list);
    }

    public static void printGeneric(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void printIterator(List<?> list) {
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}