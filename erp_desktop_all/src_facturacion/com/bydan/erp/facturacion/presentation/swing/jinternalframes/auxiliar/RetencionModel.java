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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.facturacion.util.RetencionConstantesFunciones;
import com.bydan.erp.facturacion.util.RetencionParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.RetencionParameterGeneral;

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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.RetencionBeanSwingJInternalFrame;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;






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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.RetencionJInternalFrame;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.RetencionDetalleFormJInternalFrame;

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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.cartera.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class RetencionModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,RetencionConstantesFunciones.LABEL_ID
										,RetencionConstantesFunciones.LABEL_IDEMPRESA
										,RetencionConstantesFunciones.LABEL_IDSUCURSAL
										,RetencionConstantesFunciones.LABEL_IDEJERCICIO
										,RetencionConstantesFunciones.LABEL_IDPERIODO
										,RetencionConstantesFunciones.LABEL_IDANIO
										,RetencionConstantesFunciones.LABEL_IDMES
										,RetencionConstantesFunciones.LABEL_IDASIENTOCONTABLE
										,RetencionConstantesFunciones.LABEL_IDTIPORETENCION
										,RetencionConstantesFunciones.LABEL_IDCLIENTE
										,RetencionConstantesFunciones.LABEL_PORCENTAJE
										,RetencionConstantesFunciones.LABEL_BASEIMPONIBLE
										,RetencionConstantesFunciones.LABEL_VALOR
										,RetencionConstantesFunciones.LABEL_NUMERO
										,RetencionConstantesFunciones.LABEL_IDFACTURA
										,RetencionConstantesFunciones.LABEL_DESCRIPCION
										,RetencionConstantesFunciones.LABEL_DEBITOMONELOCAL
										,RetencionConstantesFunciones.LABEL_CREDITOMONELOCAL
										,RetencionConstantesFunciones.LABEL_DEBITOMONEEXTRA
										,RetencionConstantesFunciones.LABEL_CREDITOMONEEXTRA
										,RetencionConstantesFunciones.LABEL_IDMONEDA
										,RetencionConstantesFunciones.LABEL_COTIZACION
										,RetencionConstantesFunciones.LABEL_NOMBREBENEF
										,RetencionConstantesFunciones.LABEL_DIRECCIONBENEF
										,RetencionConstantesFunciones.LABEL_RUCBENEF
										,RetencionConstantesFunciones.LABEL_TELEFONOBENEF
										};
	   
	    public List<Retencion> retencions;
	  	 
	    //NO SE UTILIZA
	    public RetencionModel(List<Retencion> retencions,JInternalFrameBase jInternalFrameBase) {
	    	this.retencions=retencions;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public RetencionModel(JInternalFrameBase jInternalFrameBase) {
	    	this.retencions=new ArrayList<Retencion>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.retencions.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.retencions.get(rowIndex).getIsSelected();
	            
				case 1: return this.retencions.get(rowIndex).getId();
				case 2: return this.retencions.get(rowIndex).getid_empresa();
				case 3: return this.retencions.get(rowIndex).getid_sucursal();
				case 4: return this.retencions.get(rowIndex).getid_ejercicio();
				case 5: return this.retencions.get(rowIndex).getid_periodo();
				case 6: return this.retencions.get(rowIndex).getid_anio();
				case 7: return this.retencions.get(rowIndex).getid_mes();
				case 8: return this.retencions.get(rowIndex).getid_asiento_contable();
				case 9: return this.retencions.get(rowIndex).getid_tipo_retencion();
				case 10: return this.retencions.get(rowIndex).getid_cliente();
				case 11: return this.retencions.get(rowIndex).getporcentaje();
				case 12: return this.retencions.get(rowIndex).getbase_imponible();
				case 13: return this.retencions.get(rowIndex).getvalor();
				case 14: return this.retencions.get(rowIndex).getnumero();
				case 15: return this.retencions.get(rowIndex).getid_factura();
				case 16: return this.retencions.get(rowIndex).getdescripcion();
				case 17: return this.retencions.get(rowIndex).getdebito_mone_local();
				case 18: return this.retencions.get(rowIndex).getcredito_mone_local();
				case 19: return this.retencions.get(rowIndex).getdebito_mone_extra();
				case 20: return this.retencions.get(rowIndex).getcredito_mone_extra();
				case 21: return this.retencions.get(rowIndex).getid_moneda();
				case 22: return this.retencions.get(rowIndex).getcotizacion();
				case 23: return this.retencions.get(rowIndex).getnombre_benef();
				case 24: return this.retencions.get(rowIndex).getdireccion_benef();
				case 25: return this.retencions.get(rowIndex).getruc_benef();
				case 26: return this.retencions.get(rowIndex).gettelefono_benef();	            
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
				case 11: return Double.class;
				case 12: return Double.class;
				case 13: return Double.class;
				case 14: return String.class;
				case 15: return Long.class;
				case 16: return String.class;
				case 17: return Double.class;
				case 18: return Double.class;
				case 19: return Double.class;
				case 20: return Double.class;
				case 21: return Long.class;
				case 22: return Double.class;
				case 23: return String.class;
				case 24: return String.class;
				case 25: return String.class;
				case 26: return String.class;	            
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
				case 25: return true;
				case 26: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	Retencion retencion = this.retencions.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			RetencionBeanSwingJInternalFrame retencionBeanSwingJInternalFrame=(RetencionBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {retencion.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {retencion.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {retencion.setid_empresa((Long) value);retencion.setempresa_descripcion(retencionBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {retencion.setid_sucursal((Long) value);retencion.setsucursal_descripcion(retencionBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {retencion.setid_ejercicio((Long) value);retencion.setejercicio_descripcion(retencionBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {retencion.setid_periodo((Long) value);retencion.setperiodo_descripcion(retencionBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {retencion.setid_anio((Long) value);retencion.setanio_descripcion(retencionBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {retencion.setid_mes((Long) value);retencion.setmes_descripcion(retencionBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {retencion.setid_asiento_contable((Long) value);retencion.setasientocontable_descripcion(retencionBeanSwingJInternalFrame.getActualAsientoContableForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {retencion.setid_tipo_retencion((Long) value);retencion.settiporetencion_descripcion(retencionBeanSwingJInternalFrame.getActualTipoRetencionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {retencion.setid_cliente((Long) value);retencion.setcliente_descripcion(retencionBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {retencion.setporcentaje((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {retencion.setbase_imponible((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {retencion.setvalor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {retencion.setnumero((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {retencion.setid_factura((Long) value);retencion.setfactura_descripcion(retencionBeanSwingJInternalFrame.getActualFacturaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {retencion.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {retencion.setdebito_mone_local((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {retencion.setcredito_mone_local((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {retencion.setdebito_mone_extra((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {retencion.setcredito_mone_extra((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {retencion.setid_moneda((Long) value);retencion.setmoneda_descripcion(retencionBeanSwingJInternalFrame.getActualMonedaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {retencion.setcotizacion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {retencion.setnombre_benef((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {retencion.setdireccion_benef((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {retencion.setruc_benef((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {retencion.settelefono_benef((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public RetencionModel(JInternalFrameBase jInternalFrameBase) {
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
		private RetencionDetalleFormJInternalFrame retencionJInternalFrame=null;
		
		public RetencionModel(RetencionDetalleFormJInternalFrame retencionJInternalFrame) {
			this.retencionJInternalFrame=retencionJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			/*
			componentTab=this.retencionJInternalFrame.getjButtonActualizarToolBarRetencion();
			
			if(component!=null && component.equals(this.retencionJInternalFrame.getjButtonActualizarToolBarRetencion())) {
				componentTab=this.retencionJInternalFrame.getjButtonEliminarToolBarRetencion();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.retencionJInternalFrame.getjButtonEliminarToolBarRetencion())) {
				componentTab=this.retencionJInternalFrame.getjButtonCancelarToolBarRetencion();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.retencionJInternalFrame.getjButtonCancelarToolBarRetencion())) {
				componentTab=this.retencionJInternalFrame.jComboBoxid_empresaRetencion;
				return componentTab;
			}				
			
			*/
			
			if(component!=null && component.equals(this.retencionJInternalFrame.jTextAreabeneficiarioRetencion)) {
				componentTab=this.retencionJInternalFrame.jComboBoxTiposAccionesFormularioRetencion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.retencionJInternalFrame.jComboBoxTiposAccionesFormularioRetencion)) {
				componentTab=this.retencionJInternalFrame.jButtonEliminarRetencion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.retencionJInternalFrame.jButtonEliminarRetencion)) {
				componentTab=this.retencionJInternalFrame.jButtonActualizarRetencion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.retencionJInternalFrame.jButtonActualizarRetencion)) {
				componentTab=this.retencionJInternalFrame.jButtonCancelarRetencion;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.retencionJInternalFrame.jComboBoxid_empresaRetencion)) {
			componentTab=this.retencionJInternalFrame.jComboBoxid_sucursalRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jComboBoxid_sucursalRetencion)) {
			componentTab=this.retencionJInternalFrame.jComboBoxid_ejercicioRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jComboBoxid_ejercicioRetencion)) {
			componentTab=this.retencionJInternalFrame.jComboBoxid_periodoRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jComboBoxid_periodoRetencion)) {
			componentTab=this.retencionJInternalFrame.jComboBoxid_anioRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jComboBoxid_anioRetencion)) {
			componentTab=this.retencionJInternalFrame.jComboBoxid_mesRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jComboBoxid_mesRetencion)) {
			componentTab=this.retencionJInternalFrame.jComboBoxid_asiento_contableRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jComboBoxid_asiento_contableRetencion)) {
			componentTab=this.retencionJInternalFrame.jComboBoxid_tipo_retencionRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jComboBoxid_tipo_retencionRetencion)) {
			componentTab=this.retencionJInternalFrame.jComboBoxid_clienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jComboBoxid_clienteRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextFieldporcentajeRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextFieldporcentajeRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextFieldbase_imponibleRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextFieldbase_imponibleRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextFieldvalorRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextFieldvalorRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextFieldnumeroRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextFieldnumeroRetencion)) {
			componentTab=this.retencionJInternalFrame.jComboBoxid_facturaRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jComboBoxid_facturaRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextAreadescripcionRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextAreadescripcionRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextFielddebito_mone_localRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextFielddebito_mone_localRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextFieldcredito_mone_localRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextFieldcredito_mone_localRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextFielddebito_mone_extraRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextFielddebito_mone_extraRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextFieldcredito_mone_extraRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextFieldcredito_mone_extraRetencion)) {
			componentTab=this.retencionJInternalFrame.jComboBoxid_monedaRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jComboBoxid_monedaRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextFieldcotizacionRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextFieldcotizacionRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextAreanombre_benefRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextAreanombre_benefRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextAreadireccion_benefRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextAreadireccion_benefRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextFieldruc_benefRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextFieldruc_benefRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextAreatelefono_benefRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextAreatelefono_benefRetencion)) {
			componentTab=this.retencionJInternalFrame.jDateChooserfechaRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jDateChooserfechaRetencion)) {
			componentTab=this.retencionJInternalFrame.jComboBoxid_cuenta_contable_retencionRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jComboBoxid_cuenta_contable_retencionRetencion)) {
			componentTab=this.retencionJInternalFrame.jComboBoxid_estado_retencionRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jComboBoxid_estado_retencionRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextAreabeneficiarioRetencion;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			/*
			componentTab=this.retencionJInternalFrame.getjButtonActualizarToolBarRetencion();
			
			if(component!=null && component.equals(this.retencionJInternalFrame.getjButtonEliminarToolBarRetencion())) {
				componentTab=this.retencionJInternalFrame.getjButtonActualizarToolBarRetencion();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.retencionJInternalFrame.getjButtonCancelarToolBarRetencion())) {
				componentTab=this.retencionJInternalFrame.getjButtonEliminarToolBarRetencion();
				
				return componentTab;
			}
			*/
			
			if(component!=null && component.equals(this.retencionJInternalFrame.jComboBoxid_empresaRetencion)) {
				/*
				componentTab=this.retencionJInternalFrame.getjButtonCancelarToolBarRetencion();
				*/
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.retencionJInternalFrame.jComboBoxTiposAccionesFormularioRetencion)) {
				componentTab=this.retencionJInternalFrame.jTextAreabeneficiarioRetencion;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.retencionJInternalFrame.jButtonEliminarRetencion)) {
				componentTab=this.retencionJInternalFrame.jComboBoxTiposAccionesFormularioRetencion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.retencionJInternalFrame.jButtonActualizarRetencion)) {
				componentTab=this.retencionJInternalFrame.jButtonEliminarRetencion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.retencionJInternalFrame.jButtonCancelarRetencion)) {
				componentTab=this.retencionJInternalFrame.jButtonActualizarRetencion;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.retencionJInternalFrame.jComboBoxid_sucursalRetencion)) {
			componentTab=this.retencionJInternalFrame.jComboBoxid_empresaRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jComboBoxid_ejercicioRetencion)) {
			componentTab=this.retencionJInternalFrame.jComboBoxid_sucursalRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jComboBoxid_periodoRetencion)) {
			componentTab=this.retencionJInternalFrame.jComboBoxid_ejercicioRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jComboBoxid_anioRetencion)) {
			componentTab=this.retencionJInternalFrame.jComboBoxid_periodoRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jComboBoxid_mesRetencion)) {
			componentTab=this.retencionJInternalFrame.jComboBoxid_anioRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jComboBoxid_asiento_contableRetencion)) {
			componentTab=this.retencionJInternalFrame.jComboBoxid_mesRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jComboBoxid_tipo_retencionRetencion)) {
			componentTab=this.retencionJInternalFrame.jComboBoxid_asiento_contableRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jComboBoxid_clienteRetencion)) {
			componentTab=this.retencionJInternalFrame.jComboBoxid_tipo_retencionRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextFieldporcentajeRetencion)) {
			componentTab=this.retencionJInternalFrame.jComboBoxid_clienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextFieldbase_imponibleRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextFieldporcentajeRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextFieldvalorRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextFieldbase_imponibleRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextFieldnumeroRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextFieldvalorRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jComboBoxid_facturaRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextFieldnumeroRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextAreadescripcionRetencion)) {
			componentTab=this.retencionJInternalFrame.jComboBoxid_facturaRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextFielddebito_mone_localRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextAreadescripcionRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextFieldcredito_mone_localRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextFielddebito_mone_localRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextFielddebito_mone_extraRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextFieldcredito_mone_localRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextFieldcredito_mone_extraRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextFielddebito_mone_extraRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jComboBoxid_monedaRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextFieldcredito_mone_extraRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextFieldcotizacionRetencion)) {
			componentTab=this.retencionJInternalFrame.jComboBoxid_monedaRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextAreanombre_benefRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextFieldcotizacionRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextAreadireccion_benefRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextAreanombre_benefRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextFieldruc_benefRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextAreadireccion_benefRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextAreatelefono_benefRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextFieldruc_benefRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jDateChooserfechaRetencion)) {
			componentTab=this.retencionJInternalFrame.jTextAreatelefono_benefRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jComboBoxid_cuenta_contable_retencionRetencion)) {
			componentTab=this.retencionJInternalFrame.jDateChooserfechaRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jComboBoxid_estado_retencionRetencion)) {
			componentTab=this.retencionJInternalFrame.jComboBoxid_cuenta_contable_retencionRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.retencionJInternalFrame.jTextAreabeneficiarioRetencion)) {
			componentTab=this.retencionJInternalFrame.jComboBoxid_estado_retencionRetencion;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			/*
			componentTab=this.retencionJInternalFrame.getjButtonActualizarToolBarRetencion();
			*/
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			/*
			componentTab=this.retencionJInternalFrame.getjButtonActualizarToolBarRetencion();
			*/
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			/*
			componentTab=this.retencionJInternalFrame.getjButtonCancelarToolBarRetencion();
			*/
			
			return componentTab;		
		}
		
		public RetencionDetalleFormJInternalFrame getretencionJInternalFrame() {
			return this.retencionJInternalFrame;
		}
		
		public void setretencionJInternalFrame(RetencionDetalleFormJInternalFrame retencionJInternalFrame) {
			this.retencionJInternalFrame=retencionJInternalFrame;
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
