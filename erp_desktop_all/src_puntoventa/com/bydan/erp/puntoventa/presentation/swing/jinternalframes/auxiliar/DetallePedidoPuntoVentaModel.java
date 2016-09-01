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

import com.bydan.erp.puntoventa.util.DetallePedidoPuntoVentaConstantesFunciones;
import com.bydan.erp.puntoventa.util.DetallePedidoPuntoVentaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.DetallePedidoPuntoVentaParameterGeneral;

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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.DetallePedidoPuntoVentaBeanSwingJInternalFrame;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.DetallePedidoPuntoVentaJInternalFrame;

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.DetallePedidoPuntoVentaDetalleFormJInternalFrame;

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
import com.bydan.erp.inventario.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class DetallePedidoPuntoVentaModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,DetallePedidoPuntoVentaConstantesFunciones.LABEL_ID
										,DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA
										,DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL
										,DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPEDIDOPUNTOVENTA
										,DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDBODEGA
										,DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO
										,DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDUNIDAD
										,DetallePedidoPuntoVentaConstantesFunciones.LABEL_SERIE
										,DetallePedidoPuntoVentaConstantesFunciones.LABEL_CANTIDAD
										,DetallePedidoPuntoVentaConstantesFunciones.LABEL_PRECIO
										,DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTO
										,DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR
										,DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVA
										,DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVAVALOR
										,DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICE
										,DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICEVALOR
										,DetallePedidoPuntoVentaConstantesFunciones.LABEL_SUBTOTAL
										,DetallePedidoPuntoVentaConstantesFunciones.LABEL_TOTAL
										};
	   
	    public List<DetallePedidoPuntoVenta> detallepedidopuntoventas;
	  	 
	    //NO SE UTILIZA
	    public DetallePedidoPuntoVentaModel(List<DetallePedidoPuntoVenta> detallepedidopuntoventas,JInternalFrameBase jInternalFrameBase) {
	    	this.detallepedidopuntoventas=detallepedidopuntoventas;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public DetallePedidoPuntoVentaModel(JInternalFrameBase jInternalFrameBase) {
	    	this.detallepedidopuntoventas=new ArrayList<DetallePedidoPuntoVenta>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.detallepedidopuntoventas.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.detallepedidopuntoventas.get(rowIndex).getIsSelected();
	            
				case 1: return this.detallepedidopuntoventas.get(rowIndex).getId();
				case 2: return this.detallepedidopuntoventas.get(rowIndex).getid_empresa();
				case 3: return this.detallepedidopuntoventas.get(rowIndex).getid_sucursal();
				case 4: return this.detallepedidopuntoventas.get(rowIndex).getid_pedido_punto_venta();
				case 5: return this.detallepedidopuntoventas.get(rowIndex).getid_bodega();
				case 6: return this.detallepedidopuntoventas.get(rowIndex).getid_producto();
				case 7: return this.detallepedidopuntoventas.get(rowIndex).getid_unidad();
				case 8: return this.detallepedidopuntoventas.get(rowIndex).getserie();
				case 9: return this.detallepedidopuntoventas.get(rowIndex).getcantidad();
				case 10: return this.detallepedidopuntoventas.get(rowIndex).getprecio();
				case 11: return this.detallepedidopuntoventas.get(rowIndex).getdescuento();
				case 12: return this.detallepedidopuntoventas.get(rowIndex).getdescuento_valor();
				case 13: return this.detallepedidopuntoventas.get(rowIndex).getiva();
				case 14: return this.detallepedidopuntoventas.get(rowIndex).getiva_valor();
				case 15: return this.detallepedidopuntoventas.get(rowIndex).getice();
				case 16: return this.detallepedidopuntoventas.get(rowIndex).getice_valor();
				case 17: return this.detallepedidopuntoventas.get(rowIndex).getsub_total();
				case 18: return this.detallepedidopuntoventas.get(rowIndex).gettotal();	            
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
				case 8: return String.class;
				case 9: return Integer.class;
				case 10: return Double.class;
				case 11: return Double.class;
				case 12: return Double.class;
				case 13: return Double.class;
				case 14: return Double.class;
				case 15: return Double.class;
				case 16: return Double.class;
				case 17: return Double.class;
				case 18: return Double.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	DetallePedidoPuntoVenta detallepedidopuntoventa = this.detallepedidopuntoventas.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			DetallePedidoPuntoVentaBeanSwingJInternalFrame detallepedidopuntoventaBeanSwingJInternalFrame=(DetallePedidoPuntoVentaBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {detallepedidopuntoventa.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {detallepedidopuntoventa.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {detallepedidopuntoventa.setid_empresa((Long) value);detallepedidopuntoventa.setempresa_descripcion(detallepedidopuntoventaBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {detallepedidopuntoventa.setid_sucursal((Long) value);detallepedidopuntoventa.setsucursal_descripcion(detallepedidopuntoventaBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {detallepedidopuntoventa.setid_pedido_punto_venta((Long) value);detallepedidopuntoventa.setpedidopuntoventa_descripcion(detallepedidopuntoventaBeanSwingJInternalFrame.getActualPedidoPuntoVentaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {detallepedidopuntoventa.setid_bodega((Long) value);detallepedidopuntoventa.setbodega_descripcion(detallepedidopuntoventaBeanSwingJInternalFrame.getActualBodegaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {detallepedidopuntoventa.setid_producto((Long) value);detallepedidopuntoventa.setproducto_descripcion(detallepedidopuntoventaBeanSwingJInternalFrame.getActualProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {detallepedidopuntoventa.setid_unidad((Long) value);detallepedidopuntoventa.setunidad_descripcion(detallepedidopuntoventaBeanSwingJInternalFrame.getActualUnidadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {detallepedidopuntoventa.setserie((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {detallepedidopuntoventa.setcantidad((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {detallepedidopuntoventa.setprecio((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {detallepedidopuntoventa.setdescuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {detallepedidopuntoventa.setdescuento_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {detallepedidopuntoventa.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {detallepedidopuntoventa.setiva_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {detallepedidopuntoventa.setice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {detallepedidopuntoventa.setice_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {detallepedidopuntoventa.setsub_total((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {detallepedidopuntoventa.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public DetallePedidoPuntoVentaModel(JInternalFrameBase jInternalFrameBase) {
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
		private DetallePedidoPuntoVentaDetalleFormJInternalFrame detallepedidopuntoventaJInternalFrame=null;
		
		public DetallePedidoPuntoVentaModel(DetallePedidoPuntoVentaDetalleFormJInternalFrame detallepedidopuntoventaJInternalFrame) {
			this.detallepedidopuntoventaJInternalFrame=detallepedidopuntoventaJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.detallepedidopuntoventaJInternalFrame.getjButtonActualizarToolBarDetallePedidoPuntoVenta();
			
			if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.getjButtonActualizarToolBarDetallePedidoPuntoVenta())) {
				componentTab=this.detallepedidopuntoventaJInternalFrame.getjButtonEliminarToolBarDetallePedidoPuntoVenta();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.getjButtonEliminarToolBarDetallePedidoPuntoVenta())) {
				componentTab=this.detallepedidopuntoventaJInternalFrame.getjButtonCancelarToolBarDetallePedidoPuntoVenta();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.getjButtonCancelarToolBarDetallePedidoPuntoVenta())) {
				componentTab=this.detallepedidopuntoventaJInternalFrame.jComboBoxid_empresaDetallePedidoPuntoVenta;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jTextFieldtotalDetallePedidoPuntoVenta)) {
				componentTab=this.detallepedidopuntoventaJInternalFrame.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta)) {
				componentTab=this.detallepedidopuntoventaJInternalFrame.jButtonEliminarDetallePedidoPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jButtonEliminarDetallePedidoPuntoVenta)) {
				componentTab=this.detallepedidopuntoventaJInternalFrame.jButtonActualizarDetallePedidoPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jButtonActualizarDetallePedidoPuntoVenta)) {
				componentTab=this.detallepedidopuntoventaJInternalFrame.jButtonCancelarDetallePedidoPuntoVenta;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jComboBoxid_empresaDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jComboBoxid_sucursalDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jComboBoxid_sucursalDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jComboBoxid_bodegaDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jComboBoxid_bodegaDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jComboBoxid_productoDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jComboBoxid_productoDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jComboBoxid_unidadDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jComboBoxid_unidadDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jTextFieldserieDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jTextFieldserieDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jTextFieldcantidadDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jTextFieldcantidadDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jTextFieldprecioDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jTextFieldprecioDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jTextFielddescuentoDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jTextFielddescuentoDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jTextFielddescuento_valorDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jTextFielddescuento_valorDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jTextFieldivaDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jTextFieldivaDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jTextFieldiva_valorDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jTextFieldiva_valorDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jTextFieldiceDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jTextFieldiceDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jTextFieldice_valorDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jTextFieldice_valorDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jTextFieldsub_totalDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jTextFieldsub_totalDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jTextFieldtotalDetallePedidoPuntoVenta;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.detallepedidopuntoventaJInternalFrame.getjButtonActualizarToolBarDetallePedidoPuntoVenta();
			
			if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.getjButtonEliminarToolBarDetallePedidoPuntoVenta())) {
				componentTab=this.detallepedidopuntoventaJInternalFrame.getjButtonActualizarToolBarDetallePedidoPuntoVenta();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.getjButtonCancelarToolBarDetallePedidoPuntoVenta())) {
				componentTab=this.detallepedidopuntoventaJInternalFrame.getjButtonEliminarToolBarDetallePedidoPuntoVenta();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jComboBoxid_empresaDetallePedidoPuntoVenta)) {
				
				componentTab=this.detallepedidopuntoventaJInternalFrame.getjButtonCancelarToolBarDetallePedidoPuntoVenta();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta)) {
				componentTab=this.detallepedidopuntoventaJInternalFrame.jTextFieldtotalDetallePedidoPuntoVenta;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jButtonEliminarDetallePedidoPuntoVenta)) {
				componentTab=this.detallepedidopuntoventaJInternalFrame.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jButtonActualizarDetallePedidoPuntoVenta)) {
				componentTab=this.detallepedidopuntoventaJInternalFrame.jButtonEliminarDetallePedidoPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jButtonCancelarDetallePedidoPuntoVenta)) {
				componentTab=this.detallepedidopuntoventaJInternalFrame.jButtonActualizarDetallePedidoPuntoVenta;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jComboBoxid_sucursalDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jComboBoxid_empresaDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jComboBoxid_sucursalDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jComboBoxid_bodegaDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jComboBoxid_productoDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jComboBoxid_bodegaDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jComboBoxid_unidadDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jComboBoxid_productoDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jTextFieldserieDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jComboBoxid_unidadDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jTextFieldcantidadDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jTextFieldserieDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jTextFieldprecioDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jTextFieldcantidadDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jTextFielddescuentoDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jTextFieldprecioDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jTextFielddescuento_valorDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jTextFielddescuentoDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jTextFieldivaDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jTextFielddescuento_valorDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jTextFieldiva_valorDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jTextFieldivaDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jTextFieldiceDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jTextFieldiva_valorDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jTextFieldice_valorDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jTextFieldiceDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jTextFieldsub_totalDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jTextFieldice_valorDetallePedidoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidopuntoventaJInternalFrame.jTextFieldtotalDetallePedidoPuntoVenta)) {
			componentTab=this.detallepedidopuntoventaJInternalFrame.jTextFieldsub_totalDetallePedidoPuntoVenta;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.detallepedidopuntoventaJInternalFrame.getjButtonActualizarToolBarDetallePedidoPuntoVenta();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.detallepedidopuntoventaJInternalFrame.getjButtonActualizarToolBarDetallePedidoPuntoVenta();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.detallepedidopuntoventaJInternalFrame.getjButtonCancelarToolBarDetallePedidoPuntoVenta();
			
			
			return componentTab;		
		}
		
		public DetallePedidoPuntoVentaDetalleFormJInternalFrame getdetallepedidopuntoventaJInternalFrame() {
			return this.detallepedidopuntoventaJInternalFrame;
		}
		
		public void setdetallepedidopuntoventaJInternalFrame(DetallePedidoPuntoVentaDetalleFormJInternalFrame detallepedidopuntoventaJInternalFrame) {
			this.detallepedidopuntoventaJInternalFrame=detallepedidopuntoventaJInternalFrame;
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
