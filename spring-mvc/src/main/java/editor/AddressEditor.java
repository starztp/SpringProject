package editor;

import java.beans.PropertyEditorSupport;

/**
 * 使用PropertyEditor将前端传的字符串转化为对象给后端，由于需要正则表达式，且作用有限，这里就不写了
 */
public class AddressEditor extends PropertyEditorSupport {


    public AddressEditor() {
        super();
    }

    @Override
    public String getAsText() {
        return super.getAsText();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        super.setAsText(text);
    }
}
