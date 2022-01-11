package day31_Task;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    /* Movie Task:

	3.1. Create a class named Movie
	    Attributes:
	        country (String), title (String), Genre (String), releaseDate (String), director (String), casts (ArrayList<String>)

		Add a constructor to set the country, title, release date, and director of the Movie

	    Actions
	        addCast(String): adds the given string argument to the arrayList casts
	        addCasts(String[]): adds the given string array argument to the arrayList casts
	        toString(): returns the name of country, title, release date, and total number of casts


     */
    public String country,title,Genre, releaseDate, director;
    public ArrayList<String> casts = new ArrayList<>();


    public Movie(String country, String title, String releaseDate, String director, ArrayList<String> casts) {
        this.country = country;
        this.title = title;
        this.Genre =Genre;
        this.releaseDate = releaseDate;
        this.director = director;
    }
    public void addCast(String cast){
        casts.add(cast);
    }
    public void addCast(String[] castList){
        casts.addAll(Arrays.asList(castList));
    }


    public String toString() {
        return "title: " + title + "\n" +
                "country: " + country + "\n" +
                "Genre: " + Genre + "\n" +
                "releaseDate: " + releaseDate + "\n" +
                "director: " + director + "\n" +
                "Casts: " + casts+ " total number of casts: "+casts.size();
    }
}
