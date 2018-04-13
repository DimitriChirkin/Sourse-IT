package HomeWork7;



import java.util.ArrayList;



public class Film {

    public static void main(String [] args){





        Film film = new Film();

        System.out.println(film);





    }



    ArrayList<FilmInfo> film= new ArrayList<FilmInfo>(){

        {

            add(new FilmInfo(2.3, "Ужасы", "Спилберг"));

            add(new FilmInfo(1.6, "Фантастика", "Гоголь"));

            add(new FilmInfo(2, "Мультики", " Нетфликс"));



        }

    };





    public static class FilmInfo{



        private double duration;

        private String genre;

        private String director ;



        public FilmInfo(double duration, String genre, String director) {

            this.duration = duration;

            this.genre = genre;

            this.director = director;

        }

    }





    @Override

    public String toString() {

        StringBuilder s = new StringBuilder();



        for(FilmInfo f : film){



            s.append(" Режисер :" + f.director + "Жанр:" + f.genre + " :" + f.duration

                    + "\n");





        }



        return s.toString();

    }



}

