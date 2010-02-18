package ch.cern.atlas.client;

import java.util.HashMap;

public class TaskInfo {
	private static HashMap<ShiftType, TaskInfo> tasks;

	static {
		tasks = new HashMap<ShiftType, TaskInfo>();
		tasks.put(ShiftType.ADC, new TaskInfo("ADC", 529053));
		tasks.put(ShiftType.APP, new TaskInfo("ATLAS patrol-patrollers", 529169));
		tasks.put(ShiftType.APPL, new TaskInfo("ATLAS patrol-patrol leader", 529202));
		tasks.put(ShiftType.DAQ_HLT, new TaskInfo("DAQ/HLT", 129));
		tasks.put(ShiftType.DCS, new TaskInfo("DCS", 39067));
		tasks.put(ShiftType.DQ, new TaskInfo("DataQual.", 95));
		tasks.put(ShiftType.IDGEN, new TaskInfo("IDGen", 131));
		tasks.put(ShiftType.LAR, new TaskInfo("LAr", 529009));
		tasks.put(ShiftType.LAR_EXP, new TaskInfo("LAr exp", 529008));
		tasks.put(ShiftType.LEVEL_1, new TaskInfo("Level-1", 130));
		tasks.put(ShiftType.LUMI, new TaskInfo("Beam/Lumi", 65775));	
		tasks.put(ShiftType.MU_MDT, new TaskInfo("Mu-MDT", 134));
		tasks.put(ShiftType.MU_RPC, new TaskInfo("Mu-RPC", 332));
		tasks.put(ShiftType.MU_TGC, new TaskInfo("Mu-TGC", 358));
		tasks.put(ShiftType.OPM, new TaskInfo("OPM (165422)", 30809));
		tasks.put(ShiftType.PIXEL, new TaskInfo("Pixel", 242));
		tasks.put(ShiftType.RPA, new TaskInfo("RPA", 348287));
		tasks.put(ShiftType.RPE, new TaskInfo("RPE (161870)", 348276));
		tasks.put(ShiftType.RUN_CONTROL, new TaskInfo("Run Control", 10213));
		tasks.put(ShiftType.SCT, new TaskInfo("SCT", 264));
		tasks.put(ShiftType.SHIFT_LEADER, new TaskInfo("Shift Leader", 125));
		tasks.put(ShiftType.SLIMOS, new TaskInfo("SLIMOS/DSS", 127));
		tasks.put(ShiftType.TIER_0, new TaskInfo("Tier-0", 592162));
		tasks.put(ShiftType.TILE, new TaskInfo("Tile", 133));
		tasks.put(ShiftType.TRIGGER, new TaskInfo("Trigger", 529128));
		tasks.put(ShiftType.TRT, new TaskInfo("TRT", 529150));
	}
	
	private String name;
	private int id;
	
	public TaskInfo(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	private int getId() {
		return id;
	}
		
	public static String getName(ShiftType type) {
		return tasks.get(type).getName();
	}

	public static int getId(ShiftType type) {
		return tasks.get(type).getId();
	}
}
