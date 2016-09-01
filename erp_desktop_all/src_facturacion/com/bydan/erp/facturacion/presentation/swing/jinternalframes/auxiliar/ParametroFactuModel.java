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

import com.bydan.erp.facturacion.util.ParametroFactuConstantesFunciones;
import com.bydan.erp.facturacion.util.ParametroFactuParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.ParametroFactuParameterGeneral;

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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.ParametroFactuBeanSwingJInternalFrame;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.ParametroFactuJInternalFrame;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.ParametroFactuDetalleFormJInternalFrame;

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

public class ParametroFactuModel extends FocusTraversalPolicy implements TableModel, Serializable {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,ParametroFactuConstantesFunciones.LABEL_ID
										,ParametroFactuConstantesFunciones.LABEL_IDEMPRESA
										,ParametroFactuConstantesFunciones.LABEL_IDSUCURSAL
										,ParametroFactuConstantesFunciones.LABEL_IDCUENTACONTABLEFACTU
										,ParametroFactuConstantesFunciones.LABEL_IDCUENTACONTABLEFINAN
										,ParametroFactuConstantesFunciones.LABEL_IDCUENTACONTABLEOTRO
										,ParametroFactuConstantesFunciones.LABEL_IDFORMATOPROFORMA
										,ParametroFactuConstantesFunciones.LABEL_IDFORMATOPEDIDO
										,ParametroFactuConstantesFunciones.LABEL_IDFORMATOFACTURA
										,ParametroFactuConstantesFunciones.LABEL_IDFORMATONOTACREDITO
										,ParametroFactuConstantesFunciones.LABEL_IDFORMATOINVENTARIO
										,ParametroFactuConstantesFunciones.LABEL_SECUENCIALPROFORMA
										,ParametroFactuConstantesFunciones.LABEL_SECUANCIALPEDIDO
										,ParametroFactuConstantesFunciones.LABEL_SECUENCIALFACTURA
										,ParametroFactuConstantesFunciones.LABEL_SECUENCIALNOTACREDITO
										,ParametroFactuConstantesFunciones.LABEL_ITEMPROFORMA
										,ParametroFactuConstantesFunciones.LABEL_ITEMPEDIDO
										,ParametroFactuConstantesFunciones.LABEL_ITEMFACTURA
										,ParametroFactuConstantesFunciones.LABEL_ITEMNOTACREDITO
										,ParametroFactuConstantesFunciones.LABEL_ITEMINVENTARIO
										,ParametroFactuConstantesFunciones.LABEL_CONDETALLEPROFORMA
										,ParametroFactuConstantesFunciones.LABEL_CONDETALLEPEDIDO
										,ParametroFactuConstantesFunciones.LABEL_CONDETALLEFACTURA
										,ParametroFactuConstantesFunciones.LABEL_CONDETALLENOTACREDITO
										};
	   
	    public List<ParametroFactu> parametrofactus;
	  	 
	    //NO SE UTILIZA
	    public ParametroFactuModel(List<ParametroFactu> parametrofactus,JInternalFrameBase jInternalFrameBase) {
	    	this.parametrofactus=parametrofactus;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public ParametroFactuModel(JInternalFrameBase jInternalFrameBase) {
	    	this.parametrofactus=new ArrayList<ParametroFactu>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.parametrofactus.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.parametrofactus.get(rowIndex).getIsSelected();
	            
				case 1: return this.parametrofactus.get(rowIndex).getId();
				case 2: return this.parametrofactus.get(rowIndex).getid_empresa();
				case 3: return this.parametrofactus.get(rowIndex).getid_sucursal();
				case 4: return this.parametrofactus.get(rowIndex).getid_cuenta_contable_factu();
				case 5: return this.parametrofactus.get(rowIndex).getid_cuenta_contable_finan();
				case 6: return this.parametrofactus.get(rowIndex).getid_cuenta_contable_otro();
				case 7: return this.parametrofactus.get(rowIndex).getid_formato_proforma();
				case 8: return this.parametrofactus.get(rowIndex).getid_formato_pedido();
				case 9: return this.parametrofactus.get(rowIndex).getid_formato_factura();
				case 10: return this.parametrofactus.get(rowIndex).getid_formato_nota_credito();
				case 11: return this.parametrofactus.get(rowIndex).getid_formato_inventario();
				case 12: return this.parametrofactus.get(rowIndex).getsecuencial_proforma();
				case 13: return this.parametrofactus.get(rowIndex).getsecuancial_pedido();
				case 14: return this.parametrofactus.get(rowIndex).getsecuencial_factura();
				case 15: return this.parametrofactus.get(rowIndex).getsecuencial_nota_credito();
				case 16: return this.parametrofactus.get(rowIndex).getitem_proforma();
				case 17: return this.parametrofactus.get(rowIndex).getitem_pedido();
				case 18: return this.parametrofactus.get(rowIndex).getitem_factura();
				case 19: return this.parametrofactus.get(rowIndex).getitem_nota_credito();
				case 20: return this.parametrofactus.get(rowIndex).getitem_inventario();
				case 21: return this.parametrofactus.get(rowIndex).getcon_detalle_proforma();
				case 22: return this.parametrofactus.get(rowIndex).getcon_detalle_pedido();
				case 23: return this.parametrofactus.get(rowIndex).getcon_detalle_factura();
				case 24: return this.parametrofactus.get(rowIndex).getcon_detalle_nota_credito();	            
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
				case 12: return String.class;
				case 13: return String.class;
				case 14: return String.class;
				case 15: return String.class;
				case 16: return Integer.class;
				case 17: return Integer.class;
				case 18: return Integer.class;
				case 19: return Integer.class;
				case 20: return Integer.class;
				case 21: return Boolean.class;
				case 22: return Boolean.class;
				case 23: return Boolean.class;
				case 24: return Boolean.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	ParametroFactu parametrofactu = this.parametrofactus.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			ParametroFactuBeanSwingJInternalFrame parametrofactuBeanSwingJInternalFrame=(ParametroFactuBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {parametrofactu.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {parametrofactu.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {parametrofactu.setid_empresa((Long) value);parametrofactu.setempresa_descripcion(parametrofactuBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {parametrofactu.setid_sucursal((Long) value);parametrofactu.setsucursal_descripcion(parametrofactuBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {parametrofactu.setid_cuenta_contable_factu((Long) value);parametrofactu.setcuentacontablefactu_descripcion(parametrofactuBeanSwingJInternalFrame.getActualCuentaContableFactuForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {parametrofactu.setid_cuenta_contable_finan((Long) value);parametrofactu.setcuentacontablefinan_descripcion(parametrofactuBeanSwingJInternalFrame.getActualCuentaContableFinanForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {parametrofactu.setid_cuenta_contable_otro((Long) value);parametrofactu.setcuentacontableotro_descripcion(parametrofactuBeanSwingJInternalFrame.getActualCuentaContableOtroForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {parametrofactu.setid_formato_proforma((Long) value);parametrofactu.setformatoproforma_descripcion(parametrofactuBeanSwingJInternalFrame.getActualFormatoProformaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {parametrofactu.setid_formato_pedido((Long) value);parametrofactu.setformatopedido_descripcion(parametrofactuBeanSwingJInternalFrame.getActualFormatoPedidoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {parametrofactu.setid_formato_factura((Long) value);parametrofactu.setformatofactura_descripcion(parametrofactuBeanSwingJInternalFrame.getActualFormatoFacturaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {parametrofactu.setid_formato_nota_credito((Long) value);parametrofactu.setformatonotacredito_descripcion(parametrofactuBeanSwingJInternalFrame.getActualFormatoNotaCreditoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {parametrofactu.setid_formato_inventario((Long) value);parametrofactu.setformatoinventario_descripcion(parametrofactuBeanSwingJInternalFrame.getActualFormatoInventarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {parametrofactu.setsecuencial_proforma((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {parametrofactu.setsecuancial_pedido((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {parametrofactu.setsecuencial_factura((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {parametrofactu.setsecuencial_nota_credito((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {parametrofactu.setitem_proforma((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {parametrofactu.setitem_pedido((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {parametrofactu.setitem_factura((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {parametrofactu.setitem_nota_credito((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {parametrofactu.setitem_inventario((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {parametrofactu.setcon_detalle_proforma((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {parametrofactu.setcon_detalle_pedido((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {parametrofactu.setcon_detalle_factura((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {parametrofactu.setcon_detalle_nota_credito((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private ParametroFactuDetalleFormJInternalFrame parametrofactuJInternalFrame=null;
		
		public ParametroFactuModel(ParametroFactuDetalleFormJInternalFrame parametrofactuJInternalFrame) {
			this.parametrofactuJInternalFrame=parametrofactuJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.parametrofactuJInternalFrame.getjButtonActualizarToolBarParametroFactu();
			
			if(component!=null && component.equals(this.parametrofactuJInternalFrame.getjButtonActualizarToolBarParametroFactu())) {
				componentTab=this.parametrofactuJInternalFrame.getjButtonEliminarToolBarParametroFactu();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactuJInternalFrame.getjButtonEliminarToolBarParametroFactu())) {
				componentTab=this.parametrofactuJInternalFrame.getjButtonCancelarToolBarParametroFactu();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactuJInternalFrame.getjButtonCancelarToolBarParametroFactu())) {
				componentTab=this.parametrofactuJInternalFrame.jComboBoxid_empresaParametroFactu;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.parametrofactuJInternalFrame.jCheckBoxcon_detalle_nota_creditoParametroFactu)) {
				componentTab=this.parametrofactuJInternalFrame.jComboBoxTiposAccionesFormularioParametroFactu;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactuJInternalFrame.jComboBoxTiposAccionesFormularioParametroFactu)) {
				componentTab=this.parametrofactuJInternalFrame.jButtonEliminarParametroFactu;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactuJInternalFrame.jButtonEliminarParametroFactu)) {
				componentTab=this.parametrofactuJInternalFrame.jButtonActualizarParametroFactu;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactuJInternalFrame.jButtonActualizarParametroFactu)) {
				componentTab=this.parametrofactuJInternalFrame.jButtonCancelarParametroFactu;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jComboBoxid_empresaParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jComboBoxid_sucursalParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jComboBoxid_sucursalParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jComboBoxid_cuenta_contable_factuParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jComboBoxid_cuenta_contable_factuParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jComboBoxid_cuenta_contable_finanParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jComboBoxid_cuenta_contable_finanParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jComboBoxid_cuenta_contable_otroParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jComboBoxid_cuenta_contable_otroParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jComboBoxid_formato_proformaParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jComboBoxid_formato_proformaParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jComboBoxid_formato_pedidoParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jComboBoxid_formato_pedidoParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jComboBoxid_formato_facturaParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jComboBoxid_formato_facturaParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jComboBoxid_formato_nota_creditoParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jComboBoxid_formato_nota_creditoParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jComboBoxid_formato_inventarioParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jComboBoxid_formato_inventarioParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jTextFieldsecuencial_proformaParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jTextFieldsecuencial_proformaParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jTextFieldsecuancial_pedidoParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jTextFieldsecuancial_pedidoParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jTextFieldsecuencial_facturaParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jTextFieldsecuencial_facturaParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jTextFieldsecuencial_nota_creditoParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jTextFieldsecuencial_nota_creditoParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jTextFielditem_proformaParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jTextFielditem_proformaParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jTextFielditem_pedidoParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jTextFielditem_pedidoParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jTextFielditem_facturaParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jTextFielditem_facturaParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jTextFielditem_nota_creditoParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jTextFielditem_nota_creditoParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jTextFielditem_inventarioParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jTextFielditem_inventarioParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jCheckBoxcon_detalle_proformaParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jCheckBoxcon_detalle_proformaParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jCheckBoxcon_detalle_pedidoParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jCheckBoxcon_detalle_pedidoParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jCheckBoxcon_detalle_facturaParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jCheckBoxcon_detalle_facturaParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jCheckBoxcon_detalle_nota_creditoParametroFactu;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.parametrofactuJInternalFrame.getjButtonActualizarToolBarParametroFactu();
			
			if(component!=null && component.equals(this.parametrofactuJInternalFrame.getjButtonEliminarToolBarParametroFactu())) {
				componentTab=this.parametrofactuJInternalFrame.getjButtonActualizarToolBarParametroFactu();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactuJInternalFrame.getjButtonCancelarToolBarParametroFactu())) {
				componentTab=this.parametrofactuJInternalFrame.getjButtonEliminarToolBarParametroFactu();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.parametrofactuJInternalFrame.jComboBoxid_empresaParametroFactu)) {
				
				componentTab=this.parametrofactuJInternalFrame.getjButtonCancelarToolBarParametroFactu();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.parametrofactuJInternalFrame.jComboBoxTiposAccionesFormularioParametroFactu)) {
				componentTab=this.parametrofactuJInternalFrame.jCheckBoxcon_detalle_nota_creditoParametroFactu;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.parametrofactuJInternalFrame.jButtonEliminarParametroFactu)) {
				componentTab=this.parametrofactuJInternalFrame.jComboBoxTiposAccionesFormularioParametroFactu;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactuJInternalFrame.jButtonActualizarParametroFactu)) {
				componentTab=this.parametrofactuJInternalFrame.jButtonEliminarParametroFactu;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactuJInternalFrame.jButtonCancelarParametroFactu)) {
				componentTab=this.parametrofactuJInternalFrame.jButtonActualizarParametroFactu;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jComboBoxid_sucursalParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jComboBoxid_empresaParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jComboBoxid_cuenta_contable_factuParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jComboBoxid_sucursalParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jComboBoxid_cuenta_contable_finanParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jComboBoxid_cuenta_contable_factuParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jComboBoxid_cuenta_contable_otroParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jComboBoxid_cuenta_contable_finanParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jComboBoxid_formato_proformaParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jComboBoxid_cuenta_contable_otroParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jComboBoxid_formato_pedidoParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jComboBoxid_formato_proformaParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jComboBoxid_formato_facturaParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jComboBoxid_formato_pedidoParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jComboBoxid_formato_nota_creditoParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jComboBoxid_formato_facturaParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jComboBoxid_formato_inventarioParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jComboBoxid_formato_nota_creditoParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jTextFieldsecuencial_proformaParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jComboBoxid_formato_inventarioParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jTextFieldsecuancial_pedidoParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jTextFieldsecuencial_proformaParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jTextFieldsecuencial_facturaParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jTextFieldsecuancial_pedidoParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jTextFieldsecuencial_nota_creditoParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jTextFieldsecuencial_facturaParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jTextFielditem_proformaParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jTextFieldsecuencial_nota_creditoParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jTextFielditem_pedidoParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jTextFielditem_proformaParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jTextFielditem_facturaParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jTextFielditem_pedidoParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jTextFielditem_nota_creditoParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jTextFielditem_facturaParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jTextFielditem_inventarioParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jTextFielditem_nota_creditoParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jCheckBoxcon_detalle_proformaParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jTextFielditem_inventarioParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jCheckBoxcon_detalle_pedidoParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jCheckBoxcon_detalle_proformaParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jCheckBoxcon_detalle_facturaParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jCheckBoxcon_detalle_pedidoParametroFactu;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuJInternalFrame.jCheckBoxcon_detalle_nota_creditoParametroFactu)) {
			componentTab=this.parametrofactuJInternalFrame.jCheckBoxcon_detalle_facturaParametroFactu;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.parametrofactuJInternalFrame.getjButtonActualizarToolBarParametroFactu();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.parametrofactuJInternalFrame.getjButtonActualizarToolBarParametroFactu();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.parametrofactuJInternalFrame.getjButtonCancelarToolBarParametroFactu();
			
			
			return componentTab;		
		}
		
		public ParametroFactuDetalleFormJInternalFrame getparametrofactuJInternalFrame() {
			return this.parametrofactuJInternalFrame;
		}
		
		public void setparametrofactuJInternalFrame(ParametroFactuDetalleFormJInternalFrame parametrofactuJInternalFrame) {
			this.parametrofactuJInternalFrame=parametrofactuJInternalFrame;
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
