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

import com.bydan.erp.nomina.util.EstadoEmpleadoConstantesFunciones;
import com.bydan.erp.nomina.util.EstadoEmpleadoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.EstadoEmpleadoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.EstadoEmpleadoBean;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






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
public class EstadoEmpleadoBeanSwingJInternalFrame extends EstadoEmpleadoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoEmpleadoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoEmpleado> estadoempleadoValidator = new ClassValidator<EstadoEmpleado>(EstadoEmpleado.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoEmpleado estadoempleado;	
	public EstadoEmpleado estadoempleadoAux;
	public EstadoEmpleado estadoempleadoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoEmpleado estadoempleadoTotales;
	public Long idEstadoEmpleadoActual;
	public Long iIdNuevoEstadoEmpleado=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosEmpleado=false;

	public Boolean getIsTienePermisosEmpleado() {
		return isTienePermisosEmpleado;
	}

	public void setIsTienePermisosEmpleado(Boolean isTienePermisosEmpleado) {
		this.isTienePermisosEmpleado= isTienePermisosEmpleado;
	}


	public Boolean isTienePermisosCierreRolMensual=false;

	public Boolean getIsTienePermisosCierreRolMensual() {
		return isTienePermisosCierreRolMensual;
	}

	public void setIsTienePermisosCierreRolMensual(Boolean isTienePermisosCierreRolMensual) {
		this.isTienePermisosCierreRolMensual= isTienePermisosCierreRolMensual;
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
	
	public Boolean isPermisoTodoEstadoEmpleado;
	public Boolean isPermisoNuevoEstadoEmpleado;
	public Boolean isPermisoActualizarEstadoEmpleado;
	public Boolean isPermisoActualizarOriginalEstadoEmpleado;
	public Boolean isPermisoEliminarEstadoEmpleado;
	public Boolean isPermisoGuardarCambiosEstadoEmpleado;
	public Boolean isPermisoConsultaEstadoEmpleado;
	public Boolean isPermisoBusquedaEstadoEmpleado;
	public Boolean isPermisoReporteEstadoEmpleado;
	public Boolean isPermisoPaginacionMedioEstadoEmpleado;
	public Boolean isPermisoPaginacionAltoEstadoEmpleado;
	public Boolean isPermisoPaginacionTodoEstadoEmpleado;
	public Boolean isPermisoCopiarEstadoEmpleado;
	public Boolean isPermisoVerFormEstadoEmpleado;
	public Boolean isPermisoDuplicarEstadoEmpleado;
	public Boolean isPermisoOrdenEstadoEmpleado;
	
	
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
	
	public EstadoEmpleadoParameterReturnGeneral estadoempleadoReturnGeneral;
	public EstadoEmpleadoParameterReturnGeneral estadoempleadoParameterGeneral;
	
	

	public EmpleadoLogic empleadoLogic=null;

	public EmpleadoLogic getEmpleadoLogic() {
		return empleadoLogic;
	}

	public void setEmpleadoLogic(EmpleadoLogic empleadoLogic) {
		this.empleadoLogic = empleadoLogic;
	}


	public CierreRolMensualLogic cierrerolmensualLogic=null;

	public CierreRolMensualLogic getCierreRolMensualLogic() {
		return cierrerolmensualLogic;
	}

	public void setCierreRolMensualLogic(CierreRolMensualLogic cierrerolmensualLogic) {
		this.cierrerolmensualLogic = cierrerolmensualLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoEmpleado=false;
	public Boolean esParaAccionDesdeFormularioEstadoEmpleado=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadoEmpleadoSessionBeanAdditional estadoempleadoSessionBeanAdditional=null;
	
	public EstadoEmpleadoSessionBeanAdditional getEstadoEmpleadoSessionBeanAdditional() {
		return this.estadoempleadoSessionBeanAdditional;
	}
	
	public void setEstadoEmpleadoSessionBeanAdditional(EstadoEmpleadoSessionBeanAdditional estadoempleadoSessionBeanAdditional) {
		try {
			this.estadoempleadoSessionBeanAdditional=estadoempleadoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadoEmpleadoBeanSwingJInternalFrameAdditional estadoempleadoBeanSwingJInternalFrameAdditional=null;
	//public class EstadoEmpleadoBeanSwingJInternalFrame
	
	public EstadoEmpleadoBeanSwingJInternalFrameAdditional getEstadoEmpleadoBeanSwingJInternalFrameAdditional() {
		return this.estadoempleadoBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadoEmpleadoBeanSwingJInternalFrameAdditional(EstadoEmpleadoBeanSwingJInternalFrameAdditional estadoempleadoBeanSwingJInternalFrameAdditional) {
		try {
			this.estadoempleadoBeanSwingJInternalFrameAdditional=estadoempleadoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoEmpleadoLogic estadoempleadoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoEmpleado estadoempleadoBean;
	public EstadoEmpleadoConstantesFunciones estadoempleadoConstantesFunciones;
	//public EstadoEmpleadoParameterReturnGeneral estadoempleadoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoEmpleado> estadoempleados;	
	//public List<EstadoEmpleado> estadoempleadosEliminados;
	//public List<EstadoEmpleado> estadoempleadosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoEmpleado=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoEmpleado=true;
	public Boolean isVisibilidadCeldaCopiarEstadoEmpleado=true;
	public Boolean isVisibilidadCeldaVerFormEstadoEmpleado=true;
	public Boolean isVisibilidadCeldaOrdenEstadoEmpleado=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoEmpleado=false;
	public Boolean isVisibilidadCeldaModificarEstadoEmpleado=false;
	public Boolean isVisibilidadCeldaActualizarEstadoEmpleado=false;
	public Boolean isVisibilidadCeldaEliminarEstadoEmpleado=false;
	public Boolean isVisibilidadCeldaCancelarEstadoEmpleado=false;
	public Boolean isVisibilidadCeldaGuardarEstadoEmpleado=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoEmpleado=false;	
	
	
	
	public Long getiIdNuevoEstadoEmpleado() {
		return this.iIdNuevoEstadoEmpleado;
	}

	public void setiIdNuevoEstadoEmpleado(Long iIdNuevoEstadoEmpleado) {
		this.iIdNuevoEstadoEmpleado = iIdNuevoEstadoEmpleado;
	}
	
	public Long getidEstadoEmpleadoActual() {
		return this.idEstadoEmpleadoActual;
	}

	public void setidEstadoEmpleadoActual(Long idEstadoEmpleadoActual) {
		this.idEstadoEmpleadoActual = idEstadoEmpleadoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoEmpleado getestadoempleado() {
		return this.estadoempleado;
	}

	public void setestadoempleado(EstadoEmpleado estadoempleado) {
		this.estadoempleado = estadoempleado;
	}
	
	public EstadoEmpleado getestadoempleadoAux() {
		return this.estadoempleadoAux;
	}

	public void setestadoempleadoAux(EstadoEmpleado estadoempleadoAux) {
		this.estadoempleadoAux = estadoempleadoAux;
	}				
	
	public EstadoEmpleado getestadoempleadoAnterior() {
		return this.estadoempleadoAnterior;
	}

	public void setestadoempleadoAnterior(EstadoEmpleado estadoempleadoAnterior) {
		this.estadoempleadoAnterior = estadoempleadoAnterior;
	}	
	
	public EstadoEmpleado getestadoempleadoTotales() {
		return this.estadoempleadoTotales;
	}

	public void setestadoempleadoTotales(EstadoEmpleado estadoempleadoTotales) {
		this.estadoempleadoTotales = estadoempleadoTotales;
	}	
	
	public EstadoEmpleado getestadoempleadoBean() {
		return this.estadoempleadoBean;
	}

	public void setestadoempleadoBean(EstadoEmpleado estadoempleadoBean) {
		this.estadoempleadoBean = estadoempleadoBean;
	}	
	
	public EstadoEmpleadoParameterReturnGeneral getestadoempleadoReturnGeneral() {
		return this.estadoempleadoReturnGeneral;
	}

	public void setestadoempleadoReturnGeneral(EstadoEmpleadoParameterReturnGeneral estadoempleadoReturnGeneral) {
		this.estadoempleadoReturnGeneral = estadoempleadoReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoEmpleadoLogic getEstadoEmpleadoLogic()	{		
		return estadoempleadoLogic;
	}

	public void setEstadoEmpleadoLogic(EstadoEmpleadoLogic estadoempleadoLogic) {
		this.estadoempleadoLogic = estadoempleadoLogic;
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
	
	public Boolean getIsEsNuevoEstadoEmpleado() {
		return isEsNuevoEstadoEmpleado;
	}

	public void setIsEsNuevoEstadoEmpleado(Boolean isEsNuevoEstadoEmpleado) {
		this.isEsNuevoEstadoEmpleado = isEsNuevoEstadoEmpleado;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoEmpleado() {
		return esParaAccionDesdeFormularioEstadoEmpleado;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoEmpleado(Boolean esParaAccionDesdeFormularioEstadoEmpleado) {
		this.esParaAccionDesdeFormularioEstadoEmpleado = esParaAccionDesdeFormularioEstadoEmpleado;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoEmpleado() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoEmpleadoConstantesFunciones.refrescarForeignKeysDescripcionesEstadoEmpleado(this.estadoempleadoLogic.getEstadoEmpleados());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoEmpleadoConstantesFunciones.refrescarForeignKeysDescripcionesEstadoEmpleado(this.estadoempleados);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadoempleadoLogic.setEstadoEmpleados(this.estadoempleados);
			estadoempleadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoEmpleadoParameterReturnGeneral getEstadoEmpleadoParameterGeneral() {
		return this.estadoempleadoParameterGeneral;
	}
	
	public void setEstadoEmpleadoParameterGeneral(EstadoEmpleadoParameterReturnGeneral estadoempleadoParameterGeneral) {
		this.estadoempleadoParameterGeneral = estadoempleadoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoEmpleado() {
		return isPermisoTodoEstadoEmpleado;
	}

	public void setIsPermisoTodoEstadoEmpleado(Boolean isPermisoTodoEstadoEmpleado) {
		this.isPermisoTodoEstadoEmpleado = isPermisoTodoEstadoEmpleado;
	}

	public Boolean getIsPermisoNuevoEstadoEmpleado() {
		return isPermisoNuevoEstadoEmpleado;
	}

	public void setIsPermisoNuevoEstadoEmpleado(Boolean isPermisoNuevoEstadoEmpleado) {
		this.isPermisoNuevoEstadoEmpleado = isPermisoNuevoEstadoEmpleado;
	}

	public Boolean getIsPermisoActualizarEstadoEmpleado() {
		return isPermisoActualizarEstadoEmpleado;
	}

	public void setIsPermisoActualizarEstadoEmpleado(Boolean isPermisoActualizarEstadoEmpleado) {
		this.isPermisoActualizarEstadoEmpleado = isPermisoActualizarEstadoEmpleado;
	}

	public Boolean getIsPermisoEliminarEstadoEmpleado() {
		return isPermisoEliminarEstadoEmpleado;
	}

	public void setIsPermisoEliminarEstadoEmpleado(Boolean isPermisoEliminarEstadoEmpleado) {
		this.isPermisoEliminarEstadoEmpleado = isPermisoEliminarEstadoEmpleado;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoEmpleado() {
		return isPermisoGuardarCambiosEstadoEmpleado;
	}

	public void setIsPermisoGuardarCambiosEstadoEmpleado(Boolean isPermisoGuardarCambiosEstadoEmpleado) {
		this.isPermisoGuardarCambiosEstadoEmpleado = isPermisoGuardarCambiosEstadoEmpleado;
	}
	
	public Boolean getIsPermisoConsultaEstadoEmpleado() {
		return isPermisoConsultaEstadoEmpleado;
	}

	public void setIsPermisoConsultaEstadoEmpleado(Boolean isPermisoConsultaEstadoEmpleado) {
		this.isPermisoConsultaEstadoEmpleado = isPermisoConsultaEstadoEmpleado;
	}

	public Boolean getIsPermisoBusquedaEstadoEmpleado() {
		return isPermisoBusquedaEstadoEmpleado;
	}

	public void setIsPermisoBusquedaEstadoEmpleado(Boolean isPermisoBusquedaEstadoEmpleado) {
		this.isPermisoBusquedaEstadoEmpleado = isPermisoBusquedaEstadoEmpleado;
	}

	public Boolean getIsPermisoReporteEstadoEmpleado() {
		return isPermisoReporteEstadoEmpleado;
	}

	public void setIsPermisoReporteEstadoEmpleado(Boolean isPermisoReporteEstadoEmpleado) {
		this.isPermisoReporteEstadoEmpleado = isPermisoReporteEstadoEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoEmpleado() {
		return isPermisoPaginacionMedioEstadoEmpleado;
	}

	public void setIsPermisoPaginacionMedioEstadoEmpleado(Boolean isPermisoPaginacionMedioEstadoEmpleado) {
		this.isPermisoPaginacionMedioEstadoEmpleado = isPermisoPaginacionMedioEstadoEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoEmpleado() {
		return isPermisoPaginacionTodoEstadoEmpleado;
	}

	public void setIsPermisoPaginacionTodoEstadoEmpleado(Boolean isPermisoPaginacionTodoEstadoEmpleado) {
		this.isPermisoPaginacionTodoEstadoEmpleado = isPermisoPaginacionTodoEstadoEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoEmpleado() {
		return isPermisoPaginacionAltoEstadoEmpleado;
	}

	public void setIsPermisoPaginacionAltoEstadoEmpleado(Boolean isPermisoPaginacionAltoEstadoEmpleado) {
		this.isPermisoPaginacionAltoEstadoEmpleado = isPermisoPaginacionAltoEstadoEmpleado;
	}
	
	public Boolean getIsPermisoCopiarEstadoEmpleado() {
		return isPermisoCopiarEstadoEmpleado;
	}

	public void setIsPermisoCopiarEstadoEmpleado(Boolean isPermisoCopiarEstadoEmpleado) {
		this.isPermisoCopiarEstadoEmpleado = isPermisoCopiarEstadoEmpleado;
	}
	
	public Boolean getIsPermisoVerFormEstadoEmpleado() {
		return isPermisoVerFormEstadoEmpleado;
	}

	public void setIsPermisoVerFormEstadoEmpleado(Boolean isPermisoVerFormEstadoEmpleado) {
		this.isPermisoVerFormEstadoEmpleado = isPermisoVerFormEstadoEmpleado;
	}
	
	public Boolean getIsPermisoDuplicarEstadoEmpleado() {
		return isPermisoDuplicarEstadoEmpleado;
	}

	public void setIsPermisoDuplicarEstadoEmpleado(Boolean isPermisoDuplicarEstadoEmpleado) {
		this.isPermisoDuplicarEstadoEmpleado = isPermisoDuplicarEstadoEmpleado;
	}
	
	public Boolean getIsPermisoOrdenEstadoEmpleado() {
		return isPermisoOrdenEstadoEmpleado;
	}

	public void setIsPermisoOrdenEstadoEmpleado(Boolean isPermisoOrdenEstadoEmpleado) {
		this.isPermisoOrdenEstadoEmpleado = isPermisoOrdenEstadoEmpleado;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoEmpleado() {
		return isVisibilidadCeldaNuevoEstadoEmpleado;
	}

	public void setIsVisibilidadCeldaNuevoEstadoEmpleado(Boolean isVisibilidadCeldaNuevoEstadoEmpleado) {
		this.isVisibilidadCeldaNuevoEstadoEmpleado = isVisibilidadCeldaNuevoEstadoEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoEmpleado() {
		return isVisibilidadCeldaDuplicarEstadoEmpleado;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoEmpleado(Boolean isVisibilidadCeldaDuplicarEstadoEmpleado) {
		this.isVisibilidadCeldaDuplicarEstadoEmpleado = isVisibilidadCeldaDuplicarEstadoEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoEmpleado() {
		return isVisibilidadCeldaCopiarEstadoEmpleado;
	}

	public void setIsVisibilidadCeldaCopiarEstadoEmpleado(Boolean isVisibilidadCeldaCopiarEstadoEmpleado) {
		this.isVisibilidadCeldaCopiarEstadoEmpleado = isVisibilidadCeldaCopiarEstadoEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoEmpleado() {
		return isVisibilidadCeldaVerFormEstadoEmpleado;
	}

	public void setIsVisibilidadCeldaVerFormEstadoEmpleado(Boolean isVisibilidadCeldaVerFormEstadoEmpleado) {
		this.isVisibilidadCeldaVerFormEstadoEmpleado = isVisibilidadCeldaVerFormEstadoEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoEmpleado() {
		return isVisibilidadCeldaOrdenEstadoEmpleado;
	}

	public void setIsVisibilidadCeldaOrdenEstadoEmpleado(Boolean isVisibilidadCeldaOrdenEstadoEmpleado) {
		this.isVisibilidadCeldaOrdenEstadoEmpleado = isVisibilidadCeldaOrdenEstadoEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoEmpleado() {
		return isVisibilidadCeldaNuevoRelacionesEstadoEmpleado;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoEmpleado(Boolean isVisibilidadCeldaNuevoRelacionesEstadoEmpleado) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoEmpleado = isVisibilidadCeldaNuevoRelacionesEstadoEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoEmpleado() {
		return isVisibilidadCeldaModificarEstadoEmpleado;
	}

	public void setIsVisibilidadCeldaModificarEstadoEmpleado(Boolean isVisibilidadCeldaModificarEstadoEmpleado) {
		this.isVisibilidadCeldaModificarEstadoEmpleado = isVisibilidadCeldaModificarEstadoEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoEmpleado() {
		return isVisibilidadCeldaActualizarEstadoEmpleado;
	}

	public void setIsVisibilidadCeldaActualizarEstadoEmpleado(Boolean isVisibilidadCeldaActualizarEstadoEmpleado) {
		this.isVisibilidadCeldaActualizarEstadoEmpleado = isVisibilidadCeldaActualizarEstadoEmpleado;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoEmpleado() {
		return isVisibilidadCeldaEliminarEstadoEmpleado;
	}

	public void setIsVisibilidadCeldaEliminarEstadoEmpleado(Boolean isVisibilidadCeldaEliminarEstadoEmpleado) {
		this.isVisibilidadCeldaEliminarEstadoEmpleado = isVisibilidadCeldaEliminarEstadoEmpleado;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoEmpleado() {
		return isVisibilidadCeldaCancelarEstadoEmpleado;
	}

	public void setIsVisibilidadCeldaCancelarEstadoEmpleado(Boolean isVisibilidadCeldaCancelarEstadoEmpleado) {
		this.isVisibilidadCeldaCancelarEstadoEmpleado = isVisibilidadCeldaCancelarEstadoEmpleado;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoEmpleado() {
		return isVisibilidadCeldaGuardarEstadoEmpleado;
	}

	public void setIsVisibilidadCeldaGuardarEstadoEmpleado(Boolean isVisibilidadCeldaGuardarEstadoEmpleado) {
		this.isVisibilidadCeldaGuardarEstadoEmpleado = isVisibilidadCeldaGuardarEstadoEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoEmpleado() {
		return isVisibilidadCeldaGuardarCambiosEstadoEmpleado;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoEmpleado(Boolean isVisibilidadCeldaGuardarCambiosEstadoEmpleado) {
		this.isVisibilidadCeldaGuardarCambiosEstadoEmpleado = isVisibilidadCeldaGuardarCambiosEstadoEmpleado;
	}
		
	public EstadoEmpleadoSessionBean getestadoempleadoSessionBean() {
		return this.estadoempleadoSessionBean;
	}
	
	public void setestadoempleadoSessionBean(EstadoEmpleadoSessionBean estadoempleadoSessionBean) {
		this.estadoempleadoSessionBean=estadoempleadoSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoEmpleado(EstadoEmpleado estadoempleado)throws Exception {
		try {
			
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
	
	public void bugActualizarReferenciaActual(EstadoEmpleado estadoempleado,EstadoEmpleado estadoempleadoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoEmpleado(estadoempleado);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadoempleadoAux.setId(estadoempleado.getId());
		estadoempleadoAux.setVersionRow(estadoempleado.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoEmpleado();
		
			int intSelectedRow = this.jTableDatosEstadoEmpleado.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleado =(EstadoEmpleado) this.estadoempleadoLogic.getEstadoEmpleados().toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadoempleado =(EstadoEmpleado) this.estadoempleados.toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoEmpleado(this.estadoempleado,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoEmpleado(this.estadoempleado);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadoempleadoValidator.getInvalidValues(this.estadoempleado);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadoempleadoLogic.setDatosCliente(datosCliente);
			estadoempleadoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadoempleadoAux=new  EstadoEmpleado();
				
				estadoempleadoAux.setIsNew(true);
				estadoempleadoAux.setIsChanged(true);
				
				estadoempleadoAux.setEstadoEmpleadoOriginal(this.estadoempleado);
				
				estadoempleadoAux.setId(this.estadoempleado.getId());	
				estadoempleadoAux.setVersionRow(this.estadoempleado.getVersionRow());	
				estadoempleadoAux.setcodigo(this.estadoempleado.getcodigo());	
				estadoempleadoAux.setnombre(this.estadoempleado.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoempleadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoempleadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadoempleadoAux,estadoempleadoLogic.getEstadoEmpleados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoempleadoAux,estadoempleados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadoempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoempleadoLogic.saveEstadoEmpleados();//WithConnection
						//estadoempleadoLogic.getSetVersionRowEstadoEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadoempleado,estadoempleadoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados().addAll(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleadosEliminados);
							this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualLogic.getCierreRolMensuals().addAll(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleados.addAll(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleadosEliminados);
							this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensuals.addAll(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadoempleadoLogic.saveEstadoEmpleadoRelaciones(estadoempleadoAux,this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados(),this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualLogic.getCierreRolMensuals());//WithConnection
								//estadoempleadoLogic.getSetVersionRowEstadoEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadoempleado,estadoempleadoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(new ArrayList<Empleado>());
							this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualLogic.setCierreRolMensuals(new ArrayList<CierreRolMensual>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleados= new ArrayList<Empleado>();
							this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensuals= new ArrayList<CierreRolMensual>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoempleadoAux.setEmpleados(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());

							if(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoempleadoAux.setCierreRolMensuals(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualLogic.getCierreRolMensuals());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadoempleadoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadoempleadoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadoempleadoAux,estadoempleadoLogic.getEstadoEmpleados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadoempleadoAux,estadoempleados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadoempleado,estadoempleadoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadoempleadoAux=new  EstadoEmpleado();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadoempleadoSessionBean.getEsGuardarRelacionado() 
					|| (this.estadoempleadoSessionBean.getEsGuardarRelacionado() && this.estadoempleado.getId()>=0)) {
						
					estadoempleadoAux.setIsNew(false);
				}
				
				estadoempleadoAux.setIsDeleted(false);
			
				estadoempleadoAux.setId(this.estadoempleado.getId());	
				estadoempleadoAux.setVersionRow(this.estadoempleado.getVersionRow());	
				estadoempleadoAux.setcodigo(this.estadoempleado.getcodigo());	
				estadoempleadoAux.setnombre(this.estadoempleado.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoempleadoAux,estadoempleadoLogic.getEstadoEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoempleadoAux,estadoempleados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadoempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoempleadoLogic.saveEstadoEmpleados();//WithConnection
						//estadoempleadoLogic.getSetVersionRowEstadoEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadoempleado,estadoempleadoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados().addAll(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleadosEliminados);
							this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualLogic.getCierreRolMensuals().addAll(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleados.addAll(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleadosEliminados);
							this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensuals.addAll(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadoempleadoLogic.saveEstadoEmpleadoRelaciones(estadoempleadoAux,this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados(),this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualLogic.getCierreRolMensuals());//WithConnection
								//estadoempleadoLogic.getSetVersionRowEstadoEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadoempleado,estadoempleadoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(new ArrayList<Empleado>());
							this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualLogic.setCierreRolMensuals(new ArrayList<CierreRolMensual>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleados= new ArrayList<Empleado>();
							this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensuals= new ArrayList<CierreRolMensual>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoempleadoAux.setEmpleados(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());

							if(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoempleadoAux.setCierreRolMensuals(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualLogic.getCierreRolMensuals());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadoempleadoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadoempleadoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadoempleadoAux,estadoempleadoLogic.getEstadoEmpleados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadoempleadoAux,estadoempleados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadoempleado,estadoempleadoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadoempleadoAux=new  EstadoEmpleado();
				
				estadoempleadoAux.setIsNew(false);
				estadoempleadoAux.setIsChanged(false);
				
				estadoempleadoAux.setIsDeleted(true);
				
				estadoempleadoAux.setId(this.estadoempleado.getId());	
				estadoempleadoAux.setVersionRow(this.estadoempleado.getVersionRow());	
				estadoempleadoAux.setcodigo(this.estadoempleado.getcodigo());	
				estadoempleadoAux.setnombre(this.estadoempleado.getnombre());	
				
				if(this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadoempleadoAux.getId()>=0) {	
						this.estadoempleadosEliminados.add(estadoempleadoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadoempleadoAux,estadoempleadoLogic.getEstadoEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoempleadoAux,estadoempleados);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadoempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoempleadoLogic.saveEstadoEmpleados();//WithConnection
						//estadoempleadoLogic.getSetVersionRowEstadoEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados().addAll(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleadosEliminados);
							this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualLogic.getCierreRolMensuals().addAll(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleados.addAll(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleadosEliminados);
							this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensuals.addAll(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadoempleadoLogic.saveEstadoEmpleadoRelaciones(estadoempleadoAux,this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados(),this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualLogic.getCierreRolMensuals());//WithConnection
								//estadoempleadoLogic.getSetVersionRowEstadoEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(new ArrayList<Empleado>());
							this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualLogic.setCierreRolMensuals(new ArrayList<CierreRolMensual>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleados= new ArrayList<Empleado>();
							this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensuals= new ArrayList<CierreRolMensual>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoempleadoAux.setEmpleados(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());

							if(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoempleadoAux.setCierreRolMensuals(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualLogic.getCierreRolMensuals());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadoempleadoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadoempleadoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadoempleadoAux,estadoempleadoLogic.getEstadoEmpleados());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadoempleadoAux,estadoempleados);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleadoLogic.getEstadoEmpleados().addAll(this.estadoempleadosEliminados);
					
					estadoempleadoLogic.saveEstadoEmpleados();//WithConnection
					//estadoempleadoLogic.getSetVersionRowEstadoEmpleados();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadoempleadosEliminados= new ArrayList<EstadoEmpleado>();		
			}
			
			if(this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Empleado GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Empleado",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadoempleado=estadoempleadoAux;
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
      		//this.finishProcessEstadoEmpleado();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoEmpleado estadoempleadoLocal) throws Exception {
		
		if(this.estadoempleadoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadoempleadoLocal.setEmpleados(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());
				estadoempleadoLocal.setCierreRolMensuals(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualLogic.getCierreRolMensuals());
			
			} else {
			
				estadoempleadoLocal.setEmpleados(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleados);
				estadoempleadoLocal.setCierreRolMensuals(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensuals);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoEmpleado estadoempleadoLocal) throws Exception {	
		if(this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoEmpleadoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoEmpleado.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoempleado =(EstadoEmpleado) this.estadoempleadoLogic.getEstadoEmpleados().toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadoempleado =(EstadoEmpleado) this.estadoempleados.toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadoempleadoValidator.getInvalidValues(this.estadoempleado);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoEmpleado estadoempleado,List<EstadoEmpleado> estadoempleados) throws Exception {
		try	{		
			EstadoEmpleadoConstantesFunciones.actualizarLista(estadoempleado,estadoempleados,this.estadoempleadoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoEmpleado estadoempleado,List<EstadoEmpleado> estadoempleados) throws Exception {
		try	{			
			EstadoEmpleadoConstantesFunciones.actualizarSelectedLista(estadoempleado,estadoempleados);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoEmpleado> estadoempleadosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadoempleadosLocal=this.estadoempleadoLogic.getEstadoEmpleados();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadoempleadosLocal=this.estadoempleados;
			}
			//ARCHITECTURE
		
			for(EstadoEmpleado estadoempleadoLocal:estadoempleadosLocal) {
				if(this.permiteMantenimiento(estadoempleadoLocal) && estadoempleadoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoEmpleadoConstantesFunciones.getEstadoEmpleadoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoEmpleadoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoEmpleado.jLabelcodigoEstadoEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoEmpleadoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoEmpleado.jLabelnombreEstadoEmpleado,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoEmpleado.jLabelcodigoEstadoEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoEmpleado.jLabelnombreEstadoEmpleado,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Empleado")) {
			if(this.estadoempleado==null) {
				this.estadoempleado= new EstadoEmpleado();
			}

			if(this.estadoempleadoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoEmpleado
				this.setVariablesFormularioToObjetoActualEstadoEmpleado(this.estadoempleado,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoEmpleado(this.estadoempleado);

				this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.getempleado().setEstadoEmpleado(this.estadoempleado);
			}

			return;
		}
		 else  if(sTipo.equals("CierreRolMensual")) {
			if(this.estadoempleado==null) {
				this.estadoempleado= new EstadoEmpleado();
			}

			if(this.estadoempleadoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoEmpleado
				this.setVariablesFormularioToObjetoActualEstadoEmpleado(this.estadoempleado,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoEmpleado(this.estadoempleado);

				this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.getcierrerolmensual().setEstadoEmpleado(this.estadoempleado);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoEmpleado--;	
		
		
		this.estadoempleadoAux=new EstadoEmpleado();
		
		this.estadoempleadoAux.setId(this.iIdNuevoEstadoEmpleado);
		this.estadoempleadoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoempleadoLogic.getEstadoEmpleados().add(this.estadoempleadoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadoempleados.add(this.estadoempleadoAux);
		}
		//ARCHITECTURE
		
		this.estadoempleado=this.estadoempleadoAux;
		
		if(EstadoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoEmpleado(this.estadoempleado);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoEmpleado(this.estadoempleado);
		}
				
		//this.setDefaultControlesEstadoEmpleado();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoEmpleado();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoEmpleado();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoEmpleado();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoEmpleado(this.estadoempleadoBean,this.estadoempleado,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoEmpleado(this.estadoempleado);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadoempleadoSessionBean.getConGuardarRelaciones()) {
			classes=EstadoEmpleadoConstantesFunciones.getClassesRelationshipsOfEstadoEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadoempleadoReturnGeneral=estadoempleadoLogic.procesarEventosEstadoEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoempleadoLogic.getEstadoEmpleados(),this.estadoempleado,this.estadoempleadoParameterGeneral,this.isEsNuevoEstadoEmpleado,classes);//this.estadoempleadoLogic.getEstadoEmpleado()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoEmpleado(this.estadoempleadoReturnGeneral,this.estadoempleadoBean,false);
		
		if(this.estadoempleadoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoEmpleado(this.estadoempleadoReturnGeneral.getEstadoEmpleado());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoEmpleado(this.estadoempleadoReturnGeneral.getEstadoEmpleado());
		}
		
		if(this.estadoempleadoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoEmpleado(this.estadoempleadoReturnGeneral.getEstadoEmpleado(),classes);//this.estadoempleadoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoEmpleado(this.estadoempleado,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoEmpleado();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoEmpleado();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoEmpleadoBeanSwingJInternalFrameAdditional.RecargarFormEstadoEmpleado(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoEmpleado(false);
						
			if(estadoempleadoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado() && EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualSessionBean.getEsGuardarRelacionado() && CierreRolMensualJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCierreRolMensualActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoEmpleado();
			}
			
			this.actualizarVisualTableDatosEstadoEmpleado();
			
			this.jTableDatosEstadoEmpleado.setRowSelectionInterval(this.getIndiceNuevoEstadoEmpleado(), this.getIndiceNuevoEstadoEmpleado());
			
			this.seleccionarFilaTablaEstadoEmpleadoActual();
						
			this.actualizarEstadoCeldasBotonesEstadoEmpleado("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoEmpleado(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoEmpleado.jTextFieldcodigoEstadoEmpleado.setEnabled(isHabilitar && this.estadoempleadoConstantesFunciones.activarcodigoEstadoEmpleado);
		this.jInternalFrameDetalleFormEstadoEmpleado.jTextAreanombreEstadoEmpleado.setEnabled(isHabilitar && this.estadoempleadoConstantesFunciones.activarnombreEstadoEmpleado);	
		
	};
	
	public void setDefaultControlesEstadoEmpleado() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoEmpleado(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadoempleadoSessionBean.setConGuardarRelaciones(true);			
			this.estadoempleadoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoEmpleado.jTabbedPaneRelacionesEstadoEmpleado.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadoempleadoSessionBean.setConGuardarRelaciones(false);			
			this.estadoempleadoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoEmpleado.jTabbedPaneRelacionesEstadoEmpleado.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoEmpleado() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoEmpleado estadoempleadoAux:this.estadoempleadoLogic.getEstadoEmpleados()) {
				if(estadoempleadoAux.getId().equals(this.iIdNuevoEstadoEmpleado)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoEmpleado estadoempleadoAux:this.estadoempleados) {
				if(estadoempleadoAux.getId().equals(this.iIdNuevoEstadoEmpleado)) {
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
	
	public int getIndiceActualEstadoEmpleado(EstadoEmpleado estadoempleado,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoEmpleado estadoempleadoAux:this.estadoempleadoLogic.getEstadoEmpleados()) {
				if(estadoempleadoAux.getId().equals(estadoempleado.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoEmpleado estadoempleadoAux:this.estadoempleados) {
				if(estadoempleadoAux.getId().equals(estadoempleado.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoEmpleado(EstadoEmpleado estadoempleadoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoEmpleado estadoempleadoAux:this.estadoempleadoLogic.getEstadoEmpleados()) {
				if(estadoempleadoAux.getEstadoEmpleadoOriginal().getId().equals(estadoempleadoOriginal.getId())) {
					existe=true;
					estadoempleadoOriginal.setId(estadoempleadoAux.getId());
					estadoempleadoOriginal.setVersionRow(estadoempleadoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoEmpleado estadoempleadoAux:this.estadoempleados) {
				if(estadoempleadoAux.getEstadoEmpleadoOriginal().getId().equals(estadoempleadoOriginal.getId())) {
					existe=true;
					estadoempleadoOriginal.setId(estadoempleadoAux.getId());
					estadoempleadoOriginal.setVersionRow(estadoempleadoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoEmpleado(Boolean esParaCancelar) throws Exception {
		estadoempleadosAux=new ArrayList<EstadoEmpleado>();
		estadoempleadoAux=new EstadoEmpleado();
		
		if(!this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoEmpleado estadoempleadoAux:this.estadoempleadoLogic.getEstadoEmpleados()) {
					if(estadoempleadoAux.getId()<0) {
						estadoempleadosAux.add(estadoempleadoAux);
					}		
				}
				this.iIdNuevoEstadoEmpleado=0L;
				this.estadoempleadoLogic.getEstadoEmpleados().removeAll(estadoempleadosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoEmpleado estadoempleadoAux:this.estadoempleados) {
					if(estadoempleadoAux.getId()<0) {
						estadoempleadosAux.add(estadoempleadoAux);
					}		
				}
				this.iIdNuevoEstadoEmpleado=0L;
				this.estadoempleados.removeAll(estadoempleadosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoEmpleado 
					&& this.estadoempleadoLogic.getEstadoEmpleados().size()>0
					) {
					estadoempleadoAux=this.estadoempleadoLogic.getEstadoEmpleados().get(this.estadoempleadoLogic.getEstadoEmpleados().size() - 1);
				
					if(estadoempleadoAux.getId()<0) {
						this.estadoempleadoLogic.getEstadoEmpleados().remove(estadoempleadoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoEmpleado && this.estadoempleados.size()>0) {
					estadoempleadoAux=this.estadoempleados.get(this.estadoempleados.size() - 1);
				
					if(estadoempleadoAux.getId()<0) {
						this.estadoempleados.remove(estadoempleadoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoEmpleado(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadoempleado.getId()<0) {
				this.estadoempleadoLogic.getEstadoEmpleados().remove(this.estadoempleado);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadoempleado.getId()<0) {
				this.estadoempleados.remove(this.estadoempleado);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoEmpleado(List<EstadoEmpleado> estadoempleadosAux) throws Exception {
		EstadoEmpleadoConstantesFunciones.setEstadosInicialesEstadoEmpleado(estadoempleadosAux);
	}
	
	public void setEstadosInicialesEstadoEmpleado(EstadoEmpleado estadoempleadoAux) throws Exception {
		EstadoEmpleadoConstantesFunciones.setEstadosInicialesEstadoEmpleado(estadoempleadoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoEmpleadoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoEmpleadoActual()) {
				if(!this.isEsNuevoEstadoEmpleado) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoEmpleado=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoEmpleadoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Empleado ?", "MANTENIMIENTO DE Estado Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoEmpleado estadoempleado) throws Exception {
		EstadoEmpleadoConstantesFunciones.seleccionarAsignar(this.estadoempleado,estadoempleado);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoEmpleado=this.isPermisoActualizarOriginalEstadoEmpleado;
			
			
			this.seleccionarAsignar(estadoempleado);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoEmpleadoConstantesFunciones.quitarEspaciosEstadoEmpleado(this.estadoempleado,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadoempleadoSessionBean.setsFuncionBusquedaRapida(this.estadoempleadoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoEmpleado) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoEmpleado(esParaCancelar);				
				this.cancelarNuevoEstadoEmpleado(esParaCancelar);								
			}
			
			this.estadoempleado=new EstadoEmpleado();
			
			this.inicializarEstadoEmpleado();
			
			this.actualizarEstadoCeldasBotonesEstadoEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoEmpleado() throws Exception {
		try {
			EstadoEmpleadoConstantesFunciones.inicializarEstadoEmpleado(this.estadoempleado);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadoempleadoLogic.getEstadoEmpleados().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoEmpleados(String sAccionBusqueda,List<EstadoEmpleado> estadoempleadosParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoEmpleado"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoEmpleadoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoEmpleadoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoEmpleado"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Empleados");		
		parameters.put("busquedapor", EstadoEmpleadoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Empleado.class));
			classes.add(new Classe(CierreRolMensual.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoEmpleadoLogic estadoempleadoLogicAuxiliar=new EstadoEmpleadoLogic();
					estadoempleadoLogicAuxiliar.setDatosCliente(estadoempleadoLogic.getDatosCliente());				
					estadoempleadoLogicAuxiliar.setEstadoEmpleados(estadoempleadosParaReportes);
					
					estadoempleadoLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoEmpleadoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadoempleadosParaReportes=estadoempleadoLogicAuxiliar.getEstadoEmpleados();
					
					//estadoempleadoLogic.getNewConnexionToDeep();
					
					//for (EstadoEmpleado estadoempleado:estadoempleadosParaReportes) {
					//	estadoempleadoLogic.deepLoad(estadoempleado, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadoempleadoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadoempleadoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileEmpleado = AuxiliarReportes.class.getResourceAsStream("EmpleadoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_empleado", reportFileEmpleado);

			InputStream reportFileCierreRolMensual = AuxiliarReportes.class.getResourceAsStream("CierreRolMensualDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cierrerolmensual", reportFileCierreRolMensual);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoEmpleado=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoEmpleado=new JRBeanArrayDataSource(EstadoEmpleadoJInternalFrame.TraerEstadoEmpleadoBeans(estadoempleadosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoEmpleado);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoEmpleadoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoEmpleadoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoEmpleadoBean.TraerEstadoEmpleadoBeans(estadoempleadosParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoEmpleados(sAccionBusqueda,sTipoArchivoReporte,estadoempleadosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoEmpleados(sAccionBusqueda,sTipoArchivoReporte,estadoempleadosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoEmpleadoActionPerformed(null);
					//this.generarExcelReporteEstadoEmpleados(sAccionBusqueda,sTipoArchivoReporte,estadoempleadosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoEmpleados(sAccionBusqueda,sTipoArchivoReporte,estadoempleadosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoEmpleados(sAccionBusqueda,sTipoArchivoReporte,estadoempleadosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoEmpleados(sAccionBusqueda,sTipoArchivoReporte,estadoempleadosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoEmpleado> estadoempleadosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoempleado";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoEmpleados");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoEmpleado("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoEmpleado estadoempleado : estadoempleadosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoEmpleadoConstantesFunciones.generarExcelReporteDataEstadoEmpleado("NORMAL",row,workbook,estadoempleado,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoEmpleado(String sTipo,Row row,Workbook workbook) {
		
		EstadoEmpleadoConstantesFunciones.generarExcelReporteHeaderEstadoEmpleado(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoEmpleado> estadoempleadosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoempleado_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoEmpleados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoEmpleado estadoempleado : estadoempleadosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoEmpleadoConstantesFunciones.getEstadoEmpleadoDescripcion(estadoempleado));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoEmpleadoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoEmpleadoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoempleado.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoEmpleadoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoEmpleadoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoempleado.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoEmpleado> estadoempleadosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoEmpleado> estadoempleadosRespaldo=null;
		
		classes=EstadoEmpleadoConstantesFunciones.getClassesRelationshipsOfEstadoEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadoempleadoLogic.setDatosCliente(this.datosCliente);
		this.estadoempleadoLogic.setDatosDeep(this.datosDeep);
		this.estadoempleadoLogic.setIsConDeep(true);
		
		estadoempleadosRespaldo=this.estadoempleadoLogic.getEstadoEmpleados();
		
		this.estadoempleadoLogic.setEstadoEmpleados(estadoempleadosParaReportes);	
		this.estadoempleadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadoempleadosParaReportes=this.estadoempleadoLogic.getEstadoEmpleados();
		this.estadoempleadoLogic.setEstadoEmpleados(estadoempleadosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoempleado_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoEmpleados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoEmpleado("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoEmpleado estadoempleado : estadoempleadosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoEmpleado("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoEmpleadoConstantesFunciones.generarExcelReporteDataEstadoEmpleado("NORMAL",row,workbook,estadoempleado,cellStyleDataAux);
		
			
			


				//Empleado
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(EmpleadoConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadoempleado.getEmpleados()!=null && estadoempleado.getEmpleados().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(EmpleadoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					EmpleadoConstantesFunciones.generarExcelReporteHeaderEmpleado("RELACIONADO",row,workbook);
				}

				if(estadoempleado.getEmpleados()!=null) {
					i2=0;
					for(Empleado empleado : estadoempleado.getEmpleados()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						EmpleadoConstantesFunciones.generarExcelReporteDataEmpleado("RELACIONADO",row,workbook,empleado,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//CierreRolMensual
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CierreRolMensualConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadoempleado.getCierreRolMensuals()!=null && estadoempleado.getCierreRolMensuals().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CierreRolMensualConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CierreRolMensualConstantesFunciones.generarExcelReporteHeaderCierreRolMensual("RELACIONADO",row,workbook);
				}

				if(estadoempleado.getCierreRolMensuals()!=null) {
					i2=0;
					for(CierreRolMensual cierrerolmensual : estadoempleado.getCierreRolMensuals()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CierreRolMensualConstantesFunciones.generarExcelReporteDataCierreRolMensual("RELACIONADO",row,workbook,cierrerolmensual,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EstadoEmpleadoConstantesFunciones.getEstadoEmpleadoDescripcion(estadoempleado));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoEmpleado.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoEmpleado.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoEmpleado() throws Exception {		
		this.startProcessEstadoEmpleado(true);
	}
	
	public void startProcessEstadoEmpleado(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoEmpleado, this.jScrollPanelDatosEstadoEmpleado,this.jPanelPaginacionEstadoEmpleado, this.jScrollPanelDatosEdicionEstadoEmpleado, this.jPanelAccionesEstadoEmpleado,this.jPanelAccionesFormularioEstadoEmpleado,this.jmenuBarEstadoEmpleado,this.jmenuBarDetalleEstadoEmpleado,this.jTtoolBarEstadoEmpleado,this.jTtoolBarDetalleEstadoEmpleado);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoEmpleado=null; 
		
		final JPanel jPanelParametrosReportesEstadoEmpleado=this.jPanelParametrosReportesEstadoEmpleado;
		//final JScrollPane jScrollPanelDatosEstadoEmpleado=this.jScrollPanelDatosEstadoEmpleado;
		final JTable jTableDatosEstadoEmpleado=this.jTableDatosEstadoEmpleado;		
		final JPanel jPanelPaginacionEstadoEmpleado=this.jPanelPaginacionEstadoEmpleado;
		//final JScrollPane jScrollPanelDatosEdicionEstadoEmpleado=this.jScrollPanelDatosEdicionEstadoEmpleado;
		final JPanel jPanelAccionesEstadoEmpleado=this.jPanelAccionesEstadoEmpleado;
		
		JPanel jPanelCamposAuxiliarEstadoEmpleado=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoEmpleado=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) {
			jPanelCamposAuxiliarEstadoEmpleado=this.jInternalFrameDetalleFormEstadoEmpleado.jPanelCamposEstadoEmpleado;
			jPanelAccionesFormularioAuxiliarEstadoEmpleado=this.jInternalFrameDetalleFormEstadoEmpleado.jPanelAccionesFormularioEstadoEmpleado;
		}
		
		final JPanel jPanelCamposEstadoEmpleado=jPanelCamposAuxiliarEstadoEmpleado;
		final JPanel jPanelAccionesFormularioEstadoEmpleado=jPanelAccionesFormularioAuxiliarEstadoEmpleado;
		
		
		final JMenuBar jmenuBarEstadoEmpleado=this.jmenuBarEstadoEmpleado;
		final JToolBar jTtoolBarEstadoEmpleado=this.jTtoolBarEstadoEmpleado;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoEmpleado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoEmpleado=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) {
			jmenuBarDetalleAuxiliarEstadoEmpleado=this.jInternalFrameDetalleFormEstadoEmpleado.jmenuBarDetalleEstadoEmpleado;
			jTtoolBarDetalleAuxiliarEstadoEmpleado=this.jInternalFrameDetalleFormEstadoEmpleado.jTtoolBarDetalleEstadoEmpleado;
		}
		
		final JMenuBar jmenuBarDetalleEstadoEmpleado=jmenuBarDetalleAuxiliarEstadoEmpleado;
		final JToolBar jTtoolBarDetalleEstadoEmpleado=jTtoolBarDetalleAuxiliarEstadoEmpleado;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoEmpleado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoEmpleado;
			processRunnable.jTableDatos=jTableDatosEstadoEmpleado;
			processRunnable.jPanelCampos=jPanelCamposEstadoEmpleado;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoEmpleado;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoEmpleado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoEmpleado;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoEmpleado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoEmpleado;
			processRunnable.jTtoolBar=jTtoolBarEstadoEmpleado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoEmpleado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoEmpleado ,jPanelParametrosReportesEstadoEmpleado,jTableDatosEstadoEmpleado, /*jScrollPanelDatosEstadoEmpleado,*/jPanelCamposEstadoEmpleado,jPanelPaginacionEstadoEmpleado, /*jScrollPanelDatosEdicionEstadoEmpleado,*/ jPanelAccionesEstadoEmpleado,jPanelAccionesFormularioEstadoEmpleado,jmenuBarEstadoEmpleado,jmenuBarDetalleEstadoEmpleado,jTtoolBarEstadoEmpleado,jTtoolBarDetalleEstadoEmpleado);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoEmpleado, jScrollPanelDatosEstadoEmpleado,jPanelPaginacionEstadoEmpleado, jScrollPanelDatosEdicionEstadoEmpleado, jPanelAccionesEstadoEmpleado,jPanelAccionesFormularioEstadoEmpleado,jmenuBarEstadoEmpleado,jmenuBarDetalleEstadoEmpleado,jTtoolBarEstadoEmpleado,jTtoolBarDetalleEstadoEmpleado);
						
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
	
	public void finishProcessEstadoEmpleado() {// throws Exception 
		this.finishProcessEstadoEmpleado(true);
	}
	
	public void finishProcessEstadoEmpleado(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoEmpleado, this.jScrollPanelDatosEstadoEmpleado,this.jPanelPaginacionEstadoEmpleado, this.jScrollPanelDatosEdicionEstadoEmpleado, this.jPanelAccionesEstadoEmpleado,this.jPanelAccionesFormularioEstadoEmpleado,this.jmenuBarEstadoEmpleado,this.jmenuBarDetalleEstadoEmpleado,this.jTtoolBarEstadoEmpleado,this.jTtoolBarDetalleEstadoEmpleado);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoEmpleado=null; 
		
		final JPanel jPanelParametrosReportesEstadoEmpleado=this.jPanelParametrosReportesEstadoEmpleado;
		//final JScrollPane jScrollPanelDatosEstadoEmpleado=this.jScrollPanelDatosEstadoEmpleado;
		final JTable jTableDatosEstadoEmpleado=this.jTableDatosEstadoEmpleado;		
		final JPanel jPanelPaginacionEstadoEmpleado=this.jPanelPaginacionEstadoEmpleado;
		//final JScrollPane jScrollPanelDatosEdicionEstadoEmpleado=this.jScrollPanelDatosEdicionEstadoEmpleado;
		final JPanel jPanelAccionesEstadoEmpleado=this.jPanelAccionesEstadoEmpleado;
		
		JPanel jPanelCamposAuxiliarEstadoEmpleado=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoEmpleado=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) {
			jPanelCamposAuxiliarEstadoEmpleado=this.jInternalFrameDetalleFormEstadoEmpleado.jPanelCamposEstadoEmpleado;
			jPanelAccionesFormularioAuxiliarEstadoEmpleado=this.jInternalFrameDetalleFormEstadoEmpleado.jPanelAccionesFormularioEstadoEmpleado;
		}
		
		final JPanel jPanelCamposEstadoEmpleado=jPanelCamposAuxiliarEstadoEmpleado;
		final JPanel jPanelAccionesFormularioEstadoEmpleado=jPanelAccionesFormularioAuxiliarEstadoEmpleado;
		
		
		final JMenuBar jmenuBarEstadoEmpleado=this.jmenuBarEstadoEmpleado;		
		final JToolBar jTtoolBarEstadoEmpleado=this.jTtoolBarEstadoEmpleado;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoEmpleado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoEmpleado=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) {
			jmenuBarDetalleAuxiliarEstadoEmpleado=this.jInternalFrameDetalleFormEstadoEmpleado.jmenuBarDetalleEstadoEmpleado;
			jTtoolBarDetalleAuxiliarEstadoEmpleado=this.jInternalFrameDetalleFormEstadoEmpleado.jTtoolBarDetalleEstadoEmpleado;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoEmpleado=jmenuBarDetalleAuxiliarEstadoEmpleado;
		final JToolBar jTtoolBarDetalleEstadoEmpleado=jTtoolBarDetalleAuxiliarEstadoEmpleado;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoEmpleado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoEmpleado;
			processRunnable.jTableDatos=jTableDatosEstadoEmpleado;
			processRunnable.jPanelCampos=jPanelCamposEstadoEmpleado;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoEmpleado;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoEmpleado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoEmpleado;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoEmpleado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoEmpleado;
			processRunnable.jTtoolBar=jTtoolBarEstadoEmpleado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoEmpleado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoEmpleado ,jPanelParametrosReportesEstadoEmpleado, jTableDatosEstadoEmpleado,/*jScrollPanelDatosEstadoEmpleado,*/jPanelCamposEstadoEmpleado,jPanelPaginacionEstadoEmpleado, /*jScrollPanelDatosEdicionEstadoEmpleado,*/ jPanelAccionesEstadoEmpleado,jPanelAccionesFormularioEstadoEmpleado,jmenuBarEstadoEmpleado,jmenuBarDetalleEstadoEmpleado,jTtoolBarEstadoEmpleado,jTtoolBarDetalleEstadoEmpleado));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoEmpleado(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoEmpleado(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoEmpleado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoEmpleado,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoEmpleado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoEmpleado,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadoempleadoConstantesFunciones.getsFinalQueryEstadoEmpleado();
		String  finalQueryPaginacionTodos=this.estadoempleadoConstantesFunciones.getsFinalQueryEstadoEmpleado();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoEmpleadoConstantesFunciones.getArrayColumnasGlobalesNoEstadoEmpleado(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoEmpleadoConstantesFunciones.getArrayColumnasGlobalesEstadoEmpleado(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoEmpleadoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadoempleadosEliminados= new ArrayList<EstadoEmpleado>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoEmpleado();
		
				///*EstadoEmpleadoSessionBean*/this.estadoempleadoSessionBean=new EstadoEmpleadoSessionBean();
			
			if(this.estadoempleadoSessionBean==null) {
				this.estadoempleadoSessionBean=new EstadoEmpleadoSessionBean();
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
					this.iNumeroPaginacion=EstadoEmpleadoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoEmpleadoConstantesFunciones.getClassesForeignKeysOfEstadoEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadoempleado."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadoempleadosAux= new ArrayList<EstadoEmpleado>();
			
				
			estadoempleadoLogic.setDatosCliente(this.datosCliente);
			estadoempleadoLogic.setDatosDeep(this.datosDeep);
			estadoempleadoLogic.setIsConDeep(true);
			
			
			estadoempleadoLogic.getEstadoEmpleadoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadoempleadoLogic.getTodosEstadoEmpleados(finalQueryGlobal,pagination);
					
					//estadoempleadoLogic.getTodosEstadoEmpleadosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadoempleadoLogic.getEstadoEmpleados()==null|| estadoempleadoLogic.getEstadoEmpleados().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoempleadosAux= new ArrayList<EstadoEmpleado>();
							estadoempleadosAux.addAll(estadoempleadoLogic.getEstadoEmpleados());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoempleadosAux= new ArrayList<EstadoEmpleado>();
							estadoempleadosAux.addAll(estadoempleados);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoempleadoLogic.getTodosEstadoEmpleados(finalQueryGlobal+"",this.pagination);												
							
							//estadoempleadoLogic.getTodosEstadoEmpleadosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoEmpleados("Todos",estadoempleadoLogic.getEstadoEmpleados() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoempleadoLogic.setEstadoEmpleados(new ArrayList<EstadoEmpleado>());					
							estadoempleadoLogic.getEstadoEmpleados().addAll(estadoempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoempleados=new ArrayList<EstadoEmpleado>();
							estadoempleados.addAll(estadoempleadosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoEmpleado=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoEmpleado=this.idActual;
				
				} else if(this.idEstadoEmpleadoActual!=null && this.idEstadoEmpleadoActual!=0L) {
					idEstadoEmpleado=idEstadoEmpleadoActual;
				}
				
					
				this.sDetalleReporte=EstadoEmpleadoConstantesFunciones.getDetalleIndicePorId(idEstadoEmpleado);
				
				this.estadoempleados=new ArrayList<EstadoEmpleado>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadoempleadoLogic.getEntity(idEstadoEmpleado);
					
					//estadoempleadoLogic.getEntityWithConnection(idEstadoEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoempleadoLogic.setEstadoEmpleados(new ArrayList<EstadoEmpleado>());
					estadoempleadoLogic.getEstadoEmpleados().add(estadoempleadoLogic.getEstadoEmpleado());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoempleados=new ArrayList<EstadoEmpleado>();
					this.estadoempleados.add(estadoempleado);
				}
				
				if(estadoempleadoLogic.getEstadoEmpleado()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoEmpleado();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoEmpleado();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoempleadoLogic.getEstadoEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoempleados.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoempleadoLogic.getEstadoEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoempleados.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoEmpleado estadoempleado) {
		Boolean permite=true;
		
		if(this.estadoempleado.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoEmpleadoConstantesFunciones.getOrderByListaEstadoEmpleado();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoEmpleadoConstantesFunciones.getOrderByListaEstadoEmpleado();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoEmpleado estadoempleado:estadoempleadoLogic.getEstadoEmpleados()) {
				if(estadoempleado.getsType().equals(Constantes2.S_TOTALES)) {
					estadoempleadoTotales=estadoempleado;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoEmpleado estadoempleado:this.estadoempleados) {
				if(estadoempleado.getsType().equals(Constantes2.S_TOTALES)) {
					estadoempleadoTotales=estadoempleado;
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
			this.estadoempleadoAux=new EstadoEmpleado();
			this.estadoempleadoAux.setsType(Constantes2.S_TOTALES);
			this.estadoempleadoAux.setIsNew(false);
			this.estadoempleadoAux.setIsChanged(false);
			this.estadoempleadoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoEmpleadoConstantesFunciones.TotalizarValoresFilaEstadoEmpleado(this.estadoempleadoLogic.getEstadoEmpleados(),this.estadoempleadoAux);
				
				this.estadoempleadoLogic.getEstadoEmpleados().add(this.estadoempleadoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoEmpleadoConstantesFunciones.TotalizarValoresFilaEstadoEmpleado(this.estadoempleados,this.estadoempleadoAux);
				
				this.estadoempleados.add(this.estadoempleadoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadoempleadoTotales=new EstadoEmpleado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoempleadoLogic.getEstadoEmpleados().remove(estadoempleadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoempleados.remove(estadoempleadoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadoempleadoTotales=new EstadoEmpleado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoEmpleado estadoempleado:estadoempleadoLogic.getEstadoEmpleados()) {
				if(estadoempleado.getsType().equals(Constantes2.S_TOTALES)) {
					estadoempleadoTotales=estadoempleado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoEmpleadoConstantesFunciones.TotalizarValoresFilaEstadoEmpleado(this.estadoempleadoLogic.getEstadoEmpleados(),estadoempleadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoEmpleado estadoempleado:this.estadoempleados) {
				if(estadoempleado.getsType().equals(Constantes2.S_TOTALES)) {
					estadoempleadoTotales=estadoempleado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoEmpleadoConstantesFunciones.TotalizarValoresFilaEstadoEmpleado(this.estadoempleados,estadoempleadoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEstadoEmpleadoPorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getEstadoEmpleadoPorCodigo(String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoempleadoLogic.getEstadoEmpleadoPorCodigo(codigo);
				
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
	
	public void inicializarPermisosEstadoEmpleado() {
		this.isPermisoTodoEstadoEmpleado=false;
		this.isPermisoNuevoEstadoEmpleado=false;
		this.isPermisoActualizarEstadoEmpleado=false;
		this.isPermisoActualizarOriginalEstadoEmpleado=false;
		this.isPermisoEliminarEstadoEmpleado=false;
		this.isPermisoGuardarCambiosEstadoEmpleado=false;
		this.isPermisoConsultaEstadoEmpleado=false;
		this.isPermisoBusquedaEstadoEmpleado=false;
		this.isPermisoReporteEstadoEmpleado=false;		
		this.isPermisoOrdenEstadoEmpleado=false;		
		this.isPermisoPaginacionMedioEstadoEmpleado=false;		
		this.isPermisoPaginacionAltoEstadoEmpleado=false;
		this.isPermisoPaginacionTodoEstadoEmpleado=false;
		this.isPermisoCopiarEstadoEmpleado=false;		
		this.isPermisoVerFormEstadoEmpleado=false;		
		this.isPermisoDuplicarEstadoEmpleado=false;		
		this.isPermisoOrdenEstadoEmpleado=false;		
	}
	
	public void setPermisosUsuarioEstadoEmpleado(Boolean isPermiso) {
		this.isPermisoTodoEstadoEmpleado=isPermiso;
		this.isPermisoNuevoEstadoEmpleado=isPermiso;
		this.isPermisoActualizarEstadoEmpleado=isPermiso;
		this.isPermisoActualizarOriginalEstadoEmpleado=isPermiso;
		this.isPermisoEliminarEstadoEmpleado=isPermiso;
		this.isPermisoGuardarCambiosEstadoEmpleado=isPermiso;
		this.isPermisoConsultaEstadoEmpleado=isPermiso;
		this.isPermisoBusquedaEstadoEmpleado=isPermiso;
		this.isPermisoReporteEstadoEmpleado=isPermiso;
		this.isPermisoOrdenEstadoEmpleado=isPermiso;		
		this.isPermisoPaginacionMedioEstadoEmpleado=isPermiso;		
		this.isPermisoPaginacionAltoEstadoEmpleado=isPermiso;		
		this.isPermisoPaginacionTodoEstadoEmpleado=isPermiso;		
		this.isPermisoCopiarEstadoEmpleado=isPermiso;		
		this.isPermisoVerFormEstadoEmpleado=isPermiso;		
		this.isPermisoDuplicarEstadoEmpleado=isPermiso;
		this.isPermisoOrdenEstadoEmpleado=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoEmpleado(Boolean isPermiso) {
		//this.isPermisoTodoEstadoEmpleado=isPermiso;
		this.isPermisoNuevoEstadoEmpleado=isPermiso;
		this.isPermisoActualizarEstadoEmpleado=isPermiso;
		this.isPermisoActualizarOriginalEstadoEmpleado=isPermiso;
		this.isPermisoEliminarEstadoEmpleado=isPermiso;
		this.isPermisoGuardarCambiosEstadoEmpleado=isPermiso;
		//this.isPermisoConsultaEstadoEmpleado=isPermiso;
		//this.isPermisoBusquedaEstadoEmpleado=isPermiso;
		//this.isPermisoReporteEstadoEmpleado=isPermiso;
		//this.isPermisoOrdenEstadoEmpleado=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoEmpleado=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoEmpleado=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoEmpleado=isPermiso;		
		//this.isPermisoCopiarEstadoEmpleado=isPermiso;		
		//this.isPermisoDuplicarEstadoEmpleado=isPermiso;
		//this.isPermisoOrdenEstadoEmpleado=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoEmpleadoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(EmpleadoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(CierreRolMensualConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosEmpleado=false;
		this.isTienePermisosEmpleado=this.verificarGetPermisosUsuarioOpcionEstadoEmpleadoClaseRelacionada(this.opcionsRelacionadas,EmpleadoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosCierreRolMensual=false;
		this.isTienePermisosCierreRolMensual=this.verificarGetPermisosUsuarioOpcionEstadoEmpleadoClaseRelacionada(this.opcionsRelacionadas,CierreRolMensualConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoEmpleado(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoEmpleadoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosEmpleado=conPermiso;
		this.isTienePermisosCierreRolMensual=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoEmpleadoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoEmpleadoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoEmpleadoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosEmpleado && this.jInternalFrameDetalleFormEstadoEmpleado!=null && this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoEmpleado.jTabbedPaneRelacionesEstadoEmpleado.remove(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosCierreRolMensual && this.jInternalFrameDetalleFormEstadoEmpleado!=null && this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoEmpleado.jTabbedPaneRelacionesEstadoEmpleado.remove(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoEmpleado() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoEmpleadoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoEmpleado=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoEmpleado=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoEmpleado=this.isPermisoActualizarEstadoEmpleado;
			this.isPermisoEliminarEstadoEmpleado=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoEmpleado=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoEmpleado=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoEmpleado=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoEmpleado=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoEmpleado=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoEmpleado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoEmpleado=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoEmpleado=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoEmpleado=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoEmpleado=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoEmpleado=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoEmpleado=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoEmpleado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoEmpleado.setToolTipText(this.jTableDatosEstadoEmpleado.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoEmpleado(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoEmpleado(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoEmpleado() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosEmpleado && this.estadoempleadoConstantesFunciones.mostrarEmpleadoEstadoEmpleado && !EstadoEmpleadoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Empleado");
			reporte.setsDescripcion("Empleado");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCierreRolMensual && this.estadoempleadoConstantesFunciones.mostrarCierreRolMensualEstadoEmpleado && !EstadoEmpleadoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cierre Rol Mensual");
			reporte.setsDescripcion("Cierre Rol Mensual");
			this.tiposRelaciones.add(reporte);
		}
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	public void inicializarCombosForeignKeyEstadoEmpleadoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoEmpleadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoEmpleadoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoEmpleadoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoEmpleadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoEmpleado()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoEmpleado()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoEmpleado(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoEmpleado()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoEmpleado();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoEmpleado(EstadoEmpleado estadoempleado)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoEmpleado(EstadoEmpleado estadoempleado,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoEmpleado()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoEmpleado()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoEmpleado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoEmpleado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoEmpleado()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoEmpleado()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoEmpleado(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoEmpleado()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoEmpleadoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoEmpleadoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoEmpleadoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadoempleadoSessionBean=new EstadoEmpleadoSessionBean(); 
		this.estadoempleadoConstantesFunciones=new EstadoEmpleadoConstantesFunciones(); 
		this.estadoempleadoBean=new EstadoEmpleado();//(this.estadoempleadoConstantesFunciones); 		
		this.estadoempleadoReturnGeneral=new EstadoEmpleadoParameterReturnGeneral(); 
		
		this.estadoempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoEmpleado(true);
			
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
			
			this.estadoempleadoConstantesFunciones=new EstadoEmpleadoConstantesFunciones(); 
			this.estadoempleadoBean=new EstadoEmpleado();//this.estadoempleadoConstantesFunciones); 			
			this.estadoempleadoReturnGeneral=new EstadoEmpleadoParameterReturnGeneral(); 
		
			EstadoEmpleadoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Empleado Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadoempleado=new EstadoEmpleado();
			this.estadoempleados = new ArrayList<EstadoEmpleado>();
			this.estadoempleadosAux = new ArrayList<EstadoEmpleado>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic=new EstadoEmpleadoLogic();
				this.estadoempleadoLogic.getNewConnexionToDeep("");
			}
			
			//this.estadoempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadoempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoEmpleado);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoEmpleado);	
					}
					
					if(this.jInternalFrameImportacionEstadoEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoEmpleado);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoEmpleado);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoEmpleado);
				this.jInternalFrameDetalleFormEstadoEmpleado.setVisible(false);
				this.jInternalFrameDetalleFormEstadoEmpleado.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoEmpleado);
					this.jInternalFrameReporteDinamicoEstadoEmpleado.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoEmpleado.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoEmpleado);
					this.jInternalFrameImportacionEstadoEmpleado.setVisible(false);
					this.jInternalFrameImportacionEstadoEmpleado.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoEmpleado);
					this.jInternalFrameOrderByEstadoEmpleado.setVisible(false);
					this.jInternalFrameOrderByEstadoEmpleado.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoEmpleadoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoEmpleadoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadoempleadoReturnGeneral=new EstadoEmpleadoParameterReturnGeneral();
			
			this.estadoempleadoParameterGeneral=new EstadoEmpleadoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadoempleadoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(EmpleadoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(CierreRolMensualConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoEmpleadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoempleadoSessionBean.getEsGuardarRelacionado(),this.estadoempleadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoEmpleadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoempleadoSessionBean.getEsGuardarRelacionado(),this.estadoempleadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoEmpleado=false;
			this.isVisibilidadCeldaDuplicarEstadoEmpleado=true;
			this.isVisibilidadCeldaCopiarEstadoEmpleado=true;
			this.isVisibilidadCeldaVerFormEstadoEmpleado=true;
			this.isVisibilidadCeldaOrdenEstadoEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoEmpleado=false;
			this.isVisibilidadCeldaModificarEstadoEmpleado=false;
			this.isVisibilidadCeldaActualizarEstadoEmpleado=false;
			this.isVisibilidadCeldaEliminarEstadoEmpleado=false;
			this.isVisibilidadCeldaCancelarEstadoEmpleado=false;
			this.isVisibilidadCeldaGuardarEstadoEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoEmpleado=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoEmpleado();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoEmpleado(false);
			
			this.setPermisosUsuarioEstadoEmpleado();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoempleadoSessionBean.getEsGuardarRelacionado() 
				|| (this.estadoempleadoSessionBean.getEsGuardarRelacionado() && this.estadoempleadoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoEmpleadoClasesRelacionadas();
			}
			
			if(this.estadoempleadoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoEmpleadoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoEmpleado();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoEmpleado();
			}
			
			if(!this.isPermisoBusquedaEstadoEmpleado) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoEmpleado,this.isPermisoPaginacionMedioEstadoEmpleado,this.isPermisoPaginacionTodoEstadoEmpleado);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoEmpleadoConstantesFunciones.getTiposSeleccionarEstadoEmpleado());
				
				this.tiposColumnasSelect=EstadoEmpleadoConstantesFunciones.getTiposSeleccionarEstadoEmpleado(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoEmpleado();				
				//this.tiposRelacionesSelect=EstadoEmpleadoConstantesFunciones.getTiposRelacionesEstadoEmpleado(true);
				
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
			//if(!this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoEmpleado();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoEmpleado(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoEmpleado(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoEmpleado() ;
			
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
			
			
			this.empleadoLogic=new EmpleadoLogic();
			this.cierrerolmensualLogic=new CierreRolMensualLogic(); 
			jasperPrint = null;												
			
			//FK
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				estadoempleadoImplementable= (EstadoEmpleadoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoEmpleadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadoempleadoImplementableHome= (EstadoEmpleadoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoEmpleadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadoempleados= new ArrayList<EstadoEmpleado>();
			this.estadoempleadosEliminados= new ArrayList<EstadoEmpleado>();
						
			this.isEsNuevoEstadoEmpleado=false;
			this.esParaAccionDesdeFormularioEstadoEmpleado=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoEmpleado(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoEmpleado();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadoEmpleadoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoEmpleadoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoEmpleado(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoEmpleado();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoEmpleado();
			}
			
			EstadoEmpleadoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoEmpleado(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoEmpleado: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoEmpleado() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(EmpleadoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(EmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(CierreRolMensualConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CierreRolMensualConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoEmpleado")) {
				iIndex=this.jInternalFrameDetalleFormEstadoEmpleado.jTabbedPaneRelacionesEstadoEmpleado.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoEmpleado.jTabbedPaneRelacionesEstadoEmpleado.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoEmpleado.getSelectedRow();	
				
				

				if(sTitle.equals("Cierre Rol Mensuales")) {
					if(!CierreRolMensualJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoEmpleado();

						this.cargarParteTabPanelRelacionadaCierreRolMensual(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Empleados")) {
					if(!EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoEmpleado();

						this.cargarParteTabPanelRelacionadaEmpleado(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoEmpleado();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCierreRolMensual(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoEmpleado.cargarSessionConBeanSwingJInternalFrameCierreRolMensual(false,true,iIndex);
		this.jButtonCierreRolMensualActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCierreRolMensual();

		//this.jTabbedPaneRelacionesEstadoEmpleado.updateUI();
		//this.jTabbedPaneRelacionesEstadoEmpleado.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoEmpleado.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaEmpleado(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoEmpleado.cargarSessionConBeanSwingJInternalFrameEmpleado(false,true,iIndex);
		this.jButtonEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaEmpleado();

		//this.jTabbedPaneRelacionesEstadoEmpleado.updateUI();
		//this.jTabbedPaneRelacionesEstadoEmpleado.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoEmpleado.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Empleado")) {
				int row=this.jTableDatosEstadoEmpleado.getSelectedRow();
				jButtonEmpleadoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("CierreRolMensual")) {
				int row=this.jTableDatosEstadoEmpleado.getSelectedRow();
				jButtonCierreRolMensualActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Empleado")) {

					if(this.isTienePermisosEmpleado && this.estadoempleadoConstantesFunciones.mostrarEmpleadoEstadoEmpleado && !EstadoEmpleadoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Empleados"+"("+EmpleadoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Empleados");

						if(estadoempleadoConstantesFunciones.resaltarEmpleadoEstadoEmpleado!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadoempleadoConstantesFunciones.resaltarEmpleadoEstadoEmpleado);
						}

						jmenuItem.setEnabled(this.estadoempleadoConstantesFunciones.activarEmpleadoEstadoEmpleado);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Empleado"));

						

						this.jInternalFrameDetalleFormEstadoEmpleado.jmenuDetalleEstadoEmpleado.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Cierre Rol Mensual")) {

					if(this.isTienePermisosCierreRolMensual && this.estadoempleadoConstantesFunciones.mostrarCierreRolMensualEstadoEmpleado && !EstadoEmpleadoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Cierre Rol Mensuales"+"("+CierreRolMensualConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Cierre Rol Mensuales");

						if(estadoempleadoConstantesFunciones.resaltarCierreRolMensualEstadoEmpleado!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadoempleadoConstantesFunciones.resaltarCierreRolMensualEstadoEmpleado);
						}

						jmenuItem.setEnabled(this.estadoempleadoConstantesFunciones.activarCierreRolMensualEstadoEmpleado);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"CierreRolMensual"));

						

						this.jInternalFrameDetalleFormEstadoEmpleado.jmenuDetalleEstadoEmpleado.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoEmpleado(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoEmpleado(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoEmpleadoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoEmpleado();
		
		this.cargarCombosFrameForeignKeyEstadoEmpleado();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoEmpleado();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoEmpleado();
		}
	}
	
	
	
	public void jButtonNuevoEstadoEmpleadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadoempleadoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
			
			
			if(jTableDatosEstadoEmpleado.getRowCount()>=1) {
				jTableDatosEstadoEmpleado.removeRowSelectionInterval(0, jTableDatosEstadoEmpleado.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoEmpleado=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoEmpleado(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoEmpleado(true);			
			//this.estadoempleado=new EstadoEmpleado();
			//this.estadoempleado.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoEmpleado(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoEmpleado() ;
			
			if(EstadoEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoEmpleado(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadoempleado);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadoempleado);				
			
			EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
			
			if(this.estadoempleadoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoEmpleado: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoEmpleadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoEmpleado> estadoempleadosSeleccionados=new ArrayList<EstadoEmpleado>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoEmpleado.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoEmpleado.getSelectedRows().length;			
			}
			
			estadoempleadosSeleccionados=this.getEstadoEmpleadosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoEmpleado--;			
				//EstadoEmpleado estadoempleadoAux= new EstadoEmpleado();			
				//estadoempleadoAux.setId(this.iIdNuevoEstadoEmpleado);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoEmpleado estadoempleadoOrigen=new EstadoEmpleado();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoEmpleado estadoempleadoOrigen : estadoempleadosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoEmpleado.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadoempleadoOrigen =(EstadoEmpleado) this.estadoempleadoLogic.getEstadoEmpleados().toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoempleadoOrigen =(EstadoEmpleado) this.estadoempleados.toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoEmpleado();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadoempleado.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoEmpleado(estadoempleadoOrigen,this.estadoempleado,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoEmpleado(this.estadoempleado);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoempleadoLogic.getEstadoEmpleados().add(this.estadoempleadoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoempleados.add(this.estadoempleadoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoEmpleado(false);
				
				this.jTableDatosEstadoEmpleado.setRowSelectionInterval(this.getIndiceNuevoEstadoEmpleado(), this.getIndiceNuevoEstadoEmpleado());
				
				int iLastRow =  this.jTableDatosEstadoEmpleado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoEmpleado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoEmpleado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoEmpleado(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoEmpleado> estadoempleadosSeleccionados=new ArrayList<EstadoEmpleado>();									
		
			EstadoEmpleado estadoempleadoOrigen=new EstadoEmpleado();
			EstadoEmpleado estadoempleadoDestino=new EstadoEmpleado();
				
			estadoempleadosSeleccionados=this.getEstadoEmpleadosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoEmpleado.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadoempleadosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoEmpleado.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoempleadoOrigen =(EstadoEmpleado) this.estadoempleadoLogic.getEstadoEmpleados().toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoempleadoOrigen =(EstadoEmpleado) this.estadoempleados.toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoempleadoDestino =(EstadoEmpleado) this.estadoempleadoLogic.getEstadoEmpleados().toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoempleadoDestino =(EstadoEmpleado) this.estadoempleados.toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadoempleadoOrigen =estadoempleadosSeleccionados.get(0);
				estadoempleadoDestino =estadoempleadosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoEmpleado(estadoempleadoOrigen,estadoempleadoDestino,true,false);
				
				estadoempleadoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoempleadoDestino,estadoempleadoLogic.getEstadoEmpleados());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoempleadoDestino,estadoempleados);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoEmpleado(false);
				
				//this.jTableDatosEstadoEmpleado.setRowSelectionInterval(this.getIndiceNuevoEstadoEmpleado(), this.getIndiceNuevoEstadoEmpleado());
				
				int iLastRow =  this.jTableDatosEstadoEmpleado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoEmpleado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoEmpleado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoEmpleado(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoEmpleado.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoEmpleado.isVisible();
			
			
			this.jPanelParametrosReportesEstadoEmpleado.setVisible(!isVisible);
			this.jPanelPaginacionEstadoEmpleado.setVisible(!isVisible);
			this.jPanelAccionesEstadoEmpleado.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoEmpleado();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoEmpleado();
			
			this.abrirFrameOrderByEstadoEmpleado();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoEmpleado(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoEmpleado);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoEmpleado.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoEmpleado.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoEmpleado.setSize(this.jInternalFrameDetalleFormEstadoEmpleado.iWidthFormulario,this.jInternalFrameDetalleFormEstadoEmpleado.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoEmpleado.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoEmpleado.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoEmpleado.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoEmpleado.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoEmpleado.jContentPaneDetalleEstadoEmpleado.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoEmpleado.jTabbedPaneRelacionesEstadoEmpleado.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoEmpleado.jContentPaneDetalleEstadoEmpleado.getWidth(),EstadoEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoEmpleado.jTabbedPaneRelacionesEstadoEmpleado.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoEmpleado.jContentPaneDetalleEstadoEmpleado.getWidth(),EstadoEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoEmpleado.jTabbedPaneRelacionesEstadoEmpleado.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoEmpleado.jContentPaneDetalleEstadoEmpleado.getWidth(),EstadoEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CierreRolMensualJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCierreRolMensual();
					}

					if(EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaEmpleado();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoEmpleado.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoEmpleado.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoEmpleado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoEmpleado==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoEmpleado,false,this);
				} else {
					this.jInternalFrameOrderByEstadoEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoEmpleado,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoEmpleado);
				this.jInternalFrameOrderByEstadoEmpleado.setVisible(false);
				this.jInternalFrameOrderByEstadoEmpleado.setSelected(false);
				
				this.jInternalFrameOrderByEstadoEmpleado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoEmpleado"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoEmpleado();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoEmpleado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoEmpleado==null) {
				
				this.jInternalFrameImportacionEstadoEmpleado=new ImportacionJInternalFrame(EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoEmpleado);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoEmpleado);
				this.jInternalFrameImportacionEstadoEmpleado.setVisible(false);
				this.jInternalFrameImportacionEstadoEmpleado.setSelected(false);


				this.jInternalFrameImportacionEstadoEmpleado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoEmpleado"));
				this.jInternalFrameImportacionEstadoEmpleado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoEmpleado"));
				this.jInternalFrameImportacionEstadoEmpleado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoEmpleado"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoEmpleado() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoEmpleado==null) {
				this.jInternalFrameReporteDinamicoEstadoEmpleado=new ReporteDinamicoJInternalFrame(EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoEmpleado);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoEmpleado);
				this.jInternalFrameReporteDinamicoEstadoEmpleado.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoEmpleado.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoEmpleado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoEmpleado"));
				this.jInternalFrameReporteDinamicoEstadoEmpleado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoEmpleado"));
				this.jInternalFrameReporteDinamicoEstadoEmpleado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoEmpleado"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoEmpleado();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCierreRolMensual() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.jScrollPanelDatosCierreRolMensual.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoEmpleado.jContentPaneDetalleEstadoEmpleado.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.jScrollPanelDatosCierreRolMensual.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.jScrollPanelDatosCierreRolMensual.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.jScrollPanelDatosCierreRolMensual.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaEmpleado() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoEmpleado.jContentPaneDetalleEstadoEmpleado.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoEmpleado() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoEmpleado);
			
	       	this.jInternalFrameDetalleFormEstadoEmpleado.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoEmpleado.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoEmpleado.dispose();
			//this.jInternalFrameDetalleFormEstadoEmpleado=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoEmpleado() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoEmpleado.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoEmpleado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoEmpleado.setVisible(true);
	        this.jInternalFrameImportacionEstadoEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoEmpleado() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoEmpleado.setVisible(true);
	        this.jInternalFrameOrderByEstadoEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoEmpleado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoEmpleado.setVisible(false);
	        this.jInternalFrameOrderByEstadoEmpleado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoEmpleado() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoEmpleado.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoEmpleado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoEmpleado() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoEmpleado.setVisible(false);
	        this.jInternalFrameImportacionEstadoEmpleado.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoEmpleado(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoEmpleado(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoEmpleado.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoEmpleado(true);
			//this.isEsNuevoEstadoEmpleado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleado =(EstadoEmpleado) this.estadoempleadoLogic.getEstadoEmpleados().toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoempleado =(EstadoEmpleado) this.estadoempleados.toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoEmpleado(false) ;
			
			if(estadoempleadoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado() && EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualSessionBean.getEsGuardarRelacionado() && CierreRolMensualJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCierreRolMensualActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoEmpleado(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoEmpleado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoEmpleadoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleado =(EstadoEmpleado) this.estadoempleadoLogic.getEstadoEmpleados().toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoempleado =(EstadoEmpleado) this.estadoempleados.toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoEmpleado(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoEmpleado.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoEmpleado(true);
			//this.isEsNuevoEstadoEmpleado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleado =(EstadoEmpleado) this.estadoempleadoLogic.getEstadoEmpleados().toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoempleado =(EstadoEmpleado) this.estadoempleados.toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadoempleado.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoEmpleado(false) ;
			
			if(EstadoEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoEmpleado(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoEmpleado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoEmpleado(false);
			
			//if(!this.isEsNuevoEstadoEmpleado) {								
				int intSelectedRow = this.jTableDatosEstadoEmpleado.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleado =(EstadoEmpleado) this.estadoempleadoLogic.getEstadoEmpleados().toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoempleado =(EstadoEmpleado) this.estadoempleados.toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoEmpleado(this.estadoempleado,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoEmpleado(this.estadoempleado);
				
			}
			
			if(this.permiteMantenimiento(this.estadoempleado)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoEmpleado=true;
					this.inicializarActualizarBindingTablaEstadoEmpleado(false);
					this.isEsNuevoEstadoEmpleado=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoEmpleado=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoEmpleado=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoEmpleado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoEmpleado(false);
				
				this.habilitarDeshabilitarControlesEstadoEmpleado(false);
			
												
				
				if(EstadoEmpleadoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoEmpleado();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoEmpleadoActionPerformed(evt,estadoempleadoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoEmpleado(this.estadoempleado,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoEmpleado.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadoempleadoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadoempleado.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoEmpleado.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoEmpleado.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoEmpleado.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleado =(EstadoEmpleado) this.estadoempleadoLogic.getEstadoEmpleados().toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
				this.estadoempleado.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoempleado =(EstadoEmpleado) this.estadoempleados.toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
				this.estadoempleado.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadoempleado)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoEmpleadoModel) this.jTableDatosEstadoEmpleado.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoEmpleado=true;
				this.inicializarActualizarBindingTablaEstadoEmpleado(false);
				this.isEsNuevoEstadoEmpleado=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoEmpleado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoEmpleado(false);
				
				this.habilitarDeshabilitarControlesEstadoEmpleado(false);
				
				
				
				if(EstadoEmpleadoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoEmpleado();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoEmpleadoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoEmpleado.getRowCount()>=1) {
				jTableDatosEstadoEmpleado.removeRowSelectionInterval(0, jTableDatosEstadoEmpleado.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoEmpleado(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoEmpleado(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoEmpleado(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoEmpleado(false) ;
			
			this.isEsNuevoEstadoEmpleado=false;
			
			if(EstadoEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoEmpleado();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoEmpleado(false);
				
				//SI ES MANUAL
				if(EstadoEmpleadoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoEmpleado();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoEmpleado--;			
			//EstadoEmpleado estadoempleadoAux= new EstadoEmpleado();			
			//estadoempleadoAux.setId(this.iIdNuevoEstadoEmpleado);
			
			if(this.jInternalFrameDetalleFormEstadoEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoEmpleado();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoEmpleado(this.estadoempleado);
			
			this.estadoempleado.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadoempleadoLogic.getEstadoEmpleados().add(this.estadoempleadoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadoempleados.add(this.estadoempleadoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoEmpleado(false);
			
			this.jTableDatosEstadoEmpleado.setRowSelectionInterval(this.getIndiceNuevoEstadoEmpleado(), this.getIndiceNuevoEstadoEmpleado());
			
			int iLastRow =  this.jTableDatosEstadoEmpleado.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoEmpleado.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoEmpleado.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoEmpleado(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoEmpleado(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoEmpleado(false);
			
			//SI ES MANUAL
			if(EstadoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoEmpleado();
			}
			
			//this.abrirFrameTreeEstadoEmpleado();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoEmpleadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado EmpleadoS ?", "MANTENIMIENTO DE Estado Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoEmpleado.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoEmpleado();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadoempleadoReturnGeneral=estadoempleadoLogic.procesarImportacionEstadoEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadoempleadoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoEmpleadoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoEmpleadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoEmpleado.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoEmpleado.setFileImportacion(this.jInternalFrameImportacionEstadoEmpleado.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoEmpleado.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoEmpleado.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoEmpleado.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoEmpleado.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoEmpleado> estadoempleadosSeleccionados=new ArrayList<EstadoEmpleado>();		

		estadoempleadosSeleccionados=this.getEstadoEmpleadosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoEmpleado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoEmpleado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoEmpleadoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoEmpleadoBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoEmpleados("Todos",estadoempleadosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoEmpleadoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoEmpleadoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoEstadoEmpleado.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoEmpleado.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoEmpleado.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoEmpleadoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoEmpleadoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoEmpleado.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoEmpleadoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoEmpleadoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoEmpleado.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoEmpleado.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoEmpleadoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoEmpleadoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoEmpleadoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoEmpleado> estadoempleadosSeleccionados=new ArrayList<EstadoEmpleado>();		
		
		estadoempleadosSeleccionados=this.getEstadoEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoempleado";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoEmpleados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoEmpleadoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoEmpleadoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoEmpleado estadoempleado:estadoempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoempleado.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoEmpleadoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoEmpleadoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoEmpleado estadoempleado:estadoempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoempleado.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoEmpleado(row);				
			//	iRow++;
			//}				
			
			//for(EstadoEmpleado estadoempleadoAux:estadoempleadosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoEmpleado(estadoempleadoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Empleado",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadoempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoEmpleado(false);
			
			//SI ES MANUAL
			if(EstadoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoEmpleado();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoEmpleado(false);
			
			//SI ES MANUAL
			if(EstadoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoEmpleado();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoEmpleado(false);
			
			//SI ES MANUAL
			if(EstadoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoEmpleado();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoEmpleado() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoEmpleado.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoEmpleado.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoEmpleado.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoEmpleado.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoEmpleado.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoEmpleado.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoEmpleado.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoEmpleado(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoEmpleado(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoEmpleado(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoEmpleado(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoEmpleado(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoEmpleado(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoEmpleado(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoEmpleado(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoEmpleado() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoEmpleado();
		
		this.inicializarActualizarBindingBotonesManualEstadoEmpleado(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoEmpleado();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoEmpleado() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoEmpleado(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoEmpleado(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoEmpleado.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoEmpleado.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoEmpleado.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoEmpleado.jCheckBoxPostAccionNuevoEstadoEmpleado.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoEmpleado.jCheckBoxPostAccionSinCerrarEstadoEmpleado.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoEmpleado.jCheckBoxPostAccionSinMensajeEstadoEmpleado.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoEmpleado.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoEmpleado.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoEmpleado.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) {
				this.jInternalFrameDetalleFormEstadoEmpleado.jCheckBoxPostAccionNuevoEstadoEmpleado.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoEmpleado.jCheckBoxPostAccionSinCerrarEstadoEmpleado.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoEmpleado.jCheckBoxPostAccionSinMensajeEstadoEmpleado.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoEmpleado.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoEmpleado.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoEmpleado.jComboBoxTiposAccionesFormularioEstadoEmpleado.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoEmpleado.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoEmpleado!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoEmpleado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoEmpleado.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoEmpleado.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoEmpleado.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoEmpleado.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoEmpleado!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoEmpleado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoEmpleado.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoEmpleado.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoEmpleado(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoEmpleado(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoEmpleado() throws Exception {
		try	{
			if(EstadoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoEmpleado();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoEmpleado() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoEmpleado.jComboBoxTiposAccionesFormularioEstadoEmpleado.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoEmpleado.jComboBoxTiposAccionesFormularioEstadoEmpleado.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoEmpleado() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoEmpleado.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoEmpleado.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoEmpleado.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoEmpleado.addItem(reporte);
			}
			
			
			if(!this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoEmpleado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoEmpleado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoEmpleado.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoEmpleado.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoEmpleado.jComboBoxTiposAccionesFormularioEstadoEmpleado.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoEmpleado.jComboBoxTiposAccionesFormularioEstadoEmpleado.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoEmpleado.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoEmpleado.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoEmpleado();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoEmpleado() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoEmpleado!=null) {
				this.jInternalFrameReporteDinamicoEstadoEmpleado.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoEmpleado.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoEmpleado!=null) {
				this.jInternalFrameReporteDinamicoEstadoEmpleado.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoEmpleado.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoEmpleado!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoEmpleado.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoEmpleado.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoEmpleado.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoEmpleado.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoEmpleado.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoEmpleado.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoEmpleado()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoEmpleado(Boolean esInicializar) throws Exception {				
		if(EstadoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoEmpleado();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoEmpleado() throws Exception {
		this.inicializarActualizarBindingTablaEstadoEmpleado(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoEmpleado() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoEmpleado.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoEmpleado.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoEmpleadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoEmpleado.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoEmpleadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoEmpleadoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoEmpleadoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoEmpleadoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoEmpleado.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoEmpleadoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoEmpleado.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoEmpleado(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadoempleadoLogic.getEstadoEmpleados().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadoempleados.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoEmpleado.setModel(new EstadoEmpleadoModel(this.estadoempleadoLogic.getEstadoEmpleados(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoEmpleado.setModel(new EstadoEmpleadoModel(this.estadoempleados,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoEmpleado!=null && this.jInternalFrameOrderByEstadoEmpleado.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoEmpleado();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoEmpleado,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoEmpleadoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO,estadoempleadoConstantesFunciones.resaltarSeleccionarEstadoEmpleado,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoEmpleadoConstantesFunciones.SCLASSWEBTITULO,estadoempleadoConstantesFunciones.resaltarSeleccionarEstadoEmpleado,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoEmpleado,EstadoEmpleadoConstantesFunciones.LABEL_ID));

		if(this.estadoempleadoConstantesFunciones.mostraridEstadoEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoEmpleadoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadoempleadoConstantesFunciones.resaltaridEstadoEmpleado,this.estadoempleadoConstantesFunciones.activaridEstadoEmpleado,this,true,"idEstadoEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoempleadoConstantesFunciones.resaltaridEstadoEmpleado,this.estadoempleadoConstantesFunciones.activaridEstadoEmpleado,this,true,"idEstadoEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoEmpleado,EstadoEmpleadoConstantesFunciones.LABEL_CODIGO));

		if(this.estadoempleadoConstantesFunciones.mostrarcodigoEstadoEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoEmpleadoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoempleadoConstantesFunciones.resaltarcodigoEstadoEmpleado,this.estadoempleadoConstantesFunciones.activarcodigoEstadoEmpleado,this,true,"codigoEstadoEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoempleadoConstantesFunciones.resaltarcodigoEstadoEmpleado,this.estadoempleadoConstantesFunciones.activarcodigoEstadoEmpleado,this,true,"codigoEstadoEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoEmpleado,EstadoEmpleadoConstantesFunciones.LABEL_NOMBRE));

		if(this.estadoempleadoConstantesFunciones.mostrarnombreEstadoEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoEmpleadoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoempleadoConstantesFunciones.resaltarnombreEstadoEmpleado,this.estadoempleadoConstantesFunciones.activarnombreEstadoEmpleado,this,true,"nombreEstadoEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoempleadoConstantesFunciones.resaltarnombreEstadoEmpleado,this.estadoempleadoConstantesFunciones.activarnombreEstadoEmpleado,this,true,"nombreEstadoEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadoempleadoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosEmpleado && this.estadoempleadoConstantesFunciones.mostrarEmpleadoEstadoEmpleado && !EstadoEmpleadoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Empleados");
				tableColumn.setHeaderValue("Empleados");
				tableColumn.setCellRenderer(new EmpleadoTableCell(estadoempleadoConstantesFunciones.resaltarEmpleadoEstadoEmpleado,this,this.estadoempleadoConstantesFunciones.activarEmpleadoEstadoEmpleado));
				tableColumn.setCellEditor(new EmpleadoTableCell(estadoempleadoConstantesFunciones.resaltarEmpleadoEstadoEmpleado,this,this.estadoempleadoConstantesFunciones.activarEmpleadoEstadoEmpleado));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoEmpleado.addColumn(tableColumn);
			}

			if(this.isTienePermisosCierreRolMensual && this.estadoempleadoConstantesFunciones.mostrarCierreRolMensualEstadoEmpleado && !EstadoEmpleadoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Cierre Rol Mensuales");
				tableColumn.setHeaderValue("Cierre Rol Mensuales");
				tableColumn.setCellRenderer(new CierreRolMensualTableCell(estadoempleadoConstantesFunciones.resaltarCierreRolMensualEstadoEmpleado,this,this.estadoempleadoConstantesFunciones.activarCierreRolMensualEstadoEmpleado));
				tableColumn.setCellEditor(new CierreRolMensualTableCell(estadoempleadoConstantesFunciones.resaltarCierreRolMensualEstadoEmpleado,this,this.estadoempleadoConstantesFunciones.activarCierreRolMensualEstadoEmpleado));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoEmpleado.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoempleadoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoempleadoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoEmpleado.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoempleadoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoempleadoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoEmpleado.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoEmpleado && this.isPermisoGuardarCambiosEstadoEmpleado) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadoempleadoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadoempleadoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoEmpleado.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadoempleadoSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosEstadoEmpleado.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoEmpleado.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoEmpleado && this.isPermisoGuardarCambiosEstadoEmpleado) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadoempleadoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoEmpleado && this.isPermisoGuardarCambiosEstadoEmpleado) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoEmpleado.moveColumn(this.jTableDatosEstadoEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoEmpleado.moveColumn(this.jTableDatosEstadoEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadoempleadoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoEmpleado.moveColumn(this.jTableDatosEstadoEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoEmpleado.moveColumn(this.jTableDatosEstadoEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoEmpleado.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoEmpleado.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoEmpleado,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoEmpleado.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoEmpleado.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoEmpleado.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoEmpleado.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoEmpleado.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadoempleadoLogic.getEstadoEmpleados().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadoempleados.size()-1;
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
		//this.jTableDatosEstadoEmpleado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoEmpleado();
			
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
				
				//this.isEsNuevoEstadoEmpleado=false;
					
				EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
			
				if(this.estadoempleadoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoEmpleado==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoEmpleado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoEmpleado.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleado =(EstadoEmpleado) this.estadoempleadoLogic.getEstadoEmpleados().toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoempleado =(EstadoEmpleado) this.estadoempleados.toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadoempleado.getsType().equals("DUPLICADO")
				   || this.estadoempleado.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoEmpleado=true;
				
				} else {
					this.isEsNuevoEstadoEmpleado=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
					if(this.estadoempleado.getId()>=0 && !this.estadoempleado.getIsNew()) {						
						this.isEsNuevoEstadoEmpleado=false;
						
					} else {
						this.isEsNuevoEstadoEmpleado=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoEmpleado(esRelaciones);						
				
				this.seleccionarEstadoEmpleado(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadoempleado.getId()<0) {
					this.isEsNuevoEstadoEmpleado=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoEmpleado(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoEmpleado(evt,rowIndex);
				}	
				
				if(this.estadoempleadoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoEmpleado: " + this.dDif); 
					}
				}								
				
				EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoEmpleado(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadoempleado)) {
					if(this.estadoempleado.getId()>0) {
						this.estadoempleado.setIsDeleted(true);
						
						this.estadoempleadosEliminados.add(this.estadoempleado);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoempleadoLogic.getEstadoEmpleados().remove(this.estadoempleado);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoempleados.remove(this.estadoempleado);				
					}
					
					
					((EstadoEmpleadoModel) this.jTableDatosEstadoEmpleado.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoEmpleado(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoEmpleado(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoEmpleado) {
			
			if(this.jInternalFrameDetalleFormEstadoEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoEmpleado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoEmpleado.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleado =(EstadoEmpleado) this.estadoempleadoLogic.getEstadoEmpleados().toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoempleado =(EstadoEmpleado) this.estadoempleados.toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoEmpleado(this.estadoempleado);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoEmpleado("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoEmpleado(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoEmpleado() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoEmpleado(EstadoEmpleado estadoempleado) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoEmpleado(estadoempleado,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoEmpleado(EstadoEmpleado estadoempleado,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoEmpleado(estadoempleado);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoEmpleado(estadoempleado,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoEmpleado(estadoempleado);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoEmpleado(EstadoEmpleado estadoempleado) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoEmpleado.jLabelidEstadoEmpleado.setText(estadoempleado.getId().toString());
			this.jInternalFrameDetalleFormEstadoEmpleado.jTextFieldcodigoEstadoEmpleado.setText(estadoempleado.getcodigo());
			this.jInternalFrameDetalleFormEstadoEmpleado.jTextAreanombreEstadoEmpleado.setText(estadoempleado.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoEmpleado estadoempleadoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadoempleadoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoEmpleado estadoempleadoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadoempleadoLocal=this.estadoempleado;
			} else {
				estadoempleadoLocal=this.estadoempleadoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadoempleadoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoEmpleado(estadoempleadoLocal,true);
					
					if(estadoempleadoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadoempleadoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadoempleadoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoEmpleado(EstadoEmpleado estadoempleado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoEmpleado(estadoempleado,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoEmpleado(estadoempleado);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoEmpleado(EstadoEmpleado estadoempleado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoEmpleado(estadoempleado,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoEmpleado(EstadoEmpleado estadoempleado,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoEmpleado.jLabelidEstadoEmpleado.getText()==null || this.jInternalFrameDetalleFormEstadoEmpleado.jLabelidEstadoEmpleado.getText()=="" || this.jInternalFrameDetalleFormEstadoEmpleado.jLabelidEstadoEmpleado.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoEmpleado.jLabelidEstadoEmpleado.setText("0");
			}

			if(conColumnasBase) {estadoempleado.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoEmpleado.jLabelidEstadoEmpleado.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoEmpleadoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoEmpleado.jLabelIdEstadoEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoempleado.setcodigo(this.jInternalFrameDetalleFormEstadoEmpleado.jTextFieldcodigoEstadoEmpleado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoEmpleadoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoEmpleado.jLabelcodigoEstadoEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoempleado.setnombre(this.jInternalFrameDetalleFormEstadoEmpleado.jTextAreanombreEstadoEmpleado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoEmpleadoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoEmpleado.jLabelnombreEstadoEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoEmpleado(EstadoEmpleado estadoempleadoBean,EstadoEmpleado estadoempleado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoEmpleado(EstadoEmpleado estadoempleadoOrigen,EstadoEmpleado estadoempleado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoempleadoOrigen.getId()!=null && !estadoempleadoOrigen.getId().equals(0L))) {estadoempleado.setId(estadoempleadoOrigen.getId());}}
			if(conDefault || (!conDefault && estadoempleadoOrigen.getcodigo()!=null && !estadoempleadoOrigen.getcodigo().equals(""))) {estadoempleado.setcodigo(estadoempleadoOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadoempleadoOrigen.getnombre()!=null && !estadoempleadoOrigen.getnombre().equals(""))) {estadoempleado.setnombre(estadoempleadoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoEmpleado(EstadoEmpleado estadoempleado) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoEmpleado.jLabelidEstadoEmpleado.setText(estadoempleado.getId().toString());
			this.jInternalFrameDetalleFormEstadoEmpleado.jTextFieldcodigoEstadoEmpleado.setText(estadoempleado.getcodigo());
			this.jInternalFrameDetalleFormEstadoEmpleado.jTextAreanombreEstadoEmpleado.setText(estadoempleado.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoEmpleado(EstadoEmpleadoBean estadoempleadoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoEmpleado.jLabelidEstadoEmpleado.setText(estadoempleadoBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoEmpleado.jTextFieldcodigoEstadoEmpleado.setText(estadoempleadoBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoEmpleado.jTextAreanombreEstadoEmpleado.setText(estadoempleadoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoEmpleado(EstadoEmpleadoParameterReturnGeneral estadoempleadoReturnGeneral,EstadoEmpleadoBean estadoempleadoBean,Boolean conDefault) throws Exception { 
		try {
			EstadoEmpleado estadoempleadoLocal=new EstadoEmpleado();
			
			estadoempleadoLocal=estadoempleadoReturnGeneral.getEstadoEmpleado();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoempleadoLocal.getId()!=null && !estadoempleadoLocal.getId().equals(0L))) {estadoempleadoBean.setId(estadoempleadoLocal.getId());}}
			if(conDefault || (!conDefault && estadoempleadoLocal.getcodigo()!=null && !estadoempleadoLocal.getcodigo().equals(""))) {estadoempleadoBean.setcodigo(estadoempleadoLocal.getcodigo());}
			if(conDefault || (!conDefault && estadoempleadoLocal.getnombre()!=null && !estadoempleadoLocal.getnombre().equals(""))) {estadoempleadoBean.setnombre(estadoempleadoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoEmpleadoGenerico(Long idEstadoEmpleadoSeleccionado,JComboBox jComboBoxEstadoEmpleado,List<EstadoEmpleado> estadoempleadosLocal)throws Exception {
		try {
			EstadoEmpleado  estadoempleadoTemp=null;

			for(EstadoEmpleado estadoempleadoAux:estadoempleadosLocal) {
				if(estadoempleadoAux.getId()!=null && estadoempleadoAux.getId().equals(idEstadoEmpleadoSeleccionado)) {
					estadoempleadoTemp=estadoempleadoAux;
					break;
				}
			}

			jComboBoxEstadoEmpleado.setSelectedItem(estadoempleadoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoEmpleadoGenerico(JComboBox jComboBoxEstadoEmpleado,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoEmpleado.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoEmpleado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoEmpleado.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoEmpleado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Empleado")) {
			jButtonEmpleadoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("CierreRolMensual")) {
			jButtonCierreRolMensualActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoempleado=(EstadoEmpleado) estadoempleadoLogic.getEstadoEmpleados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoempleado =(EstadoEmpleado) estadoempleados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoEmpleado estadoempleadoRow=new EstadoEmpleado();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoempleadoRow=(EstadoEmpleado) estadoempleadoLogic.getEstadoEmpleados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoempleadoRow=(EstadoEmpleado) estadoempleados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonEmpleadoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoEmpleado estadoempleado) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoEmpleado==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleadoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoempleado = (EstadoEmpleado)this.estadoempleadoLogic.getEstadoEmpleados().toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadoempleado = (EstadoEmpleado)this.estadoempleados.toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadoempleado!=null) {
						this.estadoempleado = estadoempleado;
					} else {
						this.estadoempleado = new EstadoEmpleado();
					}
				}

				if(this.isTienePermisosEmpleado && this.permiteMantenimiento(this.estadoempleado)) {
					EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFramePopup=new EmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						empleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFramePopup;
					} else {
						empleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame;
					}

					List<EstadoEmpleado> estadoempleados=new ArrayList<EstadoEmpleado>();
					estadoempleados.add(this.estadoempleado);
					if(!esRelacionado) {
						//empleadoBeanSwingJInternalFrame.empleadoSessionBean.setConGuardarRelaciones(false);
						//empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					empleadoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoEmpleado.cargarEmpleadoBeanSwingJInternalFrame(estadoempleados,this.estadoempleado,empleadoBeanSwingJInternalFrame,/*conInicializar,*/empleadoBeanSwingJInternalFrame.empleadoSessionBean.getConGuardarRelaciones(),empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado());
					empleadoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("no_relacionado");

						empleadoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(EmpleadoConstantesFunciones.ITAMANIOFILATABLA + (EmpleadoConstantesFunciones.ITAMANIOFILATABLA/2));

						empleadoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoEmpleado=(TitledBorder)this.jScrollPanelDatosEstadoEmpleado.getBorder();
						TitledBorder titledBorderEmpleado=(TitledBorder)empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

						titledBorderEmpleado.setTitle(titledBorderEstadoEmpleado.getTitle() + " -> Empleado");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,empleadoBeanSwingJInternalFrame);
						}

						empleadoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(empleadoBeanSwingJInternalFrame);

						empleadoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadoempleadoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Empleado",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleadoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleadoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonCierreRolMensualActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoEmpleado estadoempleado) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoEmpleado==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleadoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoempleado = (EstadoEmpleado)this.estadoempleadoLogic.getEstadoEmpleados().toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadoempleado = (EstadoEmpleado)this.estadoempleados.toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadoempleado!=null) {
						this.estadoempleado = estadoempleado;
					} else {
						this.estadoempleado = new EstadoEmpleado();
					}
				}

				if(this.isTienePermisosCierreRolMensual && this.permiteMantenimiento(this.estadoempleado)) {
					CierreRolMensualBeanSwingJInternalFrame cierrerolmensualBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFramePopup=new CierreRolMensualBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cierrerolmensualBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFramePopup;
					} else {
						cierrerolmensualBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame;
					}

					List<EstadoEmpleado> estadoempleados=new ArrayList<EstadoEmpleado>();
					estadoempleados.add(this.estadoempleado);
					if(!esRelacionado) {
						//cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualSessionBean.setConGuardarRelaciones(false);
						//cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cierrerolmensualBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoEmpleado.cargarCierreRolMensualBeanSwingJInternalFrame(estadoempleados,this.estadoempleado,cierrerolmensualBeanSwingJInternalFrame,/*conInicializar,*/cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualSessionBean.getConGuardarRelaciones(),cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualSessionBean.getEsGuardarRelacionado());
					cierrerolmensualBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cierrerolmensualBeanSwingJInternalFrame.actualizarEstadoPanelsCierreRolMensual("no_relacionado");

						cierrerolmensualBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CierreRolMensualConstantesFunciones.ITAMANIOFILATABLA + (CierreRolMensualConstantesFunciones.ITAMANIOFILATABLA/2));

						cierrerolmensualBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoEmpleado=(TitledBorder)this.jScrollPanelDatosEstadoEmpleado.getBorder();
						TitledBorder titledBorderCierreRolMensual=(TitledBorder)cierrerolmensualBeanSwingJInternalFrame.jScrollPanelDatosCierreRolMensual.getBorder();

						titledBorderCierreRolMensual.setTitle(titledBorderEstadoEmpleado.getTitle() + " -> Cierre Rol Mensual");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cierrerolmensualBeanSwingJInternalFrame);
						}

						cierrerolmensualBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cierrerolmensualBeanSwingJInternalFrame);

						cierrerolmensualBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadoempleadoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cierre Rol Mensual",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleadoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleadoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoEmpleado(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoEmpleado.setVisible((this.isVisibilidadCeldaNuevoEstadoEmpleado && this.isPermisoNuevoEstadoEmpleado));			
			this.jButtonDuplicarEstadoEmpleado.setVisible((this.isVisibilidadCeldaDuplicarEstadoEmpleado && this.isPermisoDuplicarEstadoEmpleado));			
			this.jButtonCopiarEstadoEmpleado.setVisible((this.isVisibilidadCeldaCopiarEstadoEmpleado && this.isPermisoCopiarEstadoEmpleado));
			this.jButtonVerFormEstadoEmpleado.setVisible((this.isVisibilidadCeldaVerFormEstadoEmpleado && this.isPermisoVerFormEstadoEmpleado));
			
			this.jButtonAbrirOrderByEstadoEmpleado.setVisible((this.isVisibilidadCeldaOrdenEstadoEmpleado && this.isPermisoOrdenEstadoEmpleado));			
			
			this.jButtonNuevoRelacionesEstadoEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoEmpleado && this.isPermisoNuevoEstadoEmpleado));			
			this.jButtonNuevoGuardarCambiosEstadoEmpleado.setVisible((this.isVisibilidadCeldaNuevoEstadoEmpleado && this.isPermisoNuevoEstadoEmpleado && this.isPermisoGuardarCambiosEstadoEmpleado));
			
			if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) {
			this.jInternalFrameDetalleFormEstadoEmpleado.jButtonModificarEstadoEmpleado.setVisible((this.isVisibilidadCeldaModificarEstadoEmpleado && this.isPermisoActualizarEstadoEmpleado));	
			this.jInternalFrameDetalleFormEstadoEmpleado.jButtonActualizarEstadoEmpleado.setVisible((this.isVisibilidadCeldaActualizarEstadoEmpleado && this.isPermisoActualizarEstadoEmpleado));	
			this.jInternalFrameDetalleFormEstadoEmpleado.jButtonEliminarEstadoEmpleado.setVisible((this.isVisibilidadCeldaEliminarEstadoEmpleado && this.isPermisoEliminarEstadoEmpleado));
			this.jInternalFrameDetalleFormEstadoEmpleado.jButtonCancelarEstadoEmpleado.setVisible(this.isVisibilidadCeldaCancelarEstadoEmpleado);							
			this.jInternalFrameDetalleFormEstadoEmpleado.jButtonGuardarCambiosEstadoEmpleado.setVisible((this.isVisibilidadCeldaGuardarEstadoEmpleado && this.isPermisoGuardarCambiosEstadoEmpleado));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoEmpleado && this.isPermisoGuardarCambiosEstadoEmpleado));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoEmpleado.setVisible((this.isVisibilidadCeldaNuevoEstadoEmpleado && this.isPermisoNuevoEstadoEmpleado));						
			this.jButtonDuplicarToolBarEstadoEmpleado.setVisible((this.isVisibilidadCeldaDuplicarEstadoEmpleado && this.isPermisoDuplicarEstadoEmpleado));						
			this.jButtonCopiarToolBarEstadoEmpleado.setVisible((this.isVisibilidadCeldaCopiarEstadoEmpleado && this.isPermisoCopiarEstadoEmpleado));			
			this.jButtonVerFormToolBarEstadoEmpleado.setVisible((this.isVisibilidadCeldaVerFormEstadoEmpleado && this.isPermisoVerFormEstadoEmpleado));			
			this.jButtonAbrirOrderByToolBarEstadoEmpleado.setVisible((this.isVisibilidadCeldaOrdenEstadoEmpleado && this.isPermisoOrdenEstadoEmpleado));
			this.jButtonNuevoRelacionesToolBarEstadoEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoEmpleado && this.isPermisoNuevoEstadoEmpleado));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoEmpleado.setVisible((this.isVisibilidadCeldaNuevoEstadoEmpleado && this.isPermisoNuevoEstadoEmpleado && this.isPermisoGuardarCambiosEstadoEmpleado));			
			
			if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) {
			this.jInternalFrameDetalleFormEstadoEmpleado.jButtonModificarToolBarEstadoEmpleado.setVisible((this.isVisibilidadCeldaModificarEstadoEmpleado && this.isPermisoActualizarEstadoEmpleado));	
			this.jInternalFrameDetalleFormEstadoEmpleado.jButtonActualizarToolBarEstadoEmpleado.setVisible((this.isVisibilidadCeldaActualizarEstadoEmpleado  && this.isPermisoActualizarEstadoEmpleado));	
			this.jInternalFrameDetalleFormEstadoEmpleado.jButtonEliminarToolBarEstadoEmpleado.setVisible((this.isVisibilidadCeldaEliminarEstadoEmpleado && this.isPermisoEliminarEstadoEmpleado));
			this.jInternalFrameDetalleFormEstadoEmpleado.jButtonCancelarToolBarEstadoEmpleado.setVisible(this.isVisibilidadCeldaCancelarEstadoEmpleado);				
			this.jInternalFrameDetalleFormEstadoEmpleado.jButtonGuardarCambiosToolBarEstadoEmpleado.setVisible((this.isVisibilidadCeldaGuardarEstadoEmpleado && this.isPermisoGuardarCambiosEstadoEmpleado));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoEmpleado && this.isPermisoGuardarCambiosEstadoEmpleado));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoEmpleado.setVisible((this.isVisibilidadCeldaNuevoEstadoEmpleado && this.isPermisoNuevoEstadoEmpleado));			
			this.jMenuItemDuplicarEstadoEmpleado.setVisible((this.isVisibilidadCeldaDuplicarEstadoEmpleado && this.isPermisoDuplicarEstadoEmpleado));			
			this.jMenuItemCopiarEstadoEmpleado.setVisible((this.isVisibilidadCeldaCopiarEstadoEmpleado && this.isPermisoCopiarEstadoEmpleado));			
			this.jMenuItemVerFormEstadoEmpleado.setVisible((this.isVisibilidadCeldaVerFormEstadoEmpleado && this.isPermisoVerFormEstadoEmpleado));			
			this.jMenuItemAbrirOrderByEstadoEmpleado.setVisible((this.isVisibilidadCeldaOrdenEstadoEmpleado && this.isPermisoOrdenEstadoEmpleado));			
			//this.jMenuItemMostrarOcultarEstadoEmpleado.setVisible((this.isVisibilidadCeldaOrdenEstadoEmpleado && this.isPermisoOrdenEstadoEmpleado));
			this.jMenuItemDetalleAbrirOrderByEstadoEmpleado.setVisible((this.isVisibilidadCeldaOrdenEstadoEmpleado && this.isPermisoOrdenEstadoEmpleado));			
			//this.jMenuItemDetalleMostrarOcultarEstadoEmpleado.setVisible((this.isVisibilidadCeldaOrdenEstadoEmpleado && this.isPermisoOrdenEstadoEmpleado));			
			this.jMenuItemNuevoRelacionesEstadoEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoEmpleado && this.isPermisoNuevoEstadoEmpleado));			
			this.jMenuItemNuevoGuardarCambiosEstadoEmpleado.setVisible((this.isVisibilidadCeldaNuevoEstadoEmpleado && this.isPermisoNuevoEstadoEmpleado && this.isPermisoGuardarCambiosEstadoEmpleado));									
			
			if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) {
			this.jInternalFrameDetalleFormEstadoEmpleado.jMenuItemModificarEstadoEmpleado.setVisible((this.isVisibilidadCeldaModificarEstadoEmpleado && this.isPermisoActualizarEstadoEmpleado));	
			this.jInternalFrameDetalleFormEstadoEmpleado.jMenuItemActualizarEstadoEmpleado.setVisible((this.isVisibilidadCeldaActualizarEstadoEmpleado && this.isPermisoActualizarEstadoEmpleado));	
			this.jInternalFrameDetalleFormEstadoEmpleado.jMenuItemEliminarEstadoEmpleado.setVisible((this.isVisibilidadCeldaEliminarEstadoEmpleado && this.isPermisoEliminarEstadoEmpleado));
			this.jInternalFrameDetalleFormEstadoEmpleado.jMenuItemCancelarEstadoEmpleado.setVisible(this.isVisibilidadCeldaCancelarEstadoEmpleado);				
			}
			
			this.jMenuItemGuardarCambiosEstadoEmpleado.setVisible((this.isVisibilidadCeldaGuardarEstadoEmpleado && this.isPermisoGuardarCambiosEstadoEmpleado));						
			this.jMenuItemGuardarCambiosTablaEstadoEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoEmpleado && this.isPermisoGuardarCambiosEstadoEmpleado));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoEmpleado=this.jButtonNuevoEstadoEmpleado.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoEmpleado=this.jButtonDuplicarEstadoEmpleado.isVisible();
			this.isVisibilidadCeldaCopiarEstadoEmpleado=this.jButtonCopiarEstadoEmpleado.isVisible();
			this.isVisibilidadCeldaVerFormEstadoEmpleado=this.jButtonVerFormEstadoEmpleado.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoEmpleado=this.jButtonAbrirOrderByEstadoEmpleado.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoEmpleado=this.jButtonNuevoRelacionesEstadoEmpleado.isVisible();
			this.isVisibilidadCeldaModificarEstadoEmpleado=this.jButtonModificarEstadoEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) {
			this.isVisibilidadCeldaActualizarEstadoEmpleado=this.jInternalFrameDetalleFormEstadoEmpleado.jButtonActualizarEstadoEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarEstadoEmpleado=this.jInternalFrameDetalleFormEstadoEmpleado.jButtonEliminarEstadoEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarEstadoEmpleado=this.jInternalFrameDetalleFormEstadoEmpleado.jButtonCancelarEstadoEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarEstadoEmpleado=this.jInternalFrameDetalleFormEstadoEmpleado.jButtonGuardarCambiosEstadoEmpleado.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoEmpleado=this.jButtonGuardarCambiosTablaEstadoEmpleado.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoEmpleado=this.jButtonNuevoToolBarEstadoEmpleado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoEmpleado=this.jButtonNuevoRelacionesToolBarEstadoEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) {
			this.isVisibilidadCeldaModificarEstadoEmpleado=this.jInternalFrameDetalleFormEstadoEmpleado.jButtonModificarToolBarEstadoEmpleado.isVisible();
			this.isVisibilidadCeldaActualizarEstadoEmpleado=this.jInternalFrameDetalleFormEstadoEmpleado.jButtonActualizarToolBarEstadoEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarEstadoEmpleado=this.jInternalFrameDetalleFormEstadoEmpleado.jButtonEliminarToolBarEstadoEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarEstadoEmpleado=this.jInternalFrameDetalleFormEstadoEmpleado.jButtonCancelarToolBarEstadoEmpleado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoEmpleado=this.jButtonGuardarCambiosToolBarEstadoEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoEmpleado=this.jButtonGuardarCambiosTablaToolBarEstadoEmpleado.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoEmpleado=this.jMenuItemNuevoEstadoEmpleado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoEmpleado=this.jMenuItemNuevoRelacionesEstadoEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) {
			this.isVisibilidadCeldaModificarEstadoEmpleado=this.jInternalFrameDetalleFormEstadoEmpleado.jMenuItemModificarEstadoEmpleado.isVisible();
			this.isVisibilidadCeldaActualizarEstadoEmpleado=this.jInternalFrameDetalleFormEstadoEmpleado.jMenuItemActualizarEstadoEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarEstadoEmpleado=this.jInternalFrameDetalleFormEstadoEmpleado.jMenuItemEliminarEstadoEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarEstadoEmpleado=this.jInternalFrameDetalleFormEstadoEmpleado.jMenuItemCancelarEstadoEmpleado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoEmpleado=this.jMenuItemGuardarCambiosEstadoEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoEmpleado=this.jMenuItemGuardarCambiosTablaEstadoEmpleado.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoEmpleado(Boolean esInicializar) {
		if(EstadoEmpleadoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadoempleadoSessionBean.getConGuardarRelaciones()) {
				//if(this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoEmpleado();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoEmpleado(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoEmpleado() {
		this.jButtonNuevoEstadoEmpleado.setVisible(this.isPermisoNuevoEstadoEmpleado);			
		this.jButtonDuplicarEstadoEmpleado.setVisible(this.isPermisoDuplicarEstadoEmpleado);			
		this.jButtonCopiarEstadoEmpleado.setVisible(this.isPermisoCopiarEstadoEmpleado);			
		this.jButtonVerFormEstadoEmpleado.setVisible(this.isPermisoVerFormEstadoEmpleado);			
		
		this.jButtonAbrirOrderByEstadoEmpleado.setVisible(this.isPermisoOrdenEstadoEmpleado);					
		
		this.jButtonNuevoRelacionesEstadoEmpleado.setVisible(this.isPermisoNuevoEstadoEmpleado);			
		
		if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoEmpleado.jButtonModificarEstadoEmpleado.setVisible(this.isPermisoActualizarEstadoEmpleado);	
			this.jInternalFrameDetalleFormEstadoEmpleado.jButtonActualizarEstadoEmpleado.setVisible(this.isPermisoActualizarEstadoEmpleado);	
			this.jInternalFrameDetalleFormEstadoEmpleado.jButtonEliminarEstadoEmpleado.setVisible(this.isPermisoEliminarEstadoEmpleado);
			this.jInternalFrameDetalleFormEstadoEmpleado.jButtonCancelarEstadoEmpleado.setVisible(this.isVisibilidadCeldaCancelarEstadoEmpleado);						
			this.jInternalFrameDetalleFormEstadoEmpleado.jButtonGuardarCambiosEstadoEmpleado.setVisible(this.isPermisoGuardarCambiosEstadoEmpleado);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoEmpleado.setVisible(this.isPermisoActualizarEstadoEmpleado);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoEmpleado() {
		this.jInternalFrameDetalleFormEstadoEmpleado.jButtonModificarEstadoEmpleado.setVisible(this.isPermisoActualizarEstadoEmpleado);	
		this.jInternalFrameDetalleFormEstadoEmpleado.jButtonActualizarEstadoEmpleado.setVisible(this.isPermisoActualizarEstadoEmpleado);	
		this.jInternalFrameDetalleFormEstadoEmpleado.jButtonEliminarEstadoEmpleado.setVisible(this.isPermisoEliminarEstadoEmpleado);
		this.jInternalFrameDetalleFormEstadoEmpleado.jButtonCancelarEstadoEmpleado.setVisible(this.isVisibilidadCeldaCancelarEstadoEmpleado);							
		this.jInternalFrameDetalleFormEstadoEmpleado.jButtonGuardarCambiosEstadoEmpleado.setVisible((this.isVisibilidadCeldaGuardarEstadoEmpleado && this.isPermisoGuardarCambiosEstadoEmpleado));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoEmpleado() {
		if(EstadoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoEmpleado();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoEmpleado() {
	}
	
	public void jTableDatosEstadoEmpleadoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoEmpleado(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoEmpleado(this.getestadoempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoEmpleado(this.estadoempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoempleado =(EstadoEmpleado) this.estadoempleadoLogic.getEstadoEmpleados().toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoempleado =(EstadoEmpleado) this.estadoempleados.toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoempleado==null) {
						this.estadoempleado = new EstadoEmpleado();
					}

					this.setVariablesFormularioToObjetoActualEstadoEmpleado(this.estadoempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoEmpleado(this.estadoempleado);
				}

				if(this.estadoempleado.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadoempleado.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoEmpleado(this.getestadoempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoEmpleado(this.estadoempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoempleado =(EstadoEmpleado) this.estadoempleadoLogic.getEstadoEmpleados().toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoempleado =(EstadoEmpleado) this.estadoempleados.toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoempleado==null) {
						this.estadoempleado = new EstadoEmpleado();
					}

					this.setVariablesFormularioToObjetoActualEstadoEmpleado(this.estadoempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoEmpleado(this.estadoempleado);
				}

				if(this.estadoempleado.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadoempleado.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoEmpleado(this.getestadoempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoEmpleado(this.estadoempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoempleado =(EstadoEmpleado) this.estadoempleadoLogic.getEstadoEmpleados().toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoempleado =(EstadoEmpleado) this.estadoempleados.toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoempleado==null) {
						this.estadoempleado = new EstadoEmpleado();
					}

					this.setVariablesFormularioToObjetoActualEstadoEmpleado(this.estadoempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoEmpleado(this.estadoempleado);
				}

				if(this.estadoempleado.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadoempleado.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoEmpleado() {
		if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) {
			this.jInternalFrameDetalleFormEstadoEmpleado.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoEmpleado.dispose();
			this.jInternalFrameDetalleFormEstadoEmpleado=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoEmpleado!=null) {
			this.jInternalFrameReporteDinamicoEstadoEmpleado.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoEmpleado.dispose();
			this.jInternalFrameReporteDinamicoEstadoEmpleado=null;
		}
		
		if(this.jInternalFrameImportacionEstadoEmpleado!=null) {
			this.jInternalFrameImportacionEstadoEmpleado.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoEmpleado.dispose();
			this.jInternalFrameImportacionEstadoEmpleado=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoEmpleado();
			
			EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoEmpleado")) {
				jButtonNuevoEstadoEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoEmpleado")) {
				jButtonDuplicarEstadoEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoEmpleado")) {
				jButtonCopiarEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoEmpleado")) {
				jButtonVerFormEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoEmpleado")) {
				jButtonNuevoEstadoEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoEmpleado")) {
				jButtonDuplicarEstadoEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoEmpleado")) {
				jButtonNuevoEstadoEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoEmpleado")) {
				jButtonDuplicarEstadoEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoEmpleado")) {
				jButtonNuevoEstadoEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoEmpleado")) {
				jButtonNuevoEstadoEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoEmpleado")) {
				jButtonNuevoEstadoEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoEmpleado")) {
				jButtonModificarEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoEmpleado")) {
				jButtonModificarEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoEmpleado")) {
				jButtonModificarEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoEmpleado")) {
				jButtonActualizarEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoEmpleado")) {
				jButtonActualizarEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoEmpleado")) {
				jButtonActualizarEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoEmpleado")) {
				jButtonEliminarEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoEmpleado")) {
				jButtonEliminarEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoEmpleado")) {
				jButtonEliminarEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoEmpleado")) {
				jButtonCancelarEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoEmpleado")) {
				jButtonCancelarEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoEmpleado")) {
				jButtonCancelarEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoEmpleado")) {
				jButtonCerrarEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoEmpleado")) {
				jButtonCerrarEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoEmpleado")) {
				jButtonCerrarEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoEmpleado")) {
				jButtonMostrarOcultarEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoEmpleado")) {
				jButtonCancelarEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoEmpleado")) {
				jButtonGuardarCambiosEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoEmpleado")) {
				jButtonGuardarCambiosEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoEmpleado")) {
				jButtonCopiarEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoEmpleado")) {
				jButtonVerFormEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoEmpleado")) {
				jButtonGuardarCambiosEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoEmpleado")) {
				jButtonCopiarEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoEmpleado")) {
				jButtonVerFormEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoEmpleado")) {
				jButtonGuardarCambiosEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoEmpleado")) {
				jButtonGuardarCambiosEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoEmpleado")) {
				jButtonGuardarCambiosEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoEmpleado")) {
				jButtonRecargarInformacionEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoEmpleado")) {
				jButtonRecargarInformacionEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoEmpleado")) {
				jButtonRecargarInformacionEstadoEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoEmpleado")) {
				jButtonAnterioresEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoEmpleado")) {
				jButtonAnterioresEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoEmpleado")) {
				jButtonAnterioresEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoEmpleado")) {
				jButtonSiguientesEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoEmpleado")) {
				jButtonSiguientesEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoEmpleado")) {
				jButtonSiguientesEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoEmpleado") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoEmpleado")) {
				jButtonAbrirOrderByEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoEmpleado") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoEmpleado")) {
				jButtonMostrarOcultarEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoEmpleado")) {
				jButtonNuevoGuardarCambiosEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoEmpleado")) {
				jButtonNuevoGuardarCambiosEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoEmpleado")) {
				jButtonNuevoGuardarCambiosEstadoEmpleadoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoEmpleado")) {
				jButtonCerrarReporteDinamicoEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoEmpleado")) {
				jButtonGenerarReporteDinamicoEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoEmpleado")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoEmpleado")) {
				jButtonCerrarImportacionEstadoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoEmpleado")) {
				
				jButtonGenerarImportacionEstadoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoEmpleado")) {
				
				jButtonAbrirImportacionEstadoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoEmpleado")) {
				jComboBoxTiposAccionesEstadoEmpleadoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoEmpleado")) {
				jComboBoxTiposRelacionesEstadoEmpleadoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoEmpleado")) {
				jComboBoxTiposAccionesEstadoEmpleadoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoEmpleado")) {
				
				jComboBoxTiposSeleccionarEstadoEmpleadoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoEmpleado")) {
				jTextFieldValorCampoGeneralEstadoEmpleadoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoEmpleado")) {
				jButtonAbrirOrderByEstadoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoEmpleado")) {
				jButtonAbrirOrderByEstadoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoEmpleado")) {
				jButtonCerrarOrderByEstadoEmpleadoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoEmpleadoBusqueda")) {
				this.jButtonidEstadoEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoEmpleadoBusqueda")) {
				this.jButtoncodigoEstadoEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoEmpleadoBusqueda")) {
				this.jButtonnombreEstadoEmpleadoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoEmpleado();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoEmpleadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoempleado);
				
				EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
				
				


				
				EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoEmpleado estadoempleadoLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadoempleadoLocal=this.estadoempleado;
			} else {
				estadoempleadoLocal=this.estadoempleadoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoempleado);
				
				EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
							
				
				


				
				EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleadoAnterior =(EstadoEmpleado) this.estadoempleadoLogic.getEstadoEmpleados().toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoempleadoAnterior =(EstadoEmpleado) this.estadoempleados.toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
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
			
			EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
			
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
			
			


			
			EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoEmpleadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoempleado);
				
				EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
								
						
				


				
				EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoEmpleado.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoempleado);
				
				EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
								
				
				


				
				EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleadoAnterior =(EstadoEmpleado) this.estadoempleadoLogic.getEstadoEmpleados().toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoempleadoAnterior =(EstadoEmpleado) this.estadoempleados.toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoempleado);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleadoAnterior =(EstadoEmpleado) this.estadoempleadoLogic.getEstadoEmpleados().toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoempleadoAnterior =(EstadoEmpleado) this.estadoempleados.toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoEmpleadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoempleado);
				
				EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
							
				
				


				
				EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoEmpleado.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoEmpleadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoEmpleado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoempleadoAnterior =(EstadoEmpleado) this.estadoempleadoLogic.getEstadoEmpleados().toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoempleadoAnterior =(EstadoEmpleado) this.estadoempleados.toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
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
			
			EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
			
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
			
			


			
			EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoEmpleadoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoempleado);
				
				EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
								
				
				


				
				EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleadoAnterior =(EstadoEmpleado) this.estadoempleadoLogic.getEstadoEmpleados().toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoempleadoAnterior =(EstadoEmpleado) this.estadoempleados.toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoEmpleadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoEmpleadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoempleado);
				
				EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoEmpleado")) {
					jCheckBoxSeleccionarTodosEstadoEmpleadoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoEmpleado")) {
					jCheckBoxSeleccionadosEstadoEmpleadoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoEmpleado")) {
					
				}
				
				


				
				
				EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoempleado);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadoempleado);
				
				EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
												
				
				


				
				
				EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoEmpleadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoEmpleado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoempleadoAnterior =(EstadoEmpleado) this.estadoempleadoLogic.getEstadoEmpleados().toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoempleadoAnterior =(EstadoEmpleado) this.estadoempleados.toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoEmpleadoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoempleado);
				
				EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
				
				
				EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
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
			
			EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
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
			
			


			
			EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoEmpleadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoempleado);
				
				EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoEmpleado.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoEmpleado.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoempleado);
				
				EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
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
				
				


				
				EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoEmpleado.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoempleadoAnterior =(EstadoEmpleado) this.estadoempleadoLogic.getEstadoEmpleados().toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoempleadoAnterior =(EstadoEmpleado) this.estadoempleados.toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoEmpleado")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoEmpleadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoEmpleado.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadoempleado =(EstadoEmpleado) this.estadoempleadoLogic.getEstadoEmpleados().toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadoempleado =(EstadoEmpleado) this.estadoempleados.toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadoempleado);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoEmpleado")) {
				
				}
				
				EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoEmpleado")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoEmpleado.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoEmpleado")) {
			
			}
			
			EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoEmpleado();
			
			EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoEmpleado")) {
				jButtonNuevoEstadoEmpleadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoEmpleado")) {
				jButtonDuplicarEstadoEmpleadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoEmpleado")) {
				jButtonCopiarEstadoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoEmpleado")) {
				jButtonVerFormEstadoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoEmpleado")) {
				jButtonNuevoEstadoEmpleadoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoEmpleado")) {
				jButtonModificarEstadoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoEmpleado")) {
				jButtonActualizarEstadoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoEmpleado")) {
				jButtonEliminarEstadoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoEmpleado")) {
				jButtonGuardarCambiosEstadoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoEmpleado")) {
				jButtonCancelarEstadoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoEmpleado")) {
				jButtonCerrarEstadoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoEmpleado")) {
				jButtonGuardarCambiosEstadoEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoEmpleado")) {
				jButtonNuevoGuardarCambiosEstadoEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoEmpleado")) {
				jButtonAbrirOrderByEstadoEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoEmpleado")) {
				jButtonRecargarInformacionEstadoEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoEmpleado")) {
				jButtonAnterioresEstadoEmpleadoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoEmpleado")) {
				jButtonSiguientesEstadoEmpleadoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoEmpleadoBusqueda")) {
				this.jButtonidEstadoEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoEmpleadoBusqueda")) {
				this.jButtoncodigoEstadoEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoEmpleadoBusqueda")) {
				this.jButtonnombreEstadoEmpleadoBusquedaActionPerformed(evt);
			}
			
			EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoEmpleado();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoEmpleado")) {
				closingInternalFrameEstadoEmpleado();
				
			} else if(sTipo.equals("jButtonCancelarEstadoEmpleado")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoEmpleado = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoEmpleadoBeanSwingJInternalFrame jInternalFrameParent=(EstadoEmpleadoBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoEmpleado.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoEmpleadoActionPerformed(null);
			}
			
			EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadoempleado,new Object(),this.estadoempleadoParameterGeneral,this.estadoempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoEmpleado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoEmpleado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoEmpleado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadoempleado)) {
			if(!esControlTabla) {
				if(EstadoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoEmpleado(this.estadoempleado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoEmpleado(this.estadoempleado);			
				}
				
				if(this.estadoempleadoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoEmpleado(this.estadoempleado,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoempleadoReturnGeneral=estadoempleadoLogic.procesarEventosEstadoEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoempleadoLogic.getEstadoEmpleados(),this.estadoempleado,this.estadoempleadoParameterGeneral,this.isEsNuevoEstadoEmpleado,classes);//this.estadoempleadoLogic.getEstadoEmpleado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoEmpleado(this.estadoempleadoReturnGeneral,this.estadoempleadoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadoempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoEmpleado(classes,this.estadoempleadoReturnGeneral,this.estadoempleadoBean,false);
					}
						
					if(this.estadoempleadoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoEmpleado(this.estadoempleadoReturnGeneral.getEstadoEmpleado());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoEmpleado(this.estadoempleadoReturnGeneral.getEstadoEmpleado());	
					}
						
					if(this.estadoempleadoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoEmpleado(this.estadoempleadoReturnGeneral.getEstadoEmpleado(),classes);//this.estadoempleadoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoEmpleado(this.estadoempleado,classes);//this.estadoempleadoBean);									
				}
			
				if(EstadoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoEmpleado(this.estadoempleado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoEmpleado(this.estadoempleado);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadoempleadoAnterior!=null) {
						this.estadoempleado=this.estadoempleadoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoempleadoReturnGeneral=estadoempleadoLogic.procesarEventosEstadoEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoempleadoLogic.getEstadoEmpleados(),this.estadoempleado,this.estadoempleadoParameterGeneral,this.isEsNuevoEstadoEmpleado,classes);//this.estadoempleadoLogic.getEstadoEmpleado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoempleadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoempleadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadoempleadoReturnGeneral.getEstadoEmpleado(),estadoempleadoLogic.getEstadoEmpleados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadoempleadoReturnGeneral.getEstadoEmpleado(),this.estadoempleados);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoEmpleado.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoEmpleado.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoEmpleado();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoEmpleado() throws Exception {
		
		EstadoEmpleadoModel estadoempleadoModel=(EstadoEmpleadoModel)this.jTableDatosEstadoEmpleado.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoempleadoModel.estadoempleados=this.estadoempleadoLogic.getEstadoEmpleados();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadoempleadoModel.estadoempleados=this.estadoempleados;
		}
		
		
		((EstadoEmpleadoModel) this.jTableDatosEstadoEmpleado.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoEmpleado() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadoempleadoAnterior(),this.estadoempleadoLogic.getEstadoEmpleados());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadoempleadoAnterior(),this.estadoempleados);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoEmpleado();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoEmpleado(EstadoEmpleado estadoempleado,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(estadoempleado.getEmpleados());
					this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CierreRolMensual.class)) {
					this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualLogic.setCierreRolMensuals(estadoempleado.getCierreRolMensuals());
					this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.inicializarActualizarBindingTablaCierreRolMensual(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
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
										
				EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoempleado,new Object(),generalEntityParameterGeneral,this.estadoempleadoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadoempleadoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoEmpleadoConstantesFunciones.getClassesRelationshipsOfEstadoEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoEmpleadoConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoEmpleado(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoEmpleado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoempleado,new Object(),generalEntityParameterGeneral,this.estadoempleadoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoEmpleado(EstadoEmpleadoBean estadoempleadoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(estadoempleado.getEmpleados());
					this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CierreRolMensual.class)) {
					this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualLogic.setCierreRolMensuals(estadoempleado.getCierreRolMensuals());
					this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.inicializarActualizarBindingTablaCierreRolMensual(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoEmpleado(ArrayList<Classe> classes,EstadoEmpleadoReturnGeneral estadoempleadoReturnGeneral,EstadoEmpleadoBean estadoempleadoBean,Boolean conDefault) throws Exception {
		
			this.estadoempleadoBean.setEmpleados(estadoempleadoReturnGeneral.getEstadoEmpleado().getEmpleados());
			this.estadoempleadoBean.setCierreRolMensuals(estadoempleadoReturnGeneral.getEstadoEmpleado().getCierreRolMensuals());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoEmpleado(EstadoEmpleado estadoempleado,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					estadoempleado.setEmpleados(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CierreRolMensual.class)) {
					estadoempleado.setCierreRolMensuals(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualLogic.getCierreRolMensuals());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.estadoempleado)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoEmpleado = new EstadoEmpleadoDetalleFormJInternalFrame(jDesktopPane,this.estadoempleadoSessionBean.getConGuardarRelaciones(),this.estadoempleadoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoEmpleado);
		this.jInternalFrameDetalleFormEstadoEmpleado.setVisible(false);
		this.jInternalFrameDetalleFormEstadoEmpleado.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoEmpleado.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoEmpleado.estadoempleadoLogic=this.estadoempleadoLogic;
		
		this.cargarCombosFrameForeignKeyEstadoEmpleado("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoEmpleado();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoEmpleado();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoEmpleado("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoEmpleado();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoEmpleado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoEmpleado"));
		
		this.jInternalFrameDetalleFormEstadoEmpleado.jButtonModificarEstadoEmpleado.addActionListener(new ButtonActionListener(this,"ModificarEstadoEmpleado"));

		
		this.jInternalFrameDetalleFormEstadoEmpleado.jButtonModificarToolBarEstadoEmpleado.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoEmpleado"));
					
		this.jInternalFrameDetalleFormEstadoEmpleado.jMenuItemModificarEstadoEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoEmpleado.jButtonActualizarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"ActualizarEstadoEmpleado"));
		
		
		this.jInternalFrameDetalleFormEstadoEmpleado.jButtonActualizarToolBarEstadoEmpleado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoEmpleado"));
						
		this.jInternalFrameDetalleFormEstadoEmpleado.jMenuItemActualizarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoEmpleado.jButtonEliminarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"EliminarEstadoEmpleado"));
		
		
		this.jInternalFrameDetalleFormEstadoEmpleado.jButtonEliminarToolBarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoEmpleado"));
								
		this.jInternalFrameDetalleFormEstadoEmpleado.jMenuItemEliminarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoEmpleado.jButtonCancelarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"CancelarEstadoEmpleado"));
		
		
		this.jInternalFrameDetalleFormEstadoEmpleado.jButtonCancelarToolBarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoEmpleado"));
					
		this.jInternalFrameDetalleFormEstadoEmpleado.jMenuItemCancelarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoEmpleado"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoEmpleado.jMenuItemDetalleCerrarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoEmpleado.jButtonGuardarCambiosToolBarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoEmpleado"));
		
		
		
		this.jInternalFrameDetalleFormEstadoEmpleado.jButtonGuardarCambiosToolBarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoEmpleado"));
		
		
		
		this.jInternalFrameDetalleFormEstadoEmpleado.jComboBoxTiposAccionesFormularioEstadoEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoEmpleado"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoEmpleado.jButtonidEstadoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoEmpleado.jButtoncodigoEstadoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoEmpleado.jButtonnombreEstadoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoEmpleadoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoEmpleado.jTabbedPaneRelacionesEstadoEmpleado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoEmpleado"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoEmpleado"));
		
		if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoEmpleado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoEmpleado"));
		}
		
		this.jTableDatosEstadoEmpleado.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoEmpleado"));
		
		this.jTableDatosEstadoEmpleado.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoEmpleado"));
		
		this.jButtonNuevoEstadoEmpleado.addActionListener(new ButtonActionListener(this,"NuevoEstadoEmpleado"));
		
		this.jButtonDuplicarEstadoEmpleado.addActionListener(new ButtonActionListener(this,"DuplicarEstadoEmpleado"));
		
		this.jButtonCopiarEstadoEmpleado.addActionListener(new ButtonActionListener(this,"CopiarEstadoEmpleado"));
		
		this.jButtonVerFormEstadoEmpleado.addActionListener(new ButtonActionListener(this,"VerFormEstadoEmpleado"));
		
		
		this.jButtonNuevoToolBarEstadoEmpleado.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoEmpleado"));
			
		this.jButtonDuplicarToolBarEstadoEmpleado.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoEmpleado"));
			
		this.jMenuItemNuevoEstadoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoEmpleado"));
			
		this.jMenuItemDuplicarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoEmpleado"));		
		
		
		this.jButtonNuevoRelacionesEstadoEmpleado.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoEmpleado"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoEmpleado.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoEmpleado"));
			
		this.jMenuItemNuevoRelacionesEstadoEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoEmpleado"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoEmpleado.jButtonModificarEstadoEmpleado.addActionListener(new ButtonActionListener(this,"ModificarEstadoEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoEmpleado.jButtonModificarToolBarEstadoEmpleado.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoEmpleado"));
			
			this.jInternalFrameDetalleFormEstadoEmpleado.jMenuItemModificarEstadoEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoEmpleado.jButtonActualizarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"ActualizarEstadoEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoEmpleado.jButtonActualizarToolBarEstadoEmpleado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoEmpleado"));
				
			this.jInternalFrameDetalleFormEstadoEmpleado.jMenuItemActualizarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoEmpleado.jButtonEliminarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"EliminarEstadoEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoEmpleado.jButtonEliminarToolBarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoEmpleado"));
						
			this.jInternalFrameDetalleFormEstadoEmpleado.jMenuItemEliminarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoEmpleado.jButtonCancelarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"CancelarEstadoEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoEmpleado.jButtonCancelarToolBarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoEmpleado"));
			
			this.jInternalFrameDetalleFormEstadoEmpleado.jMenuItemCancelarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoEmpleado"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoEmpleado"));		
		
		
		this.jButtonCerrarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"CerrarEstadoEmpleado"));
		
		
		this.jButtonCerrarToolBarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoEmpleado"));
			
		this.jMenuItemCerrarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoEmpleado"));
			
		if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoEmpleado.jMenuItemDetalleCerrarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoEmpleado.jButtonGuardarCambiosEstadoEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoEmpleado.jButtonGuardarCambiosToolBarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoEmpleado"));
		}
		
		this.jButtonCopiarToolBarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoEmpleado"));
			
		this.jButtonVerFormToolBarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoEmpleado"));
		
		this.jMenuItemGuardarCambiosEstadoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoEmpleado"));
			
		this.jMenuItemCopiarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoEmpleado"));		
		
		this.jMenuItemVerFormEstadoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoEmpleado"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoEmpleado"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoEmpleado"));
			
		this.jMenuItemGuardarCambiosTablaEstadoEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoEmpleado"));		
		
		
		
		this.jButtonRecargarInformacionEstadoEmpleado.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoEmpleado"));
					
		this.jButtonRecargarInformacionToolBarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoEmpleado"));
		
		this.jMenuItemRecargarInformacionEstadoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoEmpleado"));		
		
		
		
		this.jButtonAnterioresEstadoEmpleado.addActionListener (new ButtonActionListener(this,"AnterioresEstadoEmpleado"));
		
		
		this.jButtonAnterioresToolBarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoEmpleado"));
		
		this.jMenuItemAnterioresEstadoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoEmpleado"));		
		
		
		this.jButtonSiguientesEstadoEmpleado.addActionListener (new ButtonActionListener(this,"SiguientesEstadoEmpleado"));
		
		
		this.jButtonSiguientesToolBarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoEmpleado"));
			
		this.jMenuItemSiguientesEstadoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoEmpleado"));
			
		this.jMenuItemAbrirOrderByEstadoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoEmpleado"));
			
		this.jMenuItemMostrarOcultarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoEmpleado"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoEmpleado"));
			
		this.jMenuItemDetalleMostarOcultarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoEmpleado"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoEmpleado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoEmpleado"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoEmpleado"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoEmpleado"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoEmpleado.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoEmpleado"));

		this.jCheckBoxSeleccionadosEstadoEmpleado.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoEmpleado"));
		
		if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoEmpleado.jComboBoxTiposAccionesFormularioEstadoEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoEmpleado"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoEmpleado.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoEmpleado"));
			
		this.jComboBoxTiposAccionesEstadoEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoEmpleado"));
					
		this.jComboBoxTiposSeleccionarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoEmpleado"));
			
		this.jTextFieldValorCampoGeneralEstadoEmpleado.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoEmpleado"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoEmpleado.jButtonidEstadoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoEmpleado.jButtoncodigoEstadoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoEmpleado.jButtonnombreEstadoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoEmpleadoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoEmpleado!=null) {
				this.jInternalFrameReporteDinamicoEstadoEmpleado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoEmpleado"));
				this.jInternalFrameReporteDinamicoEstadoEmpleado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoEmpleado"));
				this.jInternalFrameReporteDinamicoEstadoEmpleado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoEmpleado"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoEmpleado.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoEmpleado"));				
			//this.jButtonGenerarReporteDinamicoEstadoEmpleado.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoEmpleado"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoEmpleado.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoEmpleado"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoEmpleado!=null) {
				this.jInternalFrameImportacionEstadoEmpleado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoEmpleado"));
				this.jInternalFrameImportacionEstadoEmpleado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoEmpleado"));
				this.jInternalFrameImportacionEstadoEmpleado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoEmpleado"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoEmpleado.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoEmpleado"));
			
			this.jButtonAbrirOrderByToolBarEstadoEmpleado.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoEmpleado"));			
			
			if(this.jInternalFrameOrderByEstadoEmpleado!=null) {
				this.jInternalFrameOrderByEstadoEmpleado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoEmpleado"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoEmpleado.jTabbedPaneRelacionesEstadoEmpleado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoEmpleado"));
		
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
            		closingInternalFrameEstadoEmpleado();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoEmpleado.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoEmpleado = (JInternalFrameBase)event.getSource();
	            	
	            EstadoEmpleadoBeanSwingJInternalFrame jInternalFrameParent=(EstadoEmpleadoBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoEmpleado.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoEmpleadoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoEmpleado.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoEmpleadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoEmpleado.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoEmpleado.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoEmpleado";
		inputMap = this.jButtonNuevoEstadoEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoEmpleadoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoEmpleado";
		inputMap = this.jButtonNuevoRelacionesEstadoEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoEmpleadoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoEmpleado";
		inputMap = this.jButtonModificarEstadoEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoEmpleado";
		inputMap = this.jButtonActualizarEstadoEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoEmpleado";
		inputMap = this.jButtonEliminarEstadoEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoEmpleado";
		inputMap = this.jButtonCancelarEstadoEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoEmpleado";
		inputMap = this.jButtonCerrarEstadoEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoEmpleado.jButtonGuardarCambiosEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoEmpleado";
		inputMap = this.jInternalFrameDetalleFormEstadoEmpleado.jButtonGuardarCambiosEstadoEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoEmpleado.jButtonGuardarCambiosEstadoEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoEmpleado.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoEmpleadoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoEmpleado.jButtonidEstadoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoEmpleado.jButtoncodigoEstadoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoEmpleado.jButtonnombreEstadoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoEmpleadoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoEmpleadoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoEmpleado.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoEmpleado(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoEmpleado estadoempleadoAux:this.estadoempleadoLogic.getEstadoEmpleados()) {
					estadoempleadoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoEmpleado estadoempleadoAux:estadoempleados) {
					estadoempleadoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoEmpleadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoEmpleado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoEmpleado estadoempleadoAux:this.estadoempleadoLogic.getEstadoEmpleados()) {
						estadoempleadoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoEmpleado estadoempleadoAux:estadoempleados) {
						estadoempleadoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoEmpleado estadoempleadoAux:this.estadoempleadoLogic.getEstadoEmpleados()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoEmpleado estadoempleadoAux:estadoempleados) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoEmpleado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoEmpleado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoEmpleado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoEmpleado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoEmpleadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoEmpleado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoEmpleado.getSelectedRows();
			
			EstadoEmpleado estadoempleadoLocal=new EstadoEmpleado();
			
			//this.seleccionarTodosEstadoEmpleado(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoempleadoLocal =(EstadoEmpleado) this.estadoempleadoLogic.getEstadoEmpleados().toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadoempleadoLocal =(EstadoEmpleado) this.estadoempleados.toArray()[this.jTableDatosEstadoEmpleado.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadoempleadoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoEmpleado estadoempleadoAux:this.estadoempleadoLogic.getEstadoEmpleados()) {
						estadoempleadoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoEmpleado estadoempleadoAux:estadoempleados) {
						estadoempleadoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoEmpleado(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoEmpleado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoEmpleado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoEmpleado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoEmpleadoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoEmpleadoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoEmpleadoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoEmpleado(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoEmpleado.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoEmpleado estadoempleadoAux:this.estadoempleadoLogic.getEstadoEmpleados()) {
				
						if(sTipoSeleccionar.equals(EstadoEmpleadoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadoempleadoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoEmpleadoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoempleadoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoEmpleado estadoempleadoAux:estadoempleados) {
					
						if(sTipoSeleccionar.equals(EstadoEmpleadoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadoempleadoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoEmpleadoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoempleadoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoEmpleado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoEmpleadoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoEmpleado(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoEmpleado=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoEmpleado.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoEmpleado.jComboBoxTiposAccionesFormularioEstadoEmpleado.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoEmpleado) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoEmpleado(conSplash);
				
					this.generarReporteEstadoEmpleadosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoEmpleado.jComboBoxTiposAccionesFormularioEstadoEmpleado.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoEmpleadosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoEmpleado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoEmpleadosSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoEmpleado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoEmpleadosSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoEmpleado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoEmpleado();
				
				this.exportarEstadoEmpleadosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoEmpleado.jComboBoxTiposAccionesFormularioEstadoEmpleado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoEmpleados();
				//this.importarEstadoEmpleados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoEmpleado.jComboBoxTiposAccionesFormularioEstadoEmpleado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoEmpleado();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoEmpleadosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoEmpleado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoEmpleado();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoEmpleado)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoEmpleado(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Empleado",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoEmpleado.jComboBoxTiposAccionesFormularioEstadoEmpleado.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadoEmpleadoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadoEmpleado) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadoEmpleado(conSplash);
					
						//this.actualizarParametrosGeneralEstadoEmpleado();
						
						this.generarReporteProcesoAccionEstadoEmpleadosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadoEmpleado.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadoEmpleado.jComboBoxTiposAccionesFormularioEstadoEmpleado.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadoEmpleadoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estado EmpleadoS SELECCIONADOS?", "MANTENIMIENTO DE Estado Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadoEmpleado();
				
						this.actualizarParametrosGeneralEstadoEmpleado();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadoempleadoReturnGeneral=estadoempleadoLogic.procesarAccionEstadoEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadoempleadoLogic.getEstadoEmpleados(),this.estadoempleadoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadoEmpleadoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoEmpleado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoEmpleado.jComboBoxTiposAccionesFormularioEstadoEmpleado.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoEmpleado();
					
					EstadoEmpleadoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadoEmpleadoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoEmpleado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoEmpleado.jComboBoxTiposAccionesFormularioEstadoEmpleado.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoEmpleado(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoEmpleadoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoEmpleado();
			
			if(this.jInternalFrameDetalleFormEstadoEmpleado==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoEmpleado> estadoempleadosSeleccionados=new ArrayList<EstadoEmpleado>();		
			EstadoEmpleado estadoempleado=new EstadoEmpleado();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoEmpleado(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoEmpleado.getSelectedItem();
			
			
			
			
			estadoempleadosSeleccionados=this.getEstadoEmpleadosSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadoempleadosSeleccionados.size()==1) {
				for(EstadoEmpleado estadoempleadoAux:estadoempleadosSeleccionados) {
					estadoempleado=estadoempleadoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Empleado")) {
					jButtonEmpleadoActionPerformed(null,rowIndex,true,false,estadoempleado);
				}
				else if(this.sTipoRelacion.equals("Cierre Rol Mensual")) {
					jButtonCierreRolMensualActionPerformed(null,rowIndex,true,false,estadoempleado);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoEmpleado();
			
      		//this.finishProcessEstadoEmpleado(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoEmpleadoReturnGeneral() throws Exception {
		if(this.estadoempleadoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadoempleadoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadoempleadoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadoempleadoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadoempleadoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadoempleadoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoEmpleado(false);
		}
		
		if(this.estadoempleadoReturnGeneral.getConRetornoLista() || this.estadoempleadoReturnGeneral.getConRetornoObjeto()) {
			if(this.estadoempleadoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoempleadoLogic.setEstadoEmpleados(this.estadoempleadoReturnGeneral.getEstadoEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadoempleadoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoempleadoLogic.setEstadoEmpleado(this.estadoempleadoReturnGeneral.getEstadoEmpleado());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoEmpleado(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoEmpleado() throws Exception {
		
		
	}
	
	public ArrayList<EstadoEmpleado> getEstadoEmpleadosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoEmpleado> estadoempleadosSeleccionados=new ArrayList<EstadoEmpleado>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoEmpleado) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoEmpleado estadoempleadoAux:estadoempleadoLogic.getEstadoEmpleados()) {
					if(estadoempleadoAux.getIsSelected()) {
						estadoempleadosSeleccionados.add(estadoempleadoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoEmpleado estadoempleadoAux:this.estadoempleados) {
					if(estadoempleadoAux.getIsSelected()) {
						estadoempleadosSeleccionados.add(estadoempleadoAux);				
					}
				}
			}
			
			if(estadoempleadosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadoempleadosSeleccionados.addAll(this.estadoempleadoLogic.getEstadoEmpleados());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadoempleadosSeleccionados.addAll(this.estadoempleados);				
					}
				}
			}
		} else {
			estadoempleadosSeleccionados.add(this.estadoempleado);
		}
		
		return estadoempleadosSeleccionados;
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
	
	public void generarReporteEstadoEmpleadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoEmpleadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoEmpleadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoEmpleadosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoEmpleadosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoEmpleadosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Empleado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoEmpleadosSeleccionados() throws Exception {
		ArrayList<EstadoEmpleado> estadoempleadosSeleccionados=new ArrayList<EstadoEmpleado>();		
		
		estadoempleadosSeleccionados=this.getEstadoEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoEmpleados("Todos",estadoempleadosSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoEmpleadosSeleccionados() throws Exception {
		ArrayList<EstadoEmpleado> estadoempleadosSeleccionados=new ArrayList<EstadoEmpleado>();		
		
		estadoempleadosSeleccionados=this.getEstadoEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoEmpleados("Todos",estadoempleadosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoEmpleadosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoEmpleado> estadoempleadosSeleccionados=new ArrayList<EstadoEmpleado>();
		
		estadoempleadosSeleccionados=this.getEstadoEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoEmpleados("Todos",estadoempleadosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoEmpleadosSeleccionados() throws Exception {
		ArrayList<EstadoEmpleado> estadoempleadosSeleccionados=new ArrayList<EstadoEmpleado>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoEmpleado();
		
		
		estadoempleadosSeleccionados=this.getEstadoEmpleadosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoEmpleado();
		
		
		//this.generarReporteEstadoEmpleados("Todos",estadoempleadosSeleccionados ,estadoempleadoImplementable,estadoempleadoImplementableHome);
	}
	
	public void mostrarImportacionEstadoEmpleados() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoEmpleado();
		
		this.abrirFrameImportacionEstadoEmpleado();		
		
			
		//this.generarReporteEstadoEmpleados("Todos",estadoempleadosSeleccionados ,estadoempleadoImplementable,estadoempleadoImplementableHome);
	}
	
	public void importarEstadoEmpleados() throws Exception {		
	
	}
	
	public void exportarEstadoEmpleadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoEmpleadosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoEmpleadosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoEmpleadosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Empleado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoEmpleadosSeleccionados() throws Exception {
		ArrayList<EstadoEmpleado> estadoempleadosSeleccionados=new ArrayList<EstadoEmpleado>();		
		
		estadoempleadosSeleccionados=this.getEstadoEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoempleado."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoEmpleado(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoEmpleado estadoempleadoAux:estadoempleadosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoEmpleado(estadoempleadoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadoempleadoAux.setsDetalleGeneralEntityReporte(estadoempleadoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoEmpleado(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoEmpleadoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoEmpleadoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoEmpleadoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoEmpleadoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoEmpleado(EstadoEmpleado estadoempleado,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadoempleado.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoempleado.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoempleado.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoempleado.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoEmpleadosSeleccionados() throws Exception {
		ArrayList<EstadoEmpleado> estadoempleadosSeleccionados=new ArrayList<EstadoEmpleado>();		
		
		estadoempleadosSeleccionados=this.getEstadoEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoempleado.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoEmpleados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoEmpleado(row);				
				iRow++;
			}				
			
			for(EstadoEmpleado estadoempleadoAux:estadoempleadosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoEmpleado(estadoempleadoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoEmpleadosSeleccionados() throws Exception {
		ArrayList<EstadoEmpleado> estadoempleadosSeleccionados=new ArrayList<EstadoEmpleado>();		
		
		estadoempleadosSeleccionados=this.getEstadoEmpleadosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoempleado.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadoempleados");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadoempleado");
			//elementRoot.appendChild(element);
		
			for(EstadoEmpleado estadoempleadoAux:estadoempleadosSeleccionados) {
				element = document.createElement("estadoempleado");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoEmpleado(estadoempleadoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoEmpleado(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoEmpleadoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoEmpleadoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoEmpleadoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoEmpleadoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoEmpleado(EstadoEmpleado estadoempleado,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadoempleado.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoempleado.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoempleado.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoEmpleado(EstadoEmpleado estadoempleado,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoEmpleadoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadoempleado.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoEmpleadoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadoempleado.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoEmpleadoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadoempleado.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoEmpleadoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadoempleado.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoEmpleadosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoEmpleado> estadoempleadosSeleccionados=new ArrayList<EstadoEmpleado>();
		
		estadoempleadosSeleccionados=this.getEstadoEmpleadosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoEmpleado(estadoempleadosSeleccionados);
		
		this.generarReporteEstadoEmpleados("Todos",estadoempleadosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoEmpleado(ArrayList<EstadoEmpleado> estadoempleadosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoEmpleado estadoempleadoAux:estadoempleadosSeleccionados) {
				estadoempleadoAux.setsDetalleGeneralEntityReporte(estadoempleadoAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoEmpleadoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadoempleadoAux.setsDescripcionGeneralEntityReporte1(estadoempleadoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoEmpleadoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadoempleadoAux.setsDescripcionGeneralEntityReporte1(estadoempleadoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoEmpleado(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoEmpleado=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoEmpleado=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoEmpleado=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoEmpleado=false;
			this.isVisibilidadCeldaActualizarEstadoEmpleado=false;
			this.isVisibilidadCeldaEliminarEstadoEmpleado=false;
			this.isVisibilidadCeldaCancelarEstadoEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoEmpleado=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoEmpleado=false;
			this.isVisibilidadCeldaModificarEstadoEmpleado=false;
			this.isVisibilidadCeldaActualizarEstadoEmpleado=true;
			this.isVisibilidadCeldaEliminarEstadoEmpleado=false;
			this.isVisibilidadCeldaCancelarEstadoEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoEmpleado=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoEmpleado=false;
			this.isVisibilidadCeldaModificarEstadoEmpleado=false;
			this.isVisibilidadCeldaActualizarEstadoEmpleado=true;
			this.isVisibilidadCeldaEliminarEstadoEmpleado=true;
			this.isVisibilidadCeldaCancelarEstadoEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoEmpleado=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoEmpleado=false;
			this.isVisibilidadCeldaModificarEstadoEmpleado=false;
			this.isVisibilidadCeldaActualizarEstadoEmpleado=true;
			this.isVisibilidadCeldaEliminarEstadoEmpleado=false;
			this.isVisibilidadCeldaCancelarEstadoEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoEmpleado=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoEmpleado=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoEmpleado=true;
			this.isVisibilidadCeldaModificarEstadoEmpleado=false;
			this.isVisibilidadCeldaActualizarEstadoEmpleado=false;
			this.isVisibilidadCeldaEliminarEstadoEmpleado=false;
			this.isVisibilidadCeldaCancelarEstadoEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoEmpleado=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoEmpleado=false;
			this.isVisibilidadCeldaActualizarEstadoEmpleado=false;
			this.isVisibilidadCeldaEliminarEstadoEmpleado=false;
			this.isVisibilidadCeldaCancelarEstadoEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoEmpleado=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoEmpleado=false;
			this.isVisibilidadCeldaModificarEstadoEmpleado=true;
			this.isVisibilidadCeldaActualizarEstadoEmpleado=false;
			this.isVisibilidadCeldaEliminarEstadoEmpleado=false;
			this.isVisibilidadCeldaCancelarEstadoEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoEmpleado=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoEmpleadoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoEmpleado=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoEmpleado=true;
		} else {
			this.actualizarEstadoPanelsEstadoEmpleado(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoEmpleado=false;
			//this.isVisibilidadCeldaVerFormEstadoEmpleado=false;
			this.isVisibilidadCeldaDuplicarEstadoEmpleado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadoempleadoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoEmpleado=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoEmpleado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadoempleadoSessionBean.getEsGuardarRelacionado()) {
			if(!estadoempleadoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoEmpleado=false;												
			}
			
			this.jButtonCerrarEstadoEmpleado.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoEmpleado=false;
		}
		
		if(!this.permiteMantenimiento(this.estadoempleado)) {
			this.isVisibilidadCeldaActualizarEstadoEmpleado=false;
			this.isVisibilidadCeldaEliminarEstadoEmpleado=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoEmpleado() {
		this.isVisibilidadCeldaNuevoEstadoEmpleado=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoEmpleado=false;
	}
	
	public void actualizarEstadoPanelsEstadoEmpleado(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoEmpleado!=null) {
				this.jScrollPanelDatosEdicionEstadoEmpleado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoEmpleado!=null) {
				this.jScrollPanelDatosEstadoEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoEmpleado!=null) {
				this.jPanelPaginacionEstadoEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoEmpleado!=null) {
				this.jPanelParametrosReportesEstadoEmpleado.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoEmpleado!=null) {
				this.jScrollPanelDatosEdicionEstadoEmpleado.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoEmpleado!=null) {
				this.jScrollPanelDatosEstadoEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoEmpleado!=null) {
				this.jPanelPaginacionEstadoEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoEmpleado!=null) {
				this.jPanelParametrosReportesEstadoEmpleado.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoEmpleado!=null) {
				this.jScrollPanelDatosEdicionEstadoEmpleado.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoEmpleado!=null) {
				this.jScrollPanelDatosEstadoEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoEmpleado!=null) {
				this.jPanelPaginacionEstadoEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoEmpleado!=null) {
				this.jPanelParametrosReportesEstadoEmpleado.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoEmpleado!=null) {
				this.jScrollPanelDatosEdicionEstadoEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoEmpleado!=null) {
				this.jScrollPanelDatosEstadoEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoEmpleado!=null) {
				this.jPanelPaginacionEstadoEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoEmpleado!=null) {
				this.jPanelParametrosReportesEstadoEmpleado.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoEmpleado!=null) {
				this.jScrollPanelDatosEdicionEstadoEmpleado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoEmpleado!=null) {
				this.jScrollPanelDatosEstadoEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoEmpleado!=null) {
				this.jPanelPaginacionEstadoEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoEmpleado!=null) {
				this.jPanelParametrosReportesEstadoEmpleado.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoEmpleado!=null) {
				this.jScrollPanelDatosEdicionEstadoEmpleado.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoEmpleado!=null) {
				this.jScrollPanelDatosEstadoEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoEmpleado!=null) {
				this.jPanelPaginacionEstadoEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoEmpleado!=null) {
				this.jPanelParametrosReportesEstadoEmpleado.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoEmpleado!=null) {
				this.jScrollPanelDatosEdicionEstadoEmpleado.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoEmpleado!=null) {
				this.jScrollPanelDatosEstadoEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoEmpleado!=null) {
				this.jPanelPaginacionEstadoEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoEmpleado!=null) {
				this.jPanelParametrosReportesEstadoEmpleado.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadoempleadoSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoEmpleadoParaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(this.estadoempleadoSessionBean==null) {
				this.estadoempleadoSessionBean=new EstadoEmpleadoSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoEmpleado.empleadoSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoEmpleado.empleadoSessionBean=new EmpleadoSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoEmpleado.empleadoSessionBean.setsPathNavegacionActual(estadoempleadoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoEmpleado.empleadoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupEmpleado=this.jInternalFrameDetalleFormEstadoEmpleado.empleadoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoEmpleado.empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			this.jInternalFrameDetalleFormEstadoEmpleado.empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(EstadoEmpleadoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoEmpleado.empleadoSessionBean.setisBusquedaDesdeForeignKeySesionEstadoEmpleado(true);
			this.jInternalFrameDetalleFormEstadoEmpleado.empleadoSessionBean.setlidEstadoEmpleadoActual(this.idEstadoEmpleadoActual);

			estadoempleadoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoEmpleado(true);
			estadoempleadoSessionBean.setlIdEstadoEmpleadoActualForeignKey(this.idEstadoEmpleadoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionEstadoEmpleadoParaCierreRolMensuales() throws Exception {
		Boolean isPaginaPopupCierreRolMensual=false;

		try {

			if(this.estadoempleadoSessionBean==null) {
				this.estadoempleadoSessionBean=new EstadoEmpleadoSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualSessionBean=new CierreRolMensualSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualSessionBean.setsPathNavegacionActual(estadoempleadoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCierreRolMensual=this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCierreRolMensual(true);
			this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCierreRolMensual(EstadoEmpleadoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualSessionBean.setisBusquedaDesdeForeignKeySesionEstadoEmpleado(true);
			this.jInternalFrameDetalleFormEstadoEmpleado.cierrerolmensualSessionBean.setlidEstadoEmpleadoActual(this.idEstadoEmpleadoActual);

			estadoempleadoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoEmpleado(true);
			estadoempleadoSessionBean.setlIdEstadoEmpleadoActualForeignKey(this.idEstadoEmpleadoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoEmpleadoSessionBean estadoempleadoSessionBean=new EstadoEmpleadoSessionBean();
		
		if(this.estadoempleadoSessionBean==null) {
			this.estadoempleadoSessionBean=new EstadoEmpleadoSessionBean();
		}
		
		this.estadoempleadoSessionBean.setsUltimaBusquedaEstadoEmpleado(this.getsAccionBusqueda());
		this.estadoempleadoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadoempleadoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoEmpleadoSessionBean estadoempleadoSessionBean=new EstadoEmpleadoSessionBean();
		
		if(this.estadoempleadoSessionBean==null) {
			this.estadoempleadoSessionBean=new EstadoEmpleadoSessionBean();
		}
		
		if(this.estadoempleadoSessionBean.getsUltimaBusquedaEstadoEmpleado()!=null&&!this.estadoempleadoSessionBean.getsUltimaBusquedaEstadoEmpleado().equals("")) {
			this.setsAccionBusqueda(estadoempleadoSessionBean.getsUltimaBusquedaEstadoEmpleado());
			this.setiNumeroPaginacion(estadoempleadoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadoempleadoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadoempleadoSessionBean.setsUltimaBusquedaEstadoEmpleado("");
		this.estadoempleadoSessionBean.setiNumeroPaginacion(EstadoEmpleadoConstantesFunciones.INUMEROPAGINACION);
		this.estadoempleadoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoEmpleado(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoEmpleado() {
		this.updateBorderResaltarBusquedasFormularioEstadoEmpleado();
		this.updateVisibilidadBusquedasFormularioEstadoEmpleado();
		this.updateHabilitarBusquedasFormularioEstadoEmpleado();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoEmpleado() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoEmpleado() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoEmpleado() {
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
	
	public void updateControlesFormularioEstadoEmpleado() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoEmpleado==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoEmpleado();
		this.updateVisibilidadResaltarControlesFormularioEstadoEmpleado();
		this.updateHabilitarResaltarControlesFormularioEstadoEmpleado();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoEmpleado() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadoempleadoConstantesFunciones.resaltaridEstadoEmpleado!=null && this.jInternalFrameDetalleFormEstadoEmpleado!=null) {this.jInternalFrameDetalleFormEstadoEmpleado.jLabelidEstadoEmpleado.setBorder(this.estadoempleadoConstantesFunciones.resaltaridEstadoEmpleado);}
		if(this.estadoempleadoConstantesFunciones.resaltarcodigoEstadoEmpleado!=null && this.jInternalFrameDetalleFormEstadoEmpleado!=null) {this.jInternalFrameDetalleFormEstadoEmpleado.jTextFieldcodigoEstadoEmpleado.setBorder(this.estadoempleadoConstantesFunciones.resaltarcodigoEstadoEmpleado);}
		if(this.estadoempleadoConstantesFunciones.resaltarnombreEstadoEmpleado!=null && this.jInternalFrameDetalleFormEstadoEmpleado!=null) {this.jInternalFrameDetalleFormEstadoEmpleado.jTextAreanombreEstadoEmpleado.setBorder(this.estadoempleadoConstantesFunciones.resaltarnombreEstadoEmpleado);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoEmpleado() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) {
	
		//this.jInternalFrameDetalleFormEstadoEmpleado.jLabelidEstadoEmpleado.setVisible(this.estadoempleadoConstantesFunciones.mostraridEstadoEmpleado);
		this.jInternalFrameDetalleFormEstadoEmpleado.jPanelidEstadoEmpleado.setVisible(this.estadoempleadoConstantesFunciones.mostraridEstadoEmpleado);
		//this.jInternalFrameDetalleFormEstadoEmpleado.jTextFieldcodigoEstadoEmpleado.setVisible(this.estadoempleadoConstantesFunciones.mostrarcodigoEstadoEmpleado);
		this.jInternalFrameDetalleFormEstadoEmpleado.jPanelcodigoEstadoEmpleado.setVisible(this.estadoempleadoConstantesFunciones.mostrarcodigoEstadoEmpleado);
		//this.jInternalFrameDetalleFormEstadoEmpleado.jTextAreanombreEstadoEmpleado.setVisible(this.estadoempleadoConstantesFunciones.mostrarnombreEstadoEmpleado);
		this.jInternalFrameDetalleFormEstadoEmpleado.jPanelnombreEstadoEmpleado.setVisible(this.estadoempleadoConstantesFunciones.mostrarnombreEstadoEmpleado);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoEmpleado() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoEmpleado!=null) {
	
		this.jInternalFrameDetalleFormEstadoEmpleado.jLabelidEstadoEmpleado.setEnabled(this.estadoempleadoConstantesFunciones.activaridEstadoEmpleado);
		this.jInternalFrameDetalleFormEstadoEmpleado.jTextFieldcodigoEstadoEmpleado.setEnabled(this.estadoempleadoConstantesFunciones.activarcodigoEstadoEmpleado);
		this.jInternalFrameDetalleFormEstadoEmpleado.jTextAreanombreEstadoEmpleado.setEnabled(this.estadoempleadoConstantesFunciones.activarnombreEstadoEmpleado);
		}
	}
	
		
}