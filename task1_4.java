import java.util.*;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

//1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет
// “перевернутый” список.Постараться не обращаться к листу по индексам.
public class task1_4 {
    public static void main(String[] args) {
        String phrase = "каждый охотник желает знать где сидит фазан";

        LinkedList<String> list1 = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();
        String[] phraseArray = phrase.split(" ");
        for (int i = 0; i < phraseArray.length; i++) {
//
            list1.add(phraseArray[i]);
        }
        System.out.println(list1);
        ListIterator<String> listIterator = list1.listIterator();

        while (listIterator.hasNext()){
            list2.add(list1.peekLast());
            list1.remove(list1.peekLast());
        }
        System.out.println(list2);
    }
}
