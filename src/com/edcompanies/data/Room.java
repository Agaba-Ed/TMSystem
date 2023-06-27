/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edcompanies.data;

import java.io.*;

/**
 *
 * @author Ed
 */
public class Room implements Serializable {
    private int idRoom;
    private String roomName;
    private String roomCode;
    private int Building_idBuilding;

    public int getIdRoom() {
        return idRoom;
    }

    public  void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public  String getRoomName() {
        return roomName;
    }

    public  void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public  String getRoomCode() {
        return roomCode;
    }

    public  void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public  int getBuilding_idBuilding() {
        return Building_idBuilding;
    }

    public  void setBuilding_idBuilding(int Building_idBuilding) {
        this.Building_idBuilding = Building_idBuilding;
    }
    
    
}
