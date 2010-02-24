package ch.cern.atlas.shared;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Shift implements Serializable {
	private String name;
	private String pictureURL;
	private int startTime;
	private int endTime;
	
	public Shift(String name, String pictureURL, int startTime, int endTime) {
		this.name = name;
		this.pictureURL = pictureURL;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public String getName() {
		return name;
	}

	public String getPictureURL() {
		return pictureURL;
	}

	public int getStartTime() {
		return startTime;
	}

	public int getEndTime() {
		return endTime;
	}
}
