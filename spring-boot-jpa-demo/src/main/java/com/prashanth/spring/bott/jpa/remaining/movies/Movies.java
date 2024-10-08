package com.prashanth.spring.bott.jpa.remaining.movies;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="")
public class Movies {

	/*
	 * CREATE TABLE movies ( 
	 * movie_id serial PRIMARY KEY, 
	 * title VARCHAR(100),
	 * director VARCHAR(100),
	 *  release_year INT, 
	 *  genre VARCHAR(50),
	 *   language VARCHAR(50), 
	 * duration_minutes INT,
	 * rating DECIMAL(3, 1),
	 *  budget DECIMAL(15,2),
	 *  box_office DECIMAL(15, 2) );
	 */
	
	@Id
	private int movieId;
	
	
	private String title;
	
	@Column(name="director")
	private String directorName;
	
	private int releaseYear;
	
	private String genre;
	
	private String language;
	
	private int durationMinutes;
	
	private double rating;
	
	private double budget;
	
	private double boxOffice;

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getDurationMinutes() {
		return durationMinutes;
	}

	public void setDurationMinutes(int durationMinutes) {
		this.durationMinutes = durationMinutes;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public double getBoxOffice() {
		return boxOffice;
	}

	public void setBoxOffice(double boxOffice) {
		this.boxOffice = boxOffice;
	}

	@Override
	public String toString() {
		return "Movies [movieId=" + movieId + ", title=" + title + ", directorName=" + directorName + ", releaseYear="
				+ releaseYear + ", genre=" + genre + ", language=" + language + ", durationMinutes=" + durationMinutes
				+ ", rating=" + rating + ", budget=" + budget + ", boxOffice=" + boxOffice + "]";
	}

	
}
