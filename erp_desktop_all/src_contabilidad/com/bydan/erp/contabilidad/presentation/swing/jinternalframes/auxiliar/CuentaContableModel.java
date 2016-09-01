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

import com.bydan.erp.contabilidad.util.CuentaContableConstantesFunciones;
import com.bydan.erp.contabilidad.util.CuentaContableParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.CuentaContableParameterGeneral;

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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.CuentaContableBeanSwingJInternalFrame;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.CuentaContableJInternalFrame;

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.CuentaContableDetalleFormJInternalFrame;

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

public class CuentaContableModel extends FocusTraversalPolicy implements TableModel, Serializable {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,CuentaContableConstantesFunciones.LABEL_ID
										,CuentaContableConstantesFunciones.LABEL_IDEMPRESA
										,CuentaContableConstantesFunciones.LABEL_CODIGO
										,CuentaContableConstantesFunciones.LABEL_NOMBRE
										,CuentaContableConstantesFunciones.LABEL_CODIGOEXTRANJERO
										,CuentaContableConstantesFunciones.LABEL_NOMBREEXTRANJERO
										,CuentaContableConstantesFunciones.LABEL_IDNIVELCUENTA
										,CuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLE
										,CuentaContableConstantesFunciones.LABEL_IDCENTROCOSTO
										,CuentaContableConstantesFunciones.LABEL_IDMODULO
										,CuentaContableConstantesFunciones.LABEL_DESCRIPCION
										,CuentaContableConstantesFunciones.LABEL_ESMOVIMIENTO
										,CuentaContableConstantesFunciones.LABEL_ESCENTROCOSTO
										,CuentaContableConstantesFunciones.LABEL_ESCENTROACTIVIDAD
										,CuentaContableConstantesFunciones.LABEL_ESACTIVO
										,CuentaContableConstantesFunciones.LABEL_ESRELACION
										,CuentaContableConstantesFunciones.LABEL_ESPARAF52
										,CuentaContableConstantesFunciones.LABEL_IDMONEDA
										,CuentaContableConstantesFunciones.LABEL_IDTIPOINTERVALO
										,CuentaContableConstantesFunciones.LABEL_IDTIPOFLUJOEFECTIVO
										,CuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO
										,CuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO
										,CuentaContableConstantesFunciones.LABEL_ORDEN
										};
	   
	    public List<CuentaContable> cuentacontables;
	  	 
	    //NO SE UTILIZA
	    public CuentaContableModel(List<CuentaContable> cuentacontables,JInternalFrameBase jInternalFrameBase) {
	    	this.cuentacontables=cuentacontables;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public CuentaContableModel(JInternalFrameBase jInternalFrameBase) {
	    	this.cuentacontables=new ArrayList<CuentaContable>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.cuentacontables.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.cuentacontables.get(rowIndex).getIsSelected();
	            
				case 1: return this.cuentacontables.get(rowIndex).getId();
				case 2: return this.cuentacontables.get(rowIndex).getid_empresa();
				case 3: return this.cuentacontables.get(rowIndex).getcodigo();
				case 4: return this.cuentacontables.get(rowIndex).getnombre();
				case 5: return this.cuentacontables.get(rowIndex).getcodigo_extranjero();
				case 6: return this.cuentacontables.get(rowIndex).getnombre_extranjero();
				case 7: return this.cuentacontables.get(rowIndex).getid_nivel_cuenta();
				case 8: return this.cuentacontables.get(rowIndex).getid_cuenta_contable();
				case 9: return this.cuentacontables.get(rowIndex).getid_centro_costo();
				case 10: return this.cuentacontables.get(rowIndex).getid_modulo();
				case 11: return this.cuentacontables.get(rowIndex).getdescripcion();
				case 12: return this.cuentacontables.get(rowIndex).getes_movimiento();
				case 13: return this.cuentacontables.get(rowIndex).getes_centro_costo();
				case 14: return this.cuentacontables.get(rowIndex).getes_centro_actividad();
				case 15: return this.cuentacontables.get(rowIndex).getes_activo();
				case 16: return this.cuentacontables.get(rowIndex).getes_relacion();
				case 17: return this.cuentacontables.get(rowIndex).getes_para_f52();
				case 18: return this.cuentacontables.get(rowIndex).getid_moneda();
				case 19: return this.cuentacontables.get(rowIndex).getid_tipo_intervalo();
				case 20: return this.cuentacontables.get(rowIndex).getid_tipo_flujo_efectivo();
				case 21: return this.cuentacontables.get(rowIndex).getid_cuenta_contable_debito();
				case 22: return this.cuentacontables.get(rowIndex).getid_cuenta_contable_credito();
				case 23: return this.cuentacontables.get(rowIndex).getorden();	            
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
				case 7: return Long.class;
				case 8: return Long.class;
				case 9: return Long.class;
				case 10: return Long.class;
				case 11: return String.class;
				case 12: return Boolean.class;
				case 13: return Boolean.class;
				case 14: return Boolean.class;
				case 15: return Boolean.class;
				case 16: return Boolean.class;
				case 17: return Boolean.class;
				case 18: return Long.class;
				case 19: return Long.class;
				case 20: return Long.class;
				case 21: return Long.class;
				case 22: return Long.class;
				case 23: return Integer.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	CuentaContable cuentacontable = this.cuentacontables.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=(CuentaContableBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {cuentacontable.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {cuentacontable.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {cuentacontable.setid_empresa((Long) value);cuentacontable.setempresa_descripcion(cuentacontableBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {cuentacontable.setcodigo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {cuentacontable.setnombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {cuentacontable.setcodigo_extranjero((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {cuentacontable.setnombre_extranjero((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {cuentacontable.setid_nivel_cuenta((Long) value);cuentacontable.setnivelcuenta_descripcion(cuentacontableBeanSwingJInternalFrame.getActualNivelCuentaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {cuentacontable.setid_cuenta_contable((Long) value);cuentacontable.setcuentacontable_descripcion(cuentacontableBeanSwingJInternalFrame.getActualCuentaContableForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {cuentacontable.setid_centro_costo((Long) value);cuentacontable.setcentrocosto_descripcion(cuentacontableBeanSwingJInternalFrame.getActualCentroCostoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {cuentacontable.setid_modulo((Long) value);cuentacontable.setmodulo_descripcion(cuentacontableBeanSwingJInternalFrame.getActualModuloForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {cuentacontable.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {cuentacontable.setes_movimiento((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {cuentacontable.setes_centro_costo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {cuentacontable.setes_centro_actividad((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {cuentacontable.setes_activo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {cuentacontable.setes_relacion((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {cuentacontable.setes_para_f52((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {cuentacontable.setid_moneda((Long) value);cuentacontable.setmoneda_descripcion(cuentacontableBeanSwingJInternalFrame.getActualMonedaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {cuentacontable.setid_tipo_intervalo((Long) value);cuentacontable.settipointervalo_descripcion(cuentacontableBeanSwingJInternalFrame.getActualTipoIntervaloForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {cuentacontable.setid_tipo_flujo_efectivo((Long) value);cuentacontable.settipoflujoefectivo_descripcion(cuentacontableBeanSwingJInternalFrame.getActualTipoFlujoEfectivoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {cuentacontable.setid_cuenta_contable_debito((Long) value);cuentacontable.setcuentacontabledebito_descripcion(cuentacontableBeanSwingJInternalFrame.getActualCuentaContableDebitoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {cuentacontable.setid_cuenta_contable_credito((Long) value);cuentacontable.setcuentacontablecredito_descripcion(cuentacontableBeanSwingJInternalFrame.getActualCuentaContableCreditoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {cuentacontable.setorden((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private CuentaContableDetalleFormJInternalFrame cuentacontableJInternalFrame=null;
		
		public CuentaContableModel(CuentaContableDetalleFormJInternalFrame cuentacontableJInternalFrame) {
			this.cuentacontableJInternalFrame=cuentacontableJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.cuentacontableJInternalFrame.getjButtonActualizarToolBarCuentaContable();
			
			if(component!=null && component.equals(this.cuentacontableJInternalFrame.getjButtonActualizarToolBarCuentaContable())) {
				componentTab=this.cuentacontableJInternalFrame.getjButtonEliminarToolBarCuentaContable();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cuentacontableJInternalFrame.getjButtonEliminarToolBarCuentaContable())) {
				componentTab=this.cuentacontableJInternalFrame.getjButtonCancelarToolBarCuentaContable();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cuentacontableJInternalFrame.getjButtonCancelarToolBarCuentaContable())) {
				componentTab=this.cuentacontableJInternalFrame.jComboBoxid_empresaCuentaContable;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.cuentacontableJInternalFrame.jTextFieldordenCuentaContable)) {
				componentTab=this.cuentacontableJInternalFrame.jComboBoxTiposAccionesFormularioCuentaContable;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cuentacontableJInternalFrame.jComboBoxTiposAccionesFormularioCuentaContable)) {
				componentTab=this.cuentacontableJInternalFrame.jButtonEliminarCuentaContable;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cuentacontableJInternalFrame.jButtonEliminarCuentaContable)) {
				componentTab=this.cuentacontableJInternalFrame.jButtonActualizarCuentaContable;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cuentacontableJInternalFrame.jButtonActualizarCuentaContable)) {
				componentTab=this.cuentacontableJInternalFrame.jButtonCancelarCuentaContable;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jComboBoxid_empresaCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jTextFieldcodigoCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jTextFieldcodigoCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jTextAreanombreCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jTextAreanombreCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jTextFieldcodigo_extranjeroCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jTextFieldcodigo_extranjeroCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jTextAreanombre_extranjeroCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jTextAreanombre_extranjeroCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jComboBoxid_nivel_cuentaCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jComboBoxid_nivel_cuentaCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jComboBoxid_cuenta_contableCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jComboBoxid_cuenta_contableCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jComboBoxid_centro_costoCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jComboBoxid_centro_costoCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jComboBoxid_moduloCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jComboBoxid_moduloCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jTextAreadescripcionCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jTextAreadescripcionCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jCheckBoxes_movimientoCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jCheckBoxes_movimientoCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jCheckBoxes_centro_costoCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jCheckBoxes_centro_costoCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jCheckBoxes_centro_actividadCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jCheckBoxes_centro_actividadCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jCheckBoxes_activoCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jCheckBoxes_activoCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jCheckBoxes_relacionCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jCheckBoxes_relacionCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jCheckBoxes_para_f52CuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jCheckBoxes_para_f52CuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jComboBoxid_monedaCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jComboBoxid_monedaCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jComboBoxid_tipo_intervaloCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jComboBoxid_tipo_intervaloCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jComboBoxid_tipo_flujo_efectivoCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jComboBoxid_tipo_flujo_efectivoCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jComboBoxid_cuenta_contable_debitoCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jComboBoxid_cuenta_contable_debitoCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jComboBoxid_cuenta_contable_creditoCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jComboBoxid_cuenta_contable_creditoCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jTextFieldordenCuentaContable;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.cuentacontableJInternalFrame.getjButtonActualizarToolBarCuentaContable();
			
			if(component!=null && component.equals(this.cuentacontableJInternalFrame.getjButtonEliminarToolBarCuentaContable())) {
				componentTab=this.cuentacontableJInternalFrame.getjButtonActualizarToolBarCuentaContable();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cuentacontableJInternalFrame.getjButtonCancelarToolBarCuentaContable())) {
				componentTab=this.cuentacontableJInternalFrame.getjButtonEliminarToolBarCuentaContable();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.cuentacontableJInternalFrame.jComboBoxid_empresaCuentaContable)) {
				
				componentTab=this.cuentacontableJInternalFrame.getjButtonCancelarToolBarCuentaContable();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.cuentacontableJInternalFrame.jComboBoxTiposAccionesFormularioCuentaContable)) {
				componentTab=this.cuentacontableJInternalFrame.jTextFieldordenCuentaContable;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.cuentacontableJInternalFrame.jButtonEliminarCuentaContable)) {
				componentTab=this.cuentacontableJInternalFrame.jComboBoxTiposAccionesFormularioCuentaContable;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cuentacontableJInternalFrame.jButtonActualizarCuentaContable)) {
				componentTab=this.cuentacontableJInternalFrame.jButtonEliminarCuentaContable;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cuentacontableJInternalFrame.jButtonCancelarCuentaContable)) {
				componentTab=this.cuentacontableJInternalFrame.jButtonActualizarCuentaContable;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jTextFieldcodigoCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jComboBoxid_empresaCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jTextAreanombreCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jTextFieldcodigoCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jTextFieldcodigo_extranjeroCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jTextAreanombreCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jTextAreanombre_extranjeroCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jTextFieldcodigo_extranjeroCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jComboBoxid_nivel_cuentaCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jTextAreanombre_extranjeroCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jComboBoxid_cuenta_contableCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jComboBoxid_nivel_cuentaCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jComboBoxid_centro_costoCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jComboBoxid_cuenta_contableCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jComboBoxid_moduloCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jComboBoxid_centro_costoCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jTextAreadescripcionCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jComboBoxid_moduloCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jCheckBoxes_movimientoCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jTextAreadescripcionCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jCheckBoxes_centro_costoCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jCheckBoxes_movimientoCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jCheckBoxes_centro_actividadCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jCheckBoxes_centro_costoCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jCheckBoxes_activoCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jCheckBoxes_centro_actividadCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jCheckBoxes_relacionCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jCheckBoxes_activoCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jCheckBoxes_para_f52CuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jCheckBoxes_relacionCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jComboBoxid_monedaCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jCheckBoxes_para_f52CuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jComboBoxid_tipo_intervaloCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jComboBoxid_monedaCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jComboBoxid_tipo_flujo_efectivoCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jComboBoxid_tipo_intervaloCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jComboBoxid_cuenta_contable_debitoCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jComboBoxid_tipo_flujo_efectivoCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jComboBoxid_cuenta_contable_creditoCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jComboBoxid_cuenta_contable_debitoCuentaContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentacontableJInternalFrame.jTextFieldordenCuentaContable)) {
			componentTab=this.cuentacontableJInternalFrame.jComboBoxid_cuenta_contable_creditoCuentaContable;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.cuentacontableJInternalFrame.getjButtonActualizarToolBarCuentaContable();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.cuentacontableJInternalFrame.getjButtonActualizarToolBarCuentaContable();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.cuentacontableJInternalFrame.getjButtonCancelarToolBarCuentaContable();
			
			
			return componentTab;		
		}
		
		public CuentaContableDetalleFormJInternalFrame getcuentacontableJInternalFrame() {
			return this.cuentacontableJInternalFrame;
		}
		
		public void setcuentacontableJInternalFrame(CuentaContableDetalleFormJInternalFrame cuentacontableJInternalFrame) {
			this.cuentacontableJInternalFrame=cuentacontableJInternalFrame;
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
