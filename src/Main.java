import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,3,7, 8,3,10);

        List<String> list2 = new ArrayList<>();
        list2.add("Hi");
        list2.add(null);
        list2.add("Hello");
        list2.add("Namastey");
        //
   //     System.out.println(list);

          /*  list.stream()
                    .filter( i -> i > 7)
                    .forEach(System.out::println);
*/
      //  System.out.println(list2);
        list2.stream()
                .filter( s -> s != null)
                .forEach(System.out :: println);
    }


 }