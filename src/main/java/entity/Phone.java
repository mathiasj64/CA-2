package entity;

//@author Mathias
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Phone
{
  
  public Phone()
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

  public long getNumber()
  {
    return number;
  }

  public void setNumber(long number)
  {
    this.number = number;
  }

  public String getDescription()
  {
    return description;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }
  

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;

  long number;
  String description;
  
}
