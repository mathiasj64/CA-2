package entity;

//@author Mathias
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CityInfo
{


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;

  int zipCode;
  String city;

  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public int getZipCode()
  {
    return zipCode;
  }

  public void setZipCode(int zipCode)
  {
    this.zipCode = zipCode;
  }

  public String getCity()
  {
    return city;
  }

  public void setCity(String city)
  {
    this.city = city;
  }

  public ArrayList<Address> getAddresses()
  {
    return addresses;
  }

  public void setAddresses(ArrayList<Address> addresses)
  {
    this.addresses = addresses;
  }

  
  @OneToMany(mappedBy = "cityInfo")
  private ArrayList<Address> addresses = new ArrayList();
  
  
  
  
  
  public CityInfo()
  {

  }
}
