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
package com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.sris.util.TransaccionLocalConstantesFunciones;
import com.bydan.erp.sris.util.TransaccionLocalParameterReturnGeneral;
//import com.bydan.erp.sris.util.TransaccionLocalParameterGeneral;

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

import com.bydan.erp.sris.presentation.swing.jinternalframes.TransaccionLocalBeanSwingJInternalFrame;
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
import com.bydan.erp.sris.resources.reportes.AuxiliarReportes;


import com.bydan.erp.sris.util.*;
import com.bydan.erp.sris.business.logic.*;

import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.sris.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
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


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.sris.presentation.swing.jinternalframes.TransaccionLocalJInternalFrame;

import com.bydan.erp.sris.presentation.swing.jinternalframes.TransaccionLocalDetalleFormJInternalFrame;

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



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.cartera.util.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class TransaccionLocalModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,TransaccionLocalConstantesFunciones.LABEL_ID
										,TransaccionLocalConstantesFunciones.LABEL_RUC
										,TransaccionLocalConstantesFunciones.LABEL_RAZONSOCIAL
										,TransaccionLocalConstantesFunciones.LABEL_IDPERIODODECLARA
										,TransaccionLocalConstantesFunciones.LABEL_IDTRANSACCIONCONTA
										,TransaccionLocalConstantesFunciones.LABEL_IDCLIENTE
										,TransaccionLocalConstantesFunciones.LABEL_IDENTIFICACION
										,TransaccionLocalConstantesFunciones.LABEL_IDTIPOCOMPROBANTE
										,TransaccionLocalConstantesFunciones.LABEL_FECHAEMISION
										,TransaccionLocalConstantesFunciones.LABEL_FECHAREGISTROCONTABLE
										,TransaccionLocalConstantesFunciones.LABEL_NUMEROSECUENCIAL
										,TransaccionLocalConstantesFunciones.LABEL_NUMEROSERIE
										,TransaccionLocalConstantesFunciones.LABEL_NUMEROAUTORIZACION
										,TransaccionLocalConstantesFunciones.LABEL_FECHACADUCIDAD
										,TransaccionLocalConstantesFunciones.LABEL_IDTIPOTRIBUTARIO
										,TransaccionLocalConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE
										,TransaccionLocalConstantesFunciones.LABEL_ESRISE
										,TransaccionLocalConstantesFunciones.LABEL_BIENESIVA
										,TransaccionLocalConstantesFunciones.LABEL_BIENESSINIVA
										,TransaccionLocalConstantesFunciones.LABEL_IDTIPOIVA
										,TransaccionLocalConstantesFunciones.LABEL_SERVICIOSIVA
										,TransaccionLocalConstantesFunciones.LABEL_SERVICIOSSINIVA
										,TransaccionLocalConstantesFunciones.LABEL_MONTOIVA
										,TransaccionLocalConstantesFunciones.LABEL_TOTALIVA
										,TransaccionLocalConstantesFunciones.LABEL_TOTALSINIVA
										,TransaccionLocalConstantesFunciones.LABEL_MONTOICE
										,TransaccionLocalConstantesFunciones.LABEL_TRANSFEIVARETENER
										,TransaccionLocalConstantesFunciones.LABEL_PRESTAIVARETENER
										,TransaccionLocalConstantesFunciones.LABEL_IDTIPORETENCIONIVA
										,TransaccionLocalConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA
										,TransaccionLocalConstantesFunciones.LABEL_TRANSFEIVARETENIDO
										,TransaccionLocalConstantesFunciones.LABEL_PRESTAIVARETENIDO
										,TransaccionLocalConstantesFunciones.LABEL_PERMITEDEVOLUCION
										};
	   
	    public List<TransaccionLocal> transaccionlocals;
	  	 
	    //NO SE UTILIZA
	    public TransaccionLocalModel(List<TransaccionLocal> transaccionlocals,JInternalFrameBase jInternalFrameBase) {
	    	this.transaccionlocals=transaccionlocals;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public TransaccionLocalModel(JInternalFrameBase jInternalFrameBase) {
	    	this.transaccionlocals=new ArrayList<TransaccionLocal>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.transaccionlocals.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.transaccionlocals.get(rowIndex).getIsSelected();
	            
				case 1: return this.transaccionlocals.get(rowIndex).getId();
				case 2: return this.transaccionlocals.get(rowIndex).getruc();
				case 3: return this.transaccionlocals.get(rowIndex).getrazon_social();
				case 4: return this.transaccionlocals.get(rowIndex).getid_periodo_declara();
				case 5: return this.transaccionlocals.get(rowIndex).getid_transaccion_conta();
				case 6: return this.transaccionlocals.get(rowIndex).getid_cliente();
				case 7: return this.transaccionlocals.get(rowIndex).getidentificacion();
				case 8: return this.transaccionlocals.get(rowIndex).getid_tipo_comprobante();
				case 9: return this.transaccionlocals.get(rowIndex).getfecha_emision();
				case 10: return this.transaccionlocals.get(rowIndex).getfecha_registro_contable();
				case 11: return this.transaccionlocals.get(rowIndex).getnumero_secuencial();
				case 12: return this.transaccionlocals.get(rowIndex).getnumero_serie();
				case 13: return this.transaccionlocals.get(rowIndex).getnumero_autorizacion();
				case 14: return this.transaccionlocals.get(rowIndex).getfecha_caducidad();
				case 15: return this.transaccionlocals.get(rowIndex).getid_tipo_tributario();
				case 16: return this.transaccionlocals.get(rowIndex).getnumero_documento_contable();
				case 17: return this.transaccionlocals.get(rowIndex).getes_rise();
				case 18: return this.transaccionlocals.get(rowIndex).getbienes_iva();
				case 19: return this.transaccionlocals.get(rowIndex).getbienes_sin_iva();
				case 20: return this.transaccionlocals.get(rowIndex).getid_tipo_iva();
				case 21: return this.transaccionlocals.get(rowIndex).getservicios_iva();
				case 22: return this.transaccionlocals.get(rowIndex).getservicios_sin_iva();
				case 23: return this.transaccionlocals.get(rowIndex).getmonto_iva();
				case 24: return this.transaccionlocals.get(rowIndex).gettotal_iva();
				case 25: return this.transaccionlocals.get(rowIndex).gettotal_sin_iva();
				case 26: return this.transaccionlocals.get(rowIndex).getmonto_ice();
				case 27: return this.transaccionlocals.get(rowIndex).gettransfe_iva_retener();
				case 28: return this.transaccionlocals.get(rowIndex).getpresta_iva_retener();
				case 29: return this.transaccionlocals.get(rowIndex).getid_tipo_retencion_iva();
				case 30: return this.transaccionlocals.get(rowIndex).getid_tipo_retencion_iva_presta();
				case 31: return this.transaccionlocals.get(rowIndex).gettransfe_iva_retenido();
				case 32: return this.transaccionlocals.get(rowIndex).getpresta_iva_retenido();
				case 33: return this.transaccionlocals.get(rowIndex).getpermite_devolucion();	            
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
				case 4: return Long.class;
				case 5: return Long.class;
				case 6: return Long.class;
				case 7: return String.class;
				case 8: return Long.class;
				case 9: return Date.class;
				case 10: return Date.class;
				case 11: return String.class;
				case 12: return String.class;
				case 13: return String.class;
				case 14: return Date.class;
				case 15: return Long.class;
				case 16: return String.class;
				case 17: return Boolean.class;
				case 18: return Double.class;
				case 19: return Double.class;
				case 20: return Long.class;
				case 21: return Double.class;
				case 22: return Double.class;
				case 23: return Double.class;
				case 24: return Double.class;
				case 25: return Double.class;
				case 26: return Double.class;
				case 27: return Double.class;
				case 28: return Double.class;
				case 29: return Long.class;
				case 30: return Long.class;
				case 31: return Double.class;
				case 32: return Double.class;
				case 33: return Boolean.class;	            
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
				case 33: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	TransaccionLocal transaccionlocal = this.transaccionlocals.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFrame=(TransaccionLocalBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {transaccionlocal.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {transaccionlocal.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {transaccionlocal.setruc((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {transaccionlocal.setrazon_social((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {transaccionlocal.setid_periodo_declara((Long) value);transaccionlocal.setperiododeclara_descripcion(transaccionlocalBeanSwingJInternalFrame.getActualPeriodoDeclaraForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {transaccionlocal.setid_transaccion_conta((Long) value);transaccionlocal.settransaccionconta_descripcion(transaccionlocalBeanSwingJInternalFrame.getActualTransaccionContaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {transaccionlocal.setid_cliente((Long) value);transaccionlocal.setcliente_descripcion(transaccionlocalBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {transaccionlocal.setidentificacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {transaccionlocal.setid_tipo_comprobante((Long) value);transaccionlocal.settipocomprobante_descripcion(transaccionlocalBeanSwingJInternalFrame.getActualTipoComprobanteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {transaccionlocal.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {transaccionlocal.setfecha_registro_contable((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {transaccionlocal.setnumero_secuencial((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {transaccionlocal.setnumero_serie((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {transaccionlocal.setnumero_autorizacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {transaccionlocal.setfecha_caducidad((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {transaccionlocal.setid_tipo_tributario((Long) value);transaccionlocal.settipotributario_descripcion(transaccionlocalBeanSwingJInternalFrame.getActualTipoTributarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {transaccionlocal.setnumero_documento_contable((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {transaccionlocal.setes_rise((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {transaccionlocal.setbienes_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {transaccionlocal.setbienes_sin_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {transaccionlocal.setid_tipo_iva((Long) value);transaccionlocal.settipoiva_descripcion(transaccionlocalBeanSwingJInternalFrame.getActualTipoIvaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {transaccionlocal.setservicios_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {transaccionlocal.setservicios_sin_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {transaccionlocal.setmonto_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {transaccionlocal.settotal_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {transaccionlocal.settotal_sin_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {transaccionlocal.setmonto_ice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {transaccionlocal.settransfe_iva_retener((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {transaccionlocal.setpresta_iva_retener((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {transaccionlocal.setid_tipo_retencion_iva((Long) value);transaccionlocal.settiporetencioniva_descripcion(transaccionlocalBeanSwingJInternalFrame.getActualTipoRetencionIvaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {transaccionlocal.setid_tipo_retencion_iva_presta((Long) value);transaccionlocal.settiporetencionivapresta_descripcion(transaccionlocalBeanSwingJInternalFrame.getActualTipoRetencionIvaPrestaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {transaccionlocal.settransfe_iva_retenido((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {transaccionlocal.setpresta_iva_retenido((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {transaccionlocal.setpermite_devolucion((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public TransaccionLocalModel(JInternalFrameBase jInternalFrameBase) {
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
		private TransaccionLocalDetalleFormJInternalFrame transaccionlocalJInternalFrame=null;
		
		public TransaccionLocalModel(TransaccionLocalDetalleFormJInternalFrame transaccionlocalJInternalFrame) {
			this.transaccionlocalJInternalFrame=transaccionlocalJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.transaccionlocalJInternalFrame.getjButtonActualizarToolBarTransaccionLocal();
			
			if(component!=null && component.equals(this.transaccionlocalJInternalFrame.getjButtonActualizarToolBarTransaccionLocal())) {
				componentTab=this.transaccionlocalJInternalFrame.getjButtonEliminarToolBarTransaccionLocal();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transaccionlocalJInternalFrame.getjButtonEliminarToolBarTransaccionLocal())) {
				componentTab=this.transaccionlocalJInternalFrame.getjButtonCancelarToolBarTransaccionLocal();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transaccionlocalJInternalFrame.getjButtonCancelarToolBarTransaccionLocal())) {
				componentTab=this.transaccionlocalJInternalFrame.jComboBoxid_compraTransaccionLocal;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jCheckBoxpermite_devolucionTransaccionLocal)) {
				componentTab=this.transaccionlocalJInternalFrame.jComboBoxTiposAccionesFormularioTransaccionLocal;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jComboBoxTiposAccionesFormularioTransaccionLocal)) {
				componentTab=this.transaccionlocalJInternalFrame.jButtonEliminarTransaccionLocal;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jButtonEliminarTransaccionLocal)) {
				componentTab=this.transaccionlocalJInternalFrame.jButtonActualizarTransaccionLocal;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jButtonActualizarTransaccionLocal)) {
				componentTab=this.transaccionlocalJInternalFrame.jButtonCancelarTransaccionLocal;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jComboBoxid_compraTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldrucTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldrucTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextArearazon_socialTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextArearazon_socialTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jComboBoxid_periodo_declaraTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jComboBoxid_periodo_declaraTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jComboBoxid_transaccion_contaTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jComboBoxid_transaccion_contaTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jComboBoxid_clienteTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jComboBoxid_clienteTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldidentificacionTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldidentificacionTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jComboBoxid_tipo_comprobanteTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jComboBoxid_tipo_comprobanteTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jDateChooserfecha_emisionTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jDateChooserfecha_emisionTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jDateChooserfecha_registro_contableTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jDateChooserfecha_registro_contableTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldnumero_secuencialTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldnumero_secuencialTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldnumero_serieTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldnumero_serieTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldnumero_autorizacionTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldnumero_autorizacionTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jDateChooserfecha_caducidadTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jDateChooserfecha_caducidadTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jComboBoxid_tipo_tributarioTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jComboBoxid_tipo_tributarioTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldnumero_documento_contableTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldnumero_documento_contableTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jComboBoxid_asiento_contableTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jComboBoxid_asiento_contableTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jCheckBoxes_riseTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jCheckBoxes_riseTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldbienes_ivaTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldbienes_ivaTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldbienes_sin_ivaTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldbienes_sin_ivaTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jComboBoxid_tipo_ivaTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jComboBoxid_tipo_ivaTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldservicios_ivaTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldservicios_ivaTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldservicios_sin_ivaTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldservicios_sin_ivaTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldmonto_ivaTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldmonto_ivaTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldtotal_ivaTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldtotal_ivaTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldtotal_sin_ivaTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldtotal_sin_ivaTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldmonto_iceTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldmonto_iceTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldtransfe_iva_retenerTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldtransfe_iva_retenerTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldpresta_iva_retenerTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldpresta_iva_retenerTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jComboBoxid_tipo_retencion_ivaTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jComboBoxid_tipo_retencion_ivaTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jComboBoxid_tipo_retencion_iva_prestaTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jComboBoxid_tipo_retencion_iva_prestaTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldtransfe_iva_retenidoTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldtransfe_iva_retenidoTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldpresta_iva_retenidoTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldpresta_iva_retenidoTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jCheckBoxpermite_devolucionTransaccionLocal;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.transaccionlocalJInternalFrame.getjButtonActualizarToolBarTransaccionLocal();
			
			if(component!=null && component.equals(this.transaccionlocalJInternalFrame.getjButtonEliminarToolBarTransaccionLocal())) {
				componentTab=this.transaccionlocalJInternalFrame.getjButtonActualizarToolBarTransaccionLocal();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transaccionlocalJInternalFrame.getjButtonCancelarToolBarTransaccionLocal())) {
				componentTab=this.transaccionlocalJInternalFrame.getjButtonEliminarToolBarTransaccionLocal();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jComboBoxid_compraTransaccionLocal)) {
				
				componentTab=this.transaccionlocalJInternalFrame.getjButtonCancelarToolBarTransaccionLocal();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jComboBoxTiposAccionesFormularioTransaccionLocal)) {
				componentTab=this.transaccionlocalJInternalFrame.jCheckBoxpermite_devolucionTransaccionLocal;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jButtonEliminarTransaccionLocal)) {
				componentTab=this.transaccionlocalJInternalFrame.jComboBoxTiposAccionesFormularioTransaccionLocal;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jButtonActualizarTransaccionLocal)) {
				componentTab=this.transaccionlocalJInternalFrame.jButtonEliminarTransaccionLocal;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jButtonCancelarTransaccionLocal)) {
				componentTab=this.transaccionlocalJInternalFrame.jButtonActualizarTransaccionLocal;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldrucTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jComboBoxid_compraTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextArearazon_socialTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldrucTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jComboBoxid_periodo_declaraTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextArearazon_socialTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jComboBoxid_transaccion_contaTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jComboBoxid_periodo_declaraTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jComboBoxid_clienteTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jComboBoxid_transaccion_contaTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldidentificacionTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jComboBoxid_clienteTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jComboBoxid_tipo_comprobanteTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldidentificacionTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jDateChooserfecha_emisionTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jComboBoxid_tipo_comprobanteTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jDateChooserfecha_registro_contableTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jDateChooserfecha_emisionTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldnumero_secuencialTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jDateChooserfecha_registro_contableTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldnumero_serieTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldnumero_secuencialTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldnumero_autorizacionTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldnumero_serieTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jDateChooserfecha_caducidadTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldnumero_autorizacionTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jComboBoxid_tipo_tributarioTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jDateChooserfecha_caducidadTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldnumero_documento_contableTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jComboBoxid_tipo_tributarioTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jComboBoxid_asiento_contableTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldnumero_documento_contableTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jCheckBoxes_riseTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jComboBoxid_asiento_contableTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldbienes_ivaTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jCheckBoxes_riseTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldbienes_sin_ivaTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldbienes_ivaTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jComboBoxid_tipo_ivaTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldbienes_sin_ivaTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldservicios_ivaTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jComboBoxid_tipo_ivaTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldservicios_sin_ivaTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldservicios_ivaTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldmonto_ivaTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldservicios_sin_ivaTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldtotal_ivaTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldmonto_ivaTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldtotal_sin_ivaTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldtotal_ivaTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldmonto_iceTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldtotal_sin_ivaTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldtransfe_iva_retenerTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldmonto_iceTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldpresta_iva_retenerTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldtransfe_iva_retenerTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jComboBoxid_tipo_retencion_ivaTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldpresta_iva_retenerTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jComboBoxid_tipo_retencion_iva_prestaTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jComboBoxid_tipo_retencion_ivaTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldtransfe_iva_retenidoTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jComboBoxid_tipo_retencion_iva_prestaTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jTextFieldpresta_iva_retenidoTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldtransfe_iva_retenidoTransaccionLocal;
			return componentTab;
		}

		if(component!=null && component.equals(this.transaccionlocalJInternalFrame.jCheckBoxpermite_devolucionTransaccionLocal)) {
			componentTab=this.transaccionlocalJInternalFrame.jTextFieldpresta_iva_retenidoTransaccionLocal;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.transaccionlocalJInternalFrame.getjButtonActualizarToolBarTransaccionLocal();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.transaccionlocalJInternalFrame.getjButtonActualizarToolBarTransaccionLocal();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.transaccionlocalJInternalFrame.getjButtonCancelarToolBarTransaccionLocal();
			
			
			return componentTab;		
		}
		
		public TransaccionLocalDetalleFormJInternalFrame gettransaccionlocalJInternalFrame() {
			return this.transaccionlocalJInternalFrame;
		}
		
		public void settransaccionlocalJInternalFrame(TransaccionLocalDetalleFormJInternalFrame transaccionlocalJInternalFrame) {
			this.transaccionlocalJInternalFrame=transaccionlocalJInternalFrame;
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
