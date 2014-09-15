package models.User;

/**
 * Created by User on 9/6/14.
 */

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
public class User extends Model{

}