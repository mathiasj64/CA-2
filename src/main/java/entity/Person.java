package entity;

//@author Mathias
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "person")

@NamedQueries(
        {
//          @NamedQuery(name = "person.findAll", query = "SELECT p FROM person p"),
//          @NamedQuery(name = "person.findById", query = "SELECT p FROM person p WHERE p.id = :id"),
        })

public class Person extends InfoEntity
{

  String firstName;
  String lastName;
  @ManyToMany(mappedBy = "persons")
  private List<Hobby> hobbies;

  public Person()
  {

  }

  public String getFirstName()
  {
    return firstName;
  }

  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }

}
