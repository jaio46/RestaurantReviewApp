package models.Foods;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import play.data.validation.Constraints.Max;
import play.data.validation.Constraints.Min;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class FoodItem extends Model{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3480368042551614105L;
	
	@Id
	@GeneratedValue
	private int id;
	
	@Required
	@Min(5)
	@Max(100)
	private String itemName;
	
	@Required
	@Min(3)
	@Max(30)
	private String itemCategory;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

}
