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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar;


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

import com.bydan.erp.facturacion.util.PedidoConstantesFunciones;
import com.bydan.erp.facturacion.util.PedidoParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.PedidoParameterGeneral;

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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.PedidoBeanSwingJInternalFrame;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.PedidoJInternalFrame;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.PedidoDetalleFormJInternalFrame;

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
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.tesoreria.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class PedidoModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,PedidoConstantesFunciones.LABEL_ID
										,PedidoConstantesFunciones.LABEL_IDEMPRESA
										,PedidoConstantesFunciones.LABEL_IDSUCURSAL
										,PedidoConstantesFunciones.LABEL_IDEJERCICIO
										,PedidoConstantesFunciones.LABEL_IDPERIODO
										,PedidoConstantesFunciones.LABEL_IDANIO
										,PedidoConstantesFunciones.LABEL_IDMES
										,PedidoConstantesFunciones.LABEL_IDUSUARIO
										,PedidoConstantesFunciones.LABEL_NUMERO
										,PedidoConstantesFunciones.LABEL_PREIMPRESO
										,PedidoConstantesFunciones.LABEL_FECHAEMISION
										,PedidoConstantesFunciones.LABEL_FECHAENTREGA
										,PedidoConstantesFunciones.LABEL_IDMONEDA
										,PedidoConstantesFunciones.LABEL_COTIZACION
										,PedidoConstantesFunciones.LABEL_IDEMPLEADO
										,PedidoConstantesFunciones.LABEL_IDTIPOPRECIO
										,PedidoConstantesFunciones.LABEL_IDFORMATO
										,PedidoConstantesFunciones.LABEL_DIRECCION
										,PedidoConstantesFunciones.LABEL_IDCLIENTE
										,PedidoConstantesFunciones.LABEL_TELEFONO
										,PedidoConstantesFunciones.LABEL_RUC
										,PedidoConstantesFunciones.LABEL_IDSUBCLIENTE
										,PedidoConstantesFunciones.LABEL_IDVENDEDOR
										,PedidoConstantesFunciones.LABEL_IDCONSULTOR
										,PedidoConstantesFunciones.LABEL_ORDEN
										,PedidoConstantesFunciones.LABEL_IDRESPONSABLE
										,PedidoConstantesFunciones.LABEL_IDESTADOPEDIDO
										,PedidoConstantesFunciones.LABEL_IDTRANSPORTE
										,PedidoConstantesFunciones.LABEL_IDRUTATRANSPORTE
										,PedidoConstantesFunciones.LABEL_VALORRUTA
										,PedidoConstantesFunciones.LABEL_IDTIPOLLAMADA
										,PedidoConstantesFunciones.LABEL_IDTRANSPORTISTA
										,PedidoConstantesFunciones.LABEL_HORAINICIO
										,PedidoConstantesFunciones.LABEL_HORAFIN
										,PedidoConstantesFunciones.LABEL_DESCRIPCION
										,PedidoConstantesFunciones.LABEL_CUPO
										,PedidoConstantesFunciones.LABEL_SALDO
										,PedidoConstantesFunciones.LABEL_PEDIDOS
										,PedidoConstantesFunciones.LABEL_DOCUMENTOS
										,PedidoConstantesFunciones.LABEL_DISPONIBLE
										,PedidoConstantesFunciones.LABEL_DESCUENTOPORCENTAJE
										,PedidoConstantesFunciones.LABEL_TOTALCONIVA
										,PedidoConstantesFunciones.LABEL_SUMAN
										,PedidoConstantesFunciones.LABEL_DESCUENTOVALOR
										,PedidoConstantesFunciones.LABEL_TOTALSINIVA
										,PedidoConstantesFunciones.LABEL_DESCUENTOTOTAL
										,PedidoConstantesFunciones.LABEL_FLETE
										,PedidoConstantesFunciones.LABEL_TOTAL
										,PedidoConstantesFunciones.LABEL_SUBTOTAL
										,PedidoConstantesFunciones.LABEL_OTRO
										,PedidoConstantesFunciones.LABEL_ULTIMOCOSTO
										,PedidoConstantesFunciones.LABEL_IVA
										,PedidoConstantesFunciones.LABEL_FINANCIAMIENTO
										,PedidoConstantesFunciones.LABEL_MARGENUTILIDAD
										,PedidoConstantesFunciones.LABEL_OTROSVALORES
										,PedidoConstantesFunciones.LABEL_ANTICIPO
										};
	   
	    public List<Pedido> pedidos;
	  	 
	    //NO SE UTILIZA
	    public PedidoModel(List<Pedido> pedidos,JInternalFrameBase jInternalFrameBase) {
	    	this.pedidos=pedidos;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public PedidoModel(JInternalFrameBase jInternalFrameBase) {
	    	this.pedidos=new ArrayList<Pedido>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.pedidos.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.pedidos.get(rowIndex).getIsSelected();
	            
				case 1: return this.pedidos.get(rowIndex).getId();
				case 2: return this.pedidos.get(rowIndex).getid_empresa();
				case 3: return this.pedidos.get(rowIndex).getid_sucursal();
				case 4: return this.pedidos.get(rowIndex).getid_ejercicio();
				case 5: return this.pedidos.get(rowIndex).getid_periodo();
				case 6: return this.pedidos.get(rowIndex).getid_anio();
				case 7: return this.pedidos.get(rowIndex).getid_mes();
				case 8: return this.pedidos.get(rowIndex).getid_usuario();
				case 9: return this.pedidos.get(rowIndex).getnumero();
				case 10: return this.pedidos.get(rowIndex).getpre_impreso();
				case 11: return this.pedidos.get(rowIndex).getfecha_emision();
				case 12: return this.pedidos.get(rowIndex).getfecha_entrega();
				case 13: return this.pedidos.get(rowIndex).getid_moneda();
				case 14: return this.pedidos.get(rowIndex).getcotizacion();
				case 15: return this.pedidos.get(rowIndex).getid_empleado();
				case 16: return this.pedidos.get(rowIndex).getid_tipo_precio();
				case 17: return this.pedidos.get(rowIndex).getid_formato();
				case 18: return this.pedidos.get(rowIndex).getdireccion();
				case 19: return this.pedidos.get(rowIndex).getid_cliente();
				case 20: return this.pedidos.get(rowIndex).gettelefono();
				case 21: return this.pedidos.get(rowIndex).getruc();
				case 22: return this.pedidos.get(rowIndex).getid_sub_cliente();
				case 23: return this.pedidos.get(rowIndex).getid_vendedor();
				case 24: return this.pedidos.get(rowIndex).getid_consultor();
				case 25: return this.pedidos.get(rowIndex).getorden();
				case 26: return this.pedidos.get(rowIndex).getid_responsable();
				case 27: return this.pedidos.get(rowIndex).getid_estado_pedido();
				case 28: return this.pedidos.get(rowIndex).getid_transporte();
				case 29: return this.pedidos.get(rowIndex).getid_ruta_transporte();
				case 30: return this.pedidos.get(rowIndex).getvalor_ruta();
				case 31: return this.pedidos.get(rowIndex).getid_tipo_llamada();
				case 32: return this.pedidos.get(rowIndex).getid_transportista();
				case 33: return this.pedidos.get(rowIndex).gethora_inicio();
				case 34: return this.pedidos.get(rowIndex).gethora_fin();
				case 35: return this.pedidos.get(rowIndex).getdescripcion();
				case 36: return this.pedidos.get(rowIndex).getcupo();
				case 37: return this.pedidos.get(rowIndex).getsaldo();
				case 38: return this.pedidos.get(rowIndex).getpedidos();
				case 39: return this.pedidos.get(rowIndex).getdocumentos();
				case 40: return this.pedidos.get(rowIndex).getdisponible();
				case 41: return this.pedidos.get(rowIndex).getdescuento_porcentaje();
				case 42: return this.pedidos.get(rowIndex).gettotal_con_iva();
				case 43: return this.pedidos.get(rowIndex).getsuman();
				case 44: return this.pedidos.get(rowIndex).getdescuento_valor();
				case 45: return this.pedidos.get(rowIndex).gettotal_sin_iva();
				case 46: return this.pedidos.get(rowIndex).getdescuento_total();
				case 47: return this.pedidos.get(rowIndex).getflete();
				case 48: return this.pedidos.get(rowIndex).gettotal();
				case 49: return this.pedidos.get(rowIndex).getsubtotal();
				case 50: return this.pedidos.get(rowIndex).getotro();
				case 51: return this.pedidos.get(rowIndex).getultimo_costo();
				case 52: return this.pedidos.get(rowIndex).getiva();
				case 53: return this.pedidos.get(rowIndex).getfinanciamiento();
				case 54: return this.pedidos.get(rowIndex).getmargen_utilidad();
				case 55: return this.pedidos.get(rowIndex).getotros_valores();
				case 56: return this.pedidos.get(rowIndex).getanticipo();	            
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
				case 9: return String.class;
				case 10: return String.class;
				case 11: return Date.class;
				case 12: return Date.class;
				case 13: return Long.class;
				case 14: return Double.class;
				case 15: return Long.class;
				case 16: return Long.class;
				case 17: return Long.class;
				case 18: return String.class;
				case 19: return Long.class;
				case 20: return String.class;
				case 21: return String.class;
				case 22: return Long.class;
				case 23: return Long.class;
				case 24: return Long.class;
				case 25: return String.class;
				case 26: return Long.class;
				case 27: return Long.class;
				case 28: return Long.class;
				case 29: return Long.class;
				case 30: return Double.class;
				case 31: return Long.class;
				case 32: return Long.class;
				case 33: return Time.class;
				case 34: return Time.class;
				case 35: return String.class;
				case 36: return Double.class;
				case 37: return Double.class;
				case 38: return Double.class;
				case 39: return Double.class;
				case 40: return Double.class;
				case 41: return Double.class;
				case 42: return Double.class;
				case 43: return Double.class;
				case 44: return Double.class;
				case 45: return Double.class;
				case 46: return Double.class;
				case 47: return Double.class;
				case 48: return Double.class;
				case 49: return Double.class;
				case 50: return Double.class;
				case 51: return Double.class;
				case 52: return Double.class;
				case 53: return Double.class;
				case 54: return Double.class;
				case 55: return Double.class;
				case 56: return Double.class;	            
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
				case 42: return true;
				case 43: return true;
				case 44: return true;
				case 45: return true;
				case 46: return true;
				case 47: return true;
				case 48: return true;
				case 49: return true;
				case 50: return true;
				case 51: return true;
				case 52: return true;
				case 53: return true;
				case 54: return true;
				case 55: return true;
				case 56: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	Pedido pedido = this.pedidos.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			PedidoBeanSwingJInternalFrame pedidoBeanSwingJInternalFrame=(PedidoBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {pedido.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {pedido.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {pedido.setid_empresa((Long) value);pedido.setempresa_descripcion(pedidoBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {pedido.setid_sucursal((Long) value);pedido.setsucursal_descripcion(pedidoBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {pedido.setid_ejercicio((Long) value);pedido.setejercicio_descripcion(pedidoBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {pedido.setid_periodo((Long) value);pedido.setperiodo_descripcion(pedidoBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {pedido.setid_anio((Long) value);pedido.setanio_descripcion(pedidoBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {pedido.setid_mes((Long) value);pedido.setmes_descripcion(pedidoBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {pedido.setid_usuario((Long) value);pedido.setusuario_descripcion(pedidoBeanSwingJInternalFrame.getActualUsuarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {pedido.setnumero((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {pedido.setpre_impreso((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {pedido.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {pedido.setfecha_entrega((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {pedido.setid_moneda((Long) value);pedido.setmoneda_descripcion(pedidoBeanSwingJInternalFrame.getActualMonedaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {pedido.setcotizacion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {pedido.setid_empleado((Long) value);pedido.setempleado_descripcion(pedidoBeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {pedido.setid_tipo_precio((Long) value);pedido.settipoprecio_descripcion(pedidoBeanSwingJInternalFrame.getActualTipoPrecioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {pedido.setid_formato((Long) value);pedido.setformato_descripcion(pedidoBeanSwingJInternalFrame.getActualFormatoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {pedido.setdireccion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {pedido.setid_cliente((Long) value);pedido.setcliente_descripcion(pedidoBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {pedido.settelefono((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {pedido.setruc((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {pedido.setid_sub_cliente((Long) value);pedido.setsubcliente_descripcion(pedidoBeanSwingJInternalFrame.getActualSubClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {pedido.setid_vendedor((Long) value);pedido.setvendedor_descripcion(pedidoBeanSwingJInternalFrame.getActualVendedorForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {pedido.setid_consultor((Long) value);pedido.setconsultor_descripcion(pedidoBeanSwingJInternalFrame.getActualConsultorForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {pedido.setorden((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {pedido.setid_responsable((Long) value);pedido.setresponsable_descripcion(pedidoBeanSwingJInternalFrame.getActualResponsableForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {pedido.setid_estado_pedido((Long) value);pedido.setestadopedido_descripcion(pedidoBeanSwingJInternalFrame.getActualEstadoPedidoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {pedido.setid_transporte((Long) value);pedido.settransporte_descripcion(pedidoBeanSwingJInternalFrame.getActualTransporteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {pedido.setid_ruta_transporte((Long) value);pedido.setrutatransporte_descripcion(pedidoBeanSwingJInternalFrame.getActualRutaTransporteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {pedido.setvalor_ruta((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {pedido.setid_tipo_llamada((Long) value);pedido.settipollamada_descripcion(pedidoBeanSwingJInternalFrame.getActualTipoLlamadaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {pedido.setid_transportista((Long) value);pedido.settransportista_descripcion(pedidoBeanSwingJInternalFrame.getActualTransportistaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {pedido.sethora_inicio((Time) value);} catch (Exception e) {e.printStackTrace();} break;
				case 34: try {pedido.sethora_fin((Time) value);} catch (Exception e) {e.printStackTrace();} break;
				case 35: try {pedido.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 36: try {pedido.setcupo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 37: try {pedido.setsaldo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 38: try {pedido.setpedidos((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 39: try {pedido.setdocumentos((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 40: try {pedido.setdisponible((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 41: try {pedido.setdescuento_porcentaje((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 42: try {pedido.settotal_con_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 43: try {pedido.setsuman((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 44: try {pedido.setdescuento_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 45: try {pedido.settotal_sin_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 46: try {pedido.setdescuento_total((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 47: try {pedido.setflete((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 48: try {pedido.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 49: try {pedido.setsubtotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 50: try {pedido.setotro((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 51: try {pedido.setultimo_costo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 52: try {pedido.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 53: try {pedido.setfinanciamiento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 54: try {pedido.setmargen_utilidad((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 55: try {pedido.setotros_valores((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 56: try {pedido.setanticipo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public PedidoModel(JInternalFrameBase jInternalFrameBase) {
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
		private PedidoDetalleFormJInternalFrame pedidoJInternalFrame=null;
		
		public PedidoModel(PedidoDetalleFormJInternalFrame pedidoJInternalFrame) {
			this.pedidoJInternalFrame=pedidoJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.pedidoJInternalFrame.getjButtonActualizarToolBarPedido();
			
			if(component!=null && component.equals(this.pedidoJInternalFrame.getjButtonActualizarToolBarPedido())) {
				componentTab=this.pedidoJInternalFrame.getjButtonEliminarToolBarPedido();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidoJInternalFrame.getjButtonEliminarToolBarPedido())) {
				componentTab=this.pedidoJInternalFrame.getjButtonCancelarToolBarPedido();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidoJInternalFrame.getjButtonCancelarToolBarPedido())) {
				componentTab=this.pedidoJInternalFrame.jComboBoxid_empresaPedido;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldicePedido)) {
				componentTab=this.pedidoJInternalFrame.jComboBoxTiposAccionesFormularioPedido;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxTiposAccionesFormularioPedido)) {
				componentTab=this.pedidoJInternalFrame.jButtonEliminarPedido;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidoJInternalFrame.jButtonEliminarPedido)) {
				componentTab=this.pedidoJInternalFrame.jButtonActualizarPedido;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidoJInternalFrame.jButtonActualizarPedido)) {
				componentTab=this.pedidoJInternalFrame.jButtonCancelarPedido;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_empresaPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_sucursalPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_sucursalPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_ejercicioPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_ejercicioPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_periodoPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_periodoPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_anioPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_anioPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_mesPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_mesPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_usuarioPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_usuarioPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldnumeroPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldnumeroPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldpre_impresoPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldpre_impresoPedido)) {
			componentTab=this.pedidoJInternalFrame.jDateChooserfecha_emisionPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jDateChooserfecha_emisionPedido)) {
			componentTab=this.pedidoJInternalFrame.jDateChooserfecha_entregaPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jDateChooserfecha_entregaPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_monedaPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_monedaPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldcotizacionPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldcotizacionPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_empleadoPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_empleadoPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_tipo_precioPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_tipo_precioPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_formatoPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_formatoPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextAreadireccionPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextAreadireccionPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_clientePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_clientePedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldtelefonoPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldtelefonoPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldrucPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldrucPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_sub_clientePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_sub_clientePedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_vendedorPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_vendedorPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_consultorPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_consultorPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldordenPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldordenPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_responsablePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_responsablePedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_estado_pedidoPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_estado_pedidoPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_transportePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_transportePedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_ruta_transportePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_ruta_transportePedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldvalor_rutaPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldvalor_rutaPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_tipo_llamadaPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_tipo_llamadaPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_transportistaPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_transportistaPedido)) {
			componentTab=this.pedidoJInternalFrame.jSpinnerhora_inicioPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jSpinnerhora_inicioPedido)) {
			componentTab=this.pedidoJInternalFrame.jSpinnerhora_finPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jSpinnerhora_finPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextAreadescripcionPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextAreadescripcionPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldcupoPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldcupoPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldsaldoPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldsaldoPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldpedidosPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldpedidosPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFielddocumentosPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFielddocumentosPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFielddisponiblePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFielddisponiblePedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFielddescuento_porcentajePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFielddescuento_porcentajePedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldtotal_con_ivaPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldtotal_con_ivaPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldsumanPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldsumanPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFielddescuento_valorPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFielddescuento_valorPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldtotal_sin_ivaPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldtotal_sin_ivaPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFielddescuento_totalPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFielddescuento_totalPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldfletePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldfletePedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldtotalPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldtotalPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldsubtotalPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldsubtotalPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldotroPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldotroPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldultimo_costoPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldultimo_costoPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldivaPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldivaPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldfinanciamientoPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldfinanciamientoPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldmargen_utilidadPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldmargen_utilidadPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldotros_valoresPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldotros_valoresPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldanticipoPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldanticipoPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_tipo_cambioPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_tipo_cambioPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_centro_costoPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_centro_costoPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_zonaPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_zonaPedido)) {
			componentTab=this.pedidoJInternalFrame.jDateChooserfechaPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jDateChooserfechaPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldnumero_fuePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldnumero_fuePedido)) {
			componentTab=this.pedidoJInternalFrame.jDateChooserfecha_servidorPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jDateChooserfecha_servidorPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldmonto_retencionPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldmonto_retencionPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldicePedido;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.pedidoJInternalFrame.getjButtonActualizarToolBarPedido();
			
			if(component!=null && component.equals(this.pedidoJInternalFrame.getjButtonEliminarToolBarPedido())) {
				componentTab=this.pedidoJInternalFrame.getjButtonActualizarToolBarPedido();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidoJInternalFrame.getjButtonCancelarToolBarPedido())) {
				componentTab=this.pedidoJInternalFrame.getjButtonEliminarToolBarPedido();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_empresaPedido)) {
				
				componentTab=this.pedidoJInternalFrame.getjButtonCancelarToolBarPedido();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxTiposAccionesFormularioPedido)) {
				componentTab=this.pedidoJInternalFrame.jTextFieldicePedido;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.pedidoJInternalFrame.jButtonEliminarPedido)) {
				componentTab=this.pedidoJInternalFrame.jComboBoxTiposAccionesFormularioPedido;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidoJInternalFrame.jButtonActualizarPedido)) {
				componentTab=this.pedidoJInternalFrame.jButtonEliminarPedido;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidoJInternalFrame.jButtonCancelarPedido)) {
				componentTab=this.pedidoJInternalFrame.jButtonActualizarPedido;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_sucursalPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_empresaPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_ejercicioPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_sucursalPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_periodoPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_ejercicioPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_anioPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_periodoPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_mesPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_anioPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_usuarioPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_mesPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldnumeroPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_usuarioPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldpre_impresoPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldnumeroPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jDateChooserfecha_emisionPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldpre_impresoPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jDateChooserfecha_entregaPedido)) {
			componentTab=this.pedidoJInternalFrame.jDateChooserfecha_emisionPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_monedaPedido)) {
			componentTab=this.pedidoJInternalFrame.jDateChooserfecha_entregaPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldcotizacionPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_monedaPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_empleadoPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldcotizacionPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_tipo_precioPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_empleadoPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_formatoPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_tipo_precioPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextAreadireccionPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_formatoPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_clientePedido)) {
			componentTab=this.pedidoJInternalFrame.jTextAreadireccionPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldtelefonoPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_clientePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldrucPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldtelefonoPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_sub_clientePedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldrucPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_vendedorPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_sub_clientePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_consultorPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_vendedorPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldordenPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_consultorPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_responsablePedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldordenPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_estado_pedidoPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_responsablePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_transportePedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_estado_pedidoPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_ruta_transportePedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_transportePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldvalor_rutaPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_ruta_transportePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_tipo_llamadaPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldvalor_rutaPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_transportistaPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_tipo_llamadaPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jSpinnerhora_inicioPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_transportistaPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jSpinnerhora_finPedido)) {
			componentTab=this.pedidoJInternalFrame.jSpinnerhora_inicioPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextAreadescripcionPedido)) {
			componentTab=this.pedidoJInternalFrame.jSpinnerhora_finPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldcupoPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextAreadescripcionPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldsaldoPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldcupoPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldpedidosPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldsaldoPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFielddocumentosPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldpedidosPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFielddisponiblePedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFielddocumentosPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFielddescuento_porcentajePedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFielddisponiblePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldtotal_con_ivaPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFielddescuento_porcentajePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldsumanPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldtotal_con_ivaPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFielddescuento_valorPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldsumanPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldtotal_sin_ivaPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFielddescuento_valorPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFielddescuento_totalPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldtotal_sin_ivaPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldfletePedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFielddescuento_totalPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldtotalPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldfletePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldsubtotalPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldtotalPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldotroPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldsubtotalPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldultimo_costoPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldotroPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldivaPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldultimo_costoPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldfinanciamientoPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldivaPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldmargen_utilidadPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldfinanciamientoPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldotros_valoresPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldmargen_utilidadPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldanticipoPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldotros_valoresPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_tipo_cambioPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldanticipoPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_centro_costoPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_tipo_cambioPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jComboBoxid_zonaPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_centro_costoPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jDateChooserfechaPedido)) {
			componentTab=this.pedidoJInternalFrame.jComboBoxid_zonaPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldnumero_fuePedido)) {
			componentTab=this.pedidoJInternalFrame.jDateChooserfechaPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jDateChooserfecha_servidorPedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldnumero_fuePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldmonto_retencionPedido)) {
			componentTab=this.pedidoJInternalFrame.jDateChooserfecha_servidorPedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoJInternalFrame.jTextFieldicePedido)) {
			componentTab=this.pedidoJInternalFrame.jTextFieldmonto_retencionPedido;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.pedidoJInternalFrame.getjButtonActualizarToolBarPedido();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.pedidoJInternalFrame.getjButtonActualizarToolBarPedido();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.pedidoJInternalFrame.getjButtonCancelarToolBarPedido();
			
			
			return componentTab;		
		}
		
		public PedidoDetalleFormJInternalFrame getpedidoJInternalFrame() {
			return this.pedidoJInternalFrame;
		}
		
		public void setpedidoJInternalFrame(PedidoDetalleFormJInternalFrame pedidoJInternalFrame) {
			this.pedidoJInternalFrame=pedidoJInternalFrame;
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
