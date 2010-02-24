package ch.cern.atlas.client;

import ch.cern.atlas.shared.ShiftCollection;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("shiftService")
public interface ShiftService extends RemoteService {
	ShiftCollection getShifts(int task, long time);
}
