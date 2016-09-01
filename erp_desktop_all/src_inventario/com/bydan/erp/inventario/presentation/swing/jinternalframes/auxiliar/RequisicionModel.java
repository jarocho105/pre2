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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar;


import java.sql.Time;


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

import com.bydan.erp.inventario.util.RequisicionConstantesFunciones;
import com.bydan.erp.inventario.util.RequisicionParameterReturnGeneral;
//import com.bydan.erp.inventario.util.RequisicionParameterGeneral;

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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.RequisicionBeanSwingJInternalFrame;
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
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;






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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.RequisicionJInternalFrame;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.RequisicionDetalleFormJInternalFrame;

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
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class RequisicionModel extends FocusTraversalPolicy implements TableModel, Serializable {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,RequisicionConstantesFunciones.LABEL_ID
										,RequisicionConstantesFunciones.LABEL_IDEMPRESA
										,RequisicionConstantesFunciones.LABEL_IDSUCURSAL
										,RequisicionConstantesFunciones.LABEL_NUMEROSECUENCIAL
										,RequisicionConstantesFunciones.LABEL_IDTIPOREQUISICION
										,RequisicionConstantesFunciones.LABEL_FECHA
										,RequisicionConstantesFunciones.LABEL_HORA
										,RequisicionConstantesFunciones.LABEL_IDEMPLEADO
										,RequisicionConstantesFunciones.LABEL_IDESTADOREQUISICION
										,RequisicionConstantesFunciones.LABEL_IDFORMATO
										,RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITAR
										,RequisicionConstantesFunciones.LABEL_DESCRIPCION
										,RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITA
										};
	   
	    public List<Requisicion> requisicions;
	  	 
	    //NO SE UTILIZA
	    public RequisicionModel(List<Requisicion> requisicions,JInternalFrameBase jInternalFrameBase) {
	    	this.requisicions=requisicions;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public RequisicionModel(JInternalFrameBase jInternalFrameBase) {
	    	this.requisicions=new ArrayList<Requisicion>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.requisicions.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.requisicions.get(rowIndex).getIsSelected();
	            
				case 1: return this.requisicions.get(rowIndex).getId();
				case 2: return this.requisicions.get(rowIndex).getid_empresa();
				case 3: return this.requisicions.get(rowIndex).getid_sucursal();
				case 4: return this.requisicions.get(rowIndex).getnumero_secuencial();
				case 5: return this.requisicions.get(rowIndex).getid_tipo_requisicion();
				case 6: return this.requisicions.get(rowIndex).getfecha();
				case 7: return this.requisicions.get(rowIndex).gethora();
				case 8: return this.requisicions.get(rowIndex).getid_empleado();
				case 9: return this.requisicions.get(rowIndex).getid_estado_requisicion();
				case 10: return this.requisicions.get(rowIndex).getid_formato();
				case 11: return this.requisicions.get(rowIndex).getid_bodega_solicitar();
				case 12: return this.requisicions.get(rowIndex).getdescripcion();
				case 13: return this.requisicions.get(rowIndex).getid_bodega_solicita();	            
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
				case 4: return String.class;
				case 5: return Long.class;
				case 6: return Date.class;
				case 7: return Time.class;
				case 8: return Long.class;
				case 9: return Long.class;
				case 10: return Long.class;
				case 11: return Long.class;
				case 12: return String.class;
				case 13: return Long.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	Requisicion requisicion = this.requisicions.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			RequisicionBeanSwingJInternalFrame requisicionBeanSwingJInternalFrame=(RequisicionBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {requisicion.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {requisicion.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {requisicion.setid_empresa((Long) value);requisicion.setempresa_descripcion(requisicionBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {requisicion.setid_sucursal((Long) value);requisicion.setsucursal_descripcion(requisicionBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {requisicion.setnumero_secuencial((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {requisicion.setid_tipo_requisicion((Long) value);requisicion.settiporequisicion_descripcion(requisicionBeanSwingJInternalFrame.getActualTipoRequisicionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {requisicion.setfecha((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {requisicion.sethora((Time) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {requisicion.setid_empleado((Long) value);requisicion.setempleado_descripcion(requisicionBeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {requisicion.setid_estado_requisicion((Long) value);requisicion.setestadorequisicion_descripcion(requisicionBeanSwingJInternalFrame.getActualEstadoRequisicionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {requisicion.setid_formato((Long) value);requisicion.setformato_descripcion(requisicionBeanSwingJInternalFrame.getActualFormatoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {requisicion.setid_bodega_solicitar((Long) value);requisicion.setbodegasolicitar_descripcion(requisicionBeanSwingJInternalFrame.getActualBodegaSolicitarForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {requisicion.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {requisicion.setid_bodega_solicita((Long) value);requisicion.setbodegasolicita_descripcion(requisicionBeanSwingJInternalFrame.getActualBodegaSolicitaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private RequisicionDetalleFormJInternalFrame requisicionJInternalFrame=null;
		
		public RequisicionModel(RequisicionDetalleFormJInternalFrame requisicionJInternalFrame) {
			this.requisicionJInternalFrame=requisicionJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.requisicionJInternalFrame.getjButtonActualizarToolBarRequisicion();
			
			if(component!=null && component.equals(this.requisicionJInternalFrame.getjButtonActualizarToolBarRequisicion())) {
				componentTab=this.requisicionJInternalFrame.getjButtonEliminarToolBarRequisicion();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.requisicionJInternalFrame.getjButtonEliminarToolBarRequisicion())) {
				componentTab=this.requisicionJInternalFrame.getjButtonCancelarToolBarRequisicion();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.requisicionJInternalFrame.getjButtonCancelarToolBarRequisicion())) {
				componentTab=this.requisicionJInternalFrame.jComboBoxid_empresaRequisicion;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.requisicionJInternalFrame.jComboBoxid_bodega_solicitaRequisicion)) {
				componentTab=this.requisicionJInternalFrame.jComboBoxTiposAccionesFormularioRequisicion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.requisicionJInternalFrame.jComboBoxTiposAccionesFormularioRequisicion)) {
				componentTab=this.requisicionJInternalFrame.jButtonEliminarRequisicion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.requisicionJInternalFrame.jButtonEliminarRequisicion)) {
				componentTab=this.requisicionJInternalFrame.jButtonActualizarRequisicion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.requisicionJInternalFrame.jButtonActualizarRequisicion)) {
				componentTab=this.requisicionJInternalFrame.jButtonCancelarRequisicion;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.requisicionJInternalFrame.jComboBoxid_empresaRequisicion)) {
			componentTab=this.requisicionJInternalFrame.jComboBoxid_sucursalRequisicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicionJInternalFrame.jComboBoxid_sucursalRequisicion)) {
			componentTab=this.requisicionJInternalFrame.jTextFieldnumero_secuencialRequisicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicionJInternalFrame.jTextFieldnumero_secuencialRequisicion)) {
			componentTab=this.requisicionJInternalFrame.jComboBoxid_tipo_requisicionRequisicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicionJInternalFrame.jComboBoxid_tipo_requisicionRequisicion)) {
			componentTab=this.requisicionJInternalFrame.jDateChooserfechaRequisicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicionJInternalFrame.jDateChooserfechaRequisicion)) {
			componentTab=this.requisicionJInternalFrame.jSpinnerhoraRequisicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicionJInternalFrame.jSpinnerhoraRequisicion)) {
			componentTab=this.requisicionJInternalFrame.jComboBoxid_empleadoRequisicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicionJInternalFrame.jComboBoxid_empleadoRequisicion)) {
			componentTab=this.requisicionJInternalFrame.jComboBoxid_estado_requisicionRequisicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicionJInternalFrame.jComboBoxid_estado_requisicionRequisicion)) {
			componentTab=this.requisicionJInternalFrame.jComboBoxid_formatoRequisicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicionJInternalFrame.jComboBoxid_formatoRequisicion)) {
			componentTab=this.requisicionJInternalFrame.jComboBoxid_bodega_solicitarRequisicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicionJInternalFrame.jComboBoxid_bodega_solicitarRequisicion)) {
			componentTab=this.requisicionJInternalFrame.jTextAreadescripcionRequisicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicionJInternalFrame.jTextAreadescripcionRequisicion)) {
			componentTab=this.requisicionJInternalFrame.jComboBoxid_bodega_solicitaRequisicion;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.requisicionJInternalFrame.getjButtonActualizarToolBarRequisicion();
			
			if(component!=null && component.equals(this.requisicionJInternalFrame.getjButtonEliminarToolBarRequisicion())) {
				componentTab=this.requisicionJInternalFrame.getjButtonActualizarToolBarRequisicion();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.requisicionJInternalFrame.getjButtonCancelarToolBarRequisicion())) {
				componentTab=this.requisicionJInternalFrame.getjButtonEliminarToolBarRequisicion();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.requisicionJInternalFrame.jComboBoxid_empresaRequisicion)) {
				
				componentTab=this.requisicionJInternalFrame.getjButtonCancelarToolBarRequisicion();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.requisicionJInternalFrame.jComboBoxTiposAccionesFormularioRequisicion)) {
				componentTab=this.requisicionJInternalFrame.jComboBoxid_bodega_solicitaRequisicion;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.requisicionJInternalFrame.jButtonEliminarRequisicion)) {
				componentTab=this.requisicionJInternalFrame.jComboBoxTiposAccionesFormularioRequisicion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.requisicionJInternalFrame.jButtonActualizarRequisicion)) {
				componentTab=this.requisicionJInternalFrame.jButtonEliminarRequisicion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.requisicionJInternalFrame.jButtonCancelarRequisicion)) {
				componentTab=this.requisicionJInternalFrame.jButtonActualizarRequisicion;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.requisicionJInternalFrame.jComboBoxid_sucursalRequisicion)) {
			componentTab=this.requisicionJInternalFrame.jComboBoxid_empresaRequisicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicionJInternalFrame.jTextFieldnumero_secuencialRequisicion)) {
			componentTab=this.requisicionJInternalFrame.jComboBoxid_sucursalRequisicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicionJInternalFrame.jComboBoxid_tipo_requisicionRequisicion)) {
			componentTab=this.requisicionJInternalFrame.jTextFieldnumero_secuencialRequisicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicionJInternalFrame.jDateChooserfechaRequisicion)) {
			componentTab=this.requisicionJInternalFrame.jComboBoxid_tipo_requisicionRequisicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicionJInternalFrame.jSpinnerhoraRequisicion)) {
			componentTab=this.requisicionJInternalFrame.jDateChooserfechaRequisicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicionJInternalFrame.jComboBoxid_empleadoRequisicion)) {
			componentTab=this.requisicionJInternalFrame.jSpinnerhoraRequisicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicionJInternalFrame.jComboBoxid_estado_requisicionRequisicion)) {
			componentTab=this.requisicionJInternalFrame.jComboBoxid_empleadoRequisicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicionJInternalFrame.jComboBoxid_formatoRequisicion)) {
			componentTab=this.requisicionJInternalFrame.jComboBoxid_estado_requisicionRequisicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicionJInternalFrame.jComboBoxid_bodega_solicitarRequisicion)) {
			componentTab=this.requisicionJInternalFrame.jComboBoxid_formatoRequisicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicionJInternalFrame.jTextAreadescripcionRequisicion)) {
			componentTab=this.requisicionJInternalFrame.jComboBoxid_bodega_solicitarRequisicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicionJInternalFrame.jComboBoxid_bodega_solicitaRequisicion)) {
			componentTab=this.requisicionJInternalFrame.jTextAreadescripcionRequisicion;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.requisicionJInternalFrame.getjButtonActualizarToolBarRequisicion();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.requisicionJInternalFrame.getjButtonActualizarToolBarRequisicion();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.requisicionJInternalFrame.getjButtonCancelarToolBarRequisicion();
			
			
			return componentTab;		
		}
		
		public RequisicionDetalleFormJInternalFrame getrequisicionJInternalFrame() {
			return this.requisicionJInternalFrame;
		}
		
		public void setrequisicionJInternalFrame(RequisicionDetalleFormJInternalFrame requisicionJInternalFrame) {
			this.requisicionJInternalFrame=requisicionJInternalFrame;
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
