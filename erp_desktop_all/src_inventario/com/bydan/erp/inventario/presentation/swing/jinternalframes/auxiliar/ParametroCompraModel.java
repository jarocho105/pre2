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

import com.bydan.erp.inventario.util.ParametroCompraConstantesFunciones;
import com.bydan.erp.inventario.util.ParametroCompraParameterReturnGeneral;
//import com.bydan.erp.inventario.util.ParametroCompraParameterGeneral;

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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.ParametroCompraBeanSwingJInternalFrame;
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
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.ParametroCompraJInternalFrame;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.ParametroCompraDetalleFormJInternalFrame;

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
import com.bydan.erp.facturacion.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.facturacion.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class ParametroCompraModel extends FocusTraversalPolicy implements TableModel, Serializable {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,ParametroCompraConstantesFunciones.LABEL_ID
										,ParametroCompraConstantesFunciones.LABEL_IDEMPRESA
										,ParametroCompraConstantesFunciones.LABEL_SECUENCIALPEDIDO
										,ParametroCompraConstantesFunciones.LABEL_SECUENCIALCOTIZACION
										,ParametroCompraConstantesFunciones.LABEL_SECUENCIALPRODUCCION
										,ParametroCompraConstantesFunciones.LABEL_IDTIPODOCUMENTO
										,ParametroCompraConstantesFunciones.LABEL_IDTIPOMOVIMIENTO
										,ParametroCompraConstantesFunciones.LABEL_IDBODEGA
										,ParametroCompraConstantesFunciones.LABEL_IDBODEGARESERVA
										,ParametroCompraConstantesFunciones.LABEL_IDEMPLEADO
										,ParametroCompraConstantesFunciones.LABEL_IDEMBARCADOR
										,ParametroCompraConstantesFunciones.LABEL_CONCENTROCOSTO
										,ParametroCompraConstantesFunciones.LABEL_TEXTOMAIL
										,ParametroCompraConstantesFunciones.LABEL_IDMODULO
										,ParametroCompraConstantesFunciones.LABEL_DESCRIPCION
										,ParametroCompraConstantesFunciones.LABEL_IDFORMATOPEDIDO
										,ParametroCompraConstantesFunciones.LABEL_IDESTADOPEDIDOPENDIENTE
										,ParametroCompraConstantesFunciones.LABEL_IDFORMATOCOTIZACION
										,ParametroCompraConstantesFunciones.LABEL_IDESTADOPEDIDOCOTIZADO
										,ParametroCompraConstantesFunciones.LABEL_IDFORMATOAUTORIZACION
										,ParametroCompraConstantesFunciones.LABEL_IDESTADOPEDIDOAUTORIZADO
										,ParametroCompraConstantesFunciones.LABEL_IDFORMATOITEM
										,ParametroCompraConstantesFunciones.LABEL_IDESTADOPEDIDOANULADO
										,ParametroCompraConstantesFunciones.LABEL_IDPRIORIDADPEDIDO
										,ParametroCompraConstantesFunciones.LABEL_IDESTADOPEDIDOSUSPENDIDO
										,ParametroCompraConstantesFunciones.LABEL_IDESTADOPEDIDOREGULARIZADO
										};
	   
	    public List<ParametroCompra> parametrocompras;
	  	 
	    //NO SE UTILIZA
	    public ParametroCompraModel(List<ParametroCompra> parametrocompras,JInternalFrameBase jInternalFrameBase) {
	    	this.parametrocompras=parametrocompras;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public ParametroCompraModel(JInternalFrameBase jInternalFrameBase) {
	    	this.parametrocompras=new ArrayList<ParametroCompra>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.parametrocompras.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.parametrocompras.get(rowIndex).getIsSelected();
	            
				case 1: return this.parametrocompras.get(rowIndex).getId();
				case 2: return this.parametrocompras.get(rowIndex).getid_empresa();
				case 3: return this.parametrocompras.get(rowIndex).getsecuencial_pedido();
				case 4: return this.parametrocompras.get(rowIndex).getsecuencial_cotizacion();
				case 5: return this.parametrocompras.get(rowIndex).getsecuencial_produccion();
				case 6: return this.parametrocompras.get(rowIndex).getid_tipo_documento();
				case 7: return this.parametrocompras.get(rowIndex).getid_tipo_movimiento();
				case 8: return this.parametrocompras.get(rowIndex).getid_bodega();
				case 9: return this.parametrocompras.get(rowIndex).getid_bodega_reserva();
				case 10: return this.parametrocompras.get(rowIndex).getid_empleado();
				case 11: return this.parametrocompras.get(rowIndex).getid_embarcador();
				case 12: return this.parametrocompras.get(rowIndex).getcon_centro_costo();
				case 13: return this.parametrocompras.get(rowIndex).gettexto_mail();
				case 14: return this.parametrocompras.get(rowIndex).getid_modulo();
				case 15: return this.parametrocompras.get(rowIndex).getdescripcion();
				case 16: return this.parametrocompras.get(rowIndex).getid_formato_pedido();
				case 17: return this.parametrocompras.get(rowIndex).getid_estado_pedido_pendiente();
				case 18: return this.parametrocompras.get(rowIndex).getid_formato_cotizacion();
				case 19: return this.parametrocompras.get(rowIndex).getid_estado_pedido_cotizado();
				case 20: return this.parametrocompras.get(rowIndex).getid_formato_autorizacion();
				case 21: return this.parametrocompras.get(rowIndex).getid_estado_pedido_autorizado();
				case 22: return this.parametrocompras.get(rowIndex).getid_formato_item();
				case 23: return this.parametrocompras.get(rowIndex).getid_estado_pedido_anulado();
				case 24: return this.parametrocompras.get(rowIndex).getid_prioridad_pedido();
				case 25: return this.parametrocompras.get(rowIndex).getid_estado_pedido_suspendido();
				case 26: return this.parametrocompras.get(rowIndex).getid_estado_pedido_regularizado();	            
	            default: return null;
	        }
	    }
	 
	    @Override
	    public Class<?> getColumnClass(int columnIndex) {
	    	switch (columnIndex) {
				case 0: return Boolean.class;
	            
				case 1: return Long.class;
				case 2: return Long.class;
				case 3: return String.class;
				case 4: return String.class;
				case 5: return String.class;
				case 6: return Long.class;
				case 7: return Long.class;
				case 8: return Long.class;
				case 9: return Long.class;
				case 10: return Long.class;
				case 11: return Long.class;
				case 12: return Boolean.class;
				case 13: return String.class;
				case 14: return Long.class;
				case 15: return String.class;
				case 16: return Long.class;
				case 17: return Long.class;
				case 18: return Long.class;
				case 19: return Long.class;
				case 20: return Long.class;
				case 21: return Long.class;
				case 22: return Long.class;
				case 23: return Long.class;
				case 24: return Long.class;
				case 25: return Long.class;
				case 26: return Long.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	ParametroCompra parametrocompra = this.parametrocompras.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			ParametroCompraBeanSwingJInternalFrame parametrocompraBeanSwingJInternalFrame=(ParametroCompraBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {parametrocompra.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {parametrocompra.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {parametrocompra.setid_empresa((Long) value);parametrocompra.setempresa_descripcion(parametrocompraBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {parametrocompra.setsecuencial_pedido((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {parametrocompra.setsecuencial_cotizacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {parametrocompra.setsecuencial_produccion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {parametrocompra.setid_tipo_documento((Long) value);parametrocompra.settipodocumento_descripcion(parametrocompraBeanSwingJInternalFrame.getActualTipoDocumentoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {parametrocompra.setid_tipo_movimiento((Long) value);parametrocompra.settipomovimiento_descripcion(parametrocompraBeanSwingJInternalFrame.getActualTipoMovimientoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {parametrocompra.setid_bodega((Long) value);parametrocompra.setbodega_descripcion(parametrocompraBeanSwingJInternalFrame.getActualBodegaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {parametrocompra.setid_bodega_reserva((Long) value);parametrocompra.setbodegareserva_descripcion(parametrocompraBeanSwingJInternalFrame.getActualBodegaReservaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {parametrocompra.setid_empleado((Long) value);parametrocompra.setempleado_descripcion(parametrocompraBeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {parametrocompra.setid_embarcador((Long) value);parametrocompra.setembarcador_descripcion(parametrocompraBeanSwingJInternalFrame.getActualEmbarcadorForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {parametrocompra.setcon_centro_costo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {parametrocompra.settexto_mail((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {parametrocompra.setid_modulo((Long) value);parametrocompra.setmodulo_descripcion(parametrocompraBeanSwingJInternalFrame.getActualModuloForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {parametrocompra.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {parametrocompra.setid_formato_pedido((Long) value);parametrocompra.setformatopedido_descripcion(parametrocompraBeanSwingJInternalFrame.getActualFormatoPedidoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {parametrocompra.setid_estado_pedido_pendiente((Long) value);parametrocompra.setestadopedidopendiente_descripcion(parametrocompraBeanSwingJInternalFrame.getActualEstadoPedidoPendienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {parametrocompra.setid_formato_cotizacion((Long) value);parametrocompra.setformatocotizacion_descripcion(parametrocompraBeanSwingJInternalFrame.getActualFormatoCotizacionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {parametrocompra.setid_estado_pedido_cotizado((Long) value);parametrocompra.setestadopedidocotizado_descripcion(parametrocompraBeanSwingJInternalFrame.getActualEstadoPedidoCotizadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {parametrocompra.setid_formato_autorizacion((Long) value);parametrocompra.setformatoautorizacion_descripcion(parametrocompraBeanSwingJInternalFrame.getActualFormatoAutorizacionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {parametrocompra.setid_estado_pedido_autorizado((Long) value);parametrocompra.setestadopedidoautorizado_descripcion(parametrocompraBeanSwingJInternalFrame.getActualEstadoPedidoAutorizadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {parametrocompra.setid_formato_item((Long) value);parametrocompra.setformatoitem_descripcion(parametrocompraBeanSwingJInternalFrame.getActualFormatoItemForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {parametrocompra.setid_estado_pedido_anulado((Long) value);parametrocompra.setestadopedidoanulado_descripcion(parametrocompraBeanSwingJInternalFrame.getActualEstadoPedidoAnuladoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {parametrocompra.setid_prioridad_pedido((Long) value);parametrocompra.setprioridadpedido_descripcion(parametrocompraBeanSwingJInternalFrame.getActualPrioridadPedidoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {parametrocompra.setid_estado_pedido_suspendido((Long) value);parametrocompra.setestadopedidosuspendido_descripcion(parametrocompraBeanSwingJInternalFrame.getActualEstadoPedidoSuspendidoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {parametrocompra.setid_estado_pedido_regularizado((Long) value);parametrocompra.setestadopedidoregularizado_descripcion(parametrocompraBeanSwingJInternalFrame.getActualEstadoPedidoRegularizadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private ParametroCompraDetalleFormJInternalFrame parametrocompraJInternalFrame=null;
		
		public ParametroCompraModel(ParametroCompraDetalleFormJInternalFrame parametrocompraJInternalFrame) {
			this.parametrocompraJInternalFrame=parametrocompraJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.parametrocompraJInternalFrame.getjButtonActualizarToolBarParametroCompra();
			
			if(component!=null && component.equals(this.parametrocompraJInternalFrame.getjButtonActualizarToolBarParametroCompra())) {
				componentTab=this.parametrocompraJInternalFrame.getjButtonEliminarToolBarParametroCompra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrocompraJInternalFrame.getjButtonEliminarToolBarParametroCompra())) {
				componentTab=this.parametrocompraJInternalFrame.getjButtonCancelarToolBarParametroCompra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrocompraJInternalFrame.getjButtonCancelarToolBarParametroCompra())) {
				componentTab=this.parametrocompraJInternalFrame.jComboBoxid_empresaParametroCompra;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_estado_pedido_regularizadoParametroCompra)) {
				componentTab=this.parametrocompraJInternalFrame.jComboBoxTiposAccionesFormularioParametroCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxTiposAccionesFormularioParametroCompra)) {
				componentTab=this.parametrocompraJInternalFrame.jButtonEliminarParametroCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrocompraJInternalFrame.jButtonEliminarParametroCompra)) {
				componentTab=this.parametrocompraJInternalFrame.jButtonActualizarParametroCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrocompraJInternalFrame.jButtonActualizarParametroCompra)) {
				componentTab=this.parametrocompraJInternalFrame.jButtonCancelarParametroCompra;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_empresaParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jTextFieldsecuencial_pedidoParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jTextFieldsecuencial_pedidoParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jTextFieldsecuencial_cotizacionParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jTextFieldsecuencial_cotizacionParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jTextFieldsecuencial_produccionParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jTextFieldsecuencial_produccionParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_tipo_documentoParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_tipo_documentoParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_tipo_movimientoParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_tipo_movimientoParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_bodegaParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_bodegaParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_bodega_reservaParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_bodega_reservaParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_empleadoParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_empleadoParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_embarcadorParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_embarcadorParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jCheckBoxcon_centro_costoParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jCheckBoxcon_centro_costoParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jTextAreatexto_mailParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jTextAreatexto_mailParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_moduloParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_moduloParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_tipo_movimiento_moduloParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_tipo_movimiento_moduloParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jTextAreadescripcionParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jTextAreadescripcionParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_formato_pedidoParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_formato_pedidoParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_estado_pedido_pendienteParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_estado_pedido_pendienteParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_formato_cotizacionParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_formato_cotizacionParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_estado_pedido_cotizadoParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_estado_pedido_cotizadoParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_formato_autorizacionParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_formato_autorizacionParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_estado_pedido_autorizadoParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_estado_pedido_autorizadoParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_formato_itemParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_formato_itemParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_estado_pedido_anuladoParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_estado_pedido_anuladoParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_prioridad_pedidoParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_prioridad_pedidoParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_estado_pedido_suspendidoParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_estado_pedido_suspendidoParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_estado_pedido_regularizadoParametroCompra;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.parametrocompraJInternalFrame.getjButtonActualizarToolBarParametroCompra();
			
			if(component!=null && component.equals(this.parametrocompraJInternalFrame.getjButtonEliminarToolBarParametroCompra())) {
				componentTab=this.parametrocompraJInternalFrame.getjButtonActualizarToolBarParametroCompra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrocompraJInternalFrame.getjButtonCancelarToolBarParametroCompra())) {
				componentTab=this.parametrocompraJInternalFrame.getjButtonEliminarToolBarParametroCompra();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_empresaParametroCompra)) {
				
				componentTab=this.parametrocompraJInternalFrame.getjButtonCancelarToolBarParametroCompra();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxTiposAccionesFormularioParametroCompra)) {
				componentTab=this.parametrocompraJInternalFrame.jComboBoxid_estado_pedido_regularizadoParametroCompra;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.parametrocompraJInternalFrame.jButtonEliminarParametroCompra)) {
				componentTab=this.parametrocompraJInternalFrame.jComboBoxTiposAccionesFormularioParametroCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrocompraJInternalFrame.jButtonActualizarParametroCompra)) {
				componentTab=this.parametrocompraJInternalFrame.jButtonEliminarParametroCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrocompraJInternalFrame.jButtonCancelarParametroCompra)) {
				componentTab=this.parametrocompraJInternalFrame.jButtonActualizarParametroCompra;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jTextFieldsecuencial_pedidoParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_empresaParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jTextFieldsecuencial_cotizacionParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jTextFieldsecuencial_pedidoParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jTextFieldsecuencial_produccionParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jTextFieldsecuencial_cotizacionParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_tipo_documentoParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jTextFieldsecuencial_produccionParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_tipo_movimientoParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_tipo_documentoParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_bodegaParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_tipo_movimientoParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_bodega_reservaParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_bodegaParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_empleadoParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_bodega_reservaParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_embarcadorParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_empleadoParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jCheckBoxcon_centro_costoParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_embarcadorParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jTextAreatexto_mailParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jCheckBoxcon_centro_costoParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_moduloParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jTextAreatexto_mailParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_tipo_movimiento_moduloParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_moduloParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jTextAreadescripcionParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_tipo_movimiento_moduloParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_formato_pedidoParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jTextAreadescripcionParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_estado_pedido_pendienteParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_formato_pedidoParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_formato_cotizacionParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_estado_pedido_pendienteParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_estado_pedido_cotizadoParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_formato_cotizacionParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_formato_autorizacionParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_estado_pedido_cotizadoParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_estado_pedido_autorizadoParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_formato_autorizacionParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_formato_itemParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_estado_pedido_autorizadoParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_estado_pedido_anuladoParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_formato_itemParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_prioridad_pedidoParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_estado_pedido_anuladoParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_estado_pedido_suspendidoParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_prioridad_pedidoParametroCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocompraJInternalFrame.jComboBoxid_estado_pedido_regularizadoParametroCompra)) {
			componentTab=this.parametrocompraJInternalFrame.jComboBoxid_estado_pedido_suspendidoParametroCompra;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.parametrocompraJInternalFrame.getjButtonActualizarToolBarParametroCompra();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.parametrocompraJInternalFrame.getjButtonActualizarToolBarParametroCompra();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.parametrocompraJInternalFrame.getjButtonCancelarToolBarParametroCompra();
			
			
			return componentTab;		
		}
		
		public ParametroCompraDetalleFormJInternalFrame getparametrocompraJInternalFrame() {
			return this.parametrocompraJInternalFrame;
		}
		
		public void setparametrocompraJInternalFrame(ParametroCompraDetalleFormJInternalFrame parametrocompraJInternalFrame) {
			this.parametrocompraJInternalFrame=parametrocompraJInternalFrame;
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
