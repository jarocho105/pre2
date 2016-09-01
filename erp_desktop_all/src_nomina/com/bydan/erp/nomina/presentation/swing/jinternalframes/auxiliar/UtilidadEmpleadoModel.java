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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.nomina.util.UtilidadEmpleadoConstantesFunciones;
import com.bydan.erp.nomina.util.UtilidadEmpleadoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.UtilidadEmpleadoParameterGeneral;

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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.UtilidadEmpleadoBeanSwingJInternalFrame;
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
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;






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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.UtilidadEmpleadoJInternalFrame;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.UtilidadEmpleadoDetalleFormJInternalFrame;

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



import com.bydan.erp.seguridad.business.entity.*;


import com.bydan.erp.seguridad.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class UtilidadEmpleadoModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,UtilidadEmpleadoConstantesFunciones.LABEL_ID
										,UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPRESA
										,UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPLEADO
										,UtilidadEmpleadoConstantesFunciones.LABEL_IDANIO
										,UtilidadEmpleadoConstantesFunciones.LABEL_FECHAINGRESO
										,UtilidadEmpleadoConstantesFunciones.LABEL_FECHASALIDA
										,UtilidadEmpleadoConstantesFunciones.LABEL_VALOR
										,UtilidadEmpleadoConstantesFunciones.LABEL_NUMERODIAS
										,UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROCARGAS
										,UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR10
										,UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR10
										,UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR10
										,UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR5
										,UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR5
										,UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR5
										,UtilidadEmpleadoConstantesFunciones.LABEL_TOTAL
										};
	   
	    public List<UtilidadEmpleado> utilidadempleados;
	  	 
	    //NO SE UTILIZA
	    public UtilidadEmpleadoModel(List<UtilidadEmpleado> utilidadempleados,JInternalFrameBase jInternalFrameBase) {
	    	this.utilidadempleados=utilidadempleados;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public UtilidadEmpleadoModel(JInternalFrameBase jInternalFrameBase) {
	    	this.utilidadempleados=new ArrayList<UtilidadEmpleado>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.utilidadempleados.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.utilidadempleados.get(rowIndex).getIsSelected();
	            
				case 1: return this.utilidadempleados.get(rowIndex).getId();
				case 2: return this.utilidadempleados.get(rowIndex).getid_empresa();
				case 3: return this.utilidadempleados.get(rowIndex).getid_empleado();
				case 4: return this.utilidadempleados.get(rowIndex).getid_anio();
				case 5: return this.utilidadempleados.get(rowIndex).getfecha_ingreso();
				case 6: return this.utilidadempleados.get(rowIndex).getfecha_salida();
				case 7: return this.utilidadempleados.get(rowIndex).getvalor();
				case 8: return this.utilidadempleados.get(rowIndex).getnumero_dias();
				case 9: return this.utilidadempleados.get(rowIndex).getnumero_cargas();
				case 10: return this.utilidadempleados.get(rowIndex).getnumero_factor10();
				case 11: return this.utilidadempleados.get(rowIndex).getvalor_factor10();
				case 12: return this.utilidadempleados.get(rowIndex).getutilidad_factor10();
				case 13: return this.utilidadempleados.get(rowIndex).getnumero_factor5();
				case 14: return this.utilidadempleados.get(rowIndex).getvalor_factor5();
				case 15: return this.utilidadempleados.get(rowIndex).getutilidad_factor5();
				case 16: return this.utilidadempleados.get(rowIndex).gettotal();	            
	            default: return null;
	        }
	    }
	 
	    @Override
	    public Class<?> getColumnClass(int columnIndex) {
	    	switch (columnIndex) {
				case 0: return Boolean.class;
	            
				case 1: return Long.class;
				case 2: return Long.class;
				case 3: return Long.class;
				case 4: return Long.class;
				case 5: return Date.class;
				case 6: return Date.class;
				case 7: return Double.class;
				case 8: return Integer.class;
				case 9: return Integer.class;
				case 10: return Double.class;
				case 11: return Double.class;
				case 12: return Double.class;
				case 13: return Double.class;
				case 14: return Double.class;
				case 15: return Double.class;
				case 16: return Double.class;	            
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
				case 8: return true;
				case 9: return true;
				case 10: return true;
				case 11: return true;
				case 12: return true;
				case 13: return true;
				case 14: return true;
				case 15: return true;
				case 16: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	UtilidadEmpleado utilidadempleado = this.utilidadempleados.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			UtilidadEmpleadoBeanSwingJInternalFrame utilidadempleadoBeanSwingJInternalFrame=(UtilidadEmpleadoBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {utilidadempleado.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {utilidadempleado.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {utilidadempleado.setid_empresa((Long) value);utilidadempleado.setempresa_descripcion(utilidadempleadoBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {utilidadempleado.setid_empleado((Long) value);utilidadempleado.setempleado_descripcion(utilidadempleadoBeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {utilidadempleado.setid_anio((Long) value);utilidadempleado.setanio_descripcion(utilidadempleadoBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {utilidadempleado.setfecha_ingreso((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {utilidadempleado.setfecha_salida((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {utilidadempleado.setvalor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {utilidadempleado.setnumero_dias((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {utilidadempleado.setnumero_cargas((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {utilidadempleado.setnumero_factor10((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {utilidadempleado.setvalor_factor10((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {utilidadempleado.setutilidad_factor10((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {utilidadempleado.setnumero_factor5((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {utilidadempleado.setvalor_factor5((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {utilidadempleado.setutilidad_factor5((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {utilidadempleado.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public UtilidadEmpleadoModel(JInternalFrameBase jInternalFrameBase) {
			this.jInternalFrameBase=jInternalFrameBase;
		}
		*/
		
		@Override
		public void propertyChange(PropertyChangeEvent evt) {
			try {
				this.jInternalFrameBase.procesoActualizarFilaTotales();
					
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER FIN
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private UtilidadEmpleadoDetalleFormJInternalFrame utilidadempleadoJInternalFrame=null;
		
		public UtilidadEmpleadoModel(UtilidadEmpleadoDetalleFormJInternalFrame utilidadempleadoJInternalFrame) {
			this.utilidadempleadoJInternalFrame=utilidadempleadoJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.utilidadempleadoJInternalFrame.getjButtonActualizarToolBarUtilidadEmpleado();
			
			if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.getjButtonActualizarToolBarUtilidadEmpleado())) {
				componentTab=this.utilidadempleadoJInternalFrame.getjButtonEliminarToolBarUtilidadEmpleado();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.getjButtonEliminarToolBarUtilidadEmpleado())) {
				componentTab=this.utilidadempleadoJInternalFrame.getjButtonCancelarToolBarUtilidadEmpleado();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.getjButtonCancelarToolBarUtilidadEmpleado())) {
				componentTab=this.utilidadempleadoJInternalFrame.jComboBoxid_empresaUtilidadEmpleado;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jTextFieldtotalUtilidadEmpleado)) {
				componentTab=this.utilidadempleadoJInternalFrame.jComboBoxTiposAccionesFormularioUtilidadEmpleado;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jComboBoxTiposAccionesFormularioUtilidadEmpleado)) {
				componentTab=this.utilidadempleadoJInternalFrame.jButtonEliminarUtilidadEmpleado;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jButtonEliminarUtilidadEmpleado)) {
				componentTab=this.utilidadempleadoJInternalFrame.jButtonActualizarUtilidadEmpleado;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jButtonActualizarUtilidadEmpleado)) {
				componentTab=this.utilidadempleadoJInternalFrame.jButtonCancelarUtilidadEmpleado;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jComboBoxid_empresaUtilidadEmpleado)) {
			componentTab=this.utilidadempleadoJInternalFrame.jComboBoxid_empleadoUtilidadEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jComboBoxid_empleadoUtilidadEmpleado)) {
			componentTab=this.utilidadempleadoJInternalFrame.jComboBoxid_anioUtilidadEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jComboBoxid_anioUtilidadEmpleado)) {
			componentTab=this.utilidadempleadoJInternalFrame.jDateChooserfecha_ingresoUtilidadEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jDateChooserfecha_ingresoUtilidadEmpleado)) {
			componentTab=this.utilidadempleadoJInternalFrame.jDateChooserfecha_salidaUtilidadEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jDateChooserfecha_salidaUtilidadEmpleado)) {
			componentTab=this.utilidadempleadoJInternalFrame.jTextFieldvalorUtilidadEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jTextFieldvalorUtilidadEmpleado)) {
			componentTab=this.utilidadempleadoJInternalFrame.jTextFieldnumero_diasUtilidadEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jTextFieldnumero_diasUtilidadEmpleado)) {
			componentTab=this.utilidadempleadoJInternalFrame.jTextFieldnumero_cargasUtilidadEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jTextFieldnumero_cargasUtilidadEmpleado)) {
			componentTab=this.utilidadempleadoJInternalFrame.jTextFieldnumero_factor10UtilidadEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jTextFieldnumero_factor10UtilidadEmpleado)) {
			componentTab=this.utilidadempleadoJInternalFrame.jTextFieldvalor_factor10UtilidadEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jTextFieldvalor_factor10UtilidadEmpleado)) {
			componentTab=this.utilidadempleadoJInternalFrame.jTextFieldutilidad_factor10UtilidadEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jTextFieldutilidad_factor10UtilidadEmpleado)) {
			componentTab=this.utilidadempleadoJInternalFrame.jTextFieldnumero_factor5UtilidadEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jTextFieldnumero_factor5UtilidadEmpleado)) {
			componentTab=this.utilidadempleadoJInternalFrame.jTextFieldvalor_factor5UtilidadEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jTextFieldvalor_factor5UtilidadEmpleado)) {
			componentTab=this.utilidadempleadoJInternalFrame.jTextFieldutilidad_factor5UtilidadEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jTextFieldutilidad_factor5UtilidadEmpleado)) {
			componentTab=this.utilidadempleadoJInternalFrame.jTextFieldtotalUtilidadEmpleado;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.utilidadempleadoJInternalFrame.getjButtonActualizarToolBarUtilidadEmpleado();
			
			if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.getjButtonEliminarToolBarUtilidadEmpleado())) {
				componentTab=this.utilidadempleadoJInternalFrame.getjButtonActualizarToolBarUtilidadEmpleado();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.getjButtonCancelarToolBarUtilidadEmpleado())) {
				componentTab=this.utilidadempleadoJInternalFrame.getjButtonEliminarToolBarUtilidadEmpleado();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jComboBoxid_empresaUtilidadEmpleado)) {
				
				componentTab=this.utilidadempleadoJInternalFrame.getjButtonCancelarToolBarUtilidadEmpleado();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jComboBoxTiposAccionesFormularioUtilidadEmpleado)) {
				componentTab=this.utilidadempleadoJInternalFrame.jTextFieldtotalUtilidadEmpleado;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jButtonEliminarUtilidadEmpleado)) {
				componentTab=this.utilidadempleadoJInternalFrame.jComboBoxTiposAccionesFormularioUtilidadEmpleado;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jButtonActualizarUtilidadEmpleado)) {
				componentTab=this.utilidadempleadoJInternalFrame.jButtonEliminarUtilidadEmpleado;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jButtonCancelarUtilidadEmpleado)) {
				componentTab=this.utilidadempleadoJInternalFrame.jButtonActualizarUtilidadEmpleado;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jComboBoxid_empleadoUtilidadEmpleado)) {
			componentTab=this.utilidadempleadoJInternalFrame.jComboBoxid_empresaUtilidadEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jComboBoxid_anioUtilidadEmpleado)) {
			componentTab=this.utilidadempleadoJInternalFrame.jComboBoxid_empleadoUtilidadEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jDateChooserfecha_ingresoUtilidadEmpleado)) {
			componentTab=this.utilidadempleadoJInternalFrame.jComboBoxid_anioUtilidadEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jDateChooserfecha_salidaUtilidadEmpleado)) {
			componentTab=this.utilidadempleadoJInternalFrame.jDateChooserfecha_ingresoUtilidadEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jTextFieldvalorUtilidadEmpleado)) {
			componentTab=this.utilidadempleadoJInternalFrame.jDateChooserfecha_salidaUtilidadEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jTextFieldnumero_diasUtilidadEmpleado)) {
			componentTab=this.utilidadempleadoJInternalFrame.jTextFieldvalorUtilidadEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jTextFieldnumero_cargasUtilidadEmpleado)) {
			componentTab=this.utilidadempleadoJInternalFrame.jTextFieldnumero_diasUtilidadEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jTextFieldnumero_factor10UtilidadEmpleado)) {
			componentTab=this.utilidadempleadoJInternalFrame.jTextFieldnumero_cargasUtilidadEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jTextFieldvalor_factor10UtilidadEmpleado)) {
			componentTab=this.utilidadempleadoJInternalFrame.jTextFieldnumero_factor10UtilidadEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jTextFieldutilidad_factor10UtilidadEmpleado)) {
			componentTab=this.utilidadempleadoJInternalFrame.jTextFieldvalor_factor10UtilidadEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jTextFieldnumero_factor5UtilidadEmpleado)) {
			componentTab=this.utilidadempleadoJInternalFrame.jTextFieldutilidad_factor10UtilidadEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jTextFieldvalor_factor5UtilidadEmpleado)) {
			componentTab=this.utilidadempleadoJInternalFrame.jTextFieldnumero_factor5UtilidadEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jTextFieldutilidad_factor5UtilidadEmpleado)) {
			componentTab=this.utilidadempleadoJInternalFrame.jTextFieldvalor_factor5UtilidadEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.utilidadempleadoJInternalFrame.jTextFieldtotalUtilidadEmpleado)) {
			componentTab=this.utilidadempleadoJInternalFrame.jTextFieldutilidad_factor5UtilidadEmpleado;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.utilidadempleadoJInternalFrame.getjButtonActualizarToolBarUtilidadEmpleado();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.utilidadempleadoJInternalFrame.getjButtonActualizarToolBarUtilidadEmpleado();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.utilidadempleadoJInternalFrame.getjButtonCancelarToolBarUtilidadEmpleado();
			
			
			return componentTab;		
		}
		
		public UtilidadEmpleadoDetalleFormJInternalFrame getutilidadempleadoJInternalFrame() {
			return this.utilidadempleadoJInternalFrame;
		}
		
		public void setutilidadempleadoJInternalFrame(UtilidadEmpleadoDetalleFormJInternalFrame utilidadempleadoJInternalFrame) {
			this.utilidadempleadoJInternalFrame=utilidadempleadoJInternalFrame;
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
