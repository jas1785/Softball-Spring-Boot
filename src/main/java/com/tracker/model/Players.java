package com.tracker.model;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Players {
	
	  @Id
	  public ObjectId _id;

	  public int number;
	  public String firstName;
	  public String lastName;
	  public List<Game> games;
	
	  
	public ObjectId get_id() {
		return _id;
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<Game> getGames() {
		return games;
	}
	public void setGames(List<Game> games) {
		this.games = games;
	}
	
	/**
	 * Gets the _id of the object and returns the hex string value.
	 * This value will be used to find players by there object id
	 * @return
	 */
	public String getObjectIdHexString() {  
		return this._id.toHexString();
	}
	@Override
	public String toString() {
		return "Players [_id=" + _id + ", number=" + number + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", games=" + games + ", getObjectIdHexString()=" + getObjectIdHexString() + "]";
	}
	
}
