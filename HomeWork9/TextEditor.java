package HomeWork9;

import java.io.*;



import java.io.IOException;

import java.nio.file.Files;

import java.nio.file.Paths;

import java.nio.file.StandardOpenOption;

import java.util.Map;

import java.util.Scanner;

import java.util.TreeMap;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

import java.util.stream.Stream;



public class TextEditor {





    public static void main(String[] args) throws IOException{



       writeFile();

       readFile();

       WordCount("C:\\Users\\PC\\eclipse-workspace\\home\\src\\DemoioTXT");

       symbolsCount("C:\\Users\\PC\\eclipse-workspace\\home\\src\\DemoioTXT");

       countLines("C:\\Users\\PC\\eclipse-workspace\\home\\src\\DemoioTXT");

       findLine("C:\\Users\\PC\\eclipse-workspace\\home\\src\\DemoioTXT");

    }





    static void writeFile()throws IOException{



        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" Write down the data to the file");

        while (true) {

            String str = reader.readLine();

            if (str.equalsIgnoreCase("exit")) {

                System.out.println(" Exit from the program ");

                break;

            }

            str = str + "\n";

            Files.write(Paths.get("C:\\Users\\PC\\eclipse-workspace\\home\\src\\DemoioTXT"), str.getBytes(), StandardOpenOption.APPEND);

        }

        reader.close();



    }



    static void readFile() throws IOException{



        try (Stream<String> stream = Files.lines(Paths.get("C:\\Users\\PC\\eclipse-workspace\\home\\src\\DemoioTXT"))) {

            stream



                    .forEach(System.out::println);

        }





    }



    public static void WordCount(String filename) throws FileNotFoundException{

        File file = new File(filename);

        Scanner scanner = new Scanner(file);

        int words = 0;





        while (scanner.hasNextLine()) {



            String[] array = scanner.nextLine().split(" ");

            words = words + array.length;

        }



        System.out.println("Number of words: " + words);



        scanner.close();

    }





    public static void symbolsCount(String filename) throws IOException { // Переделать

        FileInputStream in = new FileInputStream(filename);

        byte[] array = new byte[in.available()];

        in.read(array);

        String text = new String(array);

        int count = 0;

        for(char ch : text.toCharArray()) {

            if(!Character.isWhitespace(ch)) {

                count++;

            }

        }

        System.out.println("Number of symbols: " + count);



    }



    public static void countLines(String filename) throws IOException {

        LineNumberReader reader  = new LineNumberReader(new FileReader(filename));

        int cnt = 0;

        String lineRead = "";

        while ((lineRead = reader.readLine()) != null) {}



        cnt = reader.getLineNumber();

        System.out.println("Number of lines: " + cnt);

        reader.close();



    }



    private static void findLine (  String filename) throws IOException {



        File file = new File(filename);

        FileReader fr = new FileReader(file);

        BufferedReader br = new BufferedReader(fr);

        String line;

        int lineNumber = 0;

        while ((line = br.readLine()) != null) {

            lineNumber++;

            int vowels = 0;

            for (int i = 0; i < line.length(); i++) {



                if (line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' || line.charAt(i) == 'o'

                        || line.charAt(i) == 'u' || line.charAt(i) == 'y') {

                    vowels++;



                }



            }

            System.out.println("Number of vowels in line " + lineNumber + ": " + vowels);

        }

        br.close();

        fr.close();

    }

















    }