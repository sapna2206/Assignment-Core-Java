package com.psl.training.collections.movie;

import java.util.Comparator;

public class SortByLanguage implements Comparator<Movie>{

	@Override
	public int compare(Movie m1, Movie m2) {
		// TODO Auto-generated method stub
		return m1.getLanguage().compareTo(m2.getLanguage());
	}

}
