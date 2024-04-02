package task6;

import java.io.File;

import studiplayer.basic.BasicPlayer;

public class SampledFile extends AudioFile {
	
	public long duration;
	public SampledFile() {
		super();
	}

	public SampledFile(String pathname) throws RuntimeException {
		super(pathname);
		File file = new File(getPathname());
		if(!file.canRead()) {
			throw new RuntimeException("File cannot be read, path might be wrong");
		}
	}


	public void play() throws RuntimeException {
			BasicPlayer.play(getPathname());
	}


	public void togglePause() {
		BasicPlayer.togglePause();

	}


	public void stop() {
		BasicPlayer.stop();

	}


	public String formatDuration() {

		return null;
	}


	public String formatPosition() {

		return null;
	}

	public static String timeFormatter(long timeInMicroSeconds) {
		return null;
	}

	public long getDuration() {
		return duration;
	}

}
