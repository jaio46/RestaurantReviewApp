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
public class FoodItem extends Model {


	/**
	 * 
	 */
	private static final long serialVersionUID = 8613068748267441112L;

	@Id 
	@GeneratedValue
	public long id;
	
	@Required
	@Min(5)
	@Max(60)
	public String category;
	
	@Required
	@Min(5)
	@Max(60)
	public String itemTitle;
	
	
	@Valid
	@OneToMany(fetch=FetchType.LAZY, mappedBy="foodItem", cascade=CascadeType.ALL)
	public List<RestaurantFood> RestaurantsFood;
	
	public static Finder<Long,FoodItem> find = 
			new Finder<Long, FoodItem> (Long.class, FoodItem.class);
	
	public FoodItem(String Title,String category){
		this.category=category;
		this.itemTitle=Title;
	}
}