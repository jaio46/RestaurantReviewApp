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


@Entity
public class FeedOnRestaurant extends Model{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7530508214504820936L;
	
	@Id
	@GeneratedValue
	int id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	User feeder;
	
	double rating;
	
	@ManyToOne(fetch=FetchType.LAZY)
	Restaurant restaurnat;

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

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Restaurant getRestaurnat() {
		return restaurnat;
	}

	public void setRestaurnat(Restaurant restaurnat) {
		this.restaurnat = restaurnat;
	}
	
	
}
