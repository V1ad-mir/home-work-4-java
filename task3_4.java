import java.util.LinkedList;
import java.util.ListIterator;

//3. Найдите сумму всех элементов LinkedList,
// cохраняя все элементы в списке. Используйте итератор
public class task3_4 {
    public static void main(String[] args) {
        String[] listArray= new String[]{"21","3","1","10"};
        LinkedList<String> list = new LinkedList<>();
        double sum = 0;
        double num = 0;
        for (int i = 0; i < listArray.length; i++) {
            list.add(listArray[i]);
        }
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){

            num = Double.parseDouble(listIterator.next());
            sum+=num;

        }
        System.out.println(sum);


    }
    }

