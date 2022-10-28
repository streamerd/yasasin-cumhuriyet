import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int WAIT_BEFORE_HOORAY = 1919;
        int WAIT_AFTER_HOORAY = 1923;

        // In Atatürk's case, age it yields to : 1923 - 1881 = 42
        Founder mustafaKemalAtaturk = new Founder("Mustafa Kemal",
                "Atatürk",
                42,
                "Thessaloniki");


        Announcement secretAnnouncement = new Announcement(
                mustafaKemalAtaturk,
                new Date(1923, 10, 28),
                "Ankara/TURKEY",
                AnnouncementPrivacyLevel.SECRET);


        Announcement publicAnnouncement = new Announcement(
                mustafaKemalAtaturk,
                new Date(1923, 10, 29),
                "Ankara, Türkiye",
                AnnouncementPrivacyLevel.PUBLIC);

        addAnnouncements(mustafaKemalAtaturk, secretAnnouncement, publicAnnouncement);

        printAnnouncement(secretAnnouncement);

        // Here, let the founder and the founding people sleep off to the next day. The big day, 29th of October.
        try {
            Thread.sleep(9595); // sleep 1919 * 5 = 9595 msec
            System.out.println("------------------------------------------------------------------");
            System.out.println(" -------- The next day .. ----------------------------------------\n");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        printAnnouncement(publicAnnouncement);

        System.out.println("------------------------------------------------------------------");

        // spoiler time!
        Cumhuriyet turkiyeCumhuriyeti = new Cumhuriyet("Türkiye Cumhuriyeti",
                publicAnnouncement.getAnnouncementDate(),
                publicAnnouncement.getAnnouncementPlace(),
                "less than 13.464.564",
                mustafaKemalAtaturk.getName() + " " + mustafaKemalAtaturk.getSurname()
        );

        try {
            Thread.sleep(WAIT_BEFORE_HOORAY);
            System.out.println("Yaşasın Türkiye Cumhuriyeti!");
            System.out.println("------------------------------------------------------------------");

            Thread.sleep(WAIT_AFTER_HOORAY);

            System.out.println("------------------------------------------------------------------");
            System.out.println(turkiyeCumhuriyeti.toString());              //  print Cumhuriyet Details. (no population)
            System.out.println(" \n---------------------------------------------------------------");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void addAnnouncements(Founder mustafaKemalAtaturk, Announcement secretAnnouncement, Announcement publicAnnouncement) {
        List<Announcement> announcements = new ArrayList<>();
        announcements.add(secretAnnouncement);
        announcements.add(publicAnnouncement);
        mustafaKemalAtaturk.setAnnouncements(announcements);
    }


    private static void printAnnouncement(Announcement announcement) {

        switch (announcement.getPrivacyLevel()) {
            case SECRET:
                announcement.setAnnouncementText("Efendiler, yarın Cumhuriyet'i ilan edeceğiz.");
                break;
            case PUBLIC:
                announcement.setAnnouncementText("Türkiye Devleti'nin hükümet şekli cumhuriyettir.");
                break;
        }

        System.out.println(
                announcement.getAnnouncedBy().getName() + ": " +
                        announcement.getAnnouncementText() + "\n -- " +
                        announcement.getAnnouncementPlace() + ", " +
                        announcement.getAnnouncementDate()
        );
    }

}
