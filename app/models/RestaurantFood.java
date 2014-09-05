package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.Valid;

import play.data.validation.Constraints.Max;
import play.data.validation.Constraints.Min;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class RestaurantFood extends Model {

	private static final long serialVersionUID = -888907934350076591L;

	@Id 
	@GeneratedValue
	public long id;
	
	@Required
	public int price;
	
	@Required
	public Double rating;
	
	@Required
	@Min(5)
	@Max(1000)
	public String details;
	
	
	@Valid
	@ManyToOne(fetch=FetchType.LAZY)
	public Restaurant restaurant;
	
	@Valid
	@ManyToOne(fetch=FetchType.LAZY)
	public FoodItem foodItem;
	
	public static Finder<Long, RestaurantFood> find = 
			new Finder<Long, RestaurantFood> (Long.class, RestaurantFood.class);
	
	public RestaurantFood(int Price, String Details, FoodItem fd, Restaurant res){
		price=Price;
		details=Details;
		foodItem=fd;
		restaurant=res;
	}
}