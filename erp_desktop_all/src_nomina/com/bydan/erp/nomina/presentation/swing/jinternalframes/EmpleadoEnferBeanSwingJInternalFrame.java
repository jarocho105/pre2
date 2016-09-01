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

import com.bydan.erp.nomina.util.EmpleadoEnferConstantesFunciones;
import com.bydan.erp.nomina.util.EmpleadoEnferParameterReturnGeneral;
//import com.bydan.erp.nomina.util.EmpleadoEnferParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.EmpleadoEnferBean;
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
public class EmpleadoEnferBeanSwingJInternalFrame extends EmpleadoEnferJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EmpleadoEnferBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EmpleadoEnfer> empleadoenferValidator = new ClassValidator<EmpleadoEnfer>(EmpleadoEnfer.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EmpleadoEnfer empleadoenfer;	
	public EmpleadoEnfer empleadoenferAux;
	public EmpleadoEnfer empleadoenferAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EmpleadoEnfer empleadoenferTotales;
	public Long idEmpleadoEnferActual;
	public Long iIdNuevoEmpleadoEnfer=0L;
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

	public String sFinalQueryComboEnfermedad="";

	public List<Enfermedad> enfermedadsForeignKey;

	public List<Enfermedad> getenfermedadsForeignKey() {
		return enfermedadsForeignKey;
	}

	public void setenfermedadsForeignKey(List<Enfermedad> enfermedadsForeignKey) {
		this.enfermedadsForeignKey = enfermedadsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Enfermedad enfermedadForeignKey;

	public Enfermedad getenfermedadForeignKey() {
		return enfermedadForeignKey;
	}

	public void setenfermedadForeignKey(Enfermedad enfermedadForeignKey) {
		this.enfermedadForeignKey = enfermedadForeignKey;
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
	
	public Boolean isPermisoTodoEmpleadoEnfer;
	public Boolean isPermisoNuevoEmpleadoEnfer;
	public Boolean isPermisoActualizarEmpleadoEnfer;
	public Boolean isPermisoActualizarOriginalEmpleadoEnfer;
	public Boolean isPermisoEliminarEmpleadoEnfer;
	public Boolean isPermisoGuardarCambiosEmpleadoEnfer;
	public Boolean isPermisoConsultaEmpleadoEnfer;
	public Boolean isPermisoBusquedaEmpleadoEnfer;
	public Boolean isPermisoReporteEmpleadoEnfer;
	public Boolean isPermisoPaginacionMedioEmpleadoEnfer;
	public Boolean isPermisoPaginacionAltoEmpleadoEnfer;
	public Boolean isPermisoPaginacionTodoEmpleadoEnfer;
	public Boolean isPermisoCopiarEmpleadoEnfer;
	public Boolean isPermisoVerFormEmpleadoEnfer;
	public Boolean isPermisoDuplicarEmpleadoEnfer;
	public Boolean isPermisoOrdenEmpleadoEnfer;
	
	
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
	
	public EmpleadoEnferParameterReturnGeneral empleadoenferReturnGeneral;
	public EmpleadoEnferParameterReturnGeneral empleadoenferParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEmpleadoEnfer=false;
	public Boolean esParaAccionDesdeFormularioEmpleadoEnfer=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EmpleadoEnferSessionBeanAdditional empleadoenferSessionBeanAdditional=null;
	
	public EmpleadoEnferSessionBeanAdditional getEmpleadoEnferSessionBeanAdditional() {
		return this.empleadoenferSessionBeanAdditional;
	}
	
	public void setEmpleadoEnferSessionBeanAdditional(EmpleadoEnferSessionBeanAdditional empleadoenferSessionBeanAdditional) {
		try {
			this.empleadoenferSessionBeanAdditional=empleadoenferSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EmpleadoEnferBeanSwingJInternalFrameAdditional empleadoenferBeanSwingJInternalFrameAdditional=null;
	//public class EmpleadoEnferBeanSwingJInternalFrame
	
	public EmpleadoEnferBeanSwingJInternalFrameAdditional getEmpleadoEnferBeanSwingJInternalFrameAdditional() {
		return this.empleadoenferBeanSwingJInternalFrameAdditional;
	}
	
	public void setEmpleadoEnferBeanSwingJInternalFrameAdditional(EmpleadoEnferBeanSwingJInternalFrameAdditional empleadoenferBeanSwingJInternalFrameAdditional) {
		try {
			this.empleadoenferBeanSwingJInternalFrameAdditional=empleadoenferBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EmpleadoEnferLogic empleadoenferLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EmpleadoEnfer empleadoenferBean;
	public EmpleadoEnferConstantesFunciones empleadoenferConstantesFunciones;
	//public EmpleadoEnferParameterReturnGeneral empleadoenferReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	public EnfermedadLogic enfermedadLogic;
	
	//PARAMETROS
	
	
	//public List<EmpleadoEnfer> empleadoenfers;	
	//public List<EmpleadoEnfer> empleadoenfersEliminados;
	//public List<EmpleadoEnfer> empleadoenfersAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEmpleadoEnfer=false;
	public Boolean isVisibilidadCeldaDuplicarEmpleadoEnfer=true;
	public Boolean isVisibilidadCeldaCopiarEmpleadoEnfer=true;
	public Boolean isVisibilidadCeldaVerFormEmpleadoEnfer=true;
	public Boolean isVisibilidadCeldaOrdenEmpleadoEnfer=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEmpleadoEnfer=false;
	public Boolean isVisibilidadCeldaModificarEmpleadoEnfer=false;
	public Boolean isVisibilidadCeldaActualizarEmpleadoEnfer=false;
	public Boolean isVisibilidadCeldaEliminarEmpleadoEnfer=false;
	public Boolean isVisibilidadCeldaCancelarEmpleadoEnfer=false;
	public Boolean isVisibilidadCeldaGuardarEmpleadoEnfer=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEmpleadoEnfer=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEnfermedad=false;
	
	public Long getiIdNuevoEmpleadoEnfer() {
		return this.iIdNuevoEmpleadoEnfer;
	}

	public void setiIdNuevoEmpleadoEnfer(Long iIdNuevoEmpleadoEnfer) {
		this.iIdNuevoEmpleadoEnfer = iIdNuevoEmpleadoEnfer;
	}
	
	public Long getidEmpleadoEnferActual() {
		return this.idEmpleadoEnferActual;
	}

	public void setidEmpleadoEnferActual(Long idEmpleadoEnferActual) {
		this.idEmpleadoEnferActual = idEmpleadoEnferActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EmpleadoEnfer getempleadoenfer() {
		return this.empleadoenfer;
	}

	public void setempleadoenfer(EmpleadoEnfer empleadoenfer) {
		this.empleadoenfer = empleadoenfer;
	}
	
	public EmpleadoEnfer getempleadoenferAux() {
		return this.empleadoenferAux;
	}

	public void setempleadoenferAux(EmpleadoEnfer empleadoenferAux) {
		this.empleadoenferAux = empleadoenferAux;
	}				
	
	public EmpleadoEnfer getempleadoenferAnterior() {
		return this.empleadoenferAnterior;
	}

	public void setempleadoenferAnterior(EmpleadoEnfer empleadoenferAnterior) {
		this.empleadoenferAnterior = empleadoenferAnterior;
	}	
	
	public EmpleadoEnfer getempleadoenferTotales() {
		return this.empleadoenferTotales;
	}

	public void setempleadoenferTotales(EmpleadoEnfer empleadoenferTotales) {
		this.empleadoenferTotales = empleadoenferTotales;
	}	
	
	public EmpleadoEnfer getempleadoenferBean() {
		return this.empleadoenferBean;
	}

	public void setempleadoenferBean(EmpleadoEnfer empleadoenferBean) {
		this.empleadoenferBean = empleadoenferBean;
	}	
	
	public EmpleadoEnferParameterReturnGeneral getempleadoenferReturnGeneral() {
		return this.empleadoenferReturnGeneral;
	}

	public void setempleadoenferReturnGeneral(EmpleadoEnferParameterReturnGeneral empleadoenferReturnGeneral) {
		this.empleadoenferReturnGeneral = empleadoenferReturnGeneral;
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

	public Long id_enfermedadFK_IdEnfermedad=-1L;

	public Long getid_enfermedadFK_IdEnfermedad() {
		return this.id_enfermedadFK_IdEnfermedad;
	}

	public void setid_enfermedadFK_IdEnfermedad(Long id_enfermedadFK_IdEnfermedad) {
		this.id_enfermedadFK_IdEnfermedad = id_enfermedadFK_IdEnfermedad;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EmpleadoEnferLogic getEmpleadoEnferLogic()	{		
		return empleadoenferLogic;
	}

	public void setEmpleadoEnferLogic(EmpleadoEnferLogic empleadoenferLogic) {
		this.empleadoenferLogic = empleadoenferLogic;
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
	
	public Boolean getIsEsNuevoEmpleadoEnfer() {
		return isEsNuevoEmpleadoEnfer;
	}

	public void setIsEsNuevoEmpleadoEnfer(Boolean isEsNuevoEmpleadoEnfer) {
		this.isEsNuevoEmpleadoEnfer = isEsNuevoEmpleadoEnfer;
	}

	public Boolean getEsParaAccionDesdeFormularioEmpleadoEnfer() {
		return esParaAccionDesdeFormularioEmpleadoEnfer;
	}
	
	public void setEsParaAccionDesdeFormularioEmpleadoEnfer(Boolean esParaAccionDesdeFormularioEmpleadoEnfer) {
		this.esParaAccionDesdeFormularioEmpleadoEnfer = esParaAccionDesdeFormularioEmpleadoEnfer;
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

			if(this.empleadoenferSessionBean==null) {
				this.empleadoenferSessionBean=new EmpleadoEnferSessionBean();
			}

			if(!this.empleadoenferSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(empleadoenferSessionBean.getlidEmpresaActual());
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

			if(this.empleadoenferSessionBean==null) {
				this.empleadoenferSessionBean=new EmpleadoEnferSessionBean();
			}

			if(!this.empleadoenferSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(empleadoenferSessionBean.getlidEmpleadoActual());
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

	public void cargarCombosEnfermedadsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.enfermedadsForeignKey=new ArrayList<Enfermedad>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EnfermedadLogic enfermedadLogic=new EnfermedadLogic();

			//enfermedadLogic.getEnfermedadDataAccess().setIsForForeingKeyData(true);

			if(this.empleadoenferSessionBean==null) {
				this.empleadoenferSessionBean=new EmpleadoEnferSessionBean();
			}

			if(!this.empleadoenferSessionBean.getisBusquedaDesdeForeignKeySesionEnfermedad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//enfermedadLogic.getEnfermedadDataAccess().setIsForForeingKeyData(true);

					enfermedadLogic.getTodosEnfermedadsWithConnection(sFinalQuery,new Pagination());

					this.enfermedadsForeignKey=enfermedadLogic.getEnfermedads();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEnfermedad(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					enfermedadLogic.getEntityWithConnection(empleadoenferSessionBean.getlidEnfermedadActual());
					this.enfermedadsForeignKey.add(enfermedadLogic.getEnfermedad());
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

					if(this.empleadoenfer!=null) {
						this.empleadoenfer.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
						this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empresaEmpleadoEnfer.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEmpleadoEnfer.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empresaEmpleadoEnfer.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empresaEmpleadoEnfer.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEmpleadoEnferGenerico)throws Exception
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
				jComboBoxid_empresaEmpleadoEnferGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEmpleadoEnferGenerico!=null && jComboBoxid_empresaEmpleadoEnferGenerico.getItemCount()>0) {
					jComboBoxid_empresaEmpleadoEnferGenerico.setSelectedIndex(0);
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

					if(this.empleadoenfer!=null) {
						this.empleadoenfer.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
						this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empleadoEmpleadoEnfer.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoEmpleadoEnfer.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empleadoEmpleadoEnfer.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empleadoEmpleadoEnfer.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEnfer!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEnfer.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEnfer!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEnfer.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEnfer.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEnfer.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoEmpleadoEnferGenerico)throws Exception
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
				jComboBoxid_empleadoEmpleadoEnferGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoEmpleadoEnferGenerico!=null && jComboBoxid_empleadoEmpleadoEnferGenerico.getItemCount()>0) {
					jComboBoxid_empleadoEmpleadoEnferGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEnfermedadForeignKey(Long idEnfermedadSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Enfermedad  enfermedadTemp=null;

			for(Enfermedad enfermedadAux:enfermedadsForeignKey) {
				if(enfermedadAux.getId()!=null && enfermedadAux.getId().equals(idEnfermedadSeleccionado)) {
					enfermedadTemp=enfermedadAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(enfermedadTemp!=null) {

					if(this.empleadoenfer!=null) {
						this.empleadoenfer.setEnfermedad(enfermedadTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
						this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_enfermedadEmpleadoEnfer.setSelectedItem(enfermedadTemp);
					}
				} else {
					//jComboBoxid_enfermedadEmpleadoEnfer.setSelectedItem(enfermedadTemp);
					if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_enfermedadEmpleadoEnfer.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_enfermedadEmpleadoEnfer.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEnfermedad") || sFormularioTipoBusqueda.equals("Todos")){
					if(enfermedadTemp!=null && jComboBoxid_enfermedadFK_IdEnfermedadEmpleadoEnfer!=null) {
						jComboBoxid_enfermedadFK_IdEnfermedadEmpleadoEnfer.setSelectedItem(enfermedadTemp);
					} else {
						if(jComboBoxid_enfermedadFK_IdEnfermedadEmpleadoEnfer!=null) {
							//jComboBoxid_enfermedadFK_IdEnfermedadEmpleadoEnfer.setSelectedItem(enfermedadTemp);
							if(jComboBoxid_enfermedadFK_IdEnfermedadEmpleadoEnfer.getItemCount()>0) {
								jComboBoxid_enfermedadFK_IdEnfermedadEmpleadoEnfer.setSelectedIndex(0);
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

	public String getActualEnfermedadForeignKeyDescripcion(Long idEnfermedadSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Enfermedad  enfermedadTemp=null;

			for(Enfermedad enfermedadAux:enfermedadsForeignKey) {
				if(enfermedadAux.getId()!=null && enfermedadAux.getId().equals(idEnfermedadSeleccionado)) {
					enfermedadTemp=enfermedadAux;
					break;
				}
			}


			sDescripcion=EnfermedadConstantesFunciones.getEnfermedadDescripcion(enfermedadTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEnfermedadForeignKeyGenerico(Long idEnfermedadSeleccionado,JComboBox jComboBoxid_enfermedadEmpleadoEnferGenerico)throws Exception
	{
		try
		{
			Enfermedad  enfermedadTemp=null;

			for(Enfermedad enfermedadAux:enfermedadsForeignKey) {
				if(enfermedadAux.getId()!=null && enfermedadAux.getId().equals(idEnfermedadSeleccionado)) {
					enfermedadTemp=enfermedadAux;
					break;
				}
			}

			if(enfermedadTemp!=null) {
				jComboBoxid_enfermedadEmpleadoEnferGenerico.setSelectedItem(enfermedadTemp);
			} else {
				if(jComboBoxid_enfermedadEmpleadoEnferGenerico!=null && jComboBoxid_enfermedadEmpleadoEnferGenerico.getItemCount()>0) {
					jComboBoxid_enfermedadEmpleadoEnferGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(EmpleadoEnfer empleadoenfer,JComboBox jComboBoxid_empresaEmpleadoEnferGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEmpleadoEnferGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empresaEmpleadoEnfer.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEmpleadoEnferGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				empleadoenfer.setid_empresa(empresaAux.getId());
				empleadoenfer.setempresa_descripcion(EmpleadoEnferConstantesFunciones.getEmpresaDescripcion(empresaAux));
				empleadoenfer.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(EmpleadoEnfer empleadoenfer,JComboBox jComboBoxid_empleadoEmpleadoEnferGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoEmpleadoEnferGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empleadoEmpleadoEnfer.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoEmpleadoEnferGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				empleadoenfer.setid_empleado(empleadoAux.getId());
				empleadoenfer.setempleado_descripcion(EmpleadoEnferConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				empleadoenfer.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEnfermedadForeignKey(EmpleadoEnfer empleadoenfer,JComboBox jComboBoxid_enfermedadEmpleadoEnferGenerico)throws Exception
	{
		try
		{
			Enfermedad  enfermedadAux=new Enfermedad();

			if(jComboBoxid_enfermedadEmpleadoEnferGenerico==null) {
				enfermedadAux=(Enfermedad)this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_enfermedadEmpleadoEnfer.getSelectedItem();
			} else {
				enfermedadAux=(Enfermedad)jComboBoxid_enfermedadEmpleadoEnferGenerico.getSelectedItem();
			}

			if(enfermedadAux!=null && enfermedadAux.getId()!=null) {
				empleadoenfer.setid_enfermedad(enfermedadAux.getId());
				empleadoenfer.setenfermedad_descripcion(EmpleadoEnferConstantesFunciones.getEnfermedadDescripcion(enfermedadAux));
				empleadoenfer.setEnfermedad(enfermedadAux);			}
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

					if(!EmpleadoEnferJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) { 
							this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empresaEmpleadoEnfer.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empresaEmpleadoEnfer.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) { 
					}

					if(!EmpleadoEnferJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EmpleadoEnferJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) { 
							this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empleadoEmpleadoEnfer.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empleadoEmpleadoEnfer.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) { 
					}

					if(!EmpleadoEnferJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpleadoEnferJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEnfer.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEnfer.addItem(empleado);
							}
						}

						if(!EmpleadoEnferJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEnfermedadsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEnfermedad=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EmpleadoEnferJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) { 
							this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_enfermedadEmpleadoEnfer.removeAllItems();

							for(Enfermedad enfermedad:this.enfermedadsForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_enfermedadEmpleadoEnfer.addItem(enfermedad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) { 
					}

					if(!EmpleadoEnferJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEnfermedad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpleadoEnferJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_enfermedadFK_IdEnfermedadEmpleadoEnfer.removeAllItems();

							for(Enfermedad enfermedad:this.enfermedadsForeignKey) {
								this.jComboBoxid_enfermedadFK_IdEnfermedadEmpleadoEnfer.addItem(enfermedad);
							}
						}

						if(!EmpleadoEnferJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
							this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empresaEmpleadoEnfer.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
							this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empresaEmpleadoEnfer.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
							this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empleadoEmpleadoEnfer.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
							this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empleadoEmpleadoEnfer.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEnfer.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEnfer.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEnfermedadForeignKey(Enfermedad enfermedad,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
							this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_enfermedadEmpleadoEnfer.setSelectedItem(enfermedad);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
							this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_enfermedadEmpleadoEnfer.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_enfermedadFK_IdEnfermedadEmpleadoEnfer.setSelectedItem(enfermedad);
						} else {
							this.jComboBoxid_enfermedadFK_IdEnfermedadEmpleadoEnfer.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesEmpleadoEnfer() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EmpleadoEnferConstantesFunciones.refrescarForeignKeysDescripcionesEmpleadoEnfer(this.empleadoenferLogic.getEmpleadoEnfers());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EmpleadoEnferConstantesFunciones.refrescarForeignKeysDescripcionesEmpleadoEnfer(this.empleadoenfers);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(Enfermedad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//empleadoenferLogic.setEmpleadoEnfers(this.empleadoenfers);
			empleadoenferLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EmpleadoEnferParameterReturnGeneral getEmpleadoEnferParameterGeneral() {
		return this.empleadoenferParameterGeneral;
	}
	
	public void setEmpleadoEnferParameterGeneral(EmpleadoEnferParameterReturnGeneral empleadoenferParameterGeneral) {
		this.empleadoenferParameterGeneral = empleadoenferParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEmpleadoEnfer() {
		return isPermisoTodoEmpleadoEnfer;
	}

	public void setIsPermisoTodoEmpleadoEnfer(Boolean isPermisoTodoEmpleadoEnfer) {
		this.isPermisoTodoEmpleadoEnfer = isPermisoTodoEmpleadoEnfer;
	}

	public Boolean getIsPermisoNuevoEmpleadoEnfer() {
		return isPermisoNuevoEmpleadoEnfer;
	}

	public void setIsPermisoNuevoEmpleadoEnfer(Boolean isPermisoNuevoEmpleadoEnfer) {
		this.isPermisoNuevoEmpleadoEnfer = isPermisoNuevoEmpleadoEnfer;
	}

	public Boolean getIsPermisoActualizarEmpleadoEnfer() {
		return isPermisoActualizarEmpleadoEnfer;
	}

	public void setIsPermisoActualizarEmpleadoEnfer(Boolean isPermisoActualizarEmpleadoEnfer) {
		this.isPermisoActualizarEmpleadoEnfer = isPermisoActualizarEmpleadoEnfer;
	}

	public Boolean getIsPermisoEliminarEmpleadoEnfer() {
		return isPermisoEliminarEmpleadoEnfer;
	}

	public void setIsPermisoEliminarEmpleadoEnfer(Boolean isPermisoEliminarEmpleadoEnfer) {
		this.isPermisoEliminarEmpleadoEnfer = isPermisoEliminarEmpleadoEnfer;
	}

	public Boolean getIsPermisoGuardarCambiosEmpleadoEnfer() {
		return isPermisoGuardarCambiosEmpleadoEnfer;
	}

	public void setIsPermisoGuardarCambiosEmpleadoEnfer(Boolean isPermisoGuardarCambiosEmpleadoEnfer) {
		this.isPermisoGuardarCambiosEmpleadoEnfer = isPermisoGuardarCambiosEmpleadoEnfer;
	}
	
	public Boolean getIsPermisoConsultaEmpleadoEnfer() {
		return isPermisoConsultaEmpleadoEnfer;
	}

	public void setIsPermisoConsultaEmpleadoEnfer(Boolean isPermisoConsultaEmpleadoEnfer) {
		this.isPermisoConsultaEmpleadoEnfer = isPermisoConsultaEmpleadoEnfer;
	}

	public Boolean getIsPermisoBusquedaEmpleadoEnfer() {
		return isPermisoBusquedaEmpleadoEnfer;
	}

	public void setIsPermisoBusquedaEmpleadoEnfer(Boolean isPermisoBusquedaEmpleadoEnfer) {
		this.isPermisoBusquedaEmpleadoEnfer = isPermisoBusquedaEmpleadoEnfer;
	}

	public Boolean getIsPermisoReporteEmpleadoEnfer() {
		return isPermisoReporteEmpleadoEnfer;
	}

	public void setIsPermisoReporteEmpleadoEnfer(Boolean isPermisoReporteEmpleadoEnfer) {
		this.isPermisoReporteEmpleadoEnfer = isPermisoReporteEmpleadoEnfer;
	}
	
	public Boolean getIsPermisoPaginacionMedioEmpleadoEnfer() {
		return isPermisoPaginacionMedioEmpleadoEnfer;
	}

	public void setIsPermisoPaginacionMedioEmpleadoEnfer(Boolean isPermisoPaginacionMedioEmpleadoEnfer) {
		this.isPermisoPaginacionMedioEmpleadoEnfer = isPermisoPaginacionMedioEmpleadoEnfer;
	}
	
	public Boolean getIsPermisoPaginacionTodoEmpleadoEnfer() {
		return isPermisoPaginacionTodoEmpleadoEnfer;
	}

	public void setIsPermisoPaginacionTodoEmpleadoEnfer(Boolean isPermisoPaginacionTodoEmpleadoEnfer) {
		this.isPermisoPaginacionTodoEmpleadoEnfer = isPermisoPaginacionTodoEmpleadoEnfer;
	}
	
	public Boolean getIsPermisoPaginacionAltoEmpleadoEnfer() {
		return isPermisoPaginacionAltoEmpleadoEnfer;
	}

	public void setIsPermisoPaginacionAltoEmpleadoEnfer(Boolean isPermisoPaginacionAltoEmpleadoEnfer) {
		this.isPermisoPaginacionAltoEmpleadoEnfer = isPermisoPaginacionAltoEmpleadoEnfer;
	}
	
	public Boolean getIsPermisoCopiarEmpleadoEnfer() {
		return isPermisoCopiarEmpleadoEnfer;
	}

	public void setIsPermisoCopiarEmpleadoEnfer(Boolean isPermisoCopiarEmpleadoEnfer) {
		this.isPermisoCopiarEmpleadoEnfer = isPermisoCopiarEmpleadoEnfer;
	}
	
	public Boolean getIsPermisoVerFormEmpleadoEnfer() {
		return isPermisoVerFormEmpleadoEnfer;
	}

	public void setIsPermisoVerFormEmpleadoEnfer(Boolean isPermisoVerFormEmpleadoEnfer) {
		this.isPermisoVerFormEmpleadoEnfer = isPermisoVerFormEmpleadoEnfer;
	}
	
	public Boolean getIsPermisoDuplicarEmpleadoEnfer() {
		return isPermisoDuplicarEmpleadoEnfer;
	}

	public void setIsPermisoDuplicarEmpleadoEnfer(Boolean isPermisoDuplicarEmpleadoEnfer) {
		this.isPermisoDuplicarEmpleadoEnfer = isPermisoDuplicarEmpleadoEnfer;
	}
	
	public Boolean getIsPermisoOrdenEmpleadoEnfer() {
		return isPermisoOrdenEmpleadoEnfer;
	}

	public void setIsPermisoOrdenEmpleadoEnfer(Boolean isPermisoOrdenEmpleadoEnfer) {
		this.isPermisoOrdenEmpleadoEnfer = isPermisoOrdenEmpleadoEnfer;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEmpleadoEnfer() {
		return isVisibilidadCeldaNuevoEmpleadoEnfer;
	}

	public void setIsVisibilidadCeldaNuevoEmpleadoEnfer(Boolean isVisibilidadCeldaNuevoEmpleadoEnfer) {
		this.isVisibilidadCeldaNuevoEmpleadoEnfer = isVisibilidadCeldaNuevoEmpleadoEnfer;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEmpleadoEnfer() {
		return isVisibilidadCeldaDuplicarEmpleadoEnfer;
	}

	public void setIsVisibilidadCeldaDuplicarEmpleadoEnfer(Boolean isVisibilidadCeldaDuplicarEmpleadoEnfer) {
		this.isVisibilidadCeldaDuplicarEmpleadoEnfer = isVisibilidadCeldaDuplicarEmpleadoEnfer;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEmpleadoEnfer() {
		return isVisibilidadCeldaCopiarEmpleadoEnfer;
	}

	public void setIsVisibilidadCeldaCopiarEmpleadoEnfer(Boolean isVisibilidadCeldaCopiarEmpleadoEnfer) {
		this.isVisibilidadCeldaCopiarEmpleadoEnfer = isVisibilidadCeldaCopiarEmpleadoEnfer;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEmpleadoEnfer() {
		return isVisibilidadCeldaVerFormEmpleadoEnfer;
	}

	public void setIsVisibilidadCeldaVerFormEmpleadoEnfer(Boolean isVisibilidadCeldaVerFormEmpleadoEnfer) {
		this.isVisibilidadCeldaVerFormEmpleadoEnfer = isVisibilidadCeldaVerFormEmpleadoEnfer;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEmpleadoEnfer() {
		return isVisibilidadCeldaOrdenEmpleadoEnfer;
	}

	public void setIsVisibilidadCeldaOrdenEmpleadoEnfer(Boolean isVisibilidadCeldaOrdenEmpleadoEnfer) {
		this.isVisibilidadCeldaOrdenEmpleadoEnfer = isVisibilidadCeldaOrdenEmpleadoEnfer;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEmpleadoEnfer() {
		return isVisibilidadCeldaNuevoRelacionesEmpleadoEnfer;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEmpleadoEnfer(Boolean isVisibilidadCeldaNuevoRelacionesEmpleadoEnfer) {
		this.isVisibilidadCeldaNuevoRelacionesEmpleadoEnfer = isVisibilidadCeldaNuevoRelacionesEmpleadoEnfer;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEmpleadoEnfer() {
		return isVisibilidadCeldaModificarEmpleadoEnfer;
	}

	public void setIsVisibilidadCeldaModificarEmpleadoEnfer(Boolean isVisibilidadCeldaModificarEmpleadoEnfer) {
		this.isVisibilidadCeldaModificarEmpleadoEnfer = isVisibilidadCeldaModificarEmpleadoEnfer;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEmpleadoEnfer() {
		return isVisibilidadCeldaActualizarEmpleadoEnfer;
	}

	public void setIsVisibilidadCeldaActualizarEmpleadoEnfer(Boolean isVisibilidadCeldaActualizarEmpleadoEnfer) {
		this.isVisibilidadCeldaActualizarEmpleadoEnfer = isVisibilidadCeldaActualizarEmpleadoEnfer;
	}

	public Boolean getIsVisibilidadCeldaEliminarEmpleadoEnfer() {
		return isVisibilidadCeldaEliminarEmpleadoEnfer;
	}

	public void setIsVisibilidadCeldaEliminarEmpleadoEnfer(Boolean isVisibilidadCeldaEliminarEmpleadoEnfer) {
		this.isVisibilidadCeldaEliminarEmpleadoEnfer = isVisibilidadCeldaEliminarEmpleadoEnfer;
	}

	public Boolean getIsVisibilidadCeldaCancelarEmpleadoEnfer() {
		return isVisibilidadCeldaCancelarEmpleadoEnfer;
	}

	public void setIsVisibilidadCeldaCancelarEmpleadoEnfer(Boolean isVisibilidadCeldaCancelarEmpleadoEnfer) {
		this.isVisibilidadCeldaCancelarEmpleadoEnfer = isVisibilidadCeldaCancelarEmpleadoEnfer;
	}

	public Boolean getIsVisibilidadCeldaGuardarEmpleadoEnfer() {
		return isVisibilidadCeldaGuardarEmpleadoEnfer;
	}

	public void setIsVisibilidadCeldaGuardarEmpleadoEnfer(Boolean isVisibilidadCeldaGuardarEmpleadoEnfer) {
		this.isVisibilidadCeldaGuardarEmpleadoEnfer = isVisibilidadCeldaGuardarEmpleadoEnfer;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEmpleadoEnfer() {
		return isVisibilidadCeldaGuardarCambiosEmpleadoEnfer;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEmpleadoEnfer(Boolean isVisibilidadCeldaGuardarCambiosEmpleadoEnfer) {
		this.isVisibilidadCeldaGuardarCambiosEmpleadoEnfer = isVisibilidadCeldaGuardarCambiosEmpleadoEnfer;
	}
		
	public EmpleadoEnferSessionBean getempleadoenferSessionBean() {
		return this.empleadoenferSessionBean;
	}
	
	public void setempleadoenferSessionBean(EmpleadoEnferSessionBean empleadoenferSessionBean) {
		this.empleadoenferSessionBean=empleadoenferSessionBean;
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

	public Boolean getisVisibilidadFK_IdEnfermedad() {
		return this.isVisibilidadFK_IdEnfermedad;
	}

	public void setisVisibilidadFK_IdEnfermedad(Boolean isVisibilidadFK_IdEnfermedad) {
		this.isVisibilidadFK_IdEnfermedad=isVisibilidadFK_IdEnfermedad;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEmpleadoEnfer(EmpleadoEnfer empleadoenfer)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(empleadoenfer,null);
				this.setActualParaGuardarEmpleadoForeignKey(empleadoenfer,null);
				this.setActualParaGuardarEnfermedadForeignKey(empleadoenfer,null);
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
	
	public void bugActualizarReferenciaActual(EmpleadoEnfer empleadoenfer,EmpleadoEnfer empleadoenferAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEmpleadoEnfer(empleadoenfer);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		empleadoenferAux.setId(empleadoenfer.getId());
		empleadoenferAux.setVersionRow(empleadoenfer.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEmpleadoEnfer();
		
			int intSelectedRow = this.jTableDatosEmpleadoEnfer.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenfer =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.empleadoenfer =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EmpleadoEnferJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEmpleadoEnfer(this.empleadoenfer,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEnfer(this.empleadoenfer);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = empleadoenferValidator.getInvalidValues(this.empleadoenfer);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			empleadoenferLogic.setDatosCliente(datosCliente);
			empleadoenferLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				empleadoenferAux=new  EmpleadoEnfer();
				
				empleadoenferAux.setIsNew(true);
				empleadoenferAux.setIsChanged(true);
				
				empleadoenferAux.setEmpleadoEnferOriginal(this.empleadoenfer);
				
				empleadoenferAux.setId(this.empleadoenfer.getId());	
				empleadoenferAux.setVersionRow(this.empleadoenfer.getVersionRow());	
				empleadoenferAux.setid_empresa(this.empleadoenfer.getid_empresa());	
				empleadoenferAux.setid_empleado(this.empleadoenfer.getid_empleado());	
				empleadoenferAux.setid_enfermedad(this.empleadoenfer.getid_enfermedad());	
				empleadoenferAux.setdescripcion(this.empleadoenfer.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.empleadoenferSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.empleadoenferSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(empleadoenferAux,empleadoenferLogic.getEmpleadoEnfers());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoenferAux,empleadoenfers);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.empleadoenferSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadoenferSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoenferLogic.saveEmpleadoEnfers();//WithConnection
						//empleadoenferLogic.getSetVersionRowEmpleadoEnfers();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.empleadoenfer,empleadoenferAux);
					
					this.refrescarForeignKeysDescripcionesEmpleadoEnfer();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadoenferSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadoenferLogic.saveEmpleadoEnferRelaciones(empleadoenferAux);//WithConnection
								//empleadoenferLogic.getSetVersionRowEmpleadoEnfers();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.empleadoenfer,empleadoenferAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.empleadoenferSessionBean.getEstaModoGuardarRelaciones() 
									|| this.empleadoenferSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(empleadoenferAux,empleadoenferLogic.getEmpleadoEnfers());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(empleadoenferAux,empleadoenfers);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.empleadoenfer,empleadoenferAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				empleadoenferAux=new  EmpleadoEnfer();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.empleadoenferSessionBean.getEsGuardarRelacionado() 
					|| (this.empleadoenferSessionBean.getEsGuardarRelacionado() && this.empleadoenfer.getId()>=0)) {
						
					empleadoenferAux.setIsNew(false);
				}
				
				empleadoenferAux.setIsDeleted(false);
			
				empleadoenferAux.setId(this.empleadoenfer.getId());	
				empleadoenferAux.setVersionRow(this.empleadoenfer.getVersionRow());	
				empleadoenferAux.setid_empresa(this.empleadoenfer.getid_empresa());	
				empleadoenferAux.setid_empleado(this.empleadoenfer.getid_empleado());	
				empleadoenferAux.setid_enfermedad(this.empleadoenfer.getid_enfermedad());	
				empleadoenferAux.setdescripcion(this.empleadoenfer.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(empleadoenferAux,empleadoenferLogic.getEmpleadoEnfers());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoenferAux,empleadoenfers);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.empleadoenferSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadoenferSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoenferLogic.saveEmpleadoEnfers();//WithConnection
						//empleadoenferLogic.getSetVersionRowEmpleadoEnfers();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.empleadoenfer,empleadoenferAux);
					
					this.refrescarForeignKeysDescripcionesEmpleadoEnfer();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadoenferSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadoenferLogic.saveEmpleadoEnferRelaciones(empleadoenferAux);//WithConnection
								//empleadoenferLogic.getSetVersionRowEmpleadoEnfers();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.empleadoenfer,empleadoenferAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.empleadoenferSessionBean.getEstaModoGuardarRelaciones() 
									|| this.empleadoenferSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(empleadoenferAux,empleadoenferLogic.getEmpleadoEnfers());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(empleadoenferAux,empleadoenfers);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.empleadoenfer,empleadoenferAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				empleadoenferAux=new  EmpleadoEnfer();
				
				empleadoenferAux.setIsNew(false);
				empleadoenferAux.setIsChanged(false);
				
				empleadoenferAux.setIsDeleted(true);
				
				empleadoenferAux.setId(this.empleadoenfer.getId());	
				empleadoenferAux.setVersionRow(this.empleadoenfer.getVersionRow());	
				empleadoenferAux.setid_empresa(this.empleadoenfer.getid_empresa());	
				empleadoenferAux.setid_empleado(this.empleadoenfer.getid_empleado());	
				empleadoenferAux.setid_enfermedad(this.empleadoenfer.getid_enfermedad());	
				empleadoenferAux.setdescripcion(this.empleadoenfer.getdescripcion());	
				
				if(this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.empleadoenferAux.getId()>=0) {	
						this.empleadoenfersEliminados.add(empleadoenferAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(empleadoenferAux,empleadoenferLogic.getEmpleadoEnfers());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoenferAux,empleadoenfers);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.empleadoenferSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadoenferSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoenferLogic.saveEmpleadoEnfers();//WithConnection
						//empleadoenferLogic.getSetVersionRowEmpleadoEnfers();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadoenferSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadoenferLogic.saveEmpleadoEnferRelaciones(empleadoenferAux);//WithConnection
								//empleadoenferLogic.getSetVersionRowEmpleadoEnfers();//WithConnection
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
							if(this.empleadoenferSessionBean.getEstaModoGuardarRelaciones() 
								|| this.empleadoenferSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(empleadoenferAux,empleadoenferLogic.getEmpleadoEnfers());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(empleadoenferAux,empleadoenfers);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenferLogic.getEmpleadoEnfers().addAll(this.empleadoenfersEliminados);
					
					empleadoenferLogic.saveEmpleadoEnfers();//WithConnection
					//empleadoenferLogic.getSetVersionRowEmpleadoEnfers();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesEmpleadoEnfer();
				
				this.empleadoenfersEliminados= new ArrayList<EmpleadoEnfer>();		
			}
			
			if(this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoenferSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Empleado Enfer GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Empleado Enfer",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.empleadoenfer=empleadoenferAux;
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
      		//this.finishProcessEmpleadoEnfer();
      	}
		
	}	
	
	public void actualizarRelaciones(EmpleadoEnfer empleadoenferLocal) throws Exception {
		
		if(this.empleadoenferSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EmpleadoEnfer empleadoenferLocal) throws Exception {	
		if(this.empleadoenferSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				empleadoenferLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				empleadoenferLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EnfermedadDetalleFormJInternalFrame.class)) {
				EnfermedadBeanSwingJInternalFrame enfermedadBeanSwingJInternalFrameLocal=(EnfermedadBeanSwingJInternalFrame) ((EnfermedadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				enfermedadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEnfermedad(enfermedadBeanSwingJInternalFrameLocal.getenfermedad(),true);
				enfermedadBeanSwingJInternalFrameLocal.actualizarLista(enfermedadBeanSwingJInternalFrameLocal.enfermedad,this.enfermedadsForeignKey);

				enfermedadBeanSwingJInternalFrameLocal.actualizarRelaciones(enfermedadBeanSwingJInternalFrameLocal.enfermedad);

				empleadoenferLocal.setEnfermedad(enfermedadBeanSwingJInternalFrameLocal.enfermedad);

				this.addItemDefectoCombosForeignKeyEnfermedad();
				this.cargarCombosFrameEnfermedadsForeignKey("Formulario");
				this.setActualEnfermedadForeignKey(enfermedadBeanSwingJInternalFrameLocal.enfermedad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEmpleadoEnferActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEmpleadoEnfer.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.empleadoenfer =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.empleadoenfer =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = empleadoenferValidator.getInvalidValues(this.empleadoenfer);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EmpleadoEnfer empleadoenfer,List<EmpleadoEnfer> empleadoenfers) throws Exception {
		try	{		
			EmpleadoEnferConstantesFunciones.actualizarLista(empleadoenfer,empleadoenfers,this.empleadoenferSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EmpleadoEnfer empleadoenfer,List<EmpleadoEnfer> empleadoenfers) throws Exception {
		try	{			
			EmpleadoEnferConstantesFunciones.actualizarSelectedLista(empleadoenfer,empleadoenfers);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EmpleadoEnfer> empleadoenfersLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				empleadoenfersLocal=this.empleadoenferLogic.getEmpleadoEnfers();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				empleadoenfersLocal=this.empleadoenfers;
			}
			//ARCHITECTURE
		
			for(EmpleadoEnfer empleadoenferLocal:empleadoenfersLocal) {
				if(this.permiteMantenimiento(empleadoenferLocal) && empleadoenferLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EmpleadoEnferConstantesFunciones.getEmpleadoEnferLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EmpleadoEnferConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEnfer.jLabelid_empresaEmpleadoEnfer,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoEnferConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEnfer.jLabelid_empleadoEmpleadoEnfer,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoEnferConstantesFunciones.IDENFERMEDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEnfer.jLabelid_enfermedadEmpleadoEnfer,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoEnferConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEnfer.jLabeldescripcionEmpleadoEnfer,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoEnfer.jLabelid_empresaEmpleadoEnfer,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoEnfer.jLabelid_empleadoEmpleadoEnfer,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoEnfer.jLabelid_enfermedadEmpleadoEnfer,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoEnfer.jLabeldescripcionEmpleadoEnfer,"");
		
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
		this.iIdNuevoEmpleadoEnfer--;	
		
		
		this.empleadoenferAux=new EmpleadoEnfer();
		
		this.empleadoenferAux.setId(this.iIdNuevoEmpleadoEnfer);
		this.empleadoenferAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.empleadoenferLogic.getEmpleadoEnfers().add(this.empleadoenferAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.empleadoenfers.add(this.empleadoenferAux);
		}
		//ARCHITECTURE
		
		this.empleadoenfer=this.empleadoenferAux;
		
		if(EmpleadoEnferJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEmpleadoEnfer(this.empleadoenfer);
			this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoEnfer(this.empleadoenfer);
		}
				
		//this.setDefaultControlesEmpleadoEnfer();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEmpleadoEnfer();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEmpleadoEnfer();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoEnfer();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmpleadoEnfer(this.empleadoenferBean,this.empleadoenfer,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEnfer(this.empleadoenfer);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EmpleadoEnferConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.empleadoenferSessionBean.getConGuardarRelaciones()) {
			classes=EmpleadoEnferConstantesFunciones.getClassesRelationshipsOfEmpleadoEnfer(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.empleadoenferReturnGeneral=empleadoenferLogic.procesarEventosEmpleadoEnfersWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadoenferLogic.getEmpleadoEnfers(),this.empleadoenfer,this.empleadoenferParameterGeneral,this.isEsNuevoEmpleadoEnfer,classes);//this.empleadoenferLogic.getEmpleadoEnfer()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEmpleadoEnfer(this.empleadoenferReturnGeneral,this.empleadoenferBean,false);
		
		if(this.empleadoenferReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoEnfer(this.empleadoenferReturnGeneral.getEmpleadoEnfer());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEmpleadoEnfer(this.empleadoenferReturnGeneral.getEmpleadoEnfer());
		}
		
		if(this.empleadoenferReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEmpleadoEnfer(this.empleadoenferReturnGeneral.getEmpleadoEnfer(),classes);//this.empleadoenferBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEmpleadoEnfer(this.empleadoenfer,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEmpleadoEnfer();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEmpleadoEnfer();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmpleadoEnferBeanSwingJInternalFrameAdditional.RecargarFormEmpleadoEnfer(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEmpleadoEnfer(false);
						
			if(empleadoenferSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EmpleadoEnferJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoEnfer();
			}
			
			this.actualizarVisualTableDatosEmpleadoEnfer();
			
			this.jTableDatosEmpleadoEnfer.setRowSelectionInterval(this.getIndiceNuevoEmpleadoEnfer(), this.getIndiceNuevoEmpleadoEnfer());
			
			this.seleccionarFilaTablaEmpleadoEnferActual();
						
			this.actualizarEstadoCeldasBotonesEmpleadoEnfer("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEmpleadoEnfer(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEmpleadoEnfer.jTextAreadescripcionEmpleadoEnfer.setEnabled(isHabilitar && this.empleadoenferConstantesFunciones.activardescripcionEmpleadoEnfer);	
		//
		this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empresaEmpleadoEnfer.setEnabled(isHabilitar && this.empleadoenferConstantesFunciones.activarid_empresaEmpleadoEnfer);
		this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empleadoEmpleadoEnfer.setEnabled(isHabilitar && this.empleadoenferConstantesFunciones.activarid_empleadoEmpleadoEnfer);
		this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_enfermedadEmpleadoEnfer.setEnabled(isHabilitar && this.empleadoenferConstantesFunciones.activarid_enfermedadEmpleadoEnfer);
	};
	
	public void setDefaultControlesEmpleadoEnfer() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEmpleadoEnfer(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.empleadoenferSessionBean.setConGuardarRelaciones(true);			
			this.empleadoenferSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEmpleadoEnfer.jTabbedPaneRelacionesEmpleadoEnfer.setVisible(true);
			
					
		} else {
			//this.empleadoenferSessionBean.setConGuardarRelaciones(false);			
			this.empleadoenferSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEmpleadoEnfer.jTabbedPaneRelacionesEmpleadoEnfer.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEmpleadoEnfer() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoEnfer empleadoenferAux:this.empleadoenferLogic.getEmpleadoEnfers()) {
				if(empleadoenferAux.getId().equals(this.iIdNuevoEmpleadoEnfer)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoEnfer empleadoenferAux:this.empleadoenfers) {
				if(empleadoenferAux.getId().equals(this.iIdNuevoEmpleadoEnfer)) {
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
	
	public int getIndiceActualEmpleadoEnfer(EmpleadoEnfer empleadoenfer,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoEnfer empleadoenferAux:this.empleadoenferLogic.getEmpleadoEnfers()) {
				if(empleadoenferAux.getId().equals(empleadoenfer.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoEnfer empleadoenferAux:this.empleadoenfers) {
				if(empleadoenferAux.getId().equals(empleadoenfer.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEmpleadoEnfer(EmpleadoEnfer empleadoenferOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoEnfer empleadoenferAux:this.empleadoenferLogic.getEmpleadoEnfers()) {
				if(empleadoenferAux.getEmpleadoEnferOriginal().getId().equals(empleadoenferOriginal.getId())) {
					existe=true;
					empleadoenferOriginal.setId(empleadoenferAux.getId());
					empleadoenferOriginal.setVersionRow(empleadoenferAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoEnfer empleadoenferAux:this.empleadoenfers) {
				if(empleadoenferAux.getEmpleadoEnferOriginal().getId().equals(empleadoenferOriginal.getId())) {
					existe=true;
					empleadoenferOriginal.setId(empleadoenferAux.getId());
					empleadoenferOriginal.setVersionRow(empleadoenferAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEmpleadoEnfer(Boolean esParaCancelar) throws Exception {
		empleadoenfersAux=new ArrayList<EmpleadoEnfer>();
		empleadoenferAux=new EmpleadoEnfer();
		
		if(!this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EmpleadoEnfer empleadoenferAux:this.empleadoenferLogic.getEmpleadoEnfers()) {
					if(empleadoenferAux.getId()<0) {
						empleadoenfersAux.add(empleadoenferAux);
					}		
				}
				this.iIdNuevoEmpleadoEnfer=0L;
				this.empleadoenferLogic.getEmpleadoEnfers().removeAll(empleadoenfersAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoEnfer empleadoenferAux:this.empleadoenfers) {
					if(empleadoenferAux.getId()<0) {
						empleadoenfersAux.add(empleadoenferAux);
					}		
				}
				this.iIdNuevoEmpleadoEnfer=0L;
				this.empleadoenfers.removeAll(empleadoenfersAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEmpleadoEnfer 
					&& this.empleadoenferLogic.getEmpleadoEnfers().size()>0
					) {
					empleadoenferAux=this.empleadoenferLogic.getEmpleadoEnfers().get(this.empleadoenferLogic.getEmpleadoEnfers().size() - 1);
				
					if(empleadoenferAux.getId()<0) {
						this.empleadoenferLogic.getEmpleadoEnfers().remove(empleadoenferAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEmpleadoEnfer && this.empleadoenfers.size()>0) {
					empleadoenferAux=this.empleadoenfers.get(this.empleadoenfers.size() - 1);
				
					if(empleadoenferAux.getId()<0) {
						this.empleadoenfers.remove(empleadoenferAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEmpleadoEnfer(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(empleadoenfer.getId()<0) {
				this.empleadoenferLogic.getEmpleadoEnfers().remove(this.empleadoenfer);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(empleadoenfer.getId()<0) {
				this.empleadoenfers.remove(this.empleadoenfer);
			}
		}			
	}
	
	public void setEstadosInicialesEmpleadoEnfer(List<EmpleadoEnfer> empleadoenfersAux) throws Exception {
		EmpleadoEnferConstantesFunciones.setEstadosInicialesEmpleadoEnfer(empleadoenfersAux);
	}
	
	public void setEstadosInicialesEmpleadoEnfer(EmpleadoEnfer empleadoenferAux) throws Exception {
		EmpleadoEnferConstantesFunciones.setEstadosInicialesEmpleadoEnfer(empleadoenferAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEmpleadoEnferActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEmpleadoEnfer("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEmpleadoEnferActual()) {
				if(!this.isEsNuevoEmpleadoEnfer) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEmpleadoEnfer("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEmpleadoEnfer=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEmpleadoEnferActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Empleado Enfer ?", "MANTENIMIENTO DE Empleado Enfer", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEmpleadoEnfer("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EmpleadoEnfer empleadoenfer) throws Exception {
		EmpleadoEnferConstantesFunciones.seleccionarAsignar(this.empleadoenfer,empleadoenfer);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEmpleadoEnfer=this.isPermisoActualizarOriginalEmpleadoEnfer;
			
			
			this.seleccionarAsignar(empleadoenfer);
			
			

			idEmpleadoActual=empleadoenfer.getid_empleado();
			this.seleccionarEmpleadoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmpleadoEnferConstantesFunciones.quitarEspaciosEmpleadoEnfer(this.empleadoenfer,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEmpleadoEnfer("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.empleadoenferSessionBean.setsFuncionBusquedaRapida(this.empleadoenferSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoEmpleadoEnfer) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEmpleadoEnfer(esParaCancelar);				
				this.cancelarNuevoEmpleadoEnfer(esParaCancelar);								
			}
			
			this.empleadoenfer=new EmpleadoEnfer();
			
			this.inicializarEmpleadoEnfer();
			
			this.actualizarEstadoCeldasBotonesEmpleadoEnfer("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEmpleadoEnfer() throws Exception {
		try {
			EmpleadoEnferConstantesFunciones.inicializarEmpleadoEnfer(this.empleadoenfer);
			
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
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.empleadoenferLogic.getEmpleadoEnfers().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEmpleadoEnfers(String sAccionBusqueda,List<EmpleadoEnfer> empleadoenfersParaReportes) throws Exception {
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
					sPathReporteFinal="EmpleadoEnfer"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EmpleadoEnferMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EmpleadoEnferMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EmpleadoEnfer"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Empleado Enferes");		
		parameters.put("busquedapor", EmpleadoEnferConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEmpleadoEnfer=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EmpleadoEnferConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EmpleadoEnferConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEmpleadoEnfer=new JRBeanArrayDataSource(EmpleadoEnferJInternalFrame.TraerEmpleadoEnferBeans(empleadoenfersParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEmpleadoEnfer);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EmpleadoEnferConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EmpleadoEnferConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EmpleadoEnferBean.TraerEmpleadoEnferBeans(empleadoenfersParaReportes).toArray()));
							
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
				this.generarExcelReporteEmpleadoEnfers(sAccionBusqueda,sTipoArchivoReporte,empleadoenfersParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEmpleadoEnfers(sAccionBusqueda,sTipoArchivoReporte,empleadoenfersParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEmpleadoEnferActionPerformed(null);
					//this.generarExcelReporteEmpleadoEnfers(sAccionBusqueda,sTipoArchivoReporte,empleadoenfersParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEmpleadoEnfers(sAccionBusqueda,sTipoArchivoReporte,empleadoenfersParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEmpleadoEnfers(sAccionBusqueda,sTipoArchivoReporte,empleadoenfersParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEmpleadoEnfers(sAccionBusqueda,sTipoArchivoReporte,empleadoenfersParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEmpleadoEnfers(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoEnfer> empleadoenfersParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoenfer";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoEnfers");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmpleadoEnfer("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EmpleadoEnfer empleadoenfer : empleadoenfersParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EmpleadoEnferConstantesFunciones.generarExcelReporteDataEmpleadoEnfer("NORMAL",row,workbook,empleadoenfer,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoenferSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Enfer",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEmpleadoEnfer(String sTipo,Row row,Workbook workbook) {
		
		EmpleadoEnferConstantesFunciones.generarExcelReporteHeaderEmpleadoEnfer(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEmpleadoEnfers(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoEnfer> empleadoenfersParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoenfer_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoEnfers");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EmpleadoEnfer empleadoenfer : empleadoenfersParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EmpleadoEnferConstantesFunciones.getEmpleadoEnferDescripcion(empleadoenfer));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoEnferConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoEnferConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoenfer.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoEnferConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoEnferConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoenfer.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoEnferConstantesFunciones.LABEL_IDENFERMEDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoEnferConstantesFunciones.LABEL_IDENFERMEDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoenfer.getenfermedad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoEnferConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoEnferConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoenfer.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoenferSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Enfer",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEmpleadoEnfers(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoEnfer> empleadoenfersParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EmpleadoEnfer> empleadoenfersRespaldo=null;
		
		classes=EmpleadoEnferConstantesFunciones.getClassesRelationshipsOfEmpleadoEnfer(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.empleadoenferLogic.setDatosCliente(this.datosCliente);
		this.empleadoenferLogic.setDatosDeep(this.datosDeep);
		this.empleadoenferLogic.setIsConDeep(true);
		
		empleadoenfersRespaldo=this.empleadoenferLogic.getEmpleadoEnfers();
		
		this.empleadoenferLogic.setEmpleadoEnfers(empleadoenfersParaReportes);	
		this.empleadoenferLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		empleadoenfersParaReportes=this.empleadoenferLogic.getEmpleadoEnfers();
		this.empleadoenferLogic.setEmpleadoEnfers(empleadoenfersRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoenfer_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoEnfers");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmpleadoEnfer("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EmpleadoEnfer empleadoenfer : empleadoenfersParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEmpleadoEnfer("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EmpleadoEnferConstantesFunciones.generarExcelReporteDataEmpleadoEnfer("NORMAL",row,workbook,empleadoenfer,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EmpleadoEnferConstantesFunciones.getEmpleadoEnferDescripcion(empleadoenfer));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoenferSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Enfer",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEmpleadoEnfer() throws Exception {		
		this.startProcessEmpleadoEnfer(true);
	}
	
	public void startProcessEmpleadoEnfer(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEmpleadoEnfer ,this.jPanelParametrosReportesEmpleadoEnfer, this.jScrollPanelDatosEmpleadoEnfer,this.jPanelPaginacionEmpleadoEnfer, this.jScrollPanelDatosEdicionEmpleadoEnfer, this.jPanelAccionesEmpleadoEnfer,this.jPanelAccionesFormularioEmpleadoEnfer,this.jmenuBarEmpleadoEnfer,this.jmenuBarDetalleEmpleadoEnfer,this.jTtoolBarEmpleadoEnfer,this.jTtoolBarDetalleEmpleadoEnfer);		
		
		final JTabbedPane jTabbedPaneBusquedasEmpleadoEnfer=this.jTabbedPaneBusquedasEmpleadoEnfer; 
		
		final JPanel jPanelParametrosReportesEmpleadoEnfer=this.jPanelParametrosReportesEmpleadoEnfer;
		//final JScrollPane jScrollPanelDatosEmpleadoEnfer=this.jScrollPanelDatosEmpleadoEnfer;
		final JTable jTableDatosEmpleadoEnfer=this.jTableDatosEmpleadoEnfer;		
		final JPanel jPanelPaginacionEmpleadoEnfer=this.jPanelPaginacionEmpleadoEnfer;
		//final JScrollPane jScrollPanelDatosEdicionEmpleadoEnfer=this.jScrollPanelDatosEdicionEmpleadoEnfer;
		final JPanel jPanelAccionesEmpleadoEnfer=this.jPanelAccionesEmpleadoEnfer;
		
		JPanel jPanelCamposAuxiliarEmpleadoEnfer=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEmpleadoEnfer=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
			jPanelCamposAuxiliarEmpleadoEnfer=this.jInternalFrameDetalleFormEmpleadoEnfer.jPanelCamposEmpleadoEnfer;
			jPanelAccionesFormularioAuxiliarEmpleadoEnfer=this.jInternalFrameDetalleFormEmpleadoEnfer.jPanelAccionesFormularioEmpleadoEnfer;
		}
		
		final JPanel jPanelCamposEmpleadoEnfer=jPanelCamposAuxiliarEmpleadoEnfer;
		final JPanel jPanelAccionesFormularioEmpleadoEnfer=jPanelAccionesFormularioAuxiliarEmpleadoEnfer;
		
		
		final JMenuBar jmenuBarEmpleadoEnfer=this.jmenuBarEmpleadoEnfer;
		final JToolBar jTtoolBarEmpleadoEnfer=this.jTtoolBarEmpleadoEnfer;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEmpleadoEnfer=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmpleadoEnfer=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
			jmenuBarDetalleAuxiliarEmpleadoEnfer=this.jInternalFrameDetalleFormEmpleadoEnfer.jmenuBarDetalleEmpleadoEnfer;
			jTtoolBarDetalleAuxiliarEmpleadoEnfer=this.jInternalFrameDetalleFormEmpleadoEnfer.jTtoolBarDetalleEmpleadoEnfer;
		}
		
		final JMenuBar jmenuBarDetalleEmpleadoEnfer=jmenuBarDetalleAuxiliarEmpleadoEnfer;
		final JToolBar jTtoolBarDetalleEmpleadoEnfer=jTtoolBarDetalleAuxiliarEmpleadoEnfer;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmpleadoEnfer;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmpleadoEnfer;
			processRunnable.jTableDatos=jTableDatosEmpleadoEnfer;
			processRunnable.jPanelCampos=jPanelCamposEmpleadoEnfer;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmpleadoEnfer;
			processRunnable.jPanelAcciones=jPanelAccionesEmpleadoEnfer;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmpleadoEnfer;
			
			
			processRunnable.jmenuBar=jmenuBarEmpleadoEnfer;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmpleadoEnfer;
			processRunnable.jTtoolBar=jTtoolBarEmpleadoEnfer;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmpleadoEnfer;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmpleadoEnfer ,jPanelParametrosReportesEmpleadoEnfer,jTableDatosEmpleadoEnfer, /*jScrollPanelDatosEmpleadoEnfer,*/jPanelCamposEmpleadoEnfer,jPanelPaginacionEmpleadoEnfer, /*jScrollPanelDatosEdicionEmpleadoEnfer,*/ jPanelAccionesEmpleadoEnfer,jPanelAccionesFormularioEmpleadoEnfer,jmenuBarEmpleadoEnfer,jmenuBarDetalleEmpleadoEnfer,jTtoolBarEmpleadoEnfer,jTtoolBarDetalleEmpleadoEnfer);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmpleadoEnfer ,jPanelParametrosReportesEmpleadoEnfer, jScrollPanelDatosEmpleadoEnfer,jPanelPaginacionEmpleadoEnfer, jScrollPanelDatosEdicionEmpleadoEnfer, jPanelAccionesEmpleadoEnfer,jPanelAccionesFormularioEmpleadoEnfer,jmenuBarEmpleadoEnfer,jmenuBarDetalleEmpleadoEnfer,jTtoolBarEmpleadoEnfer,jTtoolBarDetalleEmpleadoEnfer);
						
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
	
	public void finishProcessEmpleadoEnfer() {// throws Exception 
		this.finishProcessEmpleadoEnfer(true);
	}
	
	public void finishProcessEmpleadoEnfer(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEmpleadoEnfer ,this.jPanelParametrosReportesEmpleadoEnfer, this.jScrollPanelDatosEmpleadoEnfer,this.jPanelPaginacionEmpleadoEnfer, this.jScrollPanelDatosEdicionEmpleadoEnfer, this.jPanelAccionesEmpleadoEnfer,this.jPanelAccionesFormularioEmpleadoEnfer,this.jmenuBarEmpleadoEnfer,this.jmenuBarDetalleEmpleadoEnfer,this.jTtoolBarEmpleadoEnfer,this.jTtoolBarDetalleEmpleadoEnfer);		
		
		final JTabbedPane jTabbedPaneBusquedasEmpleadoEnfer=this.jTabbedPaneBusquedasEmpleadoEnfer; 
		
		final JPanel jPanelParametrosReportesEmpleadoEnfer=this.jPanelParametrosReportesEmpleadoEnfer;
		//final JScrollPane jScrollPanelDatosEmpleadoEnfer=this.jScrollPanelDatosEmpleadoEnfer;
		final JTable jTableDatosEmpleadoEnfer=this.jTableDatosEmpleadoEnfer;		
		final JPanel jPanelPaginacionEmpleadoEnfer=this.jPanelPaginacionEmpleadoEnfer;
		//final JScrollPane jScrollPanelDatosEdicionEmpleadoEnfer=this.jScrollPanelDatosEdicionEmpleadoEnfer;
		final JPanel jPanelAccionesEmpleadoEnfer=this.jPanelAccionesEmpleadoEnfer;
		
		JPanel jPanelCamposAuxiliarEmpleadoEnfer=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEmpleadoEnfer=new JPanel();
		
		if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
			jPanelCamposAuxiliarEmpleadoEnfer=this.jInternalFrameDetalleFormEmpleadoEnfer.jPanelCamposEmpleadoEnfer;
			jPanelAccionesFormularioAuxiliarEmpleadoEnfer=this.jInternalFrameDetalleFormEmpleadoEnfer.jPanelAccionesFormularioEmpleadoEnfer;
		}
		
		final JPanel jPanelCamposEmpleadoEnfer=jPanelCamposAuxiliarEmpleadoEnfer;
		final JPanel jPanelAccionesFormularioEmpleadoEnfer=jPanelAccionesFormularioAuxiliarEmpleadoEnfer;
		
		
		final JMenuBar jmenuBarEmpleadoEnfer=this.jmenuBarEmpleadoEnfer;		
		final JToolBar jTtoolBarEmpleadoEnfer=this.jTtoolBarEmpleadoEnfer;
				
		JMenuBar jmenuBarDetalleAuxiliarEmpleadoEnfer=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmpleadoEnfer=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
			jmenuBarDetalleAuxiliarEmpleadoEnfer=this.jInternalFrameDetalleFormEmpleadoEnfer.jmenuBarDetalleEmpleadoEnfer;
			jTtoolBarDetalleAuxiliarEmpleadoEnfer=this.jInternalFrameDetalleFormEmpleadoEnfer.jTtoolBarDetalleEmpleadoEnfer;		
		}
		
		final JMenuBar jmenuBarDetalleEmpleadoEnfer=jmenuBarDetalleAuxiliarEmpleadoEnfer;
		final JToolBar jTtoolBarDetalleEmpleadoEnfer=jTtoolBarDetalleAuxiliarEmpleadoEnfer;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmpleadoEnfer;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmpleadoEnfer;
			processRunnable.jTableDatos=jTableDatosEmpleadoEnfer;
			processRunnable.jPanelCampos=jPanelCamposEmpleadoEnfer;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmpleadoEnfer;
			processRunnable.jPanelAcciones=jPanelAccionesEmpleadoEnfer;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmpleadoEnfer;
			
			
			processRunnable.jmenuBar=jmenuBarEmpleadoEnfer;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmpleadoEnfer;
			processRunnable.jTtoolBar=jTtoolBarEmpleadoEnfer;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmpleadoEnfer;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEmpleadoEnfer ,jPanelParametrosReportesEmpleadoEnfer, jTableDatosEmpleadoEnfer,/*jScrollPanelDatosEmpleadoEnfer,*/jPanelCamposEmpleadoEnfer,jPanelPaginacionEmpleadoEnfer, /*jScrollPanelDatosEdicionEmpleadoEnfer,*/ jPanelAccionesEmpleadoEnfer,jPanelAccionesFormularioEmpleadoEnfer,jmenuBarEmpleadoEnfer,jmenuBarDetalleEmpleadoEnfer,jTtoolBarEmpleadoEnfer,jTtoolBarDetalleEmpleadoEnfer));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEmpleadoEnfer(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEmpleadoEnfer(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEmpleadoEnfer(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEmpleadoEnfer(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEmpleadoEnfer,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEmpleadoEnfer,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEmpleadoEnfer(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEmpleadoEnfer,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEmpleadoEnfer,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.empleadoenferConstantesFunciones.getsFinalQueryEmpleadoEnfer();
		String  finalQueryPaginacionTodos=this.empleadoenferConstantesFunciones.getsFinalQueryEmpleadoEnfer();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EmpleadoEnferConstantesFunciones.getArrayColumnasGlobalesNoEmpleadoEnfer(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EmpleadoEnferConstantesFunciones.getArrayColumnasGlobalesEmpleadoEnfer(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EmpleadoEnferConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.empleadoenfersEliminados= new ArrayList<EmpleadoEnfer>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEmpleadoEnfer();
		
				///*EmpleadoEnferSessionBean*/this.empleadoenferSessionBean=new EmpleadoEnferSessionBean();
			
			if(this.empleadoenferSessionBean==null) {
				this.empleadoenferSessionBean=new EmpleadoEnferSessionBean();
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
					this.iNumeroPaginacion=EmpleadoEnferConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EmpleadoEnferConstantesFunciones.getClassesForeignKeysOfEmpleadoEnfer(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/empleadoenfer."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			empleadoenfersAux= new ArrayList<EmpleadoEnfer>();
			
				
			empleadoenferLogic.setDatosCliente(this.datosCliente);
			empleadoenferLogic.setDatosDeep(this.datosDeep);
			empleadoenferLogic.setIsConDeep(true);
			
			
			empleadoenferLogic.getEmpleadoEnferDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					empleadoenferLogic.getTodosEmpleadoEnfers(finalQueryGlobal,pagination);
					
					//empleadoenferLogic.getTodosEmpleadoEnfersWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(empleadoenferLogic.getEmpleadoEnfers()==null|| empleadoenferLogic.getEmpleadoEnfers().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadoenfersAux= new ArrayList<EmpleadoEnfer>();
							empleadoenfersAux.addAll(empleadoenferLogic.getEmpleadoEnfers());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoenfersAux= new ArrayList<EmpleadoEnfer>();
							empleadoenfersAux.addAll(empleadoenfers);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadoenferLogic.getTodosEmpleadoEnfers(finalQueryGlobal+"",this.pagination);												
							
							//empleadoenferLogic.getTodosEmpleadoEnfersWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEmpleadoEnfers("Todos",empleadoenferLogic.getEmpleadoEnfers() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadoenferLogic.setEmpleadoEnfers(new ArrayList<EmpleadoEnfer>());					
							empleadoenferLogic.getEmpleadoEnfers().addAll(empleadoenfersAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoenfers=new ArrayList<EmpleadoEnfer>();
							empleadoenfers.addAll(empleadoenfersAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEmpleadoEnfer=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEmpleadoEnfer=this.idActual;
				
				} else if(this.idEmpleadoEnferActual!=null && this.idEmpleadoEnferActual!=0L) {
					idEmpleadoEnfer=idEmpleadoEnferActual;
				}
				
					
				this.sDetalleReporte=EmpleadoEnferConstantesFunciones.getDetalleIndicePorId(idEmpleadoEnfer);
				
				this.empleadoenfers=new ArrayList<EmpleadoEnfer>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					empleadoenferLogic.getEntity(idEmpleadoEnfer);
					
					//empleadoenferLogic.getEntityWithConnection(idEmpleadoEnfer);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoenferLogic.setEmpleadoEnfers(new ArrayList<EmpleadoEnfer>());
					empleadoenferLogic.getEmpleadoEnfers().add(empleadoenferLogic.getEmpleadoEnfer());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoenfers=new ArrayList<EmpleadoEnfer>();
					this.empleadoenfers.add(empleadoenfer);
				}
				
				if(empleadoenferLogic.getEmpleadoEnfer()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=EmpleadoEnferConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadoenferLogic.getEmpleadoEnfersFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoEnferConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoEnferConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadoenferLogic.getEmpleadoEnfers()==null||empleadoenferLogic.getEmpleadoEnfers().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadoenfers==null|| empleadoenfers.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoenfersAux=new ArrayList<EmpleadoEnfer>();
						empleadoenfersAux.addAll(empleadoenferLogic.getEmpleadoEnfers());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoenfersAux=new ArrayList<EmpleadoEnfer>();
							empleadoenfersAux.addAll(empleadoenfers);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadoenferLogic.getEmpleadoEnfersFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoEnferConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoEnferConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoEnfers("FK_IdEmpleado",empleadoenferLogic.getEmpleadoEnfers());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoEnfers("FK_IdEmpleado",empleadoenfers);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoenferLogic.setEmpleadoEnfers(new ArrayList<EmpleadoEnfer>());
						empleadoenferLogic.getEmpleadoEnfers().addAll(empleadoenfersAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoenfers=new ArrayList<EmpleadoEnfer>();
							empleadoenfers.addAll(empleadoenfersAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=EmpleadoEnferConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadoenferLogic.getEmpleadoEnfersFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoEnferConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoEnferConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadoenferLogic.getEmpleadoEnfers()==null||empleadoenferLogic.getEmpleadoEnfers().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadoenfers==null|| empleadoenfers.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoenfersAux=new ArrayList<EmpleadoEnfer>();
						empleadoenfersAux.addAll(empleadoenferLogic.getEmpleadoEnfers());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoenfersAux=new ArrayList<EmpleadoEnfer>();
							empleadoenfersAux.addAll(empleadoenfers);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadoenferLogic.getEmpleadoEnfersFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoEnferConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoEnferConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoEnfers("FK_IdEmpresa",empleadoenferLogic.getEmpleadoEnfers());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoEnfers("FK_IdEmpresa",empleadoenfers);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoenferLogic.setEmpleadoEnfers(new ArrayList<EmpleadoEnfer>());
						empleadoenferLogic.getEmpleadoEnfers().addAll(empleadoenfersAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoenfers=new ArrayList<EmpleadoEnfer>();
							empleadoenfers.addAll(empleadoenfersAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEnfermedad")) {
				this.sDetalleReporte=EmpleadoEnferConstantesFunciones.getDetalleIndiceFK_IdEnfermedad(id_enfermedadFK_IdEnfermedad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadoenferLogic.getEmpleadoEnfersFK_IdEnfermedad(finalQueryGlobal,pagination,id_enfermedadFK_IdEnfermedad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoEnferConstantesFunciones.getDetalleIndiceFK_IdEnfermedad(id_enfermedadFK_IdEnfermedad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoEnferConstantesFunciones.getDetalleIndiceFK_IdEnfermedad(id_enfermedadFK_IdEnfermedad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadoenferLogic.getEmpleadoEnfers()==null||empleadoenferLogic.getEmpleadoEnfers().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadoenfers==null|| empleadoenfers.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoenfersAux=new ArrayList<EmpleadoEnfer>();
						empleadoenfersAux.addAll(empleadoenferLogic.getEmpleadoEnfers());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoenfersAux=new ArrayList<EmpleadoEnfer>();
							empleadoenfersAux.addAll(empleadoenfers);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadoenferLogic.getEmpleadoEnfersFK_IdEnfermedad(finalQueryGlobal,pagination,id_enfermedadFK_IdEnfermedad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoEnferConstantesFunciones.getDetalleIndiceFK_IdEnfermedad(id_enfermedadFK_IdEnfermedad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoEnferConstantesFunciones.getDetalleIndiceFK_IdEnfermedad(id_enfermedadFK_IdEnfermedad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoEnfers("FK_IdEnfermedad",empleadoenferLogic.getEmpleadoEnfers());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoEnfers("FK_IdEnfermedad",empleadoenfers);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoenferLogic.setEmpleadoEnfers(new ArrayList<EmpleadoEnfer>());
						empleadoenferLogic.getEmpleadoEnfers().addAll(empleadoenfersAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoenfers=new ArrayList<EmpleadoEnfer>();
							empleadoenfers.addAll(empleadoenfersAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEmpleadoEnfer();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEmpleadoEnfer();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=empleadoenferLogic.getEmpleadoEnfers().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadoenfers.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=empleadoenferLogic.getEmpleadoEnfers().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadoenfers.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EmpleadoEnfer empleadoenfer) {
		Boolean permite=true;
		
		if(this.empleadoenfer.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EmpleadoEnferConstantesFunciones.getOrderByListaEmpleadoEnfer();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EmpleadoEnferConstantesFunciones.getOrderByListaEmpleadoEnfer();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoEnfer empleadoenfer:empleadoenferLogic.getEmpleadoEnfers()) {
				if(empleadoenfer.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoenferTotales=empleadoenfer;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoEnfer empleadoenfer:this.empleadoenfers) {
				if(empleadoenfer.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoenferTotales=empleadoenfer;
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
			this.empleadoenferAux=new EmpleadoEnfer();
			this.empleadoenferAux.setsType(Constantes2.S_TOTALES);
			this.empleadoenferAux.setIsNew(false);
			this.empleadoenferAux.setIsChanged(false);
			this.empleadoenferAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EmpleadoEnferConstantesFunciones.TotalizarValoresFilaEmpleadoEnfer(this.empleadoenferLogic.getEmpleadoEnfers(),this.empleadoenferAux);
				
				this.empleadoenferLogic.getEmpleadoEnfers().add(this.empleadoenferAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EmpleadoEnferConstantesFunciones.TotalizarValoresFilaEmpleadoEnfer(this.empleadoenfers,this.empleadoenferAux);
				
				this.empleadoenfers.add(this.empleadoenferAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		empleadoenferTotales=new EmpleadoEnfer();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.empleadoenferLogic.getEmpleadoEnfers().remove(empleadoenferTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.empleadoenfers.remove(empleadoenferTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		empleadoenferTotales=new EmpleadoEnfer();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoEnfer empleadoenfer:empleadoenferLogic.getEmpleadoEnfers()) {
				if(empleadoenfer.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoenferTotales=empleadoenfer;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmpleadoEnferConstantesFunciones.TotalizarValoresFilaEmpleadoEnfer(this.empleadoenferLogic.getEmpleadoEnfers(),empleadoenferTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoEnfer empleadoenfer:this.empleadoenfers) {
				if(empleadoenfer.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoenferTotales=empleadoenfer;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmpleadoEnferConstantesFunciones.TotalizarValoresFilaEmpleadoEnfer(this.empleadoenfers,empleadoenferTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEmpleadoEnfersFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoEnfersFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoEnfersFK_IdEnfermedad()throws Exception {
		try {
			sAccionBusqueda="FK_IdEnfermedad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEmpleadoEnfersFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoenferLogic.getEmpleadoEnfersFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoEnfersFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoenferLogic.getEmpleadoEnfersFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoEnfersFK_IdEnfermedad(String sFinalQuery,Long id_enfermedad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoenferLogic.getEmpleadoEnfersFK_IdEnfermedad(sFinalQuery,this.pagination,id_enfermedad);
				
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
	
	public void inicializarPermisosEmpleadoEnfer() {
		this.isPermisoTodoEmpleadoEnfer=false;
		this.isPermisoNuevoEmpleadoEnfer=false;
		this.isPermisoActualizarEmpleadoEnfer=false;
		this.isPermisoActualizarOriginalEmpleadoEnfer=false;
		this.isPermisoEliminarEmpleadoEnfer=false;
		this.isPermisoGuardarCambiosEmpleadoEnfer=false;
		this.isPermisoConsultaEmpleadoEnfer=false;
		this.isPermisoBusquedaEmpleadoEnfer=false;
		this.isPermisoReporteEmpleadoEnfer=false;		
		this.isPermisoOrdenEmpleadoEnfer=false;		
		this.isPermisoPaginacionMedioEmpleadoEnfer=false;		
		this.isPermisoPaginacionAltoEmpleadoEnfer=false;
		this.isPermisoPaginacionTodoEmpleadoEnfer=false;
		this.isPermisoCopiarEmpleadoEnfer=false;		
		this.isPermisoVerFormEmpleadoEnfer=false;		
		this.isPermisoDuplicarEmpleadoEnfer=false;		
		this.isPermisoOrdenEmpleadoEnfer=false;		
	}
	
	public void setPermisosUsuarioEmpleadoEnfer(Boolean isPermiso) {
		this.isPermisoTodoEmpleadoEnfer=isPermiso;
		this.isPermisoNuevoEmpleadoEnfer=isPermiso;
		this.isPermisoActualizarEmpleadoEnfer=isPermiso;
		this.isPermisoActualizarOriginalEmpleadoEnfer=isPermiso;
		this.isPermisoEliminarEmpleadoEnfer=isPermiso;
		this.isPermisoGuardarCambiosEmpleadoEnfer=isPermiso;
		this.isPermisoConsultaEmpleadoEnfer=isPermiso;
		this.isPermisoBusquedaEmpleadoEnfer=isPermiso;
		this.isPermisoReporteEmpleadoEnfer=isPermiso;
		this.isPermisoOrdenEmpleadoEnfer=isPermiso;		
		this.isPermisoPaginacionMedioEmpleadoEnfer=isPermiso;		
		this.isPermisoPaginacionAltoEmpleadoEnfer=isPermiso;		
		this.isPermisoPaginacionTodoEmpleadoEnfer=isPermiso;		
		this.isPermisoCopiarEmpleadoEnfer=isPermiso;		
		this.isPermisoVerFormEmpleadoEnfer=isPermiso;		
		this.isPermisoDuplicarEmpleadoEnfer=isPermiso;
		this.isPermisoOrdenEmpleadoEnfer=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEmpleadoEnfer(Boolean isPermiso) {
		//this.isPermisoTodoEmpleadoEnfer=isPermiso;
		this.isPermisoNuevoEmpleadoEnfer=isPermiso;
		this.isPermisoActualizarEmpleadoEnfer=isPermiso;
		this.isPermisoActualizarOriginalEmpleadoEnfer=isPermiso;
		this.isPermisoEliminarEmpleadoEnfer=isPermiso;
		this.isPermisoGuardarCambiosEmpleadoEnfer=isPermiso;
		//this.isPermisoConsultaEmpleadoEnfer=isPermiso;
		//this.isPermisoBusquedaEmpleadoEnfer=isPermiso;
		//this.isPermisoReporteEmpleadoEnfer=isPermiso;
		//this.isPermisoOrdenEmpleadoEnfer=isPermiso;		
		//this.isPermisoPaginacionMedioEmpleadoEnfer=isPermiso;		
		//this.isPermisoPaginacionAltoEmpleadoEnfer=isPermiso;		
		//this.isPermisoPaginacionTodoEmpleadoEnfer=isPermiso;		
		//this.isPermisoCopiarEmpleadoEnfer=isPermiso;		
		//this.isPermisoDuplicarEmpleadoEnfer=isPermiso;
		//this.isPermisoOrdenEmpleadoEnfer=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEmpleadoEnferClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EmpleadoEnferJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebEmpleadoEnfer(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEmpleadoEnferClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEmpleadoEnferClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEmpleadoEnferClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEmpleadoEnferClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEmpleadoEnfer() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EmpleadoEnferJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EmpleadoEnferConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEmpleadoEnfer=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEmpleadoEnfer=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEmpleadoEnfer=this.isPermisoActualizarEmpleadoEnfer;
			this.isPermisoEliminarEmpleadoEnfer=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEmpleadoEnfer=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEmpleadoEnfer=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEmpleadoEnfer=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEmpleadoEnfer=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEmpleadoEnfer=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmpleadoEnfer=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEmpleadoEnfer=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEmpleadoEnfer=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEmpleadoEnfer=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEmpleadoEnfer=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEmpleadoEnfer=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEmpleadoEnfer=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmpleadoEnfer=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEmpleadoEnfer.setToolTipText(this.jTableDatosEmpleadoEnfer.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEmpleadoEnfer(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEmpleadoEnfer(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EmpleadoEnferJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EmpleadoEnferJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEmpleadoEnfer() throws Exception {
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
	public void inicializarCombosForeignKeyEmpleadoEnferListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.enfermedadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEmpleadoEnferListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EmpleadoEnferJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEmpleadoEnferListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEnfermedadListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEnfermedadListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.enfermedadsForeignKey==null||this.enfermedadsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EnfermedadConstantesFunciones.getArrayColumnasGlobalesEnfermedad(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EnfermedadConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EnfermedadConstantesFunciones.SFINALQUERY;

				this.cargarCombosEnfermedadsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyEmpleadoEnferListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			EmpleadoEnferParameterReturnGeneral empleadoenferReturnGeneral=new EmpleadoEnferParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.empleadoenferConstantesFunciones.cargarid_empresaEmpleadoEnfer)
					 || (this.esRecargarFks && this.empleadoenferConstantesFunciones.cargarid_empresaEmpleadoEnfer)) {

					if(!this.empleadoenferSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+empleadoenferSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.empleadoenferConstantesFunciones.cargarid_empleadoEmpleadoEnfer)
					 || (this.esRecargarFks && this.empleadoenferConstantesFunciones.cargarid_empleadoEmpleadoEnfer)) {

					if(!this.empleadoenferSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+empleadoenferSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalEnfermedad="";

				if(((this.enfermedadsForeignKey==null||this.enfermedadsForeignKey.size()<=0) && this.empleadoenferConstantesFunciones.cargarid_enfermedadEmpleadoEnfer)
					 || (this.esRecargarFks && this.empleadoenferConstantesFunciones.cargarid_enfermedadEmpleadoEnfer)) {

					if(!this.empleadoenferSessionBean.getisBusquedaDesdeForeignKeySesionEnfermedad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EnfermedadConstantesFunciones.getArrayColumnasGlobalesEnfermedad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEnfermedad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EnfermedadConstantesFunciones.TABLENAME);

						finalQueryGlobalEnfermedad=Funciones.GetFinalQueryAppend(finalQueryGlobalEnfermedad, "");
						finalQueryGlobalEnfermedad+=EnfermedadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEnfermedadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEnfermedad=" WHERE " + ConstantesSql.ID + "="+empleadoenferSessionBean.getlidEnfermedadActual();
					}
				} else {
					finalQueryGlobalEnfermedad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				empleadoenferReturnGeneral=empleadoenferLogic.cargarCombosLoteForeignKeyEmpleadoEnfer(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado,finalQueryGlobalEnfermedad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=empleadoenferReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=empleadoenferReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalEnfermedad.equals("NONE")) {
				this.enfermedadsForeignKey=empleadoenferReturnGeneral.getenfermedadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEmpleadoEnfer()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyEnfermedad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.empleadoenferSessionBean==null) {
				this.empleadoenferSessionBean=new EmpleadoEnferSessionBean();
			}

			if(!this.empleadoenferSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.empleadoenferSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyEnfermedad()throws Exception {
		try {

			if(!this.empleadoenferSessionBean.getisBusquedaDesdeForeignKeySesionEnfermedad()) {
				Enfermedad enfermedad=new Enfermedad();
				EnfermedadConstantesFunciones.setEnfermedadDescripcion(enfermedad,Constantes.SMENSAJE_ESCOJA_OPCION);
				enfermedad.setId(null);

				if(!EnfermedadConstantesFunciones.ExisteEnLista(this.enfermedadsForeignKey,enfermedad,true)) {

					this.enfermedadsForeignKey.add(0,enfermedad);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyEmpleadoEnfer()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEmpleadoEnfer(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEmpleadoEnfer()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoEnfer();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEmpleadoEnfer(EmpleadoEnfer empleadoenfer)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(empleadoenfer.getid_empleado(),false,"Formulario");
			this.setActualEnfermedadForeignKey(empleadoenfer.getid_enfermedad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEmpleadoEnfer(EmpleadoEnfer empleadoenfer,String sTipoEvento)throws Exception {	
		try {
			
			

				if(empleadoenfer.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoEmpleadoEnfer")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(empleadoenfer.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEmpleadoEnfer()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.empleadoenferConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualEnfermedadForeignKey(this.empleadoenferConstantesFunciones.getid_enfermedad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoEnfer()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEmpleadoEnfer()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEmpleadoEnfer()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEmpleadoEnfer()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEmpleadoEnfer()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameEnfermedadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEmpleadoEnfer(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEnfermedadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEmpleadoEnfer()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empresaEmpleadoEnfer!=null && this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empresaEmpleadoEnfer.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empresaEmpleadoEnfer.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empleadoEmpleadoEnfer!=null && this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empleadoEmpleadoEnfer.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empleadoEmpleadoEnfer.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_enfermedadEmpleadoEnfer!=null && this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_enfermedadEmpleadoEnfer.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_enfermedadEmpleadoEnfer.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public EmpleadoEnferBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EmpleadoEnferBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EmpleadoEnferBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.empleadoenferSessionBean=new EmpleadoEnferSessionBean(); 
		this.empleadoenferConstantesFunciones=new EmpleadoEnferConstantesFunciones(); 
		this.empleadoenferBean=new EmpleadoEnfer();//(this.empleadoenferConstantesFunciones); 		
		this.empleadoenferReturnGeneral=new EmpleadoEnferParameterReturnGeneral(); 
		
		this.empleadoenferSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadoenferSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EmpleadoEnferBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EmpleadoEnferBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EmpleadoEnferBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEmpleadoEnfer(true);
			
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
			
			this.empleadoenferConstantesFunciones=new EmpleadoEnferConstantesFunciones(); 
			this.empleadoenferBean=new EmpleadoEnfer();//this.empleadoenferConstantesFunciones); 			
			this.empleadoenferReturnGeneral=new EmpleadoEnferParameterReturnGeneral(); 
		
			EmpleadoEnferBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empleado Enfer Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.empleadoenfer=new EmpleadoEnfer();
			this.empleadoenfers = new ArrayList<EmpleadoEnfer>();
			this.empleadoenfersAux = new ArrayList<EmpleadoEnfer>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic=new EmpleadoEnferLogic();
				this.empleadoenferLogic.getNewConnexionToDeep("");
			}
			
			//this.empleadoenferSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.empleadoenferSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEmpleadoEnfer);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEmpleadoEnfer!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmpleadoEnfer);	
					}
					
					if(this.jInternalFrameImportacionEmpleadoEnfer!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmpleadoEnfer);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEmpleadoEnfer!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEmpleadoEnfer);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEmpleadoEnfer);
				this.jInternalFrameDetalleFormEmpleadoEnfer.setVisible(false);
				this.jInternalFrameDetalleFormEmpleadoEnfer.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEmpleadoEnfer!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmpleadoEnfer);
					this.jInternalFrameReporteDinamicoEmpleadoEnfer.setVisible(false);
					this.jInternalFrameReporteDinamicoEmpleadoEnfer.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEmpleadoEnfer!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEmpleadoEnfer);
					this.jInternalFrameImportacionEmpleadoEnfer.setVisible(false);
					this.jInternalFrameImportacionEmpleadoEnfer.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEmpleadoEnfer!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEmpleadoEnfer);
					this.jInternalFrameOrderByEmpleadoEnfer.setVisible(false);
					this.jInternalFrameOrderByEmpleadoEnfer.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEmpleadoEnferActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EmpleadoEnferConstantesFunciones.INUMEROPAGINACION;
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
			
			this.empleadoenferReturnGeneral=new EmpleadoEnferParameterReturnGeneral();
			
			this.empleadoenferParameterGeneral=new EmpleadoEnferParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.empleadoenferLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EmpleadoEnferJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmpleadoEnferConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.empleadoenferSessionBean.getEsGuardarRelacionado(),this.empleadoenferSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmpleadoEnferConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.empleadoenferSessionBean.getEsGuardarRelacionado(),this.empleadoenferSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEmpleadoEnfer=false;
			this.isVisibilidadCeldaDuplicarEmpleadoEnfer=true;
			this.isVisibilidadCeldaCopiarEmpleadoEnfer=true;
			this.isVisibilidadCeldaVerFormEmpleadoEnfer=true;
			this.isVisibilidadCeldaOrdenEmpleadoEnfer=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEnfer=false;
			this.isVisibilidadCeldaModificarEmpleadoEnfer=false;
			this.isVisibilidadCeldaActualizarEmpleadoEnfer=false;
			this.isVisibilidadCeldaEliminarEmpleadoEnfer=false;
			this.isVisibilidadCeldaCancelarEmpleadoEnfer=false;
			this.isVisibilidadCeldaGuardarEmpleadoEnfer=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEnfer=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEnfermedad=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEmpleadoEnfer("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEmpleadoEnfer();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEmpleadoEnfer(false);
			
			this.setPermisosUsuarioEmpleadoEnfer();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadoenferSessionBean.getEsGuardarRelacionado() 
				|| (this.empleadoenferSessionBean.getEsGuardarRelacionado() && this.empleadoenferSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEmpleadoEnferClasesRelacionadas();
			}
			
			if(this.empleadoenferSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEmpleadoEnferClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EmpleadoEnferJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEmpleadoEnfer();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEmpleadoEnfer();
			}
			
			if(!this.isPermisoBusquedaEmpleadoEnfer) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEmpleadoEnfer.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadoenferSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEmpleadoEnfer,this.isPermisoPaginacionMedioEmpleadoEnfer,this.isPermisoPaginacionTodoEmpleadoEnfer);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EmpleadoEnferConstantesFunciones.getTiposSeleccionarEmpleadoEnfer());
				
				this.tiposColumnasSelect=EmpleadoEnferConstantesFunciones.getTiposSeleccionarEmpleadoEnfer(true);
				
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
			//if(!this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEmpleadoEnfer();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioEmpleadoEnfer(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioEmpleadoEnfer(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoEnfer() ;
			
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
			this.enfermedadLogic=new EnfermedadLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				empleadoenferImplementable= (EmpleadoEnferImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmpleadoEnferConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				empleadoenferImplementableHome= (EmpleadoEnferImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmpleadoEnferConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.empleadoenfers= new ArrayList<EmpleadoEnfer>();
			this.empleadoenfersEliminados= new ArrayList<EmpleadoEnfer>();
						
			this.isEsNuevoEmpleadoEnfer=false;
			this.esParaAccionDesdeFormularioEmpleadoEnfer=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idEmpleadoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.enfermedadsForeignKey=new ArrayList<Enfermedad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEmpleadoEnfer(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEmpleadoEnfer();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EmpleadoEnferBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EmpleadoEnferConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEmpleadoEnfer("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEmpleadoEnfer(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEmpleadoEnfer();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEmpleadoEnfer();
			}
			
			EmpleadoEnferBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEmpleadoEnfer.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEmpleadoEnfer.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEmpleadoEnfer.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEmpleadoEnfer(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EmpleadoEnfer: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEmpleadoEnfer() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEmpleadoEnfer")) {
				iIndex=this.jInternalFrameDetalleFormEmpleadoEnfer.jTabbedPaneRelacionesEmpleadoEnfer.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEmpleadoEnfer.jTabbedPaneRelacionesEmpleadoEnfer.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEmpleadoEnfer.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEmpleadoEnfer();	
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
	
	public void cargarCombosForeignKeyEmpleadoEnfer(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEmpleadoEnfer(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEmpleadoEnfer(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEmpleadoEnferListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEmpleadoEnfer();
		
		this.cargarCombosFrameForeignKeyEmpleadoEnfer();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEmpleadoEnfer();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEmpleadoEnfer();
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

	public void cargarCombosForeignKeyEnfermedad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEnfermedadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEnfermedad();
				this.cargarCombosFrameEnfermedadsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEnfermedad(this.enfermedadsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoEmpleadoEnferActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.empleadoenferSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEmpleadoEnfer==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
			
			
			if(jTableDatosEmpleadoEnfer.getRowCount()>=1) {
				jTableDatosEmpleadoEnfer.removeRowSelectionInterval(0, jTableDatosEmpleadoEnfer.getRowCount()-1);						
			}
			
			this.isEsNuevoEmpleadoEnfer=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEmpleadoEnfer(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEmpleadoEnfer(true);			
			//this.empleadoenfer=new EmpleadoEnfer();
			//this.empleadoenfer.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoEnfer(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoEnfer() ;
			
			if(EmpleadoEnferJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoEnfer(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.empleadoenfer);	
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoenfer);				
			
			EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
			
			if(this.empleadoenferSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EmpleadoEnfer: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEmpleadoEnferActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EmpleadoEnfer> empleadoenfersSeleccionados=new ArrayList<EmpleadoEnfer>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEmpleadoEnfer.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEmpleadoEnfer.getSelectedRows().length;			
			}
			
			empleadoenfersSeleccionados=this.getEmpleadoEnfersSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEmpleadoEnfer--;			
				//EmpleadoEnfer empleadoenferAux= new EmpleadoEnfer();			
				//empleadoenferAux.setId(this.iIdNuevoEmpleadoEnfer);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EmpleadoEnfer empleadoenferOrigen=new EmpleadoEnfer();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EmpleadoEnfer empleadoenferOrigen : empleadoenfersSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEmpleadoEnfer.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							empleadoenferOrigen =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoenferOrigen =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEmpleadoEnfer();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.empleadoenfer.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEmpleadoEnfer(empleadoenferOrigen,this.empleadoenfer,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEnfer(this.empleadoenfer);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.empleadoenferLogic.getEmpleadoEnfers().add(this.empleadoenferAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.empleadoenfers.add(this.empleadoenferAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEmpleadoEnfer(false);
				
				this.jTableDatosEmpleadoEnfer.setRowSelectionInterval(this.getIndiceNuevoEmpleadoEnfer(), this.getIndiceNuevoEmpleadoEnfer());
				
				int iLastRow =  this.jTableDatosEmpleadoEnfer.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmpleadoEnfer.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmpleadoEnfer.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoEnfer(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEmpleadoEnferActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EmpleadoEnfer> empleadoenfersSeleccionados=new ArrayList<EmpleadoEnfer>();									
		
			EmpleadoEnfer empleadoenferOrigen=new EmpleadoEnfer();
			EmpleadoEnfer empleadoenferDestino=new EmpleadoEnfer();
				
			empleadoenfersSeleccionados=this.getEmpleadoEnfersSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEmpleadoEnfer.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || empleadoenfersSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEmpleadoEnfer.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoenferOrigen =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						empleadoenferOrigen =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoenferDestino =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						empleadoenferDestino =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				empleadoenferOrigen =empleadoenfersSeleccionados.get(0);
				empleadoenferDestino =empleadoenfersSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEmpleadoEnfer(empleadoenferOrigen,empleadoenferDestino,true,false);
				
				empleadoenferDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(empleadoenferDestino,empleadoenferLogic.getEmpleadoEnfers());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoenferDestino,empleadoenfers);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEmpleadoEnfer(false);
				
				//this.jTableDatosEmpleadoEnfer.setRowSelectionInterval(this.getIndiceNuevoEmpleadoEnfer(), this.getIndiceNuevoEmpleadoEnfer());
				
				int iLastRow =  this.jTableDatosEmpleadoEnfer.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmpleadoEnfer.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmpleadoEnfer.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoEnfer(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEmpleadoEnferActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoEnfer==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEmpleadoEnfer.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEmpleadoEnferActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEmpleadoEnfer.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEmpleadoEnfer.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEmpleadoEnfer.setVisible(!isVisible);
			this.jPanelPaginacionEmpleadoEnfer.setVisible(!isVisible);
			this.jPanelAccionesEmpleadoEnfer.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEmpleadoEnferActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEmpleadoEnfer();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEmpleadoEnferActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEmpleadoEnfer();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEmpleadoEnferActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEmpleadoEnfer();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEmpleadoEnferActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEmpleadoEnfer();
			
			this.abrirFrameOrderByEmpleadoEnfer();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEmpleadoEnferActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEmpleadoEnfer();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEmpleadoEnfer(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmpleadoEnfer);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEmpleadoEnfer.isMaximum()) {
					this.jInternalFrameDetalleFormEmpleadoEnfer.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEmpleadoEnfer.setSize(this.jInternalFrameDetalleFormEmpleadoEnfer.iWidthFormulario,this.jInternalFrameDetalleFormEmpleadoEnfer.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEmpleadoEnfer.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEmpleadoEnfer.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEmpleadoEnfer.isMaximum()) {
						this.jInternalFrameDetalleFormEmpleadoEnfer.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEmpleadoEnfer.jContentPaneDetalleEmpleadoEnfer.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEmpleadoEnfer.jTabbedPaneRelacionesEmpleadoEnfer.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoEnfer.jContentPaneDetalleEmpleadoEnfer.getWidth(),EmpleadoEnferConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmpleadoEnfer.jTabbedPaneRelacionesEmpleadoEnfer.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoEnfer.jContentPaneDetalleEmpleadoEnfer.getWidth(),EmpleadoEnferConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmpleadoEnfer.jTabbedPaneRelacionesEmpleadoEnfer.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoEnfer.jContentPaneDetalleEmpleadoEnfer.getWidth(),EmpleadoEnferConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEmpleadoEnfer.setVisible(true);
	        this.jInternalFrameDetalleFormEmpleadoEnfer.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEmpleadoEnfer() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEmpleadoEnfer==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEmpleadoEnfer=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoEnfer,false,this);
				} else {
					this.jInternalFrameOrderByEmpleadoEnfer=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoEnfer,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEmpleadoEnfer);
				this.jInternalFrameOrderByEmpleadoEnfer.setVisible(false);
				this.jInternalFrameOrderByEmpleadoEnfer.setSelected(false);
				
				this.jInternalFrameOrderByEmpleadoEnfer.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmpleadoEnfer"));
				
				this.inicializarActualizarBindingTablaOrderByEmpleadoEnfer();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEmpleadoEnfer() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEmpleadoEnfer==null) {
				
				this.jInternalFrameImportacionEmpleadoEnfer=new ImportacionJInternalFrame(EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmpleadoEnfer);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEmpleadoEnfer);
				this.jInternalFrameImportacionEmpleadoEnfer.setVisible(false);
				this.jInternalFrameImportacionEmpleadoEnfer.setSelected(false);


				this.jInternalFrameImportacionEmpleadoEnfer.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmpleadoEnfer"));
				this.jInternalFrameImportacionEmpleadoEnfer.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmpleadoEnfer"));
				this.jInternalFrameImportacionEmpleadoEnfer.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmpleadoEnfer"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEmpleadoEnfer() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEmpleadoEnfer==null) {
				this.jInternalFrameReporteDinamicoEmpleadoEnfer=new ReporteDinamicoJInternalFrame(EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmpleadoEnfer);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmpleadoEnfer);
				this.jInternalFrameReporteDinamicoEmpleadoEnfer.setVisible(false);
				this.jInternalFrameReporteDinamicoEmpleadoEnfer.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoEnfer"));
				this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoEnfer"));
				this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoEnfer"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoEnfer();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEmpleadoEnfer() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmpleadoEnfer);
			
	       	this.jInternalFrameDetalleFormEmpleadoEnfer.setVisible(false);
	        this.jInternalFrameDetalleFormEmpleadoEnfer.setSelected(false);
			
			//this.jInternalFrameDetalleFormEmpleadoEnfer.dispose();
			//this.jInternalFrameDetalleFormEmpleadoEnfer=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEmpleadoEnfer() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEmpleadoEnfer.setVisible(true);
	        this.jInternalFrameReporteDinamicoEmpleadoEnfer.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEmpleadoEnfer() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEmpleadoEnfer.setVisible(true);
	        this.jInternalFrameImportacionEmpleadoEnfer.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEmpleadoEnfer() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEmpleadoEnfer.setVisible(true);
	        this.jInternalFrameOrderByEmpleadoEnfer.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEmpleadoEnfer() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEmpleadoEnfer.setVisible(false);
	        this.jInternalFrameOrderByEmpleadoEnfer.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEmpleadoEnfer() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEmpleadoEnfer.setVisible(false);
	        this.jInternalFrameReporteDinamicoEmpleadoEnfer.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEmpleadoEnfer() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEmpleadoEnfer.setVisible(false);
	        this.jInternalFrameImportacionEmpleadoEnfer.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEmpleadoEnferActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEmpleadoEnfer(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEmpleadoEnfer(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmpleadoEnfer.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEmpleadoEnfer(true);
			//this.isEsNuevoEmpleadoEnfer=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenfer =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadoenfer =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEmpleadoEnfer("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoEnfer(false) ;
			
			if(empleadoenferSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EmpleadoEnferJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoEnfer(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoEnfer(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEmpleadoEnferActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEmpleadoEnfer.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenfer =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoenfer =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEmpleadoEnfer(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoEnfer==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmpleadoEnfer.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEmpleadoEnfer(true);
			//this.isEsNuevoEmpleadoEnfer=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenfer =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadoenfer =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.empleadoenfer.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEmpleadoEnfer("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEmpleadoEnfer(false) ;
			
			if(EmpleadoEnferJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoEnfer(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoEnfer(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Empleado")) {
				if(!this.empleadoenferConstantesFunciones.cargarid_empleadoEmpleadoEnfer) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingEmpleadoEnfer(false,false);
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
		TableColumn tableColumnEmpleado=this.jTableDatosEmpleadoEnfer.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEnfer,EmpleadoEnferConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpleadoEnfer.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEnfermedad(List<Enfermedad> enfermedadsForeignKey)throws Exception{
		TableColumn tableColumnEnfermedad=this.jTableDatosEmpleadoEnfer.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEnfer,EmpleadoEnferConstantesFunciones.LABEL_IDENFERMEDAD));
		TableCellEditor tableCellEditorEnfermedad =tableColumnEnfermedad.getCellEditor();

		EnfermedadTableCell enfermedadTableCellFk=(EnfermedadTableCell)tableCellEditorEnfermedad;

		if(enfermedadTableCellFk!=null) {
			enfermedadTableCellFk.setenfermedadsForeignKey(enfermedadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpleadoEnfer.getSelectedRow();

		//if(intSelectedRow<=0) {
			//enfermedadTableCellFk.setRowActual(intSelectedRow);
			//enfermedadTableCellFk.setenfermedadsForeignKeyActual(enfermedadsForeignKey);
		//}


		if(enfermedadTableCellFk!=null) {
			enfermedadTableCellFk.RecargarEnfermedadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarEmpleadoEnferActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEmpleadoEnfer(false);
			
			//if(!this.isEsNuevoEmpleadoEnfer) {								
				int intSelectedRow = this.jTableDatosEmpleadoEnfer.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenfer =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoenfer =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EmpleadoEnferJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEmpleadoEnfer(this.empleadoenfer,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEnfer(this.empleadoenfer);
				
			}
			
			if(this.permiteMantenimiento(this.empleadoenfer)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEmpleadoEnfer=true;
					this.inicializarActualizarBindingTablaEmpleadoEnfer(false);
					this.isEsNuevoEmpleadoEnfer=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEmpleadoEnfer=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEmpleadoEnfer=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmpleadoEnfer(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoEnfer(false);
				
				this.habilitarDeshabilitarControlesEmpleadoEnfer(false);
			
												
				
				if(EmpleadoEnferJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEmpleadoEnfer();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEmpleadoEnferActionPerformed(evt,empleadoenferSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEmpleadoEnfer(this.empleadoenfer,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEmpleadoEnfer.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,empleadoenferSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.empleadoenfer.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EmpleadoEnfer.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEnfer.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEmpleadoEnferActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEmpleadoEnfer.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenfer =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
				this.empleadoenfer.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadoenfer =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
				this.empleadoenfer.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.empleadoenfer)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EmpleadoEnferModel) this.jTableDatosEmpleadoEnfer.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEmpleadoEnfer=true;
				this.inicializarActualizarBindingTablaEmpleadoEnfer(false);
				this.isEsNuevoEmpleadoEnfer=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmpleadoEnfer(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoEnfer(false);
				
				this.habilitarDeshabilitarControlesEmpleadoEnfer(false);
				
				
				
				if(EmpleadoEnferJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEmpleadoEnfer();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEmpleadoEnferActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEmpleadoEnfer.getRowCount()>=1) {
				jTableDatosEmpleadoEnfer.removeRowSelectionInterval(0, jTableDatosEmpleadoEnfer.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEmpleadoEnfer(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEmpleadoEnfer(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoEnfer(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoEnfer(false) ;
			
			this.isEsNuevoEmpleadoEnfer=false;
			
			if(EmpleadoEnferJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEmpleadoEnfer();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEmpleadoEnferActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEmpleadoEnfer(false);
				
				//SI ES MANUAL
				if(EmpleadoEnferJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEmpleadoEnfer();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEmpleadoEnferActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEmpleadoEnfer--;			
			//EmpleadoEnfer empleadoenferAux= new EmpleadoEnfer();			
			//empleadoenferAux.setId(this.iIdNuevoEmpleadoEnfer);
			
			if(this.jInternalFrameDetalleFormEmpleadoEnfer==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEmpleadoEnfer();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEnfer(this.empleadoenfer);
			
			this.empleadoenfer.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.empleadoenferLogic.getEmpleadoEnfers().add(this.empleadoenferAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.empleadoenfers.add(this.empleadoenferAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEmpleadoEnfer(false);
			
			this.jTableDatosEmpleadoEnfer.setRowSelectionInterval(this.getIndiceNuevoEmpleadoEnfer(), this.getIndiceNuevoEmpleadoEnfer());
			
			int iLastRow =  this.jTableDatosEmpleadoEnfer.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEmpleadoEnfer.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEmpleadoEnfer.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEmpleadoEnfer(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEmpleadoEnferActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEmpleadoEnfer(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoEnfer(false);
			
			//SI ES MANUAL
			if(EmpleadoEnferJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoEnfer();
			}
			
			//this.abrirFrameTreeEmpleadoEnfer();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEmpleadoEnferActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Empleado EnferES ?", "MANTENIMIENTO DE Empleado Enfer", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEmpleadoEnfer.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEmpleadoEnfer();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.empleadoenferReturnGeneral=empleadoenferLogic.procesarImportacionEmpleadoEnfersWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.empleadoenferParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEmpleadoEnferReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEmpleadoEnferActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEmpleadoEnfer.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEmpleadoEnfer.setFileImportacion(this.jInternalFrameImportacionEmpleadoEnfer.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEmpleadoEnfer.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEmpleadoEnfer.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEmpleadoEnfer.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEmpleadoEnfer.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEmpleadoEnferActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EmpleadoEnfer> empleadoenfersSeleccionados=new ArrayList<EmpleadoEnfer>();		

		empleadoenfersSeleccionados=this.getEmpleadoEnfersSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EmpleadoEnferBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EmpleadoEnferBaseDesign.jrxml";
			
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
			
			this.generarReporteEmpleadoEnfers("Todos",empleadoenfersSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoenferSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Enfer",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmpleadoEnferConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoEnferConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoEnferConstantesFunciones.LABEL_IDENFERMEDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Enfermedad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Enfermedad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Enfermedad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Enfermedad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoEnferConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EmpleadoEnferConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case EmpleadoEnferConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case EmpleadoEnferConstantesFunciones.LABEL_IDENFERMEDAD:
					sNombreCampoCategoria="id_enfermedad";
					break;

				case EmpleadoEnferConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EmpleadoEnferConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case EmpleadoEnferConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case EmpleadoEnferConstantesFunciones.LABEL_IDENFERMEDAD:
					sNombreCampoCategoriaValor="id_enfermedad";
					break;

				case EmpleadoEnferConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmpleadoEnferConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case EmpleadoEnferConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case EmpleadoEnferConstantesFunciones.LABEL_IDENFERMEDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Enfermedad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_enfermedad");
					break;

				case EmpleadoEnferConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoEmpleadoEnferActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EmpleadoEnfer> empleadoenfersSeleccionados=new ArrayList<EmpleadoEnfer>();		
		
		empleadoenfersSeleccionados=this.getEmpleadoEnfersSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoenfer";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EmpleadoEnfers");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EmpleadoEnferConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoEnferConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(EmpleadoEnfer empleadoenfer:empleadoenfersSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoenfer.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoEnferConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoEnferConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(EmpleadoEnfer empleadoenfer:empleadoenfersSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoenfer.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoEnferConstantesFunciones.LABEL_IDENFERMEDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoEnferConstantesFunciones.LABEL_IDENFERMEDAD);
					iRow++;

					for(EmpleadoEnfer empleadoenfer:empleadoenfersSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoenfer.getenfermedad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoEnferConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoEnferConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(EmpleadoEnfer empleadoenfer:empleadoenfersSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoenfer.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelEmpleadoEnfer(row);				
			//	iRow++;
			//}				
			
			//for(EmpleadoEnfer empleadoenferAux:empleadoenfersSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEmpleadoEnfer(empleadoenferAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoenferSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Enfer",JOptionPane.INFORMATION_MESSAGE);
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
				this.empleadoenferLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoEnfer(false);
			
			//SI ES MANUAL
			if(EmpleadoEnferJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoEnfer();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEmpleadoEnferActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoEnfer(false);
			
			//SI ES MANUAL
			if(EmpleadoEnferJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmpleadoEnfer();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEmpleadoEnferActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoEnfer(false);
			
			//SI ES MANUAL
			if(EmpleadoEnferJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmpleadoEnfer();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEmpleadoEnfer() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEmpleadoEnfer.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEmpleadoEnfer.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEmpleadoEnfer.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEmpleadoEnfer.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEmpleadoEnfer.setMinimumSize(dimensionMinimum);
		this.jTableDatosEmpleadoEnfer.setMaximumSize(dimensionMaximum);
		this.jTableDatosEmpleadoEnfer.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEmpleadoEnfer(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEmpleadoEnfer(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEmpleadoEnfer(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEmpleadoEnfer(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEmpleadoEnfer(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEmpleadoEnfer(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoEnfer(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEmpleadoEnfer(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EmpleadoEnferJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EmpleadoEnferJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEmpleadoEnfer() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEmpleadoEnfer();
		
		this.inicializarActualizarBindingBotonesManualEmpleadoEnfer(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEmpleadoEnfer();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoEnfer() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoEnfer(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoEnfer(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEmpleadoEnfer.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEmpleadoEnfer.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEmpleadoEnfer.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEmpleadoEnfer.jCheckBoxPostAccionNuevoEmpleadoEnfer.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEmpleadoEnfer.jCheckBoxPostAccionSinCerrarEmpleadoEnfer.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEmpleadoEnfer.jCheckBoxPostAccionSinMensajeEmpleadoEnfer.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEmpleadoEnfer.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEmpleadoEnfer.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEmpleadoEnfer.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
				this.jInternalFrameDetalleFormEmpleadoEnfer.jCheckBoxPostAccionNuevoEmpleadoEnfer.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEmpleadoEnfer.jCheckBoxPostAccionSinCerrarEmpleadoEnfer.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEmpleadoEnfer.jCheckBoxPostAccionSinMensajeEmpleadoEnfer.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEmpleadoEnfer.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEmpleadoEnfer.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxTiposAccionesFormularioEmpleadoEnfer.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEmpleadoEnfer.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEmpleadoEnfer!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEmpleadoEnfer.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEmpleadoEnfer.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEmpleadoEnfer.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEmpleadoEnfer.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEmpleadoEnfer!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEmpleadoEnfer.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEmpleadoEnfer.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEmpleadoEnfer(Boolean esInicializar) throws Exception {
		try	{	
			if(EmpleadoEnferJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoEnfer(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoEnfer() throws Exception {
		try	{
			if(EmpleadoEnferJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEmpleadoEnfer();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmpleadoEnfer() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxTiposAccionesFormularioEmpleadoEnfer.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxTiposAccionesFormularioEmpleadoEnfer.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEmpleadoEnfer() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEmpleadoEnfer.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEmpleadoEnfer.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEmpleadoEnfer.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEmpleadoEnfer.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEmpleadoEnfer.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEmpleadoEnfer.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEmpleadoEnfer.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEmpleadoEnfer.addItem(reporte);
			}
			
			
			if(!this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEmpleadoEnfer.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEmpleadoEnfer.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEmpleadoEnfer.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEmpleadoEnfer.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEmpleadoEnfer.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEmpleadoEnfer.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxTiposAccionesFormularioEmpleadoEnfer.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxTiposAccionesFormularioEmpleadoEnfer.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEmpleadoEnfer.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEmpleadoEnfer.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEmpleadoEnfer.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoEnfer();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoEnfer() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmpleadoEnfer!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmpleadoEnfer!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEmpleadoEnfer!=null) {
				
				if(this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEmpleadoEnfer()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEnfer.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEnfer.getSelectedItem()).getId();}
		if(this.jComboBoxid_enfermedadFK_IdEnfermedadEmpleadoEnfer.getSelectedItem()!=null){this.id_enfermedadFK_IdEnfermedad=((Enfermedad)this.jComboBoxid_enfermedadFK_IdEnfermedadEmpleadoEnfer.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEmpleadoEnfer(Boolean esInicializar) throws Exception {				
		if(EmpleadoEnferJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEmpleadoEnfer();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEmpleadoEnfer() throws Exception {
		this.inicializarActualizarBindingTablaEmpleadoEnfer(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEmpleadoEnfer() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEmpleadoEnfer.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEmpleadoEnfer.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoEnfer.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EmpleadoEnferPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEmpleadoEnfer.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoEnfer.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EmpleadoEnferPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEmpleadoEnferOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEnferOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EmpleadoEnferPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEmpleadoEnfer.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoEnfer.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EmpleadoEnferPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEmpleadoEnfer.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEmpleadoEnfer(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=empleadoenferLogic.getEmpleadoEnfers().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=empleadoenfers.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EmpleadoEnferJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEmpleadoEnfer.setModel(new EmpleadoEnferModel(this.empleadoenferLogic.getEmpleadoEnfers(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEmpleadoEnfer.setModel(new EmpleadoEnferModel(this.empleadoenfers,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEmpleadoEnfer!=null && this.jInternalFrameOrderByEmpleadoEnfer.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEmpleadoEnfer();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEmpleadoEnfer.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEnfer,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EmpleadoEnferPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO,empleadoenferConstantesFunciones.resaltarSeleccionarEmpleadoEnfer,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EmpleadoEnferConstantesFunciones.SCLASSWEBTITULO,empleadoenferConstantesFunciones.resaltarSeleccionarEmpleadoEnfer,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEmpleadoEnfer.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEnfer,EmpleadoEnferConstantesFunciones.LABEL_ID));

		if(this.empleadoenferConstantesFunciones.mostraridEmpleadoEnfer && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoEnferConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empleadoenferConstantesFunciones.resaltaridEmpleadoEnfer,this.empleadoenferConstantesFunciones.activaridEmpleadoEnfer,this,true,"idEmpleadoEnfer","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadoenferConstantesFunciones.resaltaridEmpleadoEnfer,this.empleadoenferConstantesFunciones.activaridEmpleadoEnfer,this,true,"idEmpleadoEnfer","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoEnfer.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEnfer,EmpleadoEnferConstantesFunciones.LABEL_IDEMPRESA));

		if(this.empleadoenferConstantesFunciones.mostrarid_empresaEmpleadoEnfer && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoEnferConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.empleadoenferConstantesFunciones.resaltarid_empresaEmpleadoEnfer,this,this.empleadoenferConstantesFunciones.activarid_empresaEmpleadoEnfer));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.empleadoenferConstantesFunciones.resaltarid_empresaEmpleadoEnfer,this,this.empleadoenferConstantesFunciones.activarid_empresaEmpleadoEnfer,false,"id_empresaEmpleadoEnfer","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoEnferPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoEnfer.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEnfer,EmpleadoEnferConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.empleadoenferConstantesFunciones.mostrarid_empleadoEmpleadoEnfer && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoEnferConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.empleadoenferConstantesFunciones.resaltarid_empleadoEmpleadoEnfer,this,this.empleadoenferConstantesFunciones.activarid_empleadoEmpleadoEnfer));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.empleadoenferConstantesFunciones.resaltarid_empleadoEmpleadoEnfer,this,this.empleadoenferConstantesFunciones.activarid_empleadoEmpleadoEnfer,true,"id_empleadoEmpleadoEnfer","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new EmpleadoEnferPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoEnfer.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEnfer,EmpleadoEnferConstantesFunciones.LABEL_IDENFERMEDAD));

		if(this.empleadoenferConstantesFunciones.mostrarid_enfermedadEmpleadoEnfer && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoEnferConstantesFunciones.LABEL_IDENFERMEDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EnfermedadTableCell(this.enfermedadsForeignKey,this.empleadoenferConstantesFunciones.resaltarid_enfermedadEmpleadoEnfer,this,this.empleadoenferConstantesFunciones.activarid_enfermedadEmpleadoEnfer));
			tableColumn.setCellEditor(new EnfermedadTableCell(this.enfermedadsForeignKey,this.empleadoenferConstantesFunciones.resaltarid_enfermedadEmpleadoEnfer,this,this.empleadoenferConstantesFunciones.activarid_enfermedadEmpleadoEnfer,true,"id_enfermedadEmpleadoEnfer","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoEnferPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoEnfer.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEnfer,EmpleadoEnferConstantesFunciones.LABEL_DESCRIPCION));

		if(this.empleadoenferConstantesFunciones.mostrardescripcionEmpleadoEnfer && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoEnferConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.empleadoenferConstantesFunciones.resaltardescripcionEmpleadoEnfer,this.empleadoenferConstantesFunciones.activardescripcionEmpleadoEnfer,this,true,"descripcionEmpleadoEnfer","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadoenferConstantesFunciones.resaltardescripcionEmpleadoEnfer,this.empleadoenferConstantesFunciones.activardescripcionEmpleadoEnfer,this,true,"descripcionEmpleadoEnfer","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoEnferPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.empleadoenferSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.empleadoenferSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.empleadoenferSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmpleadoEnfer.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.empleadoenferSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.empleadoenferSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmpleadoEnfer.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEmpleadoEnfer && this.isPermisoGuardarCambiosEmpleadoEnfer) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.empleadoenferSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.empleadoenferSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEmpleadoEnfer.addColumn(tableColumn);
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
			
			this.jTableDatosEmpleadoEnfer.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmpleadoEnfer && this.isPermisoGuardarCambiosEmpleadoEnfer) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmpleadoEnfer && this.isPermisoGuardarCambiosEmpleadoEnfer) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEmpleadoEnfer.moveColumn(this.jTableDatosEmpleadoEnfer.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEmpleadoEnfer.moveColumn(this.jTableDatosEmpleadoEnfer.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEmpleadoEnfer.moveColumn(this.jTableDatosEmpleadoEnfer.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEmpleadoEnfer.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEmpleadoEnfer.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEmpleadoEnfer,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EmpleadoEnferJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEmpleadoEnfer.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEmpleadoEnfer.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EmpleadoEnferJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EmpleadoEnferJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEmpleadoEnfer.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEmpleadoEnfer.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEmpleadoEnfer.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=empleadoenferLogic.getEmpleadoEnfers().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=empleadoenfers.size()-1;
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
		//this.jTableDatosEmpleadoEnfer.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEmpleadoEnfer.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEmpleadoEnfer();
			
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
				
				//this.isEsNuevoEmpleadoEnfer=false;
					
				EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
			
				if(this.empleadoenferSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEmpleadoEnfer==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmpleadoEnfer.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmpleadoEnfer.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenfer =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoenfer =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.empleadoenfer.getsType().equals("DUPLICADO")
				   || this.empleadoenfer.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEmpleadoEnfer=true;
				
				} else {
					this.isEsNuevoEmpleadoEnfer=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
					if(this.empleadoenfer.getId()>=0 && !this.empleadoenfer.getIsNew()) {						
						this.isEsNuevoEmpleadoEnfer=false;
						
					} else {
						this.isEsNuevoEmpleadoEnfer=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEmpleadoEnfer(esRelaciones);						
				
				this.seleccionarEmpleadoEnfer(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.empleadoenfer.getId()<0) {
					this.isEsNuevoEmpleadoEnfer=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEmpleadoEnfer(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEmpleadoEnfer(evt,rowIndex);
				}	
				
				if(this.empleadoenferSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EmpleadoEnfer: " + this.dDif); 
					}
				}								
				
				EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEmpleadoEnfer(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.empleadoenfer)) {
					if(this.empleadoenfer.getId()>0) {
						this.empleadoenfer.setIsDeleted(true);
						
						this.empleadoenfersEliminados.add(this.empleadoenfer);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.empleadoenferLogic.getEmpleadoEnfers().remove(this.empleadoenfer);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.empleadoenfers.remove(this.empleadoenfer);				
					}
					
					
					((EmpleadoEnferModel) this.jTableDatosEmpleadoEnfer.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoEnfer(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEmpleadoEnfer(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEmpleadoEnfer) {
			
			if(this.jInternalFrameDetalleFormEmpleadoEnfer==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmpleadoEnfer.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmpleadoEnfer.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenfer =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoenfer =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EmpleadoEnferJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEmpleadoEnfer(this.empleadoenfer);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.empleadoenferConstantesFunciones.cargarid_empresaEmpleadoEnfer || this.empleadoenferConstantesFunciones.event_dependid_empresaEmpleadoEnfer) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.empleadoenfer.getid_empresa());
									//this.inicializarActualizarBindingEmpleadoEnfer(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(empleadoenfer.getEmpresa()!=null) {
							this.empresasForeignKey.add(empleadoenfer.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.empleadoenfer.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.empleadoenferConstantesFunciones.cargarid_empleadoEmpleadoEnfer || this.empleadoenferConstantesFunciones.event_dependid_empleadoEmpleadoEnfer) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.empleadoenfer.getid_empleado());
									//this.inicializarActualizarBindingEmpleadoEnfer(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(empleadoenfer.getEmpleado()!=null) {
							this.empleadosForeignKey.add(empleadoenfer.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.empleadoenfer.getid_empleado(),false,"Formulario");

					//Enfermedad
					if(!this.empleadoenferConstantesFunciones.cargarid_enfermedadEmpleadoEnfer || this.empleadoenferConstantesFunciones.event_dependid_enfermedadEmpleadoEnfer) {
						//this.cargarCombosEnfermedadsForeignKeyLista(" where id="+this.empleadoenfer.getid_enfermedad());
									//this.inicializarActualizarBindingEmpleadoEnfer(false,false);
						this.enfermedadsForeignKey=new ArrayList<Enfermedad>();

						if(empleadoenfer.getEnfermedad()!=null) {
							this.enfermedadsForeignKey.add(empleadoenfer.getEnfermedad());
						}

						this.addItemDefectoCombosForeignKeyEnfermedad();
						this.cargarCombosFrameEnfermedadsForeignKey("Todos");
					}
					this.setActualEnfermedadForeignKey(this.empleadoenfer.getid_enfermedad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEmpleadoEnfer("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEmpleadoEnfer(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoEnfer() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmpleadoEnfer(EmpleadoEnfer empleadoenfer) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEmpleadoEnfer(empleadoenfer,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmpleadoEnfer(EmpleadoEnfer empleadoenfer,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEmpleadoEnfer(empleadoenfer);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEmpleadoEnfer(empleadoenfer,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoEnfer(empleadoenfer);
	}
	
	public void setVariablesObjetoActualToFormularioEmpleadoEnfer(EmpleadoEnfer empleadoenfer) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEmpleadoEnfer==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEmpleadoEnfer.jLabelidEmpleadoEnfer.setText(empleadoenfer.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoEnfer.jTextAreadescripcionEmpleadoEnfer.setText(empleadoenfer.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EmpleadoEnfer empleadoenferLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,empleadoenferLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EmpleadoEnfer empleadoenferLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				empleadoenferLocal=this.empleadoenfer;
			} else {
				empleadoenferLocal=this.empleadoenferAnterior;
			}
		}
		
		if(this.permiteMantenimiento(empleadoenferLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEmpleadoEnfer(empleadoenferLocal,true);
					
					if(empleadoenferSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(empleadoenferLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(empleadoenferLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEmpleadoEnfer(EmpleadoEnfer empleadoenfer,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmpleadoEnfer(empleadoenfer,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEnfer(empleadoenfer);
	}
	
	public void setVariablesFormularioToObjetoActualEmpleadoEnfer(EmpleadoEnfer empleadoenfer,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmpleadoEnfer(empleadoenfer,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEmpleadoEnfer(EmpleadoEnfer empleadoenfer,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoEnfer==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEmpleadoEnfer.jLabelidEmpleadoEnfer.getText()==null || this.jInternalFrameDetalleFormEmpleadoEnfer.jLabelidEmpleadoEnfer.getText()=="" || this.jInternalFrameDetalleFormEmpleadoEnfer.jLabelidEmpleadoEnfer.getText()=="Id") {
				this.jInternalFrameDetalleFormEmpleadoEnfer.jLabelidEmpleadoEnfer.setText("0");
			}

			if(conColumnasBase) {empleadoenfer.setId(Long.parseLong(this.jInternalFrameDetalleFormEmpleadoEnfer.jLabelidEmpleadoEnfer.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoEnferConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEnfer.jLabelIdEmpleadoEnfer,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoenfer.setdescripcion(this.jInternalFrameDetalleFormEmpleadoEnfer.jTextAreadescripcionEmpleadoEnfer.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoEnferConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEnfer.jLabeldescripcionEmpleadoEnfer,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmpleadoEnfer(EmpleadoEnfer empleadoenferBean,EmpleadoEnfer empleadoenfer,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && empleadoenferBean.getid_empleado()!=null && !empleadoenferBean.getid_empleado().equals(-1L))) {empleadoenfer.setid_empleado(empleadoenferBean.getid_empleado());}
			if(conDefault || (!conDefault && empleadoenferBean.getid_enfermedad()!=null && !empleadoenferBean.getid_enfermedad().equals(-1L))) {empleadoenfer.setid_enfermedad(empleadoenferBean.getid_enfermedad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEmpleadoEnfer(EmpleadoEnfer empleadoenferOrigen,EmpleadoEnfer empleadoenfer,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && empleadoenferOrigen.getId()!=null && !empleadoenferOrigen.getId().equals(0L))) {empleadoenfer.setId(empleadoenferOrigen.getId());}}
			if(conDefault || (!conDefault && empleadoenferOrigen.getid_empleado()!=null && !empleadoenferOrigen.getid_empleado().equals(-1L))) {empleadoenfer.setid_empleado(empleadoenferOrigen.getid_empleado());}
			if(conDefault || (!conDefault && empleadoenferOrigen.getid_enfermedad()!=null && !empleadoenferOrigen.getid_enfermedad().equals(-1L))) {empleadoenfer.setid_enfermedad(empleadoenferOrigen.getid_enfermedad());}
			if(conDefault || (!conDefault && empleadoenferOrigen.getdescripcion()!=null && !empleadoenferOrigen.getdescripcion().equals(""))) {empleadoenfer.setdescripcion(empleadoenferOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmpleadoEnfer(EmpleadoEnfer empleadoenfer) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmpleadoEnfer.jLabelidEmpleadoEnfer.setText(empleadoenfer.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoEnfer.jTextAreadescripcionEmpleadoEnfer.setText(empleadoenfer.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmpleadoEnfer(EmpleadoEnferBean empleadoenferBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmpleadoEnfer.jLabelidEmpleadoEnfer.setText(empleadoenferBean.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoEnfer.jTextAreadescripcionEmpleadoEnfer.setText(empleadoenferBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEmpleadoEnfer(EmpleadoEnferParameterReturnGeneral empleadoenferReturnGeneral,EmpleadoEnferBean empleadoenferBean,Boolean conDefault) throws Exception { 
		try {
			EmpleadoEnfer empleadoenferLocal=new EmpleadoEnfer();
			
			empleadoenferLocal=empleadoenferReturnGeneral.getEmpleadoEnfer();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && empleadoenferLocal.getId()!=null && !empleadoenferLocal.getId().equals(0L))) {empleadoenferBean.setId(empleadoenferLocal.getId());}}
			if(conDefault || (!conDefault && empleadoenferLocal.getid_empleado()!=null && !empleadoenferLocal.getid_empleado().equals(-1L))) {empleadoenferBean.setid_empleado(empleadoenferLocal.getid_empleado());}
			if(conDefault || (!conDefault && empleadoenferLocal.getid_enfermedad()!=null && !empleadoenferLocal.getid_enfermedad().equals(-1L))) {empleadoenferBean.setid_enfermedad(empleadoenferLocal.getid_enfermedad());}
			if(conDefault || (!conDefault && empleadoenferLocal.getdescripcion()!=null && !empleadoenferLocal.getdescripcion().equals(""))) {empleadoenferBean.setdescripcion(empleadoenferLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEmpleadoEnferGenerico(Long idEmpleadoEnferSeleccionado,JComboBox jComboBoxEmpleadoEnfer,List<EmpleadoEnfer> empleadoenfersLocal)throws Exception {
		try {
			EmpleadoEnfer  empleadoenferTemp=null;

			for(EmpleadoEnfer empleadoenferAux:empleadoenfersLocal) {
				if(empleadoenferAux.getId()!=null && empleadoenferAux.getId().equals(idEmpleadoEnferSeleccionado)) {
					empleadoenferTemp=empleadoenferAux;
					break;
				}
			}

			jComboBoxEmpleadoEnfer.setSelectedItem(empleadoenferTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEmpleadoEnferGenerico(JComboBox jComboBoxEmpleadoEnfer,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEmpleadoEnfer.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmpleadoEnfer.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEmpleadoEnfer.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmpleadoEnfer.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmpleadoEnfer.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEmpleadoEnfer.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmpleadoEnfer.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEmpleadoEnfer.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEmpleadoEnfer.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEmpleadoEnfer.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadoenfer=(EmpleadoEnfer) empleadoenferLogic.getEmpleadoEnfers().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			empleadoenfer =(EmpleadoEnfer) empleadoenfers.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!empleadoenfer.getIsNew() && !empleadoenfer.getIsChanged() && !empleadoenfer.getIsDeleted()) {
				sDescripcion=empleadoenfer.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=empleadoenfer.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!empleadoenfer.getIsNew() && !empleadoenfer.getIsChanged() && !empleadoenfer.getIsDeleted()) {
				sDescripcion=empleadoenfer.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=empleadoenfer.getempleado_descripcion();
			}
		}

		if(sTipo.equals("Enfermedad")) {
			//sDescripcion=this.getActualEnfermedadForeignKeyDescripcion((Long)value);
			if(!empleadoenfer.getIsNew() && !empleadoenfer.getIsChanged() && !empleadoenfer.getIsDeleted()) {
				sDescripcion=empleadoenfer.getenfermedad_descripcion();
			} else {
				//sDescripcion=this.getActualEnfermedadForeignKeyDescripcion((Long)value);
				sDescripcion=empleadoenfer.getenfermedad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EmpleadoEnfer empleadoenferRow=new EmpleadoEnfer();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadoenferRow=(EmpleadoEnfer) empleadoenferLogic.getEmpleadoEnfers().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			empleadoenferRow=(EmpleadoEnfer) empleadoenfers.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEmpleadoEnfer(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEmpleadoEnfer.setVisible((this.isVisibilidadCeldaNuevoEmpleadoEnfer && this.isPermisoNuevoEmpleadoEnfer));			
			this.jButtonDuplicarEmpleadoEnfer.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoEnfer && this.isPermisoDuplicarEmpleadoEnfer));			
			this.jButtonCopiarEmpleadoEnfer.setVisible((this.isVisibilidadCeldaCopiarEmpleadoEnfer && this.isPermisoCopiarEmpleadoEnfer));
			this.jButtonVerFormEmpleadoEnfer.setVisible((this.isVisibilidadCeldaVerFormEmpleadoEnfer && this.isPermisoVerFormEmpleadoEnfer));
			
			this.jButtonAbrirOrderByEmpleadoEnfer.setVisible((this.isVisibilidadCeldaOrdenEmpleadoEnfer && this.isPermisoOrdenEmpleadoEnfer));			
			
			this.jButtonNuevoRelacionesEmpleadoEnfer.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoEnfer && this.isPermisoNuevoEmpleadoEnfer));			
			this.jButtonNuevoGuardarCambiosEmpleadoEnfer.setVisible((this.isVisibilidadCeldaNuevoEmpleadoEnfer && this.isPermisoNuevoEmpleadoEnfer && this.isPermisoGuardarCambiosEmpleadoEnfer));
			
			if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
			this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonModificarEmpleadoEnfer.setVisible((this.isVisibilidadCeldaModificarEmpleadoEnfer && this.isPermisoActualizarEmpleadoEnfer));	
			this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonActualizarEmpleadoEnfer.setVisible((this.isVisibilidadCeldaActualizarEmpleadoEnfer && this.isPermisoActualizarEmpleadoEnfer));	
			this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonEliminarEmpleadoEnfer.setVisible((this.isVisibilidadCeldaEliminarEmpleadoEnfer && this.isPermisoEliminarEmpleadoEnfer));
			this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonCancelarEmpleadoEnfer.setVisible(this.isVisibilidadCeldaCancelarEmpleadoEnfer);							
			this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonGuardarCambiosEmpleadoEnfer.setVisible((this.isVisibilidadCeldaGuardarEmpleadoEnfer && this.isPermisoGuardarCambiosEmpleadoEnfer));			
			
			}
						
			this.jButtonGuardarCambiosTablaEmpleadoEnfer.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoEnfer && this.isPermisoGuardarCambiosEmpleadoEnfer));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEmpleadoEnfer.setVisible((this.isVisibilidadCeldaNuevoEmpleadoEnfer && this.isPermisoNuevoEmpleadoEnfer));						
			this.jButtonDuplicarToolBarEmpleadoEnfer.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoEnfer && this.isPermisoDuplicarEmpleadoEnfer));						
			this.jButtonCopiarToolBarEmpleadoEnfer.setVisible((this.isVisibilidadCeldaCopiarEmpleadoEnfer && this.isPermisoCopiarEmpleadoEnfer));			
			this.jButtonVerFormToolBarEmpleadoEnfer.setVisible((this.isVisibilidadCeldaVerFormEmpleadoEnfer && this.isPermisoVerFormEmpleadoEnfer));			
			this.jButtonAbrirOrderByToolBarEmpleadoEnfer.setVisible((this.isVisibilidadCeldaOrdenEmpleadoEnfer && this.isPermisoOrdenEmpleadoEnfer));
			this.jButtonNuevoRelacionesToolBarEmpleadoEnfer.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoEnfer && this.isPermisoNuevoEmpleadoEnfer));			
			this.jButtonNuevoGuardarCambiosToolBarEmpleadoEnfer.setVisible((this.isVisibilidadCeldaNuevoEmpleadoEnfer && this.isPermisoNuevoEmpleadoEnfer && this.isPermisoGuardarCambiosEmpleadoEnfer));			
			
			if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
			this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonModificarToolBarEmpleadoEnfer.setVisible((this.isVisibilidadCeldaModificarEmpleadoEnfer && this.isPermisoActualizarEmpleadoEnfer));	
			this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonActualizarToolBarEmpleadoEnfer.setVisible((this.isVisibilidadCeldaActualizarEmpleadoEnfer  && this.isPermisoActualizarEmpleadoEnfer));	
			this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonEliminarToolBarEmpleadoEnfer.setVisible((this.isVisibilidadCeldaEliminarEmpleadoEnfer && this.isPermisoEliminarEmpleadoEnfer));
			this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonCancelarToolBarEmpleadoEnfer.setVisible(this.isVisibilidadCeldaCancelarEmpleadoEnfer);				
			this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonGuardarCambiosToolBarEmpleadoEnfer.setVisible((this.isVisibilidadCeldaGuardarEmpleadoEnfer && this.isPermisoGuardarCambiosEmpleadoEnfer));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEmpleadoEnfer.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoEnfer && this.isPermisoGuardarCambiosEmpleadoEnfer));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEmpleadoEnfer.setVisible((this.isVisibilidadCeldaNuevoEmpleadoEnfer && this.isPermisoNuevoEmpleadoEnfer));			
			this.jMenuItemDuplicarEmpleadoEnfer.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoEnfer && this.isPermisoDuplicarEmpleadoEnfer));			
			this.jMenuItemCopiarEmpleadoEnfer.setVisible((this.isVisibilidadCeldaCopiarEmpleadoEnfer && this.isPermisoCopiarEmpleadoEnfer));			
			this.jMenuItemVerFormEmpleadoEnfer.setVisible((this.isVisibilidadCeldaVerFormEmpleadoEnfer && this.isPermisoVerFormEmpleadoEnfer));			
			this.jMenuItemAbrirOrderByEmpleadoEnfer.setVisible((this.isVisibilidadCeldaOrdenEmpleadoEnfer && this.isPermisoOrdenEmpleadoEnfer));			
			//this.jMenuItemMostrarOcultarEmpleadoEnfer.setVisible((this.isVisibilidadCeldaOrdenEmpleadoEnfer && this.isPermisoOrdenEmpleadoEnfer));
			this.jMenuItemDetalleAbrirOrderByEmpleadoEnfer.setVisible((this.isVisibilidadCeldaOrdenEmpleadoEnfer && this.isPermisoOrdenEmpleadoEnfer));			
			//this.jMenuItemDetalleMostrarOcultarEmpleadoEnfer.setVisible((this.isVisibilidadCeldaOrdenEmpleadoEnfer && this.isPermisoOrdenEmpleadoEnfer));			
			this.jMenuItemNuevoRelacionesEmpleadoEnfer.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoEnfer && this.isPermisoNuevoEmpleadoEnfer));			
			this.jMenuItemNuevoGuardarCambiosEmpleadoEnfer.setVisible((this.isVisibilidadCeldaNuevoEmpleadoEnfer && this.isPermisoNuevoEmpleadoEnfer && this.isPermisoGuardarCambiosEmpleadoEnfer));									
			
			if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
			this.jInternalFrameDetalleFormEmpleadoEnfer.jMenuItemModificarEmpleadoEnfer.setVisible((this.isVisibilidadCeldaModificarEmpleadoEnfer && this.isPermisoActualizarEmpleadoEnfer));	
			this.jInternalFrameDetalleFormEmpleadoEnfer.jMenuItemActualizarEmpleadoEnfer.setVisible((this.isVisibilidadCeldaActualizarEmpleadoEnfer && this.isPermisoActualizarEmpleadoEnfer));	
			this.jInternalFrameDetalleFormEmpleadoEnfer.jMenuItemEliminarEmpleadoEnfer.setVisible((this.isVisibilidadCeldaEliminarEmpleadoEnfer && this.isPermisoEliminarEmpleadoEnfer));
			this.jInternalFrameDetalleFormEmpleadoEnfer.jMenuItemCancelarEmpleadoEnfer.setVisible(this.isVisibilidadCeldaCancelarEmpleadoEnfer);				
			}
			
			this.jMenuItemGuardarCambiosEmpleadoEnfer.setVisible((this.isVisibilidadCeldaGuardarEmpleadoEnfer && this.isPermisoGuardarCambiosEmpleadoEnfer));						
			this.jMenuItemGuardarCambiosTablaEmpleadoEnfer.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoEnfer && this.isPermisoGuardarCambiosEmpleadoEnfer));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEmpleadoEnfer=this.jButtonNuevoEmpleadoEnfer.isVisible();
			this.isVisibilidadCeldaDuplicarEmpleadoEnfer=this.jButtonDuplicarEmpleadoEnfer.isVisible();
			this.isVisibilidadCeldaCopiarEmpleadoEnfer=this.jButtonCopiarEmpleadoEnfer.isVisible();
			this.isVisibilidadCeldaVerFormEmpleadoEnfer=this.jButtonVerFormEmpleadoEnfer.isVisible();
			
			this.isVisibilidadCeldaOrdenEmpleadoEnfer=this.jButtonAbrirOrderByEmpleadoEnfer.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEnfer=this.jButtonNuevoRelacionesEmpleadoEnfer.isVisible();
			this.isVisibilidadCeldaModificarEmpleadoEnfer=this.jButtonModificarEmpleadoEnfer.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
			this.isVisibilidadCeldaActualizarEmpleadoEnfer=this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonActualizarEmpleadoEnfer.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoEnfer=this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonEliminarEmpleadoEnfer.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoEnfer=this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonCancelarEmpleadoEnfer.isVisible();
			this.isVisibilidadCeldaGuardarEmpleadoEnfer=this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonGuardarCambiosEmpleadoEnfer.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEnfer=this.jButtonGuardarCambiosTablaEmpleadoEnfer.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEmpleadoEnfer=this.jButtonNuevoToolBarEmpleadoEnfer.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEnfer=this.jButtonNuevoRelacionesToolBarEmpleadoEnfer.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
			this.isVisibilidadCeldaModificarEmpleadoEnfer=this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonModificarToolBarEmpleadoEnfer.isVisible();
			this.isVisibilidadCeldaActualizarEmpleadoEnfer=this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonActualizarToolBarEmpleadoEnfer.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoEnfer=this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonEliminarToolBarEmpleadoEnfer.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoEnfer=this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonCancelarToolBarEmpleadoEnfer.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmpleadoEnfer=this.jButtonGuardarCambiosToolBarEmpleadoEnfer.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEnfer=this.jButtonGuardarCambiosTablaToolBarEmpleadoEnfer.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEmpleadoEnfer=this.jMenuItemNuevoEmpleadoEnfer.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEnfer=this.jMenuItemNuevoRelacionesEmpleadoEnfer.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
			this.isVisibilidadCeldaModificarEmpleadoEnfer=this.jInternalFrameDetalleFormEmpleadoEnfer.jMenuItemModificarEmpleadoEnfer.isVisible();
			this.isVisibilidadCeldaActualizarEmpleadoEnfer=this.jInternalFrameDetalleFormEmpleadoEnfer.jMenuItemActualizarEmpleadoEnfer.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoEnfer=this.jInternalFrameDetalleFormEmpleadoEnfer.jMenuItemEliminarEmpleadoEnfer.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoEnfer=this.jInternalFrameDetalleFormEmpleadoEnfer.jMenuItemCancelarEmpleadoEnfer.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmpleadoEnfer=this.jMenuItemGuardarCambiosEmpleadoEnfer.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEnfer=this.jMenuItemGuardarCambiosTablaEmpleadoEnfer.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEmpleadoEnfer(Boolean esInicializar) {
		if(EmpleadoEnferJInternalFrame.ISBINDING_MANUAL) {			
			if(this.empleadoenferSessionBean.getConGuardarRelaciones()) {
				//if(this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEmpleadoEnfer();
			}
			
			this.inicializarActualizarBindingBotonesManualEmpleadoEnfer(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEmpleadoEnfer() {
		this.jButtonNuevoEmpleadoEnfer.setVisible(this.isPermisoNuevoEmpleadoEnfer);			
		this.jButtonDuplicarEmpleadoEnfer.setVisible(this.isPermisoDuplicarEmpleadoEnfer);			
		this.jButtonCopiarEmpleadoEnfer.setVisible(this.isPermisoCopiarEmpleadoEnfer);			
		this.jButtonVerFormEmpleadoEnfer.setVisible(this.isPermisoVerFormEmpleadoEnfer);			
		
		this.jButtonAbrirOrderByEmpleadoEnfer.setVisible(this.isPermisoOrdenEmpleadoEnfer);					
		
		this.jButtonNuevoRelacionesEmpleadoEnfer.setVisible(this.isPermisoNuevoEmpleadoEnfer);			
		
		if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonModificarEmpleadoEnfer.setVisible(this.isPermisoActualizarEmpleadoEnfer);	
			this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonActualizarEmpleadoEnfer.setVisible(this.isPermisoActualizarEmpleadoEnfer);	
			this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonEliminarEmpleadoEnfer.setVisible(this.isPermisoEliminarEmpleadoEnfer);
			this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonCancelarEmpleadoEnfer.setVisible(this.isVisibilidadCeldaCancelarEmpleadoEnfer);						
			this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonGuardarCambiosEmpleadoEnfer.setVisible(this.isPermisoGuardarCambiosEmpleadoEnfer);							
		}
		
		this.jButtonGuardarCambiosTablaEmpleadoEnfer.setVisible(this.isPermisoActualizarEmpleadoEnfer);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEmpleadoEnfer() {
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonModificarEmpleadoEnfer.setVisible(this.isPermisoActualizarEmpleadoEnfer);	
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonActualizarEmpleadoEnfer.setVisible(this.isPermisoActualizarEmpleadoEnfer);	
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonEliminarEmpleadoEnfer.setVisible(this.isPermisoEliminarEmpleadoEnfer);
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonCancelarEmpleadoEnfer.setVisible(this.isVisibilidadCeldaCancelarEmpleadoEnfer);							
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonGuardarCambiosEmpleadoEnfer.setVisible((this.isVisibilidadCeldaGuardarEmpleadoEnfer && this.isPermisoGuardarCambiosEmpleadoEnfer));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEmpleadoEnfer() {
		if(EmpleadoEnferJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEmpleadoEnfer();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEmpleadoEnfer() {
	}
	
	public void jTableDatosEmpleadoEnferListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEmpleadoEnfer(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEmpleadoEnferBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenferLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEnfer.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoEnfer(this.getempleadoenfer(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEnfer(this.empleadoenfer);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoenfer =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoenfer =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoenfer==null) {
						this.empleadoenfer = new EmpleadoEnfer();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoEnfer(this.empleadoenfer,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEnfer(this.empleadoenfer);
				}

				if(this.empleadoenfer.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.empleadoenfer.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoEnfer(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenferLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenferLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenferLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEmpleadoEnferUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEmpleadoEnfer(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEnfer.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoEnfer.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoEnfer.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenfer =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoenfer =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoEnfer(this.getempleadoenfer(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEnfer(this.empleadoenfer);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.empleadoenferLogic.getConnexion());

				if(this.empleadoenfer.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.empleadoenfer.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoEnfer=(TitledBorder)this.jScrollPanelDatosEmpleadoEnfer.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEmpleadoEnfer.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEmpleadoEnferBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenferLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEnfer.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoEnfer(this.getempleadoenfer(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEnfer(this.empleadoenfer);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoenfer =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoenfer =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoenfer==null) {
						this.empleadoenfer = new EmpleadoEnfer();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoEnfer(this.empleadoenfer,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEnfer(this.empleadoenfer);
				}

				if(this.empleadoenfer.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.empleadoenfer.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoEnfer(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenferLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenferLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenferLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoEmpleadoEnferActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderEmpleadoEnfer=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosEmpleadoEnfer.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderEmpleadoEnfer=(TitledBorder)this.jScrollPanelDatosEmpleadoEnfer.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderEmpleadoEnfer.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoEmpleadoEnferUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebEmpleadoEnfer(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEnfer.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoEnfer.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoEnfer.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenfer =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoenfer =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoEnfer(this.getempleadoenfer(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEnfer(this.empleadoenfer);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.empleadoenferLogic.getConnexion());

				if(this.empleadoenfer.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.empleadoenfer.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoEnfer=(TitledBorder)this.jScrollPanelDatosEmpleadoEnfer.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderEmpleadoEnfer.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoEmpleadoEnferBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenferLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEnfer.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoEnfer(this.getempleadoenfer(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEnfer(this.empleadoenfer);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoenfer =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoenfer =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoenfer==null) {
						this.empleadoenfer = new EmpleadoEnfer();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoEnfer(this.empleadoenfer,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEnfer(this.empleadoenfer);
				}

				if(this.empleadoenfer.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.empleadoenfer.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoEnfer(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenferLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenferLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenferLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_enfermedadEmpleadoEnferUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoenfermedad=true;

			idTienePermisoenfermedad=this.tienePermisosUsuarioEnPaginaWebEmpleadoEnfer(EnfermedadConstantesFunciones.CLASSNAME);

			if(idTienePermisoenfermedad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEnfer.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoEnfer.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoEnfer.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenfer =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoenfer =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoEnfer(this.getempleadoenfer(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEnfer(this.empleadoenfer);

				this.enfermedadBeanSwingJInternalFrame=new EnfermedadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.enfermedadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.enfermedadBeanSwingJInternalFrame.getEnfermedadLogic().setConnexion(this.empleadoenferLogic.getConnexion());

				if(this.empleadoenfer.getid_enfermedad()!=null) {
					this.enfermedadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.enfermedadBeanSwingJInternalFrame.setIdActual(this.empleadoenfer.getid_enfermedad());
					this.enfermedadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.enfermedadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.enfermedadBeanSwingJInternalFrame.inicializarActualizarBindingTablaEnfermedad();
				}

				JInternalFrameBase jinternalFrame =this.enfermedadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoEnfer=(TitledBorder)this.jScrollPanelDatosEmpleadoEnfer.getBorder();
				TitledBorder titledBorderenfermedad=(TitledBorder)this.enfermedadBeanSwingJInternalFrame.jScrollPanelDatosEnfermedad.getBorder();

				titledBorderenfermedad.setTitle(titledBorderEmpleadoEnfer.getTitle() + " -> Enfermedad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_enfermedadEmpleadoEnferBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenferLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEnfer.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoEnfer(this.getempleadoenfer(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEnfer(this.empleadoenfer);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoenfer =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoenfer =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoenfer==null) {
						this.empleadoenfer = new EmpleadoEnfer();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoEnfer(this.empleadoenfer,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEnfer(this.empleadoenfer);
				}

				if(this.empleadoenfer.getid_enfermedad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_enfermedad = "+this.empleadoenfer.getid_enfermedad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoEnfer(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenferLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenferLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenferLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionEmpleadoEnferBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenferLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEnfer.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoEnfer(this.getempleadoenfer(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEnfer(this.empleadoenfer);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoenfer =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoenfer =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoenfer==null) {
						this.empleadoenfer = new EmpleadoEnfer();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoEnfer(this.empleadoenfer,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEnfer(this.empleadoenfer);
				}

				if(this.empleadoenfer.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.empleadoenfer.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoEnfer(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenferLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenferLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenferLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoEmpleadoEnferActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoEnfer(false,false);

			this.getEmpleadoEnfersFK_IdEmpleado();

			this.inicializarActualizarBindingEmpleadoEnfer(false);

			//if(EmpleadoEnferBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoEnfer(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaEmpleadoEnferActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoEnfer(false,false);

			this.getEmpleadoEnfersFK_IdEmpresa();

			this.inicializarActualizarBindingEmpleadoEnfer(false);

			//if(EmpleadoEnferBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoEnfer(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEnfermedadEmpleadoEnferActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoEnfer(false,false);

			this.getEmpleadoEnfersFK_IdEnfermedad();

			this.inicializarActualizarBindingEmpleadoEnfer(false);

			//if(EmpleadoEnferBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoEnfer(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoenferLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEmpleadoEnfer() {
		if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
			this.jInternalFrameDetalleFormEmpleadoEnfer.setVisible(false);	    			
			this.jInternalFrameDetalleFormEmpleadoEnfer.dispose();
			this.jInternalFrameDetalleFormEmpleadoEnfer=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEmpleadoEnfer!=null) {
			this.jInternalFrameReporteDinamicoEmpleadoEnfer.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEmpleadoEnfer.dispose();
			this.jInternalFrameReporteDinamicoEmpleadoEnfer=null;
		}
		
		if(this.jInternalFrameImportacionEmpleadoEnfer!=null) {
			this.jInternalFrameImportacionEmpleadoEnfer.setVisible(false);	    			
			this.jInternalFrameImportacionEmpleadoEnfer.dispose();
			this.jInternalFrameImportacionEmpleadoEnfer=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEmpleadoEnfer();
			
			EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
			
			
			if(sTipo.equals("NuevoEmpleadoEnfer")) {
				jButtonNuevoEmpleadoEnferActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEmpleadoEnfer")) {
				jButtonDuplicarEmpleadoEnferActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEmpleadoEnfer")) {
				jButtonCopiarEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("VerFormEmpleadoEnfer")) {
				jButtonVerFormEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEmpleadoEnfer")) {
				jButtonNuevoEmpleadoEnferActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEmpleadoEnfer")) {
				jButtonDuplicarEmpleadoEnferActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEmpleadoEnfer")) {
				jButtonNuevoEmpleadoEnferActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEmpleadoEnfer")) {
				jButtonDuplicarEmpleadoEnferActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEmpleadoEnfer")) {
				jButtonNuevoEmpleadoEnferActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEmpleadoEnfer")) {
				jButtonNuevoEmpleadoEnferActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEmpleadoEnfer")) {
				jButtonNuevoEmpleadoEnferActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEmpleadoEnfer")) {
				jButtonModificarEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEmpleadoEnfer")) {
				jButtonModificarEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEmpleadoEnfer")) {
				jButtonModificarEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEmpleadoEnfer")) {
				jButtonActualizarEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEmpleadoEnfer")) {
				jButtonActualizarEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEmpleadoEnfer")) {
				jButtonActualizarEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("EliminarEmpleadoEnfer")) {
				jButtonEliminarEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEmpleadoEnfer")) {
				jButtonEliminarEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEmpleadoEnfer")) {
				jButtonEliminarEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("CancelarEmpleadoEnfer")) {
				jButtonCancelarEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEmpleadoEnfer")) {
				jButtonCancelarEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEmpleadoEnfer")) {
				jButtonCancelarEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("CerrarEmpleadoEnfer")) {
				jButtonCerrarEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEmpleadoEnfer")) {
				jButtonCerrarEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEmpleadoEnfer")) {
				jButtonCerrarEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEmpleadoEnfer")) {
				jButtonMostrarOcultarEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEmpleadoEnfer")) {
				jButtonCancelarEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEmpleadoEnfer")) {
				jButtonGuardarCambiosEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEmpleadoEnfer")) {
				jButtonGuardarCambiosEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEmpleadoEnfer")) {
				jButtonCopiarEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEmpleadoEnfer")) {
				jButtonVerFormEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEmpleadoEnfer")) {
				jButtonGuardarCambiosEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEmpleadoEnfer")) {
				jButtonCopiarEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEmpleadoEnfer")) {
				jButtonVerFormEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEmpleadoEnfer")) {
				jButtonGuardarCambiosEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEmpleadoEnfer")) {
				jButtonGuardarCambiosEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEmpleadoEnfer")) {
				jButtonGuardarCambiosEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEmpleadoEnfer")) {
				jButtonRecargarInformacionEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEmpleadoEnfer")) {
				jButtonRecargarInformacionEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEmpleadoEnfer")) {
				jButtonRecargarInformacionEmpleadoEnferActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEmpleadoEnfer")) {
				jButtonAnterioresEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEmpleadoEnfer")) {
				jButtonAnterioresEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEmpleadoEnfer")) {
				jButtonAnterioresEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEmpleadoEnfer")) {
				jButtonSiguientesEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEmpleadoEnfer")) {
				jButtonSiguientesEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEmpleadoEnfer")) {
				jButtonSiguientesEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEmpleadoEnfer") || sTipo.equals("MenuItemDetalleAbrirOrderByEmpleadoEnfer")) {
				jButtonAbrirOrderByEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEmpleadoEnfer") || sTipo.equals("MenuItemDetalleMostrarOcultarEmpleadoEnfer")) {
				jButtonMostrarOcultarEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEmpleadoEnfer")) {
				jButtonNuevoGuardarCambiosEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEmpleadoEnfer")) {
				jButtonNuevoGuardarCambiosEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEmpleadoEnfer")) {
				jButtonNuevoGuardarCambiosEmpleadoEnferActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEmpleadoEnfer")) {
				jButtonCerrarReporteDinamicoEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEmpleadoEnfer")) {
				jButtonGenerarReporteDinamicoEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEmpleadoEnfer")) {
				
				jButtonGenerarExcelReporteDinamicoEmpleadoEnferActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEmpleadoEnfer")) {
				jButtonCerrarImportacionEmpleadoEnferActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEmpleadoEnfer")) {
				
				jButtonGenerarImportacionEmpleadoEnferActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEmpleadoEnfer")) {
				
				jButtonAbrirImportacionEmpleadoEnferActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEmpleadoEnfer")) {
				jComboBoxTiposAccionesEmpleadoEnferActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEmpleadoEnfer")) {
				jComboBoxTiposRelacionesEmpleadoEnferActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEmpleadoEnfer")) {
				jComboBoxTiposAccionesEmpleadoEnferActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEmpleadoEnfer")) {
				
				jComboBoxTiposSeleccionarEmpleadoEnferActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEmpleadoEnfer")) {
				jTextFieldValorCampoGeneralEmpleadoEnferActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEmpleadoEnfer")) {
				jButtonAbrirOrderByEmpleadoEnferActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEmpleadoEnfer")) {
				jButtonAbrirOrderByEmpleadoEnferActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEmpleadoEnfer")) {
				jButtonCerrarOrderByEmpleadoEnferActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmpleadoEnferBusqueda")) {
				this.jButtonidEmpleadoEnferBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEmpleadoEnferUpdate")) {
				this.jButtonid_empresaEmpleadoEnferUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEmpleadoEnferBusqueda")) {
				this.jButtonid_empresaEmpleadoEnferBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoEnfer")) {
				this.jButtonid_empleadoEmpleadoEnferActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoEnferUpdate")) {
				this.jButtonid_empleadoEmpleadoEnferUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoEnferBusqueda")) {
				this.jButtonid_empleadoEmpleadoEnferBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_enfermedadEmpleadoEnferUpdate")) {
				this.jButtonid_enfermedadEmpleadoEnferUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_enfermedadEmpleadoEnferBusqueda")) {
				this.jButtonid_enfermedadEmpleadoEnferBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionEmpleadoEnferBusqueda")) {
				this.jButtondescripcionEmpleadoEnferBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_empleadoEmpleadoEnfer")) {
				this.jButtonid_empleadoEmpleadoEnferActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdEmpleadoEmpleadoEnfer")) {
				this.jButtonFK_IdEmpleadoEmpleadoEnferActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEnfermedadEmpleadoEnfer")) {
				this.jButtonFK_IdEnfermedadEmpleadoEnferActionPerformed(evt);
			}
			
			;
			
			
			EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEmpleadoEnfer();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoEnferActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoenfer);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoenfer);
				
				EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
				
				


				
				EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEnfer.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEnfer.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EmpleadoEnfer empleadoenferLocal=null;
			
			if(!this.getEsControlTabla()) {
				empleadoenferLocal=this.empleadoenfer;
			} else {
				empleadoenferLocal=this.empleadoenferAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoenfer);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoenfer);
				
				EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
							
				
				


				
				EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEnfer.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEnfer.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoEnferActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoEnfer.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenferAnterior =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoenferAnterior =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
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
			
			EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
			
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
			
			


			
			EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoEnferActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoenfer);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoenfer);
				
				EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
								
						
				


				
				EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEnfer.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEnfer.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoenfer);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoenfer);
				
				EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
								
				
				


				
				EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEnfer.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEnfer.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoEnferActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoEnfer.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenferAnterior =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoenferAnterior =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoenfer);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoenfer);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoEnferActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoEnfer.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenferAnterior =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoenferAnterior =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoEnferActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoenfer);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoenfer);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoenfer);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoenfer);
				
				EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
							
				
				


				
				EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEnfer.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEnfer.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoEnferActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmpleadoEnfer.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoenferAnterior =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.empleadoenferAnterior =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
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
			
			EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
			
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
			
			


			
			EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoEnferActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoenfer);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoenfer);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoenfer);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoenfer);
				
				EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
								
				
				


				
				EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEnfer.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEnfer.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoEnferActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoEnfer.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenferAnterior =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoenferAnterior =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoEnferActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoenfer);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoenfer);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoEnferActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoenfer);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoenfer);
				
				EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEmpleadoEnfer")) {
					jCheckBoxSeleccionarTodosEmpleadoEnferItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEmpleadoEnfer")) {
					jCheckBoxSeleccionadosEmpleadoEnferItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEmpleadoEnfer")) {
					
				}
				
				


				
				
				EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEnfer.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEnfer.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoenfer);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.empleadoenfer);
				
				EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
												
				
				


				
				
				EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEnfer.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEnfer.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoEnferActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmpleadoEnfer.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoenferAnterior =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.empleadoenferAnterior =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoEnferActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoenfer);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoenfer);
				
				EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
				
				
				EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
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
			
			EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
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
			
			


			
			EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoEnferActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoenfer);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoenfer);
				
				EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEnfer.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEnfer.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoenfer);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoenfer);
				
				EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
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
				
				


				
				EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEnfer.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEnfer.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoEnferActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoEnfer.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoenferAnterior =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoenferAnterior =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEmpleadoEnfer")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEmpleadoEnferListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEmpleadoEnfer.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.empleadoenfer =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.empleadoenfer =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.empleadoenfer);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEmpleadoEnfer")) {
				
				}
				
				EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEmpleadoEnfer")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEmpleadoEnfer.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEmpleadoEnfer")) {
			
			}
			
			EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEmpleadoEnfer();
			
			EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
			
			if(sTipo.equals("NuevoEmpleadoEnfer")) {
				jButtonNuevoEmpleadoEnferActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEmpleadoEnfer")) {
				jButtonDuplicarEmpleadoEnferActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEmpleadoEnfer")) {
				jButtonCopiarEmpleadoEnferActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEmpleadoEnfer")) {
				jButtonVerFormEmpleadoEnferActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEmpleadoEnfer")) {
				jButtonNuevoEmpleadoEnferActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEmpleadoEnfer")) {
				jButtonModificarEmpleadoEnferActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEmpleadoEnfer")) {
				jButtonActualizarEmpleadoEnferActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEmpleadoEnfer")) {
				jButtonEliminarEmpleadoEnferActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEmpleadoEnfer")) {
				jButtonGuardarCambiosEmpleadoEnferActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEmpleadoEnfer")) {
				jButtonCancelarEmpleadoEnferActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEmpleadoEnfer")) {
				jButtonCerrarEmpleadoEnferActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEmpleadoEnfer")) {
				jButtonGuardarCambiosEmpleadoEnferActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEmpleadoEnfer")) {
				jButtonNuevoGuardarCambiosEmpleadoEnferActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEmpleadoEnfer")) {
				jButtonAbrirOrderByEmpleadoEnferActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEmpleadoEnfer")) {
				jButtonRecargarInformacionEmpleadoEnferActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEmpleadoEnfer")) {
				jButtonAnterioresEmpleadoEnferActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEmpleadoEnfer")) {
				jButtonSiguientesEmpleadoEnferActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmpleadoEnferBusqueda")) {
				this.jButtonidEmpleadoEnferBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEmpleadoEnferUpdate")) {
				this.jButtonid_empresaEmpleadoEnferUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEmpleadoEnferBusqueda")) {
				this.jButtonid_empresaEmpleadoEnferBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoEnfer")) {
				this.jButtonid_empleadoEmpleadoEnferActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoEnferUpdate")) {
				this.jButtonid_empleadoEmpleadoEnferUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoEnferBusqueda")) {
				this.jButtonid_empleadoEmpleadoEnferBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_enfermedadEmpleadoEnferUpdate")) {
				this.jButtonid_enfermedadEmpleadoEnferUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_enfermedadEmpleadoEnferBusqueda")) {
				this.jButtonid_enfermedadEmpleadoEnferBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionEmpleadoEnferBusqueda")) {
				this.jButtondescripcionEmpleadoEnferBusquedaActionPerformed(evt);
			}
			
			EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEmpleadoEnfer();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEmpleadoEnfer")) {
				closingInternalFrameEmpleadoEnfer();
				
			} else if(sTipo.equals("jButtonCancelarEmpleadoEnfer")) {
				JInternalFrameBase jInternalFrameDetalleFormEmpleadoEnfer = (JInternalFrameBase)evt.getSource();
	            	
	            EmpleadoEnferBeanSwingJInternalFrame jInternalFrameParent=(EmpleadoEnferBeanSwingJInternalFrame)jInternalFrameDetalleFormEmpleadoEnfer.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEmpleadoEnferActionPerformed(null);
			}
			
			EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.empleadoenfer,new Object(),this.empleadoenferParameterGeneral,this.empleadoenferReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEmpleadoEnfer(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEmpleadoEnfer(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEmpleadoEnfer(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.empleadoenfer)) {
			if(!esControlTabla) {
				if(EmpleadoEnferJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEmpleadoEnfer(this.empleadoenfer,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEnfer(this.empleadoenfer);			
				}
				
				if(this.empleadoenferSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEmpleadoEnfer(this.empleadoenfer,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.empleadoenferReturnGeneral=empleadoenferLogic.procesarEventosEmpleadoEnfersWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoenferLogic.getEmpleadoEnfers(),this.empleadoenfer,this.empleadoenferParameterGeneral,this.isEsNuevoEmpleadoEnfer,classes);//this.empleadoenferLogic.getEmpleadoEnfer()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEmpleadoEnfer(this.empleadoenferReturnGeneral,this.empleadoenferBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.empleadoenferSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEmpleadoEnfer(classes,this.empleadoenferReturnGeneral,this.empleadoenferBean,false);
					}
						
					if(this.empleadoenferReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoEnfer(this.empleadoenferReturnGeneral.getEmpleadoEnfer());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEmpleadoEnfer(this.empleadoenferReturnGeneral.getEmpleadoEnfer());	
					}
						
					if(this.empleadoenferReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEmpleadoEnfer(this.empleadoenferReturnGeneral.getEmpleadoEnfer(),classes);//this.empleadoenferBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEmpleadoEnfer(this.empleadoenfer,classes);//this.empleadoenferBean);									
				}
			
				if(EmpleadoEnferJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEmpleadoEnfer(this.empleadoenfer,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEnfer(this.empleadoenfer);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.empleadoenferAnterior!=null) {
						this.empleadoenfer=this.empleadoenferAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.empleadoenferReturnGeneral=empleadoenferLogic.procesarEventosEmpleadoEnfersWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoenferLogic.getEmpleadoEnfers(),this.empleadoenfer,this.empleadoenferParameterGeneral,this.isEsNuevoEmpleadoEnfer,classes);//this.empleadoenferLogic.getEmpleadoEnfer()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.empleadoenferSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.empleadoenferSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.empleadoenferReturnGeneral.getEmpleadoEnfer(),empleadoenferLogic.getEmpleadoEnfers());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.empleadoenferReturnGeneral.getEmpleadoEnfer(),this.empleadoenfers);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEmpleadoEnfer.repaint();
				
				//((AbstractTableModel) this.jTableDatosEmpleadoEnfer.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEmpleadoEnfer();
			}
		}
	}
	
	public void actualizarVisualTableDatosEmpleadoEnfer() throws Exception {
		
		EmpleadoEnferModel empleadoenferModel=(EmpleadoEnferModel)this.jTableDatosEmpleadoEnfer.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadoenferModel.empleadoenfers=this.empleadoenferLogic.getEmpleadoEnfers();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			empleadoenferModel.empleadoenfers=this.empleadoenfers;
		}
		
		
		((EmpleadoEnferModel) this.jTableDatosEmpleadoEnfer.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEmpleadoEnfer() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getempleadoenferAnterior(),this.empleadoenferLogic.getEmpleadoEnfers());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getempleadoenferAnterior(),this.empleadoenfers);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEmpleadoEnfer();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEmpleadoEnfer(EmpleadoEnfer empleadoenfer,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
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
										
				EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoenfer,new Object(),generalEntityParameterGeneral,this.empleadoenferReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.empleadoenferSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EmpleadoEnferConstantesFunciones.getClassesRelationshipsOfEmpleadoEnfer(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EmpleadoEnferConstantesFunciones.getClassesRelationshipsFromStringsOfEmpleadoEnfer(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEmpleadoEnfer(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EmpleadoEnferBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoenfer,new Object(),generalEntityParameterGeneral,this.empleadoenferReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEmpleadoEnfer(EmpleadoEnferBean empleadoenferBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEmpleadoEnfer(ArrayList<Classe> classes,EmpleadoEnferReturnGeneral empleadoenferReturnGeneral,EmpleadoEnferBean empleadoenferBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEmpleadoEnfer(EmpleadoEnfer empleadoenfer,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.empleadoenfer)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEmpleadoEnfer = new EmpleadoEnferDetalleFormJInternalFrame(jDesktopPane,this.empleadoenferSessionBean.getConGuardarRelaciones(),this.empleadoenferSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEmpleadoEnfer);
		this.jInternalFrameDetalleFormEmpleadoEnfer.setVisible(false);
		this.jInternalFrameDetalleFormEmpleadoEnfer.setSelected(false);						
		
		this.jInternalFrameDetalleFormEmpleadoEnfer.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEmpleadoEnfer.empleadoenferLogic=this.empleadoenferLogic;
		
		this.cargarCombosFrameForeignKeyEmpleadoEnfer("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEmpleadoEnfer();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmpleadoEnfer();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEmpleadoEnfer("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEmpleadoEnfer();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEmpleadoEnfer.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmpleadoEnfer"));
		
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonModificarEmpleadoEnfer.addActionListener(new ButtonActionListener(this,"ModificarEmpleadoEnfer"));

		
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonModificarToolBarEmpleadoEnfer.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmpleadoEnfer"));
					
		this.jInternalFrameDetalleFormEmpleadoEnfer.jMenuItemModificarEmpleadoEnfer.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmpleadoEnfer"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonActualizarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"ActualizarEmpleadoEnfer"));
		
		
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonActualizarToolBarEmpleadoEnfer.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmpleadoEnfer"));
						
		this.jInternalFrameDetalleFormEmpleadoEnfer.jMenuItemActualizarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmpleadoEnfer"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonEliminarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"EliminarEmpleadoEnfer"));
		
		
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonEliminarToolBarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmpleadoEnfer"));
								
		this.jInternalFrameDetalleFormEmpleadoEnfer.jMenuItemEliminarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmpleadoEnfer"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonCancelarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"CancelarEmpleadoEnfer"));
		
		
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonCancelarToolBarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmpleadoEnfer"));
					
		this.jInternalFrameDetalleFormEmpleadoEnfer.jMenuItemCancelarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmpleadoEnfer"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoEnfer.jMenuItemDetalleCerrarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmpleadoEnfer"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonGuardarCambiosToolBarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoEnfer"));
		
		
		
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonGuardarCambiosToolBarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoEnfer"));
		
		
		
		this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxTiposAccionesFormularioEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmpleadoEnfer"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonidEmpleadoEnferBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoEnferBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonid_empresaEmpleadoEnferUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoEnferUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonid_empresaEmpleadoEnferBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoEnferBusqueda"));
		//jButtonid_empleadoEmpleadoEnfer.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoEmpleadoEnferActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonid_empleadoEmpleadoEnfer.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEnfer"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonid_empleadoEmpleadoEnferUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEnferUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonid_empleadoEmpleadoEnferBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEnferBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonid_enfermedadEmpleadoEnferUpdate.addActionListener(new ButtonActionListener(this,"id_enfermedadEmpleadoEnferUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonid_enfermedadEmpleadoEnferBusqueda.addActionListener(new ButtonActionListener(this,"id_enfermedadEmpleadoEnferBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtondescripcionEmpleadoEnferBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEmpleadoEnferBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEmpleadoEnfer.jTabbedPaneRelacionesEmpleadoEnfer.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmpleadoEnfer"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEmpleadoEnfer"));
		
		if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEnfer.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmpleadoEnfer"));
		}
		
		this.jTableDatosEmpleadoEnfer.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEmpleadoEnfer"));
		
		this.jTableDatosEmpleadoEnfer.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEmpleadoEnfer"));
		
		this.jButtonNuevoEmpleadoEnfer.addActionListener(new ButtonActionListener(this,"NuevoEmpleadoEnfer"));
		
		this.jButtonDuplicarEmpleadoEnfer.addActionListener(new ButtonActionListener(this,"DuplicarEmpleadoEnfer"));
		
		this.jButtonCopiarEmpleadoEnfer.addActionListener(new ButtonActionListener(this,"CopiarEmpleadoEnfer"));
		
		this.jButtonVerFormEmpleadoEnfer.addActionListener(new ButtonActionListener(this,"VerFormEmpleadoEnfer"));
		
		
		this.jButtonNuevoToolBarEmpleadoEnfer.addActionListener(new ButtonActionListener(this,"NuevoToolBarEmpleadoEnfer"));
			
		this.jButtonDuplicarToolBarEmpleadoEnfer.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEmpleadoEnfer"));
			
		this.jMenuItemNuevoEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEmpleadoEnfer"));
			
		this.jMenuItemDuplicarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEmpleadoEnfer"));		
		
		
		this.jButtonNuevoRelacionesEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEmpleadoEnfer"));
		
		
		this.jButtonNuevoRelacionesToolBarEmpleadoEnfer.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEmpleadoEnfer"));
			
		this.jMenuItemNuevoRelacionesEmpleadoEnfer.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEmpleadoEnfer"));		
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonModificarEmpleadoEnfer.addActionListener(new ButtonActionListener(this,"ModificarEmpleadoEnfer"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonModificarToolBarEmpleadoEnfer.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmpleadoEnfer"));
			
			this.jInternalFrameDetalleFormEmpleadoEnfer.jMenuItemModificarEmpleadoEnfer.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmpleadoEnfer"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonActualizarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"ActualizarEmpleadoEnfer"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonActualizarToolBarEmpleadoEnfer.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmpleadoEnfer"));
				
			this.jInternalFrameDetalleFormEmpleadoEnfer.jMenuItemActualizarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmpleadoEnfer"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonEliminarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"EliminarEmpleadoEnfer"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonEliminarToolBarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmpleadoEnfer"));
						
			this.jInternalFrameDetalleFormEmpleadoEnfer.jMenuItemEliminarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmpleadoEnfer"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonCancelarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"CancelarEmpleadoEnfer"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonCancelarToolBarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmpleadoEnfer"));
			
			this.jInternalFrameDetalleFormEmpleadoEnfer.jMenuItemCancelarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmpleadoEnfer"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEmpleadoEnfer"));		
		
		
		this.jButtonCerrarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"CerrarEmpleadoEnfer"));
		
		
		this.jButtonCerrarToolBarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"CerrarToolBarEmpleadoEnfer"));
			
		this.jMenuItemCerrarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEmpleadoEnfer"));
			
		if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEnfer.jMenuItemDetalleCerrarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmpleadoEnfer"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonGuardarCambiosEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"GuardarCambiosEmpleadoEnfer"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonGuardarCambiosToolBarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoEnfer"));
		}
		
		this.jButtonCopiarToolBarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"CopiarToolBarEmpleadoEnfer"));
			
		this.jButtonVerFormToolBarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"VerFormToolBarEmpleadoEnfer"));
		
		this.jMenuItemGuardarCambiosEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEmpleadoEnfer"));
			
		this.jMenuItemCopiarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEmpleadoEnfer"));		
		
		this.jMenuItemVerFormEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEmpleadoEnfer"));		
		
		
		this.jButtonGuardarCambiosTablaEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmpleadoEnfer"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEmpleadoEnfer"));
			
		this.jMenuItemGuardarCambiosTablaEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmpleadoEnfer"));		
		
		
		
		this.jButtonRecargarInformacionEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"RecargarInformacionEmpleadoEnfer"));
					
		this.jButtonRecargarInformacionToolBarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEmpleadoEnfer"));
		
		this.jMenuItemRecargarInformacionEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEmpleadoEnfer"));		
		
		
		
		this.jButtonAnterioresEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"AnterioresEmpleadoEnfer"));
		
		
		this.jButtonAnterioresToolBarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEmpleadoEnfer"));
		
		this.jMenuItemAnterioresEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEmpleadoEnfer"));		
		
		
		this.jButtonSiguientesEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"SiguientesEmpleadoEnfer"));
		
		
		this.jButtonSiguientesToolBarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEmpleadoEnfer"));
			
		this.jMenuItemSiguientesEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEmpleadoEnfer"));
			
		this.jMenuItemAbrirOrderByEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEmpleadoEnfer"));
			
		this.jMenuItemMostrarOcultarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEmpleadoEnfer"));
			
		this.jMenuItemDetalleAbrirOrderByEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEmpleadoEnfer"));
			
		this.jMenuItemDetalleMostarOcultarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEmpleadoEnfer"));		
		
		
		this.jButtonNuevoGuardarCambiosEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEmpleadoEnfer"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEmpleadoEnfer"));
			
		this.jMenuItemNuevoGuardarCambiosEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEmpleadoEnfer"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEmpleadoEnfer.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEmpleadoEnfer"));

		this.jCheckBoxSeleccionadosEmpleadoEnfer.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEmpleadoEnfer"));
		
		if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxTiposAccionesFormularioEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmpleadoEnfer"));
		}
		
		
		this.jComboBoxTiposRelacionesEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"TiposRelacionesEmpleadoEnfer"));
			
		this.jComboBoxTiposAccionesEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"TiposAccionesEmpleadoEnfer"));
					
		this.jComboBoxTiposSeleccionarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEmpleadoEnfer"));
			
		this.jTextFieldValorCampoGeneralEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEmpleadoEnfer"));		
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonidEmpleadoEnferBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoEnferBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonid_empresaEmpleadoEnferUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoEnferUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonid_empresaEmpleadoEnferBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoEnferBusqueda"));
		//jButtonid_empleadoEmpleadoEnfer.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoEmpleadoEnferActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonid_empleadoEmpleadoEnfer.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEnfer"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonid_empleadoEmpleadoEnferUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEnferUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonid_empleadoEmpleadoEnferBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEnferBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonid_enfermedadEmpleadoEnferUpdate.addActionListener(new ButtonActionListener(this,"id_enfermedadEmpleadoEnferUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonid_enfermedadEmpleadoEnferBusqueda.addActionListener(new ButtonActionListener(this,"id_enfermedadEmpleadoEnferBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtondescripcionEmpleadoEnferBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEmpleadoEnferBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoEmpleadoEnfer.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoEmpleadoEnfer"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEnfer.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEnfer"));

			this.jButtonFK_IdEnfermedadEmpleadoEnfer.addActionListener(new ButtonActionListener(this,"FK_IdEnfermedadEmpleadoEnfer"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEmpleadoEnfer!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoEnfer"));
				this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoEnfer"));
				this.jInternalFrameReporteDinamicoEmpleadoEnfer.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoEnfer"));
			}
			
			//this.jButtonCerrarReporteDinamicoEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoEnfer"));				
			//this.jButtonGenerarReporteDinamicoEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoEnfer"));
			//this.jButtonGenerarExcelReporteDinamicoEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoEnfer"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEmpleadoEnfer!=null) {
				this.jInternalFrameImportacionEmpleadoEnfer.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmpleadoEnfer"));
				this.jInternalFrameImportacionEmpleadoEnfer.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmpleadoEnfer"));
				this.jInternalFrameImportacionEmpleadoEnfer.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmpleadoEnfer"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"AbrirOrderByEmpleadoEnfer"));
			
			this.jButtonAbrirOrderByToolBarEmpleadoEnfer.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEmpleadoEnfer"));			
			
			if(this.jInternalFrameOrderByEmpleadoEnfer!=null) {
				this.jInternalFrameOrderByEmpleadoEnfer.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmpleadoEnfer"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEnfer.jTabbedPaneRelacionesEmpleadoEnfer.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmpleadoEnfer"));
		
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
            		closingInternalFrameEmpleadoEnfer();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEmpleadoEnfer.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEmpleadoEnfer = (JInternalFrameBase)event.getSource();
	            	
	            EmpleadoEnferBeanSwingJInternalFrame jInternalFrameParent=(EmpleadoEnferBeanSwingJInternalFrame)jInternalFrameDetalleFormEmpleadoEnfer.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEmpleadoEnferActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEmpleadoEnfer.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEmpleadoEnferListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEmpleadoEnfer.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEmpleadoEnfer.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoEnferActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoEnferActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoEnferActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEmpleadoEnfer";
		inputMap = this.jButtonNuevoEmpleadoEnfer.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEmpleadoEnfer.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmpleadoEnferActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoEnferActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoEnferActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoEnferActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEmpleadoEnfer";
		inputMap = this.jButtonNuevoRelacionesEmpleadoEnfer.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEmpleadoEnfer.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmpleadoEnferActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEmpleadoEnfer";
		inputMap = this.jButtonModificarEmpleadoEnfer.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEmpleadoEnfer.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEmpleadoEnferActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEmpleadoEnfer";
		inputMap = this.jButtonActualizarEmpleadoEnfer.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEmpleadoEnfer.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEmpleadoEnferActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEmpleadoEnfer";
		inputMap = this.jButtonEliminarEmpleadoEnfer.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEmpleadoEnfer.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEmpleadoEnferActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEmpleadoEnfer";
		inputMap = this.jButtonCancelarEmpleadoEnfer.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEmpleadoEnfer.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEmpleadoEnferActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEmpleadoEnfer";
		inputMap = this.jButtonCerrarEmpleadoEnfer.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEmpleadoEnfer.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEmpleadoEnferActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonGuardarCambiosEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEmpleadoEnfer";
		inputMap = this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonGuardarCambiosEmpleadoEnfer.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonGuardarCambiosEmpleadoEnfer.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEmpleadoEnferActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEmpleadoEnfer.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEmpleadoEnferItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEmpleadoEnfer.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEmpleadoEnferActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEmpleadoEnfer.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEmpleadoEnferActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEmpleadoEnfer.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEmpleadoEnferActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonidEmpleadoEnferBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoEnferBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonid_empresaEmpleadoEnferUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoEnferUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonid_empresaEmpleadoEnferBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoEnferBusqueda"));
		//jButtonid_empleadoEmpleadoEnfer.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoEmpleadoEnferActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonid_empleadoEmpleadoEnfer.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEnfer"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonid_empleadoEmpleadoEnferUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEnferUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonid_empleadoEmpleadoEnferBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEnferBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonid_enfermedadEmpleadoEnferUpdate.addActionListener(new ButtonActionListener(this,"id_enfermedadEmpleadoEnferUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonid_enfermedadEmpleadoEnferBusqueda.addActionListener(new ButtonActionListener(this,"id_enfermedadEmpleadoEnferBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEnfer.jButtondescripcionEmpleadoEnferBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEmpleadoEnferBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoEmpleadoEnfer.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoEmpleadoEnfer"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEnfer.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEnfer"));

		this.jButtonFK_IdEnfermedadEmpleadoEnfer.addActionListener(new ButtonActionListener(this,"FK_IdEnfermedadEmpleadoEnfer"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEmpleadoEnfer.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEmpleadoEnferActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEmpleadoEnferActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEmpleadoEnfer.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEmpleadoEnfer(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EmpleadoEnfer empleadoenferAux:this.empleadoenferLogic.getEmpleadoEnfers()) {
					empleadoenferAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoEnfer empleadoenferAux:empleadoenfers) {
					empleadoenferAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEmpleadoEnferItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmpleadoEnfer(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EmpleadoEnfer empleadoenferAux:this.empleadoenferLogic.getEmpleadoEnfers()) {
						empleadoenferAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoEnfer empleadoenferAux:empleadoenfers) {
						empleadoenferAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EmpleadoEnfer empleadoenferAux:this.empleadoenferLogic.getEmpleadoEnfers()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoEnfer empleadoenferAux:empleadoenfers) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoEnfer(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmpleadoEnfer.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmpleadoEnfer.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEnfer,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEmpleadoEnferItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmpleadoEnfer(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEmpleadoEnfer.getSelectedRows();
			
			EmpleadoEnfer empleadoenferLocal=new EmpleadoEnfer();
			
			//this.seleccionarTodosEmpleadoEnfer(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoenferLocal =(EmpleadoEnfer) this.empleadoenferLogic.getEmpleadoEnfers().toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					empleadoenferLocal =(EmpleadoEnfer) this.empleadoenfers.toArray()[this.jTableDatosEmpleadoEnfer.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				empleadoenferLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EmpleadoEnfer empleadoenferAux:this.empleadoenferLogic.getEmpleadoEnfers()) {
						empleadoenferAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoEnfer empleadoenferAux:empleadoenfers) {
						empleadoenferAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoEnfer(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmpleadoEnfer.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmpleadoEnfer.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEnfer,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEmpleadoEnferItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEmpleadoEnferParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEmpleadoEnferActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEmpleadoEnfer(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEmpleadoEnfer.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EmpleadoEnfer empleadoenferAux:this.empleadoenferLogic.getEmpleadoEnfers()) {
				
						if(sTipoSeleccionar.equals(EmpleadoEnferConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							empleadoenferAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoEnfer empleadoenferAux:empleadoenfers) {
					
						if(sTipoSeleccionar.equals(EmpleadoEnferConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							empleadoenferAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoEnfer(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEmpleadoEnferActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEmpleadoEnfer(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEmpleadoEnfer=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEmpleadoEnfer.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxTiposAccionesFormularioEmpleadoEnfer.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEmpleadoEnfer) {				
					conSplash=true;//false;										
					
					//this.startProcessEmpleadoEnfer(conSplash);
				
					this.generarReporteEmpleadoEnfersSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoEnfer.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxTiposAccionesFormularioEmpleadoEnfer.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEmpleadoEnfersSeleccionados();
				//this.jComboBoxTiposAccionesEmpleadoEnfer.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmpleadoEnfersSeleccionados(false);
				//this.jComboBoxTiposAccionesEmpleadoEnfer.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmpleadoEnfersSeleccionados(true);
				//this.jComboBoxTiposAccionesEmpleadoEnfer.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmpleadoEnfer();
				
				this.exportarEmpleadoEnfersSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoEnfer.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxTiposAccionesFormularioEmpleadoEnfer.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEmpleadoEnfers();
				//this.importarEmpleadoEnfers();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoEnfer.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxTiposAccionesFormularioEmpleadoEnfer.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmpleadoEnfer();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEmpleadoEnfersSeleccionados();
				//this.jComboBoxTiposAccionesEmpleadoEnfer.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Empleado Enfer", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEmpleadoEnfer();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEmpleadoEnfer)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEmpleadoEnfer(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Empleado Enfer",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoEnfer.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxTiposAccionesFormularioEmpleadoEnfer.setSelectedIndex(0);					
				}	
			} 			
			else if(EmpleadoEnferBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEmpleadoEnfer) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEmpleadoEnfer(conSplash);
					
						//this.actualizarParametrosGeneralEmpleadoEnfer();
						
						this.generarReporteProcesoAccionEmpleadoEnfersSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEmpleadoEnfer.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxTiposAccionesFormularioEmpleadoEnfer.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EmpleadoEnferBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Empleado EnferES SELECCIONADOS?", "MANTENIMIENTO DE Empleado Enfer", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEmpleadoEnfer();
				
						this.actualizarParametrosGeneralEmpleadoEnfer();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.empleadoenferReturnGeneral=empleadoenferLogic.procesarAccionEmpleadoEnfersWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.empleadoenferLogic.getEmpleadoEnfers(),this.empleadoenferParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEmpleadoEnferReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmpleadoEnfer.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxTiposAccionesFormularioEmpleadoEnfer.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEmpleadoEnfer();
					
					EmpleadoEnferBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEmpleadoEnferReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmpleadoEnfer.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxTiposAccionesFormularioEmpleadoEnfer.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEmpleadoEnfer(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEmpleadoEnferActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEmpleadoEnfer();
			
			if(this.jInternalFrameDetalleFormEmpleadoEnfer==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EmpleadoEnfer> empleadoenfersSeleccionados=new ArrayList<EmpleadoEnfer>();		
			EmpleadoEnfer empleadoenfer=new EmpleadoEnfer();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEmpleadoEnfer(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEmpleadoEnfer.getSelectedItem();
			
			
			
			
			empleadoenfersSeleccionados=this.getEmpleadoEnfersSeleccionados(true);
			//this.sTipoAccion;
			
			if(empleadoenfersSeleccionados.size()==1) {
				for(EmpleadoEnfer empleadoenferAux:empleadoenfersSeleccionados) {
					empleadoenfer=empleadoenferAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEmpleadoEnfer();
			
      		//this.finishProcessEmpleadoEnfer(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEmpleadoEnferReturnGeneral() throws Exception {
		if(this.empleadoenferReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.empleadoenferReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.empleadoenferReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.empleadoenferReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.empleadoenferReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.empleadoenferReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEmpleadoEnfer(false);
		}
		
		if(this.empleadoenferReturnGeneral.getConRetornoLista() || this.empleadoenferReturnGeneral.getConRetornoObjeto()) {
			if(this.empleadoenferReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.empleadoenferLogic.setEmpleadoEnfers(this.empleadoenferReturnGeneral.getEmpleadoEnfers());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.empleadoenferReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.empleadoenferLogic.setEmpleadoEnfer(this.empleadoenferReturnGeneral.getEmpleadoEnfer());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEmpleadoEnfer(false);
		}
	}
	
	public void actualizarParametrosGeneralEmpleadoEnfer() throws Exception {
		
		
	}
	
	public ArrayList<EmpleadoEnfer> getEmpleadoEnfersSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EmpleadoEnfer> empleadoenfersSeleccionados=new ArrayList<EmpleadoEnfer>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEmpleadoEnfer) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EmpleadoEnfer empleadoenferAux:empleadoenferLogic.getEmpleadoEnfers()) {
					if(empleadoenferAux.getIsSelected()) {
						empleadoenfersSeleccionados.add(empleadoenferAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoEnfer empleadoenferAux:this.empleadoenfers) {
					if(empleadoenferAux.getIsSelected()) {
						empleadoenfersSeleccionados.add(empleadoenferAux);				
					}
				}
			}
			
			if(empleadoenfersSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						empleadoenfersSeleccionados.addAll(this.empleadoenferLogic.getEmpleadoEnfers());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						empleadoenfersSeleccionados.addAll(this.empleadoenfers);				
					}
				}
			}
		} else {
			empleadoenfersSeleccionados.add(this.empleadoenfer);
		}
		
		return empleadoenfersSeleccionados;
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
	
	public void generarReporteEmpleadoEnfersSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEmpleadoEnfersSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEmpleadoEnfersSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmpleadoEnfersSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmpleadoEnfersSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Empleado Enfer",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEmpleadoEnfersSeleccionados() throws Exception {
		ArrayList<EmpleadoEnfer> empleadoenfersSeleccionados=new ArrayList<EmpleadoEnfer>();		
		
		empleadoenfersSeleccionados=this.getEmpleadoEnfersSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEmpleadoEnfers("Todos",empleadoenfersSeleccionados);
		
	}	
	
	public void generarReporteNormalEmpleadoEnfersSeleccionados() throws Exception {
		ArrayList<EmpleadoEnfer> empleadoenfersSeleccionados=new ArrayList<EmpleadoEnfer>();		
		
		empleadoenfersSeleccionados=this.getEmpleadoEnfersSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEmpleadoEnfers("Todos",empleadoenfersSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEmpleadoEnfersSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EmpleadoEnfer> empleadoenfersSeleccionados=new ArrayList<EmpleadoEnfer>();
		
		empleadoenfersSeleccionados=this.getEmpleadoEnfersSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEmpleadoEnfers("Todos",empleadoenfersSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEmpleadoEnfersSeleccionados() throws Exception {
		ArrayList<EmpleadoEnfer> empleadoenfersSeleccionados=new ArrayList<EmpleadoEnfer>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEmpleadoEnfer();
		
		
		empleadoenfersSeleccionados=this.getEmpleadoEnfersSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEmpleadoEnfer();
		
		
		//this.generarReporteEmpleadoEnfers("Todos",empleadoenfersSeleccionados ,empleadoenferImplementable,empleadoenferImplementableHome);
	}
	
	public void mostrarImportacionEmpleadoEnfers() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEmpleadoEnfer();
		
		this.abrirFrameImportacionEmpleadoEnfer();		
		
			
		//this.generarReporteEmpleadoEnfers("Todos",empleadoenfersSeleccionados ,empleadoenferImplementable,empleadoenferImplementableHome);
	}
	
	public void importarEmpleadoEnfers() throws Exception {		
	
	}
	
	public void exportarEmpleadoEnfersSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEmpleadoEnfersSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEmpleadoEnfersSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEmpleadoEnfersSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Empleado Enfer",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEmpleadoEnfersSeleccionados() throws Exception {
		ArrayList<EmpleadoEnfer> empleadoenfersSeleccionados=new ArrayList<EmpleadoEnfer>();		
		
		empleadoenfersSeleccionados=this.getEmpleadoEnfersSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoenfer."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEmpleadoEnfer(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EmpleadoEnfer empleadoenferAux:empleadoenfersSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEmpleadoEnfer(empleadoenferAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//empleadoenferAux.setsDetalleGeneralEntityReporte(empleadoenferAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoenferSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Enfer",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEmpleadoEnfer(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EmpleadoEnferConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoEnferConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoEnferConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoEnferConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoEnferConstantesFunciones.LABEL_IDENFERMEDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoEnferConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEmpleadoEnfer(EmpleadoEnfer empleadoenfer,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=empleadoenfer.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoenfer.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoenfer.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoenfer.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoenfer.getenfermedad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoenfer.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEmpleadoEnfersSeleccionados() throws Exception {
		ArrayList<EmpleadoEnfer> empleadoenfersSeleccionados=new ArrayList<EmpleadoEnfer>();		
		
		empleadoenfersSeleccionados=this.getEmpleadoEnfersSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoenfer.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EmpleadoEnfers");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEmpleadoEnfer(row);				
				iRow++;
			}				
			
			for(EmpleadoEnfer empleadoenferAux:empleadoenfersSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEmpleadoEnfer(empleadoenferAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoenferSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Enfer",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEmpleadoEnfersSeleccionados() throws Exception {
		ArrayList<EmpleadoEnfer> empleadoenfersSeleccionados=new ArrayList<EmpleadoEnfer>();		
		
		empleadoenfersSeleccionados=this.getEmpleadoEnfersSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoenfer.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("empleadoenfers");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("empleadoenfer");
			//elementRoot.appendChild(element);
		
			for(EmpleadoEnfer empleadoenferAux:empleadoenfersSeleccionados) {
				element = document.createElement("empleadoenfer");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEmpleadoEnfer(empleadoenferAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoenferSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Enfer",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEmpleadoEnfer(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoEnferConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoEnferConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoEnferConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoEnferConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoEnferConstantesFunciones.LABEL_IDENFERMEDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoEnferConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEmpleadoEnfer(EmpleadoEnfer empleadoenfer,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoenfer.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoenfer.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoenfer.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoenfer.getenfermedad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoenfer.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlEmpleadoEnfer(EmpleadoEnfer empleadoenfer,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EmpleadoEnferConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(empleadoenfer.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EmpleadoEnferConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(empleadoenfer.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(EmpleadoEnferConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(empleadoenfer.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(EmpleadoEnferConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(empleadoenfer.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementenfermedad_descripcion = document.createElement(EmpleadoEnferConstantesFunciones.IDENFERMEDAD);
		elementenfermedad_descripcion.appendChild(document.createTextNode(empleadoenfer.getenfermedad_descripcion()));
		element.appendChild(elementenfermedad_descripcion);

		Element elementdescripcion = document.createElement(EmpleadoEnferConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(empleadoenfer.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoEmpleadoEnfersSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EmpleadoEnfer> empleadoenfersSeleccionados=new ArrayList<EmpleadoEnfer>();
		
		empleadoenfersSeleccionados=this.getEmpleadoEnfersSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEmpleadoEnfer(empleadoenfersSeleccionados);
		
		this.generarReporteEmpleadoEnfers("Todos",empleadoenfersSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEmpleadoEnfer(ArrayList<EmpleadoEnfer> empleadoenfersSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EmpleadoEnfer empleadoenferAux:empleadoenfersSeleccionados) {
				empleadoenferAux.setsDetalleGeneralEntityReporte(empleadoenferAux.toString());
			
				if(sTipoSeleccionar.equals(EmpleadoEnferConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					empleadoenferAux.setsDescripcionGeneralEntityReporte1(empleadoenferAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoEnferConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					empleadoenferAux.setsDescripcionGeneralEntityReporte1(empleadoenferAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoEnferConstantesFunciones.LABEL_IDENFERMEDAD)) {
					existe=true;
					empleadoenferAux.setsDescripcionGeneralEntityReporte1(empleadoenferAux.getenfermedad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoEnferConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					empleadoenferAux.setsDescripcionGeneralEntityReporte1(empleadoenferAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEnferConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEmpleadoEnfer(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEmpleadoEnfer=true;
				this.isVisibilidadCeldaNuevoRelacionesEmpleadoEnfer=true;
				this.isVisibilidadCeldaGuardarCambiosEmpleadoEnfer=true;
			}
			
			this.isVisibilidadCeldaModificarEmpleadoEnfer=false;
			this.isVisibilidadCeldaActualizarEmpleadoEnfer=false;
			this.isVisibilidadCeldaEliminarEmpleadoEnfer=false;
			this.isVisibilidadCeldaCancelarEmpleadoEnfer=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoEnfer=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoEnfer=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEmpleadoEnfer=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEnfer=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEnfer=false;
			this.isVisibilidadCeldaModificarEmpleadoEnfer=false;
			this.isVisibilidadCeldaActualizarEmpleadoEnfer=true;
			this.isVisibilidadCeldaEliminarEmpleadoEnfer=false;
			this.isVisibilidadCeldaCancelarEmpleadoEnfer=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoEnfer=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoEnfer=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEmpleadoEnfer=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEnfer=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEnfer=false;
			this.isVisibilidadCeldaModificarEmpleadoEnfer=false;
			this.isVisibilidadCeldaActualizarEmpleadoEnfer=true;
			this.isVisibilidadCeldaEliminarEmpleadoEnfer=true;
			this.isVisibilidadCeldaCancelarEmpleadoEnfer=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoEnfer=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoEnfer=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEmpleadoEnfer=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEnfer=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEnfer=false;
			this.isVisibilidadCeldaModificarEmpleadoEnfer=false;
			this.isVisibilidadCeldaActualizarEmpleadoEnfer=true;
			this.isVisibilidadCeldaEliminarEmpleadoEnfer=false;
			this.isVisibilidadCeldaCancelarEmpleadoEnfer=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoEnfer=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoEnfer=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEmpleadoEnfer=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEnfer=true;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEnfer=true;
			this.isVisibilidadCeldaModificarEmpleadoEnfer=false;
			this.isVisibilidadCeldaActualizarEmpleadoEnfer=false;
			this.isVisibilidadCeldaEliminarEmpleadoEnfer=false;
			this.isVisibilidadCeldaCancelarEmpleadoEnfer=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoEnfer=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoEnfer=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEmpleadoEnfer=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEnfer=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEnfer=false;
			this.isVisibilidadCeldaActualizarEmpleadoEnfer=false;
			this.isVisibilidadCeldaEliminarEmpleadoEnfer=false;
			this.isVisibilidadCeldaCancelarEmpleadoEnfer=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoEnfer=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoEnfer=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEmpleadoEnfer=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEnfer=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEnfer=false;
			this.isVisibilidadCeldaModificarEmpleadoEnfer=true;
			this.isVisibilidadCeldaActualizarEmpleadoEnfer=false;
			this.isVisibilidadCeldaEliminarEmpleadoEnfer=false;
			this.isVisibilidadCeldaCancelarEmpleadoEnfer=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoEnfer=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoEnfer=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EmpleadoEnferJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEmpleadoEnfer=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEnfer=true;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEnfer=true;
		} else {
			this.actualizarEstadoPanelsEmpleadoEnfer(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEmpleadoEnfer=false;
			//this.isVisibilidadCeldaVerFormEmpleadoEnfer=false;
			this.isVisibilidadCeldaDuplicarEmpleadoEnfer=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!empleadoenferSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEnfer=false;
		} else {
			this.isVisibilidadCeldaNuevoEmpleadoEnfer=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEnfer=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(empleadoenferSessionBean.getEsGuardarRelacionado()) {
			if(!empleadoenferSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEmpleadoEnfer=false;												
			}
			
			this.jButtonCerrarEmpleadoEnfer.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEnfer=false;
		}
		
		if(!this.permiteMantenimiento(this.empleadoenfer)) {
			this.isVisibilidadCeldaActualizarEmpleadoEnfer=false;
			this.isVisibilidadCeldaEliminarEmpleadoEnfer=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEmpleadoEnfer() {
	}
	
	public void actualizarEstadoPanelsEmpleadoEnfer(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEmpleadoEnfer!=null) {
				this.jScrollPanelDatosEdicionEmpleadoEnfer.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoEnfer!=null) {
				this.jTabbedPaneBusquedasEmpleadoEnfer.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoEnfer!=null) {
				this.jScrollPanelDatosEmpleadoEnfer.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoEnfer!=null) {
				this.jPanelPaginacionEmpleadoEnfer.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoEnfer!=null) {
				this.jPanelParametrosReportesEmpleadoEnfer.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEmpleadoEnfer!=null) {
				this.jScrollPanelDatosEdicionEmpleadoEnfer.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoEnfer!=null) {
				this.jTabbedPaneBusquedasEmpleadoEnfer.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEmpleadoEnfer!=null) {
				this.jScrollPanelDatosEmpleadoEnfer.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoEnfer!=null) {
				this.jPanelPaginacionEmpleadoEnfer.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoEnfer!=null) {
				this.jPanelParametrosReportesEmpleadoEnfer.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEmpleadoEnfer!=null) {
				this.jScrollPanelDatosEdicionEmpleadoEnfer.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoEnfer!=null) {
				this.jTabbedPaneBusquedasEmpleadoEnfer.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoEnfer!=null) {
				this.jScrollPanelDatosEmpleadoEnfer.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoEnfer!=null) {
				this.jPanelPaginacionEmpleadoEnfer.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoEnfer!=null) {
				this.jPanelParametrosReportesEmpleadoEnfer.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEmpleadoEnfer!=null) {
				this.jScrollPanelDatosEdicionEmpleadoEnfer.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoEnfer!=null) {
				this.jTabbedPaneBusquedasEmpleadoEnfer.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoEnfer!=null) {
				this.jScrollPanelDatosEmpleadoEnfer.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoEnfer!=null) {
				this.jPanelPaginacionEmpleadoEnfer.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoEnfer!=null) {
				this.jPanelParametrosReportesEmpleadoEnfer.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEmpleadoEnfer!=null) {
				this.jScrollPanelDatosEdicionEmpleadoEnfer.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoEnfer!=null) {
				this.jTabbedPaneBusquedasEmpleadoEnfer.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoEnfer!=null) {
				this.jScrollPanelDatosEmpleadoEnfer.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoEnfer!=null) {
				this.jPanelPaginacionEmpleadoEnfer.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoEnfer!=null) {
				this.jPanelParametrosReportesEmpleadoEnfer.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEmpleadoEnfer!=null) {
				this.jScrollPanelDatosEdicionEmpleadoEnfer.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoEnfer!=null) {
				this.jTabbedPaneBusquedasEmpleadoEnfer.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoEnfer!=null) {
				this.jScrollPanelDatosEmpleadoEnfer.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoEnfer!=null) {
				this.jPanelPaginacionEmpleadoEnfer.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoEnfer!=null) {
				this.jPanelParametrosReportesEmpleadoEnfer.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEmpleadoEnfer!=null) {
				this.jScrollPanelDatosEdicionEmpleadoEnfer.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoEnfer!=null) {
				this.jTabbedPaneBusquedasEmpleadoEnfer.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoEnfer!=null) {
				this.jScrollPanelDatosEmpleadoEnfer.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoEnfer!=null) {
				this.jPanelPaginacionEmpleadoEnfer.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoEnfer!=null) {
				this.jPanelParametrosReportesEmpleadoEnfer.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEmpleadoEnfer!=null) {
					this.jTabbedPaneBusquedasEmpleadoEnfer.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEmpleadoEnfer!=null) {
				this.jPanelParametrosReportesEmpleadoEnfer.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoEnfer!=null) {
				this.jTabbedPaneBusquedasEmpleadoEnfer.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEmpleadoEnfer!=null) {
				this.jPanelParametrosReportesEmpleadoEnfer.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoEnfer.remove(jPanelFK_IdEmpleadoEmpleadoEnfer);}

			this.isVisibilidadFK_IdEnfermedad=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEnfermedad) {this.jTabbedPaneBusquedasEmpleadoEnfer.remove(jPanelFK_IdEnfermedadEmpleadoEnfer);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoEnfer.remove(jPanelFK_IdEmpleadoEmpleadoEnfer);}

			this.isVisibilidadFK_IdEnfermedad=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEnfermedad) {this.jTabbedPaneBusquedasEmpleadoEnfer.remove(jPanelFK_IdEnfermedadEmpleadoEnfer);}
		}
		
	}

	public void setVisibilidadBusquedasParaEnfermedad(Boolean isParaEnfermedad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEnfermedadNegation=!isParaEnfermedad;

			this.isVisibilidadFK_IdEmpleado=isParaEnfermedadNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoEnfer.remove(jPanelFK_IdEmpleadoEmpleadoEnfer);}

			this.isVisibilidadFK_IdEnfermedad=isParaEnfermedad;
			if(!this.isVisibilidadFK_IdEnfermedad) {this.jTabbedPaneBusquedasEmpleadoEnfer.remove(jPanelFK_IdEnfermedadEmpleadoEnfer);}
		}
		
	}
	
	
	
	

	public String registrarSesionEmpleadoEnferParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(empleadoenferSessionBean==null) {
				empleadoenferSessionBean=new EmpleadoEnferSessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(empleadoenferSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.empleadoenferFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(EmpleadoEnferConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionEmpleadoEnfer(true);
			//empleadoSessionBean.setlidEmpleadoEnferActual(this.idEmpleadoEnferActual);

			empleadoenferSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEmpleadoEnfer(true);
			empleadoenferSessionBean.setlIdEmpleadoEnferActualForeignKey(this.idEmpleadoEnferActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EmpleadoEnferSessionBean empleadoenferSessionBean=new EmpleadoEnferSessionBean();
		
		if(this.empleadoenferSessionBean==null) {
			this.empleadoenferSessionBean=new EmpleadoEnferSessionBean();
		}
		
		this.empleadoenferSessionBean.setsUltimaBusquedaEmpleadoEnfer(this.getsAccionBusqueda());
		this.empleadoenferSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.empleadoenferSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			empleadoenferSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			empleadoenferSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEnfermedad")) {
			empleadoenferSessionBean.setid_enfermedad(this.getid_enfermedadFK_IdEnfermedad());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EmpleadoEnferSessionBean empleadoenferSessionBean=new EmpleadoEnferSessionBean();
		
		if(this.empleadoenferSessionBean==null) {
			this.empleadoenferSessionBean=new EmpleadoEnferSessionBean();
		}
		
		if(this.empleadoenferSessionBean.getsUltimaBusquedaEmpleadoEnfer()!=null&&!this.empleadoenferSessionBean.getsUltimaBusquedaEmpleadoEnfer().equals("")) {
			this.setsAccionBusqueda(empleadoenferSessionBean.getsUltimaBusquedaEmpleadoEnfer());
			this.setiNumeroPaginacion(empleadoenferSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(empleadoenferSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(empleadoenferSessionBean.getid_empleado());
				empleadoenferSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(empleadoenferSessionBean.getid_empresa());
				empleadoenferSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEnfermedad")) {
				this.setid_enfermedadFK_IdEnfermedad(empleadoenferSessionBean.getid_enfermedad());
				empleadoenferSessionBean.setid_enfermedad(-1L);
			}
		}
		
		this.empleadoenferSessionBean.setsUltimaBusquedaEmpleadoEnfer("");
		this.empleadoenferSessionBean.setiNumeroPaginacion(EmpleadoEnferConstantesFunciones.INUMEROPAGINACION);
		this.empleadoenferSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEmpleadoEnfer(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEmpleadoEnfer() {
		this.updateBorderResaltarBusquedasFormularioEmpleadoEnfer();
		this.updateVisibilidadBusquedasFormularioEmpleadoEnfer();
		this.updateHabilitarBusquedasFormularioEmpleadoEnfer();
	}
	
	public void updateBorderResaltarBusquedasFormularioEmpleadoEnfer() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEmpleadoEnfer.getComponents().length>0) {
	

		if(this.empleadoenferConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoEnfer!=null) {
			index= this.jTabbedPaneBusquedasEmpleadoEnfer.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoEnfer);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoEnfer.getComponent(index);
				jPanel.setBorder(this.empleadoenferConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoEnfer);
			}
		}

		if(this.empleadoenferConstantesFunciones.resaltarFK_IdEnfermedadEmpleadoEnfer!=null) {
			index= this.jTabbedPaneBusquedasEmpleadoEnfer.indexOfComponent(this.jPanelFK_IdEnfermedadEmpleadoEnfer);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoEnfer.getComponent(index);
				jPanel.setBorder(this.empleadoenferConstantesFunciones.resaltarFK_IdEnfermedadEmpleadoEnfer);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEmpleadoEnfer() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEmpleadoEnfer.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEmpleadoEnfer.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoEnfer);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoEnfer.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empleadoenferConstantesFunciones.mostrarFK_IdEmpleadoEmpleadoEnfer);
			if(!this.empleadoenferConstantesFunciones.mostrarFK_IdEmpleadoEmpleadoEnfer && index>-1) {
				this.jTabbedPaneBusquedasEmpleadoEnfer.remove(index);
			}

			index= this.jTabbedPaneBusquedasEmpleadoEnfer.indexOfComponent(this.jPanelFK_IdEnfermedadEmpleadoEnfer);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoEnfer.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empleadoenferConstantesFunciones.mostrarFK_IdEnfermedadEmpleadoEnfer);
			if(!this.empleadoenferConstantesFunciones.mostrarFK_IdEnfermedadEmpleadoEnfer && index>-1) {
				this.jTabbedPaneBusquedasEmpleadoEnfer.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEmpleadoEnfer() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEmpleadoEnfer.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEmpleadoEnfer.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoEnfer);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoEnfer.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empleadoenferConstantesFunciones.activarFK_IdEmpleadoEmpleadoEnfer);
				this.jTabbedPaneBusquedasEmpleadoEnfer.setEnabledAt(index,this.empleadoenferConstantesFunciones.activarFK_IdEmpleadoEmpleadoEnfer);
			}

			index= this.jTabbedPaneBusquedasEmpleadoEnfer.indexOfComponent(this.jPanelFK_IdEnfermedadEmpleadoEnfer);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoEnfer.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empleadoenferConstantesFunciones.activarFK_IdEnfermedadEmpleadoEnfer);
				this.jTabbedPaneBusquedasEmpleadoEnfer.setEnabledAt(index,this.empleadoenferConstantesFunciones.activarFK_IdEnfermedadEmpleadoEnfer);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEmpleadoEnfer(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasEmpleadoEnfer.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoEnfer);

			this.jTabbedPaneBusquedasEmpleadoEnfer.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoEnfer.getComponent(index);

			this.empleadoenferConstantesFunciones.setResaltarFK_IdEmpleadoEmpleadoEnfer(resaltar);

			jPanel.setBorder(this.empleadoenferConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoEnfer);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEnfermedad")) {
			index= this.jTabbedPaneBusquedasEmpleadoEnfer.indexOfComponent(this.jPanelFK_IdEnfermedadEmpleadoEnfer);

			this.jTabbedPaneBusquedasEmpleadoEnfer.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoEnfer.getComponent(index);

			this.empleadoenferConstantesFunciones.setResaltarFK_IdEnfermedadEmpleadoEnfer(resaltar);

			jPanel.setBorder(this.empleadoenferConstantesFunciones.resaltarFK_IdEnfermedadEmpleadoEnfer);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEmpleadoEnfer.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEmpleadoEnfer() throws Exception {

		if(this.jInternalFrameDetalleFormEmpleadoEnfer==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEmpleadoEnfer();
		this.updateVisibilidadResaltarControlesFormularioEmpleadoEnfer();
		this.updateHabilitarResaltarControlesFormularioEmpleadoEnfer();
		
	}
	
	public void updateBorderResaltarControlesFormularioEmpleadoEnfer() throws Exception {
		if(this.jInternalFrameDetalleFormEmpleadoEnfer==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.empleadoenferConstantesFunciones.resaltaridEmpleadoEnfer!=null && this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {this.jInternalFrameDetalleFormEmpleadoEnfer.jLabelidEmpleadoEnfer.setBorder(this.empleadoenferConstantesFunciones.resaltaridEmpleadoEnfer);}
		if(this.empleadoenferConstantesFunciones.resaltarid_empresaEmpleadoEnfer!=null && this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empresaEmpleadoEnfer.setBorder(this.empleadoenferConstantesFunciones.resaltarid_empresaEmpleadoEnfer);}
		if(this.empleadoenferConstantesFunciones.resaltarid_empleadoEmpleadoEnfer!=null && this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empleadoEmpleadoEnfer.setBorder(this.empleadoenferConstantesFunciones.resaltarid_empleadoEmpleadoEnfer);}
		if(this.empleadoenferConstantesFunciones.resaltarid_enfermedadEmpleadoEnfer!=null && this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_enfermedadEmpleadoEnfer.setBorder(this.empleadoenferConstantesFunciones.resaltarid_enfermedadEmpleadoEnfer);}
		if(this.empleadoenferConstantesFunciones.resaltardescripcionEmpleadoEnfer!=null && this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {this.jInternalFrameDetalleFormEmpleadoEnfer.jTextAreadescripcionEmpleadoEnfer.setBorder(this.empleadoenferConstantesFunciones.resaltardescripcionEmpleadoEnfer);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEmpleadoEnfer() throws Exception {		
		if(this.jInternalFrameDetalleFormEmpleadoEnfer==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
	
		//this.jInternalFrameDetalleFormEmpleadoEnfer.jLabelidEmpleadoEnfer.setVisible(this.empleadoenferConstantesFunciones.mostraridEmpleadoEnfer);
		this.jInternalFrameDetalleFormEmpleadoEnfer.jPanelidEmpleadoEnfer.setVisible(this.empleadoenferConstantesFunciones.mostraridEmpleadoEnfer);
		//this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empresaEmpleadoEnfer.setVisible(this.empleadoenferConstantesFunciones.mostrarid_empresaEmpleadoEnfer);
		this.jInternalFrameDetalleFormEmpleadoEnfer.jPanelid_empresaEmpleadoEnfer.setVisible(this.empleadoenferConstantesFunciones.mostrarid_empresaEmpleadoEnfer);
		//this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empleadoEmpleadoEnfer.setVisible(this.empleadoenferConstantesFunciones.mostrarid_empleadoEmpleadoEnfer);
		this.jInternalFrameDetalleFormEmpleadoEnfer.jPanelid_empleadoEmpleadoEnfer.setVisible(this.empleadoenferConstantesFunciones.mostrarid_empleadoEmpleadoEnfer);
			this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonid_empleadoEmpleadoEnfer.setVisible(this.empleadoenferConstantesFunciones.mostrarid_empleadoEmpleadoEnfer);
		//this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_enfermedadEmpleadoEnfer.setVisible(this.empleadoenferConstantesFunciones.mostrarid_enfermedadEmpleadoEnfer);
		this.jInternalFrameDetalleFormEmpleadoEnfer.jPanelid_enfermedadEmpleadoEnfer.setVisible(this.empleadoenferConstantesFunciones.mostrarid_enfermedadEmpleadoEnfer);
		//this.jInternalFrameDetalleFormEmpleadoEnfer.jTextAreadescripcionEmpleadoEnfer.setVisible(this.empleadoenferConstantesFunciones.mostrardescripcionEmpleadoEnfer);
		this.jInternalFrameDetalleFormEmpleadoEnfer.jPaneldescripcionEmpleadoEnfer.setVisible(this.empleadoenferConstantesFunciones.mostrardescripcionEmpleadoEnfer);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEmpleadoEnfer() throws Exception {
		if(this.jInternalFrameDetalleFormEmpleadoEnfer==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoEnfer!=null) {
	
		this.jInternalFrameDetalleFormEmpleadoEnfer.jLabelidEmpleadoEnfer.setEnabled(this.empleadoenferConstantesFunciones.activaridEmpleadoEnfer);
		this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empresaEmpleadoEnfer.setEnabled(this.empleadoenferConstantesFunciones.activarid_empresaEmpleadoEnfer);
		this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_empleadoEmpleadoEnfer.setEnabled(this.empleadoenferConstantesFunciones.activarid_empleadoEmpleadoEnfer);
			this.jInternalFrameDetalleFormEmpleadoEnfer.jButtonid_empleadoEmpleadoEnfer.setEnabled(this.empleadoenferConstantesFunciones.activarid_empleadoEmpleadoEnfer);
		this.jInternalFrameDetalleFormEmpleadoEnfer.jComboBoxid_enfermedadEmpleadoEnfer.setEnabled(this.empleadoenferConstantesFunciones.activarid_enfermedadEmpleadoEnfer);
		this.jInternalFrameDetalleFormEmpleadoEnfer.jTextAreadescripcionEmpleadoEnfer.setEnabled(this.empleadoenferConstantesFunciones.activardescripcionEmpleadoEnfer);
		}
	}
	
		
}