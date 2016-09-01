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

import com.bydan.erp.nomina.util.EstadoGastoEmpleadoConstantesFunciones;
import com.bydan.erp.nomina.util.EstadoGastoEmpleadoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.EstadoGastoEmpleadoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.EstadoGastoEmpleadoBean;
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


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;









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




@SuppressWarnings("unused")
public class EstadoGastoEmpleadoBeanSwingJInternalFrame extends EstadoGastoEmpleadoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoGastoEmpleadoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoGastoEmpleado> estadogastoempleadoValidator = new ClassValidator<EstadoGastoEmpleado>(EstadoGastoEmpleado.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoGastoEmpleado estadogastoempleado;	
	public EstadoGastoEmpleado estadogastoempleadoAux;
	public EstadoGastoEmpleado estadogastoempleadoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoGastoEmpleado estadogastoempleadoTotales;
	public Long idEstadoGastoEmpleadoActual;
	public Long iIdNuevoEstadoGastoEmpleado=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosGastoEmpleado=false;

	public Boolean getIsTienePermisosGastoEmpleado() {
		return isTienePermisosGastoEmpleado;
	}

	public void setIsTienePermisosGastoEmpleado(Boolean isTienePermisosGastoEmpleado) {
		this.isTienePermisosGastoEmpleado= isTienePermisosGastoEmpleado;
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
	
	public Boolean isPermisoTodoEstadoGastoEmpleado;
	public Boolean isPermisoNuevoEstadoGastoEmpleado;
	public Boolean isPermisoActualizarEstadoGastoEmpleado;
	public Boolean isPermisoActualizarOriginalEstadoGastoEmpleado;
	public Boolean isPermisoEliminarEstadoGastoEmpleado;
	public Boolean isPermisoGuardarCambiosEstadoGastoEmpleado;
	public Boolean isPermisoConsultaEstadoGastoEmpleado;
	public Boolean isPermisoBusquedaEstadoGastoEmpleado;
	public Boolean isPermisoReporteEstadoGastoEmpleado;
	public Boolean isPermisoPaginacionMedioEstadoGastoEmpleado;
	public Boolean isPermisoPaginacionAltoEstadoGastoEmpleado;
	public Boolean isPermisoPaginacionTodoEstadoGastoEmpleado;
	public Boolean isPermisoCopiarEstadoGastoEmpleado;
	public Boolean isPermisoVerFormEstadoGastoEmpleado;
	public Boolean isPermisoDuplicarEstadoGastoEmpleado;
	public Boolean isPermisoOrdenEstadoGastoEmpleado;
	
	
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
	
	public EstadoGastoEmpleadoParameterReturnGeneral estadogastoempleadoReturnGeneral;
	public EstadoGastoEmpleadoParameterReturnGeneral estadogastoempleadoParameterGeneral;
	
	

	public GastoEmpleadoLogic gastoempleadoLogic=null;

	public GastoEmpleadoLogic getGastoEmpleadoLogic() {
		return gastoempleadoLogic;
	}

	public void setGastoEmpleadoLogic(GastoEmpleadoLogic gastoempleadoLogic) {
		this.gastoempleadoLogic = gastoempleadoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoGastoEmpleado=false;
	public Boolean esParaAccionDesdeFormularioEstadoGastoEmpleado=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadoGastoEmpleadoSessionBeanAdditional estadogastoempleadoSessionBeanAdditional=null;
	
	public EstadoGastoEmpleadoSessionBeanAdditional getEstadoGastoEmpleadoSessionBeanAdditional() {
		return this.estadogastoempleadoSessionBeanAdditional;
	}
	
	public void setEstadoGastoEmpleadoSessionBeanAdditional(EstadoGastoEmpleadoSessionBeanAdditional estadogastoempleadoSessionBeanAdditional) {
		try {
			this.estadogastoempleadoSessionBeanAdditional=estadogastoempleadoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional estadogastoempleadoBeanSwingJInternalFrameAdditional=null;
	//public class EstadoGastoEmpleadoBeanSwingJInternalFrame
	
	public EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional getEstadoGastoEmpleadoBeanSwingJInternalFrameAdditional() {
		return this.estadogastoempleadoBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadoGastoEmpleadoBeanSwingJInternalFrameAdditional(EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional estadogastoempleadoBeanSwingJInternalFrameAdditional) {
		try {
			this.estadogastoempleadoBeanSwingJInternalFrameAdditional=estadogastoempleadoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoGastoEmpleadoLogic estadogastoempleadoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoGastoEmpleado estadogastoempleadoBean;
	public EstadoGastoEmpleadoConstantesFunciones estadogastoempleadoConstantesFunciones;
	//public EstadoGastoEmpleadoParameterReturnGeneral estadogastoempleadoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoGastoEmpleado> estadogastoempleados;	
	//public List<EstadoGastoEmpleado> estadogastoempleadosEliminados;
	//public List<EstadoGastoEmpleado> estadogastoempleadosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoGastoEmpleado=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoGastoEmpleado=true;
	public Boolean isVisibilidadCeldaCopiarEstadoGastoEmpleado=true;
	public Boolean isVisibilidadCeldaVerFormEstadoGastoEmpleado=true;
	public Boolean isVisibilidadCeldaOrdenEstadoGastoEmpleado=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoGastoEmpleado=false;
	public Boolean isVisibilidadCeldaModificarEstadoGastoEmpleado=false;
	public Boolean isVisibilidadCeldaActualizarEstadoGastoEmpleado=false;
	public Boolean isVisibilidadCeldaEliminarEstadoGastoEmpleado=false;
	public Boolean isVisibilidadCeldaCancelarEstadoGastoEmpleado=false;
	public Boolean isVisibilidadCeldaGuardarEstadoGastoEmpleado=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoGastoEmpleado=false;	
	
	
	
	public Long getiIdNuevoEstadoGastoEmpleado() {
		return this.iIdNuevoEstadoGastoEmpleado;
	}

	public void setiIdNuevoEstadoGastoEmpleado(Long iIdNuevoEstadoGastoEmpleado) {
		this.iIdNuevoEstadoGastoEmpleado = iIdNuevoEstadoGastoEmpleado;
	}
	
	public Long getidEstadoGastoEmpleadoActual() {
		return this.idEstadoGastoEmpleadoActual;
	}

	public void setidEstadoGastoEmpleadoActual(Long idEstadoGastoEmpleadoActual) {
		this.idEstadoGastoEmpleadoActual = idEstadoGastoEmpleadoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoGastoEmpleado getestadogastoempleado() {
		return this.estadogastoempleado;
	}

	public void setestadogastoempleado(EstadoGastoEmpleado estadogastoempleado) {
		this.estadogastoempleado = estadogastoempleado;
	}
	
	public EstadoGastoEmpleado getestadogastoempleadoAux() {
		return this.estadogastoempleadoAux;
	}

	public void setestadogastoempleadoAux(EstadoGastoEmpleado estadogastoempleadoAux) {
		this.estadogastoempleadoAux = estadogastoempleadoAux;
	}				
	
	public EstadoGastoEmpleado getestadogastoempleadoAnterior() {
		return this.estadogastoempleadoAnterior;
	}

	public void setestadogastoempleadoAnterior(EstadoGastoEmpleado estadogastoempleadoAnterior) {
		this.estadogastoempleadoAnterior = estadogastoempleadoAnterior;
	}	
	
	public EstadoGastoEmpleado getestadogastoempleadoTotales() {
		return this.estadogastoempleadoTotales;
	}

	public void setestadogastoempleadoTotales(EstadoGastoEmpleado estadogastoempleadoTotales) {
		this.estadogastoempleadoTotales = estadogastoempleadoTotales;
	}	
	
	public EstadoGastoEmpleado getestadogastoempleadoBean() {
		return this.estadogastoempleadoBean;
	}

	public void setestadogastoempleadoBean(EstadoGastoEmpleado estadogastoempleadoBean) {
		this.estadogastoempleadoBean = estadogastoempleadoBean;
	}	
	
	public EstadoGastoEmpleadoParameterReturnGeneral getestadogastoempleadoReturnGeneral() {
		return this.estadogastoempleadoReturnGeneral;
	}

	public void setestadogastoempleadoReturnGeneral(EstadoGastoEmpleadoParameterReturnGeneral estadogastoempleadoReturnGeneral) {
		this.estadogastoempleadoReturnGeneral = estadogastoempleadoReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoGastoEmpleadoLogic getEstadoGastoEmpleadoLogic()	{		
		return estadogastoempleadoLogic;
	}

	public void setEstadoGastoEmpleadoLogic(EstadoGastoEmpleadoLogic estadogastoempleadoLogic) {
		this.estadogastoempleadoLogic = estadogastoempleadoLogic;
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
	
	public Boolean getIsEsNuevoEstadoGastoEmpleado() {
		return isEsNuevoEstadoGastoEmpleado;
	}

	public void setIsEsNuevoEstadoGastoEmpleado(Boolean isEsNuevoEstadoGastoEmpleado) {
		this.isEsNuevoEstadoGastoEmpleado = isEsNuevoEstadoGastoEmpleado;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoGastoEmpleado() {
		return esParaAccionDesdeFormularioEstadoGastoEmpleado;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoGastoEmpleado(Boolean esParaAccionDesdeFormularioEstadoGastoEmpleado) {
		this.esParaAccionDesdeFormularioEstadoGastoEmpleado = esParaAccionDesdeFormularioEstadoGastoEmpleado;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoGastoEmpleado() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoGastoEmpleadoConstantesFunciones.refrescarForeignKeysDescripcionesEstadoGastoEmpleado(this.estadogastoempleadoLogic.getEstadoGastoEmpleados());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoGastoEmpleadoConstantesFunciones.refrescarForeignKeysDescripcionesEstadoGastoEmpleado(this.estadogastoempleados);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadogastoempleadoLogic.setEstadoGastoEmpleados(this.estadogastoempleados);
			estadogastoempleadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoGastoEmpleadoParameterReturnGeneral getEstadoGastoEmpleadoParameterGeneral() {
		return this.estadogastoempleadoParameterGeneral;
	}
	
	public void setEstadoGastoEmpleadoParameterGeneral(EstadoGastoEmpleadoParameterReturnGeneral estadogastoempleadoParameterGeneral) {
		this.estadogastoempleadoParameterGeneral = estadogastoempleadoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoGastoEmpleado() {
		return isPermisoTodoEstadoGastoEmpleado;
	}

	public void setIsPermisoTodoEstadoGastoEmpleado(Boolean isPermisoTodoEstadoGastoEmpleado) {
		this.isPermisoTodoEstadoGastoEmpleado = isPermisoTodoEstadoGastoEmpleado;
	}

	public Boolean getIsPermisoNuevoEstadoGastoEmpleado() {
		return isPermisoNuevoEstadoGastoEmpleado;
	}

	public void setIsPermisoNuevoEstadoGastoEmpleado(Boolean isPermisoNuevoEstadoGastoEmpleado) {
		this.isPermisoNuevoEstadoGastoEmpleado = isPermisoNuevoEstadoGastoEmpleado;
	}

	public Boolean getIsPermisoActualizarEstadoGastoEmpleado() {
		return isPermisoActualizarEstadoGastoEmpleado;
	}

	public void setIsPermisoActualizarEstadoGastoEmpleado(Boolean isPermisoActualizarEstadoGastoEmpleado) {
		this.isPermisoActualizarEstadoGastoEmpleado = isPermisoActualizarEstadoGastoEmpleado;
	}

	public Boolean getIsPermisoEliminarEstadoGastoEmpleado() {
		return isPermisoEliminarEstadoGastoEmpleado;
	}

	public void setIsPermisoEliminarEstadoGastoEmpleado(Boolean isPermisoEliminarEstadoGastoEmpleado) {
		this.isPermisoEliminarEstadoGastoEmpleado = isPermisoEliminarEstadoGastoEmpleado;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoGastoEmpleado() {
		return isPermisoGuardarCambiosEstadoGastoEmpleado;
	}

	public void setIsPermisoGuardarCambiosEstadoGastoEmpleado(Boolean isPermisoGuardarCambiosEstadoGastoEmpleado) {
		this.isPermisoGuardarCambiosEstadoGastoEmpleado = isPermisoGuardarCambiosEstadoGastoEmpleado;
	}
	
	public Boolean getIsPermisoConsultaEstadoGastoEmpleado() {
		return isPermisoConsultaEstadoGastoEmpleado;
	}

	public void setIsPermisoConsultaEstadoGastoEmpleado(Boolean isPermisoConsultaEstadoGastoEmpleado) {
		this.isPermisoConsultaEstadoGastoEmpleado = isPermisoConsultaEstadoGastoEmpleado;
	}

	public Boolean getIsPermisoBusquedaEstadoGastoEmpleado() {
		return isPermisoBusquedaEstadoGastoEmpleado;
	}

	public void setIsPermisoBusquedaEstadoGastoEmpleado(Boolean isPermisoBusquedaEstadoGastoEmpleado) {
		this.isPermisoBusquedaEstadoGastoEmpleado = isPermisoBusquedaEstadoGastoEmpleado;
	}

	public Boolean getIsPermisoReporteEstadoGastoEmpleado() {
		return isPermisoReporteEstadoGastoEmpleado;
	}

	public void setIsPermisoReporteEstadoGastoEmpleado(Boolean isPermisoReporteEstadoGastoEmpleado) {
		this.isPermisoReporteEstadoGastoEmpleado = isPermisoReporteEstadoGastoEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoGastoEmpleado() {
		return isPermisoPaginacionMedioEstadoGastoEmpleado;
	}

	public void setIsPermisoPaginacionMedioEstadoGastoEmpleado(Boolean isPermisoPaginacionMedioEstadoGastoEmpleado) {
		this.isPermisoPaginacionMedioEstadoGastoEmpleado = isPermisoPaginacionMedioEstadoGastoEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoGastoEmpleado() {
		return isPermisoPaginacionTodoEstadoGastoEmpleado;
	}

	public void setIsPermisoPaginacionTodoEstadoGastoEmpleado(Boolean isPermisoPaginacionTodoEstadoGastoEmpleado) {
		this.isPermisoPaginacionTodoEstadoGastoEmpleado = isPermisoPaginacionTodoEstadoGastoEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoGastoEmpleado() {
		return isPermisoPaginacionAltoEstadoGastoEmpleado;
	}

	public void setIsPermisoPaginacionAltoEstadoGastoEmpleado(Boolean isPermisoPaginacionAltoEstadoGastoEmpleado) {
		this.isPermisoPaginacionAltoEstadoGastoEmpleado = isPermisoPaginacionAltoEstadoGastoEmpleado;
	}
	
	public Boolean getIsPermisoCopiarEstadoGastoEmpleado() {
		return isPermisoCopiarEstadoGastoEmpleado;
	}

	public void setIsPermisoCopiarEstadoGastoEmpleado(Boolean isPermisoCopiarEstadoGastoEmpleado) {
		this.isPermisoCopiarEstadoGastoEmpleado = isPermisoCopiarEstadoGastoEmpleado;
	}
	
	public Boolean getIsPermisoVerFormEstadoGastoEmpleado() {
		return isPermisoVerFormEstadoGastoEmpleado;
	}

	public void setIsPermisoVerFormEstadoGastoEmpleado(Boolean isPermisoVerFormEstadoGastoEmpleado) {
		this.isPermisoVerFormEstadoGastoEmpleado = isPermisoVerFormEstadoGastoEmpleado;
	}
	
	public Boolean getIsPermisoDuplicarEstadoGastoEmpleado() {
		return isPermisoDuplicarEstadoGastoEmpleado;
	}

	public void setIsPermisoDuplicarEstadoGastoEmpleado(Boolean isPermisoDuplicarEstadoGastoEmpleado) {
		this.isPermisoDuplicarEstadoGastoEmpleado = isPermisoDuplicarEstadoGastoEmpleado;
	}
	
	public Boolean getIsPermisoOrdenEstadoGastoEmpleado() {
		return isPermisoOrdenEstadoGastoEmpleado;
	}

	public void setIsPermisoOrdenEstadoGastoEmpleado(Boolean isPermisoOrdenEstadoGastoEmpleado) {
		this.isPermisoOrdenEstadoGastoEmpleado = isPermisoOrdenEstadoGastoEmpleado;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoGastoEmpleado() {
		return isVisibilidadCeldaNuevoEstadoGastoEmpleado;
	}

	public void setIsVisibilidadCeldaNuevoEstadoGastoEmpleado(Boolean isVisibilidadCeldaNuevoEstadoGastoEmpleado) {
		this.isVisibilidadCeldaNuevoEstadoGastoEmpleado = isVisibilidadCeldaNuevoEstadoGastoEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoGastoEmpleado() {
		return isVisibilidadCeldaDuplicarEstadoGastoEmpleado;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoGastoEmpleado(Boolean isVisibilidadCeldaDuplicarEstadoGastoEmpleado) {
		this.isVisibilidadCeldaDuplicarEstadoGastoEmpleado = isVisibilidadCeldaDuplicarEstadoGastoEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoGastoEmpleado() {
		return isVisibilidadCeldaCopiarEstadoGastoEmpleado;
	}

	public void setIsVisibilidadCeldaCopiarEstadoGastoEmpleado(Boolean isVisibilidadCeldaCopiarEstadoGastoEmpleado) {
		this.isVisibilidadCeldaCopiarEstadoGastoEmpleado = isVisibilidadCeldaCopiarEstadoGastoEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoGastoEmpleado() {
		return isVisibilidadCeldaVerFormEstadoGastoEmpleado;
	}

	public void setIsVisibilidadCeldaVerFormEstadoGastoEmpleado(Boolean isVisibilidadCeldaVerFormEstadoGastoEmpleado) {
		this.isVisibilidadCeldaVerFormEstadoGastoEmpleado = isVisibilidadCeldaVerFormEstadoGastoEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoGastoEmpleado() {
		return isVisibilidadCeldaOrdenEstadoGastoEmpleado;
	}

	public void setIsVisibilidadCeldaOrdenEstadoGastoEmpleado(Boolean isVisibilidadCeldaOrdenEstadoGastoEmpleado) {
		this.isVisibilidadCeldaOrdenEstadoGastoEmpleado = isVisibilidadCeldaOrdenEstadoGastoEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoGastoEmpleado() {
		return isVisibilidadCeldaNuevoRelacionesEstadoGastoEmpleado;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoGastoEmpleado(Boolean isVisibilidadCeldaNuevoRelacionesEstadoGastoEmpleado) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoGastoEmpleado = isVisibilidadCeldaNuevoRelacionesEstadoGastoEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoGastoEmpleado() {
		return isVisibilidadCeldaModificarEstadoGastoEmpleado;
	}

	public void setIsVisibilidadCeldaModificarEstadoGastoEmpleado(Boolean isVisibilidadCeldaModificarEstadoGastoEmpleado) {
		this.isVisibilidadCeldaModificarEstadoGastoEmpleado = isVisibilidadCeldaModificarEstadoGastoEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoGastoEmpleado() {
		return isVisibilidadCeldaActualizarEstadoGastoEmpleado;
	}

	public void setIsVisibilidadCeldaActualizarEstadoGastoEmpleado(Boolean isVisibilidadCeldaActualizarEstadoGastoEmpleado) {
		this.isVisibilidadCeldaActualizarEstadoGastoEmpleado = isVisibilidadCeldaActualizarEstadoGastoEmpleado;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoGastoEmpleado() {
		return isVisibilidadCeldaEliminarEstadoGastoEmpleado;
	}

	public void setIsVisibilidadCeldaEliminarEstadoGastoEmpleado(Boolean isVisibilidadCeldaEliminarEstadoGastoEmpleado) {
		this.isVisibilidadCeldaEliminarEstadoGastoEmpleado = isVisibilidadCeldaEliminarEstadoGastoEmpleado;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoGastoEmpleado() {
		return isVisibilidadCeldaCancelarEstadoGastoEmpleado;
	}

	public void setIsVisibilidadCeldaCancelarEstadoGastoEmpleado(Boolean isVisibilidadCeldaCancelarEstadoGastoEmpleado) {
		this.isVisibilidadCeldaCancelarEstadoGastoEmpleado = isVisibilidadCeldaCancelarEstadoGastoEmpleado;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoGastoEmpleado() {
		return isVisibilidadCeldaGuardarEstadoGastoEmpleado;
	}

	public void setIsVisibilidadCeldaGuardarEstadoGastoEmpleado(Boolean isVisibilidadCeldaGuardarEstadoGastoEmpleado) {
		this.isVisibilidadCeldaGuardarEstadoGastoEmpleado = isVisibilidadCeldaGuardarEstadoGastoEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoGastoEmpleado() {
		return isVisibilidadCeldaGuardarCambiosEstadoGastoEmpleado;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoGastoEmpleado(Boolean isVisibilidadCeldaGuardarCambiosEstadoGastoEmpleado) {
		this.isVisibilidadCeldaGuardarCambiosEstadoGastoEmpleado = isVisibilidadCeldaGuardarCambiosEstadoGastoEmpleado;
	}
		
	public EstadoGastoEmpleadoSessionBean getestadogastoempleadoSessionBean() {
		return this.estadogastoempleadoSessionBean;
	}
	
	public void setestadogastoempleadoSessionBean(EstadoGastoEmpleadoSessionBean estadogastoempleadoSessionBean) {
		this.estadogastoempleadoSessionBean=estadogastoempleadoSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoGastoEmpleado(EstadoGastoEmpleado estadogastoempleado)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoGastoEmpleado estadogastoempleado,EstadoGastoEmpleado estadogastoempleadoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoGastoEmpleado(estadogastoempleado);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadogastoempleadoAux.setId(estadogastoempleado.getId());
		estadogastoempleadoAux.setVersionRow(estadogastoempleado.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoGastoEmpleado();
		
			int intSelectedRow = this.jTableDatosEstadoGastoEmpleado.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogastoempleado =(EstadoGastoEmpleado) this.estadogastoempleadoLogic.getEstadoGastoEmpleados().toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadogastoempleado =(EstadoGastoEmpleado) this.estadogastoempleados.toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoGastoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoGastoEmpleado(this.estadogastoempleado,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoGastoEmpleado(this.estadogastoempleado);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadogastoempleadoValidator.getInvalidValues(this.estadogastoempleado);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadogastoempleadoLogic.setDatosCliente(datosCliente);
			estadogastoempleadoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadogastoempleadoAux=new  EstadoGastoEmpleado();
				
				estadogastoempleadoAux.setIsNew(true);
				estadogastoempleadoAux.setIsChanged(true);
				
				estadogastoempleadoAux.setEstadoGastoEmpleadoOriginal(this.estadogastoempleado);
				
				estadogastoempleadoAux.setId(this.estadogastoempleado.getId());	
				estadogastoempleadoAux.setVersionRow(this.estadogastoempleado.getVersionRow());	
				estadogastoempleadoAux.setcodigo(this.estadogastoempleado.getcodigo());	
				estadogastoempleadoAux.setnombre(this.estadogastoempleado.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadogastoempleadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadogastoempleadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadogastoempleadoAux,estadogastoempleadoLogic.getEstadoGastoEmpleados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadogastoempleadoAux,estadogastoempleados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadogastoempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadogastoempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadogastoempleadoLogic.saveEstadoGastoEmpleados();//WithConnection
						//estadogastoempleadoLogic.getSetVersionRowEstadoGastoEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadogastoempleado,estadogastoempleadoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadogastoempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleadoLogic.getGastoEmpleados().addAll(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleados.addAll(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleadosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadogastoempleadoLogic.saveEstadoGastoEmpleadoRelaciones(estadogastoempleadoAux,this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleadoLogic.getGastoEmpleados());//WithConnection
								//estadogastoempleadoLogic.getSetVersionRowEstadoGastoEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadogastoempleado,estadogastoempleadoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleadoLogic.setGastoEmpleados(new ArrayList<GastoEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleados= new ArrayList<GastoEmpleado>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadogastoempleadoAux.setGastoEmpleados(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleadoLogic.getGastoEmpleados());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadogastoempleadoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadogastoempleadoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadogastoempleadoAux,estadogastoempleadoLogic.getEstadoGastoEmpleados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadogastoempleadoAux,estadogastoempleados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadogastoempleado,estadogastoempleadoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadogastoempleadoAux=new  EstadoGastoEmpleado();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadogastoempleadoSessionBean.getEsGuardarRelacionado() 
					|| (this.estadogastoempleadoSessionBean.getEsGuardarRelacionado() && this.estadogastoempleado.getId()>=0)) {
						
					estadogastoempleadoAux.setIsNew(false);
				}
				
				estadogastoempleadoAux.setIsDeleted(false);
			
				estadogastoempleadoAux.setId(this.estadogastoempleado.getId());	
				estadogastoempleadoAux.setVersionRow(this.estadogastoempleado.getVersionRow());	
				estadogastoempleadoAux.setcodigo(this.estadogastoempleado.getcodigo());	
				estadogastoempleadoAux.setnombre(this.estadogastoempleado.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadogastoempleadoAux,estadogastoempleadoLogic.getEstadoGastoEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadogastoempleadoAux,estadogastoempleados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadogastoempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadogastoempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadogastoempleadoLogic.saveEstadoGastoEmpleados();//WithConnection
						//estadogastoempleadoLogic.getSetVersionRowEstadoGastoEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadogastoempleado,estadogastoempleadoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadogastoempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleadoLogic.getGastoEmpleados().addAll(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleados.addAll(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleadosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadogastoempleadoLogic.saveEstadoGastoEmpleadoRelaciones(estadogastoempleadoAux,this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleadoLogic.getGastoEmpleados());//WithConnection
								//estadogastoempleadoLogic.getSetVersionRowEstadoGastoEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadogastoempleado,estadogastoempleadoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleadoLogic.setGastoEmpleados(new ArrayList<GastoEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleados= new ArrayList<GastoEmpleado>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadogastoempleadoAux.setGastoEmpleados(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleadoLogic.getGastoEmpleados());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadogastoempleadoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadogastoempleadoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadogastoempleadoAux,estadogastoempleadoLogic.getEstadoGastoEmpleados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadogastoempleadoAux,estadogastoempleados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadogastoempleado,estadogastoempleadoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadogastoempleadoAux=new  EstadoGastoEmpleado();
				
				estadogastoempleadoAux.setIsNew(false);
				estadogastoempleadoAux.setIsChanged(false);
				
				estadogastoempleadoAux.setIsDeleted(true);
				
				estadogastoempleadoAux.setId(this.estadogastoempleado.getId());	
				estadogastoempleadoAux.setVersionRow(this.estadogastoempleado.getVersionRow());	
				estadogastoempleadoAux.setcodigo(this.estadogastoempleado.getcodigo());	
				estadogastoempleadoAux.setnombre(this.estadogastoempleado.getnombre());	
				
				if(this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadogastoempleadoAux.getId()>=0) {	
						this.estadogastoempleadosEliminados.add(estadogastoempleadoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadogastoempleadoAux,estadogastoempleadoLogic.getEstadoGastoEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadogastoempleadoAux,estadogastoempleados);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadogastoempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadogastoempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadogastoempleadoLogic.saveEstadoGastoEmpleados();//WithConnection
						//estadogastoempleadoLogic.getSetVersionRowEstadoGastoEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadogastoempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleadoLogic.getGastoEmpleados().addAll(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleados.addAll(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleadosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadogastoempleadoLogic.saveEstadoGastoEmpleadoRelaciones(estadogastoempleadoAux,this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleadoLogic.getGastoEmpleados());//WithConnection
								//estadogastoempleadoLogic.getSetVersionRowEstadoGastoEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleadoLogic.setGastoEmpleados(new ArrayList<GastoEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleados= new ArrayList<GastoEmpleado>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadogastoempleadoAux.setGastoEmpleados(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleadoLogic.getGastoEmpleados());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadogastoempleadoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadogastoempleadoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadogastoempleadoAux,estadogastoempleadoLogic.getEstadoGastoEmpleados());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadogastoempleadoAux,estadogastoempleados);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogastoempleadoLogic.getEstadoGastoEmpleados().addAll(this.estadogastoempleadosEliminados);
					
					estadogastoempleadoLogic.saveEstadoGastoEmpleados();//WithConnection
					//estadogastoempleadoLogic.getSetVersionRowEstadoGastoEmpleados();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadogastoempleadosEliminados= new ArrayList<EstadoGastoEmpleado>();		
			}
			
			if(this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Gasto Empleado GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Gasto Empleado",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadogastoempleado=estadogastoempleadoAux;
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
      		//this.finishProcessEstadoGastoEmpleado();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoGastoEmpleado estadogastoempleadoLocal) throws Exception {
		
		if(this.estadogastoempleadoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadogastoempleadoLocal.setGastoEmpleados(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleadoLogic.getGastoEmpleados());
			
			} else {
			
				estadogastoempleadoLocal.setGastoEmpleados(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleados);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoGastoEmpleado estadogastoempleadoLocal) throws Exception {	
		if(this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoGastoEmpleadoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoGastoEmpleado.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadogastoempleado =(EstadoGastoEmpleado) this.estadogastoempleadoLogic.getEstadoGastoEmpleados().toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadogastoempleado =(EstadoGastoEmpleado) this.estadogastoempleados.toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadogastoempleadoValidator.getInvalidValues(this.estadogastoempleado);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoGastoEmpleado estadogastoempleado,List<EstadoGastoEmpleado> estadogastoempleados) throws Exception {
		try	{		
			EstadoGastoEmpleadoConstantesFunciones.actualizarLista(estadogastoempleado,estadogastoempleados,this.estadogastoempleadoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoGastoEmpleado estadogastoempleado,List<EstadoGastoEmpleado> estadogastoempleados) throws Exception {
		try	{			
			EstadoGastoEmpleadoConstantesFunciones.actualizarSelectedLista(estadogastoempleado,estadogastoempleados);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoGastoEmpleado> estadogastoempleadosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadogastoempleadosLocal=this.estadogastoempleadoLogic.getEstadoGastoEmpleados();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadogastoempleadosLocal=this.estadogastoempleados;
			}
			//ARCHITECTURE
		
			for(EstadoGastoEmpleado estadogastoempleadoLocal:estadogastoempleadosLocal) {
				if(this.permiteMantenimiento(estadogastoempleadoLocal) && estadogastoempleadoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoGastoEmpleadoConstantesFunciones.getEstadoGastoEmpleadoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoGastoEmpleadoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoGastoEmpleado.jLabelcodigoEstadoGastoEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoGastoEmpleadoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoGastoEmpleado.jLabelnombreEstadoGastoEmpleado,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoGastoEmpleado.jLabelcodigoEstadoGastoEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoGastoEmpleado.jLabelnombreEstadoGastoEmpleado,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("GastoEmpleado")) {
			if(this.estadogastoempleado==null) {
				this.estadogastoempleado= new EstadoGastoEmpleado();
			}

			if(this.estadogastoempleadoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoGastoEmpleado
				this.setVariablesFormularioToObjetoActualEstadoGastoEmpleado(this.estadogastoempleado,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoGastoEmpleado(this.estadogastoempleado);

				this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.getgastoempleado().setEstadoGastoEmpleado(this.estadogastoempleado);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoGastoEmpleado--;	
		
		
		this.estadogastoempleadoAux=new EstadoGastoEmpleado();
		
		this.estadogastoempleadoAux.setId(this.iIdNuevoEstadoGastoEmpleado);
		this.estadogastoempleadoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadogastoempleadoLogic.getEstadoGastoEmpleados().add(this.estadogastoempleadoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadogastoempleados.add(this.estadogastoempleadoAux);
		}
		//ARCHITECTURE
		
		this.estadogastoempleado=this.estadogastoempleadoAux;
		
		if(EstadoGastoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoGastoEmpleado(this.estadogastoempleado);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoGastoEmpleado(this.estadogastoempleado);
		}
				
		//this.setDefaultControlesEstadoGastoEmpleado();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoGastoEmpleado();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoGastoEmpleado();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoGastoEmpleado();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoGastoEmpleado(this.estadogastoempleadoBean,this.estadogastoempleado,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoGastoEmpleado(this.estadogastoempleado);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadogastoempleadoSessionBean.getConGuardarRelaciones()) {
			classes=EstadoGastoEmpleadoConstantesFunciones.getClassesRelationshipsOfEstadoGastoEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadogastoempleadoReturnGeneral=estadogastoempleadoLogic.procesarEventosEstadoGastoEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadogastoempleadoLogic.getEstadoGastoEmpleados(),this.estadogastoempleado,this.estadogastoempleadoParameterGeneral,this.isEsNuevoEstadoGastoEmpleado,classes);//this.estadogastoempleadoLogic.getEstadoGastoEmpleado()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoGastoEmpleado(this.estadogastoempleadoReturnGeneral,this.estadogastoempleadoBean,false);
		
		if(this.estadogastoempleadoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoGastoEmpleado(this.estadogastoempleadoReturnGeneral.getEstadoGastoEmpleado());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoGastoEmpleado(this.estadogastoempleadoReturnGeneral.getEstadoGastoEmpleado());
		}
		
		if(this.estadogastoempleadoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoGastoEmpleado(this.estadogastoempleadoReturnGeneral.getEstadoGastoEmpleado(),classes);//this.estadogastoempleadoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoGastoEmpleado(this.estadogastoempleado,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoGastoEmpleado();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoGastoEmpleado();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.RecargarFormEstadoGastoEmpleado(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoGastoEmpleado(false);
						
			if(estadogastoempleadoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleadoSessionBean.getEsGuardarRelacionado() && GastoEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonGastoEmpleadoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoGastoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoGastoEmpleado();
			}
			
			this.actualizarVisualTableDatosEstadoGastoEmpleado();
			
			this.jTableDatosEstadoGastoEmpleado.setRowSelectionInterval(this.getIndiceNuevoEstadoGastoEmpleado(), this.getIndiceNuevoEstadoGastoEmpleado());
			
			this.seleccionarFilaTablaEstadoGastoEmpleadoActual();
						
			this.actualizarEstadoCeldasBotonesEstadoGastoEmpleado("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoGastoEmpleado(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTextFieldcodigoEstadoGastoEmpleado.setEnabled(isHabilitar && this.estadogastoempleadoConstantesFunciones.activarcodigoEstadoGastoEmpleado);
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTextAreanombreEstadoGastoEmpleado.setEnabled(isHabilitar && this.estadogastoempleadoConstantesFunciones.activarnombreEstadoGastoEmpleado);	
		
	};
	
	public void setDefaultControlesEstadoGastoEmpleado() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoGastoEmpleado(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadogastoempleadoSessionBean.setConGuardarRelaciones(true);			
			this.estadogastoempleadoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTabbedPaneRelacionesEstadoGastoEmpleado.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleadoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadogastoempleadoSessionBean.setConGuardarRelaciones(false);			
			this.estadogastoempleadoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTabbedPaneRelacionesEstadoGastoEmpleado.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleadoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoGastoEmpleado() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoGastoEmpleado estadogastoempleadoAux:this.estadogastoempleadoLogic.getEstadoGastoEmpleados()) {
				if(estadogastoempleadoAux.getId().equals(this.iIdNuevoEstadoGastoEmpleado)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoGastoEmpleado estadogastoempleadoAux:this.estadogastoempleados) {
				if(estadogastoempleadoAux.getId().equals(this.iIdNuevoEstadoGastoEmpleado)) {
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
	
	public int getIndiceActualEstadoGastoEmpleado(EstadoGastoEmpleado estadogastoempleado,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoGastoEmpleado estadogastoempleadoAux:this.estadogastoempleadoLogic.getEstadoGastoEmpleados()) {
				if(estadogastoempleadoAux.getId().equals(estadogastoempleado.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoGastoEmpleado estadogastoempleadoAux:this.estadogastoempleados) {
				if(estadogastoempleadoAux.getId().equals(estadogastoempleado.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoGastoEmpleado(EstadoGastoEmpleado estadogastoempleadoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoGastoEmpleado estadogastoempleadoAux:this.estadogastoempleadoLogic.getEstadoGastoEmpleados()) {
				if(estadogastoempleadoAux.getEstadoGastoEmpleadoOriginal().getId().equals(estadogastoempleadoOriginal.getId())) {
					existe=true;
					estadogastoempleadoOriginal.setId(estadogastoempleadoAux.getId());
					estadogastoempleadoOriginal.setVersionRow(estadogastoempleadoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoGastoEmpleado estadogastoempleadoAux:this.estadogastoempleados) {
				if(estadogastoempleadoAux.getEstadoGastoEmpleadoOriginal().getId().equals(estadogastoempleadoOriginal.getId())) {
					existe=true;
					estadogastoempleadoOriginal.setId(estadogastoempleadoAux.getId());
					estadogastoempleadoOriginal.setVersionRow(estadogastoempleadoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoGastoEmpleado(Boolean esParaCancelar) throws Exception {
		estadogastoempleadosAux=new ArrayList<EstadoGastoEmpleado>();
		estadogastoempleadoAux=new EstadoGastoEmpleado();
		
		if(!this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoGastoEmpleado estadogastoempleadoAux:this.estadogastoempleadoLogic.getEstadoGastoEmpleados()) {
					if(estadogastoempleadoAux.getId()<0) {
						estadogastoempleadosAux.add(estadogastoempleadoAux);
					}		
				}
				this.iIdNuevoEstadoGastoEmpleado=0L;
				this.estadogastoempleadoLogic.getEstadoGastoEmpleados().removeAll(estadogastoempleadosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoGastoEmpleado estadogastoempleadoAux:this.estadogastoempleados) {
					if(estadogastoempleadoAux.getId()<0) {
						estadogastoempleadosAux.add(estadogastoempleadoAux);
					}		
				}
				this.iIdNuevoEstadoGastoEmpleado=0L;
				this.estadogastoempleados.removeAll(estadogastoempleadosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoGastoEmpleado 
					&& this.estadogastoempleadoLogic.getEstadoGastoEmpleados().size()>0
					) {
					estadogastoempleadoAux=this.estadogastoempleadoLogic.getEstadoGastoEmpleados().get(this.estadogastoempleadoLogic.getEstadoGastoEmpleados().size() - 1);
				
					if(estadogastoempleadoAux.getId()<0) {
						this.estadogastoempleadoLogic.getEstadoGastoEmpleados().remove(estadogastoempleadoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoGastoEmpleado && this.estadogastoempleados.size()>0) {
					estadogastoempleadoAux=this.estadogastoempleados.get(this.estadogastoempleados.size() - 1);
				
					if(estadogastoempleadoAux.getId()<0) {
						this.estadogastoempleados.remove(estadogastoempleadoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoGastoEmpleado(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadogastoempleado.getId()<0) {
				this.estadogastoempleadoLogic.getEstadoGastoEmpleados().remove(this.estadogastoempleado);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadogastoempleado.getId()<0) {
				this.estadogastoempleados.remove(this.estadogastoempleado);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoGastoEmpleado(List<EstadoGastoEmpleado> estadogastoempleadosAux) throws Exception {
		EstadoGastoEmpleadoConstantesFunciones.setEstadosInicialesEstadoGastoEmpleado(estadogastoempleadosAux);
	}
	
	public void setEstadosInicialesEstadoGastoEmpleado(EstadoGastoEmpleado estadogastoempleadoAux) throws Exception {
		EstadoGastoEmpleadoConstantesFunciones.setEstadosInicialesEstadoGastoEmpleado(estadogastoempleadoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoGastoEmpleadoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoGastoEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoGastoEmpleadoActual()) {
				if(!this.isEsNuevoEstadoGastoEmpleado) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoGastoEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoGastoEmpleado=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoGastoEmpleadoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Gasto Empleado ?", "MANTENIMIENTO DE Estado Gasto Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoGastoEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoGastoEmpleado estadogastoempleado) throws Exception {
		EstadoGastoEmpleadoConstantesFunciones.seleccionarAsignar(this.estadogastoempleado,estadogastoempleado);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoGastoEmpleado=this.isPermisoActualizarOriginalEstadoGastoEmpleado;
			
			
			this.seleccionarAsignar(estadogastoempleado);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoGastoEmpleadoConstantesFunciones.quitarEspaciosEstadoGastoEmpleado(this.estadogastoempleado,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoGastoEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadogastoempleadoSessionBean.setsFuncionBusquedaRapida(this.estadogastoempleadoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoGastoEmpleado) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoGastoEmpleado(esParaCancelar);				
				this.cancelarNuevoEstadoGastoEmpleado(esParaCancelar);								
			}
			
			this.estadogastoempleado=new EstadoGastoEmpleado();
			
			this.inicializarEstadoGastoEmpleado();
			
			this.actualizarEstadoCeldasBotonesEstadoGastoEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoGastoEmpleado() throws Exception {
		try {
			EstadoGastoEmpleadoConstantesFunciones.inicializarEstadoGastoEmpleado(this.estadogastoempleado);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadogastoempleadoLogic.getEstadoGastoEmpleados().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoGastoEmpleados(String sAccionBusqueda,List<EstadoGastoEmpleado> estadogastoempleadosParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoGastoEmpleado"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoGastoEmpleadoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoGastoEmpleadoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoGastoEmpleado"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Gasto Empleados");		
		parameters.put("busquedapor", EstadoGastoEmpleadoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(GastoEmpleado.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoGastoEmpleadoLogic estadogastoempleadoLogicAuxiliar=new EstadoGastoEmpleadoLogic();
					estadogastoempleadoLogicAuxiliar.setDatosCliente(estadogastoempleadoLogic.getDatosCliente());				
					estadogastoempleadoLogicAuxiliar.setEstadoGastoEmpleados(estadogastoempleadosParaReportes);
					
					estadogastoempleadoLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoGastoEmpleadoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadogastoempleadosParaReportes=estadogastoempleadoLogicAuxiliar.getEstadoGastoEmpleados();
					
					//estadogastoempleadoLogic.getNewConnexionToDeep();
					
					//for (EstadoGastoEmpleado estadogastoempleado:estadogastoempleadosParaReportes) {
					//	estadogastoempleadoLogic.deepLoad(estadogastoempleado, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadogastoempleadoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadogastoempleadoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileGastoEmpleado = AuxiliarReportes.class.getResourceAsStream("GastoEmpleadoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_gastoempleado", reportFileGastoEmpleado);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoGastoEmpleado=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoGastoEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoGastoEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoGastoEmpleado=new JRBeanArrayDataSource(EstadoGastoEmpleadoJInternalFrame.TraerEstadoGastoEmpleadoBeans(estadogastoempleadosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoGastoEmpleado);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoGastoEmpleadoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoGastoEmpleadoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoGastoEmpleadoBean.TraerEstadoGastoEmpleadoBeans(estadogastoempleadosParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoGastoEmpleados(sAccionBusqueda,sTipoArchivoReporte,estadogastoempleadosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoGastoEmpleados(sAccionBusqueda,sTipoArchivoReporte,estadogastoempleadosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoGastoEmpleadoActionPerformed(null);
					//this.generarExcelReporteEstadoGastoEmpleados(sAccionBusqueda,sTipoArchivoReporte,estadogastoempleadosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoGastoEmpleados(sAccionBusqueda,sTipoArchivoReporte,estadogastoempleadosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoGastoEmpleados(sAccionBusqueda,sTipoArchivoReporte,estadogastoempleadosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoGastoEmpleados(sAccionBusqueda,sTipoArchivoReporte,estadogastoempleadosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoGastoEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoGastoEmpleado> estadogastoempleadosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadogastoempleado";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoGastoEmpleados");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoGastoEmpleado("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoGastoEmpleado estadogastoempleado : estadogastoempleadosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoGastoEmpleadoConstantesFunciones.generarExcelReporteDataEstadoGastoEmpleado("NORMAL",row,workbook,estadogastoempleado,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Gasto Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoGastoEmpleado(String sTipo,Row row,Workbook workbook) {
		
		EstadoGastoEmpleadoConstantesFunciones.generarExcelReporteHeaderEstadoGastoEmpleado(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoGastoEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoGastoEmpleado> estadogastoempleadosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadogastoempleado_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoGastoEmpleados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoGastoEmpleado estadogastoempleado : estadogastoempleadosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoGastoEmpleadoConstantesFunciones.getEstadoGastoEmpleadoDescripcion(estadogastoempleado));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoGastoEmpleadoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoGastoEmpleadoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadogastoempleado.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoGastoEmpleadoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoGastoEmpleadoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadogastoempleado.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Gasto Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoGastoEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoGastoEmpleado> estadogastoempleadosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoGastoEmpleado> estadogastoempleadosRespaldo=null;
		
		classes=EstadoGastoEmpleadoConstantesFunciones.getClassesRelationshipsOfEstadoGastoEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadogastoempleadoLogic.setDatosCliente(this.datosCliente);
		this.estadogastoempleadoLogic.setDatosDeep(this.datosDeep);
		this.estadogastoempleadoLogic.setIsConDeep(true);
		
		estadogastoempleadosRespaldo=this.estadogastoempleadoLogic.getEstadoGastoEmpleados();
		
		this.estadogastoempleadoLogic.setEstadoGastoEmpleados(estadogastoempleadosParaReportes);	
		this.estadogastoempleadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadogastoempleadosParaReportes=this.estadogastoempleadoLogic.getEstadoGastoEmpleados();
		this.estadogastoempleadoLogic.setEstadoGastoEmpleados(estadogastoempleadosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadogastoempleado_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoGastoEmpleados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoGastoEmpleado("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoGastoEmpleado estadogastoempleado : estadogastoempleadosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoGastoEmpleado("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoGastoEmpleadoConstantesFunciones.generarExcelReporteDataEstadoGastoEmpleado("NORMAL",row,workbook,estadogastoempleado,cellStyleDataAux);
		
			
			


				//GastoEmpleado
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadogastoempleado.getGastoEmpleados()!=null && estadogastoempleado.getGastoEmpleados().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					GastoEmpleadoConstantesFunciones.generarExcelReporteHeaderGastoEmpleado("RELACIONADO",row,workbook);
				}

				if(estadogastoempleado.getGastoEmpleados()!=null) {
					i2=0;
					for(GastoEmpleado gastoempleado : estadogastoempleado.getGastoEmpleados()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						GastoEmpleadoConstantesFunciones.generarExcelReporteDataGastoEmpleado("RELACIONADO",row,workbook,gastoempleado,cellStyleDataAuxHijo);
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
		cell.setCellValue(EstadoGastoEmpleadoConstantesFunciones.getEstadoGastoEmpleadoDescripcion(estadogastoempleado));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Gasto Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoGastoEmpleado() throws Exception {		
		this.startProcessEstadoGastoEmpleado(true);
	}
	
	public void startProcessEstadoGastoEmpleado(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoGastoEmpleado, this.jScrollPanelDatosEstadoGastoEmpleado,this.jPanelPaginacionEstadoGastoEmpleado, this.jScrollPanelDatosEdicionEstadoGastoEmpleado, this.jPanelAccionesEstadoGastoEmpleado,this.jPanelAccionesFormularioEstadoGastoEmpleado,this.jmenuBarEstadoGastoEmpleado,this.jmenuBarDetalleEstadoGastoEmpleado,this.jTtoolBarEstadoGastoEmpleado,this.jTtoolBarDetalleEstadoGastoEmpleado);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoGastoEmpleado=null; 
		
		final JPanel jPanelParametrosReportesEstadoGastoEmpleado=this.jPanelParametrosReportesEstadoGastoEmpleado;
		//final JScrollPane jScrollPanelDatosEstadoGastoEmpleado=this.jScrollPanelDatosEstadoGastoEmpleado;
		final JTable jTableDatosEstadoGastoEmpleado=this.jTableDatosEstadoGastoEmpleado;		
		final JPanel jPanelPaginacionEstadoGastoEmpleado=this.jPanelPaginacionEstadoGastoEmpleado;
		//final JScrollPane jScrollPanelDatosEdicionEstadoGastoEmpleado=this.jScrollPanelDatosEdicionEstadoGastoEmpleado;
		final JPanel jPanelAccionesEstadoGastoEmpleado=this.jPanelAccionesEstadoGastoEmpleado;
		
		JPanel jPanelCamposAuxiliarEstadoGastoEmpleado=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoGastoEmpleado=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) {
			jPanelCamposAuxiliarEstadoGastoEmpleado=this.jInternalFrameDetalleFormEstadoGastoEmpleado.jPanelCamposEstadoGastoEmpleado;
			jPanelAccionesFormularioAuxiliarEstadoGastoEmpleado=this.jInternalFrameDetalleFormEstadoGastoEmpleado.jPanelAccionesFormularioEstadoGastoEmpleado;
		}
		
		final JPanel jPanelCamposEstadoGastoEmpleado=jPanelCamposAuxiliarEstadoGastoEmpleado;
		final JPanel jPanelAccionesFormularioEstadoGastoEmpleado=jPanelAccionesFormularioAuxiliarEstadoGastoEmpleado;
		
		
		final JMenuBar jmenuBarEstadoGastoEmpleado=this.jmenuBarEstadoGastoEmpleado;
		final JToolBar jTtoolBarEstadoGastoEmpleado=this.jTtoolBarEstadoGastoEmpleado;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoGastoEmpleado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoGastoEmpleado=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) {
			jmenuBarDetalleAuxiliarEstadoGastoEmpleado=this.jInternalFrameDetalleFormEstadoGastoEmpleado.jmenuBarDetalleEstadoGastoEmpleado;
			jTtoolBarDetalleAuxiliarEstadoGastoEmpleado=this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTtoolBarDetalleEstadoGastoEmpleado;
		}
		
		final JMenuBar jmenuBarDetalleEstadoGastoEmpleado=jmenuBarDetalleAuxiliarEstadoGastoEmpleado;
		final JToolBar jTtoolBarDetalleEstadoGastoEmpleado=jTtoolBarDetalleAuxiliarEstadoGastoEmpleado;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoGastoEmpleado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoGastoEmpleado;
			processRunnable.jTableDatos=jTableDatosEstadoGastoEmpleado;
			processRunnable.jPanelCampos=jPanelCamposEstadoGastoEmpleado;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoGastoEmpleado;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoGastoEmpleado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoGastoEmpleado;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoGastoEmpleado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoGastoEmpleado;
			processRunnable.jTtoolBar=jTtoolBarEstadoGastoEmpleado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoGastoEmpleado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoGastoEmpleado ,jPanelParametrosReportesEstadoGastoEmpleado,jTableDatosEstadoGastoEmpleado, /*jScrollPanelDatosEstadoGastoEmpleado,*/jPanelCamposEstadoGastoEmpleado,jPanelPaginacionEstadoGastoEmpleado, /*jScrollPanelDatosEdicionEstadoGastoEmpleado,*/ jPanelAccionesEstadoGastoEmpleado,jPanelAccionesFormularioEstadoGastoEmpleado,jmenuBarEstadoGastoEmpleado,jmenuBarDetalleEstadoGastoEmpleado,jTtoolBarEstadoGastoEmpleado,jTtoolBarDetalleEstadoGastoEmpleado);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoGastoEmpleado, jScrollPanelDatosEstadoGastoEmpleado,jPanelPaginacionEstadoGastoEmpleado, jScrollPanelDatosEdicionEstadoGastoEmpleado, jPanelAccionesEstadoGastoEmpleado,jPanelAccionesFormularioEstadoGastoEmpleado,jmenuBarEstadoGastoEmpleado,jmenuBarDetalleEstadoGastoEmpleado,jTtoolBarEstadoGastoEmpleado,jTtoolBarDetalleEstadoGastoEmpleado);
						
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
	
	public void finishProcessEstadoGastoEmpleado() {// throws Exception 
		this.finishProcessEstadoGastoEmpleado(true);
	}
	
	public void finishProcessEstadoGastoEmpleado(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoGastoEmpleado, this.jScrollPanelDatosEstadoGastoEmpleado,this.jPanelPaginacionEstadoGastoEmpleado, this.jScrollPanelDatosEdicionEstadoGastoEmpleado, this.jPanelAccionesEstadoGastoEmpleado,this.jPanelAccionesFormularioEstadoGastoEmpleado,this.jmenuBarEstadoGastoEmpleado,this.jmenuBarDetalleEstadoGastoEmpleado,this.jTtoolBarEstadoGastoEmpleado,this.jTtoolBarDetalleEstadoGastoEmpleado);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoGastoEmpleado=null; 
		
		final JPanel jPanelParametrosReportesEstadoGastoEmpleado=this.jPanelParametrosReportesEstadoGastoEmpleado;
		//final JScrollPane jScrollPanelDatosEstadoGastoEmpleado=this.jScrollPanelDatosEstadoGastoEmpleado;
		final JTable jTableDatosEstadoGastoEmpleado=this.jTableDatosEstadoGastoEmpleado;		
		final JPanel jPanelPaginacionEstadoGastoEmpleado=this.jPanelPaginacionEstadoGastoEmpleado;
		//final JScrollPane jScrollPanelDatosEdicionEstadoGastoEmpleado=this.jScrollPanelDatosEdicionEstadoGastoEmpleado;
		final JPanel jPanelAccionesEstadoGastoEmpleado=this.jPanelAccionesEstadoGastoEmpleado;
		
		JPanel jPanelCamposAuxiliarEstadoGastoEmpleado=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoGastoEmpleado=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) {
			jPanelCamposAuxiliarEstadoGastoEmpleado=this.jInternalFrameDetalleFormEstadoGastoEmpleado.jPanelCamposEstadoGastoEmpleado;
			jPanelAccionesFormularioAuxiliarEstadoGastoEmpleado=this.jInternalFrameDetalleFormEstadoGastoEmpleado.jPanelAccionesFormularioEstadoGastoEmpleado;
		}
		
		final JPanel jPanelCamposEstadoGastoEmpleado=jPanelCamposAuxiliarEstadoGastoEmpleado;
		final JPanel jPanelAccionesFormularioEstadoGastoEmpleado=jPanelAccionesFormularioAuxiliarEstadoGastoEmpleado;
		
		
		final JMenuBar jmenuBarEstadoGastoEmpleado=this.jmenuBarEstadoGastoEmpleado;		
		final JToolBar jTtoolBarEstadoGastoEmpleado=this.jTtoolBarEstadoGastoEmpleado;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoGastoEmpleado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoGastoEmpleado=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) {
			jmenuBarDetalleAuxiliarEstadoGastoEmpleado=this.jInternalFrameDetalleFormEstadoGastoEmpleado.jmenuBarDetalleEstadoGastoEmpleado;
			jTtoolBarDetalleAuxiliarEstadoGastoEmpleado=this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTtoolBarDetalleEstadoGastoEmpleado;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoGastoEmpleado=jmenuBarDetalleAuxiliarEstadoGastoEmpleado;
		final JToolBar jTtoolBarDetalleEstadoGastoEmpleado=jTtoolBarDetalleAuxiliarEstadoGastoEmpleado;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoGastoEmpleado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoGastoEmpleado;
			processRunnable.jTableDatos=jTableDatosEstadoGastoEmpleado;
			processRunnable.jPanelCampos=jPanelCamposEstadoGastoEmpleado;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoGastoEmpleado;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoGastoEmpleado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoGastoEmpleado;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoGastoEmpleado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoGastoEmpleado;
			processRunnable.jTtoolBar=jTtoolBarEstadoGastoEmpleado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoGastoEmpleado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoGastoEmpleado ,jPanelParametrosReportesEstadoGastoEmpleado, jTableDatosEstadoGastoEmpleado,/*jScrollPanelDatosEstadoGastoEmpleado,*/jPanelCamposEstadoGastoEmpleado,jPanelPaginacionEstadoGastoEmpleado, /*jScrollPanelDatosEdicionEstadoGastoEmpleado,*/ jPanelAccionesEstadoGastoEmpleado,jPanelAccionesFormularioEstadoGastoEmpleado,jmenuBarEstadoGastoEmpleado,jmenuBarDetalleEstadoGastoEmpleado,jTtoolBarEstadoGastoEmpleado,jTtoolBarDetalleEstadoGastoEmpleado));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoGastoEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoGastoEmpleado(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoGastoEmpleado(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoGastoEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoGastoEmpleado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoGastoEmpleado,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoGastoEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoGastoEmpleado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoGastoEmpleado,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadogastoempleadoConstantesFunciones.getsFinalQueryEstadoGastoEmpleado();
		String  finalQueryPaginacionTodos=this.estadogastoempleadoConstantesFunciones.getsFinalQueryEstadoGastoEmpleado();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoGastoEmpleadoConstantesFunciones.getArrayColumnasGlobalesNoEstadoGastoEmpleado(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoGastoEmpleadoConstantesFunciones.getArrayColumnasGlobalesEstadoGastoEmpleado(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoGastoEmpleadoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadogastoempleadosEliminados= new ArrayList<EstadoGastoEmpleado>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoGastoEmpleado();
		
				///*EstadoGastoEmpleadoSessionBean*/this.estadogastoempleadoSessionBean=new EstadoGastoEmpleadoSessionBean();
			
			if(this.estadogastoempleadoSessionBean==null) {
				this.estadogastoempleadoSessionBean=new EstadoGastoEmpleadoSessionBean();
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
					this.iNumeroPaginacion=EstadoGastoEmpleadoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoGastoEmpleadoConstantesFunciones.getClassesForeignKeysOfEstadoGastoEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadogastoempleado."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadogastoempleadosAux= new ArrayList<EstadoGastoEmpleado>();
			
				
			estadogastoempleadoLogic.setDatosCliente(this.datosCliente);
			estadogastoempleadoLogic.setDatosDeep(this.datosDeep);
			estadogastoempleadoLogic.setIsConDeep(true);
			
			
			estadogastoempleadoLogic.getEstadoGastoEmpleadoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadogastoempleadoLogic.getTodosEstadoGastoEmpleados(finalQueryGlobal,pagination);
					
					//estadogastoempleadoLogic.getTodosEstadoGastoEmpleadosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadogastoempleadoLogic.getEstadoGastoEmpleados()==null|| estadogastoempleadoLogic.getEstadoGastoEmpleados().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadogastoempleadosAux= new ArrayList<EstadoGastoEmpleado>();
							estadogastoempleadosAux.addAll(estadogastoempleadoLogic.getEstadoGastoEmpleados());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadogastoempleadosAux= new ArrayList<EstadoGastoEmpleado>();
							estadogastoempleadosAux.addAll(estadogastoempleados);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadogastoempleadoLogic.getTodosEstadoGastoEmpleados(finalQueryGlobal+"",this.pagination);												
							
							//estadogastoempleadoLogic.getTodosEstadoGastoEmpleadosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoGastoEmpleados("Todos",estadogastoempleadoLogic.getEstadoGastoEmpleados() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadogastoempleadoLogic.setEstadoGastoEmpleados(new ArrayList<EstadoGastoEmpleado>());					
							estadogastoempleadoLogic.getEstadoGastoEmpleados().addAll(estadogastoempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadogastoempleados=new ArrayList<EstadoGastoEmpleado>();
							estadogastoempleados.addAll(estadogastoempleadosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoGastoEmpleado=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoGastoEmpleado=this.idActual;
				
				} else if(this.idEstadoGastoEmpleadoActual!=null && this.idEstadoGastoEmpleadoActual!=0L) {
					idEstadoGastoEmpleado=idEstadoGastoEmpleadoActual;
				}
				
					
				this.sDetalleReporte=EstadoGastoEmpleadoConstantesFunciones.getDetalleIndicePorId(idEstadoGastoEmpleado);
				
				this.estadogastoempleados=new ArrayList<EstadoGastoEmpleado>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadogastoempleadoLogic.getEntity(idEstadoGastoEmpleado);
					
					//estadogastoempleadoLogic.getEntityWithConnection(idEstadoGastoEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadogastoempleadoLogic.setEstadoGastoEmpleados(new ArrayList<EstadoGastoEmpleado>());
					estadogastoempleadoLogic.getEstadoGastoEmpleados().add(estadogastoempleadoLogic.getEstadoGastoEmpleado());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadogastoempleados=new ArrayList<EstadoGastoEmpleado>();
					this.estadogastoempleados.add(estadogastoempleado);
				}
				
				if(estadogastoempleadoLogic.getEstadoGastoEmpleado()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoGastoEmpleado();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoGastoEmpleado();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadogastoempleadoLogic.getEstadoGastoEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadogastoempleados.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadogastoempleadoLogic.getEstadoGastoEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadogastoempleados.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoGastoEmpleado estadogastoempleado) {
		Boolean permite=true;
		
		if(this.estadogastoempleado.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoGastoEmpleadoConstantesFunciones.getOrderByListaEstadoGastoEmpleado();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoGastoEmpleadoConstantesFunciones.getOrderByListaEstadoGastoEmpleado();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoGastoEmpleado estadogastoempleado:estadogastoempleadoLogic.getEstadoGastoEmpleados()) {
				if(estadogastoempleado.getsType().equals(Constantes2.S_TOTALES)) {
					estadogastoempleadoTotales=estadogastoempleado;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoGastoEmpleado estadogastoempleado:this.estadogastoempleados) {
				if(estadogastoempleado.getsType().equals(Constantes2.S_TOTALES)) {
					estadogastoempleadoTotales=estadogastoempleado;
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
			this.estadogastoempleadoAux=new EstadoGastoEmpleado();
			this.estadogastoempleadoAux.setsType(Constantes2.S_TOTALES);
			this.estadogastoempleadoAux.setIsNew(false);
			this.estadogastoempleadoAux.setIsChanged(false);
			this.estadogastoempleadoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoGastoEmpleadoConstantesFunciones.TotalizarValoresFilaEstadoGastoEmpleado(this.estadogastoempleadoLogic.getEstadoGastoEmpleados(),this.estadogastoempleadoAux);
				
				this.estadogastoempleadoLogic.getEstadoGastoEmpleados().add(this.estadogastoempleadoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoGastoEmpleadoConstantesFunciones.TotalizarValoresFilaEstadoGastoEmpleado(this.estadogastoempleados,this.estadogastoempleadoAux);
				
				this.estadogastoempleados.add(this.estadogastoempleadoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadogastoempleadoTotales=new EstadoGastoEmpleado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadogastoempleadoLogic.getEstadoGastoEmpleados().remove(estadogastoempleadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadogastoempleados.remove(estadogastoempleadoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadogastoempleadoTotales=new EstadoGastoEmpleado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoGastoEmpleado estadogastoempleado:estadogastoempleadoLogic.getEstadoGastoEmpleados()) {
				if(estadogastoempleado.getsType().equals(Constantes2.S_TOTALES)) {
					estadogastoempleadoTotales=estadogastoempleado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoGastoEmpleadoConstantesFunciones.TotalizarValoresFilaEstadoGastoEmpleado(this.estadogastoempleadoLogic.getEstadoGastoEmpleados(),estadogastoempleadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoGastoEmpleado estadogastoempleado:this.estadogastoempleados) {
				if(estadogastoempleado.getsType().equals(Constantes2.S_TOTALES)) {
					estadogastoempleadoTotales=estadogastoempleado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoGastoEmpleadoConstantesFunciones.TotalizarValoresFilaEstadoGastoEmpleado(this.estadogastoempleados,estadogastoempleadoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosEstadoGastoEmpleado() {
		this.isPermisoTodoEstadoGastoEmpleado=false;
		this.isPermisoNuevoEstadoGastoEmpleado=false;
		this.isPermisoActualizarEstadoGastoEmpleado=false;
		this.isPermisoActualizarOriginalEstadoGastoEmpleado=false;
		this.isPermisoEliminarEstadoGastoEmpleado=false;
		this.isPermisoGuardarCambiosEstadoGastoEmpleado=false;
		this.isPermisoConsultaEstadoGastoEmpleado=false;
		this.isPermisoBusquedaEstadoGastoEmpleado=false;
		this.isPermisoReporteEstadoGastoEmpleado=false;		
		this.isPermisoOrdenEstadoGastoEmpleado=false;		
		this.isPermisoPaginacionMedioEstadoGastoEmpleado=false;		
		this.isPermisoPaginacionAltoEstadoGastoEmpleado=false;
		this.isPermisoPaginacionTodoEstadoGastoEmpleado=false;
		this.isPermisoCopiarEstadoGastoEmpleado=false;		
		this.isPermisoVerFormEstadoGastoEmpleado=false;		
		this.isPermisoDuplicarEstadoGastoEmpleado=false;		
		this.isPermisoOrdenEstadoGastoEmpleado=false;		
	}
	
	public void setPermisosUsuarioEstadoGastoEmpleado(Boolean isPermiso) {
		this.isPermisoTodoEstadoGastoEmpleado=isPermiso;
		this.isPermisoNuevoEstadoGastoEmpleado=isPermiso;
		this.isPermisoActualizarEstadoGastoEmpleado=isPermiso;
		this.isPermisoActualizarOriginalEstadoGastoEmpleado=isPermiso;
		this.isPermisoEliminarEstadoGastoEmpleado=isPermiso;
		this.isPermisoGuardarCambiosEstadoGastoEmpleado=isPermiso;
		this.isPermisoConsultaEstadoGastoEmpleado=isPermiso;
		this.isPermisoBusquedaEstadoGastoEmpleado=isPermiso;
		this.isPermisoReporteEstadoGastoEmpleado=isPermiso;
		this.isPermisoOrdenEstadoGastoEmpleado=isPermiso;		
		this.isPermisoPaginacionMedioEstadoGastoEmpleado=isPermiso;		
		this.isPermisoPaginacionAltoEstadoGastoEmpleado=isPermiso;		
		this.isPermisoPaginacionTodoEstadoGastoEmpleado=isPermiso;		
		this.isPermisoCopiarEstadoGastoEmpleado=isPermiso;		
		this.isPermisoVerFormEstadoGastoEmpleado=isPermiso;		
		this.isPermisoDuplicarEstadoGastoEmpleado=isPermiso;
		this.isPermisoOrdenEstadoGastoEmpleado=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoGastoEmpleado(Boolean isPermiso) {
		//this.isPermisoTodoEstadoGastoEmpleado=isPermiso;
		this.isPermisoNuevoEstadoGastoEmpleado=isPermiso;
		this.isPermisoActualizarEstadoGastoEmpleado=isPermiso;
		this.isPermisoActualizarOriginalEstadoGastoEmpleado=isPermiso;
		this.isPermisoEliminarEstadoGastoEmpleado=isPermiso;
		this.isPermisoGuardarCambiosEstadoGastoEmpleado=isPermiso;
		//this.isPermisoConsultaEstadoGastoEmpleado=isPermiso;
		//this.isPermisoBusquedaEstadoGastoEmpleado=isPermiso;
		//this.isPermisoReporteEstadoGastoEmpleado=isPermiso;
		//this.isPermisoOrdenEstadoGastoEmpleado=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoGastoEmpleado=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoGastoEmpleado=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoGastoEmpleado=isPermiso;		
		//this.isPermisoCopiarEstadoGastoEmpleado=isPermiso;		
		//this.isPermisoDuplicarEstadoGastoEmpleado=isPermiso;
		//this.isPermisoOrdenEstadoGastoEmpleado=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoGastoEmpleadoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(GastoEmpleadoConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoGastoEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosGastoEmpleado=false;
		this.isTienePermisosGastoEmpleado=this.verificarGetPermisosUsuarioOpcionEstadoGastoEmpleadoClaseRelacionada(this.opcionsRelacionadas,GastoEmpleadoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoGastoEmpleado(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoGastoEmpleadoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosGastoEmpleado=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoGastoEmpleadoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoGastoEmpleadoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoGastoEmpleadoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosGastoEmpleado && this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null && this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTabbedPaneRelacionesEstadoGastoEmpleado.remove(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoGastoEmpleado() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoGastoEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoGastoEmpleadoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoGastoEmpleado=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoGastoEmpleado=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoGastoEmpleado=this.isPermisoActualizarEstadoGastoEmpleado;
			this.isPermisoEliminarEstadoGastoEmpleado=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoGastoEmpleado=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoGastoEmpleado=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoGastoEmpleado=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoGastoEmpleado=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoGastoEmpleado=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoGastoEmpleado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoGastoEmpleado=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoGastoEmpleado=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoGastoEmpleado=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoGastoEmpleado=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoGastoEmpleado=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoGastoEmpleado=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoGastoEmpleado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoGastoEmpleado.setToolTipText(this.jTableDatosEstadoGastoEmpleado.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoGastoEmpleado(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoGastoEmpleado(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoGastoEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoGastoEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoGastoEmpleado() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosGastoEmpleado && this.estadogastoempleadoConstantesFunciones.mostrarGastoEmpleadoEstadoGastoEmpleado && !EstadoGastoEmpleadoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Gasto Empleado");
			reporte.setsDescripcion("Gasto Empleado");
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
	
		
	public void inicializarCombosForeignKeyEstadoGastoEmpleadoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoGastoEmpleadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoGastoEmpleadoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoGastoEmpleadoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoGastoEmpleadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoGastoEmpleado()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoGastoEmpleado()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoGastoEmpleado(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoGastoEmpleado()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoGastoEmpleado();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoGastoEmpleado(EstadoGastoEmpleado estadogastoempleado)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoGastoEmpleado(EstadoGastoEmpleado estadogastoempleado,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoGastoEmpleado()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoGastoEmpleado()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoGastoEmpleado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoGastoEmpleado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoGastoEmpleado()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoGastoEmpleado()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoGastoEmpleado(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoGastoEmpleado()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoGastoEmpleadoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoGastoEmpleadoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoGastoEmpleadoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadogastoempleadoSessionBean=new EstadoGastoEmpleadoSessionBean(); 
		this.estadogastoempleadoConstantesFunciones=new EstadoGastoEmpleadoConstantesFunciones(); 
		this.estadogastoempleadoBean=new EstadoGastoEmpleado();//(this.estadogastoempleadoConstantesFunciones); 		
		this.estadogastoempleadoReturnGeneral=new EstadoGastoEmpleadoParameterReturnGeneral(); 
		
		this.estadogastoempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadogastoempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoGastoEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoGastoEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoGastoEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoGastoEmpleado(true);
			
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
			
			this.estadogastoempleadoConstantesFunciones=new EstadoGastoEmpleadoConstantesFunciones(); 
			this.estadogastoempleadoBean=new EstadoGastoEmpleado();//this.estadogastoempleadoConstantesFunciones); 			
			this.estadogastoempleadoReturnGeneral=new EstadoGastoEmpleadoParameterReturnGeneral(); 
		
			EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Gasto Empleado Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadogastoempleado=new EstadoGastoEmpleado();
			this.estadogastoempleados = new ArrayList<EstadoGastoEmpleado>();
			this.estadogastoempleadosAux = new ArrayList<EstadoGastoEmpleado>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic=new EstadoGastoEmpleadoLogic();
				this.estadogastoempleadoLogic.getNewConnexionToDeep("");
			}
			
			//this.estadogastoempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadogastoempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoGastoEmpleado);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoGastoEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoGastoEmpleado);	
					}
					
					if(this.jInternalFrameImportacionEstadoGastoEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoGastoEmpleado);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoGastoEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoGastoEmpleado);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoGastoEmpleado);
				this.jInternalFrameDetalleFormEstadoGastoEmpleado.setVisible(false);
				this.jInternalFrameDetalleFormEstadoGastoEmpleado.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoGastoEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoGastoEmpleado);
					this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoGastoEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoGastoEmpleado);
					this.jInternalFrameImportacionEstadoGastoEmpleado.setVisible(false);
					this.jInternalFrameImportacionEstadoGastoEmpleado.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoGastoEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoGastoEmpleado);
					this.jInternalFrameOrderByEstadoGastoEmpleado.setVisible(false);
					this.jInternalFrameOrderByEstadoGastoEmpleado.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoGastoEmpleadoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoGastoEmpleadoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadogastoempleadoReturnGeneral=new EstadoGastoEmpleadoParameterReturnGeneral();
			
			this.estadogastoempleadoParameterGeneral=new EstadoGastoEmpleadoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadogastoempleadoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoGastoEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(GastoEmpleadoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoGastoEmpleadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadogastoempleadoSessionBean.getEsGuardarRelacionado(),this.estadogastoempleadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoGastoEmpleadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadogastoempleadoSessionBean.getEsGuardarRelacionado(),this.estadogastoempleadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaDuplicarEstadoGastoEmpleado=true;
			this.isVisibilidadCeldaCopiarEstadoGastoEmpleado=true;
			this.isVisibilidadCeldaVerFormEstadoGastoEmpleado=true;
			this.isVisibilidadCeldaOrdenEstadoGastoEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaModificarEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaActualizarEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaEliminarEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaCancelarEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaGuardarEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoGastoEmpleado=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoGastoEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoGastoEmpleado();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoGastoEmpleado(false);
			
			this.setPermisosUsuarioEstadoGastoEmpleado();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadogastoempleadoSessionBean.getEsGuardarRelacionado() 
				|| (this.estadogastoempleadoSessionBean.getEsGuardarRelacionado() && this.estadogastoempleadoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoGastoEmpleadoClasesRelacionadas();
			}
			
			if(this.estadogastoempleadoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoGastoEmpleadoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoGastoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoGastoEmpleado();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoGastoEmpleado();
			}
			
			if(!this.isPermisoBusquedaEstadoGastoEmpleado) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoGastoEmpleado,this.isPermisoPaginacionMedioEstadoGastoEmpleado,this.isPermisoPaginacionTodoEstadoGastoEmpleado);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoGastoEmpleadoConstantesFunciones.getTiposSeleccionarEstadoGastoEmpleado());
				
				this.tiposColumnasSelect=EstadoGastoEmpleadoConstantesFunciones.getTiposSeleccionarEstadoGastoEmpleado(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoGastoEmpleado();				
				//this.tiposRelacionesSelect=EstadoGastoEmpleadoConstantesFunciones.getTiposRelacionesEstadoGastoEmpleado(true);
				
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
			//if(!this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoGastoEmpleado();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoGastoEmpleado(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoGastoEmpleado(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoGastoEmpleado() ;
			
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
			
			
			this.gastoempleadoLogic=new GastoEmpleadoLogic(); 
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
				estadogastoempleadoImplementable= (EstadoGastoEmpleadoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoGastoEmpleadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadogastoempleadoImplementableHome= (EstadoGastoEmpleadoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoGastoEmpleadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadogastoempleados= new ArrayList<EstadoGastoEmpleado>();
			this.estadogastoempleadosEliminados= new ArrayList<EstadoGastoEmpleado>();
						
			this.isEsNuevoEstadoGastoEmpleado=false;
			this.esParaAccionDesdeFormularioEstadoGastoEmpleado=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoGastoEmpleado(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoGastoEmpleado();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoGastoEmpleadoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoGastoEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoGastoEmpleado(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoGastoEmpleado();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoGastoEmpleado();
			}
			
			EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoGastoEmpleado(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoGastoEmpleado: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoGastoEmpleado() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoGastoEmpleado")) {
				iIndex=this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTabbedPaneRelacionesEstadoGastoEmpleado.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTabbedPaneRelacionesEstadoGastoEmpleado.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoGastoEmpleado.getSelectedRow();	
				
				

				if(sTitle.equals("Gasto Empleados")) {
					if(!GastoEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoGastoEmpleado();

						this.cargarParteTabPanelRelacionadaGastoEmpleado(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoGastoEmpleado();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaGastoEmpleado(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.cargarSessionConBeanSwingJInternalFrameGastoEmpleado(false,true,iIndex);
		this.jButtonGastoEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaGastoEmpleado();

		//this.jTabbedPaneRelacionesEstadoGastoEmpleado.updateUI();
		//this.jTabbedPaneRelacionesEstadoGastoEmpleado.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoGastoEmpleado.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("GastoEmpleado")) {
				int row=this.jTableDatosEstadoGastoEmpleado.getSelectedRow();
				jButtonGastoEmpleadoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Gasto Empleado")) {

					if(this.isTienePermisosGastoEmpleado && this.estadogastoempleadoConstantesFunciones.mostrarGastoEmpleadoEstadoGastoEmpleado && !EstadoGastoEmpleadoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Gasto Empleados"+"("+GastoEmpleadoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Gasto Empleados");

						if(estadogastoempleadoConstantesFunciones.resaltarGastoEmpleadoEstadoGastoEmpleado!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadogastoempleadoConstantesFunciones.resaltarGastoEmpleadoEstadoGastoEmpleado);
						}

						jmenuItem.setEnabled(this.estadogastoempleadoConstantesFunciones.activarGastoEmpleadoEstadoGastoEmpleado);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"GastoEmpleado"));

						

						this.jInternalFrameDetalleFormEstadoGastoEmpleado.jmenuDetalleEstadoGastoEmpleado.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoGastoEmpleado(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoGastoEmpleado(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoGastoEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoGastoEmpleadoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoGastoEmpleado();
		
		this.cargarCombosFrameForeignKeyEstadoGastoEmpleado();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoGastoEmpleado();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoGastoEmpleado();
		}
	}
	
	
	
	public void jButtonNuevoEstadoGastoEmpleadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadogastoempleadoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoGastoEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
			
			
			if(jTableDatosEstadoGastoEmpleado.getRowCount()>=1) {
				jTableDatosEstadoGastoEmpleado.removeRowSelectionInterval(0, jTableDatosEstadoGastoEmpleado.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoGastoEmpleado=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoGastoEmpleado(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoGastoEmpleado(true);			
			//this.estadogastoempleado=new EstadoGastoEmpleado();
			//this.estadogastoempleado.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoGastoEmpleado(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoGastoEmpleado() ;
			
			if(EstadoGastoEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoGastoEmpleado(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadogastoempleado);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadogastoempleado);				
			
			EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
			
			if(this.estadogastoempleadoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoGastoEmpleado: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoGastoEmpleadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoGastoEmpleado> estadogastoempleadosSeleccionados=new ArrayList<EstadoGastoEmpleado>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoGastoEmpleado.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoGastoEmpleado.getSelectedRows().length;			
			}
			
			estadogastoempleadosSeleccionados=this.getEstadoGastoEmpleadosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoGastoEmpleado--;			
				//EstadoGastoEmpleado estadogastoempleadoAux= new EstadoGastoEmpleado();			
				//estadogastoempleadoAux.setId(this.iIdNuevoEstadoGastoEmpleado);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoGastoEmpleado estadogastoempleadoOrigen=new EstadoGastoEmpleado();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoGastoEmpleado estadogastoempleadoOrigen : estadogastoempleadosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoGastoEmpleado.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadogastoempleadoOrigen =(EstadoGastoEmpleado) this.estadogastoempleadoLogic.getEstadoGastoEmpleados().toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadogastoempleadoOrigen =(EstadoGastoEmpleado) this.estadogastoempleados.toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoGastoEmpleado();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadogastoempleado.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoGastoEmpleado(estadogastoempleadoOrigen,this.estadogastoempleado,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoGastoEmpleado(this.estadogastoempleado);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadogastoempleadoLogic.getEstadoGastoEmpleados().add(this.estadogastoempleadoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadogastoempleados.add(this.estadogastoempleadoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoGastoEmpleado(false);
				
				this.jTableDatosEstadoGastoEmpleado.setRowSelectionInterval(this.getIndiceNuevoEstadoGastoEmpleado(), this.getIndiceNuevoEstadoGastoEmpleado());
				
				int iLastRow =  this.jTableDatosEstadoGastoEmpleado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoGastoEmpleado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoGastoEmpleado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoGastoEmpleado(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoGastoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoGastoEmpleado> estadogastoempleadosSeleccionados=new ArrayList<EstadoGastoEmpleado>();									
		
			EstadoGastoEmpleado estadogastoempleadoOrigen=new EstadoGastoEmpleado();
			EstadoGastoEmpleado estadogastoempleadoDestino=new EstadoGastoEmpleado();
				
			estadogastoempleadosSeleccionados=this.getEstadoGastoEmpleadosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoGastoEmpleado.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadogastoempleadosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoGastoEmpleado.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadogastoempleadoOrigen =(EstadoGastoEmpleado) this.estadogastoempleadoLogic.getEstadoGastoEmpleados().toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadogastoempleadoOrigen =(EstadoGastoEmpleado) this.estadogastoempleados.toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadogastoempleadoDestino =(EstadoGastoEmpleado) this.estadogastoempleadoLogic.getEstadoGastoEmpleados().toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadogastoempleadoDestino =(EstadoGastoEmpleado) this.estadogastoempleados.toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadogastoempleadoOrigen =estadogastoempleadosSeleccionados.get(0);
				estadogastoempleadoDestino =estadogastoempleadosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoGastoEmpleado(estadogastoempleadoOrigen,estadogastoempleadoDestino,true,false);
				
				estadogastoempleadoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadogastoempleadoDestino,estadogastoempleadoLogic.getEstadoGastoEmpleados());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadogastoempleadoDestino,estadogastoempleados);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoGastoEmpleado(false);
				
				//this.jTableDatosEstadoGastoEmpleado.setRowSelectionInterval(this.getIndiceNuevoEstadoGastoEmpleado(), this.getIndiceNuevoEstadoGastoEmpleado());
				
				int iLastRow =  this.jTableDatosEstadoGastoEmpleado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoGastoEmpleado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoGastoEmpleado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoGastoEmpleado(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoGastoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoGastoEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoGastoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoGastoEmpleado.isVisible();
			
			
			this.jPanelParametrosReportesEstadoGastoEmpleado.setVisible(!isVisible);
			this.jPanelPaginacionEstadoGastoEmpleado.setVisible(!isVisible);
			this.jPanelAccionesEstadoGastoEmpleado.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoGastoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoGastoEmpleado();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoGastoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoGastoEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoGastoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoGastoEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoGastoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoGastoEmpleado();
			
			this.abrirFrameOrderByEstadoGastoEmpleado();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoGastoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoGastoEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoGastoEmpleado(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoGastoEmpleado);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoGastoEmpleado.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoGastoEmpleado.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoGastoEmpleado.setSize(this.jInternalFrameDetalleFormEstadoGastoEmpleado.iWidthFormulario,this.jInternalFrameDetalleFormEstadoGastoEmpleado.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoGastoEmpleado.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoGastoEmpleado.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoGastoEmpleado.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoGastoEmpleado.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoGastoEmpleado.jContentPaneDetalleEstadoGastoEmpleado.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTabbedPaneRelacionesEstadoGastoEmpleado.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoGastoEmpleado.jContentPaneDetalleEstadoGastoEmpleado.getWidth(),EstadoGastoEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTabbedPaneRelacionesEstadoGastoEmpleado.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoGastoEmpleado.jContentPaneDetalleEstadoGastoEmpleado.getWidth(),EstadoGastoEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTabbedPaneRelacionesEstadoGastoEmpleado.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoGastoEmpleado.jContentPaneDetalleEstadoGastoEmpleado.getWidth(),EstadoGastoEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(GastoEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaGastoEmpleado();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoGastoEmpleado.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoGastoEmpleado.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoGastoEmpleado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoGastoEmpleado==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoGastoEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoGastoEmpleado,false,this);
				} else {
					this.jInternalFrameOrderByEstadoGastoEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoGastoEmpleado,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoGastoEmpleado);
				this.jInternalFrameOrderByEstadoGastoEmpleado.setVisible(false);
				this.jInternalFrameOrderByEstadoGastoEmpleado.setSelected(false);
				
				this.jInternalFrameOrderByEstadoGastoEmpleado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoGastoEmpleado"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoGastoEmpleado();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoGastoEmpleado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoGastoEmpleado==null) {
				
				this.jInternalFrameImportacionEstadoGastoEmpleado=new ImportacionJInternalFrame(EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoGastoEmpleado);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoGastoEmpleado);
				this.jInternalFrameImportacionEstadoGastoEmpleado.setVisible(false);
				this.jInternalFrameImportacionEstadoGastoEmpleado.setSelected(false);


				this.jInternalFrameImportacionEstadoGastoEmpleado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoGastoEmpleado"));
				this.jInternalFrameImportacionEstadoGastoEmpleado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoGastoEmpleado"));
				this.jInternalFrameImportacionEstadoGastoEmpleado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoGastoEmpleado"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoGastoEmpleado() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoGastoEmpleado==null) {
				this.jInternalFrameReporteDinamicoEstadoGastoEmpleado=new ReporteDinamicoJInternalFrame(EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoGastoEmpleado);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoGastoEmpleado);
				this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoGastoEmpleado"));
				this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoGastoEmpleado"));
				this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoGastoEmpleado"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoGastoEmpleado();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaGastoEmpleado() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.jScrollPanelDatosGastoEmpleado.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoGastoEmpleado.jContentPaneDetalleEstadoGastoEmpleado.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.jScrollPanelDatosGastoEmpleado.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.jScrollPanelDatosGastoEmpleado.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.jScrollPanelDatosGastoEmpleado.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoGastoEmpleado() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoGastoEmpleado);
			
	       	this.jInternalFrameDetalleFormEstadoGastoEmpleado.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoGastoEmpleado.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoGastoEmpleado.dispose();
			//this.jInternalFrameDetalleFormEstadoGastoEmpleado=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoGastoEmpleado() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoGastoEmpleado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoGastoEmpleado.setVisible(true);
	        this.jInternalFrameImportacionEstadoGastoEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoGastoEmpleado() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoGastoEmpleado.setVisible(true);
	        this.jInternalFrameOrderByEstadoGastoEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoGastoEmpleado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoGastoEmpleado.setVisible(false);
	        this.jInternalFrameOrderByEstadoGastoEmpleado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoGastoEmpleado() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoGastoEmpleado() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoGastoEmpleado.setVisible(false);
	        this.jInternalFrameImportacionEstadoGastoEmpleado.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoGastoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoGastoEmpleado(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoGastoEmpleado(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoGastoEmpleado.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoGastoEmpleado(true);
			//this.isEsNuevoEstadoGastoEmpleado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleado =(EstadoGastoEmpleado) this.estadogastoempleadoLogic.getEstadoGastoEmpleados().toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadogastoempleado =(EstadoGastoEmpleado) this.estadogastoempleados.toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoGastoEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoGastoEmpleado(false) ;
			
			if(estadogastoempleadoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleadoSessionBean.getEsGuardarRelacionado() && GastoEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonGastoEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoGastoEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoGastoEmpleado(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoGastoEmpleado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoGastoEmpleadoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoGastoEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogastoempleado =(EstadoGastoEmpleado) this.estadogastoempleadoLogic.getEstadoGastoEmpleados().toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadogastoempleado =(EstadoGastoEmpleado) this.estadogastoempleados.toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoGastoEmpleado(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoGastoEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoGastoEmpleado.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoGastoEmpleado(true);
			//this.isEsNuevoEstadoGastoEmpleado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleado =(EstadoGastoEmpleado) this.estadogastoempleadoLogic.getEstadoGastoEmpleados().toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadogastoempleado =(EstadoGastoEmpleado) this.estadogastoempleados.toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadogastoempleado.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoGastoEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoGastoEmpleado(false) ;
			
			if(EstadoGastoEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoGastoEmpleado(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoGastoEmpleado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoGastoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoGastoEmpleado(false);
			
			//if(!this.isEsNuevoEstadoGastoEmpleado) {								
				int intSelectedRow = this.jTableDatosEstadoGastoEmpleado.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogastoempleado =(EstadoGastoEmpleado) this.estadogastoempleadoLogic.getEstadoGastoEmpleados().toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadogastoempleado =(EstadoGastoEmpleado) this.estadogastoempleados.toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoGastoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoGastoEmpleado(this.estadogastoempleado,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoGastoEmpleado(this.estadogastoempleado);
				
			}
			
			if(this.permiteMantenimiento(this.estadogastoempleado)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoGastoEmpleado=true;
					this.inicializarActualizarBindingTablaEstadoGastoEmpleado(false);
					this.isEsNuevoEstadoGastoEmpleado=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoGastoEmpleado=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoGastoEmpleado=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoGastoEmpleado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoGastoEmpleado(false);
				
				this.habilitarDeshabilitarControlesEstadoGastoEmpleado(false);
			
												
				
				if(EstadoGastoEmpleadoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoGastoEmpleado();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoGastoEmpleadoActionPerformed(evt,estadogastoempleadoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoGastoEmpleado(this.estadogastoempleado,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoGastoEmpleado.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadogastoempleadoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadogastoempleado.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoGastoEmpleado.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoGastoEmpleado.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoGastoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoGastoEmpleado.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleado =(EstadoGastoEmpleado) this.estadogastoempleadoLogic.getEstadoGastoEmpleados().toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
				this.estadogastoempleado.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadogastoempleado =(EstadoGastoEmpleado) this.estadogastoempleados.toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
				this.estadogastoempleado.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadogastoempleado)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoGastoEmpleadoModel) this.jTableDatosEstadoGastoEmpleado.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoGastoEmpleado=true;
				this.inicializarActualizarBindingTablaEstadoGastoEmpleado(false);
				this.isEsNuevoEstadoGastoEmpleado=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoGastoEmpleado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoGastoEmpleado(false);
				
				this.habilitarDeshabilitarControlesEstadoGastoEmpleado(false);
				
				
				
				if(EstadoGastoEmpleadoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoGastoEmpleado();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoGastoEmpleadoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoGastoEmpleado.getRowCount()>=1) {
				jTableDatosEstadoGastoEmpleado.removeRowSelectionInterval(0, jTableDatosEstadoGastoEmpleado.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoGastoEmpleado(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoGastoEmpleado(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoGastoEmpleado(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoGastoEmpleado(false) ;
			
			this.isEsNuevoEstadoGastoEmpleado=false;
			
			if(EstadoGastoEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoGastoEmpleado();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoGastoEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoGastoEmpleado(false);
				
				//SI ES MANUAL
				if(EstadoGastoEmpleadoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoGastoEmpleado();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoGastoEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoGastoEmpleado--;			
			//EstadoGastoEmpleado estadogastoempleadoAux= new EstadoGastoEmpleado();			
			//estadogastoempleadoAux.setId(this.iIdNuevoEstadoGastoEmpleado);
			
			if(this.jInternalFrameDetalleFormEstadoGastoEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoGastoEmpleado();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoGastoEmpleado(this.estadogastoempleado);
			
			this.estadogastoempleado.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadogastoempleadoLogic.getEstadoGastoEmpleados().add(this.estadogastoempleadoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadogastoempleados.add(this.estadogastoempleadoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoGastoEmpleado(false);
			
			this.jTableDatosEstadoGastoEmpleado.setRowSelectionInterval(this.getIndiceNuevoEstadoGastoEmpleado(), this.getIndiceNuevoEstadoGastoEmpleado());
			
			int iLastRow =  this.jTableDatosEstadoGastoEmpleado.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoGastoEmpleado.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoGastoEmpleado.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoGastoEmpleado(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoGastoEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoGastoEmpleado(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoGastoEmpleado(false);
			
			//SI ES MANUAL
			if(EstadoGastoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoGastoEmpleado();
			}
			
			//this.abrirFrameTreeEstadoGastoEmpleado();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoGastoEmpleadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado Gasto EmpleadoS ?", "MANTENIMIENTO DE Estado Gasto Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoGastoEmpleado.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoGastoEmpleado();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadogastoempleadoReturnGeneral=estadogastoempleadoLogic.procesarImportacionEstadoGastoEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadogastoempleadoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoGastoEmpleadoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoGastoEmpleadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoGastoEmpleado.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoGastoEmpleado.setFileImportacion(this.jInternalFrameImportacionEstadoGastoEmpleado.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoGastoEmpleado.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoGastoEmpleado.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoGastoEmpleado.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoGastoEmpleado.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoGastoEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoGastoEmpleado> estadogastoempleadosSeleccionados=new ArrayList<EstadoGastoEmpleado>();		

		estadogastoempleadosSeleccionados=this.getEstadoGastoEmpleadosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoGastoEmpleadoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoGastoEmpleadoBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoGastoEmpleados("Todos",estadogastoempleadosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Gasto Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoGastoEmpleadoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoGastoEmpleadoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoGastoEmpleadoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoGastoEmpleadoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoGastoEmpleadoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoGastoEmpleadoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoGastoEmpleadoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoGastoEmpleadoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoGastoEmpleadoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoGastoEmpleado> estadogastoempleadosSeleccionados=new ArrayList<EstadoGastoEmpleado>();		
		
		estadogastoempleadosSeleccionados=this.getEstadoGastoEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadogastoempleado";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoGastoEmpleados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoGastoEmpleadoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoGastoEmpleadoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoGastoEmpleado estadogastoempleado:estadogastoempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadogastoempleado.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoGastoEmpleadoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoGastoEmpleadoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoGastoEmpleado estadogastoempleado:estadogastoempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadogastoempleado.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoGastoEmpleado(row);				
			//	iRow++;
			//}				
			
			//for(EstadoGastoEmpleado estadogastoempleadoAux:estadogastoempleadosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoGastoEmpleado(estadogastoempleadoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Gasto Empleado",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadogastoempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoGastoEmpleado(false);
			
			//SI ES MANUAL
			if(EstadoGastoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoGastoEmpleado();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoGastoEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoGastoEmpleado(false);
			
			//SI ES MANUAL
			if(EstadoGastoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoGastoEmpleado();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoGastoEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoGastoEmpleado(false);
			
			//SI ES MANUAL
			if(EstadoGastoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoGastoEmpleado();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogastoempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoGastoEmpleado() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoGastoEmpleado.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoGastoEmpleado.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoGastoEmpleado.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoGastoEmpleado.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoGastoEmpleado.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoGastoEmpleado.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoGastoEmpleado.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoGastoEmpleado(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoGastoEmpleado(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoGastoEmpleado(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoGastoEmpleado(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoGastoEmpleado(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoGastoEmpleado(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoGastoEmpleado(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoGastoEmpleado(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoGastoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoGastoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoGastoEmpleado() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoGastoEmpleado();
		
		this.inicializarActualizarBindingBotonesManualEstadoGastoEmpleado(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoGastoEmpleado();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoGastoEmpleado() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoGastoEmpleado(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoGastoEmpleado(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoGastoEmpleado.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoGastoEmpleado.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoGastoEmpleado.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoGastoEmpleado.jCheckBoxPostAccionNuevoEstadoGastoEmpleado.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoGastoEmpleado.jCheckBoxPostAccionSinCerrarEstadoGastoEmpleado.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoGastoEmpleado.jCheckBoxPostAccionSinMensajeEstadoGastoEmpleado.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoGastoEmpleado.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoGastoEmpleado.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoGastoEmpleado.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) {
				this.jInternalFrameDetalleFormEstadoGastoEmpleado.jCheckBoxPostAccionNuevoEstadoGastoEmpleado.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoGastoEmpleado.jCheckBoxPostAccionSinCerrarEstadoGastoEmpleado.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoGastoEmpleado.jCheckBoxPostAccionSinMensajeEstadoGastoEmpleado.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoGastoEmpleado.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoGastoEmpleado.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoGastoEmpleado.jComboBoxTiposAccionesFormularioEstadoGastoEmpleado.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoGastoEmpleado.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoGastoEmpleado!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoGastoEmpleado.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoGastoEmpleado.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoGastoEmpleado.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoGastoEmpleado.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoGastoEmpleado!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoGastoEmpleado.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoGastoEmpleado.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoGastoEmpleado(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoGastoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoGastoEmpleado(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoGastoEmpleado() throws Exception {
		try	{
			if(EstadoGastoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoGastoEmpleado();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoGastoEmpleado() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jComboBoxTiposAccionesFormularioEstadoGastoEmpleado.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jComboBoxTiposAccionesFormularioEstadoGastoEmpleado.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoGastoEmpleado() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoGastoEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoGastoEmpleado.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoGastoEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoGastoEmpleado.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoGastoEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoGastoEmpleado.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoGastoEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoGastoEmpleado.addItem(reporte);
			}
			
			
			if(!this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoGastoEmpleado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoGastoEmpleado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoGastoEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoGastoEmpleado.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoGastoEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoGastoEmpleado.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoGastoEmpleado.jComboBoxTiposAccionesFormularioEstadoGastoEmpleado.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoGastoEmpleado.jComboBoxTiposAccionesFormularioEstadoGastoEmpleado.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoGastoEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoGastoEmpleado.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoGastoEmpleado.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoGastoEmpleado();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoGastoEmpleado() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoGastoEmpleado!=null) {
				this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoGastoEmpleado!=null) {
				this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoGastoEmpleado!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoGastoEmpleado()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoGastoEmpleado(Boolean esInicializar) throws Exception {				
		if(EstadoGastoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoGastoEmpleado();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoGastoEmpleado() throws Exception {
		this.inicializarActualizarBindingTablaEstadoGastoEmpleado(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoGastoEmpleado() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoGastoEmpleado.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoGastoEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoGastoEmpleado.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoGastoEmpleadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoGastoEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoGastoEmpleado.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoGastoEmpleadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoGastoEmpleadoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoGastoEmpleadoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoGastoEmpleadoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoGastoEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoGastoEmpleado.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoGastoEmpleadoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoGastoEmpleado.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoGastoEmpleado(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadogastoempleadoLogic.getEstadoGastoEmpleados().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadogastoempleados.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoGastoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoGastoEmpleado.setModel(new EstadoGastoEmpleadoModel(this.estadogastoempleadoLogic.getEstadoGastoEmpleados(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoGastoEmpleado.setModel(new EstadoGastoEmpleadoModel(this.estadogastoempleados,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoGastoEmpleado!=null && this.jInternalFrameOrderByEstadoGastoEmpleado.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoGastoEmpleado();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoGastoEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoGastoEmpleado,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoGastoEmpleadoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO,estadogastoempleadoConstantesFunciones.resaltarSeleccionarEstadoGastoEmpleado,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO,estadogastoempleadoConstantesFunciones.resaltarSeleccionarEstadoGastoEmpleado,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoGastoEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoGastoEmpleado,EstadoGastoEmpleadoConstantesFunciones.LABEL_ID));

		if(this.estadogastoempleadoConstantesFunciones.mostraridEstadoGastoEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoGastoEmpleadoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadogastoempleadoConstantesFunciones.resaltaridEstadoGastoEmpleado,this.estadogastoempleadoConstantesFunciones.activaridEstadoGastoEmpleado,this,true,"idEstadoGastoEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadogastoempleadoConstantesFunciones.resaltaridEstadoGastoEmpleado,this.estadogastoempleadoConstantesFunciones.activaridEstadoGastoEmpleado,this,true,"idEstadoGastoEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoGastoEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoGastoEmpleado,EstadoGastoEmpleadoConstantesFunciones.LABEL_CODIGO));

		if(this.estadogastoempleadoConstantesFunciones.mostrarcodigoEstadoGastoEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoGastoEmpleadoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadogastoempleadoConstantesFunciones.resaltarcodigoEstadoGastoEmpleado,this.estadogastoempleadoConstantesFunciones.activarcodigoEstadoGastoEmpleado,this,true,"codigoEstadoGastoEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadogastoempleadoConstantesFunciones.resaltarcodigoEstadoGastoEmpleado,this.estadogastoempleadoConstantesFunciones.activarcodigoEstadoGastoEmpleado,this,true,"codigoEstadoGastoEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoGastoEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoGastoEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoGastoEmpleado,EstadoGastoEmpleadoConstantesFunciones.LABEL_NOMBRE));

		if(this.estadogastoempleadoConstantesFunciones.mostrarnombreEstadoGastoEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoGastoEmpleadoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadogastoempleadoConstantesFunciones.resaltarnombreEstadoGastoEmpleado,this.estadogastoempleadoConstantesFunciones.activarnombreEstadoGastoEmpleado,this,true,"nombreEstadoGastoEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadogastoempleadoConstantesFunciones.resaltarnombreEstadoGastoEmpleado,this.estadogastoempleadoConstantesFunciones.activarnombreEstadoGastoEmpleado,this,true,"nombreEstadoGastoEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoGastoEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosGastoEmpleado && this.estadogastoempleadoConstantesFunciones.mostrarGastoEmpleadoEstadoGastoEmpleado && !EstadoGastoEmpleadoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Gasto Empleados");
				tableColumn.setHeaderValue("Gasto Empleados");
				tableColumn.setCellRenderer(new GastoEmpleadoTableCell(estadogastoempleadoConstantesFunciones.resaltarGastoEmpleadoEstadoGastoEmpleado,this,this.estadogastoempleadoConstantesFunciones.activarGastoEmpleadoEstadoGastoEmpleado));
				tableColumn.setCellEditor(new GastoEmpleadoTableCell(estadogastoempleadoConstantesFunciones.resaltarGastoEmpleadoEstadoGastoEmpleado,this,this.estadogastoempleadoConstantesFunciones.activarGastoEmpleadoEstadoGastoEmpleado));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoGastoEmpleado.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoGastoEmpleado.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoGastoEmpleado.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoGastoEmpleado && this.isPermisoGuardarCambiosEstadoGastoEmpleado) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoGastoEmpleado.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadogastoempleadoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoGastoEmpleado.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoGastoEmpleado.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoGastoEmpleado && this.isPermisoGuardarCambiosEstadoGastoEmpleado) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadogastoempleadoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoGastoEmpleado && this.isPermisoGuardarCambiosEstadoGastoEmpleado) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoGastoEmpleado.moveColumn(this.jTableDatosEstadoGastoEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoGastoEmpleado.moveColumn(this.jTableDatosEstadoGastoEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadogastoempleadoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoGastoEmpleado.moveColumn(this.jTableDatosEstadoGastoEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoGastoEmpleado.moveColumn(this.jTableDatosEstadoGastoEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoGastoEmpleado.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoGastoEmpleado.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoGastoEmpleado,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoGastoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoGastoEmpleado.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoGastoEmpleado.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoGastoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoGastoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoGastoEmpleado.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoGastoEmpleado.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoGastoEmpleado.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadogastoempleadoLogic.getEstadoGastoEmpleados().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadogastoempleados.size()-1;
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
		//this.jTableDatosEstadoGastoEmpleado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoGastoEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoGastoEmpleado();
			
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
				
				//this.isEsNuevoEstadoGastoEmpleado=false;
					
				EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
			
				if(this.estadogastoempleadoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoGastoEmpleado==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoGastoEmpleado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoGastoEmpleado.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogastoempleado =(EstadoGastoEmpleado) this.estadogastoempleadoLogic.getEstadoGastoEmpleados().toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadogastoempleado =(EstadoGastoEmpleado) this.estadogastoempleados.toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadogastoempleado.getsType().equals("DUPLICADO")
				   || this.estadogastoempleado.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoGastoEmpleado=true;
				
				} else {
					this.isEsNuevoEstadoGastoEmpleado=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
					if(this.estadogastoempleado.getId()>=0 && !this.estadogastoempleado.getIsNew()) {						
						this.isEsNuevoEstadoGastoEmpleado=false;
						
					} else {
						this.isEsNuevoEstadoGastoEmpleado=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoGastoEmpleado(esRelaciones);						
				
				this.seleccionarEstadoGastoEmpleado(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadogastoempleado.getId()<0) {
					this.isEsNuevoEstadoGastoEmpleado=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoGastoEmpleado(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoGastoEmpleado(evt,rowIndex);
				}	
				
				if(this.estadogastoempleadoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoGastoEmpleado: " + this.dDif); 
					}
				}								
				
				EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoGastoEmpleado(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadogastoempleado)) {
					if(this.estadogastoempleado.getId()>0) {
						this.estadogastoempleado.setIsDeleted(true);
						
						this.estadogastoempleadosEliminados.add(this.estadogastoempleado);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadogastoempleadoLogic.getEstadoGastoEmpleados().remove(this.estadogastoempleado);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadogastoempleados.remove(this.estadogastoempleado);				
					}
					
					
					((EstadoGastoEmpleadoModel) this.jTableDatosEstadoGastoEmpleado.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoGastoEmpleado(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoGastoEmpleado(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoGastoEmpleado) {
			
			if(this.jInternalFrameDetalleFormEstadoGastoEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoGastoEmpleado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoGastoEmpleado.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogastoempleado =(EstadoGastoEmpleado) this.estadogastoempleadoLogic.getEstadoGastoEmpleados().toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadogastoempleado =(EstadoGastoEmpleado) this.estadogastoempleados.toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoGastoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoGastoEmpleado(this.estadogastoempleado);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoGastoEmpleado("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoGastoEmpleado(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoGastoEmpleado() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoGastoEmpleado(EstadoGastoEmpleado estadogastoempleado) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoGastoEmpleado(estadogastoempleado,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoGastoEmpleado(EstadoGastoEmpleado estadogastoempleado,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoGastoEmpleado(estadogastoempleado);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoGastoEmpleado(estadogastoempleado,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoGastoEmpleado(estadogastoempleado);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoGastoEmpleado(EstadoGastoEmpleado estadogastoempleado) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoGastoEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTextFieldidEstadoGastoEmpleado.setText(estadogastoempleado.getId().toString());
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTextFieldcodigoEstadoGastoEmpleado.setText(estadogastoempleado.getcodigo());
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTextAreanombreEstadoGastoEmpleado.setText(estadogastoempleado.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoGastoEmpleado estadogastoempleadoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadogastoempleadoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoGastoEmpleado estadogastoempleadoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadogastoempleadoLocal=this.estadogastoempleado;
			} else {
				estadogastoempleadoLocal=this.estadogastoempleadoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadogastoempleadoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoGastoEmpleado(estadogastoempleadoLocal,true);
					
					if(estadogastoempleadoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadogastoempleadoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadogastoempleadoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoGastoEmpleado(EstadoGastoEmpleado estadogastoempleado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoGastoEmpleado(estadogastoempleado,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoGastoEmpleado(estadogastoempleado);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoGastoEmpleado(EstadoGastoEmpleado estadogastoempleado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoGastoEmpleado(estadogastoempleado,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoGastoEmpleado(EstadoGastoEmpleado estadogastoempleado,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoGastoEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTextFieldidEstadoGastoEmpleado.getText()==null || this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTextFieldidEstadoGastoEmpleado.getText()=="" || this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTextFieldidEstadoGastoEmpleado.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTextFieldidEstadoGastoEmpleado.setText("0");
			}

			if(conColumnasBase) {estadogastoempleado.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTextFieldidEstadoGastoEmpleado.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoGastoEmpleadoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoGastoEmpleado.jLabelIdEstadoGastoEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadogastoempleado.setcodigo(this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTextFieldcodigoEstadoGastoEmpleado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoGastoEmpleadoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoGastoEmpleado.jLabelcodigoEstadoGastoEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadogastoempleado.setnombre(this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTextAreanombreEstadoGastoEmpleado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoGastoEmpleadoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoGastoEmpleado.jLabelnombreEstadoGastoEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoGastoEmpleado(EstadoGastoEmpleado estadogastoempleadoBean,EstadoGastoEmpleado estadogastoempleado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoGastoEmpleado(EstadoGastoEmpleado estadogastoempleadoOrigen,EstadoGastoEmpleado estadogastoempleado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadogastoempleadoOrigen.getId()!=null && !estadogastoempleadoOrigen.getId().equals(0L))) {estadogastoempleado.setId(estadogastoempleadoOrigen.getId());}}
			if(conDefault || (!conDefault && estadogastoempleadoOrigen.getcodigo()!=null && !estadogastoempleadoOrigen.getcodigo().equals(""))) {estadogastoempleado.setcodigo(estadogastoempleadoOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadogastoempleadoOrigen.getnombre()!=null && !estadogastoempleadoOrigen.getnombre().equals(""))) {estadogastoempleado.setnombre(estadogastoempleadoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoGastoEmpleado(EstadoGastoEmpleado estadogastoempleado) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTextFieldidEstadoGastoEmpleado.setText(estadogastoempleado.getId().toString());
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTextFieldcodigoEstadoGastoEmpleado.setText(estadogastoempleado.getcodigo());
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTextAreanombreEstadoGastoEmpleado.setText(estadogastoempleado.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoGastoEmpleado(EstadoGastoEmpleadoBean estadogastoempleadoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTextFieldidEstadoGastoEmpleado.setText(estadogastoempleadoBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTextFieldcodigoEstadoGastoEmpleado.setText(estadogastoempleadoBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTextAreanombreEstadoGastoEmpleado.setText(estadogastoempleadoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoGastoEmpleado(EstadoGastoEmpleadoParameterReturnGeneral estadogastoempleadoReturnGeneral,EstadoGastoEmpleadoBean estadogastoempleadoBean,Boolean conDefault) throws Exception { 
		try {
			EstadoGastoEmpleado estadogastoempleadoLocal=new EstadoGastoEmpleado();
			
			estadogastoempleadoLocal=estadogastoempleadoReturnGeneral.getEstadoGastoEmpleado();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadogastoempleadoLocal.getId()!=null && !estadogastoempleadoLocal.getId().equals(0L))) {estadogastoempleadoBean.setId(estadogastoempleadoLocal.getId());}}
			if(conDefault || (!conDefault && estadogastoempleadoLocal.getcodigo()!=null && !estadogastoempleadoLocal.getcodigo().equals(""))) {estadogastoempleadoBean.setcodigo(estadogastoempleadoLocal.getcodigo());}
			if(conDefault || (!conDefault && estadogastoempleadoLocal.getnombre()!=null && !estadogastoempleadoLocal.getnombre().equals(""))) {estadogastoempleadoBean.setnombre(estadogastoempleadoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoGastoEmpleadoGenerico(Long idEstadoGastoEmpleadoSeleccionado,JComboBox jComboBoxEstadoGastoEmpleado,List<EstadoGastoEmpleado> estadogastoempleadosLocal)throws Exception {
		try {
			EstadoGastoEmpleado  estadogastoempleadoTemp=null;

			for(EstadoGastoEmpleado estadogastoempleadoAux:estadogastoempleadosLocal) {
				if(estadogastoempleadoAux.getId()!=null && estadogastoempleadoAux.getId().equals(idEstadoGastoEmpleadoSeleccionado)) {
					estadogastoempleadoTemp=estadogastoempleadoAux;
					break;
				}
			}

			jComboBoxEstadoGastoEmpleado.setSelectedItem(estadogastoempleadoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoGastoEmpleadoGenerico(JComboBox jComboBoxEstadoGastoEmpleado,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoGastoEmpleado.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoGastoEmpleado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoGastoEmpleado.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoGastoEmpleado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("GastoEmpleado")) {
			jButtonGastoEmpleadoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadogastoempleado=(EstadoGastoEmpleado) estadogastoempleadoLogic.getEstadoGastoEmpleados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadogastoempleado =(EstadoGastoEmpleado) estadogastoempleados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoGastoEmpleado estadogastoempleadoRow=new EstadoGastoEmpleado();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadogastoempleadoRow=(EstadoGastoEmpleado) estadogastoempleadoLogic.getEstadoGastoEmpleados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadogastoempleadoRow=(EstadoGastoEmpleado) estadogastoempleados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonGastoEmpleadoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoGastoEmpleado estadogastoempleado) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoGastoEmpleado==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogastoempleadoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadogastoempleado = (EstadoGastoEmpleado)this.estadogastoempleadoLogic.getEstadoGastoEmpleados().toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadogastoempleado = (EstadoGastoEmpleado)this.estadogastoempleados.toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadogastoempleado!=null) {
						this.estadogastoempleado = estadogastoempleado;
					} else {
						this.estadogastoempleado = new EstadoGastoEmpleado();
					}
				}

				if(this.isTienePermisosGastoEmpleado && this.permiteMantenimiento(this.estadogastoempleado)) {
					GastoEmpleadoBeanSwingJInternalFrame gastoempleadoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFramePopup=new GastoEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						gastoempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFramePopup;
					} else {
						gastoempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame;
					}

					List<EstadoGastoEmpleado> estadogastoempleados=new ArrayList<EstadoGastoEmpleado>();
					estadogastoempleados.add(this.estadogastoempleado);
					if(!esRelacionado) {
						//gastoempleadoBeanSwingJInternalFrame.gastoempleadoSessionBean.setConGuardarRelaciones(false);
						//gastoempleadoBeanSwingJInternalFrame.gastoempleadoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					gastoempleadoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoGastoEmpleado.cargarGastoEmpleadoBeanSwingJInternalFrame(estadogastoempleados,this.estadogastoempleado,gastoempleadoBeanSwingJInternalFrame,/*conInicializar,*/gastoempleadoBeanSwingJInternalFrame.gastoempleadoSessionBean.getConGuardarRelaciones(),gastoempleadoBeanSwingJInternalFrame.gastoempleadoSessionBean.getEsGuardarRelacionado());
					gastoempleadoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						gastoempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsGastoEmpleado("no_relacionado");

						gastoempleadoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(GastoEmpleadoConstantesFunciones.ITAMANIOFILATABLA + (GastoEmpleadoConstantesFunciones.ITAMANIOFILATABLA/2));

						gastoempleadoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoGastoEmpleado=(TitledBorder)this.jScrollPanelDatosEstadoGastoEmpleado.getBorder();
						TitledBorder titledBorderGastoEmpleado=(TitledBorder)gastoempleadoBeanSwingJInternalFrame.jScrollPanelDatosGastoEmpleado.getBorder();

						titledBorderGastoEmpleado.setTitle(titledBorderEstadoGastoEmpleado.getTitle() + " -> Gasto Empleado");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,gastoempleadoBeanSwingJInternalFrame);
						}

						gastoempleadoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(gastoempleadoBeanSwingJInternalFrame);

						gastoempleadoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadogastoempleadoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Gasto Empleado",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogastoempleadoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogastoempleadoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogastoempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoGastoEmpleado(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaNuevoEstadoGastoEmpleado && this.isPermisoNuevoEstadoGastoEmpleado));			
			this.jButtonDuplicarEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaDuplicarEstadoGastoEmpleado && this.isPermisoDuplicarEstadoGastoEmpleado));			
			this.jButtonCopiarEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaCopiarEstadoGastoEmpleado && this.isPermisoCopiarEstadoGastoEmpleado));
			this.jButtonVerFormEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaVerFormEstadoGastoEmpleado && this.isPermisoVerFormEstadoGastoEmpleado));
			
			this.jButtonAbrirOrderByEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaOrdenEstadoGastoEmpleado && this.isPermisoOrdenEstadoGastoEmpleado));			
			
			this.jButtonNuevoRelacionesEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoGastoEmpleado && this.isPermisoNuevoEstadoGastoEmpleado));			
			this.jButtonNuevoGuardarCambiosEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaNuevoEstadoGastoEmpleado && this.isPermisoNuevoEstadoGastoEmpleado && this.isPermisoGuardarCambiosEstadoGastoEmpleado));
			
			if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) {
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonModificarEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaModificarEstadoGastoEmpleado && this.isPermisoActualizarEstadoGastoEmpleado));	
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonActualizarEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaActualizarEstadoGastoEmpleado && this.isPermisoActualizarEstadoGastoEmpleado));	
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonEliminarEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaEliminarEstadoGastoEmpleado && this.isPermisoEliminarEstadoGastoEmpleado));
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonCancelarEstadoGastoEmpleado.setVisible(this.isVisibilidadCeldaCancelarEstadoGastoEmpleado);							
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonGuardarCambiosEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaGuardarEstadoGastoEmpleado && this.isPermisoGuardarCambiosEstadoGastoEmpleado));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoGastoEmpleado && this.isPermisoGuardarCambiosEstadoGastoEmpleado));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaNuevoEstadoGastoEmpleado && this.isPermisoNuevoEstadoGastoEmpleado));						
			this.jButtonDuplicarToolBarEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaDuplicarEstadoGastoEmpleado && this.isPermisoDuplicarEstadoGastoEmpleado));						
			this.jButtonCopiarToolBarEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaCopiarEstadoGastoEmpleado && this.isPermisoCopiarEstadoGastoEmpleado));			
			this.jButtonVerFormToolBarEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaVerFormEstadoGastoEmpleado && this.isPermisoVerFormEstadoGastoEmpleado));			
			this.jButtonAbrirOrderByToolBarEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaOrdenEstadoGastoEmpleado && this.isPermisoOrdenEstadoGastoEmpleado));
			this.jButtonNuevoRelacionesToolBarEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoGastoEmpleado && this.isPermisoNuevoEstadoGastoEmpleado));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaNuevoEstadoGastoEmpleado && this.isPermisoNuevoEstadoGastoEmpleado && this.isPermisoGuardarCambiosEstadoGastoEmpleado));			
			
			if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) {
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonModificarToolBarEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaModificarEstadoGastoEmpleado && this.isPermisoActualizarEstadoGastoEmpleado));	
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonActualizarToolBarEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaActualizarEstadoGastoEmpleado  && this.isPermisoActualizarEstadoGastoEmpleado));	
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonEliminarToolBarEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaEliminarEstadoGastoEmpleado && this.isPermisoEliminarEstadoGastoEmpleado));
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonCancelarToolBarEstadoGastoEmpleado.setVisible(this.isVisibilidadCeldaCancelarEstadoGastoEmpleado);				
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonGuardarCambiosToolBarEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaGuardarEstadoGastoEmpleado && this.isPermisoGuardarCambiosEstadoGastoEmpleado));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoGastoEmpleado && this.isPermisoGuardarCambiosEstadoGastoEmpleado));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaNuevoEstadoGastoEmpleado && this.isPermisoNuevoEstadoGastoEmpleado));			
			this.jMenuItemDuplicarEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaDuplicarEstadoGastoEmpleado && this.isPermisoDuplicarEstadoGastoEmpleado));			
			this.jMenuItemCopiarEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaCopiarEstadoGastoEmpleado && this.isPermisoCopiarEstadoGastoEmpleado));			
			this.jMenuItemVerFormEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaVerFormEstadoGastoEmpleado && this.isPermisoVerFormEstadoGastoEmpleado));			
			this.jMenuItemAbrirOrderByEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaOrdenEstadoGastoEmpleado && this.isPermisoOrdenEstadoGastoEmpleado));			
			//this.jMenuItemMostrarOcultarEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaOrdenEstadoGastoEmpleado && this.isPermisoOrdenEstadoGastoEmpleado));
			this.jMenuItemDetalleAbrirOrderByEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaOrdenEstadoGastoEmpleado && this.isPermisoOrdenEstadoGastoEmpleado));			
			//this.jMenuItemDetalleMostrarOcultarEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaOrdenEstadoGastoEmpleado && this.isPermisoOrdenEstadoGastoEmpleado));			
			this.jMenuItemNuevoRelacionesEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoGastoEmpleado && this.isPermisoNuevoEstadoGastoEmpleado));			
			this.jMenuItemNuevoGuardarCambiosEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaNuevoEstadoGastoEmpleado && this.isPermisoNuevoEstadoGastoEmpleado && this.isPermisoGuardarCambiosEstadoGastoEmpleado));									
			
			if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) {
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jMenuItemModificarEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaModificarEstadoGastoEmpleado && this.isPermisoActualizarEstadoGastoEmpleado));	
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jMenuItemActualizarEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaActualizarEstadoGastoEmpleado && this.isPermisoActualizarEstadoGastoEmpleado));	
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jMenuItemEliminarEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaEliminarEstadoGastoEmpleado && this.isPermisoEliminarEstadoGastoEmpleado));
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jMenuItemCancelarEstadoGastoEmpleado.setVisible(this.isVisibilidadCeldaCancelarEstadoGastoEmpleado);				
			}
			
			this.jMenuItemGuardarCambiosEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaGuardarEstadoGastoEmpleado && this.isPermisoGuardarCambiosEstadoGastoEmpleado));						
			this.jMenuItemGuardarCambiosTablaEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoGastoEmpleado && this.isPermisoGuardarCambiosEstadoGastoEmpleado));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoGastoEmpleado=this.jButtonNuevoEstadoGastoEmpleado.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoGastoEmpleado=this.jButtonDuplicarEstadoGastoEmpleado.isVisible();
			this.isVisibilidadCeldaCopiarEstadoGastoEmpleado=this.jButtonCopiarEstadoGastoEmpleado.isVisible();
			this.isVisibilidadCeldaVerFormEstadoGastoEmpleado=this.jButtonVerFormEstadoGastoEmpleado.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoGastoEmpleado=this.jButtonAbrirOrderByEstadoGastoEmpleado.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoGastoEmpleado=this.jButtonNuevoRelacionesEstadoGastoEmpleado.isVisible();
			this.isVisibilidadCeldaModificarEstadoGastoEmpleado=this.jButtonModificarEstadoGastoEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) {
			this.isVisibilidadCeldaActualizarEstadoGastoEmpleado=this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonActualizarEstadoGastoEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarEstadoGastoEmpleado=this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonEliminarEstadoGastoEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarEstadoGastoEmpleado=this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonCancelarEstadoGastoEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarEstadoGastoEmpleado=this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonGuardarCambiosEstadoGastoEmpleado.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoGastoEmpleado=this.jButtonGuardarCambiosTablaEstadoGastoEmpleado.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoGastoEmpleado=this.jButtonNuevoToolBarEstadoGastoEmpleado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoGastoEmpleado=this.jButtonNuevoRelacionesToolBarEstadoGastoEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) {
			this.isVisibilidadCeldaModificarEstadoGastoEmpleado=this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonModificarToolBarEstadoGastoEmpleado.isVisible();
			this.isVisibilidadCeldaActualizarEstadoGastoEmpleado=this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonActualizarToolBarEstadoGastoEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarEstadoGastoEmpleado=this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonEliminarToolBarEstadoGastoEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarEstadoGastoEmpleado=this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonCancelarToolBarEstadoGastoEmpleado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoGastoEmpleado=this.jButtonGuardarCambiosToolBarEstadoGastoEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoGastoEmpleado=this.jButtonGuardarCambiosTablaToolBarEstadoGastoEmpleado.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoGastoEmpleado=this.jMenuItemNuevoEstadoGastoEmpleado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoGastoEmpleado=this.jMenuItemNuevoRelacionesEstadoGastoEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) {
			this.isVisibilidadCeldaModificarEstadoGastoEmpleado=this.jInternalFrameDetalleFormEstadoGastoEmpleado.jMenuItemModificarEstadoGastoEmpleado.isVisible();
			this.isVisibilidadCeldaActualizarEstadoGastoEmpleado=this.jInternalFrameDetalleFormEstadoGastoEmpleado.jMenuItemActualizarEstadoGastoEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarEstadoGastoEmpleado=this.jInternalFrameDetalleFormEstadoGastoEmpleado.jMenuItemEliminarEstadoGastoEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarEstadoGastoEmpleado=this.jInternalFrameDetalleFormEstadoGastoEmpleado.jMenuItemCancelarEstadoGastoEmpleado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoGastoEmpleado=this.jMenuItemGuardarCambiosEstadoGastoEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoGastoEmpleado=this.jMenuItemGuardarCambiosTablaEstadoGastoEmpleado.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoGastoEmpleado(Boolean esInicializar) {
		if(EstadoGastoEmpleadoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadogastoempleadoSessionBean.getConGuardarRelaciones()) {
				//if(this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoGastoEmpleado();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoGastoEmpleado(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoGastoEmpleado() {
		this.jButtonNuevoEstadoGastoEmpleado.setVisible(this.isPermisoNuevoEstadoGastoEmpleado);			
		this.jButtonDuplicarEstadoGastoEmpleado.setVisible(this.isPermisoDuplicarEstadoGastoEmpleado);			
		this.jButtonCopiarEstadoGastoEmpleado.setVisible(this.isPermisoCopiarEstadoGastoEmpleado);			
		this.jButtonVerFormEstadoGastoEmpleado.setVisible(this.isPermisoVerFormEstadoGastoEmpleado);			
		
		this.jButtonAbrirOrderByEstadoGastoEmpleado.setVisible(this.isPermisoOrdenEstadoGastoEmpleado);					
		
		this.jButtonNuevoRelacionesEstadoGastoEmpleado.setVisible(this.isPermisoNuevoEstadoGastoEmpleado);			
		
		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonModificarEstadoGastoEmpleado.setVisible(this.isPermisoActualizarEstadoGastoEmpleado);	
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonActualizarEstadoGastoEmpleado.setVisible(this.isPermisoActualizarEstadoGastoEmpleado);	
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonEliminarEstadoGastoEmpleado.setVisible(this.isPermisoEliminarEstadoGastoEmpleado);
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonCancelarEstadoGastoEmpleado.setVisible(this.isVisibilidadCeldaCancelarEstadoGastoEmpleado);						
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonGuardarCambiosEstadoGastoEmpleado.setVisible(this.isPermisoGuardarCambiosEstadoGastoEmpleado);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoGastoEmpleado.setVisible(this.isPermisoActualizarEstadoGastoEmpleado);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoGastoEmpleado() {
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonModificarEstadoGastoEmpleado.setVisible(this.isPermisoActualizarEstadoGastoEmpleado);	
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonActualizarEstadoGastoEmpleado.setVisible(this.isPermisoActualizarEstadoGastoEmpleado);	
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonEliminarEstadoGastoEmpleado.setVisible(this.isPermisoEliminarEstadoGastoEmpleado);
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonCancelarEstadoGastoEmpleado.setVisible(this.isVisibilidadCeldaCancelarEstadoGastoEmpleado);							
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonGuardarCambiosEstadoGastoEmpleado.setVisible((this.isVisibilidadCeldaGuardarEstadoGastoEmpleado && this.isPermisoGuardarCambiosEstadoGastoEmpleado));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoGastoEmpleado() {
		if(EstadoGastoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoGastoEmpleado();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoGastoEmpleado() {
	}
	
	public void jTableDatosEstadoGastoEmpleadoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoGastoEmpleado(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoGastoEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogastoempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoGastoEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoGastoEmpleado(this.getestadogastoempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoGastoEmpleado(this.estadogastoempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadogastoempleado =(EstadoGastoEmpleado) this.estadogastoempleadoLogic.getEstadoGastoEmpleados().toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadogastoempleado =(EstadoGastoEmpleado) this.estadogastoempleados.toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadogastoempleado==null) {
						this.estadogastoempleado = new EstadoGastoEmpleado();
					}

					this.setVariablesFormularioToObjetoActualEstadoGastoEmpleado(this.estadogastoempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoGastoEmpleado(this.estadogastoempleado);
				}

				if(this.estadogastoempleado.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadogastoempleado.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoGastoEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogastoempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogastoempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogastoempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoGastoEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogastoempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoGastoEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoGastoEmpleado(this.getestadogastoempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoGastoEmpleado(this.estadogastoempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadogastoempleado =(EstadoGastoEmpleado) this.estadogastoempleadoLogic.getEstadoGastoEmpleados().toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadogastoempleado =(EstadoGastoEmpleado) this.estadogastoempleados.toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadogastoempleado==null) {
						this.estadogastoempleado = new EstadoGastoEmpleado();
					}

					this.setVariablesFormularioToObjetoActualEstadoGastoEmpleado(this.estadogastoempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoGastoEmpleado(this.estadogastoempleado);
				}

				if(this.estadogastoempleado.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadogastoempleado.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoGastoEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogastoempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogastoempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogastoempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoGastoEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogastoempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoGastoEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoGastoEmpleado(this.getestadogastoempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoGastoEmpleado(this.estadogastoempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadogastoempleado =(EstadoGastoEmpleado) this.estadogastoempleadoLogic.getEstadoGastoEmpleados().toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadogastoempleado =(EstadoGastoEmpleado) this.estadogastoempleados.toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadogastoempleado==null) {
						this.estadogastoempleado = new EstadoGastoEmpleado();
					}

					this.setVariablesFormularioToObjetoActualEstadoGastoEmpleado(this.estadogastoempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoGastoEmpleado(this.estadogastoempleado);
				}

				if(this.estadogastoempleado.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadogastoempleado.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoGastoEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogastoempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogastoempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogastoempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoGastoEmpleado() {
		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) {
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.dispose();
			this.jInternalFrameDetalleFormEstadoGastoEmpleado=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoGastoEmpleado!=null) {
			this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.dispose();
			this.jInternalFrameReporteDinamicoEstadoGastoEmpleado=null;
		}
		
		if(this.jInternalFrameImportacionEstadoGastoEmpleado!=null) {
			this.jInternalFrameImportacionEstadoGastoEmpleado.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoGastoEmpleado.dispose();
			this.jInternalFrameImportacionEstadoGastoEmpleado=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoGastoEmpleado();
			
			EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoGastoEmpleado")) {
				jButtonNuevoEstadoGastoEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoGastoEmpleado")) {
				jButtonDuplicarEstadoGastoEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoGastoEmpleado")) {
				jButtonCopiarEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoGastoEmpleado")) {
				jButtonVerFormEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoGastoEmpleado")) {
				jButtonNuevoEstadoGastoEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoGastoEmpleado")) {
				jButtonDuplicarEstadoGastoEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoGastoEmpleado")) {
				jButtonNuevoEstadoGastoEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoGastoEmpleado")) {
				jButtonDuplicarEstadoGastoEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoGastoEmpleado")) {
				jButtonNuevoEstadoGastoEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoGastoEmpleado")) {
				jButtonNuevoEstadoGastoEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoGastoEmpleado")) {
				jButtonNuevoEstadoGastoEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoGastoEmpleado")) {
				jButtonModificarEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoGastoEmpleado")) {
				jButtonModificarEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoGastoEmpleado")) {
				jButtonModificarEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoGastoEmpleado")) {
				jButtonActualizarEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoGastoEmpleado")) {
				jButtonActualizarEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoGastoEmpleado")) {
				jButtonActualizarEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoGastoEmpleado")) {
				jButtonEliminarEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoGastoEmpleado")) {
				jButtonEliminarEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoGastoEmpleado")) {
				jButtonEliminarEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoGastoEmpleado")) {
				jButtonCancelarEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoGastoEmpleado")) {
				jButtonCancelarEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoGastoEmpleado")) {
				jButtonCancelarEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoGastoEmpleado")) {
				jButtonCerrarEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoGastoEmpleado")) {
				jButtonCerrarEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoGastoEmpleado")) {
				jButtonCerrarEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoGastoEmpleado")) {
				jButtonMostrarOcultarEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoGastoEmpleado")) {
				jButtonCancelarEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoGastoEmpleado")) {
				jButtonGuardarCambiosEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoGastoEmpleado")) {
				jButtonGuardarCambiosEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoGastoEmpleado")) {
				jButtonCopiarEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoGastoEmpleado")) {
				jButtonVerFormEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoGastoEmpleado")) {
				jButtonGuardarCambiosEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoGastoEmpleado")) {
				jButtonCopiarEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoGastoEmpleado")) {
				jButtonVerFormEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoGastoEmpleado")) {
				jButtonGuardarCambiosEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoGastoEmpleado")) {
				jButtonGuardarCambiosEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoGastoEmpleado")) {
				jButtonGuardarCambiosEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoGastoEmpleado")) {
				jButtonRecargarInformacionEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoGastoEmpleado")) {
				jButtonRecargarInformacionEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoGastoEmpleado")) {
				jButtonRecargarInformacionEstadoGastoEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoGastoEmpleado")) {
				jButtonAnterioresEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoGastoEmpleado")) {
				jButtonAnterioresEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoGastoEmpleado")) {
				jButtonAnterioresEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoGastoEmpleado")) {
				jButtonSiguientesEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoGastoEmpleado")) {
				jButtonSiguientesEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoGastoEmpleado")) {
				jButtonSiguientesEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoGastoEmpleado") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoGastoEmpleado")) {
				jButtonAbrirOrderByEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoGastoEmpleado") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoGastoEmpleado")) {
				jButtonMostrarOcultarEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoGastoEmpleado")) {
				jButtonNuevoGuardarCambiosEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoGastoEmpleado")) {
				jButtonNuevoGuardarCambiosEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoGastoEmpleado")) {
				jButtonNuevoGuardarCambiosEstadoGastoEmpleadoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoGastoEmpleado")) {
				jButtonCerrarReporteDinamicoEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoGastoEmpleado")) {
				jButtonGenerarReporteDinamicoEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoGastoEmpleado")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoGastoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoGastoEmpleado")) {
				jButtonCerrarImportacionEstadoGastoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoGastoEmpleado")) {
				
				jButtonGenerarImportacionEstadoGastoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoGastoEmpleado")) {
				
				jButtonAbrirImportacionEstadoGastoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoGastoEmpleado")) {
				jComboBoxTiposAccionesEstadoGastoEmpleadoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoGastoEmpleado")) {
				jComboBoxTiposRelacionesEstadoGastoEmpleadoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoGastoEmpleado")) {
				jComboBoxTiposAccionesEstadoGastoEmpleadoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoGastoEmpleado")) {
				
				jComboBoxTiposSeleccionarEstadoGastoEmpleadoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoGastoEmpleado")) {
				jTextFieldValorCampoGeneralEstadoGastoEmpleadoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoGastoEmpleado")) {
				jButtonAbrirOrderByEstadoGastoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoGastoEmpleado")) {
				jButtonAbrirOrderByEstadoGastoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoGastoEmpleado")) {
				jButtonCerrarOrderByEstadoGastoEmpleadoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoGastoEmpleadoBusqueda")) {
				this.jButtonidEstadoGastoEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoGastoEmpleadoBusqueda")) {
				this.jButtoncodigoEstadoGastoEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoGastoEmpleadoBusqueda")) {
				this.jButtonnombreEstadoGastoEmpleadoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoGastoEmpleado();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoGastoEmpleadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogastoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadogastoempleado);
				
				EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
				
				


				
				EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoGastoEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoGastoEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoGastoEmpleado estadogastoempleadoLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadogastoempleadoLocal=this.estadogastoempleado;
			} else {
				estadogastoempleadoLocal=this.estadogastoempleadoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogastoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadogastoempleado);
				
				EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
							
				
				


				
				EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoGastoEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoGastoEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoGastoEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoGastoEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogastoempleadoAnterior =(EstadoGastoEmpleado) this.estadogastoempleadoLogic.getEstadoGastoEmpleados().toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadogastoempleadoAnterior =(EstadoGastoEmpleado) this.estadogastoempleados.toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
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
			
			EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
			
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
			
			


			
			EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoGastoEmpleadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogastoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadogastoempleado);
				
				EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
								
						
				


				
				EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoGastoEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoGastoEmpleado.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogastoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadogastoempleado);
				
				EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
								
				
				


				
				EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoGastoEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoGastoEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoGastoEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoGastoEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogastoempleadoAnterior =(EstadoGastoEmpleado) this.estadogastoempleadoLogic.getEstadoGastoEmpleados().toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadogastoempleadoAnterior =(EstadoGastoEmpleado) this.estadogastoempleados.toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogastoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadogastoempleado);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoGastoEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoGastoEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogastoempleadoAnterior =(EstadoGastoEmpleado) this.estadogastoempleadoLogic.getEstadoGastoEmpleados().toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadogastoempleadoAnterior =(EstadoGastoEmpleado) this.estadogastoempleados.toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoGastoEmpleadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogastoempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadogastoempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogastoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadogastoempleado);
				
				EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
							
				
				


				
				EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoGastoEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoGastoEmpleado.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoGastoEmpleadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoGastoEmpleado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadogastoempleadoAnterior =(EstadoGastoEmpleado) this.estadogastoempleadoLogic.getEstadoGastoEmpleados().toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadogastoempleadoAnterior =(EstadoGastoEmpleado) this.estadogastoempleados.toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
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
			
			EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
			
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
			
			


			
			EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoGastoEmpleadoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogastoempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadogastoempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogastoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadogastoempleado);
				
				EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
								
				
				


				
				EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoGastoEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoGastoEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoGastoEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoGastoEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogastoempleadoAnterior =(EstadoGastoEmpleado) this.estadogastoempleadoLogic.getEstadoGastoEmpleados().toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadogastoempleadoAnterior =(EstadoGastoEmpleado) this.estadogastoempleados.toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoGastoEmpleadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogastoempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadogastoempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoGastoEmpleadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogastoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadogastoempleado);
				
				EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoGastoEmpleado")) {
					jCheckBoxSeleccionarTodosEstadoGastoEmpleadoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoGastoEmpleado")) {
					jCheckBoxSeleccionadosEstadoGastoEmpleadoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoGastoEmpleado")) {
					
				}
				
				


				
				
				EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoGastoEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoGastoEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogastoempleado);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadogastoempleado);
				
				EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
												
				
				


				
				
				EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoGastoEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoGastoEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoGastoEmpleadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoGastoEmpleado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadogastoempleadoAnterior =(EstadoGastoEmpleado) this.estadogastoempleadoLogic.getEstadoGastoEmpleados().toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadogastoempleadoAnterior =(EstadoGastoEmpleado) this.estadogastoempleados.toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoGastoEmpleadoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogastoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadogastoempleado);
				
				EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
				
				
				EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
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
			
			EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
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
			
			


			
			EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoGastoEmpleadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogastoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadogastoempleado);
				
				EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoGastoEmpleado.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoGastoEmpleado.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogastoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadogastoempleado);
				
				EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
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
				
				


				
				EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoGastoEmpleado.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoGastoEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoGastoEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoGastoEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogastoempleadoAnterior =(EstadoGastoEmpleado) this.estadogastoempleadoLogic.getEstadoGastoEmpleados().toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadogastoempleadoAnterior =(EstadoGastoEmpleado) this.estadogastoempleados.toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoGastoEmpleado")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoGastoEmpleadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoGastoEmpleado.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadogastoempleado =(EstadoGastoEmpleado) this.estadogastoempleadoLogic.getEstadoGastoEmpleados().toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadogastoempleado =(EstadoGastoEmpleado) this.estadogastoempleados.toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadogastoempleado);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoGastoEmpleado")) {
				
				}
				
				EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoGastoEmpleado")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoGastoEmpleado.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoGastoEmpleado")) {
			
			}
			
			EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoGastoEmpleado();
			
			EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoGastoEmpleado")) {
				jButtonNuevoEstadoGastoEmpleadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoGastoEmpleado")) {
				jButtonDuplicarEstadoGastoEmpleadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoGastoEmpleado")) {
				jButtonCopiarEstadoGastoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoGastoEmpleado")) {
				jButtonVerFormEstadoGastoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoGastoEmpleado")) {
				jButtonNuevoEstadoGastoEmpleadoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoGastoEmpleado")) {
				jButtonModificarEstadoGastoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoGastoEmpleado")) {
				jButtonActualizarEstadoGastoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoGastoEmpleado")) {
				jButtonEliminarEstadoGastoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoGastoEmpleado")) {
				jButtonGuardarCambiosEstadoGastoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoGastoEmpleado")) {
				jButtonCancelarEstadoGastoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoGastoEmpleado")) {
				jButtonCerrarEstadoGastoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoGastoEmpleado")) {
				jButtonGuardarCambiosEstadoGastoEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoGastoEmpleado")) {
				jButtonNuevoGuardarCambiosEstadoGastoEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoGastoEmpleado")) {
				jButtonAbrirOrderByEstadoGastoEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoGastoEmpleado")) {
				jButtonRecargarInformacionEstadoGastoEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoGastoEmpleado")) {
				jButtonAnterioresEstadoGastoEmpleadoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoGastoEmpleado")) {
				jButtonSiguientesEstadoGastoEmpleadoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoGastoEmpleadoBusqueda")) {
				this.jButtonidEstadoGastoEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoGastoEmpleadoBusqueda")) {
				this.jButtoncodigoEstadoGastoEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoGastoEmpleadoBusqueda")) {
				this.jButtonnombreEstadoGastoEmpleadoBusquedaActionPerformed(evt);
			}
			
			EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoGastoEmpleado();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoGastoEmpleado")) {
				closingInternalFrameEstadoGastoEmpleado();
				
			} else if(sTipo.equals("jButtonCancelarEstadoGastoEmpleado")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoGastoEmpleado = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoGastoEmpleadoBeanSwingJInternalFrame jInternalFrameParent=(EstadoGastoEmpleadoBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoGastoEmpleado.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoGastoEmpleadoActionPerformed(null);
			}
			
			EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadogastoempleado,new Object(),this.estadogastoempleadoParameterGeneral,this.estadogastoempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoGastoEmpleado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoGastoEmpleado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoGastoEmpleado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadogastoempleado)) {
			if(!esControlTabla) {
				if(EstadoGastoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoGastoEmpleado(this.estadogastoempleado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoGastoEmpleado(this.estadogastoempleado);			
				}
				
				if(this.estadogastoempleadoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoGastoEmpleado(this.estadogastoempleado,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadogastoempleadoReturnGeneral=estadogastoempleadoLogic.procesarEventosEstadoGastoEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadogastoempleadoLogic.getEstadoGastoEmpleados(),this.estadogastoempleado,this.estadogastoempleadoParameterGeneral,this.isEsNuevoEstadoGastoEmpleado,classes);//this.estadogastoempleadoLogic.getEstadoGastoEmpleado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoGastoEmpleado(this.estadogastoempleadoReturnGeneral,this.estadogastoempleadoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadogastoempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoGastoEmpleado(classes,this.estadogastoempleadoReturnGeneral,this.estadogastoempleadoBean,false);
					}
						
					if(this.estadogastoempleadoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoGastoEmpleado(this.estadogastoempleadoReturnGeneral.getEstadoGastoEmpleado());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoGastoEmpleado(this.estadogastoempleadoReturnGeneral.getEstadoGastoEmpleado());	
					}
						
					if(this.estadogastoempleadoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoGastoEmpleado(this.estadogastoempleadoReturnGeneral.getEstadoGastoEmpleado(),classes);//this.estadogastoempleadoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoGastoEmpleado(this.estadogastoempleado,classes);//this.estadogastoempleadoBean);									
				}
			
				if(EstadoGastoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoGastoEmpleado(this.estadogastoempleado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoGastoEmpleado(this.estadogastoempleado);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadogastoempleadoAnterior!=null) {
						this.estadogastoempleado=this.estadogastoempleadoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadogastoempleadoReturnGeneral=estadogastoempleadoLogic.procesarEventosEstadoGastoEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadogastoempleadoLogic.getEstadoGastoEmpleados(),this.estadogastoempleado,this.estadogastoempleadoParameterGeneral,this.isEsNuevoEstadoGastoEmpleado,classes);//this.estadogastoempleadoLogic.getEstadoGastoEmpleado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadogastoempleadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadogastoempleadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadogastoempleadoReturnGeneral.getEstadoGastoEmpleado(),estadogastoempleadoLogic.getEstadoGastoEmpleados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadogastoempleadoReturnGeneral.getEstadoGastoEmpleado(),this.estadogastoempleados);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoGastoEmpleado.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoGastoEmpleado.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoGastoEmpleado();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoGastoEmpleado() throws Exception {
		
		EstadoGastoEmpleadoModel estadogastoempleadoModel=(EstadoGastoEmpleadoModel)this.jTableDatosEstadoGastoEmpleado.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadogastoempleadoModel.estadogastoempleados=this.estadogastoempleadoLogic.getEstadoGastoEmpleados();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadogastoempleadoModel.estadogastoempleados=this.estadogastoempleados;
		}
		
		
		((EstadoGastoEmpleadoModel) this.jTableDatosEstadoGastoEmpleado.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoGastoEmpleado() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadogastoempleadoAnterior(),this.estadogastoempleadoLogic.getEstadoGastoEmpleados());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadogastoempleadoAnterior(),this.estadogastoempleados);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoGastoEmpleado();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoGastoEmpleado(EstadoGastoEmpleado estadogastoempleado,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(GastoEmpleado.class)) {
					this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleadoLogic.setGastoEmpleados(estadogastoempleado.getGastoEmpleados());
					this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaGastoEmpleado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
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
										
				EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadogastoempleado,new Object(),generalEntityParameterGeneral,this.estadogastoempleadoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadogastoempleadoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoGastoEmpleadoConstantesFunciones.getClassesRelationshipsOfEstadoGastoEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoGastoEmpleadoConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoGastoEmpleado(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoGastoEmpleado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadogastoempleado,new Object(),generalEntityParameterGeneral,this.estadogastoempleadoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoGastoEmpleado(EstadoGastoEmpleadoBean estadogastoempleadoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(GastoEmpleado.class)) {
					this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleadoLogic.setGastoEmpleados(estadogastoempleado.getGastoEmpleados());
					this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaGastoEmpleado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoGastoEmpleado(ArrayList<Classe> classes,EstadoGastoEmpleadoReturnGeneral estadogastoempleadoReturnGeneral,EstadoGastoEmpleadoBean estadogastoempleadoBean,Boolean conDefault) throws Exception {
		
			this.estadogastoempleadoBean.setGastoEmpleados(estadogastoempleadoReturnGeneral.getEstadoGastoEmpleado().getGastoEmpleados());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoGastoEmpleado(EstadoGastoEmpleado estadogastoempleado,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(GastoEmpleado.class)) {
					estadogastoempleado.setGastoEmpleados(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoBeanSwingJInternalFrame.gastoempleadoLogic.getGastoEmpleados());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadogastoempleado)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoGastoEmpleado = new EstadoGastoEmpleadoDetalleFormJInternalFrame(jDesktopPane,this.estadogastoempleadoSessionBean.getConGuardarRelaciones(),this.estadogastoempleadoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoGastoEmpleado);
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.setVisible(false);
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.estadogastoempleadoLogic=this.estadogastoempleadoLogic;
		
		this.cargarCombosFrameForeignKeyEstadoGastoEmpleado("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoGastoEmpleado();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoGastoEmpleado();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoGastoEmpleado("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoGastoEmpleado();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoGastoEmpleado"));
		
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonModificarEstadoGastoEmpleado.addActionListener(new ButtonActionListener(this,"ModificarEstadoGastoEmpleado"));

		
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonModificarToolBarEstadoGastoEmpleado.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoGastoEmpleado"));
					
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jMenuItemModificarEstadoGastoEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoGastoEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonActualizarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"ActualizarEstadoGastoEmpleado"));
		
		
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonActualizarToolBarEstadoGastoEmpleado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoGastoEmpleado"));
						
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jMenuItemActualizarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoGastoEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonEliminarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"EliminarEstadoGastoEmpleado"));
		
		
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonEliminarToolBarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoGastoEmpleado"));
								
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jMenuItemEliminarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoGastoEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonCancelarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"CancelarEstadoGastoEmpleado"));
		
		
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonCancelarToolBarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoGastoEmpleado"));
					
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jMenuItemCancelarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoGastoEmpleado"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jMenuItemDetalleCerrarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoGastoEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonGuardarCambiosToolBarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoGastoEmpleado"));
		
		
		
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonGuardarCambiosToolBarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoGastoEmpleado"));
		
		
		
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jComboBoxTiposAccionesFormularioEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoGastoEmpleado"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonidEstadoGastoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoGastoEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtoncodigoEstadoGastoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoGastoEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonnombreEstadoGastoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoGastoEmpleadoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTabbedPaneRelacionesEstadoGastoEmpleado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoGastoEmpleado"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoGastoEmpleado"));
		
		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoGastoEmpleado"));
		}
		
		this.jTableDatosEstadoGastoEmpleado.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoGastoEmpleado"));
		
		this.jTableDatosEstadoGastoEmpleado.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoGastoEmpleado"));
		
		this.jButtonNuevoEstadoGastoEmpleado.addActionListener(new ButtonActionListener(this,"NuevoEstadoGastoEmpleado"));
		
		this.jButtonDuplicarEstadoGastoEmpleado.addActionListener(new ButtonActionListener(this,"DuplicarEstadoGastoEmpleado"));
		
		this.jButtonCopiarEstadoGastoEmpleado.addActionListener(new ButtonActionListener(this,"CopiarEstadoGastoEmpleado"));
		
		this.jButtonVerFormEstadoGastoEmpleado.addActionListener(new ButtonActionListener(this,"VerFormEstadoGastoEmpleado"));
		
		
		this.jButtonNuevoToolBarEstadoGastoEmpleado.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoGastoEmpleado"));
			
		this.jButtonDuplicarToolBarEstadoGastoEmpleado.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoGastoEmpleado"));
			
		this.jMenuItemNuevoEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoGastoEmpleado"));
			
		this.jMenuItemDuplicarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoGastoEmpleado"));		
		
		
		this.jButtonNuevoRelacionesEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoGastoEmpleado"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoGastoEmpleado.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoGastoEmpleado"));
			
		this.jMenuItemNuevoRelacionesEstadoGastoEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoGastoEmpleado"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonModificarEstadoGastoEmpleado.addActionListener(new ButtonActionListener(this,"ModificarEstadoGastoEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonModificarToolBarEstadoGastoEmpleado.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoGastoEmpleado"));
			
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jMenuItemModificarEstadoGastoEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoGastoEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonActualizarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"ActualizarEstadoGastoEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonActualizarToolBarEstadoGastoEmpleado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoGastoEmpleado"));
				
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jMenuItemActualizarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoGastoEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonEliminarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"EliminarEstadoGastoEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonEliminarToolBarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoGastoEmpleado"));
						
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jMenuItemEliminarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoGastoEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonCancelarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"CancelarEstadoGastoEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonCancelarToolBarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoGastoEmpleado"));
			
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jMenuItemCancelarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoGastoEmpleado"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoGastoEmpleado"));		
		
		
		this.jButtonCerrarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"CerrarEstadoGastoEmpleado"));
		
		
		this.jButtonCerrarToolBarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoGastoEmpleado"));
			
		this.jMenuItemCerrarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoGastoEmpleado"));
			
		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jMenuItemDetalleCerrarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoGastoEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonGuardarCambiosEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoGastoEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonGuardarCambiosToolBarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoGastoEmpleado"));
		}
		
		this.jButtonCopiarToolBarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoGastoEmpleado"));
			
		this.jButtonVerFormToolBarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoGastoEmpleado"));
		
		this.jMenuItemGuardarCambiosEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoGastoEmpleado"));
			
		this.jMenuItemCopiarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoGastoEmpleado"));		
		
		this.jMenuItemVerFormEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoGastoEmpleado"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoGastoEmpleado"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoGastoEmpleado"));
			
		this.jMenuItemGuardarCambiosTablaEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoGastoEmpleado"));		
		
		
		
		this.jButtonRecargarInformacionEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoGastoEmpleado"));
					
		this.jButtonRecargarInformacionToolBarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoGastoEmpleado"));
		
		this.jMenuItemRecargarInformacionEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoGastoEmpleado"));		
		
		
		
		this.jButtonAnterioresEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"AnterioresEstadoGastoEmpleado"));
		
		
		this.jButtonAnterioresToolBarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoGastoEmpleado"));
		
		this.jMenuItemAnterioresEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoGastoEmpleado"));		
		
		
		this.jButtonSiguientesEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"SiguientesEstadoGastoEmpleado"));
		
		
		this.jButtonSiguientesToolBarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoGastoEmpleado"));
			
		this.jMenuItemSiguientesEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoGastoEmpleado"));
			
		this.jMenuItemAbrirOrderByEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoGastoEmpleado"));
			
		this.jMenuItemMostrarOcultarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoGastoEmpleado"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoGastoEmpleado"));
			
		this.jMenuItemDetalleMostarOcultarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoGastoEmpleado"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoGastoEmpleado"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoGastoEmpleado"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoGastoEmpleado"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoGastoEmpleado.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoGastoEmpleado"));

		this.jCheckBoxSeleccionadosEstadoGastoEmpleado.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoGastoEmpleado"));
		
		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jComboBoxTiposAccionesFormularioEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoGastoEmpleado"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoGastoEmpleado"));
			
		this.jComboBoxTiposAccionesEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoGastoEmpleado"));
					
		this.jComboBoxTiposSeleccionarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoGastoEmpleado"));
			
		this.jTextFieldValorCampoGeneralEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoGastoEmpleado"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonidEstadoGastoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoGastoEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtoncodigoEstadoGastoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoGastoEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonnombreEstadoGastoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoGastoEmpleadoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoGastoEmpleado!=null) {
				this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoGastoEmpleado"));
				this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoGastoEmpleado"));
				this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoGastoEmpleado"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoGastoEmpleado"));				
			//this.jButtonGenerarReporteDinamicoEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoGastoEmpleado"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoGastoEmpleado"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoGastoEmpleado!=null) {
				this.jInternalFrameImportacionEstadoGastoEmpleado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoGastoEmpleado"));
				this.jInternalFrameImportacionEstadoGastoEmpleado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoGastoEmpleado"));
				this.jInternalFrameImportacionEstadoGastoEmpleado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoGastoEmpleado"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoGastoEmpleado"));
			
			this.jButtonAbrirOrderByToolBarEstadoGastoEmpleado.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoGastoEmpleado"));			
			
			if(this.jInternalFrameOrderByEstadoGastoEmpleado!=null) {
				this.jInternalFrameOrderByEstadoGastoEmpleado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoGastoEmpleado"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTabbedPaneRelacionesEstadoGastoEmpleado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoGastoEmpleado"));
		
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
            		closingInternalFrameEstadoGastoEmpleado();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoGastoEmpleado = (JInternalFrameBase)event.getSource();
	            	
	            EstadoGastoEmpleadoBeanSwingJInternalFrame jInternalFrameParent=(EstadoGastoEmpleadoBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoGastoEmpleado.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoGastoEmpleadoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoGastoEmpleado.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoGastoEmpleadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoGastoEmpleado.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoGastoEmpleado.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoGastoEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoGastoEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoGastoEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoGastoEmpleado";
		inputMap = this.jButtonNuevoEstadoGastoEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoGastoEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoGastoEmpleadoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoGastoEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoGastoEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoGastoEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoGastoEmpleado";
		inputMap = this.jButtonNuevoRelacionesEstadoGastoEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoGastoEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoGastoEmpleadoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoGastoEmpleado";
		inputMap = this.jButtonModificarEstadoGastoEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoGastoEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoGastoEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoGastoEmpleado";
		inputMap = this.jButtonActualizarEstadoGastoEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoGastoEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoGastoEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoGastoEmpleado";
		inputMap = this.jButtonEliminarEstadoGastoEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoGastoEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoGastoEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoGastoEmpleado";
		inputMap = this.jButtonCancelarEstadoGastoEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoGastoEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoGastoEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoGastoEmpleado";
		inputMap = this.jButtonCerrarEstadoGastoEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoGastoEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoGastoEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonGuardarCambiosEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoGastoEmpleado";
		inputMap = this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonGuardarCambiosEstadoGastoEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonGuardarCambiosEstadoGastoEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoGastoEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoGastoEmpleado.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoGastoEmpleadoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoGastoEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoGastoEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoGastoEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoGastoEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoGastoEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoGastoEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonidEstadoGastoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoGastoEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtoncodigoEstadoGastoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoGastoEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jButtonnombreEstadoGastoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoGastoEmpleadoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoGastoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoGastoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoGastoEmpleadoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoGastoEmpleado.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoGastoEmpleado(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoGastoEmpleado estadogastoempleadoAux:this.estadogastoempleadoLogic.getEstadoGastoEmpleados()) {
					estadogastoempleadoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoGastoEmpleado estadogastoempleadoAux:estadogastoempleados) {
					estadogastoempleadoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoGastoEmpleadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoGastoEmpleado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoGastoEmpleado estadogastoempleadoAux:this.estadogastoempleadoLogic.getEstadoGastoEmpleados()) {
						estadogastoempleadoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoGastoEmpleado estadogastoempleadoAux:estadogastoempleados) {
						estadogastoempleadoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoGastoEmpleado estadogastoempleadoAux:this.estadogastoempleadoLogic.getEstadoGastoEmpleados()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoGastoEmpleado estadogastoempleadoAux:estadogastoempleados) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoGastoEmpleado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoGastoEmpleado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoGastoEmpleado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoGastoEmpleado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoGastoEmpleadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoGastoEmpleado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoGastoEmpleado.getSelectedRows();
			
			EstadoGastoEmpleado estadogastoempleadoLocal=new EstadoGastoEmpleado();
			
			//this.seleccionarTodosEstadoGastoEmpleado(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadogastoempleadoLocal =(EstadoGastoEmpleado) this.estadogastoempleadoLogic.getEstadoGastoEmpleados().toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadogastoempleadoLocal =(EstadoGastoEmpleado) this.estadogastoempleados.toArray()[this.jTableDatosEstadoGastoEmpleado.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadogastoempleadoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoGastoEmpleado estadogastoempleadoAux:this.estadogastoempleadoLogic.getEstadoGastoEmpleados()) {
						estadogastoempleadoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoGastoEmpleado estadogastoempleadoAux:estadogastoempleados) {
						estadogastoempleadoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoGastoEmpleado(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoGastoEmpleado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoGastoEmpleado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoGastoEmpleado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoGastoEmpleadoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoGastoEmpleadoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoGastoEmpleadoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoGastoEmpleado(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoGastoEmpleado.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoGastoEmpleado estadogastoempleadoAux:this.estadogastoempleadoLogic.getEstadoGastoEmpleados()) {
				
						if(sTipoSeleccionar.equals(EstadoGastoEmpleadoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadogastoempleadoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoGastoEmpleadoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadogastoempleadoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoGastoEmpleado estadogastoempleadoAux:estadogastoempleados) {
					
						if(sTipoSeleccionar.equals(EstadoGastoEmpleadoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadogastoempleadoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoGastoEmpleadoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadogastoempleadoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoGastoEmpleado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoGastoEmpleadoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoGastoEmpleado(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoGastoEmpleado=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoGastoEmpleado.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoGastoEmpleado.jComboBoxTiposAccionesFormularioEstadoGastoEmpleado.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoGastoEmpleado) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoGastoEmpleado(conSplash);
				
					this.generarReporteEstadoGastoEmpleadosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoGastoEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoGastoEmpleado.jComboBoxTiposAccionesFormularioEstadoGastoEmpleado.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoGastoEmpleadosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoGastoEmpleado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoGastoEmpleadosSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoGastoEmpleado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoGastoEmpleadosSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoGastoEmpleado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoGastoEmpleado();
				
				this.exportarEstadoGastoEmpleadosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoGastoEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoGastoEmpleado.jComboBoxTiposAccionesFormularioEstadoGastoEmpleado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoGastoEmpleados();
				//this.importarEstadoGastoEmpleados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoGastoEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoGastoEmpleado.jComboBoxTiposAccionesFormularioEstadoGastoEmpleado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoGastoEmpleado();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoGastoEmpleadosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoGastoEmpleado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Gasto Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoGastoEmpleado();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoGastoEmpleado)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoGastoEmpleado(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Gasto Empleado",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoGastoEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoGastoEmpleado.jComboBoxTiposAccionesFormularioEstadoGastoEmpleado.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadoGastoEmpleadoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadoGastoEmpleado) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadoGastoEmpleado(conSplash);
					
						//this.actualizarParametrosGeneralEstadoGastoEmpleado();
						
						this.generarReporteProcesoAccionEstadoGastoEmpleadosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadoGastoEmpleado.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadoGastoEmpleado.jComboBoxTiposAccionesFormularioEstadoGastoEmpleado.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estado Gasto EmpleadoS SELECCIONADOS?", "MANTENIMIENTO DE Estado Gasto Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadoGastoEmpleado();
				
						this.actualizarParametrosGeneralEstadoGastoEmpleado();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadogastoempleadoReturnGeneral=estadogastoempleadoLogic.procesarAccionEstadoGastoEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadogastoempleadoLogic.getEstadoGastoEmpleados(),this.estadogastoempleadoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadoGastoEmpleadoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoGastoEmpleado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoGastoEmpleado.jComboBoxTiposAccionesFormularioEstadoGastoEmpleado.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoGastoEmpleado();
					
					EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadoGastoEmpleadoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoGastoEmpleado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoGastoEmpleado.jComboBoxTiposAccionesFormularioEstadoGastoEmpleado.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoGastoEmpleado(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoGastoEmpleadoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoGastoEmpleado();
			
			if(this.jInternalFrameDetalleFormEstadoGastoEmpleado==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoGastoEmpleado> estadogastoempleadosSeleccionados=new ArrayList<EstadoGastoEmpleado>();		
			EstadoGastoEmpleado estadogastoempleado=new EstadoGastoEmpleado();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoGastoEmpleado(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoGastoEmpleado.getSelectedItem();
			
			
			
			
			estadogastoempleadosSeleccionados=this.getEstadoGastoEmpleadosSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadogastoempleadosSeleccionados.size()==1) {
				for(EstadoGastoEmpleado estadogastoempleadoAux:estadogastoempleadosSeleccionados) {
					estadogastoempleado=estadogastoempleadoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Gasto Empleado")) {
					jButtonGastoEmpleadoActionPerformed(null,rowIndex,true,false,estadogastoempleado);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoGastoEmpleado();
			
      		//this.finishProcessEstadoGastoEmpleado(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoGastoEmpleadoReturnGeneral() throws Exception {
		if(this.estadogastoempleadoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadogastoempleadoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadogastoempleadoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadogastoempleadoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadogastoempleadoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadogastoempleadoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoGastoEmpleado(false);
		}
		
		if(this.estadogastoempleadoReturnGeneral.getConRetornoLista() || this.estadogastoempleadoReturnGeneral.getConRetornoObjeto()) {
			if(this.estadogastoempleadoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadogastoempleadoLogic.setEstadoGastoEmpleados(this.estadogastoempleadoReturnGeneral.getEstadoGastoEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadogastoempleadoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadogastoempleadoLogic.setEstadoGastoEmpleado(this.estadogastoempleadoReturnGeneral.getEstadoGastoEmpleado());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoGastoEmpleado(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoGastoEmpleado() throws Exception {
		
		
	}
	
	public ArrayList<EstadoGastoEmpleado> getEstadoGastoEmpleadosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoGastoEmpleado> estadogastoempleadosSeleccionados=new ArrayList<EstadoGastoEmpleado>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoGastoEmpleado) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoGastoEmpleado estadogastoempleadoAux:estadogastoempleadoLogic.getEstadoGastoEmpleados()) {
					if(estadogastoempleadoAux.getIsSelected()) {
						estadogastoempleadosSeleccionados.add(estadogastoempleadoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoGastoEmpleado estadogastoempleadoAux:this.estadogastoempleados) {
					if(estadogastoempleadoAux.getIsSelected()) {
						estadogastoempleadosSeleccionados.add(estadogastoempleadoAux);				
					}
				}
			}
			
			if(estadogastoempleadosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadogastoempleadosSeleccionados.addAll(this.estadogastoempleadoLogic.getEstadoGastoEmpleados());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadogastoempleadosSeleccionados.addAll(this.estadogastoempleados);				
					}
				}
			}
		} else {
			estadogastoempleadosSeleccionados.add(this.estadogastoempleado);
		}
		
		return estadogastoempleadosSeleccionados;
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
	
	public void generarReporteEstadoGastoEmpleadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoGastoEmpleadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoGastoEmpleadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoGastoEmpleadosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoGastoEmpleadosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoGastoEmpleadosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Gasto Empleado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoGastoEmpleadosSeleccionados() throws Exception {
		ArrayList<EstadoGastoEmpleado> estadogastoempleadosSeleccionados=new ArrayList<EstadoGastoEmpleado>();		
		
		estadogastoempleadosSeleccionados=this.getEstadoGastoEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoGastoEmpleados("Todos",estadogastoempleadosSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoGastoEmpleadosSeleccionados() throws Exception {
		ArrayList<EstadoGastoEmpleado> estadogastoempleadosSeleccionados=new ArrayList<EstadoGastoEmpleado>();		
		
		estadogastoempleadosSeleccionados=this.getEstadoGastoEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoGastoEmpleados("Todos",estadogastoempleadosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoGastoEmpleadosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoGastoEmpleado> estadogastoempleadosSeleccionados=new ArrayList<EstadoGastoEmpleado>();
		
		estadogastoempleadosSeleccionados=this.getEstadoGastoEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoGastoEmpleados("Todos",estadogastoempleadosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoGastoEmpleadosSeleccionados() throws Exception {
		ArrayList<EstadoGastoEmpleado> estadogastoempleadosSeleccionados=new ArrayList<EstadoGastoEmpleado>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoGastoEmpleado();
		
		
		estadogastoempleadosSeleccionados=this.getEstadoGastoEmpleadosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoGastoEmpleado();
		
		
		//this.generarReporteEstadoGastoEmpleados("Todos",estadogastoempleadosSeleccionados ,estadogastoempleadoImplementable,estadogastoempleadoImplementableHome);
	}
	
	public void mostrarImportacionEstadoGastoEmpleados() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoGastoEmpleado();
		
		this.abrirFrameImportacionEstadoGastoEmpleado();		
		
			
		//this.generarReporteEstadoGastoEmpleados("Todos",estadogastoempleadosSeleccionados ,estadogastoempleadoImplementable,estadogastoempleadoImplementableHome);
	}
	
	public void importarEstadoGastoEmpleados() throws Exception {		
	
	}
	
	public void exportarEstadoGastoEmpleadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoGastoEmpleadosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoGastoEmpleadosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoGastoEmpleadosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Gasto Empleado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoGastoEmpleadosSeleccionados() throws Exception {
		ArrayList<EstadoGastoEmpleado> estadogastoempleadosSeleccionados=new ArrayList<EstadoGastoEmpleado>();		
		
		estadogastoempleadosSeleccionados=this.getEstadoGastoEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadogastoempleado."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoGastoEmpleado(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoGastoEmpleado estadogastoempleadoAux:estadogastoempleadosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoGastoEmpleado(estadogastoempleadoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadogastoempleadoAux.setsDetalleGeneralEntityReporte(estadogastoempleadoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Gasto Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoGastoEmpleado(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoGastoEmpleadoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoGastoEmpleadoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoGastoEmpleadoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoGastoEmpleadoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoGastoEmpleado(EstadoGastoEmpleado estadogastoempleado,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadogastoempleado.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadogastoempleado.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadogastoempleado.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadogastoempleado.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoGastoEmpleadosSeleccionados() throws Exception {
		ArrayList<EstadoGastoEmpleado> estadogastoempleadosSeleccionados=new ArrayList<EstadoGastoEmpleado>();		
		
		estadogastoempleadosSeleccionados=this.getEstadoGastoEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadogastoempleado.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoGastoEmpleados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoGastoEmpleado(row);				
				iRow++;
			}				
			
			for(EstadoGastoEmpleado estadogastoempleadoAux:estadogastoempleadosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoGastoEmpleado(estadogastoempleadoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Gasto Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoGastoEmpleadosSeleccionados() throws Exception {
		ArrayList<EstadoGastoEmpleado> estadogastoempleadosSeleccionados=new ArrayList<EstadoGastoEmpleado>();		
		
		estadogastoempleadosSeleccionados=this.getEstadoGastoEmpleadosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadogastoempleado.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadogastoempleados");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadogastoempleado");
			//elementRoot.appendChild(element);
		
			for(EstadoGastoEmpleado estadogastoempleadoAux:estadogastoempleadosSeleccionados) {
				element = document.createElement("estadogastoempleado");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoGastoEmpleado(estadogastoempleadoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Gasto Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoGastoEmpleado(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoGastoEmpleadoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoGastoEmpleadoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoGastoEmpleadoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoGastoEmpleadoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoGastoEmpleado(EstadoGastoEmpleado estadogastoempleado,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadogastoempleado.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadogastoempleado.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadogastoempleado.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoGastoEmpleado(EstadoGastoEmpleado estadogastoempleado,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoGastoEmpleadoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadogastoempleado.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoGastoEmpleadoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadogastoempleado.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoGastoEmpleadoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadogastoempleado.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoGastoEmpleadoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadogastoempleado.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoGastoEmpleadosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoGastoEmpleado> estadogastoempleadosSeleccionados=new ArrayList<EstadoGastoEmpleado>();
		
		estadogastoempleadosSeleccionados=this.getEstadoGastoEmpleadosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoGastoEmpleado(estadogastoempleadosSeleccionados);
		
		this.generarReporteEstadoGastoEmpleados("Todos",estadogastoempleadosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoGastoEmpleado(ArrayList<EstadoGastoEmpleado> estadogastoempleadosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoGastoEmpleado estadogastoempleadoAux:estadogastoempleadosSeleccionados) {
				estadogastoempleadoAux.setsDetalleGeneralEntityReporte(estadogastoempleadoAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoGastoEmpleadoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadogastoempleadoAux.setsDescripcionGeneralEntityReporte1(estadogastoempleadoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoGastoEmpleadoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadogastoempleadoAux.setsDescripcionGeneralEntityReporte1(estadogastoempleadoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGastoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoGastoEmpleado(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoGastoEmpleado=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoGastoEmpleado=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoGastoEmpleado=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaActualizarEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaEliminarEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaCancelarEstadoGastoEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoGastoEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoGastoEmpleado=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaModificarEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaActualizarEstadoGastoEmpleado=true;
			this.isVisibilidadCeldaEliminarEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaCancelarEstadoGastoEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoGastoEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoGastoEmpleado=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaModificarEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaActualizarEstadoGastoEmpleado=true;
			this.isVisibilidadCeldaEliminarEstadoGastoEmpleado=true;
			this.isVisibilidadCeldaCancelarEstadoGastoEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoGastoEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoGastoEmpleado=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaModificarEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaActualizarEstadoGastoEmpleado=true;
			this.isVisibilidadCeldaEliminarEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaCancelarEstadoGastoEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoGastoEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoGastoEmpleado=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoGastoEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoGastoEmpleado=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoGastoEmpleado=true;
			this.isVisibilidadCeldaModificarEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaActualizarEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaEliminarEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaCancelarEstadoGastoEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoGastoEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoGastoEmpleado=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaActualizarEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaEliminarEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaCancelarEstadoGastoEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoGastoEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoGastoEmpleado=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaModificarEstadoGastoEmpleado=true;
			this.isVisibilidadCeldaActualizarEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaEliminarEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaCancelarEstadoGastoEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoGastoEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoGastoEmpleado=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoGastoEmpleadoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoGastoEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoGastoEmpleado=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoGastoEmpleado=true;
		} else {
			this.actualizarEstadoPanelsEstadoGastoEmpleado(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoGastoEmpleado=false;
			//this.isVisibilidadCeldaVerFormEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaDuplicarEstadoGastoEmpleado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadogastoempleadoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoGastoEmpleado=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoGastoEmpleado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
			if(!estadogastoempleadoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoGastoEmpleado=false;												
			}
			
			this.jButtonCerrarEstadoGastoEmpleado.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoGastoEmpleado=false;
		}
		
		if(!this.permiteMantenimiento(this.estadogastoempleado)) {
			this.isVisibilidadCeldaActualizarEstadoGastoEmpleado=false;
			this.isVisibilidadCeldaEliminarEstadoGastoEmpleado=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoGastoEmpleado() {
		this.isVisibilidadCeldaNuevoEstadoGastoEmpleado=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoGastoEmpleado=false;
	}
	
	public void actualizarEstadoPanelsEstadoGastoEmpleado(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoGastoEmpleado!=null) {
				this.jScrollPanelDatosEdicionEstadoGastoEmpleado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoGastoEmpleado!=null) {
				this.jScrollPanelDatosEstadoGastoEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoGastoEmpleado!=null) {
				this.jPanelPaginacionEstadoGastoEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoGastoEmpleado!=null) {
				this.jPanelParametrosReportesEstadoGastoEmpleado.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoGastoEmpleado!=null) {
				this.jScrollPanelDatosEdicionEstadoGastoEmpleado.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoGastoEmpleado!=null) {
				this.jScrollPanelDatosEstadoGastoEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoGastoEmpleado!=null) {
				this.jPanelPaginacionEstadoGastoEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoGastoEmpleado!=null) {
				this.jPanelParametrosReportesEstadoGastoEmpleado.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoGastoEmpleado!=null) {
				this.jScrollPanelDatosEdicionEstadoGastoEmpleado.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoGastoEmpleado!=null) {
				this.jScrollPanelDatosEstadoGastoEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoGastoEmpleado!=null) {
				this.jPanelPaginacionEstadoGastoEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoGastoEmpleado!=null) {
				this.jPanelParametrosReportesEstadoGastoEmpleado.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoGastoEmpleado!=null) {
				this.jScrollPanelDatosEdicionEstadoGastoEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoGastoEmpleado!=null) {
				this.jScrollPanelDatosEstadoGastoEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoGastoEmpleado!=null) {
				this.jPanelPaginacionEstadoGastoEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoGastoEmpleado!=null) {
				this.jPanelParametrosReportesEstadoGastoEmpleado.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoGastoEmpleado!=null) {
				this.jScrollPanelDatosEdicionEstadoGastoEmpleado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoGastoEmpleado!=null) {
				this.jScrollPanelDatosEstadoGastoEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoGastoEmpleado!=null) {
				this.jPanelPaginacionEstadoGastoEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoGastoEmpleado!=null) {
				this.jPanelParametrosReportesEstadoGastoEmpleado.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoGastoEmpleado!=null) {
				this.jScrollPanelDatosEdicionEstadoGastoEmpleado.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoGastoEmpleado!=null) {
				this.jScrollPanelDatosEstadoGastoEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoGastoEmpleado!=null) {
				this.jPanelPaginacionEstadoGastoEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoGastoEmpleado!=null) {
				this.jPanelParametrosReportesEstadoGastoEmpleado.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoGastoEmpleado!=null) {
				this.jScrollPanelDatosEdicionEstadoGastoEmpleado.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoGastoEmpleado!=null) {
				this.jScrollPanelDatosEstadoGastoEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoGastoEmpleado!=null) {
				this.jPanelPaginacionEstadoGastoEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoGastoEmpleado!=null) {
				this.jPanelParametrosReportesEstadoGastoEmpleado.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoGastoEmpleadoParaGastoEmpleados() throws Exception {
		Boolean isPaginaPopupGastoEmpleado=false;

		try {

			if(this.estadogastoempleadoSessionBean==null) {
				this.estadogastoempleadoSessionBean=new EstadoGastoEmpleadoSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoSessionBean=new GastoEmpleadoSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoSessionBean.setsPathNavegacionActual(estadogastoempleadoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupGastoEmpleado=this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeGastoEmpleado(true);
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeGastoEmpleado(EstadoGastoEmpleadoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoSessionBean.setisBusquedaDesdeForeignKeySesionEstadoGastoEmpleado(true);
			this.jInternalFrameDetalleFormEstadoGastoEmpleado.gastoempleadoSessionBean.setlidEstadoGastoEmpleadoActual(this.idEstadoGastoEmpleadoActual);

			estadogastoempleadoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoGastoEmpleado(true);
			estadogastoempleadoSessionBean.setlIdEstadoGastoEmpleadoActualForeignKey(this.idEstadoGastoEmpleadoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoGastoEmpleadoSessionBean estadogastoempleadoSessionBean=new EstadoGastoEmpleadoSessionBean();
		
		if(this.estadogastoempleadoSessionBean==null) {
			this.estadogastoempleadoSessionBean=new EstadoGastoEmpleadoSessionBean();
		}
		
		this.estadogastoempleadoSessionBean.setsUltimaBusquedaEstadoGastoEmpleado(this.getsAccionBusqueda());
		this.estadogastoempleadoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadogastoempleadoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoGastoEmpleadoSessionBean estadogastoempleadoSessionBean=new EstadoGastoEmpleadoSessionBean();
		
		if(this.estadogastoempleadoSessionBean==null) {
			this.estadogastoempleadoSessionBean=new EstadoGastoEmpleadoSessionBean();
		}
		
		if(this.estadogastoempleadoSessionBean.getsUltimaBusquedaEstadoGastoEmpleado()!=null&&!this.estadogastoempleadoSessionBean.getsUltimaBusquedaEstadoGastoEmpleado().equals("")) {
			this.setsAccionBusqueda(estadogastoempleadoSessionBean.getsUltimaBusquedaEstadoGastoEmpleado());
			this.setiNumeroPaginacion(estadogastoempleadoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadogastoempleadoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadogastoempleadoSessionBean.setsUltimaBusquedaEstadoGastoEmpleado("");
		this.estadogastoempleadoSessionBean.setiNumeroPaginacion(EstadoGastoEmpleadoConstantesFunciones.INUMEROPAGINACION);
		this.estadogastoempleadoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoGastoEmpleado(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoGastoEmpleado() {
		this.updateBorderResaltarBusquedasFormularioEstadoGastoEmpleado();
		this.updateVisibilidadBusquedasFormularioEstadoGastoEmpleado();
		this.updateHabilitarBusquedasFormularioEstadoGastoEmpleado();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoGastoEmpleado() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoGastoEmpleado() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoGastoEmpleado() {
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
	
	public void updateControlesFormularioEstadoGastoEmpleado() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoGastoEmpleado();
		this.updateVisibilidadResaltarControlesFormularioEstadoGastoEmpleado();
		this.updateHabilitarResaltarControlesFormularioEstadoGastoEmpleado();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoGastoEmpleado() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadogastoempleadoConstantesFunciones.resaltaridEstadoGastoEmpleado!=null && this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) {this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTextFieldidEstadoGastoEmpleado.setBorder(this.estadogastoempleadoConstantesFunciones.resaltaridEstadoGastoEmpleado);}
		if(this.estadogastoempleadoConstantesFunciones.resaltarcodigoEstadoGastoEmpleado!=null && this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) {this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTextFieldcodigoEstadoGastoEmpleado.setBorder(this.estadogastoempleadoConstantesFunciones.resaltarcodigoEstadoGastoEmpleado);}
		if(this.estadogastoempleadoConstantesFunciones.resaltarnombreEstadoGastoEmpleado!=null && this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) {this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTextAreanombreEstadoGastoEmpleado.setBorder(this.estadogastoempleadoConstantesFunciones.resaltarnombreEstadoGastoEmpleado);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoGastoEmpleado() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) {
	
		//this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTextFieldidEstadoGastoEmpleado.setVisible(this.estadogastoempleadoConstantesFunciones.mostraridEstadoGastoEmpleado);
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jPanelidEstadoGastoEmpleado.setVisible(this.estadogastoempleadoConstantesFunciones.mostraridEstadoGastoEmpleado);
		//this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTextFieldcodigoEstadoGastoEmpleado.setVisible(this.estadogastoempleadoConstantesFunciones.mostrarcodigoEstadoGastoEmpleado);
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jPanelcodigoEstadoGastoEmpleado.setVisible(this.estadogastoempleadoConstantesFunciones.mostrarcodigoEstadoGastoEmpleado);
		//this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTextAreanombreEstadoGastoEmpleado.setVisible(this.estadogastoempleadoConstantesFunciones.mostrarnombreEstadoGastoEmpleado);
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jPanelnombreEstadoGastoEmpleado.setVisible(this.estadogastoempleadoConstantesFunciones.mostrarnombreEstadoGastoEmpleado);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoGastoEmpleado() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoGastoEmpleado!=null) {
	
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTextFieldidEstadoGastoEmpleado.setEnabled(this.estadogastoempleadoConstantesFunciones.activaridEstadoGastoEmpleado);
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTextFieldcodigoEstadoGastoEmpleado.setEnabled(this.estadogastoempleadoConstantesFunciones.activarcodigoEstadoGastoEmpleado);
		this.jInternalFrameDetalleFormEstadoGastoEmpleado.jTextAreanombreEstadoGastoEmpleado.setEnabled(this.estadogastoempleadoConstantesFunciones.activarnombreEstadoGastoEmpleado);
		}
	}
	
		
}