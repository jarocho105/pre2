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

import com.bydan.erp.cartera.util.DetalleClienteConstantesFunciones;
import com.bydan.erp.cartera.util.DetalleClienteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.DetalleClienteParameterGeneral;

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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.DetalleClienteBeanSwingJInternalFrame;
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
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.DetalleClienteJInternalFrame;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.DetalleClienteDetalleFormJInternalFrame;

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
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.facturacion.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class DetalleClienteModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,DetalleClienteConstantesFunciones.LABEL_ID
										,DetalleClienteConstantesFunciones.LABEL_IDEMPRESA
										,DetalleClienteConstantesFunciones.LABEL_IDSUCURSAL
										,DetalleClienteConstantesFunciones.LABEL_IDEJERCICIO
										,DetalleClienteConstantesFunciones.LABEL_IDPERIODO
										,DetalleClienteConstantesFunciones.LABEL_IDANIO
										,DetalleClienteConstantesFunciones.LABEL_IDMES
										,DetalleClienteConstantesFunciones.LABEL_IDMODULO
										,DetalleClienteConstantesFunciones.LABEL_IDASIENTOCONTABLE
										,DetalleClienteConstantesFunciones.LABEL_IDCLIENTE
										,DetalleClienteConstantesFunciones.LABEL_IDTRANSACCION
										,DetalleClienteConstantesFunciones.LABEL_IDFACTURA
										,DetalleClienteConstantesFunciones.LABEL_NUMEROFACTURA
										,DetalleClienteConstantesFunciones.LABEL_FECHAVENCE
										,DetalleClienteConstantesFunciones.LABEL_DESCRIPCION
										,DetalleClienteConstantesFunciones.LABEL_DEBITOMONELOCAL
										,DetalleClienteConstantesFunciones.LABEL_CREDITOMONELOCAL
										,DetalleClienteConstantesFunciones.LABEL_DEBITOMONEEXTRA
										,DetalleClienteConstantesFunciones.LABEL_CREDITOMONEEXTRA
										,DetalleClienteConstantesFunciones.LABEL_IDMONEDA
										,DetalleClienteConstantesFunciones.LABEL_COTIZACION
										};
	   
	    public List<DetalleCliente> detalleclientes;
	  	 
	    //NO SE UTILIZA
	    public DetalleClienteModel(List<DetalleCliente> detalleclientes,JInternalFrameBase jInternalFrameBase) {
	    	this.detalleclientes=detalleclientes;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public DetalleClienteModel(JInternalFrameBase jInternalFrameBase) {
	    	this.detalleclientes=new ArrayList<DetalleCliente>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.detalleclientes.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.detalleclientes.get(rowIndex).getIsSelected();
	            
				case 1: return this.detalleclientes.get(rowIndex).getId();
				case 2: return this.detalleclientes.get(rowIndex).getid_empresa();
				case 3: return this.detalleclientes.get(rowIndex).getid_sucursal();
				case 4: return this.detalleclientes.get(rowIndex).getid_ejercicio();
				case 5: return this.detalleclientes.get(rowIndex).getid_periodo();
				case 6: return this.detalleclientes.get(rowIndex).getid_anio();
				case 7: return this.detalleclientes.get(rowIndex).getid_mes();
				case 8: return this.detalleclientes.get(rowIndex).getid_modulo();
				case 9: return this.detalleclientes.get(rowIndex).getid_asiento_contable();
				case 10: return this.detalleclientes.get(rowIndex).getid_cliente();
				case 11: return this.detalleclientes.get(rowIndex).getid_transaccion();
				case 12: return this.detalleclientes.get(rowIndex).getid_factura();
				case 13: return this.detalleclientes.get(rowIndex).getnumero_factura();
				case 14: return this.detalleclientes.get(rowIndex).getfecha_vence();
				case 15: return this.detalleclientes.get(rowIndex).getdescripcion();
				case 16: return this.detalleclientes.get(rowIndex).getdebito_mone_local();
				case 17: return this.detalleclientes.get(rowIndex).getcredito_mone_local();
				case 18: return this.detalleclientes.get(rowIndex).getdebito_mone_extra();
				case 19: return this.detalleclientes.get(rowIndex).getcredito_mone_extra();
				case 20: return this.detalleclientes.get(rowIndex).getid_moneda();
				case 21: return this.detalleclientes.get(rowIndex).getcotizacion();	            
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
				case 13: return String.class;
				case 14: return Date.class;
				case 15: return String.class;
				case 16: return Double.class;
				case 17: return Double.class;
				case 18: return Double.class;
				case 19: return Double.class;
				case 20: return Long.class;
				case 21: return Double.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	DetalleCliente detallecliente = this.detalleclientes.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			DetalleClienteBeanSwingJInternalFrame detalleclienteBeanSwingJInternalFrame=(DetalleClienteBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {detallecliente.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {detallecliente.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {detallecliente.setid_empresa((Long) value);detallecliente.setempresa_descripcion(detalleclienteBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {detallecliente.setid_sucursal((Long) value);detallecliente.setsucursal_descripcion(detalleclienteBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {detallecliente.setid_ejercicio((Long) value);detallecliente.setejercicio_descripcion(detalleclienteBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {detallecliente.setid_periodo((Long) value);detallecliente.setperiodo_descripcion(detalleclienteBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {detallecliente.setid_anio((Long) value);detallecliente.setanio_descripcion(detalleclienteBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {detallecliente.setid_mes((Long) value);detallecliente.setmes_descripcion(detalleclienteBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {detallecliente.setid_modulo((Long) value);detallecliente.setmodulo_descripcion(detalleclienteBeanSwingJInternalFrame.getActualModuloForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {detallecliente.setid_asiento_contable((Long) value);detallecliente.setasientocontable_descripcion(detalleclienteBeanSwingJInternalFrame.getActualAsientoContableForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {detallecliente.setid_cliente((Long) value);detallecliente.setcliente_descripcion(detalleclienteBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {detallecliente.setid_transaccion((Long) value);detallecliente.settransaccion_descripcion(detalleclienteBeanSwingJInternalFrame.getActualTransaccionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {detallecliente.setid_factura((Long) value);detallecliente.setfactura_descripcion(detalleclienteBeanSwingJInternalFrame.getActualFacturaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {detallecliente.setnumero_factura((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {detallecliente.setfecha_vence((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {detallecliente.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {detallecliente.setdebito_mone_local((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {detallecliente.setcredito_mone_local((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {detallecliente.setdebito_mone_extra((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {detallecliente.setcredito_mone_extra((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {detallecliente.setid_moneda((Long) value);detallecliente.setmoneda_descripcion(detalleclienteBeanSwingJInternalFrame.getActualMonedaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {detallecliente.setcotizacion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public DetalleClienteModel(JInternalFrameBase jInternalFrameBase) {
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
		private DetalleClienteDetalleFormJInternalFrame detalleclienteJInternalFrame=null;
		
		public DetalleClienteModel(DetalleClienteDetalleFormJInternalFrame detalleclienteJInternalFrame) {
			this.detalleclienteJInternalFrame=detalleclienteJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.detalleclienteJInternalFrame.getjButtonActualizarToolBarDetalleCliente();
			
			if(component!=null && component.equals(this.detalleclienteJInternalFrame.getjButtonActualizarToolBarDetalleCliente())) {
				componentTab=this.detalleclienteJInternalFrame.getjButtonEliminarToolBarDetalleCliente();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleclienteJInternalFrame.getjButtonEliminarToolBarDetalleCliente())) {
				componentTab=this.detalleclienteJInternalFrame.getjButtonCancelarToolBarDetalleCliente();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleclienteJInternalFrame.getjButtonCancelarToolBarDetalleCliente())) {
				componentTab=this.detalleclienteJInternalFrame.jComboBoxid_empresaDetalleCliente;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_estado_detalle_clienteDetalleCliente)) {
				componentTab=this.detalleclienteJInternalFrame.jComboBoxTiposAccionesFormularioDetalleCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxTiposAccionesFormularioDetalleCliente)) {
				componentTab=this.detalleclienteJInternalFrame.jButtonEliminarDetalleCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleclienteJInternalFrame.jButtonEliminarDetalleCliente)) {
				componentTab=this.detalleclienteJInternalFrame.jButtonActualizarDetalleCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleclienteJInternalFrame.jButtonActualizarDetalleCliente)) {
				componentTab=this.detalleclienteJInternalFrame.jButtonCancelarDetalleCliente;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_empresaDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jComboBoxid_sucursalDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_sucursalDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jComboBoxid_ejercicioDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_ejercicioDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jComboBoxid_periodoDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_periodoDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jComboBoxid_anioDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_anioDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jComboBoxid_mesDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_mesDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jComboBoxid_moduloDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_moduloDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jComboBoxid_asiento_contableDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_asiento_contableDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jComboBoxid_clienteDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_clienteDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jComboBoxid_transaccionDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_transaccionDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jComboBoxid_facturaDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_facturaDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jTextFieldnumero_facturaDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jTextFieldnumero_facturaDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jDateChooserfecha_venceDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jDateChooserfecha_venceDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jTextAreadescripcionDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jTextAreadescripcionDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jTextFielddebito_mone_localDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jTextFielddebito_mone_localDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jTextFieldcredito_mone_localDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jTextFieldcredito_mone_localDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jTextFielddebito_mone_extraDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jTextFielddebito_mone_extraDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jTextFieldcredito_mone_extraDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jTextFieldcredito_mone_extraDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jComboBoxid_monedaDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_monedaDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jTextFieldcotizacionDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jTextFieldcotizacionDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jComboBoxid_sucursal_movimientoDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_sucursal_movimientoDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jComboBoxid_tipo_transaccion_moduloDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_tipo_transaccion_moduloDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jDateChooserfecha_emisionDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jDateChooserfecha_emisionDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jTextAreabeneficiarioDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jTextAreabeneficiarioDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jTextFieldmonto_mone_localDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jTextFieldmonto_mone_localDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jTextFieldmonto_mone_extraDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jTextFieldmonto_mone_extraDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jTextFieldnumero_comprobanteDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jTextFieldnumero_comprobanteDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jComboBoxid_estado_detalle_clienteDetalleCliente;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.detalleclienteJInternalFrame.getjButtonActualizarToolBarDetalleCliente();
			
			if(component!=null && component.equals(this.detalleclienteJInternalFrame.getjButtonEliminarToolBarDetalleCliente())) {
				componentTab=this.detalleclienteJInternalFrame.getjButtonActualizarToolBarDetalleCliente();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleclienteJInternalFrame.getjButtonCancelarToolBarDetalleCliente())) {
				componentTab=this.detalleclienteJInternalFrame.getjButtonEliminarToolBarDetalleCliente();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_empresaDetalleCliente)) {
				
				componentTab=this.detalleclienteJInternalFrame.getjButtonCancelarToolBarDetalleCliente();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxTiposAccionesFormularioDetalleCliente)) {
				componentTab=this.detalleclienteJInternalFrame.jComboBoxid_estado_detalle_clienteDetalleCliente;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleclienteJInternalFrame.jButtonEliminarDetalleCliente)) {
				componentTab=this.detalleclienteJInternalFrame.jComboBoxTiposAccionesFormularioDetalleCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleclienteJInternalFrame.jButtonActualizarDetalleCliente)) {
				componentTab=this.detalleclienteJInternalFrame.jButtonEliminarDetalleCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleclienteJInternalFrame.jButtonCancelarDetalleCliente)) {
				componentTab=this.detalleclienteJInternalFrame.jButtonActualizarDetalleCliente;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_sucursalDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jComboBoxid_empresaDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_ejercicioDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jComboBoxid_sucursalDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_periodoDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jComboBoxid_ejercicioDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_anioDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jComboBoxid_periodoDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_mesDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jComboBoxid_anioDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_moduloDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jComboBoxid_mesDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_asiento_contableDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jComboBoxid_moduloDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_clienteDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jComboBoxid_asiento_contableDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_transaccionDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jComboBoxid_clienteDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_facturaDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jComboBoxid_transaccionDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jTextFieldnumero_facturaDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jComboBoxid_facturaDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jDateChooserfecha_venceDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jTextFieldnumero_facturaDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jTextAreadescripcionDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jDateChooserfecha_venceDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jTextFielddebito_mone_localDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jTextAreadescripcionDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jTextFieldcredito_mone_localDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jTextFielddebito_mone_localDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jTextFielddebito_mone_extraDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jTextFieldcredito_mone_localDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jTextFieldcredito_mone_extraDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jTextFielddebito_mone_extraDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_monedaDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jTextFieldcredito_mone_extraDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jTextFieldcotizacionDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jComboBoxid_monedaDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_sucursal_movimientoDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jTextFieldcotizacionDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_tipo_transaccion_moduloDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jComboBoxid_sucursal_movimientoDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jDateChooserfecha_emisionDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jComboBoxid_tipo_transaccion_moduloDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jTextAreabeneficiarioDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jDateChooserfecha_emisionDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jTextFieldmonto_mone_localDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jTextAreabeneficiarioDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jTextFieldmonto_mone_extraDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jTextFieldmonto_mone_localDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jTextFieldnumero_comprobanteDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jTextFieldmonto_mone_extraDetalleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleclienteJInternalFrame.jComboBoxid_estado_detalle_clienteDetalleCliente)) {
			componentTab=this.detalleclienteJInternalFrame.jTextFieldnumero_comprobanteDetalleCliente;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.detalleclienteJInternalFrame.getjButtonActualizarToolBarDetalleCliente();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.detalleclienteJInternalFrame.getjButtonActualizarToolBarDetalleCliente();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.detalleclienteJInternalFrame.getjButtonCancelarToolBarDetalleCliente();
			
			
			return componentTab;		
		}
		
		public DetalleClienteDetalleFormJInternalFrame getdetalleclienteJInternalFrame() {
			return this.detalleclienteJInternalFrame;
		}
		
		public void setdetalleclienteJInternalFrame(DetalleClienteDetalleFormJInternalFrame detalleclienteJInternalFrame) {
			this.detalleclienteJInternalFrame=detalleclienteJInternalFrame;
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
