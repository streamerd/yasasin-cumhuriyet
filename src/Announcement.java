import java.util.Date;

public class Announcement {

    private String announcementText;
    private Founder announcedBy;

    private Date announcementDate;
    private String announcementPlace;
    private AnnouncementPrivacyLevel privacyLevel;


    public Announcement(Founder announcedBy, Date announcementDate, String announcementPlace, AnnouncementPrivacyLevel privacyLevel) {
        this.announcedBy = announcedBy;
        this.announcementDate = announcementDate;
        this.announcementPlace = announcementPlace;
        this.privacyLevel = privacyLevel;
    }

    public String getAnnouncementText() {
        return announcementText;
    }

    public void setAnnouncementText(String announcementText) {
        this.announcementText = announcementText;
    }

    public Date getAnnouncementDate() {
        return announcementDate;
    }

    public void setAnnouncementDate(Date announcementDate) {
        this.announcementDate = announcementDate;
    }

    public String getAnnouncementPlace() {
        return announcementPlace;
    }

    public void setAnnouncementPlace(String announcementPlace) {
        this.announcementPlace = announcementPlace;
    }

    public AnnouncementPrivacyLevel getPrivacyLevel() {
        return privacyLevel;
    }

    public void setPrivacyLevel(AnnouncementPrivacyLevel privacyLevel) {
        this.privacyLevel = privacyLevel;
    }

    public Founder getAnnouncedBy() {
        return announcedBy;
    }

    public void setAnnouncedBy(Founder announcedBy) {
        this.announcedBy = announcedBy;
    }
}
