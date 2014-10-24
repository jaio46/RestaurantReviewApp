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
	
	public static Finder<Long,FeedOnFoodItem> find = 
			new Finder<Long, FeedOnFoodItem> (Long.class, FeedOnFoodItem.class);
}