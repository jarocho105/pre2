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

import com.bydan.erp.tesoreria.util.AutoriPagoOrdenCompraConstantesFunciones;
import com.bydan.erp.tesoreria.util.AutoriPagoOrdenCompraParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.AutoriPagoOrdenCompraParameterGeneral;

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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.AutoriPagoOrdenCompraBeanSwingJInternalFrame;
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

import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;






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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.AutoriPagoOrdenCompraJInternalFrame;

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.AutoriPagoOrdenCompraDetalleFormJInternalFrame;

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



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class AutoriPagoOrdenCompraModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,AutoriPagoOrdenCompraConstantesFunciones.LABEL_ID
										,AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDTIPOCAMBIO
										,AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDMONEDA
										,AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDCLIENTE
										,AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDEMPRESA
										,AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDSUCURSAL
										,AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDORDENCOMPRA
										,AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDTRANSACCION
										,AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDMODULO
										,AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDEJERCICIO
										,AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDUSUARIO
										,AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDASIENTOCONTABLE
										,AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDBANCO
										,AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDCUENTABANCO
										,AutoriPagoOrdenCompraConstantesFunciones.LABEL_NUMEROCOMPROBANTE
										,AutoriPagoOrdenCompraConstantesFunciones.LABEL_FECHA
										,AutoriPagoOrdenCompraConstantesFunciones.LABEL_FECHAAUTORI
										,AutoriPagoOrdenCompraConstantesFunciones.LABEL_TOTAL
										,AutoriPagoOrdenCompraConstantesFunciones.LABEL_FECHASERVIDOR
										,AutoriPagoOrdenCompraConstantesFunciones.LABEL_CODIGOASIENTO
										,AutoriPagoOrdenCompraConstantesFunciones.LABEL_FECHAASIENTO
										,AutoriPagoOrdenCompraConstantesFunciones.LABEL_VALORASIENTO
										,AutoriPagoOrdenCompraConstantesFunciones.LABEL_TOTALSALDO
										};
	   
	    public List<AutoriPagoOrdenCompra> autoripagoordencompras;
	  	 
	    //NO SE UTILIZA
	    public AutoriPagoOrdenCompraModel(List<AutoriPagoOrdenCompra> autoripagoordencompras,JInternalFrameBase jInternalFrameBase) {
	    	this.autoripagoordencompras=autoripagoordencompras;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public AutoriPagoOrdenCompraModel(JInternalFrameBase jInternalFrameBase) {
	    	this.autoripagoordencompras=new ArrayList<AutoriPagoOrdenCompra>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.autoripagoordencompras.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.autoripagoordencompras.get(rowIndex).getIsSelected();
	            
				case 1: return this.autoripagoordencompras.get(rowIndex).getId();
				case 2: return this.autoripagoordencompras.get(rowIndex).getid_tipo_cambio();
				case 3: return this.autoripagoordencompras.get(rowIndex).getid_moneda();
				case 4: return this.autoripagoordencompras.get(rowIndex).getid_cliente();
				case 5: return this.autoripagoordencompras.get(rowIndex).getid_empresa();
				case 6: return this.autoripagoordencompras.get(rowIndex).getid_sucursal();
				case 7: return this.autoripagoordencompras.get(rowIndex).getid_orden_compra();
				case 8: return this.autoripagoordencompras.get(rowIndex).getid_transaccion();
				case 9: return this.autoripagoordencompras.get(rowIndex).getid_modulo();
				case 10: return this.autoripagoordencompras.get(rowIndex).getid_ejercicio();
				case 11: return this.autoripagoordencompras.get(rowIndex).getid_usuario();
				case 12: return this.autoripagoordencompras.get(rowIndex).getid_asiento_contable();
				case 13: return this.autoripagoordencompras.get(rowIndex).getid_banco();
				case 14: return this.autoripagoordencompras.get(rowIndex).getid_cuenta_banco();
				case 15: return this.autoripagoordencompras.get(rowIndex).getnumero_comprobante();
				case 16: return this.autoripagoordencompras.get(rowIndex).getfecha();
				case 17: return this.autoripagoordencompras.get(rowIndex).getfecha_autori();
				case 18: return this.autoripagoordencompras.get(rowIndex).gettotal();
				case 19: return this.autoripagoordencompras.get(rowIndex).getfecha_servidor();
				case 20: return this.autoripagoordencompras.get(rowIndex).getcodigo_asiento();
				case 21: return this.autoripagoordencompras.get(rowIndex).getfecha_asiento();
				case 22: return this.autoripagoordencompras.get(rowIndex).getvalor_asiento();
				case 23: return this.autoripagoordencompras.get(rowIndex).gettotal_saldo();	            
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
				case 15: return String.class;
				case 16: return Date.class;
				case 17: return Date.class;
				case 18: return Double.class;
				case 19: return Date.class;
				case 20: return String.class;
				case 21: return Date.class;
				case 22: return Double.class;
				case 23: return Double.class;	            
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
	    	AutoriPagoOrdenCompra autoripagoordencompra = this.autoripagoordencompras.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			AutoriPagoOrdenCompraBeanSwingJInternalFrame autoripagoordencompraBeanSwingJInternalFrame=(AutoriPagoOrdenCompraBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {autoripagoordencompra.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {autoripagoordencompra.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {autoripagoordencompra.setid_tipo_cambio((Long) value);autoripagoordencompra.settipocambio_descripcion(autoripagoordencompraBeanSwingJInternalFrame.getActualTipoCambioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {autoripagoordencompra.setid_moneda((Long) value);autoripagoordencompra.setmoneda_descripcion(autoripagoordencompraBeanSwingJInternalFrame.getActualMonedaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {autoripagoordencompra.setid_cliente((Long) value);autoripagoordencompra.setcliente_descripcion(autoripagoordencompraBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {autoripagoordencompra.setid_empresa((Long) value);autoripagoordencompra.setempresa_descripcion(autoripagoordencompraBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {autoripagoordencompra.setid_sucursal((Long) value);autoripagoordencompra.setsucursal_descripcion(autoripagoordencompraBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {autoripagoordencompra.setid_orden_compra((Long) value);autoripagoordencompra.setordencompra_descripcion(autoripagoordencompraBeanSwingJInternalFrame.getActualOrdenCompraForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {autoripagoordencompra.setid_transaccion((Long) value);autoripagoordencompra.settransaccion_descripcion(autoripagoordencompraBeanSwingJInternalFrame.getActualTransaccionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {autoripagoordencompra.setid_modulo((Long) value);autoripagoordencompra.setmodulo_descripcion(autoripagoordencompraBeanSwingJInternalFrame.getActualModuloForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {autoripagoordencompra.setid_ejercicio((Long) value);autoripagoordencompra.setejercicio_descripcion(autoripagoordencompraBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {autoripagoordencompra.setid_usuario((Long) value);autoripagoordencompra.setusuario_descripcion(autoripagoordencompraBeanSwingJInternalFrame.getActualUsuarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {autoripagoordencompra.setid_asiento_contable((Long) value);autoripagoordencompra.setasientocontable_descripcion(autoripagoordencompraBeanSwingJInternalFrame.getActualAsientoContableForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {autoripagoordencompra.setid_banco((Long) value);autoripagoordencompra.setbanco_descripcion(autoripagoordencompraBeanSwingJInternalFrame.getActualBancoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {autoripagoordencompra.setid_cuenta_banco((Long) value);autoripagoordencompra.setcuentabanco_descripcion(autoripagoordencompraBeanSwingJInternalFrame.getActualCuentaBancoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {autoripagoordencompra.setnumero_comprobante((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {autoripagoordencompra.setfecha((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {autoripagoordencompra.setfecha_autori((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {autoripagoordencompra.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {autoripagoordencompra.setfecha_servidor((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {autoripagoordencompra.setcodigo_asiento((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {autoripagoordencompra.setfecha_asiento((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {autoripagoordencompra.setvalor_asiento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {autoripagoordencompra.settotal_saldo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public AutoriPagoOrdenCompraModel(JInternalFrameBase jInternalFrameBase) {
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
		private AutoriPagoOrdenCompraDetalleFormJInternalFrame autoripagoordencompraJInternalFrame=null;
		
		public AutoriPagoOrdenCompraModel(AutoriPagoOrdenCompraDetalleFormJInternalFrame autoripagoordencompraJInternalFrame) {
			this.autoripagoordencompraJInternalFrame=autoripagoordencompraJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.autoripagoordencompraJInternalFrame.getjButtonActualizarToolBarAutoriPagoOrdenCompra();
			
			if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.getjButtonActualizarToolBarAutoriPagoOrdenCompra())) {
				componentTab=this.autoripagoordencompraJInternalFrame.getjButtonEliminarToolBarAutoriPagoOrdenCompra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.getjButtonEliminarToolBarAutoriPagoOrdenCompra())) {
				componentTab=this.autoripagoordencompraJInternalFrame.getjButtonCancelarToolBarAutoriPagoOrdenCompra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.getjButtonCancelarToolBarAutoriPagoOrdenCompra())) {
				componentTab=this.autoripagoordencompraJInternalFrame.jComboBoxid_tipo_cambioAutoriPagoOrdenCompra;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jTextFieldtotal_saldoAutoriPagoOrdenCompra)) {
				componentTab=this.autoripagoordencompraJInternalFrame.jComboBoxTiposAccionesFormularioAutoriPagoOrdenCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jComboBoxTiposAccionesFormularioAutoriPagoOrdenCompra)) {
				componentTab=this.autoripagoordencompraJInternalFrame.jButtonEliminarAutoriPagoOrdenCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jButtonEliminarAutoriPagoOrdenCompra)) {
				componentTab=this.autoripagoordencompraJInternalFrame.jButtonActualizarAutoriPagoOrdenCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jButtonActualizarAutoriPagoOrdenCompra)) {
				componentTab=this.autoripagoordencompraJInternalFrame.jButtonCancelarAutoriPagoOrdenCompra;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jComboBoxid_tipo_cambioAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jComboBoxid_monedaAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jComboBoxid_monedaAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jComboBoxid_clienteAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jComboBoxid_clienteAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jComboBoxid_empresaAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jComboBoxid_empresaAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jComboBoxid_sucursalAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jComboBoxid_sucursalAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jComboBoxid_orden_compraAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jComboBoxid_orden_compraAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jComboBoxid_transaccionAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jComboBoxid_transaccionAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jComboBoxid_moduloAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jComboBoxid_moduloAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jComboBoxid_ejercicioAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jComboBoxid_ejercicioAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jComboBoxid_usuarioAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jComboBoxid_usuarioAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jComboBoxid_asiento_contableAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jComboBoxid_asiento_contableAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jComboBoxid_bancoAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jComboBoxid_bancoAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jComboBoxid_cuenta_bancoAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jComboBoxid_cuenta_bancoAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jTextFieldnumero_comprobanteAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jTextFieldnumero_comprobanteAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jDateChooserfechaAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jDateChooserfechaAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jDateChooserfecha_autoriAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jDateChooserfecha_autoriAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jTextFieldtotalAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jTextFieldtotalAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jDateChooserfecha_servidorAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jDateChooserfecha_servidorAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jTextFieldcodigo_asientoAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jTextFieldcodigo_asientoAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jDateChooserfecha_asientoAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jDateChooserfecha_asientoAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jTextFieldvalor_asientoAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jTextFieldvalor_asientoAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jTextFieldtotal_saldoAutoriPagoOrdenCompra;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.autoripagoordencompraJInternalFrame.getjButtonActualizarToolBarAutoriPagoOrdenCompra();
			
			if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.getjButtonEliminarToolBarAutoriPagoOrdenCompra())) {
				componentTab=this.autoripagoordencompraJInternalFrame.getjButtonActualizarToolBarAutoriPagoOrdenCompra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.getjButtonCancelarToolBarAutoriPagoOrdenCompra())) {
				componentTab=this.autoripagoordencompraJInternalFrame.getjButtonEliminarToolBarAutoriPagoOrdenCompra();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jComboBoxid_tipo_cambioAutoriPagoOrdenCompra)) {
				
				componentTab=this.autoripagoordencompraJInternalFrame.getjButtonCancelarToolBarAutoriPagoOrdenCompra();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jComboBoxTiposAccionesFormularioAutoriPagoOrdenCompra)) {
				componentTab=this.autoripagoordencompraJInternalFrame.jTextFieldtotal_saldoAutoriPagoOrdenCompra;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jButtonEliminarAutoriPagoOrdenCompra)) {
				componentTab=this.autoripagoordencompraJInternalFrame.jComboBoxTiposAccionesFormularioAutoriPagoOrdenCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jButtonActualizarAutoriPagoOrdenCompra)) {
				componentTab=this.autoripagoordencompraJInternalFrame.jButtonEliminarAutoriPagoOrdenCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jButtonCancelarAutoriPagoOrdenCompra)) {
				componentTab=this.autoripagoordencompraJInternalFrame.jButtonActualizarAutoriPagoOrdenCompra;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jComboBoxid_monedaAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jComboBoxid_tipo_cambioAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jComboBoxid_clienteAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jComboBoxid_monedaAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jComboBoxid_empresaAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jComboBoxid_clienteAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jComboBoxid_sucursalAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jComboBoxid_empresaAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jComboBoxid_orden_compraAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jComboBoxid_sucursalAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jComboBoxid_transaccionAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jComboBoxid_orden_compraAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jComboBoxid_moduloAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jComboBoxid_transaccionAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jComboBoxid_ejercicioAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jComboBoxid_moduloAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jComboBoxid_usuarioAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jComboBoxid_ejercicioAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jComboBoxid_asiento_contableAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jComboBoxid_usuarioAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jComboBoxid_bancoAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jComboBoxid_asiento_contableAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jComboBoxid_cuenta_bancoAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jComboBoxid_bancoAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jTextFieldnumero_comprobanteAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jComboBoxid_cuenta_bancoAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jDateChooserfechaAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jTextFieldnumero_comprobanteAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jDateChooserfecha_autoriAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jDateChooserfechaAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jTextFieldtotalAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jDateChooserfecha_autoriAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jDateChooserfecha_servidorAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jTextFieldtotalAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jTextFieldcodigo_asientoAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jDateChooserfecha_servidorAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jDateChooserfecha_asientoAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jTextFieldcodigo_asientoAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jTextFieldvalor_asientoAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jDateChooserfecha_asientoAutoriPagoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.autoripagoordencompraJInternalFrame.jTextFieldtotal_saldoAutoriPagoOrdenCompra)) {
			componentTab=this.autoripagoordencompraJInternalFrame.jTextFieldvalor_asientoAutoriPagoOrdenCompra;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.autoripagoordencompraJInternalFrame.getjButtonActualizarToolBarAutoriPagoOrdenCompra();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.autoripagoordencompraJInternalFrame.getjButtonActualizarToolBarAutoriPagoOrdenCompra();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.autoripagoordencompraJInternalFrame.getjButtonCancelarToolBarAutoriPagoOrdenCompra();
			
			
			return componentTab;		
		}
		
		public AutoriPagoOrdenCompraDetalleFormJInternalFrame getautoripagoordencompraJInternalFrame() {
			return this.autoripagoordencompraJInternalFrame;
		}
		
		public void setautoripagoordencompraJInternalFrame(AutoriPagoOrdenCompraDetalleFormJInternalFrame autoripagoordencompraJInternalFrame) {
			this.autoripagoordencompraJInternalFrame=autoripagoordencompraJInternalFrame;
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
