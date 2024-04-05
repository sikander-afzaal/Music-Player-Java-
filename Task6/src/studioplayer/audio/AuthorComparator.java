package studioplayer.audio;

import java.util.Comparator;

public class AuthorComparator implements Comparator<AudioFile> {

	public int compare(AudioFile o1, AudioFile o2) {
		int i = 0;
		if(o1.getAuthor().isEmpty()) {
			return -1;
		}else if (o2.getAuthor().isEmpty()) {
			return 1;
		}
		while (o1.getAuthor().charAt(i) == o2.getAuthor().charAt(i)) {
			i++;
		}
		
		char o1TitleFirstChar = o1.getAuthor().charAt(i);
		char o2TitleFirstChar = o2.getAuthor().charAt(i);
		if(o1TitleFirstChar > o2TitleFirstChar) {
			return 1;
		}else return -1;
	}

}
