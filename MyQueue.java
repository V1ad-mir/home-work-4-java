import java.util.LinkedList;
import java.util.ListIterator;

public class MyQueue {
    LinkedList<String> list = new LinkedList<>();
    String word = "";

    LinkedList<String> enqueue(String item){
    list.add(item);
    return(list);
   }
    String first() {
        return list.peekFirst() ;
    }
    String dequeue(){
    word = first();
    list.remove(list.peekFirst());
    return word;
    }


    void printA(){
    ListIterator<String> listIterator = list.listIterator();

    while (listIterator.hasNext()){
        System.out.print(listIterator.next()+" ");
    }
        System.out.println("\n");

    }
}
