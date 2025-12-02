/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stream.Aula01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author demi
 */
public class Program {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(2, 3, 5, 6, 7);
        
        Stream<Integer> stream1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(stream1.toArray()));
        
        Stream<String> stream2 = Stream.of("Maria", "Lula");
        System.out.println(Arrays.toString(stream2.toArray()));
        
        Stream<Integer> stream3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(stream3.limit(10).toArray()));
        
        //Fibonnaci
        Stream<Long> stream4 = Stream.iterate(new Long[]{0L, 1L}, p -> new Long[]{p[1], p[0]+p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(stream4.limit(20).toArray()));
    }
}
