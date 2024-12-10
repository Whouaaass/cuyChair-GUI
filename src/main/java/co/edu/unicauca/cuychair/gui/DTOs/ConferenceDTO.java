package co.edu.unicauca.cuychair.gui.DTOs;

import java.util.Date;

public class ConferenceDTO {
    private final String title;
    private final String description;
    private final Date date;
    private final String location;
    private final String status;

    public ConferenceDTO(String title, String description, Date date, String location, String status) {
        this.title = title;
        this.date = date;
        this.location = location;
        this.status = status;
        this.description = description;
    }

    /**
     * @return String
     */
    public String getTitle() {
        return title;
    }
    
    public Date getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }
}
