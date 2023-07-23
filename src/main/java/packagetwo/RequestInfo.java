package packagetwo;

import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class RequestInfo {

    public String getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
    }

    private String clientInfo = System.currentTimeMillis() + "";

}
