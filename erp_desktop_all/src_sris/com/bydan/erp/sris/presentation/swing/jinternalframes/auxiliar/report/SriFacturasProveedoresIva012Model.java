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
package com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report;




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

//import com.bydan.erp.sris.util.SriFacturasProveedoresIva012ConstantesFunciones;
import com.bydan.erp.sris.util.report.SriFacturasProveedoresIva012ParameterReturnGeneral;
//import com.bydan.erp.sris.util.report.SriFacturasProveedoresIva012ParameterGeneral;

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

import com.bydan.erp.sris.presentation.swing.jinternalframes.report.SriFacturasProveedoresIva012BeanSwingJInternalFrame;
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
import com.bydan.erp.sris.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.sris.util.*;

import com.bydan.erp.sris.util.report.*;
import com.bydan.erp.sris.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
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

//import org.hibernate.collection.PersistentBag;

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


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;

import com.bydan.erp.sris.presentation.swing.jinternalframes.report.SriFacturasProveedoresIva012JInternalFrame;

import com.bydan.erp.sris.presentation.swing.jinternalframes.report.SriFacturasProveedoresIva012DetalleFormJInternalFrame;

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
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.contabilidad.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class SriFacturasProveedoresIva012Model extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,SriFacturasProveedoresIva012ConstantesFunciones.LABEL_ID
										,SriFacturasProveedoresIva012ConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE
										,SriFacturasProveedoresIva012ConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE
										,SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RUCDATO
										,SriFacturasProveedoresIva012ConstantesFunciones.LABEL_NUMERODOCUMENTO
										,SriFacturasProveedoresIva012ConstantesFunciones.LABEL_FECHAEMISION
										,SriFacturasProveedoresIva012ConstantesFunciones.LABEL_FECHAREGISTROCONTABLE
										,SriFacturasProveedoresIva012ConstantesFunciones.LABEL_NUMEROSERIE
										,SriFacturasProveedoresIva012ConstantesFunciones.LABEL_TOTALIVA
										,SriFacturasProveedoresIva012ConstantesFunciones.LABEL_TOTALSINIVA
										,SriFacturasProveedoresIva012ConstantesFunciones.LABEL_IDTIPOIVA
										,SriFacturasProveedoresIva012ConstantesFunciones.LABEL_IDTIPORETENCIONIVA
										,SriFacturasProveedoresIva012ConstantesFunciones.LABEL_TRANSFEIVARETENIDO
										,SriFacturasProveedoresIva012ConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA
										,SriFacturasProveedoresIva012ConstantesFunciones.LABEL_PRESTAIVARETENIDO
										,SriFacturasProveedoresIva012ConstantesFunciones.LABEL_NOMBRETIPORETENCIONFUENTE1
										,SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RETFUENTE1PORCENTAJE
										,SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RETFUENTE1RETENIDO
										,SriFacturasProveedoresIva012ConstantesFunciones.LABEL_NOMBRETIPORETENCIONFUENTE2
										,SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RETFUENTE2PORCENTAJE
										,SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RETFUENTE2RETENIDO
										,SriFacturasProveedoresIva012ConstantesFunciones.LABEL_NOMBRETIPORETENCIONIVA1
										,SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RETIVABIENPORCENTAJE
										,SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RETIVABIENRETENIDO
										,SriFacturasProveedoresIva012ConstantesFunciones.LABEL_NOMBRETIPORETENCIONIVA2
										,SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RETIVASERVICIOPORCENTAJE
										,SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RETIVASERVICIORETENIDO
										};
	   
	    public List<SriFacturasProveedoresIva012> srifacturasproveedoresiva012s;
	  	 
	    //NO SE UTILIZA
	    public SriFacturasProveedoresIva012Model(List<SriFacturasProveedoresIva012> srifacturasproveedoresiva012s,JInternalFrameBase jInternalFrameBase) {
	    	this.srifacturasproveedoresiva012s=srifacturasproveedoresiva012s;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public SriFacturasProveedoresIva012Model(JInternalFrameBase jInternalFrameBase) {
	    	this.srifacturasproveedoresiva012s=new ArrayList<SriFacturasProveedoresIva012>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.srifacturasproveedoresiva012s.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.srifacturasproveedoresiva012s.get(rowIndex).getIsSelected();
	            
				case 1: return this.srifacturasproveedoresiva012s.get(rowIndex).getId();
				case 2: return this.srifacturasproveedoresiva012s.get(rowIndex).getnombre_tipo_comprobante();
				case 3: return this.srifacturasproveedoresiva012s.get(rowIndex).getnombre_completo_cliente();
				case 4: return this.srifacturasproveedoresiva012s.get(rowIndex).getruc_dato();
				case 5: return this.srifacturasproveedoresiva012s.get(rowIndex).getnumero_documento();
				case 6: return this.srifacturasproveedoresiva012s.get(rowIndex).getfecha_emision();
				case 7: return this.srifacturasproveedoresiva012s.get(rowIndex).getfecha_registro_contable();
				case 8: return this.srifacturasproveedoresiva012s.get(rowIndex).getnumero_serie();
				case 9: return this.srifacturasproveedoresiva012s.get(rowIndex).gettotal_iva();
				case 10: return this.srifacturasproveedoresiva012s.get(rowIndex).gettotal_sin_iva();
				case 11: return this.srifacturasproveedoresiva012s.get(rowIndex).getid_tipo_iva();
				case 12: return this.srifacturasproveedoresiva012s.get(rowIndex).getid_tipo_retencion_iva();
				case 13: return this.srifacturasproveedoresiva012s.get(rowIndex).gettransfe_iva_retenido();
				case 14: return this.srifacturasproveedoresiva012s.get(rowIndex).getid_tipo_retencion_iva_presta();
				case 15: return this.srifacturasproveedoresiva012s.get(rowIndex).getpresta_iva_retenido();
				case 16: return this.srifacturasproveedoresiva012s.get(rowIndex).getnombre_tipo_retencion_fuente1();
				case 17: return this.srifacturasproveedoresiva012s.get(rowIndex).getret_fuente1_porcentaje();
				case 18: return this.srifacturasproveedoresiva012s.get(rowIndex).getret_fuente1_retenido();
				case 19: return this.srifacturasproveedoresiva012s.get(rowIndex).getnombre_tipo_retencion_fuente2();
				case 20: return this.srifacturasproveedoresiva012s.get(rowIndex).getret_fuente2_porcentaje();
				case 21: return this.srifacturasproveedoresiva012s.get(rowIndex).getret_fuente2_retenido();
				case 22: return this.srifacturasproveedoresiva012s.get(rowIndex).getnombre_tipo_retencion_iva1();
				case 23: return this.srifacturasproveedoresiva012s.get(rowIndex).getret_iva_bien_porcentaje();
				case 24: return this.srifacturasproveedoresiva012s.get(rowIndex).getret_iva_bien_retenido();
				case 25: return this.srifacturasproveedoresiva012s.get(rowIndex).getnombre_tipo_retencion_iva2();
				case 26: return this.srifacturasproveedoresiva012s.get(rowIndex).getret_iva_servicio_porcentaje();
				case 27: return this.srifacturasproveedoresiva012s.get(rowIndex).getret_iva_servicio_retenido();	            
	            default: return null;
	        }
	    }
	 
	    @Override
	    public Class<?> getColumnClass(int columnIndex) {
	    	switch (columnIndex) {
				case 0: return Boolean.class;
	            
				case 1: return Long.class;
				case 2: return String.class;
				case 3: return String.class;
				case 4: return String.class;
				case 5: return String.class;
				case 6: return Date.class;
				case 7: return Date.class;
				case 8: return String.class;
				case 9: return Double.class;
				case 10: return Double.class;
				case 11: return Long.class;
				case 12: return Long.class;
				case 13: return Double.class;
				case 14: return Long.class;
				case 15: return Double.class;
				case 16: return String.class;
				case 17: return Double.class;
				case 18: return Double.class;
				case 19: return String.class;
				case 20: return Double.class;
				case 21: return Double.class;
				case 22: return String.class;
				case 23: return Double.class;
				case 24: return Double.class;
				case 25: return String.class;
				case 26: return Double.class;
				case 27: return Double.class;	            
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
	    	SriFacturasProveedoresIva012 srifacturasproveedoresiva012 = this.srifacturasproveedoresiva012s.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			SriFacturasProveedoresIva012BeanSwingJInternalFrame srifacturasproveedoresiva012BeanSwingJInternalFrame=(SriFacturasProveedoresIva012BeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {srifacturasproveedoresiva012.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {srifacturasproveedoresiva012.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {srifacturasproveedoresiva012.setnombre_tipo_comprobante((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {srifacturasproveedoresiva012.setnombre_completo_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {srifacturasproveedoresiva012.setruc_dato((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {srifacturasproveedoresiva012.setnumero_documento((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {srifacturasproveedoresiva012.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {srifacturasproveedoresiva012.setfecha_registro_contable((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {srifacturasproveedoresiva012.setnumero_serie((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {srifacturasproveedoresiva012.settotal_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {srifacturasproveedoresiva012.settotal_sin_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {srifacturasproveedoresiva012.setid_tipo_iva((Long) value);srifacturasproveedoresiva012.settipoiva_descripcion(srifacturasproveedoresiva012BeanSwingJInternalFrame.getActualTipoIvaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {srifacturasproveedoresiva012.setid_tipo_retencion_iva((Long) value);srifacturasproveedoresiva012.settiporetencioniva_descripcion(srifacturasproveedoresiva012BeanSwingJInternalFrame.getActualTipoRetencionIvaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {srifacturasproveedoresiva012.settransfe_iva_retenido((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {srifacturasproveedoresiva012.setid_tipo_retencion_iva_presta((Long) value);srifacturasproveedoresiva012.settiporetencionivapresta_descripcion(srifacturasproveedoresiva012BeanSwingJInternalFrame.getActualTipoRetencionIvaPrestaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {srifacturasproveedoresiva012.setpresta_iva_retenido((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {srifacturasproveedoresiva012.setnombre_tipo_retencion_fuente1((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {srifacturasproveedoresiva012.setret_fuente1_porcentaje((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {srifacturasproveedoresiva012.setret_fuente1_retenido((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {srifacturasproveedoresiva012.setnombre_tipo_retencion_fuente2((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {srifacturasproveedoresiva012.setret_fuente2_porcentaje((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {srifacturasproveedoresiva012.setret_fuente2_retenido((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {srifacturasproveedoresiva012.setnombre_tipo_retencion_iva1((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {srifacturasproveedoresiva012.setret_iva_bien_porcentaje((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {srifacturasproveedoresiva012.setret_iva_bien_retenido((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {srifacturasproveedoresiva012.setnombre_tipo_retencion_iva2((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {srifacturasproveedoresiva012.setret_iva_servicio_porcentaje((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {srifacturasproveedoresiva012.setret_iva_servicio_retenido((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public SriFacturasProveedoresIva012Model(JInternalFrameBase jInternalFrameBase) {
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
		private SriFacturasProveedoresIva012DetalleFormJInternalFrame srifacturasproveedoresiva012JInternalFrame=null;
		
		public SriFacturasProveedoresIva012Model(SriFacturasProveedoresIva012DetalleFormJInternalFrame srifacturasproveedoresiva012JInternalFrame) {
			this.srifacturasproveedoresiva012JInternalFrame=srifacturasproveedoresiva012JInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.getjButtonActualizarToolBarSriFacturasProveedoresIva012();
			
			if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.getjButtonActualizarToolBarSriFacturasProveedoresIva012())) {
				componentTab=this.srifacturasproveedoresiva012JInternalFrame.getjButtonEliminarToolBarSriFacturasProveedoresIva012();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.getjButtonEliminarToolBarSriFacturasProveedoresIva012())) {
				componentTab=this.srifacturasproveedoresiva012JInternalFrame.getjButtonCancelarToolBarSriFacturasProveedoresIva012();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.getjButtonCancelarToolBarSriFacturasProveedoresIva012())) {
				componentTab=this.srifacturasproveedoresiva012JInternalFrame.jComboBoxid_empresaSriFacturasProveedoresIva012;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_iva_servicio_retenidoSriFacturasProveedoresIva012)) {
				componentTab=this.srifacturasproveedoresiva012JInternalFrame.jComboBoxTiposAccionesFormularioSriFacturasProveedoresIva012;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jComboBoxTiposAccionesFormularioSriFacturasProveedoresIva012)) {
				componentTab=this.srifacturasproveedoresiva012JInternalFrame.jButtonEliminarSriFacturasProveedoresIva012;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jButtonEliminarSriFacturasProveedoresIva012)) {
				componentTab=this.srifacturasproveedoresiva012JInternalFrame.jButtonActualizarSriFacturasProveedoresIva012;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jButtonActualizarSriFacturasProveedoresIva012)) {
				componentTab=this.srifacturasproveedoresiva012JInternalFrame.jButtonCancelarSriFacturasProveedoresIva012;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jComboBoxid_empresaSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jComboBoxid_periodo_declaraSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jComboBoxid_periodo_declaraSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldrucSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldrucSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextAreanombre_tipo_comprobanteSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextAreanombre_tipo_comprobanteSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextAreanombre_completo_clienteSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextAreanombre_completo_clienteSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldruc_datoSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldruc_datoSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldnumero_documentoSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldnumero_documentoSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jDateChooserfecha_emisionSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jDateChooserfecha_emisionSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jDateChooserfecha_registro_contableSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jDateChooserfecha_registro_contableSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldnumero_serieSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldnumero_serieSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldtotal_ivaSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldtotal_ivaSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldtotal_sin_ivaSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldtotal_sin_ivaSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jComboBoxid_tipo_ivaSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jComboBoxid_tipo_ivaSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jComboBoxid_tipo_retencion_ivaSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jComboBoxid_tipo_retencion_ivaSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldtransfe_iva_retenidoSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldtransfe_iva_retenidoSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jComboBoxid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jComboBoxid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldpresta_iva_retenidoSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldpresta_iva_retenidoSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextAreanombre_tipo_retencion_fuente1SriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextAreanombre_tipo_retencion_fuente1SriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_fuente1_porcentajeSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_fuente1_porcentajeSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_fuente1_retenidoSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_fuente1_retenidoSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextAreanombre_tipo_retencion_fuente2SriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextAreanombre_tipo_retencion_fuente2SriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_fuente2_porcentajeSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_fuente2_porcentajeSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_fuente2_retenidoSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_fuente2_retenidoSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextAreanombre_tipo_retencion_iva1SriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextAreanombre_tipo_retencion_iva1SriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_iva_bien_porcentajeSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_iva_bien_porcentajeSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_iva_bien_retenidoSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_iva_bien_retenidoSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextAreanombre_tipo_retencion_iva2SriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextAreanombre_tipo_retencion_iva2SriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_iva_servicio_porcentajeSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_iva_servicio_porcentajeSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_iva_servicio_retenidoSriFacturasProveedoresIva012;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.getjButtonActualizarToolBarSriFacturasProveedoresIva012();
			
			if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.getjButtonEliminarToolBarSriFacturasProveedoresIva012())) {
				componentTab=this.srifacturasproveedoresiva012JInternalFrame.getjButtonActualizarToolBarSriFacturasProveedoresIva012();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.getjButtonCancelarToolBarSriFacturasProveedoresIva012())) {
				componentTab=this.srifacturasproveedoresiva012JInternalFrame.getjButtonEliminarToolBarSriFacturasProveedoresIva012();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jComboBoxid_empresaSriFacturasProveedoresIva012)) {
				
				componentTab=this.srifacturasproveedoresiva012JInternalFrame.getjButtonCancelarToolBarSriFacturasProveedoresIva012();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jComboBoxTiposAccionesFormularioSriFacturasProveedoresIva012)) {
				componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_iva_servicio_retenidoSriFacturasProveedoresIva012;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jButtonEliminarSriFacturasProveedoresIva012)) {
				componentTab=this.srifacturasproveedoresiva012JInternalFrame.jComboBoxTiposAccionesFormularioSriFacturasProveedoresIva012;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jButtonActualizarSriFacturasProveedoresIva012)) {
				componentTab=this.srifacturasproveedoresiva012JInternalFrame.jButtonEliminarSriFacturasProveedoresIva012;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jButtonCancelarSriFacturasProveedoresIva012)) {
				componentTab=this.srifacturasproveedoresiva012JInternalFrame.jButtonActualizarSriFacturasProveedoresIva012;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jComboBoxid_periodo_declaraSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jComboBoxid_empresaSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldrucSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jComboBoxid_periodo_declaraSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextAreanombre_tipo_comprobanteSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldrucSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextAreanombre_completo_clienteSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextAreanombre_tipo_comprobanteSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldruc_datoSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextAreanombre_completo_clienteSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldnumero_documentoSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldruc_datoSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jDateChooserfecha_emisionSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldnumero_documentoSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jDateChooserfecha_registro_contableSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jDateChooserfecha_emisionSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldnumero_serieSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jDateChooserfecha_registro_contableSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldtotal_ivaSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldnumero_serieSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldtotal_sin_ivaSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldtotal_ivaSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jComboBoxid_tipo_ivaSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldtotal_sin_ivaSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jComboBoxid_tipo_retencion_ivaSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jComboBoxid_tipo_ivaSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldtransfe_iva_retenidoSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jComboBoxid_tipo_retencion_ivaSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jComboBoxid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldtransfe_iva_retenidoSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldpresta_iva_retenidoSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jComboBoxid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextAreanombre_tipo_retencion_fuente1SriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldpresta_iva_retenidoSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_fuente1_porcentajeSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextAreanombre_tipo_retencion_fuente1SriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_fuente1_retenidoSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_fuente1_porcentajeSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextAreanombre_tipo_retencion_fuente2SriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_fuente1_retenidoSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_fuente2_porcentajeSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextAreanombre_tipo_retencion_fuente2SriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_fuente2_retenidoSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_fuente2_porcentajeSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextAreanombre_tipo_retencion_iva1SriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_fuente2_retenidoSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_iva_bien_porcentajeSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextAreanombre_tipo_retencion_iva1SriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_iva_bien_retenidoSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_iva_bien_porcentajeSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextAreanombre_tipo_retencion_iva2SriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_iva_bien_retenidoSriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_iva_servicio_porcentajeSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextAreanombre_tipo_retencion_iva2SriFacturasProveedoresIva012;
			return componentTab;
		}

		if(component!=null && component.equals(this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_iva_servicio_retenidoSriFacturasProveedoresIva012)) {
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.jTextFieldret_iva_servicio_porcentajeSriFacturasProveedoresIva012;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.getjButtonActualizarToolBarSriFacturasProveedoresIva012();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.getjButtonActualizarToolBarSriFacturasProveedoresIva012();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.srifacturasproveedoresiva012JInternalFrame.getjButtonCancelarToolBarSriFacturasProveedoresIva012();
			
			
			return componentTab;		
		}
		
		public SriFacturasProveedoresIva012DetalleFormJInternalFrame getsrifacturasproveedoresiva012JInternalFrame() {
			return this.srifacturasproveedoresiva012JInternalFrame;
		}
		
		public void setsrifacturasproveedoresiva012JInternalFrame(SriFacturasProveedoresIva012DetalleFormJInternalFrame srifacturasproveedoresiva012JInternalFrame) {
			this.srifacturasproveedoresiva012JInternalFrame=srifacturasproveedoresiva012JInternalFrame;
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
