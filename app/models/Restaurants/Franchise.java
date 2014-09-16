package models.Restaurants;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import play.data.validation.Constraints.Email;
import play.data.validation.Constraints.Max;
import play.data.validation.Constraints.Min;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Franchise extends Model{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7212885452005118836L;
	
	
	@Id
	@GeneratedValue
	private int id;
	
	@Required
	@Min(3)
	@Max(255)
	private String franchiseName;
	
	@Email
	private String franchiseEmail;
	
	private String franciseAddress;
	
	private String franchisePhone;
	
	

	public String getFranchiseName() {
		return franchiseName;
	}

	public void setFranchiseName(String franchiseName) {
		this.franchiseName = franchiseName;
	}

	public String getFranchiseEmail() {
		return franchiseEmail;
	}

	public void setFranchiseEmail(String franchiseEmail) {
		this.franchiseEmail = franchiseEmail;
	}

	public String getFranciseAddress() {
		return franciseAddress;
	}

	public void setFranciseAddress(String franciseAddress) {
		this.franciseAddress = franciseAddress;
	}

	public String getFranchisePhone() {
		return franchisePhone;
	}

	public void setFranchisePhone(String franchisePhone) {
		this.franchisePhone = franchisePhone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
