package se0867.adb.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se0867.adb.dao.IFriendShipDao;
import se0867.adb.dto.FriendShipDto;
import se0867.adb.model.FriendShip;
import se0867.adb.service.IFriendShipManager;

@Service
public class FriendShipManager implements IFriendShipManager {

	@Autowired
	private IFriendShipDao friendshipDao;
	@Override
	@Transactional
	public List<FriendShipDto> loadFriends(String email) {
		List<FriendShip> friendShips = friendshipDao.getFriends(email);
		if (friendShips != null) {
			if (friendShips.size() > 0) {
				List<FriendShipDto> dtos = new ArrayList<FriendShipDto>();
				for (FriendShip friendShip : friendShips) {
					if (!friendShip.getMemberEmail1().equals(email)) {
						dtos.add(new FriendShipDto(friendShip.getMemberName1(), friendShip.getMemberEmail1()));
					}else {
						dtos.add(new FriendShipDto(friendShip.getMemberName2(), friendShip.getMemberEmail2()));
					}
				}
				return dtos;
			}
		}
		return null;
	}

}
