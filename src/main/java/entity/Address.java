package entity;

//@author Mathias

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Address {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;
  
  String street;
  String additionalInfo;
  @ManyToOne
  private CityInfo cityInfo;

  @OneToMany(mappedBy = "address")
  ArrayList<InfoEntity> infoEntities = new ArrayList();
  
  
  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public String getStreet()
  {
    return street;
  }

  public void setStreet(String street)
  {
    this.street = street;
  }

  public String getAdditionalInfo()
  {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo)
  {
    this.additionalInfo = additionalInfo;
  }

  public CityInfo getCityInfo()
  {
    return cityInfo;
  }

  public void setCityInfo(CityInfo cityInfo)
  {
    this.cityInfo = cityInfo;
  }
  
  
  
  
  public Address()
  {
    
  }
}
