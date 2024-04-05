package studioplayer.audio;

import java.util.Comparator;

public class TitleComparator implements Comparator<AudioFile> {

	public int compare(AudioFile o1, AudioFile o2) {
		int i = 0;
		while (o1.getTitle().charAt(i) == o2.getTitle().charAt(i)) {
			i++;
		}
		
		char o1TitleFirstChar = o1.getTitle().charAt(i);
		char o2TitleFirstChar = o2.getTitle().charAt(i);
		if(o1TitleFirstChar > o2TitleFirstChar) {
			return 1;
		}else return -1; 
		
	}
}
