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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.nomina.util.EmpleadoHobbyConstantesFunciones;
import com.bydan.erp.nomina.util.EmpleadoHobbyParameterReturnGeneral;
//import com.bydan.erp.nomina.util.EmpleadoHobbyParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.EmpleadoHobbyBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
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

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
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
import java.util.Collections;
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
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
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

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
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

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class EmpleadoHobbyBeanSwingJInternalFrame extends EmpleadoHobbyJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EmpleadoHobbyBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EmpleadoHobby> empleadohobbyValidator = new ClassValidator<EmpleadoHobby>(EmpleadoHobby.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EmpleadoHobby empleadohobby;	
	public EmpleadoHobby empleadohobbyAux;
	public EmpleadoHobby empleadohobbyAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EmpleadoHobby empleadohobbyTotales;
	public Long idEmpleadoHobbyActual;
	public Long iIdNuevoEmpleadoHobby=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

	public String sFinalQueryComboEmpleado="";

	public List<Empleado> empleadosForeignKey;

	public List<Empleado> getempleadosForeignKey() {
		return empleadosForeignKey;
	}

	public void setempleadosForeignKey(List<Empleado> empleadosForeignKey) {
		this.empleadosForeignKey = empleadosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empleado empleadoForeignKey;

	public Empleado getempleadoForeignKey() {
		return empleadoForeignKey;
	}

	public void setempleadoForeignKey(Empleado empleadoForeignKey) {
		this.empleadoForeignKey = empleadoForeignKey;
	}

	public String sFinalQueryComboHobby="";

	public List<Hobby> hobbysForeignKey;

	public List<Hobby> gethobbysForeignKey() {
		return hobbysForeignKey;
	}

	public void sethobbysForeignKey(List<Hobby> hobbysForeignKey) {
		this.hobbysForeignKey = hobbysForeignKey;
	}

	//OBJETO FK ACTUAL
	public Hobby hobbyForeignKey;

	public Hobby gethobbyForeignKey() {
		return hobbyForeignKey;
	}

	public void sethobbyForeignKey(Hobby hobbyForeignKey) {
		this.hobbyForeignKey = hobbyForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idEmpleadoActual=0L;

	public Long getidEmpleadoActual() {
		return idEmpleadoActual;
	}

	public void setidEmpleadoActual(Long idEmpleadoActual) {
		this.idEmpleadoActual= idEmpleadoActual;
	}
	
	
	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoEmpleadoHobby;
	public Boolean isPermisoNuevoEmpleadoHobby;
	public Boolean isPermisoActualizarEmpleadoHobby;
	public Boolean isPermisoActualizarOriginalEmpleadoHobby;
	public Boolean isPermisoEliminarEmpleadoHobby;
	public Boolean isPermisoGuardarCambiosEmpleadoHobby;
	public Boolean isPermisoConsultaEmpleadoHobby;
	public Boolean isPermisoBusquedaEmpleadoHobby;
	public Boolean isPermisoReporteEmpleadoHobby;
	public Boolean isPermisoPaginacionMedioEmpleadoHobby;
	public Boolean isPermisoPaginacionAltoEmpleadoHobby;
	public Boolean isPermisoPaginacionTodoEmpleadoHobby;
	public Boolean isPermisoCopiarEmpleadoHobby;
	public Boolean isPermisoVerFormEmpleadoHobby;
	public Boolean isPermisoDuplicarEmpleadoHobby;
	public Boolean isPermisoOrdenEmpleadoHobby;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public EmpleadoHobbyParameterReturnGeneral empleadohobbyReturnGeneral;
	public EmpleadoHobbyParameterReturnGeneral empleadohobbyParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEmpleadoHobby=false;
	public Boolean esParaAccionDesdeFormularioEmpleadoHobby=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EmpleadoHobbySessionBeanAdditional empleadohobbySessionBeanAdditional=null;
	
	public EmpleadoHobbySessionBeanAdditional getEmpleadoHobbySessionBeanAdditional() {
		return this.empleadohobbySessionBeanAdditional;
	}
	
	public void setEmpleadoHobbySessionBeanAdditional(EmpleadoHobbySessionBeanAdditional empleadohobbySessionBeanAdditional) {
		try {
			this.empleadohobbySessionBeanAdditional=empleadohobbySessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EmpleadoHobbyBeanSwingJInternalFrameAdditional empleadohobbyBeanSwingJInternalFrameAdditional=null;
	//public class EmpleadoHobbyBeanSwingJInternalFrame
	
	public EmpleadoHobbyBeanSwingJInternalFrameAdditional getEmpleadoHobbyBeanSwingJInternalFrameAdditional() {
		return this.empleadohobbyBeanSwingJInternalFrameAdditional;
	}
	
	public void setEmpleadoHobbyBeanSwingJInternalFrameAdditional(EmpleadoHobbyBeanSwingJInternalFrameAdditional empleadohobbyBeanSwingJInternalFrameAdditional) {
		try {
			this.empleadohobbyBeanSwingJInternalFrameAdditional=empleadohobbyBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EmpleadoHobbyLogic empleadohobbyLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EmpleadoHobby empleadohobbyBean;
	public EmpleadoHobbyConstantesFunciones empleadohobbyConstantesFunciones;
	//public EmpleadoHobbyParameterReturnGeneral empleadohobbyReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	public HobbyLogic hobbyLogic;
	
	//PARAMETROS
	
	
	//public List<EmpleadoHobby> empleadohobbys;	
	//public List<EmpleadoHobby> empleadohobbysEliminados;
	//public List<EmpleadoHobby> empleadohobbysAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEmpleadoHobby=false;
	public Boolean isVisibilidadCeldaDuplicarEmpleadoHobby=true;
	public Boolean isVisibilidadCeldaCopiarEmpleadoHobby=true;
	public Boolean isVisibilidadCeldaVerFormEmpleadoHobby=true;
	public Boolean isVisibilidadCeldaOrdenEmpleadoHobby=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEmpleadoHobby=false;
	public Boolean isVisibilidadCeldaModificarEmpleadoHobby=false;
	public Boolean isVisibilidadCeldaActualizarEmpleadoHobby=false;
	public Boolean isVisibilidadCeldaEliminarEmpleadoHobby=false;
	public Boolean isVisibilidadCeldaCancelarEmpleadoHobby=false;
	public Boolean isVisibilidadCeldaGuardarEmpleadoHobby=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEmpleadoHobby=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdHobby=false;
	
	public Long getiIdNuevoEmpleadoHobby() {
		return this.iIdNuevoEmpleadoHobby;
	}

	public void setiIdNuevoEmpleadoHobby(Long iIdNuevoEmpleadoHobby) {
		this.iIdNuevoEmpleadoHobby = iIdNuevoEmpleadoHobby;
	}
	
	public Long getidEmpleadoHobbyActual() {
		return this.idEmpleadoHobbyActual;
	}

	public void setidEmpleadoHobbyActual(Long idEmpleadoHobbyActual) {
		this.idEmpleadoHobbyActual = idEmpleadoHobbyActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EmpleadoHobby getempleadohobby() {
		return this.empleadohobby;
	}

	public void setempleadohobby(EmpleadoHobby empleadohobby) {
		this.empleadohobby = empleadohobby;
	}
	
	public EmpleadoHobby getempleadohobbyAux() {
		return this.empleadohobbyAux;
	}

	public void setempleadohobbyAux(EmpleadoHobby empleadohobbyAux) {
		this.empleadohobbyAux = empleadohobbyAux;
	}				
	
	public EmpleadoHobby getempleadohobbyAnterior() {
		return this.empleadohobbyAnterior;
	}

	public void setempleadohobbyAnterior(EmpleadoHobby empleadohobbyAnterior) {
		this.empleadohobbyAnterior = empleadohobbyAnterior;
	}	
	
	public EmpleadoHobby getempleadohobbyTotales() {
		return this.empleadohobbyTotales;
	}

	public void setempleadohobbyTotales(EmpleadoHobby empleadohobbyTotales) {
		this.empleadohobbyTotales = empleadohobbyTotales;
	}	
	
	public EmpleadoHobby getempleadohobbyBean() {
		return this.empleadohobbyBean;
	}

	public void setempleadohobbyBean(EmpleadoHobby empleadohobbyBean) {
		this.empleadohobbyBean = empleadohobbyBean;
	}	
	
	public EmpleadoHobbyParameterReturnGeneral getempleadohobbyReturnGeneral() {
		return this.empleadohobbyReturnGeneral;
	}

	public void setempleadohobbyReturnGeneral(EmpleadoHobbyParameterReturnGeneral empleadohobbyReturnGeneral) {
		this.empleadohobbyReturnGeneral = empleadohobbyReturnGeneral;
	}	
	
	
	public Long id_empleadoFK_IdEmpleado=-1L;

	public Long getid_empleadoFK_IdEmpleado() {
		return this.id_empleadoFK_IdEmpleado;
	}

	public void setid_empleadoFK_IdEmpleado(Long id_empleadoFK_IdEmpleado) {
		this.id_empleadoFK_IdEmpleado = id_empleadoFK_IdEmpleado;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_hobbyFK_IdHobby=-1L;

	public Long getid_hobbyFK_IdHobby() {
		return this.id_hobbyFK_IdHobby;
	}

	public void setid_hobbyFK_IdHobby(Long id_hobbyFK_IdHobby) {
		this.id_hobbyFK_IdHobby = id_hobbyFK_IdHobby;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EmpleadoHobbyLogic getEmpleadoHobbyLogic()	{		
		return empleadohobbyLogic;
	}

	public void setEmpleadoHobbyLogic(EmpleadoHobbyLogic empleadohobbyLogic) {
		this.empleadohobbyLogic = empleadohobbyLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoEmpleadoHobby() {
		return isEsNuevoEmpleadoHobby;
	}

	public void setIsEsNuevoEmpleadoHobby(Boolean isEsNuevoEmpleadoHobby) {
		this.isEsNuevoEmpleadoHobby = isEsNuevoEmpleadoHobby;
	}

	public Boolean getEsParaAccionDesdeFormularioEmpleadoHobby() {
		return esParaAccionDesdeFormularioEmpleadoHobby;
	}
	
	public void setEsParaAccionDesdeFormularioEmpleadoHobby(Boolean esParaAccionDesdeFormularioEmpleadoHobby) {
		this.esParaAccionDesdeFormularioEmpleadoHobby = esParaAccionDesdeFormularioEmpleadoHobby;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.empleadohobbySessionBean==null) {
				this.empleadohobbySessionBean=new EmpleadoHobbySessionBean();
			}

			if(!this.empleadohobbySessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(empleadohobbySessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosEmpleadosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empleadosForeignKey=new ArrayList<Empleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpleadoLogic empleadoLogic=new EmpleadoLogic();

			//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.empleadohobbySessionBean==null) {
				this.empleadohobbySessionBean=new EmpleadoHobbySessionBean();
			}

			if(!this.empleadohobbySessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

					empleadoLogic.getTodosEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.empleadosForeignKey=empleadoLogic.getEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpleado(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(empleadohobbySessionBean.getlidEmpleadoActual());
					this.empleadosForeignKey.add(empleadoLogic.getEmpleado());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosHobbysForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.hobbysForeignKey=new ArrayList<Hobby>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			HobbyLogic hobbyLogic=new HobbyLogic();

			//hobbyLogic.getHobbyDataAccess().setIsForForeingKeyData(true);

			if(this.empleadohobbySessionBean==null) {
				this.empleadohobbySessionBean=new EmpleadoHobbySessionBean();
			}

			if(!this.empleadohobbySessionBean.getisBusquedaDesdeForeignKeySesionHobby()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//hobbyLogic.getHobbyDataAccess().setIsForForeingKeyData(true);

					hobbyLogic.getTodosHobbysWithConnection(sFinalQuery,new Pagination());

					this.hobbysForeignKey=hobbyLogic.getHobbys();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaHobby(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					hobbyLogic.getEntityWithConnection(empleadohobbySessionBean.getlidHobbyActual());
					this.hobbysForeignKey.add(hobbyLogic.getHobby());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.empleadohobby!=null) {
						this.empleadohobby.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
						this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empresaEmpleadoHobby.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEmpleadoHobby.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empresaEmpleadoHobby.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empresaEmpleadoHobby.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEmpleadoHobbyGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaEmpleadoHobbyGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEmpleadoHobbyGenerico!=null && jComboBoxid_empresaEmpleadoHobbyGenerico.getItemCount()>0) {
					jComboBoxid_empresaEmpleadoHobbyGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEmpleadoForeignKey(Long idEmpleadoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empleadoTemp!=null) {

					if(this.empleadohobby!=null) {
						this.empleadohobby.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
						this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empleadoEmpleadoHobby.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoEmpleadoHobby.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empleadoEmpleadoHobby.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empleadoEmpleadoHobby.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHobby!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHobby.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHobby!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHobby.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHobby.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHobby.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpleadoForeignKeyDescripcion(Long idEmpleadoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}


			sDescripcion=EmpleadoConstantesFunciones.getEmpleadoDescripcion(empleadoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoEmpleadoHobbyGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}

			if(empleadoTemp!=null) {
				jComboBoxid_empleadoEmpleadoHobbyGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoEmpleadoHobbyGenerico!=null && jComboBoxid_empleadoEmpleadoHobbyGenerico.getItemCount()>0) {
					jComboBoxid_empleadoEmpleadoHobbyGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualHobbyForeignKey(Long idHobbySeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Hobby  hobbyTemp=null;

			for(Hobby hobbyAux:hobbysForeignKey) {
				if(hobbyAux.getId()!=null && hobbyAux.getId().equals(idHobbySeleccionado)) {
					hobbyTemp=hobbyAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(hobbyTemp!=null) {

					if(this.empleadohobby!=null) {
						this.empleadohobby.setHobby(hobbyTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
						this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_hobbyEmpleadoHobby.setSelectedItem(hobbyTemp);
					}
				} else {
					//jComboBoxid_hobbyEmpleadoHobby.setSelectedItem(hobbyTemp);
					if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_hobbyEmpleadoHobby.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_hobbyEmpleadoHobby.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdHobby") || sFormularioTipoBusqueda.equals("Todos")){
					if(hobbyTemp!=null && jComboBoxid_hobbyFK_IdHobbyEmpleadoHobby!=null) {
						jComboBoxid_hobbyFK_IdHobbyEmpleadoHobby.setSelectedItem(hobbyTemp);
					} else {
						if(jComboBoxid_hobbyFK_IdHobbyEmpleadoHobby!=null) {
							//jComboBoxid_hobbyFK_IdHobbyEmpleadoHobby.setSelectedItem(hobbyTemp);
							if(jComboBoxid_hobbyFK_IdHobbyEmpleadoHobby.getItemCount()>0) {
								jComboBoxid_hobbyFK_IdHobbyEmpleadoHobby.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualHobbyForeignKeyDescripcion(Long idHobbySeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Hobby  hobbyTemp=null;

			for(Hobby hobbyAux:hobbysForeignKey) {
				if(hobbyAux.getId()!=null && hobbyAux.getId().equals(idHobbySeleccionado)) {
					hobbyTemp=hobbyAux;
					break;
				}
			}


			sDescripcion=HobbyConstantesFunciones.getHobbyDescripcion(hobbyTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualHobbyForeignKeyGenerico(Long idHobbySeleccionado,JComboBox jComboBoxid_hobbyEmpleadoHobbyGenerico)throws Exception
	{
		try
		{
			Hobby  hobbyTemp=null;

			for(Hobby hobbyAux:hobbysForeignKey) {
				if(hobbyAux.getId()!=null && hobbyAux.getId().equals(idHobbySeleccionado)) {
					hobbyTemp=hobbyAux;
					break;
				}
			}

			if(hobbyTemp!=null) {
				jComboBoxid_hobbyEmpleadoHobbyGenerico.setSelectedItem(hobbyTemp);
			} else {
				if(jComboBoxid_hobbyEmpleadoHobbyGenerico!=null && jComboBoxid_hobbyEmpleadoHobbyGenerico.getItemCount()>0) {
					jComboBoxid_hobbyEmpleadoHobbyGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(EmpleadoHobby empleadohobby,JComboBox jComboBoxid_empresaEmpleadoHobbyGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEmpleadoHobbyGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empresaEmpleadoHobby.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEmpleadoHobbyGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				empleadohobby.setid_empresa(empresaAux.getId());
				empleadohobby.setempresa_descripcion(EmpleadoHobbyConstantesFunciones.getEmpresaDescripcion(empresaAux));
				empleadohobby.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(EmpleadoHobby empleadohobby,JComboBox jComboBoxid_empleadoEmpleadoHobbyGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoEmpleadoHobbyGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empleadoEmpleadoHobby.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoEmpleadoHobbyGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				empleadohobby.setid_empleado(empleadoAux.getId());
				empleadohobby.setempleado_descripcion(EmpleadoHobbyConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				empleadohobby.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarHobbyForeignKey(EmpleadoHobby empleadohobby,JComboBox jComboBoxid_hobbyEmpleadoHobbyGenerico)throws Exception
	{
		try
		{
			Hobby  hobbyAux=new Hobby();

			if(jComboBoxid_hobbyEmpleadoHobbyGenerico==null) {
				hobbyAux=(Hobby)this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_hobbyEmpleadoHobby.getSelectedItem();
			} else {
				hobbyAux=(Hobby)jComboBoxid_hobbyEmpleadoHobbyGenerico.getSelectedItem();
			}

			if(hobbyAux!=null && hobbyAux.getId()!=null) {
				empleadohobby.setid_hobby(hobbyAux.getId());
				empleadohobby.sethobby_descripcion(EmpleadoHobbyConstantesFunciones.getHobbyDescripcion(hobbyAux));
				empleadohobby.setHobby(hobbyAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) { 
							this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empresaEmpleadoHobby.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empresaEmpleadoHobby.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) { 
					}

					if(!EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpleadosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) { 
							this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empleadoEmpleadoHobby.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empleadoEmpleadoHobby.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) { 
					}

					if(!EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHobby.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHobby.addItem(empleado);
							}
						}

						if(!EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameHobbysForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingHobby=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) { 
							this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_hobbyEmpleadoHobby.removeAllItems();

							for(Hobby hobby:this.hobbysForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_hobbyEmpleadoHobby.addItem(hobby);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) { 
					}

					if(!EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdHobby") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_hobbyFK_IdHobbyEmpleadoHobby.removeAllItems();

							for(Hobby hobby:this.hobbysForeignKey) {
								this.jComboBoxid_hobbyFK_IdHobbyEmpleadoHobby.addItem(hobby);
							}
						}

						if(!EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
							this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empresaEmpleadoHobby.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
							this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empresaEmpleadoHobby.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpleadoForeignKey(Empleado empleado,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
							this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empleadoEmpleadoHobby.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
							this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empleadoEmpleadoHobby.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHobby.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHobby.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameHobbyForeignKey(Hobby hobby,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
							this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_hobbyEmpleadoHobby.setSelectedItem(hobby);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
							this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_hobbyEmpleadoHobby.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_hobbyFK_IdHobbyEmpleadoHobby.setSelectedItem(hobby);
						} else {
							this.jComboBoxid_hobbyFK_IdHobbyEmpleadoHobby.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesEmpleadoHobby() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EmpleadoHobbyConstantesFunciones.refrescarForeignKeysDescripcionesEmpleadoHobby(this.empleadohobbyLogic.getEmpleadoHobbys());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EmpleadoHobbyConstantesFunciones.refrescarForeignKeysDescripcionesEmpleadoHobby(this.empleadohobbys);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(Hobby.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//empleadohobbyLogic.setEmpleadoHobbys(this.empleadohobbys);
			empleadohobbyLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public EmpleadoHobbyParameterReturnGeneral getEmpleadoHobbyParameterGeneral() {
		return this.empleadohobbyParameterGeneral;
	}
	
	public void setEmpleadoHobbyParameterGeneral(EmpleadoHobbyParameterReturnGeneral empleadohobbyParameterGeneral) {
		this.empleadohobbyParameterGeneral = empleadohobbyParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoEmpleadoHobby() {
		return isPermisoTodoEmpleadoHobby;
	}

	public void setIsPermisoTodoEmpleadoHobby(Boolean isPermisoTodoEmpleadoHobby) {
		this.isPermisoTodoEmpleadoHobby = isPermisoTodoEmpleadoHobby;
	}

	public Boolean getIsPermisoNuevoEmpleadoHobby() {
		return isPermisoNuevoEmpleadoHobby;
	}

	public void setIsPermisoNuevoEmpleadoHobby(Boolean isPermisoNuevoEmpleadoHobby) {
		this.isPermisoNuevoEmpleadoHobby = isPermisoNuevoEmpleadoHobby;
	}

	public Boolean getIsPermisoActualizarEmpleadoHobby() {
		return isPermisoActualizarEmpleadoHobby;
	}

	public void setIsPermisoActualizarEmpleadoHobby(Boolean isPermisoActualizarEmpleadoHobby) {
		this.isPermisoActualizarEmpleadoHobby = isPermisoActualizarEmpleadoHobby;
	}

	public Boolean getIsPermisoEliminarEmpleadoHobby() {
		return isPermisoEliminarEmpleadoHobby;
	}

	public void setIsPermisoEliminarEmpleadoHobby(Boolean isPermisoEliminarEmpleadoHobby) {
		this.isPermisoEliminarEmpleadoHobby = isPermisoEliminarEmpleadoHobby;
	}

	public Boolean getIsPermisoGuardarCambiosEmpleadoHobby() {
		return isPermisoGuardarCambiosEmpleadoHobby;
	}

	public void setIsPermisoGuardarCambiosEmpleadoHobby(Boolean isPermisoGuardarCambiosEmpleadoHobby) {
		this.isPermisoGuardarCambiosEmpleadoHobby = isPermisoGuardarCambiosEmpleadoHobby;
	}
	
	public Boolean getIsPermisoConsultaEmpleadoHobby() {
		return isPermisoConsultaEmpleadoHobby;
	}

	public void setIsPermisoConsultaEmpleadoHobby(Boolean isPermisoConsultaEmpleadoHobby) {
		this.isPermisoConsultaEmpleadoHobby = isPermisoConsultaEmpleadoHobby;
	}

	public Boolean getIsPermisoBusquedaEmpleadoHobby() {
		return isPermisoBusquedaEmpleadoHobby;
	}

	public void setIsPermisoBusquedaEmpleadoHobby(Boolean isPermisoBusquedaEmpleadoHobby) {
		this.isPermisoBusquedaEmpleadoHobby = isPermisoBusquedaEmpleadoHobby;
	}

	public Boolean getIsPermisoReporteEmpleadoHobby() {
		return isPermisoReporteEmpleadoHobby;
	}

	public void setIsPermisoReporteEmpleadoHobby(Boolean isPermisoReporteEmpleadoHobby) {
		this.isPermisoReporteEmpleadoHobby = isPermisoReporteEmpleadoHobby;
	}
	
	public Boolean getIsPermisoPaginacionMedioEmpleadoHobby() {
		return isPermisoPaginacionMedioEmpleadoHobby;
	}

	public void setIsPermisoPaginacionMedioEmpleadoHobby(Boolean isPermisoPaginacionMedioEmpleadoHobby) {
		this.isPermisoPaginacionMedioEmpleadoHobby = isPermisoPaginacionMedioEmpleadoHobby;
	}
	
	public Boolean getIsPermisoPaginacionTodoEmpleadoHobby() {
		return isPermisoPaginacionTodoEmpleadoHobby;
	}

	public void setIsPermisoPaginacionTodoEmpleadoHobby(Boolean isPermisoPaginacionTodoEmpleadoHobby) {
		this.isPermisoPaginacionTodoEmpleadoHobby = isPermisoPaginacionTodoEmpleadoHobby;
	}
	
	public Boolean getIsPermisoPaginacionAltoEmpleadoHobby() {
		return isPermisoPaginacionAltoEmpleadoHobby;
	}

	public void setIsPermisoPaginacionAltoEmpleadoHobby(Boolean isPermisoPaginacionAltoEmpleadoHobby) {
		this.isPermisoPaginacionAltoEmpleadoHobby = isPermisoPaginacionAltoEmpleadoHobby;
	}
	
	public Boolean getIsPermisoCopiarEmpleadoHobby() {
		return isPermisoCopiarEmpleadoHobby;
	}

	public void setIsPermisoCopiarEmpleadoHobby(Boolean isPermisoCopiarEmpleadoHobby) {
		this.isPermisoCopiarEmpleadoHobby = isPermisoCopiarEmpleadoHobby;
	}
	
	public Boolean getIsPermisoVerFormEmpleadoHobby() {
		return isPermisoVerFormEmpleadoHobby;
	}

	public void setIsPermisoVerFormEmpleadoHobby(Boolean isPermisoVerFormEmpleadoHobby) {
		this.isPermisoVerFormEmpleadoHobby = isPermisoVerFormEmpleadoHobby;
	}
	
	public Boolean getIsPermisoDuplicarEmpleadoHobby() {
		return isPermisoDuplicarEmpleadoHobby;
	}

	public void setIsPermisoDuplicarEmpleadoHobby(Boolean isPermisoDuplicarEmpleadoHobby) {
		this.isPermisoDuplicarEmpleadoHobby = isPermisoDuplicarEmpleadoHobby;
	}
	
	public Boolean getIsPermisoOrdenEmpleadoHobby() {
		return isPermisoOrdenEmpleadoHobby;
	}

	public void setIsPermisoOrdenEmpleadoHobby(Boolean isPermisoOrdenEmpleadoHobby) {
		this.isPermisoOrdenEmpleadoHobby = isPermisoOrdenEmpleadoHobby;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoEmpleadoHobby() {
		return isVisibilidadCeldaNuevoEmpleadoHobby;
	}

	public void setIsVisibilidadCeldaNuevoEmpleadoHobby(Boolean isVisibilidadCeldaNuevoEmpleadoHobby) {
		this.isVisibilidadCeldaNuevoEmpleadoHobby = isVisibilidadCeldaNuevoEmpleadoHobby;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEmpleadoHobby() {
		return isVisibilidadCeldaDuplicarEmpleadoHobby;
	}

	public void setIsVisibilidadCeldaDuplicarEmpleadoHobby(Boolean isVisibilidadCeldaDuplicarEmpleadoHobby) {
		this.isVisibilidadCeldaDuplicarEmpleadoHobby = isVisibilidadCeldaDuplicarEmpleadoHobby;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEmpleadoHobby() {
		return isVisibilidadCeldaCopiarEmpleadoHobby;
	}

	public void setIsVisibilidadCeldaCopiarEmpleadoHobby(Boolean isVisibilidadCeldaCopiarEmpleadoHobby) {
		this.isVisibilidadCeldaCopiarEmpleadoHobby = isVisibilidadCeldaCopiarEmpleadoHobby;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEmpleadoHobby() {
		return isVisibilidadCeldaVerFormEmpleadoHobby;
	}

	public void setIsVisibilidadCeldaVerFormEmpleadoHobby(Boolean isVisibilidadCeldaVerFormEmpleadoHobby) {
		this.isVisibilidadCeldaVerFormEmpleadoHobby = isVisibilidadCeldaVerFormEmpleadoHobby;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEmpleadoHobby() {
		return isVisibilidadCeldaOrdenEmpleadoHobby;
	}

	public void setIsVisibilidadCeldaOrdenEmpleadoHobby(Boolean isVisibilidadCeldaOrdenEmpleadoHobby) {
		this.isVisibilidadCeldaOrdenEmpleadoHobby = isVisibilidadCeldaOrdenEmpleadoHobby;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEmpleadoHobby() {
		return isVisibilidadCeldaNuevoRelacionesEmpleadoHobby;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEmpleadoHobby(Boolean isVisibilidadCeldaNuevoRelacionesEmpleadoHobby) {
		this.isVisibilidadCeldaNuevoRelacionesEmpleadoHobby = isVisibilidadCeldaNuevoRelacionesEmpleadoHobby;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEmpleadoHobby() {
		return isVisibilidadCeldaModificarEmpleadoHobby;
	}

	public void setIsVisibilidadCeldaModificarEmpleadoHobby(Boolean isVisibilidadCeldaModificarEmpleadoHobby) {
		this.isVisibilidadCeldaModificarEmpleadoHobby = isVisibilidadCeldaModificarEmpleadoHobby;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEmpleadoHobby() {
		return isVisibilidadCeldaActualizarEmpleadoHobby;
	}

	public void setIsVisibilidadCeldaActualizarEmpleadoHobby(Boolean isVisibilidadCeldaActualizarEmpleadoHobby) {
		this.isVisibilidadCeldaActualizarEmpleadoHobby = isVisibilidadCeldaActualizarEmpleadoHobby;
	}

	public Boolean getIsVisibilidadCeldaEliminarEmpleadoHobby() {
		return isVisibilidadCeldaEliminarEmpleadoHobby;
	}

	public void setIsVisibilidadCeldaEliminarEmpleadoHobby(Boolean isVisibilidadCeldaEliminarEmpleadoHobby) {
		this.isVisibilidadCeldaEliminarEmpleadoHobby = isVisibilidadCeldaEliminarEmpleadoHobby;
	}

	public Boolean getIsVisibilidadCeldaCancelarEmpleadoHobby() {
		return isVisibilidadCeldaCancelarEmpleadoHobby;
	}

	public void setIsVisibilidadCeldaCancelarEmpleadoHobby(Boolean isVisibilidadCeldaCancelarEmpleadoHobby) {
		this.isVisibilidadCeldaCancelarEmpleadoHobby = isVisibilidadCeldaCancelarEmpleadoHobby;
	}

	public Boolean getIsVisibilidadCeldaGuardarEmpleadoHobby() {
		return isVisibilidadCeldaGuardarEmpleadoHobby;
	}

	public void setIsVisibilidadCeldaGuardarEmpleadoHobby(Boolean isVisibilidadCeldaGuardarEmpleadoHobby) {
		this.isVisibilidadCeldaGuardarEmpleadoHobby = isVisibilidadCeldaGuardarEmpleadoHobby;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEmpleadoHobby() {
		return isVisibilidadCeldaGuardarCambiosEmpleadoHobby;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEmpleadoHobby(Boolean isVisibilidadCeldaGuardarCambiosEmpleadoHobby) {
		this.isVisibilidadCeldaGuardarCambiosEmpleadoHobby = isVisibilidadCeldaGuardarCambiosEmpleadoHobby;
	}
		
	public EmpleadoHobbySessionBean getempleadohobbySessionBean() {
		return this.empleadohobbySessionBean;
	}
	
	public void setempleadohobbySessionBean(EmpleadoHobbySessionBean empleadohobbySessionBean) {
		this.empleadohobbySessionBean=empleadohobbySessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpleado() {
		return this.isVisibilidadFK_IdEmpleado;
	}

	public void setisVisibilidadFK_IdEmpleado(Boolean isVisibilidadFK_IdEmpleado) {
		this.isVisibilidadFK_IdEmpleado=isVisibilidadFK_IdEmpleado;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdHobby() {
		return this.isVisibilidadFK_IdHobby;
	}

	public void setisVisibilidadFK_IdHobby(Boolean isVisibilidadFK_IdHobby) {
		this.isVisibilidadFK_IdHobby=isVisibilidadFK_IdHobby;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEmpleadoHobby(EmpleadoHobby empleadohobby)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(empleadohobby,null);
				this.setActualParaGuardarEmpleadoForeignKey(empleadohobby,null);
				this.setActualParaGuardarHobbyForeignKey(empleadohobby,null);
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(EmpleadoHobby empleadohobby,EmpleadoHobby empleadohobbyAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEmpleadoHobby(empleadohobby);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		empleadohobbyAux.setId(empleadohobby.getId());
		empleadohobbyAux.setVersionRow(empleadohobby.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEmpleadoHobby();
		
			int intSelectedRow = this.jTableDatosEmpleadoHobby.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobby =(EmpleadoHobby) this.empleadohobbyLogic.getEmpleadoHobbys().toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.empleadohobby =(EmpleadoHobby) this.empleadohobbys.toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEmpleadoHobby(this.empleadohobby,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHobby(this.empleadohobby);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = empleadohobbyValidator.getInvalidValues(this.empleadohobby);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			empleadohobbyLogic.setDatosCliente(datosCliente);
			empleadohobbyLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				empleadohobbyAux=new  EmpleadoHobby();
				
				empleadohobbyAux.setIsNew(true);
				empleadohobbyAux.setIsChanged(true);
				
				empleadohobbyAux.setEmpleadoHobbyOriginal(this.empleadohobby);
				
				empleadohobbyAux.setId(this.empleadohobby.getId());	
				empleadohobbyAux.setVersionRow(this.empleadohobby.getVersionRow());	
				empleadohobbyAux.setid_empresa(this.empleadohobby.getid_empresa());	
				empleadohobbyAux.setid_empleado(this.empleadohobby.getid_empleado());	
				empleadohobbyAux.setid_hobby(this.empleadohobby.getid_hobby());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.empleadohobbySessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.empleadohobbySessionBean.getEsGuardarRelacionado())	{
						actualizarLista(empleadohobbyAux,empleadohobbyLogic.getEmpleadoHobbys());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadohobbyAux,empleadohobbys);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.empleadohobbySessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadohobbySessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadohobbyLogic.saveEmpleadoHobbys();//WithConnection
						//empleadohobbyLogic.getSetVersionRowEmpleadoHobbys();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.empleadohobby,empleadohobbyAux);
					
					this.refrescarForeignKeysDescripcionesEmpleadoHobby();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadohobbySessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadohobbyLogic.saveEmpleadoHobbyRelaciones(empleadohobbyAux);//WithConnection
								//empleadohobbyLogic.getSetVersionRowEmpleadoHobbys();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.empleadohobby,empleadohobbyAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.empleadohobbySessionBean.getEstaModoGuardarRelaciones() 
									|| this.empleadohobbySessionBean.getEsGuardarRelacionado())	{
									actualizarLista(empleadohobbyAux,empleadohobbyLogic.getEmpleadoHobbys());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(empleadohobbyAux,empleadohobbys);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.empleadohobby,empleadohobbyAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				empleadohobbyAux=new  EmpleadoHobby();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.empleadohobbySessionBean.getEsGuardarRelacionado() 
					|| (this.empleadohobbySessionBean.getEsGuardarRelacionado() && this.empleadohobby.getId()>=0)) {
						
					empleadohobbyAux.setIsNew(false);
				}
				
				empleadohobbyAux.setIsDeleted(false);
			
				empleadohobbyAux.setId(this.empleadohobby.getId());	
				empleadohobbyAux.setVersionRow(this.empleadohobby.getVersionRow());	
				empleadohobbyAux.setid_empresa(this.empleadohobby.getid_empresa());	
				empleadohobbyAux.setid_empleado(this.empleadohobby.getid_empleado());	
				empleadohobbyAux.setid_hobby(this.empleadohobby.getid_hobby());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(empleadohobbyAux,empleadohobbyLogic.getEmpleadoHobbys());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadohobbyAux,empleadohobbys);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.empleadohobbySessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadohobbySessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadohobbyLogic.saveEmpleadoHobbys();//WithConnection
						//empleadohobbyLogic.getSetVersionRowEmpleadoHobbys();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.empleadohobby,empleadohobbyAux);
					
					this.refrescarForeignKeysDescripcionesEmpleadoHobby();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadohobbySessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadohobbyLogic.saveEmpleadoHobbyRelaciones(empleadohobbyAux);//WithConnection
								//empleadohobbyLogic.getSetVersionRowEmpleadoHobbys();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.empleadohobby,empleadohobbyAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.empleadohobbySessionBean.getEstaModoGuardarRelaciones() 
									|| this.empleadohobbySessionBean.getEsGuardarRelacionado())	{
									actualizarLista(empleadohobbyAux,empleadohobbyLogic.getEmpleadoHobbys());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(empleadohobbyAux,empleadohobbys);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.empleadohobby,empleadohobbyAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				empleadohobbyAux=new  EmpleadoHobby();
				
				empleadohobbyAux.setIsNew(false);
				empleadohobbyAux.setIsChanged(false);
				
				empleadohobbyAux.setIsDeleted(true);
				
				empleadohobbyAux.setId(this.empleadohobby.getId());	
				empleadohobbyAux.setVersionRow(this.empleadohobby.getVersionRow());	
				empleadohobbyAux.setid_empresa(this.empleadohobby.getid_empresa());	
				empleadohobbyAux.setid_empleado(this.empleadohobby.getid_empleado());	
				empleadohobbyAux.setid_hobby(this.empleadohobby.getid_hobby());	
				
				if(this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.empleadohobbyAux.getId()>=0) {	
						this.empleadohobbysEliminados.add(empleadohobbyAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(empleadohobbyAux,empleadohobbyLogic.getEmpleadoHobbys());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadohobbyAux,empleadohobbys);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.empleadohobbySessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadohobbySessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadohobbyLogic.saveEmpleadoHobbys();//WithConnection
						//empleadohobbyLogic.getSetVersionRowEmpleadoHobbys();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadohobbySessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadohobbyLogic.saveEmpleadoHobbyRelaciones(empleadohobbyAux);//WithConnection
								//empleadohobbyLogic.getSetVersionRowEmpleadoHobbys();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.empleadohobbySessionBean.getEstaModoGuardarRelaciones() 
								|| this.empleadohobbySessionBean.getEsGuardarRelacionado())	{
								actualizarLista(empleadohobbyAux,empleadohobbyLogic.getEmpleadoHobbys());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(empleadohobbyAux,empleadohobbys);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobbyLogic.getEmpleadoHobbys().addAll(this.empleadohobbysEliminados);
					
					empleadohobbyLogic.saveEmpleadoHobbys();//WithConnection
					//empleadohobbyLogic.getSetVersionRowEmpleadoHobbys();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesEmpleadoHobby();
				
				this.empleadohobbysEliminados= new ArrayList<EmpleadoHobby>();		
			}
			
			if(this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadohobbySessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Empleado Hobby GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Empleado Hobby",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.empleadohobby=empleadohobbyAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessEmpleadoHobby();
      	}
		
	}	
	
	public void actualizarRelaciones(EmpleadoHobby empleadohobbyLocal) throws Exception {
		
		if(this.empleadohobbySessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EmpleadoHobby empleadohobbyLocal) throws Exception {	
		if(this.empleadohobbySessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				empleadohobbyLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				empleadohobbyLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(HobbyDetalleFormJInternalFrame.class)) {
				HobbyBeanSwingJInternalFrame hobbyBeanSwingJInternalFrameLocal=(HobbyBeanSwingJInternalFrame) ((HobbyDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				hobbyBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoHobby(hobbyBeanSwingJInternalFrameLocal.gethobby(),true);
				hobbyBeanSwingJInternalFrameLocal.actualizarLista(hobbyBeanSwingJInternalFrameLocal.hobby,this.hobbysForeignKey);

				hobbyBeanSwingJInternalFrameLocal.actualizarRelaciones(hobbyBeanSwingJInternalFrameLocal.hobby);

				empleadohobbyLocal.setHobby(hobbyBeanSwingJInternalFrameLocal.hobby);

				this.addItemDefectoCombosForeignKeyHobby();
				this.cargarCombosFrameHobbysForeignKey("Formulario");
				this.setActualHobbyForeignKey(hobbyBeanSwingJInternalFrameLocal.hobby.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEmpleadoHobbyActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEmpleadoHobby.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.empleadohobby =(EmpleadoHobby) this.empleadohobbyLogic.getEmpleadoHobbys().toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.empleadohobby =(EmpleadoHobby) this.empleadohobbys.toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = empleadohobbyValidator.getInvalidValues(this.empleadohobby);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EmpleadoHobby empleadohobby,List<EmpleadoHobby> empleadohobbys) throws Exception {
		try	{		
			EmpleadoHobbyConstantesFunciones.actualizarLista(empleadohobby,empleadohobbys,this.empleadohobbySessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EmpleadoHobby empleadohobby,List<EmpleadoHobby> empleadohobbys) throws Exception {
		try	{			
			EmpleadoHobbyConstantesFunciones.actualizarSelectedLista(empleadohobby,empleadohobbys);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EmpleadoHobby> empleadohobbysLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				empleadohobbysLocal=this.empleadohobbyLogic.getEmpleadoHobbys();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				empleadohobbysLocal=this.empleadohobbys;
			}
			//ARCHITECTURE
		
			for(EmpleadoHobby empleadohobbyLocal:empleadohobbysLocal) {
				if(this.permiteMantenimiento(empleadohobbyLocal) && empleadohobbyLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+EmpleadoHobbyConstantesFunciones.getEmpleadoHobbyLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EmpleadoHobbyConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoHobby.jLabelid_empresaEmpleadoHobby,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoHobbyConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoHobby.jLabelid_empleadoEmpleadoHobby,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoHobbyConstantesFunciones.IDHOBBY)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoHobby.jLabelid_hobbyEmpleadoHobby,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoHobby.jLabelid_empresaEmpleadoHobby,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoHobby.jLabelid_empleadoEmpleadoHobby,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoHobby.jLabelid_hobbyEmpleadoHobby,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEmpleadoHobby--;	
		
		
		this.empleadohobbyAux=new EmpleadoHobby();
		
		this.empleadohobbyAux.setId(this.iIdNuevoEmpleadoHobby);
		this.empleadohobbyAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.empleadohobbyLogic.getEmpleadoHobbys().add(this.empleadohobbyAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.empleadohobbys.add(this.empleadohobbyAux);
		}
		//ARCHITECTURE
		
		this.empleadohobby=this.empleadohobbyAux;
		
		if(EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEmpleadoHobby(this.empleadohobby);
			this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoHobby(this.empleadohobby);
		}
				
		//this.setDefaultControlesEmpleadoHobby();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEmpleadoHobby();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEmpleadoHobby();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoHobby();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmpleadoHobby(this.empleadohobbyBean,this.empleadohobby,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHobby(this.empleadohobby);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.empleadohobbySessionBean.getConGuardarRelaciones()) {
			classes=EmpleadoHobbyConstantesFunciones.getClassesRelationshipsOfEmpleadoHobby(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.empleadohobbyReturnGeneral=empleadohobbyLogic.procesarEventosEmpleadoHobbysWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadohobbyLogic.getEmpleadoHobbys(),this.empleadohobby,this.empleadohobbyParameterGeneral,this.isEsNuevoEmpleadoHobby,classes);//this.empleadohobbyLogic.getEmpleadoHobby()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEmpleadoHobby(this.empleadohobbyReturnGeneral,this.empleadohobbyBean,false);
		
		if(this.empleadohobbyReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoHobby(this.empleadohobbyReturnGeneral.getEmpleadoHobby());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEmpleadoHobby(this.empleadohobbyReturnGeneral.getEmpleadoHobby());
		}
		
		if(this.empleadohobbyReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEmpleadoHobby(this.empleadohobbyReturnGeneral.getEmpleadoHobby(),classes);//this.empleadohobbyBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEmpleadoHobby(this.empleadohobby,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEmpleadoHobby();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEmpleadoHobby();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmpleadoHobbyBeanSwingJInternalFrameAdditional.RecargarFormEmpleadoHobby(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEmpleadoHobby(false);
						
			if(empleadohobbySessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoHobby();
			}
			
			this.actualizarVisualTableDatosEmpleadoHobby();
			
			this.jTableDatosEmpleadoHobby.setRowSelectionInterval(this.getIndiceNuevoEmpleadoHobby(), this.getIndiceNuevoEmpleadoHobby());
			
			this.seleccionarFilaTablaEmpleadoHobbyActual();
						
			this.actualizarEstadoCeldasBotonesEmpleadoHobby("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEmpleadoHobby(Boolean isHabilitar) throws Exception {
			
		//
		this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empresaEmpleadoHobby.setEnabled(isHabilitar && this.empleadohobbyConstantesFunciones.activarid_empresaEmpleadoHobby);
		this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empleadoEmpleadoHobby.setEnabled(isHabilitar && this.empleadohobbyConstantesFunciones.activarid_empleadoEmpleadoHobby);
		this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_hobbyEmpleadoHobby.setEnabled(isHabilitar && this.empleadohobbyConstantesFunciones.activarid_hobbyEmpleadoHobby);
	};
	
	public void setDefaultControlesEmpleadoHobby() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEmpleadoHobby(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.empleadohobbySessionBean.setConGuardarRelaciones(true);			
			this.empleadohobbySessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEmpleadoHobby.jTabbedPaneRelacionesEmpleadoHobby.setVisible(true);
			
					
		} else {
			//this.empleadohobbySessionBean.setConGuardarRelaciones(false);			
			this.empleadohobbySessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEmpleadoHobby.jTabbedPaneRelacionesEmpleadoHobby.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEmpleadoHobby() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoHobby empleadohobbyAux:this.empleadohobbyLogic.getEmpleadoHobbys()) {
				if(empleadohobbyAux.getId().equals(this.iIdNuevoEmpleadoHobby)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoHobby empleadohobbyAux:this.empleadohobbys) {
				if(empleadohobbyAux.getId().equals(this.iIdNuevoEmpleadoHobby)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualEmpleadoHobby(EmpleadoHobby empleadohobby,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoHobby empleadohobbyAux:this.empleadohobbyLogic.getEmpleadoHobbys()) {
				if(empleadohobbyAux.getId().equals(empleadohobby.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoHobby empleadohobbyAux:this.empleadohobbys) {
				if(empleadohobbyAux.getId().equals(empleadohobby.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalEmpleadoHobby(EmpleadoHobby empleadohobbyOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoHobby empleadohobbyAux:this.empleadohobbyLogic.getEmpleadoHobbys()) {
				if(empleadohobbyAux.getEmpleadoHobbyOriginal().getId().equals(empleadohobbyOriginal.getId())) {
					existe=true;
					empleadohobbyOriginal.setId(empleadohobbyAux.getId());
					empleadohobbyOriginal.setVersionRow(empleadohobbyAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoHobby empleadohobbyAux:this.empleadohobbys) {
				if(empleadohobbyAux.getEmpleadoHobbyOriginal().getId().equals(empleadohobbyOriginal.getId())) {
					existe=true;
					empleadohobbyOriginal.setId(empleadohobbyAux.getId());
					empleadohobbyOriginal.setVersionRow(empleadohobbyAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEmpleadoHobby(Boolean esParaCancelar) throws Exception {
		empleadohobbysAux=new ArrayList<EmpleadoHobby>();
		empleadohobbyAux=new EmpleadoHobby();
		
		if(!this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EmpleadoHobby empleadohobbyAux:this.empleadohobbyLogic.getEmpleadoHobbys()) {
					if(empleadohobbyAux.getId()<0) {
						empleadohobbysAux.add(empleadohobbyAux);
					}		
				}
				this.iIdNuevoEmpleadoHobby=0L;
				this.empleadohobbyLogic.getEmpleadoHobbys().removeAll(empleadohobbysAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoHobby empleadohobbyAux:this.empleadohobbys) {
					if(empleadohobbyAux.getId()<0) {
						empleadohobbysAux.add(empleadohobbyAux);
					}		
				}
				this.iIdNuevoEmpleadoHobby=0L;
				this.empleadohobbys.removeAll(empleadohobbysAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEmpleadoHobby 
					&& this.empleadohobbyLogic.getEmpleadoHobbys().size()>0
					) {
					empleadohobbyAux=this.empleadohobbyLogic.getEmpleadoHobbys().get(this.empleadohobbyLogic.getEmpleadoHobbys().size() - 1);
				
					if(empleadohobbyAux.getId()<0) {
						this.empleadohobbyLogic.getEmpleadoHobbys().remove(empleadohobbyAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEmpleadoHobby && this.empleadohobbys.size()>0) {
					empleadohobbyAux=this.empleadohobbys.get(this.empleadohobbys.size() - 1);
				
					if(empleadohobbyAux.getId()<0) {
						this.empleadohobbys.remove(empleadohobbyAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEmpleadoHobby(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(empleadohobby.getId()<0) {
				this.empleadohobbyLogic.getEmpleadoHobbys().remove(this.empleadohobby);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(empleadohobby.getId()<0) {
				this.empleadohobbys.remove(this.empleadohobby);
			}
		}			
	}
	
	public void setEstadosInicialesEmpleadoHobby(List<EmpleadoHobby> empleadohobbysAux) throws Exception {
		EmpleadoHobbyConstantesFunciones.setEstadosInicialesEmpleadoHobby(empleadohobbysAux);
	}
	
	public void setEstadosInicialesEmpleadoHobby(EmpleadoHobby empleadohobbyAux) throws Exception {
		EmpleadoHobbyConstantesFunciones.setEstadosInicialesEmpleadoHobby(empleadohobbyAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEmpleadoHobbyActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEmpleadoHobby("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEmpleadoHobbyActual()) {
				if(!this.isEsNuevoEmpleadoHobby) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEmpleadoHobby("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEmpleadoHobby=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEmpleadoHobbyActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Empleado Hobby ?", "MANTENIMIENTO DE Empleado Hobby", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEmpleadoHobby("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EmpleadoHobby empleadohobby) throws Exception {
		EmpleadoHobbyConstantesFunciones.seleccionarAsignar(this.empleadohobby,empleadohobby);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEmpleadoHobby=this.isPermisoActualizarOriginalEmpleadoHobby;
			
			
			this.seleccionarAsignar(empleadohobby);
			
			

			idEmpleadoActual=empleadohobby.getid_empleado();
			this.seleccionarEmpleadoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmpleadoHobbyConstantesFunciones.quitarEspaciosEmpleadoHobby(this.empleadohobby,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEmpleadoHobby("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.empleadohobbySessionBean.setsFuncionBusquedaRapida(this.empleadohobbySessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarEmpleadoActual() throws Exception {
		try	{
			Empleado empleadoAux=new Empleado();

			if(this.idEmpleadoActual != null && this.idEmpleadoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(this.idEmpleadoActual);
					empleadoAux= empleadoLogic.getEmpleado();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				empleadosForeignKey=new ArrayList<Empleado>();
				empleadosForeignKey.add(empleadoAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEmpleadoHobby) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEmpleadoHobby(esParaCancelar);				
				this.cancelarNuevoEmpleadoHobby(esParaCancelar);								
			}
			
			this.empleadohobby=new EmpleadoHobby();
			
			this.inicializarEmpleadoHobby();
			
			this.actualizarEstadoCeldasBotonesEmpleadoHobby("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEmpleadoHobby() throws Exception {
		try {
			EmpleadoHobbyConstantesFunciones.inicializarEmpleadoHobby(this.empleadohobby);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.empleadohobbyLogic.getEmpleadoHobbys().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEmpleadoHobbys(String sAccionBusqueda,List<EmpleadoHobby> empleadohobbysParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="EmpleadoHobby"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EmpleadoHobbyMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EmpleadoHobbyMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EmpleadoHobby"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Empleado Hobbyes");		
		parameters.put("busquedapor", EmpleadoHobbyConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEmpleadoHobby=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EmpleadoHobbyConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EmpleadoHobbyConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEmpleadoHobby=new JRBeanArrayDataSource(EmpleadoHobbyJInternalFrame.TraerEmpleadoHobbyBeans(empleadohobbysParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEmpleadoHobby);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EmpleadoHobbyConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EmpleadoHobbyConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EmpleadoHobbyBean.TraerEmpleadoHobbyBeans(empleadohobbysParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteEmpleadoHobbys(sAccionBusqueda,sTipoArchivoReporte,empleadohobbysParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEmpleadoHobbys(sAccionBusqueda,sTipoArchivoReporte,empleadohobbysParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEmpleadoHobbyActionPerformed(null);
					//this.generarExcelReporteEmpleadoHobbys(sAccionBusqueda,sTipoArchivoReporte,empleadohobbysParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEmpleadoHobbys(sAccionBusqueda,sTipoArchivoReporte,empleadohobbysParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEmpleadoHobbys(sAccionBusqueda,sTipoArchivoReporte,empleadohobbysParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEmpleadoHobbys(sAccionBusqueda,sTipoArchivoReporte,empleadohobbysParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEmpleadoHobbys(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoHobby> empleadohobbysParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadohobby";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoHobbys");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmpleadoHobby("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EmpleadoHobby empleadohobby : empleadohobbysParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EmpleadoHobbyConstantesFunciones.generarExcelReporteDataEmpleadoHobby("NORMAL",row,workbook,empleadohobby,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadohobbySessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Hobby",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEmpleadoHobby(String sTipo,Row row,Workbook workbook) {
		
		EmpleadoHobbyConstantesFunciones.generarExcelReporteHeaderEmpleadoHobby(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEmpleadoHobbys(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoHobby> empleadohobbysParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadohobby_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoHobbys");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EmpleadoHobby empleadohobby : empleadohobbysParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EmpleadoHobbyConstantesFunciones.getEmpleadoHobbyDescripcion(empleadohobby));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoHobbyConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoHobbyConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadohobby.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoHobbyConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoHobbyConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadohobby.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoHobbyConstantesFunciones.LABEL_IDHOBBY))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoHobbyConstantesFunciones.LABEL_IDHOBBY);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadohobby.gethobby_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadohobbySessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Hobby",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEmpleadoHobbys(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoHobby> empleadohobbysParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EmpleadoHobby> empleadohobbysRespaldo=null;
		
		classes=EmpleadoHobbyConstantesFunciones.getClassesRelationshipsOfEmpleadoHobby(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.empleadohobbyLogic.setDatosCliente(this.datosCliente);
		this.empleadohobbyLogic.setDatosDeep(this.datosDeep);
		this.empleadohobbyLogic.setIsConDeep(true);
		
		empleadohobbysRespaldo=this.empleadohobbyLogic.getEmpleadoHobbys();
		
		this.empleadohobbyLogic.setEmpleadoHobbys(empleadohobbysParaReportes);	
		this.empleadohobbyLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		empleadohobbysParaReportes=this.empleadohobbyLogic.getEmpleadoHobbys();
		this.empleadohobbyLogic.setEmpleadoHobbys(empleadohobbysRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadohobby_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoHobbys");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmpleadoHobby("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EmpleadoHobby empleadohobby : empleadohobbysParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEmpleadoHobby("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EmpleadoHobbyConstantesFunciones.generarExcelReporteDataEmpleadoHobby("NORMAL",row,workbook,empleadohobby,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EmpleadoHobbyConstantesFunciones.getEmpleadoHobbyDescripcion(empleadohobby));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadohobbySessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Hobby",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoHobby.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoHobby.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoHobby.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoHobby.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEmpleadoHobby() throws Exception {		
		this.startProcessEmpleadoHobby(true);
	}
	
	public void startProcessEmpleadoHobby(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEmpleadoHobby ,this.jPanelParametrosReportesEmpleadoHobby, this.jScrollPanelDatosEmpleadoHobby,this.jPanelPaginacionEmpleadoHobby, this.jScrollPanelDatosEdicionEmpleadoHobby, this.jPanelAccionesEmpleadoHobby,this.jPanelAccionesFormularioEmpleadoHobby,this.jmenuBarEmpleadoHobby,this.jmenuBarDetalleEmpleadoHobby,this.jTtoolBarEmpleadoHobby,this.jTtoolBarDetalleEmpleadoHobby);		
		
		final JTabbedPane jTabbedPaneBusquedasEmpleadoHobby=this.jTabbedPaneBusquedasEmpleadoHobby; 
		
		final JPanel jPanelParametrosReportesEmpleadoHobby=this.jPanelParametrosReportesEmpleadoHobby;
		//final JScrollPane jScrollPanelDatosEmpleadoHobby=this.jScrollPanelDatosEmpleadoHobby;
		final JTable jTableDatosEmpleadoHobby=this.jTableDatosEmpleadoHobby;		
		final JPanel jPanelPaginacionEmpleadoHobby=this.jPanelPaginacionEmpleadoHobby;
		//final JScrollPane jScrollPanelDatosEdicionEmpleadoHobby=this.jScrollPanelDatosEdicionEmpleadoHobby;
		final JPanel jPanelAccionesEmpleadoHobby=this.jPanelAccionesEmpleadoHobby;
		
		JPanel jPanelCamposAuxiliarEmpleadoHobby=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEmpleadoHobby=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
			jPanelCamposAuxiliarEmpleadoHobby=this.jInternalFrameDetalleFormEmpleadoHobby.jPanelCamposEmpleadoHobby;
			jPanelAccionesFormularioAuxiliarEmpleadoHobby=this.jInternalFrameDetalleFormEmpleadoHobby.jPanelAccionesFormularioEmpleadoHobby;
		}
		
		final JPanel jPanelCamposEmpleadoHobby=jPanelCamposAuxiliarEmpleadoHobby;
		final JPanel jPanelAccionesFormularioEmpleadoHobby=jPanelAccionesFormularioAuxiliarEmpleadoHobby;
		
		
		final JMenuBar jmenuBarEmpleadoHobby=this.jmenuBarEmpleadoHobby;
		final JToolBar jTtoolBarEmpleadoHobby=this.jTtoolBarEmpleadoHobby;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEmpleadoHobby=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmpleadoHobby=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
			jmenuBarDetalleAuxiliarEmpleadoHobby=this.jInternalFrameDetalleFormEmpleadoHobby.jmenuBarDetalleEmpleadoHobby;
			jTtoolBarDetalleAuxiliarEmpleadoHobby=this.jInternalFrameDetalleFormEmpleadoHobby.jTtoolBarDetalleEmpleadoHobby;
		}
		
		final JMenuBar jmenuBarDetalleEmpleadoHobby=jmenuBarDetalleAuxiliarEmpleadoHobby;
		final JToolBar jTtoolBarDetalleEmpleadoHobby=jTtoolBarDetalleAuxiliarEmpleadoHobby;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmpleadoHobby;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmpleadoHobby;
			processRunnable.jTableDatos=jTableDatosEmpleadoHobby;
			processRunnable.jPanelCampos=jPanelCamposEmpleadoHobby;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmpleadoHobby;
			processRunnable.jPanelAcciones=jPanelAccionesEmpleadoHobby;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmpleadoHobby;
			
			
			processRunnable.jmenuBar=jmenuBarEmpleadoHobby;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmpleadoHobby;
			processRunnable.jTtoolBar=jTtoolBarEmpleadoHobby;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmpleadoHobby;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmpleadoHobby ,jPanelParametrosReportesEmpleadoHobby,jTableDatosEmpleadoHobby, /*jScrollPanelDatosEmpleadoHobby,*/jPanelCamposEmpleadoHobby,jPanelPaginacionEmpleadoHobby, /*jScrollPanelDatosEdicionEmpleadoHobby,*/ jPanelAccionesEmpleadoHobby,jPanelAccionesFormularioEmpleadoHobby,jmenuBarEmpleadoHobby,jmenuBarDetalleEmpleadoHobby,jTtoolBarEmpleadoHobby,jTtoolBarDetalleEmpleadoHobby);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmpleadoHobby ,jPanelParametrosReportesEmpleadoHobby, jScrollPanelDatosEmpleadoHobby,jPanelPaginacionEmpleadoHobby, jScrollPanelDatosEdicionEmpleadoHobby, jPanelAccionesEmpleadoHobby,jPanelAccionesFormularioEmpleadoHobby,jmenuBarEmpleadoHobby,jmenuBarDetalleEmpleadoHobby,jTtoolBarEmpleadoHobby,jTtoolBarDetalleEmpleadoHobby);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessEmpleadoHobby() {// throws Exception 
		this.finishProcessEmpleadoHobby(true);
	}
	
	public void finishProcessEmpleadoHobby(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEmpleadoHobby ,this.jPanelParametrosReportesEmpleadoHobby, this.jScrollPanelDatosEmpleadoHobby,this.jPanelPaginacionEmpleadoHobby, this.jScrollPanelDatosEdicionEmpleadoHobby, this.jPanelAccionesEmpleadoHobby,this.jPanelAccionesFormularioEmpleadoHobby,this.jmenuBarEmpleadoHobby,this.jmenuBarDetalleEmpleadoHobby,this.jTtoolBarEmpleadoHobby,this.jTtoolBarDetalleEmpleadoHobby);		
		
		final JTabbedPane jTabbedPaneBusquedasEmpleadoHobby=this.jTabbedPaneBusquedasEmpleadoHobby; 
		
		final JPanel jPanelParametrosReportesEmpleadoHobby=this.jPanelParametrosReportesEmpleadoHobby;
		//final JScrollPane jScrollPanelDatosEmpleadoHobby=this.jScrollPanelDatosEmpleadoHobby;
		final JTable jTableDatosEmpleadoHobby=this.jTableDatosEmpleadoHobby;		
		final JPanel jPanelPaginacionEmpleadoHobby=this.jPanelPaginacionEmpleadoHobby;
		//final JScrollPane jScrollPanelDatosEdicionEmpleadoHobby=this.jScrollPanelDatosEdicionEmpleadoHobby;
		final JPanel jPanelAccionesEmpleadoHobby=this.jPanelAccionesEmpleadoHobby;
		
		JPanel jPanelCamposAuxiliarEmpleadoHobby=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEmpleadoHobby=new JPanel();
		
		if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
			jPanelCamposAuxiliarEmpleadoHobby=this.jInternalFrameDetalleFormEmpleadoHobby.jPanelCamposEmpleadoHobby;
			jPanelAccionesFormularioAuxiliarEmpleadoHobby=this.jInternalFrameDetalleFormEmpleadoHobby.jPanelAccionesFormularioEmpleadoHobby;
		}
		
		final JPanel jPanelCamposEmpleadoHobby=jPanelCamposAuxiliarEmpleadoHobby;
		final JPanel jPanelAccionesFormularioEmpleadoHobby=jPanelAccionesFormularioAuxiliarEmpleadoHobby;
		
		
		final JMenuBar jmenuBarEmpleadoHobby=this.jmenuBarEmpleadoHobby;		
		final JToolBar jTtoolBarEmpleadoHobby=this.jTtoolBarEmpleadoHobby;
				
		JMenuBar jmenuBarDetalleAuxiliarEmpleadoHobby=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmpleadoHobby=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
			jmenuBarDetalleAuxiliarEmpleadoHobby=this.jInternalFrameDetalleFormEmpleadoHobby.jmenuBarDetalleEmpleadoHobby;
			jTtoolBarDetalleAuxiliarEmpleadoHobby=this.jInternalFrameDetalleFormEmpleadoHobby.jTtoolBarDetalleEmpleadoHobby;		
		}
		
		final JMenuBar jmenuBarDetalleEmpleadoHobby=jmenuBarDetalleAuxiliarEmpleadoHobby;
		final JToolBar jTtoolBarDetalleEmpleadoHobby=jTtoolBarDetalleAuxiliarEmpleadoHobby;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmpleadoHobby;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmpleadoHobby;
			processRunnable.jTableDatos=jTableDatosEmpleadoHobby;
			processRunnable.jPanelCampos=jPanelCamposEmpleadoHobby;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmpleadoHobby;
			processRunnable.jPanelAcciones=jPanelAccionesEmpleadoHobby;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmpleadoHobby;
			
			
			processRunnable.jmenuBar=jmenuBarEmpleadoHobby;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmpleadoHobby;
			processRunnable.jTtoolBar=jTtoolBarEmpleadoHobby;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmpleadoHobby;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEmpleadoHobby ,jPanelParametrosReportesEmpleadoHobby, jTableDatosEmpleadoHobby,/*jScrollPanelDatosEmpleadoHobby,*/jPanelCamposEmpleadoHobby,jPanelPaginacionEmpleadoHobby, /*jScrollPanelDatosEdicionEmpleadoHobby,*/ jPanelAccionesEmpleadoHobby,jPanelAccionesFormularioEmpleadoHobby,jmenuBarEmpleadoHobby,jmenuBarDetalleEmpleadoHobby,jTtoolBarEmpleadoHobby,jTtoolBarDetalleEmpleadoHobby));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEmpleadoHobby(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEmpleadoHobby(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEmpleadoHobby(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEmpleadoHobby(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEmpleadoHobby,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEmpleadoHobby,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEmpleadoHobby(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEmpleadoHobby,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEmpleadoHobby,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.empleadohobbyConstantesFunciones.getsFinalQueryEmpleadoHobby();
		String  finalQueryPaginacionTodos=this.empleadohobbyConstantesFunciones.getsFinalQueryEmpleadoHobby();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=EmpleadoHobbyConstantesFunciones.getArrayColumnasGlobalesNoEmpleadoHobby(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EmpleadoHobbyConstantesFunciones.getArrayColumnasGlobalesEmpleadoHobby(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EmpleadoHobbyConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.empleadohobbysEliminados= new ArrayList<EmpleadoHobby>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEmpleadoHobby();
		
				///*EmpleadoHobbySessionBean*/this.empleadohobbySessionBean=new EmpleadoHobbySessionBean();
			
			if(this.empleadohobbySessionBean==null) {
				this.empleadohobbySessionBean=new EmpleadoHobbySessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=EmpleadoHobbyConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EmpleadoHobbyConstantesFunciones.getClassesForeignKeysOfEmpleadoHobby(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/empleadohobby."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			empleadohobbysAux= new ArrayList<EmpleadoHobby>();
			
				
			empleadohobbyLogic.setDatosCliente(this.datosCliente);
			empleadohobbyLogic.setDatosDeep(this.datosDeep);
			empleadohobbyLogic.setIsConDeep(true);
			
			
			empleadohobbyLogic.getEmpleadoHobbyDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					empleadohobbyLogic.getTodosEmpleadoHobbys(finalQueryGlobal,pagination);
					
					//empleadohobbyLogic.getTodosEmpleadoHobbysWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(empleadohobbyLogic.getEmpleadoHobbys()==null|| empleadohobbyLogic.getEmpleadoHobbys().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadohobbysAux= new ArrayList<EmpleadoHobby>();
							empleadohobbysAux.addAll(empleadohobbyLogic.getEmpleadoHobbys());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadohobbysAux= new ArrayList<EmpleadoHobby>();
							empleadohobbysAux.addAll(empleadohobbys);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadohobbyLogic.getTodosEmpleadoHobbys(finalQueryGlobal+"",this.pagination);												
							
							//empleadohobbyLogic.getTodosEmpleadoHobbysWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEmpleadoHobbys("Todos",empleadohobbyLogic.getEmpleadoHobbys() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadohobbyLogic.setEmpleadoHobbys(new ArrayList<EmpleadoHobby>());					
							empleadohobbyLogic.getEmpleadoHobbys().addAll(empleadohobbysAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadohobbys=new ArrayList<EmpleadoHobby>();
							empleadohobbys.addAll(empleadohobbysAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEmpleadoHobby=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEmpleadoHobby=this.idActual;
				
				} else if(this.idEmpleadoHobbyActual!=null && this.idEmpleadoHobbyActual!=0L) {
					idEmpleadoHobby=idEmpleadoHobbyActual;
				}
				
					
				this.sDetalleReporte=EmpleadoHobbyConstantesFunciones.getDetalleIndicePorId(idEmpleadoHobby);
				
				this.empleadohobbys=new ArrayList<EmpleadoHobby>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					empleadohobbyLogic.getEntity(idEmpleadoHobby);
					
					//empleadohobbyLogic.getEntityWithConnection(idEmpleadoHobby);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadohobbyLogic.setEmpleadoHobbys(new ArrayList<EmpleadoHobby>());
					empleadohobbyLogic.getEmpleadoHobbys().add(empleadohobbyLogic.getEmpleadoHobby());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadohobbys=new ArrayList<EmpleadoHobby>();
					this.empleadohobbys.add(empleadohobby);
				}
				
				if(empleadohobbyLogic.getEmpleadoHobby()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=EmpleadoHobbyConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadohobbyLogic.getEmpleadoHobbysFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoHobbyConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoHobbyConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadohobbyLogic.getEmpleadoHobbys()==null||empleadohobbyLogic.getEmpleadoHobbys().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadohobbys==null|| empleadohobbys.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadohobbysAux=new ArrayList<EmpleadoHobby>();
						empleadohobbysAux.addAll(empleadohobbyLogic.getEmpleadoHobbys());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadohobbysAux=new ArrayList<EmpleadoHobby>();
							empleadohobbysAux.addAll(empleadohobbys);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadohobbyLogic.getEmpleadoHobbysFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoHobbyConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoHobbyConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoHobbys("FK_IdEmpleado",empleadohobbyLogic.getEmpleadoHobbys());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoHobbys("FK_IdEmpleado",empleadohobbys);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadohobbyLogic.setEmpleadoHobbys(new ArrayList<EmpleadoHobby>());
						empleadohobbyLogic.getEmpleadoHobbys().addAll(empleadohobbysAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadohobbys=new ArrayList<EmpleadoHobby>();
							empleadohobbys.addAll(empleadohobbysAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=EmpleadoHobbyConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadohobbyLogic.getEmpleadoHobbysFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoHobbyConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoHobbyConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadohobbyLogic.getEmpleadoHobbys()==null||empleadohobbyLogic.getEmpleadoHobbys().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadohobbys==null|| empleadohobbys.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadohobbysAux=new ArrayList<EmpleadoHobby>();
						empleadohobbysAux.addAll(empleadohobbyLogic.getEmpleadoHobbys());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadohobbysAux=new ArrayList<EmpleadoHobby>();
							empleadohobbysAux.addAll(empleadohobbys);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadohobbyLogic.getEmpleadoHobbysFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoHobbyConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoHobbyConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoHobbys("FK_IdEmpresa",empleadohobbyLogic.getEmpleadoHobbys());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoHobbys("FK_IdEmpresa",empleadohobbys);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadohobbyLogic.setEmpleadoHobbys(new ArrayList<EmpleadoHobby>());
						empleadohobbyLogic.getEmpleadoHobbys().addAll(empleadohobbysAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadohobbys=new ArrayList<EmpleadoHobby>();
							empleadohobbys.addAll(empleadohobbysAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdHobby")) {
				this.sDetalleReporte=EmpleadoHobbyConstantesFunciones.getDetalleIndiceFK_IdHobby(id_hobbyFK_IdHobby);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadohobbyLogic.getEmpleadoHobbysFK_IdHobby(finalQueryGlobal,pagination,id_hobbyFK_IdHobby);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoHobbyConstantesFunciones.getDetalleIndiceFK_IdHobby(id_hobbyFK_IdHobby);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoHobbyConstantesFunciones.getDetalleIndiceFK_IdHobby(id_hobbyFK_IdHobby);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadohobbyLogic.getEmpleadoHobbys()==null||empleadohobbyLogic.getEmpleadoHobbys().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadohobbys==null|| empleadohobbys.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadohobbysAux=new ArrayList<EmpleadoHobby>();
						empleadohobbysAux.addAll(empleadohobbyLogic.getEmpleadoHobbys());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadohobbysAux=new ArrayList<EmpleadoHobby>();
							empleadohobbysAux.addAll(empleadohobbys);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadohobbyLogic.getEmpleadoHobbysFK_IdHobby(finalQueryGlobal,pagination,id_hobbyFK_IdHobby);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoHobbyConstantesFunciones.getDetalleIndiceFK_IdHobby(id_hobbyFK_IdHobby);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoHobbyConstantesFunciones.getDetalleIndiceFK_IdHobby(id_hobbyFK_IdHobby);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoHobbys("FK_IdHobby",empleadohobbyLogic.getEmpleadoHobbys());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoHobbys("FK_IdHobby",empleadohobbys);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadohobbyLogic.setEmpleadoHobbys(new ArrayList<EmpleadoHobby>());
						empleadohobbyLogic.getEmpleadoHobbys().addAll(empleadohobbysAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadohobbys=new ArrayList<EmpleadoHobby>();
							empleadohobbys.addAll(empleadohobbysAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEmpleadoHobby();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEmpleadoHobby();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=empleadohobbyLogic.getEmpleadoHobbys().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadohobbys.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=empleadohobbyLogic.getEmpleadoHobbys().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadohobbys.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EmpleadoHobby empleadohobby) {
		Boolean permite=true;
		
		if(this.empleadohobby.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EmpleadoHobbyConstantesFunciones.getOrderByListaEmpleadoHobby();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EmpleadoHobbyConstantesFunciones.getOrderByListaEmpleadoHobby();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoHobby empleadohobby:empleadohobbyLogic.getEmpleadoHobbys()) {
				if(empleadohobby.getsType().equals(Constantes2.S_TOTALES)) {
					empleadohobbyTotales=empleadohobby;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoHobby empleadohobby:this.empleadohobbys) {
				if(empleadohobby.getsType().equals(Constantes2.S_TOTALES)) {
					empleadohobbyTotales=empleadohobby;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.empleadohobbyAux=new EmpleadoHobby();
			this.empleadohobbyAux.setsType(Constantes2.S_TOTALES);
			this.empleadohobbyAux.setIsNew(false);
			this.empleadohobbyAux.setIsChanged(false);
			this.empleadohobbyAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EmpleadoHobbyConstantesFunciones.TotalizarValoresFilaEmpleadoHobby(this.empleadohobbyLogic.getEmpleadoHobbys(),this.empleadohobbyAux);
				
				this.empleadohobbyLogic.getEmpleadoHobbys().add(this.empleadohobbyAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EmpleadoHobbyConstantesFunciones.TotalizarValoresFilaEmpleadoHobby(this.empleadohobbys,this.empleadohobbyAux);
				
				this.empleadohobbys.add(this.empleadohobbyAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		empleadohobbyTotales=new EmpleadoHobby();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.empleadohobbyLogic.getEmpleadoHobbys().remove(empleadohobbyTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.empleadohobbys.remove(empleadohobbyTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		empleadohobbyTotales=new EmpleadoHobby();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoHobby empleadohobby:empleadohobbyLogic.getEmpleadoHobbys()) {
				if(empleadohobby.getsType().equals(Constantes2.S_TOTALES)) {
					empleadohobbyTotales=empleadohobby;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmpleadoHobbyConstantesFunciones.TotalizarValoresFilaEmpleadoHobby(this.empleadohobbyLogic.getEmpleadoHobbys(),empleadohobbyTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoHobby empleadohobby:this.empleadohobbys) {
				if(empleadohobby.getsType().equals(Constantes2.S_TOTALES)) {
					empleadohobbyTotales=empleadohobby;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmpleadoHobbyConstantesFunciones.TotalizarValoresFilaEmpleadoHobby(this.empleadohobbys,empleadohobbyTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEmpleadoHobbysFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoHobbysFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoHobbysFK_IdHobby()throws Exception {
		try {
			sAccionBusqueda="FK_IdHobby";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEmpleadoHobbysFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadohobbyLogic.getEmpleadoHobbysFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoHobbysFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadohobbyLogic.getEmpleadoHobbysFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoHobbysFK_IdHobby(String sFinalQuery,Long id_hobby)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadohobbyLogic.getEmpleadoHobbysFK_IdHobby(sFinalQuery,this.pagination,id_hobby);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosEmpleadoHobby() {
		this.isPermisoTodoEmpleadoHobby=false;
		this.isPermisoNuevoEmpleadoHobby=false;
		this.isPermisoActualizarEmpleadoHobby=false;
		this.isPermisoActualizarOriginalEmpleadoHobby=false;
		this.isPermisoEliminarEmpleadoHobby=false;
		this.isPermisoGuardarCambiosEmpleadoHobby=false;
		this.isPermisoConsultaEmpleadoHobby=false;
		this.isPermisoBusquedaEmpleadoHobby=false;
		this.isPermisoReporteEmpleadoHobby=false;		
		this.isPermisoOrdenEmpleadoHobby=false;		
		this.isPermisoPaginacionMedioEmpleadoHobby=false;		
		this.isPermisoPaginacionAltoEmpleadoHobby=false;
		this.isPermisoPaginacionTodoEmpleadoHobby=false;
		this.isPermisoCopiarEmpleadoHobby=false;		
		this.isPermisoVerFormEmpleadoHobby=false;		
		this.isPermisoDuplicarEmpleadoHobby=false;		
		this.isPermisoOrdenEmpleadoHobby=false;		
	}
	
	public void setPermisosUsuarioEmpleadoHobby(Boolean isPermiso) {
		this.isPermisoTodoEmpleadoHobby=isPermiso;
		this.isPermisoNuevoEmpleadoHobby=isPermiso;
		this.isPermisoActualizarEmpleadoHobby=isPermiso;
		this.isPermisoActualizarOriginalEmpleadoHobby=isPermiso;
		this.isPermisoEliminarEmpleadoHobby=isPermiso;
		this.isPermisoGuardarCambiosEmpleadoHobby=isPermiso;
		this.isPermisoConsultaEmpleadoHobby=isPermiso;
		this.isPermisoBusquedaEmpleadoHobby=isPermiso;
		this.isPermisoReporteEmpleadoHobby=isPermiso;
		this.isPermisoOrdenEmpleadoHobby=isPermiso;		
		this.isPermisoPaginacionMedioEmpleadoHobby=isPermiso;		
		this.isPermisoPaginacionAltoEmpleadoHobby=isPermiso;		
		this.isPermisoPaginacionTodoEmpleadoHobby=isPermiso;		
		this.isPermisoCopiarEmpleadoHobby=isPermiso;		
		this.isPermisoVerFormEmpleadoHobby=isPermiso;		
		this.isPermisoDuplicarEmpleadoHobby=isPermiso;
		this.isPermisoOrdenEmpleadoHobby=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEmpleadoHobby(Boolean isPermiso) {
		//this.isPermisoTodoEmpleadoHobby=isPermiso;
		this.isPermisoNuevoEmpleadoHobby=isPermiso;
		this.isPermisoActualizarEmpleadoHobby=isPermiso;
		this.isPermisoActualizarOriginalEmpleadoHobby=isPermiso;
		this.isPermisoEliminarEmpleadoHobby=isPermiso;
		this.isPermisoGuardarCambiosEmpleadoHobby=isPermiso;
		//this.isPermisoConsultaEmpleadoHobby=isPermiso;
		//this.isPermisoBusquedaEmpleadoHobby=isPermiso;
		//this.isPermisoReporteEmpleadoHobby=isPermiso;
		//this.isPermisoOrdenEmpleadoHobby=isPermiso;		
		//this.isPermisoPaginacionMedioEmpleadoHobby=isPermiso;		
		//this.isPermisoPaginacionAltoEmpleadoHobby=isPermiso;		
		//this.isPermisoPaginacionTodoEmpleadoHobby=isPermiso;		
		//this.isPermisoCopiarEmpleadoHobby=isPermiso;		
		//this.isPermisoDuplicarEmpleadoHobby=isPermiso;
		//this.isPermisoOrdenEmpleadoHobby=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEmpleadoHobbyClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EmpleadoHobbyJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEmpleadoHobby(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEmpleadoHobbyClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEmpleadoHobbyClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEmpleadoHobbyClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEmpleadoHobbyClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEmpleadoHobby() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EmpleadoHobbyJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EmpleadoHobbyConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEmpleadoHobby=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEmpleadoHobby=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEmpleadoHobby=this.isPermisoActualizarEmpleadoHobby;
			this.isPermisoEliminarEmpleadoHobby=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEmpleadoHobby=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEmpleadoHobby=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEmpleadoHobby=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEmpleadoHobby=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEmpleadoHobby=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmpleadoHobby=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEmpleadoHobby=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEmpleadoHobby=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEmpleadoHobby=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEmpleadoHobby=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEmpleadoHobby=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEmpleadoHobby=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmpleadoHobby=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEmpleadoHobby.setToolTipText(this.jTableDatosEmpleadoHobby.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEmpleadoHobby(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEmpleadoHobby(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EmpleadoHobbyJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(EmpleadoHobbyJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioEmpleadoHobby() throws Exception {
		Reporte reporte=null;
		
		
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyEmpleadoHobbyListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.hobbysForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEmpleadoHobbyListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EmpleadoHobbyJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEmpleadoHobbyListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyHobbyListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEmpleadoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyHobbyListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.hobbysForeignKey==null||this.hobbysForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=HobbyConstantesFunciones.getArrayColumnasGlobalesHobby(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,HobbyConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=HobbyConstantesFunciones.SFINALQUERY;

				this.cargarCombosHobbysForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyEmpleadoHobbyListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			EmpleadoHobbyParameterReturnGeneral empleadohobbyReturnGeneral=new EmpleadoHobbyParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.empleadohobbyConstantesFunciones.cargarid_empresaEmpleadoHobby)
					 || (this.esRecargarFks && this.empleadohobbyConstantesFunciones.cargarid_empresaEmpleadoHobby)) {

					if(!this.empleadohobbySessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+empleadohobbySessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.empleadohobbyConstantesFunciones.cargarid_empleadoEmpleadoHobby)
					 || (this.esRecargarFks && this.empleadohobbyConstantesFunciones.cargarid_empleadoEmpleadoHobby)) {

					if(!this.empleadohobbySessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+empleadohobbySessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalHobby="";

				if(((this.hobbysForeignKey==null||this.hobbysForeignKey.size()<=0) && this.empleadohobbyConstantesFunciones.cargarid_hobbyEmpleadoHobby)
					 || (this.esRecargarFks && this.empleadohobbyConstantesFunciones.cargarid_hobbyEmpleadoHobby)) {

					if(!this.empleadohobbySessionBean.getisBusquedaDesdeForeignKeySesionHobby()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=HobbyConstantesFunciones.getArrayColumnasGlobalesHobby(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalHobby=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,HobbyConstantesFunciones.TABLENAME);

						finalQueryGlobalHobby=Funciones.GetFinalQueryAppend(finalQueryGlobalHobby, "");
						finalQueryGlobalHobby+=HobbyConstantesFunciones.SFINALQUERY;

						//this.cargarCombosHobbysForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalHobby=" WHERE " + ConstantesSql.ID + "="+empleadohobbySessionBean.getlidHobbyActual();
					}
				} else {
					finalQueryGlobalHobby="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				empleadohobbyReturnGeneral=empleadohobbyLogic.cargarCombosLoteForeignKeyEmpleadoHobby(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado,finalQueryGlobalHobby);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=empleadohobbyReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=empleadohobbyReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalHobby.equals("NONE")) {
				this.hobbysForeignKey=empleadohobbyReturnGeneral.gethobbysForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEmpleadoHobby()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyHobby();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.empleadohobbySessionBean==null) {
				this.empleadohobbySessionBean=new EmpleadoHobbySessionBean();
			}

			if(!this.empleadohobbySessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.empleadohobbySessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				Empleado empleado=new Empleado();
				EmpleadoConstantesFunciones.setEmpleadoDescripcion(empleado,Constantes.SMENSAJE_ESCOJA_OPCION);
				empleado.setId(null);

				if(!EmpleadoConstantesFunciones.ExisteEnLista(this.empleadosForeignKey,empleado,true)) {

					this.empleadosForeignKey.add(0,empleado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyHobby()throws Exception {
		try {

			if(!this.empleadohobbySessionBean.getisBusquedaDesdeForeignKeySesionHobby()) {
				Hobby hobby=new Hobby();
				HobbyConstantesFunciones.setHobbyDescripcion(hobby,Constantes.SMENSAJE_ESCOJA_OPCION);
				hobby.setId(null);

				if(!HobbyConstantesFunciones.ExisteEnLista(this.hobbysForeignKey,hobby,true)) {

					this.hobbysForeignKey.add(0,hobby);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyEmpleadoHobby()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEmpleadoHobby(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEmpleadoHobby()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoHobby();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEmpleadoHobby(EmpleadoHobby empleadohobby)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(empleadohobby.getid_empleado(),false,"Formulario");
			this.setActualHobbyForeignKey(empleadohobby.getid_hobby(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEmpleadoHobby(EmpleadoHobby empleadohobby,String sTipoEvento)throws Exception {	
		try {
			
			

				if(empleadohobby.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoEmpleadoHobby")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(empleadohobby.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEmpleadoHobby()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.empleadohobbyConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualHobbyForeignKey(this.empleadohobbyConstantesFunciones.getid_hobby(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoHobby()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEmpleadoHobby()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEmpleadoHobby()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEmpleadoHobby()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEmpleadoHobby()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameHobbysForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEmpleadoHobby(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameHobbysForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEmpleadoHobby()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empresaEmpleadoHobby!=null && this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empresaEmpleadoHobby.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empresaEmpleadoHobby.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empleadoEmpleadoHobby!=null && this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empleadoEmpleadoHobby.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empleadoEmpleadoHobby.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_hobbyEmpleadoHobby!=null && this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_hobbyEmpleadoHobby.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_hobbyEmpleadoHobby.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public EmpleadoHobbyBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EmpleadoHobbyBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EmpleadoHobbyBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.empleadohobbySessionBean=new EmpleadoHobbySessionBean(); 
		this.empleadohobbyConstantesFunciones=new EmpleadoHobbyConstantesFunciones(); 
		this.empleadohobbyBean=new EmpleadoHobby();//(this.empleadohobbyConstantesFunciones); 		
		this.empleadohobbyReturnGeneral=new EmpleadoHobbyParameterReturnGeneral(); 
		
		this.empleadohobbySessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadohobbySessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EmpleadoHobbyBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EmpleadoHobbyBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EmpleadoHobbyBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEmpleadoHobby(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.empleadohobbyConstantesFunciones=new EmpleadoHobbyConstantesFunciones(); 
			this.empleadohobbyBean=new EmpleadoHobby();//this.empleadohobbyConstantesFunciones); 			
			this.empleadohobbyReturnGeneral=new EmpleadoHobbyParameterReturnGeneral(); 
		
			EmpleadoHobbyBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empleado Hobby Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.empleadohobby=new EmpleadoHobby();
			this.empleadohobbys = new ArrayList<EmpleadoHobby>();
			this.empleadohobbysAux = new ArrayList<EmpleadoHobby>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic=new EmpleadoHobbyLogic();
				this.empleadohobbyLogic.getNewConnexionToDeep("");
			}
			
			//this.empleadohobbySessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.empleadohobbySessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEmpleadoHobby);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEmpleadoHobby!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmpleadoHobby);	
					}
					
					if(this.jInternalFrameImportacionEmpleadoHobby!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmpleadoHobby);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEmpleadoHobby!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEmpleadoHobby);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEmpleadoHobby);
				this.jInternalFrameDetalleFormEmpleadoHobby.setVisible(false);
				this.jInternalFrameDetalleFormEmpleadoHobby.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEmpleadoHobby!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmpleadoHobby);
					this.jInternalFrameReporteDinamicoEmpleadoHobby.setVisible(false);
					this.jInternalFrameReporteDinamicoEmpleadoHobby.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEmpleadoHobby!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEmpleadoHobby);
					this.jInternalFrameImportacionEmpleadoHobby.setVisible(false);
					this.jInternalFrameImportacionEmpleadoHobby.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEmpleadoHobby!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEmpleadoHobby);
					this.jInternalFrameOrderByEmpleadoHobby.setVisible(false);
					this.jInternalFrameOrderByEmpleadoHobby.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEmpleadoHobbyActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EmpleadoHobbyConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.empleadohobbyReturnGeneral=new EmpleadoHobbyParameterReturnGeneral();
			
			this.empleadohobbyParameterGeneral=new EmpleadoHobbyParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.empleadohobbyLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(EmpleadoHobbyJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmpleadoHobbyConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.empleadohobbySessionBean.getEsGuardarRelacionado(),this.empleadohobbySessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmpleadoHobbyConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.empleadohobbySessionBean.getEsGuardarRelacionado(),this.empleadohobbySessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoEmpleadoHobby=false;
			this.isVisibilidadCeldaDuplicarEmpleadoHobby=true;
			this.isVisibilidadCeldaCopiarEmpleadoHobby=true;
			this.isVisibilidadCeldaVerFormEmpleadoHobby=true;
			this.isVisibilidadCeldaOrdenEmpleadoHobby=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoHobby=false;
			this.isVisibilidadCeldaModificarEmpleadoHobby=false;
			this.isVisibilidadCeldaActualizarEmpleadoHobby=false;
			this.isVisibilidadCeldaEliminarEmpleadoHobby=false;
			this.isVisibilidadCeldaCancelarEmpleadoHobby=false;
			this.isVisibilidadCeldaGuardarEmpleadoHobby=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoHobby=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdHobby=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEmpleadoHobby("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEmpleadoHobby();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEmpleadoHobby(false);
			
			this.setPermisosUsuarioEmpleadoHobby();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadohobbySessionBean.getEsGuardarRelacionado() 
				|| (this.empleadohobbySessionBean.getEsGuardarRelacionado() && this.empleadohobbySessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEmpleadoHobbyClasesRelacionadas();
			}
			
			if(this.empleadohobbySessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEmpleadoHobbyClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEmpleadoHobby();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEmpleadoHobby();
			}
			
			if(!this.isPermisoBusquedaEmpleadoHobby) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEmpleadoHobby.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadohobbySessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEmpleadoHobby,this.isPermisoPaginacionMedioEmpleadoHobby,this.isPermisoPaginacionTodoEmpleadoHobby);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EmpleadoHobbyConstantesFunciones.getTiposSeleccionarEmpleadoHobby());
				
				this.tiposColumnasSelect=EmpleadoHobbyConstantesFunciones.getTiposSeleccionarEmpleadoHobby(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEmpleadoHobby();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioEmpleadoHobby(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioEmpleadoHobby(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoHobby() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.empleadoLogic=new EmpleadoLogic();
			this.hobbyLogic=new HobbyLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				empleadohobbyImplementable= (EmpleadoHobbyImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmpleadoHobbyConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				empleadohobbyImplementableHome= (EmpleadoHobbyImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmpleadoHobbyConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.empleadohobbys= new ArrayList<EmpleadoHobby>();
			this.empleadohobbysEliminados= new ArrayList<EmpleadoHobby>();
						
			this.isEsNuevoEmpleadoHobby=false;
			this.esParaAccionDesdeFormularioEmpleadoHobby=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idEmpleadoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.hobbysForeignKey=new ArrayList<Hobby>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEmpleadoHobby(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEmpleadoHobby();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EmpleadoHobbyBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EmpleadoHobbyConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEmpleadoHobby("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEmpleadoHobby(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEmpleadoHobby();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEmpleadoHobby();
			}
			
			EmpleadoHobbyBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEmpleadoHobby.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEmpleadoHobby.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEmpleadoHobby.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEmpleadoHobby(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EmpleadoHobby: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEmpleadoHobby() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEmpleadoHobby")) {
				iIndex=this.jInternalFrameDetalleFormEmpleadoHobby.jTabbedPaneRelacionesEmpleadoHobby.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEmpleadoHobby.jTabbedPaneRelacionesEmpleadoHobby.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEmpleadoHobby.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEmpleadoHobby();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyEmpleadoHobby(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEmpleadoHobby(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEmpleadoHobby(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEmpleadoHobbyListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEmpleadoHobby();
		
		this.cargarCombosFrameForeignKeyEmpleadoHobby();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEmpleadoHobby();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEmpleadoHobby();
		}
	}
	
	

	public void cargarCombosForeignKeyEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEmpleado(this.empleadosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyHobby(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyHobbyListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyHobby();
				this.cargarCombosFrameHobbysForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaHobby(this.hobbysForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoEmpleadoHobbyActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.empleadohobbySessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEmpleadoHobby==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
			
			
			if(jTableDatosEmpleadoHobby.getRowCount()>=1) {
				jTableDatosEmpleadoHobby.removeRowSelectionInterval(0, jTableDatosEmpleadoHobby.getRowCount()-1);						
			}
			
			this.isEsNuevoEmpleadoHobby=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEmpleadoHobby(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEmpleadoHobby(true);			
			//this.empleadohobby=new EmpleadoHobby();
			//this.empleadohobby.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoHobby(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoHobby() ;
			
			if(EmpleadoHobbyJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoHobby(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.empleadohobby);	
			this.actualizarInformacion("INFO_PADRE",false,this.empleadohobby);				
			
			EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
			
			if(this.empleadohobbySessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EmpleadoHobby: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEmpleadoHobbyActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EmpleadoHobby> empleadohobbysSeleccionados=new ArrayList<EmpleadoHobby>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEmpleadoHobby.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEmpleadoHobby.getSelectedRows().length;			
			}
			
			empleadohobbysSeleccionados=this.getEmpleadoHobbysSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEmpleadoHobby--;			
				//EmpleadoHobby empleadohobbyAux= new EmpleadoHobby();			
				//empleadohobbyAux.setId(this.iIdNuevoEmpleadoHobby);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EmpleadoHobby empleadohobbyOrigen=new EmpleadoHobby();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EmpleadoHobby empleadohobbyOrigen : empleadohobbysSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEmpleadoHobby.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							empleadohobbyOrigen =(EmpleadoHobby) this.empleadohobbyLogic.getEmpleadoHobbys().toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadohobbyOrigen =(EmpleadoHobby) this.empleadohobbys.toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEmpleadoHobby();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.empleadohobby.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEmpleadoHobby(empleadohobbyOrigen,this.empleadohobby,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHobby(this.empleadohobby);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.empleadohobbyLogic.getEmpleadoHobbys().add(this.empleadohobbyAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.empleadohobbys.add(this.empleadohobbyAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEmpleadoHobby(false);
				
				this.jTableDatosEmpleadoHobby.setRowSelectionInterval(this.getIndiceNuevoEmpleadoHobby(), this.getIndiceNuevoEmpleadoHobby());
				
				int iLastRow =  this.jTableDatosEmpleadoHobby.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmpleadoHobby.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmpleadoHobby.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoHobby(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEmpleadoHobbyActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EmpleadoHobby> empleadohobbysSeleccionados=new ArrayList<EmpleadoHobby>();									
		
			EmpleadoHobby empleadohobbyOrigen=new EmpleadoHobby();
			EmpleadoHobby empleadohobbyDestino=new EmpleadoHobby();
				
			empleadohobbysSeleccionados=this.getEmpleadoHobbysSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEmpleadoHobby.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || empleadohobbysSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEmpleadoHobby.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadohobbyOrigen =(EmpleadoHobby) this.empleadohobbyLogic.getEmpleadoHobbys().toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						empleadohobbyOrigen =(EmpleadoHobby) this.empleadohobbys.toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadohobbyDestino =(EmpleadoHobby) this.empleadohobbyLogic.getEmpleadoHobbys().toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						empleadohobbyDestino =(EmpleadoHobby) this.empleadohobbys.toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				empleadohobbyOrigen =empleadohobbysSeleccionados.get(0);
				empleadohobbyDestino =empleadohobbysSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEmpleadoHobby(empleadohobbyOrigen,empleadohobbyDestino,true,false);
				
				empleadohobbyDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(empleadohobbyDestino,empleadohobbyLogic.getEmpleadoHobbys());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadohobbyDestino,empleadohobbys);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEmpleadoHobby(false);
				
				//this.jTableDatosEmpleadoHobby.setRowSelectionInterval(this.getIndiceNuevoEmpleadoHobby(), this.getIndiceNuevoEmpleadoHobby());
				
				int iLastRow =  this.jTableDatosEmpleadoHobby.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmpleadoHobby.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmpleadoHobby.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoHobby(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEmpleadoHobbyActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoHobby==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEmpleadoHobby.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEmpleadoHobbyActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEmpleadoHobby.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEmpleadoHobby.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEmpleadoHobby.setVisible(!isVisible);
			this.jPanelPaginacionEmpleadoHobby.setVisible(!isVisible);
			this.jPanelAccionesEmpleadoHobby.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEmpleadoHobbyActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEmpleadoHobby();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEmpleadoHobbyActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEmpleadoHobby();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEmpleadoHobbyActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEmpleadoHobby();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEmpleadoHobbyActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEmpleadoHobby();
			
			this.abrirFrameOrderByEmpleadoHobby();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEmpleadoHobbyActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEmpleadoHobby();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEmpleadoHobby(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmpleadoHobby);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEmpleadoHobby.isMaximum()) {
					this.jInternalFrameDetalleFormEmpleadoHobby.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEmpleadoHobby.setSize(this.jInternalFrameDetalleFormEmpleadoHobby.iWidthFormulario,this.jInternalFrameDetalleFormEmpleadoHobby.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEmpleadoHobby.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEmpleadoHobby.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEmpleadoHobby.isMaximum()) {
						this.jInternalFrameDetalleFormEmpleadoHobby.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEmpleadoHobby.jContentPaneDetalleEmpleadoHobby.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEmpleadoHobby.jTabbedPaneRelacionesEmpleadoHobby.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoHobby.jContentPaneDetalleEmpleadoHobby.getWidth(),EmpleadoHobbyConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmpleadoHobby.jTabbedPaneRelacionesEmpleadoHobby.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoHobby.jContentPaneDetalleEmpleadoHobby.getWidth(),EmpleadoHobbyConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmpleadoHobby.jTabbedPaneRelacionesEmpleadoHobby.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoHobby.jContentPaneDetalleEmpleadoHobby.getWidth(),EmpleadoHobbyConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEmpleadoHobby.setVisible(true);
	        this.jInternalFrameDetalleFormEmpleadoHobby.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEmpleadoHobby() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEmpleadoHobby==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEmpleadoHobby=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoHobby,false,this);
				} else {
					this.jInternalFrameOrderByEmpleadoHobby=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoHobby,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEmpleadoHobby);
				this.jInternalFrameOrderByEmpleadoHobby.setVisible(false);
				this.jInternalFrameOrderByEmpleadoHobby.setSelected(false);
				
				this.jInternalFrameOrderByEmpleadoHobby.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmpleadoHobby"));
				
				this.inicializarActualizarBindingTablaOrderByEmpleadoHobby();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEmpleadoHobby() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEmpleadoHobby==null) {
				
				this.jInternalFrameImportacionEmpleadoHobby=new ImportacionJInternalFrame(EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmpleadoHobby);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEmpleadoHobby);
				this.jInternalFrameImportacionEmpleadoHobby.setVisible(false);
				this.jInternalFrameImportacionEmpleadoHobby.setSelected(false);


				this.jInternalFrameImportacionEmpleadoHobby.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmpleadoHobby"));
				this.jInternalFrameImportacionEmpleadoHobby.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmpleadoHobby"));
				this.jInternalFrameImportacionEmpleadoHobby.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmpleadoHobby"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEmpleadoHobby() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEmpleadoHobby==null) {
				this.jInternalFrameReporteDinamicoEmpleadoHobby=new ReporteDinamicoJInternalFrame(EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmpleadoHobby);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmpleadoHobby);
				this.jInternalFrameReporteDinamicoEmpleadoHobby.setVisible(false);
				this.jInternalFrameReporteDinamicoEmpleadoHobby.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEmpleadoHobby.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoHobby"));
				this.jInternalFrameReporteDinamicoEmpleadoHobby.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoHobby"));
				this.jInternalFrameReporteDinamicoEmpleadoHobby.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoHobby"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoHobby();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEmpleadoHobby() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmpleadoHobby);
			
	       	this.jInternalFrameDetalleFormEmpleadoHobby.setVisible(false);
	        this.jInternalFrameDetalleFormEmpleadoHobby.setSelected(false);
			
			//this.jInternalFrameDetalleFormEmpleadoHobby.dispose();
			//this.jInternalFrameDetalleFormEmpleadoHobby=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEmpleadoHobby() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEmpleadoHobby.setVisible(true);
	        this.jInternalFrameReporteDinamicoEmpleadoHobby.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEmpleadoHobby() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEmpleadoHobby.setVisible(true);
	        this.jInternalFrameImportacionEmpleadoHobby.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEmpleadoHobby() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEmpleadoHobby.setVisible(true);
	        this.jInternalFrameOrderByEmpleadoHobby.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEmpleadoHobby() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEmpleadoHobby.setVisible(false);
	        this.jInternalFrameOrderByEmpleadoHobby.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEmpleadoHobby() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEmpleadoHobby.setVisible(false);
	        this.jInternalFrameReporteDinamicoEmpleadoHobby.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEmpleadoHobby() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEmpleadoHobby.setVisible(false);
	        this.jInternalFrameImportacionEmpleadoHobby.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEmpleadoHobbyActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEmpleadoHobby(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEmpleadoHobby(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmpleadoHobby.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEmpleadoHobby(true);
			//this.isEsNuevoEmpleadoHobby=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobby =(EmpleadoHobby) this.empleadohobbyLogic.getEmpleadoHobbys().toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadohobby =(EmpleadoHobby) this.empleadohobbys.toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEmpleadoHobby("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoHobby(false) ;
			
			if(empleadohobbySessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EmpleadoHobbyJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoHobby(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoHobby(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEmpleadoHobbyActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEmpleadoHobby.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobby =(EmpleadoHobby) this.empleadohobbyLogic.getEmpleadoHobbys().toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadohobby =(EmpleadoHobby) this.empleadohobbys.toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEmpleadoHobby(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoHobby==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmpleadoHobby.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEmpleadoHobby(true);
			//this.isEsNuevoEmpleadoHobby=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobby =(EmpleadoHobby) this.empleadohobbyLogic.getEmpleadoHobbys().toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadohobby =(EmpleadoHobby) this.empleadohobbys.toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.empleadohobby.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEmpleadoHobby("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEmpleadoHobby(false) ;
			
			if(EmpleadoHobbyJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoHobby(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoHobby(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Empleado")) {
				if(!this.empleadohobbyConstantesFunciones.cargarid_empleadoEmpleadoHobby) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingEmpleadoHobby(false,false);
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_empleado (id);

				this.recargarComboTablaEmpleado(this.empleadosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosEmpleadoHobby.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoHobby,EmpleadoHobbyConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpleadoHobby.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaHobby(List<Hobby> hobbysForeignKey)throws Exception{
		TableColumn tableColumnHobby=this.jTableDatosEmpleadoHobby.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoHobby,EmpleadoHobbyConstantesFunciones.LABEL_IDHOBBY));
		TableCellEditor tableCellEditorHobby =tableColumnHobby.getCellEditor();

		HobbyTableCell hobbyTableCellFk=(HobbyTableCell)tableCellEditorHobby;

		if(hobbyTableCellFk!=null) {
			hobbyTableCellFk.sethobbysForeignKey(hobbysForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpleadoHobby.getSelectedRow();

		//if(intSelectedRow<=0) {
			//hobbyTableCellFk.setRowActual(intSelectedRow);
			//hobbyTableCellFk.sethobbysForeignKeyActual(hobbysForeignKey);
		//}


		if(hobbyTableCellFk!=null) {
			hobbyTableCellFk.RecargarHobbysForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarEmpleadoHobbyActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEmpleadoHobby(false);
			
			//if(!this.isEsNuevoEmpleadoHobby) {								
				int intSelectedRow = this.jTableDatosEmpleadoHobby.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobby =(EmpleadoHobby) this.empleadohobbyLogic.getEmpleadoHobbys().toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadohobby =(EmpleadoHobby) this.empleadohobbys.toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEmpleadoHobby(this.empleadohobby,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHobby(this.empleadohobby);
				
			}
			
			if(this.permiteMantenimiento(this.empleadohobby)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEmpleadoHobby=true;
					this.inicializarActualizarBindingTablaEmpleadoHobby(false);
					this.isEsNuevoEmpleadoHobby=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEmpleadoHobby=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEmpleadoHobby=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmpleadoHobby(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoHobby(false);
				
				this.habilitarDeshabilitarControlesEmpleadoHobby(false);
			
												
				
				if(EmpleadoHobbyJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEmpleadoHobby();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEmpleadoHobbyActionPerformed(evt,empleadohobbySessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEmpleadoHobby(this.empleadohobby,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEmpleadoHobby.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,empleadohobbySessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.empleadohobby.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EmpleadoHobby.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoHobby.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEmpleadoHobbyActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEmpleadoHobby.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobby =(EmpleadoHobby) this.empleadohobbyLogic.getEmpleadoHobbys().toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
				this.empleadohobby.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadohobby =(EmpleadoHobby) this.empleadohobbys.toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
				this.empleadohobby.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.empleadohobby)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EmpleadoHobbyModel) this.jTableDatosEmpleadoHobby.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEmpleadoHobby=true;
				this.inicializarActualizarBindingTablaEmpleadoHobby(false);
				this.isEsNuevoEmpleadoHobby=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmpleadoHobby(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoHobby(false);
				
				this.habilitarDeshabilitarControlesEmpleadoHobby(false);
				
				
				
				if(EmpleadoHobbyJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEmpleadoHobby();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEmpleadoHobbyActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEmpleadoHobby.getRowCount()>=1) {
				jTableDatosEmpleadoHobby.removeRowSelectionInterval(0, jTableDatosEmpleadoHobby.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEmpleadoHobby(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEmpleadoHobby(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoHobby(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoHobby(false) ;
			
			this.isEsNuevoEmpleadoHobby=false;
			
			if(EmpleadoHobbyJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEmpleadoHobby();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEmpleadoHobbyActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEmpleadoHobby(false);
				
				//SI ES MANUAL
				if(EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEmpleadoHobby();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEmpleadoHobbyActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEmpleadoHobby--;			
			//EmpleadoHobby empleadohobbyAux= new EmpleadoHobby();			
			//empleadohobbyAux.setId(this.iIdNuevoEmpleadoHobby);
			
			if(this.jInternalFrameDetalleFormEmpleadoHobby==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEmpleadoHobby();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHobby(this.empleadohobby);
			
			this.empleadohobby.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.empleadohobbyLogic.getEmpleadoHobbys().add(this.empleadohobbyAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.empleadohobbys.add(this.empleadohobbyAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEmpleadoHobby(false);
			
			this.jTableDatosEmpleadoHobby.setRowSelectionInterval(this.getIndiceNuevoEmpleadoHobby(), this.getIndiceNuevoEmpleadoHobby());
			
			int iLastRow =  this.jTableDatosEmpleadoHobby.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEmpleadoHobby.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEmpleadoHobby.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEmpleadoHobby(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEmpleadoHobbyActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEmpleadoHobby(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoHobby(false);
			
			//SI ES MANUAL
			if(EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoHobby();
			}
			
			//this.abrirFrameTreeEmpleadoHobby();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEmpleadoHobbyActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Empleado HobbyES ?", "MANTENIMIENTO DE Empleado Hobby", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEmpleadoHobby.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEmpleadoHobby();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.empleadohobbyReturnGeneral=empleadohobbyLogic.procesarImportacionEmpleadoHobbysWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.empleadohobbyParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEmpleadoHobbyReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEmpleadoHobbyActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEmpleadoHobby.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEmpleadoHobby.setFileImportacion(this.jInternalFrameImportacionEmpleadoHobby.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEmpleadoHobby.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEmpleadoHobby.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEmpleadoHobby.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEmpleadoHobby.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEmpleadoHobbyActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EmpleadoHobby> empleadohobbysSeleccionados=new ArrayList<EmpleadoHobby>();		

		empleadohobbysSeleccionados=this.getEmpleadoHobbysSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoHobby.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoHobby.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EmpleadoHobbyBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EmpleadoHobbyBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteEmpleadoHobbys("Todos",empleadohobbysSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadohobbySessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Hobby",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoHobby.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoHobby.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmpleadoHobbyConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoHobbyConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoHobbyConstantesFunciones.LABEL_IDHOBBY:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Hobby_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Hobby_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Hobby_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Hobby_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoEmpleadoHobby.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoHobby.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoHobby.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EmpleadoHobbyConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case EmpleadoHobbyConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case EmpleadoHobbyConstantesFunciones.LABEL_IDHOBBY:
					sNombreCampoCategoria="id_hobby";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoHobby.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EmpleadoHobbyConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case EmpleadoHobbyConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case EmpleadoHobbyConstantesFunciones.LABEL_IDHOBBY:
					sNombreCampoCategoriaValor="id_hobby";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoHobby.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoHobby.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmpleadoHobbyConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case EmpleadoHobbyConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case EmpleadoHobbyConstantesFunciones.LABEL_IDHOBBY:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hobby",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_hobby");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoEmpleadoHobbyActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EmpleadoHobby> empleadohobbysSeleccionados=new ArrayList<EmpleadoHobby>();		
		
		empleadohobbysSeleccionados=this.getEmpleadoHobbysSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadohobby";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("EmpleadoHobbys");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEmpleadoHobby.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoHobby.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EmpleadoHobbyConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoHobbyConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(EmpleadoHobby empleadohobby:empleadohobbysSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadohobby.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoHobbyConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoHobbyConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(EmpleadoHobby empleadohobby:empleadohobbysSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadohobby.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoHobbyConstantesFunciones.LABEL_IDHOBBY:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoHobbyConstantesFunciones.LABEL_IDHOBBY);
					iRow++;

					for(EmpleadoHobby empleadohobby:empleadohobbysSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadohobby.gethobby_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelEmpleadoHobby(row);				
			//	iRow++;
			//}				
			
			//for(EmpleadoHobby empleadohobbyAux:empleadohobbysSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEmpleadoHobby(empleadohobbyAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadohobbySessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Hobby",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoHobby(false);
			
			//SI ES MANUAL
			if(EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoHobby();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEmpleadoHobbyActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoHobby(false);
			
			//SI ES MANUAL
			if(EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmpleadoHobby();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEmpleadoHobbyActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoHobby(false);
			
			//SI ES MANUAL
			if(EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmpleadoHobby();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEmpleadoHobby() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEmpleadoHobby.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEmpleadoHobby.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEmpleadoHobby.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEmpleadoHobby.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEmpleadoHobby.setMinimumSize(dimensionMinimum);
		this.jTableDatosEmpleadoHobby.setMaximumSize(dimensionMaximum);
		this.jTableDatosEmpleadoHobby.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEmpleadoHobby(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEmpleadoHobby(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEmpleadoHobby(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEmpleadoHobby(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEmpleadoHobby(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEmpleadoHobby(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoHobby(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEmpleadoHobby(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEmpleadoHobby() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEmpleadoHobby();
		
		this.inicializarActualizarBindingBotonesManualEmpleadoHobby(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEmpleadoHobby();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoHobby() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoHobby(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoHobby(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEmpleadoHobby.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEmpleadoHobby.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEmpleadoHobby.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEmpleadoHobby.jCheckBoxPostAccionNuevoEmpleadoHobby.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEmpleadoHobby.jCheckBoxPostAccionSinCerrarEmpleadoHobby.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEmpleadoHobby.jCheckBoxPostAccionSinMensajeEmpleadoHobby.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEmpleadoHobby.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEmpleadoHobby.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEmpleadoHobby.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
				this.jInternalFrameDetalleFormEmpleadoHobby.jCheckBoxPostAccionNuevoEmpleadoHobby.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEmpleadoHobby.jCheckBoxPostAccionSinCerrarEmpleadoHobby.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEmpleadoHobby.jCheckBoxPostAccionSinMensajeEmpleadoHobby.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEmpleadoHobby.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEmpleadoHobby.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxTiposAccionesFormularioEmpleadoHobby.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEmpleadoHobby.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEmpleadoHobby!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoHobby.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEmpleadoHobby.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEmpleadoHobby.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEmpleadoHobby.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEmpleadoHobby.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEmpleadoHobby!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoHobby.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEmpleadoHobby.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEmpleadoHobby.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEmpleadoHobby(Boolean esInicializar) throws Exception {
		try	{	
			if(EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoHobby(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoHobby() throws Exception {
		try	{
			if(EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEmpleadoHobby();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmpleadoHobby() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxTiposAccionesFormularioEmpleadoHobby.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxTiposAccionesFormularioEmpleadoHobby.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEmpleadoHobby() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEmpleadoHobby.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEmpleadoHobby.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEmpleadoHobby.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEmpleadoHobby.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEmpleadoHobby.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEmpleadoHobby.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEmpleadoHobby.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEmpleadoHobby.addItem(reporte);
			}
			
			
			if(!this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEmpleadoHobby.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEmpleadoHobby.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEmpleadoHobby.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEmpleadoHobby.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEmpleadoHobby.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEmpleadoHobby.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxTiposAccionesFormularioEmpleadoHobby.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxTiposAccionesFormularioEmpleadoHobby.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEmpleadoHobby.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEmpleadoHobby.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEmpleadoHobby.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoHobby();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoHobby() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmpleadoHobby!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoHobby.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmpleadoHobby.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmpleadoHobby!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoHobby.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmpleadoHobby.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEmpleadoHobby!=null) {
				
				if(this.jInternalFrameReporteDinamicoEmpleadoHobby.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoHobby.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpleadoHobby.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEmpleadoHobby.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoHobby.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpleadoHobby.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEmpleadoHobby()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHobby.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHobby.getSelectedItem()).getId();}
		if(this.jComboBoxid_hobbyFK_IdHobbyEmpleadoHobby.getSelectedItem()!=null){this.id_hobbyFK_IdHobby=((Hobby)this.jComboBoxid_hobbyFK_IdHobbyEmpleadoHobby.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEmpleadoHobby(Boolean esInicializar) throws Exception {				
		if(EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEmpleadoHobby();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEmpleadoHobby() throws Exception {
		this.inicializarActualizarBindingTablaEmpleadoHobby(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEmpleadoHobby() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEmpleadoHobby.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEmpleadoHobby.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoHobby.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EmpleadoHobbyPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEmpleadoHobby.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoHobby.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EmpleadoHobbyPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEmpleadoHobbyOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoHobbyOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EmpleadoHobbyPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEmpleadoHobby.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoHobby.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EmpleadoHobbyPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEmpleadoHobby.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEmpleadoHobby(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=empleadohobbyLogic.getEmpleadoHobbys().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=empleadohobbys.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEmpleadoHobby.setModel(new EmpleadoHobbyModel(this.empleadohobbyLogic.getEmpleadoHobbys(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEmpleadoHobby.setModel(new EmpleadoHobbyModel(this.empleadohobbys,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEmpleadoHobby!=null && this.jInternalFrameOrderByEmpleadoHobby.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEmpleadoHobby();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEmpleadoHobby.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoHobby,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EmpleadoHobbyPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO,empleadohobbyConstantesFunciones.resaltarSeleccionarEmpleadoHobby,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO,empleadohobbyConstantesFunciones.resaltarSeleccionarEmpleadoHobby,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEmpleadoHobby.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoHobby,EmpleadoHobbyConstantesFunciones.LABEL_ID));

		if(this.empleadohobbyConstantesFunciones.mostraridEmpleadoHobby && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoHobbyConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empleadohobbyConstantesFunciones.resaltaridEmpleadoHobby,this.empleadohobbyConstantesFunciones.activaridEmpleadoHobby,this,true,"idEmpleadoHobby","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadohobbyConstantesFunciones.resaltaridEmpleadoHobby,this.empleadohobbyConstantesFunciones.activaridEmpleadoHobby,this,true,"idEmpleadoHobby","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoHobby.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoHobby,EmpleadoHobbyConstantesFunciones.LABEL_IDEMPRESA));

		if(this.empleadohobbyConstantesFunciones.mostrarid_empresaEmpleadoHobby && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoHobbyConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.empleadohobbyConstantesFunciones.resaltarid_empresaEmpleadoHobby,this,this.empleadohobbyConstantesFunciones.activarid_empresaEmpleadoHobby));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.empleadohobbyConstantesFunciones.resaltarid_empresaEmpleadoHobby,this,this.empleadohobbyConstantesFunciones.activarid_empresaEmpleadoHobby,false,"id_empresaEmpleadoHobby","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoHobbyPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoHobby.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoHobby,EmpleadoHobbyConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.empleadohobbyConstantesFunciones.mostrarid_empleadoEmpleadoHobby && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoHobbyConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.empleadohobbyConstantesFunciones.resaltarid_empleadoEmpleadoHobby,this,this.empleadohobbyConstantesFunciones.activarid_empleadoEmpleadoHobby));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.empleadohobbyConstantesFunciones.resaltarid_empleadoEmpleadoHobby,this,this.empleadohobbyConstantesFunciones.activarid_empleadoEmpleadoHobby,true,"id_empleadoEmpleadoHobby","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new EmpleadoHobbyPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoHobby.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoHobby,EmpleadoHobbyConstantesFunciones.LABEL_IDHOBBY));

		if(this.empleadohobbyConstantesFunciones.mostrarid_hobbyEmpleadoHobby && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoHobbyConstantesFunciones.LABEL_IDHOBBY,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new HobbyTableCell(this.hobbysForeignKey,this.empleadohobbyConstantesFunciones.resaltarid_hobbyEmpleadoHobby,this,this.empleadohobbyConstantesFunciones.activarid_hobbyEmpleadoHobby));
			tableColumn.setCellEditor(new HobbyTableCell(this.hobbysForeignKey,this.empleadohobbyConstantesFunciones.resaltarid_hobbyEmpleadoHobby,this,this.empleadohobbyConstantesFunciones.activarid_hobbyEmpleadoHobby,true,"id_hobbyEmpleadoHobby","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoHobbyPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.empleadohobbySessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.empleadohobbySessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.empleadohobbySessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmpleadoHobby.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.empleadohobbySessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.empleadohobbySessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmpleadoHobby.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEmpleadoHobby && this.isPermisoGuardarCambiosEmpleadoHobby) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.empleadohobbySessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.empleadohobbySessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEmpleadoHobby.addColumn(tableColumn);
				}
			}			
						
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosEmpleadoHobby.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmpleadoHobby && this.isPermisoGuardarCambiosEmpleadoHobby) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmpleadoHobby && this.isPermisoGuardarCambiosEmpleadoHobby) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEmpleadoHobby.moveColumn(this.jTableDatosEmpleadoHobby.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEmpleadoHobby.moveColumn(this.jTableDatosEmpleadoHobby.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEmpleadoHobby.moveColumn(this.jTableDatosEmpleadoHobby.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEmpleadoHobby.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEmpleadoHobby.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEmpleadoHobby,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEmpleadoHobby.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEmpleadoHobby.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEmpleadoHobby.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEmpleadoHobby.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEmpleadoHobby.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=empleadohobbyLogic.getEmpleadoHobbys().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=empleadohobbys.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosEmpleadoHobby.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEmpleadoHobby.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEmpleadoHobby();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoEmpleadoHobby=false;
					
				EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
			
				if(this.empleadohobbySessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEmpleadoHobby==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmpleadoHobby.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmpleadoHobby.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobby =(EmpleadoHobby) this.empleadohobbyLogic.getEmpleadoHobbys().toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadohobby =(EmpleadoHobby) this.empleadohobbys.toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.empleadohobby.getsType().equals("DUPLICADO")
				   || this.empleadohobby.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEmpleadoHobby=true;
				
				} else {
					this.isEsNuevoEmpleadoHobby=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
					if(this.empleadohobby.getId()>=0 && !this.empleadohobby.getIsNew()) {						
						this.isEsNuevoEmpleadoHobby=false;
						
					} else {
						this.isEsNuevoEmpleadoHobby=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEmpleadoHobby(esRelaciones);						
				
				this.seleccionarEmpleadoHobby(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.empleadohobby.getId()<0) {
					this.isEsNuevoEmpleadoHobby=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEmpleadoHobby(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEmpleadoHobby(evt,rowIndex);
				}	
				
				if(this.empleadohobbySessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EmpleadoHobby: " + this.dDif); 
					}
				}								
				
				EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEmpleadoHobby(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.empleadohobby)) {
					if(this.empleadohobby.getId()>0) {
						this.empleadohobby.setIsDeleted(true);
						
						this.empleadohobbysEliminados.add(this.empleadohobby);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.empleadohobbyLogic.getEmpleadoHobbys().remove(this.empleadohobby);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.empleadohobbys.remove(this.empleadohobby);				
					}
					
					
					((EmpleadoHobbyModel) this.jTableDatosEmpleadoHobby.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoHobby(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEmpleadoHobby(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEmpleadoHobby) {
			
			if(this.jInternalFrameDetalleFormEmpleadoHobby==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmpleadoHobby.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmpleadoHobby.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobby =(EmpleadoHobby) this.empleadohobbyLogic.getEmpleadoHobbys().toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadohobby =(EmpleadoHobby) this.empleadohobbys.toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEmpleadoHobby(this.empleadohobby);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.empleadohobbyConstantesFunciones.cargarid_empresaEmpleadoHobby || this.empleadohobbyConstantesFunciones.event_dependid_empresaEmpleadoHobby) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.empleadohobby.getid_empresa());
									//this.inicializarActualizarBindingEmpleadoHobby(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(empleadohobby.getEmpresa()!=null) {
							this.empresasForeignKey.add(empleadohobby.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.empleadohobby.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.empleadohobbyConstantesFunciones.cargarid_empleadoEmpleadoHobby || this.empleadohobbyConstantesFunciones.event_dependid_empleadoEmpleadoHobby) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.empleadohobby.getid_empleado());
									//this.inicializarActualizarBindingEmpleadoHobby(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(empleadohobby.getEmpleado()!=null) {
							this.empleadosForeignKey.add(empleadohobby.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.empleadohobby.getid_empleado(),false,"Formulario");

					//Hobby
					if(!this.empleadohobbyConstantesFunciones.cargarid_hobbyEmpleadoHobby || this.empleadohobbyConstantesFunciones.event_dependid_hobbyEmpleadoHobby) {
						//this.cargarCombosHobbysForeignKeyLista(" where id="+this.empleadohobby.getid_hobby());
									//this.inicializarActualizarBindingEmpleadoHobby(false,false);
						this.hobbysForeignKey=new ArrayList<Hobby>();

						if(empleadohobby.getHobby()!=null) {
							this.hobbysForeignKey.add(empleadohobby.getHobby());
						}

						this.addItemDefectoCombosForeignKeyHobby();
						this.cargarCombosFrameHobbysForeignKey("Todos");
					}
					this.setActualHobbyForeignKey(this.empleadohobby.getid_hobby(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEmpleadoHobby("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEmpleadoHobby(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoHobby() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmpleadoHobby(EmpleadoHobby empleadohobby) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEmpleadoHobby(empleadohobby,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmpleadoHobby(EmpleadoHobby empleadohobby,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEmpleadoHobby(empleadohobby);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEmpleadoHobby(empleadohobby,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoHobby(empleadohobby);
	}
	
	public void setVariablesObjetoActualToFormularioEmpleadoHobby(EmpleadoHobby empleadohobby) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEmpleadoHobby==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEmpleadoHobby.jLabelidEmpleadoHobby.setText(empleadohobby.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EmpleadoHobby empleadohobbyLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,empleadohobbyLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EmpleadoHobby empleadohobbyLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				empleadohobbyLocal=this.empleadohobby;
			} else {
				empleadohobbyLocal=this.empleadohobbyAnterior;
			}
		}
		
		if(this.permiteMantenimiento(empleadohobbyLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEmpleadoHobby(empleadohobbyLocal,true);
					
					if(empleadohobbySessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(empleadohobbyLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(empleadohobbyLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEmpleadoHobby(EmpleadoHobby empleadohobby,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmpleadoHobby(empleadohobby,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHobby(empleadohobby);
	}
	
	public void setVariablesFormularioToObjetoActualEmpleadoHobby(EmpleadoHobby empleadohobby,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmpleadoHobby(empleadohobby,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEmpleadoHobby(EmpleadoHobby empleadohobby,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoHobby==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEmpleadoHobby.jLabelidEmpleadoHobby.getText()==null || this.jInternalFrameDetalleFormEmpleadoHobby.jLabelidEmpleadoHobby.getText()=="" || this.jInternalFrameDetalleFormEmpleadoHobby.jLabelidEmpleadoHobby.getText()=="Id") {
				this.jInternalFrameDetalleFormEmpleadoHobby.jLabelidEmpleadoHobby.setText("0");
			}

			if(conColumnasBase) {empleadohobby.setId(Long.parseLong(this.jInternalFrameDetalleFormEmpleadoHobby.jLabelidEmpleadoHobby.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoHobbyConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoHobby.jLabelIdEmpleadoHobby,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmpleadoHobby(EmpleadoHobby empleadohobbyBean,EmpleadoHobby empleadohobby,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && empleadohobbyBean.getid_empleado()!=null && !empleadohobbyBean.getid_empleado().equals(-1L))) {empleadohobby.setid_empleado(empleadohobbyBean.getid_empleado());}
			if(conDefault || (!conDefault && empleadohobbyBean.getid_hobby()!=null && !empleadohobbyBean.getid_hobby().equals(-1L))) {empleadohobby.setid_hobby(empleadohobbyBean.getid_hobby());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEmpleadoHobby(EmpleadoHobby empleadohobbyOrigen,EmpleadoHobby empleadohobby,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && empleadohobbyOrigen.getId()!=null && !empleadohobbyOrigen.getId().equals(0L))) {empleadohobby.setId(empleadohobbyOrigen.getId());}}
			if(conDefault || (!conDefault && empleadohobbyOrigen.getid_empleado()!=null && !empleadohobbyOrigen.getid_empleado().equals(-1L))) {empleadohobby.setid_empleado(empleadohobbyOrigen.getid_empleado());}
			if(conDefault || (!conDefault && empleadohobbyOrigen.getid_hobby()!=null && !empleadohobbyOrigen.getid_hobby().equals(-1L))) {empleadohobby.setid_hobby(empleadohobbyOrigen.getid_hobby());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmpleadoHobby(EmpleadoHobby empleadohobby) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmpleadoHobby.jLabelidEmpleadoHobby.setText(empleadohobby.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmpleadoHobby(EmpleadoHobbyBean empleadohobbyBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmpleadoHobby.jLabelidEmpleadoHobby.setText(empleadohobbyBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEmpleadoHobby(EmpleadoHobbyParameterReturnGeneral empleadohobbyReturnGeneral,EmpleadoHobbyBean empleadohobbyBean,Boolean conDefault) throws Exception { 
		try {
			EmpleadoHobby empleadohobbyLocal=new EmpleadoHobby();
			
			empleadohobbyLocal=empleadohobbyReturnGeneral.getEmpleadoHobby();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && empleadohobbyLocal.getId()!=null && !empleadohobbyLocal.getId().equals(0L))) {empleadohobbyBean.setId(empleadohobbyLocal.getId());}}
			if(conDefault || (!conDefault && empleadohobbyLocal.getid_empleado()!=null && !empleadohobbyLocal.getid_empleado().equals(-1L))) {empleadohobbyBean.setid_empleado(empleadohobbyLocal.getid_empleado());}
			if(conDefault || (!conDefault && empleadohobbyLocal.getid_hobby()!=null && !empleadohobbyLocal.getid_hobby().equals(-1L))) {empleadohobbyBean.setid_hobby(empleadohobbyLocal.getid_hobby());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEmpleadoHobbyGenerico(Long idEmpleadoHobbySeleccionado,JComboBox jComboBoxEmpleadoHobby,List<EmpleadoHobby> empleadohobbysLocal)throws Exception {
		try {
			EmpleadoHobby  empleadohobbyTemp=null;

			for(EmpleadoHobby empleadohobbyAux:empleadohobbysLocal) {
				if(empleadohobbyAux.getId()!=null && empleadohobbyAux.getId().equals(idEmpleadoHobbySeleccionado)) {
					empleadohobbyTemp=empleadohobbyAux;
					break;
				}
			}

			jComboBoxEmpleadoHobby.setSelectedItem(empleadohobbyTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEmpleadoHobbyGenerico(JComboBox jComboBoxEmpleadoHobby,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxEmpleadoHobby.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmpleadoHobby.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEmpleadoHobby.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmpleadoHobby.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmpleadoHobby.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEmpleadoHobby.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmpleadoHobby.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEmpleadoHobby.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEmpleadoHobby.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEmpleadoHobby.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadohobby=(EmpleadoHobby) empleadohobbyLogic.getEmpleadoHobbys().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			empleadohobby =(EmpleadoHobby) empleadohobbys.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!empleadohobby.getIsNew() && !empleadohobby.getIsChanged() && !empleadohobby.getIsDeleted()) {
				sDescripcion=empleadohobby.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=empleadohobby.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!empleadohobby.getIsNew() && !empleadohobby.getIsChanged() && !empleadohobby.getIsDeleted()) {
				sDescripcion=empleadohobby.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=empleadohobby.getempleado_descripcion();
			}
		}

		if(sTipo.equals("Hobby")) {
			//sDescripcion=this.getActualHobbyForeignKeyDescripcion((Long)value);
			if(!empleadohobby.getIsNew() && !empleadohobby.getIsChanged() && !empleadohobby.getIsDeleted()) {
				sDescripcion=empleadohobby.gethobby_descripcion();
			} else {
				//sDescripcion=this.getActualHobbyForeignKeyDescripcion((Long)value);
				sDescripcion=empleadohobby.gethobby_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EmpleadoHobby empleadohobbyRow=new EmpleadoHobby();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadohobbyRow=(EmpleadoHobby) empleadohobbyLogic.getEmpleadoHobbys().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			empleadohobbyRow=(EmpleadoHobby) empleadohobbys.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEmpleadoHobby(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEmpleadoHobby.setVisible((this.isVisibilidadCeldaNuevoEmpleadoHobby && this.isPermisoNuevoEmpleadoHobby));			
			this.jButtonDuplicarEmpleadoHobby.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoHobby && this.isPermisoDuplicarEmpleadoHobby));			
			this.jButtonCopiarEmpleadoHobby.setVisible((this.isVisibilidadCeldaCopiarEmpleadoHobby && this.isPermisoCopiarEmpleadoHobby));
			this.jButtonVerFormEmpleadoHobby.setVisible((this.isVisibilidadCeldaVerFormEmpleadoHobby && this.isPermisoVerFormEmpleadoHobby));
			
			this.jButtonAbrirOrderByEmpleadoHobby.setVisible((this.isVisibilidadCeldaOrdenEmpleadoHobby && this.isPermisoOrdenEmpleadoHobby));			
			
			this.jButtonNuevoRelacionesEmpleadoHobby.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoHobby && this.isPermisoNuevoEmpleadoHobby));			
			this.jButtonNuevoGuardarCambiosEmpleadoHobby.setVisible((this.isVisibilidadCeldaNuevoEmpleadoHobby && this.isPermisoNuevoEmpleadoHobby && this.isPermisoGuardarCambiosEmpleadoHobby));
			
			if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
			this.jInternalFrameDetalleFormEmpleadoHobby.jButtonModificarEmpleadoHobby.setVisible((this.isVisibilidadCeldaModificarEmpleadoHobby && this.isPermisoActualizarEmpleadoHobby));	
			this.jInternalFrameDetalleFormEmpleadoHobby.jButtonActualizarEmpleadoHobby.setVisible((this.isVisibilidadCeldaActualizarEmpleadoHobby && this.isPermisoActualizarEmpleadoHobby));	
			this.jInternalFrameDetalleFormEmpleadoHobby.jButtonEliminarEmpleadoHobby.setVisible((this.isVisibilidadCeldaEliminarEmpleadoHobby && this.isPermisoEliminarEmpleadoHobby));
			this.jInternalFrameDetalleFormEmpleadoHobby.jButtonCancelarEmpleadoHobby.setVisible(this.isVisibilidadCeldaCancelarEmpleadoHobby);							
			this.jInternalFrameDetalleFormEmpleadoHobby.jButtonGuardarCambiosEmpleadoHobby.setVisible((this.isVisibilidadCeldaGuardarEmpleadoHobby && this.isPermisoGuardarCambiosEmpleadoHobby));			
			
			}
						
			this.jButtonGuardarCambiosTablaEmpleadoHobby.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoHobby && this.isPermisoGuardarCambiosEmpleadoHobby));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEmpleadoHobby.setVisible((this.isVisibilidadCeldaNuevoEmpleadoHobby && this.isPermisoNuevoEmpleadoHobby));						
			this.jButtonDuplicarToolBarEmpleadoHobby.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoHobby && this.isPermisoDuplicarEmpleadoHobby));						
			this.jButtonCopiarToolBarEmpleadoHobby.setVisible((this.isVisibilidadCeldaCopiarEmpleadoHobby && this.isPermisoCopiarEmpleadoHobby));			
			this.jButtonVerFormToolBarEmpleadoHobby.setVisible((this.isVisibilidadCeldaVerFormEmpleadoHobby && this.isPermisoVerFormEmpleadoHobby));			
			this.jButtonAbrirOrderByToolBarEmpleadoHobby.setVisible((this.isVisibilidadCeldaOrdenEmpleadoHobby && this.isPermisoOrdenEmpleadoHobby));
			this.jButtonNuevoRelacionesToolBarEmpleadoHobby.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoHobby && this.isPermisoNuevoEmpleadoHobby));			
			this.jButtonNuevoGuardarCambiosToolBarEmpleadoHobby.setVisible((this.isVisibilidadCeldaNuevoEmpleadoHobby && this.isPermisoNuevoEmpleadoHobby && this.isPermisoGuardarCambiosEmpleadoHobby));			
			
			if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
			this.jInternalFrameDetalleFormEmpleadoHobby.jButtonModificarToolBarEmpleadoHobby.setVisible((this.isVisibilidadCeldaModificarEmpleadoHobby && this.isPermisoActualizarEmpleadoHobby));	
			this.jInternalFrameDetalleFormEmpleadoHobby.jButtonActualizarToolBarEmpleadoHobby.setVisible((this.isVisibilidadCeldaActualizarEmpleadoHobby  && this.isPermisoActualizarEmpleadoHobby));	
			this.jInternalFrameDetalleFormEmpleadoHobby.jButtonEliminarToolBarEmpleadoHobby.setVisible((this.isVisibilidadCeldaEliminarEmpleadoHobby && this.isPermisoEliminarEmpleadoHobby));
			this.jInternalFrameDetalleFormEmpleadoHobby.jButtonCancelarToolBarEmpleadoHobby.setVisible(this.isVisibilidadCeldaCancelarEmpleadoHobby);				
			this.jInternalFrameDetalleFormEmpleadoHobby.jButtonGuardarCambiosToolBarEmpleadoHobby.setVisible((this.isVisibilidadCeldaGuardarEmpleadoHobby && this.isPermisoGuardarCambiosEmpleadoHobby));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEmpleadoHobby.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoHobby && this.isPermisoGuardarCambiosEmpleadoHobby));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEmpleadoHobby.setVisible((this.isVisibilidadCeldaNuevoEmpleadoHobby && this.isPermisoNuevoEmpleadoHobby));			
			this.jMenuItemDuplicarEmpleadoHobby.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoHobby && this.isPermisoDuplicarEmpleadoHobby));			
			this.jMenuItemCopiarEmpleadoHobby.setVisible((this.isVisibilidadCeldaCopiarEmpleadoHobby && this.isPermisoCopiarEmpleadoHobby));			
			this.jMenuItemVerFormEmpleadoHobby.setVisible((this.isVisibilidadCeldaVerFormEmpleadoHobby && this.isPermisoVerFormEmpleadoHobby));			
			this.jMenuItemAbrirOrderByEmpleadoHobby.setVisible((this.isVisibilidadCeldaOrdenEmpleadoHobby && this.isPermisoOrdenEmpleadoHobby));			
			//this.jMenuItemMostrarOcultarEmpleadoHobby.setVisible((this.isVisibilidadCeldaOrdenEmpleadoHobby && this.isPermisoOrdenEmpleadoHobby));
			this.jMenuItemDetalleAbrirOrderByEmpleadoHobby.setVisible((this.isVisibilidadCeldaOrdenEmpleadoHobby && this.isPermisoOrdenEmpleadoHobby));			
			//this.jMenuItemDetalleMostrarOcultarEmpleadoHobby.setVisible((this.isVisibilidadCeldaOrdenEmpleadoHobby && this.isPermisoOrdenEmpleadoHobby));			
			this.jMenuItemNuevoRelacionesEmpleadoHobby.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoHobby && this.isPermisoNuevoEmpleadoHobby));			
			this.jMenuItemNuevoGuardarCambiosEmpleadoHobby.setVisible((this.isVisibilidadCeldaNuevoEmpleadoHobby && this.isPermisoNuevoEmpleadoHobby && this.isPermisoGuardarCambiosEmpleadoHobby));									
			
			if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
			this.jInternalFrameDetalleFormEmpleadoHobby.jMenuItemModificarEmpleadoHobby.setVisible((this.isVisibilidadCeldaModificarEmpleadoHobby && this.isPermisoActualizarEmpleadoHobby));	
			this.jInternalFrameDetalleFormEmpleadoHobby.jMenuItemActualizarEmpleadoHobby.setVisible((this.isVisibilidadCeldaActualizarEmpleadoHobby && this.isPermisoActualizarEmpleadoHobby));	
			this.jInternalFrameDetalleFormEmpleadoHobby.jMenuItemEliminarEmpleadoHobby.setVisible((this.isVisibilidadCeldaEliminarEmpleadoHobby && this.isPermisoEliminarEmpleadoHobby));
			this.jInternalFrameDetalleFormEmpleadoHobby.jMenuItemCancelarEmpleadoHobby.setVisible(this.isVisibilidadCeldaCancelarEmpleadoHobby);				
			}
			
			this.jMenuItemGuardarCambiosEmpleadoHobby.setVisible((this.isVisibilidadCeldaGuardarEmpleadoHobby && this.isPermisoGuardarCambiosEmpleadoHobby));						
			this.jMenuItemGuardarCambiosTablaEmpleadoHobby.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoHobby && this.isPermisoGuardarCambiosEmpleadoHobby));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEmpleadoHobby=this.jButtonNuevoEmpleadoHobby.isVisible();
			this.isVisibilidadCeldaDuplicarEmpleadoHobby=this.jButtonDuplicarEmpleadoHobby.isVisible();
			this.isVisibilidadCeldaCopiarEmpleadoHobby=this.jButtonCopiarEmpleadoHobby.isVisible();
			this.isVisibilidadCeldaVerFormEmpleadoHobby=this.jButtonVerFormEmpleadoHobby.isVisible();
			
			this.isVisibilidadCeldaOrdenEmpleadoHobby=this.jButtonAbrirOrderByEmpleadoHobby.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoHobby=this.jButtonNuevoRelacionesEmpleadoHobby.isVisible();
			this.isVisibilidadCeldaModificarEmpleadoHobby=this.jButtonModificarEmpleadoHobby.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
			this.isVisibilidadCeldaActualizarEmpleadoHobby=this.jInternalFrameDetalleFormEmpleadoHobby.jButtonActualizarEmpleadoHobby.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoHobby=this.jInternalFrameDetalleFormEmpleadoHobby.jButtonEliminarEmpleadoHobby.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoHobby=this.jInternalFrameDetalleFormEmpleadoHobby.jButtonCancelarEmpleadoHobby.isVisible();
			this.isVisibilidadCeldaGuardarEmpleadoHobby=this.jInternalFrameDetalleFormEmpleadoHobby.jButtonGuardarCambiosEmpleadoHobby.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEmpleadoHobby=this.jButtonGuardarCambiosTablaEmpleadoHobby.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEmpleadoHobby=this.jButtonNuevoToolBarEmpleadoHobby.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoHobby=this.jButtonNuevoRelacionesToolBarEmpleadoHobby.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
			this.isVisibilidadCeldaModificarEmpleadoHobby=this.jInternalFrameDetalleFormEmpleadoHobby.jButtonModificarToolBarEmpleadoHobby.isVisible();
			this.isVisibilidadCeldaActualizarEmpleadoHobby=this.jInternalFrameDetalleFormEmpleadoHobby.jButtonActualizarToolBarEmpleadoHobby.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoHobby=this.jInternalFrameDetalleFormEmpleadoHobby.jButtonEliminarToolBarEmpleadoHobby.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoHobby=this.jInternalFrameDetalleFormEmpleadoHobby.jButtonCancelarToolBarEmpleadoHobby.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmpleadoHobby=this.jButtonGuardarCambiosToolBarEmpleadoHobby.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmpleadoHobby=this.jButtonGuardarCambiosTablaToolBarEmpleadoHobby.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEmpleadoHobby=this.jMenuItemNuevoEmpleadoHobby.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoHobby=this.jMenuItemNuevoRelacionesEmpleadoHobby.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
			this.isVisibilidadCeldaModificarEmpleadoHobby=this.jInternalFrameDetalleFormEmpleadoHobby.jMenuItemModificarEmpleadoHobby.isVisible();
			this.isVisibilidadCeldaActualizarEmpleadoHobby=this.jInternalFrameDetalleFormEmpleadoHobby.jMenuItemActualizarEmpleadoHobby.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoHobby=this.jInternalFrameDetalleFormEmpleadoHobby.jMenuItemEliminarEmpleadoHobby.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoHobby=this.jInternalFrameDetalleFormEmpleadoHobby.jMenuItemCancelarEmpleadoHobby.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmpleadoHobby=this.jMenuItemGuardarCambiosEmpleadoHobby.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmpleadoHobby=this.jMenuItemGuardarCambiosTablaEmpleadoHobby.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEmpleadoHobby(Boolean esInicializar) {
		if(EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL) {			
			if(this.empleadohobbySessionBean.getConGuardarRelaciones()) {
				//if(this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEmpleadoHobby();
			}
			
			this.inicializarActualizarBindingBotonesManualEmpleadoHobby(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEmpleadoHobby() {
		this.jButtonNuevoEmpleadoHobby.setVisible(this.isPermisoNuevoEmpleadoHobby);			
		this.jButtonDuplicarEmpleadoHobby.setVisible(this.isPermisoDuplicarEmpleadoHobby);			
		this.jButtonCopiarEmpleadoHobby.setVisible(this.isPermisoCopiarEmpleadoHobby);			
		this.jButtonVerFormEmpleadoHobby.setVisible(this.isPermisoVerFormEmpleadoHobby);			
		
		this.jButtonAbrirOrderByEmpleadoHobby.setVisible(this.isPermisoOrdenEmpleadoHobby);					
		
		this.jButtonNuevoRelacionesEmpleadoHobby.setVisible(this.isPermisoNuevoEmpleadoHobby);			
		
		if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoHobby.jButtonModificarEmpleadoHobby.setVisible(this.isPermisoActualizarEmpleadoHobby);	
			this.jInternalFrameDetalleFormEmpleadoHobby.jButtonActualizarEmpleadoHobby.setVisible(this.isPermisoActualizarEmpleadoHobby);	
			this.jInternalFrameDetalleFormEmpleadoHobby.jButtonEliminarEmpleadoHobby.setVisible(this.isPermisoEliminarEmpleadoHobby);
			this.jInternalFrameDetalleFormEmpleadoHobby.jButtonCancelarEmpleadoHobby.setVisible(this.isVisibilidadCeldaCancelarEmpleadoHobby);						
			this.jInternalFrameDetalleFormEmpleadoHobby.jButtonGuardarCambiosEmpleadoHobby.setVisible(this.isPermisoGuardarCambiosEmpleadoHobby);							
		}
		
		this.jButtonGuardarCambiosTablaEmpleadoHobby.setVisible(this.isPermisoActualizarEmpleadoHobby);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEmpleadoHobby() {
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonModificarEmpleadoHobby.setVisible(this.isPermisoActualizarEmpleadoHobby);	
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonActualizarEmpleadoHobby.setVisible(this.isPermisoActualizarEmpleadoHobby);	
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonEliminarEmpleadoHobby.setVisible(this.isPermisoEliminarEmpleadoHobby);
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonCancelarEmpleadoHobby.setVisible(this.isVisibilidadCeldaCancelarEmpleadoHobby);							
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonGuardarCambiosEmpleadoHobby.setVisible((this.isVisibilidadCeldaGuardarEmpleadoHobby && this.isPermisoGuardarCambiosEmpleadoHobby));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEmpleadoHobby() {
		if(EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEmpleadoHobby();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEmpleadoHobby() {
	}
	
	public void jTableDatosEmpleadoHobbyListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEmpleadoHobby(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEmpleadoHobbyBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobbyLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoHobby.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoHobby(this.getempleadohobby(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHobby(this.empleadohobby);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadohobby =(EmpleadoHobby) this.empleadohobbyLogic.getEmpleadoHobbys().toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadohobby =(EmpleadoHobby) this.empleadohobbys.toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadohobby==null) {
						this.empleadohobby = new EmpleadoHobby();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoHobby(this.empleadohobby,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHobby(this.empleadohobby);
				}

				if(this.empleadohobby.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.empleadohobby.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoHobby(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobbyLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobbyLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobbyLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEmpleadoHobbyUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEmpleadoHobby(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoHobby.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoHobby.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoHobby.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobby =(EmpleadoHobby) this.empleadohobbyLogic.getEmpleadoHobbys().toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadohobby =(EmpleadoHobby) this.empleadohobbys.toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoHobby(this.getempleadohobby(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHobby(this.empleadohobby);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.empleadohobbyLogic.getConnexion());

				if(this.empleadohobby.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.empleadohobby.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoHobby=(TitledBorder)this.jScrollPanelDatosEmpleadoHobby.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEmpleadoHobby.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEmpleadoHobbyBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobbyLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoHobby.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoHobby(this.getempleadohobby(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHobby(this.empleadohobby);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadohobby =(EmpleadoHobby) this.empleadohobbyLogic.getEmpleadoHobbys().toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadohobby =(EmpleadoHobby) this.empleadohobbys.toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadohobby==null) {
						this.empleadohobby = new EmpleadoHobby();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoHobby(this.empleadohobby,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHobby(this.empleadohobby);
				}

				if(this.empleadohobby.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.empleadohobby.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoHobby(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobbyLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobbyLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobbyLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoEmpleadoHobbyActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="Empleado";

			if(!this.sFinalQueryGeneral_empleado.equals("")) {
				this.empleadoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_empleado);
				this.empleadoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.empleadoBeanSwingJInternalFrame.procesarBusqueda(this.empleadoBeanSwingJInternalFrame.sAccionBusqueda);
				this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingEmpleado(false);
			}

			if(!this.sFinalQueryComboEmpleado.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderEmpleadoHobby=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosEmpleadoHobby.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderEmpleadoHobby=(TitledBorder)this.jScrollPanelDatosEmpleadoHobby.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderEmpleadoHobby.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoEmpleadoHobbyUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebEmpleadoHobby(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoHobby.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoHobby.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoHobby.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobby =(EmpleadoHobby) this.empleadohobbyLogic.getEmpleadoHobbys().toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadohobby =(EmpleadoHobby) this.empleadohobbys.toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoHobby(this.getempleadohobby(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHobby(this.empleadohobby);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.empleadohobbyLogic.getConnexion());

				if(this.empleadohobby.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.empleadohobby.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoHobby=(TitledBorder)this.jScrollPanelDatosEmpleadoHobby.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderEmpleadoHobby.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoEmpleadoHobbyBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobbyLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoHobby.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoHobby(this.getempleadohobby(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHobby(this.empleadohobby);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadohobby =(EmpleadoHobby) this.empleadohobbyLogic.getEmpleadoHobbys().toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadohobby =(EmpleadoHobby) this.empleadohobbys.toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadohobby==null) {
						this.empleadohobby = new EmpleadoHobby();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoHobby(this.empleadohobby,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHobby(this.empleadohobby);
				}

				if(this.empleadohobby.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.empleadohobby.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoHobby(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobbyLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobbyLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobbyLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_hobbyEmpleadoHobbyUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisohobby=true;

			idTienePermisohobby=this.tienePermisosUsuarioEnPaginaWebEmpleadoHobby(HobbyConstantesFunciones.CLASSNAME);

			if(idTienePermisohobby) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoHobby.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoHobby.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoHobby.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobby =(EmpleadoHobby) this.empleadohobbyLogic.getEmpleadoHobbys().toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadohobby =(EmpleadoHobby) this.empleadohobbys.toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoHobby(this.getempleadohobby(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHobby(this.empleadohobby);

				this.hobbyBeanSwingJInternalFrame=new HobbyBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.hobbyBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.hobbyBeanSwingJInternalFrame.getHobbyLogic().setConnexion(this.empleadohobbyLogic.getConnexion());

				if(this.empleadohobby.getid_hobby()!=null) {
					this.hobbyBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.hobbyBeanSwingJInternalFrame.setIdActual(this.empleadohobby.getid_hobby());
					this.hobbyBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.hobbyBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.hobbyBeanSwingJInternalFrame.inicializarActualizarBindingTablaHobby();
				}

				JInternalFrameBase jinternalFrame =this.hobbyBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoHobby=(TitledBorder)this.jScrollPanelDatosEmpleadoHobby.getBorder();
				TitledBorder titledBorderhobby=(TitledBorder)this.hobbyBeanSwingJInternalFrame.jScrollPanelDatosHobby.getBorder();

				titledBorderhobby.setTitle(titledBorderEmpleadoHobby.getTitle() + " -> Hobby");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_hobbyEmpleadoHobbyBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobbyLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoHobby.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoHobby(this.getempleadohobby(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHobby(this.empleadohobby);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadohobby =(EmpleadoHobby) this.empleadohobbyLogic.getEmpleadoHobbys().toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadohobby =(EmpleadoHobby) this.empleadohobbys.toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadohobby==null) {
						this.empleadohobby = new EmpleadoHobby();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoHobby(this.empleadohobby,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHobby(this.empleadohobby);
				}

				if(this.empleadohobby.getid_hobby()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_hobby = "+this.empleadohobby.getid_hobby().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoHobby(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobbyLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobbyLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobbyLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoEmpleadoHobbyActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoHobby(false,false);

			this.getEmpleadoHobbysFK_IdEmpleado();

			this.inicializarActualizarBindingEmpleadoHobby(false);

			//if(EmpleadoHobbyBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoHobby(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaEmpleadoHobbyActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoHobby(false,false);

			this.getEmpleadoHobbysFK_IdEmpresa();

			this.inicializarActualizarBindingEmpleadoHobby(false);

			//if(EmpleadoHobbyBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoHobby(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdHobbyEmpleadoHobbyActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoHobby(false,false);

			this.getEmpleadoHobbysFK_IdHobby();

			this.inicializarActualizarBindingEmpleadoHobby(false);

			//if(EmpleadoHobbyBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoHobby(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadohobbyLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEmpleadoHobby() {
		if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
			this.jInternalFrameDetalleFormEmpleadoHobby.setVisible(false);	    			
			this.jInternalFrameDetalleFormEmpleadoHobby.dispose();
			this.jInternalFrameDetalleFormEmpleadoHobby=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEmpleadoHobby!=null) {
			this.jInternalFrameReporteDinamicoEmpleadoHobby.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEmpleadoHobby.dispose();
			this.jInternalFrameReporteDinamicoEmpleadoHobby=null;
		}
		
		if(this.jInternalFrameImportacionEmpleadoHobby!=null) {
			this.jInternalFrameImportacionEmpleadoHobby.setVisible(false);	    			
			this.jInternalFrameImportacionEmpleadoHobby.dispose();
			this.jInternalFrameImportacionEmpleadoHobby=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEmpleadoHobby();
			
			EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
			
			
			if(sTipo.equals("NuevoEmpleadoHobby")) {
				jButtonNuevoEmpleadoHobbyActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEmpleadoHobby")) {
				jButtonDuplicarEmpleadoHobbyActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEmpleadoHobby")) {
				jButtonCopiarEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("VerFormEmpleadoHobby")) {
				jButtonVerFormEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEmpleadoHobby")) {
				jButtonNuevoEmpleadoHobbyActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEmpleadoHobby")) {
				jButtonDuplicarEmpleadoHobbyActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEmpleadoHobby")) {
				jButtonNuevoEmpleadoHobbyActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEmpleadoHobby")) {
				jButtonDuplicarEmpleadoHobbyActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEmpleadoHobby")) {
				jButtonNuevoEmpleadoHobbyActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEmpleadoHobby")) {
				jButtonNuevoEmpleadoHobbyActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEmpleadoHobby")) {
				jButtonNuevoEmpleadoHobbyActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEmpleadoHobby")) {
				jButtonModificarEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEmpleadoHobby")) {
				jButtonModificarEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEmpleadoHobby")) {
				jButtonModificarEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEmpleadoHobby")) {
				jButtonActualizarEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEmpleadoHobby")) {
				jButtonActualizarEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEmpleadoHobby")) {
				jButtonActualizarEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("EliminarEmpleadoHobby")) {
				jButtonEliminarEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEmpleadoHobby")) {
				jButtonEliminarEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEmpleadoHobby")) {
				jButtonEliminarEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("CancelarEmpleadoHobby")) {
				jButtonCancelarEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEmpleadoHobby")) {
				jButtonCancelarEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEmpleadoHobby")) {
				jButtonCancelarEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("CerrarEmpleadoHobby")) {
				jButtonCerrarEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEmpleadoHobby")) {
				jButtonCerrarEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEmpleadoHobby")) {
				jButtonCerrarEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEmpleadoHobby")) {
				jButtonMostrarOcultarEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEmpleadoHobby")) {
				jButtonCancelarEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEmpleadoHobby")) {
				jButtonGuardarCambiosEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEmpleadoHobby")) {
				jButtonGuardarCambiosEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEmpleadoHobby")) {
				jButtonCopiarEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEmpleadoHobby")) {
				jButtonVerFormEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEmpleadoHobby")) {
				jButtonGuardarCambiosEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEmpleadoHobby")) {
				jButtonCopiarEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEmpleadoHobby")) {
				jButtonVerFormEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEmpleadoHobby")) {
				jButtonGuardarCambiosEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEmpleadoHobby")) {
				jButtonGuardarCambiosEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEmpleadoHobby")) {
				jButtonGuardarCambiosEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEmpleadoHobby")) {
				jButtonRecargarInformacionEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEmpleadoHobby")) {
				jButtonRecargarInformacionEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEmpleadoHobby")) {
				jButtonRecargarInformacionEmpleadoHobbyActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEmpleadoHobby")) {
				jButtonAnterioresEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEmpleadoHobby")) {
				jButtonAnterioresEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEmpleadoHobby")) {
				jButtonAnterioresEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEmpleadoHobby")) {
				jButtonSiguientesEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEmpleadoHobby")) {
				jButtonSiguientesEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEmpleadoHobby")) {
				jButtonSiguientesEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEmpleadoHobby") || sTipo.equals("MenuItemDetalleAbrirOrderByEmpleadoHobby")) {
				jButtonAbrirOrderByEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEmpleadoHobby") || sTipo.equals("MenuItemDetalleMostrarOcultarEmpleadoHobby")) {
				jButtonMostrarOcultarEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEmpleadoHobby")) {
				jButtonNuevoGuardarCambiosEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEmpleadoHobby")) {
				jButtonNuevoGuardarCambiosEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEmpleadoHobby")) {
				jButtonNuevoGuardarCambiosEmpleadoHobbyActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEmpleadoHobby")) {
				jButtonCerrarReporteDinamicoEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEmpleadoHobby")) {
				jButtonGenerarReporteDinamicoEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEmpleadoHobby")) {
				
				jButtonGenerarExcelReporteDinamicoEmpleadoHobbyActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEmpleadoHobby")) {
				jButtonCerrarImportacionEmpleadoHobbyActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEmpleadoHobby")) {
				
				jButtonGenerarImportacionEmpleadoHobbyActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEmpleadoHobby")) {
				
				jButtonAbrirImportacionEmpleadoHobbyActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEmpleadoHobby")) {
				jComboBoxTiposAccionesEmpleadoHobbyActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEmpleadoHobby")) {
				jComboBoxTiposRelacionesEmpleadoHobbyActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEmpleadoHobby")) {
				jComboBoxTiposAccionesEmpleadoHobbyActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEmpleadoHobby")) {
				
				jComboBoxTiposSeleccionarEmpleadoHobbyActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEmpleadoHobby")) {
				jTextFieldValorCampoGeneralEmpleadoHobbyActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEmpleadoHobby")) {
				jButtonAbrirOrderByEmpleadoHobbyActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEmpleadoHobby")) {
				jButtonAbrirOrderByEmpleadoHobbyActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEmpleadoHobby")) {
				jButtonCerrarOrderByEmpleadoHobbyActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmpleadoHobbyBusqueda")) {
				this.jButtonidEmpleadoHobbyBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEmpleadoHobbyUpdate")) {
				this.jButtonid_empresaEmpleadoHobbyUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEmpleadoHobbyBusqueda")) {
				this.jButtonid_empresaEmpleadoHobbyBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoHobby")) {
				this.jButtonid_empleadoEmpleadoHobbyActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoHobbyUpdate")) {
				this.jButtonid_empleadoEmpleadoHobbyUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoHobbyBusqueda")) {
				this.jButtonid_empleadoEmpleadoHobbyBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_hobbyEmpleadoHobbyUpdate")) {
				this.jButtonid_hobbyEmpleadoHobbyUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_hobbyEmpleadoHobbyBusqueda")) {
				this.jButtonid_hobbyEmpleadoHobbyBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_empleadoEmpleadoHobby")) {
				this.jButtonid_empleadoEmpleadoHobbyActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdEmpleadoEmpleadoHobby")) {
				this.jButtonFK_IdEmpleadoEmpleadoHobbyActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdHobbyEmpleadoHobby")) {
				this.jButtonFK_IdHobbyEmpleadoHobbyActionPerformed(evt);
			}
			
			;
			
			
			EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEmpleadoHobby();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoHobbyActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadohobby);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadohobby);
				
				EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
				
				


				
				EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoHobby.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoHobby.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EmpleadoHobby empleadohobbyLocal=null;
			
			if(!this.getEsControlTabla()) {
				empleadohobbyLocal=this.empleadohobby;
			} else {
				empleadohobbyLocal=this.empleadohobbyAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadohobby);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadohobby);
				
				EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
							
				
				


				
				EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoHobby.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoHobby.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoHobbyActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoHobby.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobbyAnterior =(EmpleadoHobby) this.empleadohobbyLogic.getEmpleadoHobbys().toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadohobbyAnterior =(EmpleadoHobby) this.empleadohobbys.toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoHobbyActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadohobby);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadohobby);
				
				EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
								
						
				


				
				EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoHobby.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoHobby.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadohobby);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadohobby);
				
				EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
								
				
				


				
				EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoHobby.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoHobby.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoHobbyActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoHobby.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobbyAnterior =(EmpleadoHobby) this.empleadohobbyLogic.getEmpleadoHobbys().toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadohobbyAnterior =(EmpleadoHobby) this.empleadohobbys.toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadohobby);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadohobby);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoHobbyActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoHobby.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobbyAnterior =(EmpleadoHobby) this.empleadohobbyLogic.getEmpleadoHobbys().toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadohobbyAnterior =(EmpleadoHobby) this.empleadohobbys.toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoHobbyActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadohobby);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadohobby);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadohobby);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadohobby);
				
				EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
							
				
				


				
				EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoHobby.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoHobby.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoHobbyActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmpleadoHobby.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadohobbyAnterior =(EmpleadoHobby) this.empleadohobbyLogic.getEmpleadoHobbys().toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.empleadohobbyAnterior =(EmpleadoHobby) this.empleadohobbys.toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoHobbyActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadohobby);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadohobby);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadohobby);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadohobby);
				
				EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
								
				
				


				
				EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoHobby.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoHobby.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoHobbyActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoHobby.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobbyAnterior =(EmpleadoHobby) this.empleadohobbyLogic.getEmpleadoHobbys().toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadohobbyAnterior =(EmpleadoHobby) this.empleadohobbys.toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoHobbyActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadohobby);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadohobby);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoHobbyActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadohobby);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadohobby);
				
				EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEmpleadoHobby")) {
					jCheckBoxSeleccionarTodosEmpleadoHobbyItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEmpleadoHobby")) {
					jCheckBoxSeleccionadosEmpleadoHobbyItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEmpleadoHobby")) {
					
				}
				
				


				
				
				EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoHobby.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoHobby.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadohobby);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.empleadohobby);
				
				EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
												
				
				


				
				
				EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoHobby.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoHobby.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoHobbyActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmpleadoHobby.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadohobbyAnterior =(EmpleadoHobby) this.empleadohobbyLogic.getEmpleadoHobbys().toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.empleadohobbyAnterior =(EmpleadoHobby) this.empleadohobbys.toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoHobbyActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadohobby);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadohobby);
				
				EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
				
				
				EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoHobbyActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadohobby);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadohobby);
				
				EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoHobby.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoHobby.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadohobby);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadohobby);
				
				EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoHobby.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoHobby.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoHobbyActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoHobby.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadohobbyAnterior =(EmpleadoHobby) this.empleadohobbyLogic.getEmpleadoHobbys().toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadohobbyAnterior =(EmpleadoHobby) this.empleadohobbys.toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEmpleadoHobby")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEmpleadoHobbyListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEmpleadoHobby.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.empleadohobby =(EmpleadoHobby) this.empleadohobbyLogic.getEmpleadoHobbys().toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.empleadohobby =(EmpleadoHobby) this.empleadohobbys.toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.empleadohobby);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEmpleadoHobby")) {
				
				}
				
				EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEmpleadoHobby")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEmpleadoHobby.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEmpleadoHobby")) {
			
			}
			
			EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEmpleadoHobby();
			
			EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
			
			if(sTipo.equals("NuevoEmpleadoHobby")) {
				jButtonNuevoEmpleadoHobbyActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEmpleadoHobby")) {
				jButtonDuplicarEmpleadoHobbyActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEmpleadoHobby")) {
				jButtonCopiarEmpleadoHobbyActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEmpleadoHobby")) {
				jButtonVerFormEmpleadoHobbyActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEmpleadoHobby")) {
				jButtonNuevoEmpleadoHobbyActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEmpleadoHobby")) {
				jButtonModificarEmpleadoHobbyActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEmpleadoHobby")) {
				jButtonActualizarEmpleadoHobbyActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEmpleadoHobby")) {
				jButtonEliminarEmpleadoHobbyActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEmpleadoHobby")) {
				jButtonGuardarCambiosEmpleadoHobbyActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEmpleadoHobby")) {
				jButtonCancelarEmpleadoHobbyActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEmpleadoHobby")) {
				jButtonCerrarEmpleadoHobbyActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEmpleadoHobby")) {
				jButtonGuardarCambiosEmpleadoHobbyActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEmpleadoHobby")) {
				jButtonNuevoGuardarCambiosEmpleadoHobbyActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEmpleadoHobby")) {
				jButtonAbrirOrderByEmpleadoHobbyActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEmpleadoHobby")) {
				jButtonRecargarInformacionEmpleadoHobbyActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEmpleadoHobby")) {
				jButtonAnterioresEmpleadoHobbyActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEmpleadoHobby")) {
				jButtonSiguientesEmpleadoHobbyActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmpleadoHobbyBusqueda")) {
				this.jButtonidEmpleadoHobbyBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEmpleadoHobbyUpdate")) {
				this.jButtonid_empresaEmpleadoHobbyUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEmpleadoHobbyBusqueda")) {
				this.jButtonid_empresaEmpleadoHobbyBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoHobby")) {
				this.jButtonid_empleadoEmpleadoHobbyActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoHobbyUpdate")) {
				this.jButtonid_empleadoEmpleadoHobbyUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoHobbyBusqueda")) {
				this.jButtonid_empleadoEmpleadoHobbyBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_hobbyEmpleadoHobbyUpdate")) {
				this.jButtonid_hobbyEmpleadoHobbyUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_hobbyEmpleadoHobbyBusqueda")) {
				this.jButtonid_hobbyEmpleadoHobbyBusquedaActionPerformed(evt);
			}
			
			EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEmpleadoHobby();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEmpleadoHobby")) {
				closingInternalFrameEmpleadoHobby();
				
			} else if(sTipo.equals("jButtonCancelarEmpleadoHobby")) {
				JInternalFrameBase jInternalFrameDetalleFormEmpleadoHobby = (JInternalFrameBase)evt.getSource();
	            	
	            EmpleadoHobbyBeanSwingJInternalFrame jInternalFrameParent=(EmpleadoHobbyBeanSwingJInternalFrame)jInternalFrameDetalleFormEmpleadoHobby.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEmpleadoHobbyActionPerformed(null);
			}
			
			EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.empleadohobby,new Object(),this.empleadohobbyParameterGeneral,this.empleadohobbyReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEmpleadoHobby(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEmpleadoHobby(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEmpleadoHobby(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.empleadohobby)) {
			if(!esControlTabla) {
				if(EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEmpleadoHobby(this.empleadohobby,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHobby(this.empleadohobby);			
				}
				
				if(this.empleadohobbySessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEmpleadoHobby(this.empleadohobby,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.empleadohobbyReturnGeneral=empleadohobbyLogic.procesarEventosEmpleadoHobbysWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadohobbyLogic.getEmpleadoHobbys(),this.empleadohobby,this.empleadohobbyParameterGeneral,this.isEsNuevoEmpleadoHobby,classes);//this.empleadohobbyLogic.getEmpleadoHobby()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEmpleadoHobby(this.empleadohobbyReturnGeneral,this.empleadohobbyBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.empleadohobbySessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEmpleadoHobby(classes,this.empleadohobbyReturnGeneral,this.empleadohobbyBean,false);
					}
						
					if(this.empleadohobbyReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoHobby(this.empleadohobbyReturnGeneral.getEmpleadoHobby());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEmpleadoHobby(this.empleadohobbyReturnGeneral.getEmpleadoHobby());	
					}
						
					if(this.empleadohobbyReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEmpleadoHobby(this.empleadohobbyReturnGeneral.getEmpleadoHobby(),classes);//this.empleadohobbyBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEmpleadoHobby(this.empleadohobby,classes);//this.empleadohobbyBean);									
				}
			
				if(EmpleadoHobbyJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEmpleadoHobby(this.empleadohobby,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHobby(this.empleadohobby);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.empleadohobbyAnterior!=null) {
						this.empleadohobby=this.empleadohobbyAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.empleadohobbyReturnGeneral=empleadohobbyLogic.procesarEventosEmpleadoHobbysWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadohobbyLogic.getEmpleadoHobbys(),this.empleadohobby,this.empleadohobbyParameterGeneral,this.isEsNuevoEmpleadoHobby,classes);//this.empleadohobbyLogic.getEmpleadoHobby()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.empleadohobbySessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.empleadohobbySessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.empleadohobbyReturnGeneral.getEmpleadoHobby(),empleadohobbyLogic.getEmpleadoHobbys());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.empleadohobbyReturnGeneral.getEmpleadoHobby(),this.empleadohobbys);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEmpleadoHobby.repaint();
				
				//((AbstractTableModel) this.jTableDatosEmpleadoHobby.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEmpleadoHobby();
			}
		}
	}
	
	public void actualizarVisualTableDatosEmpleadoHobby() throws Exception {
		
		EmpleadoHobbyModel empleadohobbyModel=(EmpleadoHobbyModel)this.jTableDatosEmpleadoHobby.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadohobbyModel.empleadohobbys=this.empleadohobbyLogic.getEmpleadoHobbys();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			empleadohobbyModel.empleadohobbys=this.empleadohobbys;
		}
		
		
		((EmpleadoHobbyModel) this.jTableDatosEmpleadoHobby.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEmpleadoHobby() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getempleadohobbyAnterior(),this.empleadohobbyLogic.getEmpleadoHobbys());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getempleadohobbyAnterior(),this.empleadohobbys);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEmpleadoHobby();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEmpleadoHobby(EmpleadoHobby empleadohobby,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadohobby,new Object(),generalEntityParameterGeneral,this.empleadohobbyReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.empleadohobbySessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EmpleadoHobbyConstantesFunciones.getClassesRelationshipsOfEmpleadoHobby(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EmpleadoHobbyConstantesFunciones.getClassesRelationshipsFromStringsOfEmpleadoHobby(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEmpleadoHobby(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EmpleadoHobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadohobby,new Object(),generalEntityParameterGeneral,this.empleadohobbyReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEmpleadoHobby(EmpleadoHobbyBean empleadohobbyBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEmpleadoHobby(ArrayList<Classe> classes,EmpleadoHobbyReturnGeneral empleadohobbyReturnGeneral,EmpleadoHobbyBean empleadohobbyBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEmpleadoHobby(EmpleadoHobby empleadohobby,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.empleadohobby)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEmpleadoHobby = new EmpleadoHobbyDetalleFormJInternalFrame(jDesktopPane,this.empleadohobbySessionBean.getConGuardarRelaciones(),this.empleadohobbySessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEmpleadoHobby);
		this.jInternalFrameDetalleFormEmpleadoHobby.setVisible(false);
		this.jInternalFrameDetalleFormEmpleadoHobby.setSelected(false);						
		
		this.jInternalFrameDetalleFormEmpleadoHobby.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEmpleadoHobby.empleadohobbyLogic=this.empleadohobbyLogic;
		
		this.cargarCombosFrameForeignKeyEmpleadoHobby("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEmpleadoHobby();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmpleadoHobby();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEmpleadoHobby("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEmpleadoHobby();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEmpleadoHobby.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmpleadoHobby"));
		
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonModificarEmpleadoHobby.addActionListener(new ButtonActionListener(this,"ModificarEmpleadoHobby"));

		
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonModificarToolBarEmpleadoHobby.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmpleadoHobby"));
					
		this.jInternalFrameDetalleFormEmpleadoHobby.jMenuItemModificarEmpleadoHobby.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmpleadoHobby"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonActualizarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"ActualizarEmpleadoHobby"));
		
		
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonActualizarToolBarEmpleadoHobby.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmpleadoHobby"));
						
		this.jInternalFrameDetalleFormEmpleadoHobby.jMenuItemActualizarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmpleadoHobby"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonEliminarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"EliminarEmpleadoHobby"));
		
		
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonEliminarToolBarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmpleadoHobby"));
								
		this.jInternalFrameDetalleFormEmpleadoHobby.jMenuItemEliminarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmpleadoHobby"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonCancelarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"CancelarEmpleadoHobby"));
		
		
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonCancelarToolBarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmpleadoHobby"));
					
		this.jInternalFrameDetalleFormEmpleadoHobby.jMenuItemCancelarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmpleadoHobby"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoHobby.jMenuItemDetalleCerrarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmpleadoHobby"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonGuardarCambiosToolBarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoHobby"));
		
		
		
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonGuardarCambiosToolBarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoHobby"));
		
		
		
		this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxTiposAccionesFormularioEmpleadoHobby.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmpleadoHobby"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonidEmpleadoHobbyBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoHobbyBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonid_empresaEmpleadoHobbyUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoHobbyUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonid_empresaEmpleadoHobbyBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoHobbyBusqueda"));
		//jButtonid_empleadoEmpleadoHobby.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoEmpleadoHobbyActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonid_empleadoEmpleadoHobby.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoHobby"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonid_empleadoEmpleadoHobbyUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoHobbyUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonid_empleadoEmpleadoHobbyBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoHobbyBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonid_hobbyEmpleadoHobbyUpdate.addActionListener(new ButtonActionListener(this,"id_hobbyEmpleadoHobbyUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonid_hobbyEmpleadoHobbyBusqueda.addActionListener(new ButtonActionListener(this,"id_hobbyEmpleadoHobbyBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEmpleadoHobby.jTabbedPaneRelacionesEmpleadoHobby.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmpleadoHobby"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEmpleadoHobby"));
		
		if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoHobby.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmpleadoHobby"));
		}
		
		this.jTableDatosEmpleadoHobby.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEmpleadoHobby"));
		
		this.jTableDatosEmpleadoHobby.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEmpleadoHobby"));
		
		this.jButtonNuevoEmpleadoHobby.addActionListener(new ButtonActionListener(this,"NuevoEmpleadoHobby"));
		
		this.jButtonDuplicarEmpleadoHobby.addActionListener(new ButtonActionListener(this,"DuplicarEmpleadoHobby"));
		
		this.jButtonCopiarEmpleadoHobby.addActionListener(new ButtonActionListener(this,"CopiarEmpleadoHobby"));
		
		this.jButtonVerFormEmpleadoHobby.addActionListener(new ButtonActionListener(this,"VerFormEmpleadoHobby"));
		
		
		this.jButtonNuevoToolBarEmpleadoHobby.addActionListener(new ButtonActionListener(this,"NuevoToolBarEmpleadoHobby"));
			
		this.jButtonDuplicarToolBarEmpleadoHobby.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEmpleadoHobby"));
			
		this.jMenuItemNuevoEmpleadoHobby.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEmpleadoHobby"));
			
		this.jMenuItemDuplicarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEmpleadoHobby"));		
		
		
		this.jButtonNuevoRelacionesEmpleadoHobby.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEmpleadoHobby"));
		
		
		this.jButtonNuevoRelacionesToolBarEmpleadoHobby.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEmpleadoHobby"));
			
		this.jMenuItemNuevoRelacionesEmpleadoHobby.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEmpleadoHobby"));		
		
		
		if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoHobby.jButtonModificarEmpleadoHobby.addActionListener(new ButtonActionListener(this,"ModificarEmpleadoHobby"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoHobby.jButtonModificarToolBarEmpleadoHobby.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmpleadoHobby"));
			
			this.jInternalFrameDetalleFormEmpleadoHobby.jMenuItemModificarEmpleadoHobby.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmpleadoHobby"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEmpleadoHobby.jButtonActualizarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"ActualizarEmpleadoHobby"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoHobby.jButtonActualizarToolBarEmpleadoHobby.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmpleadoHobby"));
				
			this.jInternalFrameDetalleFormEmpleadoHobby.jMenuItemActualizarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmpleadoHobby"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoHobby.jButtonEliminarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"EliminarEmpleadoHobby"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoHobby.jButtonEliminarToolBarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmpleadoHobby"));
						
			this.jInternalFrameDetalleFormEmpleadoHobby.jMenuItemEliminarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmpleadoHobby"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoHobby.jButtonCancelarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"CancelarEmpleadoHobby"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoHobby.jButtonCancelarToolBarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmpleadoHobby"));
			
			this.jInternalFrameDetalleFormEmpleadoHobby.jMenuItemCancelarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmpleadoHobby"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEmpleadoHobby"));		
		
		
		this.jButtonCerrarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"CerrarEmpleadoHobby"));
		
		
		this.jButtonCerrarToolBarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"CerrarToolBarEmpleadoHobby"));
			
		this.jMenuItemCerrarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEmpleadoHobby"));
			
		if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoHobby.jMenuItemDetalleCerrarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmpleadoHobby"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoHobby.jButtonGuardarCambiosEmpleadoHobby.addActionListener (new ButtonActionListener(this,"GuardarCambiosEmpleadoHobby"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoHobby.jButtonGuardarCambiosToolBarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoHobby"));
		}
		
		this.jButtonCopiarToolBarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"CopiarToolBarEmpleadoHobby"));
			
		this.jButtonVerFormToolBarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"VerFormToolBarEmpleadoHobby"));
		
		this.jMenuItemGuardarCambiosEmpleadoHobby.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEmpleadoHobby"));
			
		this.jMenuItemCopiarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEmpleadoHobby"));		
		
		this.jMenuItemVerFormEmpleadoHobby.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEmpleadoHobby"));		
		
		
		this.jButtonGuardarCambiosTablaEmpleadoHobby.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmpleadoHobby"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEmpleadoHobby"));
			
		this.jMenuItemGuardarCambiosTablaEmpleadoHobby.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmpleadoHobby"));		
		
		
		
		this.jButtonRecargarInformacionEmpleadoHobby.addActionListener (new ButtonActionListener(this,"RecargarInformacionEmpleadoHobby"));
					
		this.jButtonRecargarInformacionToolBarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEmpleadoHobby"));
		
		this.jMenuItemRecargarInformacionEmpleadoHobby.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEmpleadoHobby"));		
		
		
		
		this.jButtonAnterioresEmpleadoHobby.addActionListener (new ButtonActionListener(this,"AnterioresEmpleadoHobby"));
		
		
		this.jButtonAnterioresToolBarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEmpleadoHobby"));
		
		this.jMenuItemAnterioresEmpleadoHobby.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEmpleadoHobby"));		
		
		
		this.jButtonSiguientesEmpleadoHobby.addActionListener (new ButtonActionListener(this,"SiguientesEmpleadoHobby"));
		
		
		this.jButtonSiguientesToolBarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEmpleadoHobby"));
			
		this.jMenuItemSiguientesEmpleadoHobby.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEmpleadoHobby"));
			
		this.jMenuItemAbrirOrderByEmpleadoHobby.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEmpleadoHobby"));
			
		this.jMenuItemMostrarOcultarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEmpleadoHobby"));
			
		this.jMenuItemDetalleAbrirOrderByEmpleadoHobby.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEmpleadoHobby"));
			
		this.jMenuItemDetalleMostarOcultarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEmpleadoHobby"));		
		
		
		this.jButtonNuevoGuardarCambiosEmpleadoHobby.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEmpleadoHobby"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEmpleadoHobby"));
			
		this.jMenuItemNuevoGuardarCambiosEmpleadoHobby.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEmpleadoHobby"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEmpleadoHobby.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEmpleadoHobby"));

		this.jCheckBoxSeleccionadosEmpleadoHobby.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEmpleadoHobby"));
		
		if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxTiposAccionesFormularioEmpleadoHobby.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmpleadoHobby"));
		}
		
		
		this.jComboBoxTiposRelacionesEmpleadoHobby.addActionListener (new ButtonActionListener(this,"TiposRelacionesEmpleadoHobby"));
			
		this.jComboBoxTiposAccionesEmpleadoHobby.addActionListener (new ButtonActionListener(this,"TiposAccionesEmpleadoHobby"));
					
		this.jComboBoxTiposSeleccionarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEmpleadoHobby"));
			
		this.jTextFieldValorCampoGeneralEmpleadoHobby.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEmpleadoHobby"));		
		
		
		if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonidEmpleadoHobbyBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoHobbyBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonid_empresaEmpleadoHobbyUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoHobbyUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonid_empresaEmpleadoHobbyBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoHobbyBusqueda"));
		//jButtonid_empleadoEmpleadoHobby.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoEmpleadoHobbyActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonid_empleadoEmpleadoHobby.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoHobby"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonid_empleadoEmpleadoHobbyUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoHobbyUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonid_empleadoEmpleadoHobbyBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoHobbyBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonid_hobbyEmpleadoHobbyUpdate.addActionListener(new ButtonActionListener(this,"id_hobbyEmpleadoHobbyUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonid_hobbyEmpleadoHobbyBusqueda.addActionListener(new ButtonActionListener(this,"id_hobbyEmpleadoHobbyBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoEmpleadoHobby.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoEmpleadoHobby"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoHobby.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoHobby"));

			this.jButtonFK_IdHobbyEmpleadoHobby.addActionListener(new ButtonActionListener(this,"FK_IdHobbyEmpleadoHobby"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEmpleadoHobby!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoHobby.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoHobby"));
				this.jInternalFrameReporteDinamicoEmpleadoHobby.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoHobby"));
				this.jInternalFrameReporteDinamicoEmpleadoHobby.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoHobby"));
			}
			
			//this.jButtonCerrarReporteDinamicoEmpleadoHobby.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoHobby"));				
			//this.jButtonGenerarReporteDinamicoEmpleadoHobby.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoHobby"));
			//this.jButtonGenerarExcelReporteDinamicoEmpleadoHobby.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoHobby"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEmpleadoHobby!=null) {
				this.jInternalFrameImportacionEmpleadoHobby.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmpleadoHobby"));
				this.jInternalFrameImportacionEmpleadoHobby.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmpleadoHobby"));
				this.jInternalFrameImportacionEmpleadoHobby.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmpleadoHobby"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEmpleadoHobby.addActionListener (new ButtonActionListener(this,"AbrirOrderByEmpleadoHobby"));
			
			this.jButtonAbrirOrderByToolBarEmpleadoHobby.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEmpleadoHobby"));			
			
			if(this.jInternalFrameOrderByEmpleadoHobby!=null) {
				this.jInternalFrameOrderByEmpleadoHobby.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmpleadoHobby"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoHobby.jTabbedPaneRelacionesEmpleadoHobby.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmpleadoHobby"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameEmpleadoHobby();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEmpleadoHobby.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEmpleadoHobby = (JInternalFrameBase)event.getSource();
	            	
	            EmpleadoHobbyBeanSwingJInternalFrame jInternalFrameParent=(EmpleadoHobbyBeanSwingJInternalFrame)jInternalFrameDetalleFormEmpleadoHobby.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEmpleadoHobbyActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEmpleadoHobby.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEmpleadoHobbyListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEmpleadoHobby.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEmpleadoHobby.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoHobbyActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoHobbyActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoHobbyActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEmpleadoHobby";
		inputMap = this.jButtonNuevoEmpleadoHobby.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEmpleadoHobby.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmpleadoHobbyActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoHobbyActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoHobbyActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoHobbyActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEmpleadoHobby";
		inputMap = this.jButtonNuevoRelacionesEmpleadoHobby.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEmpleadoHobby.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmpleadoHobbyActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEmpleadoHobby";
		inputMap = this.jButtonModificarEmpleadoHobby.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEmpleadoHobby.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEmpleadoHobbyActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEmpleadoHobby";
		inputMap = this.jButtonActualizarEmpleadoHobby.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEmpleadoHobby.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEmpleadoHobbyActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEmpleadoHobby";
		inputMap = this.jButtonEliminarEmpleadoHobby.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEmpleadoHobby.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEmpleadoHobbyActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEmpleadoHobby";
		inputMap = this.jButtonCancelarEmpleadoHobby.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEmpleadoHobby.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEmpleadoHobbyActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEmpleadoHobby";
		inputMap = this.jButtonCerrarEmpleadoHobby.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEmpleadoHobby.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEmpleadoHobbyActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonGuardarCambiosEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEmpleadoHobby";
		inputMap = this.jInternalFrameDetalleFormEmpleadoHobby.jButtonGuardarCambiosEmpleadoHobby.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonGuardarCambiosEmpleadoHobby.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEmpleadoHobbyActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEmpleadoHobby.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEmpleadoHobbyItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEmpleadoHobby.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEmpleadoHobbyActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEmpleadoHobby.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEmpleadoHobbyActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEmpleadoHobby.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEmpleadoHobbyActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonidEmpleadoHobbyBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoHobbyBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonid_empresaEmpleadoHobbyUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoHobbyUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonid_empresaEmpleadoHobbyBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoHobbyBusqueda"));
		//jButtonid_empleadoEmpleadoHobby.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoEmpleadoHobbyActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonid_empleadoEmpleadoHobby.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoHobby"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonid_empleadoEmpleadoHobbyUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoHobbyUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonid_empleadoEmpleadoHobbyBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoHobbyBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonid_hobbyEmpleadoHobbyUpdate.addActionListener(new ButtonActionListener(this,"id_hobbyEmpleadoHobbyUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHobby.jButtonid_hobbyEmpleadoHobbyBusqueda.addActionListener(new ButtonActionListener(this,"id_hobbyEmpleadoHobbyBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoEmpleadoHobby.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoEmpleadoHobby"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoHobby.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoHobby"));

		this.jButtonFK_IdHobbyEmpleadoHobby.addActionListener(new ButtonActionListener(this,"FK_IdHobbyEmpleadoHobby"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEmpleadoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEmpleadoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEmpleadoHobbyActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEmpleadoHobby.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEmpleadoHobby(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EmpleadoHobby empleadohobbyAux:this.empleadohobbyLogic.getEmpleadoHobbys()) {
					empleadohobbyAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoHobby empleadohobbyAux:empleadohobbys) {
					empleadohobbyAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEmpleadoHobbyItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmpleadoHobby(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EmpleadoHobby empleadohobbyAux:this.empleadohobbyLogic.getEmpleadoHobbys()) {
						empleadohobbyAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoHobby empleadohobbyAux:empleadohobbys) {
						empleadohobbyAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EmpleadoHobby empleadohobbyAux:this.empleadohobbyLogic.getEmpleadoHobbys()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoHobby empleadohobbyAux:empleadohobbys) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoHobby(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmpleadoHobby.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmpleadoHobby.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoHobby,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEmpleadoHobbyItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmpleadoHobby(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEmpleadoHobby.getSelectedRows();
			
			EmpleadoHobby empleadohobbyLocal=new EmpleadoHobby();
			
			//this.seleccionarTodosEmpleadoHobby(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadohobbyLocal =(EmpleadoHobby) this.empleadohobbyLogic.getEmpleadoHobbys().toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					empleadohobbyLocal =(EmpleadoHobby) this.empleadohobbys.toArray()[this.jTableDatosEmpleadoHobby.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				empleadohobbyLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EmpleadoHobby empleadohobbyAux:this.empleadohobbyLogic.getEmpleadoHobbys()) {
						empleadohobbyAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoHobby empleadohobbyAux:empleadohobbys) {
						empleadohobbyAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoHobby(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmpleadoHobby.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmpleadoHobby.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoHobby,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEmpleadoHobbyItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEmpleadoHobbyParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEmpleadoHobbyActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEmpleadoHobby(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEmpleadoHobby.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EmpleadoHobby empleadohobbyAux:this.empleadohobbyLogic.getEmpleadoHobbys()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoHobby empleadohobbyAux:empleadohobbys) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoHobby(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEmpleadoHobbyActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEmpleadoHobby(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEmpleadoHobby=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEmpleadoHobby.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxTiposAccionesFormularioEmpleadoHobby.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEmpleadoHobby) {				
					conSplash=true;//false;										
					
					//this.startProcessEmpleadoHobby(conSplash);
				
					this.generarReporteEmpleadoHobbysSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoHobby.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxTiposAccionesFormularioEmpleadoHobby.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEmpleadoHobbysSeleccionados();
				//this.jComboBoxTiposAccionesEmpleadoHobby.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmpleadoHobbysSeleccionados(false);
				//this.jComboBoxTiposAccionesEmpleadoHobby.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmpleadoHobbysSeleccionados(true);
				//this.jComboBoxTiposAccionesEmpleadoHobby.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmpleadoHobby();
				
				this.exportarEmpleadoHobbysSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoHobby.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxTiposAccionesFormularioEmpleadoHobby.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEmpleadoHobbys();
				//this.importarEmpleadoHobbys();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoHobby.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxTiposAccionesFormularioEmpleadoHobby.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmpleadoHobby();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEmpleadoHobbysSeleccionados();
				//this.jComboBoxTiposAccionesEmpleadoHobby.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Empleado Hobby", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEmpleadoHobby();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEmpleadoHobby)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEmpleadoHobby(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Empleado Hobby",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoHobby.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxTiposAccionesFormularioEmpleadoHobby.setSelectedIndex(0);					
				}	
			} 			
			else if(EmpleadoHobbyBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEmpleadoHobby) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEmpleadoHobby(conSplash);
					
						//this.actualizarParametrosGeneralEmpleadoHobby();
						
						this.generarReporteProcesoAccionEmpleadoHobbysSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEmpleadoHobby.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxTiposAccionesFormularioEmpleadoHobby.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EmpleadoHobbyBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Empleado HobbyES SELECCIONADOS?", "MANTENIMIENTO DE Empleado Hobby", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEmpleadoHobby();
				
						this.actualizarParametrosGeneralEmpleadoHobby();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.empleadohobbyReturnGeneral=empleadohobbyLogic.procesarAccionEmpleadoHobbysWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.empleadohobbyLogic.getEmpleadoHobbys(),this.empleadohobbyParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEmpleadoHobbyReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmpleadoHobby.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxTiposAccionesFormularioEmpleadoHobby.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEmpleadoHobby();
					
					EmpleadoHobbyBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEmpleadoHobbyReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmpleadoHobby.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxTiposAccionesFormularioEmpleadoHobby.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEmpleadoHobby(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEmpleadoHobbyActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEmpleadoHobby();
			
			if(this.jInternalFrameDetalleFormEmpleadoHobby==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EmpleadoHobby> empleadohobbysSeleccionados=new ArrayList<EmpleadoHobby>();		
			EmpleadoHobby empleadohobby=new EmpleadoHobby();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEmpleadoHobby(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEmpleadoHobby.getSelectedItem();
			
			
			
			
			empleadohobbysSeleccionados=this.getEmpleadoHobbysSeleccionados(true);
			//this.sTipoAccion;
			
			if(empleadohobbysSeleccionados.size()==1) {
				for(EmpleadoHobby empleadohobbyAux:empleadohobbysSeleccionados) {
					empleadohobby=empleadohobbyAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEmpleadoHobby();
			
      		//this.finishProcessEmpleadoHobby(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEmpleadoHobbyReturnGeneral() throws Exception {
		if(this.empleadohobbyReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.empleadohobbyReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.empleadohobbyReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.empleadohobbyReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.empleadohobbyReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.empleadohobbyReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEmpleadoHobby(false);
		}
		
		if(this.empleadohobbyReturnGeneral.getConRetornoLista() || this.empleadohobbyReturnGeneral.getConRetornoObjeto()) {
			if(this.empleadohobbyReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.empleadohobbyLogic.setEmpleadoHobbys(this.empleadohobbyReturnGeneral.getEmpleadoHobbys());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.empleadohobbyReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.empleadohobbyLogic.setEmpleadoHobby(this.empleadohobbyReturnGeneral.getEmpleadoHobby());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEmpleadoHobby(false);
		}
	}
	
	public void actualizarParametrosGeneralEmpleadoHobby() throws Exception {
		
		
	}
	
	public ArrayList<EmpleadoHobby> getEmpleadoHobbysSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EmpleadoHobby> empleadohobbysSeleccionados=new ArrayList<EmpleadoHobby>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEmpleadoHobby) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EmpleadoHobby empleadohobbyAux:empleadohobbyLogic.getEmpleadoHobbys()) {
					if(empleadohobbyAux.getIsSelected()) {
						empleadohobbysSeleccionados.add(empleadohobbyAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoHobby empleadohobbyAux:this.empleadohobbys) {
					if(empleadohobbyAux.getIsSelected()) {
						empleadohobbysSeleccionados.add(empleadohobbyAux);				
					}
				}
			}
			
			if(empleadohobbysSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						empleadohobbysSeleccionados.addAll(this.empleadohobbyLogic.getEmpleadoHobbys());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						empleadohobbysSeleccionados.addAll(this.empleadohobbys);				
					}
				}
			}
		} else {
			empleadohobbysSeleccionados.add(this.empleadohobby);
		}
		
		return empleadohobbysSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteEmpleadoHobbysSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEmpleadoHobbysSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEmpleadoHobbysSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmpleadoHobbysSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmpleadoHobbysSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Empleado Hobby",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEmpleadoHobbysSeleccionados() throws Exception {
		ArrayList<EmpleadoHobby> empleadohobbysSeleccionados=new ArrayList<EmpleadoHobby>();		
		
		empleadohobbysSeleccionados=this.getEmpleadoHobbysSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEmpleadoHobbys("Todos",empleadohobbysSeleccionados);
		
	}	
	
	public void generarReporteNormalEmpleadoHobbysSeleccionados() throws Exception {
		ArrayList<EmpleadoHobby> empleadohobbysSeleccionados=new ArrayList<EmpleadoHobby>();		
		
		empleadohobbysSeleccionados=this.getEmpleadoHobbysSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEmpleadoHobbys("Todos",empleadohobbysSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEmpleadoHobbysSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EmpleadoHobby> empleadohobbysSeleccionados=new ArrayList<EmpleadoHobby>();
		
		empleadohobbysSeleccionados=this.getEmpleadoHobbysSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEmpleadoHobbys("Todos",empleadohobbysSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEmpleadoHobbysSeleccionados() throws Exception {
		ArrayList<EmpleadoHobby> empleadohobbysSeleccionados=new ArrayList<EmpleadoHobby>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEmpleadoHobby();
		
		
		empleadohobbysSeleccionados=this.getEmpleadoHobbysSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEmpleadoHobby();
		
		
		//this.generarReporteEmpleadoHobbys("Todos",empleadohobbysSeleccionados ,empleadohobbyImplementable,empleadohobbyImplementableHome);
	}
	
	public void mostrarImportacionEmpleadoHobbys() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEmpleadoHobby();
		
		this.abrirFrameImportacionEmpleadoHobby();		
		
			
		//this.generarReporteEmpleadoHobbys("Todos",empleadohobbysSeleccionados ,empleadohobbyImplementable,empleadohobbyImplementableHome);
	}
	
	public void importarEmpleadoHobbys() throws Exception {		
	
	}
	
	public void exportarEmpleadoHobbysSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEmpleadoHobbysSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEmpleadoHobbysSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEmpleadoHobbysSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Empleado Hobby",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEmpleadoHobbysSeleccionados() throws Exception {
		ArrayList<EmpleadoHobby> empleadohobbysSeleccionados=new ArrayList<EmpleadoHobby>();		
		
		empleadohobbysSeleccionados=this.getEmpleadoHobbysSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadohobby."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEmpleadoHobby(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EmpleadoHobby empleadohobbyAux:empleadohobbysSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEmpleadoHobby(empleadohobbyAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//empleadohobbyAux.setsDetalleGeneralEntityReporte(empleadohobbyAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadohobbySessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Hobby",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEmpleadoHobby(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EmpleadoHobbyConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoHobbyConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoHobbyConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoHobbyConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoHobbyConstantesFunciones.LABEL_IDHOBBY;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEmpleadoHobby(EmpleadoHobby empleadohobby,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=empleadohobby.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadohobby.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadohobby.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadohobby.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadohobby.gethobby_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEmpleadoHobbysSeleccionados() throws Exception {
		ArrayList<EmpleadoHobby> empleadohobbysSeleccionados=new ArrayList<EmpleadoHobby>();		
		
		empleadohobbysSeleccionados=this.getEmpleadoHobbysSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadohobby.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EmpleadoHobbys");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEmpleadoHobby(row);				
				iRow++;
			}				
			
			for(EmpleadoHobby empleadohobbyAux:empleadohobbysSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEmpleadoHobby(empleadohobbyAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadohobbySessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Hobby",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEmpleadoHobbysSeleccionados() throws Exception {
		ArrayList<EmpleadoHobby> empleadohobbysSeleccionados=new ArrayList<EmpleadoHobby>();		
		
		empleadohobbysSeleccionados=this.getEmpleadoHobbysSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadohobby.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("empleadohobbys");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("empleadohobby");
			//elementRoot.appendChild(element);
		
			for(EmpleadoHobby empleadohobbyAux:empleadohobbysSeleccionados) {
				element = document.createElement("empleadohobby");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEmpleadoHobby(empleadohobbyAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadohobbySessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Hobby",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEmpleadoHobby(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoHobbyConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoHobbyConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoHobbyConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoHobbyConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoHobbyConstantesFunciones.LABEL_IDHOBBY);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEmpleadoHobby(EmpleadoHobby empleadohobby,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(empleadohobby.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadohobby.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadohobby.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadohobby.gethobby_descripcion());				
	}
	
	public void setFilaDatosExportarXmlEmpleadoHobby(EmpleadoHobby empleadohobby,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EmpleadoHobbyConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(empleadohobby.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EmpleadoHobbyConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(empleadohobby.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(EmpleadoHobbyConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(empleadohobby.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(EmpleadoHobbyConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(empleadohobby.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementhobby_descripcion = document.createElement(EmpleadoHobbyConstantesFunciones.IDHOBBY);
		elementhobby_descripcion.appendChild(document.createTextNode(empleadohobby.gethobby_descripcion()));
		element.appendChild(elementhobby_descripcion);
	}
	
	public void generarReporteGroupGenericoEmpleadoHobbysSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EmpleadoHobby> empleadohobbysSeleccionados=new ArrayList<EmpleadoHobby>();
		
		empleadohobbysSeleccionados=this.getEmpleadoHobbysSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoEmpleadoHobby(empleadohobbysSeleccionados);
		
		this.generarReporteEmpleadoHobbys("Todos",empleadohobbysSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEmpleadoHobby(ArrayList<EmpleadoHobby> empleadohobbysSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EmpleadoHobby empleadohobbyAux:empleadohobbysSeleccionados) {
				empleadohobbyAux.setsDetalleGeneralEntityReporte(empleadohobbyAux.toString());
			
				if(sTipoSeleccionar.equals(EmpleadoHobbyConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					empleadohobbyAux.setsDescripcionGeneralEntityReporte1(empleadohobbyAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoHobbyConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					empleadohobbyAux.setsDescripcionGeneralEntityReporte1(empleadohobbyAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoHobbyConstantesFunciones.LABEL_IDHOBBY)) {
					existe=true;
					empleadohobbyAux.setsDescripcionGeneralEntityReporte1(empleadohobbyAux.gethobby_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEmpleadoHobby(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEmpleadoHobby=true;
				this.isVisibilidadCeldaNuevoRelacionesEmpleadoHobby=true;
				this.isVisibilidadCeldaGuardarCambiosEmpleadoHobby=true;
			}
			
			this.isVisibilidadCeldaModificarEmpleadoHobby=false;
			this.isVisibilidadCeldaActualizarEmpleadoHobby=false;
			this.isVisibilidadCeldaEliminarEmpleadoHobby=false;
			this.isVisibilidadCeldaCancelarEmpleadoHobby=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoHobby=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoHobby=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEmpleadoHobby=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoHobby=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoHobby=false;
			this.isVisibilidadCeldaModificarEmpleadoHobby=false;
			this.isVisibilidadCeldaActualizarEmpleadoHobby=true;
			this.isVisibilidadCeldaEliminarEmpleadoHobby=false;
			this.isVisibilidadCeldaCancelarEmpleadoHobby=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoHobby=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoHobby=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEmpleadoHobby=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoHobby=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoHobby=false;
			this.isVisibilidadCeldaModificarEmpleadoHobby=false;
			this.isVisibilidadCeldaActualizarEmpleadoHobby=true;
			this.isVisibilidadCeldaEliminarEmpleadoHobby=true;
			this.isVisibilidadCeldaCancelarEmpleadoHobby=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoHobby=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoHobby=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEmpleadoHobby=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoHobby=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoHobby=false;
			this.isVisibilidadCeldaModificarEmpleadoHobby=false;
			this.isVisibilidadCeldaActualizarEmpleadoHobby=true;
			this.isVisibilidadCeldaEliminarEmpleadoHobby=false;
			this.isVisibilidadCeldaCancelarEmpleadoHobby=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoHobby=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoHobby=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEmpleadoHobby=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoHobby=true;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoHobby=true;
			this.isVisibilidadCeldaModificarEmpleadoHobby=false;
			this.isVisibilidadCeldaActualizarEmpleadoHobby=false;
			this.isVisibilidadCeldaEliminarEmpleadoHobby=false;
			this.isVisibilidadCeldaCancelarEmpleadoHobby=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoHobby=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoHobby=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEmpleadoHobby=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoHobby=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoHobby=false;
			this.isVisibilidadCeldaActualizarEmpleadoHobby=false;
			this.isVisibilidadCeldaEliminarEmpleadoHobby=false;
			this.isVisibilidadCeldaCancelarEmpleadoHobby=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoHobby=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoHobby=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEmpleadoHobby=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoHobby=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoHobby=false;
			this.isVisibilidadCeldaModificarEmpleadoHobby=true;
			this.isVisibilidadCeldaActualizarEmpleadoHobby=false;
			this.isVisibilidadCeldaEliminarEmpleadoHobby=false;
			this.isVisibilidadCeldaCancelarEmpleadoHobby=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoHobby=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoHobby=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EmpleadoHobbyJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEmpleadoHobby=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoHobby=true;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoHobby=true;
		} else {
			this.actualizarEstadoPanelsEmpleadoHobby(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEmpleadoHobby=false;
			//this.isVisibilidadCeldaVerFormEmpleadoHobby=false;
			this.isVisibilidadCeldaDuplicarEmpleadoHobby=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!empleadohobbySessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoHobby=false;
		} else {
			this.isVisibilidadCeldaNuevoEmpleadoHobby=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoHobby=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(empleadohobbySessionBean.getEsGuardarRelacionado()) {
			if(!empleadohobbySessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEmpleadoHobby=false;												
			}
			
			this.jButtonCerrarEmpleadoHobby.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoHobby=false;
		}
		
		if(!this.permiteMantenimiento(this.empleadohobby)) {
			this.isVisibilidadCeldaActualizarEmpleadoHobby=false;
			this.isVisibilidadCeldaEliminarEmpleadoHobby=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEmpleadoHobby() {
	}
	
	public void actualizarEstadoPanelsEmpleadoHobby(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEmpleadoHobby!=null) {
				this.jScrollPanelDatosEdicionEmpleadoHobby.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoHobby!=null) {
				this.jTabbedPaneBusquedasEmpleadoHobby.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoHobby!=null) {
				this.jScrollPanelDatosEmpleadoHobby.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoHobby!=null) {
				this.jPanelPaginacionEmpleadoHobby.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoHobby!=null) {
				this.jPanelParametrosReportesEmpleadoHobby.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEmpleadoHobby!=null) {
				this.jScrollPanelDatosEdicionEmpleadoHobby.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoHobby!=null) {
				this.jTabbedPaneBusquedasEmpleadoHobby.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEmpleadoHobby!=null) {
				this.jScrollPanelDatosEmpleadoHobby.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoHobby!=null) {
				this.jPanelPaginacionEmpleadoHobby.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoHobby!=null) {
				this.jPanelParametrosReportesEmpleadoHobby.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEmpleadoHobby!=null) {
				this.jScrollPanelDatosEdicionEmpleadoHobby.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoHobby!=null) {
				this.jTabbedPaneBusquedasEmpleadoHobby.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoHobby!=null) {
				this.jScrollPanelDatosEmpleadoHobby.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoHobby!=null) {
				this.jPanelPaginacionEmpleadoHobby.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoHobby!=null) {
				this.jPanelParametrosReportesEmpleadoHobby.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEmpleadoHobby!=null) {
				this.jScrollPanelDatosEdicionEmpleadoHobby.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoHobby!=null) {
				this.jTabbedPaneBusquedasEmpleadoHobby.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoHobby!=null) {
				this.jScrollPanelDatosEmpleadoHobby.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoHobby!=null) {
				this.jPanelPaginacionEmpleadoHobby.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoHobby!=null) {
				this.jPanelParametrosReportesEmpleadoHobby.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEmpleadoHobby!=null) {
				this.jScrollPanelDatosEdicionEmpleadoHobby.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoHobby!=null) {
				this.jTabbedPaneBusquedasEmpleadoHobby.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoHobby!=null) {
				this.jScrollPanelDatosEmpleadoHobby.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoHobby!=null) {
				this.jPanelPaginacionEmpleadoHobby.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoHobby!=null) {
				this.jPanelParametrosReportesEmpleadoHobby.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEmpleadoHobby!=null) {
				this.jScrollPanelDatosEdicionEmpleadoHobby.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoHobby!=null) {
				this.jTabbedPaneBusquedasEmpleadoHobby.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoHobby!=null) {
				this.jScrollPanelDatosEmpleadoHobby.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoHobby!=null) {
				this.jPanelPaginacionEmpleadoHobby.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoHobby!=null) {
				this.jPanelParametrosReportesEmpleadoHobby.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEmpleadoHobby!=null) {
				this.jScrollPanelDatosEdicionEmpleadoHobby.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoHobby!=null) {
				this.jTabbedPaneBusquedasEmpleadoHobby.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoHobby!=null) {
				this.jScrollPanelDatosEmpleadoHobby.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoHobby!=null) {
				this.jPanelPaginacionEmpleadoHobby.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoHobby!=null) {
				this.jPanelParametrosReportesEmpleadoHobby.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEmpleadoHobby!=null) {
					this.jTabbedPaneBusquedasEmpleadoHobby.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEmpleadoHobby!=null) {
				this.jPanelParametrosReportesEmpleadoHobby.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoHobby!=null) {
				this.jTabbedPaneBusquedasEmpleadoHobby.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEmpleadoHobby!=null) {
				this.jPanelParametrosReportesEmpleadoHobby.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoHobby.remove(jPanelFK_IdEmpleadoEmpleadoHobby);}

			this.isVisibilidadFK_IdHobby=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdHobby) {this.jTabbedPaneBusquedasEmpleadoHobby.remove(jPanelFK_IdHobbyEmpleadoHobby);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoHobby.remove(jPanelFK_IdEmpleadoEmpleadoHobby);}

			this.isVisibilidadFK_IdHobby=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdHobby) {this.jTabbedPaneBusquedasEmpleadoHobby.remove(jPanelFK_IdHobbyEmpleadoHobby);}
		}
		
	}

	public void setVisibilidadBusquedasParaHobby(Boolean isParaHobby){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaHobbyNegation=!isParaHobby;

			this.isVisibilidadFK_IdEmpleado=isParaHobbyNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoHobby.remove(jPanelFK_IdEmpleadoEmpleadoHobby);}

			this.isVisibilidadFK_IdHobby=isParaHobby;
			if(!this.isVisibilidadFK_IdHobby) {this.jTabbedPaneBusquedasEmpleadoHobby.remove(jPanelFK_IdHobbyEmpleadoHobby);}
		}
		
	}
	
	
	
	

	public String registrarSesionEmpleadoHobbyParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(empleadohobbySessionBean==null) {
				empleadohobbySessionBean=new EmpleadoHobbySessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(empleadohobbySessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.empleadohobbyFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(EmpleadoHobbyConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionEmpleadoHobby(true);
			//empleadoSessionBean.setlidEmpleadoHobbyActual(this.idEmpleadoHobbyActual);

			empleadohobbySessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEmpleadoHobby(true);
			empleadohobbySessionBean.setlIdEmpleadoHobbyActualForeignKey(this.idEmpleadoHobbyActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EmpleadoHobbySessionBean empleadohobbySessionBean=new EmpleadoHobbySessionBean();
		
		if(this.empleadohobbySessionBean==null) {
			this.empleadohobbySessionBean=new EmpleadoHobbySessionBean();
		}
		
		this.empleadohobbySessionBean.setsUltimaBusquedaEmpleadoHobby(this.getsAccionBusqueda());
		this.empleadohobbySessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.empleadohobbySessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			empleadohobbySessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			empleadohobbySessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdHobby")) {
			empleadohobbySessionBean.setid_hobby(this.getid_hobbyFK_IdHobby());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EmpleadoHobbySessionBean empleadohobbySessionBean=new EmpleadoHobbySessionBean();
		
		if(this.empleadohobbySessionBean==null) {
			this.empleadohobbySessionBean=new EmpleadoHobbySessionBean();
		}
		
		if(this.empleadohobbySessionBean.getsUltimaBusquedaEmpleadoHobby()!=null&&!this.empleadohobbySessionBean.getsUltimaBusquedaEmpleadoHobby().equals("")) {
			this.setsAccionBusqueda(empleadohobbySessionBean.getsUltimaBusquedaEmpleadoHobby());
			this.setiNumeroPaginacion(empleadohobbySessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(empleadohobbySessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(empleadohobbySessionBean.getid_empleado());
				empleadohobbySessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(empleadohobbySessionBean.getid_empresa());
				empleadohobbySessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdHobby")) {
				this.setid_hobbyFK_IdHobby(empleadohobbySessionBean.getid_hobby());
				empleadohobbySessionBean.setid_hobby(-1L);
			}
		}
		
		this.empleadohobbySessionBean.setsUltimaBusquedaEmpleadoHobby("");
		this.empleadohobbySessionBean.setiNumeroPaginacion(EmpleadoHobbyConstantesFunciones.INUMEROPAGINACION);
		this.empleadohobbySessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEmpleadoHobby(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEmpleadoHobby() {
		this.updateBorderResaltarBusquedasFormularioEmpleadoHobby();
		this.updateVisibilidadBusquedasFormularioEmpleadoHobby();
		this.updateHabilitarBusquedasFormularioEmpleadoHobby();
	}
	
	public void updateBorderResaltarBusquedasFormularioEmpleadoHobby() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEmpleadoHobby.getComponents().length>0) {
	

		if(this.empleadohobbyConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoHobby!=null) {
			index= this.jTabbedPaneBusquedasEmpleadoHobby.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoHobby);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoHobby.getComponent(index);
				jPanel.setBorder(this.empleadohobbyConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoHobby);
			}
		}

		if(this.empleadohobbyConstantesFunciones.resaltarFK_IdHobbyEmpleadoHobby!=null) {
			index= this.jTabbedPaneBusquedasEmpleadoHobby.indexOfComponent(this.jPanelFK_IdHobbyEmpleadoHobby);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoHobby.getComponent(index);
				jPanel.setBorder(this.empleadohobbyConstantesFunciones.resaltarFK_IdHobbyEmpleadoHobby);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEmpleadoHobby() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEmpleadoHobby.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEmpleadoHobby.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoHobby);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoHobby.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empleadohobbyConstantesFunciones.mostrarFK_IdEmpleadoEmpleadoHobby);
			if(!this.empleadohobbyConstantesFunciones.mostrarFK_IdEmpleadoEmpleadoHobby && index>-1) {
				this.jTabbedPaneBusquedasEmpleadoHobby.remove(index);
			}

			index= this.jTabbedPaneBusquedasEmpleadoHobby.indexOfComponent(this.jPanelFK_IdHobbyEmpleadoHobby);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoHobby.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empleadohobbyConstantesFunciones.mostrarFK_IdHobbyEmpleadoHobby);
			if(!this.empleadohobbyConstantesFunciones.mostrarFK_IdHobbyEmpleadoHobby && index>-1) {
				this.jTabbedPaneBusquedasEmpleadoHobby.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEmpleadoHobby() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEmpleadoHobby.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEmpleadoHobby.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoHobby);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoHobby.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empleadohobbyConstantesFunciones.activarFK_IdEmpleadoEmpleadoHobby);
				this.jTabbedPaneBusquedasEmpleadoHobby.setEnabledAt(index,this.empleadohobbyConstantesFunciones.activarFK_IdEmpleadoEmpleadoHobby);
			}

			index= this.jTabbedPaneBusquedasEmpleadoHobby.indexOfComponent(this.jPanelFK_IdHobbyEmpleadoHobby);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoHobby.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empleadohobbyConstantesFunciones.activarFK_IdHobbyEmpleadoHobby);
				this.jTabbedPaneBusquedasEmpleadoHobby.setEnabledAt(index,this.empleadohobbyConstantesFunciones.activarFK_IdHobbyEmpleadoHobby);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEmpleadoHobby(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasEmpleadoHobby.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoHobby);

			this.jTabbedPaneBusquedasEmpleadoHobby.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoHobby.getComponent(index);

			this.empleadohobbyConstantesFunciones.setResaltarFK_IdEmpleadoEmpleadoHobby(resaltar);

			jPanel.setBorder(this.empleadohobbyConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoHobby);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdHobby")) {
			index= this.jTabbedPaneBusquedasEmpleadoHobby.indexOfComponent(this.jPanelFK_IdHobbyEmpleadoHobby);

			this.jTabbedPaneBusquedasEmpleadoHobby.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoHobby.getComponent(index);

			this.empleadohobbyConstantesFunciones.setResaltarFK_IdHobbyEmpleadoHobby(resaltar);

			jPanel.setBorder(this.empleadohobbyConstantesFunciones.resaltarFK_IdHobbyEmpleadoHobby);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEmpleadoHobby.setBorder(resaltar);
			
		}
	}	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioEmpleadoHobby() throws Exception {

		if(this.jInternalFrameDetalleFormEmpleadoHobby==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEmpleadoHobby();
		this.updateVisibilidadResaltarControlesFormularioEmpleadoHobby();
		this.updateHabilitarResaltarControlesFormularioEmpleadoHobby();
		
	}
	
	public void updateBorderResaltarControlesFormularioEmpleadoHobby() throws Exception {
		if(this.jInternalFrameDetalleFormEmpleadoHobby==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.empleadohobbyConstantesFunciones.resaltaridEmpleadoHobby!=null && this.jInternalFrameDetalleFormEmpleadoHobby!=null) {this.jInternalFrameDetalleFormEmpleadoHobby.jLabelidEmpleadoHobby.setBorder(this.empleadohobbyConstantesFunciones.resaltaridEmpleadoHobby);}
		if(this.empleadohobbyConstantesFunciones.resaltarid_empresaEmpleadoHobby!=null && this.jInternalFrameDetalleFormEmpleadoHobby!=null) {this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empresaEmpleadoHobby.setBorder(this.empleadohobbyConstantesFunciones.resaltarid_empresaEmpleadoHobby);}
		if(this.empleadohobbyConstantesFunciones.resaltarid_empleadoEmpleadoHobby!=null && this.jInternalFrameDetalleFormEmpleadoHobby!=null) {this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empleadoEmpleadoHobby.setBorder(this.empleadohobbyConstantesFunciones.resaltarid_empleadoEmpleadoHobby);}
		if(this.empleadohobbyConstantesFunciones.resaltarid_hobbyEmpleadoHobby!=null && this.jInternalFrameDetalleFormEmpleadoHobby!=null) {this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_hobbyEmpleadoHobby.setBorder(this.empleadohobbyConstantesFunciones.resaltarid_hobbyEmpleadoHobby);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEmpleadoHobby() throws Exception {		
		if(this.jInternalFrameDetalleFormEmpleadoHobby==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
	
		//this.jInternalFrameDetalleFormEmpleadoHobby.jLabelidEmpleadoHobby.setVisible(this.empleadohobbyConstantesFunciones.mostraridEmpleadoHobby);
		this.jInternalFrameDetalleFormEmpleadoHobby.jPanelidEmpleadoHobby.setVisible(this.empleadohobbyConstantesFunciones.mostraridEmpleadoHobby);
		//this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empresaEmpleadoHobby.setVisible(this.empleadohobbyConstantesFunciones.mostrarid_empresaEmpleadoHobby);
		this.jInternalFrameDetalleFormEmpleadoHobby.jPanelid_empresaEmpleadoHobby.setVisible(this.empleadohobbyConstantesFunciones.mostrarid_empresaEmpleadoHobby);
		//this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empleadoEmpleadoHobby.setVisible(this.empleadohobbyConstantesFunciones.mostrarid_empleadoEmpleadoHobby);
		this.jInternalFrameDetalleFormEmpleadoHobby.jPanelid_empleadoEmpleadoHobby.setVisible(this.empleadohobbyConstantesFunciones.mostrarid_empleadoEmpleadoHobby);
			this.jInternalFrameDetalleFormEmpleadoHobby.jButtonid_empleadoEmpleadoHobby.setVisible(this.empleadohobbyConstantesFunciones.mostrarid_empleadoEmpleadoHobby);
		//this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_hobbyEmpleadoHobby.setVisible(this.empleadohobbyConstantesFunciones.mostrarid_hobbyEmpleadoHobby);
		this.jInternalFrameDetalleFormEmpleadoHobby.jPanelid_hobbyEmpleadoHobby.setVisible(this.empleadohobbyConstantesFunciones.mostrarid_hobbyEmpleadoHobby);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEmpleadoHobby() throws Exception {
		if(this.jInternalFrameDetalleFormEmpleadoHobby==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoHobby!=null) {
	
		this.jInternalFrameDetalleFormEmpleadoHobby.jLabelidEmpleadoHobby.setEnabled(this.empleadohobbyConstantesFunciones.activaridEmpleadoHobby);
		this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empresaEmpleadoHobby.setEnabled(this.empleadohobbyConstantesFunciones.activarid_empresaEmpleadoHobby);
		this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_empleadoEmpleadoHobby.setEnabled(this.empleadohobbyConstantesFunciones.activarid_empleadoEmpleadoHobby);
			this.jInternalFrameDetalleFormEmpleadoHobby.jButtonid_empleadoEmpleadoHobby.setEnabled(this.empleadohobbyConstantesFunciones.activarid_empleadoEmpleadoHobby);
		this.jInternalFrameDetalleFormEmpleadoHobby.jComboBoxid_hobbyEmpleadoHobby.setEnabled(this.empleadohobbyConstantesFunciones.activarid_hobbyEmpleadoHobby);
		}
	}
	
		
}