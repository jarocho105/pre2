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

import com.bydan.erp.inventario.util.MensajeCorreoInvenConstantesFunciones;
import com.bydan.erp.inventario.util.MensajeCorreoInvenParameterReturnGeneral;
//import com.bydan.erp.inventario.util.MensajeCorreoInvenParameterGeneral;

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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.MensajeCorreoInvenBeanSwingJInternalFrame;
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

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;






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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.MensajeCorreoInvenJInternalFrame;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.MensajeCorreoInvenDetalleFormJInternalFrame;

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


import com.bydan.erp.seguridad.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class MensajeCorreoInvenModel extends FocusTraversalPolicy implements TableModel, Serializable {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,MensajeCorreoInvenConstantesFunciones.LABEL_ID
										,MensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA
										,MensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL
										,MensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO
										,MensajeCorreoInvenConstantesFunciones.LABEL_IDTIPOMENSAJECORREOINVEN
										,MensajeCorreoInvenConstantesFunciones.LABEL_TEMA
										,MensajeCorreoInvenConstantesFunciones.LABEL_MENSAJE
										,MensajeCorreoInvenConstantesFunciones.LABEL_AVISO
										,MensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO
										};
	   
	    public List<MensajeCorreoInven> mensajecorreoinvens;
	  	 
	    //NO SE UTILIZA
	    public MensajeCorreoInvenModel(List<MensajeCorreoInven> mensajecorreoinvens,JInternalFrameBase jInternalFrameBase) {
	    	this.mensajecorreoinvens=mensajecorreoinvens;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public MensajeCorreoInvenModel(JInternalFrameBase jInternalFrameBase) {
	    	this.mensajecorreoinvens=new ArrayList<MensajeCorreoInven>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.mensajecorreoinvens.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.mensajecorreoinvens.get(rowIndex).getIsSelected();
	            
				case 1: return this.mensajecorreoinvens.get(rowIndex).getId();
				case 2: return this.mensajecorreoinvens.get(rowIndex).getid_empresa();
				case 3: return this.mensajecorreoinvens.get(rowIndex).getid_sucursal();
				case 4: return this.mensajecorreoinvens.get(rowIndex).getid_modulo();
				case 5: return this.mensajecorreoinvens.get(rowIndex).getid_tipo_mensaje_correo_inven();
				case 6: return this.mensajecorreoinvens.get(rowIndex).gettema();
				case 7: return this.mensajecorreoinvens.get(rowIndex).getmensaje();
				case 8: return this.mensajecorreoinvens.get(rowIndex).getaviso();
				case 9: return this.mensajecorreoinvens.get(rowIndex).getesta_activo();	            
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
				case 9: return Boolean.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	MensajeCorreoInven mensajecorreoinven = this.mensajecorreoinvens.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			MensajeCorreoInvenBeanSwingJInternalFrame mensajecorreoinvenBeanSwingJInternalFrame=(MensajeCorreoInvenBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {mensajecorreoinven.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {mensajecorreoinven.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {mensajecorreoinven.setid_empresa((Long) value);mensajecorreoinven.setempresa_descripcion(mensajecorreoinvenBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {mensajecorreoinven.setid_sucursal((Long) value);mensajecorreoinven.setsucursal_descripcion(mensajecorreoinvenBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {mensajecorreoinven.setid_modulo((Long) value);mensajecorreoinven.setmodulo_descripcion(mensajecorreoinvenBeanSwingJInternalFrame.getActualModuloForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {mensajecorreoinven.setid_tipo_mensaje_correo_inven((Long) value);mensajecorreoinven.settipomensajecorreoinven_descripcion(mensajecorreoinvenBeanSwingJInternalFrame.getActualTipoMensajeCorreoInvenForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {mensajecorreoinven.settema((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {mensajecorreoinven.setmensaje((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {mensajecorreoinven.setaviso((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {mensajecorreoinven.setesta_activo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private MensajeCorreoInvenDetalleFormJInternalFrame mensajecorreoinvenJInternalFrame=null;
		
		public MensajeCorreoInvenModel(MensajeCorreoInvenDetalleFormJInternalFrame mensajecorreoinvenJInternalFrame) {
			this.mensajecorreoinvenJInternalFrame=mensajecorreoinvenJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.mensajecorreoinvenJInternalFrame.getjButtonActualizarToolBarMensajeCorreoInven();
			
			if(component!=null && component.equals(this.mensajecorreoinvenJInternalFrame.getjButtonActualizarToolBarMensajeCorreoInven())) {
				componentTab=this.mensajecorreoinvenJInternalFrame.getjButtonEliminarToolBarMensajeCorreoInven();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.mensajecorreoinvenJInternalFrame.getjButtonEliminarToolBarMensajeCorreoInven())) {
				componentTab=this.mensajecorreoinvenJInternalFrame.getjButtonCancelarToolBarMensajeCorreoInven();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.mensajecorreoinvenJInternalFrame.getjButtonCancelarToolBarMensajeCorreoInven())) {
				componentTab=this.mensajecorreoinvenJInternalFrame.jComboBoxid_empresaMensajeCorreoInven;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.mensajecorreoinvenJInternalFrame.jCheckBoxesta_activoMensajeCorreoInven)) {
				componentTab=this.mensajecorreoinvenJInternalFrame.jComboBoxTiposAccionesFormularioMensajeCorreoInven;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.mensajecorreoinvenJInternalFrame.jComboBoxTiposAccionesFormularioMensajeCorreoInven)) {
				componentTab=this.mensajecorreoinvenJInternalFrame.jButtonEliminarMensajeCorreoInven;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.mensajecorreoinvenJInternalFrame.jButtonEliminarMensajeCorreoInven)) {
				componentTab=this.mensajecorreoinvenJInternalFrame.jButtonActualizarMensajeCorreoInven;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.mensajecorreoinvenJInternalFrame.jButtonActualizarMensajeCorreoInven)) {
				componentTab=this.mensajecorreoinvenJInternalFrame.jButtonCancelarMensajeCorreoInven;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.mensajecorreoinvenJInternalFrame.jComboBoxid_empresaMensajeCorreoInven)) {
			componentTab=this.mensajecorreoinvenJInternalFrame.jComboBoxid_sucursalMensajeCorreoInven;
			return componentTab;
		}

		if(component!=null && component.equals(this.mensajecorreoinvenJInternalFrame.jComboBoxid_sucursalMensajeCorreoInven)) {
			componentTab=this.mensajecorreoinvenJInternalFrame.jComboBoxid_moduloMensajeCorreoInven;
			return componentTab;
		}

		if(component!=null && component.equals(this.mensajecorreoinvenJInternalFrame.jComboBoxid_moduloMensajeCorreoInven)) {
			componentTab=this.mensajecorreoinvenJInternalFrame.jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven;
			return componentTab;
		}

		if(component!=null && component.equals(this.mensajecorreoinvenJInternalFrame.jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven)) {
			componentTab=this.mensajecorreoinvenJInternalFrame.jTextAreatemaMensajeCorreoInven;
			return componentTab;
		}

		if(component!=null && component.equals(this.mensajecorreoinvenJInternalFrame.jTextAreatemaMensajeCorreoInven)) {
			componentTab=this.mensajecorreoinvenJInternalFrame.jTextAreamensajeMensajeCorreoInven;
			return componentTab;
		}

		if(component!=null && component.equals(this.mensajecorreoinvenJInternalFrame.jTextAreamensajeMensajeCorreoInven)) {
			componentTab=this.mensajecorreoinvenJInternalFrame.jTextAreaavisoMensajeCorreoInven;
			return componentTab;
		}

		if(component!=null && component.equals(this.mensajecorreoinvenJInternalFrame.jTextAreaavisoMensajeCorreoInven)) {
			componentTab=this.mensajecorreoinvenJInternalFrame.jCheckBoxesta_activoMensajeCorreoInven;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.mensajecorreoinvenJInternalFrame.getjButtonActualizarToolBarMensajeCorreoInven();
			
			if(component!=null && component.equals(this.mensajecorreoinvenJInternalFrame.getjButtonEliminarToolBarMensajeCorreoInven())) {
				componentTab=this.mensajecorreoinvenJInternalFrame.getjButtonActualizarToolBarMensajeCorreoInven();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.mensajecorreoinvenJInternalFrame.getjButtonCancelarToolBarMensajeCorreoInven())) {
				componentTab=this.mensajecorreoinvenJInternalFrame.getjButtonEliminarToolBarMensajeCorreoInven();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.mensajecorreoinvenJInternalFrame.jComboBoxid_empresaMensajeCorreoInven)) {
				
				componentTab=this.mensajecorreoinvenJInternalFrame.getjButtonCancelarToolBarMensajeCorreoInven();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.mensajecorreoinvenJInternalFrame.jComboBoxTiposAccionesFormularioMensajeCorreoInven)) {
				componentTab=this.mensajecorreoinvenJInternalFrame.jCheckBoxesta_activoMensajeCorreoInven;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.mensajecorreoinvenJInternalFrame.jButtonEliminarMensajeCorreoInven)) {
				componentTab=this.mensajecorreoinvenJInternalFrame.jComboBoxTiposAccionesFormularioMensajeCorreoInven;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.mensajecorreoinvenJInternalFrame.jButtonActualizarMensajeCorreoInven)) {
				componentTab=this.mensajecorreoinvenJInternalFrame.jButtonEliminarMensajeCorreoInven;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.mensajecorreoinvenJInternalFrame.jButtonCancelarMensajeCorreoInven)) {
				componentTab=this.mensajecorreoinvenJInternalFrame.jButtonActualizarMensajeCorreoInven;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.mensajecorreoinvenJInternalFrame.jComboBoxid_sucursalMensajeCorreoInven)) {
			componentTab=this.mensajecorreoinvenJInternalFrame.jComboBoxid_empresaMensajeCorreoInven;
			return componentTab;
		}

		if(component!=null && component.equals(this.mensajecorreoinvenJInternalFrame.jComboBoxid_moduloMensajeCorreoInven)) {
			componentTab=this.mensajecorreoinvenJInternalFrame.jComboBoxid_sucursalMensajeCorreoInven;
			return componentTab;
		}

		if(component!=null && component.equals(this.mensajecorreoinvenJInternalFrame.jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven)) {
			componentTab=this.mensajecorreoinvenJInternalFrame.jComboBoxid_moduloMensajeCorreoInven;
			return componentTab;
		}

		if(component!=null && component.equals(this.mensajecorreoinvenJInternalFrame.jTextAreatemaMensajeCorreoInven)) {
			componentTab=this.mensajecorreoinvenJInternalFrame.jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven;
			return componentTab;
		}

		if(component!=null && component.equals(this.mensajecorreoinvenJInternalFrame.jTextAreamensajeMensajeCorreoInven)) {
			componentTab=this.mensajecorreoinvenJInternalFrame.jTextAreatemaMensajeCorreoInven;
			return componentTab;
		}

		if(component!=null && component.equals(this.mensajecorreoinvenJInternalFrame.jTextAreaavisoMensajeCorreoInven)) {
			componentTab=this.mensajecorreoinvenJInternalFrame.jTextAreamensajeMensajeCorreoInven;
			return componentTab;
		}

		if(component!=null && component.equals(this.mensajecorreoinvenJInternalFrame.jCheckBoxesta_activoMensajeCorreoInven)) {
			componentTab=this.mensajecorreoinvenJInternalFrame.jTextAreaavisoMensajeCorreoInven;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.mensajecorreoinvenJInternalFrame.getjButtonActualizarToolBarMensajeCorreoInven();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.mensajecorreoinvenJInternalFrame.getjButtonActualizarToolBarMensajeCorreoInven();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.mensajecorreoinvenJInternalFrame.getjButtonCancelarToolBarMensajeCorreoInven();
			
			
			return componentTab;		
		}
		
		public MensajeCorreoInvenDetalleFormJInternalFrame getmensajecorreoinvenJInternalFrame() {
			return this.mensajecorreoinvenJInternalFrame;
		}
		
		public void setmensajecorreoinvenJInternalFrame(MensajeCorreoInvenDetalleFormJInternalFrame mensajecorreoinvenJInternalFrame) {
			this.mensajecorreoinvenJInternalFrame=mensajecorreoinvenJInternalFrame;
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
