package models.User;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.Valid;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import play.db.ebean.Model.Finder;


@Entity
public class User extends Model{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7751173686094707868L;

	@Id
	@Required
	public int id;
	
	public String firstName;
	
	public String lastName;
	
	public String address;
	
	public String email;
	
	@OneToMany
	List<Friends> friendList;
	
	public static Finder<Integer,User> find = 
			new Finder<Integer, User> (Integer.class, User.class);

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}