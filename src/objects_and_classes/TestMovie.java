package objects_and_classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Test Program for Movie Class
 */

public class TestMovie {

    ArrayList<Movie> movies = new ArrayList<Movie>();
    public void run(Scanner sc) {

        /*read movie informations from movies.txt*/
        BufferedReader rd = null;
        try {
            rd = new BufferedReader(new FileReader("data//movies.txt"));
            String line = null;
            ArrayList<String> movieInfo = new ArrayList<String>();
            while(true){
                line = rd.readLine();
                if(line == null){
                    break;
                }
                else if(line.charAt(0) != '%'){
                    movieInfo.add(line);
                }
                else{
                    //create a movie object
                    String movieName = movieInfo.get(0);
                    String year = movieInfo.get(1);
                    double rating = Double.parseDouble(movieInfo.get(2));
                    ArrayList<String> cast = new ArrayList<String>();
                    for(int i = 3; i < movieInfo.size(); i++){
                        cast.add(movieInfo.get(i));
                    }
                    //add movie into movies ArrayList
                    Movie aMovie = new Movie(movieName,year,rating,cast);
                    movies.add(aMovie);
                    movieInfo = new ArrayList<String>();
                }
            }
            rd.close();
        } catch (Exception e) {
            System.out.println("File read error!!");
        }


        int choice;
        /*menu for the movies*/
        while(true){
            System.out.println("Menu:");
            System.out.println("1 - Display all movies.");
            System.out.println("2 - Display movies that have rating equal or greater than a given rating.");
            System.out.println("3 - Display movies of an actor/actress.");
            System.out.println("0 - Exit.");

            System.out.print("Enter an option: ");
            choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1: displayAllMovies();
                    break;
                case 2: displaybyRating(sc);
                    break;
                case 3: displaybyCast(sc);
                    break;
                default: return;
            }
        }

    }

    public void displayAllMovies(){
        System.out.println("---Movie List---");
        for(int i = 0; i < movies.size(); i++){
            Movie aMovie = movies.get(i);
            System.out.println(getMovieString(aMovie));
        }
    }

    public String getMovieString(Movie aMovie){
        String movie = "Movie: "+aMovie.getMovieName()+"\nYear: "+aMovie.getYear()+"\nRating: "+aMovie.getRating()+"/10\nReview: "+aMovie.getReview()+"\nCast: ";
        boolean first = true;
        ArrayList<String> movieCast = aMovie.getCast();
        for(int i = 0; i < movieCast.size(); i++){
            String cast = movieCast.get(i);
            if(first){
                movie += cast;
                first = false;
            }
            else{
                movie += ", "+cast;
            }
        }
        return movie;
    }

    public void displaybyRating(Scanner sc){
        System.out.print("Enter a rating: ");
        double rating = Double.parseDouble(sc.nextLine());
        System.out.println("---Movies equal or greater than "+rating+" rating---");
        for(int i = 0; i < movies.size(); i++){
            Movie aMovie = movies.get(i);
            if(aMovie.getRating() >= rating){
                System.out.println(getMovieString(aMovie));
            }
        }
    }

    public void displaybyCast(Scanner sc){
        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        System.out.println("---Movies of "+name+"---");
        for(int i = 0; i < movies.size(); i++){
            Movie aMovie = movies.get(i);
            if(aMovie.inCast(name)){
                System.out.println(getMovieString(aMovie));
            }
        }
    }

}