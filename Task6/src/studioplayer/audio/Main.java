package studioplayer.audio;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) throws NotPlayableException {
		
		 TaggedFile tf1 = new TaggedFile("audiofiles/Rock 812.mp3");
	        TaggedFile tf2 = new TaggedFile("audiofiles/Motiv 5. Symphonie von Beethoven.ogg");
	        List<AudioFile> list = Arrays.asList(
	                tf1,
	                tf2);
	        list.sort(new AuthorComparator());
	        	System.out.println(tf2.getAuthor());

		
		
	}
}