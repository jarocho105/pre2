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


import java.sql.Time;


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

import com.bydan.erp.puntoventa.util.NotaCreditoPuntoVentaConstantesFunciones;
import com.bydan.erp.puntoventa.util.NotaCreditoPuntoVentaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.NotaCreditoPuntoVentaParameterGeneral;

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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.NotaCreditoPuntoVentaBeanSwingJInternalFrame;
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
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;






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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.NotaCreditoPuntoVentaJInternalFrame;

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.NotaCreditoPuntoVentaDetalleFormJInternalFrame;

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
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.facturacion.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class NotaCreditoPuntoVentaModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_ID
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDUSUARIO
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDVENDEDOR
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDCLIENTE
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDCAJA
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDTIPOPRECIO
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDMESA
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDFORMATO
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDTIPOFACTURAPUNTOVENTA
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDESTADONOTACREDITOPUNTOVENTA
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_NUMEROSECUENCIAL
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_CODIGOCLIENTE
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_NOMBRECLIENTE
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_TARJETACLIENTE
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_DIRECCIONCLIENTE
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_TELEFONOCLIENTE
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_FECHA
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_HORA
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_TOTALIVA
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_TOTALSINIVA
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_IVA
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_DESCUENTO
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_FINANCIAMIENTO
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_FLETE
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_ICE
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_OTROS
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_SUBTOTAL
										,NotaCreditoPuntoVentaConstantesFunciones.LABEL_TOTAL
										};
	   
	    public List<NotaCreditoPuntoVenta> notacreditopuntoventas;
	  	 
	    //NO SE UTILIZA
	    public NotaCreditoPuntoVentaModel(List<NotaCreditoPuntoVenta> notacreditopuntoventas,JInternalFrameBase jInternalFrameBase) {
	    	this.notacreditopuntoventas=notacreditopuntoventas;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public NotaCreditoPuntoVentaModel(JInternalFrameBase jInternalFrameBase) {
	    	this.notacreditopuntoventas=new ArrayList<NotaCreditoPuntoVenta>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.notacreditopuntoventas.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.notacreditopuntoventas.get(rowIndex).getIsSelected();
	            
				case 1: return this.notacreditopuntoventas.get(rowIndex).getId();
				case 2: return this.notacreditopuntoventas.get(rowIndex).getid_empresa();
				case 3: return this.notacreditopuntoventas.get(rowIndex).getid_sucursal();
				case 4: return this.notacreditopuntoventas.get(rowIndex).getid_usuario();
				case 5: return this.notacreditopuntoventas.get(rowIndex).getid_vendedor();
				case 6: return this.notacreditopuntoventas.get(rowIndex).getid_cliente();
				case 7: return this.notacreditopuntoventas.get(rowIndex).getid_caja();
				case 8: return this.notacreditopuntoventas.get(rowIndex).getid_tipo_precio();
				case 9: return this.notacreditopuntoventas.get(rowIndex).getid_mesa();
				case 10: return this.notacreditopuntoventas.get(rowIndex).getid_formato();
				case 11: return this.notacreditopuntoventas.get(rowIndex).getid_tipo_factura_punto_venta();
				case 12: return this.notacreditopuntoventas.get(rowIndex).getid_estado_nota_credito_punto_venta();
				case 13: return this.notacreditopuntoventas.get(rowIndex).getnumero_secuencial();
				case 14: return this.notacreditopuntoventas.get(rowIndex).getcodigo_cliente();
				case 15: return this.notacreditopuntoventas.get(rowIndex).getnombre_cliente();
				case 16: return this.notacreditopuntoventas.get(rowIndex).gettarjeta_cliente();
				case 17: return this.notacreditopuntoventas.get(rowIndex).getdireccion_cliente();
				case 18: return this.notacreditopuntoventas.get(rowIndex).gettelefono_cliente();
				case 19: return this.notacreditopuntoventas.get(rowIndex).getfecha();
				case 20: return this.notacreditopuntoventas.get(rowIndex).gethora();
				case 21: return this.notacreditopuntoventas.get(rowIndex).gettotal_iva();
				case 22: return this.notacreditopuntoventas.get(rowIndex).gettotal_sin_iva();
				case 23: return this.notacreditopuntoventas.get(rowIndex).getiva();
				case 24: return this.notacreditopuntoventas.get(rowIndex).getdescuento();
				case 25: return this.notacreditopuntoventas.get(rowIndex).getfinanciamiento();
				case 26: return this.notacreditopuntoventas.get(rowIndex).getflete();
				case 27: return this.notacreditopuntoventas.get(rowIndex).getice();
				case 28: return this.notacreditopuntoventas.get(rowIndex).getotros();
				case 29: return this.notacreditopuntoventas.get(rowIndex).getsub_total();
				case 30: return this.notacreditopuntoventas.get(rowIndex).gettotal();	            
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
				case 13: return String.class;
				case 14: return String.class;
				case 15: return String.class;
				case 16: return String.class;
				case 17: return String.class;
				case 18: return String.class;
				case 19: return Date.class;
				case 20: return Time.class;
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	NotaCreditoPuntoVenta notacreditopuntoventa = this.notacreditopuntoventas.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			NotaCreditoPuntoVentaBeanSwingJInternalFrame notacreditopuntoventaBeanSwingJInternalFrame=(NotaCreditoPuntoVentaBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {notacreditopuntoventa.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {notacreditopuntoventa.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {notacreditopuntoventa.setid_empresa((Long) value);notacreditopuntoventa.setempresa_descripcion(notacreditopuntoventaBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {notacreditopuntoventa.setid_sucursal((Long) value);notacreditopuntoventa.setsucursal_descripcion(notacreditopuntoventaBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {notacreditopuntoventa.setid_usuario((Long) value);notacreditopuntoventa.setusuario_descripcion(notacreditopuntoventaBeanSwingJInternalFrame.getActualUsuarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {notacreditopuntoventa.setid_vendedor((Long) value);notacreditopuntoventa.setvendedor_descripcion(notacreditopuntoventaBeanSwingJInternalFrame.getActualVendedorForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {notacreditopuntoventa.setid_cliente((Long) value);notacreditopuntoventa.setcliente_descripcion(notacreditopuntoventaBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {notacreditopuntoventa.setid_caja((Long) value);notacreditopuntoventa.setcaja_descripcion(notacreditopuntoventaBeanSwingJInternalFrame.getActualCajaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {notacreditopuntoventa.setid_tipo_precio((Long) value);notacreditopuntoventa.settipoprecio_descripcion(notacreditopuntoventaBeanSwingJInternalFrame.getActualTipoPrecioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {notacreditopuntoventa.setid_mesa((Long) value);notacreditopuntoventa.setmesa_descripcion(notacreditopuntoventaBeanSwingJInternalFrame.getActualMesaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {notacreditopuntoventa.setid_formato((Long) value);notacreditopuntoventa.setformato_descripcion(notacreditopuntoventaBeanSwingJInternalFrame.getActualFormatoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {notacreditopuntoventa.setid_tipo_factura_punto_venta((Long) value);notacreditopuntoventa.settipofacturapuntoventa_descripcion(notacreditopuntoventaBeanSwingJInternalFrame.getActualTipoFacturaPuntoVentaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {notacreditopuntoventa.setid_estado_nota_credito_punto_venta((Long) value);notacreditopuntoventa.setestadonotacreditopuntoventa_descripcion(notacreditopuntoventaBeanSwingJInternalFrame.getActualEstadoNotaCreditoPuntoVentaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {notacreditopuntoventa.setnumero_secuencial((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {notacreditopuntoventa.setcodigo_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {notacreditopuntoventa.setnombre_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {notacreditopuntoventa.settarjeta_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {notacreditopuntoventa.setdireccion_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {notacreditopuntoventa.settelefono_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {notacreditopuntoventa.setfecha((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {notacreditopuntoventa.sethora((Time) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {notacreditopuntoventa.settotal_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {notacreditopuntoventa.settotal_sin_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {notacreditopuntoventa.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {notacreditopuntoventa.setdescuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {notacreditopuntoventa.setfinanciamiento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {notacreditopuntoventa.setflete((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {notacreditopuntoventa.setice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {notacreditopuntoventa.setotros((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {notacreditopuntoventa.setsub_total((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {notacreditopuntoventa.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public NotaCreditoPuntoVentaModel(JInternalFrameBase jInternalFrameBase) {
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
		private NotaCreditoPuntoVentaDetalleFormJInternalFrame notacreditopuntoventaJInternalFrame=null;
		
		public NotaCreditoPuntoVentaModel(NotaCreditoPuntoVentaDetalleFormJInternalFrame notacreditopuntoventaJInternalFrame) {
			this.notacreditopuntoventaJInternalFrame=notacreditopuntoventaJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.notacreditopuntoventaJInternalFrame.getjButtonActualizarToolBarNotaCreditoPuntoVenta();
			
			if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.getjButtonActualizarToolBarNotaCreditoPuntoVenta())) {
				componentTab=this.notacreditopuntoventaJInternalFrame.getjButtonEliminarToolBarNotaCreditoPuntoVenta();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.getjButtonEliminarToolBarNotaCreditoPuntoVenta())) {
				componentTab=this.notacreditopuntoventaJInternalFrame.getjButtonCancelarToolBarNotaCreditoPuntoVenta();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.getjButtonCancelarToolBarNotaCreditoPuntoVenta())) {
				componentTab=this.notacreditopuntoventaJInternalFrame.jComboBoxid_empresaNotaCreditoPuntoVenta;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextFieldtotalNotaCreditoPuntoVenta)) {
				componentTab=this.notacreditopuntoventaJInternalFrame.jComboBoxTiposAccionesFormularioNotaCreditoPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jComboBoxTiposAccionesFormularioNotaCreditoPuntoVenta)) {
				componentTab=this.notacreditopuntoventaJInternalFrame.jButtonEliminarNotaCreditoPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jButtonEliminarNotaCreditoPuntoVenta)) {
				componentTab=this.notacreditopuntoventaJInternalFrame.jButtonActualizarNotaCreditoPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jButtonActualizarNotaCreditoPuntoVenta)) {
				componentTab=this.notacreditopuntoventaJInternalFrame.jButtonCancelarNotaCreditoPuntoVenta;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jComboBoxid_empresaNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jComboBoxid_sucursalNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jComboBoxid_sucursalNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jComboBoxid_usuarioNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jComboBoxid_usuarioNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jComboBoxid_vendedorNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jComboBoxid_vendedorNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jComboBoxid_clienteNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jComboBoxid_clienteNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jComboBoxid_cajaNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jComboBoxid_cajaNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jComboBoxid_asiento_contableNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jComboBoxid_asiento_contableNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jComboBoxid_tipo_precioNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jComboBoxid_tipo_precioNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jComboBoxid_mesaNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jComboBoxid_mesaNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jComboBoxid_formatoNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jComboBoxid_formatoNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jComboBoxid_tipo_factura_punto_ventaNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jComboBoxid_tipo_factura_punto_ventaNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jComboBoxid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jComboBoxid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextFieldnumero_secuencialNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextFieldnumero_secuencialNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextFieldcodigo_clienteNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextFieldcodigo_clienteNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextAreanombre_clienteNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextAreanombre_clienteNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextFieldtarjeta_clienteNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextFieldtarjeta_clienteNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextAreadireccion_clienteNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextAreadireccion_clienteNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextAreatelefono_clienteNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextAreatelefono_clienteNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jDateChooserfechaNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jDateChooserfechaNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jSpinnerhoraNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jSpinnerhoraNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextFieldtotal_ivaNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextFieldtotal_ivaNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextFieldtotal_sin_ivaNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextFieldtotal_sin_ivaNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextFieldivaNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextFieldivaNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextFielddescuentoNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextFielddescuentoNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextFieldfinanciamientoNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextFieldfinanciamientoNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextFieldfleteNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextFieldfleteNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextFieldiceNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextFieldiceNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextFieldotrosNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextFieldotrosNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextFieldsub_totalNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextFieldsub_totalNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextFieldtotalNotaCreditoPuntoVenta;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.notacreditopuntoventaJInternalFrame.getjButtonActualizarToolBarNotaCreditoPuntoVenta();
			
			if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.getjButtonEliminarToolBarNotaCreditoPuntoVenta())) {
				componentTab=this.notacreditopuntoventaJInternalFrame.getjButtonActualizarToolBarNotaCreditoPuntoVenta();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.getjButtonCancelarToolBarNotaCreditoPuntoVenta())) {
				componentTab=this.notacreditopuntoventaJInternalFrame.getjButtonEliminarToolBarNotaCreditoPuntoVenta();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jComboBoxid_empresaNotaCreditoPuntoVenta)) {
				
				componentTab=this.notacreditopuntoventaJInternalFrame.getjButtonCancelarToolBarNotaCreditoPuntoVenta();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jComboBoxTiposAccionesFormularioNotaCreditoPuntoVenta)) {
				componentTab=this.notacreditopuntoventaJInternalFrame.jTextFieldtotalNotaCreditoPuntoVenta;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jButtonEliminarNotaCreditoPuntoVenta)) {
				componentTab=this.notacreditopuntoventaJInternalFrame.jComboBoxTiposAccionesFormularioNotaCreditoPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jButtonActualizarNotaCreditoPuntoVenta)) {
				componentTab=this.notacreditopuntoventaJInternalFrame.jButtonEliminarNotaCreditoPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jButtonCancelarNotaCreditoPuntoVenta)) {
				componentTab=this.notacreditopuntoventaJInternalFrame.jButtonActualizarNotaCreditoPuntoVenta;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jComboBoxid_sucursalNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jComboBoxid_empresaNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jComboBoxid_usuarioNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jComboBoxid_sucursalNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jComboBoxid_vendedorNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jComboBoxid_usuarioNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jComboBoxid_clienteNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jComboBoxid_vendedorNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jComboBoxid_cajaNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jComboBoxid_clienteNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jComboBoxid_asiento_contableNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jComboBoxid_cajaNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jComboBoxid_tipo_precioNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jComboBoxid_asiento_contableNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jComboBoxid_mesaNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jComboBoxid_tipo_precioNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jComboBoxid_formatoNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jComboBoxid_mesaNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jComboBoxid_tipo_factura_punto_ventaNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jComboBoxid_formatoNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jComboBoxid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jComboBoxid_tipo_factura_punto_ventaNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextFieldnumero_secuencialNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jComboBoxid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextFieldcodigo_clienteNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextFieldnumero_secuencialNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextAreanombre_clienteNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextFieldcodigo_clienteNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextFieldtarjeta_clienteNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextAreanombre_clienteNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextAreadireccion_clienteNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextFieldtarjeta_clienteNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextAreatelefono_clienteNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextAreadireccion_clienteNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jDateChooserfechaNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextAreatelefono_clienteNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jSpinnerhoraNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jDateChooserfechaNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextFieldtotal_ivaNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jSpinnerhoraNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextFieldtotal_sin_ivaNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextFieldtotal_ivaNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextFieldivaNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextFieldtotal_sin_ivaNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextFielddescuentoNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextFieldivaNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextFieldfinanciamientoNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextFielddescuentoNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextFieldfleteNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextFieldfinanciamientoNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextFieldiceNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextFieldfleteNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextFieldotrosNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextFieldiceNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextFieldsub_totalNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextFieldotrosNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditopuntoventaJInternalFrame.jTextFieldtotalNotaCreditoPuntoVenta)) {
			componentTab=this.notacreditopuntoventaJInternalFrame.jTextFieldsub_totalNotaCreditoPuntoVenta;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.notacreditopuntoventaJInternalFrame.getjButtonActualizarToolBarNotaCreditoPuntoVenta();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.notacreditopuntoventaJInternalFrame.getjButtonActualizarToolBarNotaCreditoPuntoVenta();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.notacreditopuntoventaJInternalFrame.getjButtonCancelarToolBarNotaCreditoPuntoVenta();
			
			
			return componentTab;		
		}
		
		public NotaCreditoPuntoVentaDetalleFormJInternalFrame getnotacreditopuntoventaJInternalFrame() {
			return this.notacreditopuntoventaJInternalFrame;
		}
		
		public void setnotacreditopuntoventaJInternalFrame(NotaCreditoPuntoVentaDetalleFormJInternalFrame notacreditopuntoventaJInternalFrame) {
			this.notacreditopuntoventaJInternalFrame=notacreditopuntoventaJInternalFrame;
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
