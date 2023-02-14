package LinkedListChallenge;

import java.util.List;

public class Album {
	private List<Song> songs;
	public Album(List<Song> songs){
		this.songs = songs;
	}
	public List<Song> getSongs() {
		return songs;
	}
	public void addSong(String songTitle, String duration){
		this.songs.add(new Song(songTitle,duration));
	}
}
