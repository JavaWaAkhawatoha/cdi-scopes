package packagetwo;

import jakarta.enterprise.context.ApplicationScoped;

import java.io.Serializable;

@ApplicationScoped
public class Account implements Serializable {
    private String appName = "My Application 1";

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
}
