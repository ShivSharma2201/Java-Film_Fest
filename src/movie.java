public class movie {
    String title;
    String director;
    String description;
    String genre;
    String runtime;
    String screentype;
    int cap;
    String date;
    String time;
    String link;
    String loc;

    public movie() {

    }

    public movie(String title, String director, String description, String genre, String runtime, String screentype,
            int cap, String date, String time, String link, String loc) {
        this.title = title;
        this.director = director;
        this.description = description;
        this.genre = genre;
        this.runtime = runtime;
        this.screentype = screentype;
        this.cap = cap;
        this.date = date;
        this.time = time;
        this.link = link;
        this.loc = loc;
    }

    public String titleR() {
        return title;
    }

    public String screent() {
        return screentype;
    }

    public String screend() {
        return date;
    }

    public String screendt() {
        return time;
    }

    public int getcap() {
        return cap;
    }

    public void booked() {
        --cap;

    }

    public String showTime() {
        return this.date + " - " + this.time + " - " + this.cap;
    }
}
