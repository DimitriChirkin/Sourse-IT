package HomeWork9;

public class BubbleSort {

    public static void main(String []args){





        int mas [] = new int[10];



        for(int i = 0; i < mas.length; i++){



            mas[i] = (int) (1+Math.random()*10);

            System.out.print(mas[i] + " ");



        }

        System.out.println();

        bubbleSort(mas);



        for(int i = 0; i < mas.length; i++){



            System.out.print(mas[i] + " ");



        }



    }





    static int[] bubbleSort(int[] mas){



       for(int i = 0; i < mas.length-1; i++){

           for(int j = 0; j < mas.length-1; j++){



               if(mas[j] > mas[j+1]){



                   int temp = mas[j+1];

                   mas[j + 1] = mas[j];

                   mas[j] = temp;



               }



           }









       }





        return mas;

    }
}
