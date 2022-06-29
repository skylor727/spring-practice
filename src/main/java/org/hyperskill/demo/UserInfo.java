package org.hyperskill.demo;

public class UserInfo {
    private int id;
    private String name;
    private String phone;
    private boolean enabled;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    UserInfo() {

    }

}

