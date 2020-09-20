package dream.first.extjscode.lang.grid;

import org.yelong.javascript.lang.JSBoolean;
import org.yelong.javascript.lang.JSInteger;
import org.yelong.javascript.lang.JSMap;
import org.yelong.javascript.lang.JSString;

import dream.first.extjscode.lang.ExtStringPool;

public class GridColumn extends JSMap {

	private int order;

	public void setSortable(boolean sortable) {
		addAttribute(ExtStringPool.sortable, new JSBoolean(sortable));
	}

	public void setDataIndex(String dataIndex) {
		addAttribute(ExtStringPool.dataIndex, new JSString(dataIndex));
	}

	public void setHeader(String header) {
		addAttribute(ExtStringPool.header, new JSString(header));
	}

	public void setText(String text) {
		addAttribute(ExtStringPool.text, new JSString(text));
	}

	public void setHidden(boolean hidden) {
		addAttribute(ExtStringPool.hidden, new JSBoolean(hidden));
	}

	public void setWidth(int width) {
		addAttribute(ExtStringPool.width, new JSInteger(width));
	}

	public JSInteger getWidth() {
		return (JSInteger) getAttribute(ExtStringPool.width);
	}

	public void setAlign(String align) {
		addAttribute(ExtStringPool.align, new JSString(align));
	}

	public JSString getAlign() {
		return (JSString) getAttribute(ExtStringPool.align);
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

}
