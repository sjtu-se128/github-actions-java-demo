package cn.edu.sjtu.se.se128.demo;

public class Health {
    public Health(String status) {
        this.status = status;
    }

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
