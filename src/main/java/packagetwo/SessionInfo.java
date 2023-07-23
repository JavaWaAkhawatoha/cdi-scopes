package packagetwo;

import jakarta.enterprise.context.SessionScoped;

import java.io.Serializable;

@SessionScoped
public class SessionInfo implements Serializable {

    public String getSessionDetails() {
        return sessionDetails;
    }

    public void setSessionDetails(String sessionDetails) {
        this.sessionDetails = sessionDetails;
    }

    private String sessionDetails = "Created At " + System.currentTimeMillis();
}
