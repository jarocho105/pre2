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

import com.bydan.erp.facturacion.util.ParametroFactuTransaccionConstantesFunciones;
import com.bydan.erp.facturacion.util.ParametroFactuTransaccionParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.ParametroFactuTransaccionParameterGeneral;

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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.ParametroFactuTransaccionBeanSwingJInternalFrame;
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
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.ParametroFactuTransaccionJInternalFrame;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.ParametroFactuTransaccionDetalleFormJInternalFrame;

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
import com.bydan.erp.tesoreria.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.tesoreria.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class ParametroFactuTransaccionModel extends FocusTraversalPolicy implements TableModel, Serializable {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,ParametroFactuTransaccionConstantesFunciones.LABEL_ID
										,ParametroFactuTransaccionConstantesFunciones.LABEL_IDEMPRESA
										,ParametroFactuTransaccionConstantesFunciones.LABEL_IDSUCURSAL
										,ParametroFactuTransaccionConstantesFunciones.LABEL_IDTRANSACCIONINVENFACTURA
										,ParametroFactuTransaccionConstantesFunciones.LABEL_IDTRANSACCIONINVENNOTACREDITO
										,ParametroFactuTransaccionConstantesFunciones.LABEL_IDTRANSACCIONINVENNOTAVENTA
										,ParametroFactuTransaccionConstantesFunciones.LABEL_IDTRANSACCIONCUENTACOFACTURA
										,ParametroFactuTransaccionConstantesFunciones.LABEL_IDTRANSACCIONCUENTACONOTACREDITO
										,ParametroFactuTransaccionConstantesFunciones.LABEL_IDTRANSACCIONCUENTACONOTAVENTA
										,ParametroFactuTransaccionConstantesFunciones.LABEL_IDTRANSACCIONCUENTACOTARJETA
										,ParametroFactuTransaccionConstantesFunciones.LABEL_IDTRANSACCIONCUENTAPAFACTURA
										,ParametroFactuTransaccionConstantesFunciones.LABEL_IDTRANSACCIONCUENTAPANOTACREDITO
										};
	   
	    public List<ParametroFactuTransaccion> parametrofactutransaccions;
	  	 
	    //NO SE UTILIZA
	    public ParametroFactuTransaccionModel(List<ParametroFactuTransaccion> parametrofactutransaccions,JInternalFrameBase jInternalFrameBase) {
	    	this.parametrofactutransaccions=parametrofactutransaccions;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public ParametroFactuTransaccionModel(JInternalFrameBase jInternalFrameBase) {
	    	this.parametrofactutransaccions=new ArrayList<ParametroFactuTransaccion>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.parametrofactutransaccions.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.parametrofactutransaccions.get(rowIndex).getIsSelected();
	            
				case 1: return this.parametrofactutransaccions.get(rowIndex).getId();
				case 2: return this.parametrofactutransaccions.get(rowIndex).getid_empresa();
				case 3: return this.parametrofactutransaccions.get(rowIndex).getid_sucursal();
				case 4: return this.parametrofactutransaccions.get(rowIndex).getid_transaccion_inven_factura();
				case 5: return this.parametrofactutransaccions.get(rowIndex).getid_transaccion_inven_nota_credito();
				case 6: return this.parametrofactutransaccions.get(rowIndex).getid_transaccion_inven_nota_venta();
				case 7: return this.parametrofactutransaccions.get(rowIndex).getid_transaccion_cuenta_co_factura();
				case 8: return this.parametrofactutransaccions.get(rowIndex).getid_transaccion_cuenta_co_nota_credito();
				case 9: return this.parametrofactutransaccions.get(rowIndex).getid_transaccion_cuenta_co_nota_venta();
				case 10: return this.parametrofactutransaccions.get(rowIndex).getid_transaccion_cuenta_co_tarjeta();
				case 11: return this.parametrofactutransaccions.get(rowIndex).getid_transaccion_cuenta_pa_factura();
				case 12: return this.parametrofactutransaccions.get(rowIndex).getid_transaccion_cuenta_pa_nota_credito();	            
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
	    	ParametroFactuTransaccion parametrofactutransaccion = this.parametrofactutransaccions.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			ParametroFactuTransaccionBeanSwingJInternalFrame parametrofactutransaccionBeanSwingJInternalFrame=(ParametroFactuTransaccionBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {parametrofactutransaccion.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {parametrofactutransaccion.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {parametrofactutransaccion.setid_empresa((Long) value);parametrofactutransaccion.setempresa_descripcion(parametrofactutransaccionBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {parametrofactutransaccion.setid_sucursal((Long) value);parametrofactutransaccion.setsucursal_descripcion(parametrofactutransaccionBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {parametrofactutransaccion.setid_transaccion_inven_factura((Long) value);parametrofactutransaccion.settransaccioninvenfactura_descripcion(parametrofactutransaccionBeanSwingJInternalFrame.getActualTransaccionInvenFacturaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {parametrofactutransaccion.setid_transaccion_inven_nota_credito((Long) value);parametrofactutransaccion.settransaccioninvennotacredito_descripcion(parametrofactutransaccionBeanSwingJInternalFrame.getActualTransaccionInvenNotaCreditoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {parametrofactutransaccion.setid_transaccion_inven_nota_venta((Long) value);parametrofactutransaccion.settransaccioninvennotaventa_descripcion(parametrofactutransaccionBeanSwingJInternalFrame.getActualTransaccionInvenNotaVentaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {parametrofactutransaccion.setid_transaccion_cuenta_co_factura((Long) value);parametrofactutransaccion.settransaccioncuentacofactura_descripcion(parametrofactutransaccionBeanSwingJInternalFrame.getActualTransaccionCuentaCoFacturaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {parametrofactutransaccion.setid_transaccion_cuenta_co_nota_credito((Long) value);parametrofactutransaccion.settransaccioncuentaconotacredito_descripcion(parametrofactutransaccionBeanSwingJInternalFrame.getActualTransaccionCuentaCoNotaCreditoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {parametrofactutransaccion.setid_transaccion_cuenta_co_nota_venta((Long) value);parametrofactutransaccion.settransaccioncuentaconotaventa_descripcion(parametrofactutransaccionBeanSwingJInternalFrame.getActualTransaccionCuentaCoNotaVentaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {parametrofactutransaccion.setid_transaccion_cuenta_co_tarjeta((Long) value);parametrofactutransaccion.settransaccioncuentacotarjeta_descripcion(parametrofactutransaccionBeanSwingJInternalFrame.getActualTransaccionCuentaCoTarjetaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {parametrofactutransaccion.setid_transaccion_cuenta_pa_factura((Long) value);parametrofactutransaccion.settransaccioncuentapafactura_descripcion(parametrofactutransaccionBeanSwingJInternalFrame.getActualTransaccionCuentaPaFacturaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {parametrofactutransaccion.setid_transaccion_cuenta_pa_nota_credito((Long) value);parametrofactutransaccion.settransaccioncuentapanotacredito_descripcion(parametrofactutransaccionBeanSwingJInternalFrame.getActualTransaccionCuentaPaNotaCreditoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private ParametroFactuTransaccionDetalleFormJInternalFrame parametrofactutransaccionJInternalFrame=null;
		
		public ParametroFactuTransaccionModel(ParametroFactuTransaccionDetalleFormJInternalFrame parametrofactutransaccionJInternalFrame) {
			this.parametrofactutransaccionJInternalFrame=parametrofactutransaccionJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.parametrofactutransaccionJInternalFrame.getjButtonActualizarToolBarParametroFactuTransaccion();
			
			if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.getjButtonActualizarToolBarParametroFactuTransaccion())) {
				componentTab=this.parametrofactutransaccionJInternalFrame.getjButtonEliminarToolBarParametroFactuTransaccion();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.getjButtonEliminarToolBarParametroFactuTransaccion())) {
				componentTab=this.parametrofactutransaccionJInternalFrame.getjButtonCancelarToolBarParametroFactuTransaccion();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.getjButtonCancelarToolBarParametroFactuTransaccion())) {
				componentTab=this.parametrofactutransaccionJInternalFrame.jComboBoxid_empresaParametroFactuTransaccion;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion)) {
				componentTab=this.parametrofactutransaccionJInternalFrame.jComboBoxTiposAccionesFormularioParametroFactuTransaccion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jComboBoxTiposAccionesFormularioParametroFactuTransaccion)) {
				componentTab=this.parametrofactutransaccionJInternalFrame.jButtonEliminarParametroFactuTransaccion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jButtonEliminarParametroFactuTransaccion)) {
				componentTab=this.parametrofactutransaccionJInternalFrame.jButtonActualizarParametroFactuTransaccion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jButtonActualizarParametroFactuTransaccion)) {
				componentTab=this.parametrofactutransaccionJInternalFrame.jButtonCancelarParametroFactuTransaccion;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jComboBoxid_empresaParametroFactuTransaccion)) {
			componentTab=this.parametrofactutransaccionJInternalFrame.jComboBoxid_sucursalParametroFactuTransaccion;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jComboBoxid_sucursalParametroFactuTransaccion)) {
			componentTab=this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_inven_facturaParametroFactuTransaccion;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_inven_facturaParametroFactuTransaccion)) {
			componentTab=this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_inven_nota_creditoParametroFactuTransaccion;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_inven_nota_creditoParametroFactuTransaccion)) {
			componentTab=this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_inven_nota_ventaParametroFactuTransaccion;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_inven_nota_ventaParametroFactuTransaccion)) {
			componentTab=this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_cuenta_co_facturaParametroFactuTransaccion;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_cuenta_co_facturaParametroFactuTransaccion)) {
			componentTab=this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion)) {
			componentTab=this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion)) {
			componentTab=this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion)) {
			componentTab=this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_cuenta_pa_facturaParametroFactuTransaccion;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_cuenta_pa_facturaParametroFactuTransaccion)) {
			componentTab=this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.parametrofactutransaccionJInternalFrame.getjButtonActualizarToolBarParametroFactuTransaccion();
			
			if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.getjButtonEliminarToolBarParametroFactuTransaccion())) {
				componentTab=this.parametrofactutransaccionJInternalFrame.getjButtonActualizarToolBarParametroFactuTransaccion();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.getjButtonCancelarToolBarParametroFactuTransaccion())) {
				componentTab=this.parametrofactutransaccionJInternalFrame.getjButtonEliminarToolBarParametroFactuTransaccion();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jComboBoxid_empresaParametroFactuTransaccion)) {
				
				componentTab=this.parametrofactutransaccionJInternalFrame.getjButtonCancelarToolBarParametroFactuTransaccion();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jComboBoxTiposAccionesFormularioParametroFactuTransaccion)) {
				componentTab=this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jButtonEliminarParametroFactuTransaccion)) {
				componentTab=this.parametrofactutransaccionJInternalFrame.jComboBoxTiposAccionesFormularioParametroFactuTransaccion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jButtonActualizarParametroFactuTransaccion)) {
				componentTab=this.parametrofactutransaccionJInternalFrame.jButtonEliminarParametroFactuTransaccion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jButtonCancelarParametroFactuTransaccion)) {
				componentTab=this.parametrofactutransaccionJInternalFrame.jButtonActualizarParametroFactuTransaccion;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jComboBoxid_sucursalParametroFactuTransaccion)) {
			componentTab=this.parametrofactutransaccionJInternalFrame.jComboBoxid_empresaParametroFactuTransaccion;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_inven_facturaParametroFactuTransaccion)) {
			componentTab=this.parametrofactutransaccionJInternalFrame.jComboBoxid_sucursalParametroFactuTransaccion;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_inven_nota_creditoParametroFactuTransaccion)) {
			componentTab=this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_inven_facturaParametroFactuTransaccion;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_inven_nota_ventaParametroFactuTransaccion)) {
			componentTab=this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_inven_nota_creditoParametroFactuTransaccion;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_cuenta_co_facturaParametroFactuTransaccion)) {
			componentTab=this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_inven_nota_ventaParametroFactuTransaccion;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion)) {
			componentTab=this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_cuenta_co_facturaParametroFactuTransaccion;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion)) {
			componentTab=this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion)) {
			componentTab=this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_cuenta_pa_facturaParametroFactuTransaccion)) {
			componentTab=this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion)) {
			componentTab=this.parametrofactutransaccionJInternalFrame.jComboBoxid_transaccion_cuenta_pa_facturaParametroFactuTransaccion;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.parametrofactutransaccionJInternalFrame.getjButtonActualizarToolBarParametroFactuTransaccion();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.parametrofactutransaccionJInternalFrame.getjButtonActualizarToolBarParametroFactuTransaccion();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.parametrofactutransaccionJInternalFrame.getjButtonCancelarToolBarParametroFactuTransaccion();
			
			
			return componentTab;		
		}
		
		public ParametroFactuTransaccionDetalleFormJInternalFrame getparametrofactutransaccionJInternalFrame() {
			return this.parametrofactutransaccionJInternalFrame;
		}
		
		public void setparametrofactutransaccionJInternalFrame(ParametroFactuTransaccionDetalleFormJInternalFrame parametrofactutransaccionJInternalFrame) {
			this.parametrofactutransaccionJInternalFrame=parametrofactutransaccionJInternalFrame;
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
