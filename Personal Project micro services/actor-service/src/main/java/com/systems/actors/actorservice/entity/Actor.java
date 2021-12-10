package com.systems.actors.actorservice.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Actor {
	@Id
	private Long actorId;
	
	private String actorFirstName;
	private String actorLastName;
	private char gender;
	private String nationality;
	private String birthDate;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "actors_movies",joinColumns = @JoinColumn(name = "actorId", referencedColumnName = "actorId"), inverseJoinColumns = @JoinColumn(name = "movieId", referencedColumnName = "movieId"))
	@JsonIgnoreProperties(value = "listOfActors")
	List<AboutMovies> listOfMovie;
	
	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Actor(Long actorId, String actorFirstName, String actorLastName, char gender, String nationality,
			String birthDate, List<AboutMovies> listOfMovie) {
		super();
		this.actorId = actorId;
		this.actorFirstName = actorFirstName;
		this.actorLastName = actorLastName;
		this.gender = gender;
		this.nationality = nationality;
		this.birthDate = birthDate;
		this.listOfMovie = listOfMovie;
	}

	public Long getActorId() {
		return actorId;
	}

	public void setActorId(Long actorId) {
		this.actorId = actorId;
	}

	public String getActorFirstName() {
		return actorFirstName;
	}

	public void setActorFirstName(String actorFirstName) {
		this.actorFirstName = actorFirstName;
	}

	public String getActorLastName() {
		return actorLastName;
	}

	public void setActorLastName(String actorLastName) {
		this.actorLastName = actorLastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public List<AboutMovies> getListOfMovie() {
		return this.listOfMovie;
	}

	public void setListOfMovie(List<AboutMovies> listOfMovie) {
		this.listOfMovie = listOfMovie;
	}

	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", actorFirstName=" + actorFirstName + ", actorLastName=" + actorLastName
				+ ", gender=" + gender + ", nationality=" + nationality + ", birthDate=" + birthDate + ", listOfMovie="
				+ listOfMovie + "]";
	}
	
	
}
