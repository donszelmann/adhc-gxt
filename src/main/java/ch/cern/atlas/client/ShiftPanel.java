package ch.cern.atlas.client;

import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.Widget;

public class ShiftPanel extends FlexTable {
	public ShiftPanel() {
		setWidget(0, 1, new ShiftGroup(
				new ShiftType[] { ShiftType.SHIFT_LEADER }));
		setWidget(1, 0, new ShiftGroup(new ShiftType[] { ShiftType.TRIGGER,
				ShiftType.LEVEL_1, ShiftType.DAQ_HLT }));
		setWidget(1, 1, new ShiftGroup(new ShiftType[] { ShiftType.RUN_CONTROL,
				ShiftType.SLIMOS, ShiftType.OPM, ShiftType.RPE, ShiftType.RPA,
				ShiftType.DCS, ShiftType.APPL, ShiftType.APP }));
		setWidget(1, 2, new ShiftGroup(new ShiftType[] { ShiftType.PIXEL,
				ShiftType.SCT, ShiftType.TRT }));
		setWidget(2, 0, new ShiftGroup(new ShiftType[] { ShiftType.MU_MDT,
				ShiftType.MU_RPC, ShiftType.MU_TGC }));
		setWidget(2, 1, new ShiftGroup(new ShiftType[] { ShiftType.DQ,
				ShiftType.TILE }));
		setWidget(2, 2, new ShiftGroup(new ShiftType[] { ShiftType.LAR_EXP,
				ShiftType.LAR, ShiftType.LUMI }));
		setWidget(3, 1, new ShiftGroup(new ShiftType[] { ShiftType.TIER_0,
				ShiftType.ADC }));
		setWidth("100%");
	}
	
	@Override
	public void setWidget(int row, int col, Widget widget) {
		super.setWidget(row, col, widget);
		getCellFormatter().setVerticalAlignment(row, col, HasVerticalAlignment.ALIGN_TOP);
	}
}
