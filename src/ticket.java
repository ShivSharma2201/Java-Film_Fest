import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ticket {
    String cname;
    String cdetails;
    String mname;
    String dname;
    String runt;
    String tdate;
    String ttime;
    String entryP = "\n-> You must be fully vaccinated \n-> Mandatatory temperature checks at the location \n-> Social Distancing and Masks required";
    String tlocation;
    String tlink;
    String tscreent;
    String ctime;
    int otp;
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date dt = new Date();

    public ticket(customer a, movie b) {
        this.mname = b.title;
        this.dname = b.director;
        this.runt = b.runtime;
        this.tdate = b.date;
        this.ttime = b.time;
        this.tlink = b.link;
        this.tlocation = b.loc;
        this.cname = a.name;
        this.tscreent = b.screentype;
        this.cdetails = a.emailid;
        this.ctime = "Date and Time of purchase : " + dateFormat.format(dt);
    }

    public String gettname() {
        return mname;

    }

    public String getcname() {
        return cname;

    }

    public String gettim() {
        return ctime;
    }

    public String getentryP() {
        return entryP;
    }

    public String getdir() {
        return dname;
    }

    public String getrunt() {
        return runt;
    }

    public String getloc() {
        return tlocation;
    }

    public String getdate() {
        return tdate;
    }

    public String gettime() {
        return ttime;
    }

    public String getent() {
        return entryP;
    }

    public String toString() {
        return "Name : " + this.cname + " -- Title : " + this.mname + " -- Date : " + this.tdate + " -- Time : "
                + this.ttime + " -- Screening Type : " + this.tscreent;

    }
}
