package ua.org.tours.model;

import ua.org.tours.model.Entity;

import ua.org.tours.service.api.Service;

public class TouristsToGroup extends Entity<Integer>{

    private int GroupId;
    private int UserId;

    public TouristsToGroup() {
    }

    public TouristsToGroup(int groupId, int userId) {
        GroupId = groupId;
        UserId = userId;
    }

    public int getGroupId() {
        return GroupId;
    }

    public void setGroupId(int groupId) {
        GroupId = groupId;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    @Override
    public String toString() {
        return "TouristsToGroup{" +
                "GroupId=" + GroupId +
                ", UserId=" + UserId +
                '}';
    }
}
