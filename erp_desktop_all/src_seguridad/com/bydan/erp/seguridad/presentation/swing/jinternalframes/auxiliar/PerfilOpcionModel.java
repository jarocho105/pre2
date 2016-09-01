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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.seguridad.util.PerfilOpcionConstantesFunciones;
import com.bydan.erp.seguridad.util.PerfilOpcionParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.PerfilOpcionParameterGeneral;

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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.PerfilOpcionBeanSwingJInternalFrame;
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
import com.bydan.erp.seguridad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;








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


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.PerfilOpcionJInternalFrame;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.PerfilOpcionDetalleFormJInternalFrame;

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









@SuppressWarnings("unused")

public class PerfilOpcionModel extends FocusTraversalPolicy implements TableModel, Serializable {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,PerfilOpcionConstantesFunciones.LABEL_ID
										,PerfilOpcionConstantesFunciones.LABEL_IDSISTEMA
										,PerfilOpcionConstantesFunciones.LABEL_IDMODULO
										,PerfilOpcionConstantesFunciones.LABEL_IDGRUPOOPCION
										,PerfilOpcionConstantesFunciones.LABEL_IDPERFIL
										,PerfilOpcionConstantesFunciones.LABEL_IDOPCION
										,PerfilOpcionConstantesFunciones.LABEL_TODO
										,PerfilOpcionConstantesFunciones.LABEL_INGRESO
										,PerfilOpcionConstantesFunciones.LABEL_MODIFICACION
										,PerfilOpcionConstantesFunciones.LABEL_ELIMINACION
										,PerfilOpcionConstantesFunciones.LABEL_GUARDARCAMBIOS
										,PerfilOpcionConstantesFunciones.LABEL_CONSULTA
										,PerfilOpcionConstantesFunciones.LABEL_BUSQUEDA
										,PerfilOpcionConstantesFunciones.LABEL_REPORTE
										,PerfilOpcionConstantesFunciones.LABEL_ORDEN
										,PerfilOpcionConstantesFunciones.LABEL_PAGINACIONMEDIO
										,PerfilOpcionConstantesFunciones.LABEL_PAGINACIONALTO
										,PerfilOpcionConstantesFunciones.LABEL_PAGINACIONTODO
										,PerfilOpcionConstantesFunciones.LABEL_DUPLICAR
										,PerfilOpcionConstantesFunciones.LABEL_COPIAR
										,PerfilOpcionConstantesFunciones.LABEL_CONPRECARGAR
										,PerfilOpcionConstantesFunciones.LABEL_ESTADO
										};
	   
	    public List<PerfilOpcion> perfilopcions;
	  	 
	    //NO SE UTILIZA
	    public PerfilOpcionModel(List<PerfilOpcion> perfilopcions,JInternalFrameBase jInternalFrameBase) {
	    	this.perfilopcions=perfilopcions;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public PerfilOpcionModel(JInternalFrameBase jInternalFrameBase) {
	    	this.perfilopcions=new ArrayList<PerfilOpcion>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.perfilopcions.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.perfilopcions.get(rowIndex).getIsSelected();
	            
				case 1: return this.perfilopcions.get(rowIndex).getId();
				case 2: return this.perfilopcions.get(rowIndex).getid_sistema();
				case 3: return this.perfilopcions.get(rowIndex).getid_modulo();
				case 4: return this.perfilopcions.get(rowIndex).getid_grupo_opcion();
				case 5: return this.perfilopcions.get(rowIndex).getid_perfil();
				case 6: return this.perfilopcions.get(rowIndex).getid_opcion();
				case 7: return this.perfilopcions.get(rowIndex).gettodo();
				case 8: return this.perfilopcions.get(rowIndex).getingreso();
				case 9: return this.perfilopcions.get(rowIndex).getmodificacion();
				case 10: return this.perfilopcions.get(rowIndex).geteliminacion();
				case 11: return this.perfilopcions.get(rowIndex).getguardar_cambios();
				case 12: return this.perfilopcions.get(rowIndex).getconsulta();
				case 13: return this.perfilopcions.get(rowIndex).getbusqueda();
				case 14: return this.perfilopcions.get(rowIndex).getreporte();
				case 15: return this.perfilopcions.get(rowIndex).getorden();
				case 16: return this.perfilopcions.get(rowIndex).getpaginacion_medio();
				case 17: return this.perfilopcions.get(rowIndex).getpaginacion_alto();
				case 18: return this.perfilopcions.get(rowIndex).getpaginacion_todo();
				case 19: return this.perfilopcions.get(rowIndex).getduplicar();
				case 20: return this.perfilopcions.get(rowIndex).getcopiar();
				case 21: return this.perfilopcions.get(rowIndex).getcon_precargar();
				case 22: return this.perfilopcions.get(rowIndex).getestado();	            
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
				case 7: return Boolean.class;
				case 8: return Boolean.class;
				case 9: return Boolean.class;
				case 10: return Boolean.class;
				case 11: return Boolean.class;
				case 12: return Boolean.class;
				case 13: return Boolean.class;
				case 14: return Boolean.class;
				case 15: return Boolean.class;
				case 16: return Boolean.class;
				case 17: return Boolean.class;
				case 18: return Boolean.class;
				case 19: return Boolean.class;
				case 20: return Boolean.class;
				case 21: return Boolean.class;
				case 22: return Boolean.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	PerfilOpcion perfilopcion = this.perfilopcions.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			PerfilOpcionBeanSwingJInternalFrame perfilopcionBeanSwingJInternalFrame=(PerfilOpcionBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {perfilopcion.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {perfilopcion.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {perfilopcion.setid_sistema((Long) value);perfilopcion.setsistema_descripcion(perfilopcionBeanSwingJInternalFrame.getActualSistemaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {perfilopcion.setid_modulo((Long) value);perfilopcion.setmodulo_descripcion(perfilopcionBeanSwingJInternalFrame.getActualModuloForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {perfilopcion.setid_grupo_opcion((Long) value);perfilopcion.setgrupoopcion_descripcion(perfilopcionBeanSwingJInternalFrame.getActualGrupoOpcionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {perfilopcion.setid_perfil((Long) value);perfilopcion.setperfil_descripcion(perfilopcionBeanSwingJInternalFrame.getActualPerfilForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {perfilopcion.setid_opcion((Long) value);perfilopcion.setopcion_descripcion(perfilopcionBeanSwingJInternalFrame.getActualOpcionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {perfilopcion.settodo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {perfilopcion.setingreso((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {perfilopcion.setmodificacion((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {perfilopcion.seteliminacion((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {perfilopcion.setguardar_cambios((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {perfilopcion.setconsulta((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {perfilopcion.setbusqueda((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {perfilopcion.setreporte((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {perfilopcion.setorden((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {perfilopcion.setpaginacion_medio((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {perfilopcion.setpaginacion_alto((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {perfilopcion.setpaginacion_todo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {perfilopcion.setduplicar((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {perfilopcion.setcopiar((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {perfilopcion.setcon_precargar((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {perfilopcion.setestado((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private PerfilOpcionDetalleFormJInternalFrame perfilopcionJInternalFrame=null;
		
		public PerfilOpcionModel(PerfilOpcionDetalleFormJInternalFrame perfilopcionJInternalFrame) {
			this.perfilopcionJInternalFrame=perfilopcionJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.perfilopcionJInternalFrame.getjButtonActualizarToolBarPerfilOpcion();
			
			if(component!=null && component.equals(this.perfilopcionJInternalFrame.getjButtonActualizarToolBarPerfilOpcion())) {
				componentTab=this.perfilopcionJInternalFrame.getjButtonEliminarToolBarPerfilOpcion();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.perfilopcionJInternalFrame.getjButtonEliminarToolBarPerfilOpcion())) {
				componentTab=this.perfilopcionJInternalFrame.getjButtonCancelarToolBarPerfilOpcion();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.perfilopcionJInternalFrame.getjButtonCancelarToolBarPerfilOpcion())) {
				componentTab=this.perfilopcionJInternalFrame.jComboBoxid_sistemaPerfilOpcion;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxestadoPerfilOpcion)) {
				componentTab=this.perfilopcionJInternalFrame.jComboBoxTiposAccionesFormularioPerfilOpcion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.perfilopcionJInternalFrame.jComboBoxTiposAccionesFormularioPerfilOpcion)) {
				componentTab=this.perfilopcionJInternalFrame.jButtonEliminarPerfilOpcion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.perfilopcionJInternalFrame.jButtonEliminarPerfilOpcion)) {
				componentTab=this.perfilopcionJInternalFrame.jButtonActualizarPerfilOpcion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.perfilopcionJInternalFrame.jButtonActualizarPerfilOpcion)) {
				componentTab=this.perfilopcionJInternalFrame.jButtonCancelarPerfilOpcion;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jComboBoxid_sistemaPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jComboBoxid_moduloPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jComboBoxid_moduloPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jComboBoxid_grupo_opcionPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jComboBoxid_grupo_opcionPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jComboBoxid_perfilPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jComboBoxid_perfilPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jComboBoxid_opcionPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jComboBoxid_opcionPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxtodoPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxtodoPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxingresoPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxingresoPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxmodificacionPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxmodificacionPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxeliminacionPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxeliminacionPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxguardar_cambiosPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxguardar_cambiosPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxconsultaPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxconsultaPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxbusquedaPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxbusquedaPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxreportePerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxreportePerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxordenPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxordenPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxpaginacion_medioPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxpaginacion_medioPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxpaginacion_altoPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxpaginacion_altoPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxpaginacion_todoPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxpaginacion_todoPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxduplicarPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxduplicarPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxcopiarPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxcopiarPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxcon_precargarPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxcon_precargarPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxestadoPerfilOpcion;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.perfilopcionJInternalFrame.getjButtonActualizarToolBarPerfilOpcion();
			
			if(component!=null && component.equals(this.perfilopcionJInternalFrame.getjButtonEliminarToolBarPerfilOpcion())) {
				componentTab=this.perfilopcionJInternalFrame.getjButtonActualizarToolBarPerfilOpcion();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.perfilopcionJInternalFrame.getjButtonCancelarToolBarPerfilOpcion())) {
				componentTab=this.perfilopcionJInternalFrame.getjButtonEliminarToolBarPerfilOpcion();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.perfilopcionJInternalFrame.jComboBoxid_sistemaPerfilOpcion)) {
				
				componentTab=this.perfilopcionJInternalFrame.getjButtonCancelarToolBarPerfilOpcion();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.perfilopcionJInternalFrame.jComboBoxTiposAccionesFormularioPerfilOpcion)) {
				componentTab=this.perfilopcionJInternalFrame.jCheckBoxestadoPerfilOpcion;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.perfilopcionJInternalFrame.jButtonEliminarPerfilOpcion)) {
				componentTab=this.perfilopcionJInternalFrame.jComboBoxTiposAccionesFormularioPerfilOpcion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.perfilopcionJInternalFrame.jButtonActualizarPerfilOpcion)) {
				componentTab=this.perfilopcionJInternalFrame.jButtonEliminarPerfilOpcion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.perfilopcionJInternalFrame.jButtonCancelarPerfilOpcion)) {
				componentTab=this.perfilopcionJInternalFrame.jButtonActualizarPerfilOpcion;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jComboBoxid_moduloPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jComboBoxid_sistemaPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jComboBoxid_grupo_opcionPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jComboBoxid_moduloPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jComboBoxid_perfilPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jComboBoxid_grupo_opcionPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jComboBoxid_opcionPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jComboBoxid_perfilPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxtodoPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jComboBoxid_opcionPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxingresoPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxtodoPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxmodificacionPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxingresoPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxeliminacionPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxmodificacionPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxguardar_cambiosPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxeliminacionPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxconsultaPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxguardar_cambiosPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxbusquedaPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxconsultaPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxreportePerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxbusquedaPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxordenPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxreportePerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxpaginacion_medioPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxordenPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxpaginacion_altoPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxpaginacion_medioPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxpaginacion_todoPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxpaginacion_altoPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxduplicarPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxpaginacion_todoPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxcopiarPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxduplicarPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxcon_precargarPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxcopiarPerfilOpcion;
			return componentTab;
		}

		if(component!=null && component.equals(this.perfilopcionJInternalFrame.jCheckBoxestadoPerfilOpcion)) {
			componentTab=this.perfilopcionJInternalFrame.jCheckBoxcon_precargarPerfilOpcion;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.perfilopcionJInternalFrame.getjButtonActualizarToolBarPerfilOpcion();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.perfilopcionJInternalFrame.getjButtonActualizarToolBarPerfilOpcion();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.perfilopcionJInternalFrame.getjButtonCancelarToolBarPerfilOpcion();
			
			
			return componentTab;		
		}
		
		public PerfilOpcionDetalleFormJInternalFrame getperfilopcionJInternalFrame() {
			return this.perfilopcionJInternalFrame;
		}
		
		public void setperfilopcionJInternalFrame(PerfilOpcionDetalleFormJInternalFrame perfilopcionJInternalFrame) {
			this.perfilopcionJInternalFrame=perfilopcionJInternalFrame;
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
