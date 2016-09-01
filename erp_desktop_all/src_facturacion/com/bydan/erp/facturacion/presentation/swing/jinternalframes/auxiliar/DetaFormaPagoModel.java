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

import com.bydan.erp.facturacion.util.DetaFormaPagoConstantesFunciones;
import com.bydan.erp.facturacion.util.DetaFormaPagoParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.DetaFormaPagoParameterGeneral;

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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.DetaFormaPagoBeanSwingJInternalFrame;
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
import com.bydan.erp.tesoreria.business.logic.*;

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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.DetaFormaPagoJInternalFrame;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.DetaFormaPagoDetalleFormJInternalFrame;

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
import com.bydan.erp.tesoreria.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.tesoreria.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class DetaFormaPagoModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,DetaFormaPagoConstantesFunciones.LABEL_ID
										,DetaFormaPagoConstantesFunciones.LABEL_IDEMPRESA
										,DetaFormaPagoConstantesFunciones.LABEL_IDSUCURSAL
										,DetaFormaPagoConstantesFunciones.LABEL_IDEJERCICIO
										,DetaFormaPagoConstantesFunciones.LABEL_IDPERIODO
										,DetaFormaPagoConstantesFunciones.LABEL_IDFACTURA
										,DetaFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO
										,DetaFormaPagoConstantesFunciones.LABEL_IDTIPODETAFORMAPAGO
										,DetaFormaPagoConstantesFunciones.LABEL_IDDETAFORMAPAGOFACTU
										,DetaFormaPagoConstantesFunciones.LABEL_IDCUENTACONTABLE
										,DetaFormaPagoConstantesFunciones.LABEL_IDTIPORETENCION
										,DetaFormaPagoConstantesFunciones.LABEL_VALOR
										,DetaFormaPagoConstantesFunciones.LABEL_FECHAINICIAL
										,DetaFormaPagoConstantesFunciones.LABEL_FECHAFINAL
										,DetaFormaPagoConstantesFunciones.LABEL_PORCENTAJE
										,DetaFormaPagoConstantesFunciones.LABEL_RETENCION
										,DetaFormaPagoConstantesFunciones.LABEL_PORCENTAJERETENCION
										,DetaFormaPagoConstantesFunciones.LABEL_BASERETENCION
										,DetaFormaPagoConstantesFunciones.LABEL_VALORRETENCION
										,DetaFormaPagoConstantesFunciones.LABEL_NUMERORETENCION
										,DetaFormaPagoConstantesFunciones.LABEL_NUMERODIAS
										,DetaFormaPagoConstantesFunciones.LABEL_NUMEROCUOTA
										,DetaFormaPagoConstantesFunciones.LABEL_DESCRIPCION
										,DetaFormaPagoConstantesFunciones.LABEL_IDANIO
										,DetaFormaPagoConstantesFunciones.LABEL_IDMES
										};
	   
	    public List<DetaFormaPago> detaformapagos;
	  	 
	    //NO SE UTILIZA
	    public DetaFormaPagoModel(List<DetaFormaPago> detaformapagos,JInternalFrameBase jInternalFrameBase) {
	    	this.detaformapagos=detaformapagos;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public DetaFormaPagoModel(JInternalFrameBase jInternalFrameBase) {
	    	this.detaformapagos=new ArrayList<DetaFormaPago>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.detaformapagos.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.detaformapagos.get(rowIndex).getIsSelected();
	            
				case 1: return this.detaformapagos.get(rowIndex).getId();
				case 2: return this.detaformapagos.get(rowIndex).getid_empresa();
				case 3: return this.detaformapagos.get(rowIndex).getid_sucursal();
				case 4: return this.detaformapagos.get(rowIndex).getid_ejercicio();
				case 5: return this.detaformapagos.get(rowIndex).getid_periodo();
				case 6: return this.detaformapagos.get(rowIndex).getid_factura();
				case 7: return this.detaformapagos.get(rowIndex).getid_tipo_forma_pago();
				case 8: return this.detaformapagos.get(rowIndex).getid_tipo_deta_forma_pago();
				case 9: return this.detaformapagos.get(rowIndex).getid_deta_forma_pago_factu();
				case 10: return this.detaformapagos.get(rowIndex).getid_cuenta_contable();
				case 11: return this.detaformapagos.get(rowIndex).getid_tipo_retencion();
				case 12: return this.detaformapagos.get(rowIndex).getvalor();
				case 13: return this.detaformapagos.get(rowIndex).getfecha_inicial();
				case 14: return this.detaformapagos.get(rowIndex).getfecha_final();
				case 15: return this.detaformapagos.get(rowIndex).getporcentaje();
				case 16: return this.detaformapagos.get(rowIndex).getretencion();
				case 17: return this.detaformapagos.get(rowIndex).getporcentaje_retencion();
				case 18: return this.detaformapagos.get(rowIndex).getbase_retencion();
				case 19: return this.detaformapagos.get(rowIndex).getvalor_retencion();
				case 20: return this.detaformapagos.get(rowIndex).getnumero_retencion();
				case 21: return this.detaformapagos.get(rowIndex).getnumero_dias();
				case 22: return this.detaformapagos.get(rowIndex).getnumero_cuota();
				case 23: return this.detaformapagos.get(rowIndex).getdescripcion();
				case 24: return this.detaformapagos.get(rowIndex).getid_anio();
				case 25: return this.detaformapagos.get(rowIndex).getid_mes();	            
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
				case 12: return Double.class;
				case 13: return Date.class;
				case 14: return Date.class;
				case 15: return Double.class;
				case 16: return Double.class;
				case 17: return Double.class;
				case 18: return Double.class;
				case 19: return Double.class;
				case 20: return String.class;
				case 21: return Integer.class;
				case 22: return Integer.class;
				case 23: return String.class;
				case 24: return Long.class;
				case 25: return Long.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	DetaFormaPago detaformapago = this.detaformapagos.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			DetaFormaPagoBeanSwingJInternalFrame detaformapagoBeanSwingJInternalFrame=(DetaFormaPagoBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {detaformapago.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {detaformapago.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {detaformapago.setid_empresa((Long) value);detaformapago.setempresa_descripcion(detaformapagoBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {detaformapago.setid_sucursal((Long) value);detaformapago.setsucursal_descripcion(detaformapagoBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {detaformapago.setid_ejercicio((Long) value);detaformapago.setejercicio_descripcion(detaformapagoBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {detaformapago.setid_periodo((Long) value);detaformapago.setperiodo_descripcion(detaformapagoBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {detaformapago.setid_factura((Long) value);detaformapago.setfactura_descripcion(detaformapagoBeanSwingJInternalFrame.getActualFacturaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {detaformapago.setid_tipo_forma_pago((Long) value);detaformapago.settipoformapago_descripcion(detaformapagoBeanSwingJInternalFrame.getActualTipoFormaPagoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {detaformapago.setid_tipo_deta_forma_pago((Long) value);detaformapago.settipodetaformapago_descripcion(detaformapagoBeanSwingJInternalFrame.getActualTipoDetaFormaPagoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {detaformapago.setid_deta_forma_pago_factu((Long) value);detaformapago.setdetaformapagofactu_descripcion(detaformapagoBeanSwingJInternalFrame.getActualDetaFormaPagoFactuForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {detaformapago.setid_cuenta_contable((Long) value);detaformapago.setcuentacontable_descripcion(detaformapagoBeanSwingJInternalFrame.getActualCuentaContableForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {detaformapago.setid_tipo_retencion((Long) value);detaformapago.settiporetencion_descripcion(detaformapagoBeanSwingJInternalFrame.getActualTipoRetencionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {detaformapago.setvalor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {detaformapago.setfecha_inicial((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {detaformapago.setfecha_final((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {detaformapago.setporcentaje((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {detaformapago.setretencion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {detaformapago.setporcentaje_retencion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {detaformapago.setbase_retencion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {detaformapago.setvalor_retencion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {detaformapago.setnumero_retencion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {detaformapago.setnumero_dias((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {detaformapago.setnumero_cuota((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {detaformapago.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {detaformapago.setid_anio((Long) value);detaformapago.setanio_descripcion(detaformapagoBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {detaformapago.setid_mes((Long) value);detaformapago.setmes_descripcion(detaformapagoBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public DetaFormaPagoModel(JInternalFrameBase jInternalFrameBase) {
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
		private DetaFormaPagoDetalleFormJInternalFrame detaformapagoJInternalFrame=null;
		
		public DetaFormaPagoModel(DetaFormaPagoDetalleFormJInternalFrame detaformapagoJInternalFrame) {
			this.detaformapagoJInternalFrame=detaformapagoJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.detaformapagoJInternalFrame.getjButtonActualizarToolBarDetaFormaPago();
			
			if(component!=null && component.equals(this.detaformapagoJInternalFrame.getjButtonActualizarToolBarDetaFormaPago())) {
				componentTab=this.detaformapagoJInternalFrame.getjButtonEliminarToolBarDetaFormaPago();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detaformapagoJInternalFrame.getjButtonEliminarToolBarDetaFormaPago())) {
				componentTab=this.detaformapagoJInternalFrame.getjButtonCancelarToolBarDetaFormaPago();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detaformapagoJInternalFrame.getjButtonCancelarToolBarDetaFormaPago())) {
				componentTab=this.detaformapagoJInternalFrame.jComboBoxid_empresaDetaFormaPago;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.detaformapagoJInternalFrame.jComboBoxid_mesDetaFormaPago)) {
				componentTab=this.detaformapagoJInternalFrame.jComboBoxTiposAccionesFormularioDetaFormaPago;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detaformapagoJInternalFrame.jComboBoxTiposAccionesFormularioDetaFormaPago)) {
				componentTab=this.detaformapagoJInternalFrame.jButtonEliminarDetaFormaPago;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detaformapagoJInternalFrame.jButtonEliminarDetaFormaPago)) {
				componentTab=this.detaformapagoJInternalFrame.jButtonActualizarDetaFormaPago;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detaformapagoJInternalFrame.jButtonActualizarDetaFormaPago)) {
				componentTab=this.detaformapagoJInternalFrame.jButtonCancelarDetaFormaPago;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jComboBoxid_empresaDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jComboBoxid_sucursalDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jComboBoxid_sucursalDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jComboBoxid_ejercicioDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jComboBoxid_ejercicioDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jComboBoxid_periodoDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jComboBoxid_periodoDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jComboBoxid_facturaDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jComboBoxid_facturaDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jComboBoxid_tipo_forma_pagoDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jComboBoxid_tipo_forma_pagoDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jComboBoxid_tipo_deta_forma_pagoDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jComboBoxid_tipo_deta_forma_pagoDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jComboBoxid_deta_forma_pago_factuDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jComboBoxid_deta_forma_pago_factuDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jComboBoxid_cuenta_contableDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jComboBoxid_cuenta_contableDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jComboBoxid_tipo_retencionDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jComboBoxid_tipo_retencionDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jTextFieldvalorDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jTextFieldvalorDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jDateChooserfecha_inicialDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jDateChooserfecha_inicialDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jDateChooserfecha_finalDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jDateChooserfecha_finalDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jTextFieldporcentajeDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jTextFieldporcentajeDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jTextFieldretencionDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jTextFieldretencionDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jTextFieldporcentaje_retencionDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jTextFieldporcentaje_retencionDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jTextFieldbase_retencionDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jTextFieldbase_retencionDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jTextFieldvalor_retencionDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jTextFieldvalor_retencionDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jTextFieldnumero_retencionDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jTextFieldnumero_retencionDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jTextFieldnumero_diasDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jTextFieldnumero_diasDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jTextFieldnumero_cuotaDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jTextFieldnumero_cuotaDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jTextAreadescripcionDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jTextAreadescripcionDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jComboBoxid_anioDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jComboBoxid_anioDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jComboBoxid_mesDetaFormaPago;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.detaformapagoJInternalFrame.getjButtonActualizarToolBarDetaFormaPago();
			
			if(component!=null && component.equals(this.detaformapagoJInternalFrame.getjButtonEliminarToolBarDetaFormaPago())) {
				componentTab=this.detaformapagoJInternalFrame.getjButtonActualizarToolBarDetaFormaPago();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detaformapagoJInternalFrame.getjButtonCancelarToolBarDetaFormaPago())) {
				componentTab=this.detaformapagoJInternalFrame.getjButtonEliminarToolBarDetaFormaPago();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detaformapagoJInternalFrame.jComboBoxid_empresaDetaFormaPago)) {
				
				componentTab=this.detaformapagoJInternalFrame.getjButtonCancelarToolBarDetaFormaPago();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detaformapagoJInternalFrame.jComboBoxTiposAccionesFormularioDetaFormaPago)) {
				componentTab=this.detaformapagoJInternalFrame.jComboBoxid_mesDetaFormaPago;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detaformapagoJInternalFrame.jButtonEliminarDetaFormaPago)) {
				componentTab=this.detaformapagoJInternalFrame.jComboBoxTiposAccionesFormularioDetaFormaPago;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detaformapagoJInternalFrame.jButtonActualizarDetaFormaPago)) {
				componentTab=this.detaformapagoJInternalFrame.jButtonEliminarDetaFormaPago;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detaformapagoJInternalFrame.jButtonCancelarDetaFormaPago)) {
				componentTab=this.detaformapagoJInternalFrame.jButtonActualizarDetaFormaPago;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jComboBoxid_sucursalDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jComboBoxid_empresaDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jComboBoxid_ejercicioDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jComboBoxid_sucursalDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jComboBoxid_periodoDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jComboBoxid_ejercicioDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jComboBoxid_facturaDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jComboBoxid_periodoDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jComboBoxid_tipo_forma_pagoDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jComboBoxid_facturaDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jComboBoxid_tipo_deta_forma_pagoDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jComboBoxid_tipo_forma_pagoDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jComboBoxid_deta_forma_pago_factuDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jComboBoxid_tipo_deta_forma_pagoDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jComboBoxid_cuenta_contableDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jComboBoxid_deta_forma_pago_factuDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jComboBoxid_tipo_retencionDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jComboBoxid_cuenta_contableDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jTextFieldvalorDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jComboBoxid_tipo_retencionDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jDateChooserfecha_inicialDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jTextFieldvalorDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jDateChooserfecha_finalDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jDateChooserfecha_inicialDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jTextFieldporcentajeDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jDateChooserfecha_finalDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jTextFieldretencionDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jTextFieldporcentajeDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jTextFieldporcentaje_retencionDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jTextFieldretencionDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jTextFieldbase_retencionDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jTextFieldporcentaje_retencionDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jTextFieldvalor_retencionDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jTextFieldbase_retencionDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jTextFieldnumero_retencionDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jTextFieldvalor_retencionDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jTextFieldnumero_diasDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jTextFieldnumero_retencionDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jTextFieldnumero_cuotaDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jTextFieldnumero_diasDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jTextAreadescripcionDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jTextFieldnumero_cuotaDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jComboBoxid_anioDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jTextAreadescripcionDetaFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.detaformapagoJInternalFrame.jComboBoxid_mesDetaFormaPago)) {
			componentTab=this.detaformapagoJInternalFrame.jComboBoxid_anioDetaFormaPago;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.detaformapagoJInternalFrame.getjButtonActualizarToolBarDetaFormaPago();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.detaformapagoJInternalFrame.getjButtonActualizarToolBarDetaFormaPago();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.detaformapagoJInternalFrame.getjButtonCancelarToolBarDetaFormaPago();
			
			
			return componentTab;		
		}
		
		public DetaFormaPagoDetalleFormJInternalFrame getdetaformapagoJInternalFrame() {
			return this.detaformapagoJInternalFrame;
		}
		
		public void setdetaformapagoJInternalFrame(DetaFormaPagoDetalleFormJInternalFrame detaformapagoJInternalFrame) {
			this.detaformapagoJInternalFrame=detaformapagoJInternalFrame;
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
