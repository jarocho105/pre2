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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.inventario.util.CompraConstantesFunciones;
import com.bydan.erp.inventario.util.CompraParameterReturnGeneral;
//import com.bydan.erp.inventario.util.CompraParameterGeneral;

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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.CompraBeanSwingJInternalFrame;
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
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.CompraJInternalFrame;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.CompraDetalleFormJInternalFrame;

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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.tesoreria.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class CompraModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,CompraConstantesFunciones.LABEL_ID
										,CompraConstantesFunciones.LABEL_IDEMPRESA
										,CompraConstantesFunciones.LABEL_IDSUCURSAL
										,CompraConstantesFunciones.LABEL_IDMODULO
										,CompraConstantesFunciones.LABEL_IDEJERCICIO
										,CompraConstantesFunciones.LABEL_IDPERIODO
										,CompraConstantesFunciones.LABEL_IDANIO
										,CompraConstantesFunciones.LABEL_IDMES
										,CompraConstantesFunciones.LABEL_IDUSUARIO
										,CompraConstantesFunciones.LABEL_FECHAEMISION
										,CompraConstantesFunciones.LABEL_FECHAENTREGA
										,CompraConstantesFunciones.LABEL_NUMEROSECUENCIAL
										,CompraConstantesFunciones.LABEL_IDMONEDA
										,CompraConstantesFunciones.LABEL_IDTIPOCAMBIO
										,CompraConstantesFunciones.LABEL_IDESTADOINVENTARIO
										,CompraConstantesFunciones.LABEL_IDCLIENTE
										,CompraConstantesFunciones.LABEL_IDFORMATO
										,CompraConstantesFunciones.LABEL_IDEMPLEADO
										,CompraConstantesFunciones.LABEL_NUMEROFACTURA
										,CompraConstantesFunciones.LABEL_IDTRANSPORTISTA
										,CompraConstantesFunciones.LABEL_DESCRIPCION
										,CompraConstantesFunciones.LABEL_IDORDENCOMPRA
										,CompraConstantesFunciones.LABEL_IDPEDIDOCOMPRA
										,CompraConstantesFunciones.LABEL_AUTORIUSUARIO
										,CompraConstantesFunciones.LABEL_FACTURAINICIAL
										,CompraConstantesFunciones.LABEL_FACTURAFINAL
										,CompraConstantesFunciones.LABEL_SERVICIODOCUMENTO
										,CompraConstantesFunciones.LABEL_FECHAVALOR
										,CompraConstantesFunciones.LABEL_PORCENTAJEDESCUENTO
										,CompraConstantesFunciones.LABEL_SUMAN
										,CompraConstantesFunciones.LABEL_ICE
										,CompraConstantesFunciones.LABEL_VALORDESCUENTO
										,CompraConstantesFunciones.LABEL_TOTALDESCUENTO
										,CompraConstantesFunciones.LABEL_IVA
										,CompraConstantesFunciones.LABEL_STOCK
										,CompraConstantesFunciones.LABEL_SUBTOTAL
										,CompraConstantesFunciones.LABEL_TOTALOTRO
										,CompraConstantesFunciones.LABEL_ULTIMOCOSTO
										,CompraConstantesFunciones.LABEL_NUMEROITEMS
										,CompraConstantesFunciones.LABEL_RETENCION
										,CompraConstantesFunciones.LABEL_TOTAL
										};
	   
	    public List<Compra> compras;
	  	 
	    //NO SE UTILIZA
	    public CompraModel(List<Compra> compras,JInternalFrameBase jInternalFrameBase) {
	    	this.compras=compras;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public CompraModel(JInternalFrameBase jInternalFrameBase) {
	    	this.compras=new ArrayList<Compra>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.compras.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.compras.get(rowIndex).getIsSelected();
	            
				case 1: return this.compras.get(rowIndex).getId();
				case 2: return this.compras.get(rowIndex).getid_empresa();
				case 3: return this.compras.get(rowIndex).getid_sucursal();
				case 4: return this.compras.get(rowIndex).getid_modulo();
				case 5: return this.compras.get(rowIndex).getid_ejercicio();
				case 6: return this.compras.get(rowIndex).getid_periodo();
				case 7: return this.compras.get(rowIndex).getid_anio();
				case 8: return this.compras.get(rowIndex).getid_mes();
				case 9: return this.compras.get(rowIndex).getid_usuario();
				case 10: return this.compras.get(rowIndex).getfecha_emision();
				case 11: return this.compras.get(rowIndex).getfecha_entrega();
				case 12: return this.compras.get(rowIndex).getnumero_secuencial();
				case 13: return this.compras.get(rowIndex).getid_moneda();
				case 14: return this.compras.get(rowIndex).getid_tipo_cambio();
				case 15: return this.compras.get(rowIndex).getid_estado_inventario();
				case 16: return this.compras.get(rowIndex).getid_cliente();
				case 17: return this.compras.get(rowIndex).getid_formato();
				case 18: return this.compras.get(rowIndex).getid_empleado();
				case 19: return this.compras.get(rowIndex).getnumero_factura();
				case 20: return this.compras.get(rowIndex).getid_transportista();
				case 21: return this.compras.get(rowIndex).getdescripcion();
				case 22: return this.compras.get(rowIndex).getid_orden_compra();
				case 23: return this.compras.get(rowIndex).getid_pedido_compra();
				case 24: return this.compras.get(rowIndex).getautori_usuario();
				case 25: return this.compras.get(rowIndex).getfactura_inicial();
				case 26: return this.compras.get(rowIndex).getfactura_final();
				case 27: return this.compras.get(rowIndex).getservicio_documento();
				case 28: return this.compras.get(rowIndex).getfecha_valor();
				case 29: return this.compras.get(rowIndex).getporcentaje_descuento();
				case 30: return this.compras.get(rowIndex).getsuman();
				case 31: return this.compras.get(rowIndex).getice();
				case 32: return this.compras.get(rowIndex).getvalor_descuento();
				case 33: return this.compras.get(rowIndex).gettotal_descuento();
				case 34: return this.compras.get(rowIndex).getiva();
				case 35: return this.compras.get(rowIndex).getstock();
				case 36: return this.compras.get(rowIndex).getsub_total();
				case 37: return this.compras.get(rowIndex).gettotal_otro();
				case 38: return this.compras.get(rowIndex).getultimo_costo();
				case 39: return this.compras.get(rowIndex).getnumero_items();
				case 40: return this.compras.get(rowIndex).getretencion();
				case 41: return this.compras.get(rowIndex).gettotal();	            
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
				case 10: return Date.class;
				case 11: return Date.class;
				case 12: return String.class;
				case 13: return Long.class;
				case 14: return Long.class;
				case 15: return Long.class;
				case 16: return Long.class;
				case 17: return Long.class;
				case 18: return Long.class;
				case 19: return String.class;
				case 20: return Long.class;
				case 21: return String.class;
				case 22: return Long.class;
				case 23: return Long.class;
				case 24: return String.class;
				case 25: return String.class;
				case 26: return String.class;
				case 27: return String.class;
				case 28: return Date.class;
				case 29: return Double.class;
				case 30: return Double.class;
				case 31: return Double.class;
				case 32: return Double.class;
				case 33: return Double.class;
				case 34: return Double.class;
				case 35: return Double.class;
				case 36: return Double.class;
				case 37: return Double.class;
				case 38: return Double.class;
				case 39: return Integer.class;
				case 40: return Double.class;
				case 41: return Double.class;	            
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
				case 34: return true;
				case 35: return true;
				case 36: return true;
				case 37: return true;
				case 38: return true;
				case 39: return true;
				case 40: return true;
				case 41: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	Compra compra = this.compras.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			CompraBeanSwingJInternalFrame compraBeanSwingJInternalFrame=(CompraBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {compra.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {compra.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {compra.setid_empresa((Long) value);compra.setempresa_descripcion(compraBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {compra.setid_sucursal((Long) value);compra.setsucursal_descripcion(compraBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {compra.setid_modulo((Long) value);compra.setmodulo_descripcion(compraBeanSwingJInternalFrame.getActualModuloForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {compra.setid_ejercicio((Long) value);compra.setejercicio_descripcion(compraBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {compra.setid_periodo((Long) value);compra.setperiodo_descripcion(compraBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {compra.setid_anio((Long) value);compra.setanio_descripcion(compraBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {compra.setid_mes((Long) value);compra.setmes_descripcion(compraBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {compra.setid_usuario((Long) value);compra.setusuario_descripcion(compraBeanSwingJInternalFrame.getActualUsuarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {compra.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {compra.setfecha_entrega((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {compra.setnumero_secuencial((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {compra.setid_moneda((Long) value);compra.setmoneda_descripcion(compraBeanSwingJInternalFrame.getActualMonedaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {compra.setid_tipo_cambio((Long) value);compra.settipocambio_descripcion(compraBeanSwingJInternalFrame.getActualTipoCambioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {compra.setid_estado_inventario((Long) value);compra.setestadoinventario_descripcion(compraBeanSwingJInternalFrame.getActualEstadoInventarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {compra.setid_cliente((Long) value);compra.setcliente_descripcion(compraBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {compra.setid_formato((Long) value);compra.setformato_descripcion(compraBeanSwingJInternalFrame.getActualFormatoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {compra.setid_empleado((Long) value);compra.setempleado_descripcion(compraBeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {compra.setnumero_factura((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {compra.setid_transportista((Long) value);compra.settransportista_descripcion(compraBeanSwingJInternalFrame.getActualTransportistaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {compra.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {compra.setid_orden_compra((Long) value);compra.setordencompra_descripcion(compraBeanSwingJInternalFrame.getActualOrdenCompraForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {compra.setid_pedido_compra((Long) value);compra.setpedidocompra_descripcion(compraBeanSwingJInternalFrame.getActualPedidoCompraForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {compra.setautori_usuario((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {compra.setfactura_inicial((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {compra.setfactura_final((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {compra.setservicio_documento((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {compra.setfecha_valor((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {compra.setporcentaje_descuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {compra.setsuman((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {compra.setice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {compra.setvalor_descuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {compra.settotal_descuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 34: try {compra.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 35: try {compra.setstock((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 36: try {compra.setsub_total((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 37: try {compra.settotal_otro((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 38: try {compra.setultimo_costo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 39: try {compra.setnumero_items((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 40: try {compra.setretencion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 41: try {compra.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public CompraModel(JInternalFrameBase jInternalFrameBase) {
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
		private CompraDetalleFormJInternalFrame compraJInternalFrame=null;
		
		public CompraModel(CompraDetalleFormJInternalFrame compraJInternalFrame) {
			this.compraJInternalFrame=compraJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.compraJInternalFrame.getjButtonActualizarToolBarCompra();
			
			if(component!=null && component.equals(this.compraJInternalFrame.getjButtonActualizarToolBarCompra())) {
				componentTab=this.compraJInternalFrame.getjButtonEliminarToolBarCompra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.compraJInternalFrame.getjButtonEliminarToolBarCompra())) {
				componentTab=this.compraJInternalFrame.getjButtonCancelarToolBarCompra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.compraJInternalFrame.getjButtonCancelarToolBarCompra())) {
				componentTab=this.compraJInternalFrame.jComboBoxid_empresaCompra;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.compraJInternalFrame.jDateChooserfechaCompra)) {
				componentTab=this.compraJInternalFrame.jComboBoxTiposAccionesFormularioCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxTiposAccionesFormularioCompra)) {
				componentTab=this.compraJInternalFrame.jButtonEliminarCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.compraJInternalFrame.jButtonEliminarCompra)) {
				componentTab=this.compraJInternalFrame.jButtonActualizarCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.compraJInternalFrame.jButtonActualizarCompra)) {
				componentTab=this.compraJInternalFrame.jButtonCancelarCompra;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_empresaCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_sucursalCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_sucursalCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_moduloCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_moduloCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_ejercicioCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_ejercicioCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_periodoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_periodoCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_anioCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_anioCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_mesCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_mesCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_usuarioCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_usuarioCompra)) {
			componentTab=this.compraJInternalFrame.jDateChooserfecha_emisionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jDateChooserfecha_emisionCompra)) {
			componentTab=this.compraJInternalFrame.jDateChooserfecha_entregaCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jDateChooserfecha_entregaCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldnumero_secuencialCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldnumero_secuencialCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_monedaCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_monedaCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_tipo_cambioCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_tipo_cambioCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_clienteCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_clienteCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_formatoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_formatoCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_empleadoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_empleadoCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldnumero_facturaCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldnumero_facturaCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_transportistaCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_transportistaCompra)) {
			componentTab=this.compraJInternalFrame.jTextAreadescripcionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextAreadescripcionCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_orden_compraCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_orden_compraCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_pedido_compraCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_pedido_compraCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldautori_usuarioCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldautori_usuarioCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldfactura_inicialCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldfactura_inicialCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldfactura_finalCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldfactura_finalCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldservicio_documentoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldservicio_documentoCompra)) {
			componentTab=this.compraJInternalFrame.jDateChooserfecha_valorCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jDateChooserfecha_valorCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldporcentaje_descuentoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldporcentaje_descuentoCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldsumanCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldsumanCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldiceCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldiceCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldvalor_descuentoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldvalor_descuentoCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldtotal_descuentoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldtotal_descuentoCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldivaCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldivaCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldstockCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldstockCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldsub_totalCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldsub_totalCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldtotal_otroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldtotal_otroCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldultimo_costoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldultimo_costoCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldnumero_itemsCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldnumero_itemsCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldretencionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldretencionCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldtotalCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldtotalCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldfleteCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldfleteCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldimpuestoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldimpuestoCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_tipo_transaccion_moduloCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_tipo_transaccion_moduloCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_asiento_contableCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_asiento_contableCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldnumero_comprobanteCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldnumero_comprobanteCompra)) {
			componentTab=this.compraJInternalFrame.jDateChooserfechaCompra;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.compraJInternalFrame.getjButtonActualizarToolBarCompra();
			
			if(component!=null && component.equals(this.compraJInternalFrame.getjButtonEliminarToolBarCompra())) {
				componentTab=this.compraJInternalFrame.getjButtonActualizarToolBarCompra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.compraJInternalFrame.getjButtonCancelarToolBarCompra())) {
				componentTab=this.compraJInternalFrame.getjButtonEliminarToolBarCompra();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_empresaCompra)) {
				
				componentTab=this.compraJInternalFrame.getjButtonCancelarToolBarCompra();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxTiposAccionesFormularioCompra)) {
				componentTab=this.compraJInternalFrame.jDateChooserfechaCompra;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.compraJInternalFrame.jButtonEliminarCompra)) {
				componentTab=this.compraJInternalFrame.jComboBoxTiposAccionesFormularioCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.compraJInternalFrame.jButtonActualizarCompra)) {
				componentTab=this.compraJInternalFrame.jButtonEliminarCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.compraJInternalFrame.jButtonCancelarCompra)) {
				componentTab=this.compraJInternalFrame.jButtonActualizarCompra;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_sucursalCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_empresaCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_moduloCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_sucursalCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_ejercicioCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_moduloCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_periodoCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_ejercicioCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_anioCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_periodoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_mesCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_anioCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_usuarioCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_mesCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jDateChooserfecha_emisionCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_usuarioCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jDateChooserfecha_entregaCompra)) {
			componentTab=this.compraJInternalFrame.jDateChooserfecha_emisionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldnumero_secuencialCompra)) {
			componentTab=this.compraJInternalFrame.jDateChooserfecha_entregaCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_monedaCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldnumero_secuencialCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_tipo_cambioCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_monedaCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_clienteCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_tipo_cambioCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_formatoCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_clienteCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_empleadoCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_formatoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldnumero_facturaCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_empleadoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_transportistaCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldnumero_facturaCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextAreadescripcionCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_transportistaCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_orden_compraCompra)) {
			componentTab=this.compraJInternalFrame.jTextAreadescripcionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_pedido_compraCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_orden_compraCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldautori_usuarioCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_pedido_compraCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldfactura_inicialCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldautori_usuarioCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldfactura_finalCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldfactura_inicialCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldservicio_documentoCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldfactura_finalCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jDateChooserfecha_valorCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldservicio_documentoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldporcentaje_descuentoCompra)) {
			componentTab=this.compraJInternalFrame.jDateChooserfecha_valorCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldsumanCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldporcentaje_descuentoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldiceCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldsumanCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldvalor_descuentoCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldiceCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldtotal_descuentoCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldvalor_descuentoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldivaCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldtotal_descuentoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldstockCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldivaCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldsub_totalCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldstockCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldtotal_otroCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldsub_totalCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldultimo_costoCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldtotal_otroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldnumero_itemsCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldultimo_costoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldretencionCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldnumero_itemsCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldtotalCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldretencionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldfleteCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldtotalCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldimpuestoCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldfleteCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_tipo_transaccion_moduloCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldimpuestoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jComboBoxid_asiento_contableCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_tipo_transaccion_moduloCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jTextFieldnumero_comprobanteCompra)) {
			componentTab=this.compraJInternalFrame.jComboBoxid_asiento_contableCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.compraJInternalFrame.jDateChooserfechaCompra)) {
			componentTab=this.compraJInternalFrame.jTextFieldnumero_comprobanteCompra;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.compraJInternalFrame.getjButtonActualizarToolBarCompra();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.compraJInternalFrame.getjButtonActualizarToolBarCompra();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.compraJInternalFrame.getjButtonCancelarToolBarCompra();
			
			
			return componentTab;		
		}
		
		public CompraDetalleFormJInternalFrame getcompraJInternalFrame() {
			return this.compraJInternalFrame;
		}
		
		public void setcompraJInternalFrame(CompraDetalleFormJInternalFrame compraJInternalFrame) {
			this.compraJInternalFrame=compraJInternalFrame;
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
