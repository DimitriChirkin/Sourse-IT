package HomeWork9;



import java.io.*;

import java.util.*;

import java.io.BufferedReader;

import java.io.File;

import java.io.FileReader;

import java.io.IOException;



public class LettersStatistic {



    private static ArrayList chars = new ArrayList<>();



    public static void main(String args[]) throws FileNotFoundException, IOException {





        try( BufferedReader reader = new BufferedReader(

                new FileReader(new File("C:\\Users\\PC\\eclipse-workspace\\home\\src\\DemoioTXT")));) {



            int c;

            while ((c = reader.read()) != -1) {

                chars.add((char) c);

            }



            reader.close();

        }





        String txt = chars.toString();

        String alph = "abcdefghijklmnopqrstuvwxyz";

        for (int a = 0; a < alph.length(); a++){

            char letter = alph.charAt(a);

            txt = txt.toLowerCase();



            Map<Character, Integer> map = new HashMap<Character, Integer>();

            for (int i = 0; i < txt.length(); ++i) {

                char c = txt.charAt(i);

                // проверяем является ли символ буквой

                if (Character.isLetter(c)) {

                    if (map.containsKey(c)) {

                        map.put(c, map.get(c) + 1);



                    } else {

                        map.put(c, 1);



                    }

                }

            }



            if (map.get(letter) == null){



            }

            else{



                map.entrySet().stream()

                        .sorted(Map.Entry.<Character, Integer>comparingByValue())

                        .forEach(System.out::println);

                break;

            

            }











        }







    }

}
