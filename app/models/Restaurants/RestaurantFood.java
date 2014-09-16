package models.Restaurants;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import models.Foods.FoodItem;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class RestaurantFood extends Model{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4280297106981168916L;
	@Id
	@Required
	@GeneratedValue
	private int id;
	

	@Required
	@ManyToOne(fetch=FetchType.LAZY)
	private Restaurant restaurant;
	
	@Required
	@ManyToOne(fetch=FetchType.LAZY)
	private FoodItem food;
	
	private String fileLink;
	
	private double rating=2.5;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public FoodItem getFood() {
		return food;
	}

	public void setFood(FoodItem food) {
		this.food = food;
	}

	public String getFileLink() {
		return fileLink;
	}

	public void setFileLink(String fileLink) {
		this.fileLink = fileLink;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
	
	
}
