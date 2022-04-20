package LiskovSubstitution;

public class Instagram implements SocialMediaInterface, PostMediaManager {

	public void publishPost() {
		
		System.out.println("Posted on Instagram");
	}

	public void checkWithFriend() {
		
		System.out.println("Chat via Instagram");
	}

	public void sendPhotosAndVideos() {
		
		System.out.println("You can send and receive photos and videos via Instagram");
	}
	
}
