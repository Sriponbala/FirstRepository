package LiskovSubstitution;

public class FaceBook extends SocialMedia {

	public void checkWithFriend() {
		
		System.out.println("Chat via FaceBook");
	}

	public void publishPost() {
		
		System.out.println("Posted on FaceBook");
	}

	public void sendPhotosAndVideos() {
		
		System.out.println("You can send and receive photos and videos via FaceBook");
	}

	public void groupVideoCall(String...users) {
		
		System.out.println("Facebook allow group videocall ");
	}

}
