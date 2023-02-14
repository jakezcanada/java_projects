package LinkedListChallenge;

public class Song {
	private String songTitle;
	private String duration;
	public Song(String songTitle, String duration){
		this.duration = duration;
		this.songTitle = songTitle;
	}
	public String getSongTitle() {
		return songTitle;
	}
	public String getDuration() {
		return duration;
	}
	
}
