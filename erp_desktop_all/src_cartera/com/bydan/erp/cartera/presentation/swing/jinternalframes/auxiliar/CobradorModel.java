/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

//import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.cartera.util.CobradorConstantesFunciones;
import com.bydan.erp.cartera.util.CobradorParameterReturnGeneral;
//import com.bydan.erp.cartera.util.CobradorParameterGeneral;

import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.CobradorBeanSwingJInternalFrame;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;








import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.CobradorJInternalFrame;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.CobradorDetalleFormJInternalFrame;

import java.util.EventObject;
import java.util.EventListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;









@SuppressWarnings("unused")

public class CobradorModel extends FocusTraversalPolicy implements TableModel, Serializable {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,CobradorConstantesFunciones.LABEL_ID
										,CobradorConstantesFunciones.LABEL_IDTIPOIDENTIFICACION
										,CobradorConstantesFunciones.LABEL_IDENTIFICACION
										,CobradorConstantesFunciones.LABEL_APELLIDO
										,CobradorConstantesFunciones.LABEL_NOMBRE
										,CobradorConstantesFunciones.LABEL_DIRECCION
										,CobradorConstantesFunciones.LABEL_TELEFONO
										};
	   
	    public List<Cobrador> cobradors;
	  	 
	    //NO SE UTILIZA
	    public CobradorModel(List<Cobrador> cobradors,JInternalFrameBase jInternalFrameBase) {
	    	this.cobradors=cobradors;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public CobradorModel(JInternalFrameBase jInternalFrameBase) {
	    	this.cobradors=new ArrayList<Cobrador>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.cobradors.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.cobradors.get(rowIndex).getIsSelected();
	            
				case 1: return this.cobradors.get(rowIndex).getId();
				case 2: return this.cobradors.get(rowIndex).getid_tipo_identificacion();
				case 3: return this.cobradors.get(rowIndex).getidentificacion();
				case 4: return this.cobradors.get(rowIndex).getapellido();
				case 5: return this.cobradors.get(rowIndex).getnombre();
				case 6: return this.cobradors.get(rowIndex).getdireccion();
				case 7: return this.cobradors.get(rowIndex).gettelefono();	            
	            default: return null;
	        }
	    }
	 
	    @Override
	    public Class<?> getColumnClass(int columnIndex) {
	    	switch (columnIndex) {
				case 0: return Boolean.class;
	            
				case 1: return Long.class;
				case 2: return Long.class;
				case 3: return String.class;
				case 4: return String.class;
				case 5: return String.class;
				case 6: return String.class;
				case 7: return String.class;	            
	            default: return String.class;
	        }	    		        
	    }
	 
	    @Override
	    public boolean isCellEditable(int rowIndex, int columnIndex) {
	    	switch (columnIndex) {
				case 0: return true;
            	
				case 1: return true;
				case 2: return true;
				case 3: return true;
				case 4: return true;
				case 5: return true;
				case 6: return true;
				case 7: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	Cobrador cobrador = this.cobradors.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			CobradorBeanSwingJInternalFrame cobradorBeanSwingJInternalFrame=(CobradorBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {cobrador.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {cobrador.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {cobrador.setid_tipo_identificacion((Long) value);cobrador.settipoidentificacion_descripcion(cobradorBeanSwingJInternalFrame.getActualTipoIdentificacionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {cobrador.setidentificacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {cobrador.setapellido((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {cobrador.setnombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {cobrador.setdireccion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {cobrador.settelefono((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private CobradorDetalleFormJInternalFrame cobradorJInternalFrame=null;
		
		public CobradorModel(CobradorDetalleFormJInternalFrame cobradorJInternalFrame) {
			this.cobradorJInternalFrame=cobradorJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.cobradorJInternalFrame.getjButtonActualizarToolBarCobrador();
			
			if(component!=null && component.equals(this.cobradorJInternalFrame.getjButtonActualizarToolBarCobrador())) {
				componentTab=this.cobradorJInternalFrame.getjButtonEliminarToolBarCobrador();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cobradorJInternalFrame.getjButtonEliminarToolBarCobrador())) {
				componentTab=this.cobradorJInternalFrame.getjButtonCancelarToolBarCobrador();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cobradorJInternalFrame.getjButtonCancelarToolBarCobrador())) {
				componentTab=this.cobradorJInternalFrame.jComboBoxid_tipo_identificacionCobrador;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.cobradorJInternalFrame.jTextFieldtelefonoCobrador)) {
				componentTab=this.cobradorJInternalFrame.jComboBoxTiposAccionesFormularioCobrador;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cobradorJInternalFrame.jComboBoxTiposAccionesFormularioCobrador)) {
				componentTab=this.cobradorJInternalFrame.jButtonEliminarCobrador;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cobradorJInternalFrame.jButtonEliminarCobrador)) {
				componentTab=this.cobradorJInternalFrame.jButtonActualizarCobrador;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cobradorJInternalFrame.jButtonActualizarCobrador)) {
				componentTab=this.cobradorJInternalFrame.jButtonCancelarCobrador;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.cobradorJInternalFrame.jComboBoxid_tipo_identificacionCobrador)) {
			componentTab=this.cobradorJInternalFrame.jTextFieldidentificacionCobrador;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobradorJInternalFrame.jTextFieldidentificacionCobrador)) {
			componentTab=this.cobradorJInternalFrame.jTextFieldapellidoCobrador;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobradorJInternalFrame.jTextFieldapellidoCobrador)) {
			componentTab=this.cobradorJInternalFrame.jTextFieldnombreCobrador;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobradorJInternalFrame.jTextFieldnombreCobrador)) {
			componentTab=this.cobradorJInternalFrame.jTextAreadireccionCobrador;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobradorJInternalFrame.jTextAreadireccionCobrador)) {
			componentTab=this.cobradorJInternalFrame.jTextFieldtelefonoCobrador;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.cobradorJInternalFrame.getjButtonActualizarToolBarCobrador();
			
			if(component!=null && component.equals(this.cobradorJInternalFrame.getjButtonEliminarToolBarCobrador())) {
				componentTab=this.cobradorJInternalFrame.getjButtonActualizarToolBarCobrador();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cobradorJInternalFrame.getjButtonCancelarToolBarCobrador())) {
				componentTab=this.cobradorJInternalFrame.getjButtonEliminarToolBarCobrador();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.cobradorJInternalFrame.jComboBoxid_tipo_identificacionCobrador)) {
				
				componentTab=this.cobradorJInternalFrame.getjButtonCancelarToolBarCobrador();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.cobradorJInternalFrame.jComboBoxTiposAccionesFormularioCobrador)) {
				componentTab=this.cobradorJInternalFrame.jTextFieldtelefonoCobrador;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.cobradorJInternalFrame.jButtonEliminarCobrador)) {
				componentTab=this.cobradorJInternalFrame.jComboBoxTiposAccionesFormularioCobrador;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cobradorJInternalFrame.jButtonActualizarCobrador)) {
				componentTab=this.cobradorJInternalFrame.jButtonEliminarCobrador;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cobradorJInternalFrame.jButtonCancelarCobrador)) {
				componentTab=this.cobradorJInternalFrame.jButtonActualizarCobrador;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.cobradorJInternalFrame.jTextFieldidentificacionCobrador)) {
			componentTab=this.cobradorJInternalFrame.jComboBoxid_tipo_identificacionCobrador;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobradorJInternalFrame.jTextFieldapellidoCobrador)) {
			componentTab=this.cobradorJInternalFrame.jTextFieldidentificacionCobrador;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobradorJInternalFrame.jTextFieldnombreCobrador)) {
			componentTab=this.cobradorJInternalFrame.jTextFieldapellidoCobrador;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobradorJInternalFrame.jTextAreadireccionCobrador)) {
			componentTab=this.cobradorJInternalFrame.jTextFieldnombreCobrador;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobradorJInternalFrame.jTextFieldtelefonoCobrador)) {
			componentTab=this.cobradorJInternalFrame.jTextAreadireccionCobrador;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.cobradorJInternalFrame.getjButtonActualizarToolBarCobrador();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.cobradorJInternalFrame.getjButtonActualizarToolBarCobrador();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.cobradorJInternalFrame.getjButtonCancelarToolBarCobrador();
			
			
			return componentTab;		
		}
		
		public CobradorDetalleFormJInternalFrame getcobradorJInternalFrame() {
			return this.cobradorJInternalFrame;
		}
		
		public void setcobradorJInternalFrame(CobradorDetalleFormJInternalFrame cobradorJInternalFrame) {
			this.cobradorJInternalFrame=cobradorJInternalFrame;
		}
		
		public Component getComponentTab() {
			return this.componentTab;
		}
		
		public void setComponentTab(Component componentTab) {
			this.componentTab=componentTab;
		}
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY FIN*/
		
		
		/*FUNCIONES PARA AbstractTableModel*/
		/*
		Notas:
		* Si Cambia version se copia variables y metodos que no son sobreescritos en esta clase.(Usa Jdk 8)
		* Se copia del Jdk javax.swing.table.AbstractTableModel
		* Los argumentos usados es de tipo Interface TableModel no de Clase AbstractTableModel
		* Si se cambia y/o actualiza jdj, toca actualizar el código nuevamente
		*/
		
		protected EventListenerList listenerList = new EventListenerList();

		public int findColumn(String columnName) {
			for (int i = 0; i < getColumnCount(); i++) {
				if (columnName.equals(getColumnName(i))) {
					return i;
				}
			}
			return -1;
		}
		
		public void addTableModelListener(TableModelListener l) {
        	listenerList.add(TableModelListener.class, l);
    	}
		
		public void removeTableModelListener(TableModelListener l) {
        	listenerList.remove(TableModelListener.class, l);
    	}
		
		public TableModelListener[] getTableModelListeners() {
			return listenerList.getListeners(TableModelListener.class);
		}
		
		public void fireTableDataChanged() {
			fireTableChanged(new TableModelEvent(this));
		}
		
		public void fireTableStructureChanged() {
        	fireTableChanged(new TableModelEvent(this, TableModelEvent.HEADER_ROW));
    	}
		
		public void fireTableRowsInserted(int firstRow, int lastRow) {
			fireTableChanged(new TableModelEvent(this, firstRow, lastRow,
								TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT));
		}
	
		public void fireTableRowsUpdated(int firstRow, int lastRow) {
			fireTableChanged(new TableModelEvent(this, firstRow, lastRow,
								TableModelEvent.ALL_COLUMNS, TableModelEvent.UPDATE));
		}
		
		public void fireTableRowsDeleted(int firstRow, int lastRow) {
			fireTableChanged(new TableModelEvent(this, firstRow, lastRow,
								TableModelEvent.ALL_COLUMNS, TableModelEvent.DELETE));
		}
	
		public void fireTableCellUpdated(int row, int column) {
			fireTableChanged(new TableModelEvent(this, row, row, column));
		}
		
		public void fireTableChanged(TableModelEvent e) {
			// Guaranteed to return a non-null array
			Object[] listeners = listenerList.getListenerList();
			// Process the listeners last to first, notifying
			// those that are interested in this event
			for (int i = listeners.length-2; i>=0; i-=2) {
				if (listeners[i]==TableModelListener.class) {
					((TableModelListener)listeners[i+1]).tableChanged(e);
				}
			}
		}
		
		public <T extends EventListener> T[] getListeners(Class<T> listenerType) {
			return listenerList.getListeners(listenerType);
		}
		/*FUNCIONES PARA AbstractTableModel FIN*/
}
