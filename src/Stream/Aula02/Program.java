/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stream.Aula02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author demi
 */
public class Program {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 6, 6, 3, 2);
        
        Stream<Integer> str1 = list.stream().map(x -> x*10);
        System.out.println(Arrays.toString(str1.toArray()));
        
        int sum = list.stream().reduce(0, (x,y) -> x+y);
        System.out.println("Sum = "+sum);
        
        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x*10)
                .collect(Collectors.toList());
        System.out.println(Arrays.toString(newList.toArray()));
    }
}
