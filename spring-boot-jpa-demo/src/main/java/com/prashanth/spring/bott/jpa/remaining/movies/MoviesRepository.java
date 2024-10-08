package com.prashanth.spring.bott.jpa.remaining.movies;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<Movies,Integer>{

	List<Movies> getByTitle(String title);
	List<Movies> queryByGenreOrderByReleaseYearDesc(String genre);
	int countByGenre(String genre);
	List<Movies> findFirst4ByLanguage(String language);
	List<Movies> findByDirectorNameNotLike(String director);
	
	List<Movies> findByReleaseYearBetween(int startYear,int endYear);
	List<Movies> findByLanguageIn(List<String> languages);
	
	List<Movies> findByGenreContainingIgnoreCase(String genre);
	List<Movies> findByTitleStartingWith(Character startingCharacter);
	
	List<Movies> findByRatingGreaterThan(Double rating);
	
}
