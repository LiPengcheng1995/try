package com.domain;

import java.util.List;

/**
 * 模仿价格日历
 * @author lipengcheng3 Created date 2019-03-18 16:44
 */
public class TestCalender {

    private String title;

    private String description;

    private List<TestRoom> roomList;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<TestRoom> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<TestRoom> roomList) {
        this.roomList = roomList;
    }
}
