package org.example.java8.consumer;

interface Parser{
 String pars(String s);
}

class StringParser{
    public static String convert(String str){
        if (str.length()<6){
            str = str.toLowerCase();
        } else {
            str = str.toUpperCase();
        }
        return str;
    }
}

class MyPrinter{
    public void print(String s, Parser p) {
        s = p.pars(s);
        System.out.println(s);
    }
}
public class Printer {
    public void run() {

       // String str = "Description";
        String str = "Desc";
        MyPrinter myPrinter = new MyPrinter();

     /*   myPrinter.print(str, new Parser(){
            public String pars(String s){
               return StringParser.convert(s);
            }

        } );
    */

        //myPrinter.print(str, s->StringParser.convert(s) );
        myPrinter.print(str, StringParser::convert);
    }



}
