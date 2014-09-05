package models;

import java.util.Date;






import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;


import javax.persistence.OneToMany;
import javax.validation.Valid;

import play.data.format.Formats;
import play.data.validation.Constraints.MaxLength;
import play.data.validation.Constraints.MinLength;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Visitor extends Model {

	
	private static final long serialVersionUID = -4595847696005459822L;
	
	@Id
	@MaxLength(50)
	public String visitorID;
	

	@Required
	@MinLength(4)
	@MaxLength(20)
	public String password;
	
	
	@MinLength(3)
	@MaxLength(20)
	public String firstName;


	@MinLength(3)
	@MaxLength(20)
	public String lastName;


	@Formats.DateTime(pattern="dd/MM/yyyy")
	public Date dateofBirth = new Date();

	public String  gender;
	public String address;
	
	@MinLength(3)
	@MaxLength(20)
	public String occupation;
	
	
	@MinLength(3)
	@MaxLength(20)
	public String apartmentNo;
	
	
	@MinLength(3)
	@MaxLength(50)
	public String streetNo;
	
	
	@MinLength(3)
	@MaxLength(50)
	public String locality;
	
	@MinLength(3)
	@MaxLength(20)
	public String City;
	
	@MinLength(3)
	@MaxLength(20)
	public String postBoxNo;
	/*
	@Valid
	@OneToMany(fetch=FetchType.LAZY, mappedBy="visitor", cascade=CascadeType.ALL)
	public List<FeedBack> FeedBack;*/
	
	
	public static Finder<Long, Visitor> find = 
			new Finder<Long, Visitor> (Long.class, Visitor.class);

}