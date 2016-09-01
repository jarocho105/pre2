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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.contabilidad.util.SecuencialConstantesFunciones;
import com.bydan.erp.contabilidad.util.SecuencialParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.SecuencialParameterGeneral;

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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.SecuencialBeanSwingJInternalFrame;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.SecuencialJInternalFrame;

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.SecuencialDetalleFormJInternalFrame;

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

public class SecuencialModel extends FocusTraversalPolicy implements TableModel, Serializable {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,SecuencialConstantesFunciones.LABEL_ID
										,SecuencialConstantesFunciones.LABEL_IDEMPRESA
										,SecuencialConstantesFunciones.LABEL_IDSUCURSAL
										,SecuencialConstantesFunciones.LABEL_IDEJERCICIO
										,SecuencialConstantesFunciones.LABEL_IDPERIODO
										,SecuencialConstantesFunciones.LABEL_IDANIO
										,SecuencialConstantesFunciones.LABEL_IDMES
										,SecuencialConstantesFunciones.LABEL_IDMODULO
										,SecuencialConstantesFunciones.LABEL_IDTIPODOCUMENTO
										,SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTO
										,SecuencialConstantesFunciones.LABEL_NUMEROASIENTO
										,SecuencialConstantesFunciones.LABEL_NUMEROINGRESO
										,SecuencialConstantesFunciones.LABEL_NUMEROEGRESO
										,SecuencialConstantesFunciones.LABEL_NUMERODIARIO
										,SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVA
										,SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTE
										,SecuencialConstantesFunciones.LABEL_NUMEROASIENTOFORMATO
										,SecuencialConstantesFunciones.LABEL_NUMEROINGRESOFORMATO
										,SecuencialConstantesFunciones.LABEL_NUMEROEGRESOFORMATO
										,SecuencialConstantesFunciones.LABEL_NUMERODIARIOFORMATO
										,SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTEFORMATO
										,SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVAFORMATO
										};
	   
	    public List<Secuencial> secuencials;
	  	 
	    //NO SE UTILIZA
	    public SecuencialModel(List<Secuencial> secuencials,JInternalFrameBase jInternalFrameBase) {
	    	this.secuencials=secuencials;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public SecuencialModel(JInternalFrameBase jInternalFrameBase) {
	    	this.secuencials=new ArrayList<Secuencial>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.secuencials.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.secuencials.get(rowIndex).getIsSelected();
	            
				case 1: return this.secuencials.get(rowIndex).getId();
				case 2: return this.secuencials.get(rowIndex).getid_empresa();
				case 3: return this.secuencials.get(rowIndex).getid_sucursal();
				case 4: return this.secuencials.get(rowIndex).getid_ejercicio();
				case 5: return this.secuencials.get(rowIndex).getid_periodo();
				case 6: return this.secuencials.get(rowIndex).getid_anio();
				case 7: return this.secuencials.get(rowIndex).getid_mes();
				case 8: return this.secuencials.get(rowIndex).getid_modulo();
				case 9: return this.secuencials.get(rowIndex).getid_tipo_documento();
				case 10: return this.secuencials.get(rowIndex).getid_tipo_movimiento();
				case 11: return this.secuencials.get(rowIndex).getnumero_asiento();
				case 12: return this.secuencials.get(rowIndex).getnumero_ingreso();
				case 13: return this.secuencials.get(rowIndex).getnumero_egreso();
				case 14: return this.secuencials.get(rowIndex).getnumero_diario();
				case 15: return this.secuencials.get(rowIndex).getnumero_retencion_iva();
				case 16: return this.secuencials.get(rowIndex).getnumero_retencion_fuente();
				case 17: return this.secuencials.get(rowIndex).getnumero_asiento_formato();
				case 18: return this.secuencials.get(rowIndex).getnumero_ingreso_formato();
				case 19: return this.secuencials.get(rowIndex).getnumero_egreso_formato();
				case 20: return this.secuencials.get(rowIndex).getnumero_diario_formato();
				case 21: return this.secuencials.get(rowIndex).getnumero_retencion_fuente_formato();
				case 22: return this.secuencials.get(rowIndex).getnumero_retencion_iva_formato();	            
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
				case 8: return Long.class;
				case 9: return Long.class;
				case 10: return Long.class;
				case 11: return Long.class;
				case 12: return Long.class;
				case 13: return Long.class;
				case 14: return Long.class;
				case 15: return Long.class;
				case 16: return Long.class;
				case 17: return String.class;
				case 18: return String.class;
				case 19: return String.class;
				case 20: return String.class;
				case 21: return String.class;
				case 22: return String.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	Secuencial secuencial = this.secuencials.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			SecuencialBeanSwingJInternalFrame secuencialBeanSwingJInternalFrame=(SecuencialBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {secuencial.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {secuencial.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {secuencial.setid_empresa((Long) value);secuencial.setempresa_descripcion(secuencialBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {secuencial.setid_sucursal((Long) value);secuencial.setsucursal_descripcion(secuencialBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {secuencial.setid_ejercicio((Long) value);secuencial.setejercicio_descripcion(secuencialBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {secuencial.setid_periodo((Long) value);secuencial.setperiodo_descripcion(secuencialBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {secuencial.setid_anio((Long) value);secuencial.setanio_descripcion(secuencialBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {secuencial.setid_mes((Long) value);secuencial.setmes_descripcion(secuencialBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {secuencial.setid_modulo((Long) value);secuencial.setmodulo_descripcion(secuencialBeanSwingJInternalFrame.getActualModuloForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {secuencial.setid_tipo_documento((Long) value);secuencial.settipodocumento_descripcion(secuencialBeanSwingJInternalFrame.getActualTipoDocumentoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {secuencial.setid_tipo_movimiento((Long) value);secuencial.settipomovimiento_descripcion(secuencialBeanSwingJInternalFrame.getActualTipoMovimientoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {secuencial.setnumero_asiento((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {secuencial.setnumero_ingreso((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {secuencial.setnumero_egreso((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {secuencial.setnumero_diario((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {secuencial.setnumero_retencion_iva((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {secuencial.setnumero_retencion_fuente((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {secuencial.setnumero_asiento_formato((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {secuencial.setnumero_ingreso_formato((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {secuencial.setnumero_egreso_formato((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {secuencial.setnumero_diario_formato((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {secuencial.setnumero_retencion_fuente_formato((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {secuencial.setnumero_retencion_iva_formato((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private SecuencialDetalleFormJInternalFrame secuencialJInternalFrame=null;
		
		public SecuencialModel(SecuencialDetalleFormJInternalFrame secuencialJInternalFrame) {
			this.secuencialJInternalFrame=secuencialJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.secuencialJInternalFrame.getjButtonActualizarToolBarSecuencial();
			
			if(component!=null && component.equals(this.secuencialJInternalFrame.getjButtonActualizarToolBarSecuencial())) {
				componentTab=this.secuencialJInternalFrame.getjButtonEliminarToolBarSecuencial();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.secuencialJInternalFrame.getjButtonEliminarToolBarSecuencial())) {
				componentTab=this.secuencialJInternalFrame.getjButtonCancelarToolBarSecuencial();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.secuencialJInternalFrame.getjButtonCancelarToolBarSecuencial())) {
				componentTab=this.secuencialJInternalFrame.jComboBoxid_empresaSecuencial;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.secuencialJInternalFrame.jTextFieldnumero_retencion_iva_formatoSecuencial)) {
				componentTab=this.secuencialJInternalFrame.jComboBoxTiposAccionesFormularioSecuencial;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.secuencialJInternalFrame.jComboBoxTiposAccionesFormularioSecuencial)) {
				componentTab=this.secuencialJInternalFrame.jButtonEliminarSecuencial;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.secuencialJInternalFrame.jButtonEliminarSecuencial)) {
				componentTab=this.secuencialJInternalFrame.jButtonActualizarSecuencial;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.secuencialJInternalFrame.jButtonActualizarSecuencial)) {
				componentTab=this.secuencialJInternalFrame.jButtonCancelarSecuencial;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.secuencialJInternalFrame.jComboBoxid_empresaSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jComboBoxid_sucursalSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jComboBoxid_sucursalSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jComboBoxid_ejercicioSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jComboBoxid_ejercicioSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jComboBoxid_periodoSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jComboBoxid_periodoSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jComboBoxid_anioSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jComboBoxid_anioSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jComboBoxid_mesSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jComboBoxid_mesSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jComboBoxid_moduloSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jComboBoxid_moduloSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jComboBoxid_tipo_movimiento_moduloSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jComboBoxid_tipo_movimiento_moduloSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jComboBoxid_tipo_documentoSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jComboBoxid_tipo_documentoSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jComboBoxid_tipo_movimientoSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jComboBoxid_tipo_movimientoSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jTextFieldnumero_asientoSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jTextFieldnumero_asientoSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jTextFieldnumero_ingresoSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jTextFieldnumero_ingresoSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jTextFieldnumero_egresoSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jTextFieldnumero_egresoSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jTextFieldnumero_diarioSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jTextFieldnumero_diarioSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jTextFieldnumero_retencion_ivaSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jTextFieldnumero_retencion_ivaSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jTextFieldnumero_retencion_fuenteSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jTextFieldnumero_retencion_fuenteSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jTextFieldnumero_asiento_formatoSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jTextFieldnumero_asiento_formatoSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jTextFieldnumero_ingreso_formatoSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jTextFieldnumero_ingreso_formatoSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jTextFieldnumero_egreso_formatoSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jTextFieldnumero_egreso_formatoSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jTextFieldnumero_diario_formatoSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jTextFieldnumero_diario_formatoSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jTextFieldnumero_retencion_fuente_formatoSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jTextFieldnumero_retencion_fuente_formatoSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jTextFieldnumero_retencion_iva_formatoSecuencial;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.secuencialJInternalFrame.getjButtonActualizarToolBarSecuencial();
			
			if(component!=null && component.equals(this.secuencialJInternalFrame.getjButtonEliminarToolBarSecuencial())) {
				componentTab=this.secuencialJInternalFrame.getjButtonActualizarToolBarSecuencial();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.secuencialJInternalFrame.getjButtonCancelarToolBarSecuencial())) {
				componentTab=this.secuencialJInternalFrame.getjButtonEliminarToolBarSecuencial();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.secuencialJInternalFrame.jComboBoxid_empresaSecuencial)) {
				
				componentTab=this.secuencialJInternalFrame.getjButtonCancelarToolBarSecuencial();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.secuencialJInternalFrame.jComboBoxTiposAccionesFormularioSecuencial)) {
				componentTab=this.secuencialJInternalFrame.jTextFieldnumero_retencion_iva_formatoSecuencial;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.secuencialJInternalFrame.jButtonEliminarSecuencial)) {
				componentTab=this.secuencialJInternalFrame.jComboBoxTiposAccionesFormularioSecuencial;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.secuencialJInternalFrame.jButtonActualizarSecuencial)) {
				componentTab=this.secuencialJInternalFrame.jButtonEliminarSecuencial;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.secuencialJInternalFrame.jButtonCancelarSecuencial)) {
				componentTab=this.secuencialJInternalFrame.jButtonActualizarSecuencial;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.secuencialJInternalFrame.jComboBoxid_sucursalSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jComboBoxid_empresaSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jComboBoxid_ejercicioSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jComboBoxid_sucursalSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jComboBoxid_periodoSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jComboBoxid_ejercicioSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jComboBoxid_anioSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jComboBoxid_periodoSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jComboBoxid_mesSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jComboBoxid_anioSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jComboBoxid_moduloSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jComboBoxid_mesSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jComboBoxid_tipo_movimiento_moduloSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jComboBoxid_moduloSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jComboBoxid_tipo_documentoSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jComboBoxid_tipo_movimiento_moduloSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jComboBoxid_tipo_movimientoSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jComboBoxid_tipo_documentoSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jTextFieldnumero_asientoSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jComboBoxid_tipo_movimientoSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jTextFieldnumero_ingresoSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jTextFieldnumero_asientoSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jTextFieldnumero_egresoSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jTextFieldnumero_ingresoSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jTextFieldnumero_diarioSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jTextFieldnumero_egresoSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jTextFieldnumero_retencion_ivaSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jTextFieldnumero_diarioSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jTextFieldnumero_retencion_fuenteSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jTextFieldnumero_retencion_ivaSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jTextFieldnumero_asiento_formatoSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jTextFieldnumero_retencion_fuenteSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jTextFieldnumero_ingreso_formatoSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jTextFieldnumero_asiento_formatoSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jTextFieldnumero_egreso_formatoSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jTextFieldnumero_ingreso_formatoSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jTextFieldnumero_diario_formatoSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jTextFieldnumero_egreso_formatoSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jTextFieldnumero_retencion_fuente_formatoSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jTextFieldnumero_diario_formatoSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.secuencialJInternalFrame.jTextFieldnumero_retencion_iva_formatoSecuencial)) {
			componentTab=this.secuencialJInternalFrame.jTextFieldnumero_retencion_fuente_formatoSecuencial;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.secuencialJInternalFrame.getjButtonActualizarToolBarSecuencial();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.secuencialJInternalFrame.getjButtonActualizarToolBarSecuencial();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.secuencialJInternalFrame.getjButtonCancelarToolBarSecuencial();
			
			
			return componentTab;		
		}
		
		public SecuencialDetalleFormJInternalFrame getsecuencialJInternalFrame() {
			return this.secuencialJInternalFrame;
		}
		
		public void setsecuencialJInternalFrame(SecuencialDetalleFormJInternalFrame secuencialJInternalFrame) {
			this.secuencialJInternalFrame=secuencialJInternalFrame;
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
