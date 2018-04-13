package HW8;
import java.io.IOException;

import java.nio.file.Files;

import java.nio.file.Path;

import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Collectors;

import java.util.stream.Stream;

public class HWfile {
	   public static void main(String[] args) throws IOException {

	        Path start = Paths.get("C:\\Users\\PC\\eclipse-workspace\\home\\src");

	        int maxDepth = 5;

	        try (Stream<Path> stream = Files.walk(start, maxDepth)) {
	        	Scanner in = new Scanner(System.in) ;
	        	
	        	String inp =in.nextLine() ;
	            String joined = stream

	                    .map(String::valueOf)

	                    .filter(path -> path.endsWith(inp))

	                    .sorted()

	                    .collect(Collectors.joining(" \n "));

	            System.out.print("walk(): " + joined);

	        }



	    }

}



    