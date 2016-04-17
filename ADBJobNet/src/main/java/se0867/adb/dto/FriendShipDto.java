package se0867.adb.dto;

public class FriendShipDto {

	private String friendName;
	private String friendEmail;
	
	public FriendShipDto() {
		// TODO Auto-generated constructor stub
	}

	public FriendShipDto(String friendName, String friendEmail) {
		super();
		this.friendName = friendName;
		this.friendEmail = friendEmail;
	}

	public String getFriendName() {
		return friendName;
	}

	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}

	public String getFriendEmail() {
		return friendEmail;
	}

	public void setFriendEmail(String friendEmail) {
		this.friendEmail = friendEmail;
	}
	
	
}
