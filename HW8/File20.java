package HW8;
import java.io.*;

import java.nio.file.Files;

import java.nio.file.Path;

import java.nio.file.Paths;

import java.util.stream.Collectors;

import java.util.stream.Stream;

public class File20 {
	 public static void main(String[] args) throws Exception {



	        System.out.println(" 1) Подсчитать кол-во файлов java в указанной директории");

	        System.out.print(" Найдено файлов - ");

	        System.out.println(numberOfFiles("C:\\Users\\PC\\eclipse-workspace\\home\\src",".java"));



	        System.out.println(" 2) Найти файлы с расширением .java и вывести их в строку");

	        findAndPrintFiles(5);







	    }
	 public static int numberOfFiles(String dir,String extension) {

	        int counter = 0;

	        File file = new File(dir);

	        File[] s = file.listFiles();

	        for (int i = 0; i < s.length; i++) {

	            if ( s[i].getName().endsWith(extension)) {

	                counter ++;

	            }



	            if(s[i].isDirectory()){



	                numberOfFiles(dir,extension);

	            }



	        }

	        return counter;

	    }

	    public static void findAndPrintFiles(int depth) throws IOException {



	        Path start = Paths.get("");



	        try (Stream<Path> stream = Files.find(start, depth, (path, attr) -> {

	            return String.valueOf(path).endsWith(".java");

	        }))

	        {

	            String joined = stream.sorted().map(String::valueOf).collect(Collectors.joining(":"));

	            System.out.println("Found: " + joined);

	        }

	    }





	}


