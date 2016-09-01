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

import com.bydan.erp.inventario.util.PedidoCompraConstantesFunciones;
import com.bydan.erp.inventario.util.PedidoCompraParameterReturnGeneral;
//import com.bydan.erp.inventario.util.PedidoCompraParameterGeneral;

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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.PedidoCompraBeanSwingJInternalFrame;
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
import com.bydan.erp.importaciones.business.logic.*;
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
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.PedidoCompraJInternalFrame;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.PedidoCompraDetalleFormJInternalFrame;

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
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.tesoreria.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class PedidoCompraModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,PedidoCompraConstantesFunciones.LABEL_ID
										,PedidoCompraConstantesFunciones.LABEL_IDEMPRESA
										,PedidoCompraConstantesFunciones.LABEL_IDSUCURSAL
										,PedidoCompraConstantesFunciones.LABEL_IDMODULO
										,PedidoCompraConstantesFunciones.LABEL_IDEJERCICIO
										,PedidoCompraConstantesFunciones.LABEL_IDPERIODO
										,PedidoCompraConstantesFunciones.LABEL_IDANIO
										,PedidoCompraConstantesFunciones.LABEL_IDMES
										,PedidoCompraConstantesFunciones.LABEL_NUMEROSECUENCIAL
										,PedidoCompraConstantesFunciones.LABEL_IDCLIENTE
										,PedidoCompraConstantesFunciones.LABEL_IDUSUARIO
										,PedidoCompraConstantesFunciones.LABEL_IDESTADOPEDIDOCOMPRA
										,PedidoCompraConstantesFunciones.LABEL_IDEMPLEADO
										,PedidoCompraConstantesFunciones.LABEL_RESPONSABLE
										,PedidoCompraConstantesFunciones.LABEL_SOLICITADOPOR
										,PedidoCompraConstantesFunciones.LABEL_MOTIVOSOLICITUD
										,PedidoCompraConstantesFunciones.LABEL_AREASOLICITUD
										,PedidoCompraConstantesFunciones.LABEL_PARAUSODE
										,PedidoCompraConstantesFunciones.LABEL_LUGARENTREGA
										,PedidoCompraConstantesFunciones.LABEL_DESCRIPCION
										,PedidoCompraConstantesFunciones.LABEL_FECHAEMISION
										,PedidoCompraConstantesFunciones.LABEL_FECHAENTREGA
										,PedidoCompraConstantesFunciones.LABEL_IDFORMATO
										};
	   
	    public List<PedidoCompra> pedidocompras;
	  	 
	    //NO SE UTILIZA
	    public PedidoCompraModel(List<PedidoCompra> pedidocompras,JInternalFrameBase jInternalFrameBase) {
	    	this.pedidocompras=pedidocompras;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public PedidoCompraModel(JInternalFrameBase jInternalFrameBase) {
	    	this.pedidocompras=new ArrayList<PedidoCompra>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.pedidocompras.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.pedidocompras.get(rowIndex).getIsSelected();
	            
				case 1: return this.pedidocompras.get(rowIndex).getId();
				case 2: return this.pedidocompras.get(rowIndex).getid_empresa();
				case 3: return this.pedidocompras.get(rowIndex).getid_sucursal();
				case 4: return this.pedidocompras.get(rowIndex).getid_modulo();
				case 5: return this.pedidocompras.get(rowIndex).getid_ejercicio();
				case 6: return this.pedidocompras.get(rowIndex).getid_periodo();
				case 7: return this.pedidocompras.get(rowIndex).getid_anio();
				case 8: return this.pedidocompras.get(rowIndex).getid_mes();
				case 9: return this.pedidocompras.get(rowIndex).getnumero_secuencial();
				case 10: return this.pedidocompras.get(rowIndex).getid_cliente();
				case 11: return this.pedidocompras.get(rowIndex).getid_usuario();
				case 12: return this.pedidocompras.get(rowIndex).getid_estado_pedido_compra();
				case 13: return this.pedidocompras.get(rowIndex).getid_empleado();
				case 14: return this.pedidocompras.get(rowIndex).getresponsable();
				case 15: return this.pedidocompras.get(rowIndex).getsolicitado_por();
				case 16: return this.pedidocompras.get(rowIndex).getmotivo_solicitud();
				case 17: return this.pedidocompras.get(rowIndex).getarea_solicitud();
				case 18: return this.pedidocompras.get(rowIndex).getpara_uso_de();
				case 19: return this.pedidocompras.get(rowIndex).getlugar_entrega();
				case 20: return this.pedidocompras.get(rowIndex).getdescripcion();
				case 21: return this.pedidocompras.get(rowIndex).getfecha_emision();
				case 22: return this.pedidocompras.get(rowIndex).getfecha_entrega();
				case 23: return this.pedidocompras.get(rowIndex).getid_formato();	            
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
				case 10: return Long.class;
				case 11: return Long.class;
				case 12: return Long.class;
				case 13: return Long.class;
				case 14: return String.class;
				case 15: return String.class;
				case 16: return String.class;
				case 17: return String.class;
				case 18: return String.class;
				case 19: return String.class;
				case 20: return String.class;
				case 21: return Date.class;
				case 22: return Date.class;
				case 23: return Long.class;	            
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
	    	PedidoCompra pedidocompra = this.pedidocompras.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			PedidoCompraBeanSwingJInternalFrame pedidocompraBeanSwingJInternalFrame=(PedidoCompraBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {pedidocompra.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {pedidocompra.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {pedidocompra.setid_empresa((Long) value);pedidocompra.setempresa_descripcion(pedidocompraBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {pedidocompra.setid_sucursal((Long) value);pedidocompra.setsucursal_descripcion(pedidocompraBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {pedidocompra.setid_modulo((Long) value);pedidocompra.setmodulo_descripcion(pedidocompraBeanSwingJInternalFrame.getActualModuloForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {pedidocompra.setid_ejercicio((Long) value);pedidocompra.setejercicio_descripcion(pedidocompraBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {pedidocompra.setid_periodo((Long) value);pedidocompra.setperiodo_descripcion(pedidocompraBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {pedidocompra.setid_anio((Long) value);pedidocompra.setanio_descripcion(pedidocompraBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {pedidocompra.setid_mes((Long) value);pedidocompra.setmes_descripcion(pedidocompraBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {pedidocompra.setnumero_secuencial((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {pedidocompra.setid_cliente((Long) value);pedidocompra.setcliente_descripcion(pedidocompraBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {pedidocompra.setid_usuario((Long) value);pedidocompra.setusuario_descripcion(pedidocompraBeanSwingJInternalFrame.getActualUsuarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {pedidocompra.setid_estado_pedido_compra((Long) value);pedidocompra.setestadopedidocompra_descripcion(pedidocompraBeanSwingJInternalFrame.getActualEstadoPedidoCompraForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {pedidocompra.setid_empleado((Long) value);pedidocompra.setempleado_descripcion(pedidocompraBeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {pedidocompra.setresponsable((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {pedidocompra.setsolicitado_por((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {pedidocompra.setmotivo_solicitud((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {pedidocompra.setarea_solicitud((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {pedidocompra.setpara_uso_de((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {pedidocompra.setlugar_entrega((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {pedidocompra.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {pedidocompra.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {pedidocompra.setfecha_entrega((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {pedidocompra.setid_formato((Long) value);pedidocompra.setformato_descripcion(pedidocompraBeanSwingJInternalFrame.getActualFormatoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public PedidoCompraModel(JInternalFrameBase jInternalFrameBase) {
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
		private PedidoCompraDetalleFormJInternalFrame pedidocompraJInternalFrame=null;
		
		public PedidoCompraModel(PedidoCompraDetalleFormJInternalFrame pedidocompraJInternalFrame) {
			this.pedidocompraJInternalFrame=pedidocompraJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.pedidocompraJInternalFrame.getjButtonActualizarToolBarPedidoCompra();
			
			if(component!=null && component.equals(this.pedidocompraJInternalFrame.getjButtonActualizarToolBarPedidoCompra())) {
				componentTab=this.pedidocompraJInternalFrame.getjButtonEliminarToolBarPedidoCompra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidocompraJInternalFrame.getjButtonEliminarToolBarPedidoCompra())) {
				componentTab=this.pedidocompraJInternalFrame.getjButtonCancelarToolBarPedidoCompra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidocompraJInternalFrame.getjButtonCancelarToolBarPedidoCompra())) {
				componentTab=this.pedidocompraJInternalFrame.jComboBoxid_empresaPedidoCompra;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.pedidocompraJInternalFrame.jComboBoxid_tipo_cambioPedidoCompra)) {
				componentTab=this.pedidocompraJInternalFrame.jComboBoxTiposAccionesFormularioPedidoCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidocompraJInternalFrame.jComboBoxTiposAccionesFormularioPedidoCompra)) {
				componentTab=this.pedidocompraJInternalFrame.jButtonEliminarPedidoCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidocompraJInternalFrame.jButtonEliminarPedidoCompra)) {
				componentTab=this.pedidocompraJInternalFrame.jButtonActualizarPedidoCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidocompraJInternalFrame.jButtonActualizarPedidoCompra)) {
				componentTab=this.pedidocompraJInternalFrame.jButtonCancelarPedidoCompra;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jComboBoxid_empresaPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jComboBoxid_sucursalPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jComboBoxid_sucursalPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jComboBoxid_moduloPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jComboBoxid_moduloPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jComboBoxid_ejercicioPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jComboBoxid_ejercicioPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jComboBoxid_periodoPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jComboBoxid_periodoPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jComboBoxid_anioPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jComboBoxid_anioPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jComboBoxid_mesPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jComboBoxid_mesPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jComboBoxid_clientePedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jComboBoxid_clientePedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jComboBoxid_usuarioPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jComboBoxid_usuarioPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jComboBoxid_monedaPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jComboBoxid_monedaPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jTextFieldtotalPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jTextFieldtotalPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jDateChooserfechaPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jDateChooserfechaPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jComboBoxid_empleadoPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jComboBoxid_empleadoPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jTextArearesponsablePedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jTextArearesponsablePedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jTextAreasolicitado_porPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jTextAreasolicitado_porPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jTextAreamotivo_solicitudPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jTextAreamotivo_solicitudPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jTextAreaarea_solicitudPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jTextAreaarea_solicitudPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jTextAreapara_uso_dePedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jTextAreapara_uso_dePedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jTextFieldlugar_entregaPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jTextFieldlugar_entregaPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jTextAreadescripcionPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jTextAreadescripcionPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jDateChooserfecha_emisionPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jDateChooserfecha_emisionPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jDateChooserfecha_entregaPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jDateChooserfecha_entregaPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jComboBoxid_formatoPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jComboBoxid_formatoPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jComboBoxid_tipo_cambioPedidoCompra;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.pedidocompraJInternalFrame.getjButtonActualizarToolBarPedidoCompra();
			
			if(component!=null && component.equals(this.pedidocompraJInternalFrame.getjButtonEliminarToolBarPedidoCompra())) {
				componentTab=this.pedidocompraJInternalFrame.getjButtonActualizarToolBarPedidoCompra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidocompraJInternalFrame.getjButtonCancelarToolBarPedidoCompra())) {
				componentTab=this.pedidocompraJInternalFrame.getjButtonEliminarToolBarPedidoCompra();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.pedidocompraJInternalFrame.jComboBoxid_empresaPedidoCompra)) {
				
				componentTab=this.pedidocompraJInternalFrame.getjButtonCancelarToolBarPedidoCompra();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.pedidocompraJInternalFrame.jComboBoxTiposAccionesFormularioPedidoCompra)) {
				componentTab=this.pedidocompraJInternalFrame.jComboBoxid_tipo_cambioPedidoCompra;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.pedidocompraJInternalFrame.jButtonEliminarPedidoCompra)) {
				componentTab=this.pedidocompraJInternalFrame.jComboBoxTiposAccionesFormularioPedidoCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidocompraJInternalFrame.jButtonActualizarPedidoCompra)) {
				componentTab=this.pedidocompraJInternalFrame.jButtonEliminarPedidoCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidocompraJInternalFrame.jButtonCancelarPedidoCompra)) {
				componentTab=this.pedidocompraJInternalFrame.jButtonActualizarPedidoCompra;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jComboBoxid_sucursalPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jComboBoxid_empresaPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jComboBoxid_moduloPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jComboBoxid_sucursalPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jComboBoxid_ejercicioPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jComboBoxid_moduloPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jComboBoxid_periodoPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jComboBoxid_ejercicioPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jComboBoxid_anioPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jComboBoxid_periodoPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jComboBoxid_mesPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jComboBoxid_anioPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jComboBoxid_clientePedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jComboBoxid_mesPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jComboBoxid_usuarioPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jComboBoxid_clientePedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jComboBoxid_monedaPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jComboBoxid_usuarioPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jTextFieldtotalPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jComboBoxid_monedaPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jDateChooserfechaPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jTextFieldtotalPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jComboBoxid_empleadoPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jDateChooserfechaPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jTextArearesponsablePedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jComboBoxid_empleadoPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jTextAreasolicitado_porPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jTextArearesponsablePedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jTextAreamotivo_solicitudPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jTextAreasolicitado_porPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jTextAreaarea_solicitudPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jTextAreamotivo_solicitudPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jTextAreapara_uso_dePedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jTextAreaarea_solicitudPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jTextFieldlugar_entregaPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jTextAreapara_uso_dePedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jTextAreadescripcionPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jTextFieldlugar_entregaPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jDateChooserfecha_emisionPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jTextAreadescripcionPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jDateChooserfecha_entregaPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jDateChooserfecha_emisionPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jComboBoxid_formatoPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jDateChooserfecha_entregaPedidoCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidocompraJInternalFrame.jComboBoxid_tipo_cambioPedidoCompra)) {
			componentTab=this.pedidocompraJInternalFrame.jComboBoxid_formatoPedidoCompra;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.pedidocompraJInternalFrame.getjButtonActualizarToolBarPedidoCompra();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.pedidocompraJInternalFrame.getjButtonActualizarToolBarPedidoCompra();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.pedidocompraJInternalFrame.getjButtonCancelarToolBarPedidoCompra();
			
			
			return componentTab;		
		}
		
		public PedidoCompraDetalleFormJInternalFrame getpedidocompraJInternalFrame() {
			return this.pedidocompraJInternalFrame;
		}
		
		public void setpedidocompraJInternalFrame(PedidoCompraDetalleFormJInternalFrame pedidocompraJInternalFrame) {
			this.pedidocompraJInternalFrame=pedidocompraJInternalFrame;
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
