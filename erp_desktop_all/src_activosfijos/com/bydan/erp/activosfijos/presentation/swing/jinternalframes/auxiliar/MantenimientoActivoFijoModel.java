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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.activosfijos.util.MantenimientoActivoFijoConstantesFunciones;
import com.bydan.erp.activosfijos.util.MantenimientoActivoFijoParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.MantenimientoActivoFijoParameterGeneral;

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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.MantenimientoActivoFijoBeanSwingJInternalFrame;
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
import com.bydan.erp.activosfijos.resources.reportes.AuxiliarReportes;


import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.activosfijos.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.MantenimientoActivoFijoJInternalFrame;

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.MantenimientoActivoFijoDetalleFormJInternalFrame;

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

public class MantenimientoActivoFijoModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,MantenimientoActivoFijoConstantesFunciones.LABEL_ID
										,MantenimientoActivoFijoConstantesFunciones.LABEL_IDEMPRESA
										,MantenimientoActivoFijoConstantesFunciones.LABEL_IDSUCURSAL
										,MantenimientoActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO
										,MantenimientoActivoFijoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO
										,MantenimientoActivoFijoConstantesFunciones.LABEL_NUMERODOCUMENTO
										,MantenimientoActivoFijoConstantesFunciones.LABEL_CAUSA
										,MantenimientoActivoFijoConstantesFunciones.LABEL_REFERENCIA
										,MantenimientoActivoFijoConstantesFunciones.LABEL_TALLER
										,MantenimientoActivoFijoConstantesFunciones.LABEL_TELEFONO
										,MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAINICIO
										,MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAENTREGA
										,MantenimientoActivoFijoConstantesFunciones.LABEL_COSTO
										,MantenimientoActivoFijoConstantesFunciones.LABEL_RESPONSABLE
										,MantenimientoActivoFijoConstantesFunciones.LABEL_OBSERVACION
										};
	   
	    public List<MantenimientoActivoFijo> mantenimientoactivofijos;
	  	 
	    //NO SE UTILIZA
	    public MantenimientoActivoFijoModel(List<MantenimientoActivoFijo> mantenimientoactivofijos,JInternalFrameBase jInternalFrameBase) {
	    	this.mantenimientoactivofijos=mantenimientoactivofijos;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public MantenimientoActivoFijoModel(JInternalFrameBase jInternalFrameBase) {
	    	this.mantenimientoactivofijos=new ArrayList<MantenimientoActivoFijo>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.mantenimientoactivofijos.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.mantenimientoactivofijos.get(rowIndex).getIsSelected();
	            
				case 1: return this.mantenimientoactivofijos.get(rowIndex).getId();
				case 2: return this.mantenimientoactivofijos.get(rowIndex).getid_empresa();
				case 3: return this.mantenimientoactivofijos.get(rowIndex).getid_sucursal();
				case 4: return this.mantenimientoactivofijos.get(rowIndex).getid_detalle_activo_fijo();
				case 5: return this.mantenimientoactivofijos.get(rowIndex).getid_tipo_movimiento();
				case 6: return this.mantenimientoactivofijos.get(rowIndex).getnumero_documento();
				case 7: return this.mantenimientoactivofijos.get(rowIndex).getcausa();
				case 8: return this.mantenimientoactivofijos.get(rowIndex).getreferencia();
				case 9: return this.mantenimientoactivofijos.get(rowIndex).gettaller();
				case 10: return this.mantenimientoactivofijos.get(rowIndex).gettelefono();
				case 11: return this.mantenimientoactivofijos.get(rowIndex).getfecha_inicio();
				case 12: return this.mantenimientoactivofijos.get(rowIndex).getfecha_entrega();
				case 13: return this.mantenimientoactivofijos.get(rowIndex).getcosto();
				case 14: return this.mantenimientoactivofijos.get(rowIndex).getresponsable();
				case 15: return this.mantenimientoactivofijos.get(rowIndex).getobservacion();	            
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
				case 6: return String.class;
				case 7: return String.class;
				case 8: return String.class;
				case 9: return String.class;
				case 10: return String.class;
				case 11: return Date.class;
				case 12: return Date.class;
				case 13: return Double.class;
				case 14: return String.class;
				case 15: return String.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	MantenimientoActivoFijo mantenimientoactivofijo = this.mantenimientoactivofijos.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			MantenimientoActivoFijoBeanSwingJInternalFrame mantenimientoactivofijoBeanSwingJInternalFrame=(MantenimientoActivoFijoBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {mantenimientoactivofijo.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {mantenimientoactivofijo.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {mantenimientoactivofijo.setid_empresa((Long) value);mantenimientoactivofijo.setempresa_descripcion(mantenimientoactivofijoBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {mantenimientoactivofijo.setid_sucursal((Long) value);mantenimientoactivofijo.setsucursal_descripcion(mantenimientoactivofijoBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {mantenimientoactivofijo.setid_detalle_activo_fijo((Long) value);mantenimientoactivofijo.setdetalleactivofijo_descripcion(mantenimientoactivofijoBeanSwingJInternalFrame.getActualDetalleActivoFijoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {mantenimientoactivofijo.setid_tipo_movimiento((Long) value);mantenimientoactivofijo.settipomovimiento_descripcion(mantenimientoactivofijoBeanSwingJInternalFrame.getActualTipoMovimientoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {mantenimientoactivofijo.setnumero_documento((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {mantenimientoactivofijo.setcausa((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {mantenimientoactivofijo.setreferencia((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {mantenimientoactivofijo.settaller((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {mantenimientoactivofijo.settelefono((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {mantenimientoactivofijo.setfecha_inicio((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {mantenimientoactivofijo.setfecha_entrega((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {mantenimientoactivofijo.setcosto((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {mantenimientoactivofijo.setresponsable((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {mantenimientoactivofijo.setobservacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public MantenimientoActivoFijoModel(JInternalFrameBase jInternalFrameBase) {
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
		private MantenimientoActivoFijoDetalleFormJInternalFrame mantenimientoactivofijoJInternalFrame=null;
		
		public MantenimientoActivoFijoModel(MantenimientoActivoFijoDetalleFormJInternalFrame mantenimientoactivofijoJInternalFrame) {
			this.mantenimientoactivofijoJInternalFrame=mantenimientoactivofijoJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.mantenimientoactivofijoJInternalFrame.getjButtonActualizarToolBarMantenimientoActivoFijo();
			
			if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.getjButtonActualizarToolBarMantenimientoActivoFijo())) {
				componentTab=this.mantenimientoactivofijoJInternalFrame.getjButtonEliminarToolBarMantenimientoActivoFijo();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.getjButtonEliminarToolBarMantenimientoActivoFijo())) {
				componentTab=this.mantenimientoactivofijoJInternalFrame.getjButtonCancelarToolBarMantenimientoActivoFijo();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.getjButtonCancelarToolBarMantenimientoActivoFijo())) {
				componentTab=this.mantenimientoactivofijoJInternalFrame.jComboBoxid_empresaMantenimientoActivoFijo;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jTextAreaobservacionMantenimientoActivoFijo)) {
				componentTab=this.mantenimientoactivofijoJInternalFrame.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo)) {
				componentTab=this.mantenimientoactivofijoJInternalFrame.jButtonEliminarMantenimientoActivoFijo;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jButtonEliminarMantenimientoActivoFijo)) {
				componentTab=this.mantenimientoactivofijoJInternalFrame.jButtonActualizarMantenimientoActivoFijo;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jButtonActualizarMantenimientoActivoFijo)) {
				componentTab=this.mantenimientoactivofijoJInternalFrame.jButtonCancelarMantenimientoActivoFijo;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jComboBoxid_empresaMantenimientoActivoFijo)) {
			componentTab=this.mantenimientoactivofijoJInternalFrame.jComboBoxid_sucursalMantenimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jComboBoxid_sucursalMantenimientoActivoFijo)) {
			componentTab=this.mantenimientoactivofijoJInternalFrame.jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo)) {
			componentTab=this.mantenimientoactivofijoJInternalFrame.jComboBoxid_tipo_movimientoMantenimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jComboBoxid_tipo_movimientoMantenimientoActivoFijo)) {
			componentTab=this.mantenimientoactivofijoJInternalFrame.jTextFieldnumero_documentoMantenimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jTextFieldnumero_documentoMantenimientoActivoFijo)) {
			componentTab=this.mantenimientoactivofijoJInternalFrame.jTextAreacausaMantenimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jTextAreacausaMantenimientoActivoFijo)) {
			componentTab=this.mantenimientoactivofijoJInternalFrame.jTextAreareferenciaMantenimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jTextAreareferenciaMantenimientoActivoFijo)) {
			componentTab=this.mantenimientoactivofijoJInternalFrame.jTextAreatallerMantenimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jTextAreatallerMantenimientoActivoFijo)) {
			componentTab=this.mantenimientoactivofijoJInternalFrame.jTextAreatelefonoMantenimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jTextAreatelefonoMantenimientoActivoFijo)) {
			componentTab=this.mantenimientoactivofijoJInternalFrame.jDateChooserfecha_inicioMantenimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jDateChooserfecha_inicioMantenimientoActivoFijo)) {
			componentTab=this.mantenimientoactivofijoJInternalFrame.jDateChooserfecha_entregaMantenimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jDateChooserfecha_entregaMantenimientoActivoFijo)) {
			componentTab=this.mantenimientoactivofijoJInternalFrame.jTextFieldcostoMantenimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jTextFieldcostoMantenimientoActivoFijo)) {
			componentTab=this.mantenimientoactivofijoJInternalFrame.jTextArearesponsableMantenimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jTextArearesponsableMantenimientoActivoFijo)) {
			componentTab=this.mantenimientoactivofijoJInternalFrame.jTextAreaobservacionMantenimientoActivoFijo;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.mantenimientoactivofijoJInternalFrame.getjButtonActualizarToolBarMantenimientoActivoFijo();
			
			if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.getjButtonEliminarToolBarMantenimientoActivoFijo())) {
				componentTab=this.mantenimientoactivofijoJInternalFrame.getjButtonActualizarToolBarMantenimientoActivoFijo();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.getjButtonCancelarToolBarMantenimientoActivoFijo())) {
				componentTab=this.mantenimientoactivofijoJInternalFrame.getjButtonEliminarToolBarMantenimientoActivoFijo();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jComboBoxid_empresaMantenimientoActivoFijo)) {
				
				componentTab=this.mantenimientoactivofijoJInternalFrame.getjButtonCancelarToolBarMantenimientoActivoFijo();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo)) {
				componentTab=this.mantenimientoactivofijoJInternalFrame.jTextAreaobservacionMantenimientoActivoFijo;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jButtonEliminarMantenimientoActivoFijo)) {
				componentTab=this.mantenimientoactivofijoJInternalFrame.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jButtonActualizarMantenimientoActivoFijo)) {
				componentTab=this.mantenimientoactivofijoJInternalFrame.jButtonEliminarMantenimientoActivoFijo;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jButtonCancelarMantenimientoActivoFijo)) {
				componentTab=this.mantenimientoactivofijoJInternalFrame.jButtonActualizarMantenimientoActivoFijo;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jComboBoxid_sucursalMantenimientoActivoFijo)) {
			componentTab=this.mantenimientoactivofijoJInternalFrame.jComboBoxid_empresaMantenimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo)) {
			componentTab=this.mantenimientoactivofijoJInternalFrame.jComboBoxid_sucursalMantenimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jComboBoxid_tipo_movimientoMantenimientoActivoFijo)) {
			componentTab=this.mantenimientoactivofijoJInternalFrame.jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jTextFieldnumero_documentoMantenimientoActivoFijo)) {
			componentTab=this.mantenimientoactivofijoJInternalFrame.jComboBoxid_tipo_movimientoMantenimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jTextAreacausaMantenimientoActivoFijo)) {
			componentTab=this.mantenimientoactivofijoJInternalFrame.jTextFieldnumero_documentoMantenimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jTextAreareferenciaMantenimientoActivoFijo)) {
			componentTab=this.mantenimientoactivofijoJInternalFrame.jTextAreacausaMantenimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jTextAreatallerMantenimientoActivoFijo)) {
			componentTab=this.mantenimientoactivofijoJInternalFrame.jTextAreareferenciaMantenimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jTextAreatelefonoMantenimientoActivoFijo)) {
			componentTab=this.mantenimientoactivofijoJInternalFrame.jTextAreatallerMantenimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jDateChooserfecha_inicioMantenimientoActivoFijo)) {
			componentTab=this.mantenimientoactivofijoJInternalFrame.jTextAreatelefonoMantenimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jDateChooserfecha_entregaMantenimientoActivoFijo)) {
			componentTab=this.mantenimientoactivofijoJInternalFrame.jDateChooserfecha_inicioMantenimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jTextFieldcostoMantenimientoActivoFijo)) {
			componentTab=this.mantenimientoactivofijoJInternalFrame.jDateChooserfecha_entregaMantenimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jTextArearesponsableMantenimientoActivoFijo)) {
			componentTab=this.mantenimientoactivofijoJInternalFrame.jTextFieldcostoMantenimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.mantenimientoactivofijoJInternalFrame.jTextAreaobservacionMantenimientoActivoFijo)) {
			componentTab=this.mantenimientoactivofijoJInternalFrame.jTextArearesponsableMantenimientoActivoFijo;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.mantenimientoactivofijoJInternalFrame.getjButtonActualizarToolBarMantenimientoActivoFijo();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.mantenimientoactivofijoJInternalFrame.getjButtonActualizarToolBarMantenimientoActivoFijo();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.mantenimientoactivofijoJInternalFrame.getjButtonCancelarToolBarMantenimientoActivoFijo();
			
			
			return componentTab;		
		}
		
		public MantenimientoActivoFijoDetalleFormJInternalFrame getmantenimientoactivofijoJInternalFrame() {
			return this.mantenimientoactivofijoJInternalFrame;
		}
		
		public void setmantenimientoactivofijoJInternalFrame(MantenimientoActivoFijoDetalleFormJInternalFrame mantenimientoactivofijoJInternalFrame) {
			this.mantenimientoactivofijoJInternalFrame=mantenimientoactivofijoJInternalFrame;
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
