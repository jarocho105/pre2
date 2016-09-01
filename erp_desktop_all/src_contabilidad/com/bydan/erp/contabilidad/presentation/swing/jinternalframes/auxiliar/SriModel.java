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

import com.bydan.erp.contabilidad.util.SriConstantesFunciones;
import com.bydan.erp.contabilidad.util.SriParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.SriParameterGeneral;

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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.SriBeanSwingJInternalFrame;
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

import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.SriJInternalFrame;

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.SriDetalleFormJInternalFrame;

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



import com.bydan.erp.cartera.business.entity.*;


import com.bydan.erp.cartera.util.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class SriModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,SriConstantesFunciones.LABEL_ID
										,SriConstantesFunciones.LABEL_IDASIENTOCONTABLE
										,SriConstantesFunciones.LABEL_IDTRANSACCIONCONTA
										,SriConstantesFunciones.LABEL_RUC
										,SriConstantesFunciones.LABEL_IDCLIENTE
										,SriConstantesFunciones.LABEL_RAZONSOCIAL
										,SriConstantesFunciones.LABEL_IDTIPOCOMPROBANTE
										,SriConstantesFunciones.LABEL_ESRISE
										,SriConstantesFunciones.LABEL_NUMEROSERIE
										,SriConstantesFunciones.LABEL_NUMEROAUTORIZACION
										,SriConstantesFunciones.LABEL_NUMEROSECUENCIAL
										,SriConstantesFunciones.LABEL_FECHAEMISION
										,SriConstantesFunciones.LABEL_FECHAREGISTROCONTABLE
										,SriConstantesFunciones.LABEL_FECHACADUCIDAD
										,SriConstantesFunciones.LABEL_IDTIPOTRIBUTARIO
										,SriConstantesFunciones.LABEL_BIENESTAR12
										,SriConstantesFunciones.LABEL_BIENESTAR0
										,SriConstantesFunciones.LABEL_IDTIPOIVA
										,SriConstantesFunciones.LABEL_SERVICIOSTAR12
										,SriConstantesFunciones.LABEL_SERVICIOSTAR0
										,SriConstantesFunciones.LABEL_MONTOIVA
										,SriConstantesFunciones.LABEL_BASEIMPOTAR12
										,SriConstantesFunciones.LABEL_BASEIMPOTAR0
										,SriConstantesFunciones.LABEL_MONTOICE
										,SriConstantesFunciones.LABEL_MONTOIVABIEN
										,SriConstantesFunciones.LABEL_MONTOIVASERVICIO
										,SriConstantesFunciones.LABEL_IDTIPORETENCIONIVABIEN
										,SriConstantesFunciones.LABEL_IDTIPORETENCIONIVASERVICIO
										,SriConstantesFunciones.LABEL_RETENCIONIVABIEN
										,SriConstantesFunciones.LABEL_RETENCIONIVASERVICIO
										,SriConstantesFunciones.LABEL_CONDEVOLUCION
										};
	   
	    public List<Sri> sris;
	  	 
	    //NO SE UTILIZA
	    public SriModel(List<Sri> sris,JInternalFrameBase jInternalFrameBase) {
	    	this.sris=sris;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public SriModel(JInternalFrameBase jInternalFrameBase) {
	    	this.sris=new ArrayList<Sri>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.sris.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.sris.get(rowIndex).getIsSelected();
	            
				case 1: return this.sris.get(rowIndex).getId();
				case 2: return this.sris.get(rowIndex).getid_asiento_contable();
				case 3: return this.sris.get(rowIndex).getid_transaccion_conta();
				case 4: return this.sris.get(rowIndex).getruc();
				case 5: return this.sris.get(rowIndex).getid_cliente();
				case 6: return this.sris.get(rowIndex).getrazon_social();
				case 7: return this.sris.get(rowIndex).gettipo_comprobante();
				case 8: return this.sris.get(rowIndex).getes_rise();
				case 9: return this.sris.get(rowIndex).getnumero_serie();
				case 10: return this.sris.get(rowIndex).getnumero_autorizacion();
				case 11: return this.sris.get(rowIndex).getnumero_secuencial();
				case 12: return this.sris.get(rowIndex).getfecha_emision();
				case 13: return this.sris.get(rowIndex).getfecha_registro_contable();
				case 14: return this.sris.get(rowIndex).getfecha_caducidad();
				case 15: return this.sris.get(rowIndex).gettipo_tributario();
				case 16: return this.sris.get(rowIndex).getbienes_tar12();
				case 17: return this.sris.get(rowIndex).getbienes_tar0();
				case 18: return this.sris.get(rowIndex).getid_tipo_iva();
				case 19: return this.sris.get(rowIndex).getservicios_tar12();
				case 20: return this.sris.get(rowIndex).getservicios_tar0();
				case 21: return this.sris.get(rowIndex).getmonto_iva();
				case 22: return this.sris.get(rowIndex).getbase_impo_tar12();
				case 23: return this.sris.get(rowIndex).getbase_impo_tar0();
				case 24: return this.sris.get(rowIndex).getmonto_ice();
				case 25: return this.sris.get(rowIndex).getmonto_iva_bien();
				case 26: return this.sris.get(rowIndex).getmonto_iva_servicio();
				case 27: return this.sris.get(rowIndex).getid_tipo_retencion_iva_bien();
				case 28: return this.sris.get(rowIndex).getid_tipo_retencion_iva_servicio();
				case 29: return this.sris.get(rowIndex).getretencion_iva_bien();
				case 30: return this.sris.get(rowIndex).getretencion_iva_servicio();
				case 31: return this.sris.get(rowIndex).getcon_devolucion();	            
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
				case 6: return String.class;
				case 7: return Long.class;
				case 8: return Boolean.class;
				case 9: return String.class;
				case 10: return String.class;
				case 11: return String.class;
				case 12: return Date.class;
				case 13: return Date.class;
				case 14: return Date.class;
				case 15: return Long.class;
				case 16: return Double.class;
				case 17: return Double.class;
				case 18: return Long.class;
				case 19: return Double.class;
				case 20: return Double.class;
				case 21: return Double.class;
				case 22: return Double.class;
				case 23: return Double.class;
				case 24: return Double.class;
				case 25: return Double.class;
				case 26: return Double.class;
				case 27: return Long.class;
				case 28: return Long.class;
				case 29: return Double.class;
				case 30: return Double.class;
				case 31: return Boolean.class;	            
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
				case 28: return true;
				case 29: return true;
				case 30: return true;
				case 31: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	Sri sri = this.sris.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			SriBeanSwingJInternalFrame sriBeanSwingJInternalFrame=(SriBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {sri.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {sri.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {sri.setid_asiento_contable((Long) value);sri.setasientocontable_descripcion(sriBeanSwingJInternalFrame.getActualAsientoContableForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {sri.setid_transaccion_conta((Long) value);sri.settransaccionconta_descripcion(sriBeanSwingJInternalFrame.getActualTransaccionContaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {sri.setruc((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {sri.setid_cliente((Long) value);sri.setcliente_descripcion(sriBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {sri.setrazon_social((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {sri.settipo_comprobante((Long) value);sri.settipocomprobante_descripcion(sriBeanSwingJInternalFrame.getActualTipoComprobanteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {sri.setes_rise((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {sri.setnumero_serie((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {sri.setnumero_autorizacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {sri.setnumero_secuencial((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {sri.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {sri.setfecha_registro_contable((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {sri.setfecha_caducidad((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {sri.settipo_tributario((Long) value);sri.settipotributario_descripcion(sriBeanSwingJInternalFrame.getActualTipoTributarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {sri.setbienes_tar12((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {sri.setbienes_tar0((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {sri.setid_tipo_iva((Long) value);sri.settipoiva_descripcion(sriBeanSwingJInternalFrame.getActualTipoIvaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {sri.setservicios_tar12((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {sri.setservicios_tar0((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {sri.setmonto_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {sri.setbase_impo_tar12((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {sri.setbase_impo_tar0((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {sri.setmonto_ice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {sri.setmonto_iva_bien((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {sri.setmonto_iva_servicio((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {sri.setid_tipo_retencion_iva_bien((Long) value);sri.settiporetencionivabien_descripcion(sriBeanSwingJInternalFrame.getActualTipoRetencionIvaBienForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {sri.setid_tipo_retencion_iva_servicio((Long) value);sri.settiporetencionivaservicio_descripcion(sriBeanSwingJInternalFrame.getActualTipoRetencionIvaServicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {sri.setretencion_iva_bien((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {sri.setretencion_iva_servicio((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {sri.setcon_devolucion((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public SriModel(JInternalFrameBase jInternalFrameBase) {
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
		private SriDetalleFormJInternalFrame sriJInternalFrame=null;
		
		public SriModel(SriDetalleFormJInternalFrame sriJInternalFrame) {
			this.sriJInternalFrame=sriJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			/*
			componentTab=this.sriJInternalFrame.getjButtonActualizarToolBarSri();
			
			if(component!=null && component.equals(this.sriJInternalFrame.getjButtonActualizarToolBarSri())) {
				componentTab=this.sriJInternalFrame.getjButtonEliminarToolBarSri();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.sriJInternalFrame.getjButtonEliminarToolBarSri())) {
				componentTab=this.sriJInternalFrame.getjButtonCancelarToolBarSri();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.sriJInternalFrame.getjButtonCancelarToolBarSri())) {
				componentTab=this.sriJInternalFrame.jComboBoxid_asiento_contableSri;
				return componentTab;
			}				
			
			*/
			
			if(component!=null && component.equals(this.sriJInternalFrame.jComboBoxid_tipo_movimientoSri)) {
				componentTab=this.sriJInternalFrame.jComboBoxTiposAccionesFormularioSri;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.sriJInternalFrame.jComboBoxTiposAccionesFormularioSri)) {
				componentTab=this.sriJInternalFrame.jButtonEliminarSri;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.sriJInternalFrame.jButtonEliminarSri)) {
				componentTab=this.sriJInternalFrame.jButtonActualizarSri;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.sriJInternalFrame.jButtonActualizarSri)) {
				componentTab=this.sriJInternalFrame.jButtonCancelarSri;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.sriJInternalFrame.jComboBoxid_asiento_contableSri)) {
			componentTab=this.sriJInternalFrame.jComboBoxid_transaccion_contaSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jComboBoxid_transaccion_contaSri)) {
			componentTab=this.sriJInternalFrame.jTextFieldrucSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldrucSri)) {
			componentTab=this.sriJInternalFrame.jComboBoxid_clienteSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jComboBoxid_clienteSri)) {
			componentTab=this.sriJInternalFrame.jTextArearazon_socialSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextArearazon_socialSri)) {
			componentTab=this.sriJInternalFrame.jComboBoxtipo_comprobanteSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jComboBoxtipo_comprobanteSri)) {
			componentTab=this.sriJInternalFrame.jCheckBoxes_riseSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jCheckBoxes_riseSri)) {
			componentTab=this.sriJInternalFrame.jTextFieldnumero_serieSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldnumero_serieSri)) {
			componentTab=this.sriJInternalFrame.jTextFieldnumero_autorizacionSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldnumero_autorizacionSri)) {
			componentTab=this.sriJInternalFrame.jTextFieldnumero_secuencialSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldnumero_secuencialSri)) {
			componentTab=this.sriJInternalFrame.jDateChooserfecha_emisionSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jDateChooserfecha_emisionSri)) {
			componentTab=this.sriJInternalFrame.jDateChooserfecha_registro_contableSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jDateChooserfecha_registro_contableSri)) {
			componentTab=this.sriJInternalFrame.jDateChooserfecha_caducidadSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jDateChooserfecha_caducidadSri)) {
			componentTab=this.sriJInternalFrame.jComboBoxtipo_tributarioSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jComboBoxtipo_tributarioSri)) {
			componentTab=this.sriJInternalFrame.jTextFieldbienes_tar12Sri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldbienes_tar12Sri)) {
			componentTab=this.sriJInternalFrame.jTextFieldbienes_tar0Sri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldbienes_tar0Sri)) {
			componentTab=this.sriJInternalFrame.jComboBoxid_tipo_ivaSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jComboBoxid_tipo_ivaSri)) {
			componentTab=this.sriJInternalFrame.jTextFieldservicios_tar12Sri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldservicios_tar12Sri)) {
			componentTab=this.sriJInternalFrame.jTextFieldservicios_tar0Sri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldservicios_tar0Sri)) {
			componentTab=this.sriJInternalFrame.jTextFieldmonto_ivaSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldmonto_ivaSri)) {
			componentTab=this.sriJInternalFrame.jTextFieldbase_impo_tar12Sri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldbase_impo_tar12Sri)) {
			componentTab=this.sriJInternalFrame.jTextFieldbase_impo_tar0Sri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldbase_impo_tar0Sri)) {
			componentTab=this.sriJInternalFrame.jTextFieldmonto_iceSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldmonto_iceSri)) {
			componentTab=this.sriJInternalFrame.jTextFieldmonto_iva_bienSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldmonto_iva_bienSri)) {
			componentTab=this.sriJInternalFrame.jTextFieldmonto_iva_servicioSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldmonto_iva_servicioSri)) {
			componentTab=this.sriJInternalFrame.jComboBoxid_tipo_retencion_iva_bienSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jComboBoxid_tipo_retencion_iva_bienSri)) {
			componentTab=this.sriJInternalFrame.jComboBoxid_tipo_retencion_iva_servicioSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jComboBoxid_tipo_retencion_iva_servicioSri)) {
			componentTab=this.sriJInternalFrame.jTextFieldretencion_iva_bienSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldretencion_iva_bienSri)) {
			componentTab=this.sriJInternalFrame.jTextFieldretencion_iva_servicioSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldretencion_iva_servicioSri)) {
			componentTab=this.sriJInternalFrame.jCheckBoxcon_devolucionSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jCheckBoxcon_devolucionSri)) {
			componentTab=this.sriJInternalFrame.jComboBoxid_tipo_movimientoSri;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			/*
			componentTab=this.sriJInternalFrame.getjButtonActualizarToolBarSri();
			
			if(component!=null && component.equals(this.sriJInternalFrame.getjButtonEliminarToolBarSri())) {
				componentTab=this.sriJInternalFrame.getjButtonActualizarToolBarSri();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.sriJInternalFrame.getjButtonCancelarToolBarSri())) {
				componentTab=this.sriJInternalFrame.getjButtonEliminarToolBarSri();
				
				return componentTab;
			}
			*/
			
			if(component!=null && component.equals(this.sriJInternalFrame.jComboBoxid_asiento_contableSri)) {
				/*
				componentTab=this.sriJInternalFrame.getjButtonCancelarToolBarSri();
				*/
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.sriJInternalFrame.jComboBoxTiposAccionesFormularioSri)) {
				componentTab=this.sriJInternalFrame.jComboBoxid_tipo_movimientoSri;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.sriJInternalFrame.jButtonEliminarSri)) {
				componentTab=this.sriJInternalFrame.jComboBoxTiposAccionesFormularioSri;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.sriJInternalFrame.jButtonActualizarSri)) {
				componentTab=this.sriJInternalFrame.jButtonEliminarSri;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.sriJInternalFrame.jButtonCancelarSri)) {
				componentTab=this.sriJInternalFrame.jButtonActualizarSri;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.sriJInternalFrame.jComboBoxid_transaccion_contaSri)) {
			componentTab=this.sriJInternalFrame.jComboBoxid_asiento_contableSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldrucSri)) {
			componentTab=this.sriJInternalFrame.jComboBoxid_transaccion_contaSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jComboBoxid_clienteSri)) {
			componentTab=this.sriJInternalFrame.jTextFieldrucSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextArearazon_socialSri)) {
			componentTab=this.sriJInternalFrame.jComboBoxid_clienteSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jComboBoxtipo_comprobanteSri)) {
			componentTab=this.sriJInternalFrame.jTextArearazon_socialSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jCheckBoxes_riseSri)) {
			componentTab=this.sriJInternalFrame.jComboBoxtipo_comprobanteSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldnumero_serieSri)) {
			componentTab=this.sriJInternalFrame.jCheckBoxes_riseSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldnumero_autorizacionSri)) {
			componentTab=this.sriJInternalFrame.jTextFieldnumero_serieSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldnumero_secuencialSri)) {
			componentTab=this.sriJInternalFrame.jTextFieldnumero_autorizacionSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jDateChooserfecha_emisionSri)) {
			componentTab=this.sriJInternalFrame.jTextFieldnumero_secuencialSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jDateChooserfecha_registro_contableSri)) {
			componentTab=this.sriJInternalFrame.jDateChooserfecha_emisionSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jDateChooserfecha_caducidadSri)) {
			componentTab=this.sriJInternalFrame.jDateChooserfecha_registro_contableSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jComboBoxtipo_tributarioSri)) {
			componentTab=this.sriJInternalFrame.jDateChooserfecha_caducidadSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldbienes_tar12Sri)) {
			componentTab=this.sriJInternalFrame.jComboBoxtipo_tributarioSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldbienes_tar0Sri)) {
			componentTab=this.sriJInternalFrame.jTextFieldbienes_tar12Sri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jComboBoxid_tipo_ivaSri)) {
			componentTab=this.sriJInternalFrame.jTextFieldbienes_tar0Sri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldservicios_tar12Sri)) {
			componentTab=this.sriJInternalFrame.jComboBoxid_tipo_ivaSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldservicios_tar0Sri)) {
			componentTab=this.sriJInternalFrame.jTextFieldservicios_tar12Sri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldmonto_ivaSri)) {
			componentTab=this.sriJInternalFrame.jTextFieldservicios_tar0Sri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldbase_impo_tar12Sri)) {
			componentTab=this.sriJInternalFrame.jTextFieldmonto_ivaSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldbase_impo_tar0Sri)) {
			componentTab=this.sriJInternalFrame.jTextFieldbase_impo_tar12Sri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldmonto_iceSri)) {
			componentTab=this.sriJInternalFrame.jTextFieldbase_impo_tar0Sri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldmonto_iva_bienSri)) {
			componentTab=this.sriJInternalFrame.jTextFieldmonto_iceSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldmonto_iva_servicioSri)) {
			componentTab=this.sriJInternalFrame.jTextFieldmonto_iva_bienSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jComboBoxid_tipo_retencion_iva_bienSri)) {
			componentTab=this.sriJInternalFrame.jTextFieldmonto_iva_servicioSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jComboBoxid_tipo_retencion_iva_servicioSri)) {
			componentTab=this.sriJInternalFrame.jComboBoxid_tipo_retencion_iva_bienSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldretencion_iva_bienSri)) {
			componentTab=this.sriJInternalFrame.jComboBoxid_tipo_retencion_iva_servicioSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jTextFieldretencion_iva_servicioSri)) {
			componentTab=this.sriJInternalFrame.jTextFieldretencion_iva_bienSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jCheckBoxcon_devolucionSri)) {
			componentTab=this.sriJInternalFrame.jTextFieldretencion_iva_servicioSri;
			return componentTab;
		}

		if(component!=null && component.equals(this.sriJInternalFrame.jComboBoxid_tipo_movimientoSri)) {
			componentTab=this.sriJInternalFrame.jCheckBoxcon_devolucionSri;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			/*
			componentTab=this.sriJInternalFrame.getjButtonActualizarToolBarSri();
			*/
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			/*
			componentTab=this.sriJInternalFrame.getjButtonActualizarToolBarSri();
			*/
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			/*
			componentTab=this.sriJInternalFrame.getjButtonCancelarToolBarSri();
			*/
			
			return componentTab;		
		}
		
		public SriDetalleFormJInternalFrame getsriJInternalFrame() {
			return this.sriJInternalFrame;
		}
		
		public void setsriJInternalFrame(SriDetalleFormJInternalFrame sriJInternalFrame) {
			this.sriJInternalFrame=sriJInternalFrame;
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
