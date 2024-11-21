/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package event.mangement.system;

/**
 *
 * @author Akila Benaragama
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class DBConnection {
    private static final String URL = "jdbc:mysql://127.0.0.1:3307/event_management";
    private static final String USER = "root";
    private static final String PASSWORD = "12345678Apb";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

class Event {
    private int eventID;
    private String name;
    private String date;
    private double payment;
    private String category;
    private String location;
    private String description;

    // Constructors, Getters, and Setters
    public Event(int eventID, String name, String date, double payment, String category, String location, String description) {
        this.eventID = eventID;
        this.name = name;
        this.date = date;
        this.payment = payment;
        this.category = category;
        this.location = location;
        this.description = description;
    }

    // Getters and Setters
    public int getEventID() {
        return eventID;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public double getPayment() {
        return payment;
    }

    public String getCategory() {
        return category;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }
}



class EventDAO {
    public void addEvent(Event event) throws SQLException {
        String sql = "INSERT INTO Event (EventID, Name, Date, Payment, Category, Location, Description) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, event.getEventID());
            stmt.setString(2, event.getName());
            stmt.setString(3, event.getDate());
            stmt.setDouble(4, event.getPayment());
            stmt.setString(5, event.getCategory());
            stmt.setString(6, event.getLocation());
            stmt.setString(7, event.getDescription());

            stmt.executeUpdate();
        }
    }

    public List<Event> getAllEvents() throws SQLException {
        List<Event> events = new ArrayList<>();
        String sql = "SELECT * FROM Event";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Event event = new Event(
                    rs.getInt("EventID"),
                    rs.getString("Name"),
                    rs.getString("Date"),
                    rs.getDouble("Payment"),
                    rs.getString("Category"),
                    rs.getString("Location"),
                    rs.getString("Description")
                );
                events.add(event);
            }
        }
        return events;
    }

    public void updateEvent(Event event) throws SQLException {
        String sql = "UPDATE Event SET Name = ?, Date = ?, Payment = ?, Category = ?, Location = ?, Description = ? WHERE EventID = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, event.getName());
            stmt.setString(2, event.getDate());
            stmt.setDouble(3, event.getPayment());
            stmt.setString(4, event.getCategory());
            stmt.setString(5, event.getLocation());
            stmt.setString(6, event.getDescription());
            stmt.setInt(7, event.getEventID());

            stmt.executeUpdate();
        }
    }

    public void deleteEvent(int eventID) throws SQLException {
        String sql = "DELETE FROM Event WHERE EventID = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, eventID);
            stmt.executeUpdate();
        }
    }
}

public class EventManagementSystem {
    private static Scanner scanner = new Scanner(System.in);
    private static EventDAO eventDAO = new EventDAO();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nEvent Management System");
            System.out.println("1. Add Event");
            System.out.println("2. View All Events");
            System.out.println("3. Update Event");
            System.out.println("4. Delete Event");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        addEvent();
                        break;
                    case 2:
                        viewAllEvents();
                        break;
                    case 3:
                        updateEvent();
                        break;
                    case 4:
                        deleteEvent();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid option, please try again.");
                }
            } catch (SQLException e) {
                System.out.println("Database error: " + e.getMessage());
            }
        }
    }

    private static void addEvent() throws SQLException {
        System.out.print("Enter Event ID: ");
        int eventID = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("Enter Payment: ");
        double payment = scanner.nextDouble();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter Category: ");
        String category = scanner.nextLine();
        System.out.print("Enter Location: ");
        String location = scanner.nextLine();
        System.out.print("Enter Description: ");
        String description = scanner.nextLine();

        Event event = new Event(eventID, name, date, payment, category, location, description);
        eventDAO.addEvent(event);
        System.out.println("Event added successfully.");
    }

    private static void viewAllEvents() throws SQLException {
        List<Event> events = eventDAO.getAllEvents();
        System.out.println("\nAll Events:");
        for (Event event : events) {
            System.out.println("ID: " + event.getEventID() + ", Name: " + event.getName() + ", Date: " + event.getDate()
                    + ", Payment: " + event.getPayment() + ", Category: " + event.getCategory()
                    + ", Location: " + event.getLocation() + ", Description: " + event.getDescription());
        }
    }

    private static void updateEvent() throws SQLException {
        System.out.print("Enter Event ID to update: ");
        int eventID = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter new Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new Date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("Enter new Payment: ");
        double payment = scanner.nextDouble();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter new Category: ");
        String category = scanner.nextLine();
        System.out.print("Enter new Location: ");
        String location = scanner.nextLine();
        System.out.print("Enter new Description: ");
        String description = scanner.nextLine();

        Event event = new Event(eventID, name, date, payment, category, location, description);
        eventDAO.updateEvent(event);
        System.out.println("Event updated successfully.");
    }

    private static void deleteEvent() throws SQLException {
        System.out.print("Enter Event ID to delete: ");
        int eventID = scanner.nextInt();

        eventDAO.deleteEvent(eventID);
        System.out.println("Event deleted successfully.");
    }
}

