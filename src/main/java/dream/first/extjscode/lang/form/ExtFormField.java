package dream.first.extjscode.lang.form;

import org.yelong.javascript.lang.JSBoolean;
import org.yelong.javascript.lang.JSInteger;
import org.yelong.javascript.lang.JSMap;
import org.yelong.javascript.lang.JSString;

import dream.first.extjscode.lang.ExtStringPool;

public class ExtFormField extends JSMap {

	public void setId(String id) {
		addAttribute(ExtStringPool.id, new JSString(id));
	}

	public void setXtype(String xtype) {
		addAttribute(ExtStringPool.xtype, new JSString(xtype));
	}

	public void setName(String name) {
		addAttribute(ExtStringPool.name, new JSString(name));
	}

	public void setFieldLabel(String fieldLabel) {
		addAttribute(ExtStringPool.fieldLabel, new JSString(fieldLabel));
	}

	public void setLabelWidth(Integer labelWidth) {
		addAttribute(ExtStringPool.labelWidth, new JSInteger(labelWidth));
	}

	public void setAllowBlank(Boolean allowBlank) {
		addAttribute(ExtStringPool.allowBlank, new JSBoolean(allowBlank));
	}

	public void setEditable(Boolean editable) {
		addAttribute(ExtStringPool.labelWidth, new JSBoolean(editable));
	}

	public void setReadOnly(Boolean readOnly) {
		addAttribute(ExtStringPool.readOnly, new JSBoolean(readOnly));
	}

	public void setMaxLength(Integer maxLength) {
		addAttribute(ExtStringPool.labelWidth, new JSInteger(maxLength));
	}

}
