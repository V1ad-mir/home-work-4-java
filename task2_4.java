//2. Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.
public class task2_4 {
    public static void main(String[] args) {
    MyQueue myQueue = new MyQueue();
    myQueue.enqueue("1");
    myQueue.enqueue("2");
    myQueue.enqueue("3");
    myQueue.printA();
    System.out.println(myQueue.first());
    System.out.println(myQueue.dequeue());
    myQueue.printA();
    }
}
