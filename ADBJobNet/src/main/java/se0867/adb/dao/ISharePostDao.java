package se0867.adb.dao;

import java.util.List;

import se0867.adb.dto.FriendShipDto;
import se0867.adb.model.SharePost;

public interface ISharePostDao {

	public List<SharePost> loadSharePosts(List<FriendShipDto> friendships);
	public boolean shareJob(SharePost post);
}
