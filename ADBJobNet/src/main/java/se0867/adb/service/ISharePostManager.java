package se0867.adb.service;

import java.util.List;

import se0867.adb.dto.FriendShipDto;
import se0867.adb.dto.PostDto;
import se0867.adb.model.SharePost;

public interface ISharePostManager {
	
	public List<PostDto> getPosts(List<FriendShipDto> friendships);
	public boolean shareJob(SharePost post);
}
