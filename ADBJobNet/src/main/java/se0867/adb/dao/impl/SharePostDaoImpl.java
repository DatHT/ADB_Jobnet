package se0867.adb.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import se0867.adb.dao.ISharePostDao;
import se0867.adb.dto.FriendShipDto;
import se0867.adb.model.SharePost;

@Repository
public class SharePostDaoImpl implements ISharePostDao {

	@Autowired
	private SessionFactory factory;
	
	protected Session getSession() {
		return factory.getCurrentSession();
	}
	@Override
	public List<SharePost> loadSharePosts(List<FriendShipDto> friendships) {
		// TODO Auto-generated method stub
		List<SharePost> sharePosts = new ArrayList<SharePost>();
		for (FriendShipDto friendShipDto : friendships) {
			String sql = "select e from SharePost e where e.memberEmail = :email";
			Query query = getSession().createQuery(sql);
			query.setParameter("email", friendShipDto.getFriendEmail());
			sharePosts.addAll(query.list());
		}
		if (sharePosts.size() > 0) {
			return sharePosts;
		}else
			return null;
	}
	@Override
	public boolean shareJob(SharePost post) {
		// TODO Auto-generated method stub
		return (getSession().save(post) != null) ? true : false;
	}

}
