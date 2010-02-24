package ch.cern.atlas.client;

import ch.cern.atlas.shared.ShiftCollection;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ShiftServiceAsync {

	void getShifts(int task, long time, AsyncCallback<ShiftCollection> callback);
}
