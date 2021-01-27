package com.psl.training.collections.movie;

//import java.time.LocalDate;
//import java.time.LocalTime;
import java.util.*;

public class MovieTest{
	
	public static void main(String[] args) {
		
		List<Movie> ml = Movie.createMovieList();
		for(Movie m:ml)
		{
			m.display();
		}
		System.out.println("--------After sorting according to language-------");
		Collections.sort(ml);
		for(Movie m:ml)
		{
			m.display();
		}
		System.out.println(" Sort List by Language");
		ml.sort(new SortByLanguage());
		for(Movie m:ml)
		{
			m.display();
		}
		System.out.println(" Sort List by Duration");
		ml.sort(new SortByDuration());
		for(Movie m:ml)
		{
			m.display();
		}
		System.out.println(" Sort List by Language and release date");
		ml.sort(new SortByLanguageAndReleaseDate());
		for(Movie m:ml)
		{
			m.display();
		}
	}

	

}
