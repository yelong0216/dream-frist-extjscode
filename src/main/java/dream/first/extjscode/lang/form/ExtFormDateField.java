/**
 * 
 */
package dream.first.extjscode.lang.form;

import org.yelong.javascript.lang.JSString;

import dream.first.extjscode.lang.ExtStringPool;

public class ExtFormDateField extends ExtFormField {

	private static final String XTYPE = "datefield";

	public ExtFormDateField() {
		setXtype(XTYPE);
	}

	public void setFormat(String format) {
		addAttribute(ExtStringPool.format, new JSString(format));
	}
	
}
