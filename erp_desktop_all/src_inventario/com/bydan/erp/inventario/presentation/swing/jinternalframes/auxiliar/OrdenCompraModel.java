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

import com.bydan.erp.inventario.util.OrdenCompraConstantesFunciones;
import com.bydan.erp.inventario.util.OrdenCompraParameterReturnGeneral;
//import com.bydan.erp.inventario.util.OrdenCompraParameterGeneral;

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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.OrdenCompraBeanSwingJInternalFrame;
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
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.sris.business.logic.*;

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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;






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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.OrdenCompraJInternalFrame;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.OrdenCompraDetalleFormJInternalFrame;

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
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.sris.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class OrdenCompraModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,OrdenCompraConstantesFunciones.LABEL_ID
										,OrdenCompraConstantesFunciones.LABEL_IDEMPRESA
										,OrdenCompraConstantesFunciones.LABEL_IDSUCURSAL
										,OrdenCompraConstantesFunciones.LABEL_IDMODULO
										,OrdenCompraConstantesFunciones.LABEL_IDEJERCICIO
										,OrdenCompraConstantesFunciones.LABEL_IDPERIODO
										,OrdenCompraConstantesFunciones.LABEL_IDANIO
										,OrdenCompraConstantesFunciones.LABEL_IDMES
										,OrdenCompraConstantesFunciones.LABEL_IDUSUARIO
										,OrdenCompraConstantesFunciones.LABEL_FECHAEMISION
										,OrdenCompraConstantesFunciones.LABEL_FECHAENTREGA
										,OrdenCompraConstantesFunciones.LABEL_NUMEROSECUENCIAL
										,OrdenCompraConstantesFunciones.LABEL_IDMONEDA
										,OrdenCompraConstantesFunciones.LABEL_IDTIPOCAMBIO
										,OrdenCompraConstantesFunciones.LABEL_IDESTADOORDENCOMPRA
										,OrdenCompraConstantesFunciones.LABEL_IDCLIENTE
										,OrdenCompraConstantesFunciones.LABEL_IDFORMATO
										,OrdenCompraConstantesFunciones.LABEL_IDTRANSPORTISTA
										,OrdenCompraConstantesFunciones.LABEL_IDEMPLEADO
										,OrdenCompraConstantesFunciones.LABEL_DESCRIPCION
										,OrdenCompraConstantesFunciones.LABEL_PORCENTAJEDESCUENTO
										,OrdenCompraConstantesFunciones.LABEL_SUMAN
										,OrdenCompraConstantesFunciones.LABEL_ICE
										,OrdenCompraConstantesFunciones.LABEL_VALORDESCUENTO
										,OrdenCompraConstantesFunciones.LABEL_TOTALDESCUENTO
										,OrdenCompraConstantesFunciones.LABEL_IVA
										,OrdenCompraConstantesFunciones.LABEL_STOCK
										,OrdenCompraConstantesFunciones.LABEL_SUBTOTAL
										,OrdenCompraConstantesFunciones.LABEL_TOTALOTRO
										,OrdenCompraConstantesFunciones.LABEL_ULTIMOCOSTO
										,OrdenCompraConstantesFunciones.LABEL_NUMEROITEMS
										,OrdenCompraConstantesFunciones.LABEL_RETENCION
										,OrdenCompraConstantesFunciones.LABEL_TOTAL
										};
	   
	    public List<OrdenCompra> ordencompras;
	  	 
	    //NO SE UTILIZA
	    public OrdenCompraModel(List<OrdenCompra> ordencompras,JInternalFrameBase jInternalFrameBase) {
	    	this.ordencompras=ordencompras;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public OrdenCompraModel(JInternalFrameBase jInternalFrameBase) {
	    	this.ordencompras=new ArrayList<OrdenCompra>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.ordencompras.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.ordencompras.get(rowIndex).getIsSelected();
	            
				case 1: return this.ordencompras.get(rowIndex).getId();
				case 2: return this.ordencompras.get(rowIndex).getid_empresa();
				case 3: return this.ordencompras.get(rowIndex).getid_sucursal();
				case 4: return this.ordencompras.get(rowIndex).getid_modulo();
				case 5: return this.ordencompras.get(rowIndex).getid_ejercicio();
				case 6: return this.ordencompras.get(rowIndex).getid_periodo();
				case 7: return this.ordencompras.get(rowIndex).getid_anio();
				case 8: return this.ordencompras.get(rowIndex).getid_mes();
				case 9: return this.ordencompras.get(rowIndex).getid_usuario();
				case 10: return this.ordencompras.get(rowIndex).getfecha_emision();
				case 11: return this.ordencompras.get(rowIndex).getfecha_entrega();
				case 12: return this.ordencompras.get(rowIndex).getnumero_secuencial();
				case 13: return this.ordencompras.get(rowIndex).getid_moneda();
				case 14: return this.ordencompras.get(rowIndex).getid_tipo_cambio();
				case 15: return this.ordencompras.get(rowIndex).getid_estado_orden_compra();
				case 16: return this.ordencompras.get(rowIndex).getid_cliente();
				case 17: return this.ordencompras.get(rowIndex).getid_formato();
				case 18: return this.ordencompras.get(rowIndex).getid_transportista();
				case 19: return this.ordencompras.get(rowIndex).getid_empleado();
				case 20: return this.ordencompras.get(rowIndex).getdescripcion();
				case 21: return this.ordencompras.get(rowIndex).getporcentaje_descuento();
				case 22: return this.ordencompras.get(rowIndex).getsuman();
				case 23: return this.ordencompras.get(rowIndex).getice();
				case 24: return this.ordencompras.get(rowIndex).getvalor_descuento();
				case 25: return this.ordencompras.get(rowIndex).gettotal_descuento();
				case 26: return this.ordencompras.get(rowIndex).getiva();
				case 27: return this.ordencompras.get(rowIndex).getstock();
				case 28: return this.ordencompras.get(rowIndex).getsub_total();
				case 29: return this.ordencompras.get(rowIndex).gettotal_otro();
				case 30: return this.ordencompras.get(rowIndex).getultimo_costo();
				case 31: return this.ordencompras.get(rowIndex).getnumero_items();
				case 32: return this.ordencompras.get(rowIndex).getretencion();
				case 33: return this.ordencompras.get(rowIndex).gettotal();	            
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
				case 19: return Long.class;
				case 20: return String.class;
				case 21: return Double.class;
				case 22: return Double.class;
				case 23: return Double.class;
				case 24: return Double.class;
				case 25: return Double.class;
				case 26: return Double.class;
				case 27: return Double.class;
				case 28: return Double.class;
				case 29: return Double.class;
				case 30: return Double.class;
				case 31: return Double.class;
				case 32: return Double.class;
				case 33: return Double.class;	            
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
	    	OrdenCompra ordencompra = this.ordencompras.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			OrdenCompraBeanSwingJInternalFrame ordencompraBeanSwingJInternalFrame=(OrdenCompraBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {ordencompra.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {ordencompra.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {ordencompra.setid_empresa((Long) value);ordencompra.setempresa_descripcion(ordencompraBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {ordencompra.setid_sucursal((Long) value);ordencompra.setsucursal_descripcion(ordencompraBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {ordencompra.setid_modulo((Long) value);ordencompra.setmodulo_descripcion(ordencompraBeanSwingJInternalFrame.getActualModuloForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {ordencompra.setid_ejercicio((Long) value);ordencompra.setejercicio_descripcion(ordencompraBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {ordencompra.setid_periodo((Long) value);ordencompra.setperiodo_descripcion(ordencompraBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {ordencompra.setid_anio((Long) value);ordencompra.setanio_descripcion(ordencompraBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {ordencompra.setid_mes((Long) value);ordencompra.setmes_descripcion(ordencompraBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {ordencompra.setid_usuario((Long) value);ordencompra.setusuario_descripcion(ordencompraBeanSwingJInternalFrame.getActualUsuarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {ordencompra.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {ordencompra.setfecha_entrega((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {ordencompra.setnumero_secuencial((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {ordencompra.setid_moneda((Long) value);ordencompra.setmoneda_descripcion(ordencompraBeanSwingJInternalFrame.getActualMonedaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {ordencompra.setid_tipo_cambio((Long) value);ordencompra.settipocambio_descripcion(ordencompraBeanSwingJInternalFrame.getActualTipoCambioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {ordencompra.setid_estado_orden_compra((Long) value);ordencompra.setestadoordencompra_descripcion(ordencompraBeanSwingJInternalFrame.getActualEstadoOrdenCompraForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {ordencompra.setid_cliente((Long) value);ordencompra.setcliente_descripcion(ordencompraBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {ordencompra.setid_formato((Long) value);ordencompra.setformato_descripcion(ordencompraBeanSwingJInternalFrame.getActualFormatoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {ordencompra.setid_transportista((Long) value);ordencompra.settransportista_descripcion(ordencompraBeanSwingJInternalFrame.getActualTransportistaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {ordencompra.setid_empleado((Long) value);ordencompra.setempleado_descripcion(ordencompraBeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {ordencompra.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {ordencompra.setporcentaje_descuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {ordencompra.setsuman((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {ordencompra.setice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {ordencompra.setvalor_descuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {ordencompra.settotal_descuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {ordencompra.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {ordencompra.setstock((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {ordencompra.setsub_total((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {ordencompra.settotal_otro((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {ordencompra.setultimo_costo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {ordencompra.setnumero_items((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {ordencompra.setretencion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {ordencompra.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public OrdenCompraModel(JInternalFrameBase jInternalFrameBase) {
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
		private OrdenCompraDetalleFormJInternalFrame ordencompraJInternalFrame=null;
		
		public OrdenCompraModel(OrdenCompraDetalleFormJInternalFrame ordencompraJInternalFrame) {
			this.ordencompraJInternalFrame=ordencompraJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.ordencompraJInternalFrame.getjButtonActualizarToolBarOrdenCompra();
			
			if(component!=null && component.equals(this.ordencompraJInternalFrame.getjButtonActualizarToolBarOrdenCompra())) {
				componentTab=this.ordencompraJInternalFrame.getjButtonEliminarToolBarOrdenCompra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.ordencompraJInternalFrame.getjButtonEliminarToolBarOrdenCompra())) {
				componentTab=this.ordencompraJInternalFrame.getjButtonCancelarToolBarOrdenCompra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.ordencompraJInternalFrame.getjButtonCancelarToolBarOrdenCompra())) {
				componentTab=this.ordencompraJInternalFrame.jComboBoxid_empresaOrdenCompra;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.ordencompraJInternalFrame.jDateChooserfechaOrdenCompra)) {
				componentTab=this.ordencompraJInternalFrame.jComboBoxTiposAccionesFormularioOrdenCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxTiposAccionesFormularioOrdenCompra)) {
				componentTab=this.ordencompraJInternalFrame.jButtonEliminarOrdenCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.ordencompraJInternalFrame.jButtonEliminarOrdenCompra)) {
				componentTab=this.ordencompraJInternalFrame.jButtonActualizarOrdenCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.ordencompraJInternalFrame.jButtonActualizarOrdenCompra)) {
				componentTab=this.ordencompraJInternalFrame.jButtonCancelarOrdenCompra;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_empresaOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_sucursalOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_sucursalOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_moduloOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_moduloOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_ejercicioOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_ejercicioOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_periodoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_periodoOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_anioOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_anioOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_mesOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_mesOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_usuarioOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_usuarioOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jDateChooserfecha_emisionOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jDateChooserfecha_emisionOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jDateChooserfecha_entregaOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jDateChooserfecha_entregaOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_monedaOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_monedaOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_tipo_cambioOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_tipo_cambioOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_clienteOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_clienteOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_formatoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_formatoOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_transportistaOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_transportistaOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_empleadoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_empleadoOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextAreadescripcionOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextAreadescripcionOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldporcentaje_descuentoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldporcentaje_descuentoOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldsumanOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldsumanOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldiceOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldiceOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldvalor_descuentoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldvalor_descuentoOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldtotal_descuentoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldtotal_descuentoOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldivaOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldivaOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldstockOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldstockOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldsub_totalOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldsub_totalOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldtotal_otroOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldtotal_otroOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldultimo_costoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldultimo_costoOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldnumero_itemsOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldnumero_itemsOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldretencionOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldretencionOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldtotalOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldtotalOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldfleteOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldfleteOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldimpuestoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldimpuestoOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_tipo_transaccion_moduloOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_tipo_transaccion_moduloOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_orden_compraOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_orden_compraOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_asiento_contableOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_asiento_contableOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldnumero_comprobanteOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldnumero_comprobanteOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jDateChooserfechaOrdenCompra;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.ordencompraJInternalFrame.getjButtonActualizarToolBarOrdenCompra();
			
			if(component!=null && component.equals(this.ordencompraJInternalFrame.getjButtonEliminarToolBarOrdenCompra())) {
				componentTab=this.ordencompraJInternalFrame.getjButtonActualizarToolBarOrdenCompra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.ordencompraJInternalFrame.getjButtonCancelarToolBarOrdenCompra())) {
				componentTab=this.ordencompraJInternalFrame.getjButtonEliminarToolBarOrdenCompra();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_empresaOrdenCompra)) {
				
				componentTab=this.ordencompraJInternalFrame.getjButtonCancelarToolBarOrdenCompra();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxTiposAccionesFormularioOrdenCompra)) {
				componentTab=this.ordencompraJInternalFrame.jDateChooserfechaOrdenCompra;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.ordencompraJInternalFrame.jButtonEliminarOrdenCompra)) {
				componentTab=this.ordencompraJInternalFrame.jComboBoxTiposAccionesFormularioOrdenCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.ordencompraJInternalFrame.jButtonActualizarOrdenCompra)) {
				componentTab=this.ordencompraJInternalFrame.jButtonEliminarOrdenCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.ordencompraJInternalFrame.jButtonCancelarOrdenCompra)) {
				componentTab=this.ordencompraJInternalFrame.jButtonActualizarOrdenCompra;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_sucursalOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_empresaOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_moduloOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_sucursalOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_ejercicioOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_moduloOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_periodoOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_ejercicioOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_anioOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_periodoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_mesOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_anioOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_usuarioOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_mesOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jDateChooserfecha_emisionOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_usuarioOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jDateChooserfecha_entregaOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jDateChooserfecha_emisionOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_monedaOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jDateChooserfecha_entregaOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_tipo_cambioOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_monedaOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_clienteOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_tipo_cambioOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_formatoOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_clienteOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_transportistaOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_formatoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_empleadoOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_transportistaOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextAreadescripcionOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_empleadoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldporcentaje_descuentoOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextAreadescripcionOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldsumanOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldporcentaje_descuentoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldiceOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldsumanOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldvalor_descuentoOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldiceOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldtotal_descuentoOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldvalor_descuentoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldivaOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldtotal_descuentoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldstockOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldivaOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldsub_totalOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldstockOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldtotal_otroOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldsub_totalOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldultimo_costoOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldtotal_otroOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldnumero_itemsOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldultimo_costoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldretencionOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldnumero_itemsOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldtotalOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldretencionOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldfleteOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldtotalOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldimpuestoOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldfleteOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_tipo_transaccion_moduloOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldimpuestoOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_orden_compraOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_tipo_transaccion_moduloOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jComboBoxid_asiento_contableOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_orden_compraOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jTextFieldnumero_comprobanteOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jComboBoxid_asiento_contableOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordencompraJInternalFrame.jDateChooserfechaOrdenCompra)) {
			componentTab=this.ordencompraJInternalFrame.jTextFieldnumero_comprobanteOrdenCompra;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.ordencompraJInternalFrame.getjButtonActualizarToolBarOrdenCompra();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.ordencompraJInternalFrame.getjButtonActualizarToolBarOrdenCompra();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.ordencompraJInternalFrame.getjButtonCancelarToolBarOrdenCompra();
			
			
			return componentTab;		
		}
		
		public OrdenCompraDetalleFormJInternalFrame getordencompraJInternalFrame() {
			return this.ordencompraJInternalFrame;
		}
		
		public void setordencompraJInternalFrame(OrdenCompraDetalleFormJInternalFrame ordencompraJInternalFrame) {
			this.ordencompraJInternalFrame=ordencompraJInternalFrame;
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
