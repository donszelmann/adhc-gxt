package ch.cern.atlas.client;

import java.util.ArrayList;
import java.util.List;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.event.ColumnModelEvent;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.Grid;
import com.extjs.gxt.ui.client.widget.layout.FitLayout;
import com.google.gwt.user.client.Element;

public class ShiftGroup extends LayoutContainer {
	private ContentPanel cp;
	private Grid<Shift> grid;
	private ListStore<Shift> store;

	public ShiftGroup(ShiftType[] shiftTypes) {
		store = new ListStore<Shift>();
		for (int i = 0; i < shiftTypes.length; i++) {
			store.add(new Shift(shiftTypes[i]));
		}
	}

	@Override
	protected void onRender(Element parent, int index) {
		super.onRender(parent, index);

		setLayout(new FitLayout());

		List<ColumnConfig> configs = new ArrayList<ColumnConfig>();

		ColumnConfig column = new ColumnConfig();
		column.setId("type");
		column.setMenuDisabled(true);
		column.setSortable(false);
		column.setWidth(80);
		configs.add(column);

		column = new ColumnConfig();
		column.setId("picture");
		column.setMenuDisabled(true);
		column.setSortable(false);
		column.setWidth(40);
		column.setFixed(true);
		configs.add(column);

		column = new ColumnConfig();
		column.setId("name");
		column.setMenuDisabled(true);
		column.setSortable(false);
		column.setWidth(120);
		column.setRenderer(new LabelCellRenderer());
		configs.add(column);

		column = new ColumnConfig();
		column.setId("period");
		column.setMenuDisabled(true);
		column.setSortable(false);
		column.setWidth(60);
		configs.add(column);

		ColumnModel cm = new ColumnModel(configs);

		cp = new ContentPanel();
		cp.setBodyBorder(false);
		// cp.setIcon(Resources.ICONS.table());
		// cp.setHeading("Basic Grid");
		cp.setButtonAlign(HorizontalAlignment.CENTER);
		cp.setLayout(new FitLayout());
		cp.setAutoWidth(true);

		grid = new Grid<Shift>(store, cm);
		grid.getView().setForceFit(true);
		grid.setStyleAttribute("borderTop", "none");
		// grid.setAutoExpandColumn("name");
		// grid.setHideHeaders(true);
		grid.setBorders(true);
		grid.setStripeRows(true);
		grid.setAutoWidth(true);

		grid.addListener(Events.ViewReady, new Listener<ComponentEvent>() {
			public void handleEvent(ComponentEvent be) {
				// grid.getStore().addListener(Store.Add,
				// new Listener<StoreEvent<Plant>>() {
				// public void handleEvent(StoreEvent<Plant> be) {
				// doAutoHeight();
				// }
				// });
				doAutoHeight();
			}
		});
		grid.addListener(Events.ColumnResize, new Listener<ComponentEvent>() {
			public void handleEvent(ComponentEvent be) {
				doAutoHeight();
			}
		});
		grid.getColumnModel().addListener(Events.HiddenChange,
				new Listener<ColumnModelEvent>() {
					public void handleEvent(ColumnModelEvent be) {
						doAutoHeight();
					}
				});

		cp.add(grid);

		add(cp);
	}

	protected void doAutoHeight() {
		if (grid.isViewReady()) {
			grid.getView().getScroller().setStyleAttribute("overflowY",
					"hidden");
			cp.setHeight((grid.getView().getBody().isScrollableX() ? 19 : 0)
					+ grid.el().getFrameWidth("tb")
					+ grid.getView().getHeader().getHeight()
					+ cp.getFrameHeight()
					+ grid.getView().getBody().firstChild().getHeight());
		}
	}

}
