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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.nomina.util.ProcesoGeneraRolesConstantesFunciones;
import com.bydan.erp.nomina.util.report.ProcesoGeneraRolesParameterReturnGeneral;
//import com.bydan.erp.nomina.util.report.ProcesoGeneraRolesParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.report.ProcesoGeneraRolesBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.nomina.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.nomina.util.*;

import com.bydan.erp.nomina.util.report.*;
import com.bydan.erp.nomina.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;






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

//import org.hibernate.collection.PersistentBag;

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
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProcesoGeneraRolesBeanSwingJInternalFrame extends ProcesoGeneraRolesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoGeneraRolesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoGeneraRoles> procesogenerarolesValidator = new ClassValidator<ProcesoGeneraRoles>(ProcesoGeneraRoles.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoGeneraRoles procesogeneraroles;	
	public ProcesoGeneraRoles procesogenerarolesAux;
	public ProcesoGeneraRoles procesogenerarolesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoGeneraRoles procesogenerarolesTotales;
	public Long idProcesoGeneraRolesActual;
	public Long iIdNuevoProcesoGeneraRoles=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboMes="";

	public List<Mes> messForeignKey;

	public List<Mes> getmessForeignKey() {
		return messForeignKey;
	}

	public void setmessForeignKey(List<Mes> messForeignKey) {
		this.messForeignKey = messForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mes mesForeignKey;

	public Mes getmesForeignKey() {
		return mesForeignKey;
	}

	public void setmesForeignKey(Mes mesForeignKey) {
		this.mesForeignKey = mesForeignKey;
	}

	public String sFinalQueryComboEstructura="";

	public List<Estructura> estructurasForeignKey;

	public List<Estructura> getestructurasForeignKey() {
		return estructurasForeignKey;
	}

	public void setestructurasForeignKey(List<Estructura> estructurasForeignKey) {
		this.estructurasForeignKey = estructurasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Estructura estructuraForeignKey;

	public Estructura getestructuraForeignKey() {
		return estructuraForeignKey;
	}

	public void setestructuraForeignKey(Estructura estructuraForeignKey) {
		this.estructuraForeignKey = estructuraForeignKey;
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
	
	public Boolean isPermisoTodoProcesoGeneraRoles;
	public Boolean isPermisoNuevoProcesoGeneraRoles;
	public Boolean isPermisoActualizarProcesoGeneraRoles;
	public Boolean isPermisoActualizarOriginalProcesoGeneraRoles;
	public Boolean isPermisoEliminarProcesoGeneraRoles;
	public Boolean isPermisoGuardarCambiosProcesoGeneraRoles;
	public Boolean isPermisoConsultaProcesoGeneraRoles;
	public Boolean isPermisoBusquedaProcesoGeneraRoles;
	public Boolean isPermisoReporteProcesoGeneraRoles;
	public Boolean isPermisoPaginacionMedioProcesoGeneraRoles;
	public Boolean isPermisoPaginacionAltoProcesoGeneraRoles;
	public Boolean isPermisoPaginacionTodoProcesoGeneraRoles;
	public Boolean isPermisoCopiarProcesoGeneraRoles;
	public Boolean isPermisoVerFormProcesoGeneraRoles;
	public Boolean isPermisoDuplicarProcesoGeneraRoles;
	public Boolean isPermisoOrdenProcesoGeneraRoles;
	
	
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
	
	public ProcesoGeneraRolesParameterReturnGeneral procesogenerarolesReturnGeneral;
	public ProcesoGeneraRolesParameterReturnGeneral procesogenerarolesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoGeneraRoles=false;
	public Boolean esParaAccionDesdeFormularioProcesoGeneraRoles=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoGeneraRolesSessionBeanAdditional procesogenerarolesSessionBeanAdditional=null;
	
	public ProcesoGeneraRolesSessionBeanAdditional getProcesoGeneraRolesSessionBeanAdditional() {
		return this.procesogenerarolesSessionBeanAdditional;
	}
	
	public void setProcesoGeneraRolesSessionBeanAdditional(ProcesoGeneraRolesSessionBeanAdditional procesogenerarolesSessionBeanAdditional) {
		try {
			this.procesogenerarolesSessionBeanAdditional=procesogenerarolesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoGeneraRolesBeanSwingJInternalFrameAdditional procesogenerarolesBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoGeneraRolesBeanSwingJInternalFrame
	
	public ProcesoGeneraRolesBeanSwingJInternalFrameAdditional getProcesoGeneraRolesBeanSwingJInternalFrameAdditional() {
		return this.procesogenerarolesBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoGeneraRolesBeanSwingJInternalFrameAdditional(ProcesoGeneraRolesBeanSwingJInternalFrameAdditional procesogenerarolesBeanSwingJInternalFrameAdditional) {
		try {
			this.procesogenerarolesBeanSwingJInternalFrameAdditional=procesogenerarolesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoGeneraRolesLogic procesogenerarolesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoGeneraRoles procesogenerarolesBean;
	public ProcesoGeneraRolesConstantesFunciones procesogenerarolesConstantesFunciones;
	//public ProcesoGeneraRolesParameterReturnGeneral procesogenerarolesReturnGeneral;
	
	//FK
	
	public MesLogic mesLogic;
	public EstructuraLogic estructuraLogic;
	public EmpleadoLogic empleadoLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoGeneraRoles> procesogeneraroless;	
	//public List<ProcesoGeneraRoles> procesogenerarolessEliminados;
	//public List<ProcesoGeneraRoles> procesogenerarolessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoGeneraRoles=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoGeneraRoles=true;
	public Boolean isVisibilidadCeldaCopiarProcesoGeneraRoles=true;
	public Boolean isVisibilidadCeldaVerFormProcesoGeneraRoles=true;
	public Boolean isVisibilidadCeldaOrdenProcesoGeneraRoles=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoGeneraRoles=false;
	public Boolean isVisibilidadCeldaModificarProcesoGeneraRoles=false;
	public Boolean isVisibilidadCeldaActualizarProcesoGeneraRoles=false;
	public Boolean isVisibilidadCeldaEliminarProcesoGeneraRoles=false;
	public Boolean isVisibilidadCeldaCancelarProcesoGeneraRoles=false;
	public Boolean isVisibilidadCeldaGuardarProcesoGeneraRoles=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoGeneraRoles=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoGeneraRoles=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEstructura=false;
	public Boolean isVisibilidadFK_IdMes=false;
	
	public Long getiIdNuevoProcesoGeneraRoles() {
		return this.iIdNuevoProcesoGeneraRoles;
	}

	public void setiIdNuevoProcesoGeneraRoles(Long iIdNuevoProcesoGeneraRoles) {
		this.iIdNuevoProcesoGeneraRoles = iIdNuevoProcesoGeneraRoles;
	}
	
	public Long getidProcesoGeneraRolesActual() {
		return this.idProcesoGeneraRolesActual;
	}

	public void setidProcesoGeneraRolesActual(Long idProcesoGeneraRolesActual) {
		this.idProcesoGeneraRolesActual = idProcesoGeneraRolesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoGeneraRoles getprocesogeneraroles() {
		return this.procesogeneraroles;
	}

	public void setprocesogeneraroles(ProcesoGeneraRoles procesogeneraroles) {
		this.procesogeneraroles = procesogeneraroles;
	}
	
	public ProcesoGeneraRoles getprocesogenerarolesAux() {
		return this.procesogenerarolesAux;
	}

	public void setprocesogenerarolesAux(ProcesoGeneraRoles procesogenerarolesAux) {
		this.procesogenerarolesAux = procesogenerarolesAux;
	}				
	
	public ProcesoGeneraRoles getprocesogenerarolesAnterior() {
		return this.procesogenerarolesAnterior;
	}

	public void setprocesogenerarolesAnterior(ProcesoGeneraRoles procesogenerarolesAnterior) {
		this.procesogenerarolesAnterior = procesogenerarolesAnterior;
	}	
	
	public ProcesoGeneraRoles getprocesogenerarolesTotales() {
		return this.procesogenerarolesTotales;
	}

	public void setprocesogenerarolesTotales(ProcesoGeneraRoles procesogenerarolesTotales) {
		this.procesogenerarolesTotales = procesogenerarolesTotales;
	}	
	
	public ProcesoGeneraRoles getprocesogenerarolesBean() {
		return this.procesogenerarolesBean;
	}

	public void setprocesogenerarolesBean(ProcesoGeneraRoles procesogenerarolesBean) {
		this.procesogenerarolesBean = procesogenerarolesBean;
	}	
	
	public ProcesoGeneraRolesParameterReturnGeneral getprocesogenerarolesReturnGeneral() {
		return this.procesogenerarolesReturnGeneral;
	}

	public void setprocesogenerarolesReturnGeneral(ProcesoGeneraRolesParameterReturnGeneral procesogenerarolesReturnGeneral) {
		this.procesogenerarolesReturnGeneral = procesogenerarolesReturnGeneral;
	}	
	
	
	public Long id_mesBusquedaProcesoGeneraRoles=null;

	public Long getid_mesBusquedaProcesoGeneraRoles() {
		return this.id_mesBusquedaProcesoGeneraRoles;
	}

	public void setid_mesBusquedaProcesoGeneraRoles(Long id_mesBusquedaProcesoGeneraRoles) {
		this.id_mesBusquedaProcesoGeneraRoles = id_mesBusquedaProcesoGeneraRoles;
	}

;
	public Long id_estructuraBusquedaProcesoGeneraRoles=-1L;

	public Long getid_estructuraBusquedaProcesoGeneraRoles() {
		return this.id_estructuraBusquedaProcesoGeneraRoles;
	}

	public void setid_estructuraBusquedaProcesoGeneraRoles(Long id_estructuraBusquedaProcesoGeneraRoles) {
		this.id_estructuraBusquedaProcesoGeneraRoles = id_estructuraBusquedaProcesoGeneraRoles;
	}

;
	public Long id_empleadoBusquedaProcesoGeneraRoles=-1L;

	public Long getid_empleadoBusquedaProcesoGeneraRoles() {
		return this.id_empleadoBusquedaProcesoGeneraRoles;
	}

	public void setid_empleadoBusquedaProcesoGeneraRoles(Long id_empleadoBusquedaProcesoGeneraRoles) {
		this.id_empleadoBusquedaProcesoGeneraRoles = id_empleadoBusquedaProcesoGeneraRoles;
	}

	public Long id_empleadoFK_IdEmpleado=-1L;

	public Long getid_empleadoFK_IdEmpleado() {
		return this.id_empleadoFK_IdEmpleado;
	}

	public void setid_empleadoFK_IdEmpleado(Long id_empleadoFK_IdEmpleado) {
		this.id_empleadoFK_IdEmpleado = id_empleadoFK_IdEmpleado;
	}

	public Long id_estructuraFK_IdEstructura=-1L;

	public Long getid_estructuraFK_IdEstructura() {
		return this.id_estructuraFK_IdEstructura;
	}

	public void setid_estructuraFK_IdEstructura(Long id_estructuraFK_IdEstructura) {
		this.id_estructuraFK_IdEstructura = id_estructuraFK_IdEstructura;
	}

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProcesoGeneraRolesLogic getProcesoGeneraRolesLogic()	{		
		return procesogenerarolesLogic;
	}

	public void setProcesoGeneraRolesLogic(ProcesoGeneraRolesLogic procesogenerarolesLogic) {
		this.procesogenerarolesLogic = procesogenerarolesLogic;
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
	
	public Boolean getIsEsNuevoProcesoGeneraRoles() {
		return isEsNuevoProcesoGeneraRoles;
	}

	public void setIsEsNuevoProcesoGeneraRoles(Boolean isEsNuevoProcesoGeneraRoles) {
		this.isEsNuevoProcesoGeneraRoles = isEsNuevoProcesoGeneraRoles;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoGeneraRoles() {
		return esParaAccionDesdeFormularioProcesoGeneraRoles;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoGeneraRoles(Boolean esParaAccionDesdeFormularioProcesoGeneraRoles) {
		this.esParaAccionDesdeFormularioProcesoGeneraRoles = esParaAccionDesdeFormularioProcesoGeneraRoles;
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
	
	
	public void cargarCombosMessForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.messForeignKey=new ArrayList<Mes>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesLogic mesLogic=new MesLogic();

			mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.procesogenerarolesSessionBean==null) {
				this.procesogenerarolesSessionBean=new ProcesoGeneraRolesSessionBean();
			}

			if(!this.procesogenerarolesSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

					mesLogic.getTodosMessWithConnection(sFinalQuery,new Pagination());

					this.messForeignKey=mesLogic.getMess();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMes(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getEntityWithConnection(procesogenerarolesSessionBean.getlidMesActual());
					this.messForeignKey.add(mesLogic.getMes());
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

	public void cargarCombosEstructurasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estructurasForeignKey=new ArrayList<Estructura>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstructuraLogic estructuraLogic=new EstructuraLogic();

			estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

			if(this.procesogenerarolesSessionBean==null) {
				this.procesogenerarolesSessionBean=new ProcesoGeneraRolesSessionBean();
			}

			if(!this.procesogenerarolesSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

					estructuraLogic.getTodosEstructurasWithConnection(sFinalQuery,new Pagination());

					this.estructurasForeignKey=estructuraLogic.getEstructuras();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstructura(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estructuraLogic.getEntityWithConnection(procesogenerarolesSessionBean.getlidEstructuraActual());
					this.estructurasForeignKey.add(estructuraLogic.getEstructura());
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

			empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.procesogenerarolesSessionBean==null) {
				this.procesogenerarolesSessionBean=new ProcesoGeneraRolesSessionBean();
			}

			if(!this.procesogenerarolesSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

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
					empleadoLogic.getEntityWithConnection(procesogenerarolesSessionBean.getlidEmpleadoActual());
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

	
	
	public void setActualMesForeignKey(Long idMesSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesTemp!=null) {

					if(this.procesogeneraroles!=null) {
						this.procesogeneraroles.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
						this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_mesProcesoGeneraRoles.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesProcesoGeneraRoles.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
						if(this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_mesProcesoGeneraRoles.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_mesProcesoGeneraRoles.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoGeneraRoles") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesTemp!=null && jComboBoxid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles!=null) {
						jComboBoxid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles.setSelectedItem(mesTemp);
					} else {
						if(jComboBoxid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles!=null) {
							//jComboBoxid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles.setSelectedItem(mesTemp);
							if(jComboBoxid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles.getItemCount()>0) {
								jComboBoxid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles.setSelectedIndex(0);
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

	public String getActualMesForeignKeyDescripcion(Long idMesSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}


			sDescripcion=MesConstantesFunciones.getMesDescripcion(mesTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesProcesoGeneraRolesGenerico)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(mesTemp!=null) {
				jComboBoxid_mesProcesoGeneraRolesGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesProcesoGeneraRolesGenerico!=null && jComboBoxid_mesProcesoGeneraRolesGenerico.getItemCount()>0) {
					jComboBoxid_mesProcesoGeneraRolesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstructuraForeignKey(Long idEstructuraSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estructuraTemp!=null) {

					if(this.procesogeneraroles!=null) {
						this.procesogeneraroles.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
						this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_estructuraProcesoGeneraRoles.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraProcesoGeneraRoles.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
						if(this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_estructuraProcesoGeneraRoles.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_estructuraProcesoGeneraRoles.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoGeneraRoles") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles!=null) {
						jComboBoxid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles!=null) {
							//jComboBoxid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles.getItemCount()>0) {
								jComboBoxid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles.setSelectedIndex(0);
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

	public String getActualEstructuraForeignKeyDescripcion(Long idEstructuraSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}


			sDescripcion=EstructuraConstantesFunciones.getEstructuraDescripcion(estructuraTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraProcesoGeneraRolesGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}

			if(estructuraTemp!=null) {
				jComboBoxid_estructuraProcesoGeneraRolesGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraProcesoGeneraRolesGenerico!=null && jComboBoxid_estructuraProcesoGeneraRolesGenerico.getItemCount()>0) {
					jComboBoxid_estructuraProcesoGeneraRolesGenerico.setSelectedIndex(0);
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

					if(this.procesogeneraroles!=null) {
						this.procesogeneraroles.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
						this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_empleadoProcesoGeneraRoles.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoProcesoGeneraRoles.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
						if(this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_empleadoProcesoGeneraRoles.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_empleadoProcesoGeneraRoles.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoGeneraRoles") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles!=null) {
						jComboBoxid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles!=null) {
							//jComboBoxid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles.getItemCount()>0) {
								jComboBoxid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoProcesoGeneraRolesGenerico)throws Exception
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
				jComboBoxid_empleadoProcesoGeneraRolesGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoProcesoGeneraRolesGenerico!=null && jComboBoxid_empleadoProcesoGeneraRolesGenerico.getItemCount()>0) {
					jComboBoxid_empleadoProcesoGeneraRolesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(ProcesoGeneraRoles procesogeneraroles,JComboBox jComboBoxid_mesProcesoGeneraRolesGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesProcesoGeneraRolesGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_mesProcesoGeneraRoles.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesProcesoGeneraRolesGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				procesogeneraroles.setid_mes(mesAux.getId());
				procesogeneraroles.setmes_descripcion(ProcesoGeneraRolesConstantesFunciones.getMesDescripcion(mesAux));
				procesogeneraroles.setMes(mesAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(ProcesoGeneraRoles procesogeneraroles,JComboBox jComboBoxid_estructuraProcesoGeneraRolesGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraProcesoGeneraRolesGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_estructuraProcesoGeneraRoles.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraProcesoGeneraRolesGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				procesogeneraroles.setid_estructura(estructuraAux.getId());
				procesogeneraroles.setestructura_descripcion(ProcesoGeneraRolesConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				procesogeneraroles.setEstructura(estructuraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(ProcesoGeneraRoles procesogeneraroles,JComboBox jComboBoxid_empleadoProcesoGeneraRolesGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoProcesoGeneraRolesGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_empleadoProcesoGeneraRoles.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoProcesoGeneraRolesGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				procesogeneraroles.setid_empleado(empleadoAux.getId());
				procesogeneraroles.setempleado_descripcion(ProcesoGeneraRolesConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				procesogeneraroles.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMessForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) { 
							this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_mesProcesoGeneraRoles.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_mesProcesoGeneraRoles.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) { 
					}

					if(!ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoGeneraRoles") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jComboBoxid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles.addItem(mes);
							}
						}

						if(!ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstructurasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstructura=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) { 
							this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_estructuraProcesoGeneraRoles.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_estructuraProcesoGeneraRoles.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) { 
					}

					if(!ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoGeneraRoles") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles.addItem(estructura);
							}
						}

						if(!ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) { 
							this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_empleadoProcesoGeneraRoles.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_empleadoProcesoGeneraRoles.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) { 
					}

					if(!ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoGeneraRoles") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles.addItem(empleado);
							}
						}

						if(!ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameMesForeignKey(Mes mes,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
							this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_mesProcesoGeneraRoles.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
							this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_mesProcesoGeneraRoles.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles.setSelectedItem(mes);
						} else {
							this.jComboBoxid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEstructuraForeignKey(Estructura estructura,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
							this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_estructuraProcesoGeneraRoles.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
							this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_estructuraProcesoGeneraRoles.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
							this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_empleadoProcesoGeneraRoles.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
							this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_empleadoProcesoGeneraRoles.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoGeneraRoles() throws Exception {
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
		
	public ProcesoGeneraRolesParameterReturnGeneral getProcesoGeneraRolesParameterGeneral() {
		return this.procesogenerarolesParameterGeneral;
	}
	
	public void setProcesoGeneraRolesParameterGeneral(ProcesoGeneraRolesParameterReturnGeneral procesogenerarolesParameterGeneral) {
		this.procesogenerarolesParameterGeneral = procesogenerarolesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoGeneraRoles() {
		return isPermisoTodoProcesoGeneraRoles;
	}

	public void setIsPermisoTodoProcesoGeneraRoles(Boolean isPermisoTodoProcesoGeneraRoles) {
		this.isPermisoTodoProcesoGeneraRoles = isPermisoTodoProcesoGeneraRoles;
	}

	public Boolean getIsPermisoNuevoProcesoGeneraRoles() {
		return isPermisoNuevoProcesoGeneraRoles;
	}

	public void setIsPermisoNuevoProcesoGeneraRoles(Boolean isPermisoNuevoProcesoGeneraRoles) {
		this.isPermisoNuevoProcesoGeneraRoles = isPermisoNuevoProcesoGeneraRoles;
	}

	public Boolean getIsPermisoActualizarProcesoGeneraRoles() {
		return isPermisoActualizarProcesoGeneraRoles;
	}

	public void setIsPermisoActualizarProcesoGeneraRoles(Boolean isPermisoActualizarProcesoGeneraRoles) {
		this.isPermisoActualizarProcesoGeneraRoles = isPermisoActualizarProcesoGeneraRoles;
	}

	public Boolean getIsPermisoEliminarProcesoGeneraRoles() {
		return isPermisoEliminarProcesoGeneraRoles;
	}

	public void setIsPermisoEliminarProcesoGeneraRoles(Boolean isPermisoEliminarProcesoGeneraRoles) {
		this.isPermisoEliminarProcesoGeneraRoles = isPermisoEliminarProcesoGeneraRoles;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoGeneraRoles() {
		return isPermisoGuardarCambiosProcesoGeneraRoles;
	}

	public void setIsPermisoGuardarCambiosProcesoGeneraRoles(Boolean isPermisoGuardarCambiosProcesoGeneraRoles) {
		this.isPermisoGuardarCambiosProcesoGeneraRoles = isPermisoGuardarCambiosProcesoGeneraRoles;
	}
	
	public Boolean getIsPermisoConsultaProcesoGeneraRoles() {
		return isPermisoConsultaProcesoGeneraRoles;
	}

	public void setIsPermisoConsultaProcesoGeneraRoles(Boolean isPermisoConsultaProcesoGeneraRoles) {
		this.isPermisoConsultaProcesoGeneraRoles = isPermisoConsultaProcesoGeneraRoles;
	}

	public Boolean getIsPermisoBusquedaProcesoGeneraRoles() {
		return isPermisoBusquedaProcesoGeneraRoles;
	}

	public void setIsPermisoBusquedaProcesoGeneraRoles(Boolean isPermisoBusquedaProcesoGeneraRoles) {
		this.isPermisoBusquedaProcesoGeneraRoles = isPermisoBusquedaProcesoGeneraRoles;
	}

	public Boolean getIsPermisoReporteProcesoGeneraRoles() {
		return isPermisoReporteProcesoGeneraRoles;
	}

	public void setIsPermisoReporteProcesoGeneraRoles(Boolean isPermisoReporteProcesoGeneraRoles) {
		this.isPermisoReporteProcesoGeneraRoles = isPermisoReporteProcesoGeneraRoles;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoGeneraRoles() {
		return isPermisoPaginacionMedioProcesoGeneraRoles;
	}

	public void setIsPermisoPaginacionMedioProcesoGeneraRoles(Boolean isPermisoPaginacionMedioProcesoGeneraRoles) {
		this.isPermisoPaginacionMedioProcesoGeneraRoles = isPermisoPaginacionMedioProcesoGeneraRoles;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoGeneraRoles() {
		return isPermisoPaginacionTodoProcesoGeneraRoles;
	}

	public void setIsPermisoPaginacionTodoProcesoGeneraRoles(Boolean isPermisoPaginacionTodoProcesoGeneraRoles) {
		this.isPermisoPaginacionTodoProcesoGeneraRoles = isPermisoPaginacionTodoProcesoGeneraRoles;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoGeneraRoles() {
		return isPermisoPaginacionAltoProcesoGeneraRoles;
	}

	public void setIsPermisoPaginacionAltoProcesoGeneraRoles(Boolean isPermisoPaginacionAltoProcesoGeneraRoles) {
		this.isPermisoPaginacionAltoProcesoGeneraRoles = isPermisoPaginacionAltoProcesoGeneraRoles;
	}
	
	public Boolean getIsPermisoCopiarProcesoGeneraRoles() {
		return isPermisoCopiarProcesoGeneraRoles;
	}

	public void setIsPermisoCopiarProcesoGeneraRoles(Boolean isPermisoCopiarProcesoGeneraRoles) {
		this.isPermisoCopiarProcesoGeneraRoles = isPermisoCopiarProcesoGeneraRoles;
	}
	
	public Boolean getIsPermisoVerFormProcesoGeneraRoles() {
		return isPermisoVerFormProcesoGeneraRoles;
	}

	public void setIsPermisoVerFormProcesoGeneraRoles(Boolean isPermisoVerFormProcesoGeneraRoles) {
		this.isPermisoVerFormProcesoGeneraRoles = isPermisoVerFormProcesoGeneraRoles;
	}
	
	public Boolean getIsPermisoDuplicarProcesoGeneraRoles() {
		return isPermisoDuplicarProcesoGeneraRoles;
	}

	public void setIsPermisoDuplicarProcesoGeneraRoles(Boolean isPermisoDuplicarProcesoGeneraRoles) {
		this.isPermisoDuplicarProcesoGeneraRoles = isPermisoDuplicarProcesoGeneraRoles;
	}
	
	public Boolean getIsPermisoOrdenProcesoGeneraRoles() {
		return isPermisoOrdenProcesoGeneraRoles;
	}

	public void setIsPermisoOrdenProcesoGeneraRoles(Boolean isPermisoOrdenProcesoGeneraRoles) {
		this.isPermisoOrdenProcesoGeneraRoles = isPermisoOrdenProcesoGeneraRoles;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoGeneraRoles() {
		return isVisibilidadCeldaNuevoProcesoGeneraRoles;
	}

	public void setIsVisibilidadCeldaNuevoProcesoGeneraRoles(Boolean isVisibilidadCeldaNuevoProcesoGeneraRoles) {
		this.isVisibilidadCeldaNuevoProcesoGeneraRoles = isVisibilidadCeldaNuevoProcesoGeneraRoles;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoGeneraRoles() {
		return isVisibilidadCeldaDuplicarProcesoGeneraRoles;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoGeneraRoles(Boolean isVisibilidadCeldaDuplicarProcesoGeneraRoles) {
		this.isVisibilidadCeldaDuplicarProcesoGeneraRoles = isVisibilidadCeldaDuplicarProcesoGeneraRoles;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoGeneraRoles() {
		return isVisibilidadCeldaCopiarProcesoGeneraRoles;
	}

	public void setIsVisibilidadCeldaCopiarProcesoGeneraRoles(Boolean isVisibilidadCeldaCopiarProcesoGeneraRoles) {
		this.isVisibilidadCeldaCopiarProcesoGeneraRoles = isVisibilidadCeldaCopiarProcesoGeneraRoles;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoGeneraRoles() {
		return isVisibilidadCeldaVerFormProcesoGeneraRoles;
	}

	public void setIsVisibilidadCeldaVerFormProcesoGeneraRoles(Boolean isVisibilidadCeldaVerFormProcesoGeneraRoles) {
		this.isVisibilidadCeldaVerFormProcesoGeneraRoles = isVisibilidadCeldaVerFormProcesoGeneraRoles;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoGeneraRoles() {
		return isVisibilidadCeldaOrdenProcesoGeneraRoles;
	}

	public void setIsVisibilidadCeldaOrdenProcesoGeneraRoles(Boolean isVisibilidadCeldaOrdenProcesoGeneraRoles) {
		this.isVisibilidadCeldaOrdenProcesoGeneraRoles = isVisibilidadCeldaOrdenProcesoGeneraRoles;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoGeneraRoles() {
		return isVisibilidadCeldaNuevoRelacionesProcesoGeneraRoles;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoGeneraRoles(Boolean isVisibilidadCeldaNuevoRelacionesProcesoGeneraRoles) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraRoles = isVisibilidadCeldaNuevoRelacionesProcesoGeneraRoles;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoGeneraRoles() {
		return isVisibilidadCeldaModificarProcesoGeneraRoles;
	}

	public void setIsVisibilidadCeldaModificarProcesoGeneraRoles(Boolean isVisibilidadCeldaModificarProcesoGeneraRoles) {
		this.isVisibilidadCeldaModificarProcesoGeneraRoles = isVisibilidadCeldaModificarProcesoGeneraRoles;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoGeneraRoles() {
		return isVisibilidadCeldaActualizarProcesoGeneraRoles;
	}

	public void setIsVisibilidadCeldaActualizarProcesoGeneraRoles(Boolean isVisibilidadCeldaActualizarProcesoGeneraRoles) {
		this.isVisibilidadCeldaActualizarProcesoGeneraRoles = isVisibilidadCeldaActualizarProcesoGeneraRoles;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoGeneraRoles() {
		return isVisibilidadCeldaEliminarProcesoGeneraRoles;
	}

	public void setIsVisibilidadCeldaEliminarProcesoGeneraRoles(Boolean isVisibilidadCeldaEliminarProcesoGeneraRoles) {
		this.isVisibilidadCeldaEliminarProcesoGeneraRoles = isVisibilidadCeldaEliminarProcesoGeneraRoles;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoGeneraRoles() {
		return isVisibilidadCeldaCancelarProcesoGeneraRoles;
	}

	public void setIsVisibilidadCeldaCancelarProcesoGeneraRoles(Boolean isVisibilidadCeldaCancelarProcesoGeneraRoles) {
		this.isVisibilidadCeldaCancelarProcesoGeneraRoles = isVisibilidadCeldaCancelarProcesoGeneraRoles;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoGeneraRoles() {
		return isVisibilidadCeldaGuardarProcesoGeneraRoles;
	}

	public void setIsVisibilidadCeldaGuardarProcesoGeneraRoles(Boolean isVisibilidadCeldaGuardarProcesoGeneraRoles) {
		this.isVisibilidadCeldaGuardarProcesoGeneraRoles = isVisibilidadCeldaGuardarProcesoGeneraRoles;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoGeneraRoles() {
		return isVisibilidadCeldaGuardarCambiosProcesoGeneraRoles;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoGeneraRoles(Boolean isVisibilidadCeldaGuardarCambiosProcesoGeneraRoles) {
		this.isVisibilidadCeldaGuardarCambiosProcesoGeneraRoles = isVisibilidadCeldaGuardarCambiosProcesoGeneraRoles;
	}
		
	public ProcesoGeneraRolesSessionBean getprocesogenerarolesSessionBean() {
		return this.procesogenerarolesSessionBean;
	}
	
	public void setprocesogenerarolesSessionBean(ProcesoGeneraRolesSessionBean procesogenerarolesSessionBean) {
		this.procesogenerarolesSessionBean=procesogenerarolesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoGeneraRoles() {
		return this.isVisibilidadBusquedaProcesoGeneraRoles;
	}

	public void setisVisibilidadBusquedaProcesoGeneraRoles(Boolean isVisibilidadBusquedaProcesoGeneraRoles) {
		this.isVisibilidadBusquedaProcesoGeneraRoles=isVisibilidadBusquedaProcesoGeneraRoles;
	}

	public Boolean getisVisibilidadFK_IdEmpleado() {
		return this.isVisibilidadFK_IdEmpleado;
	}

	public void setisVisibilidadFK_IdEmpleado(Boolean isVisibilidadFK_IdEmpleado) {
		this.isVisibilidadFK_IdEmpleado=isVisibilidadFK_IdEmpleado;
	}

	public Boolean getisVisibilidadFK_IdEstructura() {
		return this.isVisibilidadFK_IdEstructura;
	}

	public void setisVisibilidadFK_IdEstructura(Boolean isVisibilidadFK_IdEstructura) {
		this.isVisibilidadFK_IdEstructura=isVisibilidadFK_IdEstructura;
	}

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraRoles(ProcesoGeneraRoles procesogeneraroles)throws Exception {
		try {
			
				this.setActualParaGuardarMesForeignKey(procesogeneraroles,null);
				this.setActualParaGuardarEstructuraForeignKey(procesogeneraroles,null);
				this.setActualParaGuardarEmpleadoForeignKey(procesogeneraroles,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoGeneraRoles procesogeneraroles,ProcesoGeneraRoles procesogenerarolesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoGeneraRoles(procesogeneraroles);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesogenerarolesAux.setId(procesogeneraroles.getId());
		procesogenerarolesAux.setVersionRow(procesogeneraroles.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoGeneraRoles procesogenerarolesLocal) throws Exception {
		
		if(this.procesogenerarolesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoGeneraRoles procesogenerarolesLocal) throws Exception {	
		if(this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				procesogenerarolesLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				procesogenerarolesLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				procesogenerarolesLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoGeneraRolesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoGeneraRoles.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogeneraroless.toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesogenerarolesValidator.getInvalidValues(this.procesogeneraroles);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoGeneraRoles procesogeneraroles,List<ProcesoGeneraRoles> procesogeneraroless) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoGeneraRoles procesogeneraroles,List<ProcesoGeneraRoles> procesogeneraroless) throws Exception {
		try	{			
			ProcesoGeneraRolesConstantesFunciones.actualizarSelectedLista(procesogeneraroles,procesogeneraroless);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoGeneraRoles> procesogenerarolessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesogenerarolessLocal=this.procesogenerarolesLogic.getProcesoGeneraRoless();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesogenerarolessLocal=this.procesogeneraroless;
			}
			//ARCHITECTURE
		
			for(ProcesoGeneraRoles procesogenerarolesLocal:procesogenerarolessLocal) {
				if(this.permiteMantenimiento(procesogenerarolesLocal) && procesogenerarolesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoGeneraRolesConstantesFunciones.getProcesoGeneraRolesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoGeneraRolesConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGeneraRoles.jLabelid_mesProcesoGeneraRoles,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoGeneraRolesConstantesFunciones.IDESTRUCTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGeneraRoles.jLabelid_estructuraProcesoGeneraRoles,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoGeneraRolesConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGeneraRoles.jLabelid_empleadoProcesoGeneraRoles,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoGeneraRoles.jLabelid_mesProcesoGeneraRoles,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoGeneraRoles.jLabelid_estructuraProcesoGeneraRoles,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoGeneraRoles.jLabelid_empleadoProcesoGeneraRoles,"");
		
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
		this.iIdNuevoProcesoGeneraRoles--;	
		
		
		this.procesogenerarolesAux=new ProcesoGeneraRoles();
		
		this.procesogenerarolesAux.setId(this.iIdNuevoProcesoGeneraRoles);
		this.procesogenerarolesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesogenerarolesLogic.getProcesoGeneraRoless().add(this.procesogenerarolesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesogeneraroless.add(this.procesogenerarolesAux);
		}
		//ARCHITECTURE
		
		this.procesogeneraroles=this.procesogenerarolesAux;
		
		if(ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoGeneraRoles(this.procesogeneraroles);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoGeneraRoles(this.procesogeneraroles);
		}
				
		//this.setDefaultControlesProcesoGeneraRoles();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoGeneraRoles();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoGeneraRoles();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoGeneraRoles();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoGeneraRoles(this.procesogenerarolesBean,this.procesogeneraroles,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraRoles(this.procesogeneraroles);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoGeneraRoles(this.procesogenerarolesReturnGeneral,this.procesogenerarolesBean,false);
		
		if(this.procesogenerarolesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoGeneraRoles(this.procesogenerarolesReturnGeneral.getProcesoGeneraRoles());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoGeneraRoles(this.procesogenerarolesReturnGeneral.getProcesoGeneraRoles());
		}
		
		if(this.procesogenerarolesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoGeneraRoles(this.procesogenerarolesReturnGeneral.getProcesoGeneraRoles(),classes);//this.procesogenerarolesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoGeneraRoles(this.procesogeneraroles,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoGeneraRoles();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoGeneraRoles();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.RecargarFormProcesoGeneraRoles(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoGeneraRoles(false);
						
			if(procesogenerarolesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoGeneraRoles();
			}
			
			this.actualizarVisualTableDatosProcesoGeneraRoles();
			
			this.jTableDatosProcesoGeneraRoles.setRowSelectionInterval(this.getIndiceNuevoProcesoGeneraRoles(), this.getIndiceNuevoProcesoGeneraRoles());
			
			this.seleccionarFilaTablaProcesoGeneraRolesActual();
						
			this.actualizarEstadoCeldasBotonesProcesoGeneraRoles("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoGeneraRoles(Boolean isHabilitar) throws Exception {
			
		
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_mesProcesoGeneraRoles.setEnabled(isHabilitar && this.procesogenerarolesConstantesFunciones.activarid_mesProcesoGeneraRoles);
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_estructuraProcesoGeneraRoles.setEnabled(isHabilitar && this.procesogenerarolesConstantesFunciones.activarid_estructuraProcesoGeneraRoles);
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_empleadoProcesoGeneraRoles.setEnabled(isHabilitar && this.procesogenerarolesConstantesFunciones.activarid_empleadoProcesoGeneraRoles);
	};
	
	public void setDefaultControlesProcesoGeneraRoles() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoGeneraRoles(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesogenerarolesSessionBean.setConGuardarRelaciones(true);			
			this.procesogenerarolesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jTabbedPaneRelacionesProcesoGeneraRoles.setVisible(true);
			
					
		} else {
			//this.procesogenerarolesSessionBean.setConGuardarRelaciones(false);			
			this.procesogenerarolesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jTabbedPaneRelacionesProcesoGeneraRoles.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoGeneraRoles() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoGeneraRoles procesogenerarolesAux:this.procesogenerarolesLogic.getProcesoGeneraRoless()) {
				if(procesogenerarolesAux.getId().equals(this.iIdNuevoProcesoGeneraRoles)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoGeneraRoles procesogenerarolesAux:this.procesogeneraroless) {
				if(procesogenerarolesAux.getId().equals(this.iIdNuevoProcesoGeneraRoles)) {
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
	
	public int getIndiceActualProcesoGeneraRoles(ProcesoGeneraRoles procesogeneraroles,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoGeneraRoles procesogenerarolesAux:this.procesogenerarolesLogic.getProcesoGeneraRoless()) {
				if(procesogenerarolesAux.getId().equals(procesogeneraroles.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoGeneraRoles procesogenerarolesAux:this.procesogeneraroless) {
				if(procesogenerarolesAux.getId().equals(procesogeneraroles.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoGeneraRoles(ProcesoGeneraRoles procesogenerarolesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoGeneraRoles procesogenerarolesAux:this.procesogenerarolesLogic.getProcesoGeneraRoless()) {
				if(procesogenerarolesAux.getProcesoGeneraRolesOriginal().getId().equals(procesogenerarolesOriginal.getId())) {
					existe=true;
					procesogenerarolesOriginal.setId(procesogenerarolesAux.getId());
					procesogenerarolesOriginal.setVersionRow(procesogenerarolesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoGeneraRoles procesogenerarolesAux:this.procesogeneraroless) {
				if(procesogenerarolesAux.getProcesoGeneraRolesOriginal().getId().equals(procesogenerarolesOriginal.getId())) {
					existe=true;
					procesogenerarolesOriginal.setId(procesogenerarolesAux.getId());
					procesogenerarolesOriginal.setVersionRow(procesogenerarolesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoGeneraRoles(Boolean esParaCancelar) throws Exception {
		procesogenerarolessAux=new ArrayList<ProcesoGeneraRoles>();
		procesogenerarolesAux=new ProcesoGeneraRoles();
		
		if(!this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoGeneraRoles procesogenerarolesAux:this.procesogenerarolesLogic.getProcesoGeneraRoless()) {
					if(procesogenerarolesAux.getId()<0) {
						procesogenerarolessAux.add(procesogenerarolesAux);
					}		
				}
				this.iIdNuevoProcesoGeneraRoles=0L;
				this.procesogenerarolesLogic.getProcesoGeneraRoless().removeAll(procesogenerarolessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoGeneraRoles procesogenerarolesAux:this.procesogeneraroless) {
					if(procesogenerarolesAux.getId()<0) {
						procesogenerarolessAux.add(procesogenerarolesAux);
					}		
				}
				this.iIdNuevoProcesoGeneraRoles=0L;
				this.procesogeneraroless.removeAll(procesogenerarolessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoGeneraRoles 
					&& this.procesogenerarolesLogic.getProcesoGeneraRoless().size()>0
					) {
					procesogenerarolesAux=this.procesogenerarolesLogic.getProcesoGeneraRoless().get(this.procesogenerarolesLogic.getProcesoGeneraRoless().size() - 1);
				
					if(procesogenerarolesAux.getId()<0) {
						this.procesogenerarolesLogic.getProcesoGeneraRoless().remove(procesogenerarolesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoGeneraRoles && this.procesogeneraroless.size()>0) {
					procesogenerarolesAux=this.procesogeneraroless.get(this.procesogeneraroless.size() - 1);
				
					if(procesogenerarolesAux.getId()<0) {
						this.procesogeneraroless.remove(procesogenerarolesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoGeneraRoles(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesogeneraroles.getId()<0) {
				this.procesogenerarolesLogic.getProcesoGeneraRoless().remove(this.procesogeneraroles);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesogeneraroles.getId()<0) {
				this.procesogeneraroless.remove(this.procesogeneraroles);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoGeneraRoles(List<ProcesoGeneraRoles> procesogenerarolessAux) throws Exception {
		ProcesoGeneraRolesConstantesFunciones.setEstadosInicialesProcesoGeneraRoles(procesogenerarolessAux);
	}
	
	public void setEstadosInicialesProcesoGeneraRoles(ProcesoGeneraRoles procesogenerarolesAux) throws Exception {
		ProcesoGeneraRolesConstantesFunciones.setEstadosInicialesProcesoGeneraRoles(procesogenerarolesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoGeneraRolesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoGeneraRoles("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoGeneraRolesActual()) {
				if(!this.isEsNuevoProcesoGeneraRoles) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoGeneraRoles("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoGeneraRoles=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoGeneraRolesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Genera Roles ?", "MANTENIMIENTO DE Proceso Genera Roles", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoGeneraRoles("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoGeneraRoles procesogeneraroles) throws Exception {
		ProcesoGeneraRolesConstantesFunciones.seleccionarAsignar(this.procesogeneraroles,procesogeneraroles);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoGeneraRoles=this.isPermisoActualizarOriginalProcesoGeneraRoles;
			
			
			this.seleccionarAsignar(procesogeneraroles);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoGeneraRoles("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesogenerarolesSessionBean.setsFuncionBusquedaRapida(this.procesogenerarolesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoGeneraRoles) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoGeneraRoles(esParaCancelar);				
				this.cancelarNuevoProcesoGeneraRoles(esParaCancelar);								
			}
			
			this.procesogeneraroles=new ProcesoGeneraRoles();
			
			this.inicializarProcesoGeneraRoles();
			
			this.actualizarEstadoCeldasBotonesProcesoGeneraRoles("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoGeneraRoles() throws Exception {
		try {
			ProcesoGeneraRolesConstantesFunciones.inicializarProcesoGeneraRoles(this.procesogeneraroles);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesogenerarolesLogic.getProcesoGeneraRoless().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoGeneraRoless(String sAccionBusqueda,List<ProcesoGeneraRoles> procesogenerarolessParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoGeneraRoles"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoGeneraRolesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoGeneraRolesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoGeneraRoles"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Genera Roleses");		
		parameters.put("busquedapor", ProcesoGeneraRolesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoGeneraRoles=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
		} else {
		}
		
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoGeneraRoles);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoGeneraRolesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoGeneraRolesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoGeneraRolesBean.TraerProcesoGeneraRolesBeans(procesogenerarolessParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoGeneraRoless(sAccionBusqueda,sTipoArchivoReporte,procesogenerarolessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoGeneraRoless(sAccionBusqueda,sTipoArchivoReporte,procesogenerarolessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoGeneraRolesActionPerformed(null);
					//this.generarExcelReporteProcesoGeneraRoless(sAccionBusqueda,sTipoArchivoReporte,procesogenerarolessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoGeneraRoless(sAccionBusqueda,sTipoArchivoReporte,procesogenerarolessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoGeneraRoless(sAccionBusqueda,sTipoArchivoReporte,procesogenerarolessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoGeneraRoless(sAccionBusqueda,sTipoArchivoReporte,procesogenerarolessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoGeneraRoless(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoGeneraRoles> procesogenerarolessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesogeneraroles";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoGeneraRoless");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoGeneraRoles("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoGeneraRoles procesogeneraroles : procesogenerarolessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoGeneraRolesConstantesFunciones.generarExcelReporteDataProcesoGeneraRoles("NORMAL",row,workbook,procesogeneraroles,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Genera Roles",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoGeneraRoles(String sTipo,Row row,Workbook workbook) {
		
		ProcesoGeneraRolesConstantesFunciones.generarExcelReporteHeaderProcesoGeneraRoles(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoGeneraRoless(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoGeneraRoles> procesogenerarolessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesogeneraroles_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoGeneraRoless");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoGeneraRoles procesogeneraroles : procesogenerarolessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoGeneraRolesConstantesFunciones.getProcesoGeneraRolesDescripcion(procesogeneraroles));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoGeneraRolesConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoGeneraRolesConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesogeneraroles.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoGeneraRolesConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoGeneraRolesConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesogeneraroles.getestructura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoGeneraRolesConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoGeneraRolesConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesogeneraroles.getempleado_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Genera Roles",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoGeneraRoless(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoGeneraRoles> procesogenerarolessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoGeneraRoles> procesogenerarolessRespaldo=null;
		
		classes=ProcesoGeneraRolesConstantesFunciones.getClassesRelationshipsOfProcesoGeneraRoles(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesogenerarolesLogic.setDatosCliente(this.datosCliente);
		this.procesogenerarolesLogic.setDatosDeep(this.datosDeep);
		this.procesogenerarolesLogic.setIsConDeep(true);
		
		procesogenerarolessRespaldo=this.procesogenerarolesLogic.getProcesoGeneraRoless();
		
		this.procesogenerarolesLogic.setProcesoGeneraRoless(procesogenerarolessParaReportes);	
		this.procesogenerarolesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesogenerarolessParaReportes=this.procesogenerarolesLogic.getProcesoGeneraRoless();
		this.procesogenerarolesLogic.setProcesoGeneraRoless(procesogenerarolessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesogeneraroles_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoGeneraRoless");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoGeneraRoles("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoGeneraRoles procesogeneraroles : procesogenerarolessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoGeneraRoles("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoGeneraRolesConstantesFunciones.generarExcelReporteDataProcesoGeneraRoles("NORMAL",row,workbook,procesogeneraroles,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoGeneraRolesConstantesFunciones.getProcesoGeneraRolesDescripcion(procesogeneraroles));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Genera Roles",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoGeneraRoles() throws Exception {		
		this.startProcessProcesoGeneraRoles(true);
	}
	
	public void startProcessProcesoGeneraRoles(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoGeneraRoles ,this.jPanelParametrosReportesProcesoGeneraRoles, this.jScrollPanelDatosProcesoGeneraRoles,this.jPanelPaginacionProcesoGeneraRoles, this.jScrollPanelDatosEdicionProcesoGeneraRoles, this.jPanelAccionesProcesoGeneraRoles,this.jPanelAccionesFormularioProcesoGeneraRoles,this.jmenuBarProcesoGeneraRoles,this.jmenuBarDetalleProcesoGeneraRoles,this.jTtoolBarProcesoGeneraRoles,this.jTtoolBarDetalleProcesoGeneraRoles);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoGeneraRoles=this.jTabbedPaneBusquedasProcesoGeneraRoles; 
		
		final JPanel jPanelParametrosReportesProcesoGeneraRoles=this.jPanelParametrosReportesProcesoGeneraRoles;
		//final JScrollPane jScrollPanelDatosProcesoGeneraRoles=this.jScrollPanelDatosProcesoGeneraRoles;
		final JTable jTableDatosProcesoGeneraRoles=this.jTableDatosProcesoGeneraRoles;		
		final JPanel jPanelPaginacionProcesoGeneraRoles=this.jPanelPaginacionProcesoGeneraRoles;
		//final JScrollPane jScrollPanelDatosEdicionProcesoGeneraRoles=this.jScrollPanelDatosEdicionProcesoGeneraRoles;
		final JPanel jPanelAccionesProcesoGeneraRoles=this.jPanelAccionesProcesoGeneraRoles;
		
		JPanel jPanelCamposAuxiliarProcesoGeneraRoles=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoGeneraRoles=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
			jPanelCamposAuxiliarProcesoGeneraRoles=this.jInternalFrameDetalleFormProcesoGeneraRoles.jPanelCamposProcesoGeneraRoles;
			jPanelAccionesFormularioAuxiliarProcesoGeneraRoles=this.jInternalFrameDetalleFormProcesoGeneraRoles.jPanelAccionesFormularioProcesoGeneraRoles;
		}
		
		final JPanel jPanelCamposProcesoGeneraRoles=jPanelCamposAuxiliarProcesoGeneraRoles;
		final JPanel jPanelAccionesFormularioProcesoGeneraRoles=jPanelAccionesFormularioAuxiliarProcesoGeneraRoles;
		
		
		final JMenuBar jmenuBarProcesoGeneraRoles=this.jmenuBarProcesoGeneraRoles;
		final JToolBar jTtoolBarProcesoGeneraRoles=this.jTtoolBarProcesoGeneraRoles;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoGeneraRoles=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoGeneraRoles=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
			jmenuBarDetalleAuxiliarProcesoGeneraRoles=this.jInternalFrameDetalleFormProcesoGeneraRoles.jmenuBarDetalleProcesoGeneraRoles;
			jTtoolBarDetalleAuxiliarProcesoGeneraRoles=this.jInternalFrameDetalleFormProcesoGeneraRoles.jTtoolBarDetalleProcesoGeneraRoles;
		}
		
		final JMenuBar jmenuBarDetalleProcesoGeneraRoles=jmenuBarDetalleAuxiliarProcesoGeneraRoles;
		final JToolBar jTtoolBarDetalleProcesoGeneraRoles=jTtoolBarDetalleAuxiliarProcesoGeneraRoles;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoGeneraRoles;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoGeneraRoles;
			processRunnable.jTableDatos=jTableDatosProcesoGeneraRoles;
			processRunnable.jPanelCampos=jPanelCamposProcesoGeneraRoles;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoGeneraRoles;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoGeneraRoles;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoGeneraRoles;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoGeneraRoles;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoGeneraRoles;
			processRunnable.jTtoolBar=jTtoolBarProcesoGeneraRoles;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoGeneraRoles;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoGeneraRoles ,jPanelParametrosReportesProcesoGeneraRoles,jTableDatosProcesoGeneraRoles, /*jScrollPanelDatosProcesoGeneraRoles,*/jPanelCamposProcesoGeneraRoles,jPanelPaginacionProcesoGeneraRoles, /*jScrollPanelDatosEdicionProcesoGeneraRoles,*/ jPanelAccionesProcesoGeneraRoles,jPanelAccionesFormularioProcesoGeneraRoles,jmenuBarProcesoGeneraRoles,jmenuBarDetalleProcesoGeneraRoles,jTtoolBarProcesoGeneraRoles,jTtoolBarDetalleProcesoGeneraRoles);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoGeneraRoles ,jPanelParametrosReportesProcesoGeneraRoles, jScrollPanelDatosProcesoGeneraRoles,jPanelPaginacionProcesoGeneraRoles, jScrollPanelDatosEdicionProcesoGeneraRoles, jPanelAccionesProcesoGeneraRoles,jPanelAccionesFormularioProcesoGeneraRoles,jmenuBarProcesoGeneraRoles,jmenuBarDetalleProcesoGeneraRoles,jTtoolBarProcesoGeneraRoles,jTtoolBarDetalleProcesoGeneraRoles);
						
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
	
	public void finishProcessProcesoGeneraRoles() {// throws Exception 
		this.finishProcessProcesoGeneraRoles(true);
	}
	
	public void finishProcessProcesoGeneraRoles(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoGeneraRoles ,this.jPanelParametrosReportesProcesoGeneraRoles, this.jScrollPanelDatosProcesoGeneraRoles,this.jPanelPaginacionProcesoGeneraRoles, this.jScrollPanelDatosEdicionProcesoGeneraRoles, this.jPanelAccionesProcesoGeneraRoles,this.jPanelAccionesFormularioProcesoGeneraRoles,this.jmenuBarProcesoGeneraRoles,this.jmenuBarDetalleProcesoGeneraRoles,this.jTtoolBarProcesoGeneraRoles,this.jTtoolBarDetalleProcesoGeneraRoles);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoGeneraRoles=this.jTabbedPaneBusquedasProcesoGeneraRoles; 
		
		final JPanel jPanelParametrosReportesProcesoGeneraRoles=this.jPanelParametrosReportesProcesoGeneraRoles;
		//final JScrollPane jScrollPanelDatosProcesoGeneraRoles=this.jScrollPanelDatosProcesoGeneraRoles;
		final JTable jTableDatosProcesoGeneraRoles=this.jTableDatosProcesoGeneraRoles;		
		final JPanel jPanelPaginacionProcesoGeneraRoles=this.jPanelPaginacionProcesoGeneraRoles;
		//final JScrollPane jScrollPanelDatosEdicionProcesoGeneraRoles=this.jScrollPanelDatosEdicionProcesoGeneraRoles;
		final JPanel jPanelAccionesProcesoGeneraRoles=this.jPanelAccionesProcesoGeneraRoles;
		
		JPanel jPanelCamposAuxiliarProcesoGeneraRoles=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoGeneraRoles=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
			jPanelCamposAuxiliarProcesoGeneraRoles=this.jInternalFrameDetalleFormProcesoGeneraRoles.jPanelCamposProcesoGeneraRoles;
			jPanelAccionesFormularioAuxiliarProcesoGeneraRoles=this.jInternalFrameDetalleFormProcesoGeneraRoles.jPanelAccionesFormularioProcesoGeneraRoles;
		}
		
		final JPanel jPanelCamposProcesoGeneraRoles=jPanelCamposAuxiliarProcesoGeneraRoles;
		final JPanel jPanelAccionesFormularioProcesoGeneraRoles=jPanelAccionesFormularioAuxiliarProcesoGeneraRoles;
		
		
		final JMenuBar jmenuBarProcesoGeneraRoles=this.jmenuBarProcesoGeneraRoles;		
		final JToolBar jTtoolBarProcesoGeneraRoles=this.jTtoolBarProcesoGeneraRoles;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoGeneraRoles=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoGeneraRoles=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
			jmenuBarDetalleAuxiliarProcesoGeneraRoles=this.jInternalFrameDetalleFormProcesoGeneraRoles.jmenuBarDetalleProcesoGeneraRoles;
			jTtoolBarDetalleAuxiliarProcesoGeneraRoles=this.jInternalFrameDetalleFormProcesoGeneraRoles.jTtoolBarDetalleProcesoGeneraRoles;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoGeneraRoles=jmenuBarDetalleAuxiliarProcesoGeneraRoles;
		final JToolBar jTtoolBarDetalleProcesoGeneraRoles=jTtoolBarDetalleAuxiliarProcesoGeneraRoles;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoGeneraRoles;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoGeneraRoles;
			processRunnable.jTableDatos=jTableDatosProcesoGeneraRoles;
			processRunnable.jPanelCampos=jPanelCamposProcesoGeneraRoles;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoGeneraRoles;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoGeneraRoles;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoGeneraRoles;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoGeneraRoles;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoGeneraRoles;
			processRunnable.jTtoolBar=jTtoolBarProcesoGeneraRoles;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoGeneraRoles;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoGeneraRoles ,jPanelParametrosReportesProcesoGeneraRoles, jTableDatosProcesoGeneraRoles,/*jScrollPanelDatosProcesoGeneraRoles,*/jPanelCamposProcesoGeneraRoles,jPanelPaginacionProcesoGeneraRoles, /*jScrollPanelDatosEdicionProcesoGeneraRoles,*/ jPanelAccionesProcesoGeneraRoles,jPanelAccionesFormularioProcesoGeneraRoles,jmenuBarProcesoGeneraRoles,jmenuBarDetalleProcesoGeneraRoles,jTtoolBarProcesoGeneraRoles,jTtoolBarDetalleProcesoGeneraRoles));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoGeneraRoles(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoGeneraRoles(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoGeneraRoles(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoGeneraRoles(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoGeneraRoles,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoGeneraRoles,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoGeneraRoles(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoGeneraRoles,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoGeneraRoles,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesogenerarolesConstantesFunciones.getsFinalQueryProcesoGeneraRoles();
		String  finalQueryPaginacionTodos=this.procesogenerarolesConstantesFunciones.getsFinalQueryProcesoGeneraRoles();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoGeneraRolesConstantesFunciones.getArrayColumnasGlobalesNoProcesoGeneraRoles(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoGeneraRolesConstantesFunciones.getArrayColumnasGlobalesProcesoGeneraRoles(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoGeneraRolesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesogenerarolessEliminados= new ArrayList<ProcesoGeneraRoles>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoGeneraRoles();
		
				///*ProcesoGeneraRolesSessionBean*/this.procesogenerarolesSessionBean=new ProcesoGeneraRolesSessionBean();
			
			if(this.procesogenerarolesSessionBean==null) {
				this.procesogenerarolesSessionBean=new ProcesoGeneraRolesSessionBean();
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
					this.iNumeroPaginacion=ProcesoGeneraRolesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoGeneraRolesConstantesFunciones.getClassesForeignKeysOfProcesoGeneraRoles(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesogeneraroles."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesogenerarolessAux= new ArrayList<ProcesoGeneraRoles>();
			
				
			procesogenerarolesLogic.setDatosCliente(this.datosCliente);
			procesogenerarolesLogic.setDatosDeep(this.datosDeep);
			procesogenerarolesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoGeneraRoles")) {
				this.sDetalleReporte=ProcesoGeneraRolesConstantesFunciones.getDetalleIndiceBusquedaProcesoGeneraRoles(id_mesBusquedaProcesoGeneraRoles,id_estructuraBusquedaProcesoGeneraRoles,id_empleadoBusquedaProcesoGeneraRoles);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesogenerarolesLogic.getProcesoGeneraRolessBusquedaProcesoGeneraRoles(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_mesBusquedaProcesoGeneraRoles,id_estructuraBusquedaProcesoGeneraRoles,id_empleadoBusquedaProcesoGeneraRoles);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoGeneraRolesConstantesFunciones.getDetalleIndiceBusquedaProcesoGeneraRoles(id_mesBusquedaProcesoGeneraRoles,id_estructuraBusquedaProcesoGeneraRoles,id_empleadoBusquedaProcesoGeneraRoles);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoGeneraRolesConstantesFunciones.getDetalleIndiceBusquedaProcesoGeneraRoles(id_mesBusquedaProcesoGeneraRoles,id_estructuraBusquedaProcesoGeneraRoles,id_empleadoBusquedaProcesoGeneraRoles);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesogenerarolesLogic.getProcesoGeneraRoless()==null||procesogenerarolesLogic.getProcesoGeneraRoless().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesogeneraroless==null|| procesogeneraroless.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesogenerarolessAux=new ArrayList<ProcesoGeneraRoles>();
						procesogenerarolessAux.addAll(procesogenerarolesLogic.getProcesoGeneraRoless());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesogenerarolessAux=new ArrayList<ProcesoGeneraRoles>();
							procesogenerarolessAux.addAll(procesogeneraroless);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesogenerarolesLogic.getProcesoGeneraRolessBusquedaProcesoGeneraRoles(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_mesBusquedaProcesoGeneraRoles,id_estructuraBusquedaProcesoGeneraRoles,id_empleadoBusquedaProcesoGeneraRoles);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoGeneraRolesConstantesFunciones.getDetalleIndiceBusquedaProcesoGeneraRoles(id_mesBusquedaProcesoGeneraRoles,id_estructuraBusquedaProcesoGeneraRoles,id_empleadoBusquedaProcesoGeneraRoles);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoGeneraRolesConstantesFunciones.getDetalleIndiceBusquedaProcesoGeneraRoles(id_mesBusquedaProcesoGeneraRoles,id_estructuraBusquedaProcesoGeneraRoles,id_empleadoBusquedaProcesoGeneraRoles);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoGeneraRoless("BusquedaProcesoGeneraRoles",procesogenerarolesLogic.getProcesoGeneraRoless());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoGeneraRoless("BusquedaProcesoGeneraRoles",procesogeneraroless);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesogenerarolesLogic.setProcesoGeneraRoless(new ArrayList<ProcesoGeneraRoles>());
						procesogenerarolesLogic.getProcesoGeneraRoless().addAll(procesogenerarolessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesogeneraroless=new ArrayList<ProcesoGeneraRoles>();
							procesogeneraroless.addAll(procesogenerarolessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoGeneraRoles();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","PROCESOS",JOptionPane.INFORMATION_MESSAGE);
		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoGeneraRoles();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesogenerarolesLogic.getProcesoGeneraRoless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesogeneraroless.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesogenerarolesLogic.getProcesoGeneraRoless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesogeneraroless.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoGeneraRoles procesogeneraroles) {
		Boolean permite=true;
		
		if(this.procesogeneraroles.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoGeneraRolesConstantesFunciones.getOrderByListaProcesoGeneraRoles();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoGeneraRolesConstantesFunciones.getOrderByListaProcesoGeneraRoles();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoGeneraRoles procesogeneraroles:procesogenerarolesLogic.getProcesoGeneraRoless()) {
				if(procesogeneraroles.getsType().equals(Constantes2.S_TOTALES)) {
					procesogenerarolesTotales=procesogeneraroles;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoGeneraRoles procesogeneraroles:this.procesogeneraroless) {
				if(procesogeneraroles.getsType().equals(Constantes2.S_TOTALES)) {
					procesogenerarolesTotales=procesogeneraroles;
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
			this.procesogenerarolesAux=new ProcesoGeneraRoles();
			this.procesogenerarolesAux.setsType(Constantes2.S_TOTALES);
			this.procesogenerarolesAux.setIsNew(false);
			this.procesogenerarolesAux.setIsChanged(false);
			this.procesogenerarolesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoGeneraRolesConstantesFunciones.TotalizarValoresFilaProcesoGeneraRoles(this.procesogenerarolesLogic.getProcesoGeneraRoless(),this.procesogenerarolesAux);
				
				//this.procesogenerarolesLogic.getProcesoGeneraRoless().add(this.procesogenerarolesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoGeneraRolesConstantesFunciones.TotalizarValoresFilaProcesoGeneraRoles(this.procesogeneraroless,this.procesogenerarolesAux);
				
				this.procesogeneraroless.add(this.procesogenerarolesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesogenerarolesTotales=new ProcesoGeneraRoles();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesogenerarolesLogic.getProcesoGeneraRoless().remove(procesogenerarolesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesogeneraroless.remove(procesogenerarolesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesogenerarolesTotales=new ProcesoGeneraRoles();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoGeneraRoles procesogeneraroles:procesogenerarolesLogic.getProcesoGeneraRoless()) {
				if(procesogeneraroles.getsType().equals(Constantes2.S_TOTALES)) {
					procesogenerarolesTotales=procesogeneraroles;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoGeneraRolesConstantesFunciones.TotalizarValoresFilaProcesoGeneraRoles(this.procesogenerarolesLogic.getProcesoGeneraRoless(),procesogenerarolesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoGeneraRoles procesogeneraroles:this.procesogeneraroless) {
				if(procesogeneraroles.getsType().equals(Constantes2.S_TOTALES)) {
					procesogenerarolesTotales=procesogeneraroles;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoGeneraRolesConstantesFunciones.TotalizarValoresFilaProcesoGeneraRoles(this.procesogeneraroless,procesogenerarolesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoGeneraRolessBusquedaProcesoGeneraRoles()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoGeneraRoles";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoGeneraRolessFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoGeneraRolessFK_IdEstructura()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoGeneraRolessFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoGeneraRolessBusquedaProcesoGeneraRoles(String sFinalQuery,Long id_mes,Long id_estructura,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesogenerarolesLogic.getProcesoGeneraRolessBusquedaProcesoGeneraRoles(sFinalQuery,this.pagination,id_mes,id_estructura,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoGeneraRolessFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesogenerarolesLogic.getProcesoGeneraRolessFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoGeneraRolessFK_IdEstructura(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesogenerarolesLogic.getProcesoGeneraRolessFK_IdEstructura(sFinalQuery,this.pagination,id_estructura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoGeneraRolessFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesogenerarolesLogic.getProcesoGeneraRolessFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosProcesoGeneraRoles() {
		this.isPermisoTodoProcesoGeneraRoles=false;
		this.isPermisoNuevoProcesoGeneraRoles=false;
		this.isPermisoActualizarProcesoGeneraRoles=false;
		this.isPermisoActualizarOriginalProcesoGeneraRoles=false;
		this.isPermisoEliminarProcesoGeneraRoles=false;
		this.isPermisoGuardarCambiosProcesoGeneraRoles=false;
		this.isPermisoConsultaProcesoGeneraRoles=true;
		this.isPermisoBusquedaProcesoGeneraRoles=true;
		this.isPermisoReporteProcesoGeneraRoles=true;
		this.isPermisoOrdenProcesoGeneraRoles=false;		
		this.isPermisoPaginacionMedioProcesoGeneraRoles=false;		
		this.isPermisoPaginacionAltoProcesoGeneraRoles=false;		
		this.isPermisoPaginacionTodoProcesoGeneraRoles=false;		
		this.isPermisoCopiarProcesoGeneraRoles=false;		
		this.isPermisoVerFormProcesoGeneraRoles=false;		
		this.isPermisoDuplicarProcesoGeneraRoles=false;
		this.isPermisoOrdenProcesoGeneraRoles=false;
	}
	
	public void setPermisosUsuarioProcesoGeneraRoles(Boolean isPermiso) {
		this.isPermisoTodoProcesoGeneraRoles=isPermiso;
		this.isPermisoNuevoProcesoGeneraRoles=isPermiso;
		this.isPermisoActualizarProcesoGeneraRoles=isPermiso;
		this.isPermisoActualizarOriginalProcesoGeneraRoles=isPermiso;
		this.isPermisoEliminarProcesoGeneraRoles=isPermiso;
		this.isPermisoGuardarCambiosProcesoGeneraRoles=isPermiso;
		this.isPermisoConsultaProcesoGeneraRoles=isPermiso;
		this.isPermisoBusquedaProcesoGeneraRoles=isPermiso;
		this.isPermisoReporteProcesoGeneraRoles=isPermiso;
		this.isPermisoOrdenProcesoGeneraRoles=isPermiso;		
		this.isPermisoPaginacionMedioProcesoGeneraRoles=isPermiso;		
		this.isPermisoPaginacionAltoProcesoGeneraRoles=isPermiso;		
		this.isPermisoPaginacionTodoProcesoGeneraRoles=isPermiso;		
		this.isPermisoCopiarProcesoGeneraRoles=isPermiso;		
		this.isPermisoVerFormProcesoGeneraRoles=isPermiso;		
		this.isPermisoDuplicarProcesoGeneraRoles=isPermiso;
		this.isPermisoOrdenProcesoGeneraRoles=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoGeneraRoles(Boolean isPermiso) {
		//this.isPermisoTodoProcesoGeneraRoles=isPermiso;
		this.isPermisoNuevoProcesoGeneraRoles=isPermiso;
		this.isPermisoActualizarProcesoGeneraRoles=isPermiso;
		this.isPermisoActualizarOriginalProcesoGeneraRoles=isPermiso;
		this.isPermisoEliminarProcesoGeneraRoles=isPermiso;
		this.isPermisoGuardarCambiosProcesoGeneraRoles=isPermiso;
		//this.isPermisoConsultaProcesoGeneraRoles=isPermiso;
		//this.isPermisoBusquedaProcesoGeneraRoles=isPermiso;
		//this.isPermisoReporteProcesoGeneraRoles=isPermiso;
		//this.isPermisoOrdenProcesoGeneraRoles=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoGeneraRoles=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoGeneraRoles=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoGeneraRoles=isPermiso;		
		//this.isPermisoCopiarProcesoGeneraRoles=isPermiso;		
		//this.isPermisoDuplicarProcesoGeneraRoles=isPermiso;
		//this.isPermisoOrdenProcesoGeneraRoles=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoGeneraRolesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoGeneraRolesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoGeneraRoles(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoGeneraRolesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoGeneraRolesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoGeneraRolesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoGeneraRolesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoGeneraRoles() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoGeneraRolesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoGeneraRolesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoGeneraRoles=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoGeneraRoles=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoGeneraRoles=this.isPermisoActualizarProcesoGeneraRoles;
			this.isPermisoEliminarProcesoGeneraRoles=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoGeneraRoles=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoGeneraRoles=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoGeneraRoles=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoGeneraRoles=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoGeneraRoles=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoGeneraRoles=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoGeneraRoles=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoGeneraRoles=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoGeneraRoles=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoGeneraRoles=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoGeneraRoles=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoGeneraRoles=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoGeneraRoles=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoGeneraRoles.setToolTipText(this.jTableDatosProcesoGeneraRoles.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoGeneraRoles(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoGeneraRoles(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoGeneraRolesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoGeneraRolesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoGeneraRoles() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoGeneraRolesListas()throws Exception {
		try	{						
			
				this.messForeignKey=new ArrayList();
				this.estructurasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoGeneraRolesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoGeneraRolesJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyMesListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.messForeignKey==null||this.messForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesConstantesFunciones.SFINALQUERY;

				this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstructuraListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstructuraConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoGeneraRoles()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyMes();
			this.addItemDefectoCombosForeignKeyEstructura();
			this.addItemDefectoCombosForeignKeyEmpleado();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyMes()throws Exception {
		try {
			if(this.procesogenerarolesSessionBean==null) {
				this.procesogenerarolesSessionBean=new ProcesoGeneraRolesSessionBean();
			}

			if(!this.procesogenerarolesSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				Mes mes=new Mes();
				MesConstantesFunciones.setMesDescripcion(mes,Constantes.SMENSAJE_ESCOJA_OPCION);
				mes.setId(null);

				if(!MesConstantesFunciones.ExisteEnLista(this.messForeignKey,mes,true)) {

					this.messForeignKey.add(0,mes);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstructura()throws Exception {
		try {

			if(!this.procesogenerarolesSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
				Estructura estructura=new Estructura();
				EstructuraConstantesFunciones.setEstructuraDescripcion(estructura,Constantes.SMENSAJE_ESCOJA_OPCION);
				estructura.setId(null);

				if(!EstructuraConstantesFunciones.ExisteEnLista(this.estructurasForeignKey,estructura,true)) {

					this.estructurasForeignKey.add(0,estructura);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.procesogenerarolesSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
	
	public void initActionsCombosTodosForeignKeyProcesoGeneraRoles()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoGeneraRoles(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoGeneraRoles()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoGeneraRoles();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoGeneraRoles(ProcesoGeneraRoles procesogeneraroles)throws Exception {	
		try {
			
			this.setActualEstructuraForeignKey(procesogeneraroles.getid_estructura(),false,"Formulario");
			this.setActualEmpleadoForeignKey(procesogeneraroles.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoGeneraRoles(ProcesoGeneraRoles procesogeneraroles,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoGeneraRoles()throws Exception {	
		try {
			
			this.setActualEstructuraForeignKey(this.procesogenerarolesConstantesFunciones.getid_estructura(),false,"Formulario");
			this.setActualEmpleadoForeignKey(this.procesogenerarolesConstantesFunciones.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoGeneraRoles()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoGeneraRoles()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoGeneraRoles()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoGeneraRoles()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoGeneraRoles()throws Exception {
		try {
			

			this.cargarCombosFrameMessForeignKey("Todos");
			this.cargarCombosFrameEstructurasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoGeneraRoles(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoGeneraRoles()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_mesProcesoGeneraRoles!=null && this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_mesProcesoGeneraRoles.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_mesProcesoGeneraRoles.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_estructuraProcesoGeneraRoles!=null && this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_estructuraProcesoGeneraRoles.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_estructuraProcesoGeneraRoles.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_empleadoProcesoGeneraRoles!=null && this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_empleadoProcesoGeneraRoles.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_empleadoProcesoGeneraRoles.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ProcesoGeneraRolesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoGeneraRolesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoGeneraRolesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesogenerarolesSessionBean=new ProcesoGeneraRolesSessionBean(); 
		this.procesogenerarolesConstantesFunciones=new ProcesoGeneraRolesConstantesFunciones(); 
		this.procesogenerarolesBean=new ProcesoGeneraRoles();//(this.procesogenerarolesConstantesFunciones); 		
		this.procesogenerarolesReturnGeneral=new ProcesoGeneraRolesParameterReturnGeneral(); 
		
		this.procesogenerarolesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesogenerarolesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoGeneraRolesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoGeneraRolesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoGeneraRolesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoGeneraRoles(true);
			
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
			
			this.procesogenerarolesConstantesFunciones=new ProcesoGeneraRolesConstantesFunciones(); 
			this.procesogenerarolesBean=new ProcesoGeneraRoles();//this.procesogenerarolesConstantesFunciones); 			
			this.procesogenerarolesReturnGeneral=new ProcesoGeneraRolesParameterReturnGeneral(); 
		
			ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Genera Roles Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.procesogeneraroles=new ProcesoGeneraRoles();
			this.procesogeneraroless = new ArrayList<ProcesoGeneraRoles>();
			this.procesogenerarolessAux = new ArrayList<ProcesoGeneraRoles>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic=new ProcesoGeneraRolesLogic();
				this.procesogenerarolesLogic.getNewConnexionToDeep("");
			}
			
			//this.procesogenerarolesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesogenerarolesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoGeneraRoles);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoGeneraRoles!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoGeneraRoles);	
					}
					
					if(this.jInternalFrameImportacionProcesoGeneraRoles!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoGeneraRoles);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoGeneraRoles!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoGeneraRoles);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoGeneraRoles);
				this.jInternalFrameDetalleFormProcesoGeneraRoles.setVisible(false);
				this.jInternalFrameDetalleFormProcesoGeneraRoles.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoGeneraRoles!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoGeneraRoles);
					this.jInternalFrameReporteDinamicoProcesoGeneraRoles.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoGeneraRoles.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoGeneraRoles!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoGeneraRoles);
					this.jInternalFrameImportacionProcesoGeneraRoles.setVisible(false);
					this.jInternalFrameImportacionProcesoGeneraRoles.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoGeneraRoles!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoGeneraRoles);
					this.jInternalFrameOrderByProcesoGeneraRoles.setVisible(false);
					this.jInternalFrameOrderByProcesoGeneraRoles.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoGeneraRolesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoGeneraRolesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesogenerarolesReturnGeneral=new ProcesoGeneraRolesParameterReturnGeneral();
			
			this.procesogenerarolesParameterGeneral=new ProcesoGeneraRolesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesogenerarolesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoGeneraRolesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoGeneraRolesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesogenerarolesSessionBean.getEsGuardarRelacionado(),this.procesogenerarolesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoGeneraRolesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesogenerarolesSessionBean.getEsGuardarRelacionado(),this.procesogenerarolesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoGeneraRoles=false;
			this.isVisibilidadCeldaDuplicarProcesoGeneraRoles=true;
			this.isVisibilidadCeldaCopiarProcesoGeneraRoles=true;
			this.isVisibilidadCeldaVerFormProcesoGeneraRoles=true;
			this.isVisibilidadCeldaOrdenProcesoGeneraRoles=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraRoles=false;
			this.isVisibilidadCeldaModificarProcesoGeneraRoles=false;
			this.isVisibilidadCeldaActualizarProcesoGeneraRoles=false;
			this.isVisibilidadCeldaEliminarProcesoGeneraRoles=false;
			this.isVisibilidadCeldaCancelarProcesoGeneraRoles=false;
			this.isVisibilidadCeldaGuardarProcesoGeneraRoles=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoGeneraRoles=false;
			
			
			this.isVisibilidadBusquedaProcesoGeneraRoles=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEstructura=true;
			this.isVisibilidadFK_IdMes=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoGeneraRoles("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoGeneraRoles();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoGeneraRoles(false);
			
			this.setPermisosUsuarioProcesoGeneraRoles();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesogenerarolesSessionBean.getEsGuardarRelacionado() 
				|| (this.procesogenerarolesSessionBean.getEsGuardarRelacionado() && this.procesogenerarolesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoGeneraRolesClasesRelacionadas();
			}
			
			if(this.procesogenerarolesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoGeneraRolesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoGeneraRoles();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoGeneraRoles();
			}
			
			if(!this.isPermisoBusquedaProcesoGeneraRoles) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoGeneraRoles.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoGeneraRolesConstantesFunciones.getTiposSeleccionarProcesoGeneraRoles());
				
				this.tiposColumnasSelect=ProcesoGeneraRolesConstantesFunciones.getTiposSeleccionarProcesoGeneraRoles(true);
				
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
			//if(!this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoGeneraRoles();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioProcesoGeneraRoles(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioProcesoGeneraRoles(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoGeneraRoles() ;
			
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
			
			this.mesLogic=new MesLogic();
			this.estructuraLogic=new EstructuraLogic();
			this.empleadoLogic=new EmpleadoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				procesogenerarolesImplementable= (ProcesoGeneraRolesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoGeneraRolesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesogenerarolesImplementableHome= (ProcesoGeneraRolesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoGeneraRolesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesogeneraroless= new ArrayList<ProcesoGeneraRoles>();
			this.procesogenerarolessEliminados= new ArrayList<ProcesoGeneraRoles>();
						
			this.isEsNuevoProcesoGeneraRoles=false;
			this.esParaAccionDesdeFormularioProcesoGeneraRoles=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.messForeignKey=new ArrayList<Mes>() ;
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoGeneraRoles(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoGeneraRoles();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoGeneraRolesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoGeneraRoles("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoGeneraRoles(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoGeneraRoles();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoGeneraRoles();
			}
			
			ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoGeneraRoles.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoGeneraRoles.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoGeneraRoles.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoGeneraRoles(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoGeneraRoles: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoGeneraRoles() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoGeneraRoles")) {
				iIndex=this.jInternalFrameDetalleFormProcesoGeneraRoles.jTabbedPaneRelacionesProcesoGeneraRoles.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoGeneraRoles.jTabbedPaneRelacionesProcesoGeneraRoles.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoGeneraRoles.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoGeneraRoles();	
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
	
	public void cargarCombosForeignKeyProcesoGeneraRoles(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoGeneraRoles(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoGeneraRoles(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoGeneraRolesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoGeneraRoles();
		
		this.cargarCombosFrameForeignKeyProcesoGeneraRoles();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoGeneraRoles();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoGeneraRoles();
		}
	}
	
	

	public void cargarCombosForeignKeyMes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMes(this.messForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstructura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstructura(this.estructurasForeignKey);

		} catch(Exception e) {
			throw e;
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
	
	public void jButtonNuevoProcesoGeneraRolesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesogenerarolesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoGeneraRoles==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
			
			
			if(jTableDatosProcesoGeneraRoles.getRowCount()>=1) {
				jTableDatosProcesoGeneraRoles.removeRowSelectionInterval(0, jTableDatosProcesoGeneraRoles.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoGeneraRoles=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoGeneraRoles(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoGeneraRoles(true);			
			//this.procesogeneraroles=new ProcesoGeneraRoles();
			//this.procesogeneraroles.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoGeneraRoles(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoGeneraRoles() ;
			
			if(ProcesoGeneraRolesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoGeneraRoles(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesogeneraroles);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesogeneraroles);				
			
			ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
			
			if(this.procesogenerarolesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoGeneraRoles: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoGeneraRolesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoGeneraRoles> procesogenerarolessSeleccionados=new ArrayList<ProcesoGeneraRoles>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoGeneraRoles.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoGeneraRoles.getSelectedRows().length;			
			}
			
			procesogenerarolessSeleccionados=this.getProcesoGeneraRolessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoGeneraRoles--;			
				//ProcesoGeneraRoles procesogenerarolesAux= new ProcesoGeneraRoles();			
				//procesogenerarolesAux.setId(this.iIdNuevoProcesoGeneraRoles);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoGeneraRoles procesogenerarolesOrigen=new ProcesoGeneraRoles();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoGeneraRoles procesogenerarolesOrigen : procesogenerarolessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoGeneraRoles.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesogenerarolesOrigen =(ProcesoGeneraRoles) this.procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesogenerarolesOrigen =(ProcesoGeneraRoles) this.procesogeneraroless.toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoGeneraRoles();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesogeneraroles.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoGeneraRoles(procesogenerarolesOrigen,this.procesogeneraroles,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraRoles(this.procesogeneraroles);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesogenerarolesLogic.getProcesoGeneraRoless().add(this.procesogenerarolesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesogeneraroless.add(this.procesogenerarolesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoGeneraRoles(false);
				
				this.jTableDatosProcesoGeneraRoles.setRowSelectionInterval(this.getIndiceNuevoProcesoGeneraRoles(), this.getIndiceNuevoProcesoGeneraRoles());
				
				int iLastRow =  this.jTableDatosProcesoGeneraRoles.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoGeneraRoles.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoGeneraRoles.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoGeneraRoles(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoGeneraRolesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoGeneraRoles> procesogenerarolessSeleccionados=new ArrayList<ProcesoGeneraRoles>();									
		
			ProcesoGeneraRoles procesogenerarolesOrigen=new ProcesoGeneraRoles();
			ProcesoGeneraRoles procesogenerarolesDestino=new ProcesoGeneraRoles();
				
			procesogenerarolessSeleccionados=this.getProcesoGeneraRolessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoGeneraRoles.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesogenerarolessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoGeneraRoles.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesogenerarolesOrigen =(ProcesoGeneraRoles) this.procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesogenerarolesOrigen =(ProcesoGeneraRoles) this.procesogeneraroless.toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesogenerarolesDestino =(ProcesoGeneraRoles) this.procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesogenerarolesDestino =(ProcesoGeneraRoles) this.procesogeneraroless.toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesogenerarolesOrigen =procesogenerarolessSeleccionados.get(0);
				procesogenerarolesDestino =procesogenerarolessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoGeneraRoles(procesogenerarolesOrigen,procesogenerarolesDestino,true,false);
				
				procesogenerarolesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesogenerarolesDestino,procesogenerarolesLogic.getProcesoGeneraRoless());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesogenerarolesDestino,procesogeneraroless);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoGeneraRoles(false);
				
				//this.jTableDatosProcesoGeneraRoles.setRowSelectionInterval(this.getIndiceNuevoProcesoGeneraRoles(), this.getIndiceNuevoProcesoGeneraRoles());
				
				int iLastRow =  this.jTableDatosProcesoGeneraRoles.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoGeneraRoles.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoGeneraRoles.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoGeneraRoles(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoGeneraRolesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoGeneraRoles==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoGeneraRoles.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoGeneraRolesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoGeneraRoles.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoGeneraRoles.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoGeneraRoles.setVisible(!isVisible);
			this.jPanelPaginacionProcesoGeneraRoles.setVisible(!isVisible);
			this.jPanelAccionesProcesoGeneraRoles.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoGeneraRolesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoGeneraRoles();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoGeneraRolesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoGeneraRoles();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoGeneraRolesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoGeneraRoles();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoGeneraRolesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoGeneraRoles();
			
			this.abrirFrameOrderByProcesoGeneraRoles();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoGeneraRolesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoGeneraRoles();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoGeneraRoles(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoGeneraRoles);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoGeneraRoles.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoGeneraRoles.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoGeneraRoles.setSize(this.jInternalFrameDetalleFormProcesoGeneraRoles.iWidthFormulario,this.jInternalFrameDetalleFormProcesoGeneraRoles.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoGeneraRoles.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoGeneraRoles.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoGeneraRoles.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoGeneraRoles.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoGeneraRoles.jContentPaneDetalleProcesoGeneraRoles.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoGeneraRoles.jTabbedPaneRelacionesProcesoGeneraRoles.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoGeneraRoles.jContentPaneDetalleProcesoGeneraRoles.getWidth(),ProcesoGeneraRolesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoGeneraRoles.jTabbedPaneRelacionesProcesoGeneraRoles.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoGeneraRoles.jContentPaneDetalleProcesoGeneraRoles.getWidth(),ProcesoGeneraRolesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoGeneraRoles.jTabbedPaneRelacionesProcesoGeneraRoles.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoGeneraRoles.jContentPaneDetalleProcesoGeneraRoles.getWidth(),ProcesoGeneraRolesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoGeneraRoles.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoGeneraRoles.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoGeneraRoles() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoGeneraRoles==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoGeneraRoles=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoGeneraRoles,false,this);
				} else {
					this.jInternalFrameOrderByProcesoGeneraRoles=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoGeneraRoles,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoGeneraRoles);
				this.jInternalFrameOrderByProcesoGeneraRoles.setVisible(false);
				this.jInternalFrameOrderByProcesoGeneraRoles.setSelected(false);
				
				this.jInternalFrameOrderByProcesoGeneraRoles.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoGeneraRoles"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoGeneraRoles();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoGeneraRoles() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoGeneraRoles==null) {
				
				this.jInternalFrameImportacionProcesoGeneraRoles=new ImportacionJInternalFrame(ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoGeneraRoles);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoGeneraRoles);
				this.jInternalFrameImportacionProcesoGeneraRoles.setVisible(false);
				this.jInternalFrameImportacionProcesoGeneraRoles.setSelected(false);


				this.jInternalFrameImportacionProcesoGeneraRoles.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoGeneraRoles"));
				this.jInternalFrameImportacionProcesoGeneraRoles.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoGeneraRoles"));
				this.jInternalFrameImportacionProcesoGeneraRoles.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoGeneraRoles"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoGeneraRoles() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoGeneraRoles==null) {
				this.jInternalFrameReporteDinamicoProcesoGeneraRoles=new ReporteDinamicoJInternalFrame(ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoGeneraRoles);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoGeneraRoles);
				this.jInternalFrameReporteDinamicoProcesoGeneraRoles.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoGeneraRoles.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoGeneraRoles"));
				this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoGeneraRoles"));
				this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoGeneraRoles"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoGeneraRoles();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoGeneraRoles() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoGeneraRoles);
			
	       	this.jInternalFrameDetalleFormProcesoGeneraRoles.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoGeneraRoles.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoGeneraRoles.dispose();
			//this.jInternalFrameDetalleFormProcesoGeneraRoles=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoGeneraRoles() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoGeneraRoles.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoGeneraRoles.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoGeneraRoles() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoGeneraRoles.setVisible(true);
	        this.jInternalFrameImportacionProcesoGeneraRoles.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoGeneraRoles() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoGeneraRoles.setVisible(true);
	        this.jInternalFrameOrderByProcesoGeneraRoles.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoGeneraRoles() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoGeneraRoles.setVisible(false);
	        this.jInternalFrameOrderByProcesoGeneraRoles.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoGeneraRoles() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoGeneraRoles.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoGeneraRoles.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoGeneraRoles() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoGeneraRoles.setVisible(false);
	        this.jInternalFrameImportacionProcesoGeneraRoles.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoGeneraRolesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoGeneraRoles(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoGeneraRoles(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoGeneraRoles.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoGeneraRoles(true);
			//this.isEsNuevoProcesoGeneraRoles=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogeneraroless.toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoGeneraRoles("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoGeneraRoles(false) ;
			
			if(procesogenerarolesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoGeneraRolesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoGeneraRoles(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoGeneraRoles(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoGeneraRolesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoGeneraRoles.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogeneraroless.toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoGeneraRoles(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoGeneraRoles==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoGeneraRoles.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoGeneraRoles(true);
			//this.isEsNuevoProcesoGeneraRoles=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogeneraroless.toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesogeneraroles.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoGeneraRoles("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoGeneraRoles(false) ;
			
			if(ProcesoGeneraRolesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoGeneraRoles(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoGeneraRoles(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaMes(List<Mes> messForeignKey)throws Exception{
		TableColumn tableColumnMes=this.jTableDatosProcesoGeneraRoles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoGeneraRoles,ProcesoGeneraRolesConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoGeneraRoles.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstructura(List<Estructura> estructurasForeignKey)throws Exception{
		TableColumn tableColumnEstructura=this.jTableDatosProcesoGeneraRoles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoGeneraRoles,ProcesoGeneraRolesConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoGeneraRoles.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructurasForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosProcesoGeneraRoles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoGeneraRoles,ProcesoGeneraRolesConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoGeneraRoles.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesoGeneraRolesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoGeneraRoles(false);
			
			//if(!this.isEsNuevoProcesoGeneraRoles) {								
				int intSelectedRow = this.jTableDatosProcesoGeneraRoles.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogeneraroless.toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoGeneraRoles(this.procesogeneraroles,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraRoles(this.procesogeneraroles);
				
			}
			
			if(this.permiteMantenimiento(this.procesogeneraroles)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoGeneraRoles=true;
					this.inicializarActualizarBindingTablaProcesoGeneraRoles(false);
					this.isEsNuevoProcesoGeneraRoles=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoGeneraRoles=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoGeneraRoles=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoGeneraRoles(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoGeneraRoles(false);
				
				this.habilitarDeshabilitarControlesProcesoGeneraRoles(false);
			
												
				
				if(ProcesoGeneraRolesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoGeneraRoles();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoGeneraRolesActionPerformed(evt,procesogenerarolesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoGeneraRoles(this.procesogeneraroles,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoGeneraRoles.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesogenerarolesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesogeneraroles.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoGeneraRoles.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGeneraRoles.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoGeneraRolesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoGeneraRoles.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
				this.procesogeneraroles.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogeneraroless.toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
				this.procesogeneraroles.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesogeneraroles)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoGeneraRolesModel) this.jTableDatosProcesoGeneraRoles.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoGeneraRoles=true;
				this.inicializarActualizarBindingTablaProcesoGeneraRoles(false);
				this.isEsNuevoProcesoGeneraRoles=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoGeneraRoles(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoGeneraRoles(false);
				
				this.habilitarDeshabilitarControlesProcesoGeneraRoles(false);
				
				
				
				if(ProcesoGeneraRolesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoGeneraRoles();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoGeneraRolesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoGeneraRoles.getRowCount()>=1) {
				jTableDatosProcesoGeneraRoles.removeRowSelectionInterval(0, jTableDatosProcesoGeneraRoles.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoGeneraRoles(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoGeneraRoles(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoGeneraRoles(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoGeneraRoles(false) ;
			
			this.isEsNuevoProcesoGeneraRoles=false;
			
			if(ProcesoGeneraRolesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoGeneraRoles();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoGeneraRolesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoGeneraRoles(false);
				
				//SI ES MANUAL
				if(ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoGeneraRoles();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoGeneraRolesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoGeneraRoles--;			
			//ProcesoGeneraRoles procesogenerarolesAux= new ProcesoGeneraRoles();			
			//procesogenerarolesAux.setId(this.iIdNuevoProcesoGeneraRoles);
			
			if(this.jInternalFrameDetalleFormProcesoGeneraRoles==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoGeneraRoles();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraRoles(this.procesogeneraroles);
			
			this.procesogeneraroles.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesogenerarolesLogic.getProcesoGeneraRoless().add(this.procesogenerarolesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesogeneraroless.add(this.procesogenerarolesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoGeneraRoles(false);
			
			this.jTableDatosProcesoGeneraRoles.setRowSelectionInterval(this.getIndiceNuevoProcesoGeneraRoles(), this.getIndiceNuevoProcesoGeneraRoles());
			
			int iLastRow =  this.jTableDatosProcesoGeneraRoles.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoGeneraRoles.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoGeneraRoles.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoGeneraRoles(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoGeneraRolesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoGeneraRoles(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoGeneraRoles(false);
			
			//SI ES MANUAL
			if(ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoGeneraRoles();
			}
			
			//this.abrirFrameTreeProcesoGeneraRoles();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoGeneraRolesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoGeneraRolesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoGeneraRoles.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoGeneraRoles.setFileImportacion(this.jInternalFrameImportacionProcesoGeneraRoles.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoGeneraRoles.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoGeneraRoles.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoGeneraRoles.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoGeneraRoles.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoGeneraRolesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoGeneraRoles> procesogenerarolessSeleccionados=new ArrayList<ProcesoGeneraRoles>();		

		procesogenerarolessSeleccionados=this.getProcesoGeneraRolessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoGeneraRolesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoGeneraRolesBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoGeneraRoless("Todos",procesogenerarolessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Genera Roles",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoGeneraRolesConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoGeneraRolesConstantesFunciones.LABEL_IDESTRUCTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Estructura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Estructura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Estructura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Estructura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoGeneraRolesConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoGeneraRolesConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;

				case ProcesoGeneraRolesConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoria="id_estructura";
					break;

				case ProcesoGeneraRolesConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoGeneraRolesConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;

				case ProcesoGeneraRolesConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoriaValor="id_estructura";
					break;

				case ProcesoGeneraRolesConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoGeneraRolesConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
					break;

				case ProcesoGeneraRolesConstantesFunciones.LABEL_IDESTRUCTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estructura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estructura");
					break;

				case ProcesoGeneraRolesConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoGeneraRolesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoGeneraRoles> procesogenerarolessSeleccionados=new ArrayList<ProcesoGeneraRoles>();		
		
		procesogenerarolessSeleccionados=this.getProcesoGeneraRolessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesogeneraroles";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoGeneraRoless");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoGeneraRolesConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoGeneraRolesConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(ProcesoGeneraRoles procesogeneraroles:procesogenerarolessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesogeneraroles.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoGeneraRolesConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoGeneraRolesConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(ProcesoGeneraRoles procesogeneraroles:procesogenerarolessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesogeneraroles.getestructura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoGeneraRolesConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoGeneraRolesConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(ProcesoGeneraRoles procesogeneraroles:procesogenerarolessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesogeneraroles.getempleado_descripcion());
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
			//	this.getFilaCabeceraExportarExcelProcesoGeneraRoles(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoGeneraRoles procesogenerarolesAux:procesogenerarolessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoGeneraRoles(procesogenerarolesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Genera Roles",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionProcesoGeneraRolesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.ProcesarInformacionProcesoGeneraRoles(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoGeneraRoles(false);
			
			//SI ES MANUAL
			if(ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoGeneraRoles();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoGeneraRolesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoGeneraRoles(false);
			
			//SI ES MANUAL
			if(ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoGeneraRoles();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoGeneraRolesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoGeneraRoles(false);
			
			//SI ES MANUAL
			if(ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoGeneraRoles();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoGeneraRoles() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoGeneraRoles.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoGeneraRoles.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoGeneraRoles.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoGeneraRoles.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoGeneraRoles.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoGeneraRoles.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoGeneraRoles.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoGeneraRoles(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoGeneraRoles(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoGeneraRoles(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoGeneraRoles(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoGeneraRoles(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoGeneraRoles(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoGeneraRoles(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoGeneraRoles(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoGeneraRoles() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoGeneraRoles();
		
		this.inicializarActualizarBindingBotonesManualProcesoGeneraRoles(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoGeneraRoles();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoGeneraRoles() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoGeneraRoles(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoGeneraRoles(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoGeneraRoles.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoGeneraRoles.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoGeneraRoles.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoGeneraRoles.jCheckBoxPostAccionNuevoProcesoGeneraRoles.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoGeneraRoles.jCheckBoxPostAccionSinCerrarProcesoGeneraRoles.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoGeneraRoles.jCheckBoxPostAccionSinMensajeProcesoGeneraRoles.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoGeneraRoles.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoGeneraRoles.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoGeneraRoles.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
				this.jInternalFrameDetalleFormProcesoGeneraRoles.jCheckBoxPostAccionNuevoProcesoGeneraRoles.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoGeneraRoles.jCheckBoxPostAccionSinCerrarProcesoGeneraRoles.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoGeneraRoles.jCheckBoxPostAccionSinMensajeProcesoGeneraRoles.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoGeneraRoles.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoGeneraRoles.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxTiposAccionesFormularioProcesoGeneraRoles.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoGeneraRoles.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoGeneraRoles!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoGeneraRoles.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoGeneraRoles.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoGeneraRoles.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoGeneraRoles.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoGeneraRoles!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoGeneraRoles.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoGeneraRoles.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoGeneraRoles(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoGeneraRoles(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoGeneraRoles() throws Exception {
		try	{
			if(ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoGeneraRoles();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoGeneraRoles() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxTiposAccionesFormularioProcesoGeneraRoles.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxTiposAccionesFormularioProcesoGeneraRoles.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoGeneraRoles() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoGeneraRoles.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoGeneraRoles.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoGeneraRoles.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoGeneraRoles.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoGeneraRoles.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoGeneraRoles.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoGeneraRoles.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoGeneraRoles.addItem(reporte);
			}
			
			
			if(!this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoGeneraRoles.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoGeneraRoles.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoGeneraRoles.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoGeneraRoles.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoGeneraRoles.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoGeneraRoles.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxTiposAccionesFormularioProcesoGeneraRoles.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxTiposAccionesFormularioProcesoGeneraRoles.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoGeneraRoles.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoGeneraRoles.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoGeneraRoles.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoGeneraRoles();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoGeneraRoles() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoGeneraRoles!=null) {
				this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoGeneraRoles!=null) {
				this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoGeneraRoles!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoGeneraRoles()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles.getSelectedItem()!=null){this.id_mesBusquedaProcesoGeneraRoles=((Mes)this.jComboBoxid_mesBusquedaProcesoGeneraRolesProcesoGeneraRoles.getSelectedItem()).getId();}
		if(this.jComboBoxid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles.getSelectedItem()!=null){this.id_estructuraBusquedaProcesoGeneraRoles=((Estructura)this.jComboBoxid_estructuraBusquedaProcesoGeneraRolesProcesoGeneraRoles.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles.getSelectedItem()!=null){this.id_empleadoBusquedaProcesoGeneraRoles=((Empleado)this.jComboBoxid_empleadoBusquedaProcesoGeneraRolesProcesoGeneraRoles.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoGeneraRoles(Boolean esInicializar) throws Exception {				
		if(ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoGeneraRoles();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoGeneraRoles() throws Exception {
		this.inicializarActualizarBindingTablaProcesoGeneraRoles(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoGeneraRoles() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoGeneraRoles.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoGeneraRoles.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoGeneraRoles.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoGeneraRolesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoGeneraRoles.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoGeneraRoles.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoGeneraRolesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoGeneraRolesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoGeneraRolesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoGeneraRolesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoGeneraRoles.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoGeneraRoles.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoGeneraRolesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoGeneraRoles.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoGeneraRoles(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesogenerarolesLogic.getProcesoGeneraRoless().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesogeneraroless.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoGeneraRoles.setModel(new ProcesoGeneraRolesModel(this.procesogenerarolesLogic.getProcesoGeneraRoless(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoGeneraRoles.setModel(new ProcesoGeneraRolesModel(this.procesogeneraroless,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoGeneraRoles!=null && this.jInternalFrameOrderByProcesoGeneraRoles.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoGeneraRoles();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoGeneraRoles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoGeneraRoles,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoGeneraRolesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO,procesogenerarolesConstantesFunciones.resaltarSeleccionarProcesoGeneraRoles,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoGeneraRolesConstantesFunciones.SCLASSWEBTITULO,procesogenerarolesConstantesFunciones.resaltarSeleccionarProcesoGeneraRoles,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoGeneraRoles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoGeneraRoles,ProcesoGeneraRolesConstantesFunciones.LABEL_ID));

		if(this.procesogenerarolesConstantesFunciones.mostraridProcesoGeneraRoles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoGeneraRolesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesogenerarolesConstantesFunciones.resaltaridProcesoGeneraRoles,this.procesogenerarolesConstantesFunciones.activaridProcesoGeneraRoles,this,true,"idProcesoGeneraRoles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesogenerarolesConstantesFunciones.resaltaridProcesoGeneraRoles,this.procesogenerarolesConstantesFunciones.activaridProcesoGeneraRoles,this,true,"idProcesoGeneraRoles","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoGeneraRoles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoGeneraRoles,ProcesoGeneraRolesConstantesFunciones.LABEL_IDMES));

		if(this.procesogenerarolesConstantesFunciones.mostrarid_mesProcesoGeneraRoles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoGeneraRolesConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.procesogenerarolesConstantesFunciones.resaltarid_mesProcesoGeneraRoles,this,this.procesogenerarolesConstantesFunciones.activarid_mesProcesoGeneraRoles));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.procesogenerarolesConstantesFunciones.resaltarid_mesProcesoGeneraRoles,this,this.procesogenerarolesConstantesFunciones.activarid_mesProcesoGeneraRoles,true,"id_mesProcesoGeneraRoles","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoGeneraRolesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoGeneraRoles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoGeneraRoles,ProcesoGeneraRolesConstantesFunciones.LABEL_IDESTRUCTURA));

		if(this.procesogenerarolesConstantesFunciones.mostrarid_estructuraProcesoGeneraRoles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoGeneraRolesConstantesFunciones.LABEL_IDESTRUCTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstructuraTableCell(this.estructurasForeignKey,this.procesogenerarolesConstantesFunciones.resaltarid_estructuraProcesoGeneraRoles,this,this.procesogenerarolesConstantesFunciones.activarid_estructuraProcesoGeneraRoles));
			tableColumn.setCellEditor(new EstructuraTableCell(this.estructurasForeignKey,this.procesogenerarolesConstantesFunciones.resaltarid_estructuraProcesoGeneraRoles,this,this.procesogenerarolesConstantesFunciones.activarid_estructuraProcesoGeneraRoles,true,"id_estructuraProcesoGeneraRoles","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoGeneraRolesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoGeneraRoles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoGeneraRoles,ProcesoGeneraRolesConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.procesogenerarolesConstantesFunciones.mostrarid_empleadoProcesoGeneraRoles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoGeneraRolesConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.procesogenerarolesConstantesFunciones.resaltarid_empleadoProcesoGeneraRoles,this,this.procesogenerarolesConstantesFunciones.activarid_empleadoProcesoGeneraRoles));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.procesogenerarolesConstantesFunciones.resaltarid_empleadoProcesoGeneraRoles,this,this.procesogenerarolesConstantesFunciones.activarid_empleadoProcesoGeneraRoles,true,"id_empleadoProcesoGeneraRoles","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoGeneraRolesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesogenerarolesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesogenerarolesSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesogenerarolesSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoGeneraRoles.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesogenerarolesSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesogenerarolesSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoGeneraRoles.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoGeneraRoles && this.isPermisoGuardarCambiosProcesoGeneraRoles) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesogenerarolesSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesogenerarolesSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoGeneraRoles.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoGeneraRoles.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoGeneraRoles && this.isPermisoGuardarCambiosProcesoGeneraRoles) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoGeneraRoles && this.isPermisoGuardarCambiosProcesoGeneraRoles) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoGeneraRoles.moveColumn(this.jTableDatosProcesoGeneraRoles.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoGeneraRoles.moveColumn(this.jTableDatosProcesoGeneraRoles.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoGeneraRoles.moveColumn(this.jTableDatosProcesoGeneraRoles.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoGeneraRoles.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoGeneraRoles.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoGeneraRoles,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoGeneraRoles.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoGeneraRoles.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoGeneraRoles.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoGeneraRoles.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoGeneraRoles.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesogenerarolesLogic.getProcesoGeneraRoless().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesogeneraroless.size()-1;
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
		//this.jTableDatosProcesoGeneraRoles.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoGeneraRoles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoGeneraRoles();
			
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
				
				//this.isEsNuevoProcesoGeneraRoles=false;
					
				ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
			
				if(this.procesogenerarolesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoGeneraRoles==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoGeneraRoles.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoGeneraRoles.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogeneraroless.toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesogeneraroles.getsType().equals("DUPLICADO")
				   || this.procesogeneraroles.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoGeneraRoles=true;
				
				} else {
					this.isEsNuevoProcesoGeneraRoles=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {
					if(this.procesogeneraroles.getId()>=0 && !this.procesogeneraroles.getIsNew()) {						
						this.isEsNuevoProcesoGeneraRoles=false;
						
					} else {
						this.isEsNuevoProcesoGeneraRoles=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoGeneraRoles(esRelaciones);						
				
				this.seleccionarProcesoGeneraRoles(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesogeneraroles.getId()<0) {
					this.isEsNuevoProcesoGeneraRoles=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoGeneraRoles(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoGeneraRoles(evt,rowIndex);
				}	
				
				if(this.procesogenerarolesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoGeneraRoles: " + this.dDif); 
					}
				}								
				
				ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoGeneraRoles(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesogeneraroles)) {
					if(this.procesogeneraroles.getId()>0) {
						this.procesogeneraroles.setIsDeleted(true);
						
						this.procesogenerarolessEliminados.add(this.procesogeneraroles);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesogenerarolesLogic.getProcesoGeneraRoless().remove(this.procesogeneraroles);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesogeneraroless.remove(this.procesogeneraroles);				
					}
					
					
					((ProcesoGeneraRolesModel) this.jTableDatosProcesoGeneraRoles.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoGeneraRoles(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoGeneraRoles(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoGeneraRoles) {
			
			if(this.jInternalFrameDetalleFormProcesoGeneraRoles==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoGeneraRoles.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoGeneraRoles.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogeneraroless.toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoGeneraRoles(this.procesogeneraroles);
				}
				
				//ARCHITECTURE
				try {
					

					//Mes
					if(!this.procesogenerarolesConstantesFunciones.cargarid_mesProcesoGeneraRoles || this.procesogenerarolesConstantesFunciones.event_dependid_mesProcesoGeneraRoles) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.procesogeneraroles.getid_mes());
									//this.inicializarActualizarBindingProcesoGeneraRoles(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(procesogeneraroles.getMes()!=null) {
							this.messForeignKey.add(procesogeneraroles.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.procesogeneraroles.getid_mes(),false,"Formulario");

					//Estructura
					if(!this.procesogenerarolesConstantesFunciones.cargarid_estructuraProcesoGeneraRoles || this.procesogenerarolesConstantesFunciones.event_dependid_estructuraProcesoGeneraRoles) {
						//this.cargarCombosEstructurasForeignKeyLista(" where id="+this.procesogeneraroles.getid_estructura());
									//this.inicializarActualizarBindingProcesoGeneraRoles(false,false);
						this.estructurasForeignKey=new ArrayList<Estructura>();

						if(procesogeneraroles.getEstructura()!=null) {
							this.estructurasForeignKey.add(procesogeneraroles.getEstructura());
						}

						this.addItemDefectoCombosForeignKeyEstructura();
						this.cargarCombosFrameEstructurasForeignKey("Todos");
					}
					this.setActualEstructuraForeignKey(this.procesogeneraroles.getid_estructura(),false,"Formulario");

					//Empleado
					if(!this.procesogenerarolesConstantesFunciones.cargarid_empleadoProcesoGeneraRoles || this.procesogenerarolesConstantesFunciones.event_dependid_empleadoProcesoGeneraRoles) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.procesogeneraroles.getid_empleado());
									//this.inicializarActualizarBindingProcesoGeneraRoles(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(procesogeneraroles.getEmpleado()!=null) {
							this.empleadosForeignKey.add(procesogeneraroles.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.procesogeneraroles.getid_empleado(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoGeneraRoles("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoGeneraRoles(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoGeneraRoles() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoGeneraRoles(ProcesoGeneraRoles procesogeneraroles) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoGeneraRoles(procesogeneraroles,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoGeneraRoles(ProcesoGeneraRoles procesogeneraroles,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoGeneraRoles(procesogeneraroles);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoGeneraRoles(procesogeneraroles,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoGeneraRoles(procesogeneraroles);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoGeneraRoles(ProcesoGeneraRoles procesogeneraroles) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoGeneraRoles==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jLabelidProcesoGeneraRoles.setText(procesogeneraroles.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoGeneraRoles procesogenerarolesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesogenerarolesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoGeneraRoles procesogenerarolesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesogenerarolesLocal=this.procesogeneraroles;
			} else {
				procesogenerarolesLocal=this.procesogenerarolesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesogenerarolesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoGeneraRoles(procesogenerarolesLocal,true);
					
					if(procesogenerarolesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesogenerarolesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesogenerarolesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoGeneraRoles(ProcesoGeneraRoles procesogeneraroles,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoGeneraRoles(procesogeneraroles,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraRoles(procesogeneraroles);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoGeneraRoles(ProcesoGeneraRoles procesogeneraroles,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoGeneraRoles(procesogeneraroles,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoGeneraRoles(ProcesoGeneraRoles procesogeneraroles,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoGeneraRoles==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoGeneraRoles.jLabelidProcesoGeneraRoles.getText()==null || this.jInternalFrameDetalleFormProcesoGeneraRoles.jLabelidProcesoGeneraRoles.getText()=="" || this.jInternalFrameDetalleFormProcesoGeneraRoles.jLabelidProcesoGeneraRoles.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoGeneraRoles.jLabelidProcesoGeneraRoles.setText("0");
			}

			if(conColumnasBase) {procesogeneraroles.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoGeneraRoles.jLabelidProcesoGeneraRoles.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoGeneraRolesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGeneraRoles.jLabelIdProcesoGeneraRoles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoGeneraRoles(ProcesoGeneraRoles procesogenerarolesBean,ProcesoGeneraRoles procesogeneraroles,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoGeneraRoles(ProcesoGeneraRoles procesogenerarolesOrigen,ProcesoGeneraRoles procesogeneraroles,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesogenerarolesOrigen.getId()!=null && !procesogenerarolesOrigen.getId().equals(0L))) {procesogeneraroles.setId(procesogenerarolesOrigen.getId());}}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoGeneraRoles(ProcesoGeneraRoles procesogeneraroles) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jLabelidProcesoGeneraRoles.setText(procesogeneraroles.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoGeneraRoles(ProcesoGeneraRolesBean procesogenerarolesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jLabelidProcesoGeneraRoles.setText(procesogenerarolesBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoGeneraRoles(ProcesoGeneraRolesParameterReturnGeneral procesogenerarolesReturnGeneral,ProcesoGeneraRolesBean procesogenerarolesBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoGeneraRoles procesogenerarolesLocal=new ProcesoGeneraRoles();
			
			procesogenerarolesLocal=procesogenerarolesReturnGeneral.getProcesoGeneraRoles();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesogenerarolesLocal.getId()!=null && !procesogenerarolesLocal.getId().equals(0L))) {procesogenerarolesBean.setId(procesogenerarolesLocal.getId());}}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoGeneraRolesGenerico(Long idProcesoGeneraRolesSeleccionado,JComboBox jComboBoxProcesoGeneraRoles,List<ProcesoGeneraRoles> procesogenerarolessLocal)throws Exception {
		try {
			ProcesoGeneraRoles  procesogenerarolesTemp=null;

			for(ProcesoGeneraRoles procesogenerarolesAux:procesogenerarolessLocal) {
				if(procesogenerarolesAux.getId()!=null && procesogenerarolesAux.getId().equals(idProcesoGeneraRolesSeleccionado)) {
					procesogenerarolesTemp=procesogenerarolesAux;
					break;
				}
			}

			jComboBoxProcesoGeneraRoles.setSelectedItem(procesogenerarolesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoGeneraRolesGenerico(JComboBox jComboBoxProcesoGeneraRoles,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoGeneraRoles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoGeneraRoles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoGeneraRoles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoGeneraRoles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoGeneraRoles.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoGeneraRoles.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoGeneraRoles.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoGeneraRoles.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoGeneraRoles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoGeneraRoles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesogeneraroles=(ProcesoGeneraRoles) procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesogeneraroles =(ProcesoGeneraRoles) procesogeneraroless.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!procesogeneraroles.getIsNew() && !procesogeneraroles.getIsChanged() && !procesogeneraroles.getIsDeleted()) {
				sDescripcion=procesogeneraroles.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=procesogeneraroles.getmes_descripcion();
			}
		}

		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!procesogeneraroles.getIsNew() && !procesogeneraroles.getIsChanged() && !procesogeneraroles.getIsDeleted()) {
				sDescripcion=procesogeneraroles.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=procesogeneraroles.getestructura_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!procesogeneraroles.getIsNew() && !procesogeneraroles.getIsChanged() && !procesogeneraroles.getIsDeleted()) {
				sDescripcion=procesogeneraroles.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=procesogeneraroles.getempleado_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoGeneraRoles procesogenerarolesRow=new ProcesoGeneraRoles();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesogenerarolesRow=(ProcesoGeneraRoles) procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesogenerarolesRow=(ProcesoGeneraRoles) procesogeneraroless.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoGeneraRoles(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaNuevoProcesoGeneraRoles && this.isPermisoNuevoProcesoGeneraRoles));			
			this.jButtonDuplicarProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaDuplicarProcesoGeneraRoles && this.isPermisoDuplicarProcesoGeneraRoles));			
			this.jButtonCopiarProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaCopiarProcesoGeneraRoles && this.isPermisoCopiarProcesoGeneraRoles));
			this.jButtonVerFormProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaVerFormProcesoGeneraRoles && this.isPermisoVerFormProcesoGeneraRoles));
			
			this.jButtonAbrirOrderByProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaOrdenProcesoGeneraRoles && this.isPermisoOrdenProcesoGeneraRoles));			
			
			this.jButtonNuevoRelacionesProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraRoles && this.isPermisoNuevoProcesoGeneraRoles));			
			this.jButtonNuevoGuardarCambiosProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaNuevoProcesoGeneraRoles && this.isPermisoNuevoProcesoGeneraRoles && this.isPermisoGuardarCambiosProcesoGeneraRoles));
			
			if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonModificarProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaModificarProcesoGeneraRoles && this.isPermisoActualizarProcesoGeneraRoles));	
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonActualizarProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaActualizarProcesoGeneraRoles && this.isPermisoActualizarProcesoGeneraRoles));	
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonEliminarProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaEliminarProcesoGeneraRoles && this.isPermisoEliminarProcesoGeneraRoles));
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonCancelarProcesoGeneraRoles.setVisible(this.isVisibilidadCeldaCancelarProcesoGeneraRoles);							
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonGuardarCambiosProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaGuardarProcesoGeneraRoles && this.isPermisoGuardarCambiosProcesoGeneraRoles));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoGeneraRoles && this.isPermisoGuardarCambiosProcesoGeneraRoles));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaNuevoProcesoGeneraRoles && this.isPermisoNuevoProcesoGeneraRoles));						
			this.jButtonDuplicarToolBarProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaDuplicarProcesoGeneraRoles && this.isPermisoDuplicarProcesoGeneraRoles));						
			this.jButtonCopiarToolBarProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaCopiarProcesoGeneraRoles && this.isPermisoCopiarProcesoGeneraRoles));			
			this.jButtonVerFormToolBarProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaVerFormProcesoGeneraRoles && this.isPermisoVerFormProcesoGeneraRoles));			
			this.jButtonAbrirOrderByToolBarProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaOrdenProcesoGeneraRoles && this.isPermisoOrdenProcesoGeneraRoles));
			this.jButtonNuevoRelacionesToolBarProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraRoles && this.isPermisoNuevoProcesoGeneraRoles));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaNuevoProcesoGeneraRoles && this.isPermisoNuevoProcesoGeneraRoles && this.isPermisoGuardarCambiosProcesoGeneraRoles));			
			
			if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonModificarToolBarProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaModificarProcesoGeneraRoles && this.isPermisoActualizarProcesoGeneraRoles));	
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonActualizarToolBarProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaActualizarProcesoGeneraRoles  && this.isPermisoActualizarProcesoGeneraRoles));	
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonEliminarToolBarProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaEliminarProcesoGeneraRoles && this.isPermisoEliminarProcesoGeneraRoles));
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonCancelarToolBarProcesoGeneraRoles.setVisible(this.isVisibilidadCeldaCancelarProcesoGeneraRoles);				
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonGuardarCambiosToolBarProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaGuardarProcesoGeneraRoles && this.isPermisoGuardarCambiosProcesoGeneraRoles));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoGeneraRoles && this.isPermisoGuardarCambiosProcesoGeneraRoles));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaNuevoProcesoGeneraRoles && this.isPermisoNuevoProcesoGeneraRoles));			
			this.jMenuItemDuplicarProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaDuplicarProcesoGeneraRoles && this.isPermisoDuplicarProcesoGeneraRoles));			
			this.jMenuItemCopiarProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaCopiarProcesoGeneraRoles && this.isPermisoCopiarProcesoGeneraRoles));			
			this.jMenuItemVerFormProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaVerFormProcesoGeneraRoles && this.isPermisoVerFormProcesoGeneraRoles));			
			this.jMenuItemAbrirOrderByProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaOrdenProcesoGeneraRoles && this.isPermisoOrdenProcesoGeneraRoles));			
			//this.jMenuItemMostrarOcultarProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaOrdenProcesoGeneraRoles && this.isPermisoOrdenProcesoGeneraRoles));
			this.jMenuItemDetalleAbrirOrderByProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaOrdenProcesoGeneraRoles && this.isPermisoOrdenProcesoGeneraRoles));			
			//this.jMenuItemDetalleMostrarOcultarProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaOrdenProcesoGeneraRoles && this.isPermisoOrdenProcesoGeneraRoles));			
			this.jMenuItemNuevoRelacionesProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraRoles && this.isPermisoNuevoProcesoGeneraRoles));			
			this.jMenuItemNuevoGuardarCambiosProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaNuevoProcesoGeneraRoles && this.isPermisoNuevoProcesoGeneraRoles && this.isPermisoGuardarCambiosProcesoGeneraRoles));									
			
			if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jMenuItemModificarProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaModificarProcesoGeneraRoles && this.isPermisoActualizarProcesoGeneraRoles));	
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jMenuItemActualizarProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaActualizarProcesoGeneraRoles && this.isPermisoActualizarProcesoGeneraRoles));	
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jMenuItemEliminarProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaEliminarProcesoGeneraRoles && this.isPermisoEliminarProcesoGeneraRoles));
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jMenuItemCancelarProcesoGeneraRoles.setVisible(this.isVisibilidadCeldaCancelarProcesoGeneraRoles);				
			}
			
			this.jMenuItemGuardarCambiosProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaGuardarProcesoGeneraRoles && this.isPermisoGuardarCambiosProcesoGeneraRoles));						
			this.jMenuItemGuardarCambiosTablaProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoGeneraRoles && this.isPermisoGuardarCambiosProcesoGeneraRoles));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoGeneraRoles=this.jButtonNuevoProcesoGeneraRoles.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoGeneraRoles=this.jButtonDuplicarProcesoGeneraRoles.isVisible();
			this.isVisibilidadCeldaCopiarProcesoGeneraRoles=this.jButtonCopiarProcesoGeneraRoles.isVisible();
			this.isVisibilidadCeldaVerFormProcesoGeneraRoles=this.jButtonVerFormProcesoGeneraRoles.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoGeneraRoles=this.jButtonAbrirOrderByProcesoGeneraRoles.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraRoles=this.jButtonNuevoRelacionesProcesoGeneraRoles.isVisible();
			this.isVisibilidadCeldaModificarProcesoGeneraRoles=this.jButtonModificarProcesoGeneraRoles.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
			this.isVisibilidadCeldaActualizarProcesoGeneraRoles=this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonActualizarProcesoGeneraRoles.isVisible();
			this.isVisibilidadCeldaEliminarProcesoGeneraRoles=this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonEliminarProcesoGeneraRoles.isVisible();
			this.isVisibilidadCeldaCancelarProcesoGeneraRoles=this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonCancelarProcesoGeneraRoles.isVisible();
			this.isVisibilidadCeldaGuardarProcesoGeneraRoles=this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonGuardarCambiosProcesoGeneraRoles.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoGeneraRoles=this.jButtonGuardarCambiosTablaProcesoGeneraRoles.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoGeneraRoles=this.jButtonNuevoToolBarProcesoGeneraRoles.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraRoles=this.jButtonNuevoRelacionesToolBarProcesoGeneraRoles.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
			this.isVisibilidadCeldaModificarProcesoGeneraRoles=this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonModificarToolBarProcesoGeneraRoles.isVisible();
			this.isVisibilidadCeldaActualizarProcesoGeneraRoles=this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonActualizarToolBarProcesoGeneraRoles.isVisible();
			this.isVisibilidadCeldaEliminarProcesoGeneraRoles=this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonEliminarToolBarProcesoGeneraRoles.isVisible();
			this.isVisibilidadCeldaCancelarProcesoGeneraRoles=this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonCancelarToolBarProcesoGeneraRoles.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoGeneraRoles=this.jButtonGuardarCambiosToolBarProcesoGeneraRoles.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoGeneraRoles=this.jButtonGuardarCambiosTablaToolBarProcesoGeneraRoles.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoGeneraRoles=this.jMenuItemNuevoProcesoGeneraRoles.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraRoles=this.jMenuItemNuevoRelacionesProcesoGeneraRoles.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
			this.isVisibilidadCeldaModificarProcesoGeneraRoles=this.jInternalFrameDetalleFormProcesoGeneraRoles.jMenuItemModificarProcesoGeneraRoles.isVisible();
			this.isVisibilidadCeldaActualizarProcesoGeneraRoles=this.jInternalFrameDetalleFormProcesoGeneraRoles.jMenuItemActualizarProcesoGeneraRoles.isVisible();
			this.isVisibilidadCeldaEliminarProcesoGeneraRoles=this.jInternalFrameDetalleFormProcesoGeneraRoles.jMenuItemEliminarProcesoGeneraRoles.isVisible();
			this.isVisibilidadCeldaCancelarProcesoGeneraRoles=this.jInternalFrameDetalleFormProcesoGeneraRoles.jMenuItemCancelarProcesoGeneraRoles.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoGeneraRoles=this.jMenuItemGuardarCambiosProcesoGeneraRoles.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoGeneraRoles=this.jMenuItemGuardarCambiosTablaProcesoGeneraRoles.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoGeneraRoles(Boolean esInicializar) {
		if(ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesogenerarolesSessionBean.getConGuardarRelaciones()) {
				//if(this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoGeneraRoles();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoGeneraRoles(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoGeneraRoles() {
		this.jButtonNuevoProcesoGeneraRoles.setVisible(this.isPermisoNuevoProcesoGeneraRoles);			
		this.jButtonDuplicarProcesoGeneraRoles.setVisible(this.isPermisoDuplicarProcesoGeneraRoles);			
		this.jButtonCopiarProcesoGeneraRoles.setVisible(this.isPermisoCopiarProcesoGeneraRoles);			
		this.jButtonVerFormProcesoGeneraRoles.setVisible(this.isPermisoVerFormProcesoGeneraRoles);			
		
		this.jButtonAbrirOrderByProcesoGeneraRoles.setVisible(this.isPermisoOrdenProcesoGeneraRoles);					
		
		this.jButtonNuevoRelacionesProcesoGeneraRoles.setVisible(this.isPermisoNuevoProcesoGeneraRoles);			
		
		if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonModificarProcesoGeneraRoles.setVisible(this.isPermisoActualizarProcesoGeneraRoles);	
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonActualizarProcesoGeneraRoles.setVisible(this.isPermisoActualizarProcesoGeneraRoles);	
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonEliminarProcesoGeneraRoles.setVisible(this.isPermisoEliminarProcesoGeneraRoles);
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonCancelarProcesoGeneraRoles.setVisible(this.isVisibilidadCeldaCancelarProcesoGeneraRoles);						
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonGuardarCambiosProcesoGeneraRoles.setVisible(this.isPermisoGuardarCambiosProcesoGeneraRoles);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoGeneraRoles.setVisible(this.isPermisoActualizarProcesoGeneraRoles);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoGeneraRoles() {
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonModificarProcesoGeneraRoles.setVisible(this.isPermisoActualizarProcesoGeneraRoles);	
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonActualizarProcesoGeneraRoles.setVisible(this.isPermisoActualizarProcesoGeneraRoles);	
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonEliminarProcesoGeneraRoles.setVisible(this.isPermisoEliminarProcesoGeneraRoles);
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonCancelarProcesoGeneraRoles.setVisible(this.isVisibilidadCeldaCancelarProcesoGeneraRoles);							
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonGuardarCambiosProcesoGeneraRoles.setVisible((this.isVisibilidadCeldaGuardarProcesoGeneraRoles && this.isPermisoGuardarCambiosProcesoGeneraRoles));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoGeneraRoles() {
		if(ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoGeneraRoles();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoGeneraRoles() {
	}
	
	public void jTableDatosProcesoGeneraRolesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoGeneraRoles(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoGeneraRolesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarolesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGeneraRoles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoGeneraRoles(this.getprocesogeneraroles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraRoles(this.procesogeneraroles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogeneraroless.toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesogeneraroles==null) {
						this.procesogeneraroles = new ProcesoGeneraRoles();
					}

					this.setVariablesFormularioToObjetoActualProcesoGeneraRoles(this.procesogeneraroles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraRoles(this.procesogeneraroles);
				}

				if(this.procesogeneraroles.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesogeneraroles.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoGeneraRoles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarolesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarolesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarolesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesProcesoGeneraRolesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebProcesoGeneraRoles(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGeneraRoles.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoGeneraRoles.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoGeneraRoles.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogeneraroless.toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoGeneraRoles(this.getprocesogeneraroles(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraRoles(this.procesogeneraroles);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.procesogenerarolesLogic.getConnexion());

				if(this.procesogeneraroles.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.procesogeneraroles.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoGeneraRoles=(TitledBorder)this.jScrollPanelDatosProcesoGeneraRoles.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderProcesoGeneraRoles.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesProcesoGeneraRolesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarolesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGeneraRoles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoGeneraRoles(this.getprocesogeneraroles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraRoles(this.procesogeneraroles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogeneraroless.toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesogeneraroles==null) {
						this.procesogeneraroles = new ProcesoGeneraRoles();
					}

					this.setVariablesFormularioToObjetoActualProcesoGeneraRoles(this.procesogeneraroles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraRoles(this.procesogeneraroles);
				}

				if(this.procesogeneraroles.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.procesogeneraroles.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoGeneraRoles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarolesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarolesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarolesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraProcesoGeneraRolesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebProcesoGeneraRoles(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGeneraRoles.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoGeneraRoles.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoGeneraRoles.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogeneraroless.toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoGeneraRoles(this.getprocesogeneraroles(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraRoles(this.procesogeneraroles);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.procesogenerarolesLogic.getConnexion());

				if(this.procesogeneraroles.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.procesogeneraroles.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoGeneraRoles=(TitledBorder)this.jScrollPanelDatosProcesoGeneraRoles.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderProcesoGeneraRoles.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraProcesoGeneraRolesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarolesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGeneraRoles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoGeneraRoles(this.getprocesogeneraroles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraRoles(this.procesogeneraroles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogeneraroless.toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesogeneraroles==null) {
						this.procesogeneraroles = new ProcesoGeneraRoles();
					}

					this.setVariablesFormularioToObjetoActualProcesoGeneraRoles(this.procesogeneraroles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraRoles(this.procesogeneraroles);
				}

				if(this.procesogeneraroles.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.procesogeneraroles.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoGeneraRoles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarolesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarolesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarolesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoProcesoGeneraRolesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebProcesoGeneraRoles(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGeneraRoles.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoGeneraRoles.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoGeneraRoles.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogeneraroless.toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoGeneraRoles(this.getprocesogeneraroles(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraRoles(this.procesogeneraroles);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.procesogenerarolesLogic.getConnexion());

				if(this.procesogeneraroles.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.procesogeneraroles.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoGeneraRoles=(TitledBorder)this.jScrollPanelDatosProcesoGeneraRoles.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderProcesoGeneraRoles.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoProcesoGeneraRolesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarolesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGeneraRoles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoGeneraRoles(this.getprocesogeneraroles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraRoles(this.procesogeneraroles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogeneraroless.toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesogeneraroles==null) {
						this.procesogeneraroles = new ProcesoGeneraRoles();
					}

					this.setVariablesFormularioToObjetoActualProcesoGeneraRoles(this.procesogeneraroles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraRoles(this.procesogeneraroles);
				}

				if(this.procesogeneraroles.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.procesogeneraroles.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoGeneraRoles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarolesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarolesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarolesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoGeneraRolesProcesoGeneraRolesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoGeneraRoles(false,false);

			this.getProcesoGeneraRolessBusquedaProcesoGeneraRoles();

			this.inicializarActualizarBindingProcesoGeneraRoles(false);

			//if(ProcesoGeneraRolesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoGeneraRoles(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoProcesoGeneraRolesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoGeneraRoles(false,false);

			this.getProcesoGeneraRolessFK_IdEmpleado();

			this.inicializarActualizarBindingProcesoGeneraRoles(false);

			//if(ProcesoGeneraRolesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoGeneraRoles(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraProcesoGeneraRolesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoGeneraRoles(false,false);

			this.getProcesoGeneraRolessFK_IdEstructura();

			this.inicializarActualizarBindingProcesoGeneraRoles(false);

			//if(ProcesoGeneraRolesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoGeneraRoles(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesProcesoGeneraRolesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoGeneraRoles(false,false);

			this.getProcesoGeneraRolessFK_IdMes();

			this.inicializarActualizarBindingProcesoGeneraRoles(false);

			//if(ProcesoGeneraRolesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoGeneraRoles(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarolesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoGeneraRoles() {
		if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
			this.jInternalFrameDetalleFormProcesoGeneraRoles.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoGeneraRoles.dispose();
			this.jInternalFrameDetalleFormProcesoGeneraRoles=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoGeneraRoles!=null) {
			this.jInternalFrameReporteDinamicoProcesoGeneraRoles.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoGeneraRoles.dispose();
			this.jInternalFrameReporteDinamicoProcesoGeneraRoles=null;
		}
		
		if(this.jInternalFrameImportacionProcesoGeneraRoles!=null) {
			this.jInternalFrameImportacionProcesoGeneraRoles.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoGeneraRoles.dispose();
			this.jInternalFrameImportacionProcesoGeneraRoles=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoGeneraRoles();
			
			ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoGeneraRoles")) {
				jButtonNuevoProcesoGeneraRolesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoGeneraRoles")) {
				jButtonDuplicarProcesoGeneraRolesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoGeneraRoles")) {
				jButtonCopiarProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoGeneraRoles")) {
				jButtonVerFormProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoGeneraRoles")) {
				jButtonNuevoProcesoGeneraRolesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoGeneraRoles")) {
				jButtonDuplicarProcesoGeneraRolesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoGeneraRoles")) {
				jButtonNuevoProcesoGeneraRolesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoGeneraRoles")) {
				jButtonDuplicarProcesoGeneraRolesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoGeneraRoles")) {
				jButtonNuevoProcesoGeneraRolesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoGeneraRoles")) {
				jButtonNuevoProcesoGeneraRolesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoGeneraRoles")) {
				jButtonNuevoProcesoGeneraRolesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoGeneraRoles")) {
				jButtonModificarProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoGeneraRoles")) {
				jButtonModificarProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoGeneraRoles")) {
				jButtonModificarProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoGeneraRoles")) {
				jButtonActualizarProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoGeneraRoles")) {
				jButtonActualizarProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoGeneraRoles")) {
				jButtonActualizarProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoGeneraRoles")) {
				jButtonEliminarProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoGeneraRoles")) {
				jButtonEliminarProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoGeneraRoles")) {
				jButtonEliminarProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoGeneraRoles")) {
				jButtonCancelarProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoGeneraRoles")) {
				jButtonCancelarProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoGeneraRoles")) {
				jButtonCancelarProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoGeneraRoles")) {
				jButtonCerrarProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoGeneraRoles")) {
				jButtonCerrarProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoGeneraRoles")) {
				jButtonCerrarProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoGeneraRoles")) {
				jButtonMostrarOcultarProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoGeneraRoles")) {
				jButtonCancelarProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoGeneraRoles")) {
				jButtonGuardarCambiosProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoGeneraRoles")) {
				jButtonGuardarCambiosProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoGeneraRoles")) {
				jButtonCopiarProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoGeneraRoles")) {
				jButtonVerFormProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoGeneraRoles")) {
				jButtonGuardarCambiosProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoGeneraRoles")) {
				jButtonCopiarProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoGeneraRoles")) {
				jButtonVerFormProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoGeneraRoles")) {
				jButtonGuardarCambiosProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoGeneraRoles")) {
				jButtonGuardarCambiosProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoGeneraRoles")) {
				jButtonGuardarCambiosProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoGeneraRoles")) {
				jButtonRecargarInformacionProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoGeneraRoles")) {
				jButtonRecargarInformacionProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoGeneraRoles")) {
				jButtonRecargarInformacionProcesoGeneraRolesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoGeneraRoles")) {
				jButtonAnterioresProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoGeneraRoles")) {
				jButtonAnterioresProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoGeneraRoles")) {
				jButtonAnterioresProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoGeneraRoles")) {
				jButtonSiguientesProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoGeneraRoles")) {
				jButtonSiguientesProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoGeneraRoles")) {
				jButtonSiguientesProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoGeneraRoles") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoGeneraRoles")) {
				jButtonAbrirOrderByProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoGeneraRoles") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoGeneraRoles")) {
				jButtonMostrarOcultarProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoGeneraRoles")) {
				jButtonNuevoGuardarCambiosProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoGeneraRoles")) {
				jButtonNuevoGuardarCambiosProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoGeneraRoles")) {
				jButtonNuevoGuardarCambiosProcesoGeneraRolesActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionProcesoGeneraRoles")) {
				jButtonProcesarInformacionProcesoGeneraRolesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoGeneraRoles")) {
				jButtonCerrarReporteDinamicoProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoGeneraRoles")) {
				jButtonGenerarReporteDinamicoProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoGeneraRoles")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoGeneraRolesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoGeneraRoles")) {
				jButtonCerrarImportacionProcesoGeneraRolesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoGeneraRoles")) {
				
				jButtonGenerarImportacionProcesoGeneraRolesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoGeneraRoles")) {
				
				jButtonAbrirImportacionProcesoGeneraRolesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoGeneraRoles")) {
				jComboBoxTiposAccionesProcesoGeneraRolesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoGeneraRoles")) {
				jComboBoxTiposRelacionesProcesoGeneraRolesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoGeneraRoles")) {
				jComboBoxTiposAccionesProcesoGeneraRolesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoGeneraRoles")) {
				
				jComboBoxTiposSeleccionarProcesoGeneraRolesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoGeneraRoles")) {
				jTextFieldValorCampoGeneralProcesoGeneraRolesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoGeneraRoles")) {
				jButtonAbrirOrderByProcesoGeneraRolesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoGeneraRoles")) {
				jButtonAbrirOrderByProcesoGeneraRolesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoGeneraRoles")) {
				jButtonCerrarOrderByProcesoGeneraRolesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoGeneraRolesBusqueda")) {
				this.jButtonidProcesoGeneraRolesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesProcesoGeneraRolesUpdate")) {
				this.jButtonid_mesProcesoGeneraRolesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesProcesoGeneraRolesBusqueda")) {
				this.jButtonid_mesProcesoGeneraRolesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraProcesoGeneraRolesUpdate")) {
				this.jButtonid_estructuraProcesoGeneraRolesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraProcesoGeneraRolesBusqueda")) {
				this.jButtonid_estructuraProcesoGeneraRolesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoProcesoGeneraRolesUpdate")) {
				this.jButtonid_empleadoProcesoGeneraRolesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoProcesoGeneraRolesBusqueda")) {
				this.jButtonid_empleadoProcesoGeneraRolesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoGeneraRolesProcesoGeneraRoles")) {
				this.jButtonBusquedaProcesoGeneraRolesProcesoGeneraRolesActionPerformed(evt);
			}
			
			;
			
			
			ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoGeneraRoles();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoGeneraRolesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneraroles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogeneraroles);
				
				ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
				
				


				
				ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGeneraRoles.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGeneraRoles.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoGeneraRoles procesogenerarolesLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesogenerarolesLocal=this.procesogeneraroles;
			} else {
				procesogenerarolesLocal=this.procesogenerarolesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneraroles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogeneraroles);
				
				ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
							
				
				


				
				ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGeneraRoles.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGeneraRoles.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoGeneraRolesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoGeneraRoles.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarolesAnterior =(ProcesoGeneraRoles) this.procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesogenerarolesAnterior =(ProcesoGeneraRoles) this.procesogeneraroless.toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
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
			
			ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
			
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
			
			


			
			ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoGeneraRolesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneraroles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogeneraroles);
				
				ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
								
						
				


				
				ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGeneraRoles.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGeneraRoles.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneraroles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogeneraroles);
				
				ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
								
				
				


				
				ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGeneraRoles.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGeneraRoles.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoGeneraRolesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoGeneraRoles.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarolesAnterior =(ProcesoGeneraRoles) this.procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesogenerarolesAnterior =(ProcesoGeneraRoles) this.procesogeneraroless.toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneraroles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogeneraroles);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoGeneraRolesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoGeneraRoles.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarolesAnterior =(ProcesoGeneraRoles) this.procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesogenerarolesAnterior =(ProcesoGeneraRoles) this.procesogeneraroless.toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoGeneraRolesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneraroles);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesogeneraroles);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneraroles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogeneraroles);
				
				ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
							
				
				


				
				ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGeneraRoles.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGeneraRoles.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoGeneraRolesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoGeneraRoles.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesogenerarolesAnterior =(ProcesoGeneraRoles) this.procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesogenerarolesAnterior =(ProcesoGeneraRoles) this.procesogeneraroless.toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
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
			
			ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
			
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
			
			


			
			ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoGeneraRolesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneraroles);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesogeneraroles);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneraroles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogeneraroles);
				
				ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
								
				
				


				
				ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGeneraRoles.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGeneraRoles.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoGeneraRolesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoGeneraRoles.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarolesAnterior =(ProcesoGeneraRoles) this.procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesogenerarolesAnterior =(ProcesoGeneraRoles) this.procesogeneraroless.toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoGeneraRolesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneraroles);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesogeneraroles);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoGeneraRolesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneraroles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogeneraroles);
				
				ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoGeneraRoles")) {
					jCheckBoxSeleccionarTodosProcesoGeneraRolesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoGeneraRoles")) {
					jCheckBoxSeleccionadosProcesoGeneraRolesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoGeneraRoles")) {
					
				}
				
				


				
				
				ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGeneraRoles.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGeneraRoles.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneraroles);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesogeneraroles);
				
				ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
												
				
				


				
				
				ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGeneraRoles.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGeneraRoles.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoGeneraRolesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoGeneraRoles.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesogenerarolesAnterior =(ProcesoGeneraRoles) this.procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesogenerarolesAnterior =(ProcesoGeneraRoles) this.procesogeneraroless.toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoGeneraRolesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneraroles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogeneraroles);
				
				ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
				
				
				ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
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
			
			ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
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
			
			


			
			ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoGeneraRolesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneraroles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogeneraroles);
				
				ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGeneraRoles.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGeneraRoles.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneraroles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogeneraroles);
				
				ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
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
				
				


				
				ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGeneraRoles.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGeneraRoles.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoGeneraRolesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoGeneraRoles.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarolesAnterior =(ProcesoGeneraRoles) this.procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesogenerarolesAnterior =(ProcesoGeneraRoles) this.procesogeneraroless.toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoGeneraRoles")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoGeneraRolesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoGeneraRoles.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesogeneraroles =(ProcesoGeneraRoles) this.procesogeneraroless.toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesogeneraroles);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoGeneraRoles")) {
				
				}
				
				ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoGeneraRoles")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoGeneraRoles.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoGeneraRoles")) {
			
			}
			
			ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoGeneraRoles();
			
			ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoGeneraRoles")) {
				jButtonNuevoProcesoGeneraRolesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoGeneraRoles")) {
				jButtonDuplicarProcesoGeneraRolesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoGeneraRoles")) {
				jButtonCopiarProcesoGeneraRolesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoGeneraRoles")) {
				jButtonVerFormProcesoGeneraRolesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoGeneraRoles")) {
				jButtonNuevoProcesoGeneraRolesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoGeneraRoles")) {
				jButtonModificarProcesoGeneraRolesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoGeneraRoles")) {
				jButtonActualizarProcesoGeneraRolesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoGeneraRoles")) {
				jButtonEliminarProcesoGeneraRolesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoGeneraRoles")) {
				jButtonGuardarCambiosProcesoGeneraRolesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoGeneraRoles")) {
				jButtonCancelarProcesoGeneraRolesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoGeneraRoles")) {
				jButtonCerrarProcesoGeneraRolesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoGeneraRoles")) {
				jButtonGuardarCambiosProcesoGeneraRolesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoGeneraRoles")) {
				jButtonNuevoGuardarCambiosProcesoGeneraRolesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoGeneraRoles")) {
				jButtonAbrirOrderByProcesoGeneraRolesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoGeneraRoles")) {
				jButtonRecargarInformacionProcesoGeneraRolesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoGeneraRoles")) {
				jButtonAnterioresProcesoGeneraRolesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoGeneraRoles")) {
				jButtonSiguientesProcesoGeneraRolesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoGeneraRolesBusqueda")) {
				this.jButtonidProcesoGeneraRolesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesProcesoGeneraRolesUpdate")) {
				this.jButtonid_mesProcesoGeneraRolesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesProcesoGeneraRolesBusqueda")) {
				this.jButtonid_mesProcesoGeneraRolesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraProcesoGeneraRolesUpdate")) {
				this.jButtonid_estructuraProcesoGeneraRolesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraProcesoGeneraRolesBusqueda")) {
				this.jButtonid_estructuraProcesoGeneraRolesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoProcesoGeneraRolesUpdate")) {
				this.jButtonid_empleadoProcesoGeneraRolesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoProcesoGeneraRolesBusqueda")) {
				this.jButtonid_empleadoProcesoGeneraRolesBusquedaActionPerformed(evt);
			}
			
			ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoGeneraRoles();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoGeneraRoles")) {
				closingInternalFrameProcesoGeneraRoles();
				
			} else if(sTipo.equals("jButtonCancelarProcesoGeneraRoles")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoGeneraRoles = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoGeneraRolesBeanSwingJInternalFrame jInternalFrameParent=(ProcesoGeneraRolesBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoGeneraRoles.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoGeneraRolesActionPerformed(null);
			}
			
			ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesogeneraroles,new Object(),this.procesogenerarolesParameterGeneral,this.procesogenerarolesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoGeneraRoles(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoGeneraRoles(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoGeneraRoles(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesogeneraroles)) {
			if(!esControlTabla) {
				if(ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoGeneraRoles(this.procesogeneraroles,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraRoles(this.procesogeneraroles);			
				}
				
				if(this.procesogenerarolesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoGeneraRoles(this.procesogeneraroles,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoGeneraRoles(this.procesogenerarolesReturnGeneral,this.procesogenerarolesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesogenerarolesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoGeneraRoles(classes,this.procesogenerarolesReturnGeneral,this.procesogenerarolesBean,false);
					}
						
					if(this.procesogenerarolesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoGeneraRoles(this.procesogenerarolesReturnGeneral.getProcesoGeneraRoles());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoGeneraRoles(this.procesogenerarolesReturnGeneral.getProcesoGeneraRoles());	
					}
						
					if(this.procesogenerarolesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoGeneraRoles(this.procesogenerarolesReturnGeneral.getProcesoGeneraRoles(),classes);//this.procesogenerarolesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoGeneraRoles(this.procesogeneraroles,classes);//this.procesogenerarolesBean);									
				}
			
				if(ProcesoGeneraRolesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoGeneraRoles(this.procesogeneraroles,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraRoles(this.procesogeneraroles);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesogenerarolesAnterior!=null) {
						this.procesogeneraroles=this.procesogenerarolesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesogenerarolesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesogenerarolesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesogenerarolesReturnGeneral.getProcesoGeneraRoles(),procesogenerarolesLogic.getProcesoGeneraRoless());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesogenerarolesReturnGeneral.getProcesoGeneraRoles(),this.procesogeneraroless);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoGeneraRoles.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoGeneraRoles.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoGeneraRoles();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoGeneraRoles() throws Exception {
		
		ProcesoGeneraRolesModel procesogenerarolesModel=(ProcesoGeneraRolesModel)this.jTableDatosProcesoGeneraRoles.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesogenerarolesModel.procesogeneraroless=this.procesogenerarolesLogic.getProcesoGeneraRoless();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesogenerarolesModel.procesogeneraroless=this.procesogeneraroless;
		}
		
		
		((ProcesoGeneraRolesModel) this.jTableDatosProcesoGeneraRoles.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoGeneraRoles() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesogenerarolesAnterior(),this.procesogenerarolesLogic.getProcesoGeneraRoless());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesogenerarolesAnterior(),this.procesogeneraroless);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoGeneraRoles();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoGeneraRoles(ProcesoGeneraRoles procesogeneraroles,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
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
										
				ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesogeneraroles,new Object(),generalEntityParameterGeneral,this.procesogenerarolesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesogenerarolesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoGeneraRolesConstantesFunciones.getClassesRelationshipsOfProcesoGeneraRoles(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoGeneraRolesConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoGeneraRoles(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoGeneraRoles(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesogeneraroles,new Object(),generalEntityParameterGeneral,this.procesogenerarolesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoGeneraRoles(ProcesoGeneraRolesBean procesogenerarolesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoGeneraRoles(ArrayList<Classe> classes,ProcesoGeneraRolesReturnGeneral procesogenerarolesReturnGeneral,ProcesoGeneraRolesBean procesogenerarolesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoGeneraRoles(ProcesoGeneraRoles procesogeneraroles,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesogeneraroles)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoGeneraRoles = new ProcesoGeneraRolesDetalleFormJInternalFrame(jDesktopPane,this.procesogenerarolesSessionBean.getConGuardarRelaciones(),this.procesogenerarolesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoGeneraRoles);
		this.jInternalFrameDetalleFormProcesoGeneraRoles.setVisible(false);
		this.jInternalFrameDetalleFormProcesoGeneraRoles.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoGeneraRoles.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoGeneraRoles.procesogenerarolesLogic=this.procesogenerarolesLogic;
		
		this.cargarCombosFrameForeignKeyProcesoGeneraRoles("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoGeneraRoles();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoGeneraRoles();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoGeneraRoles("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoGeneraRoles();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoGeneraRoles.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoGeneraRoles"));
		
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonModificarProcesoGeneraRoles.addActionListener(new ButtonActionListener(this,"ModificarProcesoGeneraRoles"));

		
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonModificarToolBarProcesoGeneraRoles.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoGeneraRoles"));
					
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jMenuItemModificarProcesoGeneraRoles.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoGeneraRoles"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonActualizarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"ActualizarProcesoGeneraRoles"));
		
		
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonActualizarToolBarProcesoGeneraRoles.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoGeneraRoles"));
						
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jMenuItemActualizarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoGeneraRoles"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonEliminarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"EliminarProcesoGeneraRoles"));
		
		
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonEliminarToolBarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoGeneraRoles"));
								
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jMenuItemEliminarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoGeneraRoles"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonCancelarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"CancelarProcesoGeneraRoles"));
		
		
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonCancelarToolBarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoGeneraRoles"));
					
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jMenuItemCancelarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoGeneraRoles"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jMenuItemDetalleCerrarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoGeneraRoles"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonGuardarCambiosToolBarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoGeneraRoles"));
		
		
		
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonGuardarCambiosToolBarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoGeneraRoles"));
		
		
		
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxTiposAccionesFormularioProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoGeneraRoles"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonidProcesoGeneraRolesBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoGeneraRolesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonid_mesProcesoGeneraRolesUpdate.addActionListener(new ButtonActionListener(this,"id_mesProcesoGeneraRolesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonid_mesProcesoGeneraRolesBusqueda.addActionListener(new ButtonActionListener(this,"id_mesProcesoGeneraRolesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonid_estructuraProcesoGeneraRolesUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraProcesoGeneraRolesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonid_estructuraProcesoGeneraRolesBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraProcesoGeneraRolesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonid_empleadoProcesoGeneraRolesUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoProcesoGeneraRolesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonid_empleadoProcesoGeneraRolesBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoProcesoGeneraRolesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jTabbedPaneRelacionesProcesoGeneraRoles.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoGeneraRoles"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoGeneraRoles"));
		
		if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGeneraRoles.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoGeneraRoles"));
		}
		
		this.jTableDatosProcesoGeneraRoles.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoGeneraRoles"));
		
		this.jTableDatosProcesoGeneraRoles.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoGeneraRoles"));
		
		this.jButtonNuevoProcesoGeneraRoles.addActionListener(new ButtonActionListener(this,"NuevoProcesoGeneraRoles"));
		
		this.jButtonDuplicarProcesoGeneraRoles.addActionListener(new ButtonActionListener(this,"DuplicarProcesoGeneraRoles"));
		
		this.jButtonCopiarProcesoGeneraRoles.addActionListener(new ButtonActionListener(this,"CopiarProcesoGeneraRoles"));
		
		this.jButtonVerFormProcesoGeneraRoles.addActionListener(new ButtonActionListener(this,"VerFormProcesoGeneraRoles"));
		
		
		this.jButtonNuevoToolBarProcesoGeneraRoles.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoGeneraRoles"));
			
		this.jButtonDuplicarToolBarProcesoGeneraRoles.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoGeneraRoles"));
			
		this.jMenuItemNuevoProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoGeneraRoles"));
			
		this.jMenuItemDuplicarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoGeneraRoles"));		
		
		
		this.jButtonNuevoRelacionesProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoGeneraRoles"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoGeneraRoles.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoGeneraRoles"));
			
		this.jMenuItemNuevoRelacionesProcesoGeneraRoles.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoGeneraRoles"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonModificarProcesoGeneraRoles.addActionListener(new ButtonActionListener(this,"ModificarProcesoGeneraRoles"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonModificarToolBarProcesoGeneraRoles.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoGeneraRoles"));
			
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jMenuItemModificarProcesoGeneraRoles.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoGeneraRoles"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonActualizarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"ActualizarProcesoGeneraRoles"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonActualizarToolBarProcesoGeneraRoles.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoGeneraRoles"));
				
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jMenuItemActualizarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoGeneraRoles"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonEliminarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"EliminarProcesoGeneraRoles"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonEliminarToolBarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoGeneraRoles"));
						
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jMenuItemEliminarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoGeneraRoles"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonCancelarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"CancelarProcesoGeneraRoles"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonCancelarToolBarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoGeneraRoles"));
			
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jMenuItemCancelarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoGeneraRoles"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoGeneraRoles"));		
		
		
		this.jButtonCerrarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"CerrarProcesoGeneraRoles"));
		
		
		this.jButtonCerrarToolBarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoGeneraRoles"));
			
		this.jMenuItemCerrarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoGeneraRoles"));
			
		if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jMenuItemDetalleCerrarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoGeneraRoles"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonGuardarCambiosProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoGeneraRoles"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonGuardarCambiosToolBarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoGeneraRoles"));
		}
		
		this.jButtonCopiarToolBarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoGeneraRoles"));
			
		this.jButtonVerFormToolBarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoGeneraRoles"));
		
		this.jMenuItemGuardarCambiosProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoGeneraRoles"));
			
		this.jMenuItemCopiarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoGeneraRoles"));		
		
		this.jMenuItemVerFormProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoGeneraRoles"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoGeneraRoles"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoGeneraRoles"));
			
		this.jMenuItemGuardarCambiosTablaProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoGeneraRoles"));		
		
		
		
		this.jButtonRecargarInformacionProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoGeneraRoles"));
					
		this.jButtonRecargarInformacionToolBarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoGeneraRoles"));
		
		this.jMenuItemRecargarInformacionProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoGeneraRoles"));		
		
		
		
		this.jButtonAnterioresProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"AnterioresProcesoGeneraRoles"));
		
		
		this.jButtonAnterioresToolBarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoGeneraRoles"));
		
		this.jMenuItemAnterioresProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoGeneraRoles"));		
		
		
		this.jButtonSiguientesProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"SiguientesProcesoGeneraRoles"));
		
		
		this.jButtonSiguientesToolBarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoGeneraRoles"));
			
		this.jMenuItemSiguientesProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoGeneraRoles"));
			
		this.jMenuItemAbrirOrderByProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoGeneraRoles"));
			
		this.jMenuItemMostrarOcultarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoGeneraRoles"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoGeneraRoles"));
			
		this.jMenuItemDetalleMostarOcultarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoGeneraRoles"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoGeneraRoles"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoGeneraRoles"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoGeneraRoles"));		
		
		
		this.jButtonProcesarInformacionProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"ProcesarInformacionProcesoGeneraRoles"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoGeneraRoles.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoGeneraRoles"));

		this.jCheckBoxSeleccionadosProcesoGeneraRoles.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoGeneraRoles"));
		
		if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxTiposAccionesFormularioProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoGeneraRoles"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoGeneraRoles"));
			
		this.jComboBoxTiposAccionesProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoGeneraRoles"));
					
		this.jComboBoxTiposSeleccionarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoGeneraRoles"));
			
		this.jTextFieldValorCampoGeneralProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoGeneraRoles"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonidProcesoGeneraRolesBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoGeneraRolesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonid_mesProcesoGeneraRolesUpdate.addActionListener(new ButtonActionListener(this,"id_mesProcesoGeneraRolesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonid_mesProcesoGeneraRolesBusqueda.addActionListener(new ButtonActionListener(this,"id_mesProcesoGeneraRolesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonid_estructuraProcesoGeneraRolesUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraProcesoGeneraRolesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonid_estructuraProcesoGeneraRolesBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraProcesoGeneraRolesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonid_empleadoProcesoGeneraRolesUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoProcesoGeneraRolesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonid_empleadoProcesoGeneraRolesBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoProcesoGeneraRolesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoGeneraRolesProcesoGeneraRoles.addActionListener(new ButtonActionListener(this,"BusquedaProcesoGeneraRolesProcesoGeneraRoles"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoGeneraRoles!=null) {
				this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoGeneraRoles"));
				this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoGeneraRoles"));
				this.jInternalFrameReporteDinamicoProcesoGeneraRoles.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoGeneraRoles"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoGeneraRoles"));				
			//this.jButtonGenerarReporteDinamicoProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoGeneraRoles"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoGeneraRoles"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoGeneraRoles!=null) {
				this.jInternalFrameImportacionProcesoGeneraRoles.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoGeneraRoles"));
				this.jInternalFrameImportacionProcesoGeneraRoles.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoGeneraRoles"));
				this.jInternalFrameImportacionProcesoGeneraRoles.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoGeneraRoles"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoGeneraRoles"));
			
			this.jButtonAbrirOrderByToolBarProcesoGeneraRoles.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoGeneraRoles"));			
			
			if(this.jInternalFrameOrderByProcesoGeneraRoles!=null) {
				this.jInternalFrameOrderByProcesoGeneraRoles.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoGeneraRoles"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGeneraRoles.jTabbedPaneRelacionesProcesoGeneraRoles.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoGeneraRoles"));
		
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
            		closingInternalFrameProcesoGeneraRoles();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoGeneraRoles.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoGeneraRoles = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoGeneraRolesBeanSwingJInternalFrame jInternalFrameParent=(ProcesoGeneraRolesBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoGeneraRoles.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoGeneraRolesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoGeneraRoles.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoGeneraRolesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoGeneraRoles.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoGeneraRoles.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoGeneraRolesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoGeneraRolesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoGeneraRolesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoGeneraRoles";
		inputMap = this.jButtonNuevoProcesoGeneraRoles.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoGeneraRoles.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoGeneraRolesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoGeneraRolesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoGeneraRolesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoGeneraRolesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoGeneraRoles";
		inputMap = this.jButtonNuevoRelacionesProcesoGeneraRoles.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoGeneraRoles.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoGeneraRolesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoGeneraRoles";
		inputMap = this.jButtonModificarProcesoGeneraRoles.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoGeneraRoles.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoGeneraRolesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoGeneraRoles";
		inputMap = this.jButtonActualizarProcesoGeneraRoles.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoGeneraRoles.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoGeneraRolesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoGeneraRoles";
		inputMap = this.jButtonEliminarProcesoGeneraRoles.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoGeneraRoles.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoGeneraRolesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoGeneraRoles";
		inputMap = this.jButtonCancelarProcesoGeneraRoles.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoGeneraRoles.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoGeneraRolesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoGeneraRoles";
		inputMap = this.jButtonCerrarProcesoGeneraRoles.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoGeneraRoles.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoGeneraRolesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonGuardarCambiosProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoGeneraRoles";
		inputMap = this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonGuardarCambiosProcesoGeneraRoles.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonGuardarCambiosProcesoGeneraRoles.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoGeneraRolesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoGeneraRoles.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoGeneraRolesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoGeneraRoles.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoGeneraRolesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoGeneraRoles.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoGeneraRolesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoGeneraRoles.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoGeneraRolesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonidProcesoGeneraRolesBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoGeneraRolesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonid_mesProcesoGeneraRolesUpdate.addActionListener(new ButtonActionListener(this,"id_mesProcesoGeneraRolesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonid_mesProcesoGeneraRolesBusqueda.addActionListener(new ButtonActionListener(this,"id_mesProcesoGeneraRolesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonid_estructuraProcesoGeneraRolesUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraProcesoGeneraRolesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonid_estructuraProcesoGeneraRolesBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraProcesoGeneraRolesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonid_empleadoProcesoGeneraRolesUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoProcesoGeneraRolesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jButtonid_empleadoProcesoGeneraRolesBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoProcesoGeneraRolesBusqueda"));
		
		
		this.jButtonBusquedaProcesoGeneraRolesProcesoGeneraRoles.addActionListener(new ButtonActionListener(this,"BusquedaProcesoGeneraRolesProcesoGeneraRoles"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoGeneraRoles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoGeneraRolesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoGeneraRolesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoGeneraRoles.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoGeneraRoles(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoGeneraRoles procesogenerarolesAux:this.procesogenerarolesLogic.getProcesoGeneraRoless()) {
					procesogenerarolesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoGeneraRoles procesogenerarolesAux:procesogeneraroless) {
					procesogenerarolesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoGeneraRolesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoGeneraRoles(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoGeneraRoles procesogenerarolesAux:this.procesogenerarolesLogic.getProcesoGeneraRoless()) {
						procesogenerarolesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoGeneraRoles procesogenerarolesAux:procesogeneraroless) {
						procesogenerarolesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoGeneraRoles procesogenerarolesAux:this.procesogenerarolesLogic.getProcesoGeneraRoless()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoGeneraRoles procesogenerarolesAux:procesogeneraroless) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoGeneraRoles(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoGeneraRoles.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoGeneraRoles.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoGeneraRoles,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoGeneraRolesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoGeneraRoles(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoGeneraRoles.getSelectedRows();
			
			ProcesoGeneraRoles procesogenerarolesLocal=new ProcesoGeneraRoles();
			
			//this.seleccionarTodosProcesoGeneraRoles(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesogenerarolesLocal =(ProcesoGeneraRoles) this.procesogenerarolesLogic.getProcesoGeneraRoless().toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesogenerarolesLocal =(ProcesoGeneraRoles) this.procesogeneraroless.toArray()[this.jTableDatosProcesoGeneraRoles.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesogenerarolesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoGeneraRoles procesogenerarolesAux:this.procesogenerarolesLogic.getProcesoGeneraRoless()) {
						procesogenerarolesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoGeneraRoles procesogenerarolesAux:procesogeneraroless) {
						procesogenerarolesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoGeneraRoles(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoGeneraRoles.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoGeneraRoles.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoGeneraRoles,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoGeneraRolesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoGeneraRolesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoGeneraRolesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoGeneraRoles(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoGeneraRoles.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoGeneraRoles procesogenerarolesAux:this.procesogenerarolesLogic.getProcesoGeneraRoless()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoGeneraRoles procesogenerarolesAux:procesogeneraroless) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoGeneraRoles(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoGeneraRolesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoGeneraRoles(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoGeneraRoles=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoGeneraRoles.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxTiposAccionesFormularioProcesoGeneraRoles.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoGeneraRoles) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoGeneraRoles(conSplash);
				
					this.generarReporteProcesoGeneraRolessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoGeneraRoles.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxTiposAccionesFormularioProcesoGeneraRoles.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoGeneraRolessSeleccionados();
				//this.jComboBoxTiposAccionesProcesoGeneraRoles.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoGeneraRolessSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoGeneraRoles.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoGeneraRolessSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoGeneraRoles.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoGeneraRoles();
				
				this.exportarProcesoGeneraRolessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoGeneraRoles.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxTiposAccionesFormularioProcesoGeneraRoles.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoGeneraRoless();
				//this.importarProcesoGeneraRoless();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoGeneraRoles.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxTiposAccionesFormularioProcesoGeneraRoles.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoGeneraRoles();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoGeneraRolessSeleccionados();
				//this.jComboBoxTiposAccionesProcesoGeneraRoles.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Genera Roles", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoGeneraRoles();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoGeneraRoles)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoGeneraRoles(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Genera Roles",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoGeneraRoles.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxTiposAccionesFormularioProcesoGeneraRoles.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoGeneraRolesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoGeneraRoles) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoGeneraRoles(conSplash);
					
						//this.actualizarParametrosGeneralProcesoGeneraRoles();
						
						this.generarReporteProcesoAccionProcesoGeneraRolessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoGeneraRoles.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxTiposAccionesFormularioProcesoGeneraRoles.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso Genera RolesES SELECCIONADOS?", "MANTENIMIENTO DE Proceso Genera Roles", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoGeneraRoles();
				
						this.actualizarParametrosGeneralProcesoGeneraRoles();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesogenerarolesReturnGeneral=procesogenerarolesLogic.procesarAccionProcesoGeneraRolessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesogenerarolesLogic.getProcesoGeneraRoless(),this.procesogenerarolesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoGeneraRolesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoGeneraRoles.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxTiposAccionesFormularioProcesoGeneraRoles.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoGeneraRoles();
					
					ProcesoGeneraRolesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoGeneraRolesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoGeneraRoles.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxTiposAccionesFormularioProcesoGeneraRoles.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoGeneraRoles(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoGeneraRolesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoGeneraRoles();
			
			if(this.jInternalFrameDetalleFormProcesoGeneraRoles==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoGeneraRoles> procesogenerarolessSeleccionados=new ArrayList<ProcesoGeneraRoles>();		
			ProcesoGeneraRoles procesogeneraroles=new ProcesoGeneraRoles();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoGeneraRoles(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoGeneraRoles.getSelectedItem();
			
			
			
			
			procesogenerarolessSeleccionados=this.getProcesoGeneraRolessSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesogenerarolessSeleccionados.size()==1) {
				for(ProcesoGeneraRoles procesogenerarolesAux:procesogenerarolessSeleccionados) {
					procesogeneraroles=procesogenerarolesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoGeneraRoles();
			
      		//this.finishProcessProcesoGeneraRoles(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoGeneraRolesReturnGeneral() throws Exception {
		if(this.procesogenerarolesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesogenerarolesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesogenerarolesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesogenerarolesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesogenerarolesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesogenerarolesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoGeneraRoles(false);
		}
		
		if(this.procesogenerarolesReturnGeneral.getConRetornoLista() || this.procesogenerarolesReturnGeneral.getConRetornoObjeto()) {
			if(this.procesogenerarolesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.procesogenerarolesLogic.setProcesoGeneraRoless(this.procesogenerarolesReturnGeneral.getProcesoGeneraRoless());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoGeneraRoles(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoGeneraRoles() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoGeneraRoles> getProcesoGeneraRolessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoGeneraRoles> procesogenerarolessSeleccionados=new ArrayList<ProcesoGeneraRoles>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoGeneraRoles) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoGeneraRoles procesogenerarolesAux:procesogenerarolesLogic.getProcesoGeneraRoless()) {
					if(procesogenerarolesAux.getIsSelected()) {
						procesogenerarolessSeleccionados.add(procesogenerarolesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoGeneraRoles procesogenerarolesAux:this.procesogeneraroless) {
					if(procesogenerarolesAux.getIsSelected()) {
						procesogenerarolessSeleccionados.add(procesogenerarolesAux);				
					}
				}
			}
			
			if(procesogenerarolessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesogenerarolessSeleccionados.addAll(this.procesogenerarolesLogic.getProcesoGeneraRoless());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesogenerarolessSeleccionados.addAll(this.procesogeneraroless);				
					}
				}
			}
		} else {
			procesogenerarolessSeleccionados.add(this.procesogeneraroles);
		}
		
		return procesogenerarolessSeleccionados;
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
	
	public void generarReporteProcesoGeneraRolessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoGeneraRolessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoGeneraRolessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoGeneraRolessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoGeneraRolessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Genera Roles",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoGeneraRolessSeleccionados() throws Exception {
		ArrayList<ProcesoGeneraRoles> procesogenerarolessSeleccionados=new ArrayList<ProcesoGeneraRoles>();		
		
		procesogenerarolessSeleccionados=this.getProcesoGeneraRolessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoGeneraRoless("Todos",procesogenerarolessSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoGeneraRolessSeleccionados() throws Exception {
		ArrayList<ProcesoGeneraRoles> procesogenerarolessSeleccionados=new ArrayList<ProcesoGeneraRoles>();		
		
		procesogenerarolessSeleccionados=this.getProcesoGeneraRolessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoGeneraRoless("Todos",procesogenerarolessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoGeneraRolessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoGeneraRoles> procesogenerarolessSeleccionados=new ArrayList<ProcesoGeneraRoles>();
		
		procesogenerarolessSeleccionados=this.getProcesoGeneraRolessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoGeneraRoless("Todos",procesogenerarolessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoGeneraRolessSeleccionados() throws Exception {
		ArrayList<ProcesoGeneraRoles> procesogenerarolessSeleccionados=new ArrayList<ProcesoGeneraRoles>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoGeneraRoles();
		
		
		procesogenerarolessSeleccionados=this.getProcesoGeneraRolessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoGeneraRoles();
		
		
		//this.generarReporteProcesoGeneraRoless("Todos",procesogenerarolessSeleccionados ,procesogenerarolesImplementable,procesogenerarolesImplementableHome);
	}
	
	public void mostrarImportacionProcesoGeneraRoless() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoGeneraRoles();
		
		this.abrirFrameImportacionProcesoGeneraRoles();		
		
			
		//this.generarReporteProcesoGeneraRoless("Todos",procesogenerarolessSeleccionados ,procesogenerarolesImplementable,procesogenerarolesImplementableHome);
	}
	
	public void importarProcesoGeneraRoless() throws Exception {		
	
	}
	
	public void exportarProcesoGeneraRolessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoGeneraRolessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoGeneraRolessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoGeneraRolessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Genera Roles",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoGeneraRolessSeleccionados() throws Exception {
		ArrayList<ProcesoGeneraRoles> procesogenerarolessSeleccionados=new ArrayList<ProcesoGeneraRoles>();		
		
		procesogenerarolessSeleccionados=this.getProcesoGeneraRolessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesogeneraroles."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoGeneraRoles(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoGeneraRoles procesogenerarolesAux:procesogenerarolessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoGeneraRoles(procesogenerarolesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesogenerarolesAux.setsDetalleGeneralEntityReporte(procesogenerarolesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Genera Roles",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoGeneraRoles(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoGeneraRolesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoGeneraRolesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoGeneraRolesConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoGeneraRolesConstantesFunciones.LABEL_IDESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoGeneraRolesConstantesFunciones.LABEL_IDEMPLEADO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoGeneraRoles(ProcesoGeneraRoles procesogeneraroles,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesogeneraroles.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesogeneraroles.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesogeneraroles.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesogeneraroles.getestructura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesogeneraroles.getempleado_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoGeneraRolessSeleccionados() throws Exception {
		ArrayList<ProcesoGeneraRoles> procesogenerarolessSeleccionados=new ArrayList<ProcesoGeneraRoles>();		
		
		procesogenerarolessSeleccionados=this.getProcesoGeneraRolessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesogeneraroles.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoGeneraRoless");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoGeneraRoles(row);				
				iRow++;
			}				
			
			for(ProcesoGeneraRoles procesogenerarolesAux:procesogenerarolessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoGeneraRoles(procesogenerarolesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Genera Roles",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoGeneraRolessSeleccionados() throws Exception {
		ArrayList<ProcesoGeneraRoles> procesogenerarolessSeleccionados=new ArrayList<ProcesoGeneraRoles>();		
		
		procesogenerarolessSeleccionados=this.getProcesoGeneraRolessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesogeneraroles.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesogeneraroless");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesogeneraroles");
			//elementRoot.appendChild(element);
		
			for(ProcesoGeneraRoles procesogenerarolesAux:procesogenerarolessSeleccionados) {
				element = document.createElement("procesogeneraroles");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoGeneraRoles(procesogenerarolesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Genera Roles",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoGeneraRoles(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoGeneraRolesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoGeneraRolesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoGeneraRolesConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoGeneraRolesConstantesFunciones.LABEL_IDESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoGeneraRolesConstantesFunciones.LABEL_IDEMPLEADO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoGeneraRoles(ProcesoGeneraRoles procesogeneraroles,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesogeneraroles.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesogeneraroles.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesogeneraroles.getestructura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesogeneraroles.getempleado_descripcion());				
	}
	
	public void setFilaDatosExportarXmlProcesoGeneraRoles(ProcesoGeneraRoles procesogeneraroles,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoGeneraRolesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesogeneraroles.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoGeneraRolesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesogeneraroles.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementmes_descripcion = document.createElement(ProcesoGeneraRolesConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(procesogeneraroles.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementestructura_descripcion = document.createElement(ProcesoGeneraRolesConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(procesogeneraroles.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);

		Element elementempleado_descripcion = document.createElement(ProcesoGeneraRolesConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(procesogeneraroles.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);
	}
	
	public void generarReporteGroupGenericoProcesoGeneraRolessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoGeneraRoles> procesogenerarolessSeleccionados=new ArrayList<ProcesoGeneraRoles>();
		
		procesogenerarolessSeleccionados=this.getProcesoGeneraRolessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoGeneraRoles(procesogenerarolessSeleccionados);
		
		this.generarReporteProcesoGeneraRoless("Todos",procesogenerarolessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoGeneraRoles(ArrayList<ProcesoGeneraRoles> procesogenerarolessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoGeneraRoles procesogenerarolesAux:procesogenerarolessSeleccionados) {
				procesogenerarolesAux.setsDetalleGeneralEntityReporte(procesogenerarolesAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoGeneraRolesConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					procesogenerarolesAux.setsDescripcionGeneralEntityReporte1(procesogenerarolesAux.getmes_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoGeneraRolesConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					procesogenerarolesAux.setsDescripcionGeneralEntityReporte1(procesogenerarolesAux.getestructura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoGeneraRolesConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					procesogenerarolesAux.setsDescripcionGeneralEntityReporte1(procesogenerarolesAux.getempleado_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraRolesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoGeneraRoles(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoGeneraRoles=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraRoles=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoGeneraRoles=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoGeneraRoles=false;
			this.isVisibilidadCeldaActualizarProcesoGeneraRoles=false;
			this.isVisibilidadCeldaEliminarProcesoGeneraRoles=false;
			this.isVisibilidadCeldaCancelarProcesoGeneraRoles=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoGeneraRoles=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoGeneraRoles=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoGeneraRoles=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraRoles=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoGeneraRoles=false;
			this.isVisibilidadCeldaModificarProcesoGeneraRoles=false;
			this.isVisibilidadCeldaActualizarProcesoGeneraRoles=true;
			this.isVisibilidadCeldaEliminarProcesoGeneraRoles=false;
			this.isVisibilidadCeldaCancelarProcesoGeneraRoles=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoGeneraRoles=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoGeneraRoles=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoGeneraRoles=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraRoles=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoGeneraRoles=false;
			this.isVisibilidadCeldaModificarProcesoGeneraRoles=false;
			this.isVisibilidadCeldaActualizarProcesoGeneraRoles=true;
			this.isVisibilidadCeldaEliminarProcesoGeneraRoles=true;
			this.isVisibilidadCeldaCancelarProcesoGeneraRoles=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoGeneraRoles=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoGeneraRoles=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoGeneraRoles=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraRoles=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoGeneraRoles=false;
			this.isVisibilidadCeldaModificarProcesoGeneraRoles=false;
			this.isVisibilidadCeldaActualizarProcesoGeneraRoles=true;
			this.isVisibilidadCeldaEliminarProcesoGeneraRoles=false;
			this.isVisibilidadCeldaCancelarProcesoGeneraRoles=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoGeneraRoles=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoGeneraRoles=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoGeneraRoles=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraRoles=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoGeneraRoles=true;
			this.isVisibilidadCeldaModificarProcesoGeneraRoles=false;
			this.isVisibilidadCeldaActualizarProcesoGeneraRoles=false;
			this.isVisibilidadCeldaEliminarProcesoGeneraRoles=false;
			this.isVisibilidadCeldaCancelarProcesoGeneraRoles=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoGeneraRoles=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoGeneraRoles=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoGeneraRoles=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraRoles=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoGeneraRoles=false;
			this.isVisibilidadCeldaActualizarProcesoGeneraRoles=false;
			this.isVisibilidadCeldaEliminarProcesoGeneraRoles=false;
			this.isVisibilidadCeldaCancelarProcesoGeneraRoles=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoGeneraRoles=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoGeneraRoles=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoGeneraRoles=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraRoles=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoGeneraRoles=false;
			this.isVisibilidadCeldaModificarProcesoGeneraRoles=true;
			this.isVisibilidadCeldaActualizarProcesoGeneraRoles=false;
			this.isVisibilidadCeldaEliminarProcesoGeneraRoles=false;
			this.isVisibilidadCeldaCancelarProcesoGeneraRoles=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoGeneraRoles=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoGeneraRoles=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoGeneraRolesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoGeneraRoles=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraRoles=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoGeneraRoles=true;
		} else {
			this.actualizarEstadoPanelsProcesoGeneraRoles(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoGeneraRoles=false;
			//this.isVisibilidadCeldaVerFormProcesoGeneraRoles=false;
			this.isVisibilidadCeldaDuplicarProcesoGeneraRoles=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesogenerarolesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraRoles=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoGeneraRoles=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoGeneraRoles=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesogenerarolesSessionBean.getEsGuardarRelacionado()) {
			if(!procesogenerarolesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraRoles=false;												
			}
			
			this.jButtonCerrarProcesoGeneraRoles.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraRoles=false;
		}
		
		if(!this.permiteMantenimiento(this.procesogeneraroles)) {
			this.isVisibilidadCeldaActualizarProcesoGeneraRoles=false;
			this.isVisibilidadCeldaEliminarProcesoGeneraRoles=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoGeneraRoles=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraRoles=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoGeneraRoles=false;
		//this.isVisibilidadCeldaModificarProcesoGeneraRoles=true;
		this.isVisibilidadCeldaActualizarProcesoGeneraRoles=false;
		this.isVisibilidadCeldaEliminarProcesoGeneraRoles=false;
		//this.isVisibilidadCeldaCancelarProcesoGeneraRoles=true;			
		this.isVisibilidadCeldaGuardarProcesoGeneraRoles=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoGeneraRoles() {
	}
	
	public void actualizarEstadoPanelsProcesoGeneraRoles(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoGeneraRoles!=null) {
				this.jScrollPanelDatosEdicionProcesoGeneraRoles.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoGeneraRoles!=null) {
				this.jTabbedPaneBusquedasProcesoGeneraRoles.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoGeneraRoles!=null) {
				this.jScrollPanelDatosProcesoGeneraRoles.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoGeneraRoles!=null) {
				this.jPanelPaginacionProcesoGeneraRoles.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoGeneraRoles!=null) {
				this.jPanelParametrosReportesProcesoGeneraRoles.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoGeneraRoles!=null) {
				this.jScrollPanelDatosEdicionProcesoGeneraRoles.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoGeneraRoles!=null) {
				this.jTabbedPaneBusquedasProcesoGeneraRoles.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoGeneraRoles!=null) {
				this.jScrollPanelDatosProcesoGeneraRoles.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoGeneraRoles!=null) {
				this.jPanelPaginacionProcesoGeneraRoles.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoGeneraRoles!=null) {
				this.jPanelParametrosReportesProcesoGeneraRoles.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoGeneraRoles!=null) {
				this.jScrollPanelDatosEdicionProcesoGeneraRoles.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoGeneraRoles!=null) {
				this.jTabbedPaneBusquedasProcesoGeneraRoles.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoGeneraRoles!=null) {
				this.jScrollPanelDatosProcesoGeneraRoles.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoGeneraRoles!=null) {
				this.jPanelPaginacionProcesoGeneraRoles.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoGeneraRoles!=null) {
				this.jPanelParametrosReportesProcesoGeneraRoles.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoGeneraRoles!=null) {
				this.jScrollPanelDatosEdicionProcesoGeneraRoles.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoGeneraRoles!=null) {
				this.jTabbedPaneBusquedasProcesoGeneraRoles.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoGeneraRoles!=null) {
				this.jScrollPanelDatosProcesoGeneraRoles.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoGeneraRoles!=null) {
				this.jPanelPaginacionProcesoGeneraRoles.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoGeneraRoles!=null) {
				this.jPanelParametrosReportesProcesoGeneraRoles.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoGeneraRoles!=null) {
				this.jScrollPanelDatosEdicionProcesoGeneraRoles.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoGeneraRoles!=null) {
				this.jTabbedPaneBusquedasProcesoGeneraRoles.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoGeneraRoles!=null) {
				this.jScrollPanelDatosProcesoGeneraRoles.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoGeneraRoles!=null) {
				this.jPanelPaginacionProcesoGeneraRoles.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoGeneraRoles!=null) {
				this.jPanelParametrosReportesProcesoGeneraRoles.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoGeneraRoles!=null) {
				this.jScrollPanelDatosEdicionProcesoGeneraRoles.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoGeneraRoles!=null) {
				this.jTabbedPaneBusquedasProcesoGeneraRoles.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoGeneraRoles!=null) {
				this.jScrollPanelDatosProcesoGeneraRoles.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoGeneraRoles!=null) {
				this.jPanelPaginacionProcesoGeneraRoles.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoGeneraRoles!=null) {
				this.jPanelParametrosReportesProcesoGeneraRoles.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoGeneraRoles!=null) {
				this.jScrollPanelDatosEdicionProcesoGeneraRoles.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoGeneraRoles!=null) {
				this.jTabbedPaneBusquedasProcesoGeneraRoles.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoGeneraRoles!=null) {
				this.jScrollPanelDatosProcesoGeneraRoles.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoGeneraRoles!=null) {
				this.jPanelPaginacionProcesoGeneraRoles.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoGeneraRoles!=null) {
				this.jPanelParametrosReportesProcesoGeneraRoles.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoGeneraRoles!=null) {
					this.jTabbedPaneBusquedasProcesoGeneraRoles.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoGeneraRoles!=null) {
				this.jPanelParametrosReportesProcesoGeneraRoles.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesogenerarolesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoGeneraRoles!=null) {
				this.jTabbedPaneBusquedasProcesoGeneraRoles.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoGeneraRoles!=null) {
				this.jPanelParametrosReportesProcesoGeneraRoles.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadBusquedaProcesoGeneraRoles=isParaMes;
			if(!this.isVisibilidadBusquedaProcesoGeneraRoles) {this.jTabbedPaneBusquedasProcesoGeneraRoles.remove(jPanelBusquedaProcesoGeneraRolesProcesoGeneraRoles);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadBusquedaProcesoGeneraRoles=isParaEstructura;
			if(!this.isVisibilidadBusquedaProcesoGeneraRoles) {this.jTabbedPaneBusquedasProcesoGeneraRoles.remove(jPanelBusquedaProcesoGeneraRolesProcesoGeneraRoles);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadBusquedaProcesoGeneraRoles=isParaEmpleado;
			if(!this.isVisibilidadBusquedaProcesoGeneraRoles) {this.jTabbedPaneBusquedasProcesoGeneraRoles.remove(jPanelBusquedaProcesoGeneraRolesProcesoGeneraRoles);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProcesoGeneraRoles(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoGeneraRoles() {
		this.updateBorderResaltarBusquedasFormularioProcesoGeneraRoles();
		this.updateVisibilidadBusquedasFormularioProcesoGeneraRoles();
		this.updateHabilitarBusquedasFormularioProcesoGeneraRoles();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoGeneraRoles() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoGeneraRoles.getComponents().length>0) {
	

		if(this.procesogenerarolesConstantesFunciones.resaltarBusquedaProcesoGeneraRolesProcesoGeneraRoles!=null) {
			index= this.jTabbedPaneBusquedasProcesoGeneraRoles.indexOfComponent(this.jPanelBusquedaProcesoGeneraRolesProcesoGeneraRoles);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoGeneraRoles.getComponent(index);
				jPanel.setBorder(this.procesogenerarolesConstantesFunciones.resaltarBusquedaProcesoGeneraRolesProcesoGeneraRoles);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoGeneraRoles() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoGeneraRoles.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoGeneraRoles.indexOfComponent(this.jPanelBusquedaProcesoGeneraRolesProcesoGeneraRoles);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoGeneraRoles.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesogenerarolesConstantesFunciones.mostrarBusquedaProcesoGeneraRolesProcesoGeneraRoles);
			if(!this.procesogenerarolesConstantesFunciones.mostrarBusquedaProcesoGeneraRolesProcesoGeneraRoles && index>-1) {
				this.jTabbedPaneBusquedasProcesoGeneraRoles.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoGeneraRoles() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoGeneraRoles.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoGeneraRoles.indexOfComponent(this.jPanelBusquedaProcesoGeneraRolesProcesoGeneraRoles);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoGeneraRoles.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesogenerarolesConstantesFunciones.activarBusquedaProcesoGeneraRolesProcesoGeneraRoles);
				this.jTabbedPaneBusquedasProcesoGeneraRoles.setEnabledAt(index,this.procesogenerarolesConstantesFunciones.activarBusquedaProcesoGeneraRolesProcesoGeneraRoles);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoGeneraRoles(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoGeneraRoles")) {
			index= this.jTabbedPaneBusquedasProcesoGeneraRoles.indexOfComponent(this.jPanelBusquedaProcesoGeneraRolesProcesoGeneraRoles);

			this.jTabbedPaneBusquedasProcesoGeneraRoles.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoGeneraRoles.getComponent(index);

			this.procesogenerarolesConstantesFunciones.setResaltarBusquedaProcesoGeneraRolesProcesoGeneraRoles(resaltar);

			jPanel.setBorder(this.procesogenerarolesConstantesFunciones.resaltarBusquedaProcesoGeneraRolesProcesoGeneraRoles);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoGeneraRoles.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoGeneraRoles() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoGeneraRoles==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoGeneraRoles();
		this.updateVisibilidadResaltarControlesFormularioProcesoGeneraRoles();
		this.updateHabilitarResaltarControlesFormularioProcesoGeneraRoles();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoGeneraRoles() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoGeneraRoles==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesogenerarolesConstantesFunciones.resaltaridProcesoGeneraRoles!=null && this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {this.jInternalFrameDetalleFormProcesoGeneraRoles.jLabelidProcesoGeneraRoles.setBorder(this.procesogenerarolesConstantesFunciones.resaltaridProcesoGeneraRoles);}
		if(this.procesogenerarolesConstantesFunciones.resaltarid_mesProcesoGeneraRoles!=null && this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_mesProcesoGeneraRoles.setBorder(this.procesogenerarolesConstantesFunciones.resaltarid_mesProcesoGeneraRoles);}
		if(this.procesogenerarolesConstantesFunciones.resaltarid_estructuraProcesoGeneraRoles!=null && this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_estructuraProcesoGeneraRoles.setBorder(this.procesogenerarolesConstantesFunciones.resaltarid_estructuraProcesoGeneraRoles);}
		if(this.procesogenerarolesConstantesFunciones.resaltarid_empleadoProcesoGeneraRoles!=null && this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_empleadoProcesoGeneraRoles.setBorder(this.procesogenerarolesConstantesFunciones.resaltarid_empleadoProcesoGeneraRoles);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoGeneraRoles() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoGeneraRoles==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
	
		//this.jInternalFrameDetalleFormProcesoGeneraRoles.jLabelidProcesoGeneraRoles.setVisible(this.procesogenerarolesConstantesFunciones.mostraridProcesoGeneraRoles);
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jPanelidProcesoGeneraRoles.setVisible(this.procesogenerarolesConstantesFunciones.mostraridProcesoGeneraRoles);
		//this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_mesProcesoGeneraRoles.setVisible(this.procesogenerarolesConstantesFunciones.mostrarid_mesProcesoGeneraRoles);
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jPanelid_mesProcesoGeneraRoles.setVisible(this.procesogenerarolesConstantesFunciones.mostrarid_mesProcesoGeneraRoles);
		//this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_estructuraProcesoGeneraRoles.setVisible(this.procesogenerarolesConstantesFunciones.mostrarid_estructuraProcesoGeneraRoles);
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jPanelid_estructuraProcesoGeneraRoles.setVisible(this.procesogenerarolesConstantesFunciones.mostrarid_estructuraProcesoGeneraRoles);
		//this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_empleadoProcesoGeneraRoles.setVisible(this.procesogenerarolesConstantesFunciones.mostrarid_empleadoProcesoGeneraRoles);
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jPanelid_empleadoProcesoGeneraRoles.setVisible(this.procesogenerarolesConstantesFunciones.mostrarid_empleadoProcesoGeneraRoles);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoGeneraRoles() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoGeneraRoles==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoGeneraRoles!=null) {
	
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jLabelidProcesoGeneraRoles.setEnabled(this.procesogenerarolesConstantesFunciones.activaridProcesoGeneraRoles);
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_mesProcesoGeneraRoles.setEnabled(this.procesogenerarolesConstantesFunciones.activarid_mesProcesoGeneraRoles);
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_estructuraProcesoGeneraRoles.setEnabled(this.procesogenerarolesConstantesFunciones.activarid_estructuraProcesoGeneraRoles);
		this.jInternalFrameDetalleFormProcesoGeneraRoles.jComboBoxid_empleadoProcesoGeneraRoles.setEnabled(this.procesogenerarolesConstantesFunciones.activarid_empleadoProcesoGeneraRoles);
		}
	}
	
		
}