package HomeWork5;

import HomeWork5.Book;



import java.util.Scanner;



public class BookInfo {

    public static void main(String[] args){



        Scanner sc = new Scanner(System.in);



        Book[] book = new Book[10];

        book[0] = new Book(0, " ����� 1", "������", "����",

                1999, 100, 201," Soft ");



        book[1] = new Book(1, " ����� 2", "���������", "�������",

                2011, 3207, 202," Soft ");



        book[2] = new Book(2, " ����� 3", "�����", "������",

                2000, 307, 203," Soft ");



        book[3] = new Book(3, " ����� 4", "������", "�����",

                2008, 407, 204," Soft ");



        book[4] = new Book(4, " ����� 5", "���������", "������",

                2005, 507, 205," Soft ");



        book[5] = new Book(5, " ����� 6", "�����", "����",

                1850, 607, 206," Hard ");



        book[6] = new Book(6, " ����� 7", "�����", "�������",

                2014, 707, 207," Hard ");



        book[7] = new Book(7, " ����� 8", "���������", "�����",

                1994, 807, 208," Hard ");



        book[8] = new Book(8, " ����� 9", "��������", "�������",

                1964, 107, 209," Hard ");



        book[9] = new Book(9, " ����� 10", "������", "�����",

                1900, 307, 210," Hard ");





        System.out.println(" ������� ������");

        String a = sc.nextLine();



        for(int i = 0; i < book.length;i++) {



            book[i].findAuthor(a);

        }











        System.out.println("������� ������������");

        a = sc.nextLine();

        for(int i = 0; i < book.length;i++){



            book[i].findPublish(a);



        }



        System.out.println(" ������� ��� ������������");

        int b = sc.nextInt();

        for(int i = 0; i < book.length;i++){



            book[i].findYearOfBooks(b);



        }





    }







}