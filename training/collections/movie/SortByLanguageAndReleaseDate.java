package com.psl.training.collections.movie;

import java.time.LocalDate;
import java.util.Comparator;

public class SortByLanguageAndReleaseDate implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		int n = o1.getLanguage().compareTo(o2.getLanguage());
		if(n==0)
		{
			LocalDate l1 = o1.getReleaseDate();
			LocalDate l2 = o2.getReleaseDate();
			if(l1.isAfter(l2)) n=1;
			if(l1.isBefore(l2)) n=-1;
			if(l1.isEqual(l2)) n=0;
		}
		return n;
	}

}

