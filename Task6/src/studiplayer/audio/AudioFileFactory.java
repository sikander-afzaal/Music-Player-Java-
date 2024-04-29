package studiplayer.audio;


public class AudioFileFactory {

	public AudioFileFactory(String path) throws NotPlayableException {
		createAudioFile(path);
	}

	public static AudioFile createAudioFile(String path) throws NotPlayableException {
		String fileExtension = path.substring(path.lastIndexOf('.') + 1, path.length()).toLowerCase();
		switch (fileExtension) {
			case "mp3":
				return new TaggedFile(path);
			case "ogg":
				return new TaggedFile(path);
			case "wav":
				return new WavFile(path);
			default:
				throw new NotPlayableException(path, "Unknown suffix for AudioFile \"media/unknown.xyz\"");
		}

	}
}
