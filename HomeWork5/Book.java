package HomeWork5;



public class Book {



    private int id;

    private String title;

    private String author;

    private String publish;

    private int yearOfPublish;

    private int numberOfPages;

    private double price;

    private String binding;





    public Book() {

        super();

    }



    public Book(int id) {

        super();

        this.id = id;

    }





    public Book(int id, String title, String author, String publish, int yearOfPublish,

                int numberOfPages, double price, String binding) {

        this.id = id;

        this.title = title;

        this.author = author;

        this.publish = publish;

        this.yearOfPublish = yearOfPublish;

        this.numberOfPages = numberOfPages;

        this.price = price;

        this.binding = binding;

    }



    public int getId() {

        return id;

    }



    public void setId(int id) {

        this.id = id;

    }



    public String getAuthor() {

        return author;

    }



    public void setAuthor(String author) {

        this.author = author;

    }



    public String getTitle() {

        return title;

    }



    public void setTitle(String title) {

        this.title = title;

    }



    public String getPublish() {

        return publish;

    }



    public void setPublish(String publish) {

        this.publish = publish;

    }



    public int getYearOfPublish() {

        return yearOfPublish;

    }



    public void setYearOfPublish(int yearOfPublish) {

        this.yearOfPublish = yearOfPublish;

    }



    public int getNumberOfPages() {

        return numberOfPages;

    }



    public void setNumberOfPages(int numberOfPages) {

        this.numberOfPages = numberOfPages;

    }



    public double getPrice() {

        return price;

    }





    public void setPrice(double price) {

        this.price = price;



    }

    public String getBinding() {

        return binding;

    }



    public void setBinding(String binding) {

        this.binding = binding;

    }



    public void printParametr(){



        System.out.print(" id - " +getId() + " | " );

        System.out.print (" Title - " + getTitle()+ " | ");

        System.out.print(" Author - " + getAuthor()+ " | ");

        System.out.print(" Publish - " + getPublish()+ " | " );

        System.out.print(" YearOfPublish - " + getYearOfPublish()+ " | ");

        System.out.print(" NumberOfPages - " + getNumberOfPages()+ " | ");

        System.out.print(" Price - " + getPrice()+ " | ");

        System.out.print(" Binding - " + getBinding()+ " | ");

        System.out.println();

    }



    public void findAuthor(String author){



        if(author.equals(getAuthor())){



            printParametr();



        }



    }



    public void findPublish(String publish){



        if(publish.equals((getPublish()))){



            printParametr();

        }



    }



    public void findYearOfBooks(int yearOfPublish){



        if(yearOfPublish <= getYearOfPublish() ){



           printParametr();

        }



    }

}