import java.util.Date;

// Cumhuriyet : The Republic.
public class Cumhuriyet {

    private String name;
    private Date dateFound;

    // Population was not known until the first census held in 1927 :13.464.564
    // for that reason, we will make this field String and mention as less than the first official count above.
    // just like this: "less than 13.464.564" ~ see Announcement.
    private String population;
    private String capital; 
    private String founderName;

    public Cumhuriyet(String name, Date dateFound, String capital, String population, String founderName) {
        this.name = name;
        this.dateFound= dateFound;
        this.population = population;
        this.capital = capital;
        this.founderName = founderName;
    }

    public Cumhuriyet(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateFound() {
        return dateFound;
    }

    public void setDateFound(Date dateFound) {
        this.dateFound = dateFound;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }


    public String getFounderName() {
        return founderName;
    }

    public void setFounderName(String founderName) {
        this.founderName = founderName;
    }

    @Override
    public String toString() {
        return "Cumhuriyet{" +
                "name='" + name + '\'' +
                ", dateFound=" + dateFound +
                ", population=" + population +
                ", capital='" + capital + '\'' +
                ", founderName='" + founderName + '\'' +
                '}';
    }
}
