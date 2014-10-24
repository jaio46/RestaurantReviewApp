package models.Feeds;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import models.Restaurants.Restaurant;
import models.User.User;
import play.db.ebean.Model;
import play.db.ebean.Model.Finder;


@Entity
public class FeedOnRestaurant extends Model{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7530508214504820936L;
	
	@Id
	@GeneratedValue
	public int id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	public User feeder;
	
	public double rating;
	
	@ManyToOne(fetch=FetchType.LAZY)
	public Restaurant restaurnat;
	

	public static Finder<Long,FeedOnRestaurant> find = 
			new Finder<Long, FeedOnRestaurant> (Long.class, FeedOnRestaurant.class);
	
	
}
