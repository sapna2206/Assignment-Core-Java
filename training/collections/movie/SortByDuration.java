package com.psl.training.collections.movie;

import java.util.Comparator;

public class SortByDuration implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return o1.getDuration().compareTo(o2.getDuration());
	}

}