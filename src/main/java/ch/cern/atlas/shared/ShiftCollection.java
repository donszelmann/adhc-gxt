package ch.cern.atlas.shared;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ShiftCollection implements Serializable {

	private Shift previous;
	private Shift now;
	private Shift next;
	private Shift later;
	
	public ShiftCollection(Shift previous, Shift now, Shift next, Shift later) {
		this.previous = previous;
		this.now = now;
		this.next = next;
		this.later = later;
	}

	public Shift getPrevious() {
		return previous;
	}

	public Shift getNow() {
		return now;
	}

	public Shift getNext() {
		return next;
	}

	public Shift getLater() {
		return later;
	}	
}
