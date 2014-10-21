package models.Restaurants;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import models.User.User;
import play.data.validation.Constraints.Email;
import play.data.validation.Constraints.Max;
import play.data.validation.Constraints.Min;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

@Entity
public class Franchise extends Model{

	/**
	 * 
	 */
	public static final long serialVersionUID = -7212885452005118836L;
	
	
	@Id
	@GeneratedValue
	public int id;
	
	@Required
	@Min(3)
	@Max(255)
	public String franchiseName;
	
	@Email
	public String franchiseEmail;
	
	public String franciseAddress;
	
	public String franchisePhone;
	
	@ManyToOne
	public User createdBy;
	
	public static Finder<Integer,Franchise> find = 
			new Finder<Integer, Franchise> (Integer.class, Franchise.class);
	
}
