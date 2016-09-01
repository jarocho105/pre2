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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report;




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

//import com.bydan.erp.inventario.util.ProductosServiciosExistenciasConstantesFunciones;
import com.bydan.erp.inventario.util.report.ProductosServiciosExistenciasParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.ProductosServiciosExistenciasParameterGeneral;

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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.report.ProductosServiciosExistenciasBeanSwingJInternalFrame;
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
import com.bydan.erp.inventario.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.inventario.util.*;

import com.bydan.erp.inventario.util.report.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
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

//import org.hibernate.collection.PersistentBag;

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
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.report.ProductosServiciosExistenciasJInternalFrame;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.report.ProductosServiciosExistenciasDetalleFormJInternalFrame;

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
import com.bydan.erp.facturacion.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.facturacion.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class ProductosServiciosExistenciasModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,ProductosServiciosExistenciasConstantesFunciones.LABEL_ID
										,ProductosServiciosExistenciasConstantesFunciones.LABEL_NOMBRESUCURSAL
										,ProductosServiciosExistenciasConstantesFunciones.LABEL_NOMBRELINEA
										,ProductosServiciosExistenciasConstantesFunciones.LABEL_NOMBRELINEAGRUPO
										,ProductosServiciosExistenciasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA
										,ProductosServiciosExistenciasConstantesFunciones.LABEL_NOMBRELINEAMARCA
										,ProductosServiciosExistenciasConstantesFunciones.LABEL_CODIGO
										,ProductosServiciosExistenciasConstantesFunciones.LABEL_NOMBRE
										,ProductosServiciosExistenciasConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO
										,ProductosServiciosExistenciasConstantesFunciones.LABEL_NOMBREBODEGA
										,ProductosServiciosExistenciasConstantesFunciones.LABEL_NOMBREUNIDAD
										,ProductosServiciosExistenciasConstantesFunciones.LABEL_CANTIDADDISPONIBLE
										,ProductosServiciosExistenciasConstantesFunciones.LABEL_CANTIDADRESERVADA
										,ProductosServiciosExistenciasConstantesFunciones.LABEL_CANTIDADPEDIDA
										,ProductosServiciosExistenciasConstantesFunciones.LABEL_TOTALEGRESO
										,ProductosServiciosExistenciasConstantesFunciones.LABEL_TOTALCOMPRA
										,ProductosServiciosExistenciasConstantesFunciones.LABEL_TOTALDEVUELTO
										};
	   
	    public List<ProductosServiciosExistencias> productosserviciosexistenciass;
	  	 
	    //NO SE UTILIZA
	    public ProductosServiciosExistenciasModel(List<ProductosServiciosExistencias> productosserviciosexistenciass,JInternalFrameBase jInternalFrameBase) {
	    	this.productosserviciosexistenciass=productosserviciosexistenciass;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public ProductosServiciosExistenciasModel(JInternalFrameBase jInternalFrameBase) {
	    	this.productosserviciosexistenciass=new ArrayList<ProductosServiciosExistencias>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.productosserviciosexistenciass.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.productosserviciosexistenciass.get(rowIndex).getIsSelected();
	            
				case 1: return this.productosserviciosexistenciass.get(rowIndex).getId();
				case 2: return this.productosserviciosexistenciass.get(rowIndex).getnombre_sucursal();
				case 3: return this.productosserviciosexistenciass.get(rowIndex).getnombre_linea();
				case 4: return this.productosserviciosexistenciass.get(rowIndex).getnombre_linea_grupo();
				case 5: return this.productosserviciosexistenciass.get(rowIndex).getnombre_linea_categoria();
				case 6: return this.productosserviciosexistenciass.get(rowIndex).getnombre_linea_marca();
				case 7: return this.productosserviciosexistenciass.get(rowIndex).getcodigo();
				case 8: return this.productosserviciosexistenciass.get(rowIndex).getnombre();
				case 9: return this.productosserviciosexistenciass.get(rowIndex).getnombre_tipo_producto_servicio();
				case 10: return this.productosserviciosexistenciass.get(rowIndex).getnombre_bodega();
				case 11: return this.productosserviciosexistenciass.get(rowIndex).getnombre_unidad();
				case 12: return this.productosserviciosexistenciass.get(rowIndex).getcantidad_disponible();
				case 13: return this.productosserviciosexistenciass.get(rowIndex).getcantidad_reservada();
				case 14: return this.productosserviciosexistenciass.get(rowIndex).getcantidad_pedida();
				case 15: return this.productosserviciosexistenciass.get(rowIndex).gettotal_egreso();
				case 16: return this.productosserviciosexistenciass.get(rowIndex).gettotal_compra();
				case 17: return this.productosserviciosexistenciass.get(rowIndex).gettotal_devuelto();	            
	            default: return null;
	        }
	    }
	 
	    @Override
	    public Class<?> getColumnClass(int columnIndex) {
	    	switch (columnIndex) {
				case 0: return Boolean.class;
	            
				case 1: return Long.class;
				case 2: return String.class;
				case 3: return String.class;
				case 4: return String.class;
				case 5: return String.class;
				case 6: return String.class;
				case 7: return String.class;
				case 8: return String.class;
				case 9: return String.class;
				case 10: return String.class;
				case 11: return String.class;
				case 12: return Integer.class;
				case 13: return Double.class;
				case 14: return Double.class;
				case 15: return Double.class;
				case 16: return Double.class;
				case 17: return Double.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	ProductosServiciosExistencias productosserviciosexistencias = this.productosserviciosexistenciass.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			ProductosServiciosExistenciasBeanSwingJInternalFrame productosserviciosexistenciasBeanSwingJInternalFrame=(ProductosServiciosExistenciasBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {productosserviciosexistencias.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {productosserviciosexistencias.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {productosserviciosexistencias.setnombre_sucursal((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {productosserviciosexistencias.setnombre_linea((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {productosserviciosexistencias.setnombre_linea_grupo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {productosserviciosexistencias.setnombre_linea_categoria((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {productosserviciosexistencias.setnombre_linea_marca((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {productosserviciosexistencias.setcodigo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {productosserviciosexistencias.setnombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {productosserviciosexistencias.setnombre_tipo_producto_servicio((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {productosserviciosexistencias.setnombre_bodega((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {productosserviciosexistencias.setnombre_unidad((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {productosserviciosexistencias.setcantidad_disponible((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {productosserviciosexistencias.setcantidad_reservada((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {productosserviciosexistencias.setcantidad_pedida((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {productosserviciosexistencias.settotal_egreso((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {productosserviciosexistencias.settotal_compra((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {productosserviciosexistencias.settotal_devuelto((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public ProductosServiciosExistenciasModel(JInternalFrameBase jInternalFrameBase) {
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
		private ProductosServiciosExistenciasDetalleFormJInternalFrame productosserviciosexistenciasJInternalFrame=null;
		
		public ProductosServiciosExistenciasModel(ProductosServiciosExistenciasDetalleFormJInternalFrame productosserviciosexistenciasJInternalFrame) {
			this.productosserviciosexistenciasJInternalFrame=productosserviciosexistenciasJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.productosserviciosexistenciasJInternalFrame.getjButtonActualizarToolBarProductosServiciosExistencias();
			
			if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.getjButtonActualizarToolBarProductosServiciosExistencias())) {
				componentTab=this.productosserviciosexistenciasJInternalFrame.getjButtonEliminarToolBarProductosServiciosExistencias();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.getjButtonEliminarToolBarProductosServiciosExistencias())) {
				componentTab=this.productosserviciosexistenciasJInternalFrame.getjButtonCancelarToolBarProductosServiciosExistencias();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.getjButtonCancelarToolBarProductosServiciosExistencias())) {
				componentTab=this.productosserviciosexistenciasJInternalFrame.jComboBoxid_empresaProductosServiciosExistencias;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextFieldtotal_devueltoProductosServiciosExistencias)) {
				componentTab=this.productosserviciosexistenciasJInternalFrame.jComboBoxTiposAccionesFormularioProductosServiciosExistencias;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jComboBoxTiposAccionesFormularioProductosServiciosExistencias)) {
				componentTab=this.productosserviciosexistenciasJInternalFrame.jButtonEliminarProductosServiciosExistencias;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jButtonEliminarProductosServiciosExistencias)) {
				componentTab=this.productosserviciosexistenciasJInternalFrame.jButtonActualizarProductosServiciosExistencias;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jButtonActualizarProductosServiciosExistencias)) {
				componentTab=this.productosserviciosexistenciasJInternalFrame.jButtonCancelarProductosServiciosExistencias;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jComboBoxid_empresaProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jComboBoxid_sucursalProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jComboBoxid_sucursalProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jComboBoxid_bodegaProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jComboBoxid_bodegaProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jComboBoxid_productoProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jComboBoxid_productoProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jComboBoxid_lineaProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jComboBoxid_lineaProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jComboBoxid_linea_grupoProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jComboBoxid_linea_grupoProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jComboBoxid_linea_categoriaProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jComboBoxid_linea_categoriaProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jComboBoxid_linea_marcaProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jComboBoxid_linea_marcaProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jComboBoxid_tipo_producto_servicioProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jComboBoxid_tipo_producto_servicioProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextAreanombre_sucursalProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextAreanombre_sucursalProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextAreanombre_lineaProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextAreanombre_lineaProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextAreanombre_linea_grupoProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextAreanombre_linea_grupoProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextAreanombre_linea_categoriaProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextAreanombre_linea_categoriaProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextAreanombre_linea_marcaProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextAreanombre_linea_marcaProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextFieldcodigoProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextFieldcodigoProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextAreanombreProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextAreanombreProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextAreanombre_tipo_producto_servicioProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextAreanombre_tipo_producto_servicioProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextAreanombre_bodegaProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextAreanombre_bodegaProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextFieldnombre_unidadProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextFieldnombre_unidadProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextFieldcantidad_disponibleProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextFieldcantidad_disponibleProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextFieldcantidad_reservadaProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextFieldcantidad_reservadaProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextFieldcantidad_pedidaProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextFieldcantidad_pedidaProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextFieldtotal_egresoProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextFieldtotal_egresoProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextFieldtotal_compraProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextFieldtotal_compraProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextFieldtotal_devueltoProductosServiciosExistencias;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.productosserviciosexistenciasJInternalFrame.getjButtonActualizarToolBarProductosServiciosExistencias();
			
			if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.getjButtonEliminarToolBarProductosServiciosExistencias())) {
				componentTab=this.productosserviciosexistenciasJInternalFrame.getjButtonActualizarToolBarProductosServiciosExistencias();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.getjButtonCancelarToolBarProductosServiciosExistencias())) {
				componentTab=this.productosserviciosexistenciasJInternalFrame.getjButtonEliminarToolBarProductosServiciosExistencias();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jComboBoxid_empresaProductosServiciosExistencias)) {
				
				componentTab=this.productosserviciosexistenciasJInternalFrame.getjButtonCancelarToolBarProductosServiciosExistencias();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jComboBoxTiposAccionesFormularioProductosServiciosExistencias)) {
				componentTab=this.productosserviciosexistenciasJInternalFrame.jTextFieldtotal_devueltoProductosServiciosExistencias;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jButtonEliminarProductosServiciosExistencias)) {
				componentTab=this.productosserviciosexistenciasJInternalFrame.jComboBoxTiposAccionesFormularioProductosServiciosExistencias;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jButtonActualizarProductosServiciosExistencias)) {
				componentTab=this.productosserviciosexistenciasJInternalFrame.jButtonEliminarProductosServiciosExistencias;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jButtonCancelarProductosServiciosExistencias)) {
				componentTab=this.productosserviciosexistenciasJInternalFrame.jButtonActualizarProductosServiciosExistencias;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jComboBoxid_sucursalProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jComboBoxid_empresaProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jComboBoxid_bodegaProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jComboBoxid_sucursalProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jComboBoxid_productoProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jComboBoxid_bodegaProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jComboBoxid_lineaProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jComboBoxid_productoProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jComboBoxid_linea_grupoProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jComboBoxid_lineaProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jComboBoxid_linea_categoriaProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jComboBoxid_linea_grupoProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jComboBoxid_linea_marcaProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jComboBoxid_linea_categoriaProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jComboBoxid_tipo_producto_servicioProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jComboBoxid_linea_marcaProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextAreanombre_sucursalProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jComboBoxid_tipo_producto_servicioProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextAreanombre_lineaProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextAreanombre_sucursalProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextAreanombre_linea_grupoProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextAreanombre_lineaProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextAreanombre_linea_categoriaProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextAreanombre_linea_grupoProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextAreanombre_linea_marcaProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextAreanombre_linea_categoriaProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextFieldcodigoProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextAreanombre_linea_marcaProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextAreanombreProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextFieldcodigoProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextAreanombre_tipo_producto_servicioProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextAreanombreProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextAreanombre_bodegaProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextAreanombre_tipo_producto_servicioProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextFieldnombre_unidadProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextAreanombre_bodegaProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextFieldcantidad_disponibleProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextFieldnombre_unidadProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextFieldcantidad_reservadaProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextFieldcantidad_disponibleProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextFieldcantidad_pedidaProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextFieldcantidad_reservadaProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextFieldtotal_egresoProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextFieldcantidad_pedidaProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextFieldtotal_compraProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextFieldtotal_egresoProductosServiciosExistencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.productosserviciosexistenciasJInternalFrame.jTextFieldtotal_devueltoProductosServiciosExistencias)) {
			componentTab=this.productosserviciosexistenciasJInternalFrame.jTextFieldtotal_compraProductosServiciosExistencias;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.productosserviciosexistenciasJInternalFrame.getjButtonActualizarToolBarProductosServiciosExistencias();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.productosserviciosexistenciasJInternalFrame.getjButtonActualizarToolBarProductosServiciosExistencias();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.productosserviciosexistenciasJInternalFrame.getjButtonCancelarToolBarProductosServiciosExistencias();
			
			
			return componentTab;		
		}
		
		public ProductosServiciosExistenciasDetalleFormJInternalFrame getproductosserviciosexistenciasJInternalFrame() {
			return this.productosserviciosexistenciasJInternalFrame;
		}
		
		public void setproductosserviciosexistenciasJInternalFrame(ProductosServiciosExistenciasDetalleFormJInternalFrame productosserviciosexistenciasJInternalFrame) {
			this.productosserviciosexistenciasJInternalFrame=productosserviciosexistenciasJInternalFrame;
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
