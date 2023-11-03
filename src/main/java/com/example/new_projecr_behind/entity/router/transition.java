package com.example.new_projecr_behind.entity.router;

public class transition {
    private String name;
    private String enterTransition;
    private String leaveTransition;

    public transition() {
    }

    public transition(String name, String enterTransition, String leaveTransition) {
        this.name = name;
        this.enterTransition = enterTransition;
        this.leaveTransition = leaveTransition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnterTransition() {
        return enterTransition;
    }

    public void setEnterTransition(String enterTransition) {
        this.enterTransition = enterTransition;
    }

    public String getLeaveTransition() {
        return leaveTransition;
    }

    public void setLeaveTransition(String leaveTransition) {
        this.leaveTransition = leaveTransition;
    }

    @Override
    public String toString() {
        return "transition{" +
                "name='" + name + '\'' +
                ", enterTransition='" + enterTransition + '\'' +
                ", leaveTransition='" + leaveTransition + '\'' +
                '}';
    }
}
