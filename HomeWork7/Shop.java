package HomeWork7;



import java.util.ArrayList;



public class Shop {



    private String name;

    private String address;

    private Department department;



    public Shop(String name, String address) {

        this.name = name;

        this.address = address;

    }



    public static void main(String [] args){



            Shop shop = new Shop(" Ekvator"," Rubalko");



        System.out.println(shop);

        System.out.println(" � ���� �������� ���� ����� ������");





        ArrayList<Department> departments = new ArrayList();

        departments.add(new Department( " 1 "," ����",true));

        departments.add(new Department( " 2 "  ," ������ ",false));

        departments.add(new Department( " 3 ","��� ������",true));

        for(int i = 0; i < departments.size(); i++){



            System.out.println(" ��������� : " + departments.get(i).nameDep +

                                "������� :" + departments.get(i).product +

                                " �������� : " +(departments.get(i).delivery ? " ����" : " ���"));





        }



          }























          public static class Department {



              private String nameDep;

              private String product;



              public Department(String nameDep, String product, boolean delivery) {

                  this.nameDep = nameDep;

                  this.product = product;

                  this.delivery = delivery;

              }



              private boolean delivery;





              public String getNameDep() {

                  return nameDep;

              }



              public void setNameDep(String nameDep) {

                  this.nameDep = nameDep;

              }



              public String getProduct() {

                  return product;

              }



              public void setProduct(String product) {

                  this.product = product;

              }



              public boolean isDelivery() {



                  return delivery;

              }



              public void setDelivery(boolean delivery) {

                  this.delivery = delivery;

              }











          }









    @Override

    public String toString() {

        StringBuilder str = new StringBuilder();



        str.append(" Shop : "  + name + "\n");

        str.append(" Adress : " + address);









        return str.toString();

    }











}