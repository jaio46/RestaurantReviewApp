package models.Feeds;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import models.Foods.FoodItem;
import models.User.User;
import play.db.ebean.Model;
import play.db.ebean.Model.Finder;


@Entity
public class FeedOnFoodItem extends Model{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4714899329228683095L;
	
	@Id
	@GeneratedValue
	public int id;
	

	@ManyToOne
	public User feeder;
	
	@ManyToOne
	public FoodItem item;
	
	public double rating;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getFeeder() {
		return feeder;
	}

	public void setFeeder(User feeder) {
		this.feeder = feeder;
	}

	public FoodItem getItem() {
		return item;
	}

	public void setItem(FoodItem item) {
		this.item = item;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public static Finder<Long,FeedOnFoodItem> find = 
			new Finder<Long, FeedOnFoodItem> (Long.class, FeedOnFoodItem.class);
}