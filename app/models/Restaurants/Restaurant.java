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
import play.db.ebean.Model.Finder;


@Entity
public class Restaurant extends Model{
	
	/**
	 * 
	 */
	public static final long serialVersionUID = 7229576054194393462L;

	@Id
	@GeneratedValue
	public int id;
	
	@Required
	@Min(3)
	@Max(255)
	public String restaurantName;
	
	@Required
	@Email
	public String restaurantEmail;
	
	public String restaurantAddress;
	
	public String restaurantPhone;
	
	public double rating=2.5;
	
	public int ratedBy=0;
	
	@ManyToOne
	public Area restaurantArea;
	
	@ManyToOne
	public Franchise franchise;
	
	public static Finder<Integer,Restaurant> find = 
			new Finder<Integer, Restaurant> (Integer.class, Restaurant.class);
}
