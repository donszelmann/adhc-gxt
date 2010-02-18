package ch.cern.atlas.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Application implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		Widget main = new ShiftGroup(new ShiftType[] { ShiftType.RUN_CONTROL,
				ShiftType.SLIMOS, ShiftType.OPM, ShiftType.RPE, ShiftType.RPA,
				ShiftType.DCS, ShiftType.APPL, ShiftType.APP });
		RootPanel.get().add(main);
	}
}
