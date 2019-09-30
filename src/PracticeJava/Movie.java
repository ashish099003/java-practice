package PracticeJava;

import java.util.ArrayList;
import java.util.Collections;

class Movie1 implements Comparable<Movie1> 
{ 
    private double rating; 
    private String name; 
    private int year; 
  
    // Used to sort movies by year 
    public int compareTo(Movie1 m) 
    { 
        return this.year - m.year; 
    } 
  
    // Constructor 
    public Movie1(String nm, double rt, int yr) 
    { 
        this.name = nm; 
        this.rating = rt; 
        this.year = yr; 
    } 
  
    // Getter methods for accessing private data 
    public double getRating() { return rating; } 
    public String getName()   {  return name; } 
    public int getYear()      {  return year;  } 
} 
  
// Driver class 
class Movie 
{ 
    public static void main(String[] args) 
    { 
        ArrayList<Movie1> list = new ArrayList<Movie1>(); 
        list.add(new Movie1("Force Awakens", 8.3, 2015)); 
        list.add(new Movie1("Star Wars", 8.7, 1977)); 
        list.add(new Movie1("Empire Strikes Back", 8.8, 1980)); 
        list.add(new Movie1("Return of the Jedi", 8.4, 1983)); 
  
        Collections.sort(list); 
  
        System.out.println("Movies after sorting : "); 
        for (Movie1 movie: list) 
        { 
            System.out.println(movie.getName() + " " + 
                               movie.getRating() + " " + 
                               movie.getYear()); 
        } 
    } 
} 