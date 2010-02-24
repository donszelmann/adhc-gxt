package ch.cern.atlas.server;

import ch.cern.atlas.client.ShiftService;
import ch.cern.atlas.shared.Shift;
import ch.cern.atlas.shared.ShiftCollection;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@SuppressWarnings("serial")
public class ShiftServiceImpl extends RemoteServiceServlet implements
		ShiftService {

	@Override
	public ShiftCollection getShifts(int task, long time) {
		Shift s0 = new Shift("Niels Donszelmann", "http://www.gravatar.com/avatar/53c6df1621270eb6cd6fde2b62cdef93.png", 2300, 700);
		Shift s1 = new Shift("Mark Donszelmann", "http://www.gravatar.com/avatar/53c6df1621270eb6cd6fde2b62cdef93.png", 700, 1500);
		Shift s2 = new Shift("Tulay Donszelmann", "http://www.gravatar.com/avatar/53c6df1621270eb6cd6fde2b62cdef93.png", 1500, 2300);
		Shift s3 = new Shift("Belis Donszelmann", "http://www.gravatar.com/avatar/53c6df1621270eb6cd6fde2b62cdef93.png", 2300, 700);
		return new ShiftCollection(s0, s1, s2, s3);
	}

}
