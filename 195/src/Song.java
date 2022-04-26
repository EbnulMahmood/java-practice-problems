
public class Song {
	
	public String singer;
	public double duration;
	public String lyrics;
	
	public Song(String singer, double duration, String lyrics) {
		this.singer = singer;
		this.duration = duration;
		this.lyrics = lyrics;
	}
	
	public void getInfo() {
		System.out.println("Song{singerName=" + singer + " duration=" + duration);
	}
	
	public String toString() {
		return lyrics;
	}
}
