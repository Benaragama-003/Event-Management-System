create database event_management;
use event_management ;
-- Creating the Event table
CREATE TABLE Event (
    EventID INT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    Date DATE,
    Payment DECIMAL(10, 2),
    Category VARCHAR(50),
    Location VARCHAR(100),
    Description TEXT
);

-- Creating the Admin table
CREATE TABLE Admin (
    AdminID INT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    Email VARCHAR(100) UNIQUE,
    ContactNo VARCHAR(20)
);

-- Creating the Organizers table
CREATE TABLE Organizers (
    OrgID INT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    Email VARCHAR(100) UNIQUE,
    ContactNo VARCHAR(20),
    Password VARCHAR(50)
);

-- Creating the Users table
CREATE TABLE Users (
    UID INT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    Email VARCHAR(100) UNIQUE,
    Password VARCHAR(50)
);

-- Creating the Tickets table
CREATE TABLE Tickets (
    TicketID INT PRIMARY KEY,
    Price DECIMAL(10, 2),
    SeatNo INT
);

-- Creating the UserTickets table to link Users with Tickets
CREATE TABLE UserTickets (
    UID INT,
    TicketID INT,
    PRIMARY KEY (UID, TicketID),
    FOREIGN KEY (UID) REFERENCES Users(UID) ON DELETE CASCADE,
    FOREIGN KEY (TicketID) REFERENCES Tickets(TicketID) ON DELETE CASCADE
);

-- Creating the EventOrganizers table to link Events with Organizers
CREATE TABLE EventOrganizers (
    OrgID INT,
    EventID INT,
    PRIMARY KEY (OrgID, EventID),
    FOREIGN KEY (OrgID) REFERENCES Organizers(OrgID) ON DELETE CASCADE,
    FOREIGN KEY (EventID) REFERENCES Event(EventID) ON DELETE CASCADE
);

-- Creating the EventAdmin table to link Events with Admins
CREATE TABLE EventAdmin (
    AdminID INT,
    EventID INT,
    PRIMARY KEY (AdminID, EventID),
    FOREIGN KEY (AdminID) REFERENCES Admin(AdminID) ON DELETE CASCADE,
    FOREIGN KEY (EventID) REFERENCES Event(EventID) ON DELETE CASCADE
);
