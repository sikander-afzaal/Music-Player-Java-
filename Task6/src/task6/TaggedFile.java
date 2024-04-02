package task6;

import java.util.Map;

import studiplayer.basic.TagReader;

public class TaggedFile extends SampledFile {
	public String album;
	public TaggedFile() {
		super();
	}
	public TaggedFile(String pathname) {
		super(pathname);
		readAndStoreTags();
	}
	public String getAlbum() {return album;}
	public void readAndStoreTags() {
		Map<String, Object> tagMap = TagReader.readTags(getPathname());
		for (String tag : tagMap.keySet()) {
			Object value = tagMap.get(tag);
			switch (tag){
			case "title":
				this.title = (String) value;
				break;
			case "album":
				this.album = (String) value;
				break;
			case "author":
				this.author = (String) value;
				break;
			case "duration":
				this.duration = (long) value;
				break;
			}
			
				
			 
			 }
		 
	}
	public String toString() {return null;}
}
