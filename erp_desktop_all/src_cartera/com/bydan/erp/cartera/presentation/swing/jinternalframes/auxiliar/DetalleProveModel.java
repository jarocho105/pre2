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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.cartera.util.DetalleProveConstantesFunciones;
import com.bydan.erp.cartera.util.DetalleProveParameterReturnGeneral;
//import com.bydan.erp.cartera.util.DetalleProveParameterGeneral;

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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.DetalleProveBeanSwingJInternalFrame;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.DetalleProveJInternalFrame;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.DetalleProveDetalleFormJInternalFrame;

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
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.inventario.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class DetalleProveModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,DetalleProveConstantesFunciones.LABEL_ID
										,DetalleProveConstantesFunciones.LABEL_IDEMPRESA
										,DetalleProveConstantesFunciones.LABEL_IDSUCURSAL
										,DetalleProveConstantesFunciones.LABEL_IDSUCURSALMOVIMIENTO
										,DetalleProveConstantesFunciones.LABEL_IDEJERCICIO
										,DetalleProveConstantesFunciones.LABEL_IDPERIODO
										,DetalleProveConstantesFunciones.LABEL_IDMODULO
										,DetalleProveConstantesFunciones.LABEL_IDMONEDA
										,DetalleProveConstantesFunciones.LABEL_IDCLIENTE
										,DetalleProveConstantesFunciones.LABEL_IDTRANSACCION
										,DetalleProveConstantesFunciones.LABEL_IDASIENTOCONTABLE
										,DetalleProveConstantesFunciones.LABEL_IDFACTURA
										,DetalleProveConstantesFunciones.LABEL_IDORDENCOMPRA
										,DetalleProveConstantesFunciones.LABEL_IDESTADODETALLECLIENTE
										,DetalleProveConstantesFunciones.LABEL_FECHAVENTA
										,DetalleProveConstantesFunciones.LABEL_FECHAEMISION
										,DetalleProveConstantesFunciones.LABEL_FECHAPAGO
										,DetalleProveConstantesFunciones.LABEL_FECHAVENCIMIENTO
										,DetalleProveConstantesFunciones.LABEL_MONTOMONELOCAL
										,DetalleProveConstantesFunciones.LABEL_MONTOMONEEXTRA
										,DetalleProveConstantesFunciones.LABEL_NUMEROCOMPROBANTE
										,DetalleProveConstantesFunciones.LABEL_NUMEROFACTURA
										,DetalleProveConstantesFunciones.LABEL_DEBITOMONELOCAL
										,DetalleProveConstantesFunciones.LABEL_CREDITOMONELOCAL
										,DetalleProveConstantesFunciones.LABEL_DEBITOMONEEXTRA
										,DetalleProveConstantesFunciones.LABEL_CREDITOMONEEXTRA
										,DetalleProveConstantesFunciones.LABEL_DESCRIPCION
										,DetalleProveConstantesFunciones.LABEL_IDANIO
										,DetalleProveConstantesFunciones.LABEL_IDMES
										};
	   
	    public List<DetalleProve> detalleproves;
	  	 
	    //NO SE UTILIZA
	    public DetalleProveModel(List<DetalleProve> detalleproves,JInternalFrameBase jInternalFrameBase) {
	    	this.detalleproves=detalleproves;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public DetalleProveModel(JInternalFrameBase jInternalFrameBase) {
	    	this.detalleproves=new ArrayList<DetalleProve>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.detalleproves.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.detalleproves.get(rowIndex).getIsSelected();
	            
				case 1: return this.detalleproves.get(rowIndex).getId();
				case 2: return this.detalleproves.get(rowIndex).getid_empresa();
				case 3: return this.detalleproves.get(rowIndex).getid_sucursal();
				case 4: return this.detalleproves.get(rowIndex).getid_sucursal_movimiento();
				case 5: return this.detalleproves.get(rowIndex).getid_ejercicio();
				case 6: return this.detalleproves.get(rowIndex).getid_periodo();
				case 7: return this.detalleproves.get(rowIndex).getid_modulo();
				case 8: return this.detalleproves.get(rowIndex).getid_moneda();
				case 9: return this.detalleproves.get(rowIndex).getid_cliente();
				case 10: return this.detalleproves.get(rowIndex).getid_transaccion();
				case 11: return this.detalleproves.get(rowIndex).getid_asiento_contable();
				case 12: return this.detalleproves.get(rowIndex).getid_factura();
				case 13: return this.detalleproves.get(rowIndex).getid_orden_compra();
				case 14: return this.detalleproves.get(rowIndex).getid_estado_detalle_cliente();
				case 15: return this.detalleproves.get(rowIndex).getfecha_venta();
				case 16: return this.detalleproves.get(rowIndex).getfecha_emision();
				case 17: return this.detalleproves.get(rowIndex).getfecha_pago();
				case 18: return this.detalleproves.get(rowIndex).getfecha_vencimiento();
				case 19: return this.detalleproves.get(rowIndex).getmonto_mone_local();
				case 20: return this.detalleproves.get(rowIndex).getmonto_mone_extra();
				case 21: return this.detalleproves.get(rowIndex).getnumero_comprobante();
				case 22: return this.detalleproves.get(rowIndex).getnumero_factura();
				case 23: return this.detalleproves.get(rowIndex).getdebito_mone_local();
				case 24: return this.detalleproves.get(rowIndex).getcredito_mone_local();
				case 25: return this.detalleproves.get(rowIndex).getdebito_mone_extra();
				case 26: return this.detalleproves.get(rowIndex).getcredito_mone_extra();
				case 27: return this.detalleproves.get(rowIndex).getdescripcion();
				case 28: return this.detalleproves.get(rowIndex).getid_anio();
				case 29: return this.detalleproves.get(rowIndex).getid_mes();	            
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
				case 15: return Date.class;
				case 16: return Date.class;
				case 17: return Date.class;
				case 18: return Date.class;
				case 19: return Double.class;
				case 20: return Double.class;
				case 21: return String.class;
				case 22: return String.class;
				case 23: return Double.class;
				case 24: return Double.class;
				case 25: return Double.class;
				case 26: return Double.class;
				case 27: return String.class;
				case 28: return Long.class;
				case 29: return Long.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	DetalleProve detalleprove = this.detalleproves.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			DetalleProveBeanSwingJInternalFrame detalleproveBeanSwingJInternalFrame=(DetalleProveBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {detalleprove.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {detalleprove.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {detalleprove.setid_empresa((Long) value);detalleprove.setempresa_descripcion(detalleproveBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {detalleprove.setid_sucursal((Long) value);detalleprove.setsucursal_descripcion(detalleproveBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {detalleprove.setid_sucursal_movimiento((Long) value);detalleprove.setsucursalmovimiento_descripcion(detalleproveBeanSwingJInternalFrame.getActualSucursalMovimientoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {detalleprove.setid_ejercicio((Long) value);detalleprove.setejercicio_descripcion(detalleproveBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {detalleprove.setid_periodo((Long) value);detalleprove.setperiodo_descripcion(detalleproveBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {detalleprove.setid_modulo((Long) value);detalleprove.setmodulo_descripcion(detalleproveBeanSwingJInternalFrame.getActualModuloForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {detalleprove.setid_moneda((Long) value);detalleprove.setmoneda_descripcion(detalleproveBeanSwingJInternalFrame.getActualMonedaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {detalleprove.setid_cliente((Long) value);detalleprove.setcliente_descripcion(detalleproveBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {detalleprove.setid_transaccion((Long) value);detalleprove.settransaccion_descripcion(detalleproveBeanSwingJInternalFrame.getActualTransaccionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {detalleprove.setid_asiento_contable((Long) value);detalleprove.setasientocontable_descripcion(detalleproveBeanSwingJInternalFrame.getActualAsientoContableForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {detalleprove.setid_factura((Long) value);detalleprove.setfactura_descripcion(detalleproveBeanSwingJInternalFrame.getActualFacturaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {detalleprove.setid_orden_compra((Long) value);detalleprove.setordencompra_descripcion(detalleproveBeanSwingJInternalFrame.getActualOrdenCompraForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {detalleprove.setid_estado_detalle_cliente((Long) value);detalleprove.setestadodetallecliente_descripcion(detalleproveBeanSwingJInternalFrame.getActualEstadoDetalleClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {detalleprove.setfecha_venta((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {detalleprove.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {detalleprove.setfecha_pago((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {detalleprove.setfecha_vencimiento((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {detalleprove.setmonto_mone_local((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {detalleprove.setmonto_mone_extra((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {detalleprove.setnumero_comprobante((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {detalleprove.setnumero_factura((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {detalleprove.setdebito_mone_local((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {detalleprove.setcredito_mone_local((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {detalleprove.setdebito_mone_extra((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {detalleprove.setcredito_mone_extra((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {detalleprove.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {detalleprove.setid_anio((Long) value);detalleprove.setanio_descripcion(detalleproveBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {detalleprove.setid_mes((Long) value);detalleprove.setmes_descripcion(detalleproveBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public DetalleProveModel(JInternalFrameBase jInternalFrameBase) {
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
		private DetalleProveDetalleFormJInternalFrame detalleproveJInternalFrame=null;
		
		public DetalleProveModel(DetalleProveDetalleFormJInternalFrame detalleproveJInternalFrame) {
			this.detalleproveJInternalFrame=detalleproveJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.detalleproveJInternalFrame.getjButtonActualizarToolBarDetalleProve();
			
			if(component!=null && component.equals(this.detalleproveJInternalFrame.getjButtonActualizarToolBarDetalleProve())) {
				componentTab=this.detalleproveJInternalFrame.getjButtonEliminarToolBarDetalleProve();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleproveJInternalFrame.getjButtonEliminarToolBarDetalleProve())) {
				componentTab=this.detalleproveJInternalFrame.getjButtonCancelarToolBarDetalleProve();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleproveJInternalFrame.getjButtonCancelarToolBarDetalleProve())) {
				componentTab=this.detalleproveJInternalFrame.jComboBoxid_empresaDetalleProve;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_mesDetalleProve)) {
				componentTab=this.detalleproveJInternalFrame.jComboBoxTiposAccionesFormularioDetalleProve;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxTiposAccionesFormularioDetalleProve)) {
				componentTab=this.detalleproveJInternalFrame.jButtonEliminarDetalleProve;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleproveJInternalFrame.jButtonEliminarDetalleProve)) {
				componentTab=this.detalleproveJInternalFrame.jButtonActualizarDetalleProve;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleproveJInternalFrame.jButtonActualizarDetalleProve)) {
				componentTab=this.detalleproveJInternalFrame.jButtonCancelarDetalleProve;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_empresaDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_sucursalDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_sucursalDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_sucursal_movimientoDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_sucursal_movimientoDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_ejercicioDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_ejercicioDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_periodoDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_periodoDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_moduloDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_moduloDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_monedaDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_monedaDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_clienteDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_clienteDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_transaccionDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_transaccionDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_tipo_transaccion_moduloDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_tipo_transaccion_moduloDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_asiento_contableDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_asiento_contableDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_facturaDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_facturaDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_orden_compraDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_orden_compraDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_estado_detalle_clienteDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_estado_detalle_clienteDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jDateChooserfecha_ventaDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jDateChooserfecha_ventaDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jDateChooserfecha_emisionDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jDateChooserfecha_emisionDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jDateChooserfecha_pagoDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jDateChooserfecha_pagoDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jDateChooserfecha_vencimientoDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jDateChooserfecha_vencimientoDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jTextFieldmonto_mone_localDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jTextFieldmonto_mone_localDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jTextFieldmonto_mone_extraDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jTextFieldmonto_mone_extraDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jTextFieldnumero_comprobanteDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jTextFieldnumero_comprobanteDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jTextFieldnumero_facturaDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jTextFieldnumero_facturaDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jTextFielddebito_mone_localDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jTextFielddebito_mone_localDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jTextFieldcredito_mone_localDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jTextFieldcredito_mone_localDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jTextFielddebito_mone_extraDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jTextFielddebito_mone_extraDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jTextFieldcredito_mone_extraDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jTextFieldcredito_mone_extraDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jTextAreadescripcionDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jTextAreadescripcionDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_anioDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_anioDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_mesDetalleProve;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.detalleproveJInternalFrame.getjButtonActualizarToolBarDetalleProve();
			
			if(component!=null && component.equals(this.detalleproveJInternalFrame.getjButtonEliminarToolBarDetalleProve())) {
				componentTab=this.detalleproveJInternalFrame.getjButtonActualizarToolBarDetalleProve();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleproveJInternalFrame.getjButtonCancelarToolBarDetalleProve())) {
				componentTab=this.detalleproveJInternalFrame.getjButtonEliminarToolBarDetalleProve();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_empresaDetalleProve)) {
				
				componentTab=this.detalleproveJInternalFrame.getjButtonCancelarToolBarDetalleProve();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxTiposAccionesFormularioDetalleProve)) {
				componentTab=this.detalleproveJInternalFrame.jComboBoxid_mesDetalleProve;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleproveJInternalFrame.jButtonEliminarDetalleProve)) {
				componentTab=this.detalleproveJInternalFrame.jComboBoxTiposAccionesFormularioDetalleProve;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleproveJInternalFrame.jButtonActualizarDetalleProve)) {
				componentTab=this.detalleproveJInternalFrame.jButtonEliminarDetalleProve;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleproveJInternalFrame.jButtonCancelarDetalleProve)) {
				componentTab=this.detalleproveJInternalFrame.jButtonActualizarDetalleProve;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_sucursalDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_empresaDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_sucursal_movimientoDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_sucursalDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_ejercicioDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_sucursal_movimientoDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_periodoDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_ejercicioDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_moduloDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_periodoDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_monedaDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_moduloDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_clienteDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_monedaDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_transaccionDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_clienteDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_tipo_transaccion_moduloDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_transaccionDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_asiento_contableDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_tipo_transaccion_moduloDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_facturaDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_asiento_contableDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_orden_compraDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_facturaDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_estado_detalle_clienteDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_orden_compraDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jDateChooserfecha_ventaDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_estado_detalle_clienteDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jDateChooserfecha_emisionDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jDateChooserfecha_ventaDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jDateChooserfecha_pagoDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jDateChooserfecha_emisionDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jDateChooserfecha_vencimientoDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jDateChooserfecha_pagoDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jTextFieldmonto_mone_localDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jDateChooserfecha_vencimientoDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jTextFieldmonto_mone_extraDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jTextFieldmonto_mone_localDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jTextFieldnumero_comprobanteDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jTextFieldmonto_mone_extraDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jTextFieldnumero_facturaDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jTextFieldnumero_comprobanteDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jTextFielddebito_mone_localDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jTextFieldnumero_facturaDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jTextFieldcredito_mone_localDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jTextFielddebito_mone_localDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jTextFielddebito_mone_extraDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jTextFieldcredito_mone_localDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jTextFieldcredito_mone_extraDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jTextFielddebito_mone_extraDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jTextAreadescripcionDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jTextFieldcredito_mone_extraDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_anioDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jTextAreadescripcionDetalleProve;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproveJInternalFrame.jComboBoxid_mesDetalleProve)) {
			componentTab=this.detalleproveJInternalFrame.jComboBoxid_anioDetalleProve;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.detalleproveJInternalFrame.getjButtonActualizarToolBarDetalleProve();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.detalleproveJInternalFrame.getjButtonActualizarToolBarDetalleProve();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.detalleproveJInternalFrame.getjButtonCancelarToolBarDetalleProve();
			
			
			return componentTab;		
		}
		
		public DetalleProveDetalleFormJInternalFrame getdetalleproveJInternalFrame() {
			return this.detalleproveJInternalFrame;
		}
		
		public void setdetalleproveJInternalFrame(DetalleProveDetalleFormJInternalFrame detalleproveJInternalFrame) {
			this.detalleproveJInternalFrame=detalleproveJInternalFrame;
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
