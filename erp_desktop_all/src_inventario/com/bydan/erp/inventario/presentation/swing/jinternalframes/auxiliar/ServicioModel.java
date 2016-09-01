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

import com.bydan.erp.inventario.util.ServicioConstantesFunciones;
import com.bydan.erp.inventario.util.ServicioParameterReturnGeneral;
//import com.bydan.erp.inventario.util.ServicioParameterGeneral;

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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.ServicioBeanSwingJInternalFrame;
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
import com.bydan.erp.facturacion.business.logic.*;

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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.ServicioJInternalFrame;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.ServicioDetalleFormJInternalFrame;

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


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class ServicioModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,ServicioConstantesFunciones.LABEL_ID
										,ServicioConstantesFunciones.LABEL_IDEMPRESA
										,ServicioConstantesFunciones.LABEL_IDTIPOSERVICIO
										,ServicioConstantesFunciones.LABEL_CODIGO
										,ServicioConstantesFunciones.LABEL_NOMBRE
										,ServicioConstantesFunciones.LABEL_IVA
										,ServicioConstantesFunciones.LABEL_ICE
										,ServicioConstantesFunciones.LABEL_ESBIEN
										,ServicioConstantesFunciones.LABEL_IDESTADOSERVICIO
										,ServicioConstantesFunciones.LABEL_DESCRIPCION
										,ServicioConstantesFunciones.LABEL_IDCUENTACONTABLEGASTO
										,ServicioConstantesFunciones.LABEL_IDCUENTACONTABLEFISCAL
										,ServicioConstantesFunciones.LABEL_IDCUENTACONTABLEFISCAL2
										,ServicioConstantesFunciones.LABEL_IDCUENTACONTABLERETENCION
										,ServicioConstantesFunciones.LABEL_IDCUENTACONTABLERETENCION2
										,ServicioConstantesFunciones.LABEL_IDCUENTACONTABLEIVA
										,ServicioConstantesFunciones.LABEL_IDCUENTACONTABLEIVA2
										,ServicioConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO
										};
	   
	    public List<Servicio> servicios;
	  	 
	    //NO SE UTILIZA
	    public ServicioModel(List<Servicio> servicios,JInternalFrameBase jInternalFrameBase) {
	    	this.servicios=servicios;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public ServicioModel(JInternalFrameBase jInternalFrameBase) {
	    	this.servicios=new ArrayList<Servicio>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.servicios.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.servicios.get(rowIndex).getIsSelected();
	            
				case 1: return this.servicios.get(rowIndex).getId();
				case 2: return this.servicios.get(rowIndex).getid_empresa();
				case 3: return this.servicios.get(rowIndex).getid_tipo_servicio();
				case 4: return this.servicios.get(rowIndex).getcodigo();
				case 5: return this.servicios.get(rowIndex).getnombre();
				case 6: return this.servicios.get(rowIndex).getiva();
				case 7: return this.servicios.get(rowIndex).getice();
				case 8: return this.servicios.get(rowIndex).getes_bien();
				case 9: return this.servicios.get(rowIndex).getid_estado_servicio();
				case 10: return this.servicios.get(rowIndex).getdescripcion();
				case 11: return this.servicios.get(rowIndex).getid_cuenta_contable_gasto();
				case 12: return this.servicios.get(rowIndex).getid_cuenta_contable_fiscal();
				case 13: return this.servicios.get(rowIndex).getid_cuenta_contable_fiscal2();
				case 14: return this.servicios.get(rowIndex).getid_cuenta_contable_retencion();
				case 15: return this.servicios.get(rowIndex).getid_cuenta_contable_retencion2();
				case 16: return this.servicios.get(rowIndex).getid_cuenta_contable_iva();
				case 17: return this.servicios.get(rowIndex).getid_cuenta_contable_iva2();
				case 18: return this.servicios.get(rowIndex).getid_cuenta_contable_credito();	            
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
				case 4: return String.class;
				case 5: return String.class;
				case 6: return Double.class;
				case 7: return Double.class;
				case 8: return Boolean.class;
				case 9: return Long.class;
				case 10: return String.class;
				case 11: return Long.class;
				case 12: return Long.class;
				case 13: return Long.class;
				case 14: return Long.class;
				case 15: return Long.class;
				case 16: return Long.class;
				case 17: return Long.class;
				case 18: return Long.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	Servicio servicio = this.servicios.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			ServicioBeanSwingJInternalFrame servicioBeanSwingJInternalFrame=(ServicioBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {servicio.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {servicio.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {servicio.setid_empresa((Long) value);servicio.setempresa_descripcion(servicioBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {servicio.setid_tipo_servicio((Long) value);servicio.settiposervicio_descripcion(servicioBeanSwingJInternalFrame.getActualTipoServicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {servicio.setcodigo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {servicio.setnombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {servicio.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {servicio.setice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {servicio.setes_bien((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {servicio.setid_estado_servicio((Long) value);servicio.setestadoservicio_descripcion(servicioBeanSwingJInternalFrame.getActualEstadoServicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {servicio.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {servicio.setid_cuenta_contable_gasto((Long) value);servicio.setcuentacontablegasto_descripcion(servicioBeanSwingJInternalFrame.getActualCuentaContableGastoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {servicio.setid_cuenta_contable_fiscal((Long) value);servicio.setcuentacontablefiscal_descripcion(servicioBeanSwingJInternalFrame.getActualCuentaContableFiscalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {servicio.setid_cuenta_contable_fiscal2((Long) value);servicio.setcuentacontablefiscal2_descripcion(servicioBeanSwingJInternalFrame.getActualCuentaContableFiscal2ForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {servicio.setid_cuenta_contable_retencion((Long) value);servicio.setcuentacontableretencion_descripcion(servicioBeanSwingJInternalFrame.getActualCuentaContableRetencionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {servicio.setid_cuenta_contable_retencion2((Long) value);servicio.setcuentacontableretencion2_descripcion(servicioBeanSwingJInternalFrame.getActualCuentaContableRetencion2ForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {servicio.setid_cuenta_contable_iva((Long) value);servicio.setcuentacontableiva_descripcion(servicioBeanSwingJInternalFrame.getActualCuentaContableIvaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {servicio.setid_cuenta_contable_iva2((Long) value);servicio.setcuentacontableiva2_descripcion(servicioBeanSwingJInternalFrame.getActualCuentaContableIva2ForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {servicio.setid_cuenta_contable_credito((Long) value);servicio.setcuentacontablecredito_descripcion(servicioBeanSwingJInternalFrame.getActualCuentaContableCreditoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public ServicioModel(JInternalFrameBase jInternalFrameBase) {
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
		private ServicioDetalleFormJInternalFrame servicioJInternalFrame=null;
		
		public ServicioModel(ServicioDetalleFormJInternalFrame servicioJInternalFrame) {
			this.servicioJInternalFrame=servicioJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.servicioJInternalFrame.getjButtonActualizarToolBarServicio();
			
			if(component!=null && component.equals(this.servicioJInternalFrame.getjButtonActualizarToolBarServicio())) {
				componentTab=this.servicioJInternalFrame.getjButtonEliminarToolBarServicio();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.servicioJInternalFrame.getjButtonEliminarToolBarServicio())) {
				componentTab=this.servicioJInternalFrame.getjButtonCancelarToolBarServicio();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.servicioJInternalFrame.getjButtonCancelarToolBarServicio())) {
				componentTab=this.servicioJInternalFrame.jComboBoxid_empresaServicio;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.servicioJInternalFrame.jComboBoxid_cuenta_contable_creditoServicio)) {
				componentTab=this.servicioJInternalFrame.jComboBoxTiposAccionesFormularioServicio;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.servicioJInternalFrame.jComboBoxTiposAccionesFormularioServicio)) {
				componentTab=this.servicioJInternalFrame.jButtonEliminarServicio;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.servicioJInternalFrame.jButtonEliminarServicio)) {
				componentTab=this.servicioJInternalFrame.jButtonActualizarServicio;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.servicioJInternalFrame.jButtonActualizarServicio)) {
				componentTab=this.servicioJInternalFrame.jButtonCancelarServicio;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.servicioJInternalFrame.jComboBoxid_empresaServicio)) {
			componentTab=this.servicioJInternalFrame.jComboBoxid_tipo_servicioServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jComboBoxid_tipo_servicioServicio)) {
			componentTab=this.servicioJInternalFrame.jTextAreacodigoServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jTextAreacodigoServicio)) {
			componentTab=this.servicioJInternalFrame.jTextAreanombreServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jTextAreanombreServicio)) {
			componentTab=this.servicioJInternalFrame.jTextFieldivaServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jTextFieldivaServicio)) {
			componentTab=this.servicioJInternalFrame.jTextFieldiceServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jTextFieldiceServicio)) {
			componentTab=this.servicioJInternalFrame.jCheckBoxes_bienServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jCheckBoxes_bienServicio)) {
			componentTab=this.servicioJInternalFrame.jComboBoxid_estado_servicioServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jComboBoxid_estado_servicioServicio)) {
			componentTab=this.servicioJInternalFrame.jTextAreadescripcionServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jTextAreadescripcionServicio)) {
			componentTab=this.servicioJInternalFrame.jComboBoxid_cuenta_contable_gastoServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jComboBoxid_cuenta_contable_gastoServicio)) {
			componentTab=this.servicioJInternalFrame.jComboBoxid_cuenta_contable_fiscalServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jComboBoxid_cuenta_contable_fiscalServicio)) {
			componentTab=this.servicioJInternalFrame.jComboBoxid_cuenta_contable_fiscal2Servicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jComboBoxid_cuenta_contable_fiscal2Servicio)) {
			componentTab=this.servicioJInternalFrame.jComboBoxid_cuenta_contable_retencionServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jComboBoxid_cuenta_contable_retencionServicio)) {
			componentTab=this.servicioJInternalFrame.jComboBoxid_cuenta_contable_retencion2Servicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jComboBoxid_cuenta_contable_retencion2Servicio)) {
			componentTab=this.servicioJInternalFrame.jComboBoxid_cuenta_contable_ivaServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jComboBoxid_cuenta_contable_ivaServicio)) {
			componentTab=this.servicioJInternalFrame.jComboBoxid_cuenta_contable_iva2Servicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jComboBoxid_cuenta_contable_iva2Servicio)) {
			componentTab=this.servicioJInternalFrame.jComboBoxid_cuenta_contable_creditoServicio;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.servicioJInternalFrame.getjButtonActualizarToolBarServicio();
			
			if(component!=null && component.equals(this.servicioJInternalFrame.getjButtonEliminarToolBarServicio())) {
				componentTab=this.servicioJInternalFrame.getjButtonActualizarToolBarServicio();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.servicioJInternalFrame.getjButtonCancelarToolBarServicio())) {
				componentTab=this.servicioJInternalFrame.getjButtonEliminarToolBarServicio();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.servicioJInternalFrame.jComboBoxid_empresaServicio)) {
				
				componentTab=this.servicioJInternalFrame.getjButtonCancelarToolBarServicio();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.servicioJInternalFrame.jComboBoxTiposAccionesFormularioServicio)) {
				componentTab=this.servicioJInternalFrame.jComboBoxid_cuenta_contable_creditoServicio;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.servicioJInternalFrame.jButtonEliminarServicio)) {
				componentTab=this.servicioJInternalFrame.jComboBoxTiposAccionesFormularioServicio;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.servicioJInternalFrame.jButtonActualizarServicio)) {
				componentTab=this.servicioJInternalFrame.jButtonEliminarServicio;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.servicioJInternalFrame.jButtonCancelarServicio)) {
				componentTab=this.servicioJInternalFrame.jButtonActualizarServicio;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.servicioJInternalFrame.jComboBoxid_tipo_servicioServicio)) {
			componentTab=this.servicioJInternalFrame.jComboBoxid_empresaServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jTextAreacodigoServicio)) {
			componentTab=this.servicioJInternalFrame.jComboBoxid_tipo_servicioServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jTextAreanombreServicio)) {
			componentTab=this.servicioJInternalFrame.jTextAreacodigoServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jTextFieldivaServicio)) {
			componentTab=this.servicioJInternalFrame.jTextAreanombreServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jTextFieldiceServicio)) {
			componentTab=this.servicioJInternalFrame.jTextFieldivaServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jCheckBoxes_bienServicio)) {
			componentTab=this.servicioJInternalFrame.jTextFieldiceServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jComboBoxid_estado_servicioServicio)) {
			componentTab=this.servicioJInternalFrame.jCheckBoxes_bienServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jTextAreadescripcionServicio)) {
			componentTab=this.servicioJInternalFrame.jComboBoxid_estado_servicioServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jComboBoxid_cuenta_contable_gastoServicio)) {
			componentTab=this.servicioJInternalFrame.jTextAreadescripcionServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jComboBoxid_cuenta_contable_fiscalServicio)) {
			componentTab=this.servicioJInternalFrame.jComboBoxid_cuenta_contable_gastoServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jComboBoxid_cuenta_contable_fiscal2Servicio)) {
			componentTab=this.servicioJInternalFrame.jComboBoxid_cuenta_contable_fiscalServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jComboBoxid_cuenta_contable_retencionServicio)) {
			componentTab=this.servicioJInternalFrame.jComboBoxid_cuenta_contable_fiscal2Servicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jComboBoxid_cuenta_contable_retencion2Servicio)) {
			componentTab=this.servicioJInternalFrame.jComboBoxid_cuenta_contable_retencionServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jComboBoxid_cuenta_contable_ivaServicio)) {
			componentTab=this.servicioJInternalFrame.jComboBoxid_cuenta_contable_retencion2Servicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jComboBoxid_cuenta_contable_iva2Servicio)) {
			componentTab=this.servicioJInternalFrame.jComboBoxid_cuenta_contable_ivaServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.servicioJInternalFrame.jComboBoxid_cuenta_contable_creditoServicio)) {
			componentTab=this.servicioJInternalFrame.jComboBoxid_cuenta_contable_iva2Servicio;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.servicioJInternalFrame.getjButtonActualizarToolBarServicio();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.servicioJInternalFrame.getjButtonActualizarToolBarServicio();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.servicioJInternalFrame.getjButtonCancelarToolBarServicio();
			
			
			return componentTab;		
		}
		
		public ServicioDetalleFormJInternalFrame getservicioJInternalFrame() {
			return this.servicioJInternalFrame;
		}
		
		public void setservicioJInternalFrame(ServicioDetalleFormJInternalFrame servicioJInternalFrame) {
			this.servicioJInternalFrame=servicioJInternalFrame;
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
