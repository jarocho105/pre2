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

import com.bydan.erp.inventario.util.DetallePedidoConstantesFunciones;
import com.bydan.erp.inventario.util.DetallePedidoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.DetallePedidoParameterGeneral;

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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.DetallePedidoBeanSwingJInternalFrame;
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

import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.DetallePedidoJInternalFrame;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.DetallePedidoDetalleFormJInternalFrame;

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



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class DetallePedidoModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,DetallePedidoConstantesFunciones.LABEL_ID
										,DetallePedidoConstantesFunciones.LABEL_IDPEDIDO
										,DetallePedidoConstantesFunciones.LABEL_IDEMPRESA
										,DetallePedidoConstantesFunciones.LABEL_IDSUCURSAL
										,DetallePedidoConstantesFunciones.LABEL_IDEJERCICIO
										,DetallePedidoConstantesFunciones.LABEL_IDPERIODO
										,DetallePedidoConstantesFunciones.LABEL_IDANIO
										,DetallePedidoConstantesFunciones.LABEL_IDMES
										,DetallePedidoConstantesFunciones.LABEL_IDPRODUCTO
										,DetallePedidoConstantesFunciones.LABEL_IDBODEGA
										,DetallePedidoConstantesFunciones.LABEL_IDUNIDAD
										,DetallePedidoConstantesFunciones.LABEL_IDESTADODETALLEPEDIDO
										,DetallePedidoConstantesFunciones.LABEL_CANTIDAD
										,DetallePedidoConstantesFunciones.LABEL_PRECIO
										,DetallePedidoConstantesFunciones.LABEL_DESCUENTOPORCENTAJE
										,DetallePedidoConstantesFunciones.LABEL_DESCUENTOVALOR
										,DetallePedidoConstantesFunciones.LABEL_IVA
										,DetallePedidoConstantesFunciones.LABEL_ICE
										,DetallePedidoConstantesFunciones.LABEL_TOTAL
										};
	   
	    public List<DetallePedido> detallepedidos;
	  	 
	    //NO SE UTILIZA
	    public DetallePedidoModel(List<DetallePedido> detallepedidos,JInternalFrameBase jInternalFrameBase) {
	    	this.detallepedidos=detallepedidos;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public DetallePedidoModel(JInternalFrameBase jInternalFrameBase) {
	    	this.detallepedidos=new ArrayList<DetallePedido>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.detallepedidos.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.detallepedidos.get(rowIndex).getIsSelected();
	            
				case 1: return this.detallepedidos.get(rowIndex).getId();
				case 2: return this.detallepedidos.get(rowIndex).getid_pedido();
				case 3: return this.detallepedidos.get(rowIndex).getid_empresa();
				case 4: return this.detallepedidos.get(rowIndex).getid_sucursal();
				case 5: return this.detallepedidos.get(rowIndex).getid_ejercicio();
				case 6: return this.detallepedidos.get(rowIndex).getid_periodo();
				case 7: return this.detallepedidos.get(rowIndex).getid_anio();
				case 8: return this.detallepedidos.get(rowIndex).getid_mes();
				case 9: return this.detallepedidos.get(rowIndex).getid_producto();
				case 10: return this.detallepedidos.get(rowIndex).getid_bodega();
				case 11: return this.detallepedidos.get(rowIndex).getid_unidad();
				case 12: return this.detallepedidos.get(rowIndex).getid_estado_detalle_pedido();
				case 13: return this.detallepedidos.get(rowIndex).getcantidad();
				case 14: return this.detallepedidos.get(rowIndex).getprecio();
				case 15: return this.detallepedidos.get(rowIndex).getdescuento_porcentaje();
				case 16: return this.detallepedidos.get(rowIndex).getdescuento_valor();
				case 17: return this.detallepedidos.get(rowIndex).getiva();
				case 18: return this.detallepedidos.get(rowIndex).getice();
				case 19: return this.detallepedidos.get(rowIndex).gettotal();	            
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
				case 13: return Integer.class;
				case 14: return Double.class;
				case 15: return Double.class;
				case 16: return Double.class;
				case 17: return Double.class;
				case 18: return Double.class;
				case 19: return Double.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	DetallePedido detallepedido = this.detallepedidos.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			DetallePedidoBeanSwingJInternalFrame detallepedidoBeanSwingJInternalFrame=(DetallePedidoBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {detallepedido.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {detallepedido.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {detallepedido.setid_pedido((Long) value);detallepedido.setpedido_descripcion(detallepedidoBeanSwingJInternalFrame.getActualPedidoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {detallepedido.setid_empresa((Long) value);detallepedido.setempresa_descripcion(detallepedidoBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {detallepedido.setid_sucursal((Long) value);detallepedido.setsucursal_descripcion(detallepedidoBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {detallepedido.setid_ejercicio((Long) value);detallepedido.setejercicio_descripcion(detallepedidoBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {detallepedido.setid_periodo((Long) value);detallepedido.setperiodo_descripcion(detallepedidoBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {detallepedido.setid_anio((Long) value);detallepedido.setanio_descripcion(detallepedidoBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {detallepedido.setid_mes((Long) value);detallepedido.setmes_descripcion(detallepedidoBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {detallepedido.setid_producto((Long) value);detallepedido.setproducto_descripcion(detallepedidoBeanSwingJInternalFrame.getActualProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {detallepedido.setid_bodega((Long) value);detallepedido.setbodega_descripcion(detallepedidoBeanSwingJInternalFrame.getActualBodegaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {detallepedido.setid_unidad((Long) value);detallepedido.setunidad_descripcion(detallepedidoBeanSwingJInternalFrame.getActualUnidadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {detallepedido.setid_estado_detalle_pedido((Long) value);detallepedido.setestadodetallepedido_descripcion(detallepedidoBeanSwingJInternalFrame.getActualEstadoDetallePedidoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {detallepedido.setcantidad((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {detallepedido.setprecio((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {detallepedido.setdescuento_porcentaje((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {detallepedido.setdescuento_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {detallepedido.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {detallepedido.setice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {detallepedido.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public DetallePedidoModel(JInternalFrameBase jInternalFrameBase) {
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
		private DetallePedidoDetalleFormJInternalFrame detallepedidoJInternalFrame=null;
		
		public DetallePedidoModel(DetallePedidoDetalleFormJInternalFrame detallepedidoJInternalFrame) {
			this.detallepedidoJInternalFrame=detallepedidoJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.detallepedidoJInternalFrame.getjButtonActualizarToolBarDetallePedido();
			
			if(component!=null && component.equals(this.detallepedidoJInternalFrame.getjButtonActualizarToolBarDetallePedido())) {
				componentTab=this.detallepedidoJInternalFrame.getjButtonEliminarToolBarDetallePedido();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallepedidoJInternalFrame.getjButtonEliminarToolBarDetallePedido())) {
				componentTab=this.detallepedidoJInternalFrame.getjButtonCancelarToolBarDetallePedido();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallepedidoJInternalFrame.getjButtonCancelarToolBarDetallePedido())) {
				componentTab=this.detallepedidoJInternalFrame.jComboBoxid_pedidoDetallePedido;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.detallepedidoJInternalFrame.jTextFieldutilidadDetallePedido)) {
				componentTab=this.detallepedidoJInternalFrame.jComboBoxTiposAccionesFormularioDetallePedido;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallepedidoJInternalFrame.jComboBoxTiposAccionesFormularioDetallePedido)) {
				componentTab=this.detallepedidoJInternalFrame.jButtonEliminarDetallePedido;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallepedidoJInternalFrame.jButtonEliminarDetallePedido)) {
				componentTab=this.detallepedidoJInternalFrame.jButtonActualizarDetallePedido;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallepedidoJInternalFrame.jButtonActualizarDetallePedido)) {
				componentTab=this.detallepedidoJInternalFrame.jButtonCancelarDetallePedido;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jComboBoxid_pedidoDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jComboBoxid_empresaDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jComboBoxid_empresaDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jComboBoxid_sucursalDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jComboBoxid_sucursalDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jComboBoxid_ejercicioDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jComboBoxid_ejercicioDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jComboBoxid_periodoDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jComboBoxid_periodoDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jComboBoxid_anioDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jComboBoxid_anioDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jComboBoxid_mesDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jComboBoxid_mesDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jComboBoxid_productoDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jComboBoxid_productoDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jComboBoxid_bodegaDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jComboBoxid_bodegaDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jComboBoxid_unidadDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jComboBoxid_unidadDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jComboBoxid_estado_detalle_pedidoDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jComboBoxid_estado_detalle_pedidoDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jTextFieldcantidadDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jTextFieldcantidadDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jTextFieldprecioDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jTextFieldprecioDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jTextFielddescuento_porcentajeDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jTextFielddescuento_porcentajeDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jTextFielddescuento_valorDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jTextFielddescuento_valorDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jTextFieldivaDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jTextFieldivaDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jTextFieldiceDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jTextFieldiceDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jTextFieldtotalDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jTextFieldtotalDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jTextFieldcostoDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jTextFieldcostoDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jTextFieldutilidadDetallePedido;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.detallepedidoJInternalFrame.getjButtonActualizarToolBarDetallePedido();
			
			if(component!=null && component.equals(this.detallepedidoJInternalFrame.getjButtonEliminarToolBarDetallePedido())) {
				componentTab=this.detallepedidoJInternalFrame.getjButtonActualizarToolBarDetallePedido();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallepedidoJInternalFrame.getjButtonCancelarToolBarDetallePedido())) {
				componentTab=this.detallepedidoJInternalFrame.getjButtonEliminarToolBarDetallePedido();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detallepedidoJInternalFrame.jComboBoxid_pedidoDetallePedido)) {
				
				componentTab=this.detallepedidoJInternalFrame.getjButtonCancelarToolBarDetallePedido();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detallepedidoJInternalFrame.jComboBoxTiposAccionesFormularioDetallePedido)) {
				componentTab=this.detallepedidoJInternalFrame.jTextFieldutilidadDetallePedido;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detallepedidoJInternalFrame.jButtonEliminarDetallePedido)) {
				componentTab=this.detallepedidoJInternalFrame.jComboBoxTiposAccionesFormularioDetallePedido;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallepedidoJInternalFrame.jButtonActualizarDetallePedido)) {
				componentTab=this.detallepedidoJInternalFrame.jButtonEliminarDetallePedido;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallepedidoJInternalFrame.jButtonCancelarDetallePedido)) {
				componentTab=this.detallepedidoJInternalFrame.jButtonActualizarDetallePedido;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jComboBoxid_empresaDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jComboBoxid_pedidoDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jComboBoxid_sucursalDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jComboBoxid_empresaDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jComboBoxid_ejercicioDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jComboBoxid_sucursalDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jComboBoxid_periodoDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jComboBoxid_ejercicioDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jComboBoxid_anioDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jComboBoxid_periodoDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jComboBoxid_mesDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jComboBoxid_anioDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jComboBoxid_productoDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jComboBoxid_mesDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jComboBoxid_bodegaDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jComboBoxid_productoDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jComboBoxid_unidadDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jComboBoxid_bodegaDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jComboBoxid_estado_detalle_pedidoDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jComboBoxid_unidadDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jTextFieldcantidadDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jComboBoxid_estado_detalle_pedidoDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jTextFieldprecioDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jTextFieldcantidadDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jTextFielddescuento_porcentajeDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jTextFieldprecioDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jTextFielddescuento_valorDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jTextFielddescuento_porcentajeDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jTextFieldivaDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jTextFielddescuento_valorDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jTextFieldiceDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jTextFieldivaDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jTextFieldtotalDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jTextFieldiceDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jTextFieldcostoDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jTextFieldtotalDetallePedido;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidoJInternalFrame.jTextFieldutilidadDetallePedido)) {
			componentTab=this.detallepedidoJInternalFrame.jTextFieldcostoDetallePedido;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.detallepedidoJInternalFrame.getjButtonActualizarToolBarDetallePedido();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.detallepedidoJInternalFrame.getjButtonActualizarToolBarDetallePedido();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.detallepedidoJInternalFrame.getjButtonCancelarToolBarDetallePedido();
			
			
			return componentTab;		
		}
		
		public DetallePedidoDetalleFormJInternalFrame getdetallepedidoJInternalFrame() {
			return this.detallepedidoJInternalFrame;
		}
		
		public void setdetallepedidoJInternalFrame(DetallePedidoDetalleFormJInternalFrame detallepedidoJInternalFrame) {
			this.detallepedidoJInternalFrame=detallepedidoJInternalFrame;
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
