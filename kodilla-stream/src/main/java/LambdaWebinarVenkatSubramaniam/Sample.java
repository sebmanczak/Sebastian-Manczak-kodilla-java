package LambdaWebinarVenkatSubramaniam;

import java.util.Arrays;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        // function has 4 things
        //1 name
                //2 parameter list
                //3 body
        //3 return type
//        Thread th;
//        th = new Thread(() -> System.out.println("In another thread"));
//        th.start();
//        System.out.println("In main");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        for(int i = 0; i < numbers.size(); i++)
            System.out.println(numbers.get(i));

        numbers.forEach(e -> System.out.println(e));
        numbers.forEach(System.out::println);
    }
}
