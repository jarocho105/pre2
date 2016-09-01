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

import com.bydan.erp.nomina.util.AsistenciaMensualConstantesFunciones;
import com.bydan.erp.nomina.util.AsistenciaMensualParameterReturnGeneral;
//import com.bydan.erp.nomina.util.AsistenciaMensualParameterGeneral;

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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.AsistenciaMensualBeanSwingJInternalFrame;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.AsistenciaMensualJInternalFrame;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.AsistenciaMensualDetalleFormJInternalFrame;

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

public class AsistenciaMensualModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,AsistenciaMensualConstantesFunciones.LABEL_ID
										,AsistenciaMensualConstantesFunciones.LABEL_IDEMPRESA
										,AsistenciaMensualConstantesFunciones.LABEL_IDEMPLEADO
										,AsistenciaMensualConstantesFunciones.LABEL_IDCARGO
										,AsistenciaMensualConstantesFunciones.LABEL_IDESTRUCTURA
										,AsistenciaMensualConstantesFunciones.LABEL_IDANIO
										,AsistenciaMensualConstantesFunciones.LABEL_IDMES
										,AsistenciaMensualConstantesFunciones.LABEL_FECHA
										,AsistenciaMensualConstantesFunciones.LABEL_HORASTRABAJO
										,AsistenciaMensualConstantesFunciones.LABEL_HORASATRASO
										,AsistenciaMensualConstantesFunciones.LABEL_HORASFALTAS
										,AsistenciaMensualConstantesFunciones.LABEL_HORASPERMISO
										,AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA25
										,AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA50
										,AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA100
										,AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA150
										,AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA0
										,AsistenciaMensualConstantesFunciones.LABEL_HORASENFERMO
										,AsistenciaMensualConstantesFunciones.LABEL_HORASMATERNIDAD
										,AsistenciaMensualConstantesFunciones.LABEL_HORASVACACION
										,AsistenciaMensualConstantesFunciones.LABEL_NUMERODIAS
										,AsistenciaMensualConstantesFunciones.LABEL_NUMERONOCHES
										,AsistenciaMensualConstantesFunciones.LABEL_NUMEROFERIADOS
										,AsistenciaMensualConstantesFunciones.LABEL_NUMEROTRABAJO
										};
	   
	    public List<AsistenciaMensual> asistenciamensuals;
	  	 
	    //NO SE UTILIZA
	    public AsistenciaMensualModel(List<AsistenciaMensual> asistenciamensuals,JInternalFrameBase jInternalFrameBase) {
	    	this.asistenciamensuals=asistenciamensuals;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public AsistenciaMensualModel(JInternalFrameBase jInternalFrameBase) {
	    	this.asistenciamensuals=new ArrayList<AsistenciaMensual>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.asistenciamensuals.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.asistenciamensuals.get(rowIndex).getIsSelected();
	            
				case 1: return this.asistenciamensuals.get(rowIndex).getId();
				case 2: return this.asistenciamensuals.get(rowIndex).getid_empresa();
				case 3: return this.asistenciamensuals.get(rowIndex).getid_empleado();
				case 4: return this.asistenciamensuals.get(rowIndex).getid_cargo();
				case 5: return this.asistenciamensuals.get(rowIndex).getid_estructura();
				case 6: return this.asistenciamensuals.get(rowIndex).getid_anio();
				case 7: return this.asistenciamensuals.get(rowIndex).getid_mes();
				case 8: return this.asistenciamensuals.get(rowIndex).getfecha();
				case 9: return this.asistenciamensuals.get(rowIndex).gethoras_trabajo();
				case 10: return this.asistenciamensuals.get(rowIndex).gethoras_atraso();
				case 11: return this.asistenciamensuals.get(rowIndex).gethoras_faltas();
				case 12: return this.asistenciamensuals.get(rowIndex).gethoras_permiso();
				case 13: return this.asistenciamensuals.get(rowIndex).gethoras_extra25();
				case 14: return this.asistenciamensuals.get(rowIndex).gethoras_extra50();
				case 15: return this.asistenciamensuals.get(rowIndex).gethoras_extra100();
				case 16: return this.asistenciamensuals.get(rowIndex).gethoras_extra150();
				case 17: return this.asistenciamensuals.get(rowIndex).gethoras_extra0();
				case 18: return this.asistenciamensuals.get(rowIndex).gethoras_enfermo();
				case 19: return this.asistenciamensuals.get(rowIndex).gethoras_maternidad();
				case 20: return this.asistenciamensuals.get(rowIndex).gethoras_vacacion();
				case 21: return this.asistenciamensuals.get(rowIndex).getnumero_dias();
				case 22: return this.asistenciamensuals.get(rowIndex).getnumero_noches();
				case 23: return this.asistenciamensuals.get(rowIndex).getnumero_feriados();
				case 24: return this.asistenciamensuals.get(rowIndex).getnumero_trabajo();	            
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
				case 5: return Long.class;
				case 6: return Long.class;
				case 7: return Long.class;
				case 8: return Date.class;
				case 9: return Double.class;
				case 10: return Double.class;
				case 11: return Double.class;
				case 12: return Double.class;
				case 13: return Double.class;
				case 14: return Double.class;
				case 15: return Double.class;
				case 16: return Double.class;
				case 17: return Double.class;
				case 18: return Double.class;
				case 19: return Double.class;
				case 20: return Double.class;
				case 21: return Double.class;
				case 22: return Double.class;
				case 23: return Double.class;
				case 24: return Double.class;	            
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
				case 17: return true;
				case 18: return true;
				case 19: return true;
				case 20: return true;
				case 21: return true;
				case 22: return true;
				case 23: return true;
				case 24: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	AsistenciaMensual asistenciamensual = this.asistenciamensuals.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			AsistenciaMensualBeanSwingJInternalFrame asistenciamensualBeanSwingJInternalFrame=(AsistenciaMensualBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {asistenciamensual.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {asistenciamensual.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {asistenciamensual.setid_empresa((Long) value);asistenciamensual.setempresa_descripcion(asistenciamensualBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {asistenciamensual.setid_empleado((Long) value);asistenciamensual.setempleado_descripcion(asistenciamensualBeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {asistenciamensual.setid_cargo((Long) value);asistenciamensual.setcargo_descripcion(asistenciamensualBeanSwingJInternalFrame.getActualCargoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {asistenciamensual.setid_estructura((Long) value);asistenciamensual.setestructura_descripcion(asistenciamensualBeanSwingJInternalFrame.getActualEstructuraForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {asistenciamensual.setid_anio((Long) value);asistenciamensual.setanio_descripcion(asistenciamensualBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {asistenciamensual.setid_mes((Long) value);asistenciamensual.setmes_descripcion(asistenciamensualBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {asistenciamensual.setfecha((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {asistenciamensual.sethoras_trabajo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {asistenciamensual.sethoras_atraso((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {asistenciamensual.sethoras_faltas((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {asistenciamensual.sethoras_permiso((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {asistenciamensual.sethoras_extra25((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {asistenciamensual.sethoras_extra50((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {asistenciamensual.sethoras_extra100((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {asistenciamensual.sethoras_extra150((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {asistenciamensual.sethoras_extra0((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {asistenciamensual.sethoras_enfermo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {asistenciamensual.sethoras_maternidad((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {asistenciamensual.sethoras_vacacion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {asistenciamensual.setnumero_dias((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {asistenciamensual.setnumero_noches((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {asistenciamensual.setnumero_feriados((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {asistenciamensual.setnumero_trabajo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public AsistenciaMensualModel(JInternalFrameBase jInternalFrameBase) {
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
		private AsistenciaMensualDetalleFormJInternalFrame asistenciamensualJInternalFrame=null;
		
		public AsistenciaMensualModel(AsistenciaMensualDetalleFormJInternalFrame asistenciamensualJInternalFrame) {
			this.asistenciamensualJInternalFrame=asistenciamensualJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.asistenciamensualJInternalFrame.getjButtonActualizarToolBarAsistenciaMensual();
			
			if(component!=null && component.equals(this.asistenciamensualJInternalFrame.getjButtonActualizarToolBarAsistenciaMensual())) {
				componentTab=this.asistenciamensualJInternalFrame.getjButtonEliminarToolBarAsistenciaMensual();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.asistenciamensualJInternalFrame.getjButtonEliminarToolBarAsistenciaMensual())) {
				componentTab=this.asistenciamensualJInternalFrame.getjButtonCancelarToolBarAsistenciaMensual();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.asistenciamensualJInternalFrame.getjButtonCancelarToolBarAsistenciaMensual())) {
				componentTab=this.asistenciamensualJInternalFrame.jComboBoxid_empresaAsistenciaMensual;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldnumero_trabajoAsistenciaMensual)) {
				componentTab=this.asistenciamensualJInternalFrame.jComboBoxTiposAccionesFormularioAsistenciaMensual;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jComboBoxTiposAccionesFormularioAsistenciaMensual)) {
				componentTab=this.asistenciamensualJInternalFrame.jButtonEliminarAsistenciaMensual;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jButtonEliminarAsistenciaMensual)) {
				componentTab=this.asistenciamensualJInternalFrame.jButtonActualizarAsistenciaMensual;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jButtonActualizarAsistenciaMensual)) {
				componentTab=this.asistenciamensualJInternalFrame.jButtonCancelarAsistenciaMensual;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jComboBoxid_empresaAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jComboBoxid_empleadoAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jComboBoxid_empleadoAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jComboBoxid_cargoAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jComboBoxid_cargoAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jComboBoxid_estructuraAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jComboBoxid_estructuraAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jComboBoxid_anioAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jComboBoxid_anioAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jComboBoxid_mesAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jComboBoxid_mesAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jDateChooserfechaAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jDateChooserfechaAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldhoras_trabajoAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldhoras_trabajoAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldhoras_atrasoAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldhoras_atrasoAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldhoras_faltasAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldhoras_faltasAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldhoras_permisoAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldhoras_permisoAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldhoras_extra25AsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldhoras_extra25AsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldhoras_extra50AsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldhoras_extra50AsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldhoras_extra100AsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldhoras_extra100AsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldhoras_extra150AsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldhoras_extra150AsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldhoras_extra0AsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldhoras_extra0AsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldhoras_enfermoAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldhoras_enfermoAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldhoras_maternidadAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldhoras_maternidadAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldhoras_vacacionAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldhoras_vacacionAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldnumero_diasAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldnumero_diasAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldnumero_nochesAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldnumero_nochesAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldnumero_feriadosAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldnumero_feriadosAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldnumero_trabajoAsistenciaMensual;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.asistenciamensualJInternalFrame.getjButtonActualizarToolBarAsistenciaMensual();
			
			if(component!=null && component.equals(this.asistenciamensualJInternalFrame.getjButtonEliminarToolBarAsistenciaMensual())) {
				componentTab=this.asistenciamensualJInternalFrame.getjButtonActualizarToolBarAsistenciaMensual();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.asistenciamensualJInternalFrame.getjButtonCancelarToolBarAsistenciaMensual())) {
				componentTab=this.asistenciamensualJInternalFrame.getjButtonEliminarToolBarAsistenciaMensual();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jComboBoxid_empresaAsistenciaMensual)) {
				
				componentTab=this.asistenciamensualJInternalFrame.getjButtonCancelarToolBarAsistenciaMensual();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jComboBoxTiposAccionesFormularioAsistenciaMensual)) {
				componentTab=this.asistenciamensualJInternalFrame.jTextFieldnumero_trabajoAsistenciaMensual;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jButtonEliminarAsistenciaMensual)) {
				componentTab=this.asistenciamensualJInternalFrame.jComboBoxTiposAccionesFormularioAsistenciaMensual;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jButtonActualizarAsistenciaMensual)) {
				componentTab=this.asistenciamensualJInternalFrame.jButtonEliminarAsistenciaMensual;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jButtonCancelarAsistenciaMensual)) {
				componentTab=this.asistenciamensualJInternalFrame.jButtonActualizarAsistenciaMensual;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jComboBoxid_empleadoAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jComboBoxid_empresaAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jComboBoxid_cargoAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jComboBoxid_empleadoAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jComboBoxid_estructuraAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jComboBoxid_cargoAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jComboBoxid_anioAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jComboBoxid_estructuraAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jComboBoxid_mesAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jComboBoxid_anioAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jDateChooserfechaAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jComboBoxid_mesAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldhoras_trabajoAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jDateChooserfechaAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldhoras_atrasoAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldhoras_trabajoAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldhoras_faltasAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldhoras_atrasoAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldhoras_permisoAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldhoras_faltasAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldhoras_extra25AsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldhoras_permisoAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldhoras_extra50AsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldhoras_extra25AsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldhoras_extra100AsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldhoras_extra50AsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldhoras_extra150AsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldhoras_extra100AsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldhoras_extra0AsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldhoras_extra150AsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldhoras_enfermoAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldhoras_extra0AsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldhoras_maternidadAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldhoras_enfermoAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldhoras_vacacionAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldhoras_maternidadAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldnumero_diasAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldhoras_vacacionAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldnumero_nochesAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldnumero_diasAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldnumero_feriadosAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldnumero_nochesAsistenciaMensual;
			return componentTab;
		}

		if(component!=null && component.equals(this.asistenciamensualJInternalFrame.jTextFieldnumero_trabajoAsistenciaMensual)) {
			componentTab=this.asistenciamensualJInternalFrame.jTextFieldnumero_feriadosAsistenciaMensual;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.asistenciamensualJInternalFrame.getjButtonActualizarToolBarAsistenciaMensual();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.asistenciamensualJInternalFrame.getjButtonActualizarToolBarAsistenciaMensual();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.asistenciamensualJInternalFrame.getjButtonCancelarToolBarAsistenciaMensual();
			
			
			return componentTab;		
		}
		
		public AsistenciaMensualDetalleFormJInternalFrame getasistenciamensualJInternalFrame() {
			return this.asistenciamensualJInternalFrame;
		}
		
		public void setasistenciamensualJInternalFrame(AsistenciaMensualDetalleFormJInternalFrame asistenciamensualJInternalFrame) {
			this.asistenciamensualJInternalFrame=asistenciamensualJInternalFrame;
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
