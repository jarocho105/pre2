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

import com.bydan.erp.seguridad.util.EmpresaConstantesFunciones;
import com.bydan.erp.seguridad.util.EmpresaParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.EmpresaParameterGeneral;

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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.EmpresaBeanSwingJInternalFrame;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.EmpresaJInternalFrame;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.EmpresaDetalleFormJInternalFrame;

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

public class EmpresaModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,EmpresaConstantesFunciones.LABEL_ID
										,EmpresaConstantesFunciones.LABEL_IDPAIS
										,EmpresaConstantesFunciones.LABEL_IDCIUDAD
										,EmpresaConstantesFunciones.LABEL_IDTIPOEMPRESA
										,EmpresaConstantesFunciones.LABEL_NOMBRE
										,EmpresaConstantesFunciones.LABEL_DIRECCION
										,EmpresaConstantesFunciones.LABEL_RUC
										,EmpresaConstantesFunciones.LABEL_MAIL
										,EmpresaConstantesFunciones.LABEL_TELEFONO
										,EmpresaConstantesFunciones.LABEL_FAX
										,EmpresaConstantesFunciones.LABEL_CODIGOPOSTAL
										,EmpresaConstantesFunciones.LABEL_IVA
										,EmpresaConstantesFunciones.LABEL_ACTIVIDADPRINCIPAL
										,EmpresaConstantesFunciones.LABEL_ACTIVIDADSECUNDARIA
										,EmpresaConstantesFunciones.LABEL_CONTADORNOMBRE
										,EmpresaConstantesFunciones.LABEL_CONTADORRUC
										,EmpresaConstantesFunciones.LABEL_CONTADORLICENCIA
										,EmpresaConstantesFunciones.LABEL_REPRESENTANTENOMBRE
										,EmpresaConstantesFunciones.LABEL_REPRESENTANTECEDULA
										};
	   
	    public List<Empresa> empresas;
	  	 
	    //NO SE UTILIZA
	    public EmpresaModel(List<Empresa> empresas,JInternalFrameBase jInternalFrameBase) {
	    	this.empresas=empresas;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public EmpresaModel(JInternalFrameBase jInternalFrameBase) {
	    	this.empresas=new ArrayList<Empresa>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.empresas.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.empresas.get(rowIndex).getIsSelected();
	            
				case 1: return this.empresas.get(rowIndex).getId();
				case 2: return this.empresas.get(rowIndex).getid_pais();
				case 3: return this.empresas.get(rowIndex).getid_ciudad();
				case 4: return this.empresas.get(rowIndex).getid_tipo_empresa();
				case 5: return this.empresas.get(rowIndex).getnombre();
				case 6: return this.empresas.get(rowIndex).getdireccion();
				case 7: return this.empresas.get(rowIndex).getruc();
				case 8: return this.empresas.get(rowIndex).getmail();
				case 9: return this.empresas.get(rowIndex).gettelefono();
				case 10: return this.empresas.get(rowIndex).getfax();
				case 11: return this.empresas.get(rowIndex).getcodigo_postal();
				case 12: return this.empresas.get(rowIndex).getiva();
				case 13: return this.empresas.get(rowIndex).getactividad_principal();
				case 14: return this.empresas.get(rowIndex).getactividad_secundaria();
				case 15: return this.empresas.get(rowIndex).getcontador_nombre();
				case 16: return this.empresas.get(rowIndex).getcontador_ruc();
				case 17: return this.empresas.get(rowIndex).getcontador_licencia();
				case 18: return this.empresas.get(rowIndex).getrepresentante_nombre();
				case 19: return this.empresas.get(rowIndex).getrepresentante_cedula();	            
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
				case 5: return String.class;
				case 6: return String.class;
				case 7: return String.class;
				case 8: return String.class;
				case 9: return String.class;
				case 10: return String.class;
				case 11: return String.class;
				case 12: return Double.class;
				case 13: return String.class;
				case 14: return String.class;
				case 15: return String.class;
				case 16: return String.class;
				case 17: return String.class;
				case 18: return String.class;
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
	    	Empresa empresa = this.empresas.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame=(EmpresaBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {empresa.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {empresa.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {empresa.setid_pais((Long) value);empresa.setpais_descripcion(empresaBeanSwingJInternalFrame.getActualPaisForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {empresa.setid_ciudad((Long) value);empresa.setciudad_descripcion(empresaBeanSwingJInternalFrame.getActualCiudadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {empresa.setid_tipo_empresa((Long) value);empresa.settipoempresa_descripcion(empresaBeanSwingJInternalFrame.getActualTipoEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {empresa.setnombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {empresa.setdireccion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {empresa.setruc((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {empresa.setmail((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {empresa.settelefono((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {empresa.setfax((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {empresa.setcodigo_postal((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {empresa.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {empresa.setactividad_principal((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {empresa.setactividad_secundaria((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {empresa.setcontador_nombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {empresa.setcontador_ruc((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {empresa.setcontador_licencia((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {empresa.setrepresentante_nombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {empresa.setrepresentante_cedula((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public EmpresaModel(JInternalFrameBase jInternalFrameBase) {
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
		private EmpresaDetalleFormJInternalFrame empresaJInternalFrame=null;
		
		public EmpresaModel(EmpresaDetalleFormJInternalFrame empresaJInternalFrame) {
			this.empresaJInternalFrame=empresaJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.empresaJInternalFrame.getjButtonActualizarToolBarEmpresa();
			
			if(component!=null && component.equals(this.empresaJInternalFrame.getjButtonActualizarToolBarEmpresa())) {
				componentTab=this.empresaJInternalFrame.getjButtonEliminarToolBarEmpresa();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.empresaJInternalFrame.getjButtonEliminarToolBarEmpresa())) {
				componentTab=this.empresaJInternalFrame.getjButtonCancelarToolBarEmpresa();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.empresaJInternalFrame.getjButtonCancelarToolBarEmpresa())) {
				componentTab=this.empresaJInternalFrame.jComboBoxid_paisEmpresa;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.empresaJInternalFrame.jTextFieldrepresentante_cedulaEmpresa)) {
				componentTab=this.empresaJInternalFrame.jComboBoxTiposAccionesFormularioEmpresa;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.empresaJInternalFrame.jComboBoxTiposAccionesFormularioEmpresa)) {
				componentTab=this.empresaJInternalFrame.jButtonEliminarEmpresa;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.empresaJInternalFrame.jButtonEliminarEmpresa)) {
				componentTab=this.empresaJInternalFrame.jButtonActualizarEmpresa;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.empresaJInternalFrame.jButtonActualizarEmpresa)) {
				componentTab=this.empresaJInternalFrame.jButtonCancelarEmpresa;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.empresaJInternalFrame.jComboBoxid_paisEmpresa)) {
			componentTab=this.empresaJInternalFrame.jComboBoxid_ciudadEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jComboBoxid_ciudadEmpresa)) {
			componentTab=this.empresaJInternalFrame.jComboBoxid_tipo_empresaEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jComboBoxid_tipo_empresaEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextAreanombreEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextAreanombreEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextAreadireccionEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextAreadireccionEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextFieldrucEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextFieldrucEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextAreamailEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextAreamailEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextFieldtelefonoEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextFieldtelefonoEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextFieldfaxEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextFieldfaxEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextFieldcodigo_postalEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextFieldcodigo_postalEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextFieldivaEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextFieldivaEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextAreaactividad_principalEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextAreaactividad_principalEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextAreaactividad_secundariaEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextAreaactividad_secundariaEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextAreacontador_nombreEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextAreacontador_nombreEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextFieldcontador_rucEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextFieldcontador_rucEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextFieldcontador_licenciaEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextFieldcontador_licenciaEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextArearepresentante_nombreEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextArearepresentante_nombreEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextFieldrepresentante_cedulaEmpresa;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.empresaJInternalFrame.getjButtonActualizarToolBarEmpresa();
			
			if(component!=null && component.equals(this.empresaJInternalFrame.getjButtonEliminarToolBarEmpresa())) {
				componentTab=this.empresaJInternalFrame.getjButtonActualizarToolBarEmpresa();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.empresaJInternalFrame.getjButtonCancelarToolBarEmpresa())) {
				componentTab=this.empresaJInternalFrame.getjButtonEliminarToolBarEmpresa();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.empresaJInternalFrame.jComboBoxid_paisEmpresa)) {
				
				componentTab=this.empresaJInternalFrame.getjButtonCancelarToolBarEmpresa();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.empresaJInternalFrame.jComboBoxTiposAccionesFormularioEmpresa)) {
				componentTab=this.empresaJInternalFrame.jTextFieldrepresentante_cedulaEmpresa;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.empresaJInternalFrame.jButtonEliminarEmpresa)) {
				componentTab=this.empresaJInternalFrame.jComboBoxTiposAccionesFormularioEmpresa;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.empresaJInternalFrame.jButtonActualizarEmpresa)) {
				componentTab=this.empresaJInternalFrame.jButtonEliminarEmpresa;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.empresaJInternalFrame.jButtonCancelarEmpresa)) {
				componentTab=this.empresaJInternalFrame.jButtonActualizarEmpresa;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.empresaJInternalFrame.jComboBoxid_ciudadEmpresa)) {
			componentTab=this.empresaJInternalFrame.jComboBoxid_paisEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jComboBoxid_tipo_empresaEmpresa)) {
			componentTab=this.empresaJInternalFrame.jComboBoxid_ciudadEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextAreanombreEmpresa)) {
			componentTab=this.empresaJInternalFrame.jComboBoxid_tipo_empresaEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextAreadireccionEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextAreanombreEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextFieldrucEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextAreadireccionEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextAreamailEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextFieldrucEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextFieldtelefonoEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextAreamailEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextFieldfaxEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextFieldtelefonoEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextFieldcodigo_postalEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextFieldfaxEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextFieldivaEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextFieldcodigo_postalEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextAreaactividad_principalEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextFieldivaEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextAreaactividad_secundariaEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextAreaactividad_principalEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextAreacontador_nombreEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextAreaactividad_secundariaEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextFieldcontador_rucEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextAreacontador_nombreEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextFieldcontador_licenciaEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextFieldcontador_rucEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextArearepresentante_nombreEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextFieldcontador_licenciaEmpresa;
			return componentTab;
		}

		if(component!=null && component.equals(this.empresaJInternalFrame.jTextFieldrepresentante_cedulaEmpresa)) {
			componentTab=this.empresaJInternalFrame.jTextArearepresentante_nombreEmpresa;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.empresaJInternalFrame.getjButtonActualizarToolBarEmpresa();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.empresaJInternalFrame.getjButtonActualizarToolBarEmpresa();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.empresaJInternalFrame.getjButtonCancelarToolBarEmpresa();
			
			
			return componentTab;		
		}
		
		public EmpresaDetalleFormJInternalFrame getempresaJInternalFrame() {
			return this.empresaJInternalFrame;
		}
		
		public void setempresaJInternalFrame(EmpresaDetalleFormJInternalFrame empresaJInternalFrame) {
			this.empresaJInternalFrame=empresaJInternalFrame;
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
