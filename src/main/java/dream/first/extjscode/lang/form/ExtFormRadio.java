package dream.first.extjscode.lang.form;

import org.yelong.javascript.lang.JSMap;
import org.yelong.javascript.lang.JSString;

import dream.first.extjscode.lang.ExtStringPool;

/**
 * 单选按钮
 */
public class ExtFormRadio extends JSMap {

	public void setBoxLabel(String boxLabel) {
		addAttribute(ExtStringPool.boxLabel, new JSString(boxLabel));
	}

	public void setName(String name) {
		addAttribute(ExtStringPool.name, new JSString(name));
	}

	public void setInputValue(String inputValue) {
		addAttribute(ExtStringPool.inputValue, new JSString(inputValue));
	}

}
