package org.example.java8.streams;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void run(){
        Stream<String> streamOfString =
                Pattern.compile(", ").splitAsStream("a, b, c");
        System.out.println(streamOfString);
        String[] arr= {"Hello", "qwerty", "asda", "asdfa", "as", "a"};
        System.out.println( "Ex1 "+ ex1(Arrays.asList(arr),'a'));

        System.out.println( "Ex2 "+ ex2(Arrays.asList("Hello", "world", "!", "Good", "morning", "!")));

        System.out.println( "Ex3 "+ ex3(Arrays.asList("asd", "a", "basdw")));

        System.out.println( "Ex4 "+ ex4(2,Arrays.asList("8DC3", "4F", "B", "3S", "S3", "A1", "2A3G", "1B")));

        System.out.println( "Ex5 "+ ex5(Arrays.asList(1, 2, 3, 4, 5, 6)));

        System.out.println("middle");
        //{1, 3, 4}, {"1aa", "aaa", "1", "a"} <br>output: {"1", "1aa", "Not Found"}
        System.out.println( "Ex6 "+ ex6(Arrays.asList(1, 3, 4), Arrays.asList("1aa", "aaa", "1", "a")));

        System.out.println( "Ex7 "+ ex7(5, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)));
        System.out.println( "Ex8 "+ ex8(3,4, Arrays.asList(-10, 3, -3, 4, 55, 6)));
        System.out.println( "Ex9 "+ ex9(Arrays.asList("ABC", "A", "BCD", "D")));
        System.out.println( "Ex10 "+ ex10(Arrays.asList("asnsbiu", "asdsad", "asnsb", "asdf", "asdfb", "as", "a", "aop")));

       // List<YearSchoolStat> listYSS = new ArrayList<>(new YearSchoolStat(1, 1993, "Ivanov"),
       //         new YearSchoolStat((2, 1992, "Petrov")));

    }

    public static List<String> ex1(List<String> list, char c) {
        return list.stream()
                .filter(e -> e.length() > 1)
                .filter(e -> e.charAt(0) == c && e.charAt(e.length() - 1) == c).toList();
    }

    public static List<Integer> ex2(List<String> list) {
        return list.stream().map(String::length).sorted().toList();
    }

    public static List<String> ex3(List<String> list) {
        return list.stream().map(e -> "" + e.charAt(0) + e.charAt(e.length() - 1)).toList();
    }

    public static List<String> ex4(int k, List<String> list) {
        return list.stream()
                .filter(e -> e.length() == k)
                .filter(e -> ("" + e.charAt(e.length() - 1)).matches("[0-9]"))
                .toList();
    }

    public static List<Integer> ex5( List<Integer> list){
        return list.stream()
                .filter(e->e%2!=0)
                .sorted()
                .toList();
    }

    public static List<String> ex6( List<Integer> listInteger,List<String> listString){
        return listInteger.stream().map(
                eInt->{
                    return listString.stream()
                            .filter(eString -> eString.length() == eInt)
                            .findAny()
                            .orElse("Not Found");// FIRST

                }
        ).toList();
    }
    public static List<Integer> ex7( int k, List<Integer> listInteger){
        List<Integer>  l1 =  listInteger.stream().filter(e->e%2==0).toList();
        System.out.println("l1 - " + l1);
        List<Integer> l2 =  listInteger.stream().skip(k).toList();
        System.out.println("l2 - " + l2);
        System.out.println("l1 + l2 " + Stream.concat(l1.stream(), l2.stream()).toList());
        List<Integer> l3 = Stream.concat(l1.stream(), l2.stream()).filter(e-> l1.stream().noneMatch(eIn-> Objects.equals(eIn, e))).toList();
        List<Integer> l4 = Stream.concat(l1.stream(), l2.stream()).filter(e-> l2.stream().noneMatch(eIn-> Objects.equals(eIn, e))).toList();
        return Stream.concat(l3.stream(), l4.stream()).toList();
        }

    public static List<Integer> ex8( int d,int k, List<Integer> listInteger) {
        List<Integer> l1 = listInteger.stream().filter(e->e>d).toList();
        List<Integer> l2 = listInteger.stream().skip(k).toList();
        return Stream.concat(l1.stream(), l2.stream()).collect(Collectors.toSet()).stream().sorted(Comparator.reverseOrder()).toList();
    }

    public static List<String>  ex9( List<String> list) {
        return   Arrays.stream(list.stream()
                .map(e->  "" + String.valueOf(e.charAt(0)).repeat(e.length()))
                .collect(Collectors.joining())
                        .split(""))
                .toList().stream()
                .collect(Collectors.groupingBy(x -> x,Collectors.counting()))
                .entrySet().stream()
                .map (e->""+e.getValue()+"-"+e.getKey())
                        .toList();

    }
    public static List<String> ex10( List<String> list) {
      return   list.stream()
              .sorted(Comparator.reverseOrder())
              .sorted(Comparator.comparing(String::length).reversed())
              .map(e->(""+e.toUpperCase().charAt(e.length()-1)))
              .toList();
    }
}

