package org.example.model;

public class Booking {
    private String email;
    private String country;
    private String password;
    private String dailyBudget;
    private Boolean newsletter;
    private RoomType roomType;
    private String roomDescription;

    public Booking(String email, String country, String password, String dailyBudget, Boolean newsletter,
                   RoomType roomType, String roomDescription) {
        this.email = email;
        this.country = country;
        this.password = password;
        this.dailyBudget = dailyBudget;
        this.newsletter = newsletter;
        this.roomType = roomType;
        this.roomDescription = roomDescription;
    }

    // getters and setters...
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDailyBudget() {
        return dailyBudget;
    }

    public void setDailyBudget(String dailyBudget) {
        this.dailyBudget = dailyBudget;
    }

    public Boolean getNewsletter() {
        return newsletter;
    }

    public void setNewsletter(Boolean newsletter) {
        this.newsletter = newsletter;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", password='" + password + '\'' +
                ", dailyBudget='" + dailyBudget + '\'' +
                ", newsletter=" + newsletter +
                ", roomType=" + roomType +
                ", roomDescription='" + roomDescription + '\'' +
                '}';
    }
}
