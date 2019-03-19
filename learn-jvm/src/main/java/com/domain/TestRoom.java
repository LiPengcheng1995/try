package com.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lipengcheng3 Created date 2019-03-18 16:45
 */
public class TestRoom {

    private String roomName;

    private List<TestPeriod> periods;

    public TestRoom() {
        int x = (int) (Math.random()*100);
        String temp = "xxxxxx";
        for (int i=0;i<x;i++){
            temp += "y";
        }
        roomName = temp;
        periods = new ArrayList<>();
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public List<TestPeriod> getPeriods() {
        return periods;
    }

    public void setPeriods(List<TestPeriod> periods) {
        this.periods = periods;
    }
}
