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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.puntoventa.util.ConfiguracionPunVenConstantesFunciones;
import com.bydan.erp.puntoventa.util.ConfiguracionPunVenParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.ConfiguracionPunVenParameterGeneral;

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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.ConfiguracionPunVenBeanSwingJInternalFrame;
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
import com.bydan.erp.puntoventa.resources.reportes.AuxiliarReportes;


import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.puntoventa.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.ConfiguracionPunVenJInternalFrame;

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.ConfiguracionPunVenDetalleFormJInternalFrame;

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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.tesoreria.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class ConfiguracionPunVenModel extends FocusTraversalPolicy implements TableModel, Serializable {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,ConfiguracionPunVenConstantesFunciones.LABEL_ID
										,ConfiguracionPunVenConstantesFunciones.LABEL_IDEMPRESA
										,ConfiguracionPunVenConstantesFunciones.LABEL_IDSUCURSAL
										,ConfiguracionPunVenConstantesFunciones.LABEL_IDBODEGA
										,ConfiguracionPunVenConstantesFunciones.LABEL_IDCUENTACONTABLEEFECTIVO
										,ConfiguracionPunVenConstantesFunciones.LABEL_IDCUENTACONTABLEICE
										,ConfiguracionPunVenConstantesFunciones.LABEL_IDCUENTACONTABLEOTROS
										,ConfiguracionPunVenConstantesFunciones.LABEL_IDCLIENTECONSUMIDORFINAL
										,ConfiguracionPunVenConstantesFunciones.LABEL_IDTIPODOCUMENTOFACTURA
										,ConfiguracionPunVenConstantesFunciones.LABEL_IDTIPODOCUMENTONOTAVENTA
										,ConfiguracionPunVenConstantesFunciones.LABEL_IDTIPODOCUMENTONOTACREDITO
										,ConfiguracionPunVenConstantesFunciones.LABEL_IDTIPODOCUMENTOTARJETACREDITO
										,ConfiguracionPunVenConstantesFunciones.LABEL_IDFORMATOFACTURA
										,ConfiguracionPunVenConstantesFunciones.LABEL_IDFORMATONOTAVENTA
										,ConfiguracionPunVenConstantesFunciones.LABEL_IDFORMATONOTACREDITO
										,ConfiguracionPunVenConstantesFunciones.LABEL_IDTRANSACCIONFACTURA
										,ConfiguracionPunVenConstantesFunciones.LABEL_IDTRANSACCIONNOTAVENTA
										,ConfiguracionPunVenConstantesFunciones.LABEL_IDTRANSACCIONNOTACREDITO
										,ConfiguracionPunVenConstantesFunciones.LABEL_IDTRANSACCIONCUENTAFACTURA
										,ConfiguracionPunVenConstantesFunciones.LABEL_IDTRANSACCIONCUENTANOTAVENTA
										,ConfiguracionPunVenConstantesFunciones.LABEL_IDTRANSACCIONCUENTANOTACREDITO
										};
	   
	    public List<ConfiguracionPunVen> configuracionpunvens;
	  	 
	    //NO SE UTILIZA
	    public ConfiguracionPunVenModel(List<ConfiguracionPunVen> configuracionpunvens,JInternalFrameBase jInternalFrameBase) {
	    	this.configuracionpunvens=configuracionpunvens;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public ConfiguracionPunVenModel(JInternalFrameBase jInternalFrameBase) {
	    	this.configuracionpunvens=new ArrayList<ConfiguracionPunVen>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.configuracionpunvens.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.configuracionpunvens.get(rowIndex).getIsSelected();
	            
				case 1: return this.configuracionpunvens.get(rowIndex).getId();
				case 2: return this.configuracionpunvens.get(rowIndex).getid_empresa();
				case 3: return this.configuracionpunvens.get(rowIndex).getid_sucursal();
				case 4: return this.configuracionpunvens.get(rowIndex).getid_bodega();
				case 5: return this.configuracionpunvens.get(rowIndex).getid_cuenta_contable_efectivo();
				case 6: return this.configuracionpunvens.get(rowIndex).getid_cuenta_contable_ice();
				case 7: return this.configuracionpunvens.get(rowIndex).getid_cuenta_contable_otros();
				case 8: return this.configuracionpunvens.get(rowIndex).getid_cliente_consumidor_final();
				case 9: return this.configuracionpunvens.get(rowIndex).getid_tipo_documento_factura();
				case 10: return this.configuracionpunvens.get(rowIndex).getid_tipo_documento_nota_venta();
				case 11: return this.configuracionpunvens.get(rowIndex).getid_tipo_documento_nota_credito();
				case 12: return this.configuracionpunvens.get(rowIndex).getid_tipo_documento_tarjeta_credito();
				case 13: return this.configuracionpunvens.get(rowIndex).getid_formato_factura();
				case 14: return this.configuracionpunvens.get(rowIndex).getid_formato_nota_venta();
				case 15: return this.configuracionpunvens.get(rowIndex).getid_formato_nota_credito();
				case 16: return this.configuracionpunvens.get(rowIndex).getid_transaccion_factura();
				case 17: return this.configuracionpunvens.get(rowIndex).getid_transaccion_nota_venta();
				case 18: return this.configuracionpunvens.get(rowIndex).getid_transaccion_nota_credito();
				case 19: return this.configuracionpunvens.get(rowIndex).getid_transaccion_cuenta_factura();
				case 20: return this.configuracionpunvens.get(rowIndex).getid_transaccion_cuenta_nota_venta();
				case 21: return this.configuracionpunvens.get(rowIndex).getid_transaccion_cuenta_nota_credito();	            
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
				case 12: return Long.class;
				case 13: return Long.class;
				case 14: return Long.class;
				case 15: return Long.class;
				case 16: return Long.class;
				case 17: return Long.class;
				case 18: return Long.class;
				case 19: return Long.class;
				case 20: return Long.class;
				case 21: return Long.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	ConfiguracionPunVen configuracionpunven = this.configuracionpunvens.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			ConfiguracionPunVenBeanSwingJInternalFrame configuracionpunvenBeanSwingJInternalFrame=(ConfiguracionPunVenBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {configuracionpunven.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {configuracionpunven.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {configuracionpunven.setid_empresa((Long) value);configuracionpunven.setempresa_descripcion(configuracionpunvenBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {configuracionpunven.setid_sucursal((Long) value);configuracionpunven.setsucursal_descripcion(configuracionpunvenBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {configuracionpunven.setid_bodega((Long) value);configuracionpunven.setbodega_descripcion(configuracionpunvenBeanSwingJInternalFrame.getActualBodegaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {configuracionpunven.setid_cuenta_contable_efectivo((Long) value);configuracionpunven.setcuentacontableefectivo_descripcion(configuracionpunvenBeanSwingJInternalFrame.getActualCuentaContableEfectivoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {configuracionpunven.setid_cuenta_contable_ice((Long) value);configuracionpunven.setcuentacontableice_descripcion(configuracionpunvenBeanSwingJInternalFrame.getActualCuentaContableIceForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {configuracionpunven.setid_cuenta_contable_otros((Long) value);configuracionpunven.setcuentacontableotros_descripcion(configuracionpunvenBeanSwingJInternalFrame.getActualCuentaContableOtrosForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {configuracionpunven.setid_cliente_consumidor_final((Long) value);configuracionpunven.setclienteconsumidorfinal_descripcion(configuracionpunvenBeanSwingJInternalFrame.getActualClienteConsumidorFinalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {configuracionpunven.setid_tipo_documento_factura((Long) value);configuracionpunven.settipodocumentofactura_descripcion(configuracionpunvenBeanSwingJInternalFrame.getActualTipoDocumentoFacturaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {configuracionpunven.setid_tipo_documento_nota_venta((Long) value);configuracionpunven.settipodocumentonotaventa_descripcion(configuracionpunvenBeanSwingJInternalFrame.getActualTipoDocumentoNotaVentaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {configuracionpunven.setid_tipo_documento_nota_credito((Long) value);configuracionpunven.settipodocumentonotacredito_descripcion(configuracionpunvenBeanSwingJInternalFrame.getActualTipoDocumentoNotaCreditoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {configuracionpunven.setid_tipo_documento_tarjeta_credito((Long) value);configuracionpunven.settipodocumentotarjetacredito_descripcion(configuracionpunvenBeanSwingJInternalFrame.getActualTipoDocumentoTarjetaCreditoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {configuracionpunven.setid_formato_factura((Long) value);configuracionpunven.setformatofactura_descripcion(configuracionpunvenBeanSwingJInternalFrame.getActualFormatoFacturaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {configuracionpunven.setid_formato_nota_venta((Long) value);configuracionpunven.setformatonotaventa_descripcion(configuracionpunvenBeanSwingJInternalFrame.getActualFormatoNotaVentaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {configuracionpunven.setid_formato_nota_credito((Long) value);configuracionpunven.setformatonotacredito_descripcion(configuracionpunvenBeanSwingJInternalFrame.getActualFormatoNotaCreditoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {configuracionpunven.setid_transaccion_factura((Long) value);configuracionpunven.settransaccionfactura_descripcion(configuracionpunvenBeanSwingJInternalFrame.getActualTransaccionFacturaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {configuracionpunven.setid_transaccion_nota_venta((Long) value);configuracionpunven.settransaccionnotaventa_descripcion(configuracionpunvenBeanSwingJInternalFrame.getActualTransaccionNotaVentaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {configuracionpunven.setid_transaccion_nota_credito((Long) value);configuracionpunven.settransaccionnotacredito_descripcion(configuracionpunvenBeanSwingJInternalFrame.getActualTransaccionNotaCreditoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {configuracionpunven.setid_transaccion_cuenta_factura((Long) value);configuracionpunven.settransaccioncuentafactura_descripcion(configuracionpunvenBeanSwingJInternalFrame.getActualTransaccionCuentaFacturaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {configuracionpunven.setid_transaccion_cuenta_nota_venta((Long) value);configuracionpunven.settransaccioncuentanotaventa_descripcion(configuracionpunvenBeanSwingJInternalFrame.getActualTransaccionCuentaNotaVentaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {configuracionpunven.setid_transaccion_cuenta_nota_credito((Long) value);configuracionpunven.settransaccioncuentanotacredito_descripcion(configuracionpunvenBeanSwingJInternalFrame.getActualTransaccionCuentaNotaCreditoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private ConfiguracionPunVenDetalleFormJInternalFrame configuracionpunvenJInternalFrame=null;
		
		public ConfiguracionPunVenModel(ConfiguracionPunVenDetalleFormJInternalFrame configuracionpunvenJInternalFrame) {
			this.configuracionpunvenJInternalFrame=configuracionpunvenJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.configuracionpunvenJInternalFrame.getjButtonActualizarToolBarConfiguracionPunVen();
			
			if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.getjButtonActualizarToolBarConfiguracionPunVen())) {
				componentTab=this.configuracionpunvenJInternalFrame.getjButtonEliminarToolBarConfiguracionPunVen();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.getjButtonEliminarToolBarConfiguracionPunVen())) {
				componentTab=this.configuracionpunvenJInternalFrame.getjButtonCancelarToolBarConfiguracionPunVen();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.getjButtonCancelarToolBarConfiguracionPunVen())) {
				componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_empresaConfiguracionPunVen;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_transaccion_cuenta_nota_creditoConfiguracionPunVen)) {
				componentTab=this.configuracionpunvenJInternalFrame.jComboBoxTiposAccionesFormularioConfiguracionPunVen;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxTiposAccionesFormularioConfiguracionPunVen)) {
				componentTab=this.configuracionpunvenJInternalFrame.jButtonEliminarConfiguracionPunVen;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jButtonEliminarConfiguracionPunVen)) {
				componentTab=this.configuracionpunvenJInternalFrame.jButtonActualizarConfiguracionPunVen;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jButtonActualizarConfiguracionPunVen)) {
				componentTab=this.configuracionpunvenJInternalFrame.jButtonCancelarConfiguracionPunVen;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_empresaConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_sucursalConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_sucursalConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_bodegaConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_bodegaConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_cuenta_contable_efectivoConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_cuenta_contable_efectivoConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_cuenta_contable_iceConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_cuenta_contable_iceConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_cuenta_contable_otrosConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_cuenta_contable_otrosConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_cliente_consumidor_finalConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_cliente_consumidor_finalConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_tipo_documento_facturaConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_tipo_documento_facturaConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_tipo_documento_nota_ventaConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_tipo_documento_nota_ventaConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_tipo_documento_nota_creditoConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_tipo_documento_nota_creditoConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_tipo_documento_tarjeta_creditoConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_tipo_documento_tarjeta_creditoConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_formato_facturaConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_formato_facturaConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_formato_nota_ventaConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_formato_nota_ventaConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_formato_nota_creditoConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_formato_nota_creditoConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_transaccion_facturaConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_transaccion_facturaConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_transaccion_nota_ventaConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_transaccion_nota_ventaConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_transaccion_nota_creditoConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_transaccion_nota_creditoConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_transaccion_cuenta_facturaConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_transaccion_cuenta_facturaConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_transaccion_cuenta_nota_ventaConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_transaccion_cuenta_nota_ventaConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_transaccion_cuenta_nota_creditoConfiguracionPunVen;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.configuracionpunvenJInternalFrame.getjButtonActualizarToolBarConfiguracionPunVen();
			
			if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.getjButtonEliminarToolBarConfiguracionPunVen())) {
				componentTab=this.configuracionpunvenJInternalFrame.getjButtonActualizarToolBarConfiguracionPunVen();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.getjButtonCancelarToolBarConfiguracionPunVen())) {
				componentTab=this.configuracionpunvenJInternalFrame.getjButtonEliminarToolBarConfiguracionPunVen();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_empresaConfiguracionPunVen)) {
				
				componentTab=this.configuracionpunvenJInternalFrame.getjButtonCancelarToolBarConfiguracionPunVen();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxTiposAccionesFormularioConfiguracionPunVen)) {
				componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_transaccion_cuenta_nota_creditoConfiguracionPunVen;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jButtonEliminarConfiguracionPunVen)) {
				componentTab=this.configuracionpunvenJInternalFrame.jComboBoxTiposAccionesFormularioConfiguracionPunVen;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jButtonActualizarConfiguracionPunVen)) {
				componentTab=this.configuracionpunvenJInternalFrame.jButtonEliminarConfiguracionPunVen;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jButtonCancelarConfiguracionPunVen)) {
				componentTab=this.configuracionpunvenJInternalFrame.jButtonActualizarConfiguracionPunVen;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_sucursalConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_empresaConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_bodegaConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_sucursalConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_cuenta_contable_efectivoConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_bodegaConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_cuenta_contable_iceConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_cuenta_contable_efectivoConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_cuenta_contable_otrosConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_cuenta_contable_iceConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_cliente_consumidor_finalConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_cuenta_contable_otrosConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_tipo_documento_facturaConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_cliente_consumidor_finalConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_tipo_documento_nota_ventaConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_tipo_documento_facturaConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_tipo_documento_nota_creditoConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_tipo_documento_nota_ventaConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_tipo_documento_tarjeta_creditoConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_tipo_documento_nota_creditoConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_formato_facturaConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_tipo_documento_tarjeta_creditoConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_formato_nota_ventaConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_formato_facturaConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_formato_nota_creditoConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_formato_nota_ventaConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_transaccion_facturaConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_formato_nota_creditoConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_transaccion_nota_ventaConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_transaccion_facturaConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_transaccion_nota_creditoConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_transaccion_nota_ventaConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_transaccion_cuenta_facturaConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_transaccion_nota_creditoConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_transaccion_cuenta_nota_ventaConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_transaccion_cuenta_facturaConfiguracionPunVen;
			return componentTab;
		}

		if(component!=null && component.equals(this.configuracionpunvenJInternalFrame.jComboBoxid_transaccion_cuenta_nota_creditoConfiguracionPunVen)) {
			componentTab=this.configuracionpunvenJInternalFrame.jComboBoxid_transaccion_cuenta_nota_ventaConfiguracionPunVen;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.configuracionpunvenJInternalFrame.getjButtonActualizarToolBarConfiguracionPunVen();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.configuracionpunvenJInternalFrame.getjButtonActualizarToolBarConfiguracionPunVen();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.configuracionpunvenJInternalFrame.getjButtonCancelarToolBarConfiguracionPunVen();
			
			
			return componentTab;		
		}
		
		public ConfiguracionPunVenDetalleFormJInternalFrame getconfiguracionpunvenJInternalFrame() {
			return this.configuracionpunvenJInternalFrame;
		}
		
		public void setconfiguracionpunvenJInternalFrame(ConfiguracionPunVenDetalleFormJInternalFrame configuracionpunvenJInternalFrame) {
			this.configuracionpunvenJInternalFrame=configuracionpunvenJInternalFrame;
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
