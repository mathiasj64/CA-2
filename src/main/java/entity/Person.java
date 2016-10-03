package entity;

//@author Mathias
import javax.persistence.Entity;

@Entity
public class Person extends InfoEntity
{
    String firstName;
    String lastName;

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
