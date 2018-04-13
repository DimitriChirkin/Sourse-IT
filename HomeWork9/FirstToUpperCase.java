package HomeWork9;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.util.stream.Stream;

import java.io.*;

public class FirstToUpperCase {

    public static void main(String [] args) throws IOException {



        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = capitalize(reader.readLine());



        System.out.println(s);

    }

    public static String capitalize (String text)

    {



        String text11 = "";



        text11 += Character.toString(text.charAt(0)).toUpperCase();



        for (int i = 1; i < text.length(); i++)

        {



            if (Character.toString(text.charAt(i-1)).equals(" "))

            {

                text11 += Character.toString(text.charAt(i)).toUpperCase();

            }

            else

                text11 += Character.toString(text.charAt(i));



        }

        return text11;

    }





}