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

import com.bydan.erp.nomina.util.ProfesionEmpleaConstantesFunciones;
import com.bydan.erp.nomina.util.ProfesionEmpleaParameterReturnGeneral;
//import com.bydan.erp.nomina.util.ProfesionEmpleaParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.ProfesionEmpleaBean;
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
public class ProfesionEmpleaBeanSwingJInternalFrame extends ProfesionEmpleaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProfesionEmpleaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProfesionEmplea> profesionempleaValidator = new ClassValidator<ProfesionEmplea>(ProfesionEmplea.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProfesionEmplea profesionemplea;	
	public ProfesionEmplea profesionempleaAux;
	public ProfesionEmplea profesionempleaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProfesionEmplea profesionempleaTotales;
	public Long idProfesionEmpleaActual;
	public Long iIdNuevoProfesionEmplea=0L;
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

	public String sFinalQueryComboProfesion="";

	public List<Profesion> profesionsForeignKey;

	public List<Profesion> getprofesionsForeignKey() {
		return profesionsForeignKey;
	}

	public void setprofesionsForeignKey(List<Profesion> profesionsForeignKey) {
		this.profesionsForeignKey = profesionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Profesion profesionForeignKey;

	public Profesion getprofesionForeignKey() {
		return profesionForeignKey;
	}

	public void setprofesionForeignKey(Profesion profesionForeignKey) {
		this.profesionForeignKey = profesionForeignKey;
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
	
	public Boolean isPermisoTodoProfesionEmplea;
	public Boolean isPermisoNuevoProfesionEmplea;
	public Boolean isPermisoActualizarProfesionEmplea;
	public Boolean isPermisoActualizarOriginalProfesionEmplea;
	public Boolean isPermisoEliminarProfesionEmplea;
	public Boolean isPermisoGuardarCambiosProfesionEmplea;
	public Boolean isPermisoConsultaProfesionEmplea;
	public Boolean isPermisoBusquedaProfesionEmplea;
	public Boolean isPermisoReporteProfesionEmplea;
	public Boolean isPermisoPaginacionMedioProfesionEmplea;
	public Boolean isPermisoPaginacionAltoProfesionEmplea;
	public Boolean isPermisoPaginacionTodoProfesionEmplea;
	public Boolean isPermisoCopiarProfesionEmplea;
	public Boolean isPermisoVerFormProfesionEmplea;
	public Boolean isPermisoDuplicarProfesionEmplea;
	public Boolean isPermisoOrdenProfesionEmplea;
	
	
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
	
	public ProfesionEmpleaParameterReturnGeneral profesionempleaReturnGeneral;
	public ProfesionEmpleaParameterReturnGeneral profesionempleaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProfesionEmplea=false;
	public Boolean esParaAccionDesdeFormularioProfesionEmplea=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProfesionEmpleaSessionBeanAdditional profesionempleaSessionBeanAdditional=null;
	
	public ProfesionEmpleaSessionBeanAdditional getProfesionEmpleaSessionBeanAdditional() {
		return this.profesionempleaSessionBeanAdditional;
	}
	
	public void setProfesionEmpleaSessionBeanAdditional(ProfesionEmpleaSessionBeanAdditional profesionempleaSessionBeanAdditional) {
		try {
			this.profesionempleaSessionBeanAdditional=profesionempleaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProfesionEmpleaBeanSwingJInternalFrameAdditional profesionempleaBeanSwingJInternalFrameAdditional=null;
	//public class ProfesionEmpleaBeanSwingJInternalFrame
	
	public ProfesionEmpleaBeanSwingJInternalFrameAdditional getProfesionEmpleaBeanSwingJInternalFrameAdditional() {
		return this.profesionempleaBeanSwingJInternalFrameAdditional;
	}
	
	public void setProfesionEmpleaBeanSwingJInternalFrameAdditional(ProfesionEmpleaBeanSwingJInternalFrameAdditional profesionempleaBeanSwingJInternalFrameAdditional) {
		try {
			this.profesionempleaBeanSwingJInternalFrameAdditional=profesionempleaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProfesionEmpleaLogic profesionempleaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProfesionEmplea profesionempleaBean;
	public ProfesionEmpleaConstantesFunciones profesionempleaConstantesFunciones;
	//public ProfesionEmpleaParameterReturnGeneral profesionempleaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	public ProfesionLogic profesionLogic;
	
	//PARAMETROS
	
	
	//public List<ProfesionEmplea> profesionempleas;	
	//public List<ProfesionEmplea> profesionempleasEliminados;
	//public List<ProfesionEmplea> profesionempleasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProfesionEmplea=false;
	public Boolean isVisibilidadCeldaDuplicarProfesionEmplea=true;
	public Boolean isVisibilidadCeldaCopiarProfesionEmplea=true;
	public Boolean isVisibilidadCeldaVerFormProfesionEmplea=true;
	public Boolean isVisibilidadCeldaOrdenProfesionEmplea=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProfesionEmplea=false;
	public Boolean isVisibilidadCeldaModificarProfesionEmplea=false;
	public Boolean isVisibilidadCeldaActualizarProfesionEmplea=false;
	public Boolean isVisibilidadCeldaEliminarProfesionEmplea=false;
	public Boolean isVisibilidadCeldaCancelarProfesionEmplea=false;
	public Boolean isVisibilidadCeldaGuardarProfesionEmplea=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProfesionEmplea=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdProfesion=false;
	
	public Long getiIdNuevoProfesionEmplea() {
		return this.iIdNuevoProfesionEmplea;
	}

	public void setiIdNuevoProfesionEmplea(Long iIdNuevoProfesionEmplea) {
		this.iIdNuevoProfesionEmplea = iIdNuevoProfesionEmplea;
	}
	
	public Long getidProfesionEmpleaActual() {
		return this.idProfesionEmpleaActual;
	}

	public void setidProfesionEmpleaActual(Long idProfesionEmpleaActual) {
		this.idProfesionEmpleaActual = idProfesionEmpleaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProfesionEmplea getprofesionemplea() {
		return this.profesionemplea;
	}

	public void setprofesionemplea(ProfesionEmplea profesionemplea) {
		this.profesionemplea = profesionemplea;
	}
	
	public ProfesionEmplea getprofesionempleaAux() {
		return this.profesionempleaAux;
	}

	public void setprofesionempleaAux(ProfesionEmplea profesionempleaAux) {
		this.profesionempleaAux = profesionempleaAux;
	}				
	
	public ProfesionEmplea getprofesionempleaAnterior() {
		return this.profesionempleaAnterior;
	}

	public void setprofesionempleaAnterior(ProfesionEmplea profesionempleaAnterior) {
		this.profesionempleaAnterior = profesionempleaAnterior;
	}	
	
	public ProfesionEmplea getprofesionempleaTotales() {
		return this.profesionempleaTotales;
	}

	public void setprofesionempleaTotales(ProfesionEmplea profesionempleaTotales) {
		this.profesionempleaTotales = profesionempleaTotales;
	}	
	
	public ProfesionEmplea getprofesionempleaBean() {
		return this.profesionempleaBean;
	}

	public void setprofesionempleaBean(ProfesionEmplea profesionempleaBean) {
		this.profesionempleaBean = profesionempleaBean;
	}	
	
	public ProfesionEmpleaParameterReturnGeneral getprofesionempleaReturnGeneral() {
		return this.profesionempleaReturnGeneral;
	}

	public void setprofesionempleaReturnGeneral(ProfesionEmpleaParameterReturnGeneral profesionempleaReturnGeneral) {
		this.profesionempleaReturnGeneral = profesionempleaReturnGeneral;
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

	public Long id_profesionFK_IdProfesion=-1L;

	public Long getid_profesionFK_IdProfesion() {
		return this.id_profesionFK_IdProfesion;
	}

	public void setid_profesionFK_IdProfesion(Long id_profesionFK_IdProfesion) {
		this.id_profesionFK_IdProfesion = id_profesionFK_IdProfesion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProfesionEmpleaLogic getProfesionEmpleaLogic()	{		
		return profesionempleaLogic;
	}

	public void setProfesionEmpleaLogic(ProfesionEmpleaLogic profesionempleaLogic) {
		this.profesionempleaLogic = profesionempleaLogic;
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
	
	public Boolean getIsEsNuevoProfesionEmplea() {
		return isEsNuevoProfesionEmplea;
	}

	public void setIsEsNuevoProfesionEmplea(Boolean isEsNuevoProfesionEmplea) {
		this.isEsNuevoProfesionEmplea = isEsNuevoProfesionEmplea;
	}

	public Boolean getEsParaAccionDesdeFormularioProfesionEmplea() {
		return esParaAccionDesdeFormularioProfesionEmplea;
	}
	
	public void setEsParaAccionDesdeFormularioProfesionEmplea(Boolean esParaAccionDesdeFormularioProfesionEmplea) {
		this.esParaAccionDesdeFormularioProfesionEmplea = esParaAccionDesdeFormularioProfesionEmplea;
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

			if(this.profesionempleaSessionBean==null) {
				this.profesionempleaSessionBean=new ProfesionEmpleaSessionBean();
			}

			if(!this.profesionempleaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(profesionempleaSessionBean.getlidEmpresaActual());
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

			if(this.profesionempleaSessionBean==null) {
				this.profesionempleaSessionBean=new ProfesionEmpleaSessionBean();
			}

			if(!this.profesionempleaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(profesionempleaSessionBean.getlidEmpleadoActual());
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

	public void cargarCombosProfesionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.profesionsForeignKey=new ArrayList<Profesion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ProfesionLogic profesionLogic=new ProfesionLogic();

			//profesionLogic.getProfesionDataAccess().setIsForForeingKeyData(true);

			if(this.profesionempleaSessionBean==null) {
				this.profesionempleaSessionBean=new ProfesionEmpleaSessionBean();
			}

			if(!this.profesionempleaSessionBean.getisBusquedaDesdeForeignKeySesionProfesion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//profesionLogic.getProfesionDataAccess().setIsForForeingKeyData(true);

					profesionLogic.getTodosProfesionsWithConnection(sFinalQuery,new Pagination());

					this.profesionsForeignKey=profesionLogic.getProfesions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaProfesion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					profesionLogic.getEntityWithConnection(profesionempleaSessionBean.getlidProfesionActual());
					this.profesionsForeignKey.add(profesionLogic.getProfesion());
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

					if(this.profesionemplea!=null) {
						this.profesionemplea.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
						this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empresaProfesionEmplea.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProfesionEmplea.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
						if(this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empresaProfesionEmplea.getItemCount()>0) {
							this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empresaProfesionEmplea.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProfesionEmpleaGenerico)throws Exception
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
				jComboBoxid_empresaProfesionEmpleaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProfesionEmpleaGenerico!=null && jComboBoxid_empresaProfesionEmpleaGenerico.getItemCount()>0) {
					jComboBoxid_empresaProfesionEmpleaGenerico.setSelectedIndex(0);
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

					if(this.profesionemplea!=null) {
						this.profesionemplea.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
						this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empleadoProfesionEmplea.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoProfesionEmplea.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
						if(this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empleadoProfesionEmplea.getItemCount()>0) {
							this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empleadoProfesionEmplea.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoProfesionEmplea!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoProfesionEmplea.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoProfesionEmplea!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoProfesionEmplea.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoProfesionEmplea.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoProfesionEmplea.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoProfesionEmpleaGenerico)throws Exception
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
				jComboBoxid_empleadoProfesionEmpleaGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoProfesionEmpleaGenerico!=null && jComboBoxid_empleadoProfesionEmpleaGenerico.getItemCount()>0) {
					jComboBoxid_empleadoProfesionEmpleaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualProfesionForeignKey(Long idProfesionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Profesion  profesionTemp=null;

			for(Profesion profesionAux:profesionsForeignKey) {
				if(profesionAux.getId()!=null && profesionAux.getId().equals(idProfesionSeleccionado)) {
					profesionTemp=profesionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(profesionTemp!=null) {

					if(this.profesionemplea!=null) {
						this.profesionemplea.setProfesion(profesionTemp);
					}

					if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
						this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_profesionProfesionEmplea.setSelectedItem(profesionTemp);
					}
				} else {
					//jComboBoxid_profesionProfesionEmplea.setSelectedItem(profesionTemp);
					if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
						if(this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_profesionProfesionEmplea.getItemCount()>0) {
							this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_profesionProfesionEmplea.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProfesion") || sFormularioTipoBusqueda.equals("Todos")){
					if(profesionTemp!=null && jComboBoxid_profesionFK_IdProfesionProfesionEmplea!=null) {
						jComboBoxid_profesionFK_IdProfesionProfesionEmplea.setSelectedItem(profesionTemp);
					} else {
						if(jComboBoxid_profesionFK_IdProfesionProfesionEmplea!=null) {
							//jComboBoxid_profesionFK_IdProfesionProfesionEmplea.setSelectedItem(profesionTemp);
							if(jComboBoxid_profesionFK_IdProfesionProfesionEmplea.getItemCount()>0) {
								jComboBoxid_profesionFK_IdProfesionProfesionEmplea.setSelectedIndex(0);
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

	public String getActualProfesionForeignKeyDescripcion(Long idProfesionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Profesion  profesionTemp=null;

			for(Profesion profesionAux:profesionsForeignKey) {
				if(profesionAux.getId()!=null && profesionAux.getId().equals(idProfesionSeleccionado)) {
					profesionTemp=profesionAux;
					break;
				}
			}


			sDescripcion=ProfesionConstantesFunciones.getProfesionDescripcion(profesionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualProfesionForeignKeyGenerico(Long idProfesionSeleccionado,JComboBox jComboBoxid_profesionProfesionEmpleaGenerico)throws Exception
	{
		try
		{
			Profesion  profesionTemp=null;

			for(Profesion profesionAux:profesionsForeignKey) {
				if(profesionAux.getId()!=null && profesionAux.getId().equals(idProfesionSeleccionado)) {
					profesionTemp=profesionAux;
					break;
				}
			}

			if(profesionTemp!=null) {
				jComboBoxid_profesionProfesionEmpleaGenerico.setSelectedItem(profesionTemp);
			} else {
				if(jComboBoxid_profesionProfesionEmpleaGenerico!=null && jComboBoxid_profesionProfesionEmpleaGenerico.getItemCount()>0) {
					jComboBoxid_profesionProfesionEmpleaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProfesionEmplea profesionemplea,JComboBox jComboBoxid_empresaProfesionEmpleaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProfesionEmpleaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empresaProfesionEmplea.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProfesionEmpleaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				profesionemplea.setid_empresa(empresaAux.getId());
				profesionemplea.setempresa_descripcion(ProfesionEmpleaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				profesionemplea.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(ProfesionEmplea profesionemplea,JComboBox jComboBoxid_empleadoProfesionEmpleaGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoProfesionEmpleaGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empleadoProfesionEmplea.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoProfesionEmpleaGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				profesionemplea.setid_empleado(empleadoAux.getId());
				profesionemplea.setempleado_descripcion(ProfesionEmpleaConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				profesionemplea.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProfesionForeignKey(ProfesionEmplea profesionemplea,JComboBox jComboBoxid_profesionProfesionEmpleaGenerico)throws Exception
	{
		try
		{
			Profesion  profesionAux=new Profesion();

			if(jComboBoxid_profesionProfesionEmpleaGenerico==null) {
				profesionAux=(Profesion)this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_profesionProfesionEmplea.getSelectedItem();
			} else {
				profesionAux=(Profesion)jComboBoxid_profesionProfesionEmpleaGenerico.getSelectedItem();
			}

			if(profesionAux!=null && profesionAux.getId()!=null) {
				profesionemplea.setid_profesion(profesionAux.getId());
				profesionemplea.setprofesion_descripcion(ProfesionEmpleaConstantesFunciones.getProfesionDescripcion(profesionAux));
				profesionemplea.setProfesion(profesionAux);			}
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

					if(!ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProfesionEmplea!=null) { 
							this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empresaProfesionEmplea.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empresaProfesionEmplea.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProfesionEmplea!=null) { 
					}

					if(!ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProfesionEmplea!=null) { 
							this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empleadoProfesionEmplea.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empleadoProfesionEmplea.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProfesionEmplea!=null) { 
					}

					if(!ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoProfesionEmplea.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoProfesionEmplea.addItem(empleado);
							}
						}

						if(!ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameProfesionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingProfesion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProfesionEmplea!=null) { 
							this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_profesionProfesionEmplea.removeAllItems();

							for(Profesion profesion:this.profesionsForeignKey) {
								this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_profesionProfesionEmplea.addItem(profesion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProfesionEmplea!=null) { 
					}

					if(!ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProfesion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_profesionFK_IdProfesionProfesionEmplea.removeAllItems();

							for(Profesion profesion:this.profesionsForeignKey) {
								this.jComboBoxid_profesionFK_IdProfesionProfesionEmplea.addItem(profesion);
							}
						}

						if(!ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
							this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empresaProfesionEmplea.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
							this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empresaProfesionEmplea.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
							this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empleadoProfesionEmplea.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
							this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empleadoProfesionEmplea.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoProfesionEmplea.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoProfesionEmplea.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameProfesionForeignKey(Profesion profesion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
							this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_profesionProfesionEmplea.setSelectedItem(profesion);
						}
					} else {
						if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
							this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_profesionProfesionEmplea.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_profesionFK_IdProfesionProfesionEmplea.setSelectedItem(profesion);
						} else {
							this.jComboBoxid_profesionFK_IdProfesionProfesionEmplea.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProfesionEmplea() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ProfesionEmpleaConstantesFunciones.refrescarForeignKeysDescripcionesProfesionEmplea(this.profesionempleaLogic.getProfesionEmpleas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ProfesionEmpleaConstantesFunciones.refrescarForeignKeysDescripcionesProfesionEmplea(this.profesionempleas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(Profesion.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//profesionempleaLogic.setProfesionEmpleas(this.profesionempleas);
			profesionempleaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ProfesionEmpleaParameterReturnGeneral getProfesionEmpleaParameterGeneral() {
		return this.profesionempleaParameterGeneral;
	}
	
	public void setProfesionEmpleaParameterGeneral(ProfesionEmpleaParameterReturnGeneral profesionempleaParameterGeneral) {
		this.profesionempleaParameterGeneral = profesionempleaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProfesionEmplea() {
		return isPermisoTodoProfesionEmplea;
	}

	public void setIsPermisoTodoProfesionEmplea(Boolean isPermisoTodoProfesionEmplea) {
		this.isPermisoTodoProfesionEmplea = isPermisoTodoProfesionEmplea;
	}

	public Boolean getIsPermisoNuevoProfesionEmplea() {
		return isPermisoNuevoProfesionEmplea;
	}

	public void setIsPermisoNuevoProfesionEmplea(Boolean isPermisoNuevoProfesionEmplea) {
		this.isPermisoNuevoProfesionEmplea = isPermisoNuevoProfesionEmplea;
	}

	public Boolean getIsPermisoActualizarProfesionEmplea() {
		return isPermisoActualizarProfesionEmplea;
	}

	public void setIsPermisoActualizarProfesionEmplea(Boolean isPermisoActualizarProfesionEmplea) {
		this.isPermisoActualizarProfesionEmplea = isPermisoActualizarProfesionEmplea;
	}

	public Boolean getIsPermisoEliminarProfesionEmplea() {
		return isPermisoEliminarProfesionEmplea;
	}

	public void setIsPermisoEliminarProfesionEmplea(Boolean isPermisoEliminarProfesionEmplea) {
		this.isPermisoEliminarProfesionEmplea = isPermisoEliminarProfesionEmplea;
	}

	public Boolean getIsPermisoGuardarCambiosProfesionEmplea() {
		return isPermisoGuardarCambiosProfesionEmplea;
	}

	public void setIsPermisoGuardarCambiosProfesionEmplea(Boolean isPermisoGuardarCambiosProfesionEmplea) {
		this.isPermisoGuardarCambiosProfesionEmplea = isPermisoGuardarCambiosProfesionEmplea;
	}
	
	public Boolean getIsPermisoConsultaProfesionEmplea() {
		return isPermisoConsultaProfesionEmplea;
	}

	public void setIsPermisoConsultaProfesionEmplea(Boolean isPermisoConsultaProfesionEmplea) {
		this.isPermisoConsultaProfesionEmplea = isPermisoConsultaProfesionEmplea;
	}

	public Boolean getIsPermisoBusquedaProfesionEmplea() {
		return isPermisoBusquedaProfesionEmplea;
	}

	public void setIsPermisoBusquedaProfesionEmplea(Boolean isPermisoBusquedaProfesionEmplea) {
		this.isPermisoBusquedaProfesionEmplea = isPermisoBusquedaProfesionEmplea;
	}

	public Boolean getIsPermisoReporteProfesionEmplea() {
		return isPermisoReporteProfesionEmplea;
	}

	public void setIsPermisoReporteProfesionEmplea(Boolean isPermisoReporteProfesionEmplea) {
		this.isPermisoReporteProfesionEmplea = isPermisoReporteProfesionEmplea;
	}
	
	public Boolean getIsPermisoPaginacionMedioProfesionEmplea() {
		return isPermisoPaginacionMedioProfesionEmplea;
	}

	public void setIsPermisoPaginacionMedioProfesionEmplea(Boolean isPermisoPaginacionMedioProfesionEmplea) {
		this.isPermisoPaginacionMedioProfesionEmplea = isPermisoPaginacionMedioProfesionEmplea;
	}
	
	public Boolean getIsPermisoPaginacionTodoProfesionEmplea() {
		return isPermisoPaginacionTodoProfesionEmplea;
	}

	public void setIsPermisoPaginacionTodoProfesionEmplea(Boolean isPermisoPaginacionTodoProfesionEmplea) {
		this.isPermisoPaginacionTodoProfesionEmplea = isPermisoPaginacionTodoProfesionEmplea;
	}
	
	public Boolean getIsPermisoPaginacionAltoProfesionEmplea() {
		return isPermisoPaginacionAltoProfesionEmplea;
	}

	public void setIsPermisoPaginacionAltoProfesionEmplea(Boolean isPermisoPaginacionAltoProfesionEmplea) {
		this.isPermisoPaginacionAltoProfesionEmplea = isPermisoPaginacionAltoProfesionEmplea;
	}
	
	public Boolean getIsPermisoCopiarProfesionEmplea() {
		return isPermisoCopiarProfesionEmplea;
	}

	public void setIsPermisoCopiarProfesionEmplea(Boolean isPermisoCopiarProfesionEmplea) {
		this.isPermisoCopiarProfesionEmplea = isPermisoCopiarProfesionEmplea;
	}
	
	public Boolean getIsPermisoVerFormProfesionEmplea() {
		return isPermisoVerFormProfesionEmplea;
	}

	public void setIsPermisoVerFormProfesionEmplea(Boolean isPermisoVerFormProfesionEmplea) {
		this.isPermisoVerFormProfesionEmplea = isPermisoVerFormProfesionEmplea;
	}
	
	public Boolean getIsPermisoDuplicarProfesionEmplea() {
		return isPermisoDuplicarProfesionEmplea;
	}

	public void setIsPermisoDuplicarProfesionEmplea(Boolean isPermisoDuplicarProfesionEmplea) {
		this.isPermisoDuplicarProfesionEmplea = isPermisoDuplicarProfesionEmplea;
	}
	
	public Boolean getIsPermisoOrdenProfesionEmplea() {
		return isPermisoOrdenProfesionEmplea;
	}

	public void setIsPermisoOrdenProfesionEmplea(Boolean isPermisoOrdenProfesionEmplea) {
		this.isPermisoOrdenProfesionEmplea = isPermisoOrdenProfesionEmplea;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProfesionEmplea() {
		return isVisibilidadCeldaNuevoProfesionEmplea;
	}

	public void setIsVisibilidadCeldaNuevoProfesionEmplea(Boolean isVisibilidadCeldaNuevoProfesionEmplea) {
		this.isVisibilidadCeldaNuevoProfesionEmplea = isVisibilidadCeldaNuevoProfesionEmplea;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProfesionEmplea() {
		return isVisibilidadCeldaDuplicarProfesionEmplea;
	}

	public void setIsVisibilidadCeldaDuplicarProfesionEmplea(Boolean isVisibilidadCeldaDuplicarProfesionEmplea) {
		this.isVisibilidadCeldaDuplicarProfesionEmplea = isVisibilidadCeldaDuplicarProfesionEmplea;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProfesionEmplea() {
		return isVisibilidadCeldaCopiarProfesionEmplea;
	}

	public void setIsVisibilidadCeldaCopiarProfesionEmplea(Boolean isVisibilidadCeldaCopiarProfesionEmplea) {
		this.isVisibilidadCeldaCopiarProfesionEmplea = isVisibilidadCeldaCopiarProfesionEmplea;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProfesionEmplea() {
		return isVisibilidadCeldaVerFormProfesionEmplea;
	}

	public void setIsVisibilidadCeldaVerFormProfesionEmplea(Boolean isVisibilidadCeldaVerFormProfesionEmplea) {
		this.isVisibilidadCeldaVerFormProfesionEmplea = isVisibilidadCeldaVerFormProfesionEmplea;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProfesionEmplea() {
		return isVisibilidadCeldaOrdenProfesionEmplea;
	}

	public void setIsVisibilidadCeldaOrdenProfesionEmplea(Boolean isVisibilidadCeldaOrdenProfesionEmplea) {
		this.isVisibilidadCeldaOrdenProfesionEmplea = isVisibilidadCeldaOrdenProfesionEmplea;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProfesionEmplea() {
		return isVisibilidadCeldaNuevoRelacionesProfesionEmplea;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProfesionEmplea(Boolean isVisibilidadCeldaNuevoRelacionesProfesionEmplea) {
		this.isVisibilidadCeldaNuevoRelacionesProfesionEmplea = isVisibilidadCeldaNuevoRelacionesProfesionEmplea;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProfesionEmplea() {
		return isVisibilidadCeldaModificarProfesionEmplea;
	}

	public void setIsVisibilidadCeldaModificarProfesionEmplea(Boolean isVisibilidadCeldaModificarProfesionEmplea) {
		this.isVisibilidadCeldaModificarProfesionEmplea = isVisibilidadCeldaModificarProfesionEmplea;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProfesionEmplea() {
		return isVisibilidadCeldaActualizarProfesionEmplea;
	}

	public void setIsVisibilidadCeldaActualizarProfesionEmplea(Boolean isVisibilidadCeldaActualizarProfesionEmplea) {
		this.isVisibilidadCeldaActualizarProfesionEmplea = isVisibilidadCeldaActualizarProfesionEmplea;
	}

	public Boolean getIsVisibilidadCeldaEliminarProfesionEmplea() {
		return isVisibilidadCeldaEliminarProfesionEmplea;
	}

	public void setIsVisibilidadCeldaEliminarProfesionEmplea(Boolean isVisibilidadCeldaEliminarProfesionEmplea) {
		this.isVisibilidadCeldaEliminarProfesionEmplea = isVisibilidadCeldaEliminarProfesionEmplea;
	}

	public Boolean getIsVisibilidadCeldaCancelarProfesionEmplea() {
		return isVisibilidadCeldaCancelarProfesionEmplea;
	}

	public void setIsVisibilidadCeldaCancelarProfesionEmplea(Boolean isVisibilidadCeldaCancelarProfesionEmplea) {
		this.isVisibilidadCeldaCancelarProfesionEmplea = isVisibilidadCeldaCancelarProfesionEmplea;
	}

	public Boolean getIsVisibilidadCeldaGuardarProfesionEmplea() {
		return isVisibilidadCeldaGuardarProfesionEmplea;
	}

	public void setIsVisibilidadCeldaGuardarProfesionEmplea(Boolean isVisibilidadCeldaGuardarProfesionEmplea) {
		this.isVisibilidadCeldaGuardarProfesionEmplea = isVisibilidadCeldaGuardarProfesionEmplea;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProfesionEmplea() {
		return isVisibilidadCeldaGuardarCambiosProfesionEmplea;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProfesionEmplea(Boolean isVisibilidadCeldaGuardarCambiosProfesionEmplea) {
		this.isVisibilidadCeldaGuardarCambiosProfesionEmplea = isVisibilidadCeldaGuardarCambiosProfesionEmplea;
	}
		
	public ProfesionEmpleaSessionBean getprofesionempleaSessionBean() {
		return this.profesionempleaSessionBean;
	}
	
	public void setprofesionempleaSessionBean(ProfesionEmpleaSessionBean profesionempleaSessionBean) {
		this.profesionempleaSessionBean=profesionempleaSessionBean;
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

	public Boolean getisVisibilidadFK_IdProfesion() {
		return this.isVisibilidadFK_IdProfesion;
	}

	public void setisVisibilidadFK_IdProfesion(Boolean isVisibilidadFK_IdProfesion) {
		this.isVisibilidadFK_IdProfesion=isVisibilidadFK_IdProfesion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProfesionEmplea(ProfesionEmplea profesionemplea)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(profesionemplea,null);
				this.setActualParaGuardarEmpleadoForeignKey(profesionemplea,null);
				this.setActualParaGuardarProfesionForeignKey(profesionemplea,null);
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
	
	public void bugActualizarReferenciaActual(ProfesionEmplea profesionemplea,ProfesionEmplea profesionempleaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProfesionEmplea(profesionemplea);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		profesionempleaAux.setId(profesionemplea.getId());
		profesionempleaAux.setVersionRow(profesionemplea.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessProfesionEmplea();
		
			int intSelectedRow = this.jTableDatosProfesionEmplea.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionemplea =(ProfesionEmplea) this.profesionempleaLogic.getProfesionEmpleas().toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.profesionemplea =(ProfesionEmplea) this.profesionempleas.toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualProfesionEmplea(this.profesionemplea,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysProfesionEmplea(this.profesionemplea);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = profesionempleaValidator.getInvalidValues(this.profesionemplea);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			profesionempleaLogic.setDatosCliente(datosCliente);
			profesionempleaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				profesionempleaAux=new  ProfesionEmplea();
				
				profesionempleaAux.setIsNew(true);
				profesionempleaAux.setIsChanged(true);
				
				profesionempleaAux.setProfesionEmpleaOriginal(this.profesionemplea);
				
				profesionempleaAux.setId(this.profesionemplea.getId());	
				profesionempleaAux.setVersionRow(this.profesionemplea.getVersionRow());	
				profesionempleaAux.setid_empresa(this.profesionemplea.getid_empresa());	
				profesionempleaAux.setid_empleado(this.profesionemplea.getid_empleado());	
				profesionempleaAux.setid_profesion(this.profesionemplea.getid_profesion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.profesionempleaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.profesionempleaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(profesionempleaAux,profesionempleaLogic.getProfesionEmpleas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(profesionempleaAux,profesionempleas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.profesionempleaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.profesionempleaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						profesionempleaLogic.saveProfesionEmpleas();//WithConnection
						//profesionempleaLogic.getSetVersionRowProfesionEmpleas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.profesionemplea,profesionempleaAux);
					
					this.refrescarForeignKeysDescripcionesProfesionEmplea();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.profesionempleaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								profesionempleaLogic.saveProfesionEmpleaRelaciones(profesionempleaAux);//WithConnection
								//profesionempleaLogic.getSetVersionRowProfesionEmpleas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.profesionemplea,profesionempleaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.profesionempleaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.profesionempleaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(profesionempleaAux,profesionempleaLogic.getProfesionEmpleas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(profesionempleaAux,profesionempleas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.profesionemplea,profesionempleaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				profesionempleaAux=new  ProfesionEmplea();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.profesionempleaSessionBean.getEsGuardarRelacionado() 
					|| (this.profesionempleaSessionBean.getEsGuardarRelacionado() && this.profesionemplea.getId()>=0)) {
						
					profesionempleaAux.setIsNew(false);
				}
				
				profesionempleaAux.setIsDeleted(false);
			
				profesionempleaAux.setId(this.profesionemplea.getId());	
				profesionempleaAux.setVersionRow(this.profesionemplea.getVersionRow());	
				profesionempleaAux.setid_empresa(this.profesionemplea.getid_empresa());	
				profesionempleaAux.setid_empleado(this.profesionemplea.getid_empleado());	
				profesionempleaAux.setid_profesion(this.profesionemplea.getid_profesion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(profesionempleaAux,profesionempleaLogic.getProfesionEmpleas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(profesionempleaAux,profesionempleas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.profesionempleaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.profesionempleaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						profesionempleaLogic.saveProfesionEmpleas();//WithConnection
						//profesionempleaLogic.getSetVersionRowProfesionEmpleas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.profesionemplea,profesionempleaAux);
					
					this.refrescarForeignKeysDescripcionesProfesionEmplea();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.profesionempleaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								profesionempleaLogic.saveProfesionEmpleaRelaciones(profesionempleaAux);//WithConnection
								//profesionempleaLogic.getSetVersionRowProfesionEmpleas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.profesionemplea,profesionempleaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.profesionempleaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.profesionempleaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(profesionempleaAux,profesionempleaLogic.getProfesionEmpleas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(profesionempleaAux,profesionempleas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.profesionemplea,profesionempleaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				profesionempleaAux=new  ProfesionEmplea();
				
				profesionempleaAux.setIsNew(false);
				profesionempleaAux.setIsChanged(false);
				
				profesionempleaAux.setIsDeleted(true);
				
				profesionempleaAux.setId(this.profesionemplea.getId());	
				profesionempleaAux.setVersionRow(this.profesionemplea.getVersionRow());	
				profesionempleaAux.setid_empresa(this.profesionemplea.getid_empresa());	
				profesionempleaAux.setid_empleado(this.profesionemplea.getid_empleado());	
				profesionempleaAux.setid_profesion(this.profesionemplea.getid_profesion());	
				
				if(this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.profesionempleaAux.getId()>=0) {	
						this.profesionempleasEliminados.add(profesionempleaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(profesionempleaAux,profesionempleaLogic.getProfesionEmpleas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(profesionempleaAux,profesionempleas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.profesionempleaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.profesionempleaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						profesionempleaLogic.saveProfesionEmpleas();//WithConnection
						//profesionempleaLogic.getSetVersionRowProfesionEmpleas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.profesionempleaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								profesionempleaLogic.saveProfesionEmpleaRelaciones(profesionempleaAux);//WithConnection
								//profesionempleaLogic.getSetVersionRowProfesionEmpleas();//WithConnection
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
							if(this.profesionempleaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.profesionempleaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(profesionempleaAux,profesionempleaLogic.getProfesionEmpleas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(profesionempleaAux,profesionempleas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionempleaLogic.getProfesionEmpleas().addAll(this.profesionempleasEliminados);
					
					profesionempleaLogic.saveProfesionEmpleas();//WithConnection
					//profesionempleaLogic.getSetVersionRowProfesionEmpleas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesProfesionEmplea();
				
				this.profesionempleasEliminados= new ArrayList<ProfesionEmplea>();		
			}
			
			if(this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.profesionempleaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Profesion Emplea GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Profesion Emplea",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.profesionemplea=profesionempleaAux;
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
      		//this.finishProcessProfesionEmplea();
      	}
		
	}	
	
	public void actualizarRelaciones(ProfesionEmplea profesionempleaLocal) throws Exception {
		
		if(this.profesionempleaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProfesionEmplea profesionempleaLocal) throws Exception {	
		if(this.profesionempleaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				profesionempleaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				profesionempleaLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProfesionDetalleFormJInternalFrame.class)) {
				ProfesionBeanSwingJInternalFrame profesionBeanSwingJInternalFrameLocal=(ProfesionBeanSwingJInternalFrame) ((ProfesionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				profesionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProfesion(profesionBeanSwingJInternalFrameLocal.getprofesion(),true);
				profesionBeanSwingJInternalFrameLocal.actualizarLista(profesionBeanSwingJInternalFrameLocal.profesion,this.profesionsForeignKey);

				profesionBeanSwingJInternalFrameLocal.actualizarRelaciones(profesionBeanSwingJInternalFrameLocal.profesion);

				profesionempleaLocal.setProfesion(profesionBeanSwingJInternalFrameLocal.profesion);

				this.addItemDefectoCombosForeignKeyProfesion();
				this.cargarCombosFrameProfesionsForeignKey("Formulario");
				this.setActualProfesionForeignKey(profesionBeanSwingJInternalFrameLocal.profesion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProfesionEmpleaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProfesionEmplea.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.profesionemplea =(ProfesionEmplea) this.profesionempleaLogic.getProfesionEmpleas().toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.profesionemplea =(ProfesionEmplea) this.profesionempleas.toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = profesionempleaValidator.getInvalidValues(this.profesionemplea);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProfesionEmplea profesionemplea,List<ProfesionEmplea> profesionempleas) throws Exception {
		try	{		
			ProfesionEmpleaConstantesFunciones.actualizarLista(profesionemplea,profesionempleas,this.profesionempleaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ProfesionEmplea profesionemplea,List<ProfesionEmplea> profesionempleas) throws Exception {
		try	{			
			ProfesionEmpleaConstantesFunciones.actualizarSelectedLista(profesionemplea,profesionempleas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProfesionEmplea> profesionempleasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				profesionempleasLocal=this.profesionempleaLogic.getProfesionEmpleas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				profesionempleasLocal=this.profesionempleas;
			}
			//ARCHITECTURE
		
			for(ProfesionEmplea profesionempleaLocal:profesionempleasLocal) {
				if(this.permiteMantenimiento(profesionempleaLocal) && profesionempleaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProfesionEmpleaConstantesFunciones.getProfesionEmpleaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProfesionEmpleaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProfesionEmplea.jLabelid_empresaProfesionEmplea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProfesionEmpleaConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProfesionEmplea.jLabelid_empleadoProfesionEmplea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProfesionEmpleaConstantesFunciones.IDPROFESION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProfesionEmplea.jLabelid_profesionProfesionEmplea,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProfesionEmplea.jLabelid_empresaProfesionEmplea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProfesionEmplea.jLabelid_empleadoProfesionEmplea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProfesionEmplea.jLabelid_profesionProfesionEmplea,"");
		
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
		this.iIdNuevoProfesionEmplea--;	
		
		
		this.profesionempleaAux=new ProfesionEmplea();
		
		this.profesionempleaAux.setId(this.iIdNuevoProfesionEmplea);
		this.profesionempleaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.profesionempleaLogic.getProfesionEmpleas().add(this.profesionempleaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.profesionempleas.add(this.profesionempleaAux);
		}
		//ARCHITECTURE
		
		this.profesionemplea=this.profesionempleaAux;
		
		if(ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProfesionEmplea(this.profesionemplea);
			this.setVariablesObjetoActualToFormularioForeignKeyProfesionEmplea(this.profesionemplea);
		}
				
		//this.setDefaultControlesProfesionEmplea();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProfesionEmplea();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProfesionEmplea();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProfesionEmplea();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProfesionEmplea(this.profesionempleaBean,this.profesionemplea,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProfesionEmplea(this.profesionemplea);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.profesionempleaSessionBean.getConGuardarRelaciones()) {
			classes=ProfesionEmpleaConstantesFunciones.getClassesRelationshipsOfProfesionEmplea(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.profesionempleaReturnGeneral=profesionempleaLogic.procesarEventosProfesionEmpleasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.profesionempleaLogic.getProfesionEmpleas(),this.profesionemplea,this.profesionempleaParameterGeneral,this.isEsNuevoProfesionEmplea,classes);//this.profesionempleaLogic.getProfesionEmplea()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProfesionEmplea(this.profesionempleaReturnGeneral,this.profesionempleaBean,false);
		
		if(this.profesionempleaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProfesionEmplea(this.profesionempleaReturnGeneral.getProfesionEmplea());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProfesionEmplea(this.profesionempleaReturnGeneral.getProfesionEmplea());
		}
		
		if(this.profesionempleaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProfesionEmplea(this.profesionempleaReturnGeneral.getProfesionEmplea(),classes);//this.profesionempleaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProfesionEmplea(this.profesionemplea,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProfesionEmplea();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProfesionEmplea();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProfesionEmpleaBeanSwingJInternalFrameAdditional.RecargarFormProfesionEmplea(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProfesionEmplea(false);
						
			if(profesionempleaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProfesionEmplea();
			}
			
			this.actualizarVisualTableDatosProfesionEmplea();
			
			this.jTableDatosProfesionEmplea.setRowSelectionInterval(this.getIndiceNuevoProfesionEmplea(), this.getIndiceNuevoProfesionEmplea());
			
			this.seleccionarFilaTablaProfesionEmpleaActual();
						
			this.actualizarEstadoCeldasBotonesProfesionEmplea("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProfesionEmplea(Boolean isHabilitar) throws Exception {
			
		//
		this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empresaProfesionEmplea.setEnabled(isHabilitar && this.profesionempleaConstantesFunciones.activarid_empresaProfesionEmplea);
		this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empleadoProfesionEmplea.setEnabled(isHabilitar && this.profesionempleaConstantesFunciones.activarid_empleadoProfesionEmplea);
		this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_profesionProfesionEmplea.setEnabled(isHabilitar && this.profesionempleaConstantesFunciones.activarid_profesionProfesionEmplea);
	};
	
	public void setDefaultControlesProfesionEmplea() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProfesionEmplea(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.profesionempleaSessionBean.setConGuardarRelaciones(true);			
			this.profesionempleaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProfesionEmplea.jTabbedPaneRelacionesProfesionEmplea.setVisible(true);
			
					
		} else {
			//this.profesionempleaSessionBean.setConGuardarRelaciones(false);			
			this.profesionempleaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProfesionEmplea.jTabbedPaneRelacionesProfesionEmplea.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProfesionEmplea() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProfesionEmplea profesionempleaAux:this.profesionempleaLogic.getProfesionEmpleas()) {
				if(profesionempleaAux.getId().equals(this.iIdNuevoProfesionEmplea)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProfesionEmplea profesionempleaAux:this.profesionempleas) {
				if(profesionempleaAux.getId().equals(this.iIdNuevoProfesionEmplea)) {
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
	
	public int getIndiceActualProfesionEmplea(ProfesionEmplea profesionemplea,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProfesionEmplea profesionempleaAux:this.profesionempleaLogic.getProfesionEmpleas()) {
				if(profesionempleaAux.getId().equals(profesionemplea.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProfesionEmplea profesionempleaAux:this.profesionempleas) {
				if(profesionempleaAux.getId().equals(profesionemplea.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProfesionEmplea(ProfesionEmplea profesionempleaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProfesionEmplea profesionempleaAux:this.profesionempleaLogic.getProfesionEmpleas()) {
				if(profesionempleaAux.getProfesionEmpleaOriginal().getId().equals(profesionempleaOriginal.getId())) {
					existe=true;
					profesionempleaOriginal.setId(profesionempleaAux.getId());
					profesionempleaOriginal.setVersionRow(profesionempleaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProfesionEmplea profesionempleaAux:this.profesionempleas) {
				if(profesionempleaAux.getProfesionEmpleaOriginal().getId().equals(profesionempleaOriginal.getId())) {
					existe=true;
					profesionempleaOriginal.setId(profesionempleaAux.getId());
					profesionempleaOriginal.setVersionRow(profesionempleaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProfesionEmplea(Boolean esParaCancelar) throws Exception {
		profesionempleasAux=new ArrayList<ProfesionEmplea>();
		profesionempleaAux=new ProfesionEmplea();
		
		if(!this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProfesionEmplea profesionempleaAux:this.profesionempleaLogic.getProfesionEmpleas()) {
					if(profesionempleaAux.getId()<0) {
						profesionempleasAux.add(profesionempleaAux);
					}		
				}
				this.iIdNuevoProfesionEmplea=0L;
				this.profesionempleaLogic.getProfesionEmpleas().removeAll(profesionempleasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProfesionEmplea profesionempleaAux:this.profesionempleas) {
					if(profesionempleaAux.getId()<0) {
						profesionempleasAux.add(profesionempleaAux);
					}		
				}
				this.iIdNuevoProfesionEmplea=0L;
				this.profesionempleas.removeAll(profesionempleasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProfesionEmplea 
					&& this.profesionempleaLogic.getProfesionEmpleas().size()>0
					) {
					profesionempleaAux=this.profesionempleaLogic.getProfesionEmpleas().get(this.profesionempleaLogic.getProfesionEmpleas().size() - 1);
				
					if(profesionempleaAux.getId()<0) {
						this.profesionempleaLogic.getProfesionEmpleas().remove(profesionempleaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProfesionEmplea && this.profesionempleas.size()>0) {
					profesionempleaAux=this.profesionempleas.get(this.profesionempleas.size() - 1);
				
					if(profesionempleaAux.getId()<0) {
						this.profesionempleas.remove(profesionempleaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProfesionEmplea(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(profesionemplea.getId()<0) {
				this.profesionempleaLogic.getProfesionEmpleas().remove(this.profesionemplea);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(profesionemplea.getId()<0) {
				this.profesionempleas.remove(this.profesionemplea);
			}
		}			
	}
	
	public void setEstadosInicialesProfesionEmplea(List<ProfesionEmplea> profesionempleasAux) throws Exception {
		ProfesionEmpleaConstantesFunciones.setEstadosInicialesProfesionEmplea(profesionempleasAux);
	}
	
	public void setEstadosInicialesProfesionEmplea(ProfesionEmplea profesionempleaAux) throws Exception {
		ProfesionEmpleaConstantesFunciones.setEstadosInicialesProfesionEmplea(profesionempleaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProfesionEmpleaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProfesionEmplea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProfesionEmpleaActual()) {
				if(!this.isEsNuevoProfesionEmplea) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProfesionEmplea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProfesionEmplea=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProfesionEmpleaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Profesion Emplea ?", "MANTENIMIENTO DE Profesion Emplea", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProfesionEmplea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProfesionEmplea profesionemplea) throws Exception {
		ProfesionEmpleaConstantesFunciones.seleccionarAsignar(this.profesionemplea,profesionemplea);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProfesionEmplea=this.isPermisoActualizarOriginalProfesionEmplea;
			
			
			this.seleccionarAsignar(profesionemplea);
			
			

			idEmpleadoActual=profesionemplea.getid_empleado();
			this.seleccionarEmpleadoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProfesionEmpleaConstantesFunciones.quitarEspaciosProfesionEmplea(this.profesionemplea,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesProfesionEmplea("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.profesionempleaSessionBean.setsFuncionBusquedaRapida(this.profesionempleaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoProfesionEmplea) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProfesionEmplea(esParaCancelar);				
				this.cancelarNuevoProfesionEmplea(esParaCancelar);								
			}
			
			this.profesionemplea=new ProfesionEmplea();
			
			this.inicializarProfesionEmplea();
			
			this.actualizarEstadoCeldasBotonesProfesionEmplea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProfesionEmplea() throws Exception {
		try {
			ProfesionEmpleaConstantesFunciones.inicializarProfesionEmplea(this.profesionemplea);
			
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
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.profesionempleaLogic.getProfesionEmpleas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProfesionEmpleas(String sAccionBusqueda,List<ProfesionEmplea> profesionempleasParaReportes) throws Exception {
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
					sPathReporteFinal="ProfesionEmplea"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProfesionEmpleaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProfesionEmpleaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProfesionEmplea"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Profesion Empleas");		
		parameters.put("busquedapor", ProfesionEmpleaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProfesionEmplea=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProfesionEmpleaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProfesionEmpleaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProfesionEmplea=new JRBeanArrayDataSource(ProfesionEmpleaJInternalFrame.TraerProfesionEmpleaBeans(profesionempleasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProfesionEmplea);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProfesionEmpleaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProfesionEmpleaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProfesionEmpleaBean.TraerProfesionEmpleaBeans(profesionempleasParaReportes).toArray()));
							
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
				this.generarExcelReporteProfesionEmpleas(sAccionBusqueda,sTipoArchivoReporte,profesionempleasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProfesionEmpleas(sAccionBusqueda,sTipoArchivoReporte,profesionempleasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProfesionEmpleaActionPerformed(null);
					//this.generarExcelReporteProfesionEmpleas(sAccionBusqueda,sTipoArchivoReporte,profesionempleasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProfesionEmpleas(sAccionBusqueda,sTipoArchivoReporte,profesionempleasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProfesionEmpleas(sAccionBusqueda,sTipoArchivoReporte,profesionempleasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProfesionEmpleas(sAccionBusqueda,sTipoArchivoReporte,profesionempleasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProfesionEmpleas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProfesionEmplea> profesionempleasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"profesionemplea";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProfesionEmpleas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProfesionEmplea("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProfesionEmplea profesionemplea : profesionempleasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProfesionEmpleaConstantesFunciones.generarExcelReporteDataProfesionEmplea("NORMAL",row,workbook,profesionemplea,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.profesionempleaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Profesion Emplea",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProfesionEmplea(String sTipo,Row row,Workbook workbook) {
		
		ProfesionEmpleaConstantesFunciones.generarExcelReporteHeaderProfesionEmplea(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProfesionEmpleas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProfesionEmplea> profesionempleasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"profesionemplea_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProfesionEmpleas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProfesionEmplea profesionemplea : profesionempleasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProfesionEmpleaConstantesFunciones.getProfesionEmpleaDescripcion(profesionemplea));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProfesionEmpleaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProfesionEmpleaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(profesionemplea.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProfesionEmpleaConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProfesionEmpleaConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(profesionemplea.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProfesionEmpleaConstantesFunciones.LABEL_IDPROFESION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProfesionEmpleaConstantesFunciones.LABEL_IDPROFESION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(profesionemplea.getprofesion_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.profesionempleaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Profesion Emplea",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProfesionEmpleas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProfesionEmplea> profesionempleasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProfesionEmplea> profesionempleasRespaldo=null;
		
		classes=ProfesionEmpleaConstantesFunciones.getClassesRelationshipsOfProfesionEmplea(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.profesionempleaLogic.setDatosCliente(this.datosCliente);
		this.profesionempleaLogic.setDatosDeep(this.datosDeep);
		this.profesionempleaLogic.setIsConDeep(true);
		
		profesionempleasRespaldo=this.profesionempleaLogic.getProfesionEmpleas();
		
		this.profesionempleaLogic.setProfesionEmpleas(profesionempleasParaReportes);	
		this.profesionempleaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		profesionempleasParaReportes=this.profesionempleaLogic.getProfesionEmpleas();
		this.profesionempleaLogic.setProfesionEmpleas(profesionempleasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"profesionemplea_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProfesionEmpleas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProfesionEmplea("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProfesionEmplea profesionemplea : profesionempleasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProfesionEmplea("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProfesionEmpleaConstantesFunciones.generarExcelReporteDataProfesionEmplea("NORMAL",row,workbook,profesionemplea,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProfesionEmpleaConstantesFunciones.getProfesionEmpleaDescripcion(profesionemplea));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.profesionempleaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Profesion Emplea",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProfesionEmplea.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProfesionEmplea.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProfesionEmplea.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProfesionEmplea.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProfesionEmplea() throws Exception {		
		this.startProcessProfesionEmplea(true);
	}
	
	public void startProcessProfesionEmplea(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProfesionEmplea ,this.jPanelParametrosReportesProfesionEmplea, this.jScrollPanelDatosProfesionEmplea,this.jPanelPaginacionProfesionEmplea, this.jScrollPanelDatosEdicionProfesionEmplea, this.jPanelAccionesProfesionEmplea,this.jPanelAccionesFormularioProfesionEmplea,this.jmenuBarProfesionEmplea,this.jmenuBarDetalleProfesionEmplea,this.jTtoolBarProfesionEmplea,this.jTtoolBarDetalleProfesionEmplea);		
		
		final JTabbedPane jTabbedPaneBusquedasProfesionEmplea=this.jTabbedPaneBusquedasProfesionEmplea; 
		
		final JPanel jPanelParametrosReportesProfesionEmplea=this.jPanelParametrosReportesProfesionEmplea;
		//final JScrollPane jScrollPanelDatosProfesionEmplea=this.jScrollPanelDatosProfesionEmplea;
		final JTable jTableDatosProfesionEmplea=this.jTableDatosProfesionEmplea;		
		final JPanel jPanelPaginacionProfesionEmplea=this.jPanelPaginacionProfesionEmplea;
		//final JScrollPane jScrollPanelDatosEdicionProfesionEmplea=this.jScrollPanelDatosEdicionProfesionEmplea;
		final JPanel jPanelAccionesProfesionEmplea=this.jPanelAccionesProfesionEmplea;
		
		JPanel jPanelCamposAuxiliarProfesionEmplea=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProfesionEmplea=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
			jPanelCamposAuxiliarProfesionEmplea=this.jInternalFrameDetalleFormProfesionEmplea.jPanelCamposProfesionEmplea;
			jPanelAccionesFormularioAuxiliarProfesionEmplea=this.jInternalFrameDetalleFormProfesionEmplea.jPanelAccionesFormularioProfesionEmplea;
		}
		
		final JPanel jPanelCamposProfesionEmplea=jPanelCamposAuxiliarProfesionEmplea;
		final JPanel jPanelAccionesFormularioProfesionEmplea=jPanelAccionesFormularioAuxiliarProfesionEmplea;
		
		
		final JMenuBar jmenuBarProfesionEmplea=this.jmenuBarProfesionEmplea;
		final JToolBar jTtoolBarProfesionEmplea=this.jTtoolBarProfesionEmplea;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProfesionEmplea=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProfesionEmplea=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
			jmenuBarDetalleAuxiliarProfesionEmplea=this.jInternalFrameDetalleFormProfesionEmplea.jmenuBarDetalleProfesionEmplea;
			jTtoolBarDetalleAuxiliarProfesionEmplea=this.jInternalFrameDetalleFormProfesionEmplea.jTtoolBarDetalleProfesionEmplea;
		}
		
		final JMenuBar jmenuBarDetalleProfesionEmplea=jmenuBarDetalleAuxiliarProfesionEmplea;
		final JToolBar jTtoolBarDetalleProfesionEmplea=jTtoolBarDetalleAuxiliarProfesionEmplea;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProfesionEmplea;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProfesionEmplea;
			processRunnable.jTableDatos=jTableDatosProfesionEmplea;
			processRunnable.jPanelCampos=jPanelCamposProfesionEmplea;
			processRunnable.jPanelPaginacion=jPanelPaginacionProfesionEmplea;
			processRunnable.jPanelAcciones=jPanelAccionesProfesionEmplea;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProfesionEmplea;
			
			
			processRunnable.jmenuBar=jmenuBarProfesionEmplea;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProfesionEmplea;
			processRunnable.jTtoolBar=jTtoolBarProfesionEmplea;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProfesionEmplea;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProfesionEmplea ,jPanelParametrosReportesProfesionEmplea,jTableDatosProfesionEmplea, /*jScrollPanelDatosProfesionEmplea,*/jPanelCamposProfesionEmplea,jPanelPaginacionProfesionEmplea, /*jScrollPanelDatosEdicionProfesionEmplea,*/ jPanelAccionesProfesionEmplea,jPanelAccionesFormularioProfesionEmplea,jmenuBarProfesionEmplea,jmenuBarDetalleProfesionEmplea,jTtoolBarProfesionEmplea,jTtoolBarDetalleProfesionEmplea);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProfesionEmplea ,jPanelParametrosReportesProfesionEmplea, jScrollPanelDatosProfesionEmplea,jPanelPaginacionProfesionEmplea, jScrollPanelDatosEdicionProfesionEmplea, jPanelAccionesProfesionEmplea,jPanelAccionesFormularioProfesionEmplea,jmenuBarProfesionEmplea,jmenuBarDetalleProfesionEmplea,jTtoolBarProfesionEmplea,jTtoolBarDetalleProfesionEmplea);
						
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
	
	public void finishProcessProfesionEmplea() {// throws Exception 
		this.finishProcessProfesionEmplea(true);
	}
	
	public void finishProcessProfesionEmplea(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProfesionEmplea ,this.jPanelParametrosReportesProfesionEmplea, this.jScrollPanelDatosProfesionEmplea,this.jPanelPaginacionProfesionEmplea, this.jScrollPanelDatosEdicionProfesionEmplea, this.jPanelAccionesProfesionEmplea,this.jPanelAccionesFormularioProfesionEmplea,this.jmenuBarProfesionEmplea,this.jmenuBarDetalleProfesionEmplea,this.jTtoolBarProfesionEmplea,this.jTtoolBarDetalleProfesionEmplea);		
		
		final JTabbedPane jTabbedPaneBusquedasProfesionEmplea=this.jTabbedPaneBusquedasProfesionEmplea; 
		
		final JPanel jPanelParametrosReportesProfesionEmplea=this.jPanelParametrosReportesProfesionEmplea;
		//final JScrollPane jScrollPanelDatosProfesionEmplea=this.jScrollPanelDatosProfesionEmplea;
		final JTable jTableDatosProfesionEmplea=this.jTableDatosProfesionEmplea;		
		final JPanel jPanelPaginacionProfesionEmplea=this.jPanelPaginacionProfesionEmplea;
		//final JScrollPane jScrollPanelDatosEdicionProfesionEmplea=this.jScrollPanelDatosEdicionProfesionEmplea;
		final JPanel jPanelAccionesProfesionEmplea=this.jPanelAccionesProfesionEmplea;
		
		JPanel jPanelCamposAuxiliarProfesionEmplea=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProfesionEmplea=new JPanel();
		
		if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
			jPanelCamposAuxiliarProfesionEmplea=this.jInternalFrameDetalleFormProfesionEmplea.jPanelCamposProfesionEmplea;
			jPanelAccionesFormularioAuxiliarProfesionEmplea=this.jInternalFrameDetalleFormProfesionEmplea.jPanelAccionesFormularioProfesionEmplea;
		}
		
		final JPanel jPanelCamposProfesionEmplea=jPanelCamposAuxiliarProfesionEmplea;
		final JPanel jPanelAccionesFormularioProfesionEmplea=jPanelAccionesFormularioAuxiliarProfesionEmplea;
		
		
		final JMenuBar jmenuBarProfesionEmplea=this.jmenuBarProfesionEmplea;		
		final JToolBar jTtoolBarProfesionEmplea=this.jTtoolBarProfesionEmplea;
				
		JMenuBar jmenuBarDetalleAuxiliarProfesionEmplea=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProfesionEmplea=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
			jmenuBarDetalleAuxiliarProfesionEmplea=this.jInternalFrameDetalleFormProfesionEmplea.jmenuBarDetalleProfesionEmplea;
			jTtoolBarDetalleAuxiliarProfesionEmplea=this.jInternalFrameDetalleFormProfesionEmplea.jTtoolBarDetalleProfesionEmplea;		
		}
		
		final JMenuBar jmenuBarDetalleProfesionEmplea=jmenuBarDetalleAuxiliarProfesionEmplea;
		final JToolBar jTtoolBarDetalleProfesionEmplea=jTtoolBarDetalleAuxiliarProfesionEmplea;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProfesionEmplea;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProfesionEmplea;
			processRunnable.jTableDatos=jTableDatosProfesionEmplea;
			processRunnable.jPanelCampos=jPanelCamposProfesionEmplea;
			processRunnable.jPanelPaginacion=jPanelPaginacionProfesionEmplea;
			processRunnable.jPanelAcciones=jPanelAccionesProfesionEmplea;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProfesionEmplea;
			
			
			processRunnable.jmenuBar=jmenuBarProfesionEmplea;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProfesionEmplea;
			processRunnable.jTtoolBar=jTtoolBarProfesionEmplea;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProfesionEmplea;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProfesionEmplea ,jPanelParametrosReportesProfesionEmplea, jTableDatosProfesionEmplea,/*jScrollPanelDatosProfesionEmplea,*/jPanelCamposProfesionEmplea,jPanelPaginacionProfesionEmplea, /*jScrollPanelDatosEdicionProfesionEmplea,*/ jPanelAccionesProfesionEmplea,jPanelAccionesFormularioProfesionEmplea,jmenuBarProfesionEmplea,jmenuBarDetalleProfesionEmplea,jTtoolBarProfesionEmplea,jTtoolBarDetalleProfesionEmplea));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProfesionEmplea(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProfesionEmplea(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProfesionEmplea(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProfesionEmplea(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProfesionEmplea,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProfesionEmplea,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProfesionEmplea(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProfesionEmplea,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProfesionEmplea,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.profesionempleaConstantesFunciones.getsFinalQueryProfesionEmplea();
		String  finalQueryPaginacionTodos=this.profesionempleaConstantesFunciones.getsFinalQueryProfesionEmplea();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProfesionEmpleaConstantesFunciones.getArrayColumnasGlobalesNoProfesionEmplea(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProfesionEmpleaConstantesFunciones.getArrayColumnasGlobalesProfesionEmplea(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProfesionEmpleaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.profesionempleasEliminados= new ArrayList<ProfesionEmplea>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProfesionEmplea();
		
				///*ProfesionEmpleaSessionBean*/this.profesionempleaSessionBean=new ProfesionEmpleaSessionBean();
			
			if(this.profesionempleaSessionBean==null) {
				this.profesionempleaSessionBean=new ProfesionEmpleaSessionBean();
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
					this.iNumeroPaginacion=ProfesionEmpleaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProfesionEmpleaConstantesFunciones.getClassesForeignKeysOfProfesionEmplea(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/profesionemplea."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			profesionempleasAux= new ArrayList<ProfesionEmplea>();
			
				
			profesionempleaLogic.setDatosCliente(this.datosCliente);
			profesionempleaLogic.setDatosDeep(this.datosDeep);
			profesionempleaLogic.setIsConDeep(true);
			
			
			profesionempleaLogic.getProfesionEmpleaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					profesionempleaLogic.getTodosProfesionEmpleas(finalQueryGlobal,pagination);
					
					//profesionempleaLogic.getTodosProfesionEmpleasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(profesionempleaLogic.getProfesionEmpleas()==null|| profesionempleaLogic.getProfesionEmpleas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							profesionempleasAux= new ArrayList<ProfesionEmplea>();
							profesionempleasAux.addAll(profesionempleaLogic.getProfesionEmpleas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							profesionempleasAux= new ArrayList<ProfesionEmplea>();
							profesionempleasAux.addAll(profesionempleas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							profesionempleaLogic.getTodosProfesionEmpleas(finalQueryGlobal+"",this.pagination);												
							
							//profesionempleaLogic.getTodosProfesionEmpleasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteProfesionEmpleas("Todos",profesionempleaLogic.getProfesionEmpleas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							profesionempleaLogic.setProfesionEmpleas(new ArrayList<ProfesionEmplea>());					
							profesionempleaLogic.getProfesionEmpleas().addAll(profesionempleasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							profesionempleas=new ArrayList<ProfesionEmplea>();
							profesionempleas.addAll(profesionempleasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idProfesionEmplea=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idProfesionEmplea=this.idActual;
				
				} else if(this.idProfesionEmpleaActual!=null && this.idProfesionEmpleaActual!=0L) {
					idProfesionEmplea=idProfesionEmpleaActual;
				}
				
					
				this.sDetalleReporte=ProfesionEmpleaConstantesFunciones.getDetalleIndicePorId(idProfesionEmplea);
				
				this.profesionempleas=new ArrayList<ProfesionEmplea>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					profesionempleaLogic.getEntity(idProfesionEmplea);
					
					//profesionempleaLogic.getEntityWithConnection(idProfesionEmplea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					profesionempleaLogic.setProfesionEmpleas(new ArrayList<ProfesionEmplea>());
					profesionempleaLogic.getProfesionEmpleas().add(profesionempleaLogic.getProfesionEmplea());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.profesionempleas=new ArrayList<ProfesionEmplea>();
					this.profesionempleas.add(profesionemplea);
				}
				
				if(profesionempleaLogic.getProfesionEmplea()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=ProfesionEmpleaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					profesionempleaLogic.getProfesionEmpleasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProfesionEmpleaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProfesionEmpleaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=profesionempleaLogic.getProfesionEmpleas()==null||profesionempleaLogic.getProfesionEmpleas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=profesionempleas==null|| profesionempleas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						profesionempleasAux=new ArrayList<ProfesionEmplea>();
						profesionempleasAux.addAll(profesionempleaLogic.getProfesionEmpleas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							profesionempleasAux=new ArrayList<ProfesionEmplea>();
							profesionempleasAux.addAll(profesionempleas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							profesionempleaLogic.getProfesionEmpleasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProfesionEmpleaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProfesionEmpleaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProfesionEmpleas("FK_IdEmpleado",profesionempleaLogic.getProfesionEmpleas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProfesionEmpleas("FK_IdEmpleado",profesionempleas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						profesionempleaLogic.setProfesionEmpleas(new ArrayList<ProfesionEmplea>());
						profesionempleaLogic.getProfesionEmpleas().addAll(profesionempleasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							profesionempleas=new ArrayList<ProfesionEmplea>();
							profesionempleas.addAll(profesionempleasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ProfesionEmpleaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					profesionempleaLogic.getProfesionEmpleasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProfesionEmpleaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProfesionEmpleaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=profesionempleaLogic.getProfesionEmpleas()==null||profesionempleaLogic.getProfesionEmpleas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=profesionempleas==null|| profesionempleas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						profesionempleasAux=new ArrayList<ProfesionEmplea>();
						profesionempleasAux.addAll(profesionempleaLogic.getProfesionEmpleas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							profesionempleasAux=new ArrayList<ProfesionEmplea>();
							profesionempleasAux.addAll(profesionempleas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							profesionempleaLogic.getProfesionEmpleasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProfesionEmpleaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProfesionEmpleaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProfesionEmpleas("FK_IdEmpresa",profesionempleaLogic.getProfesionEmpleas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProfesionEmpleas("FK_IdEmpresa",profesionempleas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						profesionempleaLogic.setProfesionEmpleas(new ArrayList<ProfesionEmplea>());
						profesionempleaLogic.getProfesionEmpleas().addAll(profesionempleasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							profesionempleas=new ArrayList<ProfesionEmplea>();
							profesionempleas.addAll(profesionempleasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProfesion")) {
				this.sDetalleReporte=ProfesionEmpleaConstantesFunciones.getDetalleIndiceFK_IdProfesion(id_profesionFK_IdProfesion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					profesionempleaLogic.getProfesionEmpleasFK_IdProfesion(finalQueryGlobal,pagination,id_profesionFK_IdProfesion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProfesionEmpleaConstantesFunciones.getDetalleIndiceFK_IdProfesion(id_profesionFK_IdProfesion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProfesionEmpleaConstantesFunciones.getDetalleIndiceFK_IdProfesion(id_profesionFK_IdProfesion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=profesionempleaLogic.getProfesionEmpleas()==null||profesionempleaLogic.getProfesionEmpleas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=profesionempleas==null|| profesionempleas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						profesionempleasAux=new ArrayList<ProfesionEmplea>();
						profesionempleasAux.addAll(profesionempleaLogic.getProfesionEmpleas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							profesionempleasAux=new ArrayList<ProfesionEmplea>();
							profesionempleasAux.addAll(profesionempleas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							profesionempleaLogic.getProfesionEmpleasFK_IdProfesion(finalQueryGlobal,pagination,id_profesionFK_IdProfesion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProfesionEmpleaConstantesFunciones.getDetalleIndiceFK_IdProfesion(id_profesionFK_IdProfesion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProfesionEmpleaConstantesFunciones.getDetalleIndiceFK_IdProfesion(id_profesionFK_IdProfesion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProfesionEmpleas("FK_IdProfesion",profesionempleaLogic.getProfesionEmpleas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProfesionEmpleas("FK_IdProfesion",profesionempleas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						profesionempleaLogic.setProfesionEmpleas(new ArrayList<ProfesionEmplea>());
						profesionempleaLogic.getProfesionEmpleas().addAll(profesionempleasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							profesionempleas=new ArrayList<ProfesionEmplea>();
							profesionempleas.addAll(profesionempleasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProfesionEmplea();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProfesionEmplea();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=profesionempleaLogic.getProfesionEmpleas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=profesionempleas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=profesionempleaLogic.getProfesionEmpleas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=profesionempleas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProfesionEmplea profesionemplea) {
		Boolean permite=true;
		
		if(this.profesionemplea.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProfesionEmpleaConstantesFunciones.getOrderByListaProfesionEmplea();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProfesionEmpleaConstantesFunciones.getOrderByListaProfesionEmplea();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProfesionEmplea profesionemplea:profesionempleaLogic.getProfesionEmpleas()) {
				if(profesionemplea.getsType().equals(Constantes2.S_TOTALES)) {
					profesionempleaTotales=profesionemplea;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProfesionEmplea profesionemplea:this.profesionempleas) {
				if(profesionemplea.getsType().equals(Constantes2.S_TOTALES)) {
					profesionempleaTotales=profesionemplea;
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
			this.profesionempleaAux=new ProfesionEmplea();
			this.profesionempleaAux.setsType(Constantes2.S_TOTALES);
			this.profesionempleaAux.setIsNew(false);
			this.profesionempleaAux.setIsChanged(false);
			this.profesionempleaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ProfesionEmpleaConstantesFunciones.TotalizarValoresFilaProfesionEmplea(this.profesionempleaLogic.getProfesionEmpleas(),this.profesionempleaAux);
				
				this.profesionempleaLogic.getProfesionEmpleas().add(this.profesionempleaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProfesionEmpleaConstantesFunciones.TotalizarValoresFilaProfesionEmplea(this.profesionempleas,this.profesionempleaAux);
				
				this.profesionempleas.add(this.profesionempleaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		profesionempleaTotales=new ProfesionEmplea();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.profesionempleaLogic.getProfesionEmpleas().remove(profesionempleaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.profesionempleas.remove(profesionempleaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		profesionempleaTotales=new ProfesionEmplea();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProfesionEmplea profesionemplea:profesionempleaLogic.getProfesionEmpleas()) {
				if(profesionemplea.getsType().equals(Constantes2.S_TOTALES)) {
					profesionempleaTotales=profesionemplea;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProfesionEmpleaConstantesFunciones.TotalizarValoresFilaProfesionEmplea(this.profesionempleaLogic.getProfesionEmpleas(),profesionempleaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProfesionEmplea profesionemplea:this.profesionempleas) {
				if(profesionemplea.getsType().equals(Constantes2.S_TOTALES)) {
					profesionempleaTotales=profesionemplea;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProfesionEmpleaConstantesFunciones.TotalizarValoresFilaProfesionEmplea(this.profesionempleas,profesionempleaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProfesionEmpleasFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProfesionEmpleasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProfesionEmpleasFK_IdProfesion()throws Exception {
		try {
			sAccionBusqueda="FK_IdProfesion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProfesionEmpleasFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					profesionempleaLogic.getProfesionEmpleasFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProfesionEmpleasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					profesionempleaLogic.getProfesionEmpleasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProfesionEmpleasFK_IdProfesion(String sFinalQuery,Long id_profesion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					profesionempleaLogic.getProfesionEmpleasFK_IdProfesion(sFinalQuery,this.pagination,id_profesion);
				
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
	
	public void inicializarPermisosProfesionEmplea() {
		this.isPermisoTodoProfesionEmplea=false;
		this.isPermisoNuevoProfesionEmplea=false;
		this.isPermisoActualizarProfesionEmplea=false;
		this.isPermisoActualizarOriginalProfesionEmplea=false;
		this.isPermisoEliminarProfesionEmplea=false;
		this.isPermisoGuardarCambiosProfesionEmplea=false;
		this.isPermisoConsultaProfesionEmplea=false;
		this.isPermisoBusquedaProfesionEmplea=false;
		this.isPermisoReporteProfesionEmplea=false;		
		this.isPermisoOrdenProfesionEmplea=false;		
		this.isPermisoPaginacionMedioProfesionEmplea=false;		
		this.isPermisoPaginacionAltoProfesionEmplea=false;
		this.isPermisoPaginacionTodoProfesionEmplea=false;
		this.isPermisoCopiarProfesionEmplea=false;		
		this.isPermisoVerFormProfesionEmplea=false;		
		this.isPermisoDuplicarProfesionEmplea=false;		
		this.isPermisoOrdenProfesionEmplea=false;		
	}
	
	public void setPermisosUsuarioProfesionEmplea(Boolean isPermiso) {
		this.isPermisoTodoProfesionEmplea=isPermiso;
		this.isPermisoNuevoProfesionEmplea=isPermiso;
		this.isPermisoActualizarProfesionEmplea=isPermiso;
		this.isPermisoActualizarOriginalProfesionEmplea=isPermiso;
		this.isPermisoEliminarProfesionEmplea=isPermiso;
		this.isPermisoGuardarCambiosProfesionEmplea=isPermiso;
		this.isPermisoConsultaProfesionEmplea=isPermiso;
		this.isPermisoBusquedaProfesionEmplea=isPermiso;
		this.isPermisoReporteProfesionEmplea=isPermiso;
		this.isPermisoOrdenProfesionEmplea=isPermiso;		
		this.isPermisoPaginacionMedioProfesionEmplea=isPermiso;		
		this.isPermisoPaginacionAltoProfesionEmplea=isPermiso;		
		this.isPermisoPaginacionTodoProfesionEmplea=isPermiso;		
		this.isPermisoCopiarProfesionEmplea=isPermiso;		
		this.isPermisoVerFormProfesionEmplea=isPermiso;		
		this.isPermisoDuplicarProfesionEmplea=isPermiso;
		this.isPermisoOrdenProfesionEmplea=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProfesionEmplea(Boolean isPermiso) {
		//this.isPermisoTodoProfesionEmplea=isPermiso;
		this.isPermisoNuevoProfesionEmplea=isPermiso;
		this.isPermisoActualizarProfesionEmplea=isPermiso;
		this.isPermisoActualizarOriginalProfesionEmplea=isPermiso;
		this.isPermisoEliminarProfesionEmplea=isPermiso;
		this.isPermisoGuardarCambiosProfesionEmplea=isPermiso;
		//this.isPermisoConsultaProfesionEmplea=isPermiso;
		//this.isPermisoBusquedaProfesionEmplea=isPermiso;
		//this.isPermisoReporteProfesionEmplea=isPermiso;
		//this.isPermisoOrdenProfesionEmplea=isPermiso;		
		//this.isPermisoPaginacionMedioProfesionEmplea=isPermiso;		
		//this.isPermisoPaginacionAltoProfesionEmplea=isPermiso;		
		//this.isPermisoPaginacionTodoProfesionEmplea=isPermiso;		
		//this.isPermisoCopiarProfesionEmplea=isPermiso;		
		//this.isPermisoDuplicarProfesionEmplea=isPermiso;
		//this.isPermisoOrdenProfesionEmplea=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProfesionEmpleaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProfesionEmpleaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProfesionEmplea(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProfesionEmpleaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProfesionEmpleaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProfesionEmpleaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProfesionEmpleaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProfesionEmplea() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProfesionEmpleaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProfesionEmpleaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProfesionEmplea=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProfesionEmplea=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProfesionEmplea=this.isPermisoActualizarProfesionEmplea;
			this.isPermisoEliminarProfesionEmplea=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProfesionEmplea=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProfesionEmplea=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProfesionEmplea=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProfesionEmplea=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProfesionEmplea=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProfesionEmplea=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProfesionEmplea=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProfesionEmplea=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProfesionEmplea=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProfesionEmplea=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProfesionEmplea=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProfesionEmplea=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProfesionEmplea=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProfesionEmplea.setToolTipText(this.jTableDatosProfesionEmplea.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProfesionEmplea(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProfesionEmplea(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProfesionEmpleaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProfesionEmpleaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProfesionEmplea() throws Exception {
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
	public void inicializarCombosForeignKeyProfesionEmpleaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.profesionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProfesionEmpleaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProfesionEmpleaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyProfesionEmpleaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProfesionListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyProfesionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.profesionsForeignKey==null||this.profesionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ProfesionConstantesFunciones.getArrayColumnasGlobalesProfesion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProfesionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ProfesionConstantesFunciones.SFINALQUERY;

				this.cargarCombosProfesionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyProfesionEmpleaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ProfesionEmpleaParameterReturnGeneral profesionempleaReturnGeneral=new ProfesionEmpleaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.profesionempleaConstantesFunciones.cargarid_empresaProfesionEmplea)
					 || (this.esRecargarFks && this.profesionempleaConstantesFunciones.cargarid_empresaProfesionEmplea)) {

					if(!this.profesionempleaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+profesionempleaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.profesionempleaConstantesFunciones.cargarid_empleadoProfesionEmplea)
					 || (this.esRecargarFks && this.profesionempleaConstantesFunciones.cargarid_empleadoProfesionEmplea)) {

					if(!this.profesionempleaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+profesionempleaSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalProfesion="";

				if(((this.profesionsForeignKey==null||this.profesionsForeignKey.size()<=0) && this.profesionempleaConstantesFunciones.cargarid_profesionProfesionEmplea)
					 || (this.esRecargarFks && this.profesionempleaConstantesFunciones.cargarid_profesionProfesionEmplea)) {

					if(!this.profesionempleaSessionBean.getisBusquedaDesdeForeignKeySesionProfesion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProfesionConstantesFunciones.getArrayColumnasGlobalesProfesion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProfesion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProfesionConstantesFunciones.TABLENAME);

						finalQueryGlobalProfesion=Funciones.GetFinalQueryAppend(finalQueryGlobalProfesion, "");
						finalQueryGlobalProfesion+=ProfesionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProfesionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProfesion=" WHERE " + ConstantesSql.ID + "="+profesionempleaSessionBean.getlidProfesionActual();
					}
				} else {
					finalQueryGlobalProfesion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				profesionempleaReturnGeneral=profesionempleaLogic.cargarCombosLoteForeignKeyProfesionEmplea(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado,finalQueryGlobalProfesion);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=profesionempleaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=profesionempleaReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalProfesion.equals("NONE")) {
				this.profesionsForeignKey=profesionempleaReturnGeneral.getprofesionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyProfesionEmplea()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyProfesion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.profesionempleaSessionBean==null) {
				this.profesionempleaSessionBean=new ProfesionEmpleaSessionBean();
			}

			if(!this.profesionempleaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.profesionempleaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyProfesion()throws Exception {
		try {

			if(!this.profesionempleaSessionBean.getisBusquedaDesdeForeignKeySesionProfesion()) {
				Profesion profesion=new Profesion();
				ProfesionConstantesFunciones.setProfesionDescripcion(profesion,Constantes.SMENSAJE_ESCOJA_OPCION);
				profesion.setId(null);

				if(!ProfesionConstantesFunciones.ExisteEnLista(this.profesionsForeignKey,profesion,true)) {

					this.profesionsForeignKey.add(0,profesion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyProfesionEmplea()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProfesionEmplea(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProfesionEmplea()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProfesionEmplea();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProfesionEmplea(ProfesionEmplea profesionemplea)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(profesionemplea.getid_empleado(),false,"Formulario");
			this.setActualProfesionForeignKey(profesionemplea.getid_profesion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProfesionEmplea(ProfesionEmplea profesionemplea,String sTipoEvento)throws Exception {	
		try {
			
			

				if(profesionemplea.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoProfesionEmplea")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(profesionemplea.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProfesionEmplea()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.profesionempleaConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualProfesionForeignKey(this.profesionempleaConstantesFunciones.getid_profesion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProfesionEmplea()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProfesionEmplea()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProfesionEmplea()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProfesionEmplea()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProfesionEmplea()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameProfesionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProfesionEmplea(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProfesionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProfesionEmplea()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empresaProfesionEmplea!=null && this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empresaProfesionEmplea.getItemCount()>0) {
				this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empresaProfesionEmplea.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empleadoProfesionEmplea!=null && this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empleadoProfesionEmplea.getItemCount()>0) {
				this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empleadoProfesionEmplea.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_profesionProfesionEmplea!=null && this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_profesionProfesionEmplea.getItemCount()>0) {
				this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_profesionProfesionEmplea.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ProfesionEmpleaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProfesionEmpleaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProfesionEmpleaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.profesionempleaSessionBean=new ProfesionEmpleaSessionBean(); 
		this.profesionempleaConstantesFunciones=new ProfesionEmpleaConstantesFunciones(); 
		this.profesionempleaBean=new ProfesionEmplea();//(this.profesionempleaConstantesFunciones); 		
		this.profesionempleaReturnGeneral=new ProfesionEmpleaParameterReturnGeneral(); 
		
		this.profesionempleaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.profesionempleaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProfesionEmpleaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProfesionEmpleaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProfesionEmpleaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProfesionEmplea(true);
			
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
			
			this.profesionempleaConstantesFunciones=new ProfesionEmpleaConstantesFunciones(); 
			this.profesionempleaBean=new ProfesionEmplea();//this.profesionempleaConstantesFunciones); 			
			this.profesionempleaReturnGeneral=new ProfesionEmpleaParameterReturnGeneral(); 
		
			ProfesionEmpleaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Profesion Emplea Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.profesionemplea=new ProfesionEmplea();
			this.profesionempleas = new ArrayList<ProfesionEmplea>();
			this.profesionempleasAux = new ArrayList<ProfesionEmplea>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic=new ProfesionEmpleaLogic();
				this.profesionempleaLogic.getNewConnexionToDeep("");
			}
			
			//this.profesionempleaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.profesionempleaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProfesionEmplea);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProfesionEmplea!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProfesionEmplea);	
					}
					
					if(this.jInternalFrameImportacionProfesionEmplea!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProfesionEmplea);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProfesionEmplea!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProfesionEmplea);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProfesionEmplea!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProfesionEmplea);
				this.jInternalFrameDetalleFormProfesionEmplea.setVisible(false);
				this.jInternalFrameDetalleFormProfesionEmplea.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProfesionEmplea!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProfesionEmplea);
					this.jInternalFrameReporteDinamicoProfesionEmplea.setVisible(false);
					this.jInternalFrameReporteDinamicoProfesionEmplea.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProfesionEmplea!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProfesionEmplea);
					this.jInternalFrameImportacionProfesionEmplea.setVisible(false);
					this.jInternalFrameImportacionProfesionEmplea.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProfesionEmplea!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProfesionEmplea);
					this.jInternalFrameOrderByProfesionEmplea.setVisible(false);
					this.jInternalFrameOrderByProfesionEmplea.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProfesionEmpleaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProfesionEmpleaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.profesionempleaReturnGeneral=new ProfesionEmpleaParameterReturnGeneral();
			
			this.profesionempleaParameterGeneral=new ProfesionEmpleaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.profesionempleaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProfesionEmpleaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProfesionEmpleaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.profesionempleaSessionBean.getEsGuardarRelacionado(),this.profesionempleaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProfesionEmpleaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.profesionempleaSessionBean.getEsGuardarRelacionado(),this.profesionempleaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProfesionEmplea=false;
			this.isVisibilidadCeldaDuplicarProfesionEmplea=true;
			this.isVisibilidadCeldaCopiarProfesionEmplea=true;
			this.isVisibilidadCeldaVerFormProfesionEmplea=true;
			this.isVisibilidadCeldaOrdenProfesionEmplea=true;
			this.isVisibilidadCeldaNuevoRelacionesProfesionEmplea=false;
			this.isVisibilidadCeldaModificarProfesionEmplea=false;
			this.isVisibilidadCeldaActualizarProfesionEmplea=false;
			this.isVisibilidadCeldaEliminarProfesionEmplea=false;
			this.isVisibilidadCeldaCancelarProfesionEmplea=false;
			this.isVisibilidadCeldaGuardarProfesionEmplea=false;
			this.isVisibilidadCeldaGuardarCambiosProfesionEmplea=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdProfesion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProfesionEmplea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProfesionEmplea();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProfesionEmplea(false);
			
			this.setPermisosUsuarioProfesionEmplea();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.profesionempleaSessionBean.getEsGuardarRelacionado() 
				|| (this.profesionempleaSessionBean.getEsGuardarRelacionado() && this.profesionempleaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProfesionEmpleaClasesRelacionadas();
			}
			
			if(this.profesionempleaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProfesionEmpleaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProfesionEmplea();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProfesionEmplea();
			}
			
			if(!this.isPermisoBusquedaProfesionEmplea) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProfesionEmplea.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.profesionempleaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioProfesionEmplea,this.isPermisoPaginacionMedioProfesionEmplea,this.isPermisoPaginacionTodoProfesionEmplea);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProfesionEmpleaConstantesFunciones.getTiposSeleccionarProfesionEmplea());
				
				this.tiposColumnasSelect=ProfesionEmpleaConstantesFunciones.getTiposSeleccionarProfesionEmplea(true);
				
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
			//if(!this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProfesionEmplea();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioProfesionEmplea(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioProfesionEmplea(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProfesionEmplea() ;
			
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
			this.profesionLogic=new ProfesionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				profesionempleaImplementable= (ProfesionEmpleaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProfesionEmpleaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				profesionempleaImplementableHome= (ProfesionEmpleaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProfesionEmpleaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.profesionempleas= new ArrayList<ProfesionEmplea>();
			this.profesionempleasEliminados= new ArrayList<ProfesionEmplea>();
						
			this.isEsNuevoProfesionEmplea=false;
			this.esParaAccionDesdeFormularioProfesionEmplea=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idEmpleadoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.profesionsForeignKey=new ArrayList<Profesion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProfesionEmplea(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProfesionEmplea();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProfesionEmpleaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProfesionEmpleaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProfesionEmplea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProfesionEmplea(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProfesionEmplea();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProfesionEmplea();
			}
			
			ProfesionEmpleaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProfesionEmplea.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProfesionEmplea.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProfesionEmplea.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProfesionEmplea(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProfesionEmplea: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProfesionEmplea() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProfesionEmplea")) {
				iIndex=this.jInternalFrameDetalleFormProfesionEmplea.jTabbedPaneRelacionesProfesionEmplea.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProfesionEmplea.jTabbedPaneRelacionesProfesionEmplea.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProfesionEmplea.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProfesionEmplea();	
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
	
	public void cargarCombosForeignKeyProfesionEmplea(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProfesionEmplea(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProfesionEmplea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProfesionEmpleaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProfesionEmplea();
		
		this.cargarCombosFrameForeignKeyProfesionEmplea();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProfesionEmplea();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProfesionEmplea();
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

	public void cargarCombosForeignKeyProfesion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyProfesionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyProfesion();
				this.cargarCombosFrameProfesionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaProfesion(this.profesionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProfesionEmpleaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.profesionempleaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProfesionEmplea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
			
			
			if(jTableDatosProfesionEmplea.getRowCount()>=1) {
				jTableDatosProfesionEmplea.removeRowSelectionInterval(0, jTableDatosProfesionEmplea.getRowCount()-1);						
			}
			
			this.isEsNuevoProfesionEmplea=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProfesionEmplea(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProfesionEmplea(true);			
			//this.profesionemplea=new ProfesionEmplea();
			//this.profesionemplea.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProfesionEmplea(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProfesionEmplea() ;
			
			if(ProfesionEmpleaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProfesionEmplea(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.profesionemplea);	
			this.actualizarInformacion("INFO_PADRE",false,this.profesionemplea);				
			
			ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
			
			if(this.profesionempleaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProfesionEmplea: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProfesionEmpleaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProfesionEmplea> profesionempleasSeleccionados=new ArrayList<ProfesionEmplea>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProfesionEmplea.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProfesionEmplea.getSelectedRows().length;			
			}
			
			profesionempleasSeleccionados=this.getProfesionEmpleasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProfesionEmplea--;			
				//ProfesionEmplea profesionempleaAux= new ProfesionEmplea();			
				//profesionempleaAux.setId(this.iIdNuevoProfesionEmplea);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProfesionEmplea profesionempleaOrigen=new ProfesionEmplea();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProfesionEmplea profesionempleaOrigen : profesionempleasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProfesionEmplea.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							profesionempleaOrigen =(ProfesionEmplea) this.profesionempleaLogic.getProfesionEmpleas().toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							profesionempleaOrigen =(ProfesionEmplea) this.profesionempleas.toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProfesionEmplea();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.profesionemplea.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProfesionEmplea(profesionempleaOrigen,this.profesionemplea,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProfesionEmplea(this.profesionemplea);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.profesionempleaLogic.getProfesionEmpleas().add(this.profesionempleaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.profesionempleas.add(this.profesionempleaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProfesionEmplea(false);
				
				this.jTableDatosProfesionEmplea.setRowSelectionInterval(this.getIndiceNuevoProfesionEmplea(), this.getIndiceNuevoProfesionEmplea());
				
				int iLastRow =  this.jTableDatosProfesionEmplea.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProfesionEmplea.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProfesionEmplea.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProfesionEmplea(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProfesionEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProfesionEmplea> profesionempleasSeleccionados=new ArrayList<ProfesionEmplea>();									
		
			ProfesionEmplea profesionempleaOrigen=new ProfesionEmplea();
			ProfesionEmplea profesionempleaDestino=new ProfesionEmplea();
				
			profesionempleasSeleccionados=this.getProfesionEmpleasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProfesionEmplea.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || profesionempleasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProfesionEmplea.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						profesionempleaOrigen =(ProfesionEmplea) this.profesionempleaLogic.getProfesionEmpleas().toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						profesionempleaOrigen =(ProfesionEmplea) this.profesionempleas.toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						profesionempleaDestino =(ProfesionEmplea) this.profesionempleaLogic.getProfesionEmpleas().toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						profesionempleaDestino =(ProfesionEmplea) this.profesionempleas.toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				profesionempleaOrigen =profesionempleasSeleccionados.get(0);
				profesionempleaDestino =profesionempleasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProfesionEmplea(profesionempleaOrigen,profesionempleaDestino,true,false);
				
				profesionempleaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(profesionempleaDestino,profesionempleaLogic.getProfesionEmpleas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(profesionempleaDestino,profesionempleas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProfesionEmplea(false);
				
				//this.jTableDatosProfesionEmplea.setRowSelectionInterval(this.getIndiceNuevoProfesionEmplea(), this.getIndiceNuevoProfesionEmplea());
				
				int iLastRow =  this.jTableDatosProfesionEmplea.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProfesionEmplea.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProfesionEmplea.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProfesionEmplea(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProfesionEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProfesionEmplea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProfesionEmplea.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProfesionEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProfesionEmplea.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProfesionEmplea.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProfesionEmplea.setVisible(!isVisible);
			this.jPanelPaginacionProfesionEmplea.setVisible(!isVisible);
			this.jPanelAccionesProfesionEmplea.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProfesionEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProfesionEmplea();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProfesionEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProfesionEmplea();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProfesionEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProfesionEmplea();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProfesionEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProfesionEmplea();
			
			this.abrirFrameOrderByProfesionEmplea();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProfesionEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProfesionEmplea();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProfesionEmplea(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProfesionEmplea);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProfesionEmplea.isMaximum()) {
					this.jInternalFrameDetalleFormProfesionEmplea.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProfesionEmplea.setSize(this.jInternalFrameDetalleFormProfesionEmplea.iWidthFormulario,this.jInternalFrameDetalleFormProfesionEmplea.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProfesionEmplea.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProfesionEmplea.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProfesionEmplea.isMaximum()) {
						this.jInternalFrameDetalleFormProfesionEmplea.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProfesionEmplea.jContentPaneDetalleProfesionEmplea.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProfesionEmplea.jTabbedPaneRelacionesProfesionEmplea.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProfesionEmplea.jContentPaneDetalleProfesionEmplea.getWidth(),ProfesionEmpleaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProfesionEmplea.jTabbedPaneRelacionesProfesionEmplea.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProfesionEmplea.jContentPaneDetalleProfesionEmplea.getWidth(),ProfesionEmpleaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProfesionEmplea.jTabbedPaneRelacionesProfesionEmplea.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProfesionEmplea.jContentPaneDetalleProfesionEmplea.getWidth(),ProfesionEmpleaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProfesionEmplea.setVisible(true);
	        this.jInternalFrameDetalleFormProfesionEmplea.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProfesionEmplea() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProfesionEmplea==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProfesionEmplea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProfesionEmplea,false,this);
				} else {
					this.jInternalFrameOrderByProfesionEmplea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProfesionEmplea,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProfesionEmplea);
				this.jInternalFrameOrderByProfesionEmplea.setVisible(false);
				this.jInternalFrameOrderByProfesionEmplea.setSelected(false);
				
				this.jInternalFrameOrderByProfesionEmplea.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProfesionEmplea"));
				
				this.inicializarActualizarBindingTablaOrderByProfesionEmplea();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProfesionEmplea() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProfesionEmplea==null) {
				
				this.jInternalFrameImportacionProfesionEmplea=new ImportacionJInternalFrame(ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProfesionEmplea);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProfesionEmplea);
				this.jInternalFrameImportacionProfesionEmplea.setVisible(false);
				this.jInternalFrameImportacionProfesionEmplea.setSelected(false);


				this.jInternalFrameImportacionProfesionEmplea.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProfesionEmplea"));
				this.jInternalFrameImportacionProfesionEmplea.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProfesionEmplea"));
				this.jInternalFrameImportacionProfesionEmplea.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProfesionEmplea"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProfesionEmplea() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProfesionEmplea==null) {
				this.jInternalFrameReporteDinamicoProfesionEmplea=new ReporteDinamicoJInternalFrame(ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProfesionEmplea);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProfesionEmplea);
				this.jInternalFrameReporteDinamicoProfesionEmplea.setVisible(false);
				this.jInternalFrameReporteDinamicoProfesionEmplea.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProfesionEmplea.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProfesionEmplea"));
				this.jInternalFrameReporteDinamicoProfesionEmplea.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProfesionEmplea"));
				this.jInternalFrameReporteDinamicoProfesionEmplea.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProfesionEmplea"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProfesionEmplea();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProfesionEmplea() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProfesionEmplea);
			
	       	this.jInternalFrameDetalleFormProfesionEmplea.setVisible(false);
	        this.jInternalFrameDetalleFormProfesionEmplea.setSelected(false);
			
			//this.jInternalFrameDetalleFormProfesionEmplea.dispose();
			//this.jInternalFrameDetalleFormProfesionEmplea=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProfesionEmplea() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProfesionEmplea.setVisible(true);
	        this.jInternalFrameReporteDinamicoProfesionEmplea.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProfesionEmplea() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProfesionEmplea.setVisible(true);
	        this.jInternalFrameImportacionProfesionEmplea.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProfesionEmplea() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProfesionEmplea.setVisible(true);
	        this.jInternalFrameOrderByProfesionEmplea.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProfesionEmplea() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProfesionEmplea.setVisible(false);
	        this.jInternalFrameOrderByProfesionEmplea.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProfesionEmplea() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProfesionEmplea.setVisible(false);
	        this.jInternalFrameReporteDinamicoProfesionEmplea.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProfesionEmplea() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProfesionEmplea.setVisible(false);
	        this.jInternalFrameImportacionProfesionEmplea.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProfesionEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProfesionEmplea(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProfesionEmplea(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProfesionEmplea.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProfesionEmplea(true);
			//this.isEsNuevoProfesionEmplea=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionemplea =(ProfesionEmplea) this.profesionempleaLogic.getProfesionEmpleas().toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.profesionemplea =(ProfesionEmplea) this.profesionempleas.toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProfesionEmplea("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProfesionEmplea(false) ;
			
			if(profesionempleaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProfesionEmpleaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProfesionEmplea(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProfesionEmplea(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProfesionEmpleaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProfesionEmplea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionemplea =(ProfesionEmplea) this.profesionempleaLogic.getProfesionEmpleas().toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.profesionemplea =(ProfesionEmplea) this.profesionempleas.toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProfesionEmplea(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProfesionEmplea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProfesionEmplea.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProfesionEmplea(true);
			//this.isEsNuevoProfesionEmplea=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionemplea =(ProfesionEmplea) this.profesionempleaLogic.getProfesionEmpleas().toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.profesionemplea =(ProfesionEmplea) this.profesionempleas.toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.profesionemplea.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProfesionEmplea("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProfesionEmplea(false) ;
			
			if(ProfesionEmpleaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProfesionEmplea(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProfesionEmplea(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Empleado")) {
				if(!this.profesionempleaConstantesFunciones.cargarid_empleadoProfesionEmplea) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingProfesionEmplea(false,false);
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
		TableColumn tableColumnEmpleado=this.jTableDatosProfesionEmplea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProfesionEmplea,ProfesionEmpleaConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProfesionEmplea.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaProfesion(List<Profesion> profesionsForeignKey)throws Exception{
		TableColumn tableColumnProfesion=this.jTableDatosProfesionEmplea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProfesionEmplea,ProfesionEmpleaConstantesFunciones.LABEL_IDPROFESION));
		TableCellEditor tableCellEditorProfesion =tableColumnProfesion.getCellEditor();

		ProfesionTableCell profesionTableCellFk=(ProfesionTableCell)tableCellEditorProfesion;

		if(profesionTableCellFk!=null) {
			profesionTableCellFk.setprofesionsForeignKey(profesionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProfesionEmplea.getSelectedRow();

		//if(intSelectedRow<=0) {
			//profesionTableCellFk.setRowActual(intSelectedRow);
			//profesionTableCellFk.setprofesionsForeignKeyActual(profesionsForeignKey);
		//}


		if(profesionTableCellFk!=null) {
			profesionTableCellFk.RecargarProfesionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarProfesionEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProfesionEmplea(false);
			
			//if(!this.isEsNuevoProfesionEmplea) {								
				int intSelectedRow = this.jTableDatosProfesionEmplea.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionemplea =(ProfesionEmplea) this.profesionempleaLogic.getProfesionEmpleas().toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.profesionemplea =(ProfesionEmplea) this.profesionempleas.toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProfesionEmplea(this.profesionemplea,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProfesionEmplea(this.profesionemplea);
				
			}
			
			if(this.permiteMantenimiento(this.profesionemplea)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProfesionEmplea=true;
					this.inicializarActualizarBindingTablaProfesionEmplea(false);
					this.isEsNuevoProfesionEmplea=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProfesionEmplea=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProfesionEmplea=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProfesionEmplea(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProfesionEmplea(false);
				
				this.habilitarDeshabilitarControlesProfesionEmplea(false);
			
												
				
				if(ProfesionEmpleaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProfesionEmplea();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProfesionEmpleaActionPerformed(evt,profesionempleaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProfesionEmplea(this.profesionemplea,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProfesionEmplea.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,profesionempleaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.profesionemplea.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProfesionEmplea.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProfesionEmplea.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProfesionEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProfesionEmplea.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionemplea =(ProfesionEmplea) this.profesionempleaLogic.getProfesionEmpleas().toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
				this.profesionemplea.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.profesionemplea =(ProfesionEmplea) this.profesionempleas.toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
				this.profesionemplea.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.profesionemplea)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProfesionEmpleaModel) this.jTableDatosProfesionEmplea.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProfesionEmplea=true;
				this.inicializarActualizarBindingTablaProfesionEmplea(false);
				this.isEsNuevoProfesionEmplea=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProfesionEmplea(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProfesionEmplea(false);
				
				this.habilitarDeshabilitarControlesProfesionEmplea(false);
				
				
				
				if(ProfesionEmpleaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProfesionEmplea();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProfesionEmpleaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProfesionEmplea.getRowCount()>=1) {
				jTableDatosProfesionEmplea.removeRowSelectionInterval(0, jTableDatosProfesionEmplea.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProfesionEmplea(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProfesionEmplea(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProfesionEmplea(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProfesionEmplea(false) ;
			
			this.isEsNuevoProfesionEmplea=false;
			
			if(ProfesionEmpleaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProfesionEmplea();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProfesionEmpleaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProfesionEmplea(false);
				
				//SI ES MANUAL
				if(ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProfesionEmplea();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProfesionEmpleaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProfesionEmplea--;			
			//ProfesionEmplea profesionempleaAux= new ProfesionEmplea();			
			//profesionempleaAux.setId(this.iIdNuevoProfesionEmplea);
			
			if(this.jInternalFrameDetalleFormProfesionEmplea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProfesionEmplea();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProfesionEmplea(this.profesionemplea);
			
			this.profesionemplea.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.profesionempleaLogic.getProfesionEmpleas().add(this.profesionempleaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.profesionempleas.add(this.profesionempleaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProfesionEmplea(false);
			
			this.jTableDatosProfesionEmplea.setRowSelectionInterval(this.getIndiceNuevoProfesionEmplea(), this.getIndiceNuevoProfesionEmplea());
			
			int iLastRow =  this.jTableDatosProfesionEmplea.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProfesionEmplea.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProfesionEmplea.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProfesionEmplea(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProfesionEmpleaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProfesionEmplea(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProfesionEmplea(false);
			
			//SI ES MANUAL
			if(ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProfesionEmplea();
			}
			
			//this.abrirFrameTreeProfesionEmplea();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProfesionEmpleaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Profesion EmpleaS ?", "MANTENIMIENTO DE Profesion Emplea", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionProfesionEmplea.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralProfesionEmplea();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.profesionempleaReturnGeneral=profesionempleaLogic.procesarImportacionProfesionEmpleasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.profesionempleaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarProfesionEmpleaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProfesionEmpleaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProfesionEmplea.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProfesionEmplea.setFileImportacion(this.jInternalFrameImportacionProfesionEmplea.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProfesionEmplea.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProfesionEmplea.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProfesionEmplea.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProfesionEmplea.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProfesionEmpleaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProfesionEmplea> profesionempleasSeleccionados=new ArrayList<ProfesionEmplea>();		

		profesionempleasSeleccionados=this.getProfesionEmpleasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProfesionEmplea.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProfesionEmplea.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProfesionEmpleaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProfesionEmpleaBaseDesign.jrxml";
			
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
			
			this.generarReporteProfesionEmpleas("Todos",profesionempleasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.profesionempleaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Profesion Emplea",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProfesionEmplea.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProfesionEmplea.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProfesionEmpleaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProfesionEmpleaConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProfesionEmpleaConstantesFunciones.LABEL_IDPROFESION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Profesion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Profesion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Profesion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Profesion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProfesionEmplea.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProfesionEmplea.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProfesionEmplea.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProfesionEmpleaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ProfesionEmpleaConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case ProfesionEmpleaConstantesFunciones.LABEL_IDPROFESION:
					sNombreCampoCategoria="id_profesion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProfesionEmplea.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProfesionEmpleaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ProfesionEmpleaConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case ProfesionEmpleaConstantesFunciones.LABEL_IDPROFESION:
					sNombreCampoCategoriaValor="id_profesion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProfesionEmplea.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProfesionEmplea.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProfesionEmpleaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ProfesionEmpleaConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case ProfesionEmpleaConstantesFunciones.LABEL_IDPROFESION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Profesion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_profesion");
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
	
	public void jButtonGenerarExcelReporteDinamicoProfesionEmpleaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProfesionEmplea> profesionempleasSeleccionados=new ArrayList<ProfesionEmplea>();		
		
		profesionempleasSeleccionados=this.getProfesionEmpleasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"profesionemplea";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProfesionEmpleas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProfesionEmplea.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProfesionEmplea.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProfesionEmpleaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProfesionEmpleaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProfesionEmplea profesionemplea:profesionempleasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(profesionemplea.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProfesionEmpleaConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProfesionEmpleaConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(ProfesionEmplea profesionemplea:profesionempleasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(profesionemplea.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProfesionEmpleaConstantesFunciones.LABEL_IDPROFESION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProfesionEmpleaConstantesFunciones.LABEL_IDPROFESION);
					iRow++;

					for(ProfesionEmplea profesionemplea:profesionempleasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(profesionemplea.getprofesion_descripcion());
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
			//	this.getFilaCabeceraExportarExcelProfesionEmplea(row);				
			//	iRow++;
			//}				
			
			//for(ProfesionEmplea profesionempleaAux:profesionempleasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProfesionEmplea(profesionempleaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.profesionempleaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Profesion Emplea",JOptionPane.INFORMATION_MESSAGE);
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
				this.profesionempleaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProfesionEmplea(false);
			
			//SI ES MANUAL
			if(ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProfesionEmplea();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProfesionEmpleaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProfesionEmplea(false);
			
			//SI ES MANUAL
			if(ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProfesionEmplea();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProfesionEmpleaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProfesionEmplea(false);
			
			//SI ES MANUAL
			if(ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProfesionEmplea();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProfesionEmplea() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProfesionEmplea.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProfesionEmplea.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProfesionEmplea.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProfesionEmplea.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProfesionEmplea.setMinimumSize(dimensionMinimum);
		this.jTableDatosProfesionEmplea.setMaximumSize(dimensionMaximum);
		this.jTableDatosProfesionEmplea.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProfesionEmplea(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProfesionEmplea(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProfesionEmplea(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProfesionEmplea(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProfesionEmplea(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProfesionEmplea(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProfesionEmplea(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProfesionEmplea(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProfesionEmplea() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProfesionEmplea();
		
		this.inicializarActualizarBindingBotonesManualProfesionEmplea(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProfesionEmplea();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProfesionEmplea() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProfesionEmplea(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProfesionEmplea(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProfesionEmplea.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProfesionEmplea.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProfesionEmplea.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProfesionEmplea.jCheckBoxPostAccionNuevoProfesionEmplea.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProfesionEmplea.jCheckBoxPostAccionSinCerrarProfesionEmplea.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProfesionEmplea.jCheckBoxPostAccionSinMensajeProfesionEmplea.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProfesionEmplea.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProfesionEmplea.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProfesionEmplea.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
				this.jInternalFrameDetalleFormProfesionEmplea.jCheckBoxPostAccionNuevoProfesionEmplea.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProfesionEmplea.jCheckBoxPostAccionSinCerrarProfesionEmplea.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProfesionEmplea.jCheckBoxPostAccionSinMensajeProfesionEmplea.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProfesionEmplea.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProfesionEmplea.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxTiposAccionesFormularioProfesionEmplea.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProfesionEmplea.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProfesionEmplea!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProfesionEmplea.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProfesionEmplea.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProfesionEmplea.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProfesionEmplea.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProfesionEmplea.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProfesionEmplea!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProfesionEmplea.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProfesionEmplea.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProfesionEmplea.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProfesionEmplea(Boolean esInicializar) throws Exception {
		try	{	
			if(ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProfesionEmplea(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProfesionEmplea() throws Exception {
		try	{
			if(ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProfesionEmplea();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProfesionEmplea() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxTiposAccionesFormularioProfesionEmplea.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxTiposAccionesFormularioProfesionEmplea.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProfesionEmplea() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProfesionEmplea.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProfesionEmplea.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProfesionEmplea.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProfesionEmplea.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProfesionEmplea.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProfesionEmplea.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProfesionEmplea.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProfesionEmplea.addItem(reporte);
			}
			
			
			if(!this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProfesionEmplea.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProfesionEmplea.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProfesionEmplea.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProfesionEmplea.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProfesionEmplea.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProfesionEmplea.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProfesionEmplea!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxTiposAccionesFormularioProfesionEmplea.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxTiposAccionesFormularioProfesionEmplea.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProfesionEmplea.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProfesionEmplea.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProfesionEmplea.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProfesionEmplea();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProfesionEmplea() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProfesionEmplea!=null) {
				this.jInternalFrameReporteDinamicoProfesionEmplea.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProfesionEmplea.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProfesionEmplea!=null) {
				this.jInternalFrameReporteDinamicoProfesionEmplea.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProfesionEmplea.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProfesionEmplea!=null) {
				
				if(this.jInternalFrameReporteDinamicoProfesionEmplea.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProfesionEmplea.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProfesionEmplea.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProfesionEmplea.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProfesionEmplea.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProfesionEmplea.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProfesionEmplea()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoProfesionEmplea.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoProfesionEmplea.getSelectedItem()).getId();}
		if(this.jComboBoxid_profesionFK_IdProfesionProfesionEmplea.getSelectedItem()!=null){this.id_profesionFK_IdProfesion=((Profesion)this.jComboBoxid_profesionFK_IdProfesionProfesionEmplea.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProfesionEmplea(Boolean esInicializar) throws Exception {				
		if(ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProfesionEmplea();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProfesionEmplea() throws Exception {
		this.inicializarActualizarBindingTablaProfesionEmplea(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProfesionEmplea() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProfesionEmplea.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProfesionEmplea.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProfesionEmplea.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProfesionEmpleaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProfesionEmplea.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProfesionEmplea.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProfesionEmpleaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProfesionEmpleaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProfesionEmpleaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProfesionEmpleaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProfesionEmplea.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProfesionEmplea.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProfesionEmpleaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProfesionEmplea.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProfesionEmplea(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=profesionempleaLogic.getProfesionEmpleas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=profesionempleas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProfesionEmplea.setModel(new ProfesionEmpleaModel(this.profesionempleaLogic.getProfesionEmpleas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProfesionEmplea.setModel(new ProfesionEmpleaModel(this.profesionempleas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProfesionEmplea!=null && this.jInternalFrameOrderByProfesionEmplea.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProfesionEmplea();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProfesionEmplea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProfesionEmplea,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProfesionEmpleaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO,profesionempleaConstantesFunciones.resaltarSeleccionarProfesionEmplea,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO,profesionempleaConstantesFunciones.resaltarSeleccionarProfesionEmplea,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProfesionEmplea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProfesionEmplea,ProfesionEmpleaConstantesFunciones.LABEL_ID));

		if(this.profesionempleaConstantesFunciones.mostraridProfesionEmplea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProfesionEmpleaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.profesionempleaConstantesFunciones.resaltaridProfesionEmplea,this.profesionempleaConstantesFunciones.activaridProfesionEmplea,this,true,"idProfesionEmplea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.profesionempleaConstantesFunciones.resaltaridProfesionEmplea,this.profesionempleaConstantesFunciones.activaridProfesionEmplea,this,true,"idProfesionEmplea","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProfesionEmplea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProfesionEmplea,ProfesionEmpleaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.profesionempleaConstantesFunciones.mostrarid_empresaProfesionEmplea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProfesionEmpleaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.profesionempleaConstantesFunciones.resaltarid_empresaProfesionEmplea,this,this.profesionempleaConstantesFunciones.activarid_empresaProfesionEmplea));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.profesionempleaConstantesFunciones.resaltarid_empresaProfesionEmplea,this,this.profesionempleaConstantesFunciones.activarid_empresaProfesionEmplea,false,"id_empresaProfesionEmplea","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProfesionEmpleaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProfesionEmplea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProfesionEmplea,ProfesionEmpleaConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.profesionempleaConstantesFunciones.mostrarid_empleadoProfesionEmplea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProfesionEmpleaConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.profesionempleaConstantesFunciones.resaltarid_empleadoProfesionEmplea,this,this.profesionempleaConstantesFunciones.activarid_empleadoProfesionEmplea));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.profesionempleaConstantesFunciones.resaltarid_empleadoProfesionEmplea,this,this.profesionempleaConstantesFunciones.activarid_empleadoProfesionEmplea,true,"id_empleadoProfesionEmplea","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new ProfesionEmpleaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProfesionEmplea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProfesionEmplea,ProfesionEmpleaConstantesFunciones.LABEL_IDPROFESION));

		if(this.profesionempleaConstantesFunciones.mostrarid_profesionProfesionEmplea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProfesionEmpleaConstantesFunciones.LABEL_IDPROFESION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProfesionTableCell(this.profesionsForeignKey,this.profesionempleaConstantesFunciones.resaltarid_profesionProfesionEmplea,this,this.profesionempleaConstantesFunciones.activarid_profesionProfesionEmplea));
			tableColumn.setCellEditor(new ProfesionTableCell(this.profesionsForeignKey,this.profesionempleaConstantesFunciones.resaltarid_profesionProfesionEmplea,this,this.profesionempleaConstantesFunciones.activarid_profesionProfesionEmplea,true,"id_profesionProfesionEmplea","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProfesionEmpleaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.profesionempleaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.profesionempleaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.profesionempleaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProfesionEmplea.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.profesionempleaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.profesionempleaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProfesionEmplea.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProfesionEmplea && this.isPermisoGuardarCambiosProfesionEmplea) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.profesionempleaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.profesionempleaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProfesionEmplea.addColumn(tableColumn);
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
			
			this.jTableDatosProfesionEmplea.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProfesionEmplea && this.isPermisoGuardarCambiosProfesionEmplea) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProfesionEmplea && this.isPermisoGuardarCambiosProfesionEmplea) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProfesionEmplea.moveColumn(this.jTableDatosProfesionEmplea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProfesionEmplea.moveColumn(this.jTableDatosProfesionEmplea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProfesionEmplea.moveColumn(this.jTableDatosProfesionEmplea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProfesionEmplea.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProfesionEmplea.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProfesionEmplea,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProfesionEmplea.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProfesionEmplea.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProfesionEmplea.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProfesionEmplea.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProfesionEmplea.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=profesionempleaLogic.getProfesionEmpleas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=profesionempleas.size()-1;
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
		//this.jTableDatosProfesionEmplea.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProfesionEmplea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProfesionEmplea();
			
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
				
				//this.isEsNuevoProfesionEmplea=false;
					
				ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
			
				if(this.profesionempleaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProfesionEmplea==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProfesionEmplea.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProfesionEmplea.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionemplea =(ProfesionEmplea) this.profesionempleaLogic.getProfesionEmpleas().toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.profesionemplea =(ProfesionEmplea) this.profesionempleas.toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.profesionemplea.getsType().equals("DUPLICADO")
				   || this.profesionemplea.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProfesionEmplea=true;
				
				} else {
					this.isEsNuevoProfesionEmplea=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
					if(this.profesionemplea.getId()>=0 && !this.profesionemplea.getIsNew()) {						
						this.isEsNuevoProfesionEmplea=false;
						
					} else {
						this.isEsNuevoProfesionEmplea=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProfesionEmplea(esRelaciones);						
				
				this.seleccionarProfesionEmplea(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.profesionemplea.getId()<0) {
					this.isEsNuevoProfesionEmplea=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProfesionEmplea(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProfesionEmplea(evt,rowIndex);
				}	
				
				if(this.profesionempleaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProfesionEmplea: " + this.dDif); 
					}
				}								
				
				ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProfesionEmplea(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.profesionemplea)) {
					if(this.profesionemplea.getId()>0) {
						this.profesionemplea.setIsDeleted(true);
						
						this.profesionempleasEliminados.add(this.profesionemplea);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.profesionempleaLogic.getProfesionEmpleas().remove(this.profesionemplea);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.profesionempleas.remove(this.profesionemplea);				
					}
					
					
					((ProfesionEmpleaModel) this.jTableDatosProfesionEmplea.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProfesionEmplea(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProfesionEmplea(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProfesionEmplea) {
			
			if(this.jInternalFrameDetalleFormProfesionEmplea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProfesionEmplea.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProfesionEmplea.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionemplea =(ProfesionEmplea) this.profesionempleaLogic.getProfesionEmpleas().toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.profesionemplea =(ProfesionEmplea) this.profesionempleas.toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProfesionEmplea(this.profesionemplea);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.profesionempleaConstantesFunciones.cargarid_empresaProfesionEmplea || this.profesionempleaConstantesFunciones.event_dependid_empresaProfesionEmplea) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.profesionemplea.getid_empresa());
									//this.inicializarActualizarBindingProfesionEmplea(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(profesionemplea.getEmpresa()!=null) {
							this.empresasForeignKey.add(profesionemplea.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.profesionemplea.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.profesionempleaConstantesFunciones.cargarid_empleadoProfesionEmplea || this.profesionempleaConstantesFunciones.event_dependid_empleadoProfesionEmplea) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.profesionemplea.getid_empleado());
									//this.inicializarActualizarBindingProfesionEmplea(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(profesionemplea.getEmpleado()!=null) {
							this.empleadosForeignKey.add(profesionemplea.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.profesionemplea.getid_empleado(),false,"Formulario");

					//Profesion
					if(!this.profesionempleaConstantesFunciones.cargarid_profesionProfesionEmplea || this.profesionempleaConstantesFunciones.event_dependid_profesionProfesionEmplea) {
						//this.cargarCombosProfesionsForeignKeyLista(" where id="+this.profesionemplea.getid_profesion());
									//this.inicializarActualizarBindingProfesionEmplea(false,false);
						this.profesionsForeignKey=new ArrayList<Profesion>();

						if(profesionemplea.getProfesion()!=null) {
							this.profesionsForeignKey.add(profesionemplea.getProfesion());
						}

						this.addItemDefectoCombosForeignKeyProfesion();
						this.cargarCombosFrameProfesionsForeignKey("Todos");
					}
					this.setActualProfesionForeignKey(this.profesionemplea.getid_profesion(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProfesionEmplea("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProfesionEmplea(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProfesionEmplea() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProfesionEmplea(ProfesionEmplea profesionemplea) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProfesionEmplea(profesionemplea,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProfesionEmplea(ProfesionEmplea profesionemplea,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProfesionEmplea(profesionemplea);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProfesionEmplea(profesionemplea,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProfesionEmplea(profesionemplea);
	}
	
	public void setVariablesObjetoActualToFormularioProfesionEmplea(ProfesionEmplea profesionemplea) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProfesionEmplea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProfesionEmplea.jLabelidProfesionEmplea.setText(profesionemplea.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProfesionEmplea profesionempleaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,profesionempleaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProfesionEmplea profesionempleaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				profesionempleaLocal=this.profesionemplea;
			} else {
				profesionempleaLocal=this.profesionempleaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(profesionempleaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProfesionEmplea(profesionempleaLocal,true);
					
					if(profesionempleaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(profesionempleaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(profesionempleaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProfesionEmplea(ProfesionEmplea profesionemplea,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProfesionEmplea(profesionemplea,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProfesionEmplea(profesionemplea);
	}
	
	public void setVariablesFormularioToObjetoActualProfesionEmplea(ProfesionEmplea profesionemplea,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProfesionEmplea(profesionemplea,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProfesionEmplea(ProfesionEmplea profesionemplea,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProfesionEmplea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProfesionEmplea.jLabelidProfesionEmplea.getText()==null || this.jInternalFrameDetalleFormProfesionEmplea.jLabelidProfesionEmplea.getText()=="" || this.jInternalFrameDetalleFormProfesionEmplea.jLabelidProfesionEmplea.getText()=="Id") {
				this.jInternalFrameDetalleFormProfesionEmplea.jLabelidProfesionEmplea.setText("0");
			}

			if(conColumnasBase) {profesionemplea.setId(Long.parseLong(this.jInternalFrameDetalleFormProfesionEmplea.jLabelidProfesionEmplea.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProfesionEmpleaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProfesionEmplea.jLabelIdProfesionEmplea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProfesionEmplea(ProfesionEmplea profesionempleaBean,ProfesionEmplea profesionemplea,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && profesionempleaBean.getid_empleado()!=null && !profesionempleaBean.getid_empleado().equals(-1L))) {profesionemplea.setid_empleado(profesionempleaBean.getid_empleado());}
			if(conDefault || (!conDefault && profesionempleaBean.getid_profesion()!=null && !profesionempleaBean.getid_profesion().equals(-1L))) {profesionemplea.setid_profesion(profesionempleaBean.getid_profesion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProfesionEmplea(ProfesionEmplea profesionempleaOrigen,ProfesionEmplea profesionemplea,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && profesionempleaOrigen.getId()!=null && !profesionempleaOrigen.getId().equals(0L))) {profesionemplea.setId(profesionempleaOrigen.getId());}}
			if(conDefault || (!conDefault && profesionempleaOrigen.getid_empleado()!=null && !profesionempleaOrigen.getid_empleado().equals(-1L))) {profesionemplea.setid_empleado(profesionempleaOrigen.getid_empleado());}
			if(conDefault || (!conDefault && profesionempleaOrigen.getid_profesion()!=null && !profesionempleaOrigen.getid_profesion().equals(-1L))) {profesionemplea.setid_profesion(profesionempleaOrigen.getid_profesion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProfesionEmplea(ProfesionEmplea profesionemplea) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProfesionEmplea.jLabelidProfesionEmplea.setText(profesionemplea.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProfesionEmplea(ProfesionEmpleaBean profesionempleaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProfesionEmplea.jLabelidProfesionEmplea.setText(profesionempleaBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProfesionEmplea(ProfesionEmpleaParameterReturnGeneral profesionempleaReturnGeneral,ProfesionEmpleaBean profesionempleaBean,Boolean conDefault) throws Exception { 
		try {
			ProfesionEmplea profesionempleaLocal=new ProfesionEmplea();
			
			profesionempleaLocal=profesionempleaReturnGeneral.getProfesionEmplea();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && profesionempleaLocal.getId()!=null && !profesionempleaLocal.getId().equals(0L))) {profesionempleaBean.setId(profesionempleaLocal.getId());}}
			if(conDefault || (!conDefault && profesionempleaLocal.getid_empleado()!=null && !profesionempleaLocal.getid_empleado().equals(-1L))) {profesionempleaBean.setid_empleado(profesionempleaLocal.getid_empleado());}
			if(conDefault || (!conDefault && profesionempleaLocal.getid_profesion()!=null && !profesionempleaLocal.getid_profesion().equals(-1L))) {profesionempleaBean.setid_profesion(profesionempleaLocal.getid_profesion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProfesionEmpleaGenerico(Long idProfesionEmpleaSeleccionado,JComboBox jComboBoxProfesionEmplea,List<ProfesionEmplea> profesionempleasLocal)throws Exception {
		try {
			ProfesionEmplea  profesionempleaTemp=null;

			for(ProfesionEmplea profesionempleaAux:profesionempleasLocal) {
				if(profesionempleaAux.getId()!=null && profesionempleaAux.getId().equals(idProfesionEmpleaSeleccionado)) {
					profesionempleaTemp=profesionempleaAux;
					break;
				}
			}

			jComboBoxProfesionEmplea.setSelectedItem(profesionempleaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProfesionEmpleaGenerico(JComboBox jComboBoxProfesionEmplea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProfesionEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProfesionEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProfesionEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProfesionEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProfesionEmplea.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProfesionEmplea.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProfesionEmplea.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProfesionEmplea.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProfesionEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProfesionEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			profesionemplea=(ProfesionEmplea) profesionempleaLogic.getProfesionEmpleas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			profesionemplea =(ProfesionEmplea) profesionempleas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!profesionemplea.getIsNew() && !profesionemplea.getIsChanged() && !profesionemplea.getIsDeleted()) {
				sDescripcion=profesionemplea.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=profesionemplea.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!profesionemplea.getIsNew() && !profesionemplea.getIsChanged() && !profesionemplea.getIsDeleted()) {
				sDescripcion=profesionemplea.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=profesionemplea.getempleado_descripcion();
			}
		}

		if(sTipo.equals("Profesion")) {
			//sDescripcion=this.getActualProfesionForeignKeyDescripcion((Long)value);
			if(!profesionemplea.getIsNew() && !profesionemplea.getIsChanged() && !profesionemplea.getIsDeleted()) {
				sDescripcion=profesionemplea.getprofesion_descripcion();
			} else {
				//sDescripcion=this.getActualProfesionForeignKeyDescripcion((Long)value);
				sDescripcion=profesionemplea.getprofesion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProfesionEmplea profesionempleaRow=new ProfesionEmplea();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			profesionempleaRow=(ProfesionEmplea) profesionempleaLogic.getProfesionEmpleas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			profesionempleaRow=(ProfesionEmplea) profesionempleas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProfesionEmplea(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProfesionEmplea.setVisible((this.isVisibilidadCeldaNuevoProfesionEmplea && this.isPermisoNuevoProfesionEmplea));			
			this.jButtonDuplicarProfesionEmplea.setVisible((this.isVisibilidadCeldaDuplicarProfesionEmplea && this.isPermisoDuplicarProfesionEmplea));			
			this.jButtonCopiarProfesionEmplea.setVisible((this.isVisibilidadCeldaCopiarProfesionEmplea && this.isPermisoCopiarProfesionEmplea));
			this.jButtonVerFormProfesionEmplea.setVisible((this.isVisibilidadCeldaVerFormProfesionEmplea && this.isPermisoVerFormProfesionEmplea));
			
			this.jButtonAbrirOrderByProfesionEmplea.setVisible((this.isVisibilidadCeldaOrdenProfesionEmplea && this.isPermisoOrdenProfesionEmplea));			
			
			this.jButtonNuevoRelacionesProfesionEmplea.setVisible((this.isVisibilidadCeldaNuevoRelacionesProfesionEmplea && this.isPermisoNuevoProfesionEmplea));			
			this.jButtonNuevoGuardarCambiosProfesionEmplea.setVisible((this.isVisibilidadCeldaNuevoProfesionEmplea && this.isPermisoNuevoProfesionEmplea && this.isPermisoGuardarCambiosProfesionEmplea));
			
			if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
			this.jInternalFrameDetalleFormProfesionEmplea.jButtonModificarProfesionEmplea.setVisible((this.isVisibilidadCeldaModificarProfesionEmplea && this.isPermisoActualizarProfesionEmplea));	
			this.jInternalFrameDetalleFormProfesionEmplea.jButtonActualizarProfesionEmplea.setVisible((this.isVisibilidadCeldaActualizarProfesionEmplea && this.isPermisoActualizarProfesionEmplea));	
			this.jInternalFrameDetalleFormProfesionEmplea.jButtonEliminarProfesionEmplea.setVisible((this.isVisibilidadCeldaEliminarProfesionEmplea && this.isPermisoEliminarProfesionEmplea));
			this.jInternalFrameDetalleFormProfesionEmplea.jButtonCancelarProfesionEmplea.setVisible(this.isVisibilidadCeldaCancelarProfesionEmplea);							
			this.jInternalFrameDetalleFormProfesionEmplea.jButtonGuardarCambiosProfesionEmplea.setVisible((this.isVisibilidadCeldaGuardarProfesionEmplea && this.isPermisoGuardarCambiosProfesionEmplea));			
			
			}
						
			this.jButtonGuardarCambiosTablaProfesionEmplea.setVisible((this.isVisibilidadCeldaGuardarCambiosProfesionEmplea && this.isPermisoGuardarCambiosProfesionEmplea));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProfesionEmplea.setVisible((this.isVisibilidadCeldaNuevoProfesionEmplea && this.isPermisoNuevoProfesionEmplea));						
			this.jButtonDuplicarToolBarProfesionEmplea.setVisible((this.isVisibilidadCeldaDuplicarProfesionEmplea && this.isPermisoDuplicarProfesionEmplea));						
			this.jButtonCopiarToolBarProfesionEmplea.setVisible((this.isVisibilidadCeldaCopiarProfesionEmplea && this.isPermisoCopiarProfesionEmplea));			
			this.jButtonVerFormToolBarProfesionEmplea.setVisible((this.isVisibilidadCeldaVerFormProfesionEmplea && this.isPermisoVerFormProfesionEmplea));			
			this.jButtonAbrirOrderByToolBarProfesionEmplea.setVisible((this.isVisibilidadCeldaOrdenProfesionEmplea && this.isPermisoOrdenProfesionEmplea));
			this.jButtonNuevoRelacionesToolBarProfesionEmplea.setVisible((this.isVisibilidadCeldaNuevoRelacionesProfesionEmplea && this.isPermisoNuevoProfesionEmplea));			
			this.jButtonNuevoGuardarCambiosToolBarProfesionEmplea.setVisible((this.isVisibilidadCeldaNuevoProfesionEmplea && this.isPermisoNuevoProfesionEmplea && this.isPermisoGuardarCambiosProfesionEmplea));			
			
			if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
			this.jInternalFrameDetalleFormProfesionEmplea.jButtonModificarToolBarProfesionEmplea.setVisible((this.isVisibilidadCeldaModificarProfesionEmplea && this.isPermisoActualizarProfesionEmplea));	
			this.jInternalFrameDetalleFormProfesionEmplea.jButtonActualizarToolBarProfesionEmplea.setVisible((this.isVisibilidadCeldaActualizarProfesionEmplea  && this.isPermisoActualizarProfesionEmplea));	
			this.jInternalFrameDetalleFormProfesionEmplea.jButtonEliminarToolBarProfesionEmplea.setVisible((this.isVisibilidadCeldaEliminarProfesionEmplea && this.isPermisoEliminarProfesionEmplea));
			this.jInternalFrameDetalleFormProfesionEmplea.jButtonCancelarToolBarProfesionEmplea.setVisible(this.isVisibilidadCeldaCancelarProfesionEmplea);				
			this.jInternalFrameDetalleFormProfesionEmplea.jButtonGuardarCambiosToolBarProfesionEmplea.setVisible((this.isVisibilidadCeldaGuardarProfesionEmplea && this.isPermisoGuardarCambiosProfesionEmplea));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProfesionEmplea.setVisible((this.isVisibilidadCeldaGuardarCambiosProfesionEmplea && this.isPermisoGuardarCambiosProfesionEmplea));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProfesionEmplea.setVisible((this.isVisibilidadCeldaNuevoProfesionEmplea && this.isPermisoNuevoProfesionEmplea));			
			this.jMenuItemDuplicarProfesionEmplea.setVisible((this.isVisibilidadCeldaDuplicarProfesionEmplea && this.isPermisoDuplicarProfesionEmplea));			
			this.jMenuItemCopiarProfesionEmplea.setVisible((this.isVisibilidadCeldaCopiarProfesionEmplea && this.isPermisoCopiarProfesionEmplea));			
			this.jMenuItemVerFormProfesionEmplea.setVisible((this.isVisibilidadCeldaVerFormProfesionEmplea && this.isPermisoVerFormProfesionEmplea));			
			this.jMenuItemAbrirOrderByProfesionEmplea.setVisible((this.isVisibilidadCeldaOrdenProfesionEmplea && this.isPermisoOrdenProfesionEmplea));			
			//this.jMenuItemMostrarOcultarProfesionEmplea.setVisible((this.isVisibilidadCeldaOrdenProfesionEmplea && this.isPermisoOrdenProfesionEmplea));
			this.jMenuItemDetalleAbrirOrderByProfesionEmplea.setVisible((this.isVisibilidadCeldaOrdenProfesionEmplea && this.isPermisoOrdenProfesionEmplea));			
			//this.jMenuItemDetalleMostrarOcultarProfesionEmplea.setVisible((this.isVisibilidadCeldaOrdenProfesionEmplea && this.isPermisoOrdenProfesionEmplea));			
			this.jMenuItemNuevoRelacionesProfesionEmplea.setVisible((this.isVisibilidadCeldaNuevoRelacionesProfesionEmplea && this.isPermisoNuevoProfesionEmplea));			
			this.jMenuItemNuevoGuardarCambiosProfesionEmplea.setVisible((this.isVisibilidadCeldaNuevoProfesionEmplea && this.isPermisoNuevoProfesionEmplea && this.isPermisoGuardarCambiosProfesionEmplea));									
			
			if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
			this.jInternalFrameDetalleFormProfesionEmplea.jMenuItemModificarProfesionEmplea.setVisible((this.isVisibilidadCeldaModificarProfesionEmplea && this.isPermisoActualizarProfesionEmplea));	
			this.jInternalFrameDetalleFormProfesionEmplea.jMenuItemActualizarProfesionEmplea.setVisible((this.isVisibilidadCeldaActualizarProfesionEmplea && this.isPermisoActualizarProfesionEmplea));	
			this.jInternalFrameDetalleFormProfesionEmplea.jMenuItemEliminarProfesionEmplea.setVisible((this.isVisibilidadCeldaEliminarProfesionEmplea && this.isPermisoEliminarProfesionEmplea));
			this.jInternalFrameDetalleFormProfesionEmplea.jMenuItemCancelarProfesionEmplea.setVisible(this.isVisibilidadCeldaCancelarProfesionEmplea);				
			}
			
			this.jMenuItemGuardarCambiosProfesionEmplea.setVisible((this.isVisibilidadCeldaGuardarProfesionEmplea && this.isPermisoGuardarCambiosProfesionEmplea));						
			this.jMenuItemGuardarCambiosTablaProfesionEmplea.setVisible((this.isVisibilidadCeldaGuardarCambiosProfesionEmplea && this.isPermisoGuardarCambiosProfesionEmplea));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProfesionEmplea=this.jButtonNuevoProfesionEmplea.isVisible();
			this.isVisibilidadCeldaDuplicarProfesionEmplea=this.jButtonDuplicarProfesionEmplea.isVisible();
			this.isVisibilidadCeldaCopiarProfesionEmplea=this.jButtonCopiarProfesionEmplea.isVisible();
			this.isVisibilidadCeldaVerFormProfesionEmplea=this.jButtonVerFormProfesionEmplea.isVisible();
			
			this.isVisibilidadCeldaOrdenProfesionEmplea=this.jButtonAbrirOrderByProfesionEmplea.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProfesionEmplea=this.jButtonNuevoRelacionesProfesionEmplea.isVisible();
			this.isVisibilidadCeldaModificarProfesionEmplea=this.jButtonModificarProfesionEmplea.isVisible();
			
			if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
			this.isVisibilidadCeldaActualizarProfesionEmplea=this.jInternalFrameDetalleFormProfesionEmplea.jButtonActualizarProfesionEmplea.isVisible();
			this.isVisibilidadCeldaEliminarProfesionEmplea=this.jInternalFrameDetalleFormProfesionEmplea.jButtonEliminarProfesionEmplea.isVisible();
			this.isVisibilidadCeldaCancelarProfesionEmplea=this.jInternalFrameDetalleFormProfesionEmplea.jButtonCancelarProfesionEmplea.isVisible();
			this.isVisibilidadCeldaGuardarProfesionEmplea=this.jInternalFrameDetalleFormProfesionEmplea.jButtonGuardarCambiosProfesionEmplea.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProfesionEmplea=this.jButtonGuardarCambiosTablaProfesionEmplea.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProfesionEmplea=this.jButtonNuevoToolBarProfesionEmplea.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProfesionEmplea=this.jButtonNuevoRelacionesToolBarProfesionEmplea.isVisible();
			
			if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
			this.isVisibilidadCeldaModificarProfesionEmplea=this.jInternalFrameDetalleFormProfesionEmplea.jButtonModificarToolBarProfesionEmplea.isVisible();
			this.isVisibilidadCeldaActualizarProfesionEmplea=this.jInternalFrameDetalleFormProfesionEmplea.jButtonActualizarToolBarProfesionEmplea.isVisible();
			this.isVisibilidadCeldaEliminarProfesionEmplea=this.jInternalFrameDetalleFormProfesionEmplea.jButtonEliminarToolBarProfesionEmplea.isVisible();
			this.isVisibilidadCeldaCancelarProfesionEmplea=this.jInternalFrameDetalleFormProfesionEmplea.jButtonCancelarToolBarProfesionEmplea.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProfesionEmplea=this.jButtonGuardarCambiosToolBarProfesionEmplea.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProfesionEmplea=this.jButtonGuardarCambiosTablaToolBarProfesionEmplea.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProfesionEmplea=this.jMenuItemNuevoProfesionEmplea.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProfesionEmplea=this.jMenuItemNuevoRelacionesProfesionEmplea.isVisible();
			
			if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
			this.isVisibilidadCeldaModificarProfesionEmplea=this.jInternalFrameDetalleFormProfesionEmplea.jMenuItemModificarProfesionEmplea.isVisible();
			this.isVisibilidadCeldaActualizarProfesionEmplea=this.jInternalFrameDetalleFormProfesionEmplea.jMenuItemActualizarProfesionEmplea.isVisible();
			this.isVisibilidadCeldaEliminarProfesionEmplea=this.jInternalFrameDetalleFormProfesionEmplea.jMenuItemEliminarProfesionEmplea.isVisible();
			this.isVisibilidadCeldaCancelarProfesionEmplea=this.jInternalFrameDetalleFormProfesionEmplea.jMenuItemCancelarProfesionEmplea.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProfesionEmplea=this.jMenuItemGuardarCambiosProfesionEmplea.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProfesionEmplea=this.jMenuItemGuardarCambiosTablaProfesionEmplea.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProfesionEmplea(Boolean esInicializar) {
		if(ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.profesionempleaSessionBean.getConGuardarRelaciones()) {
				//if(this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProfesionEmplea();
			}
			
			this.inicializarActualizarBindingBotonesManualProfesionEmplea(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProfesionEmplea() {
		this.jButtonNuevoProfesionEmplea.setVisible(this.isPermisoNuevoProfesionEmplea);			
		this.jButtonDuplicarProfesionEmplea.setVisible(this.isPermisoDuplicarProfesionEmplea);			
		this.jButtonCopiarProfesionEmplea.setVisible(this.isPermisoCopiarProfesionEmplea);			
		this.jButtonVerFormProfesionEmplea.setVisible(this.isPermisoVerFormProfesionEmplea);			
		
		this.jButtonAbrirOrderByProfesionEmplea.setVisible(this.isPermisoOrdenProfesionEmplea);					
		
		this.jButtonNuevoRelacionesProfesionEmplea.setVisible(this.isPermisoNuevoProfesionEmplea);			
		
		if(this.jInternalFrameDetalleFormProfesionEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProfesionEmplea.jButtonModificarProfesionEmplea.setVisible(this.isPermisoActualizarProfesionEmplea);	
			this.jInternalFrameDetalleFormProfesionEmplea.jButtonActualizarProfesionEmplea.setVisible(this.isPermisoActualizarProfesionEmplea);	
			this.jInternalFrameDetalleFormProfesionEmplea.jButtonEliminarProfesionEmplea.setVisible(this.isPermisoEliminarProfesionEmplea);
			this.jInternalFrameDetalleFormProfesionEmplea.jButtonCancelarProfesionEmplea.setVisible(this.isVisibilidadCeldaCancelarProfesionEmplea);						
			this.jInternalFrameDetalleFormProfesionEmplea.jButtonGuardarCambiosProfesionEmplea.setVisible(this.isPermisoGuardarCambiosProfesionEmplea);							
		}
		
		this.jButtonGuardarCambiosTablaProfesionEmplea.setVisible(this.isPermisoActualizarProfesionEmplea);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProfesionEmplea() {
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonModificarProfesionEmplea.setVisible(this.isPermisoActualizarProfesionEmplea);	
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonActualizarProfesionEmplea.setVisible(this.isPermisoActualizarProfesionEmplea);	
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonEliminarProfesionEmplea.setVisible(this.isPermisoEliminarProfesionEmplea);
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonCancelarProfesionEmplea.setVisible(this.isVisibilidadCeldaCancelarProfesionEmplea);							
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonGuardarCambiosProfesionEmplea.setVisible((this.isVisibilidadCeldaGuardarProfesionEmplea && this.isPermisoGuardarCambiosProfesionEmplea));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProfesionEmplea() {
		if(ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProfesionEmplea();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProfesionEmplea() {
	}
	
	public void jTableDatosProfesionEmpleaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProfesionEmplea(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProfesionEmpleaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionempleaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProfesionEmplea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProfesionEmplea(this.getprofesionemplea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProfesionEmplea(this.profesionemplea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.profesionemplea =(ProfesionEmplea) this.profesionempleaLogic.getProfesionEmpleas().toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.profesionemplea =(ProfesionEmplea) this.profesionempleas.toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.profesionemplea==null) {
						this.profesionemplea = new ProfesionEmplea();
					}

					this.setVariablesFormularioToObjetoActualProfesionEmplea(this.profesionemplea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProfesionEmplea(this.profesionemplea);
				}

				if(this.profesionemplea.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.profesionemplea.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProfesionEmplea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionempleaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionempleaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionempleaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProfesionEmpleaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProfesionEmplea(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProfesionEmplea.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProfesionEmplea.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProfesionEmplea.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionemplea =(ProfesionEmplea) this.profesionempleaLogic.getProfesionEmpleas().toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.profesionemplea =(ProfesionEmplea) this.profesionempleas.toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProfesionEmplea(this.getprofesionemplea(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProfesionEmplea(this.profesionemplea);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.profesionempleaLogic.getConnexion());

				if(this.profesionemplea.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.profesionemplea.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProfesionEmplea=(TitledBorder)this.jScrollPanelDatosProfesionEmplea.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProfesionEmplea.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProfesionEmpleaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionempleaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProfesionEmplea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProfesionEmplea(this.getprofesionemplea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProfesionEmplea(this.profesionemplea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.profesionemplea =(ProfesionEmplea) this.profesionempleaLogic.getProfesionEmpleas().toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.profesionemplea =(ProfesionEmplea) this.profesionempleas.toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.profesionemplea==null) {
						this.profesionemplea = new ProfesionEmplea();
					}

					this.setVariablesFormularioToObjetoActualProfesionEmplea(this.profesionemplea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProfesionEmplea(this.profesionemplea);
				}

				if(this.profesionemplea.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.profesionemplea.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProfesionEmplea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionempleaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionempleaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionempleaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoProfesionEmpleaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderProfesionEmplea=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosProfesionEmplea.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderProfesionEmplea=(TitledBorder)this.jScrollPanelDatosProfesionEmplea.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderProfesionEmplea.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoProfesionEmpleaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebProfesionEmplea(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProfesionEmplea.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProfesionEmplea.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProfesionEmplea.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionemplea =(ProfesionEmplea) this.profesionempleaLogic.getProfesionEmpleas().toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.profesionemplea =(ProfesionEmplea) this.profesionempleas.toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProfesionEmplea(this.getprofesionemplea(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProfesionEmplea(this.profesionemplea);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.profesionempleaLogic.getConnexion());

				if(this.profesionemplea.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.profesionemplea.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProfesionEmplea=(TitledBorder)this.jScrollPanelDatosProfesionEmplea.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderProfesionEmplea.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoProfesionEmpleaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionempleaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProfesionEmplea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProfesionEmplea(this.getprofesionemplea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProfesionEmplea(this.profesionemplea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.profesionemplea =(ProfesionEmplea) this.profesionempleaLogic.getProfesionEmpleas().toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.profesionemplea =(ProfesionEmplea) this.profesionempleas.toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.profesionemplea==null) {
						this.profesionemplea = new ProfesionEmplea();
					}

					this.setVariablesFormularioToObjetoActualProfesionEmplea(this.profesionemplea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProfesionEmplea(this.profesionemplea);
				}

				if(this.profesionemplea.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.profesionemplea.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProfesionEmplea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionempleaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionempleaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionempleaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_profesionProfesionEmpleaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoprofesion=true;

			idTienePermisoprofesion=this.tienePermisosUsuarioEnPaginaWebProfesionEmplea(ProfesionConstantesFunciones.CLASSNAME);

			if(idTienePermisoprofesion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProfesionEmplea.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProfesionEmplea.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProfesionEmplea.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionemplea =(ProfesionEmplea) this.profesionempleaLogic.getProfesionEmpleas().toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.profesionemplea =(ProfesionEmplea) this.profesionempleas.toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProfesionEmplea(this.getprofesionemplea(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProfesionEmplea(this.profesionemplea);

				this.profesionBeanSwingJInternalFrame=new ProfesionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.profesionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.profesionBeanSwingJInternalFrame.getProfesionLogic().setConnexion(this.profesionempleaLogic.getConnexion());

				if(this.profesionemplea.getid_profesion()!=null) {
					this.profesionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.profesionBeanSwingJInternalFrame.setIdActual(this.profesionemplea.getid_profesion());
					this.profesionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.profesionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.profesionBeanSwingJInternalFrame.inicializarActualizarBindingTablaProfesion();
				}

				JInternalFrameBase jinternalFrame =this.profesionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProfesionEmplea=(TitledBorder)this.jScrollPanelDatosProfesionEmplea.getBorder();
				TitledBorder titledBorderprofesion=(TitledBorder)this.profesionBeanSwingJInternalFrame.jScrollPanelDatosProfesion.getBorder();

				titledBorderprofesion.setTitle(titledBorderProfesionEmplea.getTitle() + " -> Profesion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_profesionProfesionEmpleaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionempleaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProfesionEmplea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProfesionEmplea(this.getprofesionemplea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProfesionEmplea(this.profesionemplea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.profesionemplea =(ProfesionEmplea) this.profesionempleaLogic.getProfesionEmpleas().toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.profesionemplea =(ProfesionEmplea) this.profesionempleas.toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.profesionemplea==null) {
						this.profesionemplea = new ProfesionEmplea();
					}

					this.setVariablesFormularioToObjetoActualProfesionEmplea(this.profesionemplea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProfesionEmplea(this.profesionemplea);
				}

				if(this.profesionemplea.getid_profesion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_profesion = "+this.profesionemplea.getid_profesion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProfesionEmplea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionempleaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionempleaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionempleaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoProfesionEmpleaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProfesionEmplea(false,false);

			this.getProfesionEmpleasFK_IdEmpleado();

			this.inicializarActualizarBindingProfesionEmplea(false);

			//if(ProfesionEmpleaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProfesionEmplea(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaProfesionEmpleaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProfesionEmplea(false,false);

			this.getProfesionEmpleasFK_IdEmpresa();

			this.inicializarActualizarBindingProfesionEmplea(false);

			//if(ProfesionEmpleaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProfesionEmplea(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProfesionProfesionEmpleaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProfesionEmplea(false,false);

			this.getProfesionEmpleasFK_IdProfesion();

			this.inicializarActualizarBindingProfesionEmplea(false);

			//if(ProfesionEmpleaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProfesionEmplea(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionempleaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProfesionEmplea() {
		if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
			this.jInternalFrameDetalleFormProfesionEmplea.setVisible(false);	    			
			this.jInternalFrameDetalleFormProfesionEmplea.dispose();
			this.jInternalFrameDetalleFormProfesionEmplea=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProfesionEmplea!=null) {
			this.jInternalFrameReporteDinamicoProfesionEmplea.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProfesionEmplea.dispose();
			this.jInternalFrameReporteDinamicoProfesionEmplea=null;
		}
		
		if(this.jInternalFrameImportacionProfesionEmplea!=null) {
			this.jInternalFrameImportacionProfesionEmplea.setVisible(false);	    			
			this.jInternalFrameImportacionProfesionEmplea.dispose();
			this.jInternalFrameImportacionProfesionEmplea=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProfesionEmplea();
			
			ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
			
			
			if(sTipo.equals("NuevoProfesionEmplea")) {
				jButtonNuevoProfesionEmpleaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProfesionEmplea")) {
				jButtonDuplicarProfesionEmpleaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProfesionEmplea")) {
				jButtonCopiarProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("VerFormProfesionEmplea")) {
				jButtonVerFormProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProfesionEmplea")) {
				jButtonNuevoProfesionEmpleaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProfesionEmplea")) {
				jButtonDuplicarProfesionEmpleaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProfesionEmplea")) {
				jButtonNuevoProfesionEmpleaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProfesionEmplea")) {
				jButtonDuplicarProfesionEmpleaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProfesionEmplea")) {
				jButtonNuevoProfesionEmpleaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProfesionEmplea")) {
				jButtonNuevoProfesionEmpleaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProfesionEmplea")) {
				jButtonNuevoProfesionEmpleaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProfesionEmplea")) {
				jButtonModificarProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProfesionEmplea")) {
				jButtonModificarProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProfesionEmplea")) {
				jButtonModificarProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProfesionEmplea")) {
				jButtonActualizarProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProfesionEmplea")) {
				jButtonActualizarProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProfesionEmplea")) {
				jButtonActualizarProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("EliminarProfesionEmplea")) {
				jButtonEliminarProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProfesionEmplea")) {
				jButtonEliminarProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProfesionEmplea")) {
				jButtonEliminarProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("CancelarProfesionEmplea")) {
				jButtonCancelarProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProfesionEmplea")) {
				jButtonCancelarProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProfesionEmplea")) {
				jButtonCancelarProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("CerrarProfesionEmplea")) {
				jButtonCerrarProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProfesionEmplea")) {
				jButtonCerrarProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProfesionEmplea")) {
				jButtonCerrarProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProfesionEmplea")) {
				jButtonMostrarOcultarProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProfesionEmplea")) {
				jButtonCancelarProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProfesionEmplea")) {
				jButtonGuardarCambiosProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProfesionEmplea")) {
				jButtonGuardarCambiosProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProfesionEmplea")) {
				jButtonCopiarProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProfesionEmplea")) {
				jButtonVerFormProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProfesionEmplea")) {
				jButtonGuardarCambiosProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProfesionEmplea")) {
				jButtonCopiarProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProfesionEmplea")) {
				jButtonVerFormProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProfesionEmplea")) {
				jButtonGuardarCambiosProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProfesionEmplea")) {
				jButtonGuardarCambiosProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProfesionEmplea")) {
				jButtonGuardarCambiosProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProfesionEmplea")) {
				jButtonRecargarInformacionProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProfesionEmplea")) {
				jButtonRecargarInformacionProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProfesionEmplea")) {
				jButtonRecargarInformacionProfesionEmpleaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProfesionEmplea")) {
				jButtonAnterioresProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProfesionEmplea")) {
				jButtonAnterioresProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProfesionEmplea")) {
				jButtonAnterioresProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProfesionEmplea")) {
				jButtonSiguientesProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProfesionEmplea")) {
				jButtonSiguientesProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProfesionEmplea")) {
				jButtonSiguientesProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProfesionEmplea") || sTipo.equals("MenuItemDetalleAbrirOrderByProfesionEmplea")) {
				jButtonAbrirOrderByProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProfesionEmplea") || sTipo.equals("MenuItemDetalleMostrarOcultarProfesionEmplea")) {
				jButtonMostrarOcultarProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProfesionEmplea")) {
				jButtonNuevoGuardarCambiosProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProfesionEmplea")) {
				jButtonNuevoGuardarCambiosProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProfesionEmplea")) {
				jButtonNuevoGuardarCambiosProfesionEmpleaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProfesionEmplea")) {
				jButtonCerrarReporteDinamicoProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProfesionEmplea")) {
				jButtonGenerarReporteDinamicoProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProfesionEmplea")) {
				
				jButtonGenerarExcelReporteDinamicoProfesionEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProfesionEmplea")) {
				jButtonCerrarImportacionProfesionEmpleaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProfesionEmplea")) {
				
				jButtonGenerarImportacionProfesionEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProfesionEmplea")) {
				
				jButtonAbrirImportacionProfesionEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProfesionEmplea")) {
				jComboBoxTiposAccionesProfesionEmpleaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProfesionEmplea")) {
				jComboBoxTiposRelacionesProfesionEmpleaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProfesionEmplea")) {
				jComboBoxTiposAccionesProfesionEmpleaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProfesionEmplea")) {
				
				jComboBoxTiposSeleccionarProfesionEmpleaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProfesionEmplea")) {
				jTextFieldValorCampoGeneralProfesionEmpleaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProfesionEmplea")) {
				jButtonAbrirOrderByProfesionEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProfesionEmplea")) {
				jButtonAbrirOrderByProfesionEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProfesionEmplea")) {
				jButtonCerrarOrderByProfesionEmpleaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProfesionEmpleaBusqueda")) {
				this.jButtonidProfesionEmpleaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProfesionEmpleaUpdate")) {
				this.jButtonid_empresaProfesionEmpleaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProfesionEmpleaBusqueda")) {
				this.jButtonid_empresaProfesionEmpleaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoProfesionEmplea")) {
				this.jButtonid_empleadoProfesionEmpleaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoProfesionEmpleaUpdate")) {
				this.jButtonid_empleadoProfesionEmpleaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoProfesionEmpleaBusqueda")) {
				this.jButtonid_empleadoProfesionEmpleaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_profesionProfesionEmpleaUpdate")) {
				this.jButtonid_profesionProfesionEmpleaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_profesionProfesionEmpleaBusqueda")) {
				this.jButtonid_profesionProfesionEmpleaBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_empleadoProfesionEmplea")) {
				this.jButtonid_empleadoProfesionEmpleaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdEmpleadoProfesionEmplea")) {
				this.jButtonFK_IdEmpleadoProfesionEmpleaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProfesionProfesionEmplea")) {
				this.jButtonFK_IdProfesionProfesionEmpleaActionPerformed(evt);
			}
			
			;
			
			
			ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProfesionEmplea();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProfesionEmpleaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.profesionemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.profesionemplea);
				
				ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
				
				


				
				ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProfesionEmplea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProfesionEmplea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProfesionEmplea profesionempleaLocal=null;
			
			if(!this.getEsControlTabla()) {
				profesionempleaLocal=this.profesionemplea;
			} else {
				profesionempleaLocal=this.profesionempleaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.profesionemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.profesionemplea);
				
				ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
							
				
				


				
				ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProfesionEmplea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProfesionEmplea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProfesionEmpleaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProfesionEmplea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionempleaAnterior =(ProfesionEmplea) this.profesionempleaLogic.getProfesionEmpleas().toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.profesionempleaAnterior =(ProfesionEmplea) this.profesionempleas.toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
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
			
			ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
			
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
			
			


			
			ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProfesionEmpleaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.profesionemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.profesionemplea);
				
				ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
								
						
				


				
				ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProfesionEmplea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProfesionEmplea.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.profesionemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.profesionemplea);
				
				ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
								
				
				


				
				ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProfesionEmplea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProfesionEmplea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProfesionEmpleaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProfesionEmplea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionempleaAnterior =(ProfesionEmplea) this.profesionempleaLogic.getProfesionEmpleas().toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.profesionempleaAnterior =(ProfesionEmplea) this.profesionempleas.toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.profesionemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.profesionemplea);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProfesionEmpleaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProfesionEmplea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionempleaAnterior =(ProfesionEmplea) this.profesionempleaLogic.getProfesionEmpleas().toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.profesionempleaAnterior =(ProfesionEmplea) this.profesionempleas.toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProfesionEmpleaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.profesionemplea);
			
			this.actualizarInformacion("INFO_PADRE",false,this.profesionemplea);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.profesionemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.profesionemplea);
				
				ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
							
				
				


				
				ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProfesionEmplea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProfesionEmplea.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProfesionEmpleaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProfesionEmplea.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.profesionempleaAnterior =(ProfesionEmplea) this.profesionempleaLogic.getProfesionEmpleas().toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.profesionempleaAnterior =(ProfesionEmplea) this.profesionempleas.toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
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
			
			ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
			
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
			
			


			
			ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProfesionEmpleaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.profesionemplea);
			
			this.actualizarInformacion("INFO_PADRE",false,this.profesionemplea);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.profesionemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.profesionemplea);
				
				ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
								
				
				


				
				ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProfesionEmplea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProfesionEmplea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProfesionEmpleaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProfesionEmplea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionempleaAnterior =(ProfesionEmplea) this.profesionempleaLogic.getProfesionEmpleas().toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.profesionempleaAnterior =(ProfesionEmplea) this.profesionempleas.toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProfesionEmpleaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.profesionemplea);
			
			this.actualizarInformacion("INFO_PADRE",false,this.profesionemplea);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProfesionEmpleaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.profesionemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.profesionemplea);
				
				ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProfesionEmplea")) {
					jCheckBoxSeleccionarTodosProfesionEmpleaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProfesionEmplea")) {
					jCheckBoxSeleccionadosProfesionEmpleaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProfesionEmplea")) {
					
				}
				
				


				
				
				ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProfesionEmplea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProfesionEmplea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.profesionemplea);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.profesionemplea);
				
				ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
												
				
				


				
				
				ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProfesionEmplea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProfesionEmplea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProfesionEmpleaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProfesionEmplea.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.profesionempleaAnterior =(ProfesionEmplea) this.profesionempleaLogic.getProfesionEmpleas().toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.profesionempleaAnterior =(ProfesionEmplea) this.profesionempleas.toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProfesionEmpleaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.profesionemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.profesionemplea);
				
				ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
				
				
				ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
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
			
			ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
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
			
			


			
			ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProfesionEmpleaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.profesionemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.profesionemplea);
				
				ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProfesionEmplea.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProfesionEmplea.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.profesionemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.profesionemplea);
				
				ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
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
				
				


				
				ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProfesionEmplea.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProfesionEmplea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProfesionEmpleaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProfesionEmplea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionempleaAnterior =(ProfesionEmplea) this.profesionempleaLogic.getProfesionEmpleas().toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.profesionempleaAnterior =(ProfesionEmplea) this.profesionempleas.toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProfesionEmplea")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProfesionEmpleaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProfesionEmplea.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.profesionemplea =(ProfesionEmplea) this.profesionempleaLogic.getProfesionEmpleas().toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.profesionemplea =(ProfesionEmplea) this.profesionempleas.toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.profesionemplea);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProfesionEmplea")) {
				
				}
				
				ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProfesionEmplea")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProfesionEmplea.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProfesionEmplea")) {
			
			}
			
			ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProfesionEmplea();
			
			ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
			
			if(sTipo.equals("NuevoProfesionEmplea")) {
				jButtonNuevoProfesionEmpleaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProfesionEmplea")) {
				jButtonDuplicarProfesionEmpleaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProfesionEmplea")) {
				jButtonCopiarProfesionEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProfesionEmplea")) {
				jButtonVerFormProfesionEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProfesionEmplea")) {
				jButtonNuevoProfesionEmpleaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProfesionEmplea")) {
				jButtonModificarProfesionEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProfesionEmplea")) {
				jButtonActualizarProfesionEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProfesionEmplea")) {
				jButtonEliminarProfesionEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProfesionEmplea")) {
				jButtonGuardarCambiosProfesionEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProfesionEmplea")) {
				jButtonCancelarProfesionEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProfesionEmplea")) {
				jButtonCerrarProfesionEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProfesionEmplea")) {
				jButtonGuardarCambiosProfesionEmpleaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProfesionEmplea")) {
				jButtonNuevoGuardarCambiosProfesionEmpleaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProfesionEmplea")) {
				jButtonAbrirOrderByProfesionEmpleaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProfesionEmplea")) {
				jButtonRecargarInformacionProfesionEmpleaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProfesionEmplea")) {
				jButtonAnterioresProfesionEmpleaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProfesionEmplea")) {
				jButtonSiguientesProfesionEmpleaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProfesionEmpleaBusqueda")) {
				this.jButtonidProfesionEmpleaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProfesionEmpleaUpdate")) {
				this.jButtonid_empresaProfesionEmpleaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProfesionEmpleaBusqueda")) {
				this.jButtonid_empresaProfesionEmpleaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoProfesionEmplea")) {
				this.jButtonid_empleadoProfesionEmpleaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoProfesionEmpleaUpdate")) {
				this.jButtonid_empleadoProfesionEmpleaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoProfesionEmpleaBusqueda")) {
				this.jButtonid_empleadoProfesionEmpleaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_profesionProfesionEmpleaUpdate")) {
				this.jButtonid_profesionProfesionEmpleaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_profesionProfesionEmpleaBusqueda")) {
				this.jButtonid_profesionProfesionEmpleaBusquedaActionPerformed(evt);
			}
			
			ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProfesionEmplea();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProfesionEmplea")) {
				closingInternalFrameProfesionEmplea();
				
			} else if(sTipo.equals("jButtonCancelarProfesionEmplea")) {
				JInternalFrameBase jInternalFrameDetalleFormProfesionEmplea = (JInternalFrameBase)evt.getSource();
	            	
	            ProfesionEmpleaBeanSwingJInternalFrame jInternalFrameParent=(ProfesionEmpleaBeanSwingJInternalFrame)jInternalFrameDetalleFormProfesionEmplea.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProfesionEmpleaActionPerformed(null);
			}
			
			ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.profesionemplea,new Object(),this.profesionempleaParameterGeneral,this.profesionempleaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProfesionEmplea(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProfesionEmplea(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProfesionEmplea(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.profesionemplea)) {
			if(!esControlTabla) {
				if(ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProfesionEmplea(this.profesionemplea,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProfesionEmplea(this.profesionemplea);			
				}
				
				if(this.profesionempleaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProfesionEmplea(this.profesionemplea,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.profesionempleaReturnGeneral=profesionempleaLogic.procesarEventosProfesionEmpleasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.profesionempleaLogic.getProfesionEmpleas(),this.profesionemplea,this.profesionempleaParameterGeneral,this.isEsNuevoProfesionEmplea,classes);//this.profesionempleaLogic.getProfesionEmplea()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProfesionEmplea(this.profesionempleaReturnGeneral,this.profesionempleaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.profesionempleaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProfesionEmplea(classes,this.profesionempleaReturnGeneral,this.profesionempleaBean,false);
					}
						
					if(this.profesionempleaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProfesionEmplea(this.profesionempleaReturnGeneral.getProfesionEmplea());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProfesionEmplea(this.profesionempleaReturnGeneral.getProfesionEmplea());	
					}
						
					if(this.profesionempleaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProfesionEmplea(this.profesionempleaReturnGeneral.getProfesionEmplea(),classes);//this.profesionempleaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProfesionEmplea(this.profesionemplea,classes);//this.profesionempleaBean);									
				}
			
				if(ProfesionEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProfesionEmplea(this.profesionemplea,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProfesionEmplea(this.profesionemplea);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.profesionempleaAnterior!=null) {
						this.profesionemplea=this.profesionempleaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.profesionempleaReturnGeneral=profesionempleaLogic.procesarEventosProfesionEmpleasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.profesionempleaLogic.getProfesionEmpleas(),this.profesionemplea,this.profesionempleaParameterGeneral,this.isEsNuevoProfesionEmplea,classes);//this.profesionempleaLogic.getProfesionEmplea()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.profesionempleaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.profesionempleaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.profesionempleaReturnGeneral.getProfesionEmplea(),profesionempleaLogic.getProfesionEmpleas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.profesionempleaReturnGeneral.getProfesionEmplea(),this.profesionempleas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProfesionEmplea.repaint();
				
				//((AbstractTableModel) this.jTableDatosProfesionEmplea.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProfesionEmplea();
			}
		}
	}
	
	public void actualizarVisualTableDatosProfesionEmplea() throws Exception {
		
		ProfesionEmpleaModel profesionempleaModel=(ProfesionEmpleaModel)this.jTableDatosProfesionEmplea.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			profesionempleaModel.profesionempleas=this.profesionempleaLogic.getProfesionEmpleas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			profesionempleaModel.profesionempleas=this.profesionempleas;
		}
		
		
		((ProfesionEmpleaModel) this.jTableDatosProfesionEmplea.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProfesionEmplea() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprofesionempleaAnterior(),this.profesionempleaLogic.getProfesionEmpleas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprofesionempleaAnterior(),this.profesionempleas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProfesionEmplea();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProfesionEmplea(ProfesionEmplea profesionemplea,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
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
										
				ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.profesionemplea,new Object(),generalEntityParameterGeneral,this.profesionempleaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.profesionempleaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProfesionEmpleaConstantesFunciones.getClassesRelationshipsOfProfesionEmplea(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProfesionEmpleaConstantesFunciones.getClassesRelationshipsFromStringsOfProfesionEmplea(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProfesionEmplea(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProfesionEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.profesionemplea,new Object(),generalEntityParameterGeneral,this.profesionempleaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProfesionEmplea(ProfesionEmpleaBean profesionempleaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProfesionEmplea(ArrayList<Classe> classes,ProfesionEmpleaReturnGeneral profesionempleaReturnGeneral,ProfesionEmpleaBean profesionempleaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProfesionEmplea(ProfesionEmplea profesionemplea,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.profesionemplea)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProfesionEmplea = new ProfesionEmpleaDetalleFormJInternalFrame(jDesktopPane,this.profesionempleaSessionBean.getConGuardarRelaciones(),this.profesionempleaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProfesionEmplea);
		this.jInternalFrameDetalleFormProfesionEmplea.setVisible(false);
		this.jInternalFrameDetalleFormProfesionEmplea.setSelected(false);						
		
		this.jInternalFrameDetalleFormProfesionEmplea.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProfesionEmplea.profesionempleaLogic=this.profesionempleaLogic;
		
		this.cargarCombosFrameForeignKeyProfesionEmplea("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProfesionEmplea();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProfesionEmplea();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProfesionEmplea("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProfesionEmplea();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProfesionEmplea.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProfesionEmplea"));
		
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonModificarProfesionEmplea.addActionListener(new ButtonActionListener(this,"ModificarProfesionEmplea"));

		
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonModificarToolBarProfesionEmplea.addActionListener(new ButtonActionListener(this,"ModificarToolBarProfesionEmplea"));
					
		this.jInternalFrameDetalleFormProfesionEmplea.jMenuItemModificarProfesionEmplea.addActionListener(new ButtonActionListener(this,"MenuItemModificarProfesionEmplea"));		
		
		
		
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonActualizarProfesionEmplea.addActionListener (new ButtonActionListener(this,"ActualizarProfesionEmplea"));
		
		
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonActualizarToolBarProfesionEmplea.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProfesionEmplea"));
						
		this.jInternalFrameDetalleFormProfesionEmplea.jMenuItemActualizarProfesionEmplea.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProfesionEmplea"));		
		
		
		
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonEliminarProfesionEmplea.addActionListener (new ButtonActionListener(this,"EliminarProfesionEmplea"));
		
		
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonEliminarToolBarProfesionEmplea.addActionListener (new ButtonActionListener(this,"EliminarToolBarProfesionEmplea"));
								
		this.jInternalFrameDetalleFormProfesionEmplea.jMenuItemEliminarProfesionEmplea.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProfesionEmplea"));		
		
		
		
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonCancelarProfesionEmplea.addActionListener (new ButtonActionListener(this,"CancelarProfesionEmplea"));
		
		
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonCancelarToolBarProfesionEmplea.addActionListener (new ButtonActionListener(this,"CancelarToolBarProfesionEmplea"));
					
		this.jInternalFrameDetalleFormProfesionEmplea.jMenuItemCancelarProfesionEmplea.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProfesionEmplea"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProfesionEmplea.jMenuItemDetalleCerrarProfesionEmplea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProfesionEmplea"));		
		
		
		
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonGuardarCambiosToolBarProfesionEmplea.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProfesionEmplea"));
		
		
		
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonGuardarCambiosToolBarProfesionEmplea.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProfesionEmplea"));
		
		
		
		this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxTiposAccionesFormularioProfesionEmplea.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProfesionEmplea"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonidProfesionEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"idProfesionEmpleaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonid_empresaProfesionEmpleaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProfesionEmpleaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonid_empresaProfesionEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProfesionEmpleaBusqueda"));
		//jButtonid_empleadoProfesionEmplea.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoProfesionEmpleaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonid_empleadoProfesionEmplea.addActionListener(new ButtonActionListener(this,"id_empleadoProfesionEmplea"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonid_empleadoProfesionEmpleaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoProfesionEmpleaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonid_empleadoProfesionEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoProfesionEmpleaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonid_profesionProfesionEmpleaUpdate.addActionListener(new ButtonActionListener(this,"id_profesionProfesionEmpleaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonid_profesionProfesionEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"id_profesionProfesionEmpleaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProfesionEmplea.jTabbedPaneRelacionesProfesionEmplea.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProfesionEmplea"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProfesionEmplea"));
		
		if(this.jInternalFrameDetalleFormProfesionEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProfesionEmplea.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProfesionEmplea"));
		}
		
		this.jTableDatosProfesionEmplea.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProfesionEmplea"));
		
		this.jTableDatosProfesionEmplea.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProfesionEmplea"));
		
		this.jButtonNuevoProfesionEmplea.addActionListener(new ButtonActionListener(this,"NuevoProfesionEmplea"));
		
		this.jButtonDuplicarProfesionEmplea.addActionListener(new ButtonActionListener(this,"DuplicarProfesionEmplea"));
		
		this.jButtonCopiarProfesionEmplea.addActionListener(new ButtonActionListener(this,"CopiarProfesionEmplea"));
		
		this.jButtonVerFormProfesionEmplea.addActionListener(new ButtonActionListener(this,"VerFormProfesionEmplea"));
		
		
		this.jButtonNuevoToolBarProfesionEmplea.addActionListener(new ButtonActionListener(this,"NuevoToolBarProfesionEmplea"));
			
		this.jButtonDuplicarToolBarProfesionEmplea.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProfesionEmplea"));
			
		this.jMenuItemNuevoProfesionEmplea.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProfesionEmplea"));
			
		this.jMenuItemDuplicarProfesionEmplea.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProfesionEmplea"));		
		
		
		this.jButtonNuevoRelacionesProfesionEmplea.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProfesionEmplea"));
		
		
		this.jButtonNuevoRelacionesToolBarProfesionEmplea.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProfesionEmplea"));
			
		this.jMenuItemNuevoRelacionesProfesionEmplea.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProfesionEmplea"));		
		
		
		if(this.jInternalFrameDetalleFormProfesionEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProfesionEmplea.jButtonModificarProfesionEmplea.addActionListener(new ButtonActionListener(this,"ModificarProfesionEmplea"));
		}
		
		
		if(this.jInternalFrameDetalleFormProfesionEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProfesionEmplea.jButtonModificarToolBarProfesionEmplea.addActionListener(new ButtonActionListener(this,"ModificarToolBarProfesionEmplea"));
			
			this.jInternalFrameDetalleFormProfesionEmplea.jMenuItemModificarProfesionEmplea.addActionListener(new ButtonActionListener(this,"MenuItemModificarProfesionEmplea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProfesionEmplea!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProfesionEmplea.jButtonActualizarProfesionEmplea.addActionListener (new ButtonActionListener(this,"ActualizarProfesionEmplea"));
		}
		
		
		if(this.jInternalFrameDetalleFormProfesionEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProfesionEmplea.jButtonActualizarToolBarProfesionEmplea.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProfesionEmplea"));
				
			this.jInternalFrameDetalleFormProfesionEmplea.jMenuItemActualizarProfesionEmplea.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProfesionEmplea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProfesionEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProfesionEmplea.jButtonEliminarProfesionEmplea.addActionListener (new ButtonActionListener(this,"EliminarProfesionEmplea"));
		}
		
		
		if(this.jInternalFrameDetalleFormProfesionEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProfesionEmplea.jButtonEliminarToolBarProfesionEmplea.addActionListener (new ButtonActionListener(this,"EliminarToolBarProfesionEmplea"));
						
			this.jInternalFrameDetalleFormProfesionEmplea.jMenuItemEliminarProfesionEmplea.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProfesionEmplea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProfesionEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProfesionEmplea.jButtonCancelarProfesionEmplea.addActionListener (new ButtonActionListener(this,"CancelarProfesionEmplea"));
		}
		
		
		if(this.jInternalFrameDetalleFormProfesionEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProfesionEmplea.jButtonCancelarToolBarProfesionEmplea.addActionListener (new ButtonActionListener(this,"CancelarToolBarProfesionEmplea"));
			
			this.jInternalFrameDetalleFormProfesionEmplea.jMenuItemCancelarProfesionEmplea.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProfesionEmplea"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProfesionEmplea.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProfesionEmplea"));		
		
		
		this.jButtonCerrarProfesionEmplea.addActionListener (new ButtonActionListener(this,"CerrarProfesionEmplea"));
		
		
		this.jButtonCerrarToolBarProfesionEmplea.addActionListener (new ButtonActionListener(this,"CerrarToolBarProfesionEmplea"));
			
		this.jMenuItemCerrarProfesionEmplea.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProfesionEmplea"));
			
		if(this.jInternalFrameDetalleFormProfesionEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProfesionEmplea.jMenuItemDetalleCerrarProfesionEmplea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProfesionEmplea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProfesionEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProfesionEmplea.jButtonGuardarCambiosProfesionEmplea.addActionListener (new ButtonActionListener(this,"GuardarCambiosProfesionEmplea"));
		}
		
		
		if(this.jInternalFrameDetalleFormProfesionEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProfesionEmplea.jButtonGuardarCambiosToolBarProfesionEmplea.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProfesionEmplea"));
		}
		
		this.jButtonCopiarToolBarProfesionEmplea.addActionListener (new ButtonActionListener(this,"CopiarToolBarProfesionEmplea"));
			
		this.jButtonVerFormToolBarProfesionEmplea.addActionListener (new ButtonActionListener(this,"VerFormToolBarProfesionEmplea"));
		
		this.jMenuItemGuardarCambiosProfesionEmplea.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProfesionEmplea"));
			
		this.jMenuItemCopiarProfesionEmplea.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProfesionEmplea"));		
		
		this.jMenuItemVerFormProfesionEmplea.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProfesionEmplea"));		
		
		
		this.jButtonGuardarCambiosTablaProfesionEmplea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProfesionEmplea"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProfesionEmplea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProfesionEmplea"));
			
		this.jMenuItemGuardarCambiosTablaProfesionEmplea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProfesionEmplea"));		
		
		
		
		this.jButtonRecargarInformacionProfesionEmplea.addActionListener (new ButtonActionListener(this,"RecargarInformacionProfesionEmplea"));
					
		this.jButtonRecargarInformacionToolBarProfesionEmplea.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProfesionEmplea"));
		
		this.jMenuItemRecargarInformacionProfesionEmplea.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProfesionEmplea"));		
		
		
		
		this.jButtonAnterioresProfesionEmplea.addActionListener (new ButtonActionListener(this,"AnterioresProfesionEmplea"));
		
		
		this.jButtonAnterioresToolBarProfesionEmplea.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProfesionEmplea"));
		
		this.jMenuItemAnterioresProfesionEmplea.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProfesionEmplea"));		
		
		
		this.jButtonSiguientesProfesionEmplea.addActionListener (new ButtonActionListener(this,"SiguientesProfesionEmplea"));
		
		
		this.jButtonSiguientesToolBarProfesionEmplea.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProfesionEmplea"));
			
		this.jMenuItemSiguientesProfesionEmplea.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProfesionEmplea"));
			
		this.jMenuItemAbrirOrderByProfesionEmplea.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProfesionEmplea"));
			
		this.jMenuItemMostrarOcultarProfesionEmplea.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProfesionEmplea"));
			
		this.jMenuItemDetalleAbrirOrderByProfesionEmplea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProfesionEmplea"));
			
		this.jMenuItemDetalleMostarOcultarProfesionEmplea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProfesionEmplea"));		
		
		
		this.jButtonNuevoGuardarCambiosProfesionEmplea.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProfesionEmplea"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProfesionEmplea.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProfesionEmplea"));
			
		this.jMenuItemNuevoGuardarCambiosProfesionEmplea.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProfesionEmplea"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProfesionEmplea.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProfesionEmplea"));

		this.jCheckBoxSeleccionadosProfesionEmplea.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProfesionEmplea"));
		
		if(this.jInternalFrameDetalleFormProfesionEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxTiposAccionesFormularioProfesionEmplea.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProfesionEmplea"));
		}
		
		
		this.jComboBoxTiposRelacionesProfesionEmplea.addActionListener (new ButtonActionListener(this,"TiposRelacionesProfesionEmplea"));
			
		this.jComboBoxTiposAccionesProfesionEmplea.addActionListener (new ButtonActionListener(this,"TiposAccionesProfesionEmplea"));
					
		this.jComboBoxTiposSeleccionarProfesionEmplea.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProfesionEmplea"));
			
		this.jTextFieldValorCampoGeneralProfesionEmplea.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProfesionEmplea"));		
		
		
		if(this.jInternalFrameDetalleFormProfesionEmplea!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonidProfesionEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"idProfesionEmpleaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonid_empresaProfesionEmpleaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProfesionEmpleaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonid_empresaProfesionEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProfesionEmpleaBusqueda"));
		//jButtonid_empleadoProfesionEmplea.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoProfesionEmpleaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonid_empleadoProfesionEmplea.addActionListener(new ButtonActionListener(this,"id_empleadoProfesionEmplea"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonid_empleadoProfesionEmpleaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoProfesionEmpleaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonid_empleadoProfesionEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoProfesionEmpleaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonid_profesionProfesionEmpleaUpdate.addActionListener(new ButtonActionListener(this,"id_profesionProfesionEmpleaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonid_profesionProfesionEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"id_profesionProfesionEmpleaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoProfesionEmplea.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoProfesionEmplea"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoProfesionEmplea.addActionListener(new ButtonActionListener(this,"id_empleadoProfesionEmplea"));

			this.jButtonFK_IdProfesionProfesionEmplea.addActionListener(new ButtonActionListener(this,"FK_IdProfesionProfesionEmplea"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProfesionEmplea!=null) {
				this.jInternalFrameReporteDinamicoProfesionEmplea.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProfesionEmplea"));
				this.jInternalFrameReporteDinamicoProfesionEmplea.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProfesionEmplea"));
				this.jInternalFrameReporteDinamicoProfesionEmplea.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProfesionEmplea"));
			}
			
			//this.jButtonCerrarReporteDinamicoProfesionEmplea.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProfesionEmplea"));				
			//this.jButtonGenerarReporteDinamicoProfesionEmplea.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProfesionEmplea"));
			//this.jButtonGenerarExcelReporteDinamicoProfesionEmplea.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProfesionEmplea"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProfesionEmplea!=null) {
				this.jInternalFrameImportacionProfesionEmplea.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProfesionEmplea"));
				this.jInternalFrameImportacionProfesionEmplea.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProfesionEmplea"));
				this.jInternalFrameImportacionProfesionEmplea.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProfesionEmplea"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProfesionEmplea.addActionListener (new ButtonActionListener(this,"AbrirOrderByProfesionEmplea"));
			
			this.jButtonAbrirOrderByToolBarProfesionEmplea.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProfesionEmplea"));			
			
			if(this.jInternalFrameOrderByProfesionEmplea!=null) {
				this.jInternalFrameOrderByProfesionEmplea.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProfesionEmplea"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProfesionEmplea!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProfesionEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProfesionEmplea.jTabbedPaneRelacionesProfesionEmplea.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProfesionEmplea"));
		
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
            		closingInternalFrameProfesionEmplea();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProfesionEmplea.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProfesionEmplea = (JInternalFrameBase)event.getSource();
	            	
	            ProfesionEmpleaBeanSwingJInternalFrame jInternalFrameParent=(ProfesionEmpleaBeanSwingJInternalFrame)jInternalFrameDetalleFormProfesionEmplea.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProfesionEmpleaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProfesionEmplea.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProfesionEmpleaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProfesionEmplea.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProfesionEmplea.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProfesionEmpleaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProfesionEmpleaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProfesionEmpleaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProfesionEmplea";
		inputMap = this.jButtonNuevoProfesionEmplea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProfesionEmplea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProfesionEmpleaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProfesionEmpleaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProfesionEmpleaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProfesionEmpleaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProfesionEmplea";
		inputMap = this.jButtonNuevoRelacionesProfesionEmplea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProfesionEmplea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProfesionEmpleaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProfesionEmplea";
		inputMap = this.jButtonModificarProfesionEmplea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProfesionEmplea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProfesionEmpleaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProfesionEmplea";
		inputMap = this.jButtonActualizarProfesionEmplea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProfesionEmplea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProfesionEmpleaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProfesionEmplea";
		inputMap = this.jButtonEliminarProfesionEmplea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProfesionEmplea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProfesionEmpleaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProfesionEmplea";
		inputMap = this.jButtonCancelarProfesionEmplea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProfesionEmplea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProfesionEmpleaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProfesionEmplea";
		inputMap = this.jButtonCerrarProfesionEmplea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProfesionEmplea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProfesionEmpleaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonGuardarCambiosProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProfesionEmplea";
		inputMap = this.jInternalFrameDetalleFormProfesionEmplea.jButtonGuardarCambiosProfesionEmplea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonGuardarCambiosProfesionEmplea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProfesionEmpleaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProfesionEmplea.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProfesionEmpleaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProfesionEmplea.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProfesionEmpleaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProfesionEmplea.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProfesionEmpleaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProfesionEmplea.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProfesionEmpleaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonidProfesionEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"idProfesionEmpleaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonid_empresaProfesionEmpleaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProfesionEmpleaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonid_empresaProfesionEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProfesionEmpleaBusqueda"));
		//jButtonid_empleadoProfesionEmplea.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoProfesionEmpleaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonid_empleadoProfesionEmplea.addActionListener(new ButtonActionListener(this,"id_empleadoProfesionEmplea"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonid_empleadoProfesionEmpleaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoProfesionEmpleaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonid_empleadoProfesionEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoProfesionEmpleaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonid_profesionProfesionEmpleaUpdate.addActionListener(new ButtonActionListener(this,"id_profesionProfesionEmpleaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProfesionEmplea.jButtonid_profesionProfesionEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"id_profesionProfesionEmpleaBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoProfesionEmplea.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoProfesionEmplea"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoProfesionEmplea.addActionListener(new ButtonActionListener(this,"id_empleadoProfesionEmplea"));

		this.jButtonFK_IdProfesionProfesionEmplea.addActionListener(new ButtonActionListener(this,"FK_IdProfesionProfesionEmplea"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProfesionEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProfesionEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProfesionEmpleaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProfesionEmplea.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProfesionEmplea(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProfesionEmplea profesionempleaAux:this.profesionempleaLogic.getProfesionEmpleas()) {
					profesionempleaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProfesionEmplea profesionempleaAux:profesionempleas) {
					profesionempleaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProfesionEmpleaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProfesionEmplea(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProfesionEmplea profesionempleaAux:this.profesionempleaLogic.getProfesionEmpleas()) {
						profesionempleaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProfesionEmplea profesionempleaAux:profesionempleas) {
						profesionempleaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProfesionEmplea profesionempleaAux:this.profesionempleaLogic.getProfesionEmpleas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProfesionEmplea profesionempleaAux:profesionempleas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProfesionEmplea(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProfesionEmplea.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProfesionEmplea.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProfesionEmplea,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProfesionEmpleaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProfesionEmplea(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProfesionEmplea.getSelectedRows();
			
			ProfesionEmplea profesionempleaLocal=new ProfesionEmplea();
			
			//this.seleccionarTodosProfesionEmplea(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					profesionempleaLocal =(ProfesionEmplea) this.profesionempleaLogic.getProfesionEmpleas().toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					profesionempleaLocal =(ProfesionEmplea) this.profesionempleas.toArray()[this.jTableDatosProfesionEmplea.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				profesionempleaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProfesionEmplea profesionempleaAux:this.profesionempleaLogic.getProfesionEmpleas()) {
						profesionempleaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProfesionEmplea profesionempleaAux:profesionempleas) {
						profesionempleaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProfesionEmplea(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProfesionEmplea.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProfesionEmplea.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProfesionEmplea,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProfesionEmpleaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProfesionEmpleaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProfesionEmpleaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProfesionEmplea(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProfesionEmplea.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProfesionEmplea profesionempleaAux:this.profesionempleaLogic.getProfesionEmpleas()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProfesionEmplea profesionempleaAux:profesionempleas) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProfesionEmplea(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProfesionEmpleaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProfesionEmplea(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProfesionEmplea=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProfesionEmplea.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxTiposAccionesFormularioProfesionEmplea.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProfesionEmplea) {				
					conSplash=true;//false;										
					
					//this.startProcessProfesionEmplea(conSplash);
				
					this.generarReporteProfesionEmpleasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProfesionEmplea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxTiposAccionesFormularioProfesionEmplea.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProfesionEmpleasSeleccionados();
				//this.jComboBoxTiposAccionesProfesionEmplea.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProfesionEmpleasSeleccionados(false);
				//this.jComboBoxTiposAccionesProfesionEmplea.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProfesionEmpleasSeleccionados(true);
				//this.jComboBoxTiposAccionesProfesionEmplea.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProfesionEmplea();
				
				this.exportarProfesionEmpleasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProfesionEmplea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxTiposAccionesFormularioProfesionEmplea.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProfesionEmpleas();
				//this.importarProfesionEmpleas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProfesionEmplea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxTiposAccionesFormularioProfesionEmplea.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProfesionEmplea();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProfesionEmpleasSeleccionados();
				//this.jComboBoxTiposAccionesProfesionEmplea.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Profesion Emplea", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProfesionEmplea();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProfesionEmplea)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProfesionEmplea(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Profesion Emplea",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProfesionEmplea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxTiposAccionesFormularioProfesionEmplea.setSelectedIndex(0);					
				}	
			} 			
			else if(ProfesionEmpleaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProfesionEmplea) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProfesionEmplea(conSplash);
					
						//this.actualizarParametrosGeneralProfesionEmplea();
						
						this.generarReporteProcesoAccionProfesionEmpleasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProfesionEmplea.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxTiposAccionesFormularioProfesionEmplea.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProfesionEmpleaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Profesion EmpleaS SELECCIONADOS?", "MANTENIMIENTO DE Profesion Emplea", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProfesionEmplea();
				
						this.actualizarParametrosGeneralProfesionEmplea();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.profesionempleaReturnGeneral=profesionempleaLogic.procesarAccionProfesionEmpleasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.profesionempleaLogic.getProfesionEmpleas(),this.profesionempleaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProfesionEmpleaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProfesionEmplea.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxTiposAccionesFormularioProfesionEmplea.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProfesionEmplea();
					
					ProfesionEmpleaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProfesionEmpleaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProfesionEmplea.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxTiposAccionesFormularioProfesionEmplea.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProfesionEmplea(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProfesionEmpleaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProfesionEmplea();
			
			if(this.jInternalFrameDetalleFormProfesionEmplea==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProfesionEmplea> profesionempleasSeleccionados=new ArrayList<ProfesionEmplea>();		
			ProfesionEmplea profesionemplea=new ProfesionEmplea();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProfesionEmplea(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProfesionEmplea.getSelectedItem();
			
			
			
			
			profesionempleasSeleccionados=this.getProfesionEmpleasSeleccionados(true);
			//this.sTipoAccion;
			
			if(profesionempleasSeleccionados.size()==1) {
				for(ProfesionEmplea profesionempleaAux:profesionempleasSeleccionados) {
					profesionemplea=profesionempleaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProfesionEmplea();
			
      		//this.finishProcessProfesionEmplea(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProfesionEmpleaReturnGeneral() throws Exception {
		if(this.profesionempleaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.profesionempleaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.profesionempleaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.profesionempleaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.profesionempleaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.profesionempleaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProfesionEmplea(false);
		}
		
		if(this.profesionempleaReturnGeneral.getConRetornoLista() || this.profesionempleaReturnGeneral.getConRetornoObjeto()) {
			if(this.profesionempleaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.profesionempleaLogic.setProfesionEmpleas(this.profesionempleaReturnGeneral.getProfesionEmpleas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.profesionempleaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.profesionempleaLogic.setProfesionEmplea(this.profesionempleaReturnGeneral.getProfesionEmplea());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingProfesionEmplea(false);
		}
	}
	
	public void actualizarParametrosGeneralProfesionEmplea() throws Exception {
		
		
	}
	
	public ArrayList<ProfesionEmplea> getProfesionEmpleasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProfesionEmplea> profesionempleasSeleccionados=new ArrayList<ProfesionEmplea>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProfesionEmplea) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProfesionEmplea profesionempleaAux:profesionempleaLogic.getProfesionEmpleas()) {
					if(profesionempleaAux.getIsSelected()) {
						profesionempleasSeleccionados.add(profesionempleaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProfesionEmplea profesionempleaAux:this.profesionempleas) {
					if(profesionempleaAux.getIsSelected()) {
						profesionempleasSeleccionados.add(profesionempleaAux);				
					}
				}
			}
			
			if(profesionempleasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						profesionempleasSeleccionados.addAll(this.profesionempleaLogic.getProfesionEmpleas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						profesionempleasSeleccionados.addAll(this.profesionempleas);				
					}
				}
			}
		} else {
			profesionempleasSeleccionados.add(this.profesionemplea);
		}
		
		return profesionempleasSeleccionados;
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
	
	public void generarReporteProfesionEmpleasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProfesionEmpleasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProfesionEmpleasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProfesionEmpleasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProfesionEmpleasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Profesion Emplea",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProfesionEmpleasSeleccionados() throws Exception {
		ArrayList<ProfesionEmplea> profesionempleasSeleccionados=new ArrayList<ProfesionEmplea>();		
		
		profesionempleasSeleccionados=this.getProfesionEmpleasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProfesionEmpleas("Todos",profesionempleasSeleccionados);
		
	}	
	
	public void generarReporteNormalProfesionEmpleasSeleccionados() throws Exception {
		ArrayList<ProfesionEmplea> profesionempleasSeleccionados=new ArrayList<ProfesionEmplea>();		
		
		profesionempleasSeleccionados=this.getProfesionEmpleasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProfesionEmpleas("Todos",profesionempleasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProfesionEmpleasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProfesionEmplea> profesionempleasSeleccionados=new ArrayList<ProfesionEmplea>();
		
		profesionempleasSeleccionados=this.getProfesionEmpleasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProfesionEmpleas("Todos",profesionempleasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProfesionEmpleasSeleccionados() throws Exception {
		ArrayList<ProfesionEmplea> profesionempleasSeleccionados=new ArrayList<ProfesionEmplea>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProfesionEmplea();
		
		
		profesionempleasSeleccionados=this.getProfesionEmpleasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProfesionEmplea();
		
		
		//this.generarReporteProfesionEmpleas("Todos",profesionempleasSeleccionados ,profesionempleaImplementable,profesionempleaImplementableHome);
	}
	
	public void mostrarImportacionProfesionEmpleas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProfesionEmplea();
		
		this.abrirFrameImportacionProfesionEmplea();		
		
			
		//this.generarReporteProfesionEmpleas("Todos",profesionempleasSeleccionados ,profesionempleaImplementable,profesionempleaImplementableHome);
	}
	
	public void importarProfesionEmpleas() throws Exception {		
	
	}
	
	public void exportarProfesionEmpleasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProfesionEmpleasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProfesionEmpleasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProfesionEmpleasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Profesion Emplea",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProfesionEmpleasSeleccionados() throws Exception {
		ArrayList<ProfesionEmplea> profesionempleasSeleccionados=new ArrayList<ProfesionEmplea>();		
		
		profesionempleasSeleccionados=this.getProfesionEmpleasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"profesionemplea."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProfesionEmplea(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProfesionEmplea profesionempleaAux:profesionempleasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProfesionEmplea(profesionempleaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//profesionempleaAux.setsDetalleGeneralEntityReporte(profesionempleaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.profesionempleaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Profesion Emplea",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProfesionEmplea(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProfesionEmpleaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProfesionEmpleaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProfesionEmpleaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProfesionEmpleaConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProfesionEmpleaConstantesFunciones.LABEL_IDPROFESION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProfesionEmplea(ProfesionEmplea profesionemplea,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=profesionemplea.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=profesionemplea.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=profesionemplea.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=profesionemplea.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=profesionemplea.getprofesion_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProfesionEmpleasSeleccionados() throws Exception {
		ArrayList<ProfesionEmplea> profesionempleasSeleccionados=new ArrayList<ProfesionEmplea>();		
		
		profesionempleasSeleccionados=this.getProfesionEmpleasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"profesionemplea.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProfesionEmpleas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProfesionEmplea(row);				
				iRow++;
			}				
			
			for(ProfesionEmplea profesionempleaAux:profesionempleasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProfesionEmplea(profesionempleaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.profesionempleaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Profesion Emplea",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProfesionEmpleasSeleccionados() throws Exception {
		ArrayList<ProfesionEmplea> profesionempleasSeleccionados=new ArrayList<ProfesionEmplea>();		
		
		profesionempleasSeleccionados=this.getProfesionEmpleasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"profesionemplea.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("profesionempleas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("profesionemplea");
			//elementRoot.appendChild(element);
		
			for(ProfesionEmplea profesionempleaAux:profesionempleasSeleccionados) {
				element = document.createElement("profesionemplea");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProfesionEmplea(profesionempleaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.profesionempleaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Profesion Emplea",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProfesionEmplea(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProfesionEmpleaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProfesionEmpleaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProfesionEmpleaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProfesionEmpleaConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProfesionEmpleaConstantesFunciones.LABEL_IDPROFESION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProfesionEmplea(ProfesionEmplea profesionemplea,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(profesionemplea.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(profesionemplea.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(profesionemplea.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(profesionemplea.getprofesion_descripcion());				
	}
	
	public void setFilaDatosExportarXmlProfesionEmplea(ProfesionEmplea profesionemplea,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProfesionEmpleaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(profesionemplea.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProfesionEmpleaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(profesionemplea.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ProfesionEmpleaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(profesionemplea.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(ProfesionEmpleaConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(profesionemplea.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementprofesion_descripcion = document.createElement(ProfesionEmpleaConstantesFunciones.IDPROFESION);
		elementprofesion_descripcion.appendChild(document.createTextNode(profesionemplea.getprofesion_descripcion()));
		element.appendChild(elementprofesion_descripcion);
	}
	
	public void generarReporteGroupGenericoProfesionEmpleasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProfesionEmplea> profesionempleasSeleccionados=new ArrayList<ProfesionEmplea>();
		
		profesionempleasSeleccionados=this.getProfesionEmpleasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProfesionEmplea(profesionempleasSeleccionados);
		
		this.generarReporteProfesionEmpleas("Todos",profesionempleasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProfesionEmplea(ArrayList<ProfesionEmplea> profesionempleasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProfesionEmplea profesionempleaAux:profesionempleasSeleccionados) {
				profesionempleaAux.setsDetalleGeneralEntityReporte(profesionempleaAux.toString());
			
				if(sTipoSeleccionar.equals(ProfesionEmpleaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					profesionempleaAux.setsDescripcionGeneralEntityReporte1(profesionempleaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProfesionEmpleaConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					profesionempleaAux.setsDescripcionGeneralEntityReporte1(profesionempleaAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProfesionEmpleaConstantesFunciones.LABEL_IDPROFESION)) {
					existe=true;
					profesionempleaAux.setsDescripcionGeneralEntityReporte1(profesionempleaAux.getprofesion_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProfesionEmplea(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProfesionEmplea=true;
				this.isVisibilidadCeldaNuevoRelacionesProfesionEmplea=true;
				this.isVisibilidadCeldaGuardarCambiosProfesionEmplea=true;
			}
			
			this.isVisibilidadCeldaModificarProfesionEmplea=false;
			this.isVisibilidadCeldaActualizarProfesionEmplea=false;
			this.isVisibilidadCeldaEliminarProfesionEmplea=false;
			this.isVisibilidadCeldaCancelarProfesionEmplea=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProfesionEmplea=true;
				} else {
					this.isVisibilidadCeldaGuardarProfesionEmplea=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProfesionEmplea=false;
			this.isVisibilidadCeldaNuevoRelacionesProfesionEmplea=false;
			this.isVisibilidadCeldaGuardarCambiosProfesionEmplea=false;
			this.isVisibilidadCeldaModificarProfesionEmplea=false;
			this.isVisibilidadCeldaActualizarProfesionEmplea=true;
			this.isVisibilidadCeldaEliminarProfesionEmplea=false;
			this.isVisibilidadCeldaCancelarProfesionEmplea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProfesionEmplea=true;
				} else {
					this.isVisibilidadCeldaGuardarProfesionEmplea=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProfesionEmplea=false;
			this.isVisibilidadCeldaNuevoRelacionesProfesionEmplea=false;
			this.isVisibilidadCeldaGuardarCambiosProfesionEmplea=false;
			this.isVisibilidadCeldaModificarProfesionEmplea=false;
			this.isVisibilidadCeldaActualizarProfesionEmplea=true;
			this.isVisibilidadCeldaEliminarProfesionEmplea=true;
			this.isVisibilidadCeldaCancelarProfesionEmplea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProfesionEmplea=true;
				} else {
					this.isVisibilidadCeldaGuardarProfesionEmplea=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProfesionEmplea=false;
			this.isVisibilidadCeldaNuevoRelacionesProfesionEmplea=false;
			this.isVisibilidadCeldaGuardarCambiosProfesionEmplea=false;
			this.isVisibilidadCeldaModificarProfesionEmplea=false;
			this.isVisibilidadCeldaActualizarProfesionEmplea=true;
			this.isVisibilidadCeldaEliminarProfesionEmplea=false;
			this.isVisibilidadCeldaCancelarProfesionEmplea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProfesionEmplea=false;
				} else {
					this.isVisibilidadCeldaGuardarProfesionEmplea=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProfesionEmplea=true;
			this.isVisibilidadCeldaNuevoRelacionesProfesionEmplea=true;
			this.isVisibilidadCeldaGuardarCambiosProfesionEmplea=true;
			this.isVisibilidadCeldaModificarProfesionEmplea=false;
			this.isVisibilidadCeldaActualizarProfesionEmplea=false;
			this.isVisibilidadCeldaEliminarProfesionEmplea=false;
			this.isVisibilidadCeldaCancelarProfesionEmplea=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProfesionEmplea=true;
				} else {
					this.isVisibilidadCeldaGuardarProfesionEmplea=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProfesionEmplea=false;
			this.isVisibilidadCeldaNuevoRelacionesProfesionEmplea=false;
			this.isVisibilidadCeldaGuardarCambiosProfesionEmplea=false;
			this.isVisibilidadCeldaActualizarProfesionEmplea=false;
			this.isVisibilidadCeldaEliminarProfesionEmplea=false;
			this.isVisibilidadCeldaCancelarProfesionEmplea=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProfesionEmplea=false;
				} else {
					this.isVisibilidadCeldaGuardarProfesionEmplea=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProfesionEmplea=false;
			this.isVisibilidadCeldaNuevoRelacionesProfesionEmplea=false;
			this.isVisibilidadCeldaGuardarCambiosProfesionEmplea=false;
			this.isVisibilidadCeldaModificarProfesionEmplea=true;
			this.isVisibilidadCeldaActualizarProfesionEmplea=false;
			this.isVisibilidadCeldaEliminarProfesionEmplea=false;
			this.isVisibilidadCeldaCancelarProfesionEmplea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProfesionEmplea=false;
				} else {
					this.isVisibilidadCeldaGuardarProfesionEmplea=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProfesionEmpleaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProfesionEmplea=true;
			this.isVisibilidadCeldaNuevoRelacionesProfesionEmplea=true;
			this.isVisibilidadCeldaGuardarCambiosProfesionEmplea=true;
		} else {
			this.actualizarEstadoPanelsProfesionEmplea(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProfesionEmplea=false;
			//this.isVisibilidadCeldaVerFormProfesionEmplea=false;
			this.isVisibilidadCeldaDuplicarProfesionEmplea=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!profesionempleaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProfesionEmplea=false;
		} else {
			this.isVisibilidadCeldaNuevoProfesionEmplea=false;
			this.isVisibilidadCeldaGuardarCambiosProfesionEmplea=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(profesionempleaSessionBean.getEsGuardarRelacionado()) {
			if(!profesionempleaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProfesionEmplea=false;												
			}
			
			this.jButtonCerrarProfesionEmplea.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProfesionEmplea=false;
		}
		
		if(!this.permiteMantenimiento(this.profesionemplea)) {
			this.isVisibilidadCeldaActualizarProfesionEmplea=false;
			this.isVisibilidadCeldaEliminarProfesionEmplea=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProfesionEmplea() {
	}
	
	public void actualizarEstadoPanelsProfesionEmplea(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProfesionEmplea!=null) {
				this.jScrollPanelDatosEdicionProfesionEmplea.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProfesionEmplea!=null) {
				this.jTabbedPaneBusquedasProfesionEmplea.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProfesionEmplea!=null) {
				this.jScrollPanelDatosProfesionEmplea.setVisible(true);
			}
			
			if(this.jPanelPaginacionProfesionEmplea!=null) {
				this.jPanelPaginacionProfesionEmplea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProfesionEmplea!=null) {
				this.jPanelParametrosReportesProfesionEmplea.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProfesionEmplea!=null) {
				this.jScrollPanelDatosEdicionProfesionEmplea.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProfesionEmplea!=null) {
				this.jTabbedPaneBusquedasProfesionEmplea.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProfesionEmplea!=null) {
				this.jScrollPanelDatosProfesionEmplea.setVisible(false);
			}
			
			if(this.jPanelPaginacionProfesionEmplea!=null) {
				this.jPanelPaginacionProfesionEmplea.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProfesionEmplea!=null) {
				this.jPanelParametrosReportesProfesionEmplea.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProfesionEmplea!=null) {
				this.jScrollPanelDatosEdicionProfesionEmplea.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProfesionEmplea!=null) {
				this.jTabbedPaneBusquedasProfesionEmplea.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProfesionEmplea!=null) {
				this.jScrollPanelDatosProfesionEmplea.setVisible(false);
			}
			
			if(this.jPanelPaginacionProfesionEmplea!=null) {
				this.jPanelPaginacionProfesionEmplea.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProfesionEmplea!=null) {
				this.jPanelParametrosReportesProfesionEmplea.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProfesionEmplea!=null) {
				this.jScrollPanelDatosEdicionProfesionEmplea.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProfesionEmplea!=null) {
				this.jTabbedPaneBusquedasProfesionEmplea.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProfesionEmplea!=null) {
				this.jScrollPanelDatosProfesionEmplea.setVisible(false);
			}
			
			if(this.jPanelPaginacionProfesionEmplea!=null) {
				this.jPanelPaginacionProfesionEmplea.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProfesionEmplea!=null) {
				this.jPanelParametrosReportesProfesionEmplea.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProfesionEmplea!=null) {
				this.jScrollPanelDatosEdicionProfesionEmplea.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProfesionEmplea!=null) {
				this.jTabbedPaneBusquedasProfesionEmplea.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProfesionEmplea!=null) {
				this.jScrollPanelDatosProfesionEmplea.setVisible(true);
			}
			
			if(this.jPanelPaginacionProfesionEmplea!=null) {
				this.jPanelPaginacionProfesionEmplea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProfesionEmplea!=null) {
				this.jPanelParametrosReportesProfesionEmplea.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProfesionEmplea!=null) {
				this.jScrollPanelDatosEdicionProfesionEmplea.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProfesionEmplea!=null) {
				this.jTabbedPaneBusquedasProfesionEmplea.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProfesionEmplea!=null) {
				this.jScrollPanelDatosProfesionEmplea.setVisible(true);
			}
			
			if(this.jPanelPaginacionProfesionEmplea!=null) {
				this.jPanelPaginacionProfesionEmplea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProfesionEmplea!=null) {
				this.jPanelParametrosReportesProfesionEmplea.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProfesionEmplea!=null) {
				this.jScrollPanelDatosEdicionProfesionEmplea.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProfesionEmplea!=null) {
				this.jTabbedPaneBusquedasProfesionEmplea.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProfesionEmplea!=null) {
				this.jScrollPanelDatosProfesionEmplea.setVisible(true);
			}
			
			if(this.jPanelPaginacionProfesionEmplea!=null) {
				this.jPanelPaginacionProfesionEmplea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProfesionEmplea!=null) {
				this.jPanelParametrosReportesProfesionEmplea.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProfesionEmplea!=null) {
					this.jTabbedPaneBusquedasProfesionEmplea.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProfesionEmplea!=null) {
				this.jPanelParametrosReportesProfesionEmplea.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProfesionEmplea!=null) {
				this.jTabbedPaneBusquedasProfesionEmplea.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProfesionEmplea!=null) {
				this.jPanelParametrosReportesProfesionEmplea.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasProfesionEmplea.remove(jPanelFK_IdEmpleadoProfesionEmplea);}

			this.isVisibilidadFK_IdProfesion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProfesion) {this.jTabbedPaneBusquedasProfesionEmplea.remove(jPanelFK_IdProfesionProfesionEmplea);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasProfesionEmplea.remove(jPanelFK_IdEmpleadoProfesionEmplea);}

			this.isVisibilidadFK_IdProfesion=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdProfesion) {this.jTabbedPaneBusquedasProfesionEmplea.remove(jPanelFK_IdProfesionProfesionEmplea);}
		}
		
	}

	public void setVisibilidadBusquedasParaProfesion(Boolean isParaProfesion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProfesionNegation=!isParaProfesion;

			this.isVisibilidadFK_IdEmpleado=isParaProfesionNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasProfesionEmplea.remove(jPanelFK_IdEmpleadoProfesionEmplea);}

			this.isVisibilidadFK_IdProfesion=isParaProfesion;
			if(!this.isVisibilidadFK_IdProfesion) {this.jTabbedPaneBusquedasProfesionEmplea.remove(jPanelFK_IdProfesionProfesionEmplea);}
		}
		
	}
	
	
	
	

	public String registrarSesionProfesionEmpleaParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(profesionempleaSessionBean==null) {
				profesionempleaSessionBean=new ProfesionEmpleaSessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(profesionempleaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.profesionempleaFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(ProfesionEmpleaConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionProfesionEmplea(true);
			//empleadoSessionBean.setlidProfesionEmpleaActual(this.idProfesionEmpleaActual);

			profesionempleaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProfesionEmplea(true);
			profesionempleaSessionBean.setlIdProfesionEmpleaActualForeignKey(this.idProfesionEmpleaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ProfesionEmpleaSessionBean profesionempleaSessionBean=new ProfesionEmpleaSessionBean();
		
		if(this.profesionempleaSessionBean==null) {
			this.profesionempleaSessionBean=new ProfesionEmpleaSessionBean();
		}
		
		this.profesionempleaSessionBean.setsUltimaBusquedaProfesionEmplea(this.getsAccionBusqueda());
		this.profesionempleaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.profesionempleaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			profesionempleaSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			profesionempleaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProfesion")) {
			profesionempleaSessionBean.setid_profesion(this.getid_profesionFK_IdProfesion());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ProfesionEmpleaSessionBean profesionempleaSessionBean=new ProfesionEmpleaSessionBean();
		
		if(this.profesionempleaSessionBean==null) {
			this.profesionempleaSessionBean=new ProfesionEmpleaSessionBean();
		}
		
		if(this.profesionempleaSessionBean.getsUltimaBusquedaProfesionEmplea()!=null&&!this.profesionempleaSessionBean.getsUltimaBusquedaProfesionEmplea().equals("")) {
			this.setsAccionBusqueda(profesionempleaSessionBean.getsUltimaBusquedaProfesionEmplea());
			this.setiNumeroPaginacion(profesionempleaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(profesionempleaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(profesionempleaSessionBean.getid_empleado());
				profesionempleaSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(profesionempleaSessionBean.getid_empresa());
				profesionempleaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProfesion")) {
				this.setid_profesionFK_IdProfesion(profesionempleaSessionBean.getid_profesion());
				profesionempleaSessionBean.setid_profesion(-1L);
			}
		}
		
		this.profesionempleaSessionBean.setsUltimaBusquedaProfesionEmplea("");
		this.profesionempleaSessionBean.setiNumeroPaginacion(ProfesionEmpleaConstantesFunciones.INUMEROPAGINACION);
		this.profesionempleaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProfesionEmplea(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProfesionEmplea() {
		this.updateBorderResaltarBusquedasFormularioProfesionEmplea();
		this.updateVisibilidadBusquedasFormularioProfesionEmplea();
		this.updateHabilitarBusquedasFormularioProfesionEmplea();
	}
	
	public void updateBorderResaltarBusquedasFormularioProfesionEmplea() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProfesionEmplea.getComponents().length>0) {
	

		if(this.profesionempleaConstantesFunciones.resaltarFK_IdEmpleadoProfesionEmplea!=null) {
			index= this.jTabbedPaneBusquedasProfesionEmplea.indexOfComponent(this.jPanelFK_IdEmpleadoProfesionEmplea);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProfesionEmplea.getComponent(index);
				jPanel.setBorder(this.profesionempleaConstantesFunciones.resaltarFK_IdEmpleadoProfesionEmplea);
			}
		}

		if(this.profesionempleaConstantesFunciones.resaltarFK_IdProfesionProfesionEmplea!=null) {
			index= this.jTabbedPaneBusquedasProfesionEmplea.indexOfComponent(this.jPanelFK_IdProfesionProfesionEmplea);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProfesionEmplea.getComponent(index);
				jPanel.setBorder(this.profesionempleaConstantesFunciones.resaltarFK_IdProfesionProfesionEmplea);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProfesionEmplea() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProfesionEmplea.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProfesionEmplea.indexOfComponent(this.jPanelFK_IdEmpleadoProfesionEmplea);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProfesionEmplea.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.profesionempleaConstantesFunciones.mostrarFK_IdEmpleadoProfesionEmplea);
			if(!this.profesionempleaConstantesFunciones.mostrarFK_IdEmpleadoProfesionEmplea && index>-1) {
				this.jTabbedPaneBusquedasProfesionEmplea.remove(index);
			}

			index= this.jTabbedPaneBusquedasProfesionEmplea.indexOfComponent(this.jPanelFK_IdProfesionProfesionEmplea);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProfesionEmplea.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.profesionempleaConstantesFunciones.mostrarFK_IdProfesionProfesionEmplea);
			if(!this.profesionempleaConstantesFunciones.mostrarFK_IdProfesionProfesionEmplea && index>-1) {
				this.jTabbedPaneBusquedasProfesionEmplea.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProfesionEmplea() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProfesionEmplea.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProfesionEmplea.indexOfComponent(this.jPanelFK_IdEmpleadoProfesionEmplea);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProfesionEmplea.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.profesionempleaConstantesFunciones.activarFK_IdEmpleadoProfesionEmplea);
				this.jTabbedPaneBusquedasProfesionEmplea.setEnabledAt(index,this.profesionempleaConstantesFunciones.activarFK_IdEmpleadoProfesionEmplea);
			}

			index= this.jTabbedPaneBusquedasProfesionEmplea.indexOfComponent(this.jPanelFK_IdProfesionProfesionEmplea);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProfesionEmplea.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.profesionempleaConstantesFunciones.activarFK_IdProfesionProfesionEmplea);
				this.jTabbedPaneBusquedasProfesionEmplea.setEnabledAt(index,this.profesionempleaConstantesFunciones.activarFK_IdProfesionProfesionEmplea);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProfesionEmplea(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasProfesionEmplea.indexOfComponent(this.jPanelFK_IdEmpleadoProfesionEmplea);

			this.jTabbedPaneBusquedasProfesionEmplea.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProfesionEmplea.getComponent(index);

			this.profesionempleaConstantesFunciones.setResaltarFK_IdEmpleadoProfesionEmplea(resaltar);

			jPanel.setBorder(this.profesionempleaConstantesFunciones.resaltarFK_IdEmpleadoProfesionEmplea);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProfesion")) {
			index= this.jTabbedPaneBusquedasProfesionEmplea.indexOfComponent(this.jPanelFK_IdProfesionProfesionEmplea);

			this.jTabbedPaneBusquedasProfesionEmplea.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProfesionEmplea.getComponent(index);

			this.profesionempleaConstantesFunciones.setResaltarFK_IdProfesionProfesionEmplea(resaltar);

			jPanel.setBorder(this.profesionempleaConstantesFunciones.resaltarFK_IdProfesionProfesionEmplea);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProfesionEmplea.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProfesionEmplea() throws Exception {

		if(this.jInternalFrameDetalleFormProfesionEmplea==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProfesionEmplea();
		this.updateVisibilidadResaltarControlesFormularioProfesionEmplea();
		this.updateHabilitarResaltarControlesFormularioProfesionEmplea();
		
	}
	
	public void updateBorderResaltarControlesFormularioProfesionEmplea() throws Exception {
		if(this.jInternalFrameDetalleFormProfesionEmplea==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.profesionempleaConstantesFunciones.resaltaridProfesionEmplea!=null && this.jInternalFrameDetalleFormProfesionEmplea!=null) {this.jInternalFrameDetalleFormProfesionEmplea.jLabelidProfesionEmplea.setBorder(this.profesionempleaConstantesFunciones.resaltaridProfesionEmplea);}
		if(this.profesionempleaConstantesFunciones.resaltarid_empresaProfesionEmplea!=null && this.jInternalFrameDetalleFormProfesionEmplea!=null) {this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empresaProfesionEmplea.setBorder(this.profesionempleaConstantesFunciones.resaltarid_empresaProfesionEmplea);}
		if(this.profesionempleaConstantesFunciones.resaltarid_empleadoProfesionEmplea!=null && this.jInternalFrameDetalleFormProfesionEmplea!=null) {this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empleadoProfesionEmplea.setBorder(this.profesionempleaConstantesFunciones.resaltarid_empleadoProfesionEmplea);}
		if(this.profesionempleaConstantesFunciones.resaltarid_profesionProfesionEmplea!=null && this.jInternalFrameDetalleFormProfesionEmplea!=null) {this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_profesionProfesionEmplea.setBorder(this.profesionempleaConstantesFunciones.resaltarid_profesionProfesionEmplea);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProfesionEmplea() throws Exception {		
		if(this.jInternalFrameDetalleFormProfesionEmplea==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
	
		//this.jInternalFrameDetalleFormProfesionEmplea.jLabelidProfesionEmplea.setVisible(this.profesionempleaConstantesFunciones.mostraridProfesionEmplea);
		this.jInternalFrameDetalleFormProfesionEmplea.jPanelidProfesionEmplea.setVisible(this.profesionempleaConstantesFunciones.mostraridProfesionEmplea);
		//this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empresaProfesionEmplea.setVisible(this.profesionempleaConstantesFunciones.mostrarid_empresaProfesionEmplea);
		this.jInternalFrameDetalleFormProfesionEmplea.jPanelid_empresaProfesionEmplea.setVisible(this.profesionempleaConstantesFunciones.mostrarid_empresaProfesionEmplea);
		//this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empleadoProfesionEmplea.setVisible(this.profesionempleaConstantesFunciones.mostrarid_empleadoProfesionEmplea);
		this.jInternalFrameDetalleFormProfesionEmplea.jPanelid_empleadoProfesionEmplea.setVisible(this.profesionempleaConstantesFunciones.mostrarid_empleadoProfesionEmplea);
			this.jInternalFrameDetalleFormProfesionEmplea.jButtonid_empleadoProfesionEmplea.setVisible(this.profesionempleaConstantesFunciones.mostrarid_empleadoProfesionEmplea);
		//this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_profesionProfesionEmplea.setVisible(this.profesionempleaConstantesFunciones.mostrarid_profesionProfesionEmplea);
		this.jInternalFrameDetalleFormProfesionEmplea.jPanelid_profesionProfesionEmplea.setVisible(this.profesionempleaConstantesFunciones.mostrarid_profesionProfesionEmplea);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProfesionEmplea() throws Exception {
		if(this.jInternalFrameDetalleFormProfesionEmplea==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProfesionEmplea!=null) {
	
		this.jInternalFrameDetalleFormProfesionEmplea.jLabelidProfesionEmplea.setEnabled(this.profesionempleaConstantesFunciones.activaridProfesionEmplea);
		this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empresaProfesionEmplea.setEnabled(this.profesionempleaConstantesFunciones.activarid_empresaProfesionEmplea);
		this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_empleadoProfesionEmplea.setEnabled(this.profesionempleaConstantesFunciones.activarid_empleadoProfesionEmplea);
			this.jInternalFrameDetalleFormProfesionEmplea.jButtonid_empleadoProfesionEmplea.setEnabled(this.profesionempleaConstantesFunciones.activarid_empleadoProfesionEmplea);
		this.jInternalFrameDetalleFormProfesionEmplea.jComboBoxid_profesionProfesionEmplea.setEnabled(this.profesionempleaConstantesFunciones.activarid_profesionProfesionEmplea);
		}
	}
	
		
}