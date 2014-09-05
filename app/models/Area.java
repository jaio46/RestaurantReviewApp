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
public class Area extends Model {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7085738699443721389L;

	@Id
	@GeneratedValue
	public Long id;
	
	@Required
	public String areaName;
	
	@Valid
	@OneToMany(fetch=FetchType.LAZY, mappedBy="area", cascade=CascadeType.ALL)
	public List<Restaurant> Restaurants;
	
	public static Finder<Long, Area> find = 
			new Finder<Long, Area> (Long.class, Area.class);
}