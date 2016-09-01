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

import com.bydan.erp.facturacion.util.PedidoExporConstantesFunciones;
import com.bydan.erp.facturacion.util.PedidoExporParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.PedidoExporParameterGeneral;

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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.PedidoExporBeanSwingJInternalFrame;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.PedidoExporJInternalFrame;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.PedidoExporDetalleFormJInternalFrame;

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


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.comisiones.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class PedidoExporModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,PedidoExporConstantesFunciones.LABEL_ID
										,PedidoExporConstantesFunciones.LABEL_IDEMPRESA
										,PedidoExporConstantesFunciones.LABEL_IDSUCURSAL
										,PedidoExporConstantesFunciones.LABEL_IDEJERCICIO
										,PedidoExporConstantesFunciones.LABEL_IDPERIODO
										,PedidoExporConstantesFunciones.LABEL_IDANIO
										,PedidoExporConstantesFunciones.LABEL_IDMES
										,PedidoExporConstantesFunciones.LABEL_IDUSUARIO
										,PedidoExporConstantesFunciones.LABEL_NUMERO
										,PedidoExporConstantesFunciones.LABEL_NUMEROAUTORIZACION
										,PedidoExporConstantesFunciones.LABEL_FECHAEMISION
										,PedidoExporConstantesFunciones.LABEL_FECHAVENCIMIENTO
										,PedidoExporConstantesFunciones.LABEL_IDMONEDA
										,PedidoExporConstantesFunciones.LABEL_COTIZACION
										,PedidoExporConstantesFunciones.LABEL_IDEMPLEADO
										,PedidoExporConstantesFunciones.LABEL_IDTIPOPRECIO
										,PedidoExporConstantesFunciones.LABEL_IDFORMATO
										,PedidoExporConstantesFunciones.LABEL_DIRECCION
										,PedidoExporConstantesFunciones.LABEL_IDCLIENTE
										,PedidoExporConstantesFunciones.LABEL_TELEFONO
										,PedidoExporConstantesFunciones.LABEL_RUC
										,PedidoExporConstantesFunciones.LABEL_IDPAIS
										,PedidoExporConstantesFunciones.LABEL_LUGARENTREGA
										,PedidoExporConstantesFunciones.LABEL_EMBARQUE
										,PedidoExporConstantesFunciones.LABEL_NEGOCIACION
										,PedidoExporConstantesFunciones.LABEL_IDTRANSPORTE
										,PedidoExporConstantesFunciones.LABEL_IDVENDEDOR
										,PedidoExporConstantesFunciones.LABEL_FORMAPAGO
										,PedidoExporConstantesFunciones.LABEL_IDSUBCLIENTE
										,PedidoExporConstantesFunciones.LABEL_IDCONSIGNATARIO
										,PedidoExporConstantesFunciones.LABEL_IDCONSULTOR
										,PedidoExporConstantesFunciones.LABEL_ORDEN
										,PedidoExporConstantesFunciones.LABEL_IDESTADOPEDIDOEXPOR
										,PedidoExporConstantesFunciones.LABEL_DESCRIPCION
										,PedidoExporConstantesFunciones.LABEL_MONTO
										,PedidoExporConstantesFunciones.LABEL_SALDO
										,PedidoExporConstantesFunciones.LABEL_DISPONIBLE
										,PedidoExporConstantesFunciones.LABEL_DESCUENTOPORCENTAJE
										,PedidoExporConstantesFunciones.LABEL_TOTALCONIVA
										,PedidoExporConstantesFunciones.LABEL_SUMAN
										,PedidoExporConstantesFunciones.LABEL_DESCUENTOVALOR
										,PedidoExporConstantesFunciones.LABEL_TOTALSINIVA
										,PedidoExporConstantesFunciones.LABEL_TOTALDESCUENTO
										,PedidoExporConstantesFunciones.LABEL_FLETE
										,PedidoExporConstantesFunciones.LABEL_TOTAL
										,PedidoExporConstantesFunciones.LABEL_SUBTOTAL
										,PedidoExporConstantesFunciones.LABEL_SEGUROS
										,PedidoExporConstantesFunciones.LABEL_IVA
										,PedidoExporConstantesFunciones.LABEL_FINANCIAMIENTO
										};
	   
	    public List<PedidoExpor> pedidoexpors;
	  	 
	    //NO SE UTILIZA
	    public PedidoExporModel(List<PedidoExpor> pedidoexpors,JInternalFrameBase jInternalFrameBase) {
	    	this.pedidoexpors=pedidoexpors;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public PedidoExporModel(JInternalFrameBase jInternalFrameBase) {
	    	this.pedidoexpors=new ArrayList<PedidoExpor>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.pedidoexpors.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.pedidoexpors.get(rowIndex).getIsSelected();
	            
				case 1: return this.pedidoexpors.get(rowIndex).getId();
				case 2: return this.pedidoexpors.get(rowIndex).getid_empresa();
				case 3: return this.pedidoexpors.get(rowIndex).getid_sucursal();
				case 4: return this.pedidoexpors.get(rowIndex).getid_ejercicio();
				case 5: return this.pedidoexpors.get(rowIndex).getid_periodo();
				case 6: return this.pedidoexpors.get(rowIndex).getid_anio();
				case 7: return this.pedidoexpors.get(rowIndex).getid_mes();
				case 8: return this.pedidoexpors.get(rowIndex).getid_usuario();
				case 9: return this.pedidoexpors.get(rowIndex).getnumero();
				case 10: return this.pedidoexpors.get(rowIndex).getnumero_preimpreso();
				case 11: return this.pedidoexpors.get(rowIndex).getfecha_emision();
				case 12: return this.pedidoexpors.get(rowIndex).getfecha_vencimiento();
				case 13: return this.pedidoexpors.get(rowIndex).getid_moneda();
				case 14: return this.pedidoexpors.get(rowIndex).getcotizacion();
				case 15: return this.pedidoexpors.get(rowIndex).getid_empleado();
				case 16: return this.pedidoexpors.get(rowIndex).getid_tipo_precio();
				case 17: return this.pedidoexpors.get(rowIndex).getid_formato();
				case 18: return this.pedidoexpors.get(rowIndex).getdireccion();
				case 19: return this.pedidoexpors.get(rowIndex).getid_cliente();
				case 20: return this.pedidoexpors.get(rowIndex).gettelefono();
				case 21: return this.pedidoexpors.get(rowIndex).getruc();
				case 22: return this.pedidoexpors.get(rowIndex).getid_pais();
				case 23: return this.pedidoexpors.get(rowIndex).getlugar_entrega();
				case 24: return this.pedidoexpors.get(rowIndex).getembarque();
				case 25: return this.pedidoexpors.get(rowIndex).getnegociacion();
				case 26: return this.pedidoexpors.get(rowIndex).getid_transporte();
				case 27: return this.pedidoexpors.get(rowIndex).getid_vendedor();
				case 28: return this.pedidoexpors.get(rowIndex).getforma_pago();
				case 29: return this.pedidoexpors.get(rowIndex).getid_sub_cliente();
				case 30: return this.pedidoexpors.get(rowIndex).getid_consignatario();
				case 31: return this.pedidoexpors.get(rowIndex).getid_consultor();
				case 32: return this.pedidoexpors.get(rowIndex).getorden();
				case 33: return this.pedidoexpors.get(rowIndex).getid_estado_pedido();
				case 34: return this.pedidoexpors.get(rowIndex).getdescripcion();
				case 35: return this.pedidoexpors.get(rowIndex).getmonto();
				case 36: return this.pedidoexpors.get(rowIndex).getsaldo();
				case 37: return this.pedidoexpors.get(rowIndex).getdisponible();
				case 38: return this.pedidoexpors.get(rowIndex).getdescuento_porcentaje();
				case 39: return this.pedidoexpors.get(rowIndex).gettotal_con_iva();
				case 40: return this.pedidoexpors.get(rowIndex).getsuman();
				case 41: return this.pedidoexpors.get(rowIndex).getdescuento_valor();
				case 42: return this.pedidoexpors.get(rowIndex).gettotal_sin_iva();
				case 43: return this.pedidoexpors.get(rowIndex).gettotal_descuento();
				case 44: return this.pedidoexpors.get(rowIndex).getflete();
				case 45: return this.pedidoexpors.get(rowIndex).gettotal();
				case 46: return this.pedidoexpors.get(rowIndex).getsubtotal();
				case 47: return this.pedidoexpors.get(rowIndex).getseguros();
				case 48: return this.pedidoexpors.get(rowIndex).getiva();
				case 49: return this.pedidoexpors.get(rowIndex).getfinanciamiento();	            
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
				case 23: return String.class;
				case 24: return String.class;
				case 25: return String.class;
				case 26: return Long.class;
				case 27: return Long.class;
				case 28: return String.class;
				case 29: return Long.class;
				case 30: return Long.class;
				case 31: return Long.class;
				case 32: return String.class;
				case 33: return Long.class;
				case 34: return String.class;
				case 35: return Double.class;
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	PedidoExpor pedidoexpor = this.pedidoexpors.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFrame=(PedidoExporBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {pedidoexpor.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {pedidoexpor.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {pedidoexpor.setid_empresa((Long) value);pedidoexpor.setempresa_descripcion(pedidoexporBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {pedidoexpor.setid_sucursal((Long) value);pedidoexpor.setsucursal_descripcion(pedidoexporBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {pedidoexpor.setid_ejercicio((Long) value);pedidoexpor.setejercicio_descripcion(pedidoexporBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {pedidoexpor.setid_periodo((Long) value);pedidoexpor.setperiodo_descripcion(pedidoexporBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {pedidoexpor.setid_anio((Long) value);pedidoexpor.setanio_descripcion(pedidoexporBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {pedidoexpor.setid_mes((Long) value);pedidoexpor.setmes_descripcion(pedidoexporBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {pedidoexpor.setid_usuario((Long) value);pedidoexpor.setusuario_descripcion(pedidoexporBeanSwingJInternalFrame.getActualUsuarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {pedidoexpor.setnumero((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {pedidoexpor.setnumero_preimpreso((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {pedidoexpor.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {pedidoexpor.setfecha_vencimiento((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {pedidoexpor.setid_moneda((Long) value);pedidoexpor.setmoneda_descripcion(pedidoexporBeanSwingJInternalFrame.getActualMonedaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {pedidoexpor.setcotizacion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {pedidoexpor.setid_empleado((Long) value);pedidoexpor.setempleado_descripcion(pedidoexporBeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {pedidoexpor.setid_tipo_precio((Long) value);pedidoexpor.settipoprecio_descripcion(pedidoexporBeanSwingJInternalFrame.getActualTipoPrecioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {pedidoexpor.setid_formato((Long) value);pedidoexpor.setformato_descripcion(pedidoexporBeanSwingJInternalFrame.getActualFormatoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {pedidoexpor.setdireccion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {pedidoexpor.setid_cliente((Long) value);pedidoexpor.setcliente_descripcion(pedidoexporBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {pedidoexpor.settelefono((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {pedidoexpor.setruc((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {pedidoexpor.setid_pais((Long) value);pedidoexpor.setpais_descripcion(pedidoexporBeanSwingJInternalFrame.getActualPaisForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {pedidoexpor.setlugar_entrega((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {pedidoexpor.setembarque((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {pedidoexpor.setnegociacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {pedidoexpor.setid_transporte((Long) value);pedidoexpor.settransporte_descripcion(pedidoexporBeanSwingJInternalFrame.getActualTransporteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {pedidoexpor.setid_vendedor((Long) value);pedidoexpor.setvendedor_descripcion(pedidoexporBeanSwingJInternalFrame.getActualVendedorForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {pedidoexpor.setforma_pago((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {pedidoexpor.setid_sub_cliente((Long) value);pedidoexpor.setsubcliente_descripcion(pedidoexporBeanSwingJInternalFrame.getActualSubClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {pedidoexpor.setid_consignatario((Long) value);pedidoexpor.setconsignatario_descripcion(pedidoexporBeanSwingJInternalFrame.getActualConsignatarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {pedidoexpor.setid_consultor((Long) value);pedidoexpor.setconsultor_descripcion(pedidoexporBeanSwingJInternalFrame.getActualConsultorForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {pedidoexpor.setorden((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {pedidoexpor.setid_estado_pedido((Long) value);pedidoexpor.setestadopedidoexpor_descripcion(pedidoexporBeanSwingJInternalFrame.getActualEstadoPedidoExporForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 34: try {pedidoexpor.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 35: try {pedidoexpor.setmonto((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 36: try {pedidoexpor.setsaldo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 37: try {pedidoexpor.setdisponible((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 38: try {pedidoexpor.setdescuento_porcentaje((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 39: try {pedidoexpor.settotal_con_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 40: try {pedidoexpor.setsuman((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 41: try {pedidoexpor.setdescuento_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 42: try {pedidoexpor.settotal_sin_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 43: try {pedidoexpor.settotal_descuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 44: try {pedidoexpor.setflete((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 45: try {pedidoexpor.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 46: try {pedidoexpor.setsubtotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 47: try {pedidoexpor.setseguros((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 48: try {pedidoexpor.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 49: try {pedidoexpor.setfinanciamiento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public PedidoExporModel(JInternalFrameBase jInternalFrameBase) {
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
		private PedidoExporDetalleFormJInternalFrame pedidoexporJInternalFrame=null;
		
		public PedidoExporModel(PedidoExporDetalleFormJInternalFrame pedidoexporJInternalFrame) {
			this.pedidoexporJInternalFrame=pedidoexporJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.pedidoexporJInternalFrame.getjButtonActualizarToolBarPedidoExpor();
			
			if(component!=null && component.equals(this.pedidoexporJInternalFrame.getjButtonActualizarToolBarPedidoExpor())) {
				componentTab=this.pedidoexporJInternalFrame.getjButtonEliminarToolBarPedidoExpor();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidoexporJInternalFrame.getjButtonEliminarToolBarPedidoExpor())) {
				componentTab=this.pedidoexporJInternalFrame.getjButtonCancelarToolBarPedidoExpor();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidoexporJInternalFrame.getjButtonCancelarToolBarPedidoExpor())) {
				componentTab=this.pedidoexporJInternalFrame.jComboBoxid_empresaPedidoExpor;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_transportistaPedidoExpor)) {
				componentTab=this.pedidoexporJInternalFrame.jComboBoxTiposAccionesFormularioPedidoExpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxTiposAccionesFormularioPedidoExpor)) {
				componentTab=this.pedidoexporJInternalFrame.jButtonEliminarPedidoExpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidoexporJInternalFrame.jButtonEliminarPedidoExpor)) {
				componentTab=this.pedidoexporJInternalFrame.jButtonActualizarPedidoExpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidoexporJInternalFrame.jButtonActualizarPedidoExpor)) {
				componentTab=this.pedidoexporJInternalFrame.jButtonCancelarPedidoExpor;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_empresaPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_sucursalPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_sucursalPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_ejercicioPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_ejercicioPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_periodoPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_periodoPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_anioPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_anioPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_mesPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_mesPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_usuarioPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_usuarioPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldnumeroPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldnumeroPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldnumero_preimpresoPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldnumero_preimpresoPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jDateChooserfecha_emisionPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jDateChooserfecha_emisionPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jDateChooserfecha_vencimientoPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jDateChooserfecha_vencimientoPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_monedaPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_monedaPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldcotizacionPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldcotizacionPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_empleadoPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_empleadoPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_tipo_precioPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_tipo_precioPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_formatoPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_formatoPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextAreadireccionPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextAreadireccionPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_clientePedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_clientePedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldtelefonoPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldtelefonoPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldrucPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldrucPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_paisPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_paisPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldlugar_entregaPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldlugar_entregaPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextAreaembarquePedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextAreaembarquePedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextAreanegociacionPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextAreanegociacionPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_transportePedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_transportePedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_vendedorPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_vendedorPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextAreaforma_pagoPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextAreaforma_pagoPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_sub_clientePedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_sub_clientePedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_consignatarioPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_consignatarioPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_consultorPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_consultorPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldordenPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldordenPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_estado_pedidoPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_estado_pedidoPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextAreadescripcionPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextAreadescripcionPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldmontoPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldmontoPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldsaldoPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldsaldoPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFielddisponiblePedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFielddisponiblePedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFielddescuento_porcentajePedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFielddescuento_porcentajePedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldtotal_con_ivaPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldtotal_con_ivaPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldsumanPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldsumanPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFielddescuento_valorPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFielddescuento_valorPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldtotal_sin_ivaPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldtotal_sin_ivaPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldtotal_descuentoPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldtotal_descuentoPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldfletePedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldfletePedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldtotalPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldtotalPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldsubtotalPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldsubtotalPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldsegurosPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldsegurosPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldivaPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldivaPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldfinanciamientoPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldfinanciamientoPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldmonto_retencionPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldmonto_retencionPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldotroPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldotroPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldicePedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldicePedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jDateChooserfechaPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jDateChooserfechaPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jDateChooserfecha_servidorPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jDateChooserfecha_servidorPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_tipo_cambioPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_tipo_cambioPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldnumero_fuePedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldnumero_fuePedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_centro_costoPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_centro_costoPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_responsablePedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_responsablePedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jSpinnerhora_inicioPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jSpinnerhora_inicioPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jSpinnerhora_finPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jSpinnerhora_finPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_transportistaPedidoExpor;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.pedidoexporJInternalFrame.getjButtonActualizarToolBarPedidoExpor();
			
			if(component!=null && component.equals(this.pedidoexporJInternalFrame.getjButtonEliminarToolBarPedidoExpor())) {
				componentTab=this.pedidoexporJInternalFrame.getjButtonActualizarToolBarPedidoExpor();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidoexporJInternalFrame.getjButtonCancelarToolBarPedidoExpor())) {
				componentTab=this.pedidoexporJInternalFrame.getjButtonEliminarToolBarPedidoExpor();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_empresaPedidoExpor)) {
				
				componentTab=this.pedidoexporJInternalFrame.getjButtonCancelarToolBarPedidoExpor();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxTiposAccionesFormularioPedidoExpor)) {
				componentTab=this.pedidoexporJInternalFrame.jComboBoxid_transportistaPedidoExpor;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.pedidoexporJInternalFrame.jButtonEliminarPedidoExpor)) {
				componentTab=this.pedidoexporJInternalFrame.jComboBoxTiposAccionesFormularioPedidoExpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidoexporJInternalFrame.jButtonActualizarPedidoExpor)) {
				componentTab=this.pedidoexporJInternalFrame.jButtonEliminarPedidoExpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidoexporJInternalFrame.jButtonCancelarPedidoExpor)) {
				componentTab=this.pedidoexporJInternalFrame.jButtonActualizarPedidoExpor;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_sucursalPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_empresaPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_ejercicioPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_sucursalPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_periodoPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_ejercicioPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_anioPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_periodoPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_mesPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_anioPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_usuarioPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_mesPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldnumeroPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_usuarioPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldnumero_preimpresoPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldnumeroPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jDateChooserfecha_emisionPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldnumero_preimpresoPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jDateChooserfecha_vencimientoPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jDateChooserfecha_emisionPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_monedaPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jDateChooserfecha_vencimientoPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldcotizacionPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_monedaPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_empleadoPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldcotizacionPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_tipo_precioPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_empleadoPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_formatoPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_tipo_precioPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextAreadireccionPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_formatoPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_clientePedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextAreadireccionPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldtelefonoPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_clientePedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldrucPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldtelefonoPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_paisPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldrucPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldlugar_entregaPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_paisPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextAreaembarquePedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldlugar_entregaPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextAreanegociacionPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextAreaembarquePedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_transportePedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextAreanegociacionPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_vendedorPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_transportePedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextAreaforma_pagoPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_vendedorPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_sub_clientePedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextAreaforma_pagoPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_consignatarioPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_sub_clientePedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_consultorPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_consignatarioPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldordenPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_consultorPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_estado_pedidoPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldordenPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextAreadescripcionPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_estado_pedidoPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldmontoPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextAreadescripcionPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldsaldoPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldmontoPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFielddisponiblePedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldsaldoPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFielddescuento_porcentajePedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFielddisponiblePedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldtotal_con_ivaPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFielddescuento_porcentajePedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldsumanPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldtotal_con_ivaPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFielddescuento_valorPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldsumanPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldtotal_sin_ivaPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFielddescuento_valorPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldtotal_descuentoPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldtotal_sin_ivaPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldfletePedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldtotal_descuentoPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldtotalPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldfletePedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldsubtotalPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldtotalPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldsegurosPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldsubtotalPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldivaPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldsegurosPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldfinanciamientoPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldivaPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldmonto_retencionPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldfinanciamientoPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldotroPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldmonto_retencionPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldicePedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldotroPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jDateChooserfechaPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldicePedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jDateChooserfecha_servidorPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jDateChooserfechaPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_tipo_cambioPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jDateChooserfecha_servidorPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jTextFieldnumero_fuePedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_tipo_cambioPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_centro_costoPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jTextFieldnumero_fuePedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_responsablePedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_centro_costoPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jSpinnerhora_inicioPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jComboBoxid_responsablePedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jSpinnerhora_finPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jSpinnerhora_inicioPedidoExpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidoexporJInternalFrame.jComboBoxid_transportistaPedidoExpor)) {
			componentTab=this.pedidoexporJInternalFrame.jSpinnerhora_finPedidoExpor;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.pedidoexporJInternalFrame.getjButtonActualizarToolBarPedidoExpor();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.pedidoexporJInternalFrame.getjButtonActualizarToolBarPedidoExpor();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.pedidoexporJInternalFrame.getjButtonCancelarToolBarPedidoExpor();
			
			
			return componentTab;		
		}
		
		public PedidoExporDetalleFormJInternalFrame getpedidoexporJInternalFrame() {
			return this.pedidoexporJInternalFrame;
		}
		
		public void setpedidoexporJInternalFrame(PedidoExporDetalleFormJInternalFrame pedidoexporJInternalFrame) {
			this.pedidoexporJInternalFrame=pedidoexporJInternalFrame;
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
