package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

public class TableCellRendererHeader implements TableCellRenderer {
	public JTable jTableDatos;
	public TableCellRenderer tableHeaderDefaultCellRenderer;
	
	public TableCellRendererHeader(JTable jTableDatos,TableCellRenderer tableHeaderDefaultCellRenderer) {
		this.jTableDatos=jTableDatos;
		this.tableHeaderDefaultCellRenderer=tableHeaderDefaultCellRenderer;
	}
	
	@Override
	 public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
         
		JLabel jLabel = (JLabel) tableHeaderDefaultCellRenderer.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
         
		 jLabel.setBorder(BorderFactory.createCompoundBorder(jLabel.getBorder(), BorderFactory.createEmptyBorder(0, 5, 0, 0)));
         jLabel.setHorizontalAlignment(SwingConstants.LEFT);
         
		 Font newTableFont=new Font(jTableDatos.getFont().getName(),Font.BOLD,jTableDatos.getFont().getSize() + 1);
			
		 jLabel.setFont(newTableFont);
			
		 if (isSelected) {
             jLabel.setForeground(Color.YELLOW);
			 jLabel.setFont(newTableFont);
             //jLabel.setFont(new Font("Arial", Font.BOLD, 12));
         } else {
             //jLabel.setForeground(Color.BLACK);
             //jLabel.setFont(new Font("Arial", Font.PLAIN, 10));
         }
			
         return jLabel;
     }
}
