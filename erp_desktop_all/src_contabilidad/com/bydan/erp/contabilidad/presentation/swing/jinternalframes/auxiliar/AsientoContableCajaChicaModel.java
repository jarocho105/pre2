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

import com.bydan.erp.contabilidad.util.AsientoContableCajaChicaConstantesFunciones;
import com.bydan.erp.contabilidad.util.AsientoContableCajaChicaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.AsientoContableCajaChicaParameterGeneral;

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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.AsientoContableCajaChicaBeanSwingJInternalFrame;
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
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;






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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.AsientoContableCajaChicaJInternalFrame;

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.AsientoContableCajaChicaDetalleFormJInternalFrame;

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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.tesoreria.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class AsientoContableCajaChicaModel extends FocusTraversalPolicy implements TableModel, Serializable {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,AsientoContableCajaChicaConstantesFunciones.LABEL_ID
										,AsientoContableCajaChicaConstantesFunciones.LABEL_IDEMPRESA
										,AsientoContableCajaChicaConstantesFunciones.LABEL_IDSUCURSAL
										,AsientoContableCajaChicaConstantesFunciones.LABEL_IDEJERCICIO
										,AsientoContableCajaChicaConstantesFunciones.LABEL_IDPERIODO
										,AsientoContableCajaChicaConstantesFunciones.LABEL_IDUSUARIO
										,AsientoContableCajaChicaConstantesFunciones.LABEL_IDANIO
										,AsientoContableCajaChicaConstantesFunciones.LABEL_IDMES
										,AsientoContableCajaChicaConstantesFunciones.LABEL_SECUENCIAL
										,AsientoContableCajaChicaConstantesFunciones.LABEL_IDMONEDA
										,AsientoContableCajaChicaConstantesFunciones.LABEL_FECHA
										,AsientoContableCajaChicaConstantesFunciones.LABEL_IDEMPLEADO
										,AsientoContableCajaChicaConstantesFunciones.LABEL_IDESTADOASIENTOCONTABLECAJACHICA
										,AsientoContableCajaChicaConstantesFunciones.LABEL_ESPROVEEDOR
										,AsientoContableCajaChicaConstantesFunciones.LABEL_IDCLIENTE
										,AsientoContableCajaChicaConstantesFunciones.LABEL_IDTRANSACCION
										,AsientoContableCajaChicaConstantesFunciones.LABEL_IDTIPODOCUMENTO
										,AsientoContableCajaChicaConstantesFunciones.LABEL_IDCUENTACONTABLE
										,AsientoContableCajaChicaConstantesFunciones.LABEL_DETALLE
										,AsientoContableCajaChicaConstantesFunciones.LABEL_IDMODULO
										};
	   
	    public List<AsientoContableCajaChica> asientocontablecajachicas;
	  	 
	    //NO SE UTILIZA
	    public AsientoContableCajaChicaModel(List<AsientoContableCajaChica> asientocontablecajachicas,JInternalFrameBase jInternalFrameBase) {
	    	this.asientocontablecajachicas=asientocontablecajachicas;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public AsientoContableCajaChicaModel(JInternalFrameBase jInternalFrameBase) {
	    	this.asientocontablecajachicas=new ArrayList<AsientoContableCajaChica>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.asientocontablecajachicas.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.asientocontablecajachicas.get(rowIndex).getIsSelected();
	            
				case 1: return this.asientocontablecajachicas.get(rowIndex).getId();
				case 2: return this.asientocontablecajachicas.get(rowIndex).getid_empresa();
				case 3: return this.asientocontablecajachicas.get(rowIndex).getid_sucursal();
				case 4: return this.asientocontablecajachicas.get(rowIndex).getid_ejercicio();
				case 5: return this.asientocontablecajachicas.get(rowIndex).getid_periodo();
				case 6: return this.asientocontablecajachicas.get(rowIndex).getid_usuario();
				case 7: return this.asientocontablecajachicas.get(rowIndex).getid_anio();
				case 8: return this.asientocontablecajachicas.get(rowIndex).getid_mes();
				case 9: return this.asientocontablecajachicas.get(rowIndex).getsecuencial();
				case 10: return this.asientocontablecajachicas.get(rowIndex).getid_moneda();
				case 11: return this.asientocontablecajachicas.get(rowIndex).getfecha();
				case 12: return this.asientocontablecajachicas.get(rowIndex).getid_empleado();
				case 13: return this.asientocontablecajachicas.get(rowIndex).getid_estado_asiento_contable();
				case 14: return this.asientocontablecajachicas.get(rowIndex).getes_proveedor();
				case 15: return this.asientocontablecajachicas.get(rowIndex).getid_cliente();
				case 16: return this.asientocontablecajachicas.get(rowIndex).getid_transaccion();
				case 17: return this.asientocontablecajachicas.get(rowIndex).getid_tipo_documento();
				case 18: return this.asientocontablecajachicas.get(rowIndex).getid_cuenta_contable();
				case 19: return this.asientocontablecajachicas.get(rowIndex).getdetalle();
				case 20: return this.asientocontablecajachicas.get(rowIndex).getid_modulo();	            
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
				case 11: return Date.class;
				case 12: return Long.class;
				case 13: return Long.class;
				case 14: return Boolean.class;
				case 15: return Long.class;
				case 16: return Long.class;
				case 17: return Long.class;
				case 18: return Long.class;
				case 19: return String.class;
				case 20: return Long.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	AsientoContableCajaChica asientocontablecajachica = this.asientocontablecajachicas.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			AsientoContableCajaChicaBeanSwingJInternalFrame asientocontablecajachicaBeanSwingJInternalFrame=(AsientoContableCajaChicaBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {asientocontablecajachica.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {asientocontablecajachica.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {asientocontablecajachica.setid_empresa((Long) value);asientocontablecajachica.setempresa_descripcion(asientocontablecajachicaBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {asientocontablecajachica.setid_sucursal((Long) value);asientocontablecajachica.setsucursal_descripcion(asientocontablecajachicaBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {asientocontablecajachica.setid_ejercicio((Long) value);asientocontablecajachica.setejercicio_descripcion(asientocontablecajachicaBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {asientocontablecajachica.setid_periodo((Long) value);asientocontablecajachica.setperiodo_descripcion(asientocontablecajachicaBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {asientocontablecajachica.setid_usuario((Long) value);asientocontablecajachica.setusuario_descripcion(asientocontablecajachicaBeanSwingJInternalFrame.getActualUsuarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {asientocontablecajachica.setid_anio((Long) value);asientocontablecajachica.setanio_descripcion(asientocontablecajachicaBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {asientocontablecajachica.setid_mes((Long) value);asientocontablecajachica.setmes_descripcion(asientocontablecajachicaBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {asientocontablecajachica.setsecuencial((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {asientocontablecajachica.setid_moneda((Long) value);asientocontablecajachica.setmoneda_descripcion(asientocontablecajachicaBeanSwingJInternalFrame.getActualMonedaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {asientocontablecajachica.setfecha((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {asientocontablecajachica.setid_empleado((Long) value);asientocontablecajachica.setempleado_descripcion(asientocontablecajachicaBeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {asientocontablecajachica.setid_estado_asiento_contable((Long) value);asientocontablecajachica.setestadoasientocontablecajachica_descripcion(asientocontablecajachicaBeanSwingJInternalFrame.getActualEstadoAsientoContableCajaChicaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {asientocontablecajachica.setes_proveedor((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {asientocontablecajachica.setid_cliente((Long) value);asientocontablecajachica.setcliente_descripcion(asientocontablecajachicaBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {asientocontablecajachica.setid_transaccion((Long) value);asientocontablecajachica.settransaccion_descripcion(asientocontablecajachicaBeanSwingJInternalFrame.getActualTransaccionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {asientocontablecajachica.setid_tipo_documento((Long) value);asientocontablecajachica.settipodocumento_descripcion(asientocontablecajachicaBeanSwingJInternalFrame.getActualTipoDocumentoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {asientocontablecajachica.setid_cuenta_contable((Long) value);asientocontablecajachica.setcuentacontable_descripcion(asientocontablecajachicaBeanSwingJInternalFrame.getActualCuentaContableForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {asientocontablecajachica.setdetalle((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {asientocontablecajachica.setid_modulo((Long) value);asientocontablecajachica.setmodulo_descripcion(asientocontablecajachicaBeanSwingJInternalFrame.getActualModuloForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private AsientoContableCajaChicaDetalleFormJInternalFrame asientocontablecajachicaJInternalFrame=null;
		
		public AsientoContableCajaChicaModel(AsientoContableCajaChicaDetalleFormJInternalFrame asientocontablecajachicaJInternalFrame) {
			this.asientocontablecajachicaJInternalFrame=asientocontablecajachicaJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.asientocontablecajachicaJInternalFrame.getjButtonActualizarToolBarAsientoContableCajaChica();
			
			if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.getjButtonActualizarToolBarAsientoContableCajaChica())) {
				componentTab=this.asientocontablecajachicaJInternalFrame.getjButtonEliminarToolBarAsientoContableCajaChica();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.getjButtonEliminarToolBarAsientoContableCajaChica())) {
				componentTab=this.asientocontablecajachicaJInternalFrame.getjButtonCancelarToolBarAsientoContableCajaChica();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.getjButtonCancelarToolBarAsientoContableCajaChica())) {
				componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_empresaAsientoContableCajaChica;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_tipo_movimiento_moduloAsientoContableCajaChica)) {
				componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxTiposAccionesFormularioAsientoContableCajaChica;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxTiposAccionesFormularioAsientoContableCajaChica)) {
				componentTab=this.asientocontablecajachicaJInternalFrame.jButtonEliminarAsientoContableCajaChica;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jButtonEliminarAsientoContableCajaChica)) {
				componentTab=this.asientocontablecajachicaJInternalFrame.jButtonActualizarAsientoContableCajaChica;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jButtonActualizarAsientoContableCajaChica)) {
				componentTab=this.asientocontablecajachicaJInternalFrame.jButtonCancelarAsientoContableCajaChica;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_empresaAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_sucursalAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_sucursalAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_ejercicioAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_ejercicioAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_periodoAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_periodoAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_usuarioAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_usuarioAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_anioAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_anioAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_mesAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_mesAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jTextFieldsecuencialAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jTextFieldsecuencialAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_monedaAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_monedaAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jDateChooserfechaAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jDateChooserfechaAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_empleadoAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_empleadoAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_estado_asiento_contableAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_estado_asiento_contableAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jCheckBoxes_proveedorAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jCheckBoxes_proveedorAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_clienteAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_clienteAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_transaccionAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_transaccionAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_tipo_documentoAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_tipo_documentoAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_cuenta_contableAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_cuenta_contableAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jTextAreadetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jTextAreadetalleAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_moduloAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_moduloAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_tipo_movimientoAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_tipo_movimientoAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_tipo_transaccion_moduloAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_tipo_transaccion_moduloAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_tipo_movimiento_moduloAsientoContableCajaChica;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.asientocontablecajachicaJInternalFrame.getjButtonActualizarToolBarAsientoContableCajaChica();
			
			if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.getjButtonEliminarToolBarAsientoContableCajaChica())) {
				componentTab=this.asientocontablecajachicaJInternalFrame.getjButtonActualizarToolBarAsientoContableCajaChica();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.getjButtonCancelarToolBarAsientoContableCajaChica())) {
				componentTab=this.asientocontablecajachicaJInternalFrame.getjButtonEliminarToolBarAsientoContableCajaChica();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_empresaAsientoContableCajaChica)) {
				
				componentTab=this.asientocontablecajachicaJInternalFrame.getjButtonCancelarToolBarAsientoContableCajaChica();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxTiposAccionesFormularioAsientoContableCajaChica)) {
				componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_tipo_movimiento_moduloAsientoContableCajaChica;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jButtonEliminarAsientoContableCajaChica)) {
				componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxTiposAccionesFormularioAsientoContableCajaChica;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jButtonActualizarAsientoContableCajaChica)) {
				componentTab=this.asientocontablecajachicaJInternalFrame.jButtonEliminarAsientoContableCajaChica;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jButtonCancelarAsientoContableCajaChica)) {
				componentTab=this.asientocontablecajachicaJInternalFrame.jButtonActualizarAsientoContableCajaChica;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_sucursalAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_empresaAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_ejercicioAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_sucursalAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_periodoAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_ejercicioAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_usuarioAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_periodoAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_anioAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_usuarioAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_mesAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_anioAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jTextFieldsecuencialAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_mesAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_monedaAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jTextFieldsecuencialAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jDateChooserfechaAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_monedaAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_empleadoAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jDateChooserfechaAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_estado_asiento_contableAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_empleadoAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jCheckBoxes_proveedorAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_estado_asiento_contableAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_clienteAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jCheckBoxes_proveedorAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_transaccionAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_clienteAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_tipo_documentoAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_transaccionAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_cuenta_contableAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_tipo_documentoAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jTextAreadetalleAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_cuenta_contableAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_moduloAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jTextAreadetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_tipo_movimientoAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_moduloAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_tipo_transaccion_moduloAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_tipo_movimientoAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontablecajachicaJInternalFrame.jComboBoxid_tipo_movimiento_moduloAsientoContableCajaChica)) {
			componentTab=this.asientocontablecajachicaJInternalFrame.jComboBoxid_tipo_transaccion_moduloAsientoContableCajaChica;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.asientocontablecajachicaJInternalFrame.getjButtonActualizarToolBarAsientoContableCajaChica();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.asientocontablecajachicaJInternalFrame.getjButtonActualizarToolBarAsientoContableCajaChica();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.asientocontablecajachicaJInternalFrame.getjButtonCancelarToolBarAsientoContableCajaChica();
			
			
			return componentTab;		
		}
		
		public AsientoContableCajaChicaDetalleFormJInternalFrame getasientocontablecajachicaJInternalFrame() {
			return this.asientocontablecajachicaJInternalFrame;
		}
		
		public void setasientocontablecajachicaJInternalFrame(AsientoContableCajaChicaDetalleFormJInternalFrame asientocontablecajachicaJInternalFrame) {
			this.asientocontablecajachicaJInternalFrame=asientocontablecajachicaJInternalFrame;
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
