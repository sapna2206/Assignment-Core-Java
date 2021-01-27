package com.psl.training.collections.movie;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Movie implements Comparable<Movie>{
	private String name;
	private String language;
	private LocalDate releaseDate;
	private String director;
	private String producer;
	private LocalTime duration;
	
	public Movie(String name, String language, LocalDate releaseDate, String director, String producer,
			LocalTime duration) {
		super();
		this.name = name;
		this.language = language;
		this.releaseDate = releaseDate;
		this.director = director;
		this.producer = producer;
		this.duration = duration;
	}

	public int compareTo(Movie m) {
		return this.language.compareTo(m.language);
	}
	 
	public void display()
	{
		System.out.println("MovieName: "+name+" Language: "+language+" releaseDate: "+releaseDate+" director: "+director+" producer: "+producer+" duration:"+duration);
	}
	
	public static List<Movie> createMovieList()
	{
		List<Movie> list = new ArrayList<>();
		list.add(new Movie("Lakhshya", "Hindi", LocalDate.of(1998, 9, 30), "Anurag", "Yash", LocalTime.of(2, 12)));
		list.add(new Movie("3 Idiot", "Marathi", LocalDate.of(1998, 2, 27), "Yash", "Anurag", LocalTime.of(2, 45)));
		list.add(new Movie("Avengers", "English", LocalDate.of(1998, 6, 22), "josheph", "Remy", LocalTime.of(2, 30)));
		return list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public LocalTime getDuration() {
		return duration;
	}

	public void setDuration(LocalTime duration) {
		this.duration = duration;
	}
}

