package models.Restaurants;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import models.RestaurantArea.Area;
import play.data.validation.Constraints.Email;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;


@Entity
public class Restaurant extends Model{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7229576054194393462L;

	@Id
	@GeneratedValue
	private int id;
	
	@Required
	@Min(3)
	@Max(255)
	private String restaurantName;
	
	@Required
	@Email
	private String restaurantEmail;
	
	private String restaurantAddress;
	
	private String restaurantPhone;
	
	private double rating;
	
	@Required
	@ManyToOne
	private Area restaurantArea;
	
	@ManyToOne
	private Franchise franchise;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getRestaurantEmail() {
		return restaurantEmail;
	}

	public void setRestaurantEmail(String restaurantEmail) {
		this.restaurantEmail = restaurantEmail;
	}

	public String getRestaurantAddress() {
		return restaurantAddress;
	}

	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}

	public String getRestaurantPhone() {
		return restaurantPhone;
	}

	public void setRestaurantPhone(String restaurantPhone) {
		this.restaurantPhone = restaurantPhone;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Area getRestaurantArea() {
		return restaurantArea;
	}

	public void setRestaurantArea(Area restaurantArea) {
		this.restaurantArea = restaurantArea;
	}

	public Franchise getFranchise() {
		return franchise;
	}

	public void setFranchise(Franchise franchise) {
		this.franchise = franchise;
	}
	
}
