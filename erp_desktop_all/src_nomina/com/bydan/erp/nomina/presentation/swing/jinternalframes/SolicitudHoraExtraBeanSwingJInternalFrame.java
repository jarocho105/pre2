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

import com.bydan.erp.nomina.util.SolicitudHoraExtraConstantesFunciones;
import com.bydan.erp.nomina.util.SolicitudHoraExtraParameterReturnGeneral;
//import com.bydan.erp.nomina.util.SolicitudHoraExtraParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.SolicitudHoraExtraBean;
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
public class SolicitudHoraExtraBeanSwingJInternalFrame extends SolicitudHoraExtraJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(SolicitudHoraExtraBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<SolicitudHoraExtra> solicitudhoraextraValidator = new ClassValidator<SolicitudHoraExtra>(SolicitudHoraExtra.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public SolicitudHoraExtra solicitudhoraextra;	
	public SolicitudHoraExtra solicitudhoraextraAux;
	public SolicitudHoraExtra solicitudhoraextraAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public SolicitudHoraExtra solicitudhoraextraTotales;
	public Long idSolicitudHoraExtraActual;
	public Long iIdNuevoSolicitudHoraExtra=0L;
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

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
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

	public String sFinalQueryComboEmpleadoJefe="";

	public List<Empleado> empleadojefesForeignKey;

	public List<Empleado> getempleadojefesForeignKey() {
		return empleadojefesForeignKey;
	}

	public void setempleadojefesForeignKey(List<Empleado> empleadojefesForeignKey) {
		this.empleadojefesForeignKey = empleadojefesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empleado empleadojefeForeignKey;

	public Empleado getempleadojefeForeignKey() {
		return empleadojefeForeignKey;
	}

	public void setempleadojefeForeignKey(Empleado empleadojefeForeignKey) {
		this.empleadojefeForeignKey = empleadojefeForeignKey;
	}

	public String sFinalQueryComboEstadoSolicitudNomi="";

	public List<EstadoSolicitudNomi> estadosolicitudnomisForeignKey;

	public List<EstadoSolicitudNomi> getestadosolicitudnomisForeignKey() {
		return estadosolicitudnomisForeignKey;
	}

	public void setestadosolicitudnomisForeignKey(List<EstadoSolicitudNomi> estadosolicitudnomisForeignKey) {
		this.estadosolicitudnomisForeignKey = estadosolicitudnomisForeignKey;
	}

	//OBJETO FK ACTUAL
	public EstadoSolicitudNomi estadosolicitudnomiForeignKey;

	public EstadoSolicitudNomi getestadosolicitudnomiForeignKey() {
		return estadosolicitudnomiForeignKey;
	}

	public void setestadosolicitudnomiForeignKey(EstadoSolicitudNomi estadosolicitudnomiForeignKey) {
		this.estadosolicitudnomiForeignKey = estadosolicitudnomiForeignKey;
	}

	public String sFinalQueryComboEmpleadoReemplazo="";

	public List<Empleado> empleadoreemplazosForeignKey;

	public List<Empleado> getempleadoreemplazosForeignKey() {
		return empleadoreemplazosForeignKey;
	}

	public void setempleadoreemplazosForeignKey(List<Empleado> empleadoreemplazosForeignKey) {
		this.empleadoreemplazosForeignKey = empleadoreemplazosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empleado empleadoreemplazoForeignKey;

	public Empleado getempleadoreemplazoForeignKey() {
		return empleadoreemplazoForeignKey;
	}

	public void setempleadoreemplazoForeignKey(Empleado empleadoreemplazoForeignKey) {
		this.empleadoreemplazoForeignKey = empleadoreemplazoForeignKey;
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
	
	public Boolean isPermisoTodoSolicitudHoraExtra;
	public Boolean isPermisoNuevoSolicitudHoraExtra;
	public Boolean isPermisoActualizarSolicitudHoraExtra;
	public Boolean isPermisoActualizarOriginalSolicitudHoraExtra;
	public Boolean isPermisoEliminarSolicitudHoraExtra;
	public Boolean isPermisoGuardarCambiosSolicitudHoraExtra;
	public Boolean isPermisoConsultaSolicitudHoraExtra;
	public Boolean isPermisoBusquedaSolicitudHoraExtra;
	public Boolean isPermisoReporteSolicitudHoraExtra;
	public Boolean isPermisoPaginacionMedioSolicitudHoraExtra;
	public Boolean isPermisoPaginacionAltoSolicitudHoraExtra;
	public Boolean isPermisoPaginacionTodoSolicitudHoraExtra;
	public Boolean isPermisoCopiarSolicitudHoraExtra;
	public Boolean isPermisoVerFormSolicitudHoraExtra;
	public Boolean isPermisoDuplicarSolicitudHoraExtra;
	public Boolean isPermisoOrdenSolicitudHoraExtra;
	
	
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
	
	public SolicitudHoraExtraParameterReturnGeneral solicitudhoraextraReturnGeneral;
	public SolicitudHoraExtraParameterReturnGeneral solicitudhoraextraParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoSolicitudHoraExtra=false;
	public Boolean esParaAccionDesdeFormularioSolicitudHoraExtra=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected SolicitudHoraExtraSessionBeanAdditional solicitudhoraextraSessionBeanAdditional=null;
	
	public SolicitudHoraExtraSessionBeanAdditional getSolicitudHoraExtraSessionBeanAdditional() {
		return this.solicitudhoraextraSessionBeanAdditional;
	}
	
	public void setSolicitudHoraExtraSessionBeanAdditional(SolicitudHoraExtraSessionBeanAdditional solicitudhoraextraSessionBeanAdditional) {
		try {
			this.solicitudhoraextraSessionBeanAdditional=solicitudhoraextraSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected SolicitudHoraExtraBeanSwingJInternalFrameAdditional solicitudhoraextraBeanSwingJInternalFrameAdditional=null;
	//public class SolicitudHoraExtraBeanSwingJInternalFrame
	
	public SolicitudHoraExtraBeanSwingJInternalFrameAdditional getSolicitudHoraExtraBeanSwingJInternalFrameAdditional() {
		return this.solicitudhoraextraBeanSwingJInternalFrameAdditional;
	}
	
	public void setSolicitudHoraExtraBeanSwingJInternalFrameAdditional(SolicitudHoraExtraBeanSwingJInternalFrameAdditional solicitudhoraextraBeanSwingJInternalFrameAdditional) {
		try {
			this.solicitudhoraextraBeanSwingJInternalFrameAdditional=solicitudhoraextraBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public SolicitudHoraExtraLogic solicitudhoraextraLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public SolicitudHoraExtra solicitudhoraextraBean;
	public SolicitudHoraExtraConstantesFunciones solicitudhoraextraConstantesFunciones;
	//public SolicitudHoraExtraParameterReturnGeneral solicitudhoraextraReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EmpleadoLogic empleadoLogic;
	public EstructuraLogic estructuraLogic;
	public EmpleadoLogic empleadojefeLogic;
	public EstadoSolicitudNomiLogic estadosolicitudnomiLogic;
	public EmpleadoLogic empleadoreemplazoLogic;
	
	//PARAMETROS
	
	
	//public List<SolicitudHoraExtra> solicitudhoraextras;	
	//public List<SolicitudHoraExtra> solicitudhoraextrasEliminados;
	//public List<SolicitudHoraExtra> solicitudhoraextrasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoSolicitudHoraExtra=false;
	public Boolean isVisibilidadCeldaDuplicarSolicitudHoraExtra=true;
	public Boolean isVisibilidadCeldaCopiarSolicitudHoraExtra=true;
	public Boolean isVisibilidadCeldaVerFormSolicitudHoraExtra=true;
	public Boolean isVisibilidadCeldaOrdenSolicitudHoraExtra=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesSolicitudHoraExtra=false;
	public Boolean isVisibilidadCeldaModificarSolicitudHoraExtra=false;
	public Boolean isVisibilidadCeldaActualizarSolicitudHoraExtra=false;
	public Boolean isVisibilidadCeldaEliminarSolicitudHoraExtra=false;
	public Boolean isVisibilidadCeldaCancelarSolicitudHoraExtra=false;
	public Boolean isVisibilidadCeldaGuardarSolicitudHoraExtra=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosSolicitudHoraExtra=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpleadoJefe=false;
	public Boolean isVisibilidadFK_IdEmpleadoReemplazo=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstadoSolicitudNomi=false;
	public Boolean isVisibilidadFK_IdEstructura=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoSolicitudHoraExtra() {
		return this.iIdNuevoSolicitudHoraExtra;
	}

	public void setiIdNuevoSolicitudHoraExtra(Long iIdNuevoSolicitudHoraExtra) {
		this.iIdNuevoSolicitudHoraExtra = iIdNuevoSolicitudHoraExtra;
	}
	
	public Long getidSolicitudHoraExtraActual() {
		return this.idSolicitudHoraExtraActual;
	}

	public void setidSolicitudHoraExtraActual(Long idSolicitudHoraExtraActual) {
		this.idSolicitudHoraExtraActual = idSolicitudHoraExtraActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public SolicitudHoraExtra getsolicitudhoraextra() {
		return this.solicitudhoraextra;
	}

	public void setsolicitudhoraextra(SolicitudHoraExtra solicitudhoraextra) {
		this.solicitudhoraextra = solicitudhoraextra;
	}
	
	public SolicitudHoraExtra getsolicitudhoraextraAux() {
		return this.solicitudhoraextraAux;
	}

	public void setsolicitudhoraextraAux(SolicitudHoraExtra solicitudhoraextraAux) {
		this.solicitudhoraextraAux = solicitudhoraextraAux;
	}				
	
	public SolicitudHoraExtra getsolicitudhoraextraAnterior() {
		return this.solicitudhoraextraAnterior;
	}

	public void setsolicitudhoraextraAnterior(SolicitudHoraExtra solicitudhoraextraAnterior) {
		this.solicitudhoraextraAnterior = solicitudhoraextraAnterior;
	}	
	
	public SolicitudHoraExtra getsolicitudhoraextraTotales() {
		return this.solicitudhoraextraTotales;
	}

	public void setsolicitudhoraextraTotales(SolicitudHoraExtra solicitudhoraextraTotales) {
		this.solicitudhoraextraTotales = solicitudhoraextraTotales;
	}	
	
	public SolicitudHoraExtra getsolicitudhoraextraBean() {
		return this.solicitudhoraextraBean;
	}

	public void setsolicitudhoraextraBean(SolicitudHoraExtra solicitudhoraextraBean) {
		this.solicitudhoraextraBean = solicitudhoraextraBean;
	}	
	
	public SolicitudHoraExtraParameterReturnGeneral getsolicitudhoraextraReturnGeneral() {
		return this.solicitudhoraextraReturnGeneral;
	}

	public void setsolicitudhoraextraReturnGeneral(SolicitudHoraExtraParameterReturnGeneral solicitudhoraextraReturnGeneral) {
		this.solicitudhoraextraReturnGeneral = solicitudhoraextraReturnGeneral;
	}	
	
	
	public Long id_empleadoFK_IdEmpleado=-1L;

	public Long getid_empleadoFK_IdEmpleado() {
		return this.id_empleadoFK_IdEmpleado;
	}

	public void setid_empleadoFK_IdEmpleado(Long id_empleadoFK_IdEmpleado) {
		this.id_empleadoFK_IdEmpleado = id_empleadoFK_IdEmpleado;
	}

	public Long id_empleado_jefeFK_IdEmpleadoJefe=-1L;

	public Long getid_empleado_jefeFK_IdEmpleadoJefe() {
		return this.id_empleado_jefeFK_IdEmpleadoJefe;
	}

	public void setid_empleado_jefeFK_IdEmpleadoJefe(Long id_empleado_jefeFK_IdEmpleadoJefe) {
		this.id_empleado_jefeFK_IdEmpleadoJefe = id_empleado_jefeFK_IdEmpleadoJefe;
	}

	public Long id_empleado_reemplazoFK_IdEmpleadoReemplazo=-1L;

	public Long getid_empleado_reemplazoFK_IdEmpleadoReemplazo() {
		return this.id_empleado_reemplazoFK_IdEmpleadoReemplazo;
	}

	public void setid_empleado_reemplazoFK_IdEmpleadoReemplazo(Long id_empleado_reemplazoFK_IdEmpleadoReemplazo) {
		this.id_empleado_reemplazoFK_IdEmpleadoReemplazo = id_empleado_reemplazoFK_IdEmpleadoReemplazo;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi=-1L;

	public Long getid_estado_solicitud_nomiFK_IdEstadoSolicitudNomi() {
		return this.id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi;
	}

	public void setid_estado_solicitud_nomiFK_IdEstadoSolicitudNomi(Long id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi) {
		this.id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi = id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi;
	}

	public Long id_estructuraFK_IdEstructura=-1L;

	public Long getid_estructuraFK_IdEstructura() {
		return this.id_estructuraFK_IdEstructura;
	}

	public void setid_estructuraFK_IdEstructura(Long id_estructuraFK_IdEstructura) {
		this.id_estructuraFK_IdEstructura = id_estructuraFK_IdEstructura;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public SolicitudHoraExtraLogic getSolicitudHoraExtraLogic()	{		
		return solicitudhoraextraLogic;
	}

	public void setSolicitudHoraExtraLogic(SolicitudHoraExtraLogic solicitudhoraextraLogic) {
		this.solicitudhoraextraLogic = solicitudhoraextraLogic;
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
	
	public Boolean getIsEsNuevoSolicitudHoraExtra() {
		return isEsNuevoSolicitudHoraExtra;
	}

	public void setIsEsNuevoSolicitudHoraExtra(Boolean isEsNuevoSolicitudHoraExtra) {
		this.isEsNuevoSolicitudHoraExtra = isEsNuevoSolicitudHoraExtra;
	}

	public Boolean getEsParaAccionDesdeFormularioSolicitudHoraExtra() {
		return esParaAccionDesdeFormularioSolicitudHoraExtra;
	}
	
	public void setEsParaAccionDesdeFormularioSolicitudHoraExtra(Boolean esParaAccionDesdeFormularioSolicitudHoraExtra) {
		this.esParaAccionDesdeFormularioSolicitudHoraExtra = esParaAccionDesdeFormularioSolicitudHoraExtra;
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

			if(this.solicitudhoraextraSessionBean==null) {
				this.solicitudhoraextraSessionBean=new SolicitudHoraExtraSessionBean();
			}

			if(!this.solicitudhoraextraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(solicitudhoraextraSessionBean.getlidEmpresaActual());
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

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.solicitudhoraextraSessionBean==null) {
				this.solicitudhoraextraSessionBean=new SolicitudHoraExtraSessionBean();
			}

			if(!this.solicitudhoraextraSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(solicitudhoraextraSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
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

			if(this.solicitudhoraextraSessionBean==null) {
				this.solicitudhoraextraSessionBean=new SolicitudHoraExtraSessionBean();
			}

			if(!this.solicitudhoraextraSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(solicitudhoraextraSessionBean.getlidEmpleadoActual());
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

			//estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

			if(this.solicitudhoraextraSessionBean==null) {
				this.solicitudhoraextraSessionBean=new SolicitudHoraExtraSessionBean();
			}

			if(!this.solicitudhoraextraSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

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
					estructuraLogic.getEntityWithConnection(solicitudhoraextraSessionBean.getlidEstructuraActual());
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

	public void cargarCombosEmpleadoJefesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empleadojefesForeignKey=new ArrayList<Empleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpleadoLogic empleadoLogic=new EmpleadoLogic();

			//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.solicitudhoraextraSessionBean==null) {
				this.solicitudhoraextraSessionBean=new SolicitudHoraExtraSessionBean();
			}

			if(!this.solicitudhoraextraSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoJefe()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empleadojefeLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

					empleadoLogic.getTodosEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.empleadojefesForeignKey=empleadoLogic.getEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpleadoJefe(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(solicitudhoraextraSessionBean.getlidEmpleadoJefeActual());
					this.empleadojefesForeignKey.add(empleadoLogic.getEmpleado());
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

	public void cargarCombosEstadoSolicitudNomisForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estadosolicitudnomisForeignKey=new ArrayList<EstadoSolicitudNomi>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstadoSolicitudNomiLogic estadosolicitudnomiLogic=new EstadoSolicitudNomiLogic();

			//estadosolicitudnomiLogic.getEstadoSolicitudNomiDataAccess().setIsForForeingKeyData(true);

			if(this.solicitudhoraextraSessionBean==null) {
				this.solicitudhoraextraSessionBean=new SolicitudHoraExtraSessionBean();
			}

			if(!this.solicitudhoraextraSessionBean.getisBusquedaDesdeForeignKeySesionEstadoSolicitudNomi()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadosolicitudnomiLogic.getEstadoSolicitudNomiDataAccess().setIsForForeingKeyData(true);

					estadosolicitudnomiLogic.getTodosEstadoSolicitudNomisWithConnection(sFinalQuery,new Pagination());

					this.estadosolicitudnomisForeignKey=estadosolicitudnomiLogic.getEstadoSolicitudNomis();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstadoSolicitudNomi(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadosolicitudnomiLogic.getEntityWithConnection(solicitudhoraextraSessionBean.getlidEstadoSolicitudNomiActual());
					this.estadosolicitudnomisForeignKey.add(estadosolicitudnomiLogic.getEstadoSolicitudNomi());
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

	public void cargarCombosEmpleadoReemplazosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empleadoreemplazosForeignKey=new ArrayList<Empleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpleadoLogic empleadoLogic=new EmpleadoLogic();

			//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.solicitudhoraextraSessionBean==null) {
				this.solicitudhoraextraSessionBean=new SolicitudHoraExtraSessionBean();
			}

			if(!this.solicitudhoraextraSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoReemplazo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empleadoreemplazoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

					empleadoLogic.getTodosEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.empleadoreemplazosForeignKey=empleadoLogic.getEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpleadoReemplazo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(solicitudhoraextraSessionBean.getlidEmpleadoReemplazoActual());
					this.empleadoreemplazosForeignKey.add(empleadoLogic.getEmpleado());
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

					if(this.solicitudhoraextra!=null) {
						this.solicitudhoraextra.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
						this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empresaSolicitudHoraExtra.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaSolicitudHoraExtra.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
						if(this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empresaSolicitudHoraExtra.getItemCount()>0) {
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empresaSolicitudHoraExtra.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaSolicitudHoraExtraGenerico)throws Exception
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
				jComboBoxid_empresaSolicitudHoraExtraGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaSolicitudHoraExtraGenerico!=null && jComboBoxid_empresaSolicitudHoraExtraGenerico.getItemCount()>0) {
					jComboBoxid_empresaSolicitudHoraExtraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.solicitudhoraextra!=null) {
						this.solicitudhoraextra.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
						this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_sucursalSolicitudHoraExtra.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalSolicitudHoraExtra.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
						if(this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_sucursalSolicitudHoraExtra.getItemCount()>0) {
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_sucursalSolicitudHoraExtra.setSelectedIndex(0);
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

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalSolicitudHoraExtraGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalSolicitudHoraExtraGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalSolicitudHoraExtraGenerico!=null && jComboBoxid_sucursalSolicitudHoraExtraGenerico.getItemCount()>0) {
					jComboBoxid_sucursalSolicitudHoraExtraGenerico.setSelectedIndex(0);
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

					if(this.solicitudhoraextra!=null) {
						this.solicitudhoraextra.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
						this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleadoSolicitudHoraExtra.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoSolicitudHoraExtra.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
						if(this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleadoSolicitudHoraExtra.getItemCount()>0) {
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleadoSolicitudHoraExtra.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoSolicitudHoraExtra!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoSolicitudHoraExtra.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoSolicitudHoraExtra!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoSolicitudHoraExtra.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoSolicitudHoraExtra.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoSolicitudHoraExtra.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoSolicitudHoraExtraGenerico)throws Exception
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
				jComboBoxid_empleadoSolicitudHoraExtraGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoSolicitudHoraExtraGenerico!=null && jComboBoxid_empleadoSolicitudHoraExtraGenerico.getItemCount()>0) {
					jComboBoxid_empleadoSolicitudHoraExtraGenerico.setSelectedIndex(0);
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

					if(this.solicitudhoraextra!=null) {
						this.solicitudhoraextra.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
						this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estructuraSolicitudHoraExtra.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraSolicitudHoraExtra.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
						if(this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estructuraSolicitudHoraExtra.getItemCount()>0) {
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estructuraSolicitudHoraExtra.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraFK_IdEstructuraSolicitudHoraExtra!=null) {
						jComboBoxid_estructuraFK_IdEstructuraSolicitudHoraExtra.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraFK_IdEstructuraSolicitudHoraExtra!=null) {
							//jComboBoxid_estructuraFK_IdEstructuraSolicitudHoraExtra.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraFK_IdEstructuraSolicitudHoraExtra.getItemCount()>0) {
								jComboBoxid_estructuraFK_IdEstructuraSolicitudHoraExtra.setSelectedIndex(0);
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
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraSolicitudHoraExtraGenerico)throws Exception
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
				jComboBoxid_estructuraSolicitudHoraExtraGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraSolicitudHoraExtraGenerico!=null && jComboBoxid_estructuraSolicitudHoraExtraGenerico.getItemCount()>0) {
					jComboBoxid_estructuraSolicitudHoraExtraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEmpleadoJefeForeignKey(Long idEmpleadoJefeSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empleado  empleadojefeTemp=null;

			for(Empleado empleadojefeAux:empleadojefesForeignKey) {
				if(empleadojefeAux.getId()!=null && empleadojefeAux.getId().equals(idEmpleadoJefeSeleccionado)) {
					empleadojefeTemp=empleadojefeAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empleadojefeTemp!=null) {

					if(this.solicitudhoraextra!=null) {
						this.solicitudhoraextra.setEmpleadoJefe(empleadojefeTemp);
					}

					if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
						this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_jefeSolicitudHoraExtra.setSelectedItem(empleadojefeTemp);
					}
				} else {
					//jComboBoxid_empleado_jefeSolicitudHoraExtra.setSelectedItem(empleadojefeTemp);
					if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
						if(this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_jefeSolicitudHoraExtra.getItemCount()>0) {
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_jefeSolicitudHoraExtra.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleadoJefe") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadojefeTemp!=null && jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra!=null) {
						jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra.setSelectedItem(empleadojefeTemp);
					} else {
						if(jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra!=null) {
							//jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra.setSelectedItem(empleadojefeTemp);
							if(jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra.getItemCount()>0) {
								jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra.setSelectedIndex(0);
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

	public String getActualEmpleadoJefeForeignKeyDescripcion(Long idEmpleadoJefeSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empleado  empleadojefeTemp=null;

			for(Empleado empleadojefeAux:empleadojefesForeignKey) {
				if(empleadojefeAux.getId()!=null && empleadojefeAux.getId().equals(idEmpleadoJefeSeleccionado)) {
					empleadojefeTemp=empleadojefeAux;
					break;
				}
			}


			sDescripcion=EmpleadoConstantesFunciones.getEmpleadoDescripcion(empleadojefeTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpleadoJefeForeignKeyGenerico(Long idEmpleadoJefeSeleccionado,JComboBox jComboBoxid_empleado_jefeSolicitudHoraExtraGenerico)throws Exception
	{
		try
		{
			Empleado  empleadojefeTemp=null;

			for(Empleado empleadojefeAux:empleadojefesForeignKey) {
				if(empleadojefeAux.getId()!=null && empleadojefeAux.getId().equals(idEmpleadoJefeSeleccionado)) {
					empleadojefeTemp=empleadojefeAux;
					break;
				}
			}

			if(empleadojefeTemp!=null) {
				jComboBoxid_empleado_jefeSolicitudHoraExtraGenerico.setSelectedItem(empleadojefeTemp);
			} else {
				if(jComboBoxid_empleado_jefeSolicitudHoraExtraGenerico!=null && jComboBoxid_empleado_jefeSolicitudHoraExtraGenerico.getItemCount()>0) {
					jComboBoxid_empleado_jefeSolicitudHoraExtraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstadoSolicitudNomiForeignKey(Long idEstadoSolicitudNomiSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			EstadoSolicitudNomi  estadosolicitudnomiTemp=null;

			for(EstadoSolicitudNomi estadosolicitudnomiAux:estadosolicitudnomisForeignKey) {
				if(estadosolicitudnomiAux.getId()!=null && estadosolicitudnomiAux.getId().equals(idEstadoSolicitudNomiSeleccionado)) {
					estadosolicitudnomiTemp=estadosolicitudnomiAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estadosolicitudnomiTemp!=null) {

					if(this.solicitudhoraextra!=null) {
						this.solicitudhoraextra.setEstadoSolicitudNomi(estadosolicitudnomiTemp);
					}

					if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
						this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra.setSelectedItem(estadosolicitudnomiTemp);
					}
				} else {
					//jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra.setSelectedItem(estadosolicitudnomiTemp);
					if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
						if(this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra.getItemCount()>0) {
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstadoSolicitudNomi") || sFormularioTipoBusqueda.equals("Todos")){
					if(estadosolicitudnomiTemp!=null && jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra!=null) {
						jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra.setSelectedItem(estadosolicitudnomiTemp);
					} else {
						if(jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra!=null) {
							//jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra.setSelectedItem(estadosolicitudnomiTemp);
							if(jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra.getItemCount()>0) {
								jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra.setSelectedIndex(0);
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

	public String getActualEstadoSolicitudNomiForeignKeyDescripcion(Long idEstadoSolicitudNomiSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			EstadoSolicitudNomi  estadosolicitudnomiTemp=null;

			for(EstadoSolicitudNomi estadosolicitudnomiAux:estadosolicitudnomisForeignKey) {
				if(estadosolicitudnomiAux.getId()!=null && estadosolicitudnomiAux.getId().equals(idEstadoSolicitudNomiSeleccionado)) {
					estadosolicitudnomiTemp=estadosolicitudnomiAux;
					break;
				}
			}


			sDescripcion=EstadoSolicitudNomiConstantesFunciones.getEstadoSolicitudNomiDescripcion(estadosolicitudnomiTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstadoSolicitudNomiForeignKeyGenerico(Long idEstadoSolicitudNomiSeleccionado,JComboBox jComboBoxid_estado_solicitud_nomiSolicitudHoraExtraGenerico)throws Exception
	{
		try
		{
			EstadoSolicitudNomi  estadosolicitudnomiTemp=null;

			for(EstadoSolicitudNomi estadosolicitudnomiAux:estadosolicitudnomisForeignKey) {
				if(estadosolicitudnomiAux.getId()!=null && estadosolicitudnomiAux.getId().equals(idEstadoSolicitudNomiSeleccionado)) {
					estadosolicitudnomiTemp=estadosolicitudnomiAux;
					break;
				}
			}

			if(estadosolicitudnomiTemp!=null) {
				jComboBoxid_estado_solicitud_nomiSolicitudHoraExtraGenerico.setSelectedItem(estadosolicitudnomiTemp);
			} else {
				if(jComboBoxid_estado_solicitud_nomiSolicitudHoraExtraGenerico!=null && jComboBoxid_estado_solicitud_nomiSolicitudHoraExtraGenerico.getItemCount()>0) {
					jComboBoxid_estado_solicitud_nomiSolicitudHoraExtraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEmpleadoReemplazoForeignKey(Long idEmpleadoReemplazoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empleado  empleadoreemplazoTemp=null;

			for(Empleado empleadoreemplazoAux:empleadoreemplazosForeignKey) {
				if(empleadoreemplazoAux.getId()!=null && empleadoreemplazoAux.getId().equals(idEmpleadoReemplazoSeleccionado)) {
					empleadoreemplazoTemp=empleadoreemplazoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empleadoreemplazoTemp!=null) {

					if(this.solicitudhoraextra!=null) {
						this.solicitudhoraextra.setEmpleadoReemplazo(empleadoreemplazoTemp);
					}

					if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
						this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_reemplazoSolicitudHoraExtra.setSelectedItem(empleadoreemplazoTemp);
					}
				} else {
					//jComboBoxid_empleado_reemplazoSolicitudHoraExtra.setSelectedItem(empleadoreemplazoTemp);
					if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
						if(this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_reemplazoSolicitudHoraExtra.getItemCount()>0) {
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_reemplazoSolicitudHoraExtra.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleadoReemplazo") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoreemplazoTemp!=null && jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra!=null) {
						jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra.setSelectedItem(empleadoreemplazoTemp);
					} else {
						if(jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra!=null) {
							//jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra.setSelectedItem(empleadoreemplazoTemp);
							if(jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra.getItemCount()>0) {
								jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra.setSelectedIndex(0);
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

	public String getActualEmpleadoReemplazoForeignKeyDescripcion(Long idEmpleadoReemplazoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empleado  empleadoreemplazoTemp=null;

			for(Empleado empleadoreemplazoAux:empleadoreemplazosForeignKey) {
				if(empleadoreemplazoAux.getId()!=null && empleadoreemplazoAux.getId().equals(idEmpleadoReemplazoSeleccionado)) {
					empleadoreemplazoTemp=empleadoreemplazoAux;
					break;
				}
			}


			sDescripcion=EmpleadoConstantesFunciones.getEmpleadoDescripcion(empleadoreemplazoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpleadoReemplazoForeignKeyGenerico(Long idEmpleadoReemplazoSeleccionado,JComboBox jComboBoxid_empleado_reemplazoSolicitudHoraExtraGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoreemplazoTemp=null;

			for(Empleado empleadoreemplazoAux:empleadoreemplazosForeignKey) {
				if(empleadoreemplazoAux.getId()!=null && empleadoreemplazoAux.getId().equals(idEmpleadoReemplazoSeleccionado)) {
					empleadoreemplazoTemp=empleadoreemplazoAux;
					break;
				}
			}

			if(empleadoreemplazoTemp!=null) {
				jComboBoxid_empleado_reemplazoSolicitudHoraExtraGenerico.setSelectedItem(empleadoreemplazoTemp);
			} else {
				if(jComboBoxid_empleado_reemplazoSolicitudHoraExtraGenerico!=null && jComboBoxid_empleado_reemplazoSolicitudHoraExtraGenerico.getItemCount()>0) {
					jComboBoxid_empleado_reemplazoSolicitudHoraExtraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(SolicitudHoraExtra solicitudhoraextra,JComboBox jComboBoxid_empresaSolicitudHoraExtraGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaSolicitudHoraExtraGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empresaSolicitudHoraExtra.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaSolicitudHoraExtraGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				solicitudhoraextra.setid_empresa(empresaAux.getId());
				solicitudhoraextra.setempresa_descripcion(SolicitudHoraExtraConstantesFunciones.getEmpresaDescripcion(empresaAux));
				solicitudhoraextra.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(SolicitudHoraExtra solicitudhoraextra,JComboBox jComboBoxid_sucursalSolicitudHoraExtraGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalSolicitudHoraExtraGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_sucursalSolicitudHoraExtra.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalSolicitudHoraExtraGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				solicitudhoraextra.setid_sucursal(sucursalAux.getId());
				solicitudhoraextra.setsucursal_descripcion(SolicitudHoraExtraConstantesFunciones.getSucursalDescripcion(sucursalAux));
				solicitudhoraextra.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(SolicitudHoraExtra solicitudhoraextra,JComboBox jComboBoxid_empleadoSolicitudHoraExtraGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoSolicitudHoraExtraGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleadoSolicitudHoraExtra.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoSolicitudHoraExtraGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				solicitudhoraextra.setid_empleado(empleadoAux.getId());
				solicitudhoraextra.setempleado_descripcion(SolicitudHoraExtraConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				solicitudhoraextra.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(SolicitudHoraExtra solicitudhoraextra,JComboBox jComboBoxid_estructuraSolicitudHoraExtraGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraSolicitudHoraExtraGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estructuraSolicitudHoraExtra.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraSolicitudHoraExtraGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				solicitudhoraextra.setid_estructura(estructuraAux.getId());
				solicitudhoraextra.setestructura_descripcion(SolicitudHoraExtraConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				solicitudhoraextra.setEstructura(estructuraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoJefeForeignKey(SolicitudHoraExtra solicitudhoraextra,JComboBox jComboBoxid_empleado_jefeSolicitudHoraExtraGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleado_jefeSolicitudHoraExtraGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_jefeSolicitudHoraExtra.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleado_jefeSolicitudHoraExtraGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				solicitudhoraextra.setid_empleado_jefe(empleadoAux.getId());
				solicitudhoraextra.setempleadojefe_descripcion(SolicitudHoraExtraConstantesFunciones.getEmpleadoJefeDescripcion(empleadoAux));
				solicitudhoraextra.setEmpleadoJefe(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstadoSolicitudNomiForeignKey(SolicitudHoraExtra solicitudhoraextra,JComboBox jComboBoxid_estado_solicitud_nomiSolicitudHoraExtraGenerico)throws Exception
	{
		try
		{
			EstadoSolicitudNomi  estadosolicitudnomiAux=new EstadoSolicitudNomi();

			if(jComboBoxid_estado_solicitud_nomiSolicitudHoraExtraGenerico==null) {
				estadosolicitudnomiAux=(EstadoSolicitudNomi)this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra.getSelectedItem();
			} else {
				estadosolicitudnomiAux=(EstadoSolicitudNomi)jComboBoxid_estado_solicitud_nomiSolicitudHoraExtraGenerico.getSelectedItem();
			}

			if(estadosolicitudnomiAux!=null && estadosolicitudnomiAux.getId()!=null) {
				solicitudhoraextra.setid_estado_solicitud_nomi(estadosolicitudnomiAux.getId());
				solicitudhoraextra.setestadosolicitudnomi_descripcion(SolicitudHoraExtraConstantesFunciones.getEstadoSolicitudNomiDescripcion(estadosolicitudnomiAux));
				solicitudhoraextra.setEstadoSolicitudNomi(estadosolicitudnomiAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoReemplazoForeignKey(SolicitudHoraExtra solicitudhoraextra,JComboBox jComboBoxid_empleado_reemplazoSolicitudHoraExtraGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleado_reemplazoSolicitudHoraExtraGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_reemplazoSolicitudHoraExtra.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleado_reemplazoSolicitudHoraExtraGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				solicitudhoraextra.setid_empleado_reemplazo(empleadoAux.getId());
				solicitudhoraextra.setempleadoreemplazo_descripcion(SolicitudHoraExtraConstantesFunciones.getEmpleadoReemplazoDescripcion(empleadoAux));
				solicitudhoraextra.setEmpleadoReemplazo(empleadoAux);			}
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

					if(!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { 
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empresaSolicitudHoraExtra.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empresaSolicitudHoraExtra.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { 
					}

					if(!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { 
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_sucursalSolicitudHoraExtra.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_sucursalSolicitudHoraExtra.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { 
					}

					if(!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { 
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleadoSolicitudHoraExtra.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleadoSolicitudHoraExtra.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { 
					}

					if(!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoSolicitudHoraExtra.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoSolicitudHoraExtra.addItem(empleado);
							}
						}

						if(!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { 
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estructuraSolicitudHoraExtra.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estructuraSolicitudHoraExtra.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { 
					}

					if(!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraSolicitudHoraExtra.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraFK_IdEstructuraSolicitudHoraExtra.addItem(estructura);
							}
						}

						if(!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpleadoJefesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { 
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_jefeSolicitudHoraExtra.removeAllItems();

							for(Empleado empleadojefe:this.empleadojefesForeignKey) {
								this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_jefeSolicitudHoraExtra.addItem(empleadojefe);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { 
					}

					if(!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleadoJefe") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra.removeAllItems();

							for(Empleado empleadojefe:this.empleadojefesForeignKey) {
								this.jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra.addItem(empleadojefe);
							}
						}

						if(!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstadoSolicitudNomisForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstadoSolicitudNomi=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { 
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra.removeAllItems();

							for(EstadoSolicitudNomi estadosolicitudnomi:this.estadosolicitudnomisForeignKey) {
								this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra.addItem(estadosolicitudnomi);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { 
					}

					if(!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstadoSolicitudNomi") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra.removeAllItems();

							for(EstadoSolicitudNomi estadosolicitudnomi:this.estadosolicitudnomisForeignKey) {
								this.jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra.addItem(estadosolicitudnomi);
							}
						}

						if(!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpleadoReemplazosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { 
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_reemplazoSolicitudHoraExtra.removeAllItems();

							for(Empleado empleadoreemplazo:this.empleadoreemplazosForeignKey) {
								this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_reemplazoSolicitudHoraExtra.addItem(empleadoreemplazo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { 
					}

					if(!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleadoReemplazo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra.removeAllItems();

							for(Empleado empleadoreemplazo:this.empleadoreemplazosForeignKey) {
								this.jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra.addItem(empleadoreemplazo);
							}
						}

						if(!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empresaSolicitudHoraExtra.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empresaSolicitudHoraExtra.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_sucursalSolicitudHoraExtra.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_sucursalSolicitudHoraExtra.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleadoSolicitudHoraExtra.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleadoSolicitudHoraExtra.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoSolicitudHoraExtra.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoSolicitudHoraExtra.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estructuraSolicitudHoraExtra.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estructuraSolicitudHoraExtra.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraFK_IdEstructuraSolicitudHoraExtra.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraSolicitudHoraExtra.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpleadoJefeForeignKey(Empleado empleadojefe,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_jefeSolicitudHoraExtra.setSelectedItem(empleadojefe);
						}
					} else {
						if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_jefeSolicitudHoraExtra.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra.setSelectedItem(empleadojefe);
						} else {
							this.jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEstadoSolicitudNomiForeignKey(EstadoSolicitudNomi estadosolicitudnomi,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra.setSelectedItem(estadosolicitudnomi);
						}
					} else {
						if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra.setSelectedItem(estadosolicitudnomi);
						} else {
							this.jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpleadoReemplazoForeignKey(Empleado empleadoreemplazo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_reemplazoSolicitudHoraExtra.setSelectedItem(empleadoreemplazo);
						}
					} else {
						if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_reemplazoSolicitudHoraExtra.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra.setSelectedItem(empleadoreemplazo);
						} else {
							this.jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesSolicitudHoraExtra() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			SolicitudHoraExtraConstantesFunciones.refrescarForeignKeysDescripcionesSolicitudHoraExtra(this.solicitudhoraextraLogic.getSolicitudHoraExtras());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			SolicitudHoraExtraConstantesFunciones.refrescarForeignKeysDescripcionesSolicitudHoraExtra(this.solicitudhoraextras);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(Estructura.class));
		classes.add(new Classe(EstadoSolicitudNomi.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//solicitudhoraextraLogic.setSolicitudHoraExtras(this.solicitudhoraextras);
			solicitudhoraextraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public SolicitudHoraExtraParameterReturnGeneral getSolicitudHoraExtraParameterGeneral() {
		return this.solicitudhoraextraParameterGeneral;
	}
	
	public void setSolicitudHoraExtraParameterGeneral(SolicitudHoraExtraParameterReturnGeneral solicitudhoraextraParameterGeneral) {
		this.solicitudhoraextraParameterGeneral = solicitudhoraextraParameterGeneral;
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
	
	public Boolean getIsPermisoTodoSolicitudHoraExtra() {
		return isPermisoTodoSolicitudHoraExtra;
	}

	public void setIsPermisoTodoSolicitudHoraExtra(Boolean isPermisoTodoSolicitudHoraExtra) {
		this.isPermisoTodoSolicitudHoraExtra = isPermisoTodoSolicitudHoraExtra;
	}

	public Boolean getIsPermisoNuevoSolicitudHoraExtra() {
		return isPermisoNuevoSolicitudHoraExtra;
	}

	public void setIsPermisoNuevoSolicitudHoraExtra(Boolean isPermisoNuevoSolicitudHoraExtra) {
		this.isPermisoNuevoSolicitudHoraExtra = isPermisoNuevoSolicitudHoraExtra;
	}

	public Boolean getIsPermisoActualizarSolicitudHoraExtra() {
		return isPermisoActualizarSolicitudHoraExtra;
	}

	public void setIsPermisoActualizarSolicitudHoraExtra(Boolean isPermisoActualizarSolicitudHoraExtra) {
		this.isPermisoActualizarSolicitudHoraExtra = isPermisoActualizarSolicitudHoraExtra;
	}

	public Boolean getIsPermisoEliminarSolicitudHoraExtra() {
		return isPermisoEliminarSolicitudHoraExtra;
	}

	public void setIsPermisoEliminarSolicitudHoraExtra(Boolean isPermisoEliminarSolicitudHoraExtra) {
		this.isPermisoEliminarSolicitudHoraExtra = isPermisoEliminarSolicitudHoraExtra;
	}

	public Boolean getIsPermisoGuardarCambiosSolicitudHoraExtra() {
		return isPermisoGuardarCambiosSolicitudHoraExtra;
	}

	public void setIsPermisoGuardarCambiosSolicitudHoraExtra(Boolean isPermisoGuardarCambiosSolicitudHoraExtra) {
		this.isPermisoGuardarCambiosSolicitudHoraExtra = isPermisoGuardarCambiosSolicitudHoraExtra;
	}
	
	public Boolean getIsPermisoConsultaSolicitudHoraExtra() {
		return isPermisoConsultaSolicitudHoraExtra;
	}

	public void setIsPermisoConsultaSolicitudHoraExtra(Boolean isPermisoConsultaSolicitudHoraExtra) {
		this.isPermisoConsultaSolicitudHoraExtra = isPermisoConsultaSolicitudHoraExtra;
	}

	public Boolean getIsPermisoBusquedaSolicitudHoraExtra() {
		return isPermisoBusquedaSolicitudHoraExtra;
	}

	public void setIsPermisoBusquedaSolicitudHoraExtra(Boolean isPermisoBusquedaSolicitudHoraExtra) {
		this.isPermisoBusquedaSolicitudHoraExtra = isPermisoBusquedaSolicitudHoraExtra;
	}

	public Boolean getIsPermisoReporteSolicitudHoraExtra() {
		return isPermisoReporteSolicitudHoraExtra;
	}

	public void setIsPermisoReporteSolicitudHoraExtra(Boolean isPermisoReporteSolicitudHoraExtra) {
		this.isPermisoReporteSolicitudHoraExtra = isPermisoReporteSolicitudHoraExtra;
	}
	
	public Boolean getIsPermisoPaginacionMedioSolicitudHoraExtra() {
		return isPermisoPaginacionMedioSolicitudHoraExtra;
	}

	public void setIsPermisoPaginacionMedioSolicitudHoraExtra(Boolean isPermisoPaginacionMedioSolicitudHoraExtra) {
		this.isPermisoPaginacionMedioSolicitudHoraExtra = isPermisoPaginacionMedioSolicitudHoraExtra;
	}
	
	public Boolean getIsPermisoPaginacionTodoSolicitudHoraExtra() {
		return isPermisoPaginacionTodoSolicitudHoraExtra;
	}

	public void setIsPermisoPaginacionTodoSolicitudHoraExtra(Boolean isPermisoPaginacionTodoSolicitudHoraExtra) {
		this.isPermisoPaginacionTodoSolicitudHoraExtra = isPermisoPaginacionTodoSolicitudHoraExtra;
	}
	
	public Boolean getIsPermisoPaginacionAltoSolicitudHoraExtra() {
		return isPermisoPaginacionAltoSolicitudHoraExtra;
	}

	public void setIsPermisoPaginacionAltoSolicitudHoraExtra(Boolean isPermisoPaginacionAltoSolicitudHoraExtra) {
		this.isPermisoPaginacionAltoSolicitudHoraExtra = isPermisoPaginacionAltoSolicitudHoraExtra;
	}
	
	public Boolean getIsPermisoCopiarSolicitudHoraExtra() {
		return isPermisoCopiarSolicitudHoraExtra;
	}

	public void setIsPermisoCopiarSolicitudHoraExtra(Boolean isPermisoCopiarSolicitudHoraExtra) {
		this.isPermisoCopiarSolicitudHoraExtra = isPermisoCopiarSolicitudHoraExtra;
	}
	
	public Boolean getIsPermisoVerFormSolicitudHoraExtra() {
		return isPermisoVerFormSolicitudHoraExtra;
	}

	public void setIsPermisoVerFormSolicitudHoraExtra(Boolean isPermisoVerFormSolicitudHoraExtra) {
		this.isPermisoVerFormSolicitudHoraExtra = isPermisoVerFormSolicitudHoraExtra;
	}
	
	public Boolean getIsPermisoDuplicarSolicitudHoraExtra() {
		return isPermisoDuplicarSolicitudHoraExtra;
	}

	public void setIsPermisoDuplicarSolicitudHoraExtra(Boolean isPermisoDuplicarSolicitudHoraExtra) {
		this.isPermisoDuplicarSolicitudHoraExtra = isPermisoDuplicarSolicitudHoraExtra;
	}
	
	public Boolean getIsPermisoOrdenSolicitudHoraExtra() {
		return isPermisoOrdenSolicitudHoraExtra;
	}

	public void setIsPermisoOrdenSolicitudHoraExtra(Boolean isPermisoOrdenSolicitudHoraExtra) {
		this.isPermisoOrdenSolicitudHoraExtra = isPermisoOrdenSolicitudHoraExtra;
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
	
	public Boolean getIsVisibilidadCeldaNuevoSolicitudHoraExtra() {
		return isVisibilidadCeldaNuevoSolicitudHoraExtra;
	}

	public void setIsVisibilidadCeldaNuevoSolicitudHoraExtra(Boolean isVisibilidadCeldaNuevoSolicitudHoraExtra) {
		this.isVisibilidadCeldaNuevoSolicitudHoraExtra = isVisibilidadCeldaNuevoSolicitudHoraExtra;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarSolicitudHoraExtra() {
		return isVisibilidadCeldaDuplicarSolicitudHoraExtra;
	}

	public void setIsVisibilidadCeldaDuplicarSolicitudHoraExtra(Boolean isVisibilidadCeldaDuplicarSolicitudHoraExtra) {
		this.isVisibilidadCeldaDuplicarSolicitudHoraExtra = isVisibilidadCeldaDuplicarSolicitudHoraExtra;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarSolicitudHoraExtra() {
		return isVisibilidadCeldaCopiarSolicitudHoraExtra;
	}

	public void setIsVisibilidadCeldaCopiarSolicitudHoraExtra(Boolean isVisibilidadCeldaCopiarSolicitudHoraExtra) {
		this.isVisibilidadCeldaCopiarSolicitudHoraExtra = isVisibilidadCeldaCopiarSolicitudHoraExtra;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormSolicitudHoraExtra() {
		return isVisibilidadCeldaVerFormSolicitudHoraExtra;
	}

	public void setIsVisibilidadCeldaVerFormSolicitudHoraExtra(Boolean isVisibilidadCeldaVerFormSolicitudHoraExtra) {
		this.isVisibilidadCeldaVerFormSolicitudHoraExtra = isVisibilidadCeldaVerFormSolicitudHoraExtra;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenSolicitudHoraExtra() {
		return isVisibilidadCeldaOrdenSolicitudHoraExtra;
	}

	public void setIsVisibilidadCeldaOrdenSolicitudHoraExtra(Boolean isVisibilidadCeldaOrdenSolicitudHoraExtra) {
		this.isVisibilidadCeldaOrdenSolicitudHoraExtra = isVisibilidadCeldaOrdenSolicitudHoraExtra;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesSolicitudHoraExtra() {
		return isVisibilidadCeldaNuevoRelacionesSolicitudHoraExtra;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesSolicitudHoraExtra(Boolean isVisibilidadCeldaNuevoRelacionesSolicitudHoraExtra) {
		this.isVisibilidadCeldaNuevoRelacionesSolicitudHoraExtra = isVisibilidadCeldaNuevoRelacionesSolicitudHoraExtra;
	}
	
	public Boolean getIsVisibilidadCeldaModificarSolicitudHoraExtra() {
		return isVisibilidadCeldaModificarSolicitudHoraExtra;
	}

	public void setIsVisibilidadCeldaModificarSolicitudHoraExtra(Boolean isVisibilidadCeldaModificarSolicitudHoraExtra) {
		this.isVisibilidadCeldaModificarSolicitudHoraExtra = isVisibilidadCeldaModificarSolicitudHoraExtra;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarSolicitudHoraExtra() {
		return isVisibilidadCeldaActualizarSolicitudHoraExtra;
	}

	public void setIsVisibilidadCeldaActualizarSolicitudHoraExtra(Boolean isVisibilidadCeldaActualizarSolicitudHoraExtra) {
		this.isVisibilidadCeldaActualizarSolicitudHoraExtra = isVisibilidadCeldaActualizarSolicitudHoraExtra;
	}

	public Boolean getIsVisibilidadCeldaEliminarSolicitudHoraExtra() {
		return isVisibilidadCeldaEliminarSolicitudHoraExtra;
	}

	public void setIsVisibilidadCeldaEliminarSolicitudHoraExtra(Boolean isVisibilidadCeldaEliminarSolicitudHoraExtra) {
		this.isVisibilidadCeldaEliminarSolicitudHoraExtra = isVisibilidadCeldaEliminarSolicitudHoraExtra;
	}

	public Boolean getIsVisibilidadCeldaCancelarSolicitudHoraExtra() {
		return isVisibilidadCeldaCancelarSolicitudHoraExtra;
	}

	public void setIsVisibilidadCeldaCancelarSolicitudHoraExtra(Boolean isVisibilidadCeldaCancelarSolicitudHoraExtra) {
		this.isVisibilidadCeldaCancelarSolicitudHoraExtra = isVisibilidadCeldaCancelarSolicitudHoraExtra;
	}

	public Boolean getIsVisibilidadCeldaGuardarSolicitudHoraExtra() {
		return isVisibilidadCeldaGuardarSolicitudHoraExtra;
	}

	public void setIsVisibilidadCeldaGuardarSolicitudHoraExtra(Boolean isVisibilidadCeldaGuardarSolicitudHoraExtra) {
		this.isVisibilidadCeldaGuardarSolicitudHoraExtra = isVisibilidadCeldaGuardarSolicitudHoraExtra;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosSolicitudHoraExtra() {
		return isVisibilidadCeldaGuardarCambiosSolicitudHoraExtra;
	}

	public void setIsVisibilidadCeldaGuardarCambiosSolicitudHoraExtra(Boolean isVisibilidadCeldaGuardarCambiosSolicitudHoraExtra) {
		this.isVisibilidadCeldaGuardarCambiosSolicitudHoraExtra = isVisibilidadCeldaGuardarCambiosSolicitudHoraExtra;
	}
		
	public SolicitudHoraExtraSessionBean getsolicitudhoraextraSessionBean() {
		return this.solicitudhoraextraSessionBean;
	}
	
	public void setsolicitudhoraextraSessionBean(SolicitudHoraExtraSessionBean solicitudhoraextraSessionBean) {
		this.solicitudhoraextraSessionBean=solicitudhoraextraSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpleado() {
		return this.isVisibilidadFK_IdEmpleado;
	}

	public void setisVisibilidadFK_IdEmpleado(Boolean isVisibilidadFK_IdEmpleado) {
		this.isVisibilidadFK_IdEmpleado=isVisibilidadFK_IdEmpleado;
	}

	public Boolean getisVisibilidadFK_IdEmpleadoJefe() {
		return this.isVisibilidadFK_IdEmpleadoJefe;
	}

	public void setisVisibilidadFK_IdEmpleadoJefe(Boolean isVisibilidadFK_IdEmpleadoJefe) {
		this.isVisibilidadFK_IdEmpleadoJefe=isVisibilidadFK_IdEmpleadoJefe;
	}

	public Boolean getisVisibilidadFK_IdEmpleadoReemplazo() {
		return this.isVisibilidadFK_IdEmpleadoReemplazo;
	}

	public void setisVisibilidadFK_IdEmpleadoReemplazo(Boolean isVisibilidadFK_IdEmpleadoReemplazo) {
		this.isVisibilidadFK_IdEmpleadoReemplazo=isVisibilidadFK_IdEmpleadoReemplazo;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdEstadoSolicitudNomi() {
		return this.isVisibilidadFK_IdEstadoSolicitudNomi;
	}

	public void setisVisibilidadFK_IdEstadoSolicitudNomi(Boolean isVisibilidadFK_IdEstadoSolicitudNomi) {
		this.isVisibilidadFK_IdEstadoSolicitudNomi=isVisibilidadFK_IdEstadoSolicitudNomi;
	}

	public Boolean getisVisibilidadFK_IdEstructura() {
		return this.isVisibilidadFK_IdEstructura;
	}

	public void setisVisibilidadFK_IdEstructura(Boolean isVisibilidadFK_IdEstructura) {
		this.isVisibilidadFK_IdEstructura=isVisibilidadFK_IdEstructura;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(SolicitudHoraExtra solicitudhoraextra)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(solicitudhoraextra,null);
				this.setActualParaGuardarSucursalForeignKey(solicitudhoraextra,null);
				this.setActualParaGuardarEmpleadoForeignKey(solicitudhoraextra,null);
				this.setActualParaGuardarEstructuraForeignKey(solicitudhoraextra,null);
				this.setActualParaGuardarEmpleadoJefeForeignKey(solicitudhoraextra,null);
				this.setActualParaGuardarEstadoSolicitudNomiForeignKey(solicitudhoraextra,null);
				this.setActualParaGuardarEmpleadoReemplazoForeignKey(solicitudhoraextra,null);
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
	
	public void bugActualizarReferenciaActual(SolicitudHoraExtra solicitudhoraextra,SolicitudHoraExtra solicitudhoraextraAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalSolicitudHoraExtra(solicitudhoraextra);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		solicitudhoraextraAux.setId(solicitudhoraextra.getId());
		solicitudhoraextraAux.setVersionRow(solicitudhoraextra.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessSolicitudHoraExtra();
		
			int intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.solicitudhoraextra,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = solicitudhoraextraValidator.getInvalidValues(this.solicitudhoraextra);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			solicitudhoraextraLogic.setDatosCliente(datosCliente);
			solicitudhoraextraLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				solicitudhoraextraAux=new  SolicitudHoraExtra();
				
				solicitudhoraextraAux.setIsNew(true);
				solicitudhoraextraAux.setIsChanged(true);
				
				solicitudhoraextraAux.setSolicitudHoraExtraOriginal(this.solicitudhoraextra);
				
				solicitudhoraextraAux.setId(this.solicitudhoraextra.getId());	
				solicitudhoraextraAux.setVersionRow(this.solicitudhoraextra.getVersionRow());	
				solicitudhoraextraAux.setid_empresa(this.solicitudhoraextra.getid_empresa());	
				solicitudhoraextraAux.setid_sucursal(this.solicitudhoraextra.getid_sucursal());	
				solicitudhoraextraAux.setid_empleado(this.solicitudhoraextra.getid_empleado());	
				solicitudhoraextraAux.setid_estructura(this.solicitudhoraextra.getid_estructura());	
				solicitudhoraextraAux.setid_empleado_jefe(this.solicitudhoraextra.getid_empleado_jefe());	
				solicitudhoraextraAux.setid_estado_solicitud_nomi(this.solicitudhoraextra.getid_estado_solicitud_nomi());	
				solicitudhoraextraAux.setid_empleado_reemplazo(this.solicitudhoraextra.getid_empleado_reemplazo());	
				solicitudhoraextraAux.setsecuencial(this.solicitudhoraextra.getsecuencial());	
				solicitudhoraextraAux.setfecha_solicita(this.solicitudhoraextra.getfecha_solicita());	
				solicitudhoraextraAux.setfecha_ejecuta(this.solicitudhoraextra.getfecha_ejecuta());	
				solicitudhoraextraAux.setnumero_horas(this.solicitudhoraextra.getnumero_horas());	
				solicitudhoraextraAux.setcosto_unitario(this.solicitudhoraextra.getcosto_unitario());	
				solicitudhoraextraAux.setcosto_total(this.solicitudhoraextra.getcosto_total());	
				solicitudhoraextraAux.setdescripcion(this.solicitudhoraextra.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.solicitudhoraextraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.solicitudhoraextraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(solicitudhoraextraAux,solicitudhoraextraLogic.getSolicitudHoraExtras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(solicitudhoraextraAux,solicitudhoraextras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.solicitudhoraextraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.solicitudhoraextraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudhoraextraLogic.saveSolicitudHoraExtras();//WithConnection
						//solicitudhoraextraLogic.getSetVersionRowSolicitudHoraExtras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.solicitudhoraextra,solicitudhoraextraAux);
					
					this.refrescarForeignKeysDescripcionesSolicitudHoraExtra();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.solicitudhoraextraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								solicitudhoraextraLogic.saveSolicitudHoraExtraRelaciones(solicitudhoraextraAux);//WithConnection
								//solicitudhoraextraLogic.getSetVersionRowSolicitudHoraExtras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.solicitudhoraextra,solicitudhoraextraAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.solicitudhoraextraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.solicitudhoraextraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(solicitudhoraextraAux,solicitudhoraextraLogic.getSolicitudHoraExtras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(solicitudhoraextraAux,solicitudhoraextras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.solicitudhoraextra,solicitudhoraextraAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				solicitudhoraextraAux=new  SolicitudHoraExtra();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.solicitudhoraextraSessionBean.getEsGuardarRelacionado() 
					|| (this.solicitudhoraextraSessionBean.getEsGuardarRelacionado() && this.solicitudhoraextra.getId()>=0)) {
						
					solicitudhoraextraAux.setIsNew(false);
				}
				
				solicitudhoraextraAux.setIsDeleted(false);
			
				solicitudhoraextraAux.setId(this.solicitudhoraextra.getId());	
				solicitudhoraextraAux.setVersionRow(this.solicitudhoraextra.getVersionRow());	
				solicitudhoraextraAux.setid_empresa(this.solicitudhoraextra.getid_empresa());	
				solicitudhoraextraAux.setid_sucursal(this.solicitudhoraextra.getid_sucursal());	
				solicitudhoraextraAux.setid_empleado(this.solicitudhoraextra.getid_empleado());	
				solicitudhoraextraAux.setid_estructura(this.solicitudhoraextra.getid_estructura());	
				solicitudhoraextraAux.setid_empleado_jefe(this.solicitudhoraextra.getid_empleado_jefe());	
				solicitudhoraextraAux.setid_estado_solicitud_nomi(this.solicitudhoraextra.getid_estado_solicitud_nomi());	
				solicitudhoraextraAux.setid_empleado_reemplazo(this.solicitudhoraextra.getid_empleado_reemplazo());	
				solicitudhoraextraAux.setsecuencial(this.solicitudhoraextra.getsecuencial());	
				solicitudhoraextraAux.setfecha_solicita(this.solicitudhoraextra.getfecha_solicita());	
				solicitudhoraextraAux.setfecha_ejecuta(this.solicitudhoraextra.getfecha_ejecuta());	
				solicitudhoraextraAux.setnumero_horas(this.solicitudhoraextra.getnumero_horas());	
				solicitudhoraextraAux.setcosto_unitario(this.solicitudhoraextra.getcosto_unitario());	
				solicitudhoraextraAux.setcosto_total(this.solicitudhoraextra.getcosto_total());	
				solicitudhoraextraAux.setdescripcion(this.solicitudhoraextra.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(solicitudhoraextraAux,solicitudhoraextraLogic.getSolicitudHoraExtras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(solicitudhoraextraAux,solicitudhoraextras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.solicitudhoraextraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.solicitudhoraextraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudhoraextraLogic.saveSolicitudHoraExtras();//WithConnection
						//solicitudhoraextraLogic.getSetVersionRowSolicitudHoraExtras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.solicitudhoraextra,solicitudhoraextraAux);
					
					this.refrescarForeignKeysDescripcionesSolicitudHoraExtra();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.solicitudhoraextraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								solicitudhoraextraLogic.saveSolicitudHoraExtraRelaciones(solicitudhoraextraAux);//WithConnection
								//solicitudhoraextraLogic.getSetVersionRowSolicitudHoraExtras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.solicitudhoraextra,solicitudhoraextraAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.solicitudhoraextraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.solicitudhoraextraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(solicitudhoraextraAux,solicitudhoraextraLogic.getSolicitudHoraExtras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(solicitudhoraextraAux,solicitudhoraextras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.solicitudhoraextra,solicitudhoraextraAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				solicitudhoraextraAux=new  SolicitudHoraExtra();
				
				solicitudhoraextraAux.setIsNew(false);
				solicitudhoraextraAux.setIsChanged(false);
				
				solicitudhoraextraAux.setIsDeleted(true);
				
				solicitudhoraextraAux.setId(this.solicitudhoraextra.getId());	
				solicitudhoraextraAux.setVersionRow(this.solicitudhoraextra.getVersionRow());	
				solicitudhoraextraAux.setid_empresa(this.solicitudhoraextra.getid_empresa());	
				solicitudhoraextraAux.setid_sucursal(this.solicitudhoraextra.getid_sucursal());	
				solicitudhoraextraAux.setid_empleado(this.solicitudhoraextra.getid_empleado());	
				solicitudhoraextraAux.setid_estructura(this.solicitudhoraextra.getid_estructura());	
				solicitudhoraextraAux.setid_empleado_jefe(this.solicitudhoraextra.getid_empleado_jefe());	
				solicitudhoraextraAux.setid_estado_solicitud_nomi(this.solicitudhoraextra.getid_estado_solicitud_nomi());	
				solicitudhoraextraAux.setid_empleado_reemplazo(this.solicitudhoraextra.getid_empleado_reemplazo());	
				solicitudhoraextraAux.setsecuencial(this.solicitudhoraextra.getsecuencial());	
				solicitudhoraextraAux.setfecha_solicita(this.solicitudhoraextra.getfecha_solicita());	
				solicitudhoraextraAux.setfecha_ejecuta(this.solicitudhoraextra.getfecha_ejecuta());	
				solicitudhoraextraAux.setnumero_horas(this.solicitudhoraextra.getnumero_horas());	
				solicitudhoraextraAux.setcosto_unitario(this.solicitudhoraextra.getcosto_unitario());	
				solicitudhoraextraAux.setcosto_total(this.solicitudhoraextra.getcosto_total());	
				solicitudhoraextraAux.setdescripcion(this.solicitudhoraextra.getdescripcion());	
				
				if(this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.solicitudhoraextraAux.getId()>=0) {	
						this.solicitudhoraextrasEliminados.add(solicitudhoraextraAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(solicitudhoraextraAux,solicitudhoraextraLogic.getSolicitudHoraExtras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(solicitudhoraextraAux,solicitudhoraextras);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.solicitudhoraextraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.solicitudhoraextraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudhoraextraLogic.saveSolicitudHoraExtras();//WithConnection
						//solicitudhoraextraLogic.getSetVersionRowSolicitudHoraExtras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.solicitudhoraextraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								solicitudhoraextraLogic.saveSolicitudHoraExtraRelaciones(solicitudhoraextraAux);//WithConnection
								//solicitudhoraextraLogic.getSetVersionRowSolicitudHoraExtras();//WithConnection
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
							if(this.solicitudhoraextraSessionBean.getEstaModoGuardarRelaciones() 
								|| this.solicitudhoraextraSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(solicitudhoraextraAux,solicitudhoraextraLogic.getSolicitudHoraExtras());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(solicitudhoraextraAux,solicitudhoraextras);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.getSolicitudHoraExtras().addAll(this.solicitudhoraextrasEliminados);
					
					solicitudhoraextraLogic.saveSolicitudHoraExtras();//WithConnection
					//solicitudhoraextraLogic.getSetVersionRowSolicitudHoraExtras();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesSolicitudHoraExtra();
				
				this.solicitudhoraextrasEliminados= new ArrayList<SolicitudHoraExtra>();		
			}
			
			if(this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Solicitud Hora Extra GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Solicitud Hora Extra",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.solicitudhoraextra=solicitudhoraextraAux;
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
      		//this.finishProcessSolicitudHoraExtra();
      	}
		
	}	
	
	public void actualizarRelaciones(SolicitudHoraExtra solicitudhoraextraLocal) throws Exception {
		
		if(this.solicitudhoraextraSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(SolicitudHoraExtra solicitudhoraextraLocal) throws Exception {	
		if(this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				solicitudhoraextraLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				solicitudhoraextraLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				solicitudhoraextraLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				solicitudhoraextraLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadojefeBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadojefeBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadojefeBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadojefeBeanSwingJInternalFrameLocal.actualizarLista(empleadojefeBeanSwingJInternalFrameLocal.empleado,this.empleadojefesForeignKey);

				empleadojefeBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadojefeBeanSwingJInternalFrameLocal.empleado);

				solicitudhoraextraLocal.setEmpleadoJefe(empleadojefeBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleadoJefe();
				this.cargarCombosFrameEmpleadoJefesForeignKey("Formulario");
				this.setActualEmpleadoJefeForeignKey(empleadojefeBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstadoSolicitudNomiDetalleFormJInternalFrame.class)) {
				EstadoSolicitudNomiBeanSwingJInternalFrame estadosolicitudnomiBeanSwingJInternalFrameLocal=(EstadoSolicitudNomiBeanSwingJInternalFrame) ((EstadoSolicitudNomiDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estadosolicitudnomiBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstadoSolicitudNomi(estadosolicitudnomiBeanSwingJInternalFrameLocal.getestadosolicitudnomi(),true);
				estadosolicitudnomiBeanSwingJInternalFrameLocal.actualizarLista(estadosolicitudnomiBeanSwingJInternalFrameLocal.estadosolicitudnomi,this.estadosolicitudnomisForeignKey);

				estadosolicitudnomiBeanSwingJInternalFrameLocal.actualizarRelaciones(estadosolicitudnomiBeanSwingJInternalFrameLocal.estadosolicitudnomi);

				solicitudhoraextraLocal.setEstadoSolicitudNomi(estadosolicitudnomiBeanSwingJInternalFrameLocal.estadosolicitudnomi);

				this.addItemDefectoCombosForeignKeyEstadoSolicitudNomi();
				this.cargarCombosFrameEstadoSolicitudNomisForeignKey("Formulario");
				this.setActualEstadoSolicitudNomiForeignKey(estadosolicitudnomiBeanSwingJInternalFrameLocal.estadosolicitudnomi.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoreemplazoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoreemplazoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoreemplazoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoreemplazoBeanSwingJInternalFrameLocal.actualizarLista(empleadoreemplazoBeanSwingJInternalFrameLocal.empleado,this.empleadoreemplazosForeignKey);

				empleadoreemplazoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoreemplazoBeanSwingJInternalFrameLocal.empleado);

				solicitudhoraextraLocal.setEmpleadoReemplazo(empleadoreemplazoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleadoReemplazo();
				this.cargarCombosFrameEmpleadoReemplazosForeignKey("Formulario");
				this.setActualEmpleadoReemplazoForeignKey(empleadoreemplazoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarSolicitudHoraExtraActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = solicitudhoraextraValidator.getInvalidValues(this.solicitudhoraextra);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(SolicitudHoraExtra solicitudhoraextra,List<SolicitudHoraExtra> solicitudhoraextras) throws Exception {
		try	{		
			SolicitudHoraExtraConstantesFunciones.actualizarLista(solicitudhoraextra,solicitudhoraextras,this.solicitudhoraextraSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(SolicitudHoraExtra solicitudhoraextra,List<SolicitudHoraExtra> solicitudhoraextras) throws Exception {
		try	{			
			SolicitudHoraExtraConstantesFunciones.actualizarSelectedLista(solicitudhoraextra,solicitudhoraextras);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<SolicitudHoraExtra> solicitudhoraextrasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				solicitudhoraextrasLocal=this.solicitudhoraextraLogic.getSolicitudHoraExtras();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				solicitudhoraextrasLocal=this.solicitudhoraextras;
			}
			//ARCHITECTURE
		
			for(SolicitudHoraExtra solicitudhoraextraLocal:solicitudhoraextrasLocal) {
				if(this.permiteMantenimiento(solicitudhoraextraLocal) && solicitudhoraextraLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+SolicitudHoraExtraConstantesFunciones.getSolicitudHoraExtraLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(SolicitudHoraExtraConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelid_empresaSolicitudHoraExtra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudHoraExtraConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelid_sucursalSolicitudHoraExtra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudHoraExtraConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelid_empleadoSolicitudHoraExtra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudHoraExtraConstantesFunciones.IDESTRUCTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelid_estructuraSolicitudHoraExtra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudHoraExtraConstantesFunciones.IDEMPLEADOJEFE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelid_empleado_jefeSolicitudHoraExtra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudHoraExtraConstantesFunciones.IDESTADOSOLICITUDNOMI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelid_estado_solicitud_nomiSolicitudHoraExtra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudHoraExtraConstantesFunciones.IDEMPLEADOREEMPLAZO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelid_empleado_reemplazoSolicitudHoraExtra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudHoraExtraConstantesFunciones.SECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelsecuencialSolicitudHoraExtra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudHoraExtraConstantesFunciones.FECHASOLICITA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelfecha_solicitaSolicitudHoraExtra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudHoraExtraConstantesFunciones.FECHAEJECUTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelfecha_ejecutaSolicitudHoraExtra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudHoraExtraConstantesFunciones.NUMEROHORAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelnumero_horasSolicitudHoraExtra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudHoraExtraConstantesFunciones.COSTOUNITARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelcosto_unitarioSolicitudHoraExtra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudHoraExtraConstantesFunciones.COSTOTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelcosto_totalSolicitudHoraExtra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudHoraExtraConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabeldescripcionSolicitudHoraExtra,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelid_empresaSolicitudHoraExtra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelid_sucursalSolicitudHoraExtra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelid_empleadoSolicitudHoraExtra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelid_estructuraSolicitudHoraExtra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelid_empleado_jefeSolicitudHoraExtra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelid_estado_solicitud_nomiSolicitudHoraExtra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelid_empleado_reemplazoSolicitudHoraExtra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelsecuencialSolicitudHoraExtra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelfecha_solicitaSolicitudHoraExtra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelfecha_ejecutaSolicitudHoraExtra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelnumero_horasSolicitudHoraExtra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelcosto_unitarioSolicitudHoraExtra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelcosto_totalSolicitudHoraExtra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabeldescripcionSolicitudHoraExtra,"");
		
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
		this.iIdNuevoSolicitudHoraExtra--;	
		
		
		this.solicitudhoraextraAux=new SolicitudHoraExtra();
		
		this.solicitudhoraextraAux.setId(this.iIdNuevoSolicitudHoraExtra);
		this.solicitudhoraextraAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.solicitudhoraextraLogic.getSolicitudHoraExtras().add(this.solicitudhoraextraAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.solicitudhoraextras.add(this.solicitudhoraextraAux);
		}
		//ARCHITECTURE
		
		this.solicitudhoraextra=this.solicitudhoraextraAux;
		
		if(SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioSolicitudHoraExtra(this.solicitudhoraextra);
			this.setVariablesObjetoActualToFormularioForeignKeySolicitudHoraExtra(this.solicitudhoraextra);
		}
				
		//this.setDefaultControlesSolicitudHoraExtra();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeySolicitudHoraExtra();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeySolicitudHoraExtra();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeySolicitudHoraExtra();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSolicitudHoraExtra(this.solicitudhoraextraBean,this.solicitudhoraextra,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.solicitudhoraextraSessionBean.getConGuardarRelaciones()) {
			classes=SolicitudHoraExtraConstantesFunciones.getClassesRelationshipsOfSolicitudHoraExtra(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.solicitudhoraextraReturnGeneral=solicitudhoraextraLogic.procesarEventosSolicitudHoraExtrasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.solicitudhoraextraLogic.getSolicitudHoraExtras(),this.solicitudhoraextra,this.solicitudhoraextraParameterGeneral,this.isEsNuevoSolicitudHoraExtra,classes);//this.solicitudhoraextraLogic.getSolicitudHoraExtra()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanSolicitudHoraExtra(this.solicitudhoraextraReturnGeneral,this.solicitudhoraextraBean,false);
		
		if(this.solicitudhoraextraReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeySolicitudHoraExtra(this.solicitudhoraextraReturnGeneral.getSolicitudHoraExtra());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioSolicitudHoraExtra(this.solicitudhoraextraReturnGeneral.getSolicitudHoraExtra());
		}
		
		if(this.solicitudhoraextraReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioSolicitudHoraExtra(this.solicitudhoraextraReturnGeneral.getSolicitudHoraExtra(),classes);//this.solicitudhoraextraBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.solicitudhoraextra,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeySolicitudHoraExtra();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeySolicitudHoraExtra();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SolicitudHoraExtraBeanSwingJInternalFrameAdditional.RecargarFormSolicitudHoraExtra(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingSolicitudHoraExtra(false);
						
			if(solicitudhoraextraSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSolicitudHoraExtra();
			}
			
			this.actualizarVisualTableDatosSolicitudHoraExtra();
			
			this.jTableDatosSolicitudHoraExtra.setRowSelectionInterval(this.getIndiceNuevoSolicitudHoraExtra(), this.getIndiceNuevoSolicitudHoraExtra());
			
			this.seleccionarFilaTablaSolicitudHoraExtraActual();
						
			this.actualizarEstadoCeldasBotonesSolicitudHoraExtra("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesSolicitudHoraExtra(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldsecuencialSolicitudHoraExtra.setEnabled(isHabilitar && this.solicitudhoraextraConstantesFunciones.activarsecuencialSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jDateChooserfecha_solicitaSolicitudHoraExtra.setEnabled(isHabilitar && this.solicitudhoraextraConstantesFunciones.activarfecha_solicitaSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jDateChooserfecha_ejecutaSolicitudHoraExtra.setEnabled(isHabilitar && this.solicitudhoraextraConstantesFunciones.activarfecha_ejecutaSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldnumero_horasSolicitudHoraExtra.setEnabled(isHabilitar && this.solicitudhoraextraConstantesFunciones.activarnumero_horasSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldcosto_unitarioSolicitudHoraExtra.setEnabled(isHabilitar && this.solicitudhoraextraConstantesFunciones.activarcosto_unitarioSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldcosto_totalSolicitudHoraExtra.setEnabled(isHabilitar && this.solicitudhoraextraConstantesFunciones.activarcosto_totalSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextAreadescripcionSolicitudHoraExtra.setEnabled(isHabilitar && this.solicitudhoraextraConstantesFunciones.activardescripcionSolicitudHoraExtra);	
		//
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empresaSolicitudHoraExtra.setEnabled(isHabilitar && this.solicitudhoraextraConstantesFunciones.activarid_empresaSolicitudHoraExtra);//
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_sucursalSolicitudHoraExtra.setEnabled(isHabilitar && this.solicitudhoraextraConstantesFunciones.activarid_sucursalSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleadoSolicitudHoraExtra.setEnabled(isHabilitar && this.solicitudhoraextraConstantesFunciones.activarid_empleadoSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estructuraSolicitudHoraExtra.setEnabled(isHabilitar && this.solicitudhoraextraConstantesFunciones.activarid_estructuraSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_jefeSolicitudHoraExtra.setEnabled(isHabilitar && this.solicitudhoraextraConstantesFunciones.activarid_empleado_jefeSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra.setEnabled(isHabilitar && this.solicitudhoraextraConstantesFunciones.activarid_estado_solicitud_nomiSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_reemplazoSolicitudHoraExtra.setEnabled(isHabilitar && this.solicitudhoraextraConstantesFunciones.activarid_empleado_reemplazoSolicitudHoraExtra);
	};
	
	public void setDefaultControlesSolicitudHoraExtra() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoSolicitudHoraExtra(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.solicitudhoraextraSessionBean.setConGuardarRelaciones(true);			
			this.solicitudhoraextraSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jTabbedPaneRelacionesSolicitudHoraExtra.setVisible(true);
			
					
		} else {
			//this.solicitudhoraextraSessionBean.setConGuardarRelaciones(false);			
			this.solicitudhoraextraSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jTabbedPaneRelacionesSolicitudHoraExtra.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoSolicitudHoraExtra() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SolicitudHoraExtra solicitudhoraextraAux:this.solicitudhoraextraLogic.getSolicitudHoraExtras()) {
				if(solicitudhoraextraAux.getId().equals(this.iIdNuevoSolicitudHoraExtra)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SolicitudHoraExtra solicitudhoraextraAux:this.solicitudhoraextras) {
				if(solicitudhoraextraAux.getId().equals(this.iIdNuevoSolicitudHoraExtra)) {
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
	
	public int getIndiceActualSolicitudHoraExtra(SolicitudHoraExtra solicitudhoraextra,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SolicitudHoraExtra solicitudhoraextraAux:this.solicitudhoraextraLogic.getSolicitudHoraExtras()) {
				if(solicitudhoraextraAux.getId().equals(solicitudhoraextra.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SolicitudHoraExtra solicitudhoraextraAux:this.solicitudhoraextras) {
				if(solicitudhoraextraAux.getId().equals(solicitudhoraextra.getId())) {
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
	
	public void setCamposBaseDesdeOriginalSolicitudHoraExtra(SolicitudHoraExtra solicitudhoraextraOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SolicitudHoraExtra solicitudhoraextraAux:this.solicitudhoraextraLogic.getSolicitudHoraExtras()) {
				if(solicitudhoraextraAux.getSolicitudHoraExtraOriginal().getId().equals(solicitudhoraextraOriginal.getId())) {
					existe=true;
					solicitudhoraextraOriginal.setId(solicitudhoraextraAux.getId());
					solicitudhoraextraOriginal.setVersionRow(solicitudhoraextraAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SolicitudHoraExtra solicitudhoraextraAux:this.solicitudhoraextras) {
				if(solicitudhoraextraAux.getSolicitudHoraExtraOriginal().getId().equals(solicitudhoraextraOriginal.getId())) {
					existe=true;
					solicitudhoraextraOriginal.setId(solicitudhoraextraAux.getId());
					solicitudhoraextraOriginal.setVersionRow(solicitudhoraextraAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosSolicitudHoraExtra(Boolean esParaCancelar) throws Exception {
		solicitudhoraextrasAux=new ArrayList<SolicitudHoraExtra>();
		solicitudhoraextraAux=new SolicitudHoraExtra();
		
		if(!this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SolicitudHoraExtra solicitudhoraextraAux:this.solicitudhoraextraLogic.getSolicitudHoraExtras()) {
					if(solicitudhoraextraAux.getId()<0) {
						solicitudhoraextrasAux.add(solicitudhoraextraAux);
					}		
				}
				this.iIdNuevoSolicitudHoraExtra=0L;
				this.solicitudhoraextraLogic.getSolicitudHoraExtras().removeAll(solicitudhoraextrasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SolicitudHoraExtra solicitudhoraextraAux:this.solicitudhoraextras) {
					if(solicitudhoraextraAux.getId()<0) {
						solicitudhoraextrasAux.add(solicitudhoraextraAux);
					}		
				}
				this.iIdNuevoSolicitudHoraExtra=0L;
				this.solicitudhoraextras.removeAll(solicitudhoraextrasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoSolicitudHoraExtra 
					&& this.solicitudhoraextraLogic.getSolicitudHoraExtras().size()>0
					) {
					solicitudhoraextraAux=this.solicitudhoraextraLogic.getSolicitudHoraExtras().get(this.solicitudhoraextraLogic.getSolicitudHoraExtras().size() - 1);
				
					if(solicitudhoraextraAux.getId()<0) {
						this.solicitudhoraextraLogic.getSolicitudHoraExtras().remove(solicitudhoraextraAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoSolicitudHoraExtra && this.solicitudhoraextras.size()>0) {
					solicitudhoraextraAux=this.solicitudhoraextras.get(this.solicitudhoraextras.size() - 1);
				
					if(solicitudhoraextraAux.getId()<0) {
						this.solicitudhoraextras.remove(solicitudhoraextraAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoSolicitudHoraExtra(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(solicitudhoraextra.getId()<0) {
				this.solicitudhoraextraLogic.getSolicitudHoraExtras().remove(this.solicitudhoraextra);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(solicitudhoraextra.getId()<0) {
				this.solicitudhoraextras.remove(this.solicitudhoraextra);
			}
		}			
	}
	
	public void setEstadosInicialesSolicitudHoraExtra(List<SolicitudHoraExtra> solicitudhoraextrasAux) throws Exception {
		SolicitudHoraExtraConstantesFunciones.setEstadosInicialesSolicitudHoraExtra(solicitudhoraextrasAux);
	}
	
	public void setEstadosInicialesSolicitudHoraExtra(SolicitudHoraExtra solicitudhoraextraAux) throws Exception {
		SolicitudHoraExtraConstantesFunciones.setEstadosInicialesSolicitudHoraExtra(solicitudhoraextraAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarSolicitudHoraExtraActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesSolicitudHoraExtra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarSolicitudHoraExtraActual()) {
				if(!this.isEsNuevoSolicitudHoraExtra) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesSolicitudHoraExtra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoSolicitudHoraExtra=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarSolicitudHoraExtraActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Solicitud Hora Extra ?", "MANTENIMIENTO DE Solicitud Hora Extra", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesSolicitudHoraExtra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(SolicitudHoraExtra solicitudhoraextra) throws Exception {
		SolicitudHoraExtraConstantesFunciones.seleccionarAsignar(this.solicitudhoraextra,solicitudhoraextra);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarSolicitudHoraExtra=this.isPermisoActualizarOriginalSolicitudHoraExtra;
			
			
			this.seleccionarAsignar(solicitudhoraextra);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SolicitudHoraExtraConstantesFunciones.quitarEspaciosSolicitudHoraExtra(this.solicitudhoraextra,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesSolicitudHoraExtra("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.solicitudhoraextraSessionBean.setsFuncionBusquedaRapida(this.solicitudhoraextraSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoSolicitudHoraExtra) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosSolicitudHoraExtra(esParaCancelar);				
				this.cancelarNuevoSolicitudHoraExtra(esParaCancelar);								
			}
			
			this.solicitudhoraextra=new SolicitudHoraExtra();
			
			this.inicializarSolicitudHoraExtra();
			
			this.actualizarEstadoCeldasBotonesSolicitudHoraExtra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarSolicitudHoraExtra() throws Exception {
		try {
			SolicitudHoraExtraConstantesFunciones.inicializarSolicitudHoraExtra(this.solicitudhoraextra);
			
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
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.solicitudhoraextraLogic.getSolicitudHoraExtras().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteSolicitudHoraExtras(String sAccionBusqueda,List<SolicitudHoraExtra> solicitudhoraextrasParaReportes) throws Exception {
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
					sPathReporteFinal="SolicitudHoraExtra"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="SolicitudHoraExtraMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("SolicitudHoraExtraMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="SolicitudHoraExtra"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Solicitud Hora Extras");		
		parameters.put("busquedapor", SolicitudHoraExtraConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceSolicitudHoraExtra=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			SolicitudHoraExtraConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			SolicitudHoraExtraConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceSolicitudHoraExtra=new JRBeanArrayDataSource(SolicitudHoraExtraJInternalFrame.TraerSolicitudHoraExtraBeans(solicitudhoraextrasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceSolicitudHoraExtra);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+SolicitudHoraExtraConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+SolicitudHoraExtraConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(SolicitudHoraExtraBean.TraerSolicitudHoraExtraBeans(solicitudhoraextrasParaReportes).toArray()));
							
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
				this.generarExcelReporteSolicitudHoraExtras(sAccionBusqueda,sTipoArchivoReporte,solicitudhoraextrasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalSolicitudHoraExtras(sAccionBusqueda,sTipoArchivoReporte,solicitudhoraextrasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoSolicitudHoraExtraActionPerformed(null);
					//this.generarExcelReporteSolicitudHoraExtras(sAccionBusqueda,sTipoArchivoReporte,solicitudhoraextrasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalSolicitudHoraExtras(sAccionBusqueda,sTipoArchivoReporte,solicitudhoraextrasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesSolicitudHoraExtras(sAccionBusqueda,sTipoArchivoReporte,solicitudhoraextrasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesSolicitudHoraExtras(sAccionBusqueda,sTipoArchivoReporte,solicitudhoraextrasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteSolicitudHoraExtras(String sAccionBusqueda,String sTipoArchivoReporte,List<SolicitudHoraExtra> solicitudhoraextrasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"solicitudhoraextra";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SolicitudHoraExtras");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSolicitudHoraExtra("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(SolicitudHoraExtra solicitudhoraextra : solicitudhoraextrasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			SolicitudHoraExtraConstantesFunciones.generarExcelReporteDataSolicitudHoraExtra("NORMAL",row,workbook,solicitudhoraextra,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Solicitud Hora Extra",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderSolicitudHoraExtra(String sTipo,Row row,Workbook workbook) {
		
		SolicitudHoraExtraConstantesFunciones.generarExcelReporteHeaderSolicitudHoraExtra(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalSolicitudHoraExtras(String sAccionBusqueda,String sTipoArchivoReporte,List<SolicitudHoraExtra> solicitudhoraextrasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"solicitudhoraextra_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SolicitudHoraExtras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(SolicitudHoraExtra solicitudhoraextra : solicitudhoraextrasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(SolicitudHoraExtraConstantesFunciones.getSolicitudHoraExtraDescripcion(solicitudhoraextra));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudhoraextra.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudHoraExtraConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudhoraextra.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudhoraextra.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudHoraExtraConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudhoraextra.getestructura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOJEFE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOJEFE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudhoraextra.getempleadojefe_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudHoraExtraConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudhoraextra.getestadosolicitudnomi_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudhoraextra.getempleadoreemplazo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudHoraExtraConstantesFunciones.LABEL_SECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_SECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudhoraextra.getsecuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudHoraExtraConstantesFunciones.LABEL_FECHASOLICITA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_FECHASOLICITA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudhoraextra.getfecha_solicita());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudHoraExtraConstantesFunciones.LABEL_FECHAEJECUTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_FECHAEJECUTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudhoraextra.getfecha_ejecuta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudHoraExtraConstantesFunciones.LABEL_NUMEROHORAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_NUMEROHORAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudhoraextra.getnumero_horas());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudHoraExtraConstantesFunciones.LABEL_COSTOUNITARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_COSTOUNITARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudhoraextra.getcosto_unitario());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudHoraExtraConstantesFunciones.LABEL_COSTOTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_COSTOTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudhoraextra.getcosto_total());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudHoraExtraConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudhoraextra.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Solicitud Hora Extra",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesSolicitudHoraExtras(String sAccionBusqueda,String sTipoArchivoReporte,List<SolicitudHoraExtra> solicitudhoraextrasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<SolicitudHoraExtra> solicitudhoraextrasRespaldo=null;
		
		classes=SolicitudHoraExtraConstantesFunciones.getClassesRelationshipsOfSolicitudHoraExtra(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.solicitudhoraextraLogic.setDatosCliente(this.datosCliente);
		this.solicitudhoraextraLogic.setDatosDeep(this.datosDeep);
		this.solicitudhoraextraLogic.setIsConDeep(true);
		
		solicitudhoraextrasRespaldo=this.solicitudhoraextraLogic.getSolicitudHoraExtras();
		
		this.solicitudhoraextraLogic.setSolicitudHoraExtras(solicitudhoraextrasParaReportes);	
		this.solicitudhoraextraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		solicitudhoraextrasParaReportes=this.solicitudhoraextraLogic.getSolicitudHoraExtras();
		this.solicitudhoraextraLogic.setSolicitudHoraExtras(solicitudhoraextrasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"solicitudhoraextra_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SolicitudHoraExtras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSolicitudHoraExtra("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(SolicitudHoraExtra solicitudhoraextra : solicitudhoraextrasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderSolicitudHoraExtra("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			SolicitudHoraExtraConstantesFunciones.generarExcelReporteDataSolicitudHoraExtra("NORMAL",row,workbook,solicitudhoraextra,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(SolicitudHoraExtraConstantesFunciones.getSolicitudHoraExtraDescripcion(solicitudhoraextra));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Solicitud Hora Extra",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessSolicitudHoraExtra() throws Exception {		
		this.startProcessSolicitudHoraExtra(true);
	}
	
	public void startProcessSolicitudHoraExtra(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasSolicitudHoraExtra ,this.jPanelParametrosReportesSolicitudHoraExtra, this.jScrollPanelDatosSolicitudHoraExtra,this.jPanelPaginacionSolicitudHoraExtra, this.jScrollPanelDatosEdicionSolicitudHoraExtra, this.jPanelAccionesSolicitudHoraExtra,this.jPanelAccionesFormularioSolicitudHoraExtra,this.jmenuBarSolicitudHoraExtra,this.jmenuBarDetalleSolicitudHoraExtra,this.jTtoolBarSolicitudHoraExtra,this.jTtoolBarDetalleSolicitudHoraExtra);		
		
		final JTabbedPane jTabbedPaneBusquedasSolicitudHoraExtra=this.jTabbedPaneBusquedasSolicitudHoraExtra; 
		
		final JPanel jPanelParametrosReportesSolicitudHoraExtra=this.jPanelParametrosReportesSolicitudHoraExtra;
		//final JScrollPane jScrollPanelDatosSolicitudHoraExtra=this.jScrollPanelDatosSolicitudHoraExtra;
		final JTable jTableDatosSolicitudHoraExtra=this.jTableDatosSolicitudHoraExtra;		
		final JPanel jPanelPaginacionSolicitudHoraExtra=this.jPanelPaginacionSolicitudHoraExtra;
		//final JScrollPane jScrollPanelDatosEdicionSolicitudHoraExtra=this.jScrollPanelDatosEdicionSolicitudHoraExtra;
		final JPanel jPanelAccionesSolicitudHoraExtra=this.jPanelAccionesSolicitudHoraExtra;
		
		JPanel jPanelCamposAuxiliarSolicitudHoraExtra=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarSolicitudHoraExtra=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
			jPanelCamposAuxiliarSolicitudHoraExtra=this.jInternalFrameDetalleFormSolicitudHoraExtra.jPanelCamposSolicitudHoraExtra;
			jPanelAccionesFormularioAuxiliarSolicitudHoraExtra=this.jInternalFrameDetalleFormSolicitudHoraExtra.jPanelAccionesFormularioSolicitudHoraExtra;
		}
		
		final JPanel jPanelCamposSolicitudHoraExtra=jPanelCamposAuxiliarSolicitudHoraExtra;
		final JPanel jPanelAccionesFormularioSolicitudHoraExtra=jPanelAccionesFormularioAuxiliarSolicitudHoraExtra;
		
		
		final JMenuBar jmenuBarSolicitudHoraExtra=this.jmenuBarSolicitudHoraExtra;
		final JToolBar jTtoolBarSolicitudHoraExtra=this.jTtoolBarSolicitudHoraExtra;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarSolicitudHoraExtra=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSolicitudHoraExtra=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
			jmenuBarDetalleAuxiliarSolicitudHoraExtra=this.jInternalFrameDetalleFormSolicitudHoraExtra.jmenuBarDetalleSolicitudHoraExtra;
			jTtoolBarDetalleAuxiliarSolicitudHoraExtra=this.jInternalFrameDetalleFormSolicitudHoraExtra.jTtoolBarDetalleSolicitudHoraExtra;
		}
		
		final JMenuBar jmenuBarDetalleSolicitudHoraExtra=jmenuBarDetalleAuxiliarSolicitudHoraExtra;
		final JToolBar jTtoolBarDetalleSolicitudHoraExtra=jTtoolBarDetalleAuxiliarSolicitudHoraExtra;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSolicitudHoraExtra;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSolicitudHoraExtra;
			processRunnable.jTableDatos=jTableDatosSolicitudHoraExtra;
			processRunnable.jPanelCampos=jPanelCamposSolicitudHoraExtra;
			processRunnable.jPanelPaginacion=jPanelPaginacionSolicitudHoraExtra;
			processRunnable.jPanelAcciones=jPanelAccionesSolicitudHoraExtra;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSolicitudHoraExtra;
			
			
			processRunnable.jmenuBar=jmenuBarSolicitudHoraExtra;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSolicitudHoraExtra;
			processRunnable.jTtoolBar=jTtoolBarSolicitudHoraExtra;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSolicitudHoraExtra;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSolicitudHoraExtra ,jPanelParametrosReportesSolicitudHoraExtra,jTableDatosSolicitudHoraExtra, /*jScrollPanelDatosSolicitudHoraExtra,*/jPanelCamposSolicitudHoraExtra,jPanelPaginacionSolicitudHoraExtra, /*jScrollPanelDatosEdicionSolicitudHoraExtra,*/ jPanelAccionesSolicitudHoraExtra,jPanelAccionesFormularioSolicitudHoraExtra,jmenuBarSolicitudHoraExtra,jmenuBarDetalleSolicitudHoraExtra,jTtoolBarSolicitudHoraExtra,jTtoolBarDetalleSolicitudHoraExtra);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSolicitudHoraExtra ,jPanelParametrosReportesSolicitudHoraExtra, jScrollPanelDatosSolicitudHoraExtra,jPanelPaginacionSolicitudHoraExtra, jScrollPanelDatosEdicionSolicitudHoraExtra, jPanelAccionesSolicitudHoraExtra,jPanelAccionesFormularioSolicitudHoraExtra,jmenuBarSolicitudHoraExtra,jmenuBarDetalleSolicitudHoraExtra,jTtoolBarSolicitudHoraExtra,jTtoolBarDetalleSolicitudHoraExtra);
						
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
	
	public void finishProcessSolicitudHoraExtra() {// throws Exception 
		this.finishProcessSolicitudHoraExtra(true);
	}
	
	public void finishProcessSolicitudHoraExtra(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasSolicitudHoraExtra ,this.jPanelParametrosReportesSolicitudHoraExtra, this.jScrollPanelDatosSolicitudHoraExtra,this.jPanelPaginacionSolicitudHoraExtra, this.jScrollPanelDatosEdicionSolicitudHoraExtra, this.jPanelAccionesSolicitudHoraExtra,this.jPanelAccionesFormularioSolicitudHoraExtra,this.jmenuBarSolicitudHoraExtra,this.jmenuBarDetalleSolicitudHoraExtra,this.jTtoolBarSolicitudHoraExtra,this.jTtoolBarDetalleSolicitudHoraExtra);		
		
		final JTabbedPane jTabbedPaneBusquedasSolicitudHoraExtra=this.jTabbedPaneBusquedasSolicitudHoraExtra; 
		
		final JPanel jPanelParametrosReportesSolicitudHoraExtra=this.jPanelParametrosReportesSolicitudHoraExtra;
		//final JScrollPane jScrollPanelDatosSolicitudHoraExtra=this.jScrollPanelDatosSolicitudHoraExtra;
		final JTable jTableDatosSolicitudHoraExtra=this.jTableDatosSolicitudHoraExtra;		
		final JPanel jPanelPaginacionSolicitudHoraExtra=this.jPanelPaginacionSolicitudHoraExtra;
		//final JScrollPane jScrollPanelDatosEdicionSolicitudHoraExtra=this.jScrollPanelDatosEdicionSolicitudHoraExtra;
		final JPanel jPanelAccionesSolicitudHoraExtra=this.jPanelAccionesSolicitudHoraExtra;
		
		JPanel jPanelCamposAuxiliarSolicitudHoraExtra=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarSolicitudHoraExtra=new JPanel();
		
		if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
			jPanelCamposAuxiliarSolicitudHoraExtra=this.jInternalFrameDetalleFormSolicitudHoraExtra.jPanelCamposSolicitudHoraExtra;
			jPanelAccionesFormularioAuxiliarSolicitudHoraExtra=this.jInternalFrameDetalleFormSolicitudHoraExtra.jPanelAccionesFormularioSolicitudHoraExtra;
		}
		
		final JPanel jPanelCamposSolicitudHoraExtra=jPanelCamposAuxiliarSolicitudHoraExtra;
		final JPanel jPanelAccionesFormularioSolicitudHoraExtra=jPanelAccionesFormularioAuxiliarSolicitudHoraExtra;
		
		
		final JMenuBar jmenuBarSolicitudHoraExtra=this.jmenuBarSolicitudHoraExtra;		
		final JToolBar jTtoolBarSolicitudHoraExtra=this.jTtoolBarSolicitudHoraExtra;
				
		JMenuBar jmenuBarDetalleAuxiliarSolicitudHoraExtra=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSolicitudHoraExtra=new JToolBar();
		
		if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
			jmenuBarDetalleAuxiliarSolicitudHoraExtra=this.jInternalFrameDetalleFormSolicitudHoraExtra.jmenuBarDetalleSolicitudHoraExtra;
			jTtoolBarDetalleAuxiliarSolicitudHoraExtra=this.jInternalFrameDetalleFormSolicitudHoraExtra.jTtoolBarDetalleSolicitudHoraExtra;		
		}
		
		final JMenuBar jmenuBarDetalleSolicitudHoraExtra=jmenuBarDetalleAuxiliarSolicitudHoraExtra;
		final JToolBar jTtoolBarDetalleSolicitudHoraExtra=jTtoolBarDetalleAuxiliarSolicitudHoraExtra;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSolicitudHoraExtra;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSolicitudHoraExtra;
			processRunnable.jTableDatos=jTableDatosSolicitudHoraExtra;
			processRunnable.jPanelCampos=jPanelCamposSolicitudHoraExtra;
			processRunnable.jPanelPaginacion=jPanelPaginacionSolicitudHoraExtra;
			processRunnable.jPanelAcciones=jPanelAccionesSolicitudHoraExtra;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSolicitudHoraExtra;
			
			
			processRunnable.jmenuBar=jmenuBarSolicitudHoraExtra;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSolicitudHoraExtra;
			processRunnable.jTtoolBar=jTtoolBarSolicitudHoraExtra;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSolicitudHoraExtra;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasSolicitudHoraExtra ,jPanelParametrosReportesSolicitudHoraExtra, jTableDatosSolicitudHoraExtra,/*jScrollPanelDatosSolicitudHoraExtra,*/jPanelCamposSolicitudHoraExtra,jPanelPaginacionSolicitudHoraExtra, /*jScrollPanelDatosEdicionSolicitudHoraExtra,*/ jPanelAccionesSolicitudHoraExtra,jPanelAccionesFormularioSolicitudHoraExtra,jmenuBarSolicitudHoraExtra,jmenuBarDetalleSolicitudHoraExtra,jTtoolBarSolicitudHoraExtra,jTtoolBarDetalleSolicitudHoraExtra));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesSolicitudHoraExtra(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarSolicitudHoraExtra(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuSolicitudHoraExtra(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarSolicitudHoraExtra(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarSolicitudHoraExtra,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSolicitudHoraExtra,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuSolicitudHoraExtra(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarSolicitudHoraExtra,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSolicitudHoraExtra,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.solicitudhoraextraConstantesFunciones.getsFinalQuerySolicitudHoraExtra();
		String  finalQueryPaginacionTodos=this.solicitudhoraextraConstantesFunciones.getsFinalQuerySolicitudHoraExtra();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=SolicitudHoraExtraConstantesFunciones.getArrayColumnasGlobalesNoSolicitudHoraExtra(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=SolicitudHoraExtraConstantesFunciones.getArrayColumnasGlobalesSolicitudHoraExtra(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,SolicitudHoraExtraConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.solicitudhoraextrasEliminados= new ArrayList<SolicitudHoraExtra>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessSolicitudHoraExtra();
		
				///*SolicitudHoraExtraSessionBean*/this.solicitudhoraextraSessionBean=new SolicitudHoraExtraSessionBean();
			
			if(this.solicitudhoraextraSessionBean==null) {
				this.solicitudhoraextraSessionBean=new SolicitudHoraExtraSessionBean();
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
					this.iNumeroPaginacion=SolicitudHoraExtraConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=SolicitudHoraExtraConstantesFunciones.getClassesForeignKeysOfSolicitudHoraExtra(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/solicitudhoraextra."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			solicitudhoraextrasAux= new ArrayList<SolicitudHoraExtra>();
			
				
			solicitudhoraextraLogic.setDatosCliente(this.datosCliente);
			solicitudhoraextraLogic.setDatosDeep(this.datosDeep);
			solicitudhoraextraLogic.setIsConDeep(true);
			
			
			solicitudhoraextraLogic.getSolicitudHoraExtraDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					solicitudhoraextraLogic.getTodosSolicitudHoraExtras(finalQueryGlobal,pagination);
					
					//solicitudhoraextraLogic.getTodosSolicitudHoraExtrasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(solicitudhoraextraLogic.getSolicitudHoraExtras()==null|| solicitudhoraextraLogic.getSolicitudHoraExtras().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							solicitudhoraextrasAux= new ArrayList<SolicitudHoraExtra>();
							solicitudhoraextrasAux.addAll(solicitudhoraextraLogic.getSolicitudHoraExtras());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudhoraextrasAux= new ArrayList<SolicitudHoraExtra>();
							solicitudhoraextrasAux.addAll(solicitudhoraextras);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							solicitudhoraextraLogic.getTodosSolicitudHoraExtras(finalQueryGlobal+"",this.pagination);												
							
							//solicitudhoraextraLogic.getTodosSolicitudHoraExtrasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteSolicitudHoraExtras("Todos",solicitudhoraextraLogic.getSolicitudHoraExtras() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							solicitudhoraextraLogic.setSolicitudHoraExtras(new ArrayList<SolicitudHoraExtra>());					
							solicitudhoraextraLogic.getSolicitudHoraExtras().addAll(solicitudhoraextrasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudhoraextras=new ArrayList<SolicitudHoraExtra>();
							solicitudhoraextras.addAll(solicitudhoraextrasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idSolicitudHoraExtra=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idSolicitudHoraExtra=this.idActual;
				
				} else if(this.idSolicitudHoraExtraActual!=null && this.idSolicitudHoraExtraActual!=0L) {
					idSolicitudHoraExtra=idSolicitudHoraExtraActual;
				}
				
					
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndicePorId(idSolicitudHoraExtra);
				
				this.solicitudhoraextras=new ArrayList<SolicitudHoraExtra>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					solicitudhoraextraLogic.getEntity(idSolicitudHoraExtra);
					
					//solicitudhoraextraLogic.getEntityWithConnection(idSolicitudHoraExtra);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					solicitudhoraextraLogic.setSolicitudHoraExtras(new ArrayList<SolicitudHoraExtra>());
					solicitudhoraextraLogic.getSolicitudHoraExtras().add(solicitudhoraextraLogic.getSolicitudHoraExtra());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.solicitudhoraextras=new ArrayList<SolicitudHoraExtra>();
					this.solicitudhoraextras.add(solicitudhoraextra);
				}
				
				if(solicitudhoraextraLogic.getSolicitudHoraExtra()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					solicitudhoraextraLogic.getSolicitudHoraExtrasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=solicitudhoraextraLogic.getSolicitudHoraExtras()==null||solicitudhoraextraLogic.getSolicitudHoraExtras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=solicitudhoraextras==null|| solicitudhoraextras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudhoraextrasAux=new ArrayList<SolicitudHoraExtra>();
						solicitudhoraextrasAux.addAll(solicitudhoraextraLogic.getSolicitudHoraExtras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudhoraextrasAux=new ArrayList<SolicitudHoraExtra>();
							solicitudhoraextrasAux.addAll(solicitudhoraextras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							solicitudhoraextraLogic.getSolicitudHoraExtrasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSolicitudHoraExtras("FK_IdEmpleado",solicitudhoraextraLogic.getSolicitudHoraExtras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSolicitudHoraExtras("FK_IdEmpleado",solicitudhoraextras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudhoraextraLogic.setSolicitudHoraExtras(new ArrayList<SolicitudHoraExtra>());
						solicitudhoraextraLogic.getSolicitudHoraExtras().addAll(solicitudhoraextrasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudhoraextras=new ArrayList<SolicitudHoraExtra>();
							solicitudhoraextras.addAll(solicitudhoraextrasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleadoJefe")) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEmpleadoJefe(id_empleado_jefeFK_IdEmpleadoJefe);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					solicitudhoraextraLogic.getSolicitudHoraExtrasFK_IdEmpleadoJefe(finalQueryGlobal,pagination,id_empleado_jefeFK_IdEmpleadoJefe);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEmpleadoJefe(id_empleado_jefeFK_IdEmpleadoJefe);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEmpleadoJefe(id_empleado_jefeFK_IdEmpleadoJefe);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=solicitudhoraextraLogic.getSolicitudHoraExtras()==null||solicitudhoraextraLogic.getSolicitudHoraExtras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=solicitudhoraextras==null|| solicitudhoraextras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudhoraextrasAux=new ArrayList<SolicitudHoraExtra>();
						solicitudhoraextrasAux.addAll(solicitudhoraextraLogic.getSolicitudHoraExtras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudhoraextrasAux=new ArrayList<SolicitudHoraExtra>();
							solicitudhoraextrasAux.addAll(solicitudhoraextras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							solicitudhoraextraLogic.getSolicitudHoraExtrasFK_IdEmpleadoJefe(finalQueryGlobal,pagination,id_empleado_jefeFK_IdEmpleadoJefe);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEmpleadoJefe(id_empleado_jefeFK_IdEmpleadoJefe);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEmpleadoJefe(id_empleado_jefeFK_IdEmpleadoJefe);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSolicitudHoraExtras("FK_IdEmpleadoJefe",solicitudhoraextraLogic.getSolicitudHoraExtras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSolicitudHoraExtras("FK_IdEmpleadoJefe",solicitudhoraextras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudhoraextraLogic.setSolicitudHoraExtras(new ArrayList<SolicitudHoraExtra>());
						solicitudhoraextraLogic.getSolicitudHoraExtras().addAll(solicitudhoraextrasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudhoraextras=new ArrayList<SolicitudHoraExtra>();
							solicitudhoraextras.addAll(solicitudhoraextrasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleadoReemplazo")) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEmpleadoReemplazo(id_empleado_reemplazoFK_IdEmpleadoReemplazo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					solicitudhoraextraLogic.getSolicitudHoraExtrasFK_IdEmpleadoReemplazo(finalQueryGlobal,pagination,id_empleado_reemplazoFK_IdEmpleadoReemplazo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEmpleadoReemplazo(id_empleado_reemplazoFK_IdEmpleadoReemplazo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEmpleadoReemplazo(id_empleado_reemplazoFK_IdEmpleadoReemplazo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=solicitudhoraextraLogic.getSolicitudHoraExtras()==null||solicitudhoraextraLogic.getSolicitudHoraExtras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=solicitudhoraextras==null|| solicitudhoraextras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudhoraextrasAux=new ArrayList<SolicitudHoraExtra>();
						solicitudhoraextrasAux.addAll(solicitudhoraextraLogic.getSolicitudHoraExtras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudhoraextrasAux=new ArrayList<SolicitudHoraExtra>();
							solicitudhoraextrasAux.addAll(solicitudhoraextras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							solicitudhoraextraLogic.getSolicitudHoraExtrasFK_IdEmpleadoReemplazo(finalQueryGlobal,pagination,id_empleado_reemplazoFK_IdEmpleadoReemplazo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEmpleadoReemplazo(id_empleado_reemplazoFK_IdEmpleadoReemplazo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEmpleadoReemplazo(id_empleado_reemplazoFK_IdEmpleadoReemplazo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSolicitudHoraExtras("FK_IdEmpleadoReemplazo",solicitudhoraextraLogic.getSolicitudHoraExtras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSolicitudHoraExtras("FK_IdEmpleadoReemplazo",solicitudhoraextras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudhoraextraLogic.setSolicitudHoraExtras(new ArrayList<SolicitudHoraExtra>());
						solicitudhoraextraLogic.getSolicitudHoraExtras().addAll(solicitudhoraextrasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudhoraextras=new ArrayList<SolicitudHoraExtra>();
							solicitudhoraextras.addAll(solicitudhoraextrasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					solicitudhoraextraLogic.getSolicitudHoraExtrasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=solicitudhoraextraLogic.getSolicitudHoraExtras()==null||solicitudhoraextraLogic.getSolicitudHoraExtras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=solicitudhoraextras==null|| solicitudhoraextras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudhoraextrasAux=new ArrayList<SolicitudHoraExtra>();
						solicitudhoraextrasAux.addAll(solicitudhoraextraLogic.getSolicitudHoraExtras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudhoraextrasAux=new ArrayList<SolicitudHoraExtra>();
							solicitudhoraextrasAux.addAll(solicitudhoraextras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							solicitudhoraextraLogic.getSolicitudHoraExtrasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSolicitudHoraExtras("FK_IdEmpresa",solicitudhoraextraLogic.getSolicitudHoraExtras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSolicitudHoraExtras("FK_IdEmpresa",solicitudhoraextras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudhoraextraLogic.setSolicitudHoraExtras(new ArrayList<SolicitudHoraExtra>());
						solicitudhoraextraLogic.getSolicitudHoraExtras().addAll(solicitudhoraextrasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudhoraextras=new ArrayList<SolicitudHoraExtra>();
							solicitudhoraextras.addAll(solicitudhoraextrasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstadoSolicitudNomi")) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEstadoSolicitudNomi(id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					solicitudhoraextraLogic.getSolicitudHoraExtrasFK_IdEstadoSolicitudNomi(finalQueryGlobal,pagination,id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEstadoSolicitudNomi(id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEstadoSolicitudNomi(id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=solicitudhoraextraLogic.getSolicitudHoraExtras()==null||solicitudhoraextraLogic.getSolicitudHoraExtras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=solicitudhoraextras==null|| solicitudhoraextras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudhoraextrasAux=new ArrayList<SolicitudHoraExtra>();
						solicitudhoraextrasAux.addAll(solicitudhoraextraLogic.getSolicitudHoraExtras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudhoraextrasAux=new ArrayList<SolicitudHoraExtra>();
							solicitudhoraextrasAux.addAll(solicitudhoraextras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							solicitudhoraextraLogic.getSolicitudHoraExtrasFK_IdEstadoSolicitudNomi(finalQueryGlobal,pagination,id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEstadoSolicitudNomi(id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEstadoSolicitudNomi(id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSolicitudHoraExtras("FK_IdEstadoSolicitudNomi",solicitudhoraextraLogic.getSolicitudHoraExtras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSolicitudHoraExtras("FK_IdEstadoSolicitudNomi",solicitudhoraextras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudhoraextraLogic.setSolicitudHoraExtras(new ArrayList<SolicitudHoraExtra>());
						solicitudhoraextraLogic.getSolicitudHoraExtras().addAll(solicitudhoraextrasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudhoraextras=new ArrayList<SolicitudHoraExtra>();
							solicitudhoraextras.addAll(solicitudhoraextrasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstructura")) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					solicitudhoraextraLogic.getSolicitudHoraExtrasFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=solicitudhoraextraLogic.getSolicitudHoraExtras()==null||solicitudhoraextraLogic.getSolicitudHoraExtras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=solicitudhoraextras==null|| solicitudhoraextras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudhoraextrasAux=new ArrayList<SolicitudHoraExtra>();
						solicitudhoraextrasAux.addAll(solicitudhoraextraLogic.getSolicitudHoraExtras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudhoraextrasAux=new ArrayList<SolicitudHoraExtra>();
							solicitudhoraextrasAux.addAll(solicitudhoraextras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							solicitudhoraextraLogic.getSolicitudHoraExtrasFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSolicitudHoraExtras("FK_IdEstructura",solicitudhoraextraLogic.getSolicitudHoraExtras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSolicitudHoraExtras("FK_IdEstructura",solicitudhoraextras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudhoraextraLogic.setSolicitudHoraExtras(new ArrayList<SolicitudHoraExtra>());
						solicitudhoraextraLogic.getSolicitudHoraExtras().addAll(solicitudhoraextrasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudhoraextras=new ArrayList<SolicitudHoraExtra>();
							solicitudhoraextras.addAll(solicitudhoraextrasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					solicitudhoraextraLogic.getSolicitudHoraExtrasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=solicitudhoraextraLogic.getSolicitudHoraExtras()==null||solicitudhoraextraLogic.getSolicitudHoraExtras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=solicitudhoraextras==null|| solicitudhoraextras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudhoraextrasAux=new ArrayList<SolicitudHoraExtra>();
						solicitudhoraextrasAux.addAll(solicitudhoraextraLogic.getSolicitudHoraExtras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudhoraextrasAux=new ArrayList<SolicitudHoraExtra>();
							solicitudhoraextrasAux.addAll(solicitudhoraextras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							solicitudhoraextraLogic.getSolicitudHoraExtrasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudHoraExtraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSolicitudHoraExtras("FK_IdSucursal",solicitudhoraextraLogic.getSolicitudHoraExtras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSolicitudHoraExtras("FK_IdSucursal",solicitudhoraextras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudhoraextraLogic.setSolicitudHoraExtras(new ArrayList<SolicitudHoraExtra>());
						solicitudhoraextraLogic.getSolicitudHoraExtras().addAll(solicitudhoraextrasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudhoraextras=new ArrayList<SolicitudHoraExtra>();
							solicitudhoraextras.addAll(solicitudhoraextrasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesSolicitudHoraExtra();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessSolicitudHoraExtra();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=solicitudhoraextraLogic.getSolicitudHoraExtras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=solicitudhoraextras.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=solicitudhoraextraLogic.getSolicitudHoraExtras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=solicitudhoraextras.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(SolicitudHoraExtra solicitudhoraextra) {
		Boolean permite=true;
		
		if(this.solicitudhoraextra.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=SolicitudHoraExtraConstantesFunciones.getOrderByListaSolicitudHoraExtra();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=SolicitudHoraExtraConstantesFunciones.getOrderByListaSolicitudHoraExtra();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SolicitudHoraExtra solicitudhoraextra:solicitudhoraextraLogic.getSolicitudHoraExtras()) {
				if(solicitudhoraextra.getsType().equals(Constantes2.S_TOTALES)) {
					solicitudhoraextraTotales=solicitudhoraextra;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SolicitudHoraExtra solicitudhoraextra:this.solicitudhoraextras) {
				if(solicitudhoraextra.getsType().equals(Constantes2.S_TOTALES)) {
					solicitudhoraextraTotales=solicitudhoraextra;
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
			this.solicitudhoraextraAux=new SolicitudHoraExtra();
			this.solicitudhoraextraAux.setsType(Constantes2.S_TOTALES);
			this.solicitudhoraextraAux.setIsNew(false);
			this.solicitudhoraextraAux.setIsChanged(false);
			this.solicitudhoraextraAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				SolicitudHoraExtraConstantesFunciones.TotalizarValoresFilaSolicitudHoraExtra(this.solicitudhoraextraLogic.getSolicitudHoraExtras(),this.solicitudhoraextraAux);
				
				this.solicitudhoraextraLogic.getSolicitudHoraExtras().add(this.solicitudhoraextraAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				SolicitudHoraExtraConstantesFunciones.TotalizarValoresFilaSolicitudHoraExtra(this.solicitudhoraextras,this.solicitudhoraextraAux);
				
				this.solicitudhoraextras.add(this.solicitudhoraextraAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		solicitudhoraextraTotales=new SolicitudHoraExtra();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.solicitudhoraextraLogic.getSolicitudHoraExtras().remove(solicitudhoraextraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.solicitudhoraextras.remove(solicitudhoraextraTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		solicitudhoraextraTotales=new SolicitudHoraExtra();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SolicitudHoraExtra solicitudhoraextra:solicitudhoraextraLogic.getSolicitudHoraExtras()) {
				if(solicitudhoraextra.getsType().equals(Constantes2.S_TOTALES)) {
					solicitudhoraextraTotales=solicitudhoraextra;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SolicitudHoraExtraConstantesFunciones.TotalizarValoresFilaSolicitudHoraExtra(this.solicitudhoraextraLogic.getSolicitudHoraExtras(),solicitudhoraextraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SolicitudHoraExtra solicitudhoraextra:this.solicitudhoraextras) {
				if(solicitudhoraextra.getsType().equals(Constantes2.S_TOTALES)) {
					solicitudhoraextraTotales=solicitudhoraextra;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SolicitudHoraExtraConstantesFunciones.TotalizarValoresFilaSolicitudHoraExtra(this.solicitudhoraextras,solicitudhoraextraTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getSolicitudHoraExtrasFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSolicitudHoraExtrasFK_IdEmpleadoJefe()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleadoJefe";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSolicitudHoraExtrasFK_IdEmpleadoReemplazo()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleadoReemplazo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSolicitudHoraExtrasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSolicitudHoraExtrasFK_IdEstadoSolicitudNomi()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstadoSolicitudNomi";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSolicitudHoraExtrasFK_IdEstructura()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSolicitudHoraExtrasFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getSolicitudHoraExtrasFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					solicitudhoraextraLogic.getSolicitudHoraExtrasFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSolicitudHoraExtrasFK_IdEmpleadoJefe(String sFinalQuery,Long id_empleado_jefe)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					solicitudhoraextraLogic.getSolicitudHoraExtrasFK_IdEmpleadoJefe(sFinalQuery,this.pagination,id_empleado_jefe);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSolicitudHoraExtrasFK_IdEmpleadoReemplazo(String sFinalQuery,Long id_empleado_reemplazo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					solicitudhoraextraLogic.getSolicitudHoraExtrasFK_IdEmpleadoReemplazo(sFinalQuery,this.pagination,id_empleado_reemplazo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSolicitudHoraExtrasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					solicitudhoraextraLogic.getSolicitudHoraExtrasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSolicitudHoraExtrasFK_IdEstadoSolicitudNomi(String sFinalQuery,Long id_estado_solicitud_nomi)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					solicitudhoraextraLogic.getSolicitudHoraExtrasFK_IdEstadoSolicitudNomi(sFinalQuery,this.pagination,id_estado_solicitud_nomi);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSolicitudHoraExtrasFK_IdEstructura(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					solicitudhoraextraLogic.getSolicitudHoraExtrasFK_IdEstructura(sFinalQuery,this.pagination,id_estructura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSolicitudHoraExtrasFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					solicitudhoraextraLogic.getSolicitudHoraExtrasFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosSolicitudHoraExtra() {
		this.isPermisoTodoSolicitudHoraExtra=false;
		this.isPermisoNuevoSolicitudHoraExtra=false;
		this.isPermisoActualizarSolicitudHoraExtra=false;
		this.isPermisoActualizarOriginalSolicitudHoraExtra=false;
		this.isPermisoEliminarSolicitudHoraExtra=false;
		this.isPermisoGuardarCambiosSolicitudHoraExtra=false;
		this.isPermisoConsultaSolicitudHoraExtra=false;
		this.isPermisoBusquedaSolicitudHoraExtra=false;
		this.isPermisoReporteSolicitudHoraExtra=false;		
		this.isPermisoOrdenSolicitudHoraExtra=false;		
		this.isPermisoPaginacionMedioSolicitudHoraExtra=false;		
		this.isPermisoPaginacionAltoSolicitudHoraExtra=false;
		this.isPermisoPaginacionTodoSolicitudHoraExtra=false;
		this.isPermisoCopiarSolicitudHoraExtra=false;		
		this.isPermisoVerFormSolicitudHoraExtra=false;		
		this.isPermisoDuplicarSolicitudHoraExtra=false;		
		this.isPermisoOrdenSolicitudHoraExtra=false;		
	}
	
	public void setPermisosUsuarioSolicitudHoraExtra(Boolean isPermiso) {
		this.isPermisoTodoSolicitudHoraExtra=isPermiso;
		this.isPermisoNuevoSolicitudHoraExtra=isPermiso;
		this.isPermisoActualizarSolicitudHoraExtra=isPermiso;
		this.isPermisoActualizarOriginalSolicitudHoraExtra=isPermiso;
		this.isPermisoEliminarSolicitudHoraExtra=isPermiso;
		this.isPermisoGuardarCambiosSolicitudHoraExtra=isPermiso;
		this.isPermisoConsultaSolicitudHoraExtra=isPermiso;
		this.isPermisoBusquedaSolicitudHoraExtra=isPermiso;
		this.isPermisoReporteSolicitudHoraExtra=isPermiso;
		this.isPermisoOrdenSolicitudHoraExtra=isPermiso;		
		this.isPermisoPaginacionMedioSolicitudHoraExtra=isPermiso;		
		this.isPermisoPaginacionAltoSolicitudHoraExtra=isPermiso;		
		this.isPermisoPaginacionTodoSolicitudHoraExtra=isPermiso;		
		this.isPermisoCopiarSolicitudHoraExtra=isPermiso;		
		this.isPermisoVerFormSolicitudHoraExtra=isPermiso;		
		this.isPermisoDuplicarSolicitudHoraExtra=isPermiso;
		this.isPermisoOrdenSolicitudHoraExtra=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioSolicitudHoraExtra(Boolean isPermiso) {
		//this.isPermisoTodoSolicitudHoraExtra=isPermiso;
		this.isPermisoNuevoSolicitudHoraExtra=isPermiso;
		this.isPermisoActualizarSolicitudHoraExtra=isPermiso;
		this.isPermisoActualizarOriginalSolicitudHoraExtra=isPermiso;
		this.isPermisoEliminarSolicitudHoraExtra=isPermiso;
		this.isPermisoGuardarCambiosSolicitudHoraExtra=isPermiso;
		//this.isPermisoConsultaSolicitudHoraExtra=isPermiso;
		//this.isPermisoBusquedaSolicitudHoraExtra=isPermiso;
		//this.isPermisoReporteSolicitudHoraExtra=isPermiso;
		//this.isPermisoOrdenSolicitudHoraExtra=isPermiso;		
		//this.isPermisoPaginacionMedioSolicitudHoraExtra=isPermiso;		
		//this.isPermisoPaginacionAltoSolicitudHoraExtra=isPermiso;		
		//this.isPermisoPaginacionTodoSolicitudHoraExtra=isPermiso;		
		//this.isPermisoCopiarSolicitudHoraExtra=isPermiso;		
		//this.isPermisoDuplicarSolicitudHoraExtra=isPermiso;
		//this.isPermisoOrdenSolicitudHoraExtra=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioSolicitudHoraExtraClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(SolicitudHoraExtraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebSolicitudHoraExtra(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioSolicitudHoraExtraClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioSolicitudHoraExtraClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionSolicitudHoraExtraClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioSolicitudHoraExtraClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioSolicitudHoraExtra() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(SolicitudHoraExtraJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, SolicitudHoraExtraConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoSolicitudHoraExtra=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarSolicitudHoraExtra=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalSolicitudHoraExtra=this.isPermisoActualizarSolicitudHoraExtra;
			this.isPermisoEliminarSolicitudHoraExtra=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosSolicitudHoraExtra=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaSolicitudHoraExtra=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaSolicitudHoraExtra=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoSolicitudHoraExtra=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteSolicitudHoraExtra=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSolicitudHoraExtra=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioSolicitudHoraExtra=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoSolicitudHoraExtra=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoSolicitudHoraExtra=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarSolicitudHoraExtra=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormSolicitudHoraExtra=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarSolicitudHoraExtra=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSolicitudHoraExtra=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosSolicitudHoraExtra.setToolTipText(this.jTableDatosSolicitudHoraExtra.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioSolicitudHoraExtra(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioSolicitudHoraExtra(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(SolicitudHoraExtraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(SolicitudHoraExtraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioSolicitudHoraExtra() throws Exception {
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
	public void inicializarCombosForeignKeySolicitudHoraExtraListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.estructurasForeignKey=new ArrayList();
				this.empleadojefesForeignKey=new ArrayList();
				this.estadosolicitudnomisForeignKey=new ArrayList();
				this.empleadoreemplazosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeySolicitudHoraExtraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(SolicitudHoraExtraJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeySolicitudHoraExtraListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoJefeListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstadoSolicitudNomiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoReemplazoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyEmpleadoJefeListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empleadojefesForeignKey==null||this.empleadojefesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpleadoJefesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoSolicitudNomiListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estadosolicitudnomisForeignKey==null||this.estadosolicitudnomisForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstadoSolicitudNomiConstantesFunciones.getArrayColumnasGlobalesEstadoSolicitudNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoSolicitudNomiConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstadoSolicitudNomiConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstadoSolicitudNomisForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEmpleadoReemplazoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empleadoreemplazosForeignKey==null||this.empleadoreemplazosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpleadoReemplazosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeySolicitudHoraExtraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			SolicitudHoraExtraParameterReturnGeneral solicitudhoraextraReturnGeneral=new SolicitudHoraExtraParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.solicitudhoraextraConstantesFunciones.cargarid_empresaSolicitudHoraExtra)
					 || (this.esRecargarFks && this.solicitudhoraextraConstantesFunciones.cargarid_empresaSolicitudHoraExtra)) {

					if(!this.solicitudhoraextraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+solicitudhoraextraSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.solicitudhoraextraConstantesFunciones.cargarid_sucursalSolicitudHoraExtra)
					 || (this.esRecargarFks && this.solicitudhoraextraConstantesFunciones.cargarid_sucursalSolicitudHoraExtra)) {

					if(!this.solicitudhoraextraSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+solicitudhoraextraSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.solicitudhoraextraConstantesFunciones.cargarid_empleadoSolicitudHoraExtra)
					 || (this.esRecargarFks && this.solicitudhoraextraConstantesFunciones.cargarid_empleadoSolicitudHoraExtra)) {

					if(!this.solicitudhoraextraSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+solicitudhoraextraSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalEstructura="";

				if(((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0) && this.solicitudhoraextraConstantesFunciones.cargarid_estructuraSolicitudHoraExtra)
					 || (this.esRecargarFks && this.solicitudhoraextraConstantesFunciones.cargarid_estructuraSolicitudHoraExtra)) {

					if(!this.solicitudhoraextraSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstructura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

						finalQueryGlobalEstructura=Funciones.GetFinalQueryAppend(finalQueryGlobalEstructura, "");
						finalQueryGlobalEstructura+=EstructuraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstructura=" WHERE " + ConstantesSql.ID + "="+solicitudhoraextraSessionBean.getlidEstructuraActual();
					}
				} else {
					finalQueryGlobalEstructura="NONE";
				}


				String finalQueryGlobalEmpleadoJefe="";

				if(((this.empleadojefesForeignKey==null||this.empleadojefesForeignKey.size()<=0) && this.solicitudhoraextraConstantesFunciones.cargarid_empleado_jefeSolicitudHoraExtra)
					 || (this.esRecargarFks && this.solicitudhoraextraConstantesFunciones.cargarid_empleado_jefeSolicitudHoraExtra)) {

					if(!this.solicitudhoraextraSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoJefe()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleadoJefe=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleadoJefe=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleadoJefe, "");
						finalQueryGlobalEmpleadoJefe+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadoJefesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleadoJefe=" WHERE " + ConstantesSql.ID + "="+solicitudhoraextraSessionBean.getlidEmpleadoJefeActual();
					}
				} else {
					finalQueryGlobalEmpleadoJefe="NONE";
				}


				String finalQueryGlobalEstadoSolicitudNomi="";

				if(((this.estadosolicitudnomisForeignKey==null||this.estadosolicitudnomisForeignKey.size()<=0) && this.solicitudhoraextraConstantesFunciones.cargarid_estado_solicitud_nomiSolicitudHoraExtra)
					 || (this.esRecargarFks && this.solicitudhoraextraConstantesFunciones.cargarid_estado_solicitud_nomiSolicitudHoraExtra)) {

					if(!this.solicitudhoraextraSessionBean.getisBusquedaDesdeForeignKeySesionEstadoSolicitudNomi()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstadoSolicitudNomiConstantesFunciones.getArrayColumnasGlobalesEstadoSolicitudNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstadoSolicitudNomi=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoSolicitudNomiConstantesFunciones.TABLENAME);

						finalQueryGlobalEstadoSolicitudNomi=Funciones.GetFinalQueryAppend(finalQueryGlobalEstadoSolicitudNomi, "");
						finalQueryGlobalEstadoSolicitudNomi+=EstadoSolicitudNomiConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstadoSolicitudNomisForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstadoSolicitudNomi=" WHERE " + ConstantesSql.ID + "="+solicitudhoraextraSessionBean.getlidEstadoSolicitudNomiActual();
					}
				} else {
					finalQueryGlobalEstadoSolicitudNomi="NONE";
				}


				String finalQueryGlobalEmpleadoReemplazo="";

				if(((this.empleadoreemplazosForeignKey==null||this.empleadoreemplazosForeignKey.size()<=0) && this.solicitudhoraextraConstantesFunciones.cargarid_empleado_reemplazoSolicitudHoraExtra)
					 || (this.esRecargarFks && this.solicitudhoraextraConstantesFunciones.cargarid_empleado_reemplazoSolicitudHoraExtra)) {

					if(!this.solicitudhoraextraSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoReemplazo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleadoReemplazo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleadoReemplazo=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleadoReemplazo, "");
						finalQueryGlobalEmpleadoReemplazo+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadoReemplazosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleadoReemplazo=" WHERE " + ConstantesSql.ID + "="+solicitudhoraextraSessionBean.getlidEmpleadoReemplazoActual();
					}
				} else {
					finalQueryGlobalEmpleadoReemplazo="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				solicitudhoraextraReturnGeneral=solicitudhoraextraLogic.cargarCombosLoteForeignKeySolicitudHoraExtra(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEmpleado,finalQueryGlobalEstructura,finalQueryGlobalEmpleadoJefe,finalQueryGlobalEstadoSolicitudNomi,finalQueryGlobalEmpleadoReemplazo);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=solicitudhoraextraReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=solicitudhoraextraReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=solicitudhoraextraReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalEstructura.equals("NONE")) {
				this.estructurasForeignKey=solicitudhoraextraReturnGeneral.getestructurasForeignKey();
			}

			if(!finalQueryGlobalEmpleadoJefe.equals("NONE")) {
				this.empleadojefesForeignKey=solicitudhoraextraReturnGeneral.getempleadojefesForeignKey();
			}

			if(!finalQueryGlobalEstadoSolicitudNomi.equals("NONE")) {
				this.estadosolicitudnomisForeignKey=solicitudhoraextraReturnGeneral.getestadosolicitudnomisForeignKey();
			}

			if(!finalQueryGlobalEmpleadoReemplazo.equals("NONE")) {
				this.empleadoreemplazosForeignKey=solicitudhoraextraReturnGeneral.getempleadoreemplazosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeySolicitudHoraExtra()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyEstructura();
			this.addItemDefectoCombosForeignKeyEmpleadoJefe();
			this.addItemDefectoCombosForeignKeyEstadoSolicitudNomi();
			this.addItemDefectoCombosForeignKeyEmpleadoReemplazo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.solicitudhoraextraSessionBean==null) {
				this.solicitudhoraextraSessionBean=new SolicitudHoraExtraSessionBean();
			}

			if(!this.solicitudhoraextraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.solicitudhoraextraSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.solicitudhoraextraSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyEstructura()throws Exception {
		try {

			if(!this.solicitudhoraextraSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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

	public void addItemDefectoCombosForeignKeyEmpleadoJefe()throws Exception {
		try {

			if(!this.solicitudhoraextraSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoJefe()) {
				Empleado empleadojefe=new Empleado();
				EmpleadoConstantesFunciones.setEmpleadoDescripcion(empleadojefe,Constantes.SMENSAJE_ESCOJA_OPCION);
				empleadojefe.setId(null);

				if(!EmpleadoConstantesFunciones.ExisteEnLista(this.empleadojefesForeignKey,empleadojefe,true)) {

					this.empleadojefesForeignKey.add(0,empleadojefe);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstadoSolicitudNomi()throws Exception {
		try {

			if(!this.solicitudhoraextraSessionBean.getisBusquedaDesdeForeignKeySesionEstadoSolicitudNomi()) {
				EstadoSolicitudNomi estadosolicitudnomi=new EstadoSolicitudNomi();
				EstadoSolicitudNomiConstantesFunciones.setEstadoSolicitudNomiDescripcion(estadosolicitudnomi,Constantes.SMENSAJE_ESCOJA_OPCION);
				estadosolicitudnomi.setId(null);

				if(!EstadoSolicitudNomiConstantesFunciones.ExisteEnLista(this.estadosolicitudnomisForeignKey,estadosolicitudnomi,true)) {

					this.estadosolicitudnomisForeignKey.add(0,estadosolicitudnomi);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpleadoReemplazo()throws Exception {
		try {

			if(!this.solicitudhoraextraSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoReemplazo()) {
				Empleado empleadoreemplazo=new Empleado();
				EmpleadoConstantesFunciones.setEmpleadoDescripcion(empleadoreemplazo,Constantes.SMENSAJE_ESCOJA_OPCION);
				empleadoreemplazo.setId(null);

				if(!EmpleadoConstantesFunciones.ExisteEnLista(this.empleadoreemplazosForeignKey,empleadoreemplazo,true)) {

					this.empleadoreemplazosForeignKey.add(0,empleadoreemplazo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeySolicitudHoraExtra()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeySolicitudHoraExtra(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeySolicitudHoraExtra()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
				this.solicitudhoraextra.setfecha_solicita(this.parametroGeneralUsuario.getfecha_sistema());
				this.solicitudhoraextra.setfecha_ejecuta(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeySolicitudHoraExtra();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeySolicitudHoraExtra(SolicitudHoraExtra solicitudhoraextra)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(solicitudhoraextra.getid_empleado(),false,"Formulario");
			this.setActualEstructuraForeignKey(solicitudhoraextra.getid_estructura(),false,"Formulario");
			this.setActualEmpleadoJefeForeignKey(solicitudhoraextra.getid_empleado_jefe(),false,"Formulario");
			this.setActualEstadoSolicitudNomiForeignKey(solicitudhoraextra.getid_estado_solicitud_nomi(),false,"Formulario");
			this.setActualEmpleadoReemplazoForeignKey(solicitudhoraextra.getid_empleado_reemplazo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeySolicitudHoraExtra(SolicitudHoraExtra solicitudhoraextra,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeySolicitudHoraExtra()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.solicitudhoraextraConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualEstructuraForeignKey(this.solicitudhoraextraConstantesFunciones.getid_estructura(),false,"Formulario");
			this.setActualEmpleadoJefeForeignKey(this.solicitudhoraextraConstantesFunciones.getid_empleado_jefe(),false,"Formulario");
			this.setActualEstadoSolicitudNomiForeignKey(this.solicitudhoraextraConstantesFunciones.getid_estado_solicitud_nomi(),false,"Formulario");
			this.setActualEmpleadoReemplazoForeignKey(this.solicitudhoraextraConstantesFunciones.getid_empleado_reemplazo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeySolicitudHoraExtra()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeySolicitudHoraExtra()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeySolicitudHoraExtra()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroSolicitudHoraExtra()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeySolicitudHoraExtra()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameEstructurasForeignKey("Todos");
			this.cargarCombosFrameEmpleadoJefesForeignKey("Todos");
			this.cargarCombosFrameEstadoSolicitudNomisForeignKey("Todos");
			this.cargarCombosFrameEmpleadoReemplazosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeySolicitudHoraExtra(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadoJefesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstadoSolicitudNomisForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadoReemplazosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeySolicitudHoraExtra()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empresaSolicitudHoraExtra!=null && this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empresaSolicitudHoraExtra.getItemCount()>0) {
				this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empresaSolicitudHoraExtra.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_sucursalSolicitudHoraExtra!=null && this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_sucursalSolicitudHoraExtra.getItemCount()>0) {
				this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_sucursalSolicitudHoraExtra.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleadoSolicitudHoraExtra!=null && this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleadoSolicitudHoraExtra.getItemCount()>0) {
				this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleadoSolicitudHoraExtra.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estructuraSolicitudHoraExtra!=null && this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estructuraSolicitudHoraExtra.getItemCount()>0) {
				this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estructuraSolicitudHoraExtra.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_jefeSolicitudHoraExtra!=null && this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_jefeSolicitudHoraExtra.getItemCount()>0) {
				this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_jefeSolicitudHoraExtra.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra!=null && this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra.getItemCount()>0) {
				this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_reemplazoSolicitudHoraExtra!=null && this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_reemplazoSolicitudHoraExtra.getItemCount()>0) {
				this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_reemplazoSolicitudHoraExtra.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	














	
	

	public SolicitudHoraExtraBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public SolicitudHoraExtraBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public SolicitudHoraExtraBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.solicitudhoraextraSessionBean=new SolicitudHoraExtraSessionBean(); 
		this.solicitudhoraextraConstantesFunciones=new SolicitudHoraExtraConstantesFunciones(); 
		this.solicitudhoraextraBean=new SolicitudHoraExtra();//(this.solicitudhoraextraConstantesFunciones); 		
		this.solicitudhoraextraReturnGeneral=new SolicitudHoraExtraParameterReturnGeneral(); 
		
		this.solicitudhoraextraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.solicitudhoraextraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public SolicitudHoraExtraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public SolicitudHoraExtraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public SolicitudHoraExtraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessSolicitudHoraExtra(true);
			
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
			
			this.solicitudhoraextraConstantesFunciones=new SolicitudHoraExtraConstantesFunciones(); 
			this.solicitudhoraextraBean=new SolicitudHoraExtra();//this.solicitudhoraextraConstantesFunciones); 			
			this.solicitudhoraextraReturnGeneral=new SolicitudHoraExtraParameterReturnGeneral(); 
		
			SolicitudHoraExtraBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Solicitud Hora Extra Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.solicitudhoraextra=new SolicitudHoraExtra();
			this.solicitudhoraextras = new ArrayList<SolicitudHoraExtra>();
			this.solicitudhoraextrasAux = new ArrayList<SolicitudHoraExtra>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic=new SolicitudHoraExtraLogic();
				this.solicitudhoraextraLogic.getNewConnexionToDeep("");
			}
			
			//this.solicitudhoraextraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.solicitudhoraextraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormSolicitudHoraExtra);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoSolicitudHoraExtra!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSolicitudHoraExtra);	
					}
					
					if(this.jInternalFrameImportacionSolicitudHoraExtra!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSolicitudHoraExtra);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderBySolicitudHoraExtra!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderBySolicitudHoraExtra);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormSolicitudHoraExtra);
				this.jInternalFrameDetalleFormSolicitudHoraExtra.setVisible(false);
				this.jInternalFrameDetalleFormSolicitudHoraExtra.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoSolicitudHoraExtra!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSolicitudHoraExtra);
					this.jInternalFrameReporteDinamicoSolicitudHoraExtra.setVisible(false);
					this.jInternalFrameReporteDinamicoSolicitudHoraExtra.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionSolicitudHoraExtra!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionSolicitudHoraExtra);
					this.jInternalFrameImportacionSolicitudHoraExtra.setVisible(false);
					this.jInternalFrameImportacionSolicitudHoraExtra.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderBySolicitudHoraExtra!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderBySolicitudHoraExtra);
					this.jInternalFrameOrderBySolicitudHoraExtra.setVisible(false);
					this.jInternalFrameOrderBySolicitudHoraExtra.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idSolicitudHoraExtraActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=SolicitudHoraExtraConstantesFunciones.INUMEROPAGINACION;
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
			
			this.solicitudhoraextraReturnGeneral=new SolicitudHoraExtraParameterReturnGeneral();
			
			this.solicitudhoraextraParameterGeneral=new SolicitudHoraExtraParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.solicitudhoraextraLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
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
			
			if(SolicitudHoraExtraJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SolicitudHoraExtraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.solicitudhoraextraSessionBean.getEsGuardarRelacionado(),this.solicitudhoraextraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SolicitudHoraExtraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.solicitudhoraextraSessionBean.getEsGuardarRelacionado(),this.solicitudhoraextraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoSolicitudHoraExtra=false;
			this.isVisibilidadCeldaDuplicarSolicitudHoraExtra=true;
			this.isVisibilidadCeldaCopiarSolicitudHoraExtra=true;
			this.isVisibilidadCeldaVerFormSolicitudHoraExtra=true;
			this.isVisibilidadCeldaOrdenSolicitudHoraExtra=true;
			this.isVisibilidadCeldaNuevoRelacionesSolicitudHoraExtra=false;
			this.isVisibilidadCeldaModificarSolicitudHoraExtra=false;
			this.isVisibilidadCeldaActualizarSolicitudHoraExtra=false;
			this.isVisibilidadCeldaEliminarSolicitudHoraExtra=false;
			this.isVisibilidadCeldaCancelarSolicitudHoraExtra=false;
			this.isVisibilidadCeldaGuardarSolicitudHoraExtra=false;
			this.isVisibilidadCeldaGuardarCambiosSolicitudHoraExtra=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpleadoJefe=true;
			this.isVisibilidadFK_IdEmpleadoReemplazo=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstadoSolicitudNomi=true;
			this.isVisibilidadFK_IdEstructura=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesSolicitudHoraExtra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosSolicitudHoraExtra();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioSolicitudHoraExtra(false);
			
			this.setPermisosUsuarioSolicitudHoraExtra();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.solicitudhoraextraSessionBean.getEsGuardarRelacionado() 
				|| (this.solicitudhoraextraSessionBean.getEsGuardarRelacionado() && this.solicitudhoraextraSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioSolicitudHoraExtraClasesRelacionadas();
			}
			
			if(this.solicitudhoraextraSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioSolicitudHoraExtraClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosSolicitudHoraExtra();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualSolicitudHoraExtra();
			}
			
			if(!this.isPermisoBusquedaSolicitudHoraExtra) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasSolicitudHoraExtra.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioSolicitudHoraExtra,this.isPermisoPaginacionMedioSolicitudHoraExtra,this.isPermisoPaginacionTodoSolicitudHoraExtra);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(SolicitudHoraExtraConstantesFunciones.getTiposSeleccionarSolicitudHoraExtra());
				
				this.tiposColumnasSelect=SolicitudHoraExtraConstantesFunciones.getTiposSeleccionarSolicitudHoraExtra(true);
				
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
			//if(!this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioSolicitudHoraExtra();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioSolicitudHoraExtra(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioSolicitudHoraExtra(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesSolicitudHoraExtra() ;
			
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
			this.sucursalLogic=new SucursalLogic();
			this.empleadoLogic=new EmpleadoLogic();
			this.estructuraLogic=new EstructuraLogic();
			this.empleadojefeLogic=new EmpleadoLogic();
			this.estadosolicitudnomiLogic=new EstadoSolicitudNomiLogic();
			this.empleadoreemplazoLogic=new EmpleadoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				solicitudhoraextraImplementable= (SolicitudHoraExtraImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SolicitudHoraExtraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				solicitudhoraextraImplementableHome= (SolicitudHoraExtraImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SolicitudHoraExtraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.solicitudhoraextras= new ArrayList<SolicitudHoraExtra>();
			this.solicitudhoraextrasEliminados= new ArrayList<SolicitudHoraExtra>();
						
			this.isEsNuevoSolicitudHoraExtra=false;
			this.esParaAccionDesdeFormularioSolicitudHoraExtra=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			this.empleadojefesForeignKey=new ArrayList<Empleado>() ;
			this.estadosolicitudnomisForeignKey=new ArrayList<EstadoSolicitudNomi>() ;
			this.empleadoreemplazosForeignKey=new ArrayList<Empleado>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeySolicitudHoraExtra(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroSolicitudHoraExtra();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			SolicitudHoraExtraBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=SolicitudHoraExtraConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesSolicitudHoraExtra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingSolicitudHoraExtra(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioSolicitudHoraExtra();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioSolicitudHoraExtra();
			}
			
			SolicitudHoraExtraBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasSolicitudHoraExtra.getTabCount(); i++) {
					this.jTabbedPaneBusquedasSolicitudHoraExtra.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasSolicitudHoraExtra.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessSolicitudHoraExtra(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga SolicitudHoraExtra: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectSolicitudHoraExtra() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesSolicitudHoraExtra")) {
				iIndex=this.jInternalFrameDetalleFormSolicitudHoraExtra.jTabbedPaneRelacionesSolicitudHoraExtra.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormSolicitudHoraExtra.jTabbedPaneRelacionesSolicitudHoraExtra.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessSolicitudHoraExtra();	
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
	
	public void cargarCombosForeignKeySolicitudHoraExtra(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeySolicitudHoraExtra(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeySolicitudHoraExtra(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeySolicitudHoraExtraListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeySolicitudHoraExtra();
		
		this.cargarCombosFrameForeignKeySolicitudHoraExtra();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeySolicitudHoraExtra();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeySolicitudHoraExtra();
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

	public void cargarCombosForeignKeyEmpleadoJefe(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEmpleadoJefeListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEmpleadoJefe();
				this.cargarCombosFrameEmpleadoJefesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEmpleadoJefe(this.empleadojefesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoSolicitudNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstadoSolicitudNomiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstadoSolicitudNomi();
				this.cargarCombosFrameEstadoSolicitudNomisForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstadoSolicitudNomi(this.estadosolicitudnomisForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEmpleadoReemplazo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEmpleadoReemplazoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEmpleadoReemplazo();
				this.cargarCombosFrameEmpleadoReemplazosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEmpleadoReemplazo(this.empleadoreemplazosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoSolicitudHoraExtraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.solicitudhoraextraSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormSolicitudHoraExtra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
			
			
			if(jTableDatosSolicitudHoraExtra.getRowCount()>=1) {
				jTableDatosSolicitudHoraExtra.removeRowSelectionInterval(0, jTableDatosSolicitudHoraExtra.getRowCount()-1);						
			}
			
			this.isEsNuevoSolicitudHoraExtra=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoSolicitudHoraExtra(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesSolicitudHoraExtra(true);			
			//this.solicitudhoraextra=new SolicitudHoraExtra();
			//this.solicitudhoraextra.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSolicitudHoraExtra(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSolicitudHoraExtra() ;
			
			if(SolicitudHoraExtraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSolicitudHoraExtra(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.solicitudhoraextra);	
			this.actualizarInformacion("INFO_PADRE",false,this.solicitudhoraextra);				
			
			SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
			
			if(this.solicitudhoraextraSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar SolicitudHoraExtra: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarSolicitudHoraExtraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<SolicitudHoraExtra> solicitudhoraextrasSeleccionados=new ArrayList<SolicitudHoraExtra>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosSolicitudHoraExtra.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosSolicitudHoraExtra.getSelectedRows().length;			
			}
			
			solicitudhoraextrasSeleccionados=this.getSolicitudHoraExtrasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoSolicitudHoraExtra--;			
				//SolicitudHoraExtra solicitudhoraextraAux= new SolicitudHoraExtra();			
				//solicitudhoraextraAux.setId(this.iIdNuevoSolicitudHoraExtra);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//SolicitudHoraExtra solicitudhoraextraOrigen=new SolicitudHoraExtra();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(SolicitudHoraExtra solicitudhoraextraOrigen : solicitudhoraextrasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							solicitudhoraextraOrigen =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudhoraextraOrigen =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaSolicitudHoraExtra();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.solicitudhoraextra.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosSolicitudHoraExtra(solicitudhoraextraOrigen,this.solicitudhoraextra,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.solicitudhoraextraLogic.getSolicitudHoraExtras().add(this.solicitudhoraextraAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.solicitudhoraextras.add(this.solicitudhoraextraAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaSolicitudHoraExtra(false);
				
				this.jTableDatosSolicitudHoraExtra.setRowSelectionInterval(this.getIndiceNuevoSolicitudHoraExtra(), this.getIndiceNuevoSolicitudHoraExtra());
				
				int iLastRow =  this.jTableDatosSolicitudHoraExtra.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSolicitudHoraExtra.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSolicitudHoraExtra.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSolicitudHoraExtra(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarSolicitudHoraExtraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<SolicitudHoraExtra> solicitudhoraextrasSeleccionados=new ArrayList<SolicitudHoraExtra>();									
		
			SolicitudHoraExtra solicitudhoraextraOrigen=new SolicitudHoraExtra();
			SolicitudHoraExtra solicitudhoraextraDestino=new SolicitudHoraExtra();
				
			solicitudhoraextrasSeleccionados=this.getSolicitudHoraExtrasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosSolicitudHoraExtra.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || solicitudhoraextrasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosSolicitudHoraExtra.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudhoraextraOrigen =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						solicitudhoraextraOrigen =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudhoraextraDestino =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						solicitudhoraextraDestino =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				solicitudhoraextraOrigen =solicitudhoraextrasSeleccionados.get(0);
				solicitudhoraextraDestino =solicitudhoraextrasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosSolicitudHoraExtra(solicitudhoraextraOrigen,solicitudhoraextraDestino,true,false);
				
				solicitudhoraextraDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(solicitudhoraextraDestino,solicitudhoraextraLogic.getSolicitudHoraExtras());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(solicitudhoraextraDestino,solicitudhoraextras);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaSolicitudHoraExtra(false);
				
				//this.jTableDatosSolicitudHoraExtra.setRowSelectionInterval(this.getIndiceNuevoSolicitudHoraExtra(), this.getIndiceNuevoSolicitudHoraExtra());
				
				int iLastRow =  this.jTableDatosSolicitudHoraExtra.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSolicitudHoraExtra.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSolicitudHoraExtra.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSolicitudHoraExtra(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormSolicitudHoraExtraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSolicitudHoraExtra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormSolicitudHoraExtra.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarSolicitudHoraExtraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesSolicitudHoraExtra.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasSolicitudHoraExtra.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesSolicitudHoraExtra.setVisible(!isVisible);
			this.jPanelPaginacionSolicitudHoraExtra.setVisible(!isVisible);
			this.jPanelAccionesSolicitudHoraExtra.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarSolicitudHoraExtraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameSolicitudHoraExtra();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoSolicitudHoraExtraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoSolicitudHoraExtra();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionSolicitudHoraExtraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionSolicitudHoraExtra();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderBySolicitudHoraExtraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBySolicitudHoraExtra();
			
			this.abrirFrameOrderBySolicitudHoraExtra();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderBySolicitudHoraExtraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBySolicitudHoraExtra();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleSolicitudHoraExtra(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormSolicitudHoraExtra);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormSolicitudHoraExtra.isMaximum()) {
					this.jInternalFrameDetalleFormSolicitudHoraExtra.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormSolicitudHoraExtra.setSize(this.jInternalFrameDetalleFormSolicitudHoraExtra.iWidthFormulario,this.jInternalFrameDetalleFormSolicitudHoraExtra.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormSolicitudHoraExtra.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormSolicitudHoraExtra.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormSolicitudHoraExtra.isMaximum()) {
						this.jInternalFrameDetalleFormSolicitudHoraExtra.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormSolicitudHoraExtra.jContentPaneDetalleSolicitudHoraExtra.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormSolicitudHoraExtra.jTabbedPaneRelacionesSolicitudHoraExtra.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormSolicitudHoraExtra.jContentPaneDetalleSolicitudHoraExtra.getWidth(),SolicitudHoraExtraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSolicitudHoraExtra.jTabbedPaneRelacionesSolicitudHoraExtra.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormSolicitudHoraExtra.jContentPaneDetalleSolicitudHoraExtra.getWidth(),SolicitudHoraExtraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSolicitudHoraExtra.jTabbedPaneRelacionesSolicitudHoraExtra.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormSolicitudHoraExtra.jContentPaneDetalleSolicitudHoraExtra.getWidth(),SolicitudHoraExtraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormSolicitudHoraExtra.setVisible(true);
	        this.jInternalFrameDetalleFormSolicitudHoraExtra.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBySolicitudHoraExtra() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderBySolicitudHoraExtra==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderBySolicitudHoraExtra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySolicitudHoraExtra,false,this);
				} else {
					this.jInternalFrameOrderBySolicitudHoraExtra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySolicitudHoraExtra,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderBySolicitudHoraExtra);
				this.jInternalFrameOrderBySolicitudHoraExtra.setVisible(false);
				this.jInternalFrameOrderBySolicitudHoraExtra.setSelected(false);
				
				this.jInternalFrameOrderBySolicitudHoraExtra.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySolicitudHoraExtra"));
				
				this.inicializarActualizarBindingTablaOrderBySolicitudHoraExtra();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionSolicitudHoraExtra() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionSolicitudHoraExtra==null) {
				
				this.jInternalFrameImportacionSolicitudHoraExtra=new ImportacionJInternalFrame(SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSolicitudHoraExtra);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionSolicitudHoraExtra);
				this.jInternalFrameImportacionSolicitudHoraExtra.setVisible(false);
				this.jInternalFrameImportacionSolicitudHoraExtra.setSelected(false);


				this.jInternalFrameImportacionSolicitudHoraExtra.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSolicitudHoraExtra"));
				this.jInternalFrameImportacionSolicitudHoraExtra.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSolicitudHoraExtra"));
				this.jInternalFrameImportacionSolicitudHoraExtra.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSolicitudHoraExtra"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoSolicitudHoraExtra() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoSolicitudHoraExtra==null) {
				this.jInternalFrameReporteDinamicoSolicitudHoraExtra=new ReporteDinamicoJInternalFrame(SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSolicitudHoraExtra);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSolicitudHoraExtra);
				this.jInternalFrameReporteDinamicoSolicitudHoraExtra.setVisible(false);
				this.jInternalFrameReporteDinamicoSolicitudHoraExtra.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSolicitudHoraExtra"));
				this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSolicitudHoraExtra"));
				this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSolicitudHoraExtra"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSolicitudHoraExtra();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleSolicitudHoraExtra() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormSolicitudHoraExtra);
			
	       	this.jInternalFrameDetalleFormSolicitudHoraExtra.setVisible(false);
	        this.jInternalFrameDetalleFormSolicitudHoraExtra.setSelected(false);
			
			//this.jInternalFrameDetalleFormSolicitudHoraExtra.dispose();
			//this.jInternalFrameDetalleFormSolicitudHoraExtra=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoSolicitudHoraExtra() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoSolicitudHoraExtra.setVisible(true);
	        this.jInternalFrameReporteDinamicoSolicitudHoraExtra.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionSolicitudHoraExtra() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionSolicitudHoraExtra.setVisible(true);
	        this.jInternalFrameImportacionSolicitudHoraExtra.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBySolicitudHoraExtra() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderBySolicitudHoraExtra.setVisible(true);
	        this.jInternalFrameOrderBySolicitudHoraExtra.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBySolicitudHoraExtra() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderBySolicitudHoraExtra.setVisible(false);
	        this.jInternalFrameOrderBySolicitudHoraExtra.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoSolicitudHoraExtra() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoSolicitudHoraExtra.setVisible(false);
	        this.jInternalFrameReporteDinamicoSolicitudHoraExtra.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionSolicitudHoraExtra() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionSolicitudHoraExtra.setVisible(false);
	        this.jInternalFrameImportacionSolicitudHoraExtra.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeEstructura(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeEstructura);
						EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.sTipoBusqueda="Estructura";
						}

						estructuraBeanSwingJInternalFrame.getTodosEstructuraArbol();
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setEstructuras(estructuraBeanSwingJInternalFrame.estructurasArbol);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.CargarTreeEstructura();
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setVisible(true);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.jInternalFrameParent=this;
						TitledBorder titledBorderSolicitudHoraExtra=(TitledBorder)this.jScrollPanelDatosSolicitudHoraExtra.getBorder();
						TitledBorder titledBorderEstructura=(TitledBorder)estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

						titledBorderEstructura.setTitle(titledBorderSolicitudHoraExtra.getTitle() + " -> Estructura");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,estructuraBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(estructuraBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeEstructura(EstructuraBeanSwingJInternalFrame jInternalFrameTreeEstructura) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeEstructura);
						jInternalFrameTreeEstructura.setVisible(false);
						jInternalFrameTreeEstructura.setSelected(false);
						//jInternalFrameTreeEstructura.dispose();
						//jInternalFrameTreeEstructura=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarSolicitudHoraExtraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarSolicitudHoraExtra(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarSolicitudHoraExtra(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesSolicitudHoraExtra(true);
			//this.isEsNuevoSolicitudHoraExtra=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesSolicitudHoraExtra("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSolicitudHoraExtra(false) ;
			
			if(solicitudhoraextraSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(SolicitudHoraExtraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSolicitudHoraExtra(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSolicitudHoraExtra(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaSolicitudHoraExtraActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarSolicitudHoraExtra(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSolicitudHoraExtra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesSolicitudHoraExtra(true);
			//this.isEsNuevoSolicitudHoraExtra=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.solicitudhoraextra.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesSolicitudHoraExtra("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesSolicitudHoraExtra(false) ;
			
			if(SolicitudHoraExtraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSolicitudHoraExtra(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSolicitudHoraExtra(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudHoraExtra,SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSolicitudHoraExtra.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstructura(List<Estructura> estructurasForeignKey)throws Exception{
		TableColumn tableColumnEstructura=this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudHoraExtra,SolicitudHoraExtraConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSolicitudHoraExtra.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructurasForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEmpleadoJefe(List<Empleado> empleadojefesForeignKey)throws Exception{
		TableColumn tableColumnEmpleadoJefe=this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudHoraExtra,SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOJEFE));
		TableCellEditor tableCellEditorEmpleadoJefe =tableColumnEmpleadoJefe.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleadoJefe;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadojefesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSolicitudHoraExtra.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadojefesForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstadoSolicitudNomi(List<EstadoSolicitudNomi> estadosolicitudnomisForeignKey)throws Exception{
		TableColumn tableColumnEstadoSolicitudNomi=this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudHoraExtra,SolicitudHoraExtraConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI));
		TableCellEditor tableCellEditorEstadoSolicitudNomi =tableColumnEstadoSolicitudNomi.getCellEditor();

		EstadoSolicitudNomiTableCell estadosolicitudnomiTableCellFk=(EstadoSolicitudNomiTableCell)tableCellEditorEstadoSolicitudNomi;

		if(estadosolicitudnomiTableCellFk!=null) {
			estadosolicitudnomiTableCellFk.setestadosolicitudnomisForeignKey(estadosolicitudnomisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSolicitudHoraExtra.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estadosolicitudnomiTableCellFk.setRowActual(intSelectedRow);
			//estadosolicitudnomiTableCellFk.setestadosolicitudnomisForeignKeyActual(estadosolicitudnomisForeignKey);
		//}


		if(estadosolicitudnomiTableCellFk!=null) {
			estadosolicitudnomiTableCellFk.RecargarEstadoSolicitudNomisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEmpleadoReemplazo(List<Empleado> empleadoreemplazosForeignKey)throws Exception{
		TableColumn tableColumnEmpleadoReemplazo=this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudHoraExtra,SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO));
		TableCellEditor tableCellEditorEmpleadoReemplazo =tableColumnEmpleadoReemplazo.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleadoReemplazo;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadoreemplazosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSolicitudHoraExtra.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadoreemplazosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarSolicitudHoraExtraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesSolicitudHoraExtra(false);
			
			//if(!this.isEsNuevoSolicitudHoraExtra) {								
				int intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.solicitudhoraextra,true);
				this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
				
			}
			
			if(this.permiteMantenimiento(this.solicitudhoraextra)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoSolicitudHoraExtra=true;
					this.inicializarActualizarBindingTablaSolicitudHoraExtra(false);
					this.isEsNuevoSolicitudHoraExtra=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoSolicitudHoraExtra=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoSolicitudHoraExtra=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSolicitudHoraExtra(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSolicitudHoraExtra(false);
				
				this.habilitarDeshabilitarControlesSolicitudHoraExtra(false);
			
												
				
				if(SolicitudHoraExtraJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleSolicitudHoraExtra();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoSolicitudHoraExtraActionPerformed(evt,solicitudhoraextraSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualSolicitudHoraExtra(this.solicitudhoraextra,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosSolicitudHoraExtra.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,solicitudhoraextraSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.solicitudhoraextra.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(SolicitudHoraExtra.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudHoraExtra.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarSolicitudHoraExtraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				this.solicitudhoraextra.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				this.solicitudhoraextra.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.solicitudhoraextra)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((SolicitudHoraExtraModel) this.jTableDatosSolicitudHoraExtra.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoSolicitudHoraExtra=true;
				this.inicializarActualizarBindingTablaSolicitudHoraExtra(false);
				this.isEsNuevoSolicitudHoraExtra=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSolicitudHoraExtra(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSolicitudHoraExtra(false);
				
				this.habilitarDeshabilitarControlesSolicitudHoraExtra(false);
				
				
				
				if(SolicitudHoraExtraJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleSolicitudHoraExtra();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarSolicitudHoraExtraActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosSolicitudHoraExtra.getRowCount()>=1) {
				jTableDatosSolicitudHoraExtra.removeRowSelectionInterval(0, jTableDatosSolicitudHoraExtra.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesSolicitudHoraExtra(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaSolicitudHoraExtra(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSolicitudHoraExtra(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSolicitudHoraExtra(false) ;
			
			this.isEsNuevoSolicitudHoraExtra=false;
			
			if(SolicitudHoraExtraJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleSolicitudHoraExtra();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosSolicitudHoraExtraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingSolicitudHoraExtra(false);
				
				//SI ES MANUAL
				if(SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualSolicitudHoraExtra();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosSolicitudHoraExtraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoSolicitudHoraExtra--;			
			//SolicitudHoraExtra solicitudhoraextraAux= new SolicitudHoraExtra();			
			//solicitudhoraextraAux.setId(this.iIdNuevoSolicitudHoraExtra);
			
			if(this.jInternalFrameDetalleFormSolicitudHoraExtra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaSolicitudHoraExtra();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
			
			this.solicitudhoraextra.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.solicitudhoraextraLogic.getSolicitudHoraExtras().add(this.solicitudhoraextraAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.solicitudhoraextras.add(this.solicitudhoraextraAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaSolicitudHoraExtra(false);
			
			this.jTableDatosSolicitudHoraExtra.setRowSelectionInterval(this.getIndiceNuevoSolicitudHoraExtra(), this.getIndiceNuevoSolicitudHoraExtra());
			
			int iLastRow =  this.jTableDatosSolicitudHoraExtra.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosSolicitudHoraExtra.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosSolicitudHoraExtra.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaSolicitudHoraExtra(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionSolicitudHoraExtraActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingSolicitudHoraExtra(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSolicitudHoraExtra(false);
			
			//SI ES MANUAL
			if(SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSolicitudHoraExtra();
			}
			
			//this.abrirFrameTreeSolicitudHoraExtra();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionSolicitudHoraExtraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Solicitud Hora ExtraS ?", "MANTENIMIENTO DE Solicitud Hora Extra", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionSolicitudHoraExtra.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralSolicitudHoraExtra();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.solicitudhoraextraReturnGeneral=solicitudhoraextraLogic.procesarImportacionSolicitudHoraExtrasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.solicitudhoraextraParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarSolicitudHoraExtraReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionSolicitudHoraExtraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionSolicitudHoraExtra.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionSolicitudHoraExtra.setFileImportacion(this.jInternalFrameImportacionSolicitudHoraExtra.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionSolicitudHoraExtra.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionSolicitudHoraExtra.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSolicitudHoraExtra.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionSolicitudHoraExtra.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoSolicitudHoraExtraActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<SolicitudHoraExtra> solicitudhoraextrasSeleccionados=new ArrayList<SolicitudHoraExtra>();		

		solicitudhoraextrasSeleccionados=this.getSolicitudHoraExtrasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SolicitudHoraExtraBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SolicitudHoraExtraBaseDesign.jrxml";
			
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
			
			this.generarReporteSolicitudHoraExtras("Todos",solicitudhoraextrasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Solicitud Hora Extra",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDESTRUCTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Estructura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Estructura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Estructura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Estructura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOJEFE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EmpleadoJefe_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EmpleadoJefe_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EmpleadoJefe_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EmpleadoJefe_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstadoSolicitudNomi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstadoSolicitudNomi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstadoSolicitudNomi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstadoSolicitudNomi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EmpleadoReemplazo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EmpleadoReemplazo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EmpleadoReemplazo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EmpleadoReemplazo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_SECUENCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_FECHASOLICITA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaSolicita_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaSolicita_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaSolicita_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaSolicita_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_FECHAEJECUTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEjecuta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEjecuta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEjecuta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEjecuta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_NUMEROHORAS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroHoras_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroHoras_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroHoras_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroHoras_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_COSTOUNITARIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoUnitario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoUnitario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoUnitario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoUnitario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_COSTOTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoTotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoria="id_estructura";
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOJEFE:
					sNombreCampoCategoria="id_empleado_jefe";
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI:
					sNombreCampoCategoria="id_estado_solicitud_nomi";
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO:
					sNombreCampoCategoria="id_empleado_reemplazo";
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoria="secuencial";
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_FECHASOLICITA:
					sNombreCampoCategoria="fecha_solicita";
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_FECHAEJECUTA:
					sNombreCampoCategoria="fecha_ejecuta";
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_NUMEROHORAS:
					sNombreCampoCategoria="numero_horas";
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_COSTOUNITARIO:
					sNombreCampoCategoria="costo_unitario";
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoria="costo_total";
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoriaValor="id_estructura";
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOJEFE:
					sNombreCampoCategoriaValor="id_empleado_jefe";
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI:
					sNombreCampoCategoriaValor="id_estado_solicitud_nomi";
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO:
					sNombreCampoCategoriaValor="id_empleado_reemplazo";
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoriaValor="secuencial";
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_FECHASOLICITA:
					sNombreCampoCategoriaValor="fecha_solicita";
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_FECHAEJECUTA:
					sNombreCampoCategoriaValor="fecha_ejecuta";
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_NUMEROHORAS:
					sNombreCampoCategoriaValor="numero_horas";
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_COSTOUNITARIO:
					sNombreCampoCategoriaValor="costo_unitario";
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoriaValor="costo_total";
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDESTRUCTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estructura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estructura");
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOJEFE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado Jefe",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado_jefe");
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado Solicitud Nomi",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estado_solicitud_nomi");
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado Reemplazo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado_reemplazo");
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_SECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"secuencial");
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_FECHASOLICITA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Solicita",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_solicita");
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_FECHAEJECUTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Ejecuta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_ejecuta");
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_NUMEROHORAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Horas",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_horas");
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_COSTOUNITARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Unitario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_unitario");
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_COSTOTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_total");
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoSolicitudHoraExtraActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<SolicitudHoraExtra> solicitudhoraextrasSeleccionados=new ArrayList<SolicitudHoraExtra>();		
		
		solicitudhoraextrasSeleccionados=this.getSolicitudHoraExtrasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"solicitudhoraextra";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("SolicitudHoraExtras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(SolicitudHoraExtra solicitudhoraextra:solicitudhoraextrasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudhoraextra.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(SolicitudHoraExtra solicitudhoraextra:solicitudhoraextrasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudhoraextra.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(SolicitudHoraExtra solicitudhoraextra:solicitudhoraextrasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudhoraextra.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(SolicitudHoraExtra solicitudhoraextra:solicitudhoraextrasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudhoraextra.getestructura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOJEFE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOJEFE);
					iRow++;

					for(SolicitudHoraExtra solicitudhoraextra:solicitudhoraextrasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudhoraextra.getempleadojefe_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI);
					iRow++;

					for(SolicitudHoraExtra solicitudhoraextra:solicitudhoraextrasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudhoraextra.getestadosolicitudnomi_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO);
					iRow++;

					for(SolicitudHoraExtra solicitudhoraextra:solicitudhoraextrasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudhoraextra.getempleadoreemplazo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_SECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_SECUENCIAL);
					iRow++;

					for(SolicitudHoraExtra solicitudhoraextra:solicitudhoraextrasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudhoraextra.getsecuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_FECHASOLICITA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_FECHASOLICITA);
					iRow++;

					for(SolicitudHoraExtra solicitudhoraextra:solicitudhoraextrasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudhoraextra.getfecha_solicita());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_FECHAEJECUTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_FECHAEJECUTA);
					iRow++;

					for(SolicitudHoraExtra solicitudhoraextra:solicitudhoraextrasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudhoraextra.getfecha_ejecuta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_NUMEROHORAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_NUMEROHORAS);
					iRow++;

					for(SolicitudHoraExtra solicitudhoraextra:solicitudhoraextrasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudhoraextra.getnumero_horas());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_COSTOUNITARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_COSTOUNITARIO);
					iRow++;

					for(SolicitudHoraExtra solicitudhoraextra:solicitudhoraextrasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudhoraextra.getcosto_unitario());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_COSTOTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_COSTOTOTAL);
					iRow++;

					for(SolicitudHoraExtra solicitudhoraextra:solicitudhoraextrasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudhoraextra.getcosto_total());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudHoraExtraConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(SolicitudHoraExtra solicitudhoraextra:solicitudhoraextrasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudhoraextra.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelSolicitudHoraExtra(row);				
			//	iRow++;
			//}				
			
			//for(SolicitudHoraExtra solicitudhoraextraAux:solicitudhoraextrasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelSolicitudHoraExtra(solicitudhoraextraAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Solicitud Hora Extra",JOptionPane.INFORMATION_MESSAGE);
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
				this.solicitudhoraextraLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSolicitudHoraExtra(false);
			
			//SI ES MANUAL
			if(SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSolicitudHoraExtra();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresSolicitudHoraExtraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSolicitudHoraExtra(false);
			
			//SI ES MANUAL
			if(SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSolicitudHoraExtra();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesSolicitudHoraExtraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSolicitudHoraExtra(false);
			
			//SI ES MANUAL
			if(SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSolicitudHoraExtra();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaSolicitudHoraExtra() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosSolicitudHoraExtra.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosSolicitudHoraExtra.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosSolicitudHoraExtra.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosSolicitudHoraExtra.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosSolicitudHoraExtra.setMinimumSize(dimensionMinimum);
		this.jTableDatosSolicitudHoraExtra.setMaximumSize(dimensionMaximum);
		this.jTableDatosSolicitudHoraExtra.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingSolicitudHoraExtra(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingSolicitudHoraExtra(esInicializar,true);
	}
	
	public void inicializarActualizarBindingSolicitudHoraExtra(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaSolicitudHoraExtra(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesSolicitudHoraExtra(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasSolicitudHoraExtra(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSolicitudHoraExtra(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesSolicitudHoraExtra(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualSolicitudHoraExtra() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaSolicitudHoraExtra();
		
		this.inicializarActualizarBindingBotonesManualSolicitudHoraExtra(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualSolicitudHoraExtra();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSolicitudHoraExtra() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualSolicitudHoraExtra(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualSolicitudHoraExtra(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosSolicitudHoraExtra.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosSolicitudHoraExtra.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteSolicitudHoraExtra.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormSolicitudHoraExtra.jCheckBoxPostAccionNuevoSolicitudHoraExtra.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormSolicitudHoraExtra.jCheckBoxPostAccionSinCerrarSolicitudHoraExtra.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormSolicitudHoraExtra.jCheckBoxPostAccionSinMensajeSolicitudHoraExtra.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosSolicitudHoraExtra.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosSolicitudHoraExtra.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteSolicitudHoraExtra.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
				this.jInternalFrameDetalleFormSolicitudHoraExtra.jCheckBoxPostAccionNuevoSolicitudHoraExtra.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormSolicitudHoraExtra.jCheckBoxPostAccionSinCerrarSolicitudHoraExtra.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormSolicitudHoraExtra.jCheckBoxPostAccionSinMensajeSolicitudHoraExtra.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionSolicitudHoraExtra.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionSolicitudHoraExtra.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxTiposAccionesFormularioSolicitudHoraExtra.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesSolicitudHoraExtra.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoSolicitudHoraExtra!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesSolicitudHoraExtra.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesSolicitudHoraExtra.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarSolicitudHoraExtra.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesSolicitudHoraExtra.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoSolicitudHoraExtra!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesSolicitudHoraExtra.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralSolicitudHoraExtra.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesSolicitudHoraExtra(Boolean esInicializar) throws Exception {
		try	{	
			if(SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualSolicitudHoraExtra(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesSolicitudHoraExtra() throws Exception {
		try	{
			if(SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualSolicitudHoraExtra();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSolicitudHoraExtra() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxTiposAccionesFormularioSolicitudHoraExtra.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxTiposAccionesFormularioSolicitudHoraExtra.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualSolicitudHoraExtra() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesSolicitudHoraExtra.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesSolicitudHoraExtra.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesSolicitudHoraExtra.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesSolicitudHoraExtra.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesSolicitudHoraExtra.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesSolicitudHoraExtra.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionSolicitudHoraExtra.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionSolicitudHoraExtra.addItem(reporte);
			}
			
			
			if(!this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionSolicitudHoraExtra.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionSolicitudHoraExtra.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesSolicitudHoraExtra.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesSolicitudHoraExtra.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesSolicitudHoraExtra.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesSolicitudHoraExtra.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxTiposAccionesFormularioSolicitudHoraExtra.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxTiposAccionesFormularioSolicitudHoraExtra.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarSolicitudHoraExtra.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarSolicitudHoraExtra.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarSolicitudHoraExtra.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSolicitudHoraExtra();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSolicitudHoraExtra() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSolicitudHoraExtra!=null) {
				this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSolicitudHoraExtra!=null) {
				this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoSolicitudHoraExtra!=null) {
				
				if(this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=SolicitudHoraExtraConstantesFunciones.getTiposSeleccionarSolicitudHoraExtra(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=SolicitudHoraExtraConstantesFunciones.getTiposSeleccionarSolicitudHoraExtra(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=SolicitudHoraExtraConstantesFunciones.getTiposSeleccionarSolicitudHoraExtra(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualSolicitudHoraExtra()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoSolicitudHoraExtra.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoSolicitudHoraExtra.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra.getSelectedItem()!=null){this.id_empleado_jefeFK_IdEmpleadoJefe=((Empleado)this.jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra.getSelectedItem()!=null){this.id_empleado_reemplazoFK_IdEmpleadoReemplazo=((Empleado)this.jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra.getSelectedItem()).getId();}
		if(this.jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra.getSelectedItem()!=null){this.id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi=((EstadoSolicitudNomi)this.jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra.getSelectedItem()).getId();}
		if(this.jComboBoxid_estructuraFK_IdEstructuraSolicitudHoraExtra.getSelectedItem()!=null){this.id_estructuraFK_IdEstructura=((Estructura)this.jComboBoxid_estructuraFK_IdEstructuraSolicitudHoraExtra.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasSolicitudHoraExtra(Boolean esInicializar) throws Exception {				
		if(SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualSolicitudHoraExtra();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaSolicitudHoraExtra() throws Exception {
		this.inicializarActualizarBindingTablaSolicitudHoraExtra(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBySolicitudHoraExtra() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderBySolicitudHoraExtra.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderBySolicitudHoraExtra.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySolicitudHoraExtra.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new SolicitudHoraExtraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderBySolicitudHoraExtra.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySolicitudHoraExtra.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new SolicitudHoraExtraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosSolicitudHoraExtraOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudHoraExtraOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new SolicitudHoraExtraPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderBySolicitudHoraExtra.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySolicitudHoraExtra.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new SolicitudHoraExtraPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderBySolicitudHoraExtra.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaSolicitudHoraExtra(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=solicitudhoraextraLogic.getSolicitudHoraExtras().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=solicitudhoraextras.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosSolicitudHoraExtra.setModel(new SolicitudHoraExtraModel(this.solicitudhoraextraLogic.getSolicitudHoraExtras(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosSolicitudHoraExtra.setModel(new SolicitudHoraExtraModel(this.solicitudhoraextras,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderBySolicitudHoraExtra!=null && this.jInternalFrameOrderBySolicitudHoraExtra.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBySolicitudHoraExtra();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudHoraExtra,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new SolicitudHoraExtraPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO,solicitudhoraextraConstantesFunciones.resaltarSeleccionarSolicitudHoraExtra,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO,solicitudhoraextraConstantesFunciones.resaltarSeleccionarSolicitudHoraExtra,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudHoraExtra,SolicitudHoraExtraConstantesFunciones.LABEL_ID));

		if(this.solicitudhoraextraConstantesFunciones.mostraridSolicitudHoraExtra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudHoraExtraConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.solicitudhoraextraConstantesFunciones.resaltaridSolicitudHoraExtra,this.solicitudhoraextraConstantesFunciones.activaridSolicitudHoraExtra,iSizeTabla,this,true,"idSolicitudHoraExtra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.solicitudhoraextraConstantesFunciones.resaltaridSolicitudHoraExtra,this.solicitudhoraextraConstantesFunciones.activaridSolicitudHoraExtra,this,true,"idSolicitudHoraExtra","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudHoraExtra,SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPRESA));

		if(this.solicitudhoraextraConstantesFunciones.mostrarid_empresaSolicitudHoraExtra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.solicitudhoraextraConstantesFunciones.resaltarid_empresaSolicitudHoraExtra,this,this.solicitudhoraextraConstantesFunciones.activarid_empresaSolicitudHoraExtra,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.solicitudhoraextraConstantesFunciones.resaltarid_empresaSolicitudHoraExtra,this,this.solicitudhoraextraConstantesFunciones.activarid_empresaSolicitudHoraExtra,false,"id_empresaSolicitudHoraExtra","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SolicitudHoraExtraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudHoraExtra,SolicitudHoraExtraConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.solicitudhoraextraConstantesFunciones.mostrarid_sucursalSolicitudHoraExtra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudHoraExtraConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.solicitudhoraextraConstantesFunciones.resaltarid_sucursalSolicitudHoraExtra,this,this.solicitudhoraextraConstantesFunciones.activarid_sucursalSolicitudHoraExtra,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.solicitudhoraextraConstantesFunciones.resaltarid_sucursalSolicitudHoraExtra,this,this.solicitudhoraextraConstantesFunciones.activarid_sucursalSolicitudHoraExtra,false,"id_sucursalSolicitudHoraExtra","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SolicitudHoraExtraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudHoraExtra,SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.solicitudhoraextraConstantesFunciones.mostrarid_empleadoSolicitudHoraExtra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.solicitudhoraextraConstantesFunciones.resaltarid_empleadoSolicitudHoraExtra,this,this.solicitudhoraextraConstantesFunciones.activarid_empleadoSolicitudHoraExtra,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.solicitudhoraextraConstantesFunciones.resaltarid_empleadoSolicitudHoraExtra,this,this.solicitudhoraextraConstantesFunciones.activarid_empleadoSolicitudHoraExtra,true,"id_empleadoSolicitudHoraExtra","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new SolicitudHoraExtraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudHoraExtra,SolicitudHoraExtraConstantesFunciones.LABEL_IDESTRUCTURA));

		if(this.solicitudhoraextraConstantesFunciones.mostrarid_estructuraSolicitudHoraExtra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudHoraExtraConstantesFunciones.LABEL_IDESTRUCTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstructuraTableCell(this.estructurasForeignKey,this.solicitudhoraextraConstantesFunciones.resaltarid_estructuraSolicitudHoraExtra,this,this.solicitudhoraextraConstantesFunciones.activarid_estructuraSolicitudHoraExtra,iSizeTabla));
			tableColumn.setCellEditor(new EstructuraTableCell(this.estructurasForeignKey,this.solicitudhoraextraConstantesFunciones.resaltarid_estructuraSolicitudHoraExtra,this,this.solicitudhoraextraConstantesFunciones.activarid_estructuraSolicitudHoraExtra,true,"id_estructuraSolicitudHoraExtra","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SolicitudHoraExtraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudHoraExtra,SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOJEFE));

		if(this.solicitudhoraextraConstantesFunciones.mostrarid_empleado_jefeSolicitudHoraExtra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOJEFE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadojefesForeignKey,this.solicitudhoraextraConstantesFunciones.resaltarid_empleado_jefeSolicitudHoraExtra,this,this.solicitudhoraextraConstantesFunciones.activarid_empleado_jefeSolicitudHoraExtra,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadojefesForeignKey,this.solicitudhoraextraConstantesFunciones.resaltarid_empleado_jefeSolicitudHoraExtra,this,this.solicitudhoraextraConstantesFunciones.activarid_empleado_jefeSolicitudHoraExtra,true,"id_empleado_jefeSolicitudHoraExtra","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new SolicitudHoraExtraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudHoraExtra,SolicitudHoraExtraConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI));

		if(this.solicitudhoraextraConstantesFunciones.mostrarid_estado_solicitud_nomiSolicitudHoraExtra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudHoraExtraConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstadoSolicitudNomiTableCell(this.estadosolicitudnomisForeignKey,this.solicitudhoraextraConstantesFunciones.resaltarid_estado_solicitud_nomiSolicitudHoraExtra,this,this.solicitudhoraextraConstantesFunciones.activarid_estado_solicitud_nomiSolicitudHoraExtra,iSizeTabla));
			tableColumn.setCellEditor(new EstadoSolicitudNomiTableCell(this.estadosolicitudnomisForeignKey,this.solicitudhoraextraConstantesFunciones.resaltarid_estado_solicitud_nomiSolicitudHoraExtra,this,this.solicitudhoraextraConstantesFunciones.activarid_estado_solicitud_nomiSolicitudHoraExtra,true,"id_estado_solicitud_nomiSolicitudHoraExtra","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SolicitudHoraExtraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudHoraExtra,SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO));

		if(this.solicitudhoraextraConstantesFunciones.mostrarid_empleado_reemplazoSolicitudHoraExtra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadoreemplazosForeignKey,this.solicitudhoraextraConstantesFunciones.resaltarid_empleado_reemplazoSolicitudHoraExtra,this,this.solicitudhoraextraConstantesFunciones.activarid_empleado_reemplazoSolicitudHoraExtra,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadoreemplazosForeignKey,this.solicitudhoraextraConstantesFunciones.resaltarid_empleado_reemplazoSolicitudHoraExtra,this,this.solicitudhoraextraConstantesFunciones.activarid_empleado_reemplazoSolicitudHoraExtra,true,"id_empleado_reemplazoSolicitudHoraExtra","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new SolicitudHoraExtraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudHoraExtra,SolicitudHoraExtraConstantesFunciones.LABEL_SECUENCIAL));

		if(this.solicitudhoraextraConstantesFunciones.mostrarsecuencialSolicitudHoraExtra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudHoraExtraConstantesFunciones.LABEL_SECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.solicitudhoraextraConstantesFunciones.resaltarsecuencialSolicitudHoraExtra,this.solicitudhoraextraConstantesFunciones.activarsecuencialSolicitudHoraExtra,iSizeTabla,this,true,"secuencialSolicitudHoraExtra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.solicitudhoraextraConstantesFunciones.resaltarsecuencialSolicitudHoraExtra,this.solicitudhoraextraConstantesFunciones.activarsecuencialSolicitudHoraExtra,this,true,"secuencialSolicitudHoraExtra","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SolicitudHoraExtraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudHoraExtra,SolicitudHoraExtraConstantesFunciones.LABEL_FECHASOLICITA));

		if(this.solicitudhoraextraConstantesFunciones.mostrarfecha_solicitaSolicitudHoraExtra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudHoraExtraConstantesFunciones.LABEL_FECHASOLICITA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.solicitudhoraextraConstantesFunciones.resaltarfecha_solicitaSolicitudHoraExtra,this.solicitudhoraextraConstantesFunciones.activarfecha_solicitaSolicitudHoraExtra,iSizeTabla,this,true,"fecha_solicitaSolicitudHoraExtra","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.solicitudhoraextraConstantesFunciones.resaltarfecha_solicitaSolicitudHoraExtra,this.solicitudhoraextraConstantesFunciones.activarfecha_solicitaSolicitudHoraExtra,this,true,"fecha_solicitaSolicitudHoraExtra","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new SolicitudHoraExtraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudHoraExtra,SolicitudHoraExtraConstantesFunciones.LABEL_FECHAEJECUTA));

		if(this.solicitudhoraextraConstantesFunciones.mostrarfecha_ejecutaSolicitudHoraExtra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudHoraExtraConstantesFunciones.LABEL_FECHAEJECUTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.solicitudhoraextraConstantesFunciones.resaltarfecha_ejecutaSolicitudHoraExtra,this.solicitudhoraextraConstantesFunciones.activarfecha_ejecutaSolicitudHoraExtra,iSizeTabla,this,true,"fecha_ejecutaSolicitudHoraExtra","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.solicitudhoraextraConstantesFunciones.resaltarfecha_ejecutaSolicitudHoraExtra,this.solicitudhoraextraConstantesFunciones.activarfecha_ejecutaSolicitudHoraExtra,this,true,"fecha_ejecutaSolicitudHoraExtra","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new SolicitudHoraExtraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudHoraExtra,SolicitudHoraExtraConstantesFunciones.LABEL_NUMEROHORAS));

		if(this.solicitudhoraextraConstantesFunciones.mostrarnumero_horasSolicitudHoraExtra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudHoraExtraConstantesFunciones.LABEL_NUMEROHORAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.solicitudhoraextraConstantesFunciones.resaltarnumero_horasSolicitudHoraExtra,this.solicitudhoraextraConstantesFunciones.activarnumero_horasSolicitudHoraExtra,iSizeTabla,this,true,"numero_horasSolicitudHoraExtra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.solicitudhoraextraConstantesFunciones.resaltarnumero_horasSolicitudHoraExtra,this.solicitudhoraextraConstantesFunciones.activarnumero_horasSolicitudHoraExtra,this,true,"numero_horasSolicitudHoraExtra","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SolicitudHoraExtraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudHoraExtra,SolicitudHoraExtraConstantesFunciones.LABEL_COSTOUNITARIO));

		if(this.solicitudhoraextraConstantesFunciones.mostrarcosto_unitarioSolicitudHoraExtra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudHoraExtraConstantesFunciones.LABEL_COSTOUNITARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.solicitudhoraextraConstantesFunciones.resaltarcosto_unitarioSolicitudHoraExtra,this.solicitudhoraextraConstantesFunciones.activarcosto_unitarioSolicitudHoraExtra,iSizeTabla,this,true,"costo_unitarioSolicitudHoraExtra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.solicitudhoraextraConstantesFunciones.resaltarcosto_unitarioSolicitudHoraExtra,this.solicitudhoraextraConstantesFunciones.activarcosto_unitarioSolicitudHoraExtra,this,true,"costo_unitarioSolicitudHoraExtra","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SolicitudHoraExtraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudHoraExtra,SolicitudHoraExtraConstantesFunciones.LABEL_COSTOTOTAL));

		if(this.solicitudhoraextraConstantesFunciones.mostrarcosto_totalSolicitudHoraExtra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudHoraExtraConstantesFunciones.LABEL_COSTOTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.solicitudhoraextraConstantesFunciones.resaltarcosto_totalSolicitudHoraExtra,this.solicitudhoraextraConstantesFunciones.activarcosto_totalSolicitudHoraExtra,iSizeTabla,this,true,"costo_totalSolicitudHoraExtra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.solicitudhoraextraConstantesFunciones.resaltarcosto_totalSolicitudHoraExtra,this.solicitudhoraextraConstantesFunciones.activarcosto_totalSolicitudHoraExtra,this,true,"costo_totalSolicitudHoraExtra","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SolicitudHoraExtraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudHoraExtra,SolicitudHoraExtraConstantesFunciones.LABEL_DESCRIPCION));

		if(this.solicitudhoraextraConstantesFunciones.mostrardescripcionSolicitudHoraExtra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudHoraExtraConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.solicitudhoraextraConstantesFunciones.resaltardescripcionSolicitudHoraExtra,this.solicitudhoraextraConstantesFunciones.activardescripcionSolicitudHoraExtra,iSizeTabla,this,true,"descripcionSolicitudHoraExtra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.solicitudhoraextraConstantesFunciones.resaltardescripcionSolicitudHoraExtra,this.solicitudhoraextraConstantesFunciones.activardescripcionSolicitudHoraExtra,this,true,"descripcionSolicitudHoraExtra","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SolicitudHoraExtraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.solicitudhoraextraSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.solicitudhoraextraSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSolicitudHoraExtra.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.solicitudhoraextraSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.solicitudhoraextraSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSolicitudHoraExtra.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarSolicitudHoraExtra && this.isPermisoGuardarCambiosSolicitudHoraExtra) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.solicitudhoraextraSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.solicitudhoraextraSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosSolicitudHoraExtra.addColumn(tableColumn);
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
			
			this.jTableDatosSolicitudHoraExtra.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSolicitudHoraExtra && this.isPermisoGuardarCambiosSolicitudHoraExtra) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSolicitudHoraExtra && this.isPermisoGuardarCambiosSolicitudHoraExtra) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosSolicitudHoraExtra.moveColumn(this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosSolicitudHoraExtra.moveColumn(this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosSolicitudHoraExtra.moveColumn(this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosSolicitudHoraExtra.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosSolicitudHoraExtra.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosSolicitudHoraExtra,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosSolicitudHoraExtra.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosSolicitudHoraExtra.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosSolicitudHoraExtra.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=solicitudhoraextraLogic.getSolicitudHoraExtras().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=solicitudhoraextras.size()-1;
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
		//this.jTableDatosSolicitudHoraExtra.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosSolicitudHoraExtra();
			
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
				
				//this.isEsNuevoSolicitudHoraExtra=false;
					
				SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
			
				if(this.solicitudhoraextraSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormSolicitudHoraExtra==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSolicitudHoraExtra.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSolicitudHoraExtra.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.solicitudhoraextra.getsType().equals("DUPLICADO")
				   || this.solicitudhoraextra.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoSolicitudHoraExtra=true;
				
				} else {
					this.isEsNuevoSolicitudHoraExtra=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
					if(this.solicitudhoraextra.getId()>=0 && !this.solicitudhoraextra.getIsNew()) {						
						this.isEsNuevoSolicitudHoraExtra=false;
						
					} else {
						this.isEsNuevoSolicitudHoraExtra=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoSolicitudHoraExtra(esRelaciones);						
				
				this.seleccionarSolicitudHoraExtra(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.solicitudhoraextra.getId()<0) {
					this.isEsNuevoSolicitudHoraExtra=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarSolicitudHoraExtra(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarSolicitudHoraExtra(evt,rowIndex);
				}	
				
				if(this.solicitudhoraextraSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion SolicitudHoraExtra: " + this.dDif); 
					}
				}								
				
				SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarSolicitudHoraExtra(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.solicitudhoraextra)) {
					if(this.solicitudhoraextra.getId()>0) {
						this.solicitudhoraextra.setIsDeleted(true);
						
						this.solicitudhoraextrasEliminados.add(this.solicitudhoraextra);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.solicitudhoraextraLogic.getSolicitudHoraExtras().remove(this.solicitudhoraextra);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.solicitudhoraextras.remove(this.solicitudhoraextra);				
					}
					
					
					((SolicitudHoraExtraModel) this.jTableDatosSolicitudHoraExtra.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaSolicitudHoraExtra(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarSolicitudHoraExtra(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoSolicitudHoraExtra) {
			
			if(this.jInternalFrameDetalleFormSolicitudHoraExtra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSolicitudHoraExtra.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSolicitudHoraExtra.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioSolicitudHoraExtra(this.solicitudhoraextra);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.solicitudhoraextraConstantesFunciones.cargarid_empresaSolicitudHoraExtra || this.solicitudhoraextraConstantesFunciones.event_dependid_empresaSolicitudHoraExtra) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.solicitudhoraextra.getid_empresa());
									//this.inicializarActualizarBindingSolicitudHoraExtra(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(solicitudhoraextra.getEmpresa()!=null) {
							this.empresasForeignKey.add(solicitudhoraextra.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.solicitudhoraextra.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.solicitudhoraextraConstantesFunciones.cargarid_sucursalSolicitudHoraExtra || this.solicitudhoraextraConstantesFunciones.event_dependid_sucursalSolicitudHoraExtra) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.solicitudhoraextra.getid_sucursal());
									//this.inicializarActualizarBindingSolicitudHoraExtra(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(solicitudhoraextra.getSucursal()!=null) {
							this.sucursalsForeignKey.add(solicitudhoraextra.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.solicitudhoraextra.getid_sucursal(),false,"Formulario");

					//Empleado
					if(!this.solicitudhoraextraConstantesFunciones.cargarid_empleadoSolicitudHoraExtra || this.solicitudhoraextraConstantesFunciones.event_dependid_empleadoSolicitudHoraExtra) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.solicitudhoraextra.getid_empleado());
									//this.inicializarActualizarBindingSolicitudHoraExtra(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(solicitudhoraextra.getEmpleado()!=null) {
							this.empleadosForeignKey.add(solicitudhoraextra.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.solicitudhoraextra.getid_empleado(),false,"Formulario");

					//Estructura
					if(!this.solicitudhoraextraConstantesFunciones.cargarid_estructuraSolicitudHoraExtra || this.solicitudhoraextraConstantesFunciones.event_dependid_estructuraSolicitudHoraExtra) {
						//this.cargarCombosEstructurasForeignKeyLista(" where id="+this.solicitudhoraextra.getid_estructura());
									//this.inicializarActualizarBindingSolicitudHoraExtra(false,false);
						this.estructurasForeignKey=new ArrayList<Estructura>();

						if(solicitudhoraextra.getEstructura()!=null) {
							this.estructurasForeignKey.add(solicitudhoraextra.getEstructura());
						}

						this.addItemDefectoCombosForeignKeyEstructura();
						this.cargarCombosFrameEstructurasForeignKey("Todos");
					}
					this.setActualEstructuraForeignKey(this.solicitudhoraextra.getid_estructura(),false,"Formulario");

					//EmpleadoJefe
					if(!this.solicitudhoraextraConstantesFunciones.cargarid_empleado_jefeSolicitudHoraExtra || this.solicitudhoraextraConstantesFunciones.event_dependid_empleado_jefeSolicitudHoraExtra) {
						//this.cargarCombosEmpleadoJefesForeignKeyLista(" where id="+this.solicitudhoraextra.getid_empleado_jefe());
									//this.inicializarActualizarBindingSolicitudHoraExtra(false,false);
						this.empleadojefesForeignKey=new ArrayList<Empleado>();

						if(solicitudhoraextra.getEmpleadoJefe()!=null) {
							this.empleadojefesForeignKey.add(solicitudhoraextra.getEmpleadoJefe());
						}

						this.addItemDefectoCombosForeignKeyEmpleadoJefe();
						this.cargarCombosFrameEmpleadoJefesForeignKey("Todos");
					}
					this.setActualEmpleadoJefeForeignKey(this.solicitudhoraextra.getid_empleado_jefe(),false,"Formulario");

					//EstadoSolicitudNomi
					if(!this.solicitudhoraextraConstantesFunciones.cargarid_estado_solicitud_nomiSolicitudHoraExtra || this.solicitudhoraextraConstantesFunciones.event_dependid_estado_solicitud_nomiSolicitudHoraExtra) {
						//this.cargarCombosEstadoSolicitudNomisForeignKeyLista(" where id="+this.solicitudhoraextra.getid_estado_solicitud_nomi());
									//this.inicializarActualizarBindingSolicitudHoraExtra(false,false);
						this.estadosolicitudnomisForeignKey=new ArrayList<EstadoSolicitudNomi>();

						if(solicitudhoraextra.getEstadoSolicitudNomi()!=null) {
							this.estadosolicitudnomisForeignKey.add(solicitudhoraextra.getEstadoSolicitudNomi());
						}

						this.addItemDefectoCombosForeignKeyEstadoSolicitudNomi();
						this.cargarCombosFrameEstadoSolicitudNomisForeignKey("Todos");
					}
					this.setActualEstadoSolicitudNomiForeignKey(this.solicitudhoraextra.getid_estado_solicitud_nomi(),false,"Formulario");

					//EmpleadoReemplazo
					if(!this.solicitudhoraextraConstantesFunciones.cargarid_empleado_reemplazoSolicitudHoraExtra || this.solicitudhoraextraConstantesFunciones.event_dependid_empleado_reemplazoSolicitudHoraExtra) {
						//this.cargarCombosEmpleadoReemplazosForeignKeyLista(" where id="+this.solicitudhoraextra.getid_empleado_reemplazo());
									//this.inicializarActualizarBindingSolicitudHoraExtra(false,false);
						this.empleadoreemplazosForeignKey=new ArrayList<Empleado>();

						if(solicitudhoraextra.getEmpleadoReemplazo()!=null) {
							this.empleadoreemplazosForeignKey.add(solicitudhoraextra.getEmpleadoReemplazo());
						}

						this.addItemDefectoCombosForeignKeyEmpleadoReemplazo();
						this.cargarCombosFrameEmpleadoReemplazosForeignKey("Todos");
					}
					this.setActualEmpleadoReemplazoForeignKey(this.solicitudhoraextra.getid_empleado_reemplazo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesSolicitudHoraExtra("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesSolicitudHoraExtra(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSolicitudHoraExtra() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoSolicitudHoraExtra(SolicitudHoraExtra solicitudhoraextra) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoSolicitudHoraExtra(solicitudhoraextra,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoSolicitudHoraExtra(SolicitudHoraExtra solicitudhoraextra,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioSolicitudHoraExtra(solicitudhoraextra);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeySolicitudHoraExtra(solicitudhoraextra,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeySolicitudHoraExtra(solicitudhoraextra);
	}
	
	public void setVariablesObjetoActualToFormularioSolicitudHoraExtra(SolicitudHoraExtra solicitudhoraextra) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormSolicitudHoraExtra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelidSolicitudHoraExtra.setText(solicitudhoraextra.getId().toString());
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldsecuencialSolicitudHoraExtra.setText(solicitudhoraextra.getsecuencial());
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jDateChooserfecha_solicitaSolicitudHoraExtra.setDate(solicitudhoraextra.getfecha_solicita());
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jDateChooserfecha_ejecutaSolicitudHoraExtra.setDate(solicitudhoraextra.getfecha_ejecuta());
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldnumero_horasSolicitudHoraExtra.setText(solicitudhoraextra.getnumero_horas().toString());
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldcosto_unitarioSolicitudHoraExtra.setText(solicitudhoraextra.getcosto_unitario().toString());
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldcosto_totalSolicitudHoraExtra.setText(solicitudhoraextra.getcosto_total().toString());
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextAreadescripcionSolicitudHoraExtra.setText(solicitudhoraextra.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,SolicitudHoraExtra solicitudhoraextraLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,solicitudhoraextraLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,SolicitudHoraExtra solicitudhoraextraLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				solicitudhoraextraLocal=this.solicitudhoraextra;
			} else {
				solicitudhoraextraLocal=this.solicitudhoraextraAnterior;
			}
		}
		
		if(this.permiteMantenimiento(solicitudhoraextraLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoSolicitudHoraExtra(solicitudhoraextraLocal,true);
					
					if(solicitudhoraextraSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(solicitudhoraextraLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(solicitudhoraextraLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoSolicitudHoraExtra(SolicitudHoraExtra solicitudhoraextra,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(solicitudhoraextra,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(solicitudhoraextra);
	}
	
	public void setVariablesFormularioToObjetoActualSolicitudHoraExtra(SolicitudHoraExtra solicitudhoraextra,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(solicitudhoraextra,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualSolicitudHoraExtra(SolicitudHoraExtra solicitudhoraextra,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormSolicitudHoraExtra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelidSolicitudHoraExtra.getText()==null || this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelidSolicitudHoraExtra.getText()=="" || this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelidSolicitudHoraExtra.getText()=="Id") {
				this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelidSolicitudHoraExtra.setText("0");
			}

			if(conColumnasBase) {solicitudhoraextra.setId(Long.parseLong(this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelidSolicitudHoraExtra.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SolicitudHoraExtraConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelIdSolicitudHoraExtra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			solicitudhoraextra.setsecuencial(this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldsecuencialSolicitudHoraExtra.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SolicitudHoraExtraConstantesFunciones.LABEL_SECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelsecuencialSolicitudHoraExtra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			solicitudhoraextra.setfecha_solicita(this.jInternalFrameDetalleFormSolicitudHoraExtra.jDateChooserfecha_solicitaSolicitudHoraExtra.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SolicitudHoraExtraConstantesFunciones.LABEL_FECHASOLICITA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelfecha_solicitaSolicitudHoraExtra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			solicitudhoraextra.setfecha_ejecuta(this.jInternalFrameDetalleFormSolicitudHoraExtra.jDateChooserfecha_ejecutaSolicitudHoraExtra.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SolicitudHoraExtraConstantesFunciones.LABEL_FECHAEJECUTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelfecha_ejecutaSolicitudHoraExtra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			solicitudhoraextra.setnumero_horas(Integer.parseInt(this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldnumero_horasSolicitudHoraExtra.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SolicitudHoraExtraConstantesFunciones.LABEL_NUMEROHORAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelnumero_horasSolicitudHoraExtra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			solicitudhoraextra.setcosto_unitario(Double.parseDouble(this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldcosto_unitarioSolicitudHoraExtra.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SolicitudHoraExtraConstantesFunciones.LABEL_COSTOUNITARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelcosto_unitarioSolicitudHoraExtra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			solicitudhoraextra.setcosto_total(Double.parseDouble(this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldcosto_totalSolicitudHoraExtra.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SolicitudHoraExtraConstantesFunciones.LABEL_COSTOTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelcosto_totalSolicitudHoraExtra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			solicitudhoraextra.setdescripcion(this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextAreadescripcionSolicitudHoraExtra.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SolicitudHoraExtraConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabeldescripcionSolicitudHoraExtra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSolicitudHoraExtra(SolicitudHoraExtra solicitudhoraextraBean,SolicitudHoraExtra solicitudhoraextra,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && solicitudhoraextraBean.getid_empleado()!=null && !solicitudhoraextraBean.getid_empleado().equals(-1L))) {solicitudhoraextra.setid_empleado(solicitudhoraextraBean.getid_empleado());}
			if(conDefault || (!conDefault && solicitudhoraextraBean.getid_estructura()!=null && !solicitudhoraextraBean.getid_estructura().equals(-1L))) {solicitudhoraextra.setid_estructura(solicitudhoraextraBean.getid_estructura());}
			if(conDefault || (!conDefault && solicitudhoraextraBean.getid_empleado_jefe()!=null && !solicitudhoraextraBean.getid_empleado_jefe().equals(-1L))) {solicitudhoraextra.setid_empleado_jefe(solicitudhoraextraBean.getid_empleado_jefe());}
			if(conDefault || (!conDefault && solicitudhoraextraBean.getid_estado_solicitud_nomi()!=null && !solicitudhoraextraBean.getid_estado_solicitud_nomi().equals(-1L))) {solicitudhoraextra.setid_estado_solicitud_nomi(solicitudhoraextraBean.getid_estado_solicitud_nomi());}
			if(conDefault || (!conDefault && solicitudhoraextraBean.getid_empleado_reemplazo()!=null && !solicitudhoraextraBean.getid_empleado_reemplazo().equals(-1L))) {solicitudhoraextra.setid_empleado_reemplazo(solicitudhoraextraBean.getid_empleado_reemplazo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosSolicitudHoraExtra(SolicitudHoraExtra solicitudhoraextraOrigen,SolicitudHoraExtra solicitudhoraextra,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && solicitudhoraextraOrigen.getId()!=null && !solicitudhoraextraOrigen.getId().equals(0L))) {solicitudhoraextra.setId(solicitudhoraextraOrigen.getId());}}
			if(conDefault || (!conDefault && solicitudhoraextraOrigen.getid_empleado()!=null && !solicitudhoraextraOrigen.getid_empleado().equals(-1L))) {solicitudhoraextra.setid_empleado(solicitudhoraextraOrigen.getid_empleado());}
			if(conDefault || (!conDefault && solicitudhoraextraOrigen.getid_estructura()!=null && !solicitudhoraextraOrigen.getid_estructura().equals(-1L))) {solicitudhoraextra.setid_estructura(solicitudhoraextraOrigen.getid_estructura());}
			if(conDefault || (!conDefault && solicitudhoraextraOrigen.getid_empleado_jefe()!=null && !solicitudhoraextraOrigen.getid_empleado_jefe().equals(-1L))) {solicitudhoraextra.setid_empleado_jefe(solicitudhoraextraOrigen.getid_empleado_jefe());}
			if(conDefault || (!conDefault && solicitudhoraextraOrigen.getid_estado_solicitud_nomi()!=null && !solicitudhoraextraOrigen.getid_estado_solicitud_nomi().equals(-1L))) {solicitudhoraextra.setid_estado_solicitud_nomi(solicitudhoraextraOrigen.getid_estado_solicitud_nomi());}
			if(conDefault || (!conDefault && solicitudhoraextraOrigen.getid_empleado_reemplazo()!=null && !solicitudhoraextraOrigen.getid_empleado_reemplazo().equals(-1L))) {solicitudhoraextra.setid_empleado_reemplazo(solicitudhoraextraOrigen.getid_empleado_reemplazo());}
			if(conDefault || (!conDefault && solicitudhoraextraOrigen.getsecuencial()!=null && !solicitudhoraextraOrigen.getsecuencial().equals(""))) {solicitudhoraextra.setsecuencial(solicitudhoraextraOrigen.getsecuencial());}
			if(conDefault || (!conDefault && solicitudhoraextraOrigen.getfecha_solicita()!=null && !solicitudhoraextraOrigen.getfecha_solicita().equals(new Date()))) {solicitudhoraextra.setfecha_solicita(solicitudhoraextraOrigen.getfecha_solicita());}
			if(conDefault || (!conDefault && solicitudhoraextraOrigen.getfecha_ejecuta()!=null && !solicitudhoraextraOrigen.getfecha_ejecuta().equals(new Date()))) {solicitudhoraextra.setfecha_ejecuta(solicitudhoraextraOrigen.getfecha_ejecuta());}
			if(conDefault || (!conDefault && solicitudhoraextraOrigen.getnumero_horas()!=null && !solicitudhoraextraOrigen.getnumero_horas().equals(0))) {solicitudhoraextra.setnumero_horas(solicitudhoraextraOrigen.getnumero_horas());}
			if(conDefault || (!conDefault && solicitudhoraextraOrigen.getcosto_unitario()!=null && !solicitudhoraextraOrigen.getcosto_unitario().equals(0.0))) {solicitudhoraextra.setcosto_unitario(solicitudhoraextraOrigen.getcosto_unitario());}
			if(conDefault || (!conDefault && solicitudhoraextraOrigen.getcosto_total()!=null && !solicitudhoraextraOrigen.getcosto_total().equals(0.0))) {solicitudhoraextra.setcosto_total(solicitudhoraextraOrigen.getcosto_total());}
			if(conDefault || (!conDefault && solicitudhoraextraOrigen.getdescripcion()!=null && !solicitudhoraextraOrigen.getdescripcion().equals(""))) {solicitudhoraextra.setdescripcion(solicitudhoraextraOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSolicitudHoraExtra(SolicitudHoraExtra solicitudhoraextra) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelidSolicitudHoraExtra.setText(solicitudhoraextra.getId().toString());
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldsecuencialSolicitudHoraExtra.setText(solicitudhoraextra.getsecuencial());
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jDateChooserfecha_solicitaSolicitudHoraExtra.setDate(solicitudhoraextra.getfecha_solicita());
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jDateChooserfecha_ejecutaSolicitudHoraExtra.setDate(solicitudhoraextra.getfecha_ejecuta());
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldnumero_horasSolicitudHoraExtra.setText(solicitudhoraextra.getnumero_horas().toString());
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldcosto_unitarioSolicitudHoraExtra.setText(solicitudhoraextra.getcosto_unitario().toString());
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldcosto_totalSolicitudHoraExtra.setText(solicitudhoraextra.getcosto_total().toString());
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextAreadescripcionSolicitudHoraExtra.setText(solicitudhoraextra.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSolicitudHoraExtra(SolicitudHoraExtraBean solicitudhoraextraBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelidSolicitudHoraExtra.setText(solicitudhoraextraBean.getId().toString());
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldsecuencialSolicitudHoraExtra.setText(solicitudhoraextraBean.getsecuencial());
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jDateChooserfecha_solicitaSolicitudHoraExtra.setDate(solicitudhoraextraBean.getfecha_solicita());
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jDateChooserfecha_ejecutaSolicitudHoraExtra.setDate(solicitudhoraextraBean.getfecha_ejecuta());
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldnumero_horasSolicitudHoraExtra.setText(solicitudhoraextraBean.getnumero_horas().toString());
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldcosto_unitarioSolicitudHoraExtra.setText(solicitudhoraextraBean.getcosto_unitario().toString());
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldcosto_totalSolicitudHoraExtra.setText(solicitudhoraextraBean.getcosto_total().toString());
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextAreadescripcionSolicitudHoraExtra.setText(solicitudhoraextraBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanSolicitudHoraExtra(SolicitudHoraExtraParameterReturnGeneral solicitudhoraextraReturnGeneral,SolicitudHoraExtraBean solicitudhoraextraBean,Boolean conDefault) throws Exception { 
		try {
			SolicitudHoraExtra solicitudhoraextraLocal=new SolicitudHoraExtra();
			
			solicitudhoraextraLocal=solicitudhoraextraReturnGeneral.getSolicitudHoraExtra();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && solicitudhoraextraLocal.getId()!=null && !solicitudhoraextraLocal.getId().equals(0L))) {solicitudhoraextraBean.setId(solicitudhoraextraLocal.getId());}}
			if(conDefault || (!conDefault && solicitudhoraextraLocal.getid_empleado()!=null && !solicitudhoraextraLocal.getid_empleado().equals(-1L))) {solicitudhoraextraBean.setid_empleado(solicitudhoraextraLocal.getid_empleado());}
			if(conDefault || (!conDefault && solicitudhoraextraLocal.getid_estructura()!=null && !solicitudhoraextraLocal.getid_estructura().equals(-1L))) {solicitudhoraextraBean.setid_estructura(solicitudhoraextraLocal.getid_estructura());}
			if(conDefault || (!conDefault && solicitudhoraextraLocal.getid_empleado_jefe()!=null && !solicitudhoraextraLocal.getid_empleado_jefe().equals(-1L))) {solicitudhoraextraBean.setid_empleado_jefe(solicitudhoraextraLocal.getid_empleado_jefe());}
			if(conDefault || (!conDefault && solicitudhoraextraLocal.getid_estado_solicitud_nomi()!=null && !solicitudhoraextraLocal.getid_estado_solicitud_nomi().equals(-1L))) {solicitudhoraextraBean.setid_estado_solicitud_nomi(solicitudhoraextraLocal.getid_estado_solicitud_nomi());}
			if(conDefault || (!conDefault && solicitudhoraextraLocal.getid_empleado_reemplazo()!=null && !solicitudhoraextraLocal.getid_empleado_reemplazo().equals(-1L))) {solicitudhoraextraBean.setid_empleado_reemplazo(solicitudhoraextraLocal.getid_empleado_reemplazo());}
			if(conDefault || (!conDefault && solicitudhoraextraLocal.getsecuencial()!=null && !solicitudhoraextraLocal.getsecuencial().equals(""))) {solicitudhoraextraBean.setsecuencial(solicitudhoraextraLocal.getsecuencial());}
			if(conDefault || (!conDefault && solicitudhoraextraLocal.getfecha_solicita()!=null && !solicitudhoraextraLocal.getfecha_solicita().equals(new Date()))) {solicitudhoraextraBean.setfecha_solicita(solicitudhoraextraLocal.getfecha_solicita());}
			if(conDefault || (!conDefault && solicitudhoraextraLocal.getfecha_ejecuta()!=null && !solicitudhoraextraLocal.getfecha_ejecuta().equals(new Date()))) {solicitudhoraextraBean.setfecha_ejecuta(solicitudhoraextraLocal.getfecha_ejecuta());}
			if(conDefault || (!conDefault && solicitudhoraextraLocal.getnumero_horas()!=null && !solicitudhoraextraLocal.getnumero_horas().equals(0))) {solicitudhoraextraBean.setnumero_horas(solicitudhoraextraLocal.getnumero_horas());}
			if(conDefault || (!conDefault && solicitudhoraextraLocal.getcosto_unitario()!=null && !solicitudhoraextraLocal.getcosto_unitario().equals(0.0))) {solicitudhoraextraBean.setcosto_unitario(solicitudhoraextraLocal.getcosto_unitario());}
			if(conDefault || (!conDefault && solicitudhoraextraLocal.getcosto_total()!=null && !solicitudhoraextraLocal.getcosto_total().equals(0.0))) {solicitudhoraextraBean.setcosto_total(solicitudhoraextraLocal.getcosto_total());}
			if(conDefault || (!conDefault && solicitudhoraextraLocal.getdescripcion()!=null && !solicitudhoraextraLocal.getdescripcion().equals(""))) {solicitudhoraextraBean.setdescripcion(solicitudhoraextraLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxSolicitudHoraExtraGenerico(Long idSolicitudHoraExtraSeleccionado,JComboBox jComboBoxSolicitudHoraExtra,List<SolicitudHoraExtra> solicitudhoraextrasLocal)throws Exception {
		try {
			SolicitudHoraExtra  solicitudhoraextraTemp=null;

			for(SolicitudHoraExtra solicitudhoraextraAux:solicitudhoraextrasLocal) {
				if(solicitudhoraextraAux.getId()!=null && solicitudhoraextraAux.getId().equals(idSolicitudHoraExtraSeleccionado)) {
					solicitudhoraextraTemp=solicitudhoraextraAux;
					break;
				}
			}

			jComboBoxSolicitudHoraExtra.setSelectedItem(solicitudhoraextraTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxSolicitudHoraExtraGenerico(JComboBox jComboBoxSolicitudHoraExtra,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSolicitudHoraExtra.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSolicitudHoraExtra.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSolicitudHoraExtra.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSolicitudHoraExtra.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			solicitudhoraextra=(SolicitudHoraExtra) solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			solicitudhoraextra =(SolicitudHoraExtra) solicitudhoraextras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!solicitudhoraextra.getIsNew() && !solicitudhoraextra.getIsChanged() && !solicitudhoraextra.getIsDeleted()) {
				sDescripcion=solicitudhoraextra.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=solicitudhoraextra.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!solicitudhoraextra.getIsNew() && !solicitudhoraextra.getIsChanged() && !solicitudhoraextra.getIsDeleted()) {
				sDescripcion=solicitudhoraextra.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=solicitudhoraextra.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!solicitudhoraextra.getIsNew() && !solicitudhoraextra.getIsChanged() && !solicitudhoraextra.getIsDeleted()) {
				sDescripcion=solicitudhoraextra.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=solicitudhoraextra.getempleado_descripcion();
			}
		}

		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!solicitudhoraextra.getIsNew() && !solicitudhoraextra.getIsChanged() && !solicitudhoraextra.getIsDeleted()) {
				sDescripcion=solicitudhoraextra.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=solicitudhoraextra.getestructura_descripcion();
			}
		}

		if(sTipo.equals("EmpleadoJefe")) {
			//sDescripcion=this.getActualEmpleadoJefeForeignKeyDescripcion((Long)value);
			if(!solicitudhoraextra.getIsNew() && !solicitudhoraextra.getIsChanged() && !solicitudhoraextra.getIsDeleted()) {
				sDescripcion=solicitudhoraextra.getempleadojefe_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoJefeForeignKeyDescripcion((Long)value);
				sDescripcion=solicitudhoraextra.getempleadojefe_descripcion();
			}
		}

		if(sTipo.equals("EstadoSolicitudNomi")) {
			//sDescripcion=this.getActualEstadoSolicitudNomiForeignKeyDescripcion((Long)value);
			if(!solicitudhoraextra.getIsNew() && !solicitudhoraextra.getIsChanged() && !solicitudhoraextra.getIsDeleted()) {
				sDescripcion=solicitudhoraextra.getestadosolicitudnomi_descripcion();
			} else {
				//sDescripcion=this.getActualEstadoSolicitudNomiForeignKeyDescripcion((Long)value);
				sDescripcion=solicitudhoraextra.getestadosolicitudnomi_descripcion();
			}
		}

		if(sTipo.equals("EmpleadoReemplazo")) {
			//sDescripcion=this.getActualEmpleadoReemplazoForeignKeyDescripcion((Long)value);
			if(!solicitudhoraextra.getIsNew() && !solicitudhoraextra.getIsChanged() && !solicitudhoraextra.getIsDeleted()) {
				sDescripcion=solicitudhoraextra.getempleadoreemplazo_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoReemplazoForeignKeyDescripcion((Long)value);
				sDescripcion=solicitudhoraextra.getempleadoreemplazo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		SolicitudHoraExtra solicitudhoraextraRow=new SolicitudHoraExtra();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			solicitudhoraextraRow=(SolicitudHoraExtra) solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			solicitudhoraextraRow=(SolicitudHoraExtra) solicitudhoraextras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualSolicitudHoraExtra(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaNuevoSolicitudHoraExtra && this.isPermisoNuevoSolicitudHoraExtra));			
			this.jButtonDuplicarSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaDuplicarSolicitudHoraExtra && this.isPermisoDuplicarSolicitudHoraExtra));			
			this.jButtonCopiarSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaCopiarSolicitudHoraExtra && this.isPermisoCopiarSolicitudHoraExtra));
			this.jButtonVerFormSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaVerFormSolicitudHoraExtra && this.isPermisoVerFormSolicitudHoraExtra));
			
			this.jButtonAbrirOrderBySolicitudHoraExtra.setVisible((this.isVisibilidadCeldaOrdenSolicitudHoraExtra && this.isPermisoOrdenSolicitudHoraExtra));			
			
			this.jButtonNuevoRelacionesSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaNuevoRelacionesSolicitudHoraExtra && this.isPermisoNuevoSolicitudHoraExtra));			
			this.jButtonNuevoGuardarCambiosSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaNuevoSolicitudHoraExtra && this.isPermisoNuevoSolicitudHoraExtra && this.isPermisoGuardarCambiosSolicitudHoraExtra));
			
			if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonModificarSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaModificarSolicitudHoraExtra && this.isPermisoActualizarSolicitudHoraExtra));	
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonActualizarSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaActualizarSolicitudHoraExtra && this.isPermisoActualizarSolicitudHoraExtra));	
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonEliminarSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaEliminarSolicitudHoraExtra && this.isPermisoEliminarSolicitudHoraExtra));
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonCancelarSolicitudHoraExtra.setVisible(this.isVisibilidadCeldaCancelarSolicitudHoraExtra);							
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonGuardarCambiosSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaGuardarSolicitudHoraExtra && this.isPermisoGuardarCambiosSolicitudHoraExtra));			
			
			}
						
			this.jButtonGuardarCambiosTablaSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaGuardarCambiosSolicitudHoraExtra && this.isPermisoGuardarCambiosSolicitudHoraExtra));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaNuevoSolicitudHoraExtra && this.isPermisoNuevoSolicitudHoraExtra));						
			this.jButtonDuplicarToolBarSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaDuplicarSolicitudHoraExtra && this.isPermisoDuplicarSolicitudHoraExtra));						
			this.jButtonCopiarToolBarSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaCopiarSolicitudHoraExtra && this.isPermisoCopiarSolicitudHoraExtra));			
			this.jButtonVerFormToolBarSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaVerFormSolicitudHoraExtra && this.isPermisoVerFormSolicitudHoraExtra));			
			this.jButtonAbrirOrderByToolBarSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaOrdenSolicitudHoraExtra && this.isPermisoOrdenSolicitudHoraExtra));
			this.jButtonNuevoRelacionesToolBarSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaNuevoRelacionesSolicitudHoraExtra && this.isPermisoNuevoSolicitudHoraExtra));			
			this.jButtonNuevoGuardarCambiosToolBarSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaNuevoSolicitudHoraExtra && this.isPermisoNuevoSolicitudHoraExtra && this.isPermisoGuardarCambiosSolicitudHoraExtra));			
			
			if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonModificarToolBarSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaModificarSolicitudHoraExtra && this.isPermisoActualizarSolicitudHoraExtra));	
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonActualizarToolBarSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaActualizarSolicitudHoraExtra  && this.isPermisoActualizarSolicitudHoraExtra));	
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonEliminarToolBarSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaEliminarSolicitudHoraExtra && this.isPermisoEliminarSolicitudHoraExtra));
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonCancelarToolBarSolicitudHoraExtra.setVisible(this.isVisibilidadCeldaCancelarSolicitudHoraExtra);				
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonGuardarCambiosToolBarSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaGuardarSolicitudHoraExtra && this.isPermisoGuardarCambiosSolicitudHoraExtra));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaGuardarCambiosSolicitudHoraExtra && this.isPermisoGuardarCambiosSolicitudHoraExtra));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaNuevoSolicitudHoraExtra && this.isPermisoNuevoSolicitudHoraExtra));			
			this.jMenuItemDuplicarSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaDuplicarSolicitudHoraExtra && this.isPermisoDuplicarSolicitudHoraExtra));			
			this.jMenuItemCopiarSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaCopiarSolicitudHoraExtra && this.isPermisoCopiarSolicitudHoraExtra));			
			this.jMenuItemVerFormSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaVerFormSolicitudHoraExtra && this.isPermisoVerFormSolicitudHoraExtra));			
			this.jMenuItemAbrirOrderBySolicitudHoraExtra.setVisible((this.isVisibilidadCeldaOrdenSolicitudHoraExtra && this.isPermisoOrdenSolicitudHoraExtra));			
			//this.jMenuItemMostrarOcultarSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaOrdenSolicitudHoraExtra && this.isPermisoOrdenSolicitudHoraExtra));
			this.jMenuItemDetalleAbrirOrderBySolicitudHoraExtra.setVisible((this.isVisibilidadCeldaOrdenSolicitudHoraExtra && this.isPermisoOrdenSolicitudHoraExtra));			
			//this.jMenuItemDetalleMostrarOcultarSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaOrdenSolicitudHoraExtra && this.isPermisoOrdenSolicitudHoraExtra));			
			this.jMenuItemNuevoRelacionesSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaNuevoRelacionesSolicitudHoraExtra && this.isPermisoNuevoSolicitudHoraExtra));			
			this.jMenuItemNuevoGuardarCambiosSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaNuevoSolicitudHoraExtra && this.isPermisoNuevoSolicitudHoraExtra && this.isPermisoGuardarCambiosSolicitudHoraExtra));									
			
			if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jMenuItemModificarSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaModificarSolicitudHoraExtra && this.isPermisoActualizarSolicitudHoraExtra));	
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jMenuItemActualizarSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaActualizarSolicitudHoraExtra && this.isPermisoActualizarSolicitudHoraExtra));	
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jMenuItemEliminarSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaEliminarSolicitudHoraExtra && this.isPermisoEliminarSolicitudHoraExtra));
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jMenuItemCancelarSolicitudHoraExtra.setVisible(this.isVisibilidadCeldaCancelarSolicitudHoraExtra);				
			}
			
			this.jMenuItemGuardarCambiosSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaGuardarSolicitudHoraExtra && this.isPermisoGuardarCambiosSolicitudHoraExtra));						
			this.jMenuItemGuardarCambiosTablaSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaGuardarCambiosSolicitudHoraExtra && this.isPermisoGuardarCambiosSolicitudHoraExtra));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoSolicitudHoraExtra=this.jButtonNuevoSolicitudHoraExtra.isVisible();
			this.isVisibilidadCeldaDuplicarSolicitudHoraExtra=this.jButtonDuplicarSolicitudHoraExtra.isVisible();
			this.isVisibilidadCeldaCopiarSolicitudHoraExtra=this.jButtonCopiarSolicitudHoraExtra.isVisible();
			this.isVisibilidadCeldaVerFormSolicitudHoraExtra=this.jButtonVerFormSolicitudHoraExtra.isVisible();
			
			this.isVisibilidadCeldaOrdenSolicitudHoraExtra=this.jButtonAbrirOrderBySolicitudHoraExtra.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesSolicitudHoraExtra=this.jButtonNuevoRelacionesSolicitudHoraExtra.isVisible();
			this.isVisibilidadCeldaModificarSolicitudHoraExtra=this.jButtonModificarSolicitudHoraExtra.isVisible();
			
			if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
			this.isVisibilidadCeldaActualizarSolicitudHoraExtra=this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonActualizarSolicitudHoraExtra.isVisible();
			this.isVisibilidadCeldaEliminarSolicitudHoraExtra=this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonEliminarSolicitudHoraExtra.isVisible();
			this.isVisibilidadCeldaCancelarSolicitudHoraExtra=this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonCancelarSolicitudHoraExtra.isVisible();
			this.isVisibilidadCeldaGuardarSolicitudHoraExtra=this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonGuardarCambiosSolicitudHoraExtra.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosSolicitudHoraExtra=this.jButtonGuardarCambiosTablaSolicitudHoraExtra.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoSolicitudHoraExtra=this.jButtonNuevoToolBarSolicitudHoraExtra.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSolicitudHoraExtra=this.jButtonNuevoRelacionesToolBarSolicitudHoraExtra.isVisible();
			
			if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
			this.isVisibilidadCeldaModificarSolicitudHoraExtra=this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonModificarToolBarSolicitudHoraExtra.isVisible();
			this.isVisibilidadCeldaActualizarSolicitudHoraExtra=this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonActualizarToolBarSolicitudHoraExtra.isVisible();
			this.isVisibilidadCeldaEliminarSolicitudHoraExtra=this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonEliminarToolBarSolicitudHoraExtra.isVisible();
			this.isVisibilidadCeldaCancelarSolicitudHoraExtra=this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonCancelarToolBarSolicitudHoraExtra.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSolicitudHoraExtra=this.jButtonGuardarCambiosToolBarSolicitudHoraExtra.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSolicitudHoraExtra=this.jButtonGuardarCambiosTablaToolBarSolicitudHoraExtra.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoSolicitudHoraExtra=this.jMenuItemNuevoSolicitudHoraExtra.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSolicitudHoraExtra=this.jMenuItemNuevoRelacionesSolicitudHoraExtra.isVisible();
			
			if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
			this.isVisibilidadCeldaModificarSolicitudHoraExtra=this.jInternalFrameDetalleFormSolicitudHoraExtra.jMenuItemModificarSolicitudHoraExtra.isVisible();
			this.isVisibilidadCeldaActualizarSolicitudHoraExtra=this.jInternalFrameDetalleFormSolicitudHoraExtra.jMenuItemActualizarSolicitudHoraExtra.isVisible();
			this.isVisibilidadCeldaEliminarSolicitudHoraExtra=this.jInternalFrameDetalleFormSolicitudHoraExtra.jMenuItemEliminarSolicitudHoraExtra.isVisible();
			this.isVisibilidadCeldaCancelarSolicitudHoraExtra=this.jInternalFrameDetalleFormSolicitudHoraExtra.jMenuItemCancelarSolicitudHoraExtra.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSolicitudHoraExtra=this.jMenuItemGuardarCambiosSolicitudHoraExtra.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSolicitudHoraExtra=this.jMenuItemGuardarCambiosTablaSolicitudHoraExtra.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesSolicitudHoraExtra(Boolean esInicializar) {
		if(SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {			
			if(this.solicitudhoraextraSessionBean.getConGuardarRelaciones()) {
				//if(this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesSolicitudHoraExtra();
			}
			
			this.inicializarActualizarBindingBotonesManualSolicitudHoraExtra(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualSolicitudHoraExtra() {
		this.jButtonNuevoSolicitudHoraExtra.setVisible(this.isPermisoNuevoSolicitudHoraExtra);			
		this.jButtonDuplicarSolicitudHoraExtra.setVisible(this.isPermisoDuplicarSolicitudHoraExtra);			
		this.jButtonCopiarSolicitudHoraExtra.setVisible(this.isPermisoCopiarSolicitudHoraExtra);			
		this.jButtonVerFormSolicitudHoraExtra.setVisible(this.isPermisoVerFormSolicitudHoraExtra);			
		
		this.jButtonAbrirOrderBySolicitudHoraExtra.setVisible(this.isPermisoOrdenSolicitudHoraExtra);					
		
		this.jButtonNuevoRelacionesSolicitudHoraExtra.setVisible(this.isPermisoNuevoSolicitudHoraExtra);			
		
		if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonModificarSolicitudHoraExtra.setVisible(this.isPermisoActualizarSolicitudHoraExtra);	
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonActualizarSolicitudHoraExtra.setVisible(this.isPermisoActualizarSolicitudHoraExtra);	
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonEliminarSolicitudHoraExtra.setVisible(this.isPermisoEliminarSolicitudHoraExtra);
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonCancelarSolicitudHoraExtra.setVisible(this.isVisibilidadCeldaCancelarSolicitudHoraExtra);						
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonGuardarCambiosSolicitudHoraExtra.setVisible(this.isPermisoGuardarCambiosSolicitudHoraExtra);							
		}
		
		this.jButtonGuardarCambiosTablaSolicitudHoraExtra.setVisible(this.isPermisoActualizarSolicitudHoraExtra);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleSolicitudHoraExtra() {
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonModificarSolicitudHoraExtra.setVisible(this.isPermisoActualizarSolicitudHoraExtra);	
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonActualizarSolicitudHoraExtra.setVisible(this.isPermisoActualizarSolicitudHoraExtra);	
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonEliminarSolicitudHoraExtra.setVisible(this.isPermisoEliminarSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonCancelarSolicitudHoraExtra.setVisible(this.isVisibilidadCeldaCancelarSolicitudHoraExtra);							
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonGuardarCambiosSolicitudHoraExtra.setVisible((this.isVisibilidadCeldaGuardarSolicitudHoraExtra && this.isPermisoGuardarCambiosSolicitudHoraExtra));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosSolicitudHoraExtra() {
		if(SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualSolicitudHoraExtra();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesSolicitudHoraExtra() {
	}
	
	public void jTableDatosSolicitudHoraExtraListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarSolicitudHoraExtra(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidSolicitudHoraExtraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.getsolicitudhoraextra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudhoraextra==null) {
						this.solicitudhoraextra = new SolicitudHoraExtra();
					}

					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.solicitudhoraextra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
				}

				if(this.solicitudhoraextra.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.solicitudhoraextra.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudHoraExtra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaSolicitudHoraExtraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebSolicitudHoraExtra(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSolicitudHoraExtra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSolicitudHoraExtra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.getsolicitudhoraextra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.solicitudhoraextraLogic.getConnexion());

				if(this.solicitudhoraextra.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.solicitudhoraextra.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSolicitudHoraExtra=(TitledBorder)this.jScrollPanelDatosSolicitudHoraExtra.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderSolicitudHoraExtra.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaSolicitudHoraExtraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.getsolicitudhoraextra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudhoraextra==null) {
						this.solicitudhoraextra = new SolicitudHoraExtra();
					}

					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.solicitudhoraextra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
				}

				if(this.solicitudhoraextra.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.solicitudhoraextra.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudHoraExtra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalSolicitudHoraExtraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebSolicitudHoraExtra(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSolicitudHoraExtra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSolicitudHoraExtra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.getsolicitudhoraextra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.solicitudhoraextraLogic.getConnexion());

				if(this.solicitudhoraextra.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.solicitudhoraextra.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSolicitudHoraExtra=(TitledBorder)this.jScrollPanelDatosSolicitudHoraExtra.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderSolicitudHoraExtra.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalSolicitudHoraExtraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.getsolicitudhoraextra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudhoraextra==null) {
						this.solicitudhoraextra = new SolicitudHoraExtra();
					}

					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.solicitudhoraextra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
				}

				if(this.solicitudhoraextra.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.solicitudhoraextra.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudHoraExtra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoSolicitudHoraExtraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebSolicitudHoraExtra(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSolicitudHoraExtra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSolicitudHoraExtra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.getsolicitudhoraextra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.solicitudhoraextraLogic.getConnexion());

				if(this.solicitudhoraextra.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.solicitudhoraextra.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSolicitudHoraExtra=(TitledBorder)this.jScrollPanelDatosSolicitudHoraExtra.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderSolicitudHoraExtra.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoSolicitudHoraExtraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.getsolicitudhoraextra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudhoraextra==null) {
						this.solicitudhoraextra = new SolicitudHoraExtra();
					}

					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.solicitudhoraextra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
				}

				if(this.solicitudhoraextra.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.solicitudhoraextra.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudHoraExtra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraSolicitudHoraExtraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebSolicitudHoraExtra(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSolicitudHoraExtra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSolicitudHoraExtra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.getsolicitudhoraextra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.solicitudhoraextraLogic.getConnexion());

				if(this.solicitudhoraextra.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.solicitudhoraextra.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSolicitudHoraExtra=(TitledBorder)this.jScrollPanelDatosSolicitudHoraExtra.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderSolicitudHoraExtra.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraSolicitudHoraExtraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.getsolicitudhoraextra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudhoraextra==null) {
						this.solicitudhoraextra = new SolicitudHoraExtra();
					}

					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.solicitudhoraextra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
				}

				if(this.solicitudhoraextra.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.solicitudhoraextra.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudHoraExtra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleado_jefeSolicitudHoraExtraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleadojefe=true;

			idTienePermisoempleadojefe=this.tienePermisosUsuarioEnPaginaWebSolicitudHoraExtra(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleadojefe) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSolicitudHoraExtra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSolicitudHoraExtra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.getsolicitudhoraextra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);

				this.empleadojefeBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadojefeBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadojefeBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.solicitudhoraextraLogic.getConnexion());

				if(this.solicitudhoraextra.getid_empleado_jefe()!=null) {
					this.empleadojefeBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadojefeBeanSwingJInternalFrame.setIdActual(this.solicitudhoraextra.getid_empleado_jefe());
					this.empleadojefeBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadojefeBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadojefeBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadojefeBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSolicitudHoraExtra=(TitledBorder)this.jScrollPanelDatosSolicitudHoraExtra.getBorder();
				TitledBorder titledBorderempleadojefe=(TitledBorder)this.empleadojefeBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleadojefe.setTitle(titledBorderSolicitudHoraExtra.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleado_jefeSolicitudHoraExtraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.getsolicitudhoraextra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudhoraextra==null) {
						this.solicitudhoraextra = new SolicitudHoraExtra();
					}

					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.solicitudhoraextra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
				}

				if(this.solicitudhoraextra.getid_empleado_jefe()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado_jefe = "+this.solicitudhoraextra.getid_empleado_jefe().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudHoraExtra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estado_solicitud_nomiSolicitudHoraExtraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestadosolicitudnomi=true;

			idTienePermisoestadosolicitudnomi=this.tienePermisosUsuarioEnPaginaWebSolicitudHoraExtra(EstadoSolicitudNomiConstantesFunciones.CLASSNAME);

			if(idTienePermisoestadosolicitudnomi) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSolicitudHoraExtra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSolicitudHoraExtra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.getsolicitudhoraextra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);

				this.estadosolicitudnomiBeanSwingJInternalFrame=new EstadoSolicitudNomiBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estadosolicitudnomiBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estadosolicitudnomiBeanSwingJInternalFrame.getEstadoSolicitudNomiLogic().setConnexion(this.solicitudhoraextraLogic.getConnexion());

				if(this.solicitudhoraextra.getid_estado_solicitud_nomi()!=null) {
					this.estadosolicitudnomiBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estadosolicitudnomiBeanSwingJInternalFrame.setIdActual(this.solicitudhoraextra.getid_estado_solicitud_nomi());
					this.estadosolicitudnomiBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estadosolicitudnomiBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estadosolicitudnomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstadoSolicitudNomi();
				}

				JInternalFrameBase jinternalFrame =this.estadosolicitudnomiBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSolicitudHoraExtra=(TitledBorder)this.jScrollPanelDatosSolicitudHoraExtra.getBorder();
				TitledBorder titledBorderestadosolicitudnomi=(TitledBorder)this.estadosolicitudnomiBeanSwingJInternalFrame.jScrollPanelDatosEstadoSolicitudNomi.getBorder();

				titledBorderestadosolicitudnomi.setTitle(titledBorderSolicitudHoraExtra.getTitle() + " -> Estado Solicitud");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estado_solicitud_nomiSolicitudHoraExtraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.getsolicitudhoraextra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudhoraextra==null) {
						this.solicitudhoraextra = new SolicitudHoraExtra();
					}

					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.solicitudhoraextra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
				}

				if(this.solicitudhoraextra.getid_estado_solicitud_nomi()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estado_solicitud_nomi = "+this.solicitudhoraextra.getid_estado_solicitud_nomi().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudHoraExtra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleado_reemplazoSolicitudHoraExtraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleadoreemplazo=true;

			idTienePermisoempleadoreemplazo=this.tienePermisosUsuarioEnPaginaWebSolicitudHoraExtra(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleadoreemplazo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSolicitudHoraExtra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSolicitudHoraExtra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.getsolicitudhoraextra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);

				this.empleadoreemplazoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoreemplazoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoreemplazoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.solicitudhoraextraLogic.getConnexion());

				if(this.solicitudhoraextra.getid_empleado_reemplazo()!=null) {
					this.empleadoreemplazoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoreemplazoBeanSwingJInternalFrame.setIdActual(this.solicitudhoraextra.getid_empleado_reemplazo());
					this.empleadoreemplazoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoreemplazoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoreemplazoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoreemplazoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSolicitudHoraExtra=(TitledBorder)this.jScrollPanelDatosSolicitudHoraExtra.getBorder();
				TitledBorder titledBorderempleadoreemplazo=(TitledBorder)this.empleadoreemplazoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleadoreemplazo.setTitle(titledBorderSolicitudHoraExtra.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleado_reemplazoSolicitudHoraExtraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.getsolicitudhoraextra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudhoraextra==null) {
						this.solicitudhoraextra = new SolicitudHoraExtra();
					}

					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.solicitudhoraextra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
				}

				if(this.solicitudhoraextra.getid_empleado_reemplazo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado_reemplazo = "+this.solicitudhoraextra.getid_empleado_reemplazo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudHoraExtra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsecuencialSolicitudHoraExtraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.getsolicitudhoraextra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudhoraextra==null) {
						this.solicitudhoraextra = new SolicitudHoraExtra();
					}

					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.solicitudhoraextra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
				}

				if(this.solicitudhoraextra.getsecuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where secuencial like '%"+this.solicitudhoraextra.getsecuencial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudHoraExtra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_solicitaSolicitudHoraExtraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.getsolicitudhoraextra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudhoraextra==null) {
						this.solicitudhoraextra = new SolicitudHoraExtra();
					}

					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.solicitudhoraextra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
				}

				if(this.solicitudhoraextra.getfecha_solicita()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_solicita = '"+Funciones2.getStringPostgresDate(this.solicitudhoraextra.getfecha_solicita())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudHoraExtra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_ejecutaSolicitudHoraExtraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.getsolicitudhoraextra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudhoraextra==null) {
						this.solicitudhoraextra = new SolicitudHoraExtra();
					}

					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.solicitudhoraextra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
				}

				if(this.solicitudhoraextra.getfecha_ejecuta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_ejecuta = '"+Funciones2.getStringPostgresDate(this.solicitudhoraextra.getfecha_ejecuta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudHoraExtra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_horasSolicitudHoraExtraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.getsolicitudhoraextra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudhoraextra==null) {
						this.solicitudhoraextra = new SolicitudHoraExtra();
					}

					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.solicitudhoraextra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
				}

				if(this.solicitudhoraextra.getnumero_horas()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_horas = "+this.solicitudhoraextra.getnumero_horas().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudHoraExtra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_unitarioSolicitudHoraExtraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.getsolicitudhoraextra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudhoraextra==null) {
						this.solicitudhoraextra = new SolicitudHoraExtra();
					}

					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.solicitudhoraextra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
				}

				if(this.solicitudhoraextra.getcosto_unitario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_unitario = "+this.solicitudhoraextra.getcosto_unitario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudHoraExtra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_totalSolicitudHoraExtraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.getsolicitudhoraextra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudhoraextra==null) {
						this.solicitudhoraextra = new SolicitudHoraExtra();
					}

					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.solicitudhoraextra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
				}

				if(this.solicitudhoraextra.getcosto_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_total = "+this.solicitudhoraextra.getcosto_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudHoraExtra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionSolicitudHoraExtraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.getsolicitudhoraextra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudhoraextra==null) {
						this.solicitudhoraextra = new SolicitudHoraExtra();
					}

					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.solicitudhoraextra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);
				}

				if(this.solicitudhoraextra.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.solicitudhoraextra.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudHoraExtra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoSolicitudHoraExtraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSolicitudHoraExtra(false,false);

			this.getSolicitudHoraExtrasFK_IdEmpleado();

			this.inicializarActualizarBindingSolicitudHoraExtra(false);

			//if(SolicitudHoraExtraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSolicitudHoraExtra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoJefeSolicitudHoraExtraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSolicitudHoraExtra(false,false);

			this.getSolicitudHoraExtrasFK_IdEmpleadoJefe();

			this.inicializarActualizarBindingSolicitudHoraExtra(false);

			//if(SolicitudHoraExtraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSolicitudHoraExtra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoReemplazoSolicitudHoraExtraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSolicitudHoraExtra(false,false);

			this.getSolicitudHoraExtrasFK_IdEmpleadoReemplazo();

			this.inicializarActualizarBindingSolicitudHoraExtra(false);

			//if(SolicitudHoraExtraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSolicitudHoraExtra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaSolicitudHoraExtraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSolicitudHoraExtra(false,false);

			this.getSolicitudHoraExtrasFK_IdEmpresa();

			this.inicializarActualizarBindingSolicitudHoraExtra(false);

			//if(SolicitudHoraExtraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSolicitudHoraExtra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstadoSolicitudNomiSolicitudHoraExtraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSolicitudHoraExtra(false,false);

			this.getSolicitudHoraExtrasFK_IdEstadoSolicitudNomi();

			this.inicializarActualizarBindingSolicitudHoraExtra(false);

			//if(SolicitudHoraExtraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSolicitudHoraExtra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraSolicitudHoraExtraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSolicitudHoraExtra(false,false);

			this.getSolicitudHoraExtrasFK_IdEstructura();

			this.inicializarActualizarBindingSolicitudHoraExtra(false);

			//if(SolicitudHoraExtraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSolicitudHoraExtra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalSolicitudHoraExtraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSolicitudHoraExtra(false,false);

			this.getSolicitudHoraExtrasFK_IdSucursal();

			this.inicializarActualizarBindingSolicitudHoraExtra(false);

			//if(SolicitudHoraExtraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSolicitudHoraExtra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudhoraextraLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameSolicitudHoraExtra() {
		if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
			this.jInternalFrameDetalleFormSolicitudHoraExtra.setVisible(false);	    			
			this.jInternalFrameDetalleFormSolicitudHoraExtra.dispose();
			this.jInternalFrameDetalleFormSolicitudHoraExtra=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoSolicitudHoraExtra!=null) {
			this.jInternalFrameReporteDinamicoSolicitudHoraExtra.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoSolicitudHoraExtra.dispose();
			this.jInternalFrameReporteDinamicoSolicitudHoraExtra=null;
		}
		
		if(this.jInternalFrameImportacionSolicitudHoraExtra!=null) {
			this.jInternalFrameImportacionSolicitudHoraExtra.setVisible(false);	    			
			this.jInternalFrameImportacionSolicitudHoraExtra.dispose();
			this.jInternalFrameImportacionSolicitudHoraExtra=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessSolicitudHoraExtra();
			
			SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
			
			
			if(sTipo.equals("NuevoSolicitudHoraExtra")) {
				jButtonNuevoSolicitudHoraExtraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarSolicitudHoraExtra")) {
				jButtonDuplicarSolicitudHoraExtraActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarSolicitudHoraExtra")) {
				jButtonCopiarSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("VerFormSolicitudHoraExtra")) {
				jButtonVerFormSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarSolicitudHoraExtra")) {
				jButtonNuevoSolicitudHoraExtraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarSolicitudHoraExtra")) {
				jButtonDuplicarSolicitudHoraExtraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoSolicitudHoraExtra")) {
				jButtonNuevoSolicitudHoraExtraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarSolicitudHoraExtra")) {
				jButtonDuplicarSolicitudHoraExtraActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesSolicitudHoraExtra")) {
				jButtonNuevoSolicitudHoraExtraActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarSolicitudHoraExtra")) {
				jButtonNuevoSolicitudHoraExtraActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesSolicitudHoraExtra")) {
				jButtonNuevoSolicitudHoraExtraActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarSolicitudHoraExtra")) {
				jButtonModificarSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarSolicitudHoraExtra")) {
				jButtonModificarSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarSolicitudHoraExtra")) {
				jButtonModificarSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarSolicitudHoraExtra")) {
				jButtonActualizarSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarSolicitudHoraExtra")) {
				jButtonActualizarSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarSolicitudHoraExtra")) {
				jButtonActualizarSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("EliminarSolicitudHoraExtra")) {
				jButtonEliminarSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarSolicitudHoraExtra")) {
				jButtonEliminarSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarSolicitudHoraExtra")) {
				jButtonEliminarSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("CancelarSolicitudHoraExtra")) {
				jButtonCancelarSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarSolicitudHoraExtra")) {
				jButtonCancelarSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarSolicitudHoraExtra")) {
				jButtonCancelarSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("CerrarSolicitudHoraExtra")) {
				jButtonCerrarSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarSolicitudHoraExtra")) {
				jButtonCerrarSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarSolicitudHoraExtra")) {
				jButtonCerrarSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarSolicitudHoraExtra")) {
				jButtonMostrarOcultarSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarSolicitudHoraExtra")) {
				jButtonCancelarSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosSolicitudHoraExtra")) {
				jButtonGuardarCambiosSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarSolicitudHoraExtra")) {
				jButtonGuardarCambiosSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarSolicitudHoraExtra")) {
				jButtonCopiarSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarSolicitudHoraExtra")) {
				jButtonVerFormSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosSolicitudHoraExtra")) {
				jButtonGuardarCambiosSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarSolicitudHoraExtra")) {
				jButtonCopiarSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormSolicitudHoraExtra")) {
				jButtonVerFormSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaSolicitudHoraExtra")) {
				jButtonGuardarCambiosSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarSolicitudHoraExtra")) {
				jButtonGuardarCambiosSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaSolicitudHoraExtra")) {
				jButtonGuardarCambiosSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionSolicitudHoraExtra")) {
				jButtonRecargarInformacionSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarSolicitudHoraExtra")) {
				jButtonRecargarInformacionSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionSolicitudHoraExtra")) {
				jButtonRecargarInformacionSolicitudHoraExtraActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresSolicitudHoraExtra")) {
				jButtonAnterioresSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarSolicitudHoraExtra")) {
				jButtonAnterioresSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreSolicitudHoraExtra")) {
				jButtonAnterioresSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesSolicitudHoraExtra")) {
				jButtonSiguientesSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarSolicitudHoraExtra")) {
				jButtonSiguientesSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesSolicitudHoraExtra")) {
				jButtonSiguientesSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBySolicitudHoraExtra") || sTipo.equals("MenuItemDetalleAbrirOrderBySolicitudHoraExtra")) {
				jButtonAbrirOrderBySolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarSolicitudHoraExtra") || sTipo.equals("MenuItemDetalleMostrarOcultarSolicitudHoraExtra")) {
				jButtonMostrarOcultarSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosSolicitudHoraExtra")) {
				jButtonNuevoGuardarCambiosSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarSolicitudHoraExtra")) {
				jButtonNuevoGuardarCambiosSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosSolicitudHoraExtra")) {
				jButtonNuevoGuardarCambiosSolicitudHoraExtraActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoSolicitudHoraExtra")) {
				jButtonCerrarReporteDinamicoSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoSolicitudHoraExtra")) {
				jButtonGenerarReporteDinamicoSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoSolicitudHoraExtra")) {
				
				jButtonGenerarExcelReporteDinamicoSolicitudHoraExtraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionSolicitudHoraExtra")) {
				jButtonCerrarImportacionSolicitudHoraExtraActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionSolicitudHoraExtra")) {
				
				jButtonGenerarImportacionSolicitudHoraExtraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionSolicitudHoraExtra")) {
				
				jButtonAbrirImportacionSolicitudHoraExtraActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesSolicitudHoraExtra")) {
				jComboBoxTiposAccionesSolicitudHoraExtraActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesSolicitudHoraExtra")) {
				jComboBoxTiposRelacionesSolicitudHoraExtraActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioSolicitudHoraExtra")) {
				jComboBoxTiposAccionesSolicitudHoraExtraActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarSolicitudHoraExtra")) {
				
				jComboBoxTiposSeleccionarSolicitudHoraExtraActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralSolicitudHoraExtra")) {
				jTextFieldValorCampoGeneralSolicitudHoraExtraActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBySolicitudHoraExtra")) {
				jButtonAbrirOrderBySolicitudHoraExtraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarSolicitudHoraExtra")) {
				jButtonAbrirOrderBySolicitudHoraExtraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBySolicitudHoraExtra")) {
				jButtonCerrarOrderBySolicitudHoraExtraActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSolicitudHoraExtraBusqueda")) {
				this.jButtonidSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSolicitudHoraExtraUpdate")) {
				this.jButtonid_empresaSolicitudHoraExtraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSolicitudHoraExtraBusqueda")) {
				this.jButtonid_empresaSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalSolicitudHoraExtraUpdate")) {
				this.jButtonid_sucursalSolicitudHoraExtraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalSolicitudHoraExtraBusqueda")) {
				this.jButtonid_sucursalSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoSolicitudHoraExtraUpdate")) {
				this.jButtonid_empleadoSolicitudHoraExtraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoSolicitudHoraExtraBusqueda")) {
				this.jButtonid_empleadoSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraSolicitudHoraExtraUpdate")) {
				this.jButtonid_estructuraSolicitudHoraExtraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraSolicitudHoraExtraBusqueda")) {
				this.jButtonid_estructuraSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleado_jefeSolicitudHoraExtraUpdate")) {
				this.jButtonid_empleado_jefeSolicitudHoraExtraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleado_jefeSolicitudHoraExtraBusqueda")) {
				this.jButtonid_empleado_jefeSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_solicitud_nomiSolicitudHoraExtraUpdate")) {
				this.jButtonid_estado_solicitud_nomiSolicitudHoraExtraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_solicitud_nomiSolicitudHoraExtraBusqueda")) {
				this.jButtonid_estado_solicitud_nomiSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleado_reemplazoSolicitudHoraExtraUpdate")) {
				this.jButtonid_empleado_reemplazoSolicitudHoraExtraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleado_reemplazoSolicitudHoraExtraBusqueda")) {
				this.jButtonid_empleado_reemplazoSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialSolicitudHoraExtraBusqueda")) {
				this.jButtonsecuencialSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_solicitaSolicitudHoraExtraBusqueda")) {
				this.jButtonfecha_solicitaSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ejecutaSolicitudHoraExtraBusqueda")) {
				this.jButtonfecha_ejecutaSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_horasSolicitudHoraExtraBusqueda")) {
				this.jButtonnumero_horasSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_unitarioSolicitudHoraExtraBusqueda")) {
				this.jButtoncosto_unitarioSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalSolicitudHoraExtraBusqueda")) {
				this.jButtoncosto_totalSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionSolicitudHoraExtraBusqueda")) {
				this.jButtondescripcionSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdEmpleadoSolicitudHoraExtra")) {
				this.jButtonFK_IdEmpleadoSolicitudHoraExtraActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoJefeSolicitudHoraExtra")) {
				this.jButtonFK_IdEmpleadoJefeSolicitudHoraExtraActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoReemplazoSolicitudHoraExtra")) {
				this.jButtonFK_IdEmpleadoReemplazoSolicitudHoraExtraActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstadoSolicitudNomiSolicitudHoraExtra")) {
				this.jButtonFK_IdEstadoSolicitudNomiSolicitudHoraExtraActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstructuraSolicitudHoraExtra")) {
				this.jButtonFK_IdEstructuraSolicitudHoraExtraActionPerformed(evt);
			}
			
			;
			
			
			SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessSolicitudHoraExtra();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSolicitudHoraExtraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudhoraextra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudhoraextra);
				
				SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
				
				


				
				SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudHoraExtra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudHoraExtra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			SolicitudHoraExtra solicitudhoraextraLocal=null;
			
			if(!this.getEsControlTabla()) {
				solicitudhoraextraLocal=this.solicitudhoraextra;
			} else {
				solicitudhoraextraLocal=this.solicitudhoraextraAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudhoraextra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudhoraextra);
				
				SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
							
				
				


				
				SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudHoraExtra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudHoraExtra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSolicitudHoraExtraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraAnterior =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.solicitudhoraextraAnterior =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
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
			
			SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
			
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
			
			


			
			SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSolicitudHoraExtraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudhoraextra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudhoraextra);
				
				SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
								
						
				


				
				SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudHoraExtra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudHoraExtra.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudhoraextra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudhoraextra);
				
				SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
								
				
				


				
				SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudHoraExtra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudHoraExtra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSolicitudHoraExtraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraAnterior =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.solicitudhoraextraAnterior =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudhoraextra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudhoraextra);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSolicitudHoraExtraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraAnterior =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.solicitudhoraextraAnterior =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSolicitudHoraExtraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudhoraextra);
			
			this.actualizarInformacion("INFO_PADRE",false,this.solicitudhoraextra);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudhoraextra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudhoraextra);
				
				SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
							
				
				


				
				SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudHoraExtra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudHoraExtra.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSolicitudHoraExtraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudhoraextraAnterior =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.solicitudhoraextraAnterior =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
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
			
			SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
			
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
			
			


			
			SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSolicitudHoraExtraActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudhoraextra);
			
			this.actualizarInformacion("INFO_PADRE",false,this.solicitudhoraextra);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudhoraextra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudhoraextra);
				
				SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
								
				
				


				
				SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudHoraExtra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudHoraExtra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSolicitudHoraExtraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraAnterior =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.solicitudhoraextraAnterior =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSolicitudHoraExtraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudhoraextra);
			
			this.actualizarInformacion("INFO_PADRE",false,this.solicitudhoraextra);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSolicitudHoraExtraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudhoraextra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudhoraextra);
				
				SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosSolicitudHoraExtra")) {
					jCheckBoxSeleccionarTodosSolicitudHoraExtraItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosSolicitudHoraExtra")) {
					jCheckBoxSeleccionadosSolicitudHoraExtraItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarSolicitudHoraExtra")) {
					
				}
				
				


				
				
				SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudHoraExtra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudHoraExtra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudhoraextra);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.solicitudhoraextra);
				
				SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
												
				
				


				
				
				SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudHoraExtra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudHoraExtra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSolicitudHoraExtraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudhoraextraAnterior =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.solicitudhoraextraAnterior =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSolicitudHoraExtraActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudhoraextra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudhoraextra);
				
				SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
				
				
				SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
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
			
			SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
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
			
			


			
			SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSolicitudHoraExtraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudhoraextra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudhoraextra);
				
				SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudHoraExtra.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudHoraExtra.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudhoraextra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudhoraextra);
				
				SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
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
				
				


				
				SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudHoraExtra.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudHoraExtra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSolicitudHoraExtraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudhoraextraAnterior =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.solicitudhoraextraAnterior =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarSolicitudHoraExtra")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosSolicitudHoraExtraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosSolicitudHoraExtra.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.solicitudhoraextra =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.solicitudhoraextra);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarSolicitudHoraExtra")) {
				
				}
				
				SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarSolicitudHoraExtra")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosSolicitudHoraExtra.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarSolicitudHoraExtra")) {
			
			}
			
			SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessSolicitudHoraExtra();
			
			SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
			
			if(sTipo.equals("NuevoSolicitudHoraExtra")) {
				jButtonNuevoSolicitudHoraExtraActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarSolicitudHoraExtra")) {
				jButtonDuplicarSolicitudHoraExtraActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarSolicitudHoraExtra")) {
				jButtonCopiarSolicitudHoraExtraActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormSolicitudHoraExtra")) {
				jButtonVerFormSolicitudHoraExtraActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesSolicitudHoraExtra")) {
				jButtonNuevoSolicitudHoraExtraActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarSolicitudHoraExtra")) {
				jButtonModificarSolicitudHoraExtraActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarSolicitudHoraExtra")) {
				jButtonActualizarSolicitudHoraExtraActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarSolicitudHoraExtra")) {
				jButtonEliminarSolicitudHoraExtraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaSolicitudHoraExtra")) {
				jButtonGuardarCambiosSolicitudHoraExtraActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarSolicitudHoraExtra")) {
				jButtonCancelarSolicitudHoraExtraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSolicitudHoraExtra")) {
				jButtonCerrarSolicitudHoraExtraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosSolicitudHoraExtra")) {
				jButtonGuardarCambiosSolicitudHoraExtraActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosSolicitudHoraExtra")) {
				jButtonNuevoGuardarCambiosSolicitudHoraExtraActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBySolicitudHoraExtra")) {
				jButtonAbrirOrderBySolicitudHoraExtraActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionSolicitudHoraExtra")) {
				jButtonRecargarInformacionSolicitudHoraExtraActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresSolicitudHoraExtra")) {
				jButtonAnterioresSolicitudHoraExtraActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesSolicitudHoraExtra")) {
				jButtonSiguientesSolicitudHoraExtraActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSolicitudHoraExtraBusqueda")) {
				this.jButtonidSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSolicitudHoraExtraUpdate")) {
				this.jButtonid_empresaSolicitudHoraExtraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSolicitudHoraExtraBusqueda")) {
				this.jButtonid_empresaSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalSolicitudHoraExtraUpdate")) {
				this.jButtonid_sucursalSolicitudHoraExtraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalSolicitudHoraExtraBusqueda")) {
				this.jButtonid_sucursalSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoSolicitudHoraExtraUpdate")) {
				this.jButtonid_empleadoSolicitudHoraExtraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoSolicitudHoraExtraBusqueda")) {
				this.jButtonid_empleadoSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraSolicitudHoraExtraUpdate")) {
				this.jButtonid_estructuraSolicitudHoraExtraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraSolicitudHoraExtraBusqueda")) {
				this.jButtonid_estructuraSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleado_jefeSolicitudHoraExtraUpdate")) {
				this.jButtonid_empleado_jefeSolicitudHoraExtraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleado_jefeSolicitudHoraExtraBusqueda")) {
				this.jButtonid_empleado_jefeSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_solicitud_nomiSolicitudHoraExtraUpdate")) {
				this.jButtonid_estado_solicitud_nomiSolicitudHoraExtraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_solicitud_nomiSolicitudHoraExtraBusqueda")) {
				this.jButtonid_estado_solicitud_nomiSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleado_reemplazoSolicitudHoraExtraUpdate")) {
				this.jButtonid_empleado_reemplazoSolicitudHoraExtraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleado_reemplazoSolicitudHoraExtraBusqueda")) {
				this.jButtonid_empleado_reemplazoSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialSolicitudHoraExtraBusqueda")) {
				this.jButtonsecuencialSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_solicitaSolicitudHoraExtraBusqueda")) {
				this.jButtonfecha_solicitaSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ejecutaSolicitudHoraExtraBusqueda")) {
				this.jButtonfecha_ejecutaSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_horasSolicitudHoraExtraBusqueda")) {
				this.jButtonnumero_horasSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_unitarioSolicitudHoraExtraBusqueda")) {
				this.jButtoncosto_unitarioSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalSolicitudHoraExtraBusqueda")) {
				this.jButtoncosto_totalSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionSolicitudHoraExtraBusqueda")) {
				this.jButtondescripcionSolicitudHoraExtraBusquedaActionPerformed(evt);
			}
			
			SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessSolicitudHoraExtra();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameSolicitudHoraExtra")) {
				closingInternalFrameSolicitudHoraExtra();
				
			} else if(sTipo.equals("jButtonCancelarSolicitudHoraExtra")) {
				JInternalFrameBase jInternalFrameDetalleFormSolicitudHoraExtra = (JInternalFrameBase)evt.getSource();
	            	
	            SolicitudHoraExtraBeanSwingJInternalFrame jInternalFrameParent=(SolicitudHoraExtraBeanSwingJInternalFrame)jInternalFrameDetalleFormSolicitudHoraExtra.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarSolicitudHoraExtraActionPerformed(null);
			}
			
			SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.solicitudhoraextra,new Object(),this.solicitudhoraextraParameterGeneral,this.solicitudhoraextraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormSolicitudHoraExtra(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormSolicitudHoraExtra(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormSolicitudHoraExtra(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.solicitudhoraextra)) {
			if(!esControlTabla) {
				if(SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.solicitudhoraextra,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);			
				}
				
				if(this.solicitudhoraextraSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualSolicitudHoraExtra(this.solicitudhoraextra,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.solicitudhoraextraReturnGeneral=solicitudhoraextraLogic.procesarEventosSolicitudHoraExtrasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.solicitudhoraextraLogic.getSolicitudHoraExtras(),this.solicitudhoraextra,this.solicitudhoraextraParameterGeneral,this.isEsNuevoSolicitudHoraExtra,classes);//this.solicitudhoraextraLogic.getSolicitudHoraExtra()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSolicitudHoraExtra(this.solicitudhoraextraReturnGeneral,this.solicitudhoraextraBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.solicitudhoraextraSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanSolicitudHoraExtra(classes,this.solicitudhoraextraReturnGeneral,this.solicitudhoraextraBean,false);
					}
						
					if(this.solicitudhoraextraReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeySolicitudHoraExtra(this.solicitudhoraextraReturnGeneral.getSolicitudHoraExtra());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioSolicitudHoraExtra(this.solicitudhoraextraReturnGeneral.getSolicitudHoraExtra());	
					}
						
					if(this.solicitudhoraextraReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioSolicitudHoraExtra(this.solicitudhoraextraReturnGeneral.getSolicitudHoraExtra(),classes);//this.solicitudhoraextraBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioSolicitudHoraExtra(this.solicitudhoraextra,classes);//this.solicitudhoraextraBean);									
				}
			
				if(SolicitudHoraExtraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualSolicitudHoraExtra(this.solicitudhoraextra,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudHoraExtra(this.solicitudhoraextra);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.solicitudhoraextraAnterior!=null) {
						this.solicitudhoraextra=this.solicitudhoraextraAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.solicitudhoraextraReturnGeneral=solicitudhoraextraLogic.procesarEventosSolicitudHoraExtrasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.solicitudhoraextraLogic.getSolicitudHoraExtras(),this.solicitudhoraextra,this.solicitudhoraextraParameterGeneral,this.isEsNuevoSolicitudHoraExtra,classes);//this.solicitudhoraextraLogic.getSolicitudHoraExtra()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.solicitudhoraextraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.solicitudhoraextraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.solicitudhoraextraReturnGeneral.getSolicitudHoraExtra(),solicitudhoraextraLogic.getSolicitudHoraExtras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.solicitudhoraextraReturnGeneral.getSolicitudHoraExtra(),this.solicitudhoraextras);
				}
				//ARCHITECTURE
				
				//this.jTableDatosSolicitudHoraExtra.repaint();
				
				//((AbstractTableModel) this.jTableDatosSolicitudHoraExtra.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosSolicitudHoraExtra();
			}
		}
	}
	
	public void actualizarVisualTableDatosSolicitudHoraExtra() throws Exception {
		
		SolicitudHoraExtraModel solicitudhoraextraModel=(SolicitudHoraExtraModel)this.jTableDatosSolicitudHoraExtra.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			solicitudhoraextraModel.solicitudhoraextras=this.solicitudhoraextraLogic.getSolicitudHoraExtras();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			solicitudhoraextraModel.solicitudhoraextras=this.solicitudhoraextras;
		}
		
		
		((SolicitudHoraExtraModel) this.jTableDatosSolicitudHoraExtra.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaSolicitudHoraExtra() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getsolicitudhoraextraAnterior(),this.solicitudhoraextraLogic.getSolicitudHoraExtras());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getsolicitudhoraextraAnterior(),this.solicitudhoraextras);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosSolicitudHoraExtra();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioSolicitudHoraExtra(SolicitudHoraExtra solicitudhoraextra,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
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
										
				SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.solicitudhoraextra,new Object(),generalEntityParameterGeneral,this.solicitudhoraextraReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.solicitudhoraextraSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=SolicitudHoraExtraConstantesFunciones.getClassesRelationshipsOfSolicitudHoraExtra(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=SolicitudHoraExtraConstantesFunciones.getClassesRelationshipsFromStringsOfSolicitudHoraExtra(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormSolicitudHoraExtra(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				SolicitudHoraExtraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.solicitudhoraextra,new Object(),generalEntityParameterGeneral,this.solicitudhoraextraReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioSolicitudHoraExtra(SolicitudHoraExtraBean solicitudhoraextraBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanSolicitudHoraExtra(ArrayList<Classe> classes,SolicitudHoraExtraReturnGeneral solicitudhoraextraReturnGeneral,SolicitudHoraExtraBean solicitudhoraextraBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualSolicitudHoraExtra(SolicitudHoraExtra solicitudhoraextra,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.solicitudhoraextra)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormSolicitudHoraExtra = new SolicitudHoraExtraDetalleFormJInternalFrame(jDesktopPane,this.solicitudhoraextraSessionBean.getConGuardarRelaciones(),this.solicitudhoraextraSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.setVisible(false);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.setSelected(false);						
		
		this.jInternalFrameDetalleFormSolicitudHoraExtra.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormSolicitudHoraExtra.solicitudhoraextraLogic=this.solicitudhoraextraLogic;
		
		this.cargarCombosFrameForeignKeySolicitudHoraExtra("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleSolicitudHoraExtra();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSolicitudHoraExtra();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeySolicitudHoraExtra("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeySolicitudHoraExtra();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormSolicitudHoraExtra.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSolicitudHoraExtra"));
		
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonModificarSolicitudHoraExtra.addActionListener(new ButtonActionListener(this,"ModificarSolicitudHoraExtra"));

		
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonModificarToolBarSolicitudHoraExtra.addActionListener(new ButtonActionListener(this,"ModificarToolBarSolicitudHoraExtra"));
					
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jMenuItemModificarSolicitudHoraExtra.addActionListener(new ButtonActionListener(this,"MenuItemModificarSolicitudHoraExtra"));		
		
		
		
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonActualizarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"ActualizarSolicitudHoraExtra"));
		
		
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonActualizarToolBarSolicitudHoraExtra.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSolicitudHoraExtra"));
						
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jMenuItemActualizarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSolicitudHoraExtra"));		
		
		
		
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonEliminarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"EliminarSolicitudHoraExtra"));
		
		
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonEliminarToolBarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"EliminarToolBarSolicitudHoraExtra"));
								
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jMenuItemEliminarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSolicitudHoraExtra"));		
		
		
		
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonCancelarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"CancelarSolicitudHoraExtra"));
		
		
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonCancelarToolBarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"CancelarToolBarSolicitudHoraExtra"));
					
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jMenuItemCancelarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSolicitudHoraExtra"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jMenuItemDetalleCerrarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSolicitudHoraExtra"));		
		
		
		
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonGuardarCambiosToolBarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSolicitudHoraExtra"));
		
		
		
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonGuardarCambiosToolBarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSolicitudHoraExtra"));
		
		
		
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxTiposAccionesFormularioSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSolicitudHoraExtra"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonidSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"idSolicitudHoraExtraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_empresaSolicitudHoraExtraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSolicitudHoraExtraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_empresaSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSolicitudHoraExtraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_sucursalSolicitudHoraExtraUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalSolicitudHoraExtraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_sucursalSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalSolicitudHoraExtraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_empleadoSolicitudHoraExtraUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoSolicitudHoraExtraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_empleadoSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoSolicitudHoraExtraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_estructuraSolicitudHoraExtraUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraSolicitudHoraExtraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_estructuraSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraSolicitudHoraExtraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_empleado_jefeSolicitudHoraExtraUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_jefeSolicitudHoraExtraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_empleado_jefeSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_jefeSolicitudHoraExtraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_estado_solicitud_nomiSolicitudHoraExtraUpdate.addActionListener(new ButtonActionListener(this,"id_estado_solicitud_nomiSolicitudHoraExtraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_estado_solicitud_nomiSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_solicitud_nomiSolicitudHoraExtraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_empleado_reemplazoSolicitudHoraExtraUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_reemplazoSolicitudHoraExtraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_empleado_reemplazoSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_reemplazoSolicitudHoraExtraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonsecuencialSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"secuencialSolicitudHoraExtraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonfecha_solicitaSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"fecha_solicitaSolicitudHoraExtraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonfecha_ejecutaSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ejecutaSolicitudHoraExtraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonnumero_horasSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"numero_horasSolicitudHoraExtraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtoncosto_unitarioSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"costo_unitarioSolicitudHoraExtraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtoncosto_totalSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalSolicitudHoraExtraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtondescripcionSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"descripcionSolicitudHoraExtraBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jTabbedPaneRelacionesSolicitudHoraExtra.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSolicitudHoraExtra"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameSolicitudHoraExtra"));
		
		if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudHoraExtra.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSolicitudHoraExtra"));
		}
		
		this.jTableDatosSolicitudHoraExtra.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarSolicitudHoraExtra"));
		
		this.jTableDatosSolicitudHoraExtra.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarSolicitudHoraExtra"));
		
		this.jButtonNuevoSolicitudHoraExtra.addActionListener(new ButtonActionListener(this,"NuevoSolicitudHoraExtra"));
		
		this.jButtonDuplicarSolicitudHoraExtra.addActionListener(new ButtonActionListener(this,"DuplicarSolicitudHoraExtra"));
		
		this.jButtonCopiarSolicitudHoraExtra.addActionListener(new ButtonActionListener(this,"CopiarSolicitudHoraExtra"));
		
		this.jButtonVerFormSolicitudHoraExtra.addActionListener(new ButtonActionListener(this,"VerFormSolicitudHoraExtra"));
		
		
		this.jButtonNuevoToolBarSolicitudHoraExtra.addActionListener(new ButtonActionListener(this,"NuevoToolBarSolicitudHoraExtra"));
			
		this.jButtonDuplicarToolBarSolicitudHoraExtra.addActionListener(new ButtonActionListener(this,"DuplicarToolBarSolicitudHoraExtra"));
			
		this.jMenuItemNuevoSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"MenuItemNuevoSolicitudHoraExtra"));
			
		this.jMenuItemDuplicarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarSolicitudHoraExtra"));		
		
		
		this.jButtonNuevoRelacionesSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"NuevoRelacionesSolicitudHoraExtra"));
		
		
		this.jButtonNuevoRelacionesToolBarSolicitudHoraExtra.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarSolicitudHoraExtra"));
			
		this.jMenuItemNuevoRelacionesSolicitudHoraExtra.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesSolicitudHoraExtra"));		
		
		
		if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonModificarSolicitudHoraExtra.addActionListener(new ButtonActionListener(this,"ModificarSolicitudHoraExtra"));
		}
		
		
		if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonModificarToolBarSolicitudHoraExtra.addActionListener(new ButtonActionListener(this,"ModificarToolBarSolicitudHoraExtra"));
			
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jMenuItemModificarSolicitudHoraExtra.addActionListener(new ButtonActionListener(this,"MenuItemModificarSolicitudHoraExtra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonActualizarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"ActualizarSolicitudHoraExtra"));
		}
		
		
		if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonActualizarToolBarSolicitudHoraExtra.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSolicitudHoraExtra"));
				
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jMenuItemActualizarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSolicitudHoraExtra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonEliminarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"EliminarSolicitudHoraExtra"));
		}
		
		
		if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonEliminarToolBarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"EliminarToolBarSolicitudHoraExtra"));
						
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jMenuItemEliminarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSolicitudHoraExtra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonCancelarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"CancelarSolicitudHoraExtra"));
		}
		
		
		if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonCancelarToolBarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"CancelarToolBarSolicitudHoraExtra"));
			
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jMenuItemCancelarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSolicitudHoraExtra"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarSolicitudHoraExtra"));		
		
		
		this.jButtonCerrarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"CerrarSolicitudHoraExtra"));
		
		
		this.jButtonCerrarToolBarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"CerrarToolBarSolicitudHoraExtra"));
			
		this.jMenuItemCerrarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"MenuItemCerrarSolicitudHoraExtra"));
			
		if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jMenuItemDetalleCerrarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSolicitudHoraExtra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonGuardarCambiosSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"GuardarCambiosSolicitudHoraExtra"));
		}
		
		
		if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonGuardarCambiosToolBarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSolicitudHoraExtra"));
		}
		
		this.jButtonCopiarToolBarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"CopiarToolBarSolicitudHoraExtra"));
			
		this.jButtonVerFormToolBarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"VerFormToolBarSolicitudHoraExtra"));
		
		this.jMenuItemGuardarCambiosSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosSolicitudHoraExtra"));
			
		this.jMenuItemCopiarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"MenuItemCopiarSolicitudHoraExtra"));		
		
		this.jMenuItemVerFormSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"MenuItemVerFormSolicitudHoraExtra"));		
		
		
		this.jButtonGuardarCambiosTablaSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSolicitudHoraExtra"));
		
		
		this.jButtonGuardarCambiosTablaToolBarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarSolicitudHoraExtra"));
			
		this.jMenuItemGuardarCambiosTablaSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSolicitudHoraExtra"));		
		
		
		
		this.jButtonRecargarInformacionSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"RecargarInformacionSolicitudHoraExtra"));
					
		this.jButtonRecargarInformacionToolBarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarSolicitudHoraExtra"));
		
		this.jMenuItemRecargarInformacionSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionSolicitudHoraExtra"));		
		
		
		
		this.jButtonAnterioresSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"AnterioresSolicitudHoraExtra"));
		
		
		this.jButtonAnterioresToolBarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"AnterioresToolBarSolicitudHoraExtra"));
		
		this.jMenuItemAnterioresSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresSolicitudHoraExtra"));		
		
		
		this.jButtonSiguientesSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"SiguientesSolicitudHoraExtra"));
		
		
		this.jButtonSiguientesToolBarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"SiguientesToolBarSolicitudHoraExtra"));
			
		this.jMenuItemSiguientesSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesSolicitudHoraExtra"));
			
		this.jMenuItemAbrirOrderBySolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBySolicitudHoraExtra"));
			
		this.jMenuItemMostrarOcultarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarSolicitudHoraExtra"));
			
		this.jMenuItemDetalleAbrirOrderBySolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBySolicitudHoraExtra"));
			
		this.jMenuItemDetalleMostarOcultarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarSolicitudHoraExtra"));		
		
		
		this.jButtonNuevoGuardarCambiosSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosSolicitudHoraExtra"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarSolicitudHoraExtra"));
			
		this.jMenuItemNuevoGuardarCambiosSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosSolicitudHoraExtra"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosSolicitudHoraExtra.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosSolicitudHoraExtra"));

		this.jCheckBoxSeleccionadosSolicitudHoraExtra.addItemListener(new CheckBoxItemListener(this,"SeleccionadosSolicitudHoraExtra"));
		
		if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxTiposAccionesFormularioSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSolicitudHoraExtra"));
		}
		
		
		this.jComboBoxTiposRelacionesSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"TiposRelacionesSolicitudHoraExtra"));
			
		this.jComboBoxTiposAccionesSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"TiposAccionesSolicitudHoraExtra"));
					
		this.jComboBoxTiposSeleccionarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"TiposSeleccionarSolicitudHoraExtra"));
			
		this.jTextFieldValorCampoGeneralSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralSolicitudHoraExtra"));		
		
		
		if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonidSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"idSolicitudHoraExtraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_empresaSolicitudHoraExtraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSolicitudHoraExtraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_empresaSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSolicitudHoraExtraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_sucursalSolicitudHoraExtraUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalSolicitudHoraExtraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_sucursalSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalSolicitudHoraExtraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_empleadoSolicitudHoraExtraUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoSolicitudHoraExtraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_empleadoSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoSolicitudHoraExtraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_estructuraSolicitudHoraExtraUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraSolicitudHoraExtraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_estructuraSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraSolicitudHoraExtraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_empleado_jefeSolicitudHoraExtraUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_jefeSolicitudHoraExtraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_empleado_jefeSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_jefeSolicitudHoraExtraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_estado_solicitud_nomiSolicitudHoraExtraUpdate.addActionListener(new ButtonActionListener(this,"id_estado_solicitud_nomiSolicitudHoraExtraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_estado_solicitud_nomiSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_solicitud_nomiSolicitudHoraExtraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_empleado_reemplazoSolicitudHoraExtraUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_reemplazoSolicitudHoraExtraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_empleado_reemplazoSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_reemplazoSolicitudHoraExtraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonsecuencialSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"secuencialSolicitudHoraExtraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonfecha_solicitaSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"fecha_solicitaSolicitudHoraExtraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonfecha_ejecutaSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ejecutaSolicitudHoraExtraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonnumero_horasSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"numero_horasSolicitudHoraExtraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtoncosto_unitarioSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"costo_unitarioSolicitudHoraExtraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtoncosto_totalSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalSolicitudHoraExtraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtondescripcionSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"descripcionSolicitudHoraExtraBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoSolicitudHoraExtra.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoSolicitudHoraExtra"));

			this.jButtonFK_IdEmpleadoJefeSolicitudHoraExtra.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoJefeSolicitudHoraExtra"));

			this.jButtonFK_IdEmpleadoReemplazoSolicitudHoraExtra.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoReemplazoSolicitudHoraExtra"));

			this.jButtonFK_IdEstadoSolicitudNomiSolicitudHoraExtra.addActionListener(new ButtonActionListener(this,"FK_IdEstadoSolicitudNomiSolicitudHoraExtra"));

			this.jButtonFK_IdEstructuraSolicitudHoraExtra.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraSolicitudHoraExtra"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoSolicitudHoraExtra!=null) {
				this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSolicitudHoraExtra"));
				this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSolicitudHoraExtra"));
				this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSolicitudHoraExtra"));
			}
			
			//this.jButtonCerrarReporteDinamicoSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSolicitudHoraExtra"));				
			//this.jButtonGenerarReporteDinamicoSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSolicitudHoraExtra"));
			//this.jButtonGenerarExcelReporteDinamicoSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSolicitudHoraExtra"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionSolicitudHoraExtra!=null) {
				this.jInternalFrameImportacionSolicitudHoraExtra.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSolicitudHoraExtra"));
				this.jInternalFrameImportacionSolicitudHoraExtra.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSolicitudHoraExtra"));
				this.jInternalFrameImportacionSolicitudHoraExtra.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSolicitudHoraExtra"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderBySolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"AbrirOrderBySolicitudHoraExtra"));
			
			this.jButtonAbrirOrderByToolBarSolicitudHoraExtra.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarSolicitudHoraExtra"));			
			
			if(this.jInternalFrameOrderBySolicitudHoraExtra!=null) {
				this.jInternalFrameOrderBySolicitudHoraExtra.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySolicitudHoraExtra"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudHoraExtra.jTabbedPaneRelacionesSolicitudHoraExtra.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSolicitudHoraExtra"));
		
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
            		closingInternalFrameSolicitudHoraExtra();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormSolicitudHoraExtra.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormSolicitudHoraExtra = (JInternalFrameBase)event.getSource();
	            	
	            SolicitudHoraExtraBeanSwingJInternalFrame jInternalFrameParent=(SolicitudHoraExtraBeanSwingJInternalFrame)jInternalFrameDetalleFormSolicitudHoraExtra.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarSolicitudHoraExtraActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosSolicitudHoraExtra.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosSolicitudHoraExtraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosSolicitudHoraExtra.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosSolicitudHoraExtra.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSolicitudHoraExtraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSolicitudHoraExtraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSolicitudHoraExtraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoSolicitudHoraExtra";
		inputMap = this.jButtonNuevoSolicitudHoraExtra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoSolicitudHoraExtra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSolicitudHoraExtraActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSolicitudHoraExtraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSolicitudHoraExtraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSolicitudHoraExtraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesSolicitudHoraExtra";
		inputMap = this.jButtonNuevoRelacionesSolicitudHoraExtra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesSolicitudHoraExtra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSolicitudHoraExtraActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarSolicitudHoraExtra";
		inputMap = this.jButtonModificarSolicitudHoraExtra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarSolicitudHoraExtra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarSolicitudHoraExtraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarSolicitudHoraExtra";
		inputMap = this.jButtonActualizarSolicitudHoraExtra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarSolicitudHoraExtra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarSolicitudHoraExtraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarSolicitudHoraExtra";
		inputMap = this.jButtonEliminarSolicitudHoraExtra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarSolicitudHoraExtra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarSolicitudHoraExtraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarSolicitudHoraExtra";
		inputMap = this.jButtonCancelarSolicitudHoraExtra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarSolicitudHoraExtra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarSolicitudHoraExtraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarSolicitudHoraExtra";
		inputMap = this.jButtonCerrarSolicitudHoraExtra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarSolicitudHoraExtra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarSolicitudHoraExtraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonGuardarCambiosSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosSolicitudHoraExtra";
		inputMap = this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonGuardarCambiosSolicitudHoraExtra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonGuardarCambiosSolicitudHoraExtra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosSolicitudHoraExtraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosSolicitudHoraExtra.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosSolicitudHoraExtraItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesSolicitudHoraExtra.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesSolicitudHoraExtraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarSolicitudHoraExtra.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarSolicitudHoraExtraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralSolicitudHoraExtra.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralSolicitudHoraExtraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonidSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"idSolicitudHoraExtraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_empresaSolicitudHoraExtraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSolicitudHoraExtraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_empresaSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSolicitudHoraExtraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_sucursalSolicitudHoraExtraUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalSolicitudHoraExtraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_sucursalSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalSolicitudHoraExtraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_empleadoSolicitudHoraExtraUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoSolicitudHoraExtraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_empleadoSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoSolicitudHoraExtraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_estructuraSolicitudHoraExtraUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraSolicitudHoraExtraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_estructuraSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraSolicitudHoraExtraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_empleado_jefeSolicitudHoraExtraUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_jefeSolicitudHoraExtraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_empleado_jefeSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_jefeSolicitudHoraExtraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_estado_solicitud_nomiSolicitudHoraExtraUpdate.addActionListener(new ButtonActionListener(this,"id_estado_solicitud_nomiSolicitudHoraExtraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_estado_solicitud_nomiSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_solicitud_nomiSolicitudHoraExtraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_empleado_reemplazoSolicitudHoraExtraUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_reemplazoSolicitudHoraExtraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonid_empleado_reemplazoSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_reemplazoSolicitudHoraExtraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonsecuencialSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"secuencialSolicitudHoraExtraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonfecha_solicitaSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"fecha_solicitaSolicitudHoraExtraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonfecha_ejecutaSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ejecutaSolicitudHoraExtraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtonnumero_horasSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"numero_horasSolicitudHoraExtraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtoncosto_unitarioSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"costo_unitarioSolicitudHoraExtraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtoncosto_totalSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalSolicitudHoraExtraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jButtondescripcionSolicitudHoraExtraBusqueda.addActionListener(new ButtonActionListener(this,"descripcionSolicitudHoraExtraBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoSolicitudHoraExtra.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoSolicitudHoraExtra"));

		this.jButtonFK_IdEmpleadoJefeSolicitudHoraExtra.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoJefeSolicitudHoraExtra"));

		this.jButtonFK_IdEmpleadoReemplazoSolicitudHoraExtra.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoReemplazoSolicitudHoraExtra"));

		this.jButtonFK_IdEstadoSolicitudNomiSolicitudHoraExtra.addActionListener(new ButtonActionListener(this,"FK_IdEstadoSolicitudNomiSolicitudHoraExtra"));

		this.jButtonFK_IdEstructuraSolicitudHoraExtra.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraSolicitudHoraExtra"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionSolicitudHoraExtra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionSolicitudHoraExtraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarSolicitudHoraExtraActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarSolicitudHoraExtra.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosSolicitudHoraExtra(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(SolicitudHoraExtra solicitudhoraextraAux:this.solicitudhoraextraLogic.getSolicitudHoraExtras()) {
					solicitudhoraextraAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SolicitudHoraExtra solicitudhoraextraAux:solicitudhoraextras) {
					solicitudhoraextraAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosSolicitudHoraExtraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSolicitudHoraExtra(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SolicitudHoraExtra solicitudhoraextraAux:this.solicitudhoraextraLogic.getSolicitudHoraExtras()) {
						solicitudhoraextraAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SolicitudHoraExtra solicitudhoraextraAux:solicitudhoraextras) {
						solicitudhoraextraAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(SolicitudHoraExtra solicitudhoraextraAux:this.solicitudhoraextraLogic.getSolicitudHoraExtras()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SolicitudHoraExtra solicitudhoraextraAux:solicitudhoraextras) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaSolicitudHoraExtra(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSolicitudHoraExtra.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSolicitudHoraExtra.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSolicitudHoraExtra,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosSolicitudHoraExtraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSolicitudHoraExtra(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosSolicitudHoraExtra.getSelectedRows();
			
			SolicitudHoraExtra solicitudhoraextraLocal=new SolicitudHoraExtra();
			
			//this.seleccionarTodosSolicitudHoraExtra(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					solicitudhoraextraLocal =(SolicitudHoraExtra) this.solicitudhoraextraLogic.getSolicitudHoraExtras().toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					solicitudhoraextraLocal =(SolicitudHoraExtra) this.solicitudhoraextras.toArray()[this.jTableDatosSolicitudHoraExtra.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				solicitudhoraextraLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SolicitudHoraExtra solicitudhoraextraAux:this.solicitudhoraextraLogic.getSolicitudHoraExtras()) {
						solicitudhoraextraAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SolicitudHoraExtra solicitudhoraextraAux:solicitudhoraextras) {
						solicitudhoraextraAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaSolicitudHoraExtra(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSolicitudHoraExtra.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSolicitudHoraExtra.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSolicitudHoraExtra,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualSolicitudHoraExtraItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarSolicitudHoraExtraParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralSolicitudHoraExtraActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingSolicitudHoraExtra(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSolicitudHoraExtra.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SolicitudHoraExtra solicitudhoraextraAux:this.solicitudhoraextraLogic.getSolicitudHoraExtras()) {
				
						if(sTipoSeleccionar.equals(SolicitudHoraExtraConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							solicitudhoraextraAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SolicitudHoraExtraConstantesFunciones.LABEL_FECHASOLICITA)) {
							existe=true;
							solicitudhoraextraAux.setfecha_solicita(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudHoraExtraConstantesFunciones.LABEL_FECHAEJECUTA)) {
							existe=true;
							solicitudhoraextraAux.setfecha_ejecuta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudHoraExtraConstantesFunciones.LABEL_NUMEROHORAS)) {
							existe=true;
							solicitudhoraextraAux.setnumero_horas(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudHoraExtraConstantesFunciones.LABEL_COSTOUNITARIO)) {
							existe=true;
							solicitudhoraextraAux.setcosto_unitario(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudHoraExtraConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							solicitudhoraextraAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudHoraExtraConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							solicitudhoraextraAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SolicitudHoraExtra solicitudhoraextraAux:solicitudhoraextras) {
					
						if(sTipoSeleccionar.equals(SolicitudHoraExtraConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							solicitudhoraextraAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SolicitudHoraExtraConstantesFunciones.LABEL_FECHASOLICITA)) {
							existe=true;
							solicitudhoraextraAux.setfecha_solicita(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudHoraExtraConstantesFunciones.LABEL_FECHAEJECUTA)) {
							existe=true;
							solicitudhoraextraAux.setfecha_ejecuta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudHoraExtraConstantesFunciones.LABEL_NUMEROHORAS)) {
							existe=true;
							solicitudhoraextraAux.setnumero_horas(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudHoraExtraConstantesFunciones.LABEL_COSTOUNITARIO)) {
							existe=true;
							solicitudhoraextraAux.setcosto_unitario(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudHoraExtraConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							solicitudhoraextraAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudHoraExtraConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							solicitudhoraextraAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaSolicitudHoraExtra(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesSolicitudHoraExtraActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingSolicitudHoraExtra(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioSolicitudHoraExtra=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesSolicitudHoraExtra.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxTiposAccionesFormularioSolicitudHoraExtra.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteSolicitudHoraExtra) {				
					conSplash=true;//false;										
					
					//this.startProcessSolicitudHoraExtra(conSplash);
				
					this.generarReporteSolicitudHoraExtrasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSolicitudHoraExtra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxTiposAccionesFormularioSolicitudHoraExtra.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoSolicitudHoraExtrasSeleccionados();
				//this.jComboBoxTiposAccionesSolicitudHoraExtra.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSolicitudHoraExtrasSeleccionados(false);
				//this.jComboBoxTiposAccionesSolicitudHoraExtra.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSolicitudHoraExtrasSeleccionados(true);
				//this.jComboBoxTiposAccionesSolicitudHoraExtra.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSolicitudHoraExtra();
				
				this.exportarSolicitudHoraExtrasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSolicitudHoraExtra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxTiposAccionesFormularioSolicitudHoraExtra.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionSolicitudHoraExtras();
				//this.importarSolicitudHoraExtras();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSolicitudHoraExtra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxTiposAccionesFormularioSolicitudHoraExtra.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSolicitudHoraExtra();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelSolicitudHoraExtrasSeleccionados();
				//this.jComboBoxTiposAccionesSolicitudHoraExtra.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Solicitud Hora Extra", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessSolicitudHoraExtra();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoSolicitudHoraExtra)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeySolicitudHoraExtra(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Solicitud Hora Extra",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSolicitudHoraExtra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxTiposAccionesFormularioSolicitudHoraExtra.setSelectedIndex(0);					
				}	
			} 			
			else if(SolicitudHoraExtraBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteSolicitudHoraExtra) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessSolicitudHoraExtra(conSplash);
					
						//this.actualizarParametrosGeneralSolicitudHoraExtra();
						
						this.generarReporteProcesoAccionSolicitudHoraExtrasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesSolicitudHoraExtra.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxTiposAccionesFormularioSolicitudHoraExtra.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(SolicitudHoraExtraBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Solicitud Hora ExtraS SELECCIONADOS?", "MANTENIMIENTO DE Solicitud Hora Extra", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessSolicitudHoraExtra();
				
						this.actualizarParametrosGeneralSolicitudHoraExtra();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.solicitudhoraextraReturnGeneral=solicitudhoraextraLogic.procesarAccionSolicitudHoraExtrasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.solicitudhoraextraLogic.getSolicitudHoraExtras(),this.solicitudhoraextraParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarSolicitudHoraExtraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSolicitudHoraExtra.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxTiposAccionesFormularioSolicitudHoraExtra.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralSolicitudHoraExtra();
					
					SolicitudHoraExtraBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarSolicitudHoraExtraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSolicitudHoraExtra.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxTiposAccionesFormularioSolicitudHoraExtra.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessSolicitudHoraExtra(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesSolicitudHoraExtraActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessSolicitudHoraExtra();
			
			if(this.jInternalFrameDetalleFormSolicitudHoraExtra==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<SolicitudHoraExtra> solicitudhoraextrasSeleccionados=new ArrayList<SolicitudHoraExtra>();		
			SolicitudHoraExtra solicitudhoraextra=new SolicitudHoraExtra();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingSolicitudHoraExtra(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesSolicitudHoraExtra.getSelectedItem();
			
			
			
			
			solicitudhoraextrasSeleccionados=this.getSolicitudHoraExtrasSeleccionados(true);
			//this.sTipoAccion;
			
			if(solicitudhoraextrasSeleccionados.size()==1) {
				for(SolicitudHoraExtra solicitudhoraextraAux:solicitudhoraextrasSeleccionados) {
					solicitudhoraextra=solicitudhoraextraAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessSolicitudHoraExtra();
			
      		//this.finishProcessSolicitudHoraExtra(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarSolicitudHoraExtraReturnGeneral() throws Exception {
		if(this.solicitudhoraextraReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.solicitudhoraextraReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.solicitudhoraextraReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.solicitudhoraextraReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.solicitudhoraextraReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.solicitudhoraextraReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingSolicitudHoraExtra(false);
		}
		
		if(this.solicitudhoraextraReturnGeneral.getConRetornoLista() || this.solicitudhoraextraReturnGeneral.getConRetornoObjeto()) {
			if(this.solicitudhoraextraReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.solicitudhoraextraLogic.setSolicitudHoraExtras(this.solicitudhoraextraReturnGeneral.getSolicitudHoraExtras());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.solicitudhoraextraReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.solicitudhoraextraLogic.setSolicitudHoraExtra(this.solicitudhoraextraReturnGeneral.getSolicitudHoraExtra());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingSolicitudHoraExtra(false);
		}
	}
	
	public void actualizarParametrosGeneralSolicitudHoraExtra() throws Exception {
		
		
	}
	
	public ArrayList<SolicitudHoraExtra> getSolicitudHoraExtrasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<SolicitudHoraExtra> solicitudhoraextrasSeleccionados=new ArrayList<SolicitudHoraExtra>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioSolicitudHoraExtra) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(SolicitudHoraExtra solicitudhoraextraAux:solicitudhoraextraLogic.getSolicitudHoraExtras()) {
					if(solicitudhoraextraAux.getIsSelected()) {
						solicitudhoraextrasSeleccionados.add(solicitudhoraextraAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SolicitudHoraExtra solicitudhoraextraAux:this.solicitudhoraextras) {
					if(solicitudhoraextraAux.getIsSelected()) {
						solicitudhoraextrasSeleccionados.add(solicitudhoraextraAux);				
					}
				}
			}
			
			if(solicitudhoraextrasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						solicitudhoraextrasSeleccionados.addAll(this.solicitudhoraextraLogic.getSolicitudHoraExtras());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						solicitudhoraextrasSeleccionados.addAll(this.solicitudhoraextras);				
					}
				}
			}
		} else {
			solicitudhoraextrasSeleccionados.add(this.solicitudhoraextra);
		}
		
		return solicitudhoraextrasSeleccionados;
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
	
	public void generarReporteSolicitudHoraExtrasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalSolicitudHoraExtrasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoSolicitudHoraExtrasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSolicitudHoraExtrasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSolicitudHoraExtrasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Solicitud Hora Extra",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSolicitudHoraExtrasSeleccionados() throws Exception {
		ArrayList<SolicitudHoraExtra> solicitudhoraextrasSeleccionados=new ArrayList<SolicitudHoraExtra>();		
		
		solicitudhoraextrasSeleccionados=this.getSolicitudHoraExtrasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteSolicitudHoraExtras("Todos",solicitudhoraextrasSeleccionados);
		
	}	
	
	public void generarReporteNormalSolicitudHoraExtrasSeleccionados() throws Exception {
		ArrayList<SolicitudHoraExtra> solicitudhoraextrasSeleccionados=new ArrayList<SolicitudHoraExtra>();		
		
		solicitudhoraextrasSeleccionados=this.getSolicitudHoraExtrasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteSolicitudHoraExtras("Todos",solicitudhoraextrasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionSolicitudHoraExtrasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<SolicitudHoraExtra> solicitudhoraextrasSeleccionados=new ArrayList<SolicitudHoraExtra>();
		
		solicitudhoraextrasSeleccionados=this.getSolicitudHoraExtrasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteSolicitudHoraExtras("Todos",solicitudhoraextrasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoSolicitudHoraExtrasSeleccionados() throws Exception {
		ArrayList<SolicitudHoraExtra> solicitudhoraextrasSeleccionados=new ArrayList<SolicitudHoraExtra>();		
		
		
		this.abrirInicializarFrameReporteDinamicoSolicitudHoraExtra();
		
		
		solicitudhoraextrasSeleccionados=this.getSolicitudHoraExtrasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoSolicitudHoraExtra();
		
		
		//this.generarReporteSolicitudHoraExtras("Todos",solicitudhoraextrasSeleccionados ,solicitudhoraextraImplementable,solicitudhoraextraImplementableHome);
	}
	
	public void mostrarImportacionSolicitudHoraExtras() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionSolicitudHoraExtra();
		
		this.abrirFrameImportacionSolicitudHoraExtra();		
		
			
		//this.generarReporteSolicitudHoraExtras("Todos",solicitudhoraextrasSeleccionados ,solicitudhoraextraImplementable,solicitudhoraextraImplementableHome);
	}
	
	public void importarSolicitudHoraExtras() throws Exception {		
	
	}
	
	public void exportarSolicitudHoraExtrasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelSolicitudHoraExtrasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoSolicitudHoraExtrasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlSolicitudHoraExtrasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Solicitud Hora Extra",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoSolicitudHoraExtrasSeleccionados() throws Exception {
		ArrayList<SolicitudHoraExtra> solicitudhoraextrasSeleccionados=new ArrayList<SolicitudHoraExtra>();		
		
		solicitudhoraextrasSeleccionados=this.getSolicitudHoraExtrasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"solicitudhoraextra."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarSolicitudHoraExtra(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(SolicitudHoraExtra solicitudhoraextraAux:solicitudhoraextrasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarSolicitudHoraExtra(solicitudhoraextraAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//solicitudhoraextraAux.setsDetalleGeneralEntityReporte(solicitudhoraextraAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Solicitud Hora Extra",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarSolicitudHoraExtra(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=SolicitudHoraExtraConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudHoraExtraConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudHoraExtraConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudHoraExtraConstantesFunciones.LABEL_IDESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOJEFE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudHoraExtraConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudHoraExtraConstantesFunciones.LABEL_SECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudHoraExtraConstantesFunciones.LABEL_FECHASOLICITA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudHoraExtraConstantesFunciones.LABEL_FECHAEJECUTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudHoraExtraConstantesFunciones.LABEL_NUMEROHORAS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudHoraExtraConstantesFunciones.LABEL_COSTOUNITARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudHoraExtraConstantesFunciones.LABEL_COSTOTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudHoraExtraConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarSolicitudHoraExtra(SolicitudHoraExtra solicitudhoraextra,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=solicitudhoraextra.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudhoraextra.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudhoraextra.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudhoraextra.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudhoraextra.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudhoraextra.getestructura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudhoraextra.getempleadojefe_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudhoraextra.getestadosolicitudnomi_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudhoraextra.getempleadoreemplazo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudhoraextra.getsecuencial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudhoraextra.getfecha_solicita().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudhoraextra.getfecha_ejecuta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudhoraextra.getnumero_horas().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudhoraextra.getcosto_unitario().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudhoraextra.getcosto_total().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudhoraextra.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelSolicitudHoraExtrasSeleccionados() throws Exception {
		ArrayList<SolicitudHoraExtra> solicitudhoraextrasSeleccionados=new ArrayList<SolicitudHoraExtra>();		
		
		solicitudhoraextrasSeleccionados=this.getSolicitudHoraExtrasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"solicitudhoraextra.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("SolicitudHoraExtras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelSolicitudHoraExtra(row);				
				iRow++;
			}				
			
			for(SolicitudHoraExtra solicitudhoraextraAux:solicitudhoraextrasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelSolicitudHoraExtra(solicitudhoraextraAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Solicitud Hora Extra",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlSolicitudHoraExtrasSeleccionados() throws Exception {
		ArrayList<SolicitudHoraExtra> solicitudhoraextrasSeleccionados=new ArrayList<SolicitudHoraExtra>();		
		
		solicitudhoraextrasSeleccionados=this.getSolicitudHoraExtrasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"solicitudhoraextra.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("solicitudhoraextras");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("solicitudhoraextra");
			//elementRoot.appendChild(element);
		
			for(SolicitudHoraExtra solicitudhoraextraAux:solicitudhoraextrasSeleccionados) {
				element = document.createElement("solicitudhoraextra");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlSolicitudHoraExtra(solicitudhoraextraAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Solicitud Hora Extra",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelSolicitudHoraExtra(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_IDESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOJEFE);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_SECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_FECHASOLICITA);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_FECHAEJECUTA);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_NUMEROHORAS);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_COSTOUNITARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_COSTOTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudHoraExtraConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelSolicitudHoraExtra(SolicitudHoraExtra solicitudhoraextra,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudhoraextra.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudhoraextra.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudhoraextra.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudhoraextra.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudhoraextra.getestructura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudhoraextra.getempleadojefe_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudhoraextra.getestadosolicitudnomi_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudhoraextra.getempleadoreemplazo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudhoraextra.getsecuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudhoraextra.getfecha_solicita());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudhoraextra.getfecha_ejecuta());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudhoraextra.getnumero_horas());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudhoraextra.getcosto_unitario());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudhoraextra.getcosto_total());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudhoraextra.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlSolicitudHoraExtra(SolicitudHoraExtra solicitudhoraextra,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(SolicitudHoraExtraConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(solicitudhoraextra.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(SolicitudHoraExtraConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(solicitudhoraextra.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(SolicitudHoraExtraConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(solicitudhoraextra.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(SolicitudHoraExtraConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(solicitudhoraextra.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementempleado_descripcion = document.createElement(SolicitudHoraExtraConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(solicitudhoraextra.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementestructura_descripcion = document.createElement(SolicitudHoraExtraConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(solicitudhoraextra.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);

		Element elementempleadojefe_descripcion = document.createElement(SolicitudHoraExtraConstantesFunciones.IDEMPLEADOJEFE);
		elementempleadojefe_descripcion.appendChild(document.createTextNode(solicitudhoraextra.getempleadojefe_descripcion()));
		element.appendChild(elementempleadojefe_descripcion);

		Element elementestadosolicitudnomi_descripcion = document.createElement(SolicitudHoraExtraConstantesFunciones.IDESTADOSOLICITUDNOMI);
		elementestadosolicitudnomi_descripcion.appendChild(document.createTextNode(solicitudhoraextra.getestadosolicitudnomi_descripcion()));
		element.appendChild(elementestadosolicitudnomi_descripcion);

		Element elementempleadoreemplazo_descripcion = document.createElement(SolicitudHoraExtraConstantesFunciones.IDEMPLEADOREEMPLAZO);
		elementempleadoreemplazo_descripcion.appendChild(document.createTextNode(solicitudhoraextra.getempleadoreemplazo_descripcion()));
		element.appendChild(elementempleadoreemplazo_descripcion);

		Element elementsecuencial = document.createElement(SolicitudHoraExtraConstantesFunciones.SECUENCIAL);
		elementsecuencial.appendChild(document.createTextNode(solicitudhoraextra.getsecuencial().trim()));
		element.appendChild(elementsecuencial);

		Element elementfecha_solicita = document.createElement(SolicitudHoraExtraConstantesFunciones.FECHASOLICITA);
		elementfecha_solicita.appendChild(document.createTextNode(solicitudhoraextra.getfecha_solicita().toString().trim()));
		element.appendChild(elementfecha_solicita);

		Element elementfecha_ejecuta = document.createElement(SolicitudHoraExtraConstantesFunciones.FECHAEJECUTA);
		elementfecha_ejecuta.appendChild(document.createTextNode(solicitudhoraextra.getfecha_ejecuta().toString().trim()));
		element.appendChild(elementfecha_ejecuta);

		Element elementnumero_horas = document.createElement(SolicitudHoraExtraConstantesFunciones.NUMEROHORAS);
		elementnumero_horas.appendChild(document.createTextNode(solicitudhoraextra.getnumero_horas().toString().trim()));
		element.appendChild(elementnumero_horas);

		Element elementcosto_unitario = document.createElement(SolicitudHoraExtraConstantesFunciones.COSTOUNITARIO);
		elementcosto_unitario.appendChild(document.createTextNode(solicitudhoraextra.getcosto_unitario().toString().trim()));
		element.appendChild(elementcosto_unitario);

		Element elementcosto_total = document.createElement(SolicitudHoraExtraConstantesFunciones.COSTOTOTAL);
		elementcosto_total.appendChild(document.createTextNode(solicitudhoraextra.getcosto_total().toString().trim()));
		element.appendChild(elementcosto_total);

		Element elementdescripcion = document.createElement(SolicitudHoraExtraConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(solicitudhoraextra.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoSolicitudHoraExtrasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<SolicitudHoraExtra> solicitudhoraextrasSeleccionados=new ArrayList<SolicitudHoraExtra>();
		
		solicitudhoraextrasSeleccionados=this.getSolicitudHoraExtrasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoSolicitudHoraExtra(solicitudhoraextrasSeleccionados);
		
		this.generarReporteSolicitudHoraExtras("Todos",solicitudhoraextrasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoSolicitudHoraExtra(ArrayList<SolicitudHoraExtra> solicitudhoraextrasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(SolicitudHoraExtra solicitudhoraextraAux:solicitudhoraextrasSeleccionados) {
				solicitudhoraextraAux.setsDetalleGeneralEntityReporte(solicitudhoraextraAux.toString());
			
				if(sTipoSeleccionar.equals(SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					solicitudhoraextraAux.setsDescripcionGeneralEntityReporte1(solicitudhoraextraAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SolicitudHoraExtraConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					solicitudhoraextraAux.setsDescripcionGeneralEntityReporte1(solicitudhoraextraAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					solicitudhoraextraAux.setsDescripcionGeneralEntityReporte1(solicitudhoraextraAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SolicitudHoraExtraConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					solicitudhoraextraAux.setsDescripcionGeneralEntityReporte1(solicitudhoraextraAux.getestructura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOJEFE)) {
					existe=true;
					solicitudhoraextraAux.setsDescripcionGeneralEntityReporte1(solicitudhoraextraAux.getempleadojefe_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SolicitudHoraExtraConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI)) {
					existe=true;
					solicitudhoraextraAux.setsDescripcionGeneralEntityReporte1(solicitudhoraextraAux.getestadosolicitudnomi_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO)) {
					existe=true;
					solicitudhoraextraAux.setsDescripcionGeneralEntityReporte1(solicitudhoraextraAux.getempleadoreemplazo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SolicitudHoraExtraConstantesFunciones.LABEL_SECUENCIAL)) {
					existe=true;
					solicitudhoraextraAux.setsDescripcionGeneralEntityReporte1(solicitudhoraextraAux.getsecuencial());
				}
				 else if(sTipoSeleccionar.equals(SolicitudHoraExtraConstantesFunciones.LABEL_FECHASOLICITA)) {
					existe=true;
					solicitudhoraextraAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(solicitudhoraextraAux.getfecha_solicita()));
				}
				 else if(sTipoSeleccionar.equals(SolicitudHoraExtraConstantesFunciones.LABEL_FECHAEJECUTA)) {
					existe=true;
					solicitudhoraextraAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(solicitudhoraextraAux.getfecha_ejecuta()));
				}
				 else if(sTipoSeleccionar.equals(SolicitudHoraExtraConstantesFunciones.LABEL_NUMEROHORAS)) {
					existe=true;
					solicitudhoraextraAux.setsDescripcionGeneralEntityReporte1(solicitudhoraextraAux.getnumero_horas().toString());
				}
				 else if(sTipoSeleccionar.equals(SolicitudHoraExtraConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					solicitudhoraextraAux.setsDescripcionGeneralEntityReporte1(solicitudhoraextraAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudHoraExtraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesSolicitudHoraExtra(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoSolicitudHoraExtra=true;
				this.isVisibilidadCeldaNuevoRelacionesSolicitudHoraExtra=true;
				this.isVisibilidadCeldaGuardarCambiosSolicitudHoraExtra=true;
			}
			
			this.isVisibilidadCeldaModificarSolicitudHoraExtra=false;
			this.isVisibilidadCeldaActualizarSolicitudHoraExtra=false;
			this.isVisibilidadCeldaEliminarSolicitudHoraExtra=false;
			this.isVisibilidadCeldaCancelarSolicitudHoraExtra=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSolicitudHoraExtra=true;
				} else {
					this.isVisibilidadCeldaGuardarSolicitudHoraExtra=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoSolicitudHoraExtra=false;
			this.isVisibilidadCeldaNuevoRelacionesSolicitudHoraExtra=false;
			this.isVisibilidadCeldaGuardarCambiosSolicitudHoraExtra=false;
			this.isVisibilidadCeldaModificarSolicitudHoraExtra=false;
			this.isVisibilidadCeldaActualizarSolicitudHoraExtra=true;
			this.isVisibilidadCeldaEliminarSolicitudHoraExtra=false;
			this.isVisibilidadCeldaCancelarSolicitudHoraExtra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSolicitudHoraExtra=true;
				} else {
					this.isVisibilidadCeldaGuardarSolicitudHoraExtra=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoSolicitudHoraExtra=false;
			this.isVisibilidadCeldaNuevoRelacionesSolicitudHoraExtra=false;
			this.isVisibilidadCeldaGuardarCambiosSolicitudHoraExtra=false;
			this.isVisibilidadCeldaModificarSolicitudHoraExtra=false;
			this.isVisibilidadCeldaActualizarSolicitudHoraExtra=true;
			this.isVisibilidadCeldaEliminarSolicitudHoraExtra=true;
			this.isVisibilidadCeldaCancelarSolicitudHoraExtra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSolicitudHoraExtra=true;
				} else {
					this.isVisibilidadCeldaGuardarSolicitudHoraExtra=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoSolicitudHoraExtra=false;
			this.isVisibilidadCeldaNuevoRelacionesSolicitudHoraExtra=false;
			this.isVisibilidadCeldaGuardarCambiosSolicitudHoraExtra=false;
			this.isVisibilidadCeldaModificarSolicitudHoraExtra=false;
			this.isVisibilidadCeldaActualizarSolicitudHoraExtra=true;
			this.isVisibilidadCeldaEliminarSolicitudHoraExtra=false;
			this.isVisibilidadCeldaCancelarSolicitudHoraExtra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSolicitudHoraExtra=false;
				} else {
					this.isVisibilidadCeldaGuardarSolicitudHoraExtra=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoSolicitudHoraExtra=true;
			this.isVisibilidadCeldaNuevoRelacionesSolicitudHoraExtra=true;
			this.isVisibilidadCeldaGuardarCambiosSolicitudHoraExtra=true;
			this.isVisibilidadCeldaModificarSolicitudHoraExtra=false;
			this.isVisibilidadCeldaActualizarSolicitudHoraExtra=false;
			this.isVisibilidadCeldaEliminarSolicitudHoraExtra=false;
			this.isVisibilidadCeldaCancelarSolicitudHoraExtra=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSolicitudHoraExtra=true;
				} else {
					this.isVisibilidadCeldaGuardarSolicitudHoraExtra=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoSolicitudHoraExtra=false;
			this.isVisibilidadCeldaNuevoRelacionesSolicitudHoraExtra=false;
			this.isVisibilidadCeldaGuardarCambiosSolicitudHoraExtra=false;
			this.isVisibilidadCeldaActualizarSolicitudHoraExtra=false;
			this.isVisibilidadCeldaEliminarSolicitudHoraExtra=false;
			this.isVisibilidadCeldaCancelarSolicitudHoraExtra=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSolicitudHoraExtra=false;
				} else {
					this.isVisibilidadCeldaGuardarSolicitudHoraExtra=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoSolicitudHoraExtra=false;
			this.isVisibilidadCeldaNuevoRelacionesSolicitudHoraExtra=false;
			this.isVisibilidadCeldaGuardarCambiosSolicitudHoraExtra=false;
			this.isVisibilidadCeldaModificarSolicitudHoraExtra=true;
			this.isVisibilidadCeldaActualizarSolicitudHoraExtra=false;
			this.isVisibilidadCeldaEliminarSolicitudHoraExtra=false;
			this.isVisibilidadCeldaCancelarSolicitudHoraExtra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSolicitudHoraExtra=false;
				} else {
					this.isVisibilidadCeldaGuardarSolicitudHoraExtra=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(SolicitudHoraExtraJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoSolicitudHoraExtra=true;
			this.isVisibilidadCeldaNuevoRelacionesSolicitudHoraExtra=true;
			this.isVisibilidadCeldaGuardarCambiosSolicitudHoraExtra=true;
		} else {
			this.actualizarEstadoPanelsSolicitudHoraExtra(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarSolicitudHoraExtra=false;
			//this.isVisibilidadCeldaVerFormSolicitudHoraExtra=false;
			this.isVisibilidadCeldaDuplicarSolicitudHoraExtra=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!solicitudhoraextraSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesSolicitudHoraExtra=false;
		} else {
			this.isVisibilidadCeldaNuevoSolicitudHoraExtra=false;
			this.isVisibilidadCeldaGuardarCambiosSolicitudHoraExtra=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
			if(!solicitudhoraextraSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesSolicitudHoraExtra=false;												
			}
			
			this.jButtonCerrarSolicitudHoraExtra.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesSolicitudHoraExtra=false;
		}
		
		if(!this.permiteMantenimiento(this.solicitudhoraextra)) {
			this.isVisibilidadCeldaActualizarSolicitudHoraExtra=false;
			this.isVisibilidadCeldaEliminarSolicitudHoraExtra=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesSolicitudHoraExtra() {
	}
	
	public void actualizarEstadoPanelsSolicitudHoraExtra(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionSolicitudHoraExtra!=null) {
				this.jScrollPanelDatosEdicionSolicitudHoraExtra.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSolicitudHoraExtra!=null) {
				this.jTabbedPaneBusquedasSolicitudHoraExtra.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSolicitudHoraExtra!=null) {
				this.jScrollPanelDatosSolicitudHoraExtra.setVisible(true);
			}
			
			if(this.jPanelPaginacionSolicitudHoraExtra!=null) {
				this.jPanelPaginacionSolicitudHoraExtra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSolicitudHoraExtra!=null) {
				this.jPanelParametrosReportesSolicitudHoraExtra.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionSolicitudHoraExtra!=null) {
				this.jScrollPanelDatosEdicionSolicitudHoraExtra.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSolicitudHoraExtra!=null) {
				this.jTabbedPaneBusquedasSolicitudHoraExtra.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosSolicitudHoraExtra!=null) {
				this.jScrollPanelDatosSolicitudHoraExtra.setVisible(false);
			}
			
			if(this.jPanelPaginacionSolicitudHoraExtra!=null) {
				this.jPanelPaginacionSolicitudHoraExtra.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSolicitudHoraExtra!=null) {
				this.jPanelParametrosReportesSolicitudHoraExtra.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionSolicitudHoraExtra!=null) {
				this.jScrollPanelDatosEdicionSolicitudHoraExtra.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSolicitudHoraExtra!=null) {
				this.jTabbedPaneBusquedasSolicitudHoraExtra.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSolicitudHoraExtra!=null) {
				this.jScrollPanelDatosSolicitudHoraExtra.setVisible(false);
			}
			
			if(this.jPanelPaginacionSolicitudHoraExtra!=null) {
				this.jPanelPaginacionSolicitudHoraExtra.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSolicitudHoraExtra!=null) {
				this.jPanelParametrosReportesSolicitudHoraExtra.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionSolicitudHoraExtra!=null) {
				this.jScrollPanelDatosEdicionSolicitudHoraExtra.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSolicitudHoraExtra!=null) {
				this.jTabbedPaneBusquedasSolicitudHoraExtra.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSolicitudHoraExtra!=null) {
				this.jScrollPanelDatosSolicitudHoraExtra.setVisible(false);
			}
			
			if(this.jPanelPaginacionSolicitudHoraExtra!=null) {
				this.jPanelPaginacionSolicitudHoraExtra.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSolicitudHoraExtra!=null) {
				this.jPanelParametrosReportesSolicitudHoraExtra.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionSolicitudHoraExtra!=null) {
				this.jScrollPanelDatosEdicionSolicitudHoraExtra.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSolicitudHoraExtra!=null) {
				this.jTabbedPaneBusquedasSolicitudHoraExtra.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSolicitudHoraExtra!=null) {
				this.jScrollPanelDatosSolicitudHoraExtra.setVisible(true);
			}
			
			if(this.jPanelPaginacionSolicitudHoraExtra!=null) {
				this.jPanelPaginacionSolicitudHoraExtra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSolicitudHoraExtra!=null) {
				this.jPanelParametrosReportesSolicitudHoraExtra.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionSolicitudHoraExtra!=null) {
				this.jScrollPanelDatosEdicionSolicitudHoraExtra.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSolicitudHoraExtra!=null) {
				this.jTabbedPaneBusquedasSolicitudHoraExtra.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSolicitudHoraExtra!=null) {
				this.jScrollPanelDatosSolicitudHoraExtra.setVisible(true);
			}
			
			if(this.jPanelPaginacionSolicitudHoraExtra!=null) {
				this.jPanelPaginacionSolicitudHoraExtra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSolicitudHoraExtra!=null) {
				this.jPanelParametrosReportesSolicitudHoraExtra.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionSolicitudHoraExtra!=null) {
				this.jScrollPanelDatosEdicionSolicitudHoraExtra.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSolicitudHoraExtra!=null) {
				this.jTabbedPaneBusquedasSolicitudHoraExtra.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSolicitudHoraExtra!=null) {
				this.jScrollPanelDatosSolicitudHoraExtra.setVisible(true);
			}
			
			if(this.jPanelPaginacionSolicitudHoraExtra!=null) {
				this.jPanelPaginacionSolicitudHoraExtra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSolicitudHoraExtra!=null) {
				this.jPanelParametrosReportesSolicitudHoraExtra.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasSolicitudHoraExtra!=null) {
					this.jTabbedPaneBusquedasSolicitudHoraExtra.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesSolicitudHoraExtra!=null) {
				this.jPanelParametrosReportesSolicitudHoraExtra.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSolicitudHoraExtra!=null) {
				this.jTabbedPaneBusquedasSolicitudHoraExtra.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesSolicitudHoraExtra!=null) {
				this.jPanelParametrosReportesSolicitudHoraExtra.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEmpleadoSolicitudHoraExtra);}

			this.isVisibilidadFK_IdEmpleadoJefe=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleadoJefe) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEmpleadoJefeSolicitudHoraExtra);}

			this.isVisibilidadFK_IdEmpleadoReemplazo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleadoReemplazo) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEmpleadoReemplazoSolicitudHoraExtra);}

			this.isVisibilidadFK_IdEstadoSolicitudNomi=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstadoSolicitudNomi) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEstadoSolicitudNomiSolicitudHoraExtra);}

			this.isVisibilidadFK_IdEstructura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEstructuraSolicitudHoraExtra);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdEmpleado=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEmpleadoSolicitudHoraExtra);}

			this.isVisibilidadFK_IdEmpleadoJefe=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEmpleadoJefe) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEmpleadoJefeSolicitudHoraExtra);}

			this.isVisibilidadFK_IdEmpleadoReemplazo=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEmpleadoReemplazo) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEmpleadoReemplazoSolicitudHoraExtra);}

			this.isVisibilidadFK_IdEstadoSolicitudNomi=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEstadoSolicitudNomi) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEstadoSolicitudNomiSolicitudHoraExtra);}

			this.isVisibilidadFK_IdEstructura=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEstructuraSolicitudHoraExtra);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEmpleadoSolicitudHoraExtra);}

			this.isVisibilidadFK_IdEmpleadoJefe=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEmpleadoJefe) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEmpleadoJefeSolicitudHoraExtra);}

			this.isVisibilidadFK_IdEmpleadoReemplazo=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEmpleadoReemplazo) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEmpleadoReemplazoSolicitudHoraExtra);}

			this.isVisibilidadFK_IdEstadoSolicitudNomi=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEstadoSolicitudNomi) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEstadoSolicitudNomiSolicitudHoraExtra);}

			this.isVisibilidadFK_IdEstructura=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEstructuraSolicitudHoraExtra);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadFK_IdEmpleado=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEmpleadoSolicitudHoraExtra);}

			this.isVisibilidadFK_IdEmpleadoJefe=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdEmpleadoJefe) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEmpleadoJefeSolicitudHoraExtra);}

			this.isVisibilidadFK_IdEmpleadoReemplazo=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdEmpleadoReemplazo) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEmpleadoReemplazoSolicitudHoraExtra);}

			this.isVisibilidadFK_IdEstadoSolicitudNomi=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdEstadoSolicitudNomi) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEstadoSolicitudNomiSolicitudHoraExtra);}

			this.isVisibilidadFK_IdEstructura=isParaEstructura;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEstructuraSolicitudHoraExtra);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleadoJefe(Boolean isParaEmpleadoJefe){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoJefeNegation=!isParaEmpleadoJefe;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleadoJefeNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEmpleadoSolicitudHoraExtra);}

			this.isVisibilidadFK_IdEmpleadoJefe=isParaEmpleadoJefe;
			if(!this.isVisibilidadFK_IdEmpleadoJefe) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEmpleadoJefeSolicitudHoraExtra);}

			this.isVisibilidadFK_IdEmpleadoReemplazo=isParaEmpleadoJefeNegation;
			if(!this.isVisibilidadFK_IdEmpleadoReemplazo) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEmpleadoReemplazoSolicitudHoraExtra);}

			this.isVisibilidadFK_IdEstadoSolicitudNomi=isParaEmpleadoJefeNegation;
			if(!this.isVisibilidadFK_IdEstadoSolicitudNomi) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEstadoSolicitudNomiSolicitudHoraExtra);}

			this.isVisibilidadFK_IdEstructura=isParaEmpleadoJefeNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEstructuraSolicitudHoraExtra);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstadoSolicitudNomi(Boolean isParaEstadoSolicitudNomi){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstadoSolicitudNomiNegation=!isParaEstadoSolicitudNomi;

			this.isVisibilidadFK_IdEmpleado=isParaEstadoSolicitudNomiNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEmpleadoSolicitudHoraExtra);}

			this.isVisibilidadFK_IdEmpleadoJefe=isParaEstadoSolicitudNomiNegation;
			if(!this.isVisibilidadFK_IdEmpleadoJefe) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEmpleadoJefeSolicitudHoraExtra);}

			this.isVisibilidadFK_IdEmpleadoReemplazo=isParaEstadoSolicitudNomiNegation;
			if(!this.isVisibilidadFK_IdEmpleadoReemplazo) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEmpleadoReemplazoSolicitudHoraExtra);}

			this.isVisibilidadFK_IdEstadoSolicitudNomi=isParaEstadoSolicitudNomi;
			if(!this.isVisibilidadFK_IdEstadoSolicitudNomi) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEstadoSolicitudNomiSolicitudHoraExtra);}

			this.isVisibilidadFK_IdEstructura=isParaEstadoSolicitudNomiNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEstructuraSolicitudHoraExtra);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleadoReemplazo(Boolean isParaEmpleadoReemplazo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoReemplazoNegation=!isParaEmpleadoReemplazo;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleadoReemplazoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEmpleadoSolicitudHoraExtra);}

			this.isVisibilidadFK_IdEmpleadoJefe=isParaEmpleadoReemplazoNegation;
			if(!this.isVisibilidadFK_IdEmpleadoJefe) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEmpleadoJefeSolicitudHoraExtra);}

			this.isVisibilidadFK_IdEmpleadoReemplazo=isParaEmpleadoReemplazo;
			if(!this.isVisibilidadFK_IdEmpleadoReemplazo) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEmpleadoReemplazoSolicitudHoraExtra);}

			this.isVisibilidadFK_IdEstadoSolicitudNomi=isParaEmpleadoReemplazoNegation;
			if(!this.isVisibilidadFK_IdEstadoSolicitudNomi) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEstadoSolicitudNomiSolicitudHoraExtra);}

			this.isVisibilidadFK_IdEstructura=isParaEmpleadoReemplazoNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(jPanelFK_IdEstructuraSolicitudHoraExtra);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//SolicitudHoraExtraSessionBean solicitudhoraextraSessionBean=new SolicitudHoraExtraSessionBean();
		
		if(this.solicitudhoraextraSessionBean==null) {
			this.solicitudhoraextraSessionBean=new SolicitudHoraExtraSessionBean();
		}
		
		this.solicitudhoraextraSessionBean.setsUltimaBusquedaSolicitudHoraExtra(this.getsAccionBusqueda());
		this.solicitudhoraextraSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.solicitudhoraextraSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			solicitudhoraextraSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleadoJefe")) {
			solicitudhoraextraSessionBean.setid_empleado_jefe(this.getid_empleado_jefeFK_IdEmpleadoJefe());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleadoReemplazo")) {
			solicitudhoraextraSessionBean.setid_empleado_reemplazo(this.getid_empleado_reemplazoFK_IdEmpleadoReemplazo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			solicitudhoraextraSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstadoSolicitudNomi")) {
			solicitudhoraextraSessionBean.setid_estado_solicitud_nomi(this.getid_estado_solicitud_nomiFK_IdEstadoSolicitudNomi());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
			solicitudhoraextraSessionBean.setid_estructura(this.getid_estructuraFK_IdEstructura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			solicitudhoraextraSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//SolicitudHoraExtraSessionBean solicitudhoraextraSessionBean=new SolicitudHoraExtraSessionBean();
		
		if(this.solicitudhoraextraSessionBean==null) {
			this.solicitudhoraextraSessionBean=new SolicitudHoraExtraSessionBean();
		}
		
		if(this.solicitudhoraextraSessionBean.getsUltimaBusquedaSolicitudHoraExtra()!=null&&!this.solicitudhoraextraSessionBean.getsUltimaBusquedaSolicitudHoraExtra().equals("")) {
			this.setsAccionBusqueda(solicitudhoraextraSessionBean.getsUltimaBusquedaSolicitudHoraExtra());
			this.setiNumeroPaginacion(solicitudhoraextraSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(solicitudhoraextraSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(solicitudhoraextraSessionBean.getid_empleado());
				solicitudhoraextraSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleadoJefe")) {
				this.setid_empleado_jefeFK_IdEmpleadoJefe(solicitudhoraextraSessionBean.getid_empleado_jefe());
				solicitudhoraextraSessionBean.setid_empleado_jefe(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleadoReemplazo")) {
				this.setid_empleado_reemplazoFK_IdEmpleadoReemplazo(solicitudhoraextraSessionBean.getid_empleado_reemplazo());
				solicitudhoraextraSessionBean.setid_empleado_reemplazo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(solicitudhoraextraSessionBean.getid_empresa());
				solicitudhoraextraSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstadoSolicitudNomi")) {
				this.setid_estado_solicitud_nomiFK_IdEstadoSolicitudNomi(solicitudhoraextraSessionBean.getid_estado_solicitud_nomi());
				solicitudhoraextraSessionBean.setid_estado_solicitud_nomi(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
				this.setid_estructuraFK_IdEstructura(solicitudhoraextraSessionBean.getid_estructura());
				solicitudhoraextraSessionBean.setid_estructura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(solicitudhoraextraSessionBean.getid_sucursal());
				solicitudhoraextraSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.solicitudhoraextraSessionBean.setsUltimaBusquedaSolicitudHoraExtra("");
		this.solicitudhoraextraSessionBean.setiNumeroPaginacion(SolicitudHoraExtraConstantesFunciones.INUMEROPAGINACION);
		this.solicitudhoraextraSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaSolicitudHoraExtra(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioSolicitudHoraExtra() {
		this.updateBorderResaltarBusquedasFormularioSolicitudHoraExtra();
		this.updateVisibilidadBusquedasFormularioSolicitudHoraExtra();
		this.updateHabilitarBusquedasFormularioSolicitudHoraExtra();
	}
	
	public void updateBorderResaltarBusquedasFormularioSolicitudHoraExtra() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasSolicitudHoraExtra.getComponents().length>0) {
	

		if(this.solicitudhoraextraConstantesFunciones.resaltarFK_IdEmpleadoSolicitudHoraExtra!=null) {
			index= this.jTabbedPaneBusquedasSolicitudHoraExtra.indexOfComponent(this.jPanelFK_IdEmpleadoSolicitudHoraExtra);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudHoraExtra.getComponent(index);
				jPanel.setBorder(this.solicitudhoraextraConstantesFunciones.resaltarFK_IdEmpleadoSolicitudHoraExtra);
			}
		}

		if(this.solicitudhoraextraConstantesFunciones.resaltarFK_IdEmpleadoJefeSolicitudHoraExtra!=null) {
			index= this.jTabbedPaneBusquedasSolicitudHoraExtra.indexOfComponent(this.jPanelFK_IdEmpleadoJefeSolicitudHoraExtra);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudHoraExtra.getComponent(index);
				jPanel.setBorder(this.solicitudhoraextraConstantesFunciones.resaltarFK_IdEmpleadoJefeSolicitudHoraExtra);
			}
		}

		if(this.solicitudhoraextraConstantesFunciones.resaltarFK_IdEmpleadoReemplazoSolicitudHoraExtra!=null) {
			index= this.jTabbedPaneBusquedasSolicitudHoraExtra.indexOfComponent(this.jPanelFK_IdEmpleadoReemplazoSolicitudHoraExtra);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudHoraExtra.getComponent(index);
				jPanel.setBorder(this.solicitudhoraextraConstantesFunciones.resaltarFK_IdEmpleadoReemplazoSolicitudHoraExtra);
			}
		}

		if(this.solicitudhoraextraConstantesFunciones.resaltarFK_IdEstadoSolicitudNomiSolicitudHoraExtra!=null) {
			index= this.jTabbedPaneBusquedasSolicitudHoraExtra.indexOfComponent(this.jPanelFK_IdEstadoSolicitudNomiSolicitudHoraExtra);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudHoraExtra.getComponent(index);
				jPanel.setBorder(this.solicitudhoraextraConstantesFunciones.resaltarFK_IdEstadoSolicitudNomiSolicitudHoraExtra);
			}
		}

		if(this.solicitudhoraextraConstantesFunciones.resaltarFK_IdEstructuraSolicitudHoraExtra!=null) {
			index= this.jTabbedPaneBusquedasSolicitudHoraExtra.indexOfComponent(this.jPanelFK_IdEstructuraSolicitudHoraExtra);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudHoraExtra.getComponent(index);
				jPanel.setBorder(this.solicitudhoraextraConstantesFunciones.resaltarFK_IdEstructuraSolicitudHoraExtra);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioSolicitudHoraExtra() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasSolicitudHoraExtra.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSolicitudHoraExtra.indexOfComponent(this.jPanelFK_IdEmpleadoSolicitudHoraExtra);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudHoraExtra.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarFK_IdEmpleadoSolicitudHoraExtra);
			if(!this.solicitudhoraextraConstantesFunciones.mostrarFK_IdEmpleadoSolicitudHoraExtra && index>-1) {
				this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(index);
			}

			index= this.jTabbedPaneBusquedasSolicitudHoraExtra.indexOfComponent(this.jPanelFK_IdEmpleadoJefeSolicitudHoraExtra);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudHoraExtra.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarFK_IdEmpleadoJefeSolicitudHoraExtra);
			if(!this.solicitudhoraextraConstantesFunciones.mostrarFK_IdEmpleadoJefeSolicitudHoraExtra && index>-1) {
				this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(index);
			}

			index= this.jTabbedPaneBusquedasSolicitudHoraExtra.indexOfComponent(this.jPanelFK_IdEmpleadoReemplazoSolicitudHoraExtra);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudHoraExtra.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarFK_IdEmpleadoReemplazoSolicitudHoraExtra);
			if(!this.solicitudhoraextraConstantesFunciones.mostrarFK_IdEmpleadoReemplazoSolicitudHoraExtra && index>-1) {
				this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(index);
			}

			index= this.jTabbedPaneBusquedasSolicitudHoraExtra.indexOfComponent(this.jPanelFK_IdEstadoSolicitudNomiSolicitudHoraExtra);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudHoraExtra.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarFK_IdEstadoSolicitudNomiSolicitudHoraExtra);
			if(!this.solicitudhoraextraConstantesFunciones.mostrarFK_IdEstadoSolicitudNomiSolicitudHoraExtra && index>-1) {
				this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(index);
			}

			index= this.jTabbedPaneBusquedasSolicitudHoraExtra.indexOfComponent(this.jPanelFK_IdEstructuraSolicitudHoraExtra);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudHoraExtra.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarFK_IdEstructuraSolicitudHoraExtra);
			if(!this.solicitudhoraextraConstantesFunciones.mostrarFK_IdEstructuraSolicitudHoraExtra && index>-1) {
				this.jTabbedPaneBusquedasSolicitudHoraExtra.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioSolicitudHoraExtra() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasSolicitudHoraExtra.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSolicitudHoraExtra.indexOfComponent(this.jPanelFK_IdEmpleadoSolicitudHoraExtra);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudHoraExtra.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.solicitudhoraextraConstantesFunciones.activarFK_IdEmpleadoSolicitudHoraExtra);
				this.jTabbedPaneBusquedasSolicitudHoraExtra.setEnabledAt(index,this.solicitudhoraextraConstantesFunciones.activarFK_IdEmpleadoSolicitudHoraExtra);
			}

			index= this.jTabbedPaneBusquedasSolicitudHoraExtra.indexOfComponent(this.jPanelFK_IdEmpleadoJefeSolicitudHoraExtra);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudHoraExtra.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.solicitudhoraextraConstantesFunciones.activarFK_IdEmpleadoJefeSolicitudHoraExtra);
				this.jTabbedPaneBusquedasSolicitudHoraExtra.setEnabledAt(index,this.solicitudhoraextraConstantesFunciones.activarFK_IdEmpleadoJefeSolicitudHoraExtra);
			}

			index= this.jTabbedPaneBusquedasSolicitudHoraExtra.indexOfComponent(this.jPanelFK_IdEmpleadoReemplazoSolicitudHoraExtra);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudHoraExtra.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.solicitudhoraextraConstantesFunciones.activarFK_IdEmpleadoReemplazoSolicitudHoraExtra);
				this.jTabbedPaneBusquedasSolicitudHoraExtra.setEnabledAt(index,this.solicitudhoraextraConstantesFunciones.activarFK_IdEmpleadoReemplazoSolicitudHoraExtra);
			}

			index= this.jTabbedPaneBusquedasSolicitudHoraExtra.indexOfComponent(this.jPanelFK_IdEstadoSolicitudNomiSolicitudHoraExtra);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudHoraExtra.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.solicitudhoraextraConstantesFunciones.activarFK_IdEstadoSolicitudNomiSolicitudHoraExtra);
				this.jTabbedPaneBusquedasSolicitudHoraExtra.setEnabledAt(index,this.solicitudhoraextraConstantesFunciones.activarFK_IdEstadoSolicitudNomiSolicitudHoraExtra);
			}

			index= this.jTabbedPaneBusquedasSolicitudHoraExtra.indexOfComponent(this.jPanelFK_IdEstructuraSolicitudHoraExtra);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudHoraExtra.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.solicitudhoraextraConstantesFunciones.activarFK_IdEstructuraSolicitudHoraExtra);
				this.jTabbedPaneBusquedasSolicitudHoraExtra.setEnabledAt(index,this.solicitudhoraextraConstantesFunciones.activarFK_IdEstructuraSolicitudHoraExtra);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaSolicitudHoraExtra(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasSolicitudHoraExtra.indexOfComponent(this.jPanelFK_IdEmpleadoSolicitudHoraExtra);

			this.jTabbedPaneBusquedasSolicitudHoraExtra.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudHoraExtra.getComponent(index);

			this.solicitudhoraextraConstantesFunciones.setResaltarFK_IdEmpleadoSolicitudHoraExtra(resaltar);

			jPanel.setBorder(this.solicitudhoraextraConstantesFunciones.resaltarFK_IdEmpleadoSolicitudHoraExtra);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleadoJefe")) {
			index= this.jTabbedPaneBusquedasSolicitudHoraExtra.indexOfComponent(this.jPanelFK_IdEmpleadoJefeSolicitudHoraExtra);

			this.jTabbedPaneBusquedasSolicitudHoraExtra.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudHoraExtra.getComponent(index);

			this.solicitudhoraextraConstantesFunciones.setResaltarFK_IdEmpleadoJefeSolicitudHoraExtra(resaltar);

			jPanel.setBorder(this.solicitudhoraextraConstantesFunciones.resaltarFK_IdEmpleadoJefeSolicitudHoraExtra);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleadoReemplazo")) {
			index= this.jTabbedPaneBusquedasSolicitudHoraExtra.indexOfComponent(this.jPanelFK_IdEmpleadoReemplazoSolicitudHoraExtra);

			this.jTabbedPaneBusquedasSolicitudHoraExtra.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudHoraExtra.getComponent(index);

			this.solicitudhoraextraConstantesFunciones.setResaltarFK_IdEmpleadoReemplazoSolicitudHoraExtra(resaltar);

			jPanel.setBorder(this.solicitudhoraextraConstantesFunciones.resaltarFK_IdEmpleadoReemplazoSolicitudHoraExtra);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstadoSolicitudNomi")) {
			index= this.jTabbedPaneBusquedasSolicitudHoraExtra.indexOfComponent(this.jPanelFK_IdEstadoSolicitudNomiSolicitudHoraExtra);

			this.jTabbedPaneBusquedasSolicitudHoraExtra.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudHoraExtra.getComponent(index);

			this.solicitudhoraextraConstantesFunciones.setResaltarFK_IdEstadoSolicitudNomiSolicitudHoraExtra(resaltar);

			jPanel.setBorder(this.solicitudhoraextraConstantesFunciones.resaltarFK_IdEstadoSolicitudNomiSolicitudHoraExtra);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstructura")) {
			index= this.jTabbedPaneBusquedasSolicitudHoraExtra.indexOfComponent(this.jPanelFK_IdEstructuraSolicitudHoraExtra);

			this.jTabbedPaneBusquedasSolicitudHoraExtra.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudHoraExtra.getComponent(index);

			this.solicitudhoraextraConstantesFunciones.setResaltarFK_IdEstructuraSolicitudHoraExtra(resaltar);

			jPanel.setBorder(this.solicitudhoraextraConstantesFunciones.resaltarFK_IdEstructuraSolicitudHoraExtra);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarSolicitudHoraExtra.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioSolicitudHoraExtra() throws Exception {

		if(this.jInternalFrameDetalleFormSolicitudHoraExtra==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioSolicitudHoraExtra();
		this.updateVisibilidadResaltarControlesFormularioSolicitudHoraExtra();
		this.updateHabilitarResaltarControlesFormularioSolicitudHoraExtra();
		
	}
	
	public void updateBorderResaltarControlesFormularioSolicitudHoraExtra() throws Exception {
		if(this.jInternalFrameDetalleFormSolicitudHoraExtra==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.solicitudhoraextraConstantesFunciones.resaltaridSolicitudHoraExtra!=null && this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelidSolicitudHoraExtra.setBorder(this.solicitudhoraextraConstantesFunciones.resaltaridSolicitudHoraExtra);}
		if(this.solicitudhoraextraConstantesFunciones.resaltarid_empresaSolicitudHoraExtra!=null && this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empresaSolicitudHoraExtra.setBorder(this.solicitudhoraextraConstantesFunciones.resaltarid_empresaSolicitudHoraExtra);}
		if(this.solicitudhoraextraConstantesFunciones.resaltarid_sucursalSolicitudHoraExtra!=null && this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_sucursalSolicitudHoraExtra.setBorder(this.solicitudhoraextraConstantesFunciones.resaltarid_sucursalSolicitudHoraExtra);}
		if(this.solicitudhoraextraConstantesFunciones.resaltarid_empleadoSolicitudHoraExtra!=null && this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleadoSolicitudHoraExtra.setBorder(this.solicitudhoraextraConstantesFunciones.resaltarid_empleadoSolicitudHoraExtra);}
		if(this.solicitudhoraextraConstantesFunciones.resaltarid_estructuraSolicitudHoraExtra!=null && this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estructuraSolicitudHoraExtra.setBorder(this.solicitudhoraextraConstantesFunciones.resaltarid_estructuraSolicitudHoraExtra);}
		if(this.solicitudhoraextraConstantesFunciones.resaltarid_empleado_jefeSolicitudHoraExtra!=null && this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_jefeSolicitudHoraExtra.setBorder(this.solicitudhoraextraConstantesFunciones.resaltarid_empleado_jefeSolicitudHoraExtra);}
		if(this.solicitudhoraextraConstantesFunciones.resaltarid_estado_solicitud_nomiSolicitudHoraExtra!=null && this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra.setBorder(this.solicitudhoraextraConstantesFunciones.resaltarid_estado_solicitud_nomiSolicitudHoraExtra);}
		if(this.solicitudhoraextraConstantesFunciones.resaltarid_empleado_reemplazoSolicitudHoraExtra!=null && this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_reemplazoSolicitudHoraExtra.setBorder(this.solicitudhoraextraConstantesFunciones.resaltarid_empleado_reemplazoSolicitudHoraExtra);}
		if(this.solicitudhoraextraConstantesFunciones.resaltarsecuencialSolicitudHoraExtra!=null && this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldsecuencialSolicitudHoraExtra.setBorder(this.solicitudhoraextraConstantesFunciones.resaltarsecuencialSolicitudHoraExtra);}
		if(this.solicitudhoraextraConstantesFunciones.resaltarfecha_solicitaSolicitudHoraExtra!=null && this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {this.jInternalFrameDetalleFormSolicitudHoraExtra.jDateChooserfecha_solicitaSolicitudHoraExtra.setBorder(this.solicitudhoraextraConstantesFunciones.resaltarfecha_solicitaSolicitudHoraExtra);}
		if(this.solicitudhoraextraConstantesFunciones.resaltarfecha_ejecutaSolicitudHoraExtra!=null && this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {this.jInternalFrameDetalleFormSolicitudHoraExtra.jDateChooserfecha_ejecutaSolicitudHoraExtra.setBorder(this.solicitudhoraextraConstantesFunciones.resaltarfecha_ejecutaSolicitudHoraExtra);}
		if(this.solicitudhoraextraConstantesFunciones.resaltarnumero_horasSolicitudHoraExtra!=null && this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldnumero_horasSolicitudHoraExtra.setBorder(this.solicitudhoraextraConstantesFunciones.resaltarnumero_horasSolicitudHoraExtra);}
		if(this.solicitudhoraextraConstantesFunciones.resaltarcosto_unitarioSolicitudHoraExtra!=null && this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldcosto_unitarioSolicitudHoraExtra.setBorder(this.solicitudhoraextraConstantesFunciones.resaltarcosto_unitarioSolicitudHoraExtra);}
		if(this.solicitudhoraextraConstantesFunciones.resaltarcosto_totalSolicitudHoraExtra!=null && this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldcosto_totalSolicitudHoraExtra.setBorder(this.solicitudhoraextraConstantesFunciones.resaltarcosto_totalSolicitudHoraExtra);}
		if(this.solicitudhoraextraConstantesFunciones.resaltardescripcionSolicitudHoraExtra!=null && this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextAreadescripcionSolicitudHoraExtra.setBorder(this.solicitudhoraextraConstantesFunciones.resaltardescripcionSolicitudHoraExtra);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioSolicitudHoraExtra() throws Exception {		
		if(this.jInternalFrameDetalleFormSolicitudHoraExtra==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
	
		//this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelidSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostraridSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jPanelidSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostraridSolicitudHoraExtra);
		//this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empresaSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarid_empresaSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jPanelid_empresaSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarid_empresaSolicitudHoraExtra);
		//this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_sucursalSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarid_sucursalSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jPanelid_sucursalSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarid_sucursalSolicitudHoraExtra);
		//this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleadoSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarid_empleadoSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jPanelid_empleadoSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarid_empleadoSolicitudHoraExtra);
		//this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estructuraSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarid_estructuraSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jPanelid_estructuraSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarid_estructuraSolicitudHoraExtra);
		//this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_jefeSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarid_empleado_jefeSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jPanelid_empleado_jefeSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarid_empleado_jefeSolicitudHoraExtra);
		//this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarid_estado_solicitud_nomiSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jPanelid_estado_solicitud_nomiSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarid_estado_solicitud_nomiSolicitudHoraExtra);
		//this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_reemplazoSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarid_empleado_reemplazoSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jPanelid_empleado_reemplazoSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarid_empleado_reemplazoSolicitudHoraExtra);
		//this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldsecuencialSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarsecuencialSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jPanelsecuencialSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarsecuencialSolicitudHoraExtra);
		//this.jInternalFrameDetalleFormSolicitudHoraExtra.jDateChooserfecha_solicitaSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarfecha_solicitaSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jPanelfecha_solicitaSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarfecha_solicitaSolicitudHoraExtra);
		//this.jInternalFrameDetalleFormSolicitudHoraExtra.jDateChooserfecha_ejecutaSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarfecha_ejecutaSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jPanelfecha_ejecutaSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarfecha_ejecutaSolicitudHoraExtra);
		//this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldnumero_horasSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarnumero_horasSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jPanelnumero_horasSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarnumero_horasSolicitudHoraExtra);
		//this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldcosto_unitarioSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarcosto_unitarioSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jPanelcosto_unitarioSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarcosto_unitarioSolicitudHoraExtra);
		//this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldcosto_totalSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarcosto_totalSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jPanelcosto_totalSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostrarcosto_totalSolicitudHoraExtra);
		//this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextAreadescripcionSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostrardescripcionSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jPaneldescripcionSolicitudHoraExtra.setVisible(this.solicitudhoraextraConstantesFunciones.mostrardescripcionSolicitudHoraExtra);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioSolicitudHoraExtra() throws Exception {
		if(this.jInternalFrameDetalleFormSolicitudHoraExtra==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSolicitudHoraExtra!=null) {
	
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jLabelidSolicitudHoraExtra.setEnabled(this.solicitudhoraextraConstantesFunciones.activaridSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empresaSolicitudHoraExtra.setEnabled(this.solicitudhoraextraConstantesFunciones.activarid_empresaSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_sucursalSolicitudHoraExtra.setEnabled(this.solicitudhoraextraConstantesFunciones.activarid_sucursalSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleadoSolicitudHoraExtra.setEnabled(this.solicitudhoraextraConstantesFunciones.activarid_empleadoSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estructuraSolicitudHoraExtra.setEnabled(this.solicitudhoraextraConstantesFunciones.activarid_estructuraSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_jefeSolicitudHoraExtra.setEnabled(this.solicitudhoraextraConstantesFunciones.activarid_empleado_jefeSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra.setEnabled(this.solicitudhoraextraConstantesFunciones.activarid_estado_solicitud_nomiSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jComboBoxid_empleado_reemplazoSolicitudHoraExtra.setEnabled(this.solicitudhoraextraConstantesFunciones.activarid_empleado_reemplazoSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldsecuencialSolicitudHoraExtra.setEnabled(this.solicitudhoraextraConstantesFunciones.activarsecuencialSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jDateChooserfecha_solicitaSolicitudHoraExtra.setEnabled(this.solicitudhoraextraConstantesFunciones.activarfecha_solicitaSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jDateChooserfecha_ejecutaSolicitudHoraExtra.setEnabled(this.solicitudhoraextraConstantesFunciones.activarfecha_ejecutaSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldnumero_horasSolicitudHoraExtra.setEnabled(this.solicitudhoraextraConstantesFunciones.activarnumero_horasSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldcosto_unitarioSolicitudHoraExtra.setEnabled(this.solicitudhoraextraConstantesFunciones.activarcosto_unitarioSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextFieldcosto_totalSolicitudHoraExtra.setEnabled(this.solicitudhoraextraConstantesFunciones.activarcosto_totalSolicitudHoraExtra);
		this.jInternalFrameDetalleFormSolicitudHoraExtra.jTextAreadescripcionSolicitudHoraExtra.setEnabled(this.solicitudhoraextraConstantesFunciones.activardescripcionSolicitudHoraExtra);
		}
	}
	
		
}