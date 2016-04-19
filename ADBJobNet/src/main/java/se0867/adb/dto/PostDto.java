package se0867.adb.dto;

import se0867.adb.model.SharePost;

public class PostDto {
	
	private String personName;
	private SharePost post;
	
	public PostDto() {
		// TODO Auto-generated constructor stub
	}

	public PostDto(String personName, SharePost post) {
		super();
		this.personName = personName;
		this.post = post;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public SharePost getPost() {
		return post;
	}

	public void setPost(SharePost post) {
		this.post = post;
	}

	
}
