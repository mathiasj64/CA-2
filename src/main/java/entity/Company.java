package entity;

import javax.persistence.Entity;

@Entity
public class Company extends Person
{
    String name;
    String description;
    int cvr;
    int NumEmployees;
    int marketValue;
    
    public Company()
    {
        
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getCvr()
    {
        return cvr;
    }

    public void setCvr(int cvr)
    {
        this.cvr = cvr;
    }

    public int getNumEmployees()
    {
        return NumEmployees;
    }

    public void setNumEmployees(int NumEmployees)
    {
        this.NumEmployees = NumEmployees;
    }

    public int getMarketValue()
    {
        return marketValue;
    }

    public void setMarketValue(int marketValue)
    {
        this.marketValue = marketValue;
    }
    
    
}
