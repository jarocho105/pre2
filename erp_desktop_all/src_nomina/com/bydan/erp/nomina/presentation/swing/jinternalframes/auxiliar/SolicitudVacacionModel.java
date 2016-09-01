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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.nomina.util.SolicitudVacacionConstantesFunciones;
import com.bydan.erp.nomina.util.SolicitudVacacionParameterReturnGeneral;
//import com.bydan.erp.nomina.util.SolicitudVacacionParameterGeneral;

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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.SolicitudVacacionBeanSwingJInternalFrame;
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
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.SolicitudVacacionJInternalFrame;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.SolicitudVacacionDetalleFormJInternalFrame;

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

public class SolicitudVacacionModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,SolicitudVacacionConstantesFunciones.LABEL_ID
										,SolicitudVacacionConstantesFunciones.LABEL_IDEMPRESA
										,SolicitudVacacionConstantesFunciones.LABEL_IDSUCURSAL
										,SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADOJEFE
										,SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADO
										,SolicitudVacacionConstantesFunciones.LABEL_IDESTRUCTURA
										,SolicitudVacacionConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI
										,SolicitudVacacionConstantesFunciones.LABEL_IDFORMATO
										,SolicitudVacacionConstantesFunciones.LABEL_SECUENCIAL
										,SolicitudVacacionConstantesFunciones.LABEL_FECHASOLICITA
										,SolicitudVacacionConstantesFunciones.LABEL_FECHAEJECUTA
										,SolicitudVacacionConstantesFunciones.LABEL_NUMEROHORAS
										,SolicitudVacacionConstantesFunciones.LABEL_COSTOUNITARIO
										,SolicitudVacacionConstantesFunciones.LABEL_COSTOTOTAL
										,SolicitudVacacionConstantesFunciones.LABEL_DESCRIPCION
										};
	   
	    public List<SolicitudVacacion> solicitudvacacions;
	  	 
	    //NO SE UTILIZA
	    public SolicitudVacacionModel(List<SolicitudVacacion> solicitudvacacions,JInternalFrameBase jInternalFrameBase) {
	    	this.solicitudvacacions=solicitudvacacions;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public SolicitudVacacionModel(JInternalFrameBase jInternalFrameBase) {
	    	this.solicitudvacacions=new ArrayList<SolicitudVacacion>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.solicitudvacacions.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.solicitudvacacions.get(rowIndex).getIsSelected();
	            
				case 1: return this.solicitudvacacions.get(rowIndex).getId();
				case 2: return this.solicitudvacacions.get(rowIndex).getid_empresa();
				case 3: return this.solicitudvacacions.get(rowIndex).getid_sucursal();
				case 4: return this.solicitudvacacions.get(rowIndex).getid_empleado_jefe();
				case 5: return this.solicitudvacacions.get(rowIndex).getid_empleado();
				case 6: return this.solicitudvacacions.get(rowIndex).getid_estructura();
				case 7: return this.solicitudvacacions.get(rowIndex).getid_estado_solicitud_nomi();
				case 8: return this.solicitudvacacions.get(rowIndex).getid_formato();
				case 9: return this.solicitudvacacions.get(rowIndex).getsecuencial();
				case 10: return this.solicitudvacacions.get(rowIndex).getfecha_solicita();
				case 11: return this.solicitudvacacions.get(rowIndex).getfecha_ejecuta();
				case 12: return this.solicitudvacacions.get(rowIndex).getnumero_horas();
				case 13: return this.solicitudvacacions.get(rowIndex).getcosto_unitario();
				case 14: return this.solicitudvacacions.get(rowIndex).getcosto_total();
				case 15: return this.solicitudvacacions.get(rowIndex).getdescripcion();	            
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
				case 9: return String.class;
				case 10: return Date.class;
				case 11: return Date.class;
				case 12: return Integer.class;
				case 13: return Double.class;
				case 14: return Double.class;
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
	    	SolicitudVacacion solicitudvacacion = this.solicitudvacacions.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			SolicitudVacacionBeanSwingJInternalFrame solicitudvacacionBeanSwingJInternalFrame=(SolicitudVacacionBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {solicitudvacacion.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {solicitudvacacion.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {solicitudvacacion.setid_empresa((Long) value);solicitudvacacion.setempresa_descripcion(solicitudvacacionBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {solicitudvacacion.setid_sucursal((Long) value);solicitudvacacion.setsucursal_descripcion(solicitudvacacionBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {solicitudvacacion.setid_empleado_jefe((Long) value);solicitudvacacion.setempleadojefe_descripcion(solicitudvacacionBeanSwingJInternalFrame.getActualEmpleadoJefeForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {solicitudvacacion.setid_empleado((Long) value);solicitudvacacion.setempleado_descripcion(solicitudvacacionBeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {solicitudvacacion.setid_estructura((Long) value);solicitudvacacion.setestructura_descripcion(solicitudvacacionBeanSwingJInternalFrame.getActualEstructuraForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {solicitudvacacion.setid_estado_solicitud_nomi((Long) value);solicitudvacacion.setestadosolicitudnomi_descripcion(solicitudvacacionBeanSwingJInternalFrame.getActualEstadoSolicitudNomiForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {solicitudvacacion.setid_formato((Long) value);solicitudvacacion.setformato_descripcion(solicitudvacacionBeanSwingJInternalFrame.getActualFormatoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {solicitudvacacion.setsecuencial((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {solicitudvacacion.setfecha_solicita((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {solicitudvacacion.setfecha_ejecuta((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {solicitudvacacion.setnumero_horas((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {solicitudvacacion.setcosto_unitario((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {solicitudvacacion.setcosto_total((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {solicitudvacacion.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public SolicitudVacacionModel(JInternalFrameBase jInternalFrameBase) {
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
		private SolicitudVacacionDetalleFormJInternalFrame solicitudvacacionJInternalFrame=null;
		
		public SolicitudVacacionModel(SolicitudVacacionDetalleFormJInternalFrame solicitudvacacionJInternalFrame) {
			this.solicitudvacacionJInternalFrame=solicitudvacacionJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.solicitudvacacionJInternalFrame.getjButtonActualizarToolBarSolicitudVacacion();
			
			if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.getjButtonActualizarToolBarSolicitudVacacion())) {
				componentTab=this.solicitudvacacionJInternalFrame.getjButtonEliminarToolBarSolicitudVacacion();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.getjButtonEliminarToolBarSolicitudVacacion())) {
				componentTab=this.solicitudvacacionJInternalFrame.getjButtonCancelarToolBarSolicitudVacacion();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.getjButtonCancelarToolBarSolicitudVacacion())) {
				componentTab=this.solicitudvacacionJInternalFrame.jComboBoxid_empresaSolicitudVacacion;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jTextAreadescripcionSolicitudVacacion)) {
				componentTab=this.solicitudvacacionJInternalFrame.jComboBoxTiposAccionesFormularioSolicitudVacacion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jComboBoxTiposAccionesFormularioSolicitudVacacion)) {
				componentTab=this.solicitudvacacionJInternalFrame.jButtonEliminarSolicitudVacacion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jButtonEliminarSolicitudVacacion)) {
				componentTab=this.solicitudvacacionJInternalFrame.jButtonActualizarSolicitudVacacion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jButtonActualizarSolicitudVacacion)) {
				componentTab=this.solicitudvacacionJInternalFrame.jButtonCancelarSolicitudVacacion;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jComboBoxid_empresaSolicitudVacacion)) {
			componentTab=this.solicitudvacacionJInternalFrame.jComboBoxid_sucursalSolicitudVacacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jComboBoxid_sucursalSolicitudVacacion)) {
			componentTab=this.solicitudvacacionJInternalFrame.jComboBoxid_empleado_jefeSolicitudVacacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jComboBoxid_empleado_jefeSolicitudVacacion)) {
			componentTab=this.solicitudvacacionJInternalFrame.jComboBoxid_empleadoSolicitudVacacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jComboBoxid_empleadoSolicitudVacacion)) {
			componentTab=this.solicitudvacacionJInternalFrame.jComboBoxid_estructuraSolicitudVacacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jComboBoxid_estructuraSolicitudVacacion)) {
			componentTab=this.solicitudvacacionJInternalFrame.jComboBoxid_estado_solicitud_nomiSolicitudVacacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jComboBoxid_estado_solicitud_nomiSolicitudVacacion)) {
			componentTab=this.solicitudvacacionJInternalFrame.jComboBoxid_formatoSolicitudVacacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jComboBoxid_formatoSolicitudVacacion)) {
			componentTab=this.solicitudvacacionJInternalFrame.jTextFieldsecuencialSolicitudVacacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jTextFieldsecuencialSolicitudVacacion)) {
			componentTab=this.solicitudvacacionJInternalFrame.jDateChooserfecha_solicitaSolicitudVacacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jDateChooserfecha_solicitaSolicitudVacacion)) {
			componentTab=this.solicitudvacacionJInternalFrame.jDateChooserfecha_ejecutaSolicitudVacacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jDateChooserfecha_ejecutaSolicitudVacacion)) {
			componentTab=this.solicitudvacacionJInternalFrame.jTextFieldnumero_horasSolicitudVacacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jTextFieldnumero_horasSolicitudVacacion)) {
			componentTab=this.solicitudvacacionJInternalFrame.jTextFieldcosto_unitarioSolicitudVacacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jTextFieldcosto_unitarioSolicitudVacacion)) {
			componentTab=this.solicitudvacacionJInternalFrame.jTextFieldcosto_totalSolicitudVacacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jTextFieldcosto_totalSolicitudVacacion)) {
			componentTab=this.solicitudvacacionJInternalFrame.jTextAreadescripcionSolicitudVacacion;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.solicitudvacacionJInternalFrame.getjButtonActualizarToolBarSolicitudVacacion();
			
			if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.getjButtonEliminarToolBarSolicitudVacacion())) {
				componentTab=this.solicitudvacacionJInternalFrame.getjButtonActualizarToolBarSolicitudVacacion();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.getjButtonCancelarToolBarSolicitudVacacion())) {
				componentTab=this.solicitudvacacionJInternalFrame.getjButtonEliminarToolBarSolicitudVacacion();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jComboBoxid_empresaSolicitudVacacion)) {
				
				componentTab=this.solicitudvacacionJInternalFrame.getjButtonCancelarToolBarSolicitudVacacion();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jComboBoxTiposAccionesFormularioSolicitudVacacion)) {
				componentTab=this.solicitudvacacionJInternalFrame.jTextAreadescripcionSolicitudVacacion;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jButtonEliminarSolicitudVacacion)) {
				componentTab=this.solicitudvacacionJInternalFrame.jComboBoxTiposAccionesFormularioSolicitudVacacion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jButtonActualizarSolicitudVacacion)) {
				componentTab=this.solicitudvacacionJInternalFrame.jButtonEliminarSolicitudVacacion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jButtonCancelarSolicitudVacacion)) {
				componentTab=this.solicitudvacacionJInternalFrame.jButtonActualizarSolicitudVacacion;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jComboBoxid_sucursalSolicitudVacacion)) {
			componentTab=this.solicitudvacacionJInternalFrame.jComboBoxid_empresaSolicitudVacacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jComboBoxid_empleado_jefeSolicitudVacacion)) {
			componentTab=this.solicitudvacacionJInternalFrame.jComboBoxid_sucursalSolicitudVacacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jComboBoxid_empleadoSolicitudVacacion)) {
			componentTab=this.solicitudvacacionJInternalFrame.jComboBoxid_empleado_jefeSolicitudVacacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jComboBoxid_estructuraSolicitudVacacion)) {
			componentTab=this.solicitudvacacionJInternalFrame.jComboBoxid_empleadoSolicitudVacacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jComboBoxid_estado_solicitud_nomiSolicitudVacacion)) {
			componentTab=this.solicitudvacacionJInternalFrame.jComboBoxid_estructuraSolicitudVacacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jComboBoxid_formatoSolicitudVacacion)) {
			componentTab=this.solicitudvacacionJInternalFrame.jComboBoxid_estado_solicitud_nomiSolicitudVacacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jTextFieldsecuencialSolicitudVacacion)) {
			componentTab=this.solicitudvacacionJInternalFrame.jComboBoxid_formatoSolicitudVacacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jDateChooserfecha_solicitaSolicitudVacacion)) {
			componentTab=this.solicitudvacacionJInternalFrame.jTextFieldsecuencialSolicitudVacacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jDateChooserfecha_ejecutaSolicitudVacacion)) {
			componentTab=this.solicitudvacacionJInternalFrame.jDateChooserfecha_solicitaSolicitudVacacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jTextFieldnumero_horasSolicitudVacacion)) {
			componentTab=this.solicitudvacacionJInternalFrame.jDateChooserfecha_ejecutaSolicitudVacacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jTextFieldcosto_unitarioSolicitudVacacion)) {
			componentTab=this.solicitudvacacionJInternalFrame.jTextFieldnumero_horasSolicitudVacacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jTextFieldcosto_totalSolicitudVacacion)) {
			componentTab=this.solicitudvacacionJInternalFrame.jTextFieldcosto_unitarioSolicitudVacacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.solicitudvacacionJInternalFrame.jTextAreadescripcionSolicitudVacacion)) {
			componentTab=this.solicitudvacacionJInternalFrame.jTextFieldcosto_totalSolicitudVacacion;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.solicitudvacacionJInternalFrame.getjButtonActualizarToolBarSolicitudVacacion();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.solicitudvacacionJInternalFrame.getjButtonActualizarToolBarSolicitudVacacion();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.solicitudvacacionJInternalFrame.getjButtonCancelarToolBarSolicitudVacacion();
			
			
			return componentTab;		
		}
		
		public SolicitudVacacionDetalleFormJInternalFrame getsolicitudvacacionJInternalFrame() {
			return this.solicitudvacacionJInternalFrame;
		}
		
		public void setsolicitudvacacionJInternalFrame(SolicitudVacacionDetalleFormJInternalFrame solicitudvacacionJInternalFrame) {
			this.solicitudvacacionJInternalFrame=solicitudvacacionJInternalFrame;
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
