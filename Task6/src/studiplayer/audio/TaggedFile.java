package studiplayer.audio;

import java.io.File;
import java.util.Map;

import studiplayer.basic.TagReader;

public class TaggedFile extends SampledFile {
	protected String album;

	public TaggedFile() {
		super();
	}

	public TaggedFile(String pathname) throws NotPlayableException {
		super(pathname);
		File file = new File(getPathname());
		if (!file.canRead()) {
			throw new NotPlayableException(pathname, "File cannot be read, path might be wrong");
		}else {
		readAndStoreTags();
		}
	}

	// getter for the albums
	public String getAlbum() {
		return album == null ? "" : album.trim();
	}

	// this functions reads and stores the tags in a key value pair and then
	// extracts the four attributes we need
	public void readAndStoreTags() throws NotPlayableException {
		try {
			TagReader.readTags(getPathname());
		} catch (Exception e) {
			throw new NotPlayableException(getPathname(), "Tags not found");
		}
		Map<String, Object> tagMap = TagReader.readTags(getPathname());
		if(tagMap.containsKey("title")) {
			this.title =(String)  tagMap.get("title");
		}
		if(tagMap.containsKey("author")) {
			this.author=(String)  tagMap.get("author");
		}
		if(tagMap.containsKey("album")) {
			this.album=(String)  tagMap.get("album");
		}
		if(tagMap.containsKey("duration")) {
			this.duration=(long)  tagMap.get("duration");
		}
	

	}

	// it converts the object to a string format --> author - title - album -
	// duration
	public String toString() {
		String finalResult = "";
		if (getAlbum().isEmpty()) {
			if (getAuthor().isEmpty()) {
				finalResult = getTitle();
			} else {
				finalResult = getAuthor() + " - " + getTitle();
			}
		} else {
			if (getAuthor().isEmpty()) {
				finalResult = getTitle() + " - " + getAlbum();
			} else {
				finalResult = getAuthor() + " - " + getTitle() + " - " + getAlbum();
			}

		}
		finalResult = finalResult + " - " + formatDuration();
		return finalResult;
	}
}
