package HomeWork7;

import java.util.ArrayList;

public class Park {

    public static void main(String [] args){



        Park park = new Park();

        System.out.println(park);





    }



    ArrayList<Attraction> park= new ArrayList<Attraction>(){

        {

            add(new Attraction("��������", "� 8:00 �� 18:00 ", 25));

            add(new Attraction("����", "� 8:00 �� 18:00 ", 150));

            add(new Attraction("������ ���������", "� 8:00 �� 18:00 ", 40));



        }

    };





    public static class Attraction{



        private String name;

        private String workTime;

        private int price;



        public Attraction(String name, String workTime, int price) {

            this.name = name;

            this.workTime = workTime;

            this.price = price;

        }

    }





    @Override

    public String toString() {

        StringBuilder s = new StringBuilder();



        for(Attraction a : park){



            s.append(" �������� :" + a.name + " ����� ������:" + a.workTime + "���� :" + a.price

                                                + "\n");





        }



        return s.toString();

    }



}