/**
 * 
 */
package ru.ifmo.rain.astrans.interpreter.backtrans;

import org.antlr.stringtemplate.AttributeRenderer;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

/*package*/ class TemplateAttributeRenderer implements AttributeRenderer {
	private final StringTemplateGroup group;
	private final String templateName;

	TemplateAttributeRenderer(StringTemplateGroup group, String templateName) {
		this.group = group;
		this.templateName = templateName;
	}

	public String toString(Object o) {
		final StringTemplate template = group.getInstanceOf(templateName);
		template.setAttribute("it", o);
		setAdditionalAttributes(o, template);
		return template.toString();
	}
	
	protected void setAdditionalAttributes(Object o, StringTemplate template) {
		
	}
}