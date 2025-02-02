package com.codecool.Models;

public class Mentor extends User {

    private int moduleId;

    public Mentor(int id, String firstName, String lastName, String email, String phoneNumber, String adress, int moduleId) {
        super(id, firstName, lastName, email, phoneNumber, adress);
        this.moduleId = moduleId;
    }

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }
}
