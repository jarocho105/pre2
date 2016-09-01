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

import com.bydan.erp.contabilidad.util.ImportarExportarConstantesFunciones;
import com.bydan.erp.contabilidad.util.ImportarExportarParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.ImportarExportarParameterGeneral;

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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.ImportarExportarBeanSwingJInternalFrame;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.ImportarExportarJInternalFrame;

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.ImportarExportarDetalleFormJInternalFrame;

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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.tesoreria.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class ImportarExportarModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,ImportarExportarConstantesFunciones.LABEL_ID
										,ImportarExportarConstantesFunciones.LABEL_IDMODULO
										,ImportarExportarConstantesFunciones.LABEL_IDASIENTOCONTABLE
										,ImportarExportarConstantesFunciones.LABEL_RUCINFORMANTE
										,ImportarExportarConstantesFunciones.LABEL_IDPERIODOIMPORTEXPORT
										,ImportarExportarConstantesFunciones.LABEL_IDTRANSACCIONCONTA
										,ImportarExportarConstantesFunciones.LABEL_FECHA
										,ImportarExportarConstantesFunciones.LABEL_IDTIPOIMPORTACION
										,ImportarExportarConstantesFunciones.LABEL_IDTIPOCOMPROBANTE
										,ImportarExportarConstantesFunciones.LABEL_NUMEROCOMPROBANTE
										,ImportarExportarConstantesFunciones.LABEL_DOCUMENTOTRANSPORTE
										,ImportarExportarConstantesFunciones.LABEL_NUMEROREFERENCIACOMPROBANTE
										,ImportarExportarConstantesFunciones.LABEL_IDTIPOTRIBUTARIO
										,ImportarExportarConstantesFunciones.LABEL_CODIGOFISCAL
										,ImportarExportarConstantesFunciones.LABEL_IDCLIENTE
										,ImportarExportarConstantesFunciones.LABEL_ESJURIDICO
										,ImportarExportarConstantesFunciones.LABEL_BASE0
										,ImportarExportarConstantesFunciones.LABEL_MONTOTOTALCIF
										,ImportarExportarConstantesFunciones.LABEL_MONTOIVA
										,ImportarExportarConstantesFunciones.LABEL_IDTIPOIVA
										,ImportarExportarConstantesFunciones.LABEL_MONTOICE
										,ImportarExportarConstantesFunciones.LABEL_IDTIPOICE
										,ImportarExportarConstantesFunciones.LABEL_BASEGENERAL
										,ImportarExportarConstantesFunciones.LABEL_IDTIPOBANCO
										,ImportarExportarConstantesFunciones.LABEL_IDTIPOCOMPROBANTEBANCO
										,ImportarExportarConstantesFunciones.LABEL_CONCONVENIO
										,ImportarExportarConstantesFunciones.LABEL_CONDEVOLUCION
										,ImportarExportarConstantesFunciones.LABEL_FECHAEMISION
										,ImportarExportarConstantesFunciones.LABEL_NUMEROSERIECOMPROBANTE
										,ImportarExportarConstantesFunciones.LABEL_NUMEROAUTORIZACIONCOMPROBANTE
										,ImportarExportarConstantesFunciones.LABEL_NUMEROSECUENCIALFUENTE
										,ImportarExportarConstantesFunciones.LABEL_VALORFOB
										};
	   
	    public List<ImportarExportar> importarexportars;
	  	 
	    //NO SE UTILIZA
	    public ImportarExportarModel(List<ImportarExportar> importarexportars,JInternalFrameBase jInternalFrameBase) {
	    	this.importarexportars=importarexportars;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public ImportarExportarModel(JInternalFrameBase jInternalFrameBase) {
	    	this.importarexportars=new ArrayList<ImportarExportar>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.importarexportars.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.importarexportars.get(rowIndex).getIsSelected();
	            
				case 1: return this.importarexportars.get(rowIndex).getId();
				case 2: return this.importarexportars.get(rowIndex).getid_modulo();
				case 3: return this.importarexportars.get(rowIndex).getid_asiento_contable();
				case 4: return this.importarexportars.get(rowIndex).getruc();
				case 5: return this.importarexportars.get(rowIndex).getid_periodo_import_export();
				case 6: return this.importarexportars.get(rowIndex).getid_transaccion_conta();
				case 7: return this.importarexportars.get(rowIndex).getfecha();
				case 8: return this.importarexportars.get(rowIndex).getid_tipo_importacion();
				case 9: return this.importarexportars.get(rowIndex).getid_tipo_comprobante();
				case 10: return this.importarexportars.get(rowIndex).getnumero_comprobante();
				case 11: return this.importarexportars.get(rowIndex).getdocumento_transporte();
				case 12: return this.importarexportars.get(rowIndex).getnumero_referencia_comprobante();
				case 13: return this.importarexportars.get(rowIndex).getid_tipo_tributario();
				case 14: return this.importarexportars.get(rowIndex).getcodigo_fiscal();
				case 15: return this.importarexportars.get(rowIndex).getid_cliente();
				case 16: return this.importarexportars.get(rowIndex).getes_juridico();
				case 17: return this.importarexportars.get(rowIndex).getbase0();
				case 18: return this.importarexportars.get(rowIndex).getmonto_total_cif();
				case 19: return this.importarexportars.get(rowIndex).getmonto_iva();
				case 20: return this.importarexportars.get(rowIndex).getid_tipo_iva();
				case 21: return this.importarexportars.get(rowIndex).getmonto_ice();
				case 22: return this.importarexportars.get(rowIndex).getid_tipo_ice();
				case 23: return this.importarexportars.get(rowIndex).getbase_general();
				case 24: return this.importarexportars.get(rowIndex).getid_tipo_banco();
				case 25: return this.importarexportars.get(rowIndex).getid_tipo_comprobante_banco();
				case 26: return this.importarexportars.get(rowIndex).getcon_convenio();
				case 27: return this.importarexportars.get(rowIndex).getcon_devolucion();
				case 28: return this.importarexportars.get(rowIndex).getfecha_emision();
				case 29: return this.importarexportars.get(rowIndex).getnumero_serie_comprobante();
				case 30: return this.importarexportars.get(rowIndex).getnumero_autorizacion_comprobante();
				case 31: return this.importarexportars.get(rowIndex).getnumero_secuencial_fuente();
				case 32: return this.importarexportars.get(rowIndex).getvalor_fob();	            
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
				case 6: return Long.class;
				case 7: return Date.class;
				case 8: return Long.class;
				case 9: return Long.class;
				case 10: return String.class;
				case 11: return String.class;
				case 12: return String.class;
				case 13: return Long.class;
				case 14: return String.class;
				case 15: return Long.class;
				case 16: return Boolean.class;
				case 17: return Double.class;
				case 18: return Double.class;
				case 19: return Double.class;
				case 20: return Long.class;
				case 21: return Double.class;
				case 22: return Long.class;
				case 23: return Double.class;
				case 24: return Long.class;
				case 25: return Long.class;
				case 26: return Boolean.class;
				case 27: return Boolean.class;
				case 28: return Date.class;
				case 29: return String.class;
				case 30: return String.class;
				case 31: return String.class;
				case 32: return Double.class;	            
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
				case 32: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	ImportarExportar importarexportar = this.importarexportars.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			ImportarExportarBeanSwingJInternalFrame importarexportarBeanSwingJInternalFrame=(ImportarExportarBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {importarexportar.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {importarexportar.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {importarexportar.setid_modulo((Long) value);importarexportar.setmodulo_descripcion(importarexportarBeanSwingJInternalFrame.getActualModuloForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {importarexportar.setid_asiento_contable((Long) value);importarexportar.setasientocontable_descripcion(importarexportarBeanSwingJInternalFrame.getActualAsientoContableForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {importarexportar.setruc((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {importarexportar.setid_periodo_import_export((Long) value);importarexportar.setperiodoimportexport_descripcion(importarexportarBeanSwingJInternalFrame.getActualPeriodoImportExportForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {importarexportar.setid_transaccion_conta((Long) value);importarexportar.settransaccionconta_descripcion(importarexportarBeanSwingJInternalFrame.getActualTransaccionContaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {importarexportar.setfecha((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {importarexportar.setid_tipo_importacion((Long) value);importarexportar.settipoimportacion_descripcion(importarexportarBeanSwingJInternalFrame.getActualTipoImportacionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {importarexportar.setid_tipo_comprobante((Long) value);importarexportar.settipocomprobante_descripcion(importarexportarBeanSwingJInternalFrame.getActualTipoComprobanteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {importarexportar.setnumero_comprobante((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {importarexportar.setdocumento_transporte((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {importarexportar.setnumero_referencia_comprobante((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {importarexportar.setid_tipo_tributario((Long) value);importarexportar.settipotributario_descripcion(importarexportarBeanSwingJInternalFrame.getActualTipoTributarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {importarexportar.setcodigo_fiscal((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {importarexportar.setid_cliente((Long) value);importarexportar.setcliente_descripcion(importarexportarBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {importarexportar.setes_juridico((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {importarexportar.setbase0((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {importarexportar.setmonto_total_cif((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {importarexportar.setmonto_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {importarexportar.setid_tipo_iva((Long) value);importarexportar.settipoiva_descripcion(importarexportarBeanSwingJInternalFrame.getActualTipoIvaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {importarexportar.setmonto_ice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {importarexportar.setid_tipo_ice((Long) value);importarexportar.settipoice_descripcion(importarexportarBeanSwingJInternalFrame.getActualTipoIceForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {importarexportar.setbase_general((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {importarexportar.setid_tipo_banco((Long) value);importarexportar.settipobanco_descripcion(importarexportarBeanSwingJInternalFrame.getActualTipoBancoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {importarexportar.setid_tipo_comprobante_banco((Long) value);importarexportar.settipocomprobantebanco_descripcion(importarexportarBeanSwingJInternalFrame.getActualTipoComprobanteBancoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {importarexportar.setcon_convenio((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {importarexportar.setcon_devolucion((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {importarexportar.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {importarexportar.setnumero_serie_comprobante((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {importarexportar.setnumero_autorizacion_comprobante((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {importarexportar.setnumero_secuencial_fuente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {importarexportar.setvalor_fob((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public ImportarExportarModel(JInternalFrameBase jInternalFrameBase) {
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
		private ImportarExportarDetalleFormJInternalFrame importarexportarJInternalFrame=null;
		
		public ImportarExportarModel(ImportarExportarDetalleFormJInternalFrame importarexportarJInternalFrame) {
			this.importarexportarJInternalFrame=importarexportarJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			/*
			componentTab=this.importarexportarJInternalFrame.getjButtonActualizarToolBarImportarExportar();
			
			if(component!=null && component.equals(this.importarexportarJInternalFrame.getjButtonActualizarToolBarImportarExportar())) {
				componentTab=this.importarexportarJInternalFrame.getjButtonEliminarToolBarImportarExportar();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.importarexportarJInternalFrame.getjButtonEliminarToolBarImportarExportar())) {
				componentTab=this.importarexportarJInternalFrame.getjButtonCancelarToolBarImportarExportar();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.importarexportarJInternalFrame.getjButtonCancelarToolBarImportarExportar())) {
				componentTab=this.importarexportarJInternalFrame.jComboBoxid_moduloImportarExportar;
				return componentTab;
			}				
			
			*/
			
			if(component!=null && component.equals(this.importarexportarJInternalFrame.jTextFieldvalor_fobImportarExportar)) {
				componentTab=this.importarexportarJInternalFrame.jComboBoxTiposAccionesFormularioImportarExportar;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.importarexportarJInternalFrame.jComboBoxTiposAccionesFormularioImportarExportar)) {
				componentTab=this.importarexportarJInternalFrame.jButtonEliminarImportarExportar;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.importarexportarJInternalFrame.jButtonEliminarImportarExportar)) {
				componentTab=this.importarexportarJInternalFrame.jButtonActualizarImportarExportar;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.importarexportarJInternalFrame.jButtonActualizarImportarExportar)) {
				componentTab=this.importarexportarJInternalFrame.jButtonCancelarImportarExportar;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jComboBoxid_moduloImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jComboBoxid_asiento_contableImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jComboBoxid_asiento_contableImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jTextFieldrucImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jTextFieldrucImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jComboBoxid_periodo_import_exportImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jComboBoxid_periodo_import_exportImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jComboBoxid_transaccion_contaImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jComboBoxid_transaccion_contaImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jDateChooserfechaImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jDateChooserfechaImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jComboBoxid_tipo_importacionImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jComboBoxid_tipo_importacionImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jComboBoxid_tipo_comprobanteImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jComboBoxid_tipo_comprobanteImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jTextFieldnumero_comprobanteImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jTextFieldnumero_comprobanteImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jTextFielddocumento_transporteImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jTextFielddocumento_transporteImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jTextFieldnumero_referencia_comprobanteImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jTextFieldnumero_referencia_comprobanteImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jComboBoxid_tipo_tributarioImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jComboBoxid_tipo_tributarioImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jTextFieldcodigo_fiscalImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jTextFieldcodigo_fiscalImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jComboBoxid_clienteImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jComboBoxid_clienteImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jCheckBoxes_juridicoImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jCheckBoxes_juridicoImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jTextFieldbase0ImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jTextFieldbase0ImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jTextFieldmonto_total_cifImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jTextFieldmonto_total_cifImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jTextFieldmonto_ivaImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jTextFieldmonto_ivaImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jComboBoxid_tipo_ivaImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jComboBoxid_tipo_ivaImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jTextFieldmonto_iceImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jTextFieldmonto_iceImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jComboBoxid_tipo_iceImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jComboBoxid_tipo_iceImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jTextFieldbase_generalImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jTextFieldbase_generalImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jComboBoxid_tipo_bancoImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jComboBoxid_tipo_bancoImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jComboBoxid_tipo_comprobante_bancoImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jComboBoxid_tipo_comprobante_bancoImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jCheckBoxcon_convenioImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jCheckBoxcon_convenioImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jCheckBoxcon_devolucionImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jCheckBoxcon_devolucionImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jDateChooserfecha_emisionImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jDateChooserfecha_emisionImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jTextFieldnumero_serie_comprobanteImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jTextFieldnumero_serie_comprobanteImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jTextFieldnumero_autorizacion_comprobanteImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jTextFieldnumero_autorizacion_comprobanteImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jTextFieldnumero_secuencial_fuenteImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jTextFieldnumero_secuencial_fuenteImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jTextFieldvalor_fobImportarExportar;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			/*
			componentTab=this.importarexportarJInternalFrame.getjButtonActualizarToolBarImportarExportar();
			
			if(component!=null && component.equals(this.importarexportarJInternalFrame.getjButtonEliminarToolBarImportarExportar())) {
				componentTab=this.importarexportarJInternalFrame.getjButtonActualizarToolBarImportarExportar();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.importarexportarJInternalFrame.getjButtonCancelarToolBarImportarExportar())) {
				componentTab=this.importarexportarJInternalFrame.getjButtonEliminarToolBarImportarExportar();
				
				return componentTab;
			}
			*/
			
			if(component!=null && component.equals(this.importarexportarJInternalFrame.jComboBoxid_moduloImportarExportar)) {
				/*
				componentTab=this.importarexportarJInternalFrame.getjButtonCancelarToolBarImportarExportar();
				*/
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.importarexportarJInternalFrame.jComboBoxTiposAccionesFormularioImportarExportar)) {
				componentTab=this.importarexportarJInternalFrame.jTextFieldvalor_fobImportarExportar;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.importarexportarJInternalFrame.jButtonEliminarImportarExportar)) {
				componentTab=this.importarexportarJInternalFrame.jComboBoxTiposAccionesFormularioImportarExportar;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.importarexportarJInternalFrame.jButtonActualizarImportarExportar)) {
				componentTab=this.importarexportarJInternalFrame.jButtonEliminarImportarExportar;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.importarexportarJInternalFrame.jButtonCancelarImportarExportar)) {
				componentTab=this.importarexportarJInternalFrame.jButtonActualizarImportarExportar;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jComboBoxid_asiento_contableImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jComboBoxid_moduloImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jTextFieldrucImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jComboBoxid_asiento_contableImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jComboBoxid_periodo_import_exportImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jTextFieldrucImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jComboBoxid_transaccion_contaImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jComboBoxid_periodo_import_exportImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jDateChooserfechaImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jComboBoxid_transaccion_contaImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jComboBoxid_tipo_importacionImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jDateChooserfechaImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jComboBoxid_tipo_comprobanteImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jComboBoxid_tipo_importacionImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jTextFieldnumero_comprobanteImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jComboBoxid_tipo_comprobanteImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jTextFielddocumento_transporteImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jTextFieldnumero_comprobanteImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jTextFieldnumero_referencia_comprobanteImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jTextFielddocumento_transporteImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jComboBoxid_tipo_tributarioImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jTextFieldnumero_referencia_comprobanteImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jTextFieldcodigo_fiscalImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jComboBoxid_tipo_tributarioImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jComboBoxid_clienteImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jTextFieldcodigo_fiscalImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jCheckBoxes_juridicoImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jComboBoxid_clienteImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jTextFieldbase0ImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jCheckBoxes_juridicoImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jTextFieldmonto_total_cifImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jTextFieldbase0ImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jTextFieldmonto_ivaImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jTextFieldmonto_total_cifImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jComboBoxid_tipo_ivaImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jTextFieldmonto_ivaImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jTextFieldmonto_iceImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jComboBoxid_tipo_ivaImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jComboBoxid_tipo_iceImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jTextFieldmonto_iceImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jTextFieldbase_generalImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jComboBoxid_tipo_iceImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jComboBoxid_tipo_bancoImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jTextFieldbase_generalImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jComboBoxid_tipo_comprobante_bancoImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jComboBoxid_tipo_bancoImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jCheckBoxcon_convenioImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jComboBoxid_tipo_comprobante_bancoImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jCheckBoxcon_devolucionImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jCheckBoxcon_convenioImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jDateChooserfecha_emisionImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jCheckBoxcon_devolucionImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jTextFieldnumero_serie_comprobanteImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jDateChooserfecha_emisionImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jTextFieldnumero_autorizacion_comprobanteImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jTextFieldnumero_serie_comprobanteImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jTextFieldnumero_secuencial_fuenteImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jTextFieldnumero_autorizacion_comprobanteImportarExportar;
			return componentTab;
		}

		if(component!=null && component.equals(this.importarexportarJInternalFrame.jTextFieldvalor_fobImportarExportar)) {
			componentTab=this.importarexportarJInternalFrame.jTextFieldnumero_secuencial_fuenteImportarExportar;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			/*
			componentTab=this.importarexportarJInternalFrame.getjButtonActualizarToolBarImportarExportar();
			*/
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			/*
			componentTab=this.importarexportarJInternalFrame.getjButtonActualizarToolBarImportarExportar();
			*/
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			/*
			componentTab=this.importarexportarJInternalFrame.getjButtonCancelarToolBarImportarExportar();
			*/
			
			return componentTab;		
		}
		
		public ImportarExportarDetalleFormJInternalFrame getimportarexportarJInternalFrame() {
			return this.importarexportarJInternalFrame;
		}
		
		public void setimportarexportarJInternalFrame(ImportarExportarDetalleFormJInternalFrame importarexportarJInternalFrame) {
			this.importarexportarJInternalFrame=importarexportarJInternalFrame;
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
