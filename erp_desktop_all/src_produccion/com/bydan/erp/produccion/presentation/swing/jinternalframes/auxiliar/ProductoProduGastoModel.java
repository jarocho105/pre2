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

import com.bydan.erp.produccion.util.ProductoProduGastoConstantesFunciones;
import com.bydan.erp.produccion.util.ProductoProduGastoParameterReturnGeneral;
//import com.bydan.erp.produccion.util.ProductoProduGastoParameterGeneral;

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

import com.bydan.erp.produccion.presentation.swing.jinternalframes.ProductoProduGastoBeanSwingJInternalFrame;
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

import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.produccion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
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

import com.bydan.erp.produccion.presentation.swing.jinternalframes.ProductoProduGastoJInternalFrame;

import com.bydan.erp.produccion.presentation.swing.jinternalframes.ProductoProduGastoDetalleFormJInternalFrame;

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



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.inventario.util.*;


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class ProductoProduGastoModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,ProductoProduGastoConstantesFunciones.LABEL_ID
										,ProductoProduGastoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU
										,ProductoProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA
										,ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO
										,ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO
										,ProductoProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR
										,ProductoProduGastoConstantesFunciones.LABEL_IDFACTURA
										,ProductoProduGastoConstantesFunciones.LABEL_IDUNIDAD
										,ProductoProduGastoConstantesFunciones.LABEL_CANTIDAD
										,ProductoProduGastoConstantesFunciones.LABEL_COSTO
										,ProductoProduGastoConstantesFunciones.LABEL_COSTOTOTAL
										,ProductoProduGastoConstantesFunciones.LABEL_DESCRIPCION
										};
	   
	    public List<ProductoProduGasto> productoprodugastos;
	  	 
	    //NO SE UTILIZA
	    public ProductoProduGastoModel(List<ProductoProduGasto> productoprodugastos,JInternalFrameBase jInternalFrameBase) {
	    	this.productoprodugastos=productoprodugastos;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public ProductoProduGastoModel(JInternalFrameBase jInternalFrameBase) {
	    	this.productoprodugastos=new ArrayList<ProductoProduGasto>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.productoprodugastos.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.productoprodugastos.get(rowIndex).getIsSelected();
	            
				case 1: return this.productoprodugastos.get(rowIndex).getId();
				case 2: return this.productoprodugastos.get(rowIndex).getid_producto_defi_produ();
				case 3: return this.productoprodugastos.get(rowIndex).getid_tipo_gasto_produ_empresa();
				case 4: return this.productoprodugastos.get(rowIndex).getid_cuenta_contable_debito();
				case 5: return this.productoprodugastos.get(rowIndex).getid_cuenta_contable_credito();
				case 6: return this.productoprodugastos.get(rowIndex).getid_cliente_proveedor();
				case 7: return this.productoprodugastos.get(rowIndex).getid_factura();
				case 8: return this.productoprodugastos.get(rowIndex).getid_unidad();
				case 9: return this.productoprodugastos.get(rowIndex).getcanitdad();
				case 10: return this.productoprodugastos.get(rowIndex).getcosto();
				case 11: return this.productoprodugastos.get(rowIndex).getcosto_total();
				case 12: return this.productoprodugastos.get(rowIndex).getdescripcion();	            
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
				case 9: return Integer.class;
				case 10: return Double.class;
				case 11: return Double.class;
				case 12: return String.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	ProductoProduGasto productoprodugasto = this.productoprodugastos.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			ProductoProduGastoBeanSwingJInternalFrame productoprodugastoBeanSwingJInternalFrame=(ProductoProduGastoBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {productoprodugasto.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {productoprodugasto.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {productoprodugasto.setid_producto_defi_produ((Long) value);productoprodugasto.setproductodefiprodu_descripcion(productoprodugastoBeanSwingJInternalFrame.getActualProductoDefiProduForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {productoprodugasto.setid_tipo_gasto_produ_empresa((Long) value);productoprodugasto.settipogastoproduempresa_descripcion(productoprodugastoBeanSwingJInternalFrame.getActualTipoGastoProduEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {productoprodugasto.setid_cuenta_contable_debito((Long) value);productoprodugasto.setcuentacontabledebito_descripcion(productoprodugastoBeanSwingJInternalFrame.getActualCuentaContableDebitoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {productoprodugasto.setid_cuenta_contable_credito((Long) value);productoprodugasto.setcuentacontablecredito_descripcion(productoprodugastoBeanSwingJInternalFrame.getActualCuentaContableCreditoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {productoprodugasto.setid_cliente_proveedor((Long) value);productoprodugasto.setclienteproveedor_descripcion(productoprodugastoBeanSwingJInternalFrame.getActualClienteProveedorForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {productoprodugasto.setid_factura((Long) value);productoprodugasto.setfactura_descripcion(productoprodugastoBeanSwingJInternalFrame.getActualFacturaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {productoprodugasto.setid_unidad((Long) value);productoprodugasto.setunidad_descripcion(productoprodugastoBeanSwingJInternalFrame.getActualUnidadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {productoprodugasto.setcanitdad((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {productoprodugasto.setcosto((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {productoprodugasto.setcosto_total((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {productoprodugasto.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public ProductoProduGastoModel(JInternalFrameBase jInternalFrameBase) {
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
		private ProductoProduGastoDetalleFormJInternalFrame productoprodugastoJInternalFrame=null;
		
		public ProductoProduGastoModel(ProductoProduGastoDetalleFormJInternalFrame productoprodugastoJInternalFrame) {
			this.productoprodugastoJInternalFrame=productoprodugastoJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.productoprodugastoJInternalFrame.getjButtonActualizarToolBarProductoProduGasto();
			
			if(component!=null && component.equals(this.productoprodugastoJInternalFrame.getjButtonActualizarToolBarProductoProduGasto())) {
				componentTab=this.productoprodugastoJInternalFrame.getjButtonEliminarToolBarProductoProduGasto();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productoprodugastoJInternalFrame.getjButtonEliminarToolBarProductoProduGasto())) {
				componentTab=this.productoprodugastoJInternalFrame.getjButtonCancelarToolBarProductoProduGasto();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productoprodugastoJInternalFrame.getjButtonCancelarToolBarProductoProduGasto())) {
				componentTab=this.productoprodugastoJInternalFrame.jComboBoxid_producto_defi_produProductoProduGasto;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jTextAreadescripcionProductoProduGasto)) {
				componentTab=this.productoprodugastoJInternalFrame.jComboBoxTiposAccionesFormularioProductoProduGasto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jComboBoxTiposAccionesFormularioProductoProduGasto)) {
				componentTab=this.productoprodugastoJInternalFrame.jButtonEliminarProductoProduGasto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jButtonEliminarProductoProduGasto)) {
				componentTab=this.productoprodugastoJInternalFrame.jButtonActualizarProductoProduGasto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jButtonActualizarProductoProduGasto)) {
				componentTab=this.productoprodugastoJInternalFrame.jButtonCancelarProductoProduGasto;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jComboBoxid_producto_defi_produProductoProduGasto)) {
			componentTab=this.productoprodugastoJInternalFrame.jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto)) {
			componentTab=this.productoprodugastoJInternalFrame.jComboBoxid_cuenta_contable_debitoProductoProduGasto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jComboBoxid_cuenta_contable_debitoProductoProduGasto)) {
			componentTab=this.productoprodugastoJInternalFrame.jComboBoxid_cuenta_contable_creditoProductoProduGasto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jComboBoxid_cuenta_contable_creditoProductoProduGasto)) {
			componentTab=this.productoprodugastoJInternalFrame.jComboBoxid_cliente_proveedorProductoProduGasto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jComboBoxid_cliente_proveedorProductoProduGasto)) {
			componentTab=this.productoprodugastoJInternalFrame.jComboBoxid_facturaProductoProduGasto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jComboBoxid_facturaProductoProduGasto)) {
			componentTab=this.productoprodugastoJInternalFrame.jComboBoxid_unidadProductoProduGasto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jComboBoxid_unidadProductoProduGasto)) {
			componentTab=this.productoprodugastoJInternalFrame.jTextFieldcanitdadProductoProduGasto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jTextFieldcanitdadProductoProduGasto)) {
			componentTab=this.productoprodugastoJInternalFrame.jTextFieldcostoProductoProduGasto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jTextFieldcostoProductoProduGasto)) {
			componentTab=this.productoprodugastoJInternalFrame.jTextFieldcosto_totalProductoProduGasto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jTextFieldcosto_totalProductoProduGasto)) {
			componentTab=this.productoprodugastoJInternalFrame.jTextAreadescripcionProductoProduGasto;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.productoprodugastoJInternalFrame.getjButtonActualizarToolBarProductoProduGasto();
			
			if(component!=null && component.equals(this.productoprodugastoJInternalFrame.getjButtonEliminarToolBarProductoProduGasto())) {
				componentTab=this.productoprodugastoJInternalFrame.getjButtonActualizarToolBarProductoProduGasto();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productoprodugastoJInternalFrame.getjButtonCancelarToolBarProductoProduGasto())) {
				componentTab=this.productoprodugastoJInternalFrame.getjButtonEliminarToolBarProductoProduGasto();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jComboBoxid_producto_defi_produProductoProduGasto)) {
				
				componentTab=this.productoprodugastoJInternalFrame.getjButtonCancelarToolBarProductoProduGasto();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jComboBoxTiposAccionesFormularioProductoProduGasto)) {
				componentTab=this.productoprodugastoJInternalFrame.jTextAreadescripcionProductoProduGasto;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jButtonEliminarProductoProduGasto)) {
				componentTab=this.productoprodugastoJInternalFrame.jComboBoxTiposAccionesFormularioProductoProduGasto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jButtonActualizarProductoProduGasto)) {
				componentTab=this.productoprodugastoJInternalFrame.jButtonEliminarProductoProduGasto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jButtonCancelarProductoProduGasto)) {
				componentTab=this.productoprodugastoJInternalFrame.jButtonActualizarProductoProduGasto;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto)) {
			componentTab=this.productoprodugastoJInternalFrame.jComboBoxid_producto_defi_produProductoProduGasto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jComboBoxid_cuenta_contable_debitoProductoProduGasto)) {
			componentTab=this.productoprodugastoJInternalFrame.jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jComboBoxid_cuenta_contable_creditoProductoProduGasto)) {
			componentTab=this.productoprodugastoJInternalFrame.jComboBoxid_cuenta_contable_debitoProductoProduGasto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jComboBoxid_cliente_proveedorProductoProduGasto)) {
			componentTab=this.productoprodugastoJInternalFrame.jComboBoxid_cuenta_contable_creditoProductoProduGasto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jComboBoxid_facturaProductoProduGasto)) {
			componentTab=this.productoprodugastoJInternalFrame.jComboBoxid_cliente_proveedorProductoProduGasto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jComboBoxid_unidadProductoProduGasto)) {
			componentTab=this.productoprodugastoJInternalFrame.jComboBoxid_facturaProductoProduGasto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jTextFieldcanitdadProductoProduGasto)) {
			componentTab=this.productoprodugastoJInternalFrame.jComboBoxid_unidadProductoProduGasto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jTextFieldcostoProductoProduGasto)) {
			componentTab=this.productoprodugastoJInternalFrame.jTextFieldcanitdadProductoProduGasto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jTextFieldcosto_totalProductoProduGasto)) {
			componentTab=this.productoprodugastoJInternalFrame.jTextFieldcostoProductoProduGasto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoprodugastoJInternalFrame.jTextAreadescripcionProductoProduGasto)) {
			componentTab=this.productoprodugastoJInternalFrame.jTextFieldcosto_totalProductoProduGasto;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.productoprodugastoJInternalFrame.getjButtonActualizarToolBarProductoProduGasto();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.productoprodugastoJInternalFrame.getjButtonActualizarToolBarProductoProduGasto();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.productoprodugastoJInternalFrame.getjButtonCancelarToolBarProductoProduGasto();
			
			
			return componentTab;		
		}
		
		public ProductoProduGastoDetalleFormJInternalFrame getproductoprodugastoJInternalFrame() {
			return this.productoprodugastoJInternalFrame;
		}
		
		public void setproductoprodugastoJInternalFrame(ProductoProduGastoDetalleFormJInternalFrame productoprodugastoJInternalFrame) {
			this.productoprodugastoJInternalFrame=productoprodugastoJInternalFrame;
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
