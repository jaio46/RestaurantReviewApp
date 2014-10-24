package models.Foods;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import models.Restaurants.Restaurant;
import play.data.validation.Constraints.Max;
import play.data.validation.Constraints.Min;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

@Entity
public class FoodItem extends Model{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3480368042551614105L;
	
	@Id
	@GeneratedValue
	public int id;
	
	@Required
	@Min(5)
	@Max(100)
	public String itemName;
	
	@Required
	@Min(3)
	@Max(80)
	public String itemCategory;
	
	@ManyToOne
	public Restaurant restaurant;
	
	public double rating=2;
	
	public int ratedBy=0;
	

	public static Finder<Integer,FoodItem> find = 
			new Finder<Integer, FoodItem> (Integer.class, FoodItem.class);
	
}
