package lambdaexpression.iterator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class IterateList {
    public static void main(String[] args) {
        List<String> electronicsList = Arrays.asList("lambda.expression.anonymous.Laptop", "Tablet", "Television", "Monitor");
        System.out.println("Classic enhanced for loop");
        for (String items : electronicsList) {
            System.out.println(items);
        }

        //Please implement Anonymous class to iterate through
        System.out.println("Using Anonymous class");
        electronicsList.forEach(new Consumer<String>(){
            public void accept(String s){
                System.out.println(s);
            }
        });


        //Please implement lambda expression to iterate through electronicsList
        System.out.println("Lambda Expression");
        electronicsList.forEach(st -> System.out.println(st));

        //Please implement lambda Method Reference to iterate through electronicsList
        System.out.println("Lambda Method Reference-1");
        electronicsList.forEach(System.out::println);

        //Please implement lambda Method Reference from Electronics class to iterate through electronicsList
        System.out.println("Lambda Method Reference-2 using Electronics class");
        electronicsList.forEach(Electronics::countWordLength);

        //Please implement stream iteration through electronicsList
        System.out.println("iterate using Stream for each loop");
        electronicsList.stream()
                .forEach(st -> System.out.println(st));
    }

}

class Electronics {
    static void countWordLength(String st) {
        System.out.println(st.length());
    }
}
