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
	public long id;
	
	public String name;
	
	public String email;
	
	public String userName;
	
	@OneToMany
	List<Friends> friendList;
	
	public static Finder<Long,User> find = 
			new Finder<Long, User> (Long.class, User.class);
	
}