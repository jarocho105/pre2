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

import com.bydan.erp.inventario.util.CuentasContablesLineaProductoConstantesFunciones;
import com.bydan.erp.inventario.util.CuentasContablesLineaProductoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.CuentasContablesLineaProductoParameterGeneral;

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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.CuentasContablesLineaProductoBeanSwingJInternalFrame;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.CuentasContablesLineaProductoJInternalFrame;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.CuentasContablesLineaProductoDetalleFormJInternalFrame;

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


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class CuentasContablesLineaProductoModel extends FocusTraversalPolicy implements TableModel, Serializable {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,CuentasContablesLineaProductoConstantesFunciones.LABEL_ID
										,CuentasContablesLineaProductoConstantesFunciones.LABEL_IDEMPRESA
										,CuentasContablesLineaProductoConstantesFunciones.LABEL_IDBODEGA
										,CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCENTROCOSTO
										,CuentasContablesLineaProductoConstantesFunciones.LABEL_IDLINEA
										,CuentasContablesLineaProductoConstantesFunciones.LABEL_IDLINEAGRUPO
										,CuentasContablesLineaProductoConstantesFunciones.LABEL_IDLINEACATEGORIA
										,CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEINVENTARIO
										,CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOVENTA
										,CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA
										,CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO
										,CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEPRODUCCION
										,CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION
										,CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEIVADEBITO
										,CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEIVACREDITO
										,CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEBONIFICA
										,CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOBONIFICA
										};
	   
	    public List<CuentasContablesLineaProducto> cuentascontableslineaproductos;
	  	 
	    //NO SE UTILIZA
	    public CuentasContablesLineaProductoModel(List<CuentasContablesLineaProducto> cuentascontableslineaproductos,JInternalFrameBase jInternalFrameBase) {
	    	this.cuentascontableslineaproductos=cuentascontableslineaproductos;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public CuentasContablesLineaProductoModel(JInternalFrameBase jInternalFrameBase) {
	    	this.cuentascontableslineaproductos=new ArrayList<CuentasContablesLineaProducto>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.cuentascontableslineaproductos.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.cuentascontableslineaproductos.get(rowIndex).getIsSelected();
	            
				case 1: return this.cuentascontableslineaproductos.get(rowIndex).getId();
				case 2: return this.cuentascontableslineaproductos.get(rowIndex).getid_empresa();
				case 3: return this.cuentascontableslineaproductos.get(rowIndex).getid_bodega();
				case 4: return this.cuentascontableslineaproductos.get(rowIndex).getid_centro_costo();
				case 5: return this.cuentascontableslineaproductos.get(rowIndex).getid_linea();
				case 6: return this.cuentascontableslineaproductos.get(rowIndex).getid_linea_grupo();
				case 7: return this.cuentascontableslineaproductos.get(rowIndex).getid_linea_categoria();
				case 8: return this.cuentascontableslineaproductos.get(rowIndex).getid_cuenta_contable_inventario();
				case 9: return this.cuentascontableslineaproductos.get(rowIndex).getid_cuenta_contable_costo_venta();
				case 10: return this.cuentascontableslineaproductos.get(rowIndex).getid_cuenta_contable_venta();
				case 11: return this.cuentascontableslineaproductos.get(rowIndex).getid_cuenta_contable_descuento();
				case 12: return this.cuentascontableslineaproductos.get(rowIndex).getid_cuenta_contable_produccion();
				case 13: return this.cuentascontableslineaproductos.get(rowIndex).getid_cuenta_contable_devolucion();
				case 14: return this.cuentascontableslineaproductos.get(rowIndex).getid_cuenta_contable_iva_debito();
				case 15: return this.cuentascontableslineaproductos.get(rowIndex).getid_cuenta_contable_iva_credito();
				case 16: return this.cuentascontableslineaproductos.get(rowIndex).getid_cuenta_contable_bonifica();
				case 17: return this.cuentascontableslineaproductos.get(rowIndex).getid_cuenta_contable_costo_bonifica();	            
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
				case 13: return Long.class;
				case 14: return Long.class;
				case 15: return Long.class;
				case 16: return Long.class;
				case 17: return Long.class;	            
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
	    	CuentasContablesLineaProducto cuentascontableslineaproducto = this.cuentascontableslineaproductos.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			CuentasContablesLineaProductoBeanSwingJInternalFrame cuentascontableslineaproductoBeanSwingJInternalFrame=(CuentasContablesLineaProductoBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {cuentascontableslineaproducto.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {cuentascontableslineaproducto.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {cuentascontableslineaproducto.setid_empresa((Long) value);cuentascontableslineaproducto.setempresa_descripcion(cuentascontableslineaproductoBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {cuentascontableslineaproducto.setid_bodega((Long) value);cuentascontableslineaproducto.setbodega_descripcion(cuentascontableslineaproductoBeanSwingJInternalFrame.getActualBodegaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {cuentascontableslineaproducto.setid_centro_costo((Long) value);cuentascontableslineaproducto.setcentrocosto_descripcion(cuentascontableslineaproductoBeanSwingJInternalFrame.getActualCentroCostoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {cuentascontableslineaproducto.setid_linea((Long) value);cuentascontableslineaproducto.setlinea_descripcion(cuentascontableslineaproductoBeanSwingJInternalFrame.getActualLineaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {cuentascontableslineaproducto.setid_linea_grupo((Long) value);cuentascontableslineaproducto.setlineagrupo_descripcion(cuentascontableslineaproductoBeanSwingJInternalFrame.getActualLineaGrupoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {cuentascontableslineaproducto.setid_linea_categoria((Long) value);cuentascontableslineaproducto.setlineacategoria_descripcion(cuentascontableslineaproductoBeanSwingJInternalFrame.getActualLineaCategoriaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {cuentascontableslineaproducto.setid_cuenta_contable_inventario((Long) value);cuentascontableslineaproducto.setcuentacontableinventario_descripcion(cuentascontableslineaproductoBeanSwingJInternalFrame.getActualCuentaContableInventarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {cuentascontableslineaproducto.setid_cuenta_contable_costo_venta((Long) value);cuentascontableslineaproducto.setcuentacontablecostoventa_descripcion(cuentascontableslineaproductoBeanSwingJInternalFrame.getActualCuentaContableCostoVentaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {cuentascontableslineaproducto.setid_cuenta_contable_venta((Long) value);cuentascontableslineaproducto.setcuentacontableventa_descripcion(cuentascontableslineaproductoBeanSwingJInternalFrame.getActualCuentaContableVentaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {cuentascontableslineaproducto.setid_cuenta_contable_descuento((Long) value);cuentascontableslineaproducto.setcuentacontabledescuento_descripcion(cuentascontableslineaproductoBeanSwingJInternalFrame.getActualCuentaContableDescuentoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {cuentascontableslineaproducto.setid_cuenta_contable_produccion((Long) value);cuentascontableslineaproducto.setcuentacontableproduccion_descripcion(cuentascontableslineaproductoBeanSwingJInternalFrame.getActualCuentaContableProduccionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {cuentascontableslineaproducto.setid_cuenta_contable_devolucion((Long) value);cuentascontableslineaproducto.setcuentacontabledevolucion_descripcion(cuentascontableslineaproductoBeanSwingJInternalFrame.getActualCuentaContableDevolucionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {cuentascontableslineaproducto.setid_cuenta_contable_iva_debito((Long) value);cuentascontableslineaproducto.setcuentacontableivadebito_descripcion(cuentascontableslineaproductoBeanSwingJInternalFrame.getActualCuentaContableIvaDebitoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {cuentascontableslineaproducto.setid_cuenta_contable_iva_credito((Long) value);cuentascontableslineaproducto.setcuentacontableivacredito_descripcion(cuentascontableslineaproductoBeanSwingJInternalFrame.getActualCuentaContableIvaCreditoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {cuentascontableslineaproducto.setid_cuenta_contable_bonifica((Long) value);cuentascontableslineaproducto.setcuentacontablebonifica_descripcion(cuentascontableslineaproductoBeanSwingJInternalFrame.getActualCuentaContableBonificaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {cuentascontableslineaproducto.setid_cuenta_contable_costo_bonifica((Long) value);cuentascontableslineaproducto.setcuentacontablecostobonifica_descripcion(cuentascontableslineaproductoBeanSwingJInternalFrame.getActualCuentaContableCostoBonificaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private CuentasContablesLineaProductoDetalleFormJInternalFrame cuentascontableslineaproductoJInternalFrame=null;
		
		public CuentasContablesLineaProductoModel(CuentasContablesLineaProductoDetalleFormJInternalFrame cuentascontableslineaproductoJInternalFrame) {
			this.cuentascontableslineaproductoJInternalFrame=cuentascontableslineaproductoJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.cuentascontableslineaproductoJInternalFrame.getjButtonActualizarToolBarCuentasContablesLineaProducto();
			
			if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.getjButtonActualizarToolBarCuentasContablesLineaProducto())) {
				componentTab=this.cuentascontableslineaproductoJInternalFrame.getjButtonEliminarToolBarCuentasContablesLineaProducto();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.getjButtonEliminarToolBarCuentasContablesLineaProducto())) {
				componentTab=this.cuentascontableslineaproductoJInternalFrame.getjButtonCancelarToolBarCuentasContablesLineaProducto();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.getjButtonCancelarToolBarCuentasContablesLineaProducto())) {
				componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_empresaCuentasContablesLineaProducto;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto)) {
				componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxTiposAccionesFormularioCuentasContablesLineaProducto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxTiposAccionesFormularioCuentasContablesLineaProducto)) {
				componentTab=this.cuentascontableslineaproductoJInternalFrame.jButtonEliminarCuentasContablesLineaProducto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jButtonEliminarCuentasContablesLineaProducto)) {
				componentTab=this.cuentascontableslineaproductoJInternalFrame.jButtonActualizarCuentasContablesLineaProducto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jButtonActualizarCuentasContablesLineaProducto)) {
				componentTab=this.cuentascontableslineaproductoJInternalFrame.jButtonCancelarCuentasContablesLineaProducto;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_empresaCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_bodegaCuentasContablesLineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_bodegaCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_centro_costoCuentasContablesLineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_centro_costoCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_lineaCuentasContablesLineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_lineaCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_linea_grupoCuentasContablesLineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_linea_grupoCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_linea_categoriaCuentasContablesLineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_linea_categoriaCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_inventarioCuentasContablesLineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_inventarioCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_costo_ventaCuentasContablesLineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_costo_ventaCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_ventaCuentasContablesLineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_ventaCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_descuentoCuentasContablesLineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_descuentoCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_produccionCuentasContablesLineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_produccionCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_devolucionCuentasContablesLineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_devolucionCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_iva_debitoCuentasContablesLineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_iva_debitoCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_iva_creditoCuentasContablesLineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_iva_creditoCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_bonificaCuentasContablesLineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_bonificaCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.cuentascontableslineaproductoJInternalFrame.getjButtonActualizarToolBarCuentasContablesLineaProducto();
			
			if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.getjButtonEliminarToolBarCuentasContablesLineaProducto())) {
				componentTab=this.cuentascontableslineaproductoJInternalFrame.getjButtonActualizarToolBarCuentasContablesLineaProducto();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.getjButtonCancelarToolBarCuentasContablesLineaProducto())) {
				componentTab=this.cuentascontableslineaproductoJInternalFrame.getjButtonEliminarToolBarCuentasContablesLineaProducto();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_empresaCuentasContablesLineaProducto)) {
				
				componentTab=this.cuentascontableslineaproductoJInternalFrame.getjButtonCancelarToolBarCuentasContablesLineaProducto();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxTiposAccionesFormularioCuentasContablesLineaProducto)) {
				componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jButtonEliminarCuentasContablesLineaProducto)) {
				componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxTiposAccionesFormularioCuentasContablesLineaProducto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jButtonActualizarCuentasContablesLineaProducto)) {
				componentTab=this.cuentascontableslineaproductoJInternalFrame.jButtonEliminarCuentasContablesLineaProducto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jButtonCancelarCuentasContablesLineaProducto)) {
				componentTab=this.cuentascontableslineaproductoJInternalFrame.jButtonActualizarCuentasContablesLineaProducto;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_bodegaCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_empresaCuentasContablesLineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_centro_costoCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_bodegaCuentasContablesLineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_lineaCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_centro_costoCuentasContablesLineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_linea_grupoCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_lineaCuentasContablesLineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_linea_categoriaCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_linea_grupoCuentasContablesLineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_inventarioCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_linea_categoriaCuentasContablesLineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_costo_ventaCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_inventarioCuentasContablesLineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_ventaCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_costo_ventaCuentasContablesLineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_descuentoCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_ventaCuentasContablesLineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_produccionCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_descuentoCuentasContablesLineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_devolucionCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_produccionCuentasContablesLineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_iva_debitoCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_devolucionCuentasContablesLineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_iva_creditoCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_iva_debitoCuentasContablesLineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_bonificaCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_iva_creditoCuentasContablesLineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto)) {
			componentTab=this.cuentascontableslineaproductoJInternalFrame.jComboBoxid_cuenta_contable_bonificaCuentasContablesLineaProducto;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.cuentascontableslineaproductoJInternalFrame.getjButtonActualizarToolBarCuentasContablesLineaProducto();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.cuentascontableslineaproductoJInternalFrame.getjButtonActualizarToolBarCuentasContablesLineaProducto();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.cuentascontableslineaproductoJInternalFrame.getjButtonCancelarToolBarCuentasContablesLineaProducto();
			
			
			return componentTab;		
		}
		
		public CuentasContablesLineaProductoDetalleFormJInternalFrame getcuentascontableslineaproductoJInternalFrame() {
			return this.cuentascontableslineaproductoJInternalFrame;
		}
		
		public void setcuentascontableslineaproductoJInternalFrame(CuentasContablesLineaProductoDetalleFormJInternalFrame cuentascontableslineaproductoJInternalFrame) {
			this.cuentascontableslineaproductoJInternalFrame=cuentascontableslineaproductoJInternalFrame;
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
