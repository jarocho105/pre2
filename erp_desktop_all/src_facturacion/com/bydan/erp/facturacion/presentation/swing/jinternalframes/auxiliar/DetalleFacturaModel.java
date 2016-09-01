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

import com.bydan.erp.facturacion.util.DetalleFacturaConstantesFunciones;
import com.bydan.erp.facturacion.util.DetalleFacturaParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.DetalleFacturaParameterGeneral;

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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.DetalleFacturaBeanSwingJInternalFrame;
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
import com.bydan.erp.inventario.business.logic.*;

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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.DetalleFacturaJInternalFrame;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.DetalleFacturaDetalleFormJInternalFrame;

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

public class DetalleFacturaModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,DetalleFacturaConstantesFunciones.LABEL_ID
										,DetalleFacturaConstantesFunciones.LABEL_IDEMPRESA
										,DetalleFacturaConstantesFunciones.LABEL_IDSUCURSAL
										,DetalleFacturaConstantesFunciones.LABEL_IDEJERCICIO
										,DetalleFacturaConstantesFunciones.LABEL_IDPERIODO
										,DetalleFacturaConstantesFunciones.LABEL_IDANIO
										,DetalleFacturaConstantesFunciones.LABEL_IDMES
										,DetalleFacturaConstantesFunciones.LABEL_IDFACTURA
										,DetalleFacturaConstantesFunciones.LABEL_IDBODEGA
										,DetalleFacturaConstantesFunciones.LABEL_IDPRODUCTO
										,DetalleFacturaConstantesFunciones.LABEL_IDUNIDAD
										,DetalleFacturaConstantesFunciones.LABEL_CODIGOLOTE
										,DetalleFacturaConstantesFunciones.LABEL_IDCENTROCOSTO
										,DetalleFacturaConstantesFunciones.LABEL_FECHA
										,DetalleFacturaConstantesFunciones.LABEL_DESCRIPCION
										,DetalleFacturaConstantesFunciones.LABEL_CANTIDAD
										,DetalleFacturaConstantesFunciones.LABEL_PRECIO
										,DetalleFacturaConstantesFunciones.LABEL_IVA
										,DetalleFacturaConstantesFunciones.LABEL_IVAVALOR
										,DetalleFacturaConstantesFunciones.LABEL_ICE
										,DetalleFacturaConstantesFunciones.LABEL_ICEVALOR
										,DetalleFacturaConstantesFunciones.LABEL_DESCUENTO
										,DetalleFacturaConstantesFunciones.LABEL_DESCUENTOVALOR
										,DetalleFacturaConstantesFunciones.LABEL_DESCUENTO2
										,DetalleFacturaConstantesFunciones.LABEL_SUBTOTAL
										,DetalleFacturaConstantesFunciones.LABEL_TOTAL
										};
	   
	    public List<DetalleFactura> detallefacturas;
	  	 
	    //NO SE UTILIZA
	    public DetalleFacturaModel(List<DetalleFactura> detallefacturas,JInternalFrameBase jInternalFrameBase) {
	    	this.detallefacturas=detallefacturas;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public DetalleFacturaModel(JInternalFrameBase jInternalFrameBase) {
	    	this.detallefacturas=new ArrayList<DetalleFactura>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.detallefacturas.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.detallefacturas.get(rowIndex).getIsSelected();
	            
				case 1: return this.detallefacturas.get(rowIndex).getId();
				case 2: return this.detallefacturas.get(rowIndex).getid_empresa();
				case 3: return this.detallefacturas.get(rowIndex).getid_sucursal();
				case 4: return this.detallefacturas.get(rowIndex).getid_ejercicio();
				case 5: return this.detallefacturas.get(rowIndex).getid_periodo();
				case 6: return this.detallefacturas.get(rowIndex).getid_anio();
				case 7: return this.detallefacturas.get(rowIndex).getid_mes();
				case 8: return this.detallefacturas.get(rowIndex).getid_factura();
				case 9: return this.detallefacturas.get(rowIndex).getid_bodega();
				case 10: return this.detallefacturas.get(rowIndex).getid_producto();
				case 11: return this.detallefacturas.get(rowIndex).getid_unidad();
				case 12: return this.detallefacturas.get(rowIndex).getcodigo_lote();
				case 13: return this.detallefacturas.get(rowIndex).getid_centro_costo();
				case 14: return this.detallefacturas.get(rowIndex).getfecha();
				case 15: return this.detallefacturas.get(rowIndex).getdescripcion();
				case 16: return this.detallefacturas.get(rowIndex).getcantidad();
				case 17: return this.detallefacturas.get(rowIndex).getprecio();
				case 18: return this.detallefacturas.get(rowIndex).getiva();
				case 19: return this.detallefacturas.get(rowIndex).getiva_valor();
				case 20: return this.detallefacturas.get(rowIndex).getice();
				case 21: return this.detallefacturas.get(rowIndex).getice_valor();
				case 22: return this.detallefacturas.get(rowIndex).getdescuento();
				case 23: return this.detallefacturas.get(rowIndex).getdescuento_valor();
				case 24: return this.detallefacturas.get(rowIndex).getdescuento2();
				case 25: return this.detallefacturas.get(rowIndex).getsub_total();
				case 26: return this.detallefacturas.get(rowIndex).gettotal();	            
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
				case 13: return Long.class;
				case 14: return Date.class;
				case 15: return String.class;
				case 16: return Integer.class;
				case 17: return Double.class;
				case 18: return Double.class;
				case 19: return Double.class;
				case 20: return Double.class;
				case 21: return Double.class;
				case 22: return Double.class;
				case 23: return Double.class;
				case 24: return Double.class;
				case 25: return Double.class;
				case 26: return Double.class;	            
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
				case 25: return true;
				case 26: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	DetalleFactura detallefactura = this.detallefacturas.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			DetalleFacturaBeanSwingJInternalFrame detallefacturaBeanSwingJInternalFrame=(DetalleFacturaBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {detallefactura.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {detallefactura.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {detallefactura.setid_empresa((Long) value);detallefactura.setempresa_descripcion(detallefacturaBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {detallefactura.setid_sucursal((Long) value);detallefactura.setsucursal_descripcion(detallefacturaBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {detallefactura.setid_ejercicio((Long) value);detallefactura.setejercicio_descripcion(detallefacturaBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {detallefactura.setid_periodo((Long) value);detallefactura.setperiodo_descripcion(detallefacturaBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {detallefactura.setid_anio((Long) value);detallefactura.setanio_descripcion(detallefacturaBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {detallefactura.setid_mes((Long) value);detallefactura.setmes_descripcion(detallefacturaBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {detallefactura.setid_factura((Long) value);detallefactura.setfactura_descripcion(detallefacturaBeanSwingJInternalFrame.getActualFacturaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {detallefactura.setid_bodega((Long) value);detallefactura.setbodega_descripcion(detallefacturaBeanSwingJInternalFrame.getActualBodegaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {detallefactura.setid_producto((Long) value);detallefactura.setproducto_descripcion(detallefacturaBeanSwingJInternalFrame.getActualProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {detallefactura.setid_unidad((Long) value);detallefactura.setunidad_descripcion(detallefacturaBeanSwingJInternalFrame.getActualUnidadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {detallefactura.setcodigo_lote((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {detallefactura.setid_centro_costo((Long) value);detallefactura.setcentrocosto_descripcion(detallefacturaBeanSwingJInternalFrame.getActualCentroCostoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {detallefactura.setfecha((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {detallefactura.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {detallefactura.setcantidad((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {detallefactura.setprecio((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {detallefactura.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {detallefactura.setiva_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {detallefactura.setice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {detallefactura.setice_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {detallefactura.setdescuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {detallefactura.setdescuento_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {detallefactura.setdescuento2((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {detallefactura.setsub_total((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {detallefactura.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public DetalleFacturaModel(JInternalFrameBase jInternalFrameBase) {
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
		private DetalleFacturaDetalleFormJInternalFrame detallefacturaJInternalFrame=null;
		
		public DetalleFacturaModel(DetalleFacturaDetalleFormJInternalFrame detallefacturaJInternalFrame) {
			this.detallefacturaJInternalFrame=detallefacturaJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.detallefacturaJInternalFrame.getjButtonActualizarToolBarDetalleFactura();
			
			if(component!=null && component.equals(this.detallefacturaJInternalFrame.getjButtonActualizarToolBarDetalleFactura())) {
				componentTab=this.detallefacturaJInternalFrame.getjButtonEliminarToolBarDetalleFactura();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallefacturaJInternalFrame.getjButtonEliminarToolBarDetalleFactura())) {
				componentTab=this.detallefacturaJInternalFrame.getjButtonCancelarToolBarDetalleFactura();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallefacturaJInternalFrame.getjButtonCancelarToolBarDetalleFactura())) {
				componentTab=this.detallefacturaJInternalFrame.jComboBoxid_empresaDetalleFactura;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextAreanombreDetalleFactura)) {
				componentTab=this.detallefacturaJInternalFrame.jComboBoxTiposAccionesFormularioDetalleFactura;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallefacturaJInternalFrame.jComboBoxTiposAccionesFormularioDetalleFactura)) {
				componentTab=this.detallefacturaJInternalFrame.jButtonEliminarDetalleFactura;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallefacturaJInternalFrame.jButtonEliminarDetalleFactura)) {
				componentTab=this.detallefacturaJInternalFrame.jButtonActualizarDetalleFactura;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallefacturaJInternalFrame.jButtonActualizarDetalleFactura)) {
				componentTab=this.detallefacturaJInternalFrame.jButtonCancelarDetalleFactura;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jComboBoxid_empresaDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jComboBoxid_sucursalDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jComboBoxid_sucursalDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jComboBoxid_ejercicioDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jComboBoxid_ejercicioDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jComboBoxid_periodoDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jComboBoxid_periodoDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jComboBoxid_anioDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jComboBoxid_anioDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jComboBoxid_mesDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jComboBoxid_mesDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jComboBoxid_facturaDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jComboBoxid_facturaDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jComboBoxid_bodegaDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jComboBoxid_bodegaDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jComboBoxid_productoDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jComboBoxid_productoDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jComboBoxid_unidadDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jComboBoxid_unidadDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextFieldcodigo_loteDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextFieldcodigo_loteDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jComboBoxid_centro_costoDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jComboBoxid_centro_costoDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jDateChooserfechaDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jDateChooserfechaDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextAreadescripcionDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextAreadescripcionDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextFieldcantidadDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextFieldcantidadDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextFieldprecioDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextFieldprecioDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextFieldivaDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextFieldivaDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextFieldiva_valorDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextFieldiva_valorDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextFieldiceDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextFieldiceDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextFieldice_valorDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextFieldice_valorDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextFielddescuentoDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextFielddescuentoDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextFielddescuento_valorDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextFielddescuento_valorDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextFielddescuento2DetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextFielddescuento2DetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextFieldsub_totalDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextFieldsub_totalDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextFieldtotalDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextFieldtotalDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextFieldmontoDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextFieldmontoDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextAreanombreDetalleFactura;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.detallefacturaJInternalFrame.getjButtonActualizarToolBarDetalleFactura();
			
			if(component!=null && component.equals(this.detallefacturaJInternalFrame.getjButtonEliminarToolBarDetalleFactura())) {
				componentTab=this.detallefacturaJInternalFrame.getjButtonActualizarToolBarDetalleFactura();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallefacturaJInternalFrame.getjButtonCancelarToolBarDetalleFactura())) {
				componentTab=this.detallefacturaJInternalFrame.getjButtonEliminarToolBarDetalleFactura();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detallefacturaJInternalFrame.jComboBoxid_empresaDetalleFactura)) {
				
				componentTab=this.detallefacturaJInternalFrame.getjButtonCancelarToolBarDetalleFactura();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detallefacturaJInternalFrame.jComboBoxTiposAccionesFormularioDetalleFactura)) {
				componentTab=this.detallefacturaJInternalFrame.jTextAreanombreDetalleFactura;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detallefacturaJInternalFrame.jButtonEliminarDetalleFactura)) {
				componentTab=this.detallefacturaJInternalFrame.jComboBoxTiposAccionesFormularioDetalleFactura;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallefacturaJInternalFrame.jButtonActualizarDetalleFactura)) {
				componentTab=this.detallefacturaJInternalFrame.jButtonEliminarDetalleFactura;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallefacturaJInternalFrame.jButtonCancelarDetalleFactura)) {
				componentTab=this.detallefacturaJInternalFrame.jButtonActualizarDetalleFactura;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jComboBoxid_sucursalDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jComboBoxid_empresaDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jComboBoxid_ejercicioDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jComboBoxid_sucursalDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jComboBoxid_periodoDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jComboBoxid_ejercicioDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jComboBoxid_anioDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jComboBoxid_periodoDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jComboBoxid_mesDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jComboBoxid_anioDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jComboBoxid_facturaDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jComboBoxid_mesDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jComboBoxid_bodegaDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jComboBoxid_facturaDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jComboBoxid_productoDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jComboBoxid_bodegaDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jComboBoxid_unidadDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jComboBoxid_productoDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextFieldcodigo_loteDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jComboBoxid_unidadDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jComboBoxid_centro_costoDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextFieldcodigo_loteDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jDateChooserfechaDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jComboBoxid_centro_costoDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextAreadescripcionDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jDateChooserfechaDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextFieldcantidadDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextAreadescripcionDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextFieldprecioDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextFieldcantidadDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextFieldivaDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextFieldprecioDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextFieldiva_valorDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextFieldivaDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextFieldiceDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextFieldiva_valorDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextFieldice_valorDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextFieldiceDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextFielddescuentoDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextFieldice_valorDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextFielddescuento_valorDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextFielddescuentoDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextFielddescuento2DetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextFielddescuento_valorDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextFieldsub_totalDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextFielddescuento2DetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextFieldtotalDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextFieldsub_totalDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextFieldmontoDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextFieldtotalDetalleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaJInternalFrame.jTextAreanombreDetalleFactura)) {
			componentTab=this.detallefacturaJInternalFrame.jTextFieldmontoDetalleFactura;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.detallefacturaJInternalFrame.getjButtonActualizarToolBarDetalleFactura();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.detallefacturaJInternalFrame.getjButtonActualizarToolBarDetalleFactura();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.detallefacturaJInternalFrame.getjButtonCancelarToolBarDetalleFactura();
			
			
			return componentTab;		
		}
		
		public DetalleFacturaDetalleFormJInternalFrame getdetallefacturaJInternalFrame() {
			return this.detallefacturaJInternalFrame;
		}
		
		public void setdetallefacturaJInternalFrame(DetalleFacturaDetalleFormJInternalFrame detallefacturaJInternalFrame) {
			this.detallefacturaJInternalFrame=detallefacturaJInternalFrame;
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
