import java.util.ArrayList;
import java.util.List;

public class Founder {

    private String name;
    private String surname;
    private int ageå;
    private String birthPlace;
    private List<Announcement> announcements;

    public Founder(String name, String surname, int age, String birthPlace) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.birthPlace = birthPlace;
        this.announcements = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public List<Announcement> getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(List<Announcement> announcements) {
        this.announcements = announcements;
    }
}
