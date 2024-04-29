package studiplayer.audio;

import java.util.Comparator;

public class TitleComparator implements Comparator<AudioFile> {

	public int compare(AudioFile o1, AudioFile o2) {
		int res =  o1.getTitle().compareTo(o2.getTitle()); 
		return res;
	}
}
