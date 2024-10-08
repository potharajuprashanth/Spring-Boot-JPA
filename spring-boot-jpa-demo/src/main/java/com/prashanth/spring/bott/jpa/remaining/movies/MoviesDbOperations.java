package com.prashanth.spring.bott.jpa.remaining.movies;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MoviesDbOperations {

	
	@Autowired
	MoviesRepository moviesReository;
	
	// findByName(String name);
	// getByName(String name);
	
	public void getMoviesByTitle(String title)
	{
		List<Movies> getMoviesByTitle=moviesReository.getByTitle(title);
		getMoviesByTitle.stream().forEach(System.out::println);
	}
	
	// queryByName(String name);
	// readByName(String name);
	public void getMoviesByGenre(String genre)
	{
		List<Movies> getMoviesByTitle=moviesReository.queryByGenreOrderByReleaseYearDesc(genre);//queryByGenreOrderByReleaseYearAsc
		getMoviesByTitle.stream().forEach(System.out::println);
	}
	
	
	
	// countByName(String name);
	
	public void getCountOfMoviesByGenre(String genre)
	{
		int  getCount=moviesReository.countByGenre(genre);
		System.out.println(genre+"  exists count:"+getCount);
	}
	
	//findFirst3ByLanguage
	//findTop4ByLanguage
	public void getFirst4MoviesByLanguage(String language)
	{
		List<Movies> fist4= moviesReository.findFirst4ByLanguage(language);
		fist4.stream().forEach(System.out::println);
	}
	
	//findByDirectorLike
	//findByDirectorNotLike
	public void getMoviesByDirector(String director)
	{
		List<Movies> getMovies= moviesReository.findByDirectorNameNotLike(director);
		getMovies.stream().forEach(System.out::println);
	}
	
	//findByReleaseYearBetween
	//findByReleaseYearNotBetween
	
	public void getMoviesInfoByReleaseYearBetween(int stratReleaseYear,int endReleaseYear)
	{
		List<Movies> getData=moviesReository.findByReleaseYearBetween(stratReleaseYear, endReleaseYear);
		getData.stream().forEach(System.out::println);
	}
	
	//findByLanguageIn
	//findByLanguageNotIn
	public void getMoviesByLanguageIn()
	{
		List<Movies> getMoviesByIn=
				moviesReository.findByLanguageIn(Arrays.asList("English","Telugu"));
				//moviesReository.findByLanguageIn(List.of("English","Telugu"));
		getMoviesByIn.stream().forEach(System.out::println);
	}
	
	//findByGenreContainingIgnoreCase
	
	public void fetchMoviesByContainingIgnore(String genre)
	{
		List<Movies> getByContainingIgnore=moviesReository.findByGenreContainingIgnoreCase(genre);
		getByContainingIgnore.stream().forEach(System.out::println);
	}
	
	//findByTitleStartingWith
	//findByTitleEndingWith
	
	public void fetchMoviesInfoByStartingWith(Character startingChar)
	{
		List<Movies> fetchByStarting=moviesReository.findByTitleStartingWith(startingChar);
		fetchByStarting.stream().forEach(System.out::println);
	}
	
	//findByRatingGreaterThan
	//findByRatingLessThan
	//findByRatingGreaterThanEqual
	//findByRatingLessThanEqual
	
	public void fetchMoviesInfoByRatingGreaterThan(double rating)
	{
		List<Movies> fetchInfoByGreaterThan=moviesReository.findByRatingGreaterThan(rating);
		fetchInfoByGreaterThan.stream().forEach(System.out::println);
	}
	
	
}
