package entity;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class InfoEntity 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    String email;

  @OneToMany(mappedBy = "infoEntity")
    private ArrayList<Phone> phones = new ArrayList();
  @ManyToOne
  private Address address;
    
    
    public InfoEntity()
    {
        
    }
    
    

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
    
    
}
