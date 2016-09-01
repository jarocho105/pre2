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

import com.bydan.erp.seguridad.util.UsuarioConstantesFunciones;
import com.bydan.erp.seguridad.util.UsuarioParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.UsuarioParameterGeneral;

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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.UsuarioBeanSwingJInternalFrame;
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

import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
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


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.UsuarioJInternalFrame;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.UsuarioDetalleFormJInternalFrame;

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



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;


import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.activosfijos.util.*;


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class UsuarioModel extends FocusTraversalPolicy implements TableModel, Serializable {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,UsuarioConstantesFunciones.LABEL_ID
										,UsuarioConstantesFunciones.LABEL_IDEMPRESA
										,UsuarioConstantesFunciones.LABEL_USERNAME
										,UsuarioConstantesFunciones.LABEL_CLAVE
										,UsuarioConstantesFunciones.LABEL_CONFIRMARCLAVE
										,UsuarioConstantesFunciones.LABEL_NOMBRE
										,UsuarioConstantesFunciones.LABEL_CODIGOALTERNO
										,UsuarioConstantesFunciones.LABEL_TIPO
										,UsuarioConstantesFunciones.LABEL_ESTADO
										};
	   
	    public List<Usuario> usuarios;
	  	 
	    //NO SE UTILIZA
	    public UsuarioModel(List<Usuario> usuarios,JInternalFrameBase jInternalFrameBase) {
	    	this.usuarios=usuarios;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public UsuarioModel(JInternalFrameBase jInternalFrameBase) {
	    	this.usuarios=new ArrayList<Usuario>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.usuarios.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.usuarios.get(rowIndex).getIsSelected();
	            
				case 1: return this.usuarios.get(rowIndex).getId();
				case 2: return this.usuarios.get(rowIndex).getid_empresa();
				case 3: return this.usuarios.get(rowIndex).getuser_name();
				case 4: return this.usuarios.get(rowIndex).getclave();
				case 5: return this.usuarios.get(rowIndex).getconfirmar_clave();
				case 6: return this.usuarios.get(rowIndex).getnombre();
				case 7: return this.usuarios.get(rowIndex).getcodigo_alterno();
				case 8: return this.usuarios.get(rowIndex).gettipo();
				case 9: return this.usuarios.get(rowIndex).getestado();	            
	            default: return null;
	        }
	    }
	 
	    @Override
	    public Class<?> getColumnClass(int columnIndex) {
	    	switch (columnIndex) {
				case 0: return Boolean.class;
	            
				case 1: return Long.class;
				case 2: return Long.class;
				case 3: return String.class;
				case 4: return String.class;
				case 5: return String.class;
				case 6: return String.class;
				case 7: return String.class;
				case 8: return Boolean.class;
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
	    	Usuario usuario = this.usuarios.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame=(UsuarioBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {usuario.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {usuario.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {usuario.setid_empresa((Long) value);usuario.setempresa_descripcion(usuarioBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {usuario.setuser_name((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {usuario.setclave((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {usuario.setconfirmar_clave((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {usuario.setnombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {usuario.setcodigo_alterno((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {usuario.settipo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {usuario.setestado((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private UsuarioDetalleFormJInternalFrame usuarioJInternalFrame=null;
		
		public UsuarioModel(UsuarioDetalleFormJInternalFrame usuarioJInternalFrame) {
			this.usuarioJInternalFrame=usuarioJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.usuarioJInternalFrame.getjButtonActualizarToolBarUsuario();
			
			if(component!=null && component.equals(this.usuarioJInternalFrame.getjButtonActualizarToolBarUsuario())) {
				componentTab=this.usuarioJInternalFrame.getjButtonEliminarToolBarUsuario();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.usuarioJInternalFrame.getjButtonEliminarToolBarUsuario())) {
				componentTab=this.usuarioJInternalFrame.getjButtonCancelarToolBarUsuario();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.usuarioJInternalFrame.getjButtonCancelarToolBarUsuario())) {
				componentTab=this.usuarioJInternalFrame.jComboBoxid_empresaUsuario;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.usuarioJInternalFrame.jCheckBoxestadoUsuario)) {
				componentTab=this.usuarioJInternalFrame.jComboBoxTiposAccionesFormularioUsuario;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.usuarioJInternalFrame.jComboBoxTiposAccionesFormularioUsuario)) {
				componentTab=this.usuarioJInternalFrame.jButtonEliminarUsuario;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.usuarioJInternalFrame.jButtonEliminarUsuario)) {
				componentTab=this.usuarioJInternalFrame.jButtonActualizarUsuario;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.usuarioJInternalFrame.jButtonActualizarUsuario)) {
				componentTab=this.usuarioJInternalFrame.jButtonCancelarUsuario;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.usuarioJInternalFrame.jComboBoxid_empresaUsuario)) {
			componentTab=this.usuarioJInternalFrame.jTextFielduser_nameUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.usuarioJInternalFrame.jTextFielduser_nameUsuario)) {
			componentTab=this.usuarioJInternalFrame.jTextAreaclaveUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.usuarioJInternalFrame.jTextAreaclaveUsuario)) {
			componentTab=this.usuarioJInternalFrame.jTextAreaconfirmar_claveUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.usuarioJInternalFrame.jTextAreaconfirmar_claveUsuario)) {
			componentTab=this.usuarioJInternalFrame.jTextAreanombreUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.usuarioJInternalFrame.jTextAreanombreUsuario)) {
			componentTab=this.usuarioJInternalFrame.jTextFieldcodigo_alternoUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.usuarioJInternalFrame.jTextFieldcodigo_alternoUsuario)) {
			componentTab=this.usuarioJInternalFrame.jCheckBoxtipoUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.usuarioJInternalFrame.jCheckBoxtipoUsuario)) {
			componentTab=this.usuarioJInternalFrame.jCheckBoxestadoUsuario;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.usuarioJInternalFrame.getjButtonActualizarToolBarUsuario();
			
			if(component!=null && component.equals(this.usuarioJInternalFrame.getjButtonEliminarToolBarUsuario())) {
				componentTab=this.usuarioJInternalFrame.getjButtonActualizarToolBarUsuario();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.usuarioJInternalFrame.getjButtonCancelarToolBarUsuario())) {
				componentTab=this.usuarioJInternalFrame.getjButtonEliminarToolBarUsuario();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.usuarioJInternalFrame.jComboBoxid_empresaUsuario)) {
				
				componentTab=this.usuarioJInternalFrame.getjButtonCancelarToolBarUsuario();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.usuarioJInternalFrame.jComboBoxTiposAccionesFormularioUsuario)) {
				componentTab=this.usuarioJInternalFrame.jCheckBoxestadoUsuario;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.usuarioJInternalFrame.jButtonEliminarUsuario)) {
				componentTab=this.usuarioJInternalFrame.jComboBoxTiposAccionesFormularioUsuario;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.usuarioJInternalFrame.jButtonActualizarUsuario)) {
				componentTab=this.usuarioJInternalFrame.jButtonEliminarUsuario;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.usuarioJInternalFrame.jButtonCancelarUsuario)) {
				componentTab=this.usuarioJInternalFrame.jButtonActualizarUsuario;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.usuarioJInternalFrame.jTextFielduser_nameUsuario)) {
			componentTab=this.usuarioJInternalFrame.jComboBoxid_empresaUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.usuarioJInternalFrame.jTextAreaclaveUsuario)) {
			componentTab=this.usuarioJInternalFrame.jTextFielduser_nameUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.usuarioJInternalFrame.jTextAreaconfirmar_claveUsuario)) {
			componentTab=this.usuarioJInternalFrame.jTextAreaclaveUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.usuarioJInternalFrame.jTextAreanombreUsuario)) {
			componentTab=this.usuarioJInternalFrame.jTextAreaconfirmar_claveUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.usuarioJInternalFrame.jTextFieldcodigo_alternoUsuario)) {
			componentTab=this.usuarioJInternalFrame.jTextAreanombreUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.usuarioJInternalFrame.jCheckBoxtipoUsuario)) {
			componentTab=this.usuarioJInternalFrame.jTextFieldcodigo_alternoUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.usuarioJInternalFrame.jCheckBoxestadoUsuario)) {
			componentTab=this.usuarioJInternalFrame.jCheckBoxtipoUsuario;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.usuarioJInternalFrame.getjButtonActualizarToolBarUsuario();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.usuarioJInternalFrame.getjButtonActualizarToolBarUsuario();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.usuarioJInternalFrame.getjButtonCancelarToolBarUsuario();
			
			
			return componentTab;		
		}
		
		public UsuarioDetalleFormJInternalFrame getusuarioJInternalFrame() {
			return this.usuarioJInternalFrame;
		}
		
		public void setusuarioJInternalFrame(UsuarioDetalleFormJInternalFrame usuarioJInternalFrame) {
			this.usuarioJInternalFrame=usuarioJInternalFrame;
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
