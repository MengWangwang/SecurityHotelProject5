package com.security.hotel4.service;

import com.security.hotel4.model.Room;

import java.util.List;

public interface RoomService {

    public List<Room> getRoom(String roomId, String roomType, String status);
    public int addRoom(Room room);
    public Room getOneRoom(String roomId);
    public int updateRoomById(Room room);
    public int deleteRoomById(String roomId);
    public int OpenRoom(String[] PreIds, String status);
}
