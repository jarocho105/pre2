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
package com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.produccion.util.PedidoDetaProduConstantesFunciones;
import com.bydan.erp.produccion.util.PedidoDetaProduParameterReturnGeneral;
//import com.bydan.erp.produccion.util.PedidoDetaProduParameterGeneral;

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

import com.bydan.erp.produccion.presentation.swing.jinternalframes.PedidoDetaProduBeanSwingJInternalFrame;
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
import com.bydan.erp.produccion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.produccion.util.*;
import com.bydan.erp.produccion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.produccion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
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


import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.produccion.presentation.swing.jinternalframes.PedidoDetaProduJInternalFrame;

import com.bydan.erp.produccion.presentation.swing.jinternalframes.PedidoDetaProduDetalleFormJInternalFrame;

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
import com.bydan.erp.inventario.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.inventario.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class PedidoDetaProduModel extends FocusTraversalPolicy implements TableModel, Serializable {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,PedidoDetaProduConstantesFunciones.LABEL_ID
										,PedidoDetaProduConstantesFunciones.LABEL_IDEMPRESA
										,PedidoDetaProduConstantesFunciones.LABEL_IDSUCURSAL
										,PedidoDetaProduConstantesFunciones.LABEL_IDEJERCICIO
										,PedidoDetaProduConstantesFunciones.LABEL_IDPERIODO
										,PedidoDetaProduConstantesFunciones.LABEL_IDPEDIDOPRODU
										,PedidoDetaProduConstantesFunciones.LABEL_IDBODEGA
										,PedidoDetaProduConstantesFunciones.LABEL_IDPRODUCTO
										,PedidoDetaProduConstantesFunciones.LABEL_IDUNIDAD
										,PedidoDetaProduConstantesFunciones.LABEL_IDBODEGADESTINO
										,PedidoDetaProduConstantesFunciones.LABEL_IDTIPOPROCESOPRODU
										,PedidoDetaProduConstantesFunciones.LABEL_CANTIDAD
										,PedidoDetaProduConstantesFunciones.LABEL_CANTIDADPENDIENTE
										,PedidoDetaProduConstantesFunciones.LABEL_DESCRIPCION
										};
	   
	    public List<PedidoDetaProdu> pedidodetaprodus;
	  	 
	    //NO SE UTILIZA
	    public PedidoDetaProduModel(List<PedidoDetaProdu> pedidodetaprodus,JInternalFrameBase jInternalFrameBase) {
	    	this.pedidodetaprodus=pedidodetaprodus;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public PedidoDetaProduModel(JInternalFrameBase jInternalFrameBase) {
	    	this.pedidodetaprodus=new ArrayList<PedidoDetaProdu>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.pedidodetaprodus.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.pedidodetaprodus.get(rowIndex).getIsSelected();
	            
				case 1: return this.pedidodetaprodus.get(rowIndex).getId();
				case 2: return this.pedidodetaprodus.get(rowIndex).getid_empresa();
				case 3: return this.pedidodetaprodus.get(rowIndex).getid_sucursal();
				case 4: return this.pedidodetaprodus.get(rowIndex).getid_ejercicio();
				case 5: return this.pedidodetaprodus.get(rowIndex).getid_periodo();
				case 6: return this.pedidodetaprodus.get(rowIndex).getid_pedido_produ();
				case 7: return this.pedidodetaprodus.get(rowIndex).getid_bodega();
				case 8: return this.pedidodetaprodus.get(rowIndex).getid_producto();
				case 9: return this.pedidodetaprodus.get(rowIndex).getid_unidad();
				case 10: return this.pedidodetaprodus.get(rowIndex).getid_bodega_destino();
				case 11: return this.pedidodetaprodus.get(rowIndex).getid_tipo_proceso_produ();
				case 12: return this.pedidodetaprodus.get(rowIndex).getcantidad();
				case 13: return this.pedidodetaprodus.get(rowIndex).getcantidad_pendiente();
				case 14: return this.pedidodetaprodus.get(rowIndex).getdescripcion();	            
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
				case 12: return Integer.class;
				case 13: return Integer.class;
				case 14: return String.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	PedidoDetaProdu pedidodetaprodu = this.pedidodetaprodus.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			PedidoDetaProduBeanSwingJInternalFrame pedidodetaproduBeanSwingJInternalFrame=(PedidoDetaProduBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {pedidodetaprodu.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {pedidodetaprodu.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {pedidodetaprodu.setid_empresa((Long) value);pedidodetaprodu.setempresa_descripcion(pedidodetaproduBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {pedidodetaprodu.setid_sucursal((Long) value);pedidodetaprodu.setsucursal_descripcion(pedidodetaproduBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {pedidodetaprodu.setid_ejercicio((Long) value);pedidodetaprodu.setejercicio_descripcion(pedidodetaproduBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {pedidodetaprodu.setid_periodo((Long) value);pedidodetaprodu.setperiodo_descripcion(pedidodetaproduBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {pedidodetaprodu.setid_pedido_produ((Long) value);pedidodetaprodu.setpedidoprodu_descripcion(pedidodetaproduBeanSwingJInternalFrame.getActualPedidoProduForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {pedidodetaprodu.setid_bodega((Long) value);pedidodetaprodu.setbodega_descripcion(pedidodetaproduBeanSwingJInternalFrame.getActualBodegaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {pedidodetaprodu.setid_producto((Long) value);pedidodetaprodu.setproducto_descripcion(pedidodetaproduBeanSwingJInternalFrame.getActualProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {pedidodetaprodu.setid_unidad((Long) value);pedidodetaprodu.setunidad_descripcion(pedidodetaproduBeanSwingJInternalFrame.getActualUnidadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {pedidodetaprodu.setid_bodega_destino((Long) value);pedidodetaprodu.setbodegadestino_descripcion(pedidodetaproduBeanSwingJInternalFrame.getActualBodegaDestinoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {pedidodetaprodu.setid_tipo_proceso_produ((Long) value);pedidodetaprodu.settipoprocesoprodu_descripcion(pedidodetaproduBeanSwingJInternalFrame.getActualTipoProcesoProduForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {pedidodetaprodu.setcantidad((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {pedidodetaprodu.setcantidad_pendiente((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {pedidodetaprodu.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private PedidoDetaProduDetalleFormJInternalFrame pedidodetaproduJInternalFrame=null;
		
		public PedidoDetaProduModel(PedidoDetaProduDetalleFormJInternalFrame pedidodetaproduJInternalFrame) {
			this.pedidodetaproduJInternalFrame=pedidodetaproduJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.pedidodetaproduJInternalFrame.getjButtonActualizarToolBarPedidoDetaProdu();
			
			if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.getjButtonActualizarToolBarPedidoDetaProdu())) {
				componentTab=this.pedidodetaproduJInternalFrame.getjButtonEliminarToolBarPedidoDetaProdu();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.getjButtonEliminarToolBarPedidoDetaProdu())) {
				componentTab=this.pedidodetaproduJInternalFrame.getjButtonCancelarToolBarPedidoDetaProdu();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.getjButtonCancelarToolBarPedidoDetaProdu())) {
				componentTab=this.pedidodetaproduJInternalFrame.jComboBoxid_empresaPedidoDetaProdu;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jTextAreadescripcionPedidoDetaProdu)) {
				componentTab=this.pedidodetaproduJInternalFrame.jComboBoxTiposAccionesFormularioPedidoDetaProdu;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jComboBoxTiposAccionesFormularioPedidoDetaProdu)) {
				componentTab=this.pedidodetaproduJInternalFrame.jButtonEliminarPedidoDetaProdu;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jButtonEliminarPedidoDetaProdu)) {
				componentTab=this.pedidodetaproduJInternalFrame.jButtonActualizarPedidoDetaProdu;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jButtonActualizarPedidoDetaProdu)) {
				componentTab=this.pedidodetaproduJInternalFrame.jButtonCancelarPedidoDetaProdu;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jComboBoxid_empresaPedidoDetaProdu)) {
			componentTab=this.pedidodetaproduJInternalFrame.jComboBoxid_sucursalPedidoDetaProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jComboBoxid_sucursalPedidoDetaProdu)) {
			componentTab=this.pedidodetaproduJInternalFrame.jComboBoxid_ejercicioPedidoDetaProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jComboBoxid_ejercicioPedidoDetaProdu)) {
			componentTab=this.pedidodetaproduJInternalFrame.jComboBoxid_periodoPedidoDetaProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jComboBoxid_periodoPedidoDetaProdu)) {
			componentTab=this.pedidodetaproduJInternalFrame.jComboBoxid_pedido_produPedidoDetaProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jComboBoxid_pedido_produPedidoDetaProdu)) {
			componentTab=this.pedidodetaproduJInternalFrame.jComboBoxid_bodegaPedidoDetaProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jComboBoxid_bodegaPedidoDetaProdu)) {
			componentTab=this.pedidodetaproduJInternalFrame.jComboBoxid_productoPedidoDetaProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jComboBoxid_productoPedidoDetaProdu)) {
			componentTab=this.pedidodetaproduJInternalFrame.jComboBoxid_unidadPedidoDetaProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jComboBoxid_unidadPedidoDetaProdu)) {
			componentTab=this.pedidodetaproduJInternalFrame.jComboBoxid_bodega_destinoPedidoDetaProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jComboBoxid_bodega_destinoPedidoDetaProdu)) {
			componentTab=this.pedidodetaproduJInternalFrame.jComboBoxid_tipo_proceso_produPedidoDetaProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jComboBoxid_tipo_proceso_produPedidoDetaProdu)) {
			componentTab=this.pedidodetaproduJInternalFrame.jTextFieldcantidadPedidoDetaProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jTextFieldcantidadPedidoDetaProdu)) {
			componentTab=this.pedidodetaproduJInternalFrame.jTextFieldcantidad_pendientePedidoDetaProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jTextFieldcantidad_pendientePedidoDetaProdu)) {
			componentTab=this.pedidodetaproduJInternalFrame.jTextAreadescripcionPedidoDetaProdu;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.pedidodetaproduJInternalFrame.getjButtonActualizarToolBarPedidoDetaProdu();
			
			if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.getjButtonEliminarToolBarPedidoDetaProdu())) {
				componentTab=this.pedidodetaproduJInternalFrame.getjButtonActualizarToolBarPedidoDetaProdu();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.getjButtonCancelarToolBarPedidoDetaProdu())) {
				componentTab=this.pedidodetaproduJInternalFrame.getjButtonEliminarToolBarPedidoDetaProdu();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jComboBoxid_empresaPedidoDetaProdu)) {
				
				componentTab=this.pedidodetaproduJInternalFrame.getjButtonCancelarToolBarPedidoDetaProdu();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jComboBoxTiposAccionesFormularioPedidoDetaProdu)) {
				componentTab=this.pedidodetaproduJInternalFrame.jTextAreadescripcionPedidoDetaProdu;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jButtonEliminarPedidoDetaProdu)) {
				componentTab=this.pedidodetaproduJInternalFrame.jComboBoxTiposAccionesFormularioPedidoDetaProdu;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jButtonActualizarPedidoDetaProdu)) {
				componentTab=this.pedidodetaproduJInternalFrame.jButtonEliminarPedidoDetaProdu;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jButtonCancelarPedidoDetaProdu)) {
				componentTab=this.pedidodetaproduJInternalFrame.jButtonActualizarPedidoDetaProdu;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jComboBoxid_sucursalPedidoDetaProdu)) {
			componentTab=this.pedidodetaproduJInternalFrame.jComboBoxid_empresaPedidoDetaProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jComboBoxid_ejercicioPedidoDetaProdu)) {
			componentTab=this.pedidodetaproduJInternalFrame.jComboBoxid_sucursalPedidoDetaProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jComboBoxid_periodoPedidoDetaProdu)) {
			componentTab=this.pedidodetaproduJInternalFrame.jComboBoxid_ejercicioPedidoDetaProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jComboBoxid_pedido_produPedidoDetaProdu)) {
			componentTab=this.pedidodetaproduJInternalFrame.jComboBoxid_periodoPedidoDetaProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jComboBoxid_bodegaPedidoDetaProdu)) {
			componentTab=this.pedidodetaproduJInternalFrame.jComboBoxid_pedido_produPedidoDetaProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jComboBoxid_productoPedidoDetaProdu)) {
			componentTab=this.pedidodetaproduJInternalFrame.jComboBoxid_bodegaPedidoDetaProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jComboBoxid_unidadPedidoDetaProdu)) {
			componentTab=this.pedidodetaproduJInternalFrame.jComboBoxid_productoPedidoDetaProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jComboBoxid_bodega_destinoPedidoDetaProdu)) {
			componentTab=this.pedidodetaproduJInternalFrame.jComboBoxid_unidadPedidoDetaProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jComboBoxid_tipo_proceso_produPedidoDetaProdu)) {
			componentTab=this.pedidodetaproduJInternalFrame.jComboBoxid_bodega_destinoPedidoDetaProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jTextFieldcantidadPedidoDetaProdu)) {
			componentTab=this.pedidodetaproduJInternalFrame.jComboBoxid_tipo_proceso_produPedidoDetaProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jTextFieldcantidad_pendientePedidoDetaProdu)) {
			componentTab=this.pedidodetaproduJInternalFrame.jTextFieldcantidadPedidoDetaProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.pedidodetaproduJInternalFrame.jTextAreadescripcionPedidoDetaProdu)) {
			componentTab=this.pedidodetaproduJInternalFrame.jTextFieldcantidad_pendientePedidoDetaProdu;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.pedidodetaproduJInternalFrame.getjButtonActualizarToolBarPedidoDetaProdu();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.pedidodetaproduJInternalFrame.getjButtonActualizarToolBarPedidoDetaProdu();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.pedidodetaproduJInternalFrame.getjButtonCancelarToolBarPedidoDetaProdu();
			
			
			return componentTab;		
		}
		
		public PedidoDetaProduDetalleFormJInternalFrame getpedidodetaproduJInternalFrame() {
			return this.pedidodetaproduJInternalFrame;
		}
		
		public void setpedidodetaproduJInternalFrame(PedidoDetaProduDetalleFormJInternalFrame pedidodetaproduJInternalFrame) {
			this.pedidodetaproduJInternalFrame=pedidodetaproduJInternalFrame;
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
