package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10); // map aplica uma função a cada elemento da stream
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob"); // of cria uma stream com os elementos passados
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2); // iterate gera uma stream infinita, com o primeiro elemento sendo o primeiro parametro e os demais sendo gerados pela função do segundo parametro
        System.out.println(Arrays.toString(st3.limit(10).toArray())); // limit limita a quantidade de elementos da stream

        Stream<Long> st4 = Stream.iterate(new Long[] { 0L, 1L }, p -> new Long[] { p[1], p[0] + p[1] }).map(p -> p[0]); // fibonacci
        System.out.println(Arrays.toString(st4.limit(10).toArray()));
    }
}