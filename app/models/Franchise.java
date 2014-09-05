package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.Valid;

import play.data.validation.Constraints.Max;
import play.data.validation.Constraints.Min;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

@Entity
public class Franchise extends Model {

	private static final long serialVersionUID = -8057709955601867766L;

	@Id
	@GeneratedValue
	public Long id;
	
	@Required
	public String franchiseTitle;
	
	@Required
	@Min(5)
	@Max(60)
	public String email;
	
	@Required
	@Min(6)
	@Max(20)
	public String phone;
	
	@Required
	@Max(100)
	public String address;
	
	@Valid
	@OneToMany(fetch=FetchType.LAZY, mappedBy="franchise", cascade=CascadeType.ALL)
	public List<Restaurant> Restaurants;
	
	public static Finder<Long, Franchise> find = 
			new Finder<Long, Franchise> (Long.class, Franchise.class);
	
	public Franchise(String Name, String Email,String Phone
			,String Address) {
			this.franchiseTitle = Name;
			this.email = Email;
			this.phone =  Phone;
			this.address = Address;
	}
}