package dream.first.extjscode.lang.form;

import org.apache.commons.lang3.ArrayUtils;
import org.yelong.javascript.lang.JSList;

import dream.first.extjscode.lang.ExtStringPool;

public class ExtFormRadioGroup extends ExtFormField {

	private static final String XTYPE = "radiogroup";

	public ExtFormRadioGroup() {
		setXtype(XTYPE);
	}

	@SuppressWarnings("unchecked")
	public void addRadios(ExtFormRadio... extFormRadios) {
		if (ArrayUtils.isEmpty(extFormRadios)) {
			return;
		}
		JSList<ExtFormRadio> items = (JSList<ExtFormRadio>) getAttribute(ExtStringPool.items);
		if (null == items) {
			items = new JSList<>();
			addAttribute(ExtStringPool.items, items);
		}
		for (ExtFormRadio extFormRadio : extFormRadios) {
			items.add(extFormRadio);
		}
	}

}
