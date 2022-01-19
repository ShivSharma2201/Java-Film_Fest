public class customer {
    String name;
    String emailid;
    String passw;

    public customer(String n, String e, String p) {
        name = n;
        emailid = e;
        passw = p;
    }

    public String nameR() {
        return name;
    }

    public String emailR() {
        return emailid;
    }

    public String passR() {
        return passw;
    }

}
