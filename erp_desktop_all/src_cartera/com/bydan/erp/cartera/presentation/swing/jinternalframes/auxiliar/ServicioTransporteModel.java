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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.cartera.util.ServicioTransporteConstantesFunciones;
import com.bydan.erp.cartera.util.ServicioTransporteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.ServicioTransporteParameterGeneral;

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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.ServicioTransporteBeanSwingJInternalFrame;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;






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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.ServicioTransporteJInternalFrame;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.ServicioTransporteDetalleFormJInternalFrame;

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
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.activosfijos.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class ServicioTransporteModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,ServicioTransporteConstantesFunciones.LABEL_ID
										,ServicioTransporteConstantesFunciones.LABEL_IDEMPRESA
										,ServicioTransporteConstantesFunciones.LABEL_IDSUCURSAL
										,ServicioTransporteConstantesFunciones.LABEL_IDEJERCICIO
										,ServicioTransporteConstantesFunciones.LABEL_IDPERIODO
										,ServicioTransporteConstantesFunciones.LABEL_IDCLIENTE
										,ServicioTransporteConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR
										,ServicioTransporteConstantesFunciones.LABEL_IDTRANSPORTISTA
										,ServicioTransporteConstantesFunciones.LABEL_IDVEHICULO
										,ServicioTransporteConstantesFunciones.LABEL_IDRUTATRANSPORTE
										,ServicioTransporteConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO
										,ServicioTransporteConstantesFunciones.LABEL_FECHAINGRESO
										,ServicioTransporteConstantesFunciones.LABEL_FECHAENTREGA
										,ServicioTransporteConstantesFunciones.LABEL_CODIGOGUIA1
										,ServicioTransporteConstantesFunciones.LABEL_CODIGOGUIA2
										,ServicioTransporteConstantesFunciones.LABEL_PRECIO
										,ServicioTransporteConstantesFunciones.LABEL_VALORIVA
										,ServicioTransporteConstantesFunciones.LABEL_VALORTOTAL
										,ServicioTransporteConstantesFunciones.LABEL_DESCRIPCION
										};
	   
	    public List<ServicioTransporte> serviciotransportes;
	  	 
	    //NO SE UTILIZA
	    public ServicioTransporteModel(List<ServicioTransporte> serviciotransportes,JInternalFrameBase jInternalFrameBase) {
	    	this.serviciotransportes=serviciotransportes;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public ServicioTransporteModel(JInternalFrameBase jInternalFrameBase) {
	    	this.serviciotransportes=new ArrayList<ServicioTransporte>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.serviciotransportes.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.serviciotransportes.get(rowIndex).getIsSelected();
	            
				case 1: return this.serviciotransportes.get(rowIndex).getId();
				case 2: return this.serviciotransportes.get(rowIndex).getid_empresa();
				case 3: return this.serviciotransportes.get(rowIndex).getid_sucursal();
				case 4: return this.serviciotransportes.get(rowIndex).getid_ejercicio();
				case 5: return this.serviciotransportes.get(rowIndex).getid_periodo();
				case 6: return this.serviciotransportes.get(rowIndex).getid_cliente();
				case 7: return this.serviciotransportes.get(rowIndex).getid_cliente_proveedor();
				case 8: return this.serviciotransportes.get(rowIndex).getid_transportista();
				case 9: return this.serviciotransportes.get(rowIndex).getid_vehiculo();
				case 10: return this.serviciotransportes.get(rowIndex).getid_ruta_transporte();
				case 11: return this.serviciotransportes.get(rowIndex).getid_detalle_activo_fijo();
				case 12: return this.serviciotransportes.get(rowIndex).getfecha_ingreso();
				case 13: return this.serviciotransportes.get(rowIndex).getfecha_entrega();
				case 14: return this.serviciotransportes.get(rowIndex).getcodigo_guia1();
				case 15: return this.serviciotransportes.get(rowIndex).getcodigo_guia2();
				case 16: return this.serviciotransportes.get(rowIndex).getprecio();
				case 17: return this.serviciotransportes.get(rowIndex).getvalor_iva();
				case 18: return this.serviciotransportes.get(rowIndex).getvalor_total();
				case 19: return this.serviciotransportes.get(rowIndex).getdescripcion();	            
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
				case 12: return Date.class;
				case 13: return Date.class;
				case 14: return String.class;
				case 15: return String.class;
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
	    	ServicioTransporte serviciotransporte = this.serviciotransportes.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			ServicioTransporteBeanSwingJInternalFrame serviciotransporteBeanSwingJInternalFrame=(ServicioTransporteBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {serviciotransporte.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {serviciotransporte.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {serviciotransporte.setid_empresa((Long) value);serviciotransporte.setempresa_descripcion(serviciotransporteBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {serviciotransporte.setid_sucursal((Long) value);serviciotransporte.setsucursal_descripcion(serviciotransporteBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {serviciotransporte.setid_ejercicio((Long) value);serviciotransporte.setejercicio_descripcion(serviciotransporteBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {serviciotransporte.setid_periodo((Long) value);serviciotransporte.setperiodo_descripcion(serviciotransporteBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {serviciotransporte.setid_cliente((Long) value);serviciotransporte.setcliente_descripcion(serviciotransporteBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {serviciotransporte.setid_cliente_proveedor((Long) value);serviciotransporte.setclienteproveedor_descripcion(serviciotransporteBeanSwingJInternalFrame.getActualClienteProveedorForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {serviciotransporte.setid_transportista((Long) value);serviciotransporte.settransportista_descripcion(serviciotransporteBeanSwingJInternalFrame.getActualTransportistaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {serviciotransporte.setid_vehiculo((Long) value);serviciotransporte.setvehiculo_descripcion(serviciotransporteBeanSwingJInternalFrame.getActualVehiculoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {serviciotransporte.setid_ruta_transporte((Long) value);serviciotransporte.setrutatransporte_descripcion(serviciotransporteBeanSwingJInternalFrame.getActualRutaTransporteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {serviciotransporte.setid_detalle_activo_fijo((Long) value);serviciotransporte.setdetalleactivofijo_descripcion(serviciotransporteBeanSwingJInternalFrame.getActualDetalleActivoFijoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {serviciotransporte.setfecha_ingreso((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {serviciotransporte.setfecha_entrega((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {serviciotransporte.setcodigo_guia1((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {serviciotransporte.setcodigo_guia2((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {serviciotransporte.setprecio((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {serviciotransporte.setvalor_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {serviciotransporte.setvalor_total((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {serviciotransporte.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public ServicioTransporteModel(JInternalFrameBase jInternalFrameBase) {
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
		private ServicioTransporteDetalleFormJInternalFrame serviciotransporteJInternalFrame=null;
		
		public ServicioTransporteModel(ServicioTransporteDetalleFormJInternalFrame serviciotransporteJInternalFrame) {
			this.serviciotransporteJInternalFrame=serviciotransporteJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.serviciotransporteJInternalFrame.getjButtonActualizarToolBarServicioTransporte();
			
			if(component!=null && component.equals(this.serviciotransporteJInternalFrame.getjButtonActualizarToolBarServicioTransporte())) {
				componentTab=this.serviciotransporteJInternalFrame.getjButtonEliminarToolBarServicioTransporte();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.serviciotransporteJInternalFrame.getjButtonEliminarToolBarServicioTransporte())) {
				componentTab=this.serviciotransporteJInternalFrame.getjButtonCancelarToolBarServicioTransporte();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.serviciotransporteJInternalFrame.getjButtonCancelarToolBarServicioTransporte())) {
				componentTab=this.serviciotransporteJInternalFrame.jComboBoxid_empresaServicioTransporte;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jTextAreadescripcionServicioTransporte)) {
				componentTab=this.serviciotransporteJInternalFrame.jComboBoxTiposAccionesFormularioServicioTransporte;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jComboBoxTiposAccionesFormularioServicioTransporte)) {
				componentTab=this.serviciotransporteJInternalFrame.jButtonEliminarServicioTransporte;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jButtonEliminarServicioTransporte)) {
				componentTab=this.serviciotransporteJInternalFrame.jButtonActualizarServicioTransporte;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jButtonActualizarServicioTransporte)) {
				componentTab=this.serviciotransporteJInternalFrame.jButtonCancelarServicioTransporte;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jComboBoxid_empresaServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jComboBoxid_sucursalServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jComboBoxid_sucursalServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jComboBoxid_ejercicioServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jComboBoxid_ejercicioServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jComboBoxid_periodoServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jComboBoxid_periodoServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jComboBoxid_clienteServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jComboBoxid_clienteServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jComboBoxid_cliente_proveedorServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jComboBoxid_cliente_proveedorServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jComboBoxid_transportistaServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jComboBoxid_transportistaServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jComboBoxid_vehiculoServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jComboBoxid_vehiculoServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jComboBoxid_ruta_transporteServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jComboBoxid_ruta_transporteServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jComboBoxid_detalle_activo_fijoServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jComboBoxid_detalle_activo_fijoServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jDateChooserfecha_ingresoServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jDateChooserfecha_ingresoServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jDateChooserfecha_entregaServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jDateChooserfecha_entregaServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jTextAreacodigo_guia1ServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jTextAreacodigo_guia1ServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jTextAreacodigo_guia2ServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jTextAreacodigo_guia2ServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jTextFieldprecioServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jTextFieldprecioServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jTextFieldvalor_ivaServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jTextFieldvalor_ivaServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jTextFieldvalor_totalServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jTextFieldvalor_totalServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jTextAreadescripcionServicioTransporte;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.serviciotransporteJInternalFrame.getjButtonActualizarToolBarServicioTransporte();
			
			if(component!=null && component.equals(this.serviciotransporteJInternalFrame.getjButtonEliminarToolBarServicioTransporte())) {
				componentTab=this.serviciotransporteJInternalFrame.getjButtonActualizarToolBarServicioTransporte();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.serviciotransporteJInternalFrame.getjButtonCancelarToolBarServicioTransporte())) {
				componentTab=this.serviciotransporteJInternalFrame.getjButtonEliminarToolBarServicioTransporte();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jComboBoxid_empresaServicioTransporte)) {
				
				componentTab=this.serviciotransporteJInternalFrame.getjButtonCancelarToolBarServicioTransporte();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jComboBoxTiposAccionesFormularioServicioTransporte)) {
				componentTab=this.serviciotransporteJInternalFrame.jTextAreadescripcionServicioTransporte;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jButtonEliminarServicioTransporte)) {
				componentTab=this.serviciotransporteJInternalFrame.jComboBoxTiposAccionesFormularioServicioTransporte;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jButtonActualizarServicioTransporte)) {
				componentTab=this.serviciotransporteJInternalFrame.jButtonEliminarServicioTransporte;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jButtonCancelarServicioTransporte)) {
				componentTab=this.serviciotransporteJInternalFrame.jButtonActualizarServicioTransporte;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jComboBoxid_sucursalServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jComboBoxid_empresaServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jComboBoxid_ejercicioServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jComboBoxid_sucursalServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jComboBoxid_periodoServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jComboBoxid_ejercicioServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jComboBoxid_clienteServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jComboBoxid_periodoServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jComboBoxid_cliente_proveedorServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jComboBoxid_clienteServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jComboBoxid_transportistaServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jComboBoxid_cliente_proveedorServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jComboBoxid_vehiculoServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jComboBoxid_transportistaServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jComboBoxid_ruta_transporteServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jComboBoxid_vehiculoServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jComboBoxid_detalle_activo_fijoServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jComboBoxid_ruta_transporteServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jDateChooserfecha_ingresoServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jComboBoxid_detalle_activo_fijoServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jDateChooserfecha_entregaServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jDateChooserfecha_ingresoServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jTextAreacodigo_guia1ServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jDateChooserfecha_entregaServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jTextAreacodigo_guia2ServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jTextAreacodigo_guia1ServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jTextFieldprecioServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jTextAreacodigo_guia2ServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jTextFieldvalor_ivaServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jTextFieldprecioServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jTextFieldvalor_totalServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jTextFieldvalor_ivaServicioTransporte;
			return componentTab;
		}

		if(component!=null && component.equals(this.serviciotransporteJInternalFrame.jTextAreadescripcionServicioTransporte)) {
			componentTab=this.serviciotransporteJInternalFrame.jTextFieldvalor_totalServicioTransporte;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.serviciotransporteJInternalFrame.getjButtonActualizarToolBarServicioTransporte();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.serviciotransporteJInternalFrame.getjButtonActualizarToolBarServicioTransporte();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.serviciotransporteJInternalFrame.getjButtonCancelarToolBarServicioTransporte();
			
			
			return componentTab;		
		}
		
		public ServicioTransporteDetalleFormJInternalFrame getserviciotransporteJInternalFrame() {
			return this.serviciotransporteJInternalFrame;
		}
		
		public void setserviciotransporteJInternalFrame(ServicioTransporteDetalleFormJInternalFrame serviciotransporteJInternalFrame) {
			this.serviciotransporteJInternalFrame=serviciotransporteJInternalFrame;
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
