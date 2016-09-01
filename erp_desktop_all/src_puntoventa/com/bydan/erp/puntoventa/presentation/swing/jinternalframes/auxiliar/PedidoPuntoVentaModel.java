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

import com.bydan.erp.puntoventa.util.PedidoPuntoVentaConstantesFunciones;
import com.bydan.erp.puntoventa.util.PedidoPuntoVentaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.PedidoPuntoVentaParameterGeneral;

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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.PedidoPuntoVentaBeanSwingJInternalFrame;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.PedidoPuntoVentaJInternalFrame;

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.PedidoPuntoVentaDetalleFormJInternalFrame;

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


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.inventario.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class PedidoPuntoVentaModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,PedidoPuntoVentaConstantesFunciones.LABEL_ID
										,PedidoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA
										,PedidoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL
										,PedidoPuntoVentaConstantesFunciones.LABEL_IDUSUARIO
										,PedidoPuntoVentaConstantesFunciones.LABEL_IDVENDEDOR
										,PedidoPuntoVentaConstantesFunciones.LABEL_IDCAJA
										,PedidoPuntoVentaConstantesFunciones.LABEL_IDCLIENTE
										,PedidoPuntoVentaConstantesFunciones.LABEL_IDTIPOPRECIO
										,PedidoPuntoVentaConstantesFunciones.LABEL_IDMESA
										,PedidoPuntoVentaConstantesFunciones.LABEL_IDESTADOPEDIDOPUNTOVENTA
										,PedidoPuntoVentaConstantesFunciones.LABEL_NUMERO_SECUENCIAL
										,PedidoPuntoVentaConstantesFunciones.LABEL_CODIGOCLIENTE
										,PedidoPuntoVentaConstantesFunciones.LABEL_NOMBRECLIENTE
										,PedidoPuntoVentaConstantesFunciones.LABEL_DIRECCIONCLIENTE
										,PedidoPuntoVentaConstantesFunciones.LABEL_TELEFONOCLIENTE
										,PedidoPuntoVentaConstantesFunciones.LABEL_TARJETACLIENTE
										,PedidoPuntoVentaConstantesFunciones.LABEL_FECHA
										,PedidoPuntoVentaConstantesFunciones.LABEL_HORA
										,PedidoPuntoVentaConstantesFunciones.LABEL_SUBTOTAL
										,PedidoPuntoVentaConstantesFunciones.LABEL_IVA
										,PedidoPuntoVentaConstantesFunciones.LABEL_ICE
										,PedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTO
										,PedidoPuntoVentaConstantesFunciones.LABEL_TOTAL
										};
	   
	    public List<PedidoPuntoVenta> pedidopuntoventas;
	  	 
	    //NO SE UTILIZA
	    public PedidoPuntoVentaModel(List<PedidoPuntoVenta> pedidopuntoventas,JInternalFrameBase jInternalFrameBase) {
	    	this.pedidopuntoventas=pedidopuntoventas;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public PedidoPuntoVentaModel(JInternalFrameBase jInternalFrameBase) {
	    	this.pedidopuntoventas=new ArrayList<PedidoPuntoVenta>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.pedidopuntoventas.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.pedidopuntoventas.get(rowIndex).getIsSelected();
	            
				case 1: return this.pedidopuntoventas.get(rowIndex).getId();
				case 2: return this.pedidopuntoventas.get(rowIndex).getid_empresa();
				case 3: return this.pedidopuntoventas.get(rowIndex).getid_sucursal();
				case 4: return this.pedidopuntoventas.get(rowIndex).getid_usuario();
				case 5: return this.pedidopuntoventas.get(rowIndex).getid_vendedor();
				case 6: return this.pedidopuntoventas.get(rowIndex).getid_caja();
				case 7: return this.pedidopuntoventas.get(rowIndex).getid_cliente();
				case 8: return this.pedidopuntoventas.get(rowIndex).getid_tipo_precio();
				case 9: return this.pedidopuntoventas.get(rowIndex).getid_mesa();
				case 10: return this.pedidopuntoventas.get(rowIndex).getid_estado_pedido_punto_venta();
				case 11: return this.pedidopuntoventas.get(rowIndex).getnumero_secuencial();
				case 12: return this.pedidopuntoventas.get(rowIndex).getcodigo_cliente();
				case 13: return this.pedidopuntoventas.get(rowIndex).getnombre_cliente();
				case 14: return this.pedidopuntoventas.get(rowIndex).getdireccion_cliente();
				case 15: return this.pedidopuntoventas.get(rowIndex).gettelefono_cliente();
				case 16: return this.pedidopuntoventas.get(rowIndex).gettarjeta_cliente();
				case 17: return this.pedidopuntoventas.get(rowIndex).getfecha();
				case 18: return this.pedidopuntoventas.get(rowIndex).gethora();
				case 19: return this.pedidopuntoventas.get(rowIndex).getsub_total();
				case 20: return this.pedidopuntoventas.get(rowIndex).getiva();
				case 21: return this.pedidopuntoventas.get(rowIndex).getice();
				case 22: return this.pedidopuntoventas.get(rowIndex).getdescuento();
				case 23: return this.pedidopuntoventas.get(rowIndex).gettotal();	            
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
				case 11: return String.class;
				case 12: return String.class;
				case 13: return String.class;
				case 14: return String.class;
				case 15: return String.class;
				case 16: return String.class;
				case 17: return Date.class;
				case 18: return Time.class;
				case 19: return Double.class;
				case 20: return Double.class;
				case 21: return Double.class;
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
	    	PedidoPuntoVenta pedidopuntoventa = this.pedidopuntoventas.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			PedidoPuntoVentaBeanSwingJInternalFrame pedidopuntoventaBeanSwingJInternalFrame=(PedidoPuntoVentaBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {pedidopuntoventa.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {pedidopuntoventa.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {pedidopuntoventa.setid_empresa((Long) value);pedidopuntoventa.setempresa_descripcion(pedidopuntoventaBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {pedidopuntoventa.setid_sucursal((Long) value);pedidopuntoventa.setsucursal_descripcion(pedidopuntoventaBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {pedidopuntoventa.setid_usuario((Long) value);pedidopuntoventa.setusuario_descripcion(pedidopuntoventaBeanSwingJInternalFrame.getActualUsuarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {pedidopuntoventa.setid_vendedor((Long) value);pedidopuntoventa.setvendedor_descripcion(pedidopuntoventaBeanSwingJInternalFrame.getActualVendedorForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {pedidopuntoventa.setid_caja((Long) value);pedidopuntoventa.setcaja_descripcion(pedidopuntoventaBeanSwingJInternalFrame.getActualCajaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {pedidopuntoventa.setid_cliente((Long) value);pedidopuntoventa.setcliente_descripcion(pedidopuntoventaBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {pedidopuntoventa.setid_tipo_precio((Long) value);pedidopuntoventa.settipoprecio_descripcion(pedidopuntoventaBeanSwingJInternalFrame.getActualTipoPrecioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {pedidopuntoventa.setid_mesa((Long) value);pedidopuntoventa.setmesa_descripcion(pedidopuntoventaBeanSwingJInternalFrame.getActualMesaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {pedidopuntoventa.setid_estado_pedido_punto_venta((Long) value);pedidopuntoventa.setestadopedidopuntoventa_descripcion(pedidopuntoventaBeanSwingJInternalFrame.getActualEstadoPedidoPuntoVentaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {pedidopuntoventa.setnumero_secuencial((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {pedidopuntoventa.setcodigo_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {pedidopuntoventa.setnombre_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {pedidopuntoventa.setdireccion_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {pedidopuntoventa.settelefono_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {pedidopuntoventa.settarjeta_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {pedidopuntoventa.setfecha((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {pedidopuntoventa.sethora((Time) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {pedidopuntoventa.setsub_total((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {pedidopuntoventa.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {pedidopuntoventa.setice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {pedidopuntoventa.setdescuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {pedidopuntoventa.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public PedidoPuntoVentaModel(JInternalFrameBase jInternalFrameBase) {
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
		private PedidoPuntoVentaDetalleFormJInternalFrame pedidopuntoventaJInternalFrame=null;
		
		public PedidoPuntoVentaModel(PedidoPuntoVentaDetalleFormJInternalFrame pedidopuntoventaJInternalFrame) {
			this.pedidopuntoventaJInternalFrame=pedidopuntoventaJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.pedidopuntoventaJInternalFrame.getjButtonActualizarToolBarPedidoPuntoVenta();
			
			if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.getjButtonActualizarToolBarPedidoPuntoVenta())) {
				componentTab=this.pedidopuntoventaJInternalFrame.getjButtonEliminarToolBarPedidoPuntoVenta();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.getjButtonEliminarToolBarPedidoPuntoVenta())) {
				componentTab=this.pedidopuntoventaJInternalFrame.getjButtonCancelarToolBarPedidoPuntoVenta();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.getjButtonCancelarToolBarPedidoPuntoVenta())) {
				componentTab=this.pedidopuntoventaJInternalFrame.jComboBoxid_empresaPedidoPuntoVenta;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jTextFieldtotalPedidoPuntoVenta)) {
				componentTab=this.pedidopuntoventaJInternalFrame.jComboBoxTiposAccionesFormularioPedidoPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jComboBoxTiposAccionesFormularioPedidoPuntoVenta)) {
				componentTab=this.pedidopuntoventaJInternalFrame.jButtonEliminarPedidoPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jButtonEliminarPedidoPuntoVenta)) {
				componentTab=this.pedidopuntoventaJInternalFrame.jButtonActualizarPedidoPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jButtonActualizarPedidoPuntoVenta)) {
				componentTab=this.pedidopuntoventaJInternalFrame.jButtonCancelarPedidoPuntoVenta;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jComboBoxid_empresaPedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jComboBoxid_sucursalPedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jComboBoxid_sucursalPedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jComboBoxid_usuarioPedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jComboBoxid_usuarioPedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jComboBoxid_vendedorPedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jComboBoxid_vendedorPedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jComboBoxid_cajaPedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jComboBoxid_cajaPedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jComboBoxid_clientePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jComboBoxid_clientePedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jComboBoxid_tipo_precioPedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jComboBoxid_tipo_precioPedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jComboBoxid_mesaPedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jComboBoxid_mesaPedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jComboBoxid_estado_pedido_punto_ventaPedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jComboBoxid_estado_pedido_punto_ventaPedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jTextFieldnumero_secuencialPedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jTextFieldnumero_secuencialPedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jTextFieldcodigo_clientePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jTextFieldcodigo_clientePedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jTextAreanombre_clientePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jTextAreanombre_clientePedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jTextAreadireccion_clientePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jTextAreadireccion_clientePedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jTextAreatelefono_clientePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jTextAreatelefono_clientePedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jTextFieldtarjeta_clientePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jTextFieldtarjeta_clientePedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jDateChooserfechaPedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jDateChooserfechaPedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jSpinnerhoraPedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jSpinnerhoraPedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jTextFieldsub_totalPedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jTextFieldsub_totalPedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jTextFieldivaPedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jTextFieldivaPedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jTextFieldicePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jTextFieldicePedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jTextFielddescuentoPedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jTextFielddescuentoPedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jTextFieldtotalPedidoPuntoVenta;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.pedidopuntoventaJInternalFrame.getjButtonActualizarToolBarPedidoPuntoVenta();
			
			if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.getjButtonEliminarToolBarPedidoPuntoVenta())) {
				componentTab=this.pedidopuntoventaJInternalFrame.getjButtonActualizarToolBarPedidoPuntoVenta();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.getjButtonCancelarToolBarPedidoPuntoVenta())) {
				componentTab=this.pedidopuntoventaJInternalFrame.getjButtonEliminarToolBarPedidoPuntoVenta();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jComboBoxid_empresaPedidoPuntoVenta)) {
				
				componentTab=this.pedidopuntoventaJInternalFrame.getjButtonCancelarToolBarPedidoPuntoVenta();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jComboBoxTiposAccionesFormularioPedidoPuntoVenta)) {
				componentTab=this.pedidopuntoventaJInternalFrame.jTextFieldtotalPedidoPuntoVenta;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jButtonEliminarPedidoPuntoVenta)) {
				componentTab=this.pedidopuntoventaJInternalFrame.jComboBoxTiposAccionesFormularioPedidoPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jButtonActualizarPedidoPuntoVenta)) {
				componentTab=this.pedidopuntoventaJInternalFrame.jButtonEliminarPedidoPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jButtonCancelarPedidoPuntoVenta)) {
				componentTab=this.pedidopuntoventaJInternalFrame.jButtonActualizarPedidoPuntoVenta;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jComboBoxid_sucursalPedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jComboBoxid_empresaPedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jComboBoxid_usuarioPedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jComboBoxid_sucursalPedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jComboBoxid_vendedorPedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jComboBoxid_usuarioPedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jComboBoxid_cajaPedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jComboBoxid_vendedorPedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jComboBoxid_clientePedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jComboBoxid_cajaPedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jComboBoxid_tipo_precioPedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jComboBoxid_clientePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jComboBoxid_mesaPedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jComboBoxid_tipo_precioPedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jComboBoxid_estado_pedido_punto_ventaPedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jComboBoxid_mesaPedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jTextFieldnumero_secuencialPedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jComboBoxid_estado_pedido_punto_ventaPedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jTextFieldcodigo_clientePedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jTextFieldnumero_secuencialPedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jTextAreanombre_clientePedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jTextFieldcodigo_clientePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jTextAreadireccion_clientePedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jTextAreanombre_clientePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jTextAreatelefono_clientePedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jTextAreadireccion_clientePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jTextFieldtarjeta_clientePedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jTextAreatelefono_clientePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jDateChooserfechaPedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jTextFieldtarjeta_clientePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jSpinnerhoraPedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jDateChooserfechaPedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jTextFieldsub_totalPedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jSpinnerhoraPedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jTextFieldivaPedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jTextFieldsub_totalPedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jTextFieldicePedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jTextFieldivaPedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jTextFielddescuentoPedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jTextFieldicePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidopuntoventaJInternalFrame.jTextFieldtotalPedidoPuntoVenta)) {
			componentTab=this.pedidopuntoventaJInternalFrame.jTextFielddescuentoPedidoPuntoVenta;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.pedidopuntoventaJInternalFrame.getjButtonActualizarToolBarPedidoPuntoVenta();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.pedidopuntoventaJInternalFrame.getjButtonActualizarToolBarPedidoPuntoVenta();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.pedidopuntoventaJInternalFrame.getjButtonCancelarToolBarPedidoPuntoVenta();
			
			
			return componentTab;		
		}
		
		public PedidoPuntoVentaDetalleFormJInternalFrame getpedidopuntoventaJInternalFrame() {
			return this.pedidopuntoventaJInternalFrame;
		}
		
		public void setpedidopuntoventaJInternalFrame(PedidoPuntoVentaDetalleFormJInternalFrame pedidopuntoventaJInternalFrame) {
			this.pedidopuntoventaJInternalFrame=pedidopuntoventaJInternalFrame;
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
