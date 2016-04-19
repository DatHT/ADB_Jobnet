package se0867.adb.dao;

import java.util.List;

import se0867.adb.model.FriendShip;

public interface IFriendShipDao {

	List<FriendShip> getFriends(String userEmail);
}
