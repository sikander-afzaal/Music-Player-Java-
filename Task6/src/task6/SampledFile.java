package task6;

import java.io.File;

import studiplayer.basic.BasicPlayer;

public class SampledFile extends AudioFile {
	public SampledFile() {
		super();
	}

	public SampledFile(String pathname) {
		super(pathname);
	}


	public void play() throws RuntimeException {
		File file = new File(getPathname());
		if (file.canRead()) {
			BasicPlayer.play(getPathname());
		} else {
			throw new RuntimeException("File cannot be read");
		}

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

	public String getDuration() {
		return null;
	}

}
