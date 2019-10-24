
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRemoveObjectIterator {

	public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(101);
        numbers.add(200);
        numbers.add(301);
        numbers.add(400);

        System.out.println("ArrayList Before : " + numbers);

        Iterator<Integer> itr = numbers.iterator();
     // remove all even numbers
        while (itr.hasNext()) {
            Integer number = itr.next();

               if (number % 2 == 0) {
               itr.remove();
            }

        }

        System.out.println("ArrayList After : " + numbers);
	}
}

