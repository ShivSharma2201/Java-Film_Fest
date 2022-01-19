
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("*******************************************************************");
        System.out.println("*******************************************************************");
        System.out.println("Welcome to Annual GBC Film Festival");
        System.out.println("*******************************************************************");
        System.out.println("*******************************************************************");

        // Pre Populating the customers
        customer[] cs = new customer[6];
        cs[0] = new customer("Jack Grealish", "jackg@gmail.com", "Jack@123");
        cs[1] = new customer("Raheem Sterling", "raheems@gmail.com", "Raheem@123");
        cs[2] = new customer("John Stones", "johns@gmail.com", "John@123");
        cs[3] = new customer("Phil Foden", "philf@gmail.com", "Phil@123");
        cs[4] = new customer("Kyle Walker", "kylew@gmail.com", "Kyle@123");
        cs[5] = new customer("SS", "s", "s");

        ArrayList<movie> M = new ArrayList<movie>(); // To store the movies
        String[] moviee = new String[4];
        String[] des = new String[4]; // To store movie description
        String[] days = new String[4]; // To store number of days
        String[] timei = new String[3]; // To store timings of the show
        String location = "Film and Video Production room 160 Kendal Ave, Toronto, ON M5R 1M3, Canada "; // To store the
                                                                                                         // location of
                                                                                                         // the
                                                                                                         // screening
                                                                                                         // location

        // Initializing with the data
        moviee[0] = "Dune";
        moviee[1] = "Batman";
        moviee[2] = "Eternal";
        moviee[3] = "No Time To Die";
        des[0] = "Paul Atreides, a brilliant and gifted young man born into a great destiny beyond his understanding, must travel to the most dangerous planet in the universe to ensure the future ";
        des[1] = "The Riddler plays a deadly game of cat and mouse with Batman and Commissioner Gordon in Gotham City.";
        des[2] = "The Eternals, a race of immortal beings with superhuman powers who have secretly lived on Earth for thousands of years, reunite to battle the evil Deviants.";
        des[3] = "Recruited to rescue a kidnapped scientist, globe-trotting spy James Bond finds himself hot on the trail of a mysterious villain, who's armed with a dangerous new technology.";
        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednesday";
        days[3] = "Thursday";
        timei[0] = "Morning";
        timei[1] = "Afternoon";
        timei[2] = "Evening";

        // Initializing objects of movie
        M.add(new movie(moviee[0], "Denis Villeneuve", des[0], "Action", "2h 25 min", "In Person", 0, days[0], timei[0],
                "", location));
        M.add(new movie(moviee[0], "Denis Villeneuve", des[0], "Action", "2h 25 min", "In Person", 15, days[1],
                timei[0], "", location));
        M.add(new movie(moviee[0], "Denis Villeneuve", des[0], "Action", "2h 25 min", "In Person", 15, days[2],
                timei[0], "", location));
        M.add(new movie(moviee[0], "Denis Villeneuve", des[0], "Action", "2h 25 min", "In Person", 15, days[3],
                timei[0], "", location));

        M.add(new movie(moviee[1], "Matt Reeves", des[1], "Adventure", "3h 05 min", "In Person", 15, days[0], timei[1],
                "", location));
        M.add(new movie(moviee[1], "Matt Reeves", des[1], "Adventure", "3h 05 min", "In Person", 15, days[1], timei[1],
                "", location));
        M.add(new movie(moviee[1], "Matt Reeves", des[1], "Adventure", "3h 05 min", "In Person", 15, days[2], timei[1],
                "", location));
        M.add(new movie(moviee[1], "Matt Reeves", des[1], "Adventure", "3h 05 min", "In Person", 15, days[3], timei[1],
                "", location));

        M.add(new movie(moviee[2], "Chloé Zhao", des[2], "Action", "2h 15 min", "In Person", 15, days[0], timei[2], "",
                location));
        M.add(new movie(moviee[2], "Chloé Zhao", des[2], "Action", "2h 15 min", "In Person", 15, days[1], timei[2], "",
                location));
        M.add(new movie(moviee[2], "Chloé Zhao", des[2], "Action", "2h 15 min", "In Person", 15, days[2], timei[2], "",
                location));
        M.add(new movie(moviee[2], "Chloé Zhao", des[2], "Action", "2h 15 min", "In Person", 15, days[3], timei[2], "",
                location));

        M.add(new movie(moviee[3], "Xavier", des[3], "Drama", "3h 15 min", "Online", 15, "", "", "", ""));

        ArrayList<ticket> T = new ArrayList<ticket>();

        String pg; // used to control login loop
        String m;
        int y = 0;

        // Login do while loop
        do {
            int t = 0, user = 0, menu = 0, check = 0;

            // Credentials check and Login

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter L/l to login      Enter Q/q to quit) ");
            pg = sc.nextLine();

            if (pg.equals("L") || pg.equals("l")) {
                System.out.println(" Enter your Login credentials");
                System.out.println("--> Email Address : ");
                String email = sc.nextLine();
                System.out.println("--> Password : ");
                String pass = sc.next();

                for (int i = 0; i < cs.length; i++) {
                    if (email.equals(cs[i].emailR()) && pass.equals(cs[i].passR())) {
                        System.out.println("--> Hello! " + cs[i].nameR() + " you are successfully logged in!");
                        t = 1;
                        user = i;
                    }
                }
                if (t == 0) {
                    System.out.println("--> Invalid credentials entered, Try again!");
                    menu = 1;
                }
                // Menu do while loop
                while (menu == 0) {
                    // Menu
                    System.out
                            .println("******************************************************************************");
                    System.out
                            .println("----------------------------------MENU----------------------------------------");
                    System.out.println("Enter 1 to view the movies to be screened");
                    System.out.println("Enter 2 to view the schedule for in person screening");
                    System.out.println("Enter 3 to book tickets for the in person screening");
                    System.out.println("Enter 4 to book tickets for the online screening");
                    System.out.println("Enter 5 to view the purchase history");
                    System.out.println("Enter 6 to logout");
                    System.out
                            .println("-------------------------------------------------------------------------------");

                    System.out
                            .println("******************************************************************************");

                    String input = sc.next();

                    switch (input) {
                        case "1":
                            System.out.println(
                                    "******************************************************************************");
                            System.out.println("1. List of movies to be screened:");
                            System.out.println("(Movie --> Screening Type)");
                            System.out.println(
                                    "******************************************************************************");
                            for (int i = 0; i < moviee.length; i++) {
                                System.out.print(moviee[i]);
                                for (int j = 0; j < M.size(); j++) {
                                    if (moviee[i].equals(M.get(j).titleR())) {
                                        System.out.println(" --> " + M.get(j).screent() + " ");
                                        break;
                                    }
                                }
                            }
                            System.out.println("");
                            System.out.println("Please enter any key to go back to the main menu :");
                            m = sc.next();
                            System.out.println("");
                            break;
                        case "2":
                            System.out.println(
                                    "******************************************************************************");
                            System.out.println("2. Schedule for the in person screening:");
                            System.out.println("(Movie --> Day --> Timing)");
                            System.out.println(
                                    "******************************************************************************");
                            for (int i = 0; i < M.size(); i++) {
                                if (M.get(i).screent().equals("In Person")) {
                                    System.out.println(M.get(i).titleR() + " --> " + M.get(i).screend() + " --> "
                                            + M.get(i).screendt());
                                }
                            }
                            System.out.println("");
                            System.out.println("Please enter any key to go back to the main menu :");
                            m = sc.next();
                            System.out.println("");
                            break;

                        case "3":

                            System.out.println(
                                    "******************************************************************************");
                            System.out.println(
                                    "3. Enter the movie which you wish to watch : (Please enter the exact full name)");
                            System.out.println(
                                    "******************************************************************************");
                            for (int i = 0; i < moviee.length; i++) {
                                System.out.println("--> " + moviee[i]);
                            }
                            String movii = sc.next();
                            check = 0;
                            for (int i = 0; i < moviee.length; i++) {
                                if (movii.equals(moviee[i])) {
                                    check = 1;
                                }
                            }
                            if (check == 0) {
                                System.out.println("Invalid movie entered!");
                                System.out.println("");
                                System.out.println("Please enter any key to go back to the main menu :");
                                m = sc.next();
                                System.out.println("");
                                break;
                            }

                            System.out.println(
                                    "******************************************************************************");
                            System.out.println("Available Showtime :");
                            System.out.println("Day - Time - Tickets(Available)");
                            System.out.println(
                                    "******************************************************************************");
                            int x = 0;
                            for (int i = 0; i < M.size(); i++) {
                                if (movii.equals(M.get(i).titleR())) {
                                    if ((M.get(i).screent().equals("In Person")) && (M.get(i).cap > 0))

                                        System.out.println("--> " + M.get(i).showTime());

                                }
                            }

                            System.out.println("Enter the day for which you wish to buy the ticket :");
                            String dayy = sc.next();
                            check = 0;
                            for (int i = 0; i < days.length; i++) {
                                if ((dayy.equals(days[i]))) {
                                    check = 1;
                                }
                            }
                            if (check == 0) {
                                System.out.println("Invalid day entered!");
                                System.out.println("");
                                System.out.println("Please enter any key to go back to the main menu :");
                                m = sc.next();
                                System.out.println("");
                                break;
                            }
                            for (int i = 0; i < M.size(); i++) {
                                if ((M.get(i).titleR().equals(movii)) && (M.get(i).screend().equals(dayy))) {
                                    x = i;
                                }
                            }

                            System.out.println(
                                    "Enter Y/y to book the tickets for " + movii + " on " + dayy + " else Enter N/n");
                            String tick = sc.next();
                            if (tick.equals("Y") || tick.equals("y")) {
                                ticket t1 = new ticket(cs[user], M.get(x));
                                T.add(t1);
                                M.get(x).booked();
                                showTick(t1);
                            }
                            System.out.println("");
                            System.out.println("Please enter any key to go back to the main menu :");
                            m = sc.next();
                            System.out.println("");

                            break;
                        case "4":
                            break;
                        case "5":
                            System.out.println(
                                    "******************************************************************************");
                            System.out.println("Your Previous Ticket : ");
                            System.out.println(
                                    "******************************************************************************");

                            check = 0;
                            for (int i = 0; i < T.size(); i++) {
                                if ((T.get(i).cname.equals(cs[user].name))) {
                                    System.out.println("--> " + T.get(i));
                                    check = 1;
                                }
                            }
                            if (check == 0) {
                                System.out.println("No tickets booked yet!");
                            }
                            System.out.println("");
                            System.out.println("Please enter any key to go back to the main menu :");
                            m = sc.next();
                            System.out.println("");
                            break;
                        case "6":
                            menu = 1;
                            break;
                        default:
                            System.out.println("Wrong option Entered");
                            System.out.println("");
                            System.out.println("Please enter any key to go back to the main menu :");
                            m = sc.next();
                            System.out.println("");

                    }
                }
            }
            if (pg.equals("Q") || pg.equals("q")) {
                System.exit(0);
            } else if (pg.equals("J") || pg.equals("j")) {

            } else
                System.out.println("Wrong Option Entered!");
        } while (y >= 0);
    }

    public static void showTick(ticket tt) {
        System.out.println("Ticket Booked!");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^TICKET^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("");
        System.out.println(tt.gettim());
        System.out.println("");
        System.out.println("Movie : " + tt.gettname() + "  ||  Director : " + tt.getdir() + "  ||  Running Time : "
                + tt.getrunt());
        System.out.println("Date : " + tt.getdate() + "  ||  Time : " + tt.gettime());
        System.out.println("");
        System.out.println("Location : " + tt.getloc());
        System.out.println("");
        System.out.println("ENTRY POLICY : " + tt.getent());
        System.out.println("");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
}
