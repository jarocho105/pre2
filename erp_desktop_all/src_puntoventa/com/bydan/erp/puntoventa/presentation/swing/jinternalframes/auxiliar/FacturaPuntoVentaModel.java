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

import com.bydan.erp.puntoventa.util.FacturaPuntoVentaConstantesFunciones;
import com.bydan.erp.puntoventa.util.FacturaPuntoVentaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.FacturaPuntoVentaParameterGeneral;

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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.FacturaPuntoVentaBeanSwingJInternalFrame;
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
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.FacturaPuntoVentaJInternalFrame;

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.FacturaPuntoVentaDetalleFormJInternalFrame;

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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.contabilidad.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class FacturaPuntoVentaModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,FacturaPuntoVentaConstantesFunciones.LABEL_ID
										,FacturaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA
										,FacturaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL
										,FacturaPuntoVentaConstantesFunciones.LABEL_IDUSUARIO
										,FacturaPuntoVentaConstantesFunciones.LABEL_IDVENDEDOR
										,FacturaPuntoVentaConstantesFunciones.LABEL_IDCLIENTE
										,FacturaPuntoVentaConstantesFunciones.LABEL_IDCAJA
										,FacturaPuntoVentaConstantesFunciones.LABEL_IDTIPOPRECIO
										,FacturaPuntoVentaConstantesFunciones.LABEL_IDMESA
										,FacturaPuntoVentaConstantesFunciones.LABEL_IDFORMATO
										,FacturaPuntoVentaConstantesFunciones.LABEL_IDTIPOFACTURAPUNTOVENTA
										,FacturaPuntoVentaConstantesFunciones.LABEL_IDESTADOFACTURAPUNTOVENTA
										,FacturaPuntoVentaConstantesFunciones.LABEL_NUMEROSECUENCIAL
										,FacturaPuntoVentaConstantesFunciones.LABEL_CODIGOCLIENTE
										,FacturaPuntoVentaConstantesFunciones.LABEL_NOMBRECLIENTE
										,FacturaPuntoVentaConstantesFunciones.LABEL_TARJETACLIENTE
										,FacturaPuntoVentaConstantesFunciones.LABEL_DIRECCIONCLIENTE
										,FacturaPuntoVentaConstantesFunciones.LABEL_TELEFONOCLIENTE
										,FacturaPuntoVentaConstantesFunciones.LABEL_FECHA
										,FacturaPuntoVentaConstantesFunciones.LABEL_HORA
										,FacturaPuntoVentaConstantesFunciones.LABEL_TOTALIVA
										,FacturaPuntoVentaConstantesFunciones.LABEL_TOTALSINIVA
										,FacturaPuntoVentaConstantesFunciones.LABEL_IVA
										,FacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTO
										,FacturaPuntoVentaConstantesFunciones.LABEL_FINANCIAMIENTO
										,FacturaPuntoVentaConstantesFunciones.LABEL_FLETE
										,FacturaPuntoVentaConstantesFunciones.LABEL_ICE
										,FacturaPuntoVentaConstantesFunciones.LABEL_OTROS
										,FacturaPuntoVentaConstantesFunciones.LABEL_SUBTOTAL
										,FacturaPuntoVentaConstantesFunciones.LABEL_TOTAL
										};
	   
	    public List<FacturaPuntoVenta> facturapuntoventas;
	  	 
	    //NO SE UTILIZA
	    public FacturaPuntoVentaModel(List<FacturaPuntoVenta> facturapuntoventas,JInternalFrameBase jInternalFrameBase) {
	    	this.facturapuntoventas=facturapuntoventas;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public FacturaPuntoVentaModel(JInternalFrameBase jInternalFrameBase) {
	    	this.facturapuntoventas=new ArrayList<FacturaPuntoVenta>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.facturapuntoventas.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.facturapuntoventas.get(rowIndex).getIsSelected();
	            
				case 1: return this.facturapuntoventas.get(rowIndex).getId();
				case 2: return this.facturapuntoventas.get(rowIndex).getid_empresa();
				case 3: return this.facturapuntoventas.get(rowIndex).getid_sucursal();
				case 4: return this.facturapuntoventas.get(rowIndex).getid_usuario();
				case 5: return this.facturapuntoventas.get(rowIndex).getid_vendedor();
				case 6: return this.facturapuntoventas.get(rowIndex).getid_cliente();
				case 7: return this.facturapuntoventas.get(rowIndex).getid_caja();
				case 8: return this.facturapuntoventas.get(rowIndex).getid_tipo_precio();
				case 9: return this.facturapuntoventas.get(rowIndex).getid_mesa();
				case 10: return this.facturapuntoventas.get(rowIndex).getid_formato();
				case 11: return this.facturapuntoventas.get(rowIndex).getid_tipo_factura_punto_venta();
				case 12: return this.facturapuntoventas.get(rowIndex).getid_estado_factura_punto_venta();
				case 13: return this.facturapuntoventas.get(rowIndex).getnumero_secuencial();
				case 14: return this.facturapuntoventas.get(rowIndex).getcodigo_cliente();
				case 15: return this.facturapuntoventas.get(rowIndex).getnombre_cliente();
				case 16: return this.facturapuntoventas.get(rowIndex).gettarjeta_cliente();
				case 17: return this.facturapuntoventas.get(rowIndex).getdireccion_cliente();
				case 18: return this.facturapuntoventas.get(rowIndex).gettelefono_cliente();
				case 19: return this.facturapuntoventas.get(rowIndex).getfecha();
				case 20: return this.facturapuntoventas.get(rowIndex).gethora();
				case 21: return this.facturapuntoventas.get(rowIndex).gettotal_iva();
				case 22: return this.facturapuntoventas.get(rowIndex).gettotal_sin_iva();
				case 23: return this.facturapuntoventas.get(rowIndex).getiva();
				case 24: return this.facturapuntoventas.get(rowIndex).getdescuento();
				case 25: return this.facturapuntoventas.get(rowIndex).getfinanciamiento();
				case 26: return this.facturapuntoventas.get(rowIndex).getflete();
				case 27: return this.facturapuntoventas.get(rowIndex).getice();
				case 28: return this.facturapuntoventas.get(rowIndex).getotros();
				case 29: return this.facturapuntoventas.get(rowIndex).getsub_total();
				case 30: return this.facturapuntoventas.get(rowIndex).gettotal();	            
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
	    	FacturaPuntoVenta facturapuntoventa = this.facturapuntoventas.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFrame=(FacturaPuntoVentaBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {facturapuntoventa.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {facturapuntoventa.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {facturapuntoventa.setid_empresa((Long) value);facturapuntoventa.setempresa_descripcion(facturapuntoventaBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {facturapuntoventa.setid_sucursal((Long) value);facturapuntoventa.setsucursal_descripcion(facturapuntoventaBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {facturapuntoventa.setid_usuario((Long) value);facturapuntoventa.setusuario_descripcion(facturapuntoventaBeanSwingJInternalFrame.getActualUsuarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {facturapuntoventa.setid_vendedor((Long) value);facturapuntoventa.setvendedor_descripcion(facturapuntoventaBeanSwingJInternalFrame.getActualVendedorForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {facturapuntoventa.setid_cliente((Long) value);facturapuntoventa.setcliente_descripcion(facturapuntoventaBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {facturapuntoventa.setid_caja((Long) value);facturapuntoventa.setcaja_descripcion(facturapuntoventaBeanSwingJInternalFrame.getActualCajaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {facturapuntoventa.setid_tipo_precio((Long) value);facturapuntoventa.settipoprecio_descripcion(facturapuntoventaBeanSwingJInternalFrame.getActualTipoPrecioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {facturapuntoventa.setid_mesa((Long) value);facturapuntoventa.setmesa_descripcion(facturapuntoventaBeanSwingJInternalFrame.getActualMesaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {facturapuntoventa.setid_formato((Long) value);facturapuntoventa.setformato_descripcion(facturapuntoventaBeanSwingJInternalFrame.getActualFormatoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {facturapuntoventa.setid_tipo_factura_punto_venta((Long) value);facturapuntoventa.settipofacturapuntoventa_descripcion(facturapuntoventaBeanSwingJInternalFrame.getActualTipoFacturaPuntoVentaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {facturapuntoventa.setid_estado_factura_punto_venta((Long) value);facturapuntoventa.setestadofacturapuntoventa_descripcion(facturapuntoventaBeanSwingJInternalFrame.getActualEstadoFacturaPuntoVentaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {facturapuntoventa.setnumero_secuencial((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {facturapuntoventa.setcodigo_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {facturapuntoventa.setnombre_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {facturapuntoventa.settarjeta_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {facturapuntoventa.setdireccion_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {facturapuntoventa.settelefono_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {facturapuntoventa.setfecha((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {facturapuntoventa.sethora((Time) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {facturapuntoventa.settotal_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {facturapuntoventa.settotal_sin_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {facturapuntoventa.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {facturapuntoventa.setdescuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {facturapuntoventa.setfinanciamiento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {facturapuntoventa.setflete((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {facturapuntoventa.setice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {facturapuntoventa.setotros((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {facturapuntoventa.setsub_total((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {facturapuntoventa.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public FacturaPuntoVentaModel(JInternalFrameBase jInternalFrameBase) {
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
		private FacturaPuntoVentaDetalleFormJInternalFrame facturapuntoventaJInternalFrame=null;
		
		public FacturaPuntoVentaModel(FacturaPuntoVentaDetalleFormJInternalFrame facturapuntoventaJInternalFrame) {
			this.facturapuntoventaJInternalFrame=facturapuntoventaJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.facturapuntoventaJInternalFrame.getjButtonActualizarToolBarFacturaPuntoVenta();
			
			if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.getjButtonActualizarToolBarFacturaPuntoVenta())) {
				componentTab=this.facturapuntoventaJInternalFrame.getjButtonEliminarToolBarFacturaPuntoVenta();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.getjButtonEliminarToolBarFacturaPuntoVenta())) {
				componentTab=this.facturapuntoventaJInternalFrame.getjButtonCancelarToolBarFacturaPuntoVenta();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.getjButtonCancelarToolBarFacturaPuntoVenta())) {
				componentTab=this.facturapuntoventaJInternalFrame.jComboBoxid_empresaFacturaPuntoVenta;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextFieldtotalFacturaPuntoVenta)) {
				componentTab=this.facturapuntoventaJInternalFrame.jComboBoxTiposAccionesFormularioFacturaPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jComboBoxTiposAccionesFormularioFacturaPuntoVenta)) {
				componentTab=this.facturapuntoventaJInternalFrame.jButtonEliminarFacturaPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jButtonEliminarFacturaPuntoVenta)) {
				componentTab=this.facturapuntoventaJInternalFrame.jButtonActualizarFacturaPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jButtonActualizarFacturaPuntoVenta)) {
				componentTab=this.facturapuntoventaJInternalFrame.jButtonCancelarFacturaPuntoVenta;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jComboBoxid_empresaFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jComboBoxid_sucursalFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jComboBoxid_sucursalFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jComboBoxid_usuarioFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jComboBoxid_usuarioFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jComboBoxid_vendedorFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jComboBoxid_vendedorFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jComboBoxid_clienteFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jComboBoxid_clienteFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jComboBoxid_cajaFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jComboBoxid_cajaFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jComboBoxid_tipo_precioFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jComboBoxid_tipo_precioFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jComboBoxid_mesaFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jComboBoxid_mesaFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jComboBoxid_formatoFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jComboBoxid_formatoFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jComboBoxid_tipo_factura_punto_ventaFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jComboBoxid_tipo_factura_punto_ventaFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jComboBoxid_estado_factura_punto_ventaFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jComboBoxid_estado_factura_punto_ventaFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jComboBoxid_asiento_contableFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jComboBoxid_asiento_contableFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextFieldnumero_secuencialFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextFieldnumero_secuencialFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextFieldcodigo_clienteFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextFieldcodigo_clienteFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextAreanombre_clienteFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextAreanombre_clienteFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextFieldtarjeta_clienteFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextFieldtarjeta_clienteFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextAreadireccion_clienteFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextAreadireccion_clienteFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextAreatelefono_clienteFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextAreatelefono_clienteFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jDateChooserfechaFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jDateChooserfechaFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jSpinnerhoraFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jSpinnerhoraFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextFieldtotal_ivaFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextFieldtotal_ivaFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextFieldtotal_sin_ivaFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextFieldtotal_sin_ivaFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextFieldivaFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextFieldivaFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextFielddescuentoFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextFielddescuentoFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextFieldfinanciamientoFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextFieldfinanciamientoFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextFieldfleteFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextFieldfleteFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextFieldiceFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextFieldiceFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextFieldotrosFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextFieldotrosFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextFieldsub_totalFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextFieldsub_totalFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextFieldtotalFacturaPuntoVenta;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.facturapuntoventaJInternalFrame.getjButtonActualizarToolBarFacturaPuntoVenta();
			
			if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.getjButtonEliminarToolBarFacturaPuntoVenta())) {
				componentTab=this.facturapuntoventaJInternalFrame.getjButtonActualizarToolBarFacturaPuntoVenta();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.getjButtonCancelarToolBarFacturaPuntoVenta())) {
				componentTab=this.facturapuntoventaJInternalFrame.getjButtonEliminarToolBarFacturaPuntoVenta();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jComboBoxid_empresaFacturaPuntoVenta)) {
				
				componentTab=this.facturapuntoventaJInternalFrame.getjButtonCancelarToolBarFacturaPuntoVenta();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jComboBoxTiposAccionesFormularioFacturaPuntoVenta)) {
				componentTab=this.facturapuntoventaJInternalFrame.jTextFieldtotalFacturaPuntoVenta;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jButtonEliminarFacturaPuntoVenta)) {
				componentTab=this.facturapuntoventaJInternalFrame.jComboBoxTiposAccionesFormularioFacturaPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jButtonActualizarFacturaPuntoVenta)) {
				componentTab=this.facturapuntoventaJInternalFrame.jButtonEliminarFacturaPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jButtonCancelarFacturaPuntoVenta)) {
				componentTab=this.facturapuntoventaJInternalFrame.jButtonActualizarFacturaPuntoVenta;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jComboBoxid_sucursalFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jComboBoxid_empresaFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jComboBoxid_usuarioFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jComboBoxid_sucursalFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jComboBoxid_vendedorFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jComboBoxid_usuarioFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jComboBoxid_clienteFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jComboBoxid_vendedorFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jComboBoxid_cajaFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jComboBoxid_clienteFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jComboBoxid_tipo_precioFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jComboBoxid_cajaFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jComboBoxid_mesaFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jComboBoxid_tipo_precioFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jComboBoxid_formatoFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jComboBoxid_mesaFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jComboBoxid_tipo_factura_punto_ventaFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jComboBoxid_formatoFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jComboBoxid_estado_factura_punto_ventaFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jComboBoxid_tipo_factura_punto_ventaFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jComboBoxid_asiento_contableFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jComboBoxid_estado_factura_punto_ventaFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextFieldnumero_secuencialFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jComboBoxid_asiento_contableFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextFieldcodigo_clienteFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextFieldnumero_secuencialFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextAreanombre_clienteFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextFieldcodigo_clienteFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextFieldtarjeta_clienteFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextAreanombre_clienteFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextAreadireccion_clienteFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextFieldtarjeta_clienteFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextAreatelefono_clienteFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextAreadireccion_clienteFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jDateChooserfechaFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextAreatelefono_clienteFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jSpinnerhoraFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jDateChooserfechaFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextFieldtotal_ivaFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jSpinnerhoraFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextFieldtotal_sin_ivaFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextFieldtotal_ivaFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextFieldivaFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextFieldtotal_sin_ivaFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextFielddescuentoFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextFieldivaFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextFieldfinanciamientoFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextFielddescuentoFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextFieldfleteFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextFieldfinanciamientoFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextFieldiceFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextFieldfleteFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextFieldotrosFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextFieldiceFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextFieldsub_totalFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextFieldotrosFacturaPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturapuntoventaJInternalFrame.jTextFieldtotalFacturaPuntoVenta)) {
			componentTab=this.facturapuntoventaJInternalFrame.jTextFieldsub_totalFacturaPuntoVenta;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.facturapuntoventaJInternalFrame.getjButtonActualizarToolBarFacturaPuntoVenta();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.facturapuntoventaJInternalFrame.getjButtonActualizarToolBarFacturaPuntoVenta();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.facturapuntoventaJInternalFrame.getjButtonCancelarToolBarFacturaPuntoVenta();
			
			
			return componentTab;		
		}
		
		public FacturaPuntoVentaDetalleFormJInternalFrame getfacturapuntoventaJInternalFrame() {
			return this.facturapuntoventaJInternalFrame;
		}
		
		public void setfacturapuntoventaJInternalFrame(FacturaPuntoVentaDetalleFormJInternalFrame facturapuntoventaJInternalFrame) {
			this.facturapuntoventaJInternalFrame=facturapuntoventaJInternalFrame;
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
