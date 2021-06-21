/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package java_practice;

import java.util.stream.IntStream;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        //streams

        //integer stream
        IntStream
            .range(1, 10)
            .forEach(System.out::print);
        System.out.println();

        IntStream
            .range(1, 10)
            .skip(5)
            .forEach(x->System.out.println(x));
        System.out.println();
        
    }
}
