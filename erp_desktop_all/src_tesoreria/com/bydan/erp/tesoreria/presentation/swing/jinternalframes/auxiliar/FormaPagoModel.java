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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.tesoreria.util.FormaPagoConstantesFunciones;
import com.bydan.erp.tesoreria.util.FormaPagoParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.FormaPagoParameterGeneral;

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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.FormaPagoBeanSwingJInternalFrame;
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
import com.bydan.erp.tesoreria.resources.reportes.AuxiliarReportes;


import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.tesoreria.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;






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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.FormaPagoJInternalFrame;

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.FormaPagoDetalleFormJInternalFrame;

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
import com.bydan.erp.facturacion.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class FormaPagoModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,FormaPagoConstantesFunciones.LABEL_ID
										,FormaPagoConstantesFunciones.LABEL_IDEMPRESA
										,FormaPagoConstantesFunciones.LABEL_IDSUCURSAL
										,FormaPagoConstantesFunciones.LABEL_IDMODULO
										,FormaPagoConstantesFunciones.LABEL_IDEJERCICIO
										,FormaPagoConstantesFunciones.LABEL_IDPERIODO
										,FormaPagoConstantesFunciones.LABEL_IDANIO
										,FormaPagoConstantesFunciones.LABEL_IDMES
										,FormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO
										,FormaPagoConstantesFunciones.LABEL_NOMBRE
										,FormaPagoConstantesFunciones.LABEL_SIGLAS
										,FormaPagoConstantesFunciones.LABEL_NUMERODIAS
										,FormaPagoConstantesFunciones.LABEL_PORCENTAJE
										,FormaPagoConstantesFunciones.LABEL_VALOR
										,FormaPagoConstantesFunciones.LABEL_CONDETALLE
										,FormaPagoConstantesFunciones.LABEL_CONREMESA
										,FormaPagoConstantesFunciones.LABEL_CONMANEJACUOTAS
										,FormaPagoConstantesFunciones.LABEL_FECHA
										,FormaPagoConstantesFunciones.LABEL_FECHAFIN
										,FormaPagoConstantesFunciones.LABEL_IDTRANSACCION
										,FormaPagoConstantesFunciones.LABEL_IDCUENTACONTABLE
										,FormaPagoConstantesFunciones.LABEL_IDCUENTACONTABLERETE
										,FormaPagoConstantesFunciones.LABEL_PORCENTAJERETE
										,FormaPagoConstantesFunciones.LABEL_BASERETENCION
										,FormaPagoConstantesFunciones.LABEL_VALORRETENCION
										,FormaPagoConstantesFunciones.LABEL_NUMERORETENCION
										,FormaPagoConstantesFunciones.LABEL_NOMBRERETENCION
										};
	   
	    public List<FormaPago> formapagos;
	  	 
	    //NO SE UTILIZA
	    public FormaPagoModel(List<FormaPago> formapagos,JInternalFrameBase jInternalFrameBase) {
	    	this.formapagos=formapagos;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public FormaPagoModel(JInternalFrameBase jInternalFrameBase) {
	    	this.formapagos=new ArrayList<FormaPago>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.formapagos.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.formapagos.get(rowIndex).getIsSelected();
	            
				case 1: return this.formapagos.get(rowIndex).getId();
				case 2: return this.formapagos.get(rowIndex).getid_empresa();
				case 3: return this.formapagos.get(rowIndex).getid_sucursal();
				case 4: return this.formapagos.get(rowIndex).getid_modulo();
				case 5: return this.formapagos.get(rowIndex).getid_ejercicio();
				case 6: return this.formapagos.get(rowIndex).getid_periodo();
				case 7: return this.formapagos.get(rowIndex).getid_anio();
				case 8: return this.formapagos.get(rowIndex).getid_mes();
				case 9: return this.formapagos.get(rowIndex).getid_tipo_forma_pago();
				case 10: return this.formapagos.get(rowIndex).getnombre();
				case 11: return this.formapagos.get(rowIndex).getsiglas();
				case 12: return this.formapagos.get(rowIndex).getnumero_dias();
				case 13: return this.formapagos.get(rowIndex).getporcentaje();
				case 14: return this.formapagos.get(rowIndex).getvalor();
				case 15: return this.formapagos.get(rowIndex).getcon_detalle();
				case 16: return this.formapagos.get(rowIndex).getcon_remesa();
				case 17: return this.formapagos.get(rowIndex).getcon_maneja_cuotas();
				case 18: return this.formapagos.get(rowIndex).getfecha();
				case 19: return this.formapagos.get(rowIndex).getfecha_fin();
				case 20: return this.formapagos.get(rowIndex).getid_transaccion();
				case 21: return this.formapagos.get(rowIndex).getid_cuenta_contable();
				case 22: return this.formapagos.get(rowIndex).getid_cuenta_contable_rete();
				case 23: return this.formapagos.get(rowIndex).getporcentaje_rete();
				case 24: return this.formapagos.get(rowIndex).getbase_retencion();
				case 25: return this.formapagos.get(rowIndex).getvalor_retencion();
				case 26: return this.formapagos.get(rowIndex).getnumero_retencion();
				case 27: return this.formapagos.get(rowIndex).getnombre_retencion();	            
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
				case 10: return String.class;
				case 11: return String.class;
				case 12: return Integer.class;
				case 13: return Double.class;
				case 14: return Double.class;
				case 15: return Boolean.class;
				case 16: return Boolean.class;
				case 17: return Boolean.class;
				case 18: return Date.class;
				case 19: return Date.class;
				case 20: return Long.class;
				case 21: return Long.class;
				case 22: return Long.class;
				case 23: return Double.class;
				case 24: return Double.class;
				case 25: return Double.class;
				case 26: return String.class;
				case 27: return String.class;	            
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
				case 27: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	FormaPago formapago = this.formapagos.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			FormaPagoBeanSwingJInternalFrame formapagoBeanSwingJInternalFrame=(FormaPagoBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {formapago.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {formapago.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {formapago.setid_empresa((Long) value);formapago.setempresa_descripcion(formapagoBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {formapago.setid_sucursal((Long) value);formapago.setsucursal_descripcion(formapagoBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {formapago.setid_modulo((Long) value);formapago.setmodulo_descripcion(formapagoBeanSwingJInternalFrame.getActualModuloForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {formapago.setid_ejercicio((Long) value);formapago.setejercicio_descripcion(formapagoBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {formapago.setid_periodo((Long) value);formapago.setperiodo_descripcion(formapagoBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {formapago.setid_anio((Long) value);formapago.setanio_descripcion(formapagoBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {formapago.setid_mes((Long) value);formapago.setmes_descripcion(formapagoBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {formapago.setid_tipo_forma_pago((Long) value);formapago.settipoformapago_descripcion(formapagoBeanSwingJInternalFrame.getActualTipoFormaPagoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {formapago.setnombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {formapago.setsiglas((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {formapago.setnumero_dias((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {formapago.setporcentaje((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {formapago.setvalor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {formapago.setcon_detalle((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {formapago.setcon_remesa((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {formapago.setcon_maneja_cuotas((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {formapago.setfecha((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {formapago.setfecha_fin((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {formapago.setid_transaccion((Long) value);formapago.settransaccion_descripcion(formapagoBeanSwingJInternalFrame.getActualTransaccionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {formapago.setid_cuenta_contable((Long) value);formapago.setcuentacontable_descripcion(formapagoBeanSwingJInternalFrame.getActualCuentaContableForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {formapago.setid_cuenta_contable_rete((Long) value);formapago.setcuentacontablerete_descripcion(formapagoBeanSwingJInternalFrame.getActualCuentaContableReteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {formapago.setporcentaje_rete((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {formapago.setbase_retencion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {formapago.setvalor_retencion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {formapago.setnumero_retencion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {formapago.setnombre_retencion((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public FormaPagoModel(JInternalFrameBase jInternalFrameBase) {
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
		private FormaPagoDetalleFormJInternalFrame formapagoJInternalFrame=null;
		
		public FormaPagoModel(FormaPagoDetalleFormJInternalFrame formapagoJInternalFrame) {
			this.formapagoJInternalFrame=formapagoJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.formapagoJInternalFrame.getjButtonActualizarToolBarFormaPago();
			
			if(component!=null && component.equals(this.formapagoJInternalFrame.getjButtonActualizarToolBarFormaPago())) {
				componentTab=this.formapagoJInternalFrame.getjButtonEliminarToolBarFormaPago();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.formapagoJInternalFrame.getjButtonEliminarToolBarFormaPago())) {
				componentTab=this.formapagoJInternalFrame.getjButtonCancelarToolBarFormaPago();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.formapagoJInternalFrame.getjButtonCancelarToolBarFormaPago())) {
				componentTab=this.formapagoJInternalFrame.jComboBoxid_empresaFormaPago;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.formapagoJInternalFrame.jTextAreanombre_retencionFormaPago)) {
				componentTab=this.formapagoJInternalFrame.jComboBoxTiposAccionesFormularioFormaPago;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.formapagoJInternalFrame.jComboBoxTiposAccionesFormularioFormaPago)) {
				componentTab=this.formapagoJInternalFrame.jButtonEliminarFormaPago;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.formapagoJInternalFrame.jButtonEliminarFormaPago)) {
				componentTab=this.formapagoJInternalFrame.jButtonActualizarFormaPago;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.formapagoJInternalFrame.jButtonActualizarFormaPago)) {
				componentTab=this.formapagoJInternalFrame.jButtonCancelarFormaPago;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.formapagoJInternalFrame.jComboBoxid_empresaFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jComboBoxid_sucursalFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jComboBoxid_sucursalFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jComboBoxid_moduloFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jComboBoxid_moduloFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jComboBoxid_ejercicioFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jComboBoxid_ejercicioFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jComboBoxid_periodoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jComboBoxid_periodoFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jComboBoxid_anioFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jComboBoxid_anioFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jComboBoxid_mesFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jComboBoxid_mesFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jComboBoxid_tipo_forma_pagoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jComboBoxid_tipo_forma_pagoFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jTextAreanombreFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jTextAreanombreFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jTextFieldsiglasFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jTextFieldsiglasFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jTextFieldnumero_diasFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jTextFieldnumero_diasFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jTextFieldporcentajeFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jTextFieldporcentajeFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jTextFieldvalorFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jTextFieldvalorFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jCheckBoxcon_detalleFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jCheckBoxcon_detalleFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jCheckBoxcon_remesaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jCheckBoxcon_remesaFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jCheckBoxcon_maneja_cuotasFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jCheckBoxcon_maneja_cuotasFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jDateChooserfechaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jDateChooserfechaFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jDateChooserfecha_finFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jDateChooserfecha_finFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jComboBoxid_transaccionFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jComboBoxid_transaccionFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jComboBoxid_tipo_transaccion_moduloFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jComboBoxid_tipo_transaccion_moduloFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jComboBoxid_cuenta_contableFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jComboBoxid_cuenta_contableFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jComboBoxid_cuenta_contable_reteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jComboBoxid_cuenta_contable_reteFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jTextFieldporcentaje_reteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jTextFieldporcentaje_reteFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jTextFieldbase_retencionFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jTextFieldbase_retencionFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jTextFieldvalor_retencionFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jTextFieldvalor_retencionFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jTextFieldnumero_retencionFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jTextFieldnumero_retencionFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jTextAreanombre_retencionFormaPago;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.formapagoJInternalFrame.getjButtonActualizarToolBarFormaPago();
			
			if(component!=null && component.equals(this.formapagoJInternalFrame.getjButtonEliminarToolBarFormaPago())) {
				componentTab=this.formapagoJInternalFrame.getjButtonActualizarToolBarFormaPago();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.formapagoJInternalFrame.getjButtonCancelarToolBarFormaPago())) {
				componentTab=this.formapagoJInternalFrame.getjButtonEliminarToolBarFormaPago();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.formapagoJInternalFrame.jComboBoxid_empresaFormaPago)) {
				
				componentTab=this.formapagoJInternalFrame.getjButtonCancelarToolBarFormaPago();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.formapagoJInternalFrame.jComboBoxTiposAccionesFormularioFormaPago)) {
				componentTab=this.formapagoJInternalFrame.jTextAreanombre_retencionFormaPago;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.formapagoJInternalFrame.jButtonEliminarFormaPago)) {
				componentTab=this.formapagoJInternalFrame.jComboBoxTiposAccionesFormularioFormaPago;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.formapagoJInternalFrame.jButtonActualizarFormaPago)) {
				componentTab=this.formapagoJInternalFrame.jButtonEliminarFormaPago;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.formapagoJInternalFrame.jButtonCancelarFormaPago)) {
				componentTab=this.formapagoJInternalFrame.jButtonActualizarFormaPago;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.formapagoJInternalFrame.jComboBoxid_sucursalFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jComboBoxid_empresaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jComboBoxid_moduloFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jComboBoxid_sucursalFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jComboBoxid_ejercicioFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jComboBoxid_moduloFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jComboBoxid_periodoFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jComboBoxid_ejercicioFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jComboBoxid_anioFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jComboBoxid_periodoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jComboBoxid_mesFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jComboBoxid_anioFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jComboBoxid_tipo_forma_pagoFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jComboBoxid_mesFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jTextAreanombreFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jComboBoxid_tipo_forma_pagoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jTextFieldsiglasFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jTextAreanombreFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jTextFieldnumero_diasFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jTextFieldsiglasFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jTextFieldporcentajeFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jTextFieldnumero_diasFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jTextFieldvalorFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jTextFieldporcentajeFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jCheckBoxcon_detalleFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jTextFieldvalorFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jCheckBoxcon_remesaFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jCheckBoxcon_detalleFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jCheckBoxcon_maneja_cuotasFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jCheckBoxcon_remesaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jDateChooserfechaFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jCheckBoxcon_maneja_cuotasFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jDateChooserfecha_finFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jDateChooserfechaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jComboBoxid_transaccionFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jDateChooserfecha_finFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jComboBoxid_tipo_transaccion_moduloFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jComboBoxid_transaccionFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jComboBoxid_cuenta_contableFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jComboBoxid_tipo_transaccion_moduloFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jComboBoxid_cuenta_contable_reteFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jComboBoxid_cuenta_contableFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jTextFieldporcentaje_reteFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jComboBoxid_cuenta_contable_reteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jTextFieldbase_retencionFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jTextFieldporcentaje_reteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jTextFieldvalor_retencionFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jTextFieldbase_retencionFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jTextFieldnumero_retencionFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jTextFieldvalor_retencionFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagoJInternalFrame.jTextAreanombre_retencionFormaPago)) {
			componentTab=this.formapagoJInternalFrame.jTextFieldnumero_retencionFormaPago;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.formapagoJInternalFrame.getjButtonActualizarToolBarFormaPago();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.formapagoJInternalFrame.getjButtonActualizarToolBarFormaPago();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.formapagoJInternalFrame.getjButtonCancelarToolBarFormaPago();
			
			
			return componentTab;		
		}
		
		public FormaPagoDetalleFormJInternalFrame getformapagoJInternalFrame() {
			return this.formapagoJInternalFrame;
		}
		
		public void setformapagoJInternalFrame(FormaPagoDetalleFormJInternalFrame formapagoJInternalFrame) {
			this.formapagoJInternalFrame=formapagoJInternalFrame;
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
