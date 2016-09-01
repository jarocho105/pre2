package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

@SuppressWarnings({ "rawtypes"})
public class ComboBoxRender  extends JLabel	implements ListCellRenderer {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public ComboBoxRender() {
		setOpaque(true);
		setHorizontalAlignment(CENTER);
		setVerticalAlignment(CENTER);
	}
	
	
	public Component getListCellRendererComponent(
	                JList list,
	                Object value,
	                int index,
	                boolean isSelected,
	                boolean cellHasFocus) {
	//Get the selected index. (The index param isn't
	//always valid, so just use the value.)
	//int selectedIndex = ((Integer)value).intValue();
	
	
		this.setBackground(Color.YELLOW);
		this.setForeground(Color.BLACK);
	
	
		
	
	return this;
	}
}    	
