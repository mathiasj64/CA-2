package entity;

//@author Mathias
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
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
