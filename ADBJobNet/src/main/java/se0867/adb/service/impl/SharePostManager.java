package se0867.adb.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se0867.adb.dao.ISharePostDao;
import se0867.adb.dto.FriendShipDto;
import se0867.adb.dto.PostDto;
import se0867.adb.model.SharePost;
import se0867.adb.service.ISharePostManager;

@Service
public class SharePostManager implements ISharePostManager {

	@Autowired
	private ISharePostDao dao;
	@Override
	@Transactional
	public List<PostDto> getPosts(List<FriendShipDto> friendships) {
		// TODO Auto-generated method stub
		List<SharePost> sharePosts = dao.loadSharePosts(friendships);
		if (sharePosts != null) {
			if (sharePosts.size() > 0) {
				List<PostDto> posts = new ArrayList<PostDto>();

				for (SharePost sharePost : sharePosts) {
					for (FriendShipDto friendShipDto : friendships) {
						if (sharePost.getMemberEmail().equals(friendShipDto.getFriendEmail())) {
							posts.add(new PostDto(friendShipDto.getFriendName(), sharePost));
						}
					}
					
				}
				return posts;
			}
		}
		return null;
	}

}
