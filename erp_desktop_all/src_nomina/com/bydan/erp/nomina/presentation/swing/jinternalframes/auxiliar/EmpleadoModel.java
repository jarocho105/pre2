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

import com.bydan.erp.nomina.util.EmpleadoConstantesFunciones;
import com.bydan.erp.nomina.util.EmpleadoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.EmpleadoParameterGeneral;

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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.EmpleadoBeanSwingJInternalFrame;
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
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;






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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.EmpleadoJInternalFrame;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.EmpleadoDetalleFormJInternalFrame;

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
import com.bydan.erp.cartera.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class EmpleadoModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,EmpleadoConstantesFunciones.LABEL_ID
										,EmpleadoConstantesFunciones.LABEL_IDEMPRESA
										,EmpleadoConstantesFunciones.LABEL_IDSUCURSAL
										,EmpleadoConstantesFunciones.LABEL_IDPAIS
										,EmpleadoConstantesFunciones.LABEL_IDPROVINCIA
										,EmpleadoConstantesFunciones.LABEL_IDCIUDAD
										,EmpleadoConstantesFunciones.LABEL_IDCENTROCOSTO
										,EmpleadoConstantesFunciones.LABEL_IDRELIGION
										,EmpleadoConstantesFunciones.LABEL_IDESTADOCIVIL
										,EmpleadoConstantesFunciones.LABEL_IDTIPOGENERO
										,EmpleadoConstantesFunciones.LABEL_IDTIPOEMPLEADO
										,EmpleadoConstantesFunciones.LABEL_IDTIPOINSTRUCCION
										,EmpleadoConstantesFunciones.LABEL_IDCARGO
										,EmpleadoConstantesFunciones.LABEL_IDESTRUCTURA
										,EmpleadoConstantesFunciones.LABEL_IDESTRUCTURASECCION
										,EmpleadoConstantesFunciones.LABEL_IDESTADOEMPLEADO
										,EmpleadoConstantesFunciones.LABEL_IDTIPOCONTRATO
										,EmpleadoConstantesFunciones.LABEL_CODIGO
										,EmpleadoConstantesFunciones.LABEL_NOMBRE
										,EmpleadoConstantesFunciones.LABEL_APELLIDO
										,EmpleadoConstantesFunciones.LABEL_NOMBRECOMPLETO
										,EmpleadoConstantesFunciones.LABEL_MAIL
										,EmpleadoConstantesFunciones.LABEL_DIRECCION
										,EmpleadoConstantesFunciones.LABEL_SUELDO
										,EmpleadoConstantesFunciones.LABEL_TELEFONO
										,EmpleadoConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL
										,EmpleadoConstantesFunciones.LABEL_NUMEROCUENTA
										,EmpleadoConstantesFunciones.LABEL_TIENECASA
										,EmpleadoConstantesFunciones.LABEL_TIENEVEHICULO
										};
	   
	    public List<Empleado> empleados;
	  	 
	    //NO SE UTILIZA
	    public EmpleadoModel(List<Empleado> empleados,JInternalFrameBase jInternalFrameBase) {
	    	this.empleados=empleados;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public EmpleadoModel(JInternalFrameBase jInternalFrameBase) {
	    	this.empleados=new ArrayList<Empleado>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.empleados.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.empleados.get(rowIndex).getIsSelected();
	            
				case 1: return this.empleados.get(rowIndex).getId();
				case 2: return this.empleados.get(rowIndex).getid_empresa();
				case 3: return this.empleados.get(rowIndex).getid_sucursal();
				case 4: return this.empleados.get(rowIndex).getid_pais();
				case 5: return this.empleados.get(rowIndex).getid_provincia();
				case 6: return this.empleados.get(rowIndex).getid_ciudad();
				case 7: return this.empleados.get(rowIndex).getid_centro_costo();
				case 8: return this.empleados.get(rowIndex).getid_religion();
				case 9: return this.empleados.get(rowIndex).getid_estado_civil();
				case 10: return this.empleados.get(rowIndex).getid_tipo_genero();
				case 11: return this.empleados.get(rowIndex).getid_tipo_empleado();
				case 12: return this.empleados.get(rowIndex).getid_tipo_instruccion();
				case 13: return this.empleados.get(rowIndex).getid_cargo();
				case 14: return this.empleados.get(rowIndex).getid_estructura();
				case 15: return this.empleados.get(rowIndex).getid_estructura_seccion();
				case 16: return this.empleados.get(rowIndex).getid_estado_empleado();
				case 17: return this.empleados.get(rowIndex).getid_tipo_contrato();
				case 18: return this.empleados.get(rowIndex).getcodigo();
				case 19: return this.empleados.get(rowIndex).getnombre();
				case 20: return this.empleados.get(rowIndex).getapellido();
				case 21: return this.empleados.get(rowIndex).getnombre_completo();
				case 22: return this.empleados.get(rowIndex).getmail();
				case 23: return this.empleados.get(rowIndex).getdireccion();
				case 24: return this.empleados.get(rowIndex).getsueldo();
				case 25: return this.empleados.get(rowIndex).gettelefono();
				case 26: return this.empleados.get(rowIndex).getid_tipo_cuenta_banco_global();
				case 27: return this.empleados.get(rowIndex).getnumero_cuenta();
				case 28: return this.empleados.get(rowIndex).gettiene_casa();
				case 29: return this.empleados.get(rowIndex).gettiene_vehiculo();	            
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
				case 13: return Long.class;
				case 14: return Long.class;
				case 15: return Long.class;
				case 16: return Long.class;
				case 17: return Long.class;
				case 18: return String.class;
				case 19: return String.class;
				case 20: return String.class;
				case 21: return String.class;
				case 22: return String.class;
				case 23: return String.class;
				case 24: return Double.class;
				case 25: return String.class;
				case 26: return Long.class;
				case 27: return String.class;
				case 28: return Boolean.class;
				case 29: return Boolean.class;	            
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
				case 23: return true;
				case 24: return true;
				case 25: return true;
				case 26: return true;
				case 27: return true;
				case 28: return true;
				case 29: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	Empleado empleado = this.empleados.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame=(EmpleadoBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {empleado.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {empleado.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {empleado.setid_empresa((Long) value);empleado.setempresa_descripcion(empleadoBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {empleado.setid_sucursal((Long) value);empleado.setsucursal_descripcion(empleadoBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {empleado.setid_pais((Long) value);empleado.setpais_descripcion(empleadoBeanSwingJInternalFrame.getActualPaisForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {empleado.setid_provincia((Long) value);empleado.setprovincia_descripcion(empleadoBeanSwingJInternalFrame.getActualProvinciaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {empleado.setid_ciudad((Long) value);empleado.setciudad_descripcion(empleadoBeanSwingJInternalFrame.getActualCiudadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {empleado.setid_centro_costo((Long) value);empleado.setcentrocosto_descripcion(empleadoBeanSwingJInternalFrame.getActualCentroCostoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {empleado.setid_religion((Long) value);empleado.setreligion_descripcion(empleadoBeanSwingJInternalFrame.getActualReligionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {empleado.setid_estado_civil((Long) value);empleado.setestadocivil_descripcion(empleadoBeanSwingJInternalFrame.getActualEstadoCivilForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {empleado.setid_tipo_genero((Long) value);empleado.settipogenero_descripcion(empleadoBeanSwingJInternalFrame.getActualTipoGeneroForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {empleado.setid_tipo_empleado((Long) value);empleado.settipoempleado_descripcion(empleadoBeanSwingJInternalFrame.getActualTipoEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {empleado.setid_tipo_instruccion((Long) value);empleado.settipoinstruccion_descripcion(empleadoBeanSwingJInternalFrame.getActualTipoInstruccionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {empleado.setid_cargo((Long) value);empleado.setcargo_descripcion(empleadoBeanSwingJInternalFrame.getActualCargoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {empleado.setid_estructura((Long) value);empleado.setestructura_descripcion(empleadoBeanSwingJInternalFrame.getActualEstructuraForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {empleado.setid_estructura_seccion((Long) value);empleado.setestructuraseccion_descripcion(empleadoBeanSwingJInternalFrame.getActualEstructuraSeccionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {empleado.setid_estado_empleado((Long) value);empleado.setestadoempleado_descripcion(empleadoBeanSwingJInternalFrame.getActualEstadoEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {empleado.setid_tipo_contrato((Long) value);empleado.settipocontrato_descripcion(empleadoBeanSwingJInternalFrame.getActualTipoContratoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {empleado.setcodigo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {empleado.setnombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {empleado.setapellido((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {empleado.setnombre_completo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {empleado.setmail((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {empleado.setdireccion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {empleado.setsueldo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {empleado.settelefono((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {empleado.setid_tipo_cuenta_banco_global((Long) value);empleado.settipocuentabancoglobal_descripcion(empleadoBeanSwingJInternalFrame.getActualTipoCuentaBancoGlobalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {empleado.setnumero_cuenta((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {empleado.settiene_casa((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {empleado.settiene_vehiculo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public EmpleadoModel(JInternalFrameBase jInternalFrameBase) {
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
		private EmpleadoDetalleFormJInternalFrame empleadoJInternalFrame=null;
		
		public EmpleadoModel(EmpleadoDetalleFormJInternalFrame empleadoJInternalFrame) {
			this.empleadoJInternalFrame=empleadoJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.empleadoJInternalFrame.getjButtonActualizarToolBarEmpleado();
			
			if(component!=null && component.equals(this.empleadoJInternalFrame.getjButtonActualizarToolBarEmpleado())) {
				componentTab=this.empleadoJInternalFrame.getjButtonEliminarToolBarEmpleado();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.empleadoJInternalFrame.getjButtonEliminarToolBarEmpleado())) {
				componentTab=this.empleadoJInternalFrame.getjButtonCancelarToolBarEmpleado();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.empleadoJInternalFrame.getjButtonCancelarToolBarEmpleado())) {
				componentTab=this.empleadoJInternalFrame.jComboBoxid_empresaEmpleado;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.empleadoJInternalFrame.jCheckBoxtiene_vehiculoEmpleado)) {
				componentTab=this.empleadoJInternalFrame.jComboBoxTiposAccionesFormularioEmpleado;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxTiposAccionesFormularioEmpleado)) {
				componentTab=this.empleadoJInternalFrame.jButtonEliminarEmpleado;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.empleadoJInternalFrame.jButtonEliminarEmpleado)) {
				componentTab=this.empleadoJInternalFrame.jButtonActualizarEmpleado;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.empleadoJInternalFrame.jButtonActualizarEmpleado)) {
				componentTab=this.empleadoJInternalFrame.jButtonCancelarEmpleado;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_empresaEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_sucursalEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_sucursalEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_paisEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_paisEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_provinciaEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_provinciaEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_ciudadEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_ciudadEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_centro_costoEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_centro_costoEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_religionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_religionEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_estado_civilEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_estado_civilEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_tipo_generoEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_tipo_generoEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_tipo_empleadoEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_tipo_empleadoEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_tipo_instruccionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_tipo_instruccionEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_cargoEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_cargoEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_estructuraEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_estructuraEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_estructura_seccionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_estructura_seccionEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_estado_empleadoEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_estado_empleadoEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_tipo_contratoEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_tipo_contratoEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jTextFieldcodigoEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jTextFieldcodigoEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jTextAreanombreEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jTextAreanombreEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jTextAreaapellidoEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jTextAreaapellidoEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jTextAreanombre_completoEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jTextAreanombre_completoEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jTextAreamailEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jTextAreamailEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jTextAreadireccionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jTextAreadireccionEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jTextFieldsueldoEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jTextFieldsueldoEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jTextAreatelefonoEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jTextAreatelefonoEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_tipo_cuenta_banco_globalEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_tipo_cuenta_banco_globalEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jTextFieldnumero_cuentaEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jTextFieldnumero_cuentaEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jCheckBoxtiene_casaEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jCheckBoxtiene_casaEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jCheckBoxtiene_vehiculoEmpleado;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.empleadoJInternalFrame.getjButtonActualizarToolBarEmpleado();
			
			if(component!=null && component.equals(this.empleadoJInternalFrame.getjButtonEliminarToolBarEmpleado())) {
				componentTab=this.empleadoJInternalFrame.getjButtonActualizarToolBarEmpleado();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.empleadoJInternalFrame.getjButtonCancelarToolBarEmpleado())) {
				componentTab=this.empleadoJInternalFrame.getjButtonEliminarToolBarEmpleado();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_empresaEmpleado)) {
				
				componentTab=this.empleadoJInternalFrame.getjButtonCancelarToolBarEmpleado();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxTiposAccionesFormularioEmpleado)) {
				componentTab=this.empleadoJInternalFrame.jCheckBoxtiene_vehiculoEmpleado;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.empleadoJInternalFrame.jButtonEliminarEmpleado)) {
				componentTab=this.empleadoJInternalFrame.jComboBoxTiposAccionesFormularioEmpleado;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.empleadoJInternalFrame.jButtonActualizarEmpleado)) {
				componentTab=this.empleadoJInternalFrame.jButtonEliminarEmpleado;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.empleadoJInternalFrame.jButtonCancelarEmpleado)) {
				componentTab=this.empleadoJInternalFrame.jButtonActualizarEmpleado;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_sucursalEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_empresaEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_paisEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_sucursalEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_provinciaEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_paisEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_ciudadEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_provinciaEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_centro_costoEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_ciudadEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_religionEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_centro_costoEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_estado_civilEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_religionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_tipo_generoEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_estado_civilEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_tipo_empleadoEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_tipo_generoEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_tipo_instruccionEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_tipo_empleadoEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_cargoEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_tipo_instruccionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_estructuraEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_cargoEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_estructura_seccionEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_estructuraEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_estado_empleadoEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_estructura_seccionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_tipo_contratoEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_estado_empleadoEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jTextFieldcodigoEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_tipo_contratoEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jTextAreanombreEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jTextFieldcodigoEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jTextAreaapellidoEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jTextAreanombreEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jTextAreanombre_completoEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jTextAreaapellidoEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jTextAreamailEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jTextAreanombre_completoEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jTextAreadireccionEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jTextAreamailEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jTextFieldsueldoEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jTextAreadireccionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jTextAreatelefonoEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jTextFieldsueldoEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jComboBoxid_tipo_cuenta_banco_globalEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jTextAreatelefonoEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jTextFieldnumero_cuentaEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jComboBoxid_tipo_cuenta_banco_globalEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jCheckBoxtiene_casaEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jTextFieldnumero_cuentaEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.empleadoJInternalFrame.jCheckBoxtiene_vehiculoEmpleado)) {
			componentTab=this.empleadoJInternalFrame.jCheckBoxtiene_casaEmpleado;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.empleadoJInternalFrame.getjButtonActualizarToolBarEmpleado();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.empleadoJInternalFrame.getjButtonActualizarToolBarEmpleado();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.empleadoJInternalFrame.getjButtonCancelarToolBarEmpleado();
			
			
			return componentTab;		
		}
		
		public EmpleadoDetalleFormJInternalFrame getempleadoJInternalFrame() {
			return this.empleadoJInternalFrame;
		}
		
		public void setempleadoJInternalFrame(EmpleadoDetalleFormJInternalFrame empleadoJInternalFrame) {
			this.empleadoJInternalFrame=empleadoJInternalFrame;
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
