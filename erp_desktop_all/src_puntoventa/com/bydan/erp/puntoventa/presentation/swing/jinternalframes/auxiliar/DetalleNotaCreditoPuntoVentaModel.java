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

import com.bydan.erp.puntoventa.util.DetalleNotaCreditoPuntoVentaConstantesFunciones;
import com.bydan.erp.puntoventa.util.DetalleNotaCreditoPuntoVentaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.DetalleNotaCreditoPuntoVentaParameterGeneral;

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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.DetalleNotaCreditoPuntoVentaBeanSwingJInternalFrame;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.DetalleNotaCreditoPuntoVentaJInternalFrame;

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.DetalleNotaCreditoPuntoVentaDetalleFormJInternalFrame;

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

public class DetalleNotaCreditoPuntoVentaModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_ID
										,DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_IDNOTACREDITOPUNTOVENTA
										,DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA
										,DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL
										,DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_IDBODEGA
										,DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO
										,DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_IDUNIDAD
										,DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_SERIE
										,DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_CANTIDAD
										,DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_PRECIO
										,DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_DESCUENTO
										,DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR
										,DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_IVA
										,DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_IVAVALOR
										,DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_ICE
										,DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_ICEVALOR
										,DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_SUBTOTAL
										,DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_TOTAL
										,DetalleNotaCreditoPuntoVentaConstantesFunciones.LABEL_DESCRIPCION
										};
	   
	    public List<DetalleNotaCreditoPuntoVenta> detallenotacreditopuntoventas;
	  	 
	    //NO SE UTILIZA
	    public DetalleNotaCreditoPuntoVentaModel(List<DetalleNotaCreditoPuntoVenta> detallenotacreditopuntoventas,JInternalFrameBase jInternalFrameBase) {
	    	this.detallenotacreditopuntoventas=detallenotacreditopuntoventas;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public DetalleNotaCreditoPuntoVentaModel(JInternalFrameBase jInternalFrameBase) {
	    	this.detallenotacreditopuntoventas=new ArrayList<DetalleNotaCreditoPuntoVenta>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.detallenotacreditopuntoventas.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.detallenotacreditopuntoventas.get(rowIndex).getIsSelected();
	            
				case 1: return this.detallenotacreditopuntoventas.get(rowIndex).getId();
				case 2: return this.detallenotacreditopuntoventas.get(rowIndex).getid_factura_punto_venta();
				case 3: return this.detallenotacreditopuntoventas.get(rowIndex).getid_empresa();
				case 4: return this.detallenotacreditopuntoventas.get(rowIndex).getid_sucursal();
				case 5: return this.detallenotacreditopuntoventas.get(rowIndex).getid_bodega();
				case 6: return this.detallenotacreditopuntoventas.get(rowIndex).getid_producto();
				case 7: return this.detallenotacreditopuntoventas.get(rowIndex).getid_unidad();
				case 8: return this.detallenotacreditopuntoventas.get(rowIndex).getserie();
				case 9: return this.detallenotacreditopuntoventas.get(rowIndex).getcantidad();
				case 10: return this.detallenotacreditopuntoventas.get(rowIndex).getprecio();
				case 11: return this.detallenotacreditopuntoventas.get(rowIndex).getdescuento();
				case 12: return this.detallenotacreditopuntoventas.get(rowIndex).getdescuento_valor();
				case 13: return this.detallenotacreditopuntoventas.get(rowIndex).getiva();
				case 14: return this.detallenotacreditopuntoventas.get(rowIndex).getiva_valor();
				case 15: return this.detallenotacreditopuntoventas.get(rowIndex).getice();
				case 16: return this.detallenotacreditopuntoventas.get(rowIndex).getice_valor();
				case 17: return this.detallenotacreditopuntoventas.get(rowIndex).getsub_total();
				case 18: return this.detallenotacreditopuntoventas.get(rowIndex).gettotal();
				case 19: return this.detallenotacreditopuntoventas.get(rowIndex).getdescripcion();	            
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
				case 19: return String.class;	            
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
	    	DetalleNotaCreditoPuntoVenta detallenotacreditopuntoventa = this.detallenotacreditopuntoventas.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			DetalleNotaCreditoPuntoVentaBeanSwingJInternalFrame detallenotacreditopuntoventaBeanSwingJInternalFrame=(DetalleNotaCreditoPuntoVentaBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {detallenotacreditopuntoventa.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {detallenotacreditopuntoventa.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {detallenotacreditopuntoventa.setid_factura_punto_venta((Long) value);detallenotacreditopuntoventa.setnotacreditopuntoventa_descripcion(detallenotacreditopuntoventaBeanSwingJInternalFrame.getActualNotaCreditoPuntoVentaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {detallenotacreditopuntoventa.setid_empresa((Long) value);detallenotacreditopuntoventa.setempresa_descripcion(detallenotacreditopuntoventaBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {detallenotacreditopuntoventa.setid_sucursal((Long) value);detallenotacreditopuntoventa.setsucursal_descripcion(detallenotacreditopuntoventaBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {detallenotacreditopuntoventa.setid_bodega((Long) value);detallenotacreditopuntoventa.setbodega_descripcion(detallenotacreditopuntoventaBeanSwingJInternalFrame.getActualBodegaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {detallenotacreditopuntoventa.setid_producto((Long) value);detallenotacreditopuntoventa.setproducto_descripcion(detallenotacreditopuntoventaBeanSwingJInternalFrame.getActualProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {detallenotacreditopuntoventa.setid_unidad((Long) value);detallenotacreditopuntoventa.setunidad_descripcion(detallenotacreditopuntoventaBeanSwingJInternalFrame.getActualUnidadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {detallenotacreditopuntoventa.setserie((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {detallenotacreditopuntoventa.setcantidad((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {detallenotacreditopuntoventa.setprecio((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {detallenotacreditopuntoventa.setdescuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {detallenotacreditopuntoventa.setdescuento_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {detallenotacreditopuntoventa.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {detallenotacreditopuntoventa.setiva_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {detallenotacreditopuntoventa.setice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {detallenotacreditopuntoventa.setice_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {detallenotacreditopuntoventa.setsub_total((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {detallenotacreditopuntoventa.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {detallenotacreditopuntoventa.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public DetalleNotaCreditoPuntoVentaModel(JInternalFrameBase jInternalFrameBase) {
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
		private DetalleNotaCreditoPuntoVentaDetalleFormJInternalFrame detallenotacreditopuntoventaJInternalFrame=null;
		
		public DetalleNotaCreditoPuntoVentaModel(DetalleNotaCreditoPuntoVentaDetalleFormJInternalFrame detallenotacreditopuntoventaJInternalFrame) {
			this.detallenotacreditopuntoventaJInternalFrame=detallenotacreditopuntoventaJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.getjButtonActualizarToolBarDetalleNotaCreditoPuntoVenta();
			
			if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.getjButtonActualizarToolBarDetalleNotaCreditoPuntoVenta())) {
				componentTab=this.detallenotacreditopuntoventaJInternalFrame.getjButtonEliminarToolBarDetalleNotaCreditoPuntoVenta();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.getjButtonEliminarToolBarDetalleNotaCreditoPuntoVenta())) {
				componentTab=this.detallenotacreditopuntoventaJInternalFrame.getjButtonCancelarToolBarDetalleNotaCreditoPuntoVenta();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.getjButtonCancelarToolBarDetalleNotaCreditoPuntoVenta())) {
				componentTab=this.detallenotacreditopuntoventaJInternalFrame.jComboBoxid_factura_punto_ventaDetalleNotaCreditoPuntoVenta;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jTextAreadescripcionDetalleNotaCreditoPuntoVenta)) {
				componentTab=this.detallenotacreditopuntoventaJInternalFrame.jComboBoxTiposAccionesFormularioDetalleNotaCreditoPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jComboBoxTiposAccionesFormularioDetalleNotaCreditoPuntoVenta)) {
				componentTab=this.detallenotacreditopuntoventaJInternalFrame.jButtonEliminarDetalleNotaCreditoPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jButtonEliminarDetalleNotaCreditoPuntoVenta)) {
				componentTab=this.detallenotacreditopuntoventaJInternalFrame.jButtonActualizarDetalleNotaCreditoPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jButtonActualizarDetalleNotaCreditoPuntoVenta)) {
				componentTab=this.detallenotacreditopuntoventaJInternalFrame.jButtonCancelarDetalleNotaCreditoPuntoVenta;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jComboBoxid_factura_punto_ventaDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jComboBoxid_empresaDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jComboBoxid_empresaDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jComboBoxid_sucursalDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jComboBoxid_sucursalDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jComboBoxid_bodegaDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jComboBoxid_bodegaDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jComboBoxid_productoDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jComboBoxid_productoDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jComboBoxid_unidadDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jComboBoxid_unidadDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jTextFieldserieDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jTextFieldserieDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jTextFieldcantidadDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jTextFieldcantidadDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jTextFieldprecioDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jTextFieldprecioDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jTextFielddescuentoDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jTextFielddescuentoDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jTextFielddescuento_valorDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jTextFielddescuento_valorDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jTextFieldivaDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jTextFieldivaDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jTextFieldiva_valorDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jTextFieldiva_valorDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jTextFieldiceDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jTextFieldiceDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jTextFieldice_valorDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jTextFieldice_valorDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jTextFieldsub_totalDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jTextFieldsub_totalDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jTextFieldtotalDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jTextFieldtotalDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jTextAreadescripcionDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.getjButtonActualizarToolBarDetalleNotaCreditoPuntoVenta();
			
			if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.getjButtonEliminarToolBarDetalleNotaCreditoPuntoVenta())) {
				componentTab=this.detallenotacreditopuntoventaJInternalFrame.getjButtonActualizarToolBarDetalleNotaCreditoPuntoVenta();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.getjButtonCancelarToolBarDetalleNotaCreditoPuntoVenta())) {
				componentTab=this.detallenotacreditopuntoventaJInternalFrame.getjButtonEliminarToolBarDetalleNotaCreditoPuntoVenta();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jComboBoxid_factura_punto_ventaDetalleNotaCreditoPuntoVenta)) {
				
				componentTab=this.detallenotacreditopuntoventaJInternalFrame.getjButtonCancelarToolBarDetalleNotaCreditoPuntoVenta();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jComboBoxTiposAccionesFormularioDetalleNotaCreditoPuntoVenta)) {
				componentTab=this.detallenotacreditopuntoventaJInternalFrame.jTextAreadescripcionDetalleNotaCreditoPuntoVenta;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jButtonEliminarDetalleNotaCreditoPuntoVenta)) {
				componentTab=this.detallenotacreditopuntoventaJInternalFrame.jComboBoxTiposAccionesFormularioDetalleNotaCreditoPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jButtonActualizarDetalleNotaCreditoPuntoVenta)) {
				componentTab=this.detallenotacreditopuntoventaJInternalFrame.jButtonEliminarDetalleNotaCreditoPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jButtonCancelarDetalleNotaCreditoPuntoVenta)) {
				componentTab=this.detallenotacreditopuntoventaJInternalFrame.jButtonActualizarDetalleNotaCreditoPuntoVenta;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jComboBoxid_empresaDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jComboBoxid_factura_punto_ventaDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jComboBoxid_sucursalDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jComboBoxid_empresaDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jComboBoxid_bodegaDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jComboBoxid_sucursalDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jComboBoxid_productoDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jComboBoxid_bodegaDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jComboBoxid_unidadDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jComboBoxid_productoDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jTextFieldserieDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jComboBoxid_unidadDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jTextFieldcantidadDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jTextFieldserieDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jTextFieldprecioDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jTextFieldcantidadDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jTextFielddescuentoDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jTextFieldprecioDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jTextFielddescuento_valorDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jTextFielddescuentoDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jTextFieldivaDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jTextFielddescuento_valorDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jTextFieldiva_valorDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jTextFieldivaDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jTextFieldiceDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jTextFieldiva_valorDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jTextFieldice_valorDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jTextFieldiceDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jTextFieldsub_totalDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jTextFieldice_valorDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jTextFieldtotalDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jTextFieldsub_totalDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallenotacreditopuntoventaJInternalFrame.jTextAreadescripcionDetalleNotaCreditoPuntoVenta)) {
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.jTextFieldtotalDetalleNotaCreditoPuntoVenta;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.getjButtonActualizarToolBarDetalleNotaCreditoPuntoVenta();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.getjButtonActualizarToolBarDetalleNotaCreditoPuntoVenta();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.detallenotacreditopuntoventaJInternalFrame.getjButtonCancelarToolBarDetalleNotaCreditoPuntoVenta();
			
			
			return componentTab;		
		}
		
		public DetalleNotaCreditoPuntoVentaDetalleFormJInternalFrame getdetallenotacreditopuntoventaJInternalFrame() {
			return this.detallenotacreditopuntoventaJInternalFrame;
		}
		
		public void setdetallenotacreditopuntoventaJInternalFrame(DetalleNotaCreditoPuntoVentaDetalleFormJInternalFrame detallenotacreditopuntoventaJInternalFrame) {
			this.detallenotacreditopuntoventaJInternalFrame=detallenotacreditopuntoventaJInternalFrame;
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
