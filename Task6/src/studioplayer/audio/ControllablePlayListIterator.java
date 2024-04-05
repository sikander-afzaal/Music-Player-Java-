package studioplayer.audio;

import java.util.Iterator;
import java.util.List;

public class ControllablePlayListIterator implements Iterator<AudioFile> {
	private int currentIdx = 0; // determines the current idx at which we are in the playlist
	private List<AudioFile> playList; // current playlist

	public ControllablePlayListIterator(List<AudioFile> playlist) {
		this.playList = playlist;
	}

	// return true or false if the current idx is less then the playlist length
	public boolean hasNext() {
		return getCurrentIdx() < playList.size();
	}
	//returns the next audio file in the list and also increments the current idx for future
	public AudioFile next() {
		AudioFile music = this.playList.get(getCurrentIdx());
		setCurrentIdx(getCurrentIdx() + 1);
		return music;
	}
	// setter for the current idx
	public void setCurrentIdx(int currentIdx) {
		this.currentIdx = currentIdx;
	}
//getter for the current idx
	public int getCurrentIdx() {
		return currentIdx;
	}
// this function jumps to the specified audio file and also increments the current idx so the next function in the future calls the next song 
	public AudioFile jumpToAudioFile(AudioFile file) {
		int musicToJumpToIdx = this.playList.indexOf(file); //finding the index of the audiofile providied 
		if (musicToJumpToIdx != -1) {
			this.currentIdx = musicToJumpToIdx + 1; // for the next song after this one
			return this.playList.get(musicToJumpToIdx); //returns the new song that we need
		} else {
			return null; //no song found
		}
	}
}
