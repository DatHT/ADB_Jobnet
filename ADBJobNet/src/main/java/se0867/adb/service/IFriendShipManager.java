package se0867.adb.service;

import java.util.List;

import se0867.adb.dto.FriendShipDto;
import se0867.adb.model.FriendShip;

public interface IFriendShipManager {

	public List<FriendShipDto> loadFriends(String email);
}
