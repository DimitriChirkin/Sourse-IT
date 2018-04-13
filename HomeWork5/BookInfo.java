package HomeWork5;

import HomeWork5.Book;



import java.util.Scanner;



public class BookInfo {

    public static void main(String[] args){



        Scanner sc = new Scanner(System.in);



        Book[] book = new Book[10];

        book[0] = new Book(0, " Книга 1", "Кирилл", "Киев",

                1999, 100, 201," Soft ");



        book[1] = new Book(1, " Книга 2", "Александр", "Харьков",

                2011, 3207, 202," Soft ");



        book[2] = new Book(2, " Книга 3", "Мария", "Донецк",

                2000, 307, 203," Soft ");



        book[3] = new Book(3, " Книга 4", "Кирилл", "Львов",

                2008, 407, 204," Soft ");



        book[4] = new Book(4, " Книга 5", "Александр", "Донецк",

                2005, 507, 205," Soft ");



        book[5] = new Book(5, " Книга 6", "Мария", "Киев",

                1850, 607, 206," Hard ");



        book[6] = new Book(6, " Книга 7", "Ольга", "Винница",

                2014, 707, 207," Hard ");



        book[7] = new Book(7, " Книга 8", "Александр", "Львов",

                1994, 807, 208," Hard ");



        book[8] = new Book(8, " Книга 9", "Каролина", "Харьков",

                1964, 107, 209," Hard ");



        book[9] = new Book(9, " Книга 10", "Кирилл", "Днепр",

                1900, 307, 210," Hard ");





        System.out.println(" Введите автора");

        String a = sc.nextLine();



        for(int i = 0; i < book.length;i++) {



            book[i].findAuthor(a);

        }











        System.out.println("Введите издательство");

        a = sc.nextLine();

        for(int i = 0; i < book.length;i++){



            book[i].findPublish(a);



        }



        System.out.println(" Введите год издательства");

        int b = sc.nextInt();

        for(int i = 0; i < book.length;i++){



            book[i].findYearOfBooks(b);



        }





    }







}