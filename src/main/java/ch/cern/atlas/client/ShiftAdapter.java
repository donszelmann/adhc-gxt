package ch.cern.atlas.client;

import java.util.Collection;
import java.util.Map;

import ch.cern.atlas.shared.Shift;

import com.extjs.gxt.ui.client.data.ModelData;
import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.ui.Image;

public class ShiftAdapter implements ModelData {
	private ShiftType type;
	private Shift shift;
	
	public ShiftAdapter(ShiftType shiftType) {
		type = shiftType;
	}
	
	private void validate() {
		if (shift == null) {
			
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public <X> X get(String property) {
		validate();
		if (property.equals("name")) {
			return (X)("ID "+TaskInfo.getId(type));
		} else if (property.equals("type")) {
			return (X)TaskInfo.getName(type);
		} else if (property.equals("period")){
			return (X) (Random.nextBoolean() ? "7h-15h" : "15h-23h");
		} else if (property.equals("picture")) {
			Image image = new Image("https://aismedia.cern.ch/aismedia/cern.aismedia.DownloadServlet?file_id="+Random.nextInt(23020));
//			Image image = new Image("https://aismedia.cern.ch/aismedia/cern.aismedia.DownloadServlet?file_id="+Random.nextInt(23020));
			image.setHeight("60px");
			return (X)image;
		}
		return null;
	}

	@Override
	public Map<String, Object> getProperties() {
		System.err.println("getProperties");
		return null;
	}

	@Override
	public Collection<String> getPropertyNames() {
		System.err.println("getPropertyNames");
		return null;
	}

	@Override
	public <X> X remove(String property) {
		System.err.println("remove "+property);
		return null;
	}

	@Override
	public <X> X set(String property, X value) {
		System.err.println("set("+property+","+value+")");
		return null;
	}
}
