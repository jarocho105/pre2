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

import com.bydan.erp.facturacion.util.TablaAmortiDetalleConstantesFunciones;
import com.bydan.erp.facturacion.util.TablaAmortiDetalleParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.TablaAmortiDetalleParameterGeneral;

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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.TablaAmortiDetalleBeanSwingJInternalFrame;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.TablaAmortiDetalleJInternalFrame;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.TablaAmortiDetalleDetalleFormJInternalFrame;

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

public class TablaAmortiDetalleModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,TablaAmortiDetalleConstantesFunciones.LABEL_ID
										,TablaAmortiDetalleConstantesFunciones.LABEL_IDEMPRESA
										,TablaAmortiDetalleConstantesFunciones.LABEL_IDSUCURSAL
										,TablaAmortiDetalleConstantesFunciones.LABEL_IDEJERCICIO
										,TablaAmortiDetalleConstantesFunciones.LABEL_IDPERIODO
										,TablaAmortiDetalleConstantesFunciones.LABEL_IDTASA
										,TablaAmortiDetalleConstantesFunciones.LABEL_IDFACTURA
										,TablaAmortiDetalleConstantesFunciones.LABEL_IDTIPOINTERVALO
										,TablaAmortiDetalleConstantesFunciones.LABEL_FECHAEMISION
										,TablaAmortiDetalleConstantesFunciones.LABEL_FECHAVENCIMIENTO
										,TablaAmortiDetalleConstantesFunciones.LABEL_FECHAINICIAL
										,TablaAmortiDetalleConstantesFunciones.LABEL_FECHAFINAL
										,TablaAmortiDetalleConstantesFunciones.LABEL_VALOR
										,TablaAmortiDetalleConstantesFunciones.LABEL_INTERES
										,TablaAmortiDetalleConstantesFunciones.LABEL_CAPITAL
										,TablaAmortiDetalleConstantesFunciones.LABEL_NUMEROCUOTA
										,TablaAmortiDetalleConstantesFunciones.LABEL_IDANIO
										,TablaAmortiDetalleConstantesFunciones.LABEL_IDMES
										};
	   
	    public List<TablaAmortiDetalle> tablaamortidetalles;
	  	 
	    //NO SE UTILIZA
	    public TablaAmortiDetalleModel(List<TablaAmortiDetalle> tablaamortidetalles,JInternalFrameBase jInternalFrameBase) {
	    	this.tablaamortidetalles=tablaamortidetalles;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public TablaAmortiDetalleModel(JInternalFrameBase jInternalFrameBase) {
	    	this.tablaamortidetalles=new ArrayList<TablaAmortiDetalle>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.tablaamortidetalles.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.tablaamortidetalles.get(rowIndex).getIsSelected();
	            
				case 1: return this.tablaamortidetalles.get(rowIndex).getId();
				case 2: return this.tablaamortidetalles.get(rowIndex).getid_empresa();
				case 3: return this.tablaamortidetalles.get(rowIndex).getid_sucursal();
				case 4: return this.tablaamortidetalles.get(rowIndex).getid_ejercicio();
				case 5: return this.tablaamortidetalles.get(rowIndex).getid_periodo();
				case 6: return this.tablaamortidetalles.get(rowIndex).getid_tasa();
				case 7: return this.tablaamortidetalles.get(rowIndex).getid_factura();
				case 8: return this.tablaamortidetalles.get(rowIndex).getid_tipo_intervalo();
				case 9: return this.tablaamortidetalles.get(rowIndex).getfecha_emision();
				case 10: return this.tablaamortidetalles.get(rowIndex).getfecha_vencimiento();
				case 11: return this.tablaamortidetalles.get(rowIndex).getfecha_inicial();
				case 12: return this.tablaamortidetalles.get(rowIndex).getfecha_final();
				case 13: return this.tablaamortidetalles.get(rowIndex).getvalor();
				case 14: return this.tablaamortidetalles.get(rowIndex).getinteres();
				case 15: return this.tablaamortidetalles.get(rowIndex).getcapital();
				case 16: return this.tablaamortidetalles.get(rowIndex).getnumero_cuotas();
				case 17: return this.tablaamortidetalles.get(rowIndex).getid_anio();
				case 18: return this.tablaamortidetalles.get(rowIndex).getid_mes();	            
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
				case 9: return Date.class;
				case 10: return Date.class;
				case 11: return Date.class;
				case 12: return Date.class;
				case 13: return Double.class;
				case 14: return Double.class;
				case 15: return Double.class;
				case 16: return Integer.class;
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
	    	TablaAmortiDetalle tablaamortidetalle = this.tablaamortidetalles.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			TablaAmortiDetalleBeanSwingJInternalFrame tablaamortidetalleBeanSwingJInternalFrame=(TablaAmortiDetalleBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {tablaamortidetalle.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {tablaamortidetalle.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {tablaamortidetalle.setid_empresa((Long) value);tablaamortidetalle.setempresa_descripcion(tablaamortidetalleBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {tablaamortidetalle.setid_sucursal((Long) value);tablaamortidetalle.setsucursal_descripcion(tablaamortidetalleBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {tablaamortidetalle.setid_ejercicio((Long) value);tablaamortidetalle.setejercicio_descripcion(tablaamortidetalleBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {tablaamortidetalle.setid_periodo((Long) value);tablaamortidetalle.setperiodo_descripcion(tablaamortidetalleBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {tablaamortidetalle.setid_tasa((Long) value);tablaamortidetalle.settasa_descripcion(tablaamortidetalleBeanSwingJInternalFrame.getActualTasaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {tablaamortidetalle.setid_factura((Long) value);tablaamortidetalle.setfactura_descripcion(tablaamortidetalleBeanSwingJInternalFrame.getActualFacturaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {tablaamortidetalle.setid_tipo_intervalo((Long) value);tablaamortidetalle.settipointervalo_descripcion(tablaamortidetalleBeanSwingJInternalFrame.getActualTipoIntervaloForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {tablaamortidetalle.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {tablaamortidetalle.setfecha_vencimiento((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {tablaamortidetalle.setfecha_inicial((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {tablaamortidetalle.setfecha_final((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {tablaamortidetalle.setvalor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {tablaamortidetalle.setinteres((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {tablaamortidetalle.setcapital((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {tablaamortidetalle.setnumero_cuotas((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {tablaamortidetalle.setid_anio((Long) value);tablaamortidetalle.setanio_descripcion(tablaamortidetalleBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {tablaamortidetalle.setid_mes((Long) value);tablaamortidetalle.setmes_descripcion(tablaamortidetalleBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public TablaAmortiDetalleModel(JInternalFrameBase jInternalFrameBase) {
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
		private TablaAmortiDetalleDetalleFormJInternalFrame tablaamortidetalleJInternalFrame=null;
		
		public TablaAmortiDetalleModel(TablaAmortiDetalleDetalleFormJInternalFrame tablaamortidetalleJInternalFrame) {
			this.tablaamortidetalleJInternalFrame=tablaamortidetalleJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.tablaamortidetalleJInternalFrame.getjButtonActualizarToolBarTablaAmortiDetalle();
			
			if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.getjButtonActualizarToolBarTablaAmortiDetalle())) {
				componentTab=this.tablaamortidetalleJInternalFrame.getjButtonEliminarToolBarTablaAmortiDetalle();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.getjButtonEliminarToolBarTablaAmortiDetalle())) {
				componentTab=this.tablaamortidetalleJInternalFrame.getjButtonCancelarToolBarTablaAmortiDetalle();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.getjButtonCancelarToolBarTablaAmortiDetalle())) {
				componentTab=this.tablaamortidetalleJInternalFrame.jComboBoxid_empresaTablaAmortiDetalle;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jComboBoxid_mesTablaAmortiDetalle)) {
				componentTab=this.tablaamortidetalleJInternalFrame.jComboBoxTiposAccionesFormularioTablaAmortiDetalle;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jComboBoxTiposAccionesFormularioTablaAmortiDetalle)) {
				componentTab=this.tablaamortidetalleJInternalFrame.jButtonEliminarTablaAmortiDetalle;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jButtonEliminarTablaAmortiDetalle)) {
				componentTab=this.tablaamortidetalleJInternalFrame.jButtonActualizarTablaAmortiDetalle;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jButtonActualizarTablaAmortiDetalle)) {
				componentTab=this.tablaamortidetalleJInternalFrame.jButtonCancelarTablaAmortiDetalle;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jComboBoxid_empresaTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jComboBoxid_sucursalTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jComboBoxid_sucursalTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jComboBoxid_ejercicioTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jComboBoxid_ejercicioTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jComboBoxid_periodoTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jComboBoxid_periodoTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jComboBoxid_tasaTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jComboBoxid_tasaTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jComboBoxid_facturaTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jComboBoxid_facturaTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jComboBoxid_tipo_intervaloTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jComboBoxid_tipo_intervaloTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jDateChooserfecha_emisionTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jDateChooserfecha_emisionTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jDateChooserfecha_vencimientoTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jDateChooserfecha_vencimientoTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jDateChooserfecha_inicialTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jDateChooserfecha_inicialTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jDateChooserfecha_finalTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jDateChooserfecha_finalTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jTextFieldvalorTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jTextFieldvalorTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jTextFieldinteresTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jTextFieldinteresTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jTextFieldcapitalTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jTextFieldcapitalTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jTextFieldnumero_cuotasTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jTextFieldnumero_cuotasTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jComboBoxid_anioTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jComboBoxid_anioTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jComboBoxid_mesTablaAmortiDetalle;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.tablaamortidetalleJInternalFrame.getjButtonActualizarToolBarTablaAmortiDetalle();
			
			if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.getjButtonEliminarToolBarTablaAmortiDetalle())) {
				componentTab=this.tablaamortidetalleJInternalFrame.getjButtonActualizarToolBarTablaAmortiDetalle();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.getjButtonCancelarToolBarTablaAmortiDetalle())) {
				componentTab=this.tablaamortidetalleJInternalFrame.getjButtonEliminarToolBarTablaAmortiDetalle();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jComboBoxid_empresaTablaAmortiDetalle)) {
				
				componentTab=this.tablaamortidetalleJInternalFrame.getjButtonCancelarToolBarTablaAmortiDetalle();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jComboBoxTiposAccionesFormularioTablaAmortiDetalle)) {
				componentTab=this.tablaamortidetalleJInternalFrame.jComboBoxid_mesTablaAmortiDetalle;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jButtonEliminarTablaAmortiDetalle)) {
				componentTab=this.tablaamortidetalleJInternalFrame.jComboBoxTiposAccionesFormularioTablaAmortiDetalle;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jButtonActualizarTablaAmortiDetalle)) {
				componentTab=this.tablaamortidetalleJInternalFrame.jButtonEliminarTablaAmortiDetalle;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jButtonCancelarTablaAmortiDetalle)) {
				componentTab=this.tablaamortidetalleJInternalFrame.jButtonActualizarTablaAmortiDetalle;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jComboBoxid_sucursalTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jComboBoxid_empresaTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jComboBoxid_ejercicioTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jComboBoxid_sucursalTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jComboBoxid_periodoTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jComboBoxid_ejercicioTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jComboBoxid_tasaTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jComboBoxid_periodoTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jComboBoxid_facturaTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jComboBoxid_tasaTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jComboBoxid_tipo_intervaloTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jComboBoxid_facturaTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jDateChooserfecha_emisionTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jComboBoxid_tipo_intervaloTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jDateChooserfecha_vencimientoTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jDateChooserfecha_emisionTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jDateChooserfecha_inicialTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jDateChooserfecha_vencimientoTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jDateChooserfecha_finalTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jDateChooserfecha_inicialTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jTextFieldvalorTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jDateChooserfecha_finalTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jTextFieldinteresTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jTextFieldvalorTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jTextFieldcapitalTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jTextFieldinteresTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jTextFieldnumero_cuotasTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jTextFieldcapitalTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jComboBoxid_anioTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jTextFieldnumero_cuotasTablaAmortiDetalle;
			return componentTab;
		}

		if(component!=null && component.equals(this.tablaamortidetalleJInternalFrame.jComboBoxid_mesTablaAmortiDetalle)) {
			componentTab=this.tablaamortidetalleJInternalFrame.jComboBoxid_anioTablaAmortiDetalle;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.tablaamortidetalleJInternalFrame.getjButtonActualizarToolBarTablaAmortiDetalle();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.tablaamortidetalleJInternalFrame.getjButtonActualizarToolBarTablaAmortiDetalle();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.tablaamortidetalleJInternalFrame.getjButtonCancelarToolBarTablaAmortiDetalle();
			
			
			return componentTab;		
		}
		
		public TablaAmortiDetalleDetalleFormJInternalFrame gettablaamortidetalleJInternalFrame() {
			return this.tablaamortidetalleJInternalFrame;
		}
		
		public void settablaamortidetalleJInternalFrame(TablaAmortiDetalleDetalleFormJInternalFrame tablaamortidetalleJInternalFrame) {
			this.tablaamortidetalleJInternalFrame=tablaamortidetalleJInternalFrame;
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
