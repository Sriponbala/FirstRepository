package LiskovSubstitution;

public class Whatsapp implements SocialMediaInterface, VideoCallManager {

	public void groupVideoCall(String...users) {
		
		System.out.println("Whatsapp allow group videocall ");
	}

	public void checkWithFriend() {
		
		System.out.println("Chat via Whatsapp");
	}

	public void sendPhotosAndVideos() {
		
		System.out.println("You can send and receive photos and videos via Whatsapp");
	}
	
}
