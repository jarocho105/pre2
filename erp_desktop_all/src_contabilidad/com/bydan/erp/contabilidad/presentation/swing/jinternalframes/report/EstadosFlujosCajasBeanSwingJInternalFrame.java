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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.contabilidad.util.EstadosFlujosCajasConstantesFunciones;
import com.bydan.erp.contabilidad.util.report.EstadosFlujosCajasParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.report.EstadosFlujosCajasParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.report.EstadosFlujosCajasBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.contabilidad.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.contabilidad.util.*;

import com.bydan.erp.contabilidad.util.report.*;
import com.bydan.erp.contabilidad.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class EstadosFlujosCajasBeanSwingJInternalFrame extends EstadosFlujosCajasJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadosFlujosCajasBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadosFlujosCajas> estadosflujoscajasValidator = new ClassValidator<EstadosFlujosCajas>(EstadosFlujosCajas.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadosFlujosCajas estadosflujoscajas;	
	public EstadosFlujosCajas estadosflujoscajasAux;
	public EstadosFlujosCajas estadosflujoscajasAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadosFlujosCajas estadosflujoscajasTotales;
	public Long idEstadosFlujosCajasActual;
	public Long iIdNuevoEstadosFlujosCajas=0L;
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

	public String sFinalQueryComboEjercicio="";

	public List<Ejercicio> ejerciciosForeignKey;

	public List<Ejercicio> getejerciciosForeignKey() {
		return ejerciciosForeignKey;
	}

	public void setejerciciosForeignKey(List<Ejercicio> ejerciciosForeignKey) {
		this.ejerciciosForeignKey = ejerciciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ejercicio ejercicioForeignKey;

	public Ejercicio getejercicioForeignKey() {
		return ejercicioForeignKey;
	}

	public void setejercicioForeignKey(Ejercicio ejercicioForeignKey) {
		this.ejercicioForeignKey = ejercicioForeignKey;
	}

	public String sFinalQueryComboPeriodo="";

	public List<Periodo> periodosForeignKey;

	public List<Periodo> getperiodosForeignKey() {
		return periodosForeignKey;
	}

	public void setperiodosForeignKey(List<Periodo> periodosForeignKey) {
		this.periodosForeignKey = periodosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Periodo periodoForeignKey;

	public Periodo getperiodoForeignKey() {
		return periodoForeignKey;
	}

	public void setperiodoForeignKey(Periodo periodoForeignKey) {
		this.periodoForeignKey = periodoForeignKey;
	}

	public String sFinalQueryComboCentroActividad="";

	public List<CentroActividad> centroactividadsForeignKey;

	public List<CentroActividad> getcentroactividadsForeignKey() {
		return centroactividadsForeignKey;
	}

	public void setcentroactividadsForeignKey(List<CentroActividad> centroactividadsForeignKey) {
		this.centroactividadsForeignKey = centroactividadsForeignKey;
	}

	//OBJETO FK ACTUAL
	public CentroActividad centroactividadForeignKey;

	public CentroActividad getcentroactividadForeignKey() {
		return centroactividadForeignKey;
	}

	public void setcentroactividadForeignKey(CentroActividad centroactividadForeignKey) {
		this.centroactividadForeignKey = centroactividadForeignKey;
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
	
	public Boolean isPermisoTodoEstadosFlujosCajas;
	public Boolean isPermisoNuevoEstadosFlujosCajas;
	public Boolean isPermisoActualizarEstadosFlujosCajas;
	public Boolean isPermisoActualizarOriginalEstadosFlujosCajas;
	public Boolean isPermisoEliminarEstadosFlujosCajas;
	public Boolean isPermisoGuardarCambiosEstadosFlujosCajas;
	public Boolean isPermisoConsultaEstadosFlujosCajas;
	public Boolean isPermisoBusquedaEstadosFlujosCajas;
	public Boolean isPermisoReporteEstadosFlujosCajas;
	public Boolean isPermisoPaginacionMedioEstadosFlujosCajas;
	public Boolean isPermisoPaginacionAltoEstadosFlujosCajas;
	public Boolean isPermisoPaginacionTodoEstadosFlujosCajas;
	public Boolean isPermisoCopiarEstadosFlujosCajas;
	public Boolean isPermisoVerFormEstadosFlujosCajas;
	public Boolean isPermisoDuplicarEstadosFlujosCajas;
	public Boolean isPermisoOrdenEstadosFlujosCajas;
	
	
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
	
	public EstadosFlujosCajasParameterReturnGeneral estadosflujoscajasReturnGeneral;
	public EstadosFlujosCajasParameterReturnGeneral estadosflujoscajasParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadosFlujosCajas=false;
	public Boolean esParaAccionDesdeFormularioEstadosFlujosCajas=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadosFlujosCajasSessionBeanAdditional estadosflujoscajasSessionBeanAdditional=null;
	
	public EstadosFlujosCajasSessionBeanAdditional getEstadosFlujosCajasSessionBeanAdditional() {
		return this.estadosflujoscajasSessionBeanAdditional;
	}
	
	public void setEstadosFlujosCajasSessionBeanAdditional(EstadosFlujosCajasSessionBeanAdditional estadosflujoscajasSessionBeanAdditional) {
		try {
			this.estadosflujoscajasSessionBeanAdditional=estadosflujoscajasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadosFlujosCajasBeanSwingJInternalFrameAdditional estadosflujoscajasBeanSwingJInternalFrameAdditional=null;
	//public class EstadosFlujosCajasBeanSwingJInternalFrame
	
	public EstadosFlujosCajasBeanSwingJInternalFrameAdditional getEstadosFlujosCajasBeanSwingJInternalFrameAdditional() {
		return this.estadosflujoscajasBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadosFlujosCajasBeanSwingJInternalFrameAdditional(EstadosFlujosCajasBeanSwingJInternalFrameAdditional estadosflujoscajasBeanSwingJInternalFrameAdditional) {
		try {
			this.estadosflujoscajasBeanSwingJInternalFrameAdditional=estadosflujoscajasBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadosFlujosCajasLogic estadosflujoscajasLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadosFlujosCajas estadosflujoscajasBean;
	public EstadosFlujosCajasConstantesFunciones estadosflujoscajasConstantesFunciones;
	//public EstadosFlujosCajasParameterReturnGeneral estadosflujoscajasReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public CentroActividadLogic centroactividadLogic;
	
	//PARAMETROS
	
	
	//public List<EstadosFlujosCajas> estadosflujoscajass;	
	//public List<EstadosFlujosCajas> estadosflujoscajassEliminados;
	//public List<EstadosFlujosCajas> estadosflujoscajassAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadosFlujosCajas=false;
	public Boolean isVisibilidadCeldaDuplicarEstadosFlujosCajas=true;
	public Boolean isVisibilidadCeldaCopiarEstadosFlujosCajas=true;
	public Boolean isVisibilidadCeldaVerFormEstadosFlujosCajas=true;
	public Boolean isVisibilidadCeldaOrdenEstadosFlujosCajas=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadosFlujosCajas=false;
	public Boolean isVisibilidadCeldaModificarEstadosFlujosCajas=false;
	public Boolean isVisibilidadCeldaActualizarEstadosFlujosCajas=false;
	public Boolean isVisibilidadCeldaEliminarEstadosFlujosCajas=false;
	public Boolean isVisibilidadCeldaCancelarEstadosFlujosCajas=false;
	public Boolean isVisibilidadCeldaGuardarEstadosFlujosCajas=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadosFlujosCajas=false;	
	
	
	public Boolean isVisibilidadBusquedaEstadosFlujosCajas=false;
	public Boolean isVisibilidadFK_IdCentroActividad=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	
	public Long getiIdNuevoEstadosFlujosCajas() {
		return this.iIdNuevoEstadosFlujosCajas;
	}

	public void setiIdNuevoEstadosFlujosCajas(Long iIdNuevoEstadosFlujosCajas) {
		this.iIdNuevoEstadosFlujosCajas = iIdNuevoEstadosFlujosCajas;
	}
	
	public Long getidEstadosFlujosCajasActual() {
		return this.idEstadosFlujosCajasActual;
	}

	public void setidEstadosFlujosCajasActual(Long idEstadosFlujosCajasActual) {
		this.idEstadosFlujosCajasActual = idEstadosFlujosCajasActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadosFlujosCajas getestadosflujoscajas() {
		return this.estadosflujoscajas;
	}

	public void setestadosflujoscajas(EstadosFlujosCajas estadosflujoscajas) {
		this.estadosflujoscajas = estadosflujoscajas;
	}
	
	public EstadosFlujosCajas getestadosflujoscajasAux() {
		return this.estadosflujoscajasAux;
	}

	public void setestadosflujoscajasAux(EstadosFlujosCajas estadosflujoscajasAux) {
		this.estadosflujoscajasAux = estadosflujoscajasAux;
	}				
	
	public EstadosFlujosCajas getestadosflujoscajasAnterior() {
		return this.estadosflujoscajasAnterior;
	}

	public void setestadosflujoscajasAnterior(EstadosFlujosCajas estadosflujoscajasAnterior) {
		this.estadosflujoscajasAnterior = estadosflujoscajasAnterior;
	}	
	
	public EstadosFlujosCajas getestadosflujoscajasTotales() {
		return this.estadosflujoscajasTotales;
	}

	public void setestadosflujoscajasTotales(EstadosFlujosCajas estadosflujoscajasTotales) {
		this.estadosflujoscajasTotales = estadosflujoscajasTotales;
	}	
	
	public EstadosFlujosCajas getestadosflujoscajasBean() {
		return this.estadosflujoscajasBean;
	}

	public void setestadosflujoscajasBean(EstadosFlujosCajas estadosflujoscajasBean) {
		this.estadosflujoscajasBean = estadosflujoscajasBean;
	}	
	
	public EstadosFlujosCajasParameterReturnGeneral getestadosflujoscajasReturnGeneral() {
		return this.estadosflujoscajasReturnGeneral;
	}

	public void setestadosflujoscajasReturnGeneral(EstadosFlujosCajasParameterReturnGeneral estadosflujoscajasReturnGeneral) {
		this.estadosflujoscajasReturnGeneral = estadosflujoscajasReturnGeneral;
	}	
	
	
	public Long id_ejercicioBusquedaEstadosFlujosCajas=-1L;

	public Long getid_ejercicioBusquedaEstadosFlujosCajas() {
		return this.id_ejercicioBusquedaEstadosFlujosCajas;
	}

	public void setid_ejercicioBusquedaEstadosFlujosCajas(Long id_ejercicioBusquedaEstadosFlujosCajas) {
		this.id_ejercicioBusquedaEstadosFlujosCajas = id_ejercicioBusquedaEstadosFlujosCajas;
	}

;
	public Long id_periodoBusquedaEstadosFlujosCajas=-1L;

	public Long getid_periodoBusquedaEstadosFlujosCajas() {
		return this.id_periodoBusquedaEstadosFlujosCajas;
	}

	public void setid_periodoBusquedaEstadosFlujosCajas(Long id_periodoBusquedaEstadosFlujosCajas) {
		this.id_periodoBusquedaEstadosFlujosCajas = id_periodoBusquedaEstadosFlujosCajas;
	}

;
	public Long id_centro_actividadBusquedaEstadosFlujosCajas=-1L;

	public Long getid_centro_actividadBusquedaEstadosFlujosCajas() {
		return this.id_centro_actividadBusquedaEstadosFlujosCajas;
	}

	public void setid_centro_actividadBusquedaEstadosFlujosCajas(Long id_centro_actividadBusquedaEstadosFlujosCajas) {
		this.id_centro_actividadBusquedaEstadosFlujosCajas = id_centro_actividadBusquedaEstadosFlujosCajas;
	}

	public Long id_centro_actividadFK_IdCentroActividad=-1L;

	public Long getid_centro_actividadFK_IdCentroActividad() {
		return this.id_centro_actividadFK_IdCentroActividad;
	}

	public void setid_centro_actividadFK_IdCentroActividad(Long id_centro_actividadFK_IdCentroActividad) {
		this.id_centro_actividadFK_IdCentroActividad = id_centro_actividadFK_IdCentroActividad;
	}

	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_periodoFK_IdPeriodo=-1L;

	public Long getid_periodoFK_IdPeriodo() {
		return this.id_periodoFK_IdPeriodo;
	}

	public void setid_periodoFK_IdPeriodo(Long id_periodoFK_IdPeriodo) {
		this.id_periodoFK_IdPeriodo = id_periodoFK_IdPeriodo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadosFlujosCajasLogic getEstadosFlujosCajasLogic()	{		
		return estadosflujoscajasLogic;
	}

	public void setEstadosFlujosCajasLogic(EstadosFlujosCajasLogic estadosflujoscajasLogic) {
		this.estadosflujoscajasLogic = estadosflujoscajasLogic;
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
	
	public Boolean getIsEsNuevoEstadosFlujosCajas() {
		return isEsNuevoEstadosFlujosCajas;
	}

	public void setIsEsNuevoEstadosFlujosCajas(Boolean isEsNuevoEstadosFlujosCajas) {
		this.isEsNuevoEstadosFlujosCajas = isEsNuevoEstadosFlujosCajas;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadosFlujosCajas() {
		return esParaAccionDesdeFormularioEstadosFlujosCajas;
	}
	
	public void setEsParaAccionDesdeFormularioEstadosFlujosCajas(Boolean esParaAccionDesdeFormularioEstadosFlujosCajas) {
		this.esParaAccionDesdeFormularioEstadosFlujosCajas = esParaAccionDesdeFormularioEstadosFlujosCajas;
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

			if(this.estadosflujoscajasSessionBean==null) {
				this.estadosflujoscajasSessionBean=new EstadosFlujosCajasSessionBean();
			}

			if(!this.estadosflujoscajasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(estadosflujoscajasSessionBean.getlidEmpresaActual());
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

	public void cargarCombosEjerciciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EjercicioLogic ejercicioLogic=new EjercicioLogic();

			//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

			if(this.estadosflujoscajasSessionBean==null) {
				this.estadosflujoscajasSessionBean=new EstadosFlujosCajasSessionBean();
			}

			if(!this.estadosflujoscajasSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

					ejercicioLogic.getTodosEjerciciosWithConnection(sFinalQuery,new Pagination());

					this.ejerciciosForeignKey=ejercicioLogic.getEjercicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEjercicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEntityWithConnection(estadosflujoscajasSessionBean.getlidEjercicioActual());
					this.ejerciciosForeignKey.add(ejercicioLogic.getEjercicio());
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

	public void cargarCombosPeriodosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.periodosForeignKey=new ArrayList<Periodo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PeriodoLogic periodoLogic=new PeriodoLogic();

			//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

			if(this.estadosflujoscajasSessionBean==null) {
				this.estadosflujoscajasSessionBean=new EstadosFlujosCajasSessionBean();
			}

			if(!this.estadosflujoscajasSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

					periodoLogic.getTodosPeriodosWithConnection(sFinalQuery,new Pagination());

					this.periodosForeignKey=periodoLogic.getPeriodos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPeriodo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLogic.getEntityWithConnection(estadosflujoscajasSessionBean.getlidPeriodoActual());
					this.periodosForeignKey.add(periodoLogic.getPeriodo());
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

	public void cargarCombosCentroActividadsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.centroactividadsForeignKey=new ArrayList<CentroActividad>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CentroActividadLogic centroactividadLogic=new CentroActividadLogic();

			//centroactividadLogic.getCentroActividadDataAccess().setIsForForeingKeyData(true);

			if(this.estadosflujoscajasSessionBean==null) {
				this.estadosflujoscajasSessionBean=new EstadosFlujosCajasSessionBean();
			}

			if(!this.estadosflujoscajasSessionBean.getisBusquedaDesdeForeignKeySesionCentroActividad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//centroactividadLogic.getCentroActividadDataAccess().setIsForForeingKeyData(true);

					centroactividadLogic.getTodosCentroActividadsWithConnection(sFinalQuery,new Pagination());

					this.centroactividadsForeignKey=centroactividadLogic.getCentroActividads();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCentroActividad(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					centroactividadLogic.getEntityWithConnection(estadosflujoscajasSessionBean.getlidCentroActividadActual());
					this.centroactividadsForeignKey.add(centroactividadLogic.getCentroActividad());
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

					if(this.estadosflujoscajas!=null) {
						this.estadosflujoscajas.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
						this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_empresaEstadosFlujosCajas.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEstadosFlujosCajas.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
						if(this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_empresaEstadosFlujosCajas.getItemCount()>0) {
							this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_empresaEstadosFlujosCajas.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEstadosFlujosCajasGenerico)throws Exception
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
				jComboBoxid_empresaEstadosFlujosCajasGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEstadosFlujosCajasGenerico!=null && jComboBoxid_empresaEstadosFlujosCajasGenerico.getItemCount()>0) {
					jComboBoxid_empresaEstadosFlujosCajasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEjercicioForeignKey(Long idEjercicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ejercicioTemp!=null) {

					if(this.estadosflujoscajas!=null) {
						this.estadosflujoscajas.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
						this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_ejercicioEstadosFlujosCajas.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioEstadosFlujosCajas.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
						if(this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_ejercicioEstadosFlujosCajas.getItemCount()>0) {
							this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_ejercicioEstadosFlujosCajas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaEstadosFlujosCajas") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas!=null) {
						jComboBoxid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas!=null) {
							//jComboBoxid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas.setSelectedIndex(0);
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

	public String getActualEjercicioForeignKeyDescripcion(Long idEjercicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}


			sDescripcion=EjercicioConstantesFunciones.getEjercicioDescripcion(ejercicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioEstadosFlujosCajasGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(ejercicioTemp!=null) {
				jComboBoxid_ejercicioEstadosFlujosCajasGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioEstadosFlujosCajasGenerico!=null && jComboBoxid_ejercicioEstadosFlujosCajasGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioEstadosFlujosCajasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPeriodoForeignKey(Long idPeriodoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(periodoTemp!=null) {

					if(this.estadosflujoscajas!=null) {
						this.estadosflujoscajas.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
						this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_periodoEstadosFlujosCajas.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoEstadosFlujosCajas.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
						if(this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_periodoEstadosFlujosCajas.getItemCount()>0) {
							this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_periodoEstadosFlujosCajas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaEstadosFlujosCajas") || sFormularioTipoBusqueda.equals("Todos")){
					if(periodoTemp!=null && jComboBoxid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas!=null) {
						jComboBoxid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas.setSelectedItem(periodoTemp);
					} else {
						if(jComboBoxid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas!=null) {
							//jComboBoxid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas.setSelectedItem(periodoTemp);
							if(jComboBoxid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas.getItemCount()>0) {
								jComboBoxid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas.setSelectedIndex(0);
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

	public String getActualPeriodoForeignKeyDescripcion(Long idPeriodoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}


			sDescripcion=PeriodoConstantesFunciones.getPeriodoDescripcion(periodoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoEstadosFlujosCajasGenerico)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(periodoTemp!=null) {
				jComboBoxid_periodoEstadosFlujosCajasGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoEstadosFlujosCajasGenerico!=null && jComboBoxid_periodoEstadosFlujosCajasGenerico.getItemCount()>0) {
					jComboBoxid_periodoEstadosFlujosCajasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCentroActividadForeignKey(Long idCentroActividadSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CentroActividad  centroactividadTemp=null;

			for(CentroActividad centroactividadAux:centroactividadsForeignKey) {
				if(centroactividadAux.getId()!=null && centroactividadAux.getId().equals(idCentroActividadSeleccionado)) {
					centroactividadTemp=centroactividadAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(centroactividadTemp!=null) {

					if(this.estadosflujoscajas!=null) {
						this.estadosflujoscajas.setCentroActividad(centroactividadTemp);
					}

					if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
						this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_centro_actividadEstadosFlujosCajas.setSelectedItem(centroactividadTemp);
					}
				} else {
					//jComboBoxid_centro_actividadEstadosFlujosCajas.setSelectedItem(centroactividadTemp);
					if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
						if(this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_centro_actividadEstadosFlujosCajas.getItemCount()>0) {
							this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_centro_actividadEstadosFlujosCajas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaEstadosFlujosCajas") || sFormularioTipoBusqueda.equals("Todos")){
					if(centroactividadTemp!=null && jComboBoxid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas!=null) {
						jComboBoxid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas.setSelectedItem(centroactividadTemp);
					} else {
						if(jComboBoxid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas!=null) {
							//jComboBoxid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas.setSelectedItem(centroactividadTemp);
							if(jComboBoxid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas.getItemCount()>0) {
								jComboBoxid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas.setSelectedIndex(0);
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

	public String getActualCentroActividadForeignKeyDescripcion(Long idCentroActividadSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CentroActividad  centroactividadTemp=null;

			for(CentroActividad centroactividadAux:centroactividadsForeignKey) {
				if(centroactividadAux.getId()!=null && centroactividadAux.getId().equals(idCentroActividadSeleccionado)) {
					centroactividadTemp=centroactividadAux;
					break;
				}
			}


			sDescripcion=CentroActividadConstantesFunciones.getCentroActividadDescripcion(centroactividadTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCentroActividadForeignKeyGenerico(Long idCentroActividadSeleccionado,JComboBox jComboBoxid_centro_actividadEstadosFlujosCajasGenerico)throws Exception
	{
		try
		{
			CentroActividad  centroactividadTemp=null;

			for(CentroActividad centroactividadAux:centroactividadsForeignKey) {
				if(centroactividadAux.getId()!=null && centroactividadAux.getId().equals(idCentroActividadSeleccionado)) {
					centroactividadTemp=centroactividadAux;
					break;
				}
			}

			if(centroactividadTemp!=null) {
				jComboBoxid_centro_actividadEstadosFlujosCajasGenerico.setSelectedItem(centroactividadTemp);
			} else {
				if(jComboBoxid_centro_actividadEstadosFlujosCajasGenerico!=null && jComboBoxid_centro_actividadEstadosFlujosCajasGenerico.getItemCount()>0) {
					jComboBoxid_centro_actividadEstadosFlujosCajasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(EstadosFlujosCajas estadosflujoscajas,JComboBox jComboBoxid_empresaEstadosFlujosCajasGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEstadosFlujosCajasGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_empresaEstadosFlujosCajas.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEstadosFlujosCajasGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				estadosflujoscajas.setid_empresa(empresaAux.getId());
				estadosflujoscajas.setempresa_descripcion(EstadosFlujosCajasConstantesFunciones.getEmpresaDescripcion(empresaAux));
				estadosflujoscajas.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(EstadosFlujosCajas estadosflujoscajas,JComboBox jComboBoxid_ejercicioEstadosFlujosCajasGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioEstadosFlujosCajasGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_ejercicioEstadosFlujosCajas.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioEstadosFlujosCajasGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				estadosflujoscajas.setid_ejercicio(ejercicioAux.getId());
				estadosflujoscajas.setejercicio_descripcion(EstadosFlujosCajasConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				estadosflujoscajas.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(EstadosFlujosCajas estadosflujoscajas,JComboBox jComboBoxid_periodoEstadosFlujosCajasGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoEstadosFlujosCajasGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_periodoEstadosFlujosCajas.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoEstadosFlujosCajasGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				estadosflujoscajas.setid_periodo(periodoAux.getId());
				estadosflujoscajas.setperiodo_descripcion(EstadosFlujosCajasConstantesFunciones.getPeriodoDescripcion(periodoAux));
				estadosflujoscajas.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCentroActividadForeignKey(EstadosFlujosCajas estadosflujoscajas,JComboBox jComboBoxid_centro_actividadEstadosFlujosCajasGenerico)throws Exception
	{
		try
		{
			CentroActividad  centroactividadAux=new CentroActividad();

			if(jComboBoxid_centro_actividadEstadosFlujosCajasGenerico==null) {
				centroactividadAux=(CentroActividad)this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_centro_actividadEstadosFlujosCajas.getSelectedItem();
			} else {
				centroactividadAux=(CentroActividad)jComboBoxid_centro_actividadEstadosFlujosCajasGenerico.getSelectedItem();
			}

			if(centroactividadAux!=null && centroactividadAux.getId()!=null) {
				estadosflujoscajas.setid_centro_actividad(centroactividadAux.getId());
				estadosflujoscajas.setcentroactividad_descripcion(EstadosFlujosCajasConstantesFunciones.getCentroActividadDescripcion(centroactividadAux));
				estadosflujoscajas.setCentroActividad(centroactividadAux);			}
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

					if(!EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) { 
							this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_empresaEstadosFlujosCajas.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_empresaEstadosFlujosCajas.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) { 
					}

					if(!EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEjerciciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEjercicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) { 
							this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_ejercicioEstadosFlujosCajas.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_ejercicioEstadosFlujosCajas.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) { 
					}

					if(!EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaEstadosFlujosCajas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas.addItem(ejercicio);
							}
						}

						if(!EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePeriodosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPeriodo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) { 
							this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_periodoEstadosFlujosCajas.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_periodoEstadosFlujosCajas.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) { 
					}

					if(!EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaEstadosFlujosCajas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jComboBoxid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas.addItem(periodo);
							}
						}

						if(!EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCentroActividadsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCentroActividad=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) { 
							this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_centro_actividadEstadosFlujosCajas.removeAllItems();

							for(CentroActividad centroactividad:this.centroactividadsForeignKey) {
								this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_centro_actividadEstadosFlujosCajas.addItem(centroactividad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) { 
					}

					if(!EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaEstadosFlujosCajas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas.removeAllItems();

							for(CentroActividad centroactividad:this.centroactividadsForeignKey) {
								this.jComboBoxid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas.addItem(centroactividad);
							}
						}

						if(!EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
							this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_empresaEstadosFlujosCajas.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
							this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_empresaEstadosFlujosCajas.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEjercicioForeignKey(Ejercicio ejercicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
							this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_ejercicioEstadosFlujosCajas.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
							this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_ejercicioEstadosFlujosCajas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFramePeriodoForeignKey(Periodo periodo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
							this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_periodoEstadosFlujosCajas.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
							this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_periodoEstadosFlujosCajas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas.setSelectedItem(periodo);
						} else {
							this.jComboBoxid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCentroActividadForeignKey(CentroActividad centroactividad,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
							this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_centro_actividadEstadosFlujosCajas.setSelectedItem(centroactividad);
						}
					} else {
						if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
							this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_centro_actividadEstadosFlujosCajas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas.setSelectedItem(centroactividad);
						} else {
							this.jComboBoxid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesEstadosFlujosCajas() throws Exception {
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
		
	public EstadosFlujosCajasParameterReturnGeneral getEstadosFlujosCajasParameterGeneral() {
		return this.estadosflujoscajasParameterGeneral;
	}
	
	public void setEstadosFlujosCajasParameterGeneral(EstadosFlujosCajasParameterReturnGeneral estadosflujoscajasParameterGeneral) {
		this.estadosflujoscajasParameterGeneral = estadosflujoscajasParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadosFlujosCajas() {
		return isPermisoTodoEstadosFlujosCajas;
	}

	public void setIsPermisoTodoEstadosFlujosCajas(Boolean isPermisoTodoEstadosFlujosCajas) {
		this.isPermisoTodoEstadosFlujosCajas = isPermisoTodoEstadosFlujosCajas;
	}

	public Boolean getIsPermisoNuevoEstadosFlujosCajas() {
		return isPermisoNuevoEstadosFlujosCajas;
	}

	public void setIsPermisoNuevoEstadosFlujosCajas(Boolean isPermisoNuevoEstadosFlujosCajas) {
		this.isPermisoNuevoEstadosFlujosCajas = isPermisoNuevoEstadosFlujosCajas;
	}

	public Boolean getIsPermisoActualizarEstadosFlujosCajas() {
		return isPermisoActualizarEstadosFlujosCajas;
	}

	public void setIsPermisoActualizarEstadosFlujosCajas(Boolean isPermisoActualizarEstadosFlujosCajas) {
		this.isPermisoActualizarEstadosFlujosCajas = isPermisoActualizarEstadosFlujosCajas;
	}

	public Boolean getIsPermisoEliminarEstadosFlujosCajas() {
		return isPermisoEliminarEstadosFlujosCajas;
	}

	public void setIsPermisoEliminarEstadosFlujosCajas(Boolean isPermisoEliminarEstadosFlujosCajas) {
		this.isPermisoEliminarEstadosFlujosCajas = isPermisoEliminarEstadosFlujosCajas;
	}

	public Boolean getIsPermisoGuardarCambiosEstadosFlujosCajas() {
		return isPermisoGuardarCambiosEstadosFlujosCajas;
	}

	public void setIsPermisoGuardarCambiosEstadosFlujosCajas(Boolean isPermisoGuardarCambiosEstadosFlujosCajas) {
		this.isPermisoGuardarCambiosEstadosFlujosCajas = isPermisoGuardarCambiosEstadosFlujosCajas;
	}
	
	public Boolean getIsPermisoConsultaEstadosFlujosCajas() {
		return isPermisoConsultaEstadosFlujosCajas;
	}

	public void setIsPermisoConsultaEstadosFlujosCajas(Boolean isPermisoConsultaEstadosFlujosCajas) {
		this.isPermisoConsultaEstadosFlujosCajas = isPermisoConsultaEstadosFlujosCajas;
	}

	public Boolean getIsPermisoBusquedaEstadosFlujosCajas() {
		return isPermisoBusquedaEstadosFlujosCajas;
	}

	public void setIsPermisoBusquedaEstadosFlujosCajas(Boolean isPermisoBusquedaEstadosFlujosCajas) {
		this.isPermisoBusquedaEstadosFlujosCajas = isPermisoBusquedaEstadosFlujosCajas;
	}

	public Boolean getIsPermisoReporteEstadosFlujosCajas() {
		return isPermisoReporteEstadosFlujosCajas;
	}

	public void setIsPermisoReporteEstadosFlujosCajas(Boolean isPermisoReporteEstadosFlujosCajas) {
		this.isPermisoReporteEstadosFlujosCajas = isPermisoReporteEstadosFlujosCajas;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadosFlujosCajas() {
		return isPermisoPaginacionMedioEstadosFlujosCajas;
	}

	public void setIsPermisoPaginacionMedioEstadosFlujosCajas(Boolean isPermisoPaginacionMedioEstadosFlujosCajas) {
		this.isPermisoPaginacionMedioEstadosFlujosCajas = isPermisoPaginacionMedioEstadosFlujosCajas;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadosFlujosCajas() {
		return isPermisoPaginacionTodoEstadosFlujosCajas;
	}

	public void setIsPermisoPaginacionTodoEstadosFlujosCajas(Boolean isPermisoPaginacionTodoEstadosFlujosCajas) {
		this.isPermisoPaginacionTodoEstadosFlujosCajas = isPermisoPaginacionTodoEstadosFlujosCajas;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadosFlujosCajas() {
		return isPermisoPaginacionAltoEstadosFlujosCajas;
	}

	public void setIsPermisoPaginacionAltoEstadosFlujosCajas(Boolean isPermisoPaginacionAltoEstadosFlujosCajas) {
		this.isPermisoPaginacionAltoEstadosFlujosCajas = isPermisoPaginacionAltoEstadosFlujosCajas;
	}
	
	public Boolean getIsPermisoCopiarEstadosFlujosCajas() {
		return isPermisoCopiarEstadosFlujosCajas;
	}

	public void setIsPermisoCopiarEstadosFlujosCajas(Boolean isPermisoCopiarEstadosFlujosCajas) {
		this.isPermisoCopiarEstadosFlujosCajas = isPermisoCopiarEstadosFlujosCajas;
	}
	
	public Boolean getIsPermisoVerFormEstadosFlujosCajas() {
		return isPermisoVerFormEstadosFlujosCajas;
	}

	public void setIsPermisoVerFormEstadosFlujosCajas(Boolean isPermisoVerFormEstadosFlujosCajas) {
		this.isPermisoVerFormEstadosFlujosCajas = isPermisoVerFormEstadosFlujosCajas;
	}
	
	public Boolean getIsPermisoDuplicarEstadosFlujosCajas() {
		return isPermisoDuplicarEstadosFlujosCajas;
	}

	public void setIsPermisoDuplicarEstadosFlujosCajas(Boolean isPermisoDuplicarEstadosFlujosCajas) {
		this.isPermisoDuplicarEstadosFlujosCajas = isPermisoDuplicarEstadosFlujosCajas;
	}
	
	public Boolean getIsPermisoOrdenEstadosFlujosCajas() {
		return isPermisoOrdenEstadosFlujosCajas;
	}

	public void setIsPermisoOrdenEstadosFlujosCajas(Boolean isPermisoOrdenEstadosFlujosCajas) {
		this.isPermisoOrdenEstadosFlujosCajas = isPermisoOrdenEstadosFlujosCajas;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadosFlujosCajas() {
		return isVisibilidadCeldaNuevoEstadosFlujosCajas;
	}

	public void setIsVisibilidadCeldaNuevoEstadosFlujosCajas(Boolean isVisibilidadCeldaNuevoEstadosFlujosCajas) {
		this.isVisibilidadCeldaNuevoEstadosFlujosCajas = isVisibilidadCeldaNuevoEstadosFlujosCajas;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadosFlujosCajas() {
		return isVisibilidadCeldaDuplicarEstadosFlujosCajas;
	}

	public void setIsVisibilidadCeldaDuplicarEstadosFlujosCajas(Boolean isVisibilidadCeldaDuplicarEstadosFlujosCajas) {
		this.isVisibilidadCeldaDuplicarEstadosFlujosCajas = isVisibilidadCeldaDuplicarEstadosFlujosCajas;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadosFlujosCajas() {
		return isVisibilidadCeldaCopiarEstadosFlujosCajas;
	}

	public void setIsVisibilidadCeldaCopiarEstadosFlujosCajas(Boolean isVisibilidadCeldaCopiarEstadosFlujosCajas) {
		this.isVisibilidadCeldaCopiarEstadosFlujosCajas = isVisibilidadCeldaCopiarEstadosFlujosCajas;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadosFlujosCajas() {
		return isVisibilidadCeldaVerFormEstadosFlujosCajas;
	}

	public void setIsVisibilidadCeldaVerFormEstadosFlujosCajas(Boolean isVisibilidadCeldaVerFormEstadosFlujosCajas) {
		this.isVisibilidadCeldaVerFormEstadosFlujosCajas = isVisibilidadCeldaVerFormEstadosFlujosCajas;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadosFlujosCajas() {
		return isVisibilidadCeldaOrdenEstadosFlujosCajas;
	}

	public void setIsVisibilidadCeldaOrdenEstadosFlujosCajas(Boolean isVisibilidadCeldaOrdenEstadosFlujosCajas) {
		this.isVisibilidadCeldaOrdenEstadosFlujosCajas = isVisibilidadCeldaOrdenEstadosFlujosCajas;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadosFlujosCajas() {
		return isVisibilidadCeldaNuevoRelacionesEstadosFlujosCajas;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadosFlujosCajas(Boolean isVisibilidadCeldaNuevoRelacionesEstadosFlujosCajas) {
		this.isVisibilidadCeldaNuevoRelacionesEstadosFlujosCajas = isVisibilidadCeldaNuevoRelacionesEstadosFlujosCajas;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadosFlujosCajas() {
		return isVisibilidadCeldaModificarEstadosFlujosCajas;
	}

	public void setIsVisibilidadCeldaModificarEstadosFlujosCajas(Boolean isVisibilidadCeldaModificarEstadosFlujosCajas) {
		this.isVisibilidadCeldaModificarEstadosFlujosCajas = isVisibilidadCeldaModificarEstadosFlujosCajas;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadosFlujosCajas() {
		return isVisibilidadCeldaActualizarEstadosFlujosCajas;
	}

	public void setIsVisibilidadCeldaActualizarEstadosFlujosCajas(Boolean isVisibilidadCeldaActualizarEstadosFlujosCajas) {
		this.isVisibilidadCeldaActualizarEstadosFlujosCajas = isVisibilidadCeldaActualizarEstadosFlujosCajas;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadosFlujosCajas() {
		return isVisibilidadCeldaEliminarEstadosFlujosCajas;
	}

	public void setIsVisibilidadCeldaEliminarEstadosFlujosCajas(Boolean isVisibilidadCeldaEliminarEstadosFlujosCajas) {
		this.isVisibilidadCeldaEliminarEstadosFlujosCajas = isVisibilidadCeldaEliminarEstadosFlujosCajas;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadosFlujosCajas() {
		return isVisibilidadCeldaCancelarEstadosFlujosCajas;
	}

	public void setIsVisibilidadCeldaCancelarEstadosFlujosCajas(Boolean isVisibilidadCeldaCancelarEstadosFlujosCajas) {
		this.isVisibilidadCeldaCancelarEstadosFlujosCajas = isVisibilidadCeldaCancelarEstadosFlujosCajas;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadosFlujosCajas() {
		return isVisibilidadCeldaGuardarEstadosFlujosCajas;
	}

	public void setIsVisibilidadCeldaGuardarEstadosFlujosCajas(Boolean isVisibilidadCeldaGuardarEstadosFlujosCajas) {
		this.isVisibilidadCeldaGuardarEstadosFlujosCajas = isVisibilidadCeldaGuardarEstadosFlujosCajas;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadosFlujosCajas() {
		return isVisibilidadCeldaGuardarCambiosEstadosFlujosCajas;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadosFlujosCajas(Boolean isVisibilidadCeldaGuardarCambiosEstadosFlujosCajas) {
		this.isVisibilidadCeldaGuardarCambiosEstadosFlujosCajas = isVisibilidadCeldaGuardarCambiosEstadosFlujosCajas;
	}
		
	public EstadosFlujosCajasSessionBean getestadosflujoscajasSessionBean() {
		return this.estadosflujoscajasSessionBean;
	}
	
	public void setestadosflujoscajasSessionBean(EstadosFlujosCajasSessionBean estadosflujoscajasSessionBean) {
		this.estadosflujoscajasSessionBean=estadosflujoscajasSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaEstadosFlujosCajas() {
		return this.isVisibilidadBusquedaEstadosFlujosCajas;
	}

	public void setisVisibilidadBusquedaEstadosFlujosCajas(Boolean isVisibilidadBusquedaEstadosFlujosCajas) {
		this.isVisibilidadBusquedaEstadosFlujosCajas=isVisibilidadBusquedaEstadosFlujosCajas;
	}

	public Boolean getisVisibilidadFK_IdCentroActividad() {
		return this.isVisibilidadFK_IdCentroActividad;
	}

	public void setisVisibilidadFK_IdCentroActividad(Boolean isVisibilidadFK_IdCentroActividad) {
		this.isVisibilidadFK_IdCentroActividad=isVisibilidadFK_IdCentroActividad;
	}

	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdPeriodo() {
		return this.isVisibilidadFK_IdPeriodo;
	}

	public void setisVisibilidadFK_IdPeriodo(Boolean isVisibilidadFK_IdPeriodo) {
		this.isVisibilidadFK_IdPeriodo=isVisibilidadFK_IdPeriodo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(EstadosFlujosCajas estadosflujoscajas)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(estadosflujoscajas,null);
				this.setActualParaGuardarEjercicioForeignKey(estadosflujoscajas,null);
				this.setActualParaGuardarPeriodoForeignKey(estadosflujoscajas,null);
				this.setActualParaGuardarCentroActividadForeignKey(estadosflujoscajas,null);
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
	
	public void bugActualizarReferenciaActual(EstadosFlujosCajas estadosflujoscajas,EstadosFlujosCajas estadosflujoscajasAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadosFlujosCajas(estadosflujoscajas);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadosflujoscajasAux.setId(estadosflujoscajas.getId());
		estadosflujoscajasAux.setVersionRow(estadosflujoscajas.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(EstadosFlujosCajas estadosflujoscajasLocal) throws Exception {
		
		if(this.estadosflujoscajasSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadosFlujosCajas estadosflujoscajasLocal) throws Exception {	
		if(this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				estadosflujoscajasLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				estadosflujoscajasLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				estadosflujoscajasLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CentroActividadDetalleFormJInternalFrame.class)) {
				CentroActividadBeanSwingJInternalFrame centroactividadBeanSwingJInternalFrameLocal=(CentroActividadBeanSwingJInternalFrame) ((CentroActividadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				centroactividadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCentroActividad(centroactividadBeanSwingJInternalFrameLocal.getcentroactividad(),true);
				centroactividadBeanSwingJInternalFrameLocal.actualizarLista(centroactividadBeanSwingJInternalFrameLocal.centroactividad,this.centroactividadsForeignKey);

				centroactividadBeanSwingJInternalFrameLocal.actualizarRelaciones(centroactividadBeanSwingJInternalFrameLocal.centroactividad);

				estadosflujoscajasLocal.setCentroActividad(centroactividadBeanSwingJInternalFrameLocal.centroactividad);

				this.addItemDefectoCombosForeignKeyCentroActividad();
				this.cargarCombosFrameCentroActividadsForeignKey("Formulario");
				this.setActualCentroActividadForeignKey(centroactividadBeanSwingJInternalFrameLocal.centroactividad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEstadosFlujosCajasActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadosflujoscajasValidator.getInvalidValues(this.estadosflujoscajas);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadosFlujosCajas estadosflujoscajas,List<EstadosFlujosCajas> estadosflujoscajass) throws Exception {
	}		
	
	public void actualizarSelectedLista(EstadosFlujosCajas estadosflujoscajas,List<EstadosFlujosCajas> estadosflujoscajass) throws Exception {
		try	{			
			EstadosFlujosCajasConstantesFunciones.actualizarSelectedLista(estadosflujoscajas,estadosflujoscajass);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadosFlujosCajas> estadosflujoscajassLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadosflujoscajassLocal=this.estadosflujoscajasLogic.getEstadosFlujosCajass();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadosflujoscajassLocal=this.estadosflujoscajass;
			}
			//ARCHITECTURE
		
			for(EstadosFlujosCajas estadosflujoscajasLocal:estadosflujoscajassLocal) {
				if(this.permiteMantenimiento(estadosflujoscajasLocal) && estadosflujoscajasLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadosFlujosCajasConstantesFunciones.getEstadosFlujosCajasLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadosFlujosCajasConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadosFlujosCajas.jLabelid_periodoEstadosFlujosCajas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadosFlujosCajasConstantesFunciones.NOMBRECENTROACTIVIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadosFlujosCajas.jLabelnombre_centro_actividadEstadosFlujosCajas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadosFlujosCajasConstantesFunciones.CODIGOCENTROACTIVIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadosFlujosCajas.jLabelcodigo_centro_actividadEstadosFlujosCajas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadosFlujosCajasConstantesFunciones.MENSUAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadosFlujosCajas.jLabelmensualEstadosFlujosCajas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadosFlujosCajasConstantesFunciones.ACUMULADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadosFlujosCajas.jLabelacumuladoEstadosFlujosCajas,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadosFlujosCajas.jLabelid_periodoEstadosFlujosCajas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadosFlujosCajas.jLabelnombre_centro_actividadEstadosFlujosCajas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadosFlujosCajas.jLabelcodigo_centro_actividadEstadosFlujosCajas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadosFlujosCajas.jLabelmensualEstadosFlujosCajas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadosFlujosCajas.jLabelacumuladoEstadosFlujosCajas,"");
		
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
		this.iIdNuevoEstadosFlujosCajas--;	
		
		
		this.estadosflujoscajasAux=new EstadosFlujosCajas();
		
		this.estadosflujoscajasAux.setId(this.iIdNuevoEstadosFlujosCajas);
		this.estadosflujoscajasAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadosflujoscajasLogic.getEstadosFlujosCajass().add(this.estadosflujoscajasAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadosflujoscajass.add(this.estadosflujoscajasAux);
		}
		//ARCHITECTURE
		
		this.estadosflujoscajas=this.estadosflujoscajasAux;
		
		if(EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadosFlujosCajas(this.estadosflujoscajas);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadosFlujosCajas(this.estadosflujoscajas);
		}
				
		//this.setDefaultControlesEstadosFlujosCajas();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadosFlujosCajas();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadosFlujosCajas();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadosFlujosCajas();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadosFlujosCajas(this.estadosflujoscajasBean,this.estadosflujoscajas,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(this.estadosflujoscajas);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadosFlujosCajas(this.estadosflujoscajasReturnGeneral,this.estadosflujoscajasBean,false);
		
		if(this.estadosflujoscajasReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadosFlujosCajas(this.estadosflujoscajasReturnGeneral.getEstadosFlujosCajas());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadosFlujosCajas(this.estadosflujoscajasReturnGeneral.getEstadosFlujosCajas());
		}
		
		if(this.estadosflujoscajasReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadosFlujosCajas(this.estadosflujoscajasReturnGeneral.getEstadosFlujosCajas(),classes);//this.estadosflujoscajasBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadosFlujosCajas(this.estadosflujoscajas,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadosFlujosCajas();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadosFlujosCajas();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadosFlujosCajasBeanSwingJInternalFrameAdditional.RecargarFormEstadosFlujosCajas(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadosFlujosCajas(false);
						
			if(estadosflujoscajasSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadosFlujosCajas();
			}
			
			this.actualizarVisualTableDatosEstadosFlujosCajas();
			
			this.jTableDatosEstadosFlujosCajas.setRowSelectionInterval(this.getIndiceNuevoEstadosFlujosCajas(), this.getIndiceNuevoEstadosFlujosCajas());
			
			this.seleccionarFilaTablaEstadosFlujosCajasActual();
						
			this.actualizarEstadoCeldasBotonesEstadosFlujosCajas("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadosFlujosCajas(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextAreanombre_centro_actividadEstadosFlujosCajas.setEnabled(isHabilitar && this.estadosflujoscajasConstantesFunciones.activarnombre_centro_actividadEstadosFlujosCajas);
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextFieldcodigo_centro_actividadEstadosFlujosCajas.setEnabled(isHabilitar && this.estadosflujoscajasConstantesFunciones.activarcodigo_centro_actividadEstadosFlujosCajas);
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextFieldmensualEstadosFlujosCajas.setEnabled(isHabilitar && this.estadosflujoscajasConstantesFunciones.activarmensualEstadosFlujosCajas);
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextFieldacumuladoEstadosFlujosCajas.setEnabled(isHabilitar && this.estadosflujoscajasConstantesFunciones.activaracumuladoEstadosFlujosCajas);	
		//
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_empresaEstadosFlujosCajas.setEnabled(isHabilitar && this.estadosflujoscajasConstantesFunciones.activarid_empresaEstadosFlujosCajas);//
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_ejercicioEstadosFlujosCajas.setEnabled(isHabilitar && this.estadosflujoscajasConstantesFunciones.activarid_ejercicioEstadosFlujosCajas);//
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_periodoEstadosFlujosCajas.setEnabled(isHabilitar && this.estadosflujoscajasConstantesFunciones.activarid_periodoEstadosFlujosCajas);
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_centro_actividadEstadosFlujosCajas.setEnabled(isHabilitar && this.estadosflujoscajasConstantesFunciones.activarid_centro_actividadEstadosFlujosCajas);
	};
	
	public void setDefaultControlesEstadosFlujosCajas() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadosFlujosCajas(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadosflujoscajasSessionBean.setConGuardarRelaciones(true);			
			this.estadosflujoscajasSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jTabbedPaneRelacionesEstadosFlujosCajas.setVisible(true);
			
					
		} else {
			//this.estadosflujoscajasSessionBean.setConGuardarRelaciones(false);			
			this.estadosflujoscajasSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jTabbedPaneRelacionesEstadosFlujosCajas.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEstadosFlujosCajas() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadosFlujosCajas estadosflujoscajasAux:this.estadosflujoscajasLogic.getEstadosFlujosCajass()) {
				if(estadosflujoscajasAux.getId().equals(this.iIdNuevoEstadosFlujosCajas)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadosFlujosCajas estadosflujoscajasAux:this.estadosflujoscajass) {
				if(estadosflujoscajasAux.getId().equals(this.iIdNuevoEstadosFlujosCajas)) {
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
	
	public int getIndiceActualEstadosFlujosCajas(EstadosFlujosCajas estadosflujoscajas,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadosFlujosCajas estadosflujoscajasAux:this.estadosflujoscajasLogic.getEstadosFlujosCajass()) {
				if(estadosflujoscajasAux.getId().equals(estadosflujoscajas.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadosFlujosCajas estadosflujoscajasAux:this.estadosflujoscajass) {
				if(estadosflujoscajasAux.getId().equals(estadosflujoscajas.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadosFlujosCajas(EstadosFlujosCajas estadosflujoscajasOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadosFlujosCajas estadosflujoscajasAux:this.estadosflujoscajasLogic.getEstadosFlujosCajass()) {
				if(estadosflujoscajasAux.getEstadosFlujosCajasOriginal().getId().equals(estadosflujoscajasOriginal.getId())) {
					existe=true;
					estadosflujoscajasOriginal.setId(estadosflujoscajasAux.getId());
					estadosflujoscajasOriginal.setVersionRow(estadosflujoscajasAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadosFlujosCajas estadosflujoscajasAux:this.estadosflujoscajass) {
				if(estadosflujoscajasAux.getEstadosFlujosCajasOriginal().getId().equals(estadosflujoscajasOriginal.getId())) {
					existe=true;
					estadosflujoscajasOriginal.setId(estadosflujoscajasAux.getId());
					estadosflujoscajasOriginal.setVersionRow(estadosflujoscajasAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadosFlujosCajas(Boolean esParaCancelar) throws Exception {
		estadosflujoscajassAux=new ArrayList<EstadosFlujosCajas>();
		estadosflujoscajasAux=new EstadosFlujosCajas();
		
		if(!this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadosFlujosCajas estadosflujoscajasAux:this.estadosflujoscajasLogic.getEstadosFlujosCajass()) {
					if(estadosflujoscajasAux.getId()<0) {
						estadosflujoscajassAux.add(estadosflujoscajasAux);
					}		
				}
				this.iIdNuevoEstadosFlujosCajas=0L;
				this.estadosflujoscajasLogic.getEstadosFlujosCajass().removeAll(estadosflujoscajassAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadosFlujosCajas estadosflujoscajasAux:this.estadosflujoscajass) {
					if(estadosflujoscajasAux.getId()<0) {
						estadosflujoscajassAux.add(estadosflujoscajasAux);
					}		
				}
				this.iIdNuevoEstadosFlujosCajas=0L;
				this.estadosflujoscajass.removeAll(estadosflujoscajassAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadosFlujosCajas 
					&& this.estadosflujoscajasLogic.getEstadosFlujosCajass().size()>0
					) {
					estadosflujoscajasAux=this.estadosflujoscajasLogic.getEstadosFlujosCajass().get(this.estadosflujoscajasLogic.getEstadosFlujosCajass().size() - 1);
				
					if(estadosflujoscajasAux.getId()<0) {
						this.estadosflujoscajasLogic.getEstadosFlujosCajass().remove(estadosflujoscajasAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadosFlujosCajas && this.estadosflujoscajass.size()>0) {
					estadosflujoscajasAux=this.estadosflujoscajass.get(this.estadosflujoscajass.size() - 1);
				
					if(estadosflujoscajasAux.getId()<0) {
						this.estadosflujoscajass.remove(estadosflujoscajasAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadosFlujosCajas(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadosflujoscajas.getId()<0) {
				this.estadosflujoscajasLogic.getEstadosFlujosCajass().remove(this.estadosflujoscajas);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadosflujoscajas.getId()<0) {
				this.estadosflujoscajass.remove(this.estadosflujoscajas);
			}
		}			
	}
	
	public void setEstadosInicialesEstadosFlujosCajas(List<EstadosFlujosCajas> estadosflujoscajassAux) throws Exception {
		EstadosFlujosCajasConstantesFunciones.setEstadosInicialesEstadosFlujosCajas(estadosflujoscajassAux);
	}
	
	public void setEstadosInicialesEstadosFlujosCajas(EstadosFlujosCajas estadosflujoscajasAux) throws Exception {
		EstadosFlujosCajasConstantesFunciones.setEstadosInicialesEstadosFlujosCajas(estadosflujoscajasAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadosFlujosCajasActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadosFlujosCajas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadosFlujosCajasActual()) {
				if(!this.isEsNuevoEstadosFlujosCajas) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadosFlujosCajas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadosFlujosCajas=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadosFlujosCajasActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estados Flujos Cajas ?", "MANTENIMIENTO DE Estados Flujos Cajas", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadosFlujosCajas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadosFlujosCajas estadosflujoscajas) throws Exception {
		EstadosFlujosCajasConstantesFunciones.seleccionarAsignar(this.estadosflujoscajas,estadosflujoscajas);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadosFlujosCajas=this.isPermisoActualizarOriginalEstadosFlujosCajas;
			
			
			this.seleccionarAsignar(estadosflujoscajas);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesEstadosFlujosCajas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadosflujoscajasSessionBean.setsFuncionBusquedaRapida(this.estadosflujoscajasSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadosFlujosCajas) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadosFlujosCajas(esParaCancelar);				
				this.cancelarNuevoEstadosFlujosCajas(esParaCancelar);								
			}
			
			this.estadosflujoscajas=new EstadosFlujosCajas();
			
			this.inicializarEstadosFlujosCajas();
			
			this.actualizarEstadoCeldasBotonesEstadosFlujosCajas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadosFlujosCajas() throws Exception {
		try {
			EstadosFlujosCajasConstantesFunciones.inicializarEstadosFlujosCajas(this.estadosflujoscajas);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadosflujoscajasLogic.getEstadosFlujosCajass().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadosFlujosCajass(String sAccionBusqueda,List<EstadosFlujosCajas> estadosflujoscajassParaReportes) throws Exception {
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
					sPathReporteFinal="EstadosFlujosCajas"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadosFlujosCajasMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadosFlujosCajasMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadosFlujosCajas"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estados Flujos Cajases");		
		parameters.put("busquedapor", EstadosFlujosCajasConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadosFlujosCajas=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadosFlujosCajasConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadosFlujosCajasConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadosFlujosCajas=new JRBeanArrayDataSource(EstadosFlujosCajasJInternalFrame.TraerEstadosFlujosCajasBeans(estadosflujoscajassParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadosFlujosCajas);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadosFlujosCajasConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadosFlujosCajasConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadosFlujosCajasBean.TraerEstadosFlujosCajasBeans(estadosflujoscajassParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadosFlujosCajass(sAccionBusqueda,sTipoArchivoReporte,estadosflujoscajassParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadosFlujosCajass(sAccionBusqueda,sTipoArchivoReporte,estadosflujoscajassParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadosFlujosCajasActionPerformed(null);
					//this.generarExcelReporteEstadosFlujosCajass(sAccionBusqueda,sTipoArchivoReporte,estadosflujoscajassParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadosFlujosCajass(sAccionBusqueda,sTipoArchivoReporte,estadosflujoscajassParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadosFlujosCajass(sAccionBusqueda,sTipoArchivoReporte,estadosflujoscajassParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadosFlujosCajass(sAccionBusqueda,sTipoArchivoReporte,estadosflujoscajassParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadosFlujosCajass(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadosFlujosCajas> estadosflujoscajassParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadosflujoscajas";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadosFlujosCajass");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadosFlujosCajas("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadosFlujosCajas estadosflujoscajas : estadosflujoscajassParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadosFlujosCajasConstantesFunciones.generarExcelReporteDataEstadosFlujosCajas("NORMAL",row,workbook,estadosflujoscajas,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estados Flujos Cajas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadosFlujosCajas(String sTipo,Row row,Workbook workbook) {
		
		EstadosFlujosCajasConstantesFunciones.generarExcelReporteHeaderEstadosFlujosCajas(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadosFlujosCajass(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadosFlujosCajas> estadosflujoscajassParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadosflujoscajas_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadosFlujosCajass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadosFlujosCajas estadosflujoscajas : estadosflujoscajassParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadosFlujosCajasConstantesFunciones.getEstadosFlujosCajasDescripcion(estadosflujoscajas));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadosFlujosCajasConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadosFlujosCajasConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadosflujoscajas.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadosFlujosCajasConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadosFlujosCajasConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadosflujoscajas.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadosFlujosCajasConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadosFlujosCajasConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadosflujoscajas.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadosFlujosCajasConstantesFunciones.LABEL_IDCENTROACTIVIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadosFlujosCajasConstantesFunciones.LABEL_IDCENTROACTIVIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadosflujoscajas.getcentroactividad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadosFlujosCajasConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadosFlujosCajasConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadosflujoscajas.getnombre_centro_actividad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadosFlujosCajasConstantesFunciones.LABEL_CODIGOCENTROACTIVIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadosFlujosCajasConstantesFunciones.LABEL_CODIGOCENTROACTIVIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadosflujoscajas.getcodigo_centro_actividad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadosFlujosCajasConstantesFunciones.LABEL_MENSUAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadosFlujosCajasConstantesFunciones.LABEL_MENSUAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadosflujoscajas.getmensual());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadosFlujosCajasConstantesFunciones.LABEL_ACUMULADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadosFlujosCajasConstantesFunciones.LABEL_ACUMULADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadosflujoscajas.getacumulado());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estados Flujos Cajas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadosFlujosCajass(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadosFlujosCajas> estadosflujoscajassParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadosFlujosCajas> estadosflujoscajassRespaldo=null;
		
		classes=EstadosFlujosCajasConstantesFunciones.getClassesRelationshipsOfEstadosFlujosCajas(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadosflujoscajasLogic.setDatosCliente(this.datosCliente);
		this.estadosflujoscajasLogic.setDatosDeep(this.datosDeep);
		this.estadosflujoscajasLogic.setIsConDeep(true);
		
		estadosflujoscajassRespaldo=this.estadosflujoscajasLogic.getEstadosFlujosCajass();
		
		this.estadosflujoscajasLogic.setEstadosFlujosCajass(estadosflujoscajassParaReportes);	
		this.estadosflujoscajasLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadosflujoscajassParaReportes=this.estadosflujoscajasLogic.getEstadosFlujosCajass();
		this.estadosflujoscajasLogic.setEstadosFlujosCajass(estadosflujoscajassRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadosflujoscajas_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadosFlujosCajass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadosFlujosCajas("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadosFlujosCajas estadosflujoscajas : estadosflujoscajassParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadosFlujosCajas("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadosFlujosCajasConstantesFunciones.generarExcelReporteDataEstadosFlujosCajas("NORMAL",row,workbook,estadosflujoscajas,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EstadosFlujosCajasConstantesFunciones.getEstadosFlujosCajasDescripcion(estadosflujoscajas));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estados Flujos Cajas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadosFlujosCajas() throws Exception {		
		this.startProcessEstadosFlujosCajas(true);
	}
	
	public void startProcessEstadosFlujosCajas(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEstadosFlujosCajas ,this.jPanelParametrosReportesEstadosFlujosCajas, this.jScrollPanelDatosEstadosFlujosCajas,this.jPanelPaginacionEstadosFlujosCajas, this.jScrollPanelDatosEdicionEstadosFlujosCajas, this.jPanelAccionesEstadosFlujosCajas,this.jPanelAccionesFormularioEstadosFlujosCajas,this.jmenuBarEstadosFlujosCajas,this.jmenuBarDetalleEstadosFlujosCajas,this.jTtoolBarEstadosFlujosCajas,this.jTtoolBarDetalleEstadosFlujosCajas);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadosFlujosCajas=this.jTabbedPaneBusquedasEstadosFlujosCajas; 
		
		final JPanel jPanelParametrosReportesEstadosFlujosCajas=this.jPanelParametrosReportesEstadosFlujosCajas;
		//final JScrollPane jScrollPanelDatosEstadosFlujosCajas=this.jScrollPanelDatosEstadosFlujosCajas;
		final JTable jTableDatosEstadosFlujosCajas=this.jTableDatosEstadosFlujosCajas;		
		final JPanel jPanelPaginacionEstadosFlujosCajas=this.jPanelPaginacionEstadosFlujosCajas;
		//final JScrollPane jScrollPanelDatosEdicionEstadosFlujosCajas=this.jScrollPanelDatosEdicionEstadosFlujosCajas;
		final JPanel jPanelAccionesEstadosFlujosCajas=this.jPanelAccionesEstadosFlujosCajas;
		
		JPanel jPanelCamposAuxiliarEstadosFlujosCajas=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadosFlujosCajas=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
			jPanelCamposAuxiliarEstadosFlujosCajas=this.jInternalFrameDetalleFormEstadosFlujosCajas.jPanelCamposEstadosFlujosCajas;
			jPanelAccionesFormularioAuxiliarEstadosFlujosCajas=this.jInternalFrameDetalleFormEstadosFlujosCajas.jPanelAccionesFormularioEstadosFlujosCajas;
		}
		
		final JPanel jPanelCamposEstadosFlujosCajas=jPanelCamposAuxiliarEstadosFlujosCajas;
		final JPanel jPanelAccionesFormularioEstadosFlujosCajas=jPanelAccionesFormularioAuxiliarEstadosFlujosCajas;
		
		
		final JMenuBar jmenuBarEstadosFlujosCajas=this.jmenuBarEstadosFlujosCajas;
		final JToolBar jTtoolBarEstadosFlujosCajas=this.jTtoolBarEstadosFlujosCajas;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadosFlujosCajas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadosFlujosCajas=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
			jmenuBarDetalleAuxiliarEstadosFlujosCajas=this.jInternalFrameDetalleFormEstadosFlujosCajas.jmenuBarDetalleEstadosFlujosCajas;
			jTtoolBarDetalleAuxiliarEstadosFlujosCajas=this.jInternalFrameDetalleFormEstadosFlujosCajas.jTtoolBarDetalleEstadosFlujosCajas;
		}
		
		final JMenuBar jmenuBarDetalleEstadosFlujosCajas=jmenuBarDetalleAuxiliarEstadosFlujosCajas;
		final JToolBar jTtoolBarDetalleEstadosFlujosCajas=jTtoolBarDetalleAuxiliarEstadosFlujosCajas;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadosFlujosCajas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadosFlujosCajas;
			processRunnable.jTableDatos=jTableDatosEstadosFlujosCajas;
			processRunnable.jPanelCampos=jPanelCamposEstadosFlujosCajas;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadosFlujosCajas;
			processRunnable.jPanelAcciones=jPanelAccionesEstadosFlujosCajas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadosFlujosCajas;
			
			
			processRunnable.jmenuBar=jmenuBarEstadosFlujosCajas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadosFlujosCajas;
			processRunnable.jTtoolBar=jTtoolBarEstadosFlujosCajas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadosFlujosCajas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadosFlujosCajas ,jPanelParametrosReportesEstadosFlujosCajas,jTableDatosEstadosFlujosCajas, /*jScrollPanelDatosEstadosFlujosCajas,*/jPanelCamposEstadosFlujosCajas,jPanelPaginacionEstadosFlujosCajas, /*jScrollPanelDatosEdicionEstadosFlujosCajas,*/ jPanelAccionesEstadosFlujosCajas,jPanelAccionesFormularioEstadosFlujosCajas,jmenuBarEstadosFlujosCajas,jmenuBarDetalleEstadosFlujosCajas,jTtoolBarEstadosFlujosCajas,jTtoolBarDetalleEstadosFlujosCajas);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadosFlujosCajas ,jPanelParametrosReportesEstadosFlujosCajas, jScrollPanelDatosEstadosFlujosCajas,jPanelPaginacionEstadosFlujosCajas, jScrollPanelDatosEdicionEstadosFlujosCajas, jPanelAccionesEstadosFlujosCajas,jPanelAccionesFormularioEstadosFlujosCajas,jmenuBarEstadosFlujosCajas,jmenuBarDetalleEstadosFlujosCajas,jTtoolBarEstadosFlujosCajas,jTtoolBarDetalleEstadosFlujosCajas);
						
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
	
	public void finishProcessEstadosFlujosCajas() {// throws Exception 
		this.finishProcessEstadosFlujosCajas(true);
	}
	
	public void finishProcessEstadosFlujosCajas(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEstadosFlujosCajas ,this.jPanelParametrosReportesEstadosFlujosCajas, this.jScrollPanelDatosEstadosFlujosCajas,this.jPanelPaginacionEstadosFlujosCajas, this.jScrollPanelDatosEdicionEstadosFlujosCajas, this.jPanelAccionesEstadosFlujosCajas,this.jPanelAccionesFormularioEstadosFlujosCajas,this.jmenuBarEstadosFlujosCajas,this.jmenuBarDetalleEstadosFlujosCajas,this.jTtoolBarEstadosFlujosCajas,this.jTtoolBarDetalleEstadosFlujosCajas);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadosFlujosCajas=this.jTabbedPaneBusquedasEstadosFlujosCajas; 
		
		final JPanel jPanelParametrosReportesEstadosFlujosCajas=this.jPanelParametrosReportesEstadosFlujosCajas;
		//final JScrollPane jScrollPanelDatosEstadosFlujosCajas=this.jScrollPanelDatosEstadosFlujosCajas;
		final JTable jTableDatosEstadosFlujosCajas=this.jTableDatosEstadosFlujosCajas;		
		final JPanel jPanelPaginacionEstadosFlujosCajas=this.jPanelPaginacionEstadosFlujosCajas;
		//final JScrollPane jScrollPanelDatosEdicionEstadosFlujosCajas=this.jScrollPanelDatosEdicionEstadosFlujosCajas;
		final JPanel jPanelAccionesEstadosFlujosCajas=this.jPanelAccionesEstadosFlujosCajas;
		
		JPanel jPanelCamposAuxiliarEstadosFlujosCajas=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadosFlujosCajas=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
			jPanelCamposAuxiliarEstadosFlujosCajas=this.jInternalFrameDetalleFormEstadosFlujosCajas.jPanelCamposEstadosFlujosCajas;
			jPanelAccionesFormularioAuxiliarEstadosFlujosCajas=this.jInternalFrameDetalleFormEstadosFlujosCajas.jPanelAccionesFormularioEstadosFlujosCajas;
		}
		
		final JPanel jPanelCamposEstadosFlujosCajas=jPanelCamposAuxiliarEstadosFlujosCajas;
		final JPanel jPanelAccionesFormularioEstadosFlujosCajas=jPanelAccionesFormularioAuxiliarEstadosFlujosCajas;
		
		
		final JMenuBar jmenuBarEstadosFlujosCajas=this.jmenuBarEstadosFlujosCajas;		
		final JToolBar jTtoolBarEstadosFlujosCajas=this.jTtoolBarEstadosFlujosCajas;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadosFlujosCajas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadosFlujosCajas=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
			jmenuBarDetalleAuxiliarEstadosFlujosCajas=this.jInternalFrameDetalleFormEstadosFlujosCajas.jmenuBarDetalleEstadosFlujosCajas;
			jTtoolBarDetalleAuxiliarEstadosFlujosCajas=this.jInternalFrameDetalleFormEstadosFlujosCajas.jTtoolBarDetalleEstadosFlujosCajas;		
		}
		
		final JMenuBar jmenuBarDetalleEstadosFlujosCajas=jmenuBarDetalleAuxiliarEstadosFlujosCajas;
		final JToolBar jTtoolBarDetalleEstadosFlujosCajas=jTtoolBarDetalleAuxiliarEstadosFlujosCajas;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadosFlujosCajas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadosFlujosCajas;
			processRunnable.jTableDatos=jTableDatosEstadosFlujosCajas;
			processRunnable.jPanelCampos=jPanelCamposEstadosFlujosCajas;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadosFlujosCajas;
			processRunnable.jPanelAcciones=jPanelAccionesEstadosFlujosCajas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadosFlujosCajas;
			
			
			processRunnable.jmenuBar=jmenuBarEstadosFlujosCajas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadosFlujosCajas;
			processRunnable.jTtoolBar=jTtoolBarEstadosFlujosCajas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadosFlujosCajas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadosFlujosCajas ,jPanelParametrosReportesEstadosFlujosCajas, jTableDatosEstadosFlujosCajas,/*jScrollPanelDatosEstadosFlujosCajas,*/jPanelCamposEstadosFlujosCajas,jPanelPaginacionEstadosFlujosCajas, /*jScrollPanelDatosEdicionEstadosFlujosCajas,*/ jPanelAccionesEstadosFlujosCajas,jPanelAccionesFormularioEstadosFlujosCajas,jmenuBarEstadosFlujosCajas,jmenuBarDetalleEstadosFlujosCajas,jTtoolBarEstadosFlujosCajas,jTtoolBarDetalleEstadosFlujosCajas));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadosFlujosCajas(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadosFlujosCajas(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadosFlujosCajas(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadosFlujosCajas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadosFlujosCajas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadosFlujosCajas,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadosFlujosCajas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadosFlujosCajas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadosFlujosCajas,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadosflujoscajasConstantesFunciones.getsFinalQueryEstadosFlujosCajas();
		String  finalQueryPaginacionTodos=this.estadosflujoscajasConstantesFunciones.getsFinalQueryEstadosFlujosCajas();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadosFlujosCajasConstantesFunciones.getArrayColumnasGlobalesNoEstadosFlujosCajas(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadosFlujosCajasConstantesFunciones.getArrayColumnasGlobalesEstadosFlujosCajas(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadosFlujosCajasConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadosflujoscajassEliminados= new ArrayList<EstadosFlujosCajas>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadosFlujosCajas();
		
				///*EstadosFlujosCajasSessionBean*/this.estadosflujoscajasSessionBean=new EstadosFlujosCajasSessionBean();
			
			if(this.estadosflujoscajasSessionBean==null) {
				this.estadosflujoscajasSessionBean=new EstadosFlujosCajasSessionBean();
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
					this.iNumeroPaginacion=EstadosFlujosCajasConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadosFlujosCajasConstantesFunciones.getClassesForeignKeysOfEstadosFlujosCajas(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadosflujoscajas."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadosflujoscajassAux= new ArrayList<EstadosFlujosCajas>();
			
				
			estadosflujoscajasLogic.setDatosCliente(this.datosCliente);
			estadosflujoscajasLogic.setDatosDeep(this.datosDeep);
			estadosflujoscajasLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaEstadosFlujosCajas")) {
				this.sDetalleReporte=EstadosFlujosCajasConstantesFunciones.getDetalleIndiceBusquedaEstadosFlujosCajas(id_ejercicioBusquedaEstadosFlujosCajas,id_periodoBusquedaEstadosFlujosCajas,id_centro_actividadBusquedaEstadosFlujosCajas);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					estadosflujoscajasLogic.getEstadosFlujosCajassBusquedaEstadosFlujosCajas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaEstadosFlujosCajas,id_periodoBusquedaEstadosFlujosCajas,id_centro_actividadBusquedaEstadosFlujosCajas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EstadosFlujosCajasConstantesFunciones.getDetalleIndiceBusquedaEstadosFlujosCajas(id_ejercicioBusquedaEstadosFlujosCajas,id_periodoBusquedaEstadosFlujosCajas,id_centro_actividadBusquedaEstadosFlujosCajas);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EstadosFlujosCajasConstantesFunciones.getDetalleIndiceBusquedaEstadosFlujosCajas(id_ejercicioBusquedaEstadosFlujosCajas,id_periodoBusquedaEstadosFlujosCajas,id_centro_actividadBusquedaEstadosFlujosCajas);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=estadosflujoscajasLogic.getEstadosFlujosCajass()==null||estadosflujoscajasLogic.getEstadosFlujosCajass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=estadosflujoscajass==null|| estadosflujoscajass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						estadosflujoscajassAux=new ArrayList<EstadosFlujosCajas>();
						estadosflujoscajassAux.addAll(estadosflujoscajasLogic.getEstadosFlujosCajass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadosflujoscajassAux=new ArrayList<EstadosFlujosCajas>();
							estadosflujoscajassAux.addAll(estadosflujoscajass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							estadosflujoscajasLogic.getEstadosFlujosCajassBusquedaEstadosFlujosCajas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaEstadosFlujosCajas,id_periodoBusquedaEstadosFlujosCajas,id_centro_actividadBusquedaEstadosFlujosCajas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EstadosFlujosCajasConstantesFunciones.getDetalleIndiceBusquedaEstadosFlujosCajas(id_ejercicioBusquedaEstadosFlujosCajas,id_periodoBusquedaEstadosFlujosCajas,id_centro_actividadBusquedaEstadosFlujosCajas);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EstadosFlujosCajasConstantesFunciones.getDetalleIndiceBusquedaEstadosFlujosCajas(id_ejercicioBusquedaEstadosFlujosCajas,id_periodoBusquedaEstadosFlujosCajas,id_centro_actividadBusquedaEstadosFlujosCajas);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEstadosFlujosCajass("BusquedaEstadosFlujosCajas",estadosflujoscajasLogic.getEstadosFlujosCajass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEstadosFlujosCajass("BusquedaEstadosFlujosCajas",estadosflujoscajass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						estadosflujoscajasLogic.setEstadosFlujosCajass(new ArrayList<EstadosFlujosCajas>());
						estadosflujoscajasLogic.getEstadosFlujosCajass().addAll(estadosflujoscajassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadosflujoscajass=new ArrayList<EstadosFlujosCajas>();
							estadosflujoscajass.addAll(estadosflujoscajassAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadosFlujosCajas();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadosFlujosCajas();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadosflujoscajasLogic.getEstadosFlujosCajass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadosflujoscajass.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadosflujoscajasLogic.getEstadosFlujosCajass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadosflujoscajass.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadosFlujosCajas estadosflujoscajas) {
		Boolean permite=true;
		
		if(this.estadosflujoscajas.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadosFlujosCajasConstantesFunciones.getOrderByListaEstadosFlujosCajas();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadosFlujosCajasConstantesFunciones.getOrderByListaEstadosFlujosCajas();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadosFlujosCajas estadosflujoscajas:estadosflujoscajasLogic.getEstadosFlujosCajass()) {
				if(estadosflujoscajas.getsType().equals(Constantes2.S_TOTALES)) {
					estadosflujoscajasTotales=estadosflujoscajas;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadosFlujosCajas estadosflujoscajas:this.estadosflujoscajass) {
				if(estadosflujoscajas.getsType().equals(Constantes2.S_TOTALES)) {
					estadosflujoscajasTotales=estadosflujoscajas;
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
			this.estadosflujoscajasAux=new EstadosFlujosCajas();
			this.estadosflujoscajasAux.setsType(Constantes2.S_TOTALES);
			this.estadosflujoscajasAux.setIsNew(false);
			this.estadosflujoscajasAux.setIsChanged(false);
			this.estadosflujoscajasAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//EstadosFlujosCajasConstantesFunciones.TotalizarValoresFilaEstadosFlujosCajas(this.estadosflujoscajasLogic.getEstadosFlujosCajass(),this.estadosflujoscajasAux);
				
				//this.estadosflujoscajasLogic.getEstadosFlujosCajass().add(this.estadosflujoscajasAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadosFlujosCajasConstantesFunciones.TotalizarValoresFilaEstadosFlujosCajas(this.estadosflujoscajass,this.estadosflujoscajasAux);
				
				this.estadosflujoscajass.add(this.estadosflujoscajasAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadosflujoscajasTotales=new EstadosFlujosCajas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadosflujoscajasLogic.getEstadosFlujosCajass().remove(estadosflujoscajasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadosflujoscajass.remove(estadosflujoscajasTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadosflujoscajasTotales=new EstadosFlujosCajas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadosFlujosCajas estadosflujoscajas:estadosflujoscajasLogic.getEstadosFlujosCajass()) {
				if(estadosflujoscajas.getsType().equals(Constantes2.S_TOTALES)) {
					estadosflujoscajasTotales=estadosflujoscajas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadosFlujosCajasConstantesFunciones.TotalizarValoresFilaEstadosFlujosCajas(this.estadosflujoscajasLogic.getEstadosFlujosCajass(),estadosflujoscajasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadosFlujosCajas estadosflujoscajas:this.estadosflujoscajass) {
				if(estadosflujoscajas.getsType().equals(Constantes2.S_TOTALES)) {
					estadosflujoscajasTotales=estadosflujoscajas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadosFlujosCajasConstantesFunciones.TotalizarValoresFilaEstadosFlujosCajas(this.estadosflujoscajass,estadosflujoscajasTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEstadosFlujosCajassBusquedaEstadosFlujosCajas()throws Exception {
		try {
			sAccionBusqueda="BusquedaEstadosFlujosCajas";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEstadosFlujosCajassFK_IdCentroActividad()throws Exception {
		try {
			sAccionBusqueda="FK_IdCentroActividad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEstadosFlujosCajassFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEstadosFlujosCajassFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEstadosFlujosCajassFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEstadosFlujosCajassBusquedaEstadosFlujosCajas(String sFinalQuery,Long id_ejercicio,Long id_periodo,Long id_centro_actividad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadosflujoscajasLogic.getEstadosFlujosCajassBusquedaEstadosFlujosCajas(sFinalQuery,this.pagination,id_ejercicio,id_periodo,id_centro_actividad);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEstadosFlujosCajassFK_IdCentroActividad(String sFinalQuery,Long id_centro_actividad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadosflujoscajasLogic.getEstadosFlujosCajassFK_IdCentroActividad(sFinalQuery,this.pagination,id_centro_actividad);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEstadosFlujosCajassFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadosflujoscajasLogic.getEstadosFlujosCajassFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEstadosFlujosCajassFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadosflujoscajasLogic.getEstadosFlujosCajassFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEstadosFlujosCajassFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadosflujoscajasLogic.getEstadosFlujosCajassFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
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
	
	public void inicializarPermisosEstadosFlujosCajas() {
		this.isPermisoTodoEstadosFlujosCajas=false;
		this.isPermisoNuevoEstadosFlujosCajas=false;
		this.isPermisoActualizarEstadosFlujosCajas=false;
		this.isPermisoActualizarOriginalEstadosFlujosCajas=false;
		this.isPermisoEliminarEstadosFlujosCajas=false;
		this.isPermisoGuardarCambiosEstadosFlujosCajas=false;
		this.isPermisoConsultaEstadosFlujosCajas=true;
		this.isPermisoBusquedaEstadosFlujosCajas=true;
		this.isPermisoReporteEstadosFlujosCajas=true;
		this.isPermisoOrdenEstadosFlujosCajas=false;		
		this.isPermisoPaginacionMedioEstadosFlujosCajas=false;		
		this.isPermisoPaginacionAltoEstadosFlujosCajas=false;		
		this.isPermisoPaginacionTodoEstadosFlujosCajas=false;		
		this.isPermisoCopiarEstadosFlujosCajas=false;		
		this.isPermisoVerFormEstadosFlujosCajas=false;		
		this.isPermisoDuplicarEstadosFlujosCajas=false;
		this.isPermisoOrdenEstadosFlujosCajas=false;
	}
	
	public void setPermisosUsuarioEstadosFlujosCajas(Boolean isPermiso) {
		this.isPermisoTodoEstadosFlujosCajas=isPermiso;
		this.isPermisoNuevoEstadosFlujosCajas=isPermiso;
		this.isPermisoActualizarEstadosFlujosCajas=isPermiso;
		this.isPermisoActualizarOriginalEstadosFlujosCajas=isPermiso;
		this.isPermisoEliminarEstadosFlujosCajas=isPermiso;
		this.isPermisoGuardarCambiosEstadosFlujosCajas=isPermiso;
		this.isPermisoConsultaEstadosFlujosCajas=isPermiso;
		this.isPermisoBusquedaEstadosFlujosCajas=isPermiso;
		this.isPermisoReporteEstadosFlujosCajas=isPermiso;
		this.isPermisoOrdenEstadosFlujosCajas=isPermiso;		
		this.isPermisoPaginacionMedioEstadosFlujosCajas=isPermiso;		
		this.isPermisoPaginacionAltoEstadosFlujosCajas=isPermiso;		
		this.isPermisoPaginacionTodoEstadosFlujosCajas=isPermiso;		
		this.isPermisoCopiarEstadosFlujosCajas=isPermiso;		
		this.isPermisoVerFormEstadosFlujosCajas=isPermiso;		
		this.isPermisoDuplicarEstadosFlujosCajas=isPermiso;
		this.isPermisoOrdenEstadosFlujosCajas=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadosFlujosCajas(Boolean isPermiso) {
		//this.isPermisoTodoEstadosFlujosCajas=isPermiso;
		this.isPermisoNuevoEstadosFlujosCajas=isPermiso;
		this.isPermisoActualizarEstadosFlujosCajas=isPermiso;
		this.isPermisoActualizarOriginalEstadosFlujosCajas=isPermiso;
		this.isPermisoEliminarEstadosFlujosCajas=isPermiso;
		this.isPermisoGuardarCambiosEstadosFlujosCajas=isPermiso;
		//this.isPermisoConsultaEstadosFlujosCajas=isPermiso;
		//this.isPermisoBusquedaEstadosFlujosCajas=isPermiso;
		//this.isPermisoReporteEstadosFlujosCajas=isPermiso;
		//this.isPermisoOrdenEstadosFlujosCajas=isPermiso;		
		//this.isPermisoPaginacionMedioEstadosFlujosCajas=isPermiso;		
		//this.isPermisoPaginacionAltoEstadosFlujosCajas=isPermiso;		
		//this.isPermisoPaginacionTodoEstadosFlujosCajas=isPermiso;		
		//this.isPermisoCopiarEstadosFlujosCajas=isPermiso;		
		//this.isPermisoDuplicarEstadosFlujosCajas=isPermiso;
		//this.isPermisoOrdenEstadosFlujosCajas=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadosFlujosCajasClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EstadosFlujosCajasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadosFlujosCajas(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadosFlujosCajasClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEstadosFlujosCajasClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadosFlujosCajasClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadosFlujosCajasClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEstadosFlujosCajas() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadosFlujosCajasJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadosFlujosCajasConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadosFlujosCajas=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadosFlujosCajas=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadosFlujosCajas=this.isPermisoActualizarEstadosFlujosCajas;
			this.isPermisoEliminarEstadosFlujosCajas=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadosFlujosCajas=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadosFlujosCajas=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadosFlujosCajas=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadosFlujosCajas=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadosFlujosCajas=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadosFlujosCajas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadosFlujosCajas=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadosFlujosCajas=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadosFlujosCajas=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadosFlujosCajas=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadosFlujosCajas=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadosFlujosCajas=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadosFlujosCajas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadosFlujosCajas.setToolTipText(this.jTableDatosEstadosFlujosCajas.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadosFlujosCajas(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadosFlujosCajas(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadosFlujosCajasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadosFlujosCajasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadosFlujosCajas() throws Exception {
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
	public void inicializarCombosForeignKeyEstadosFlujosCajasListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.centroactividadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadosFlujosCajasListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadosFlujosCajasJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCentroActividadListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEjercicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EjercicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPeriodoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PeriodoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCentroActividadListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.centroactividadsForeignKey==null||this.centroactividadsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CentroActividadConstantesFunciones.getArrayColumnasGlobalesCentroActividad(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CentroActividadConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CentroActividadConstantesFunciones.SFINALQUERY;

				this.cargarCombosCentroActividadsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyEstadosFlujosCajas()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyCentroActividad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.estadosflujoscajasSessionBean==null) {
				this.estadosflujoscajasSessionBean=new EstadosFlujosCajasSessionBean();
			}

			if(!this.estadosflujoscajasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.estadosflujoscajasSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				Ejercicio ejercicio=new Ejercicio();
				EjercicioConstantesFunciones.setEjercicioDescripcion(ejercicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				ejercicio.setId(null);

				if(!EjercicioConstantesFunciones.ExisteEnLista(this.ejerciciosForeignKey,ejercicio,true)) {

					this.ejerciciosForeignKey.add(0,ejercicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPeriodo()throws Exception {
		try {

			if(!this.estadosflujoscajasSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				Periodo periodo=new Periodo();
				PeriodoConstantesFunciones.setPeriodoDescripcion(periodo,Constantes.SMENSAJE_ESCOJA_OPCION);
				periodo.setId(null);

				if(!PeriodoConstantesFunciones.ExisteEnLista(this.periodosForeignKey,periodo,true)) {

					this.periodosForeignKey.add(0,periodo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCentroActividad()throws Exception {
		try {

			if(!this.estadosflujoscajasSessionBean.getisBusquedaDesdeForeignKeySesionCentroActividad()) {
				CentroActividad centroactividad=new CentroActividad();
				CentroActividadConstantesFunciones.setCentroActividadDescripcion(centroactividad,Constantes.SMENSAJE_ESCOJA_OPCION);
				centroactividad.setId(null);

				if(!CentroActividadConstantesFunciones.ExisteEnLista(this.centroactividadsForeignKey,centroactividad,true)) {

					this.centroactividadsForeignKey.add(0,centroactividad);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyEstadosFlujosCajas()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadosFlujosCajas(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadosFlujosCajas()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadosFlujosCajas();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadosFlujosCajas(EstadosFlujosCajas estadosflujoscajas)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadosFlujosCajas(EstadosFlujosCajas estadosflujoscajas,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadosFlujosCajas()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadosFlujosCajas()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_ejercicioEstadosFlujosCajas.getSelectedItem();
				}

				if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_periodoEstadosFlujosCajas.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadosFlujosCajas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadosFlujosCajas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadosFlujosCajas()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadosFlujosCajas()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameCentroActividadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadosFlujosCajas(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCentroActividadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadosFlujosCajas()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_empresaEstadosFlujosCajas!=null && this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_empresaEstadosFlujosCajas.getItemCount()>0) {
				this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_empresaEstadosFlujosCajas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_ejercicioEstadosFlujosCajas!=null && this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_ejercicioEstadosFlujosCajas.getItemCount()>0) {
				this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_ejercicioEstadosFlujosCajas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_periodoEstadosFlujosCajas!=null && this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_periodoEstadosFlujosCajas.getItemCount()>0) {
				this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_periodoEstadosFlujosCajas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_centro_actividadEstadosFlujosCajas!=null && this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_centro_actividadEstadosFlujosCajas.getItemCount()>0) {
				this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_centro_actividadEstadosFlujosCajas.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public EstadosFlujosCajasBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadosFlujosCajasBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadosFlujosCajasBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadosflujoscajasSessionBean=new EstadosFlujosCajasSessionBean(); 
		this.estadosflujoscajasConstantesFunciones=new EstadosFlujosCajasConstantesFunciones(); 
		this.estadosflujoscajasBean=new EstadosFlujosCajas();//(this.estadosflujoscajasConstantesFunciones); 		
		this.estadosflujoscajasReturnGeneral=new EstadosFlujosCajasParameterReturnGeneral(); 
		
		this.estadosflujoscajasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadosflujoscajasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadosFlujosCajasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadosFlujosCajasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadosFlujosCajasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadosFlujosCajas(true);
			
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
			
			this.estadosflujoscajasConstantesFunciones=new EstadosFlujosCajasConstantesFunciones(); 
			this.estadosflujoscajasBean=new EstadosFlujosCajas();//this.estadosflujoscajasConstantesFunciones); 			
			this.estadosflujoscajasReturnGeneral=new EstadosFlujosCajasParameterReturnGeneral(); 
		
			EstadosFlujosCajasBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estados Flujos Cajas Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.estadosflujoscajas=new EstadosFlujosCajas();
			this.estadosflujoscajass = new ArrayList<EstadosFlujosCajas>();
			this.estadosflujoscajassAux = new ArrayList<EstadosFlujosCajas>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic=new EstadosFlujosCajasLogic();
				this.estadosflujoscajasLogic.getNewConnexionToDeep("");
			}
			
			//this.estadosflujoscajasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadosflujoscajasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadosFlujosCajas);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadosFlujosCajas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadosFlujosCajas);	
					}
					
					if(this.jInternalFrameImportacionEstadosFlujosCajas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadosFlujosCajas);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadosFlujosCajas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadosFlujosCajas);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadosFlujosCajas);
				this.jInternalFrameDetalleFormEstadosFlujosCajas.setVisible(false);
				this.jInternalFrameDetalleFormEstadosFlujosCajas.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadosFlujosCajas!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadosFlujosCajas);
					this.jInternalFrameReporteDinamicoEstadosFlujosCajas.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadosFlujosCajas.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadosFlujosCajas!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadosFlujosCajas);
					this.jInternalFrameImportacionEstadosFlujosCajas.setVisible(false);
					this.jInternalFrameImportacionEstadosFlujosCajas.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadosFlujosCajas!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadosFlujosCajas);
					this.jInternalFrameOrderByEstadosFlujosCajas.setVisible(false);
					this.jInternalFrameOrderByEstadosFlujosCajas.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadosFlujosCajasActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadosFlujosCajasConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadosflujoscajasReturnGeneral=new EstadosFlujosCajasParameterReturnGeneral();
			
			this.estadosflujoscajasParameterGeneral=new EstadosFlujosCajasParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadosflujoscajasLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadosFlujosCajasJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadosFlujosCajasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadosflujoscajasSessionBean.getEsGuardarRelacionado(),this.estadosflujoscajasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadosFlujosCajasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadosflujoscajasSessionBean.getEsGuardarRelacionado(),this.estadosflujoscajasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadosFlujosCajas=false;
			this.isVisibilidadCeldaDuplicarEstadosFlujosCajas=true;
			this.isVisibilidadCeldaCopiarEstadosFlujosCajas=true;
			this.isVisibilidadCeldaVerFormEstadosFlujosCajas=true;
			this.isVisibilidadCeldaOrdenEstadosFlujosCajas=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadosFlujosCajas=false;
			this.isVisibilidadCeldaModificarEstadosFlujosCajas=false;
			this.isVisibilidadCeldaActualizarEstadosFlujosCajas=false;
			this.isVisibilidadCeldaEliminarEstadosFlujosCajas=false;
			this.isVisibilidadCeldaCancelarEstadosFlujosCajas=false;
			this.isVisibilidadCeldaGuardarEstadosFlujosCajas=false;
			this.isVisibilidadCeldaGuardarCambiosEstadosFlujosCajas=false;
			
			
			this.isVisibilidadBusquedaEstadosFlujosCajas=true;
			this.isVisibilidadFK_IdCentroActividad=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPeriodo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadosFlujosCajas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadosFlujosCajas();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadosFlujosCajas(false);
			
			this.setPermisosUsuarioEstadosFlujosCajas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadosflujoscajasSessionBean.getEsGuardarRelacionado() 
				|| (this.estadosflujoscajasSessionBean.getEsGuardarRelacionado() && this.estadosflujoscajasSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadosFlujosCajasClasesRelacionadas();
			}
			
			if(this.estadosflujoscajasSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadosFlujosCajasClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadosFlujosCajas();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadosFlujosCajas();
			}
			
			if(!this.isPermisoBusquedaEstadosFlujosCajas) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEstadosFlujosCajas.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadosFlujosCajasConstantesFunciones.getTiposSeleccionarEstadosFlujosCajas());
				
				this.tiposColumnasSelect=EstadosFlujosCajasConstantesFunciones.getTiposSeleccionarEstadosFlujosCajas(true);
				
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
			//if(!this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadosFlujosCajas();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioEstadosFlujosCajas(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioEstadosFlujosCajas(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadosFlujosCajas() ;
			
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
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			this.centroactividadLogic=new CentroActividadLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				estadosflujoscajasImplementable= (EstadosFlujosCajasImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadosFlujosCajasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadosflujoscajasImplementableHome= (EstadosFlujosCajasImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadosFlujosCajasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadosflujoscajass= new ArrayList<EstadosFlujosCajas>();
			this.estadosflujoscajassEliminados= new ArrayList<EstadosFlujosCajas>();
						
			this.isEsNuevoEstadosFlujosCajas=false;
			this.esParaAccionDesdeFormularioEstadosFlujosCajas=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.centroactividadsForeignKey=new ArrayList<CentroActividad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadosFlujosCajas(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadosFlujosCajas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadosFlujosCajasBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadosFlujosCajasConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadosFlujosCajas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadosFlujosCajas(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadosFlujosCajas();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadosFlujosCajas();
			}
			
			EstadosFlujosCajasBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEstadosFlujosCajas.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEstadosFlujosCajas.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEstadosFlujosCajas.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadosFlujosCajas(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadosFlujosCajas: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadosFlujosCajas() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadosFlujosCajas")) {
				iIndex=this.jInternalFrameDetalleFormEstadosFlujosCajas.jTabbedPaneRelacionesEstadosFlujosCajas.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadosFlujosCajas.jTabbedPaneRelacionesEstadosFlujosCajas.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadosFlujosCajas();	
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
	
	public void cargarCombosForeignKeyEstadosFlujosCajas(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadosFlujosCajas(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadosFlujosCajas(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadosFlujosCajasListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadosFlujosCajas();
		
		this.cargarCombosFrameForeignKeyEstadosFlujosCajas();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadosFlujosCajas();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadosFlujosCajas();
		}
	}
	
	

	public void cargarCombosForeignKeyCentroActividad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCentroActividadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCentroActividad();
				this.cargarCombosFrameCentroActividadsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCentroActividad(this.centroactividadsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoEstadosFlujosCajasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadosflujoscajasSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadosFlujosCajas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
			
			
			if(jTableDatosEstadosFlujosCajas.getRowCount()>=1) {
				jTableDatosEstadosFlujosCajas.removeRowSelectionInterval(0, jTableDatosEstadosFlujosCajas.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadosFlujosCajas=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadosFlujosCajas(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadosFlujosCajas(true);			
			//this.estadosflujoscajas=new EstadosFlujosCajas();
			//this.estadosflujoscajas.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadosFlujosCajas(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadosFlujosCajas() ;
			
			if(EstadosFlujosCajasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadosFlujosCajas(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadosflujoscajas);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadosflujoscajas);				
			
			EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
			
			if(this.estadosflujoscajasSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadosFlujosCajas: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadosFlujosCajasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadosFlujosCajas> estadosflujoscajassSeleccionados=new ArrayList<EstadosFlujosCajas>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadosFlujosCajas.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadosFlujosCajas.getSelectedRows().length;			
			}
			
			estadosflujoscajassSeleccionados=this.getEstadosFlujosCajassSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadosFlujosCajas--;			
				//EstadosFlujosCajas estadosflujoscajasAux= new EstadosFlujosCajas();			
				//estadosflujoscajasAux.setId(this.iIdNuevoEstadosFlujosCajas);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadosFlujosCajas estadosflujoscajasOrigen=new EstadosFlujosCajas();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadosFlujosCajas estadosflujoscajasOrigen : estadosflujoscajassSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadosflujoscajasOrigen =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadosflujoscajasOrigen =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadosFlujosCajas();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadosflujoscajas.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadosFlujosCajas(estadosflujoscajasOrigen,this.estadosflujoscajas,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(this.estadosflujoscajas);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadosflujoscajasLogic.getEstadosFlujosCajass().add(this.estadosflujoscajasAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadosflujoscajass.add(this.estadosflujoscajasAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadosFlujosCajas(false);
				
				this.jTableDatosEstadosFlujosCajas.setRowSelectionInterval(this.getIndiceNuevoEstadosFlujosCajas(), this.getIndiceNuevoEstadosFlujosCajas());
				
				int iLastRow =  this.jTableDatosEstadosFlujosCajas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadosFlujosCajas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadosFlujosCajas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadosFlujosCajas(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadosFlujosCajasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadosFlujosCajas> estadosflujoscajassSeleccionados=new ArrayList<EstadosFlujosCajas>();									
		
			EstadosFlujosCajas estadosflujoscajasOrigen=new EstadosFlujosCajas();
			EstadosFlujosCajas estadosflujoscajasDestino=new EstadosFlujosCajas();
				
			estadosflujoscajassSeleccionados=this.getEstadosFlujosCajassSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadosFlujosCajas.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadosflujoscajassSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadosFlujosCajas.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadosflujoscajasOrigen =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadosflujoscajasOrigen =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadosflujoscajasDestino =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadosflujoscajasDestino =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadosflujoscajasOrigen =estadosflujoscajassSeleccionados.get(0);
				estadosflujoscajasDestino =estadosflujoscajassSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadosFlujosCajas(estadosflujoscajasOrigen,estadosflujoscajasDestino,true,false);
				
				estadosflujoscajasDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadosflujoscajasDestino,estadosflujoscajasLogic.getEstadosFlujosCajass());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadosflujoscajasDestino,estadosflujoscajass);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadosFlujosCajas(false);
				
				//this.jTableDatosEstadosFlujosCajas.setRowSelectionInterval(this.getIndiceNuevoEstadosFlujosCajas(), this.getIndiceNuevoEstadosFlujosCajas());
				
				int iLastRow =  this.jTableDatosEstadosFlujosCajas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadosFlujosCajas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadosFlujosCajas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadosFlujosCajas(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadosFlujosCajasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadosFlujosCajas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadosFlujosCajas.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadosFlujosCajasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadosFlujosCajas.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEstadosFlujosCajas.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEstadosFlujosCajas.setVisible(!isVisible);
			this.jPanelPaginacionEstadosFlujosCajas.setVisible(!isVisible);
			this.jPanelAccionesEstadosFlujosCajas.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadosFlujosCajasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadosFlujosCajas();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadosFlujosCajasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadosFlujosCajas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadosFlujosCajasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadosFlujosCajas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadosFlujosCajasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadosFlujosCajas();
			
			this.abrirFrameOrderByEstadosFlujosCajas();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadosFlujosCajasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadosFlujosCajas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadosFlujosCajas(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadosFlujosCajas);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadosFlujosCajas.isMaximum()) {
					this.jInternalFrameDetalleFormEstadosFlujosCajas.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadosFlujosCajas.setSize(this.jInternalFrameDetalleFormEstadosFlujosCajas.iWidthFormulario,this.jInternalFrameDetalleFormEstadosFlujosCajas.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadosFlujosCajas.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadosFlujosCajas.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadosFlujosCajas.isMaximum()) {
						this.jInternalFrameDetalleFormEstadosFlujosCajas.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadosFlujosCajas.jContentPaneDetalleEstadosFlujosCajas.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadosFlujosCajas.jTabbedPaneRelacionesEstadosFlujosCajas.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadosFlujosCajas.jContentPaneDetalleEstadosFlujosCajas.getWidth(),EstadosFlujosCajasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadosFlujosCajas.jTabbedPaneRelacionesEstadosFlujosCajas.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadosFlujosCajas.jContentPaneDetalleEstadosFlujosCajas.getWidth(),EstadosFlujosCajasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadosFlujosCajas.jTabbedPaneRelacionesEstadosFlujosCajas.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadosFlujosCajas.jContentPaneDetalleEstadosFlujosCajas.getWidth(),EstadosFlujosCajasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadosFlujosCajas.setVisible(true);
	        this.jInternalFrameDetalleFormEstadosFlujosCajas.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadosFlujosCajas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadosFlujosCajas==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadosFlujosCajas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadosFlujosCajas,false,this);
				} else {
					this.jInternalFrameOrderByEstadosFlujosCajas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadosFlujosCajas,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadosFlujosCajas);
				this.jInternalFrameOrderByEstadosFlujosCajas.setVisible(false);
				this.jInternalFrameOrderByEstadosFlujosCajas.setSelected(false);
				
				this.jInternalFrameOrderByEstadosFlujosCajas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadosFlujosCajas"));
				
				this.inicializarActualizarBindingTablaOrderByEstadosFlujosCajas();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadosFlujosCajas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadosFlujosCajas==null) {
				
				this.jInternalFrameImportacionEstadosFlujosCajas=new ImportacionJInternalFrame(EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadosFlujosCajas);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadosFlujosCajas);
				this.jInternalFrameImportacionEstadosFlujosCajas.setVisible(false);
				this.jInternalFrameImportacionEstadosFlujosCajas.setSelected(false);


				this.jInternalFrameImportacionEstadosFlujosCajas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadosFlujosCajas"));
				this.jInternalFrameImportacionEstadosFlujosCajas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadosFlujosCajas"));
				this.jInternalFrameImportacionEstadosFlujosCajas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadosFlujosCajas"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadosFlujosCajas() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadosFlujosCajas==null) {
				this.jInternalFrameReporteDinamicoEstadosFlujosCajas=new ReporteDinamicoJInternalFrame(EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadosFlujosCajas);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadosFlujosCajas);
				this.jInternalFrameReporteDinamicoEstadosFlujosCajas.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadosFlujosCajas.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadosFlujosCajas"));
				this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadosFlujosCajas"));
				this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadosFlujosCajas"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadosFlujosCajas();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEstadosFlujosCajas() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadosFlujosCajas);
			
	       	this.jInternalFrameDetalleFormEstadosFlujosCajas.setVisible(false);
	        this.jInternalFrameDetalleFormEstadosFlujosCajas.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadosFlujosCajas.dispose();
			//this.jInternalFrameDetalleFormEstadosFlujosCajas=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadosFlujosCajas() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadosFlujosCajas.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadosFlujosCajas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadosFlujosCajas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadosFlujosCajas.setVisible(true);
	        this.jInternalFrameImportacionEstadosFlujosCajas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadosFlujosCajas() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadosFlujosCajas.setVisible(true);
	        this.jInternalFrameOrderByEstadosFlujosCajas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadosFlujosCajas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadosFlujosCajas.setVisible(false);
	        this.jInternalFrameOrderByEstadosFlujosCajas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadosFlujosCajas() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadosFlujosCajas.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadosFlujosCajas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadosFlujosCajas() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadosFlujosCajas.setVisible(false);
	        this.jInternalFrameImportacionEstadosFlujosCajas.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadosFlujosCajasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadosFlujosCajas(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadosFlujosCajas(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadosFlujosCajas(true);
			//this.isEsNuevoEstadosFlujosCajas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadosFlujosCajas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadosFlujosCajas(false) ;
			
			if(estadosflujoscajasSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EstadosFlujosCajasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadosFlujosCajas(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadosFlujosCajas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadosFlujosCajasActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadosFlujosCajas(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadosFlujosCajas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadosFlujosCajas(true);
			//this.isEsNuevoEstadosFlujosCajas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadosflujoscajas.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadosFlujosCajas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadosFlujosCajas(false) ;
			
			if(EstadosFlujosCajasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadosFlujosCajas(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadosFlujosCajas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	public void recargarComboTablaCentroActividad(List<CentroActividad> centroactividadsForeignKey)throws Exception{
		TableColumn tableColumnCentroActividad=this.jTableDatosEstadosFlujosCajas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadosFlujosCajas,EstadosFlujosCajasConstantesFunciones.LABEL_IDCENTROACTIVIDAD));
		TableCellEditor tableCellEditorCentroActividad =tableColumnCentroActividad.getCellEditor();

		CentroActividadTableCell centroactividadTableCellFk=(CentroActividadTableCell)tableCellEditorCentroActividad;

		if(centroactividadTableCellFk!=null) {
			centroactividadTableCellFk.setcentroactividadsForeignKey(centroactividadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEstadosFlujosCajas.getSelectedRow();

		//if(intSelectedRow<=0) {
			//centroactividadTableCellFk.setRowActual(intSelectedRow);
			//centroactividadTableCellFk.setcentroactividadsForeignKeyActual(centroactividadsForeignKey);
		//}


		if(centroactividadTableCellFk!=null) {
			centroactividadTableCellFk.RecargarCentroActividadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarEstadosFlujosCajasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadosFlujosCajas(false);
			
			//if(!this.isEsNuevoEstadosFlujosCajas) {								
				int intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadosFlujosCajas(this.estadosflujoscajas,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(this.estadosflujoscajas);
				
			}
			
			if(this.permiteMantenimiento(this.estadosflujoscajas)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadosFlujosCajas=true;
					this.inicializarActualizarBindingTablaEstadosFlujosCajas(false);
					this.isEsNuevoEstadosFlujosCajas=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadosFlujosCajas=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadosFlujosCajas=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadosFlujosCajas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadosFlujosCajas(false);
				
				this.habilitarDeshabilitarControlesEstadosFlujosCajas(false);
			
												
				
				if(EstadosFlujosCajasJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadosFlujosCajas();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadosFlujosCajasActionPerformed(evt,estadosflujoscajasSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadosFlujosCajas(this.estadosflujoscajas,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadosFlujosCajas.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadosflujoscajasSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadosflujoscajas.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadosFlujosCajas.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadosFlujosCajas.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadosFlujosCajasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
				this.estadosflujoscajas.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
				this.estadosflujoscajas.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadosflujoscajas)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadosFlujosCajasModel) this.jTableDatosEstadosFlujosCajas.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadosFlujosCajas=true;
				this.inicializarActualizarBindingTablaEstadosFlujosCajas(false);
				this.isEsNuevoEstadosFlujosCajas=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadosFlujosCajas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadosFlujosCajas(false);
				
				this.habilitarDeshabilitarControlesEstadosFlujosCajas(false);
				
				
				
				if(EstadosFlujosCajasJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadosFlujosCajas();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadosFlujosCajasActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadosFlujosCajas.getRowCount()>=1) {
				jTableDatosEstadosFlujosCajas.removeRowSelectionInterval(0, jTableDatosEstadosFlujosCajas.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadosFlujosCajas(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadosFlujosCajas(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadosFlujosCajas(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadosFlujosCajas(false) ;
			
			this.isEsNuevoEstadosFlujosCajas=false;
			
			if(EstadosFlujosCajasJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadosFlujosCajas();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadosFlujosCajasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadosFlujosCajas(false);
				
				//SI ES MANUAL
				if(EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadosFlujosCajas();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadosFlujosCajasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadosFlujosCajas--;			
			//EstadosFlujosCajas estadosflujoscajasAux= new EstadosFlujosCajas();			
			//estadosflujoscajasAux.setId(this.iIdNuevoEstadosFlujosCajas);
			
			if(this.jInternalFrameDetalleFormEstadosFlujosCajas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadosFlujosCajas();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(this.estadosflujoscajas);
			
			this.estadosflujoscajas.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadosflujoscajasLogic.getEstadosFlujosCajass().add(this.estadosflujoscajasAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadosflujoscajass.add(this.estadosflujoscajasAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadosFlujosCajas(false);
			
			this.jTableDatosEstadosFlujosCajas.setRowSelectionInterval(this.getIndiceNuevoEstadosFlujosCajas(), this.getIndiceNuevoEstadosFlujosCajas());
			
			int iLastRow =  this.jTableDatosEstadosFlujosCajas.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadosFlujosCajas.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadosFlujosCajas.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadosFlujosCajas(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadosFlujosCajasActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadosFlujosCajas(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadosFlujosCajas(false);
			
			//SI ES MANUAL
			if(EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadosFlujosCajas();
			}
			
			//this.abrirFrameTreeEstadosFlujosCajas();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadosFlujosCajasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadosFlujosCajasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadosFlujosCajas.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadosFlujosCajas.setFileImportacion(this.jInternalFrameImportacionEstadosFlujosCajas.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadosFlujosCajas.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadosFlujosCajas.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadosFlujosCajas.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadosFlujosCajas.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadosFlujosCajasActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadosFlujosCajas> estadosflujoscajassSeleccionados=new ArrayList<EstadosFlujosCajas>();		

		estadosflujoscajassSeleccionados=this.getEstadosFlujosCajassSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadosFlujosCajasBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadosFlujosCajasBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadosFlujosCajass("Todos",estadosflujoscajassSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estados Flujos Cajas",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadosFlujosCajasConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadosFlujosCajasConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCentroActividad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCentroActividad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCentroActividad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCentroActividad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadosFlujosCajasConstantesFunciones.LABEL_CODIGOCENTROACTIVIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoCentroActividad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoCentroActividad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoCentroActividad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoCentroActividad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadosFlujosCajasConstantesFunciones.LABEL_MENSUAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nsual_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nsual_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nsual_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nsual_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadosFlujosCajasConstantesFunciones.LABEL_ACUMULADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_umulado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_umulado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_umulado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_umulado_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadosFlujosCajasConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case EstadosFlujosCajasConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD:
					sNombreCampoCategoria="nombre_centro_actividad";
					break;

				case EstadosFlujosCajasConstantesFunciones.LABEL_CODIGOCENTROACTIVIDAD:
					sNombreCampoCategoria="codigo_centro_actividad";
					break;

				case EstadosFlujosCajasConstantesFunciones.LABEL_MENSUAL:
					sNombreCampoCategoria="mensual";
					break;

				case EstadosFlujosCajasConstantesFunciones.LABEL_ACUMULADO:
					sNombreCampoCategoria="acumulado";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadosFlujosCajasConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case EstadosFlujosCajasConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD:
					sNombreCampoCategoriaValor="nombre_centro_actividad";
					break;

				case EstadosFlujosCajasConstantesFunciones.LABEL_CODIGOCENTROACTIVIDAD:
					sNombreCampoCategoriaValor="codigo_centro_actividad";
					break;

				case EstadosFlujosCajasConstantesFunciones.LABEL_MENSUAL:
					sNombreCampoCategoriaValor="mensual";
					break;

				case EstadosFlujosCajasConstantesFunciones.LABEL_ACUMULADO:
					sNombreCampoCategoriaValor="acumulado";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadosFlujosCajasConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case EstadosFlujosCajasConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Centro Activad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_centro_actividad");
					break;

				case EstadosFlujosCajasConstantesFunciones.LABEL_CODIGOCENTROACTIVIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Centro Activad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_centro_actividad");
					break;

				case EstadosFlujosCajasConstantesFunciones.LABEL_MENSUAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mensual",sNombreCampoCategoria,sNombreCampoCategoriaValor,"mensual");
					break;

				case EstadosFlujosCajasConstantesFunciones.LABEL_ACUMULADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Acumulado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"acumulado");
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadosFlujosCajasActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadosFlujosCajas> estadosflujoscajassSeleccionados=new ArrayList<EstadosFlujosCajas>();		
		
		estadosflujoscajassSeleccionados=this.getEstadosFlujosCajassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadosflujoscajas";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadosFlujosCajass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadosFlujosCajasConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadosFlujosCajasConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(EstadosFlujosCajas estadosflujoscajas:estadosflujoscajassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadosflujoscajas.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadosFlujosCajasConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadosFlujosCajasConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(EstadosFlujosCajas estadosflujoscajas:estadosflujoscajassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadosflujoscajas.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadosFlujosCajasConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadosFlujosCajasConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(EstadosFlujosCajas estadosflujoscajas:estadosflujoscajassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadosflujoscajas.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadosFlujosCajasConstantesFunciones.LABEL_IDCENTROACTIVIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadosFlujosCajasConstantesFunciones.LABEL_IDCENTROACTIVIDAD);
					iRow++;

					for(EstadosFlujosCajas estadosflujoscajas:estadosflujoscajassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadosflujoscajas.getcentroactividad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadosFlujosCajasConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadosFlujosCajasConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD);
					iRow++;

					for(EstadosFlujosCajas estadosflujoscajas:estadosflujoscajassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadosflujoscajas.getnombre_centro_actividad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadosFlujosCajasConstantesFunciones.LABEL_CODIGOCENTROACTIVIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadosFlujosCajasConstantesFunciones.LABEL_CODIGOCENTROACTIVIDAD);
					iRow++;

					for(EstadosFlujosCajas estadosflujoscajas:estadosflujoscajassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadosflujoscajas.getcodigo_centro_actividad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadosFlujosCajasConstantesFunciones.LABEL_MENSUAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadosFlujosCajasConstantesFunciones.LABEL_MENSUAL);
					iRow++;

					for(EstadosFlujosCajas estadosflujoscajas:estadosflujoscajassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadosflujoscajas.getmensual());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadosFlujosCajasConstantesFunciones.LABEL_ACUMULADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadosFlujosCajasConstantesFunciones.LABEL_ACUMULADO);
					iRow++;

					for(EstadosFlujosCajas estadosflujoscajas:estadosflujoscajassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadosflujoscajas.getacumulado());
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
			//	this.getFilaCabeceraExportarExcelEstadosFlujosCajas(row);				
			//	iRow++;
			//}				
			
			//for(EstadosFlujosCajas estadosflujoscajasAux:estadosflujoscajassSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadosFlujosCajas(estadosflujoscajasAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estados Flujos Cajas",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadosflujoscajasLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadosFlujosCajas(false);
			
			//SI ES MANUAL
			if(EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadosFlujosCajas();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadosFlujosCajasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadosFlujosCajas(false);
			
			//SI ES MANUAL
			if(EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadosFlujosCajas();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadosFlujosCajasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadosFlujosCajas(false);
			
			//SI ES MANUAL
			if(EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadosFlujosCajas();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadosFlujosCajas() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadosFlujosCajas.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadosFlujosCajas.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadosFlujosCajas.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadosFlujosCajas.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadosFlujosCajas.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadosFlujosCajas.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadosFlujosCajas.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadosFlujosCajas(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadosFlujosCajas(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadosFlujosCajas(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadosFlujosCajas(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadosFlujosCajas(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadosFlujosCajas(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadosFlujosCajas(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadosFlujosCajas(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadosFlujosCajas() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadosFlujosCajas();
		
		this.inicializarActualizarBindingBotonesManualEstadosFlujosCajas(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadosFlujosCajas();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadosFlujosCajas() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadosFlujosCajas(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadosFlujosCajas(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadosFlujosCajas.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadosFlujosCajas.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadosFlujosCajas.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadosFlujosCajas.jCheckBoxPostAccionNuevoEstadosFlujosCajas.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadosFlujosCajas.jCheckBoxPostAccionSinCerrarEstadosFlujosCajas.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadosFlujosCajas.jCheckBoxPostAccionSinMensajeEstadosFlujosCajas.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadosFlujosCajas.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadosFlujosCajas.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadosFlujosCajas.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
				this.jInternalFrameDetalleFormEstadosFlujosCajas.jCheckBoxPostAccionNuevoEstadosFlujosCajas.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadosFlujosCajas.jCheckBoxPostAccionSinCerrarEstadosFlujosCajas.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadosFlujosCajas.jCheckBoxPostAccionSinMensajeEstadosFlujosCajas.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadosFlujosCajas.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadosFlujosCajas.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxTiposAccionesFormularioEstadosFlujosCajas.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadosFlujosCajas.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadosFlujosCajas!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadosFlujosCajas.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadosFlujosCajas.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadosFlujosCajas.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadosFlujosCajas.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadosFlujosCajas!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadosFlujosCajas.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadosFlujosCajas.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadosFlujosCajas(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadosFlujosCajas(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadosFlujosCajas() throws Exception {
		try	{
			if(EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadosFlujosCajas();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadosFlujosCajas() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxTiposAccionesFormularioEstadosFlujosCajas.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxTiposAccionesFormularioEstadosFlujosCajas.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadosFlujosCajas() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadosFlujosCajas.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadosFlujosCajas.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadosFlujosCajas.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadosFlujosCajas.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadosFlujosCajas.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadosFlujosCajas.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadosFlujosCajas.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadosFlujosCajas.addItem(reporte);
			}
			
			
			if(!this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadosFlujosCajas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadosFlujosCajas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadosFlujosCajas.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadosFlujosCajas.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadosFlujosCajas.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadosFlujosCajas.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxTiposAccionesFormularioEstadosFlujosCajas.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxTiposAccionesFormularioEstadosFlujosCajas.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadosFlujosCajas.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadosFlujosCajas.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadosFlujosCajas.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadosFlujosCajas();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadosFlujosCajas() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadosFlujosCajas!=null) {
				this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadosFlujosCajas!=null) {
				this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadosFlujosCajas!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=EstadosFlujosCajasConstantesFunciones.getTiposSeleccionarEstadosFlujosCajas(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=EstadosFlujosCajasConstantesFunciones.getTiposSeleccionarEstadosFlujosCajas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=EstadosFlujosCajasConstantesFunciones.getTiposSeleccionarEstadosFlujosCajas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadosFlujosCajas()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas.getSelectedItem()!=null){this.id_ejercicioBusquedaEstadosFlujosCajas=((Ejercicio)this.jComboBoxid_ejercicioBusquedaEstadosFlujosCajasEstadosFlujosCajas.getSelectedItem()).getId();}
		if(this.jComboBoxid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas.getSelectedItem()!=null){this.id_periodoBusquedaEstadosFlujosCajas=((Periodo)this.jComboBoxid_periodoBusquedaEstadosFlujosCajasEstadosFlujosCajas.getSelectedItem()).getId();}
		if(this.jComboBoxid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas.getSelectedItem()!=null){this.id_centro_actividadBusquedaEstadosFlujosCajas=((CentroActividad)this.jComboBoxid_centro_actividadBusquedaEstadosFlujosCajasEstadosFlujosCajas.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadosFlujosCajas(Boolean esInicializar) throws Exception {				
		if(EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadosFlujosCajas();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadosFlujosCajas() throws Exception {
		this.inicializarActualizarBindingTablaEstadosFlujosCajas(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadosFlujosCajas() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadosFlujosCajas.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadosFlujosCajas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadosFlujosCajas.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadosFlujosCajasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadosFlujosCajas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadosFlujosCajas.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadosFlujosCajasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadosFlujosCajasOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadosFlujosCajasOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadosFlujosCajasPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadosFlujosCajas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadosFlujosCajas.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadosFlujosCajasPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadosFlujosCajas.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadosFlujosCajas(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadosflujoscajasLogic.getEstadosFlujosCajass().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadosflujoscajass.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadosFlujosCajas.setModel(new EstadosFlujosCajasModel(this.estadosflujoscajasLogic.getEstadosFlujosCajass(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadosFlujosCajas.setModel(new EstadosFlujosCajasModel(this.estadosflujoscajass,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadosFlujosCajas!=null && this.jInternalFrameOrderByEstadosFlujosCajas.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadosFlujosCajas();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadosFlujosCajas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadosFlujosCajas,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadosFlujosCajasPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO,estadosflujoscajasConstantesFunciones.resaltarSeleccionarEstadosFlujosCajas,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO,estadosflujoscajasConstantesFunciones.resaltarSeleccionarEstadosFlujosCajas,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadosFlujosCajas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadosFlujosCajas,EstadosFlujosCajasConstantesFunciones.LABEL_ID));

		if(this.estadosflujoscajasConstantesFunciones.mostraridEstadosFlujosCajas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadosFlujosCajasConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadosflujoscajasConstantesFunciones.resaltaridEstadosFlujosCajas,this.estadosflujoscajasConstantesFunciones.activaridEstadosFlujosCajas,iSizeTabla,this,true,"idEstadosFlujosCajas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadosflujoscajasConstantesFunciones.resaltaridEstadosFlujosCajas,this.estadosflujoscajasConstantesFunciones.activaridEstadosFlujosCajas,this,true,"idEstadosFlujosCajas","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadosFlujosCajas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadosFlujosCajas,EstadosFlujosCajasConstantesFunciones.LABEL_IDPERIODO));

		if(this.estadosflujoscajasConstantesFunciones.mostrarid_periodoEstadosFlujosCajas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadosFlujosCajasConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.estadosflujoscajasConstantesFunciones.resaltarid_periodoEstadosFlujosCajas,this,this.estadosflujoscajasConstantesFunciones.activarid_periodoEstadosFlujosCajas,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.estadosflujoscajasConstantesFunciones.resaltarid_periodoEstadosFlujosCajas,this,this.estadosflujoscajasConstantesFunciones.activarid_periodoEstadosFlujosCajas,false,"id_periodoEstadosFlujosCajas","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadosFlujosCajasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadosFlujosCajas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadosFlujosCajas,EstadosFlujosCajasConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD));

		if(this.estadosflujoscajasConstantesFunciones.mostrarnombre_centro_actividadEstadosFlujosCajas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadosFlujosCajasConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadosflujoscajasConstantesFunciones.resaltarnombre_centro_actividadEstadosFlujosCajas,this.estadosflujoscajasConstantesFunciones.activarnombre_centro_actividadEstadosFlujosCajas,iSizeTabla,this,true,"nombre_centro_actividadEstadosFlujosCajas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadosflujoscajasConstantesFunciones.resaltarnombre_centro_actividadEstadosFlujosCajas,this.estadosflujoscajasConstantesFunciones.activarnombre_centro_actividadEstadosFlujosCajas,this,true,"nombre_centro_actividadEstadosFlujosCajas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadosFlujosCajasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadosFlujosCajas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadosFlujosCajas,EstadosFlujosCajasConstantesFunciones.LABEL_CODIGOCENTROACTIVIDAD));

		if(this.estadosflujoscajasConstantesFunciones.mostrarcodigo_centro_actividadEstadosFlujosCajas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadosFlujosCajasConstantesFunciones.LABEL_CODIGOCENTROACTIVIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadosflujoscajasConstantesFunciones.resaltarcodigo_centro_actividadEstadosFlujosCajas,this.estadosflujoscajasConstantesFunciones.activarcodigo_centro_actividadEstadosFlujosCajas,iSizeTabla,this,true,"codigo_centro_actividadEstadosFlujosCajas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadosflujoscajasConstantesFunciones.resaltarcodigo_centro_actividadEstadosFlujosCajas,this.estadosflujoscajasConstantesFunciones.activarcodigo_centro_actividadEstadosFlujosCajas,this,true,"codigo_centro_actividadEstadosFlujosCajas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadosFlujosCajasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadosFlujosCajas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadosFlujosCajas,EstadosFlujosCajasConstantesFunciones.LABEL_MENSUAL));

		if(this.estadosflujoscajasConstantesFunciones.mostrarmensualEstadosFlujosCajas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadosFlujosCajasConstantesFunciones.LABEL_MENSUAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadosflujoscajasConstantesFunciones.resaltarmensualEstadosFlujosCajas,this.estadosflujoscajasConstantesFunciones.activarmensualEstadosFlujosCajas,iSizeTabla,this,true,"mensualEstadosFlujosCajas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadosflujoscajasConstantesFunciones.resaltarmensualEstadosFlujosCajas,this.estadosflujoscajasConstantesFunciones.activarmensualEstadosFlujosCajas,this,true,"mensualEstadosFlujosCajas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EstadosFlujosCajasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadosFlujosCajas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadosFlujosCajas,EstadosFlujosCajasConstantesFunciones.LABEL_ACUMULADO));

		if(this.estadosflujoscajasConstantesFunciones.mostraracumuladoEstadosFlujosCajas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadosFlujosCajasConstantesFunciones.LABEL_ACUMULADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadosflujoscajasConstantesFunciones.resaltaracumuladoEstadosFlujosCajas,this.estadosflujoscajasConstantesFunciones.activaracumuladoEstadosFlujosCajas,iSizeTabla,this,true,"acumuladoEstadosFlujosCajas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadosflujoscajasConstantesFunciones.resaltaracumuladoEstadosFlujosCajas,this.estadosflujoscajasConstantesFunciones.activaracumuladoEstadosFlujosCajas,this,true,"acumuladoEstadosFlujosCajas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EstadosFlujosCajasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadosflujoscajasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadosflujoscajasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadosFlujosCajas.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadosflujoscajasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadosflujoscajasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadosFlujosCajas.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadosFlujosCajas && this.isPermisoGuardarCambiosEstadosFlujosCajas) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadosflujoscajasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadosflujoscajasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadosFlujosCajas.addColumn(tableColumn);
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
			
			this.jTableDatosEstadosFlujosCajas.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadosFlujosCajas && this.isPermisoGuardarCambiosEstadosFlujosCajas) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadosFlujosCajas && this.isPermisoGuardarCambiosEstadosFlujosCajas) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadosFlujosCajas.moveColumn(this.jTableDatosEstadosFlujosCajas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadosFlujosCajas.moveColumn(this.jTableDatosEstadosFlujosCajas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadosFlujosCajas.moveColumn(this.jTableDatosEstadosFlujosCajas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadosFlujosCajas.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadosFlujosCajas.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadosFlujosCajas,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadosFlujosCajas.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadosFlujosCajas.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadosFlujosCajas.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadosFlujosCajas.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadosFlujosCajas.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=estadosflujoscajasLogic.getEstadosFlujosCajass().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadosflujoscajass.size()-1;
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
		//this.jTableDatosEstadosFlujosCajas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadosFlujosCajas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadosFlujosCajas();
			
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
				
				//this.isEsNuevoEstadosFlujosCajas=false;
					
				EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
			
				if(this.estadosflujoscajasSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadosFlujosCajas==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadosFlujosCajas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadosFlujosCajas.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadosflujoscajas.getsType().equals("DUPLICADO")
				   || this.estadosflujoscajas.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadosFlujosCajas=true;
				
				} else {
					this.isEsNuevoEstadosFlujosCajas=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {
					if(this.estadosflujoscajas.getId()>=0 && !this.estadosflujoscajas.getIsNew()) {						
						this.isEsNuevoEstadosFlujosCajas=false;
						
					} else {
						this.isEsNuevoEstadosFlujosCajas=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadosFlujosCajas(esRelaciones);						
				
				this.seleccionarEstadosFlujosCajas(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadosflujoscajas.getId()<0) {
					this.isEsNuevoEstadosFlujosCajas=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadosFlujosCajas(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadosFlujosCajas(evt,rowIndex);
				}	
				
				if(this.estadosflujoscajasSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadosFlujosCajas: " + this.dDif); 
					}
				}								
				
				EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadosFlujosCajas(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadosflujoscajas)) {
					if(this.estadosflujoscajas.getId()>0) {
						this.estadosflujoscajas.setIsDeleted(true);
						
						this.estadosflujoscajassEliminados.add(this.estadosflujoscajas);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadosflujoscajasLogic.getEstadosFlujosCajass().remove(this.estadosflujoscajas);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadosflujoscajass.remove(this.estadosflujoscajas);				
					}
					
					
					((EstadosFlujosCajasModel) this.jTableDatosEstadosFlujosCajas.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadosFlujosCajas(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadosFlujosCajas(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadosFlujosCajas) {
			
			if(this.jInternalFrameDetalleFormEstadosFlujosCajas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadosFlujosCajas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadosFlujosCajas.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadosFlujosCajas(this.estadosflujoscajas);
				}
				
				//ARCHITECTURE
				try {
					

					//Periodo
					if(!this.estadosflujoscajasConstantesFunciones.cargarid_periodoEstadosFlujosCajas || this.estadosflujoscajasConstantesFunciones.event_dependid_periodoEstadosFlujosCajas) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.estadosflujoscajas.getid_periodo());
									//this.inicializarActualizarBindingEstadosFlujosCajas(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(estadosflujoscajas.getPeriodo()!=null) {
							this.periodosForeignKey.add(estadosflujoscajas.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.estadosflujoscajas.getid_periodo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadosFlujosCajas("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadosFlujosCajas(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadosFlujosCajas() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadosFlujosCajas(EstadosFlujosCajas estadosflujoscajas) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadosFlujosCajas(estadosflujoscajas,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadosFlujosCajas(EstadosFlujosCajas estadosflujoscajas,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadosFlujosCajas(estadosflujoscajas);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadosFlujosCajas(estadosflujoscajas,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadosFlujosCajas(estadosflujoscajas);
	}
	
	public void setVariablesObjetoActualToFormularioEstadosFlujosCajas(EstadosFlujosCajas estadosflujoscajas) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadosFlujosCajas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jLabelidEstadosFlujosCajas.setText(estadosflujoscajas.getId().toString());
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextAreanombre_centro_actividadEstadosFlujosCajas.setText(estadosflujoscajas.getnombre_centro_actividad());
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextFieldcodigo_centro_actividadEstadosFlujosCajas.setText(estadosflujoscajas.getcodigo_centro_actividad());
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextFieldmensualEstadosFlujosCajas.setText(estadosflujoscajas.getmensual().toString());
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextFieldacumuladoEstadosFlujosCajas.setText(estadosflujoscajas.getacumulado().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadosFlujosCajas estadosflujoscajasLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadosflujoscajasLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadosFlujosCajas estadosflujoscajasLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadosflujoscajasLocal=this.estadosflujoscajas;
			} else {
				estadosflujoscajasLocal=this.estadosflujoscajasAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadosflujoscajasLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadosFlujosCajas(estadosflujoscajasLocal,true);
					
					if(estadosflujoscajasSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadosflujoscajasLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadosflujoscajasLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadosFlujosCajas(EstadosFlujosCajas estadosflujoscajas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadosFlujosCajas(estadosflujoscajas,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(estadosflujoscajas);
	}
	
	public void setVariablesFormularioToObjetoActualEstadosFlujosCajas(EstadosFlujosCajas estadosflujoscajas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadosFlujosCajas(estadosflujoscajas,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadosFlujosCajas(EstadosFlujosCajas estadosflujoscajas,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadosFlujosCajas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadosFlujosCajas.jLabelidEstadosFlujosCajas.getText()==null || this.jInternalFrameDetalleFormEstadosFlujosCajas.jLabelidEstadosFlujosCajas.getText()=="" || this.jInternalFrameDetalleFormEstadosFlujosCajas.jLabelidEstadosFlujosCajas.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadosFlujosCajas.jLabelidEstadosFlujosCajas.setText("0");
			}

			if(conColumnasBase) {estadosflujoscajas.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadosFlujosCajas.jLabelidEstadosFlujosCajas.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadosFlujosCajasConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadosFlujosCajas.jLabelIdEstadosFlujosCajas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadosflujoscajas.setnombre_centro_actividad(this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextAreanombre_centro_actividadEstadosFlujosCajas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadosFlujosCajasConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadosFlujosCajas.jLabelnombre_centro_actividadEstadosFlujosCajas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadosflujoscajas.setcodigo_centro_actividad(this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextFieldcodigo_centro_actividadEstadosFlujosCajas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadosFlujosCajasConstantesFunciones.LABEL_CODIGOCENTROACTIVIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadosFlujosCajas.jLabelcodigo_centro_actividadEstadosFlujosCajas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadosflujoscajas.setmensual(Double.parseDouble(this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextFieldmensualEstadosFlujosCajas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadosFlujosCajasConstantesFunciones.LABEL_MENSUAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadosFlujosCajas.jLabelmensualEstadosFlujosCajas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadosflujoscajas.setacumulado(Double.parseDouble(this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextFieldacumuladoEstadosFlujosCajas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadosFlujosCajasConstantesFunciones.LABEL_ACUMULADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadosFlujosCajas.jLabelacumuladoEstadosFlujosCajas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadosFlujosCajas(EstadosFlujosCajas estadosflujoscajasBean,EstadosFlujosCajas estadosflujoscajas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadosFlujosCajas(EstadosFlujosCajas estadosflujoscajasOrigen,EstadosFlujosCajas estadosflujoscajas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadosflujoscajasOrigen.getId()!=null && !estadosflujoscajasOrigen.getId().equals(0L))) {estadosflujoscajas.setId(estadosflujoscajasOrigen.getId());}}
			if(conDefault || (!conDefault && estadosflujoscajasOrigen.getnombre_centro_actividad()!=null && !estadosflujoscajasOrigen.getnombre_centro_actividad().equals(""))) {estadosflujoscajas.setnombre_centro_actividad(estadosflujoscajasOrigen.getnombre_centro_actividad());}
			if(conDefault || (!conDefault && estadosflujoscajasOrigen.getcodigo_centro_actividad()!=null && !estadosflujoscajasOrigen.getcodigo_centro_actividad().equals(""))) {estadosflujoscajas.setcodigo_centro_actividad(estadosflujoscajasOrigen.getcodigo_centro_actividad());}
			if(conDefault || (!conDefault && estadosflujoscajasOrigen.getmensual()!=null && !estadosflujoscajasOrigen.getmensual().equals(0.0))) {estadosflujoscajas.setmensual(estadosflujoscajasOrigen.getmensual());}
			if(conDefault || (!conDefault && estadosflujoscajasOrigen.getacumulado()!=null && !estadosflujoscajasOrigen.getacumulado().equals(0.0))) {estadosflujoscajas.setacumulado(estadosflujoscajasOrigen.getacumulado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadosFlujosCajas(EstadosFlujosCajas estadosflujoscajas) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jLabelidEstadosFlujosCajas.setText(estadosflujoscajas.getId().toString());
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextAreanombre_centro_actividadEstadosFlujosCajas.setText(estadosflujoscajas.getnombre_centro_actividad());
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextFieldcodigo_centro_actividadEstadosFlujosCajas.setText(estadosflujoscajas.getcodigo_centro_actividad());
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextFieldmensualEstadosFlujosCajas.setText(estadosflujoscajas.getmensual().toString());
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextFieldacumuladoEstadosFlujosCajas.setText(estadosflujoscajas.getacumulado().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadosFlujosCajas(EstadosFlujosCajasBean estadosflujoscajasBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jLabelidEstadosFlujosCajas.setText(estadosflujoscajasBean.getId().toString());
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextAreanombre_centro_actividadEstadosFlujosCajas.setText(estadosflujoscajasBean.getnombre_centro_actividad());
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextFieldcodigo_centro_actividadEstadosFlujosCajas.setText(estadosflujoscajasBean.getcodigo_centro_actividad());
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextFieldmensualEstadosFlujosCajas.setText(estadosflujoscajasBean.getmensual().toString());
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextFieldacumuladoEstadosFlujosCajas.setText(estadosflujoscajasBean.getacumulado().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadosFlujosCajas(EstadosFlujosCajasParameterReturnGeneral estadosflujoscajasReturnGeneral,EstadosFlujosCajasBean estadosflujoscajasBean,Boolean conDefault) throws Exception { 
		try {
			EstadosFlujosCajas estadosflujoscajasLocal=new EstadosFlujosCajas();
			
			estadosflujoscajasLocal=estadosflujoscajasReturnGeneral.getEstadosFlujosCajas();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadosflujoscajasLocal.getId()!=null && !estadosflujoscajasLocal.getId().equals(0L))) {estadosflujoscajasBean.setId(estadosflujoscajasLocal.getId());}}
			if(conDefault || (!conDefault && estadosflujoscajasLocal.getnombre_centro_actividad()!=null && !estadosflujoscajasLocal.getnombre_centro_actividad().equals(""))) {estadosflujoscajasBean.setnombre_centro_actividad(estadosflujoscajasLocal.getnombre_centro_actividad());}
			if(conDefault || (!conDefault && estadosflujoscajasLocal.getcodigo_centro_actividad()!=null && !estadosflujoscajasLocal.getcodigo_centro_actividad().equals(""))) {estadosflujoscajasBean.setcodigo_centro_actividad(estadosflujoscajasLocal.getcodigo_centro_actividad());}
			if(conDefault || (!conDefault && estadosflujoscajasLocal.getmensual()!=null && !estadosflujoscajasLocal.getmensual().equals(0.0))) {estadosflujoscajasBean.setmensual(estadosflujoscajasLocal.getmensual());}
			if(conDefault || (!conDefault && estadosflujoscajasLocal.getacumulado()!=null && !estadosflujoscajasLocal.getacumulado().equals(0.0))) {estadosflujoscajasBean.setacumulado(estadosflujoscajasLocal.getacumulado());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadosFlujosCajasGenerico(Long idEstadosFlujosCajasSeleccionado,JComboBox jComboBoxEstadosFlujosCajas,List<EstadosFlujosCajas> estadosflujoscajassLocal)throws Exception {
		try {
			EstadosFlujosCajas  estadosflujoscajasTemp=null;

			for(EstadosFlujosCajas estadosflujoscajasAux:estadosflujoscajassLocal) {
				if(estadosflujoscajasAux.getId()!=null && estadosflujoscajasAux.getId().equals(idEstadosFlujosCajasSeleccionado)) {
					estadosflujoscajasTemp=estadosflujoscajasAux;
					break;
				}
			}

			jComboBoxEstadosFlujosCajas.setSelectedItem(estadosflujoscajasTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadosFlujosCajasGenerico(JComboBox jComboBoxEstadosFlujosCajas,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadosFlujosCajas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadosFlujosCajas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadosFlujosCajas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadosFlujosCajas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadosFlujosCajas.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadosFlujosCajas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadosFlujosCajas.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadosFlujosCajas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadosFlujosCajas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadosFlujosCajas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadosflujoscajas=(EstadosFlujosCajas) estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadosflujoscajas =(EstadosFlujosCajas) estadosflujoscajass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!estadosflujoscajas.getIsNew() && !estadosflujoscajas.getIsChanged() && !estadosflujoscajas.getIsDeleted()) {
				sDescripcion=estadosflujoscajas.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=estadosflujoscajas.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!estadosflujoscajas.getIsNew() && !estadosflujoscajas.getIsChanged() && !estadosflujoscajas.getIsDeleted()) {
				sDescripcion=estadosflujoscajas.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=estadosflujoscajas.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!estadosflujoscajas.getIsNew() && !estadosflujoscajas.getIsChanged() && !estadosflujoscajas.getIsDeleted()) {
				sDescripcion=estadosflujoscajas.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=estadosflujoscajas.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("CentroActividad")) {
			//sDescripcion=this.getActualCentroActividadForeignKeyDescripcion((Long)value);
			if(!estadosflujoscajas.getIsNew() && !estadosflujoscajas.getIsChanged() && !estadosflujoscajas.getIsDeleted()) {
				sDescripcion=estadosflujoscajas.getcentroactividad_descripcion();
			} else {
				//sDescripcion=this.getActualCentroActividadForeignKeyDescripcion((Long)value);
				sDescripcion=estadosflujoscajas.getcentroactividad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadosFlujosCajas estadosflujoscajasRow=new EstadosFlujosCajas();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadosflujoscajasRow=(EstadosFlujosCajas) estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadosflujoscajasRow=(EstadosFlujosCajas) estadosflujoscajass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadosFlujosCajas(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaNuevoEstadosFlujosCajas && this.isPermisoNuevoEstadosFlujosCajas));			
			this.jButtonDuplicarEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaDuplicarEstadosFlujosCajas && this.isPermisoDuplicarEstadosFlujosCajas));			
			this.jButtonCopiarEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaCopiarEstadosFlujosCajas && this.isPermisoCopiarEstadosFlujosCajas));
			this.jButtonVerFormEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaVerFormEstadosFlujosCajas && this.isPermisoVerFormEstadosFlujosCajas));
			
			this.jButtonAbrirOrderByEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaOrdenEstadosFlujosCajas && this.isPermisoOrdenEstadosFlujosCajas));			
			
			this.jButtonNuevoRelacionesEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadosFlujosCajas && this.isPermisoNuevoEstadosFlujosCajas));			
			this.jButtonNuevoGuardarCambiosEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaNuevoEstadosFlujosCajas && this.isPermisoNuevoEstadosFlujosCajas && this.isPermisoGuardarCambiosEstadosFlujosCajas));
			
			if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonModificarEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaModificarEstadosFlujosCajas && this.isPermisoActualizarEstadosFlujosCajas));	
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonActualizarEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaActualizarEstadosFlujosCajas && this.isPermisoActualizarEstadosFlujosCajas));	
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonEliminarEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaEliminarEstadosFlujosCajas && this.isPermisoEliminarEstadosFlujosCajas));
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonCancelarEstadosFlujosCajas.setVisible(this.isVisibilidadCeldaCancelarEstadosFlujosCajas);							
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonGuardarCambiosEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaGuardarEstadosFlujosCajas && this.isPermisoGuardarCambiosEstadosFlujosCajas));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadosFlujosCajas && this.isPermisoGuardarCambiosEstadosFlujosCajas));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaNuevoEstadosFlujosCajas && this.isPermisoNuevoEstadosFlujosCajas));						
			this.jButtonDuplicarToolBarEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaDuplicarEstadosFlujosCajas && this.isPermisoDuplicarEstadosFlujosCajas));						
			this.jButtonCopiarToolBarEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaCopiarEstadosFlujosCajas && this.isPermisoCopiarEstadosFlujosCajas));			
			this.jButtonVerFormToolBarEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaVerFormEstadosFlujosCajas && this.isPermisoVerFormEstadosFlujosCajas));			
			this.jButtonAbrirOrderByToolBarEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaOrdenEstadosFlujosCajas && this.isPermisoOrdenEstadosFlujosCajas));
			this.jButtonNuevoRelacionesToolBarEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadosFlujosCajas && this.isPermisoNuevoEstadosFlujosCajas));			
			this.jButtonNuevoGuardarCambiosToolBarEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaNuevoEstadosFlujosCajas && this.isPermisoNuevoEstadosFlujosCajas && this.isPermisoGuardarCambiosEstadosFlujosCajas));			
			
			if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonModificarToolBarEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaModificarEstadosFlujosCajas && this.isPermisoActualizarEstadosFlujosCajas));	
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonActualizarToolBarEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaActualizarEstadosFlujosCajas  && this.isPermisoActualizarEstadosFlujosCajas));	
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonEliminarToolBarEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaEliminarEstadosFlujosCajas && this.isPermisoEliminarEstadosFlujosCajas));
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonCancelarToolBarEstadosFlujosCajas.setVisible(this.isVisibilidadCeldaCancelarEstadosFlujosCajas);				
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonGuardarCambiosToolBarEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaGuardarEstadosFlujosCajas && this.isPermisoGuardarCambiosEstadosFlujosCajas));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadosFlujosCajas && this.isPermisoGuardarCambiosEstadosFlujosCajas));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaNuevoEstadosFlujosCajas && this.isPermisoNuevoEstadosFlujosCajas));			
			this.jMenuItemDuplicarEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaDuplicarEstadosFlujosCajas && this.isPermisoDuplicarEstadosFlujosCajas));			
			this.jMenuItemCopiarEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaCopiarEstadosFlujosCajas && this.isPermisoCopiarEstadosFlujosCajas));			
			this.jMenuItemVerFormEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaVerFormEstadosFlujosCajas && this.isPermisoVerFormEstadosFlujosCajas));			
			this.jMenuItemAbrirOrderByEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaOrdenEstadosFlujosCajas && this.isPermisoOrdenEstadosFlujosCajas));			
			//this.jMenuItemMostrarOcultarEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaOrdenEstadosFlujosCajas && this.isPermisoOrdenEstadosFlujosCajas));
			this.jMenuItemDetalleAbrirOrderByEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaOrdenEstadosFlujosCajas && this.isPermisoOrdenEstadosFlujosCajas));			
			//this.jMenuItemDetalleMostrarOcultarEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaOrdenEstadosFlujosCajas && this.isPermisoOrdenEstadosFlujosCajas));			
			this.jMenuItemNuevoRelacionesEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadosFlujosCajas && this.isPermisoNuevoEstadosFlujosCajas));			
			this.jMenuItemNuevoGuardarCambiosEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaNuevoEstadosFlujosCajas && this.isPermisoNuevoEstadosFlujosCajas && this.isPermisoGuardarCambiosEstadosFlujosCajas));									
			
			if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jMenuItemModificarEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaModificarEstadosFlujosCajas && this.isPermisoActualizarEstadosFlujosCajas));	
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jMenuItemActualizarEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaActualizarEstadosFlujosCajas && this.isPermisoActualizarEstadosFlujosCajas));	
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jMenuItemEliminarEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaEliminarEstadosFlujosCajas && this.isPermisoEliminarEstadosFlujosCajas));
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jMenuItemCancelarEstadosFlujosCajas.setVisible(this.isVisibilidadCeldaCancelarEstadosFlujosCajas);				
			}
			
			this.jMenuItemGuardarCambiosEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaGuardarEstadosFlujosCajas && this.isPermisoGuardarCambiosEstadosFlujosCajas));						
			this.jMenuItemGuardarCambiosTablaEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadosFlujosCajas && this.isPermisoGuardarCambiosEstadosFlujosCajas));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadosFlujosCajas=this.jButtonNuevoEstadosFlujosCajas.isVisible();
			this.isVisibilidadCeldaDuplicarEstadosFlujosCajas=this.jButtonDuplicarEstadosFlujosCajas.isVisible();
			this.isVisibilidadCeldaCopiarEstadosFlujosCajas=this.jButtonCopiarEstadosFlujosCajas.isVisible();
			this.isVisibilidadCeldaVerFormEstadosFlujosCajas=this.jButtonVerFormEstadosFlujosCajas.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadosFlujosCajas=this.jButtonAbrirOrderByEstadosFlujosCajas.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadosFlujosCajas=this.jButtonNuevoRelacionesEstadosFlujosCajas.isVisible();
			this.isVisibilidadCeldaModificarEstadosFlujosCajas=this.jButtonModificarEstadosFlujosCajas.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
			this.isVisibilidadCeldaActualizarEstadosFlujosCajas=this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonActualizarEstadosFlujosCajas.isVisible();
			this.isVisibilidadCeldaEliminarEstadosFlujosCajas=this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonEliminarEstadosFlujosCajas.isVisible();
			this.isVisibilidadCeldaCancelarEstadosFlujosCajas=this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonCancelarEstadosFlujosCajas.isVisible();
			this.isVisibilidadCeldaGuardarEstadosFlujosCajas=this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonGuardarCambiosEstadosFlujosCajas.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadosFlujosCajas=this.jButtonGuardarCambiosTablaEstadosFlujosCajas.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadosFlujosCajas=this.jButtonNuevoToolBarEstadosFlujosCajas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadosFlujosCajas=this.jButtonNuevoRelacionesToolBarEstadosFlujosCajas.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
			this.isVisibilidadCeldaModificarEstadosFlujosCajas=this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonModificarToolBarEstadosFlujosCajas.isVisible();
			this.isVisibilidadCeldaActualizarEstadosFlujosCajas=this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonActualizarToolBarEstadosFlujosCajas.isVisible();
			this.isVisibilidadCeldaEliminarEstadosFlujosCajas=this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonEliminarToolBarEstadosFlujosCajas.isVisible();
			this.isVisibilidadCeldaCancelarEstadosFlujosCajas=this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonCancelarToolBarEstadosFlujosCajas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadosFlujosCajas=this.jButtonGuardarCambiosToolBarEstadosFlujosCajas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadosFlujosCajas=this.jButtonGuardarCambiosTablaToolBarEstadosFlujosCajas.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadosFlujosCajas=this.jMenuItemNuevoEstadosFlujosCajas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadosFlujosCajas=this.jMenuItemNuevoRelacionesEstadosFlujosCajas.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
			this.isVisibilidadCeldaModificarEstadosFlujosCajas=this.jInternalFrameDetalleFormEstadosFlujosCajas.jMenuItemModificarEstadosFlujosCajas.isVisible();
			this.isVisibilidadCeldaActualizarEstadosFlujosCajas=this.jInternalFrameDetalleFormEstadosFlujosCajas.jMenuItemActualizarEstadosFlujosCajas.isVisible();
			this.isVisibilidadCeldaEliminarEstadosFlujosCajas=this.jInternalFrameDetalleFormEstadosFlujosCajas.jMenuItemEliminarEstadosFlujosCajas.isVisible();
			this.isVisibilidadCeldaCancelarEstadosFlujosCajas=this.jInternalFrameDetalleFormEstadosFlujosCajas.jMenuItemCancelarEstadosFlujosCajas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadosFlujosCajas=this.jMenuItemGuardarCambiosEstadosFlujosCajas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadosFlujosCajas=this.jMenuItemGuardarCambiosTablaEstadosFlujosCajas.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadosFlujosCajas(Boolean esInicializar) {
		if(EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadosflujoscajasSessionBean.getConGuardarRelaciones()) {
				//if(this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadosFlujosCajas();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadosFlujosCajas(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadosFlujosCajas() {
		this.jButtonNuevoEstadosFlujosCajas.setVisible(this.isPermisoNuevoEstadosFlujosCajas);			
		this.jButtonDuplicarEstadosFlujosCajas.setVisible(this.isPermisoDuplicarEstadosFlujosCajas);			
		this.jButtonCopiarEstadosFlujosCajas.setVisible(this.isPermisoCopiarEstadosFlujosCajas);			
		this.jButtonVerFormEstadosFlujosCajas.setVisible(this.isPermisoVerFormEstadosFlujosCajas);			
		
		this.jButtonAbrirOrderByEstadosFlujosCajas.setVisible(this.isPermisoOrdenEstadosFlujosCajas);					
		
		this.jButtonNuevoRelacionesEstadosFlujosCajas.setVisible(this.isPermisoNuevoEstadosFlujosCajas);			
		
		if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonModificarEstadosFlujosCajas.setVisible(this.isPermisoActualizarEstadosFlujosCajas);	
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonActualizarEstadosFlujosCajas.setVisible(this.isPermisoActualizarEstadosFlujosCajas);	
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonEliminarEstadosFlujosCajas.setVisible(this.isPermisoEliminarEstadosFlujosCajas);
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonCancelarEstadosFlujosCajas.setVisible(this.isVisibilidadCeldaCancelarEstadosFlujosCajas);						
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonGuardarCambiosEstadosFlujosCajas.setVisible(this.isPermisoGuardarCambiosEstadosFlujosCajas);							
		}
		
		this.jButtonGuardarCambiosTablaEstadosFlujosCajas.setVisible(this.isPermisoActualizarEstadosFlujosCajas);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadosFlujosCajas() {
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonModificarEstadosFlujosCajas.setVisible(this.isPermisoActualizarEstadosFlujosCajas);	
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonActualizarEstadosFlujosCajas.setVisible(this.isPermisoActualizarEstadosFlujosCajas);	
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonEliminarEstadosFlujosCajas.setVisible(this.isPermisoEliminarEstadosFlujosCajas);
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonCancelarEstadosFlujosCajas.setVisible(this.isVisibilidadCeldaCancelarEstadosFlujosCajas);							
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonGuardarCambiosEstadosFlujosCajas.setVisible((this.isVisibilidadCeldaGuardarEstadosFlujosCajas && this.isPermisoGuardarCambiosEstadosFlujosCajas));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadosFlujosCajas() {
		if(EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadosFlujosCajas();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadosFlujosCajas() {
	}
	
	public void jTableDatosEstadosFlujosCajasListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadosFlujosCajas(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadosFlujosCajasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadosFlujosCajas(this.getestadosflujoscajas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(this.estadosflujoscajas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadosflujoscajas==null) {
						this.estadosflujoscajas = new EstadosFlujosCajas();
					}

					this.setVariablesFormularioToObjetoActualEstadosFlujosCajas(this.estadosflujoscajas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(this.estadosflujoscajas);
				}

				if(this.estadosflujoscajas.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadosflujoscajas.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadosFlujosCajas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEstadosFlujosCajasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEstadosFlujosCajas(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEstadosFlujosCajas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEstadosFlujosCajas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEstadosFlujosCajas(this.getestadosflujoscajas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(this.estadosflujoscajas);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.estadosflujoscajasLogic.getConnexion());

				if(this.estadosflujoscajas.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.estadosflujoscajas.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEstadosFlujosCajas=(TitledBorder)this.jScrollPanelDatosEstadosFlujosCajas.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEstadosFlujosCajas.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEstadosFlujosCajasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadosFlujosCajas(this.getestadosflujoscajas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(this.estadosflujoscajas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadosflujoscajas==null) {
						this.estadosflujoscajas = new EstadosFlujosCajas();
					}

					this.setVariablesFormularioToObjetoActualEstadosFlujosCajas(this.estadosflujoscajas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(this.estadosflujoscajas);
				}

				if(this.estadosflujoscajas.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.estadosflujoscajas.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadosFlujosCajas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioEstadosFlujosCajasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebEstadosFlujosCajas(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEstadosFlujosCajas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEstadosFlujosCajas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEstadosFlujosCajas(this.getestadosflujoscajas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(this.estadosflujoscajas);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.estadosflujoscajasLogic.getConnexion());

				if(this.estadosflujoscajas.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.estadosflujoscajas.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEstadosFlujosCajas=(TitledBorder)this.jScrollPanelDatosEstadosFlujosCajas.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderEstadosFlujosCajas.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioEstadosFlujosCajasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadosFlujosCajas(this.getestadosflujoscajas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(this.estadosflujoscajas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadosflujoscajas==null) {
						this.estadosflujoscajas = new EstadosFlujosCajas();
					}

					this.setVariablesFormularioToObjetoActualEstadosFlujosCajas(this.estadosflujoscajas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(this.estadosflujoscajas);
				}

				if(this.estadosflujoscajas.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.estadosflujoscajas.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadosFlujosCajas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoEstadosFlujosCajasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebEstadosFlujosCajas(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEstadosFlujosCajas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEstadosFlujosCajas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEstadosFlujosCajas(this.getestadosflujoscajas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(this.estadosflujoscajas);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.estadosflujoscajasLogic.getConnexion());

				if(this.estadosflujoscajas.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.estadosflujoscajas.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEstadosFlujosCajas=(TitledBorder)this.jScrollPanelDatosEstadosFlujosCajas.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderEstadosFlujosCajas.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoEstadosFlujosCajasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadosFlujosCajas(this.getestadosflujoscajas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(this.estadosflujoscajas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadosflujoscajas==null) {
						this.estadosflujoscajas = new EstadosFlujosCajas();
					}

					this.setVariablesFormularioToObjetoActualEstadosFlujosCajas(this.estadosflujoscajas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(this.estadosflujoscajas);
				}

				if(this.estadosflujoscajas.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.estadosflujoscajas.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadosFlujosCajas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_centro_actividadEstadosFlujosCajasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocentroactividad=true;

			idTienePermisocentroactividad=this.tienePermisosUsuarioEnPaginaWebEstadosFlujosCajas(CentroActividadConstantesFunciones.CLASSNAME);

			if(idTienePermisocentroactividad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEstadosFlujosCajas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEstadosFlujosCajas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEstadosFlujosCajas(this.getestadosflujoscajas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(this.estadosflujoscajas);

				this.centroactividadBeanSwingJInternalFrame=new CentroActividadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.centroactividadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.centroactividadBeanSwingJInternalFrame.getCentroActividadLogic().setConnexion(this.estadosflujoscajasLogic.getConnexion());

				if(this.estadosflujoscajas.getid_centro_actividad()!=null) {
					this.centroactividadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.centroactividadBeanSwingJInternalFrame.setIdActual(this.estadosflujoscajas.getid_centro_actividad());
					this.centroactividadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.centroactividadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.centroactividadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCentroActividad();
				}

				JInternalFrameBase jinternalFrame =this.centroactividadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEstadosFlujosCajas=(TitledBorder)this.jScrollPanelDatosEstadosFlujosCajas.getBorder();
				TitledBorder titledBordercentroactividad=(TitledBorder)this.centroactividadBeanSwingJInternalFrame.jScrollPanelDatosCentroActividad.getBorder();

				titledBordercentroactividad.setTitle(titledBorderEstadosFlujosCajas.getTitle() + " -> Centro Actividad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_centro_actividadEstadosFlujosCajasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadosFlujosCajas(this.getestadosflujoscajas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(this.estadosflujoscajas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadosflujoscajas==null) {
						this.estadosflujoscajas = new EstadosFlujosCajas();
					}

					this.setVariablesFormularioToObjetoActualEstadosFlujosCajas(this.estadosflujoscajas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(this.estadosflujoscajas);
				}

				if(this.estadosflujoscajas.getid_centro_actividad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_centro_actividad = "+this.estadosflujoscajas.getid_centro_actividad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadosFlujosCajas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_centro_actividadEstadosFlujosCajasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadosFlujosCajas(this.getestadosflujoscajas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(this.estadosflujoscajas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadosflujoscajas==null) {
						this.estadosflujoscajas = new EstadosFlujosCajas();
					}

					this.setVariablesFormularioToObjetoActualEstadosFlujosCajas(this.estadosflujoscajas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(this.estadosflujoscajas);
				}

				if(this.estadosflujoscajas.getnombre_centro_actividad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_centro_actividad like '%"+this.estadosflujoscajas.getnombre_centro_actividad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadosFlujosCajas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_centro_actividadEstadosFlujosCajasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadosFlujosCajas(this.getestadosflujoscajas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(this.estadosflujoscajas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadosflujoscajas==null) {
						this.estadosflujoscajas = new EstadosFlujosCajas();
					}

					this.setVariablesFormularioToObjetoActualEstadosFlujosCajas(this.estadosflujoscajas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(this.estadosflujoscajas);
				}

				if(this.estadosflujoscajas.getcodigo_centro_actividad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_centro_actividad like '%"+this.estadosflujoscajas.getcodigo_centro_actividad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadosFlujosCajas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmensualEstadosFlujosCajasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadosFlujosCajas(this.getestadosflujoscajas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(this.estadosflujoscajas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadosflujoscajas==null) {
						this.estadosflujoscajas = new EstadosFlujosCajas();
					}

					this.setVariablesFormularioToObjetoActualEstadosFlujosCajas(this.estadosflujoscajas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(this.estadosflujoscajas);
				}

				if(this.estadosflujoscajas.getmensual()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where mensual = "+this.estadosflujoscajas.getmensual().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadosFlujosCajas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonacumuladoEstadosFlujosCajasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadosFlujosCajas(this.getestadosflujoscajas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(this.estadosflujoscajas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadosflujoscajas==null) {
						this.estadosflujoscajas = new EstadosFlujosCajas();
					}

					this.setVariablesFormularioToObjetoActualEstadosFlujosCajas(this.estadosflujoscajas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(this.estadosflujoscajas);
				}

				if(this.estadosflujoscajas.getacumulado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where acumulado = "+this.estadosflujoscajas.getacumulado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadosFlujosCajas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaEstadosFlujosCajasEstadosFlujosCajasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEstadosFlujosCajas(false,false);

			this.getEstadosFlujosCajassBusquedaEstadosFlujosCajas();

			this.inicializarActualizarBindingEstadosFlujosCajas(false);

			//if(EstadosFlujosCajasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEstadosFlujosCajas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCentroActividadEstadosFlujosCajasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEstadosFlujosCajas(false,false);

			this.getEstadosFlujosCajassFK_IdCentroActividad();

			this.inicializarActualizarBindingEstadosFlujosCajas(false);

			//if(EstadosFlujosCajasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEstadosFlujosCajas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioEstadosFlujosCajasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEstadosFlujosCajas(false,false);

			this.getEstadosFlujosCajassFK_IdEjercicio();

			this.inicializarActualizarBindingEstadosFlujosCajas(false);

			//if(EstadosFlujosCajasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEstadosFlujosCajas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaEstadosFlujosCajasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEstadosFlujosCajas(false,false);

			this.getEstadosFlujosCajassFK_IdEmpresa();

			this.inicializarActualizarBindingEstadosFlujosCajas(false);

			//if(EstadosFlujosCajasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEstadosFlujosCajas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoEstadosFlujosCajasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEstadosFlujosCajas(false,false);

			this.getEstadosFlujosCajassFK_IdPeriodo();

			this.inicializarActualizarBindingEstadosFlujosCajas(false);

			//if(EstadosFlujosCajasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEstadosFlujosCajas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosflujoscajasLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEstadosFlujosCajas() {
		if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
			this.jInternalFrameDetalleFormEstadosFlujosCajas.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadosFlujosCajas.dispose();
			this.jInternalFrameDetalleFormEstadosFlujosCajas=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadosFlujosCajas!=null) {
			this.jInternalFrameReporteDinamicoEstadosFlujosCajas.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadosFlujosCajas.dispose();
			this.jInternalFrameReporteDinamicoEstadosFlujosCajas=null;
		}
		
		if(this.jInternalFrameImportacionEstadosFlujosCajas!=null) {
			this.jInternalFrameImportacionEstadosFlujosCajas.setVisible(false);	    			
			this.jInternalFrameImportacionEstadosFlujosCajas.dispose();
			this.jInternalFrameImportacionEstadosFlujosCajas=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadosFlujosCajas();
			
			EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadosFlujosCajas")) {
				jButtonNuevoEstadosFlujosCajasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadosFlujosCajas")) {
				jButtonDuplicarEstadosFlujosCajasActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadosFlujosCajas")) {
				jButtonCopiarEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadosFlujosCajas")) {
				jButtonVerFormEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadosFlujosCajas")) {
				jButtonNuevoEstadosFlujosCajasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadosFlujosCajas")) {
				jButtonDuplicarEstadosFlujosCajasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadosFlujosCajas")) {
				jButtonNuevoEstadosFlujosCajasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadosFlujosCajas")) {
				jButtonDuplicarEstadosFlujosCajasActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadosFlujosCajas")) {
				jButtonNuevoEstadosFlujosCajasActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadosFlujosCajas")) {
				jButtonNuevoEstadosFlujosCajasActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadosFlujosCajas")) {
				jButtonNuevoEstadosFlujosCajasActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadosFlujosCajas")) {
				jButtonModificarEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadosFlujosCajas")) {
				jButtonModificarEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadosFlujosCajas")) {
				jButtonModificarEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadosFlujosCajas")) {
				jButtonActualizarEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadosFlujosCajas")) {
				jButtonActualizarEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadosFlujosCajas")) {
				jButtonActualizarEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadosFlujosCajas")) {
				jButtonEliminarEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadosFlujosCajas")) {
				jButtonEliminarEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadosFlujosCajas")) {
				jButtonEliminarEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadosFlujosCajas")) {
				jButtonCancelarEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadosFlujosCajas")) {
				jButtonCancelarEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadosFlujosCajas")) {
				jButtonCancelarEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadosFlujosCajas")) {
				jButtonCerrarEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadosFlujosCajas")) {
				jButtonCerrarEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadosFlujosCajas")) {
				jButtonCerrarEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadosFlujosCajas")) {
				jButtonMostrarOcultarEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadosFlujosCajas")) {
				jButtonCancelarEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadosFlujosCajas")) {
				jButtonGuardarCambiosEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadosFlujosCajas")) {
				jButtonGuardarCambiosEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadosFlujosCajas")) {
				jButtonCopiarEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadosFlujosCajas")) {
				jButtonVerFormEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadosFlujosCajas")) {
				jButtonGuardarCambiosEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadosFlujosCajas")) {
				jButtonCopiarEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadosFlujosCajas")) {
				jButtonVerFormEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadosFlujosCajas")) {
				jButtonGuardarCambiosEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadosFlujosCajas")) {
				jButtonGuardarCambiosEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadosFlujosCajas")) {
				jButtonGuardarCambiosEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadosFlujosCajas")) {
				jButtonRecargarInformacionEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadosFlujosCajas")) {
				jButtonRecargarInformacionEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadosFlujosCajas")) {
				jButtonRecargarInformacionEstadosFlujosCajasActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadosFlujosCajas")) {
				jButtonAnterioresEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadosFlujosCajas")) {
				jButtonAnterioresEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadosFlujosCajas")) {
				jButtonAnterioresEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadosFlujosCajas")) {
				jButtonSiguientesEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadosFlujosCajas")) {
				jButtonSiguientesEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadosFlujosCajas")) {
				jButtonSiguientesEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadosFlujosCajas") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadosFlujosCajas")) {
				jButtonAbrirOrderByEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadosFlujosCajas") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadosFlujosCajas")) {
				jButtonMostrarOcultarEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadosFlujosCajas")) {
				jButtonNuevoGuardarCambiosEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadosFlujosCajas")) {
				jButtonNuevoGuardarCambiosEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadosFlujosCajas")) {
				jButtonNuevoGuardarCambiosEstadosFlujosCajasActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadosFlujosCajas")) {
				jButtonCerrarReporteDinamicoEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadosFlujosCajas")) {
				jButtonGenerarReporteDinamicoEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadosFlujosCajas")) {
				
				jButtonGenerarExcelReporteDinamicoEstadosFlujosCajasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadosFlujosCajas")) {
				jButtonCerrarImportacionEstadosFlujosCajasActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadosFlujosCajas")) {
				
				jButtonGenerarImportacionEstadosFlujosCajasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadosFlujosCajas")) {
				
				jButtonAbrirImportacionEstadosFlujosCajasActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadosFlujosCajas")) {
				jComboBoxTiposAccionesEstadosFlujosCajasActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadosFlujosCajas")) {
				jComboBoxTiposRelacionesEstadosFlujosCajasActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadosFlujosCajas")) {
				jComboBoxTiposAccionesEstadosFlujosCajasActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadosFlujosCajas")) {
				
				jComboBoxTiposSeleccionarEstadosFlujosCajasActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadosFlujosCajas")) {
				jTextFieldValorCampoGeneralEstadosFlujosCajasActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadosFlujosCajas")) {
				jButtonAbrirOrderByEstadosFlujosCajasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadosFlujosCajas")) {
				jButtonAbrirOrderByEstadosFlujosCajasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadosFlujosCajas")) {
				jButtonCerrarOrderByEstadosFlujosCajasActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadosFlujosCajasBusqueda")) {
				this.jButtonidEstadosFlujosCajasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEstadosFlujosCajasUpdate")) {
				this.jButtonid_empresaEstadosFlujosCajasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEstadosFlujosCajasBusqueda")) {
				this.jButtonid_empresaEstadosFlujosCajasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioEstadosFlujosCajasUpdate")) {
				this.jButtonid_ejercicioEstadosFlujosCajasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioEstadosFlujosCajasBusqueda")) {
				this.jButtonid_ejercicioEstadosFlujosCajasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoEstadosFlujosCajasUpdate")) {
				this.jButtonid_periodoEstadosFlujosCajasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoEstadosFlujosCajasBusqueda")) {
				this.jButtonid_periodoEstadosFlujosCajasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_centro_actividadEstadosFlujosCajasUpdate")) {
				this.jButtonid_centro_actividadEstadosFlujosCajasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_centro_actividadEstadosFlujosCajasBusqueda")) {
				this.jButtonid_centro_actividadEstadosFlujosCajasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_centro_actividadEstadosFlujosCajasBusqueda")) {
				this.jButtonnombre_centro_actividadEstadosFlujosCajasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_centro_actividadEstadosFlujosCajasBusqueda")) {
				this.jButtoncodigo_centro_actividadEstadosFlujosCajasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("mensualEstadosFlujosCajasBusqueda")) {
				this.jButtonmensualEstadosFlujosCajasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("acumuladoEstadosFlujosCajasBusqueda")) {
				this.jButtonacumuladoEstadosFlujosCajasBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaEstadosFlujosCajasEstadosFlujosCajas")) {
				this.jButtonBusquedaEstadosFlujosCajasEstadosFlujosCajasActionPerformed(evt);
			}
			
			;
			
			
			EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadosFlujosCajas();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadosFlujosCajasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosflujoscajas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosflujoscajas);
				
				EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
				
				


				
				EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadosFlujosCajas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadosFlujosCajas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadosFlujosCajas estadosflujoscajasLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadosflujoscajasLocal=this.estadosflujoscajas;
			} else {
				estadosflujoscajasLocal=this.estadosflujoscajasAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosflujoscajas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosflujoscajas);
				
				EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
							
				
				


				
				EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadosFlujosCajas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadosFlujosCajas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadosFlujosCajasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasAnterior =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadosflujoscajasAnterior =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
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
			
			EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
			
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
			
			


			
			EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadosFlujosCajasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosflujoscajas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosflujoscajas);
				
				EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
								
						
				


				
				EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadosFlujosCajas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadosFlujosCajas.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosflujoscajas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosflujoscajas);
				
				EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
								
				
				


				
				EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadosFlujosCajas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadosFlujosCajas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadosFlujosCajasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasAnterior =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadosflujoscajasAnterior =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosflujoscajas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosflujoscajas);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadosFlujosCajasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasAnterior =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadosflujoscajasAnterior =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadosFlujosCajasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosflujoscajas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadosflujoscajas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosflujoscajas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosflujoscajas);
				
				EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
							
				
				


				
				EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadosFlujosCajas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadosFlujosCajas.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadosFlujosCajasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosflujoscajasAnterior =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadosflujoscajasAnterior =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
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
			
			EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
			
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
			
			


			
			EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadosFlujosCajasActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosflujoscajas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadosflujoscajas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosflujoscajas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosflujoscajas);
				
				EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
								
				
				


				
				EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadosFlujosCajas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadosFlujosCajas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadosFlujosCajasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasAnterior =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadosflujoscajasAnterior =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadosFlujosCajasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosflujoscajas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadosflujoscajas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadosFlujosCajasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosflujoscajas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosflujoscajas);
				
				EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadosFlujosCajas")) {
					jCheckBoxSeleccionarTodosEstadosFlujosCajasItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadosFlujosCajas")) {
					jCheckBoxSeleccionadosEstadosFlujosCajasItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadosFlujosCajas")) {
					
				}
				
				


				
				
				EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadosFlujosCajas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadosFlujosCajas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosflujoscajas);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadosflujoscajas);
				
				EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
												
				
				


				
				
				EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadosFlujosCajas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadosFlujosCajas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadosFlujosCajasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosflujoscajasAnterior =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadosflujoscajasAnterior =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadosFlujosCajasActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosflujoscajas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosflujoscajas);
				
				EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
				
				
				EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
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
			
			EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
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
			
			


			
			EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadosFlujosCajasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosflujoscajas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosflujoscajas);
				
				EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadosFlujosCajas.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadosFlujosCajas.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosflujoscajas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosflujoscajas);
				
				EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
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
				
				


				
				EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadosFlujosCajas.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadosFlujosCajas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadosFlujosCajasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosflujoscajasAnterior =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadosflujoscajasAnterior =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadosFlujosCajas")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadosFlujosCajasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadosFlujosCajas.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadosflujoscajas =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadosflujoscajas);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadosFlujosCajas")) {
				
				}
				
				EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadosFlujosCajas")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadosFlujosCajas.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadosFlujosCajas")) {
			
			}
			
			EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadosFlujosCajas();
			
			EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
			
			if(sTipo.equals("NuevoEstadosFlujosCajas")) {
				jButtonNuevoEstadosFlujosCajasActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadosFlujosCajas")) {
				jButtonDuplicarEstadosFlujosCajasActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadosFlujosCajas")) {
				jButtonCopiarEstadosFlujosCajasActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadosFlujosCajas")) {
				jButtonVerFormEstadosFlujosCajasActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadosFlujosCajas")) {
				jButtonNuevoEstadosFlujosCajasActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadosFlujosCajas")) {
				jButtonModificarEstadosFlujosCajasActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadosFlujosCajas")) {
				jButtonActualizarEstadosFlujosCajasActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadosFlujosCajas")) {
				jButtonEliminarEstadosFlujosCajasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadosFlujosCajas")) {
				jButtonGuardarCambiosEstadosFlujosCajasActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadosFlujosCajas")) {
				jButtonCancelarEstadosFlujosCajasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadosFlujosCajas")) {
				jButtonCerrarEstadosFlujosCajasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadosFlujosCajas")) {
				jButtonGuardarCambiosEstadosFlujosCajasActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadosFlujosCajas")) {
				jButtonNuevoGuardarCambiosEstadosFlujosCajasActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadosFlujosCajas")) {
				jButtonAbrirOrderByEstadosFlujosCajasActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadosFlujosCajas")) {
				jButtonRecargarInformacionEstadosFlujosCajasActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadosFlujosCajas")) {
				jButtonAnterioresEstadosFlujosCajasActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadosFlujosCajas")) {
				jButtonSiguientesEstadosFlujosCajasActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadosFlujosCajasBusqueda")) {
				this.jButtonidEstadosFlujosCajasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEstadosFlujosCajasUpdate")) {
				this.jButtonid_empresaEstadosFlujosCajasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEstadosFlujosCajasBusqueda")) {
				this.jButtonid_empresaEstadosFlujosCajasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioEstadosFlujosCajasUpdate")) {
				this.jButtonid_ejercicioEstadosFlujosCajasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioEstadosFlujosCajasBusqueda")) {
				this.jButtonid_ejercicioEstadosFlujosCajasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoEstadosFlujosCajasUpdate")) {
				this.jButtonid_periodoEstadosFlujosCajasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoEstadosFlujosCajasBusqueda")) {
				this.jButtonid_periodoEstadosFlujosCajasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_centro_actividadEstadosFlujosCajasUpdate")) {
				this.jButtonid_centro_actividadEstadosFlujosCajasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_centro_actividadEstadosFlujosCajasBusqueda")) {
				this.jButtonid_centro_actividadEstadosFlujosCajasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_centro_actividadEstadosFlujosCajasBusqueda")) {
				this.jButtonnombre_centro_actividadEstadosFlujosCajasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_centro_actividadEstadosFlujosCajasBusqueda")) {
				this.jButtoncodigo_centro_actividadEstadosFlujosCajasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("mensualEstadosFlujosCajasBusqueda")) {
				this.jButtonmensualEstadosFlujosCajasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("acumuladoEstadosFlujosCajasBusqueda")) {
				this.jButtonacumuladoEstadosFlujosCajasBusquedaActionPerformed(evt);
			}
			
			EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadosFlujosCajas();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadosFlujosCajas")) {
				closingInternalFrameEstadosFlujosCajas();
				
			} else if(sTipo.equals("jButtonCancelarEstadosFlujosCajas")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadosFlujosCajas = (JInternalFrameBase)evt.getSource();
	            	
	            EstadosFlujosCajasBeanSwingJInternalFrame jInternalFrameParent=(EstadosFlujosCajasBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadosFlujosCajas.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadosFlujosCajasActionPerformed(null);
			}
			
			EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadosflujoscajas,new Object(),this.estadosflujoscajasParameterGeneral,this.estadosflujoscajasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadosFlujosCajas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadosFlujosCajas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadosFlujosCajas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadosflujoscajas)) {
			if(!esControlTabla) {
				if(EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadosFlujosCajas(this.estadosflujoscajas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(this.estadosflujoscajas);			
				}
				
				if(this.estadosflujoscajasSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadosFlujosCajas(this.estadosflujoscajas,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadosFlujosCajas(this.estadosflujoscajasReturnGeneral,this.estadosflujoscajasBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadosflujoscajasSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadosFlujosCajas(classes,this.estadosflujoscajasReturnGeneral,this.estadosflujoscajasBean,false);
					}
						
					if(this.estadosflujoscajasReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadosFlujosCajas(this.estadosflujoscajasReturnGeneral.getEstadosFlujosCajas());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadosFlujosCajas(this.estadosflujoscajasReturnGeneral.getEstadosFlujosCajas());	
					}
						
					if(this.estadosflujoscajasReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadosFlujosCajas(this.estadosflujoscajasReturnGeneral.getEstadosFlujosCajas(),classes);//this.estadosflujoscajasBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadosFlujosCajas(this.estadosflujoscajas,classes);//this.estadosflujoscajasBean);									
				}
			
				if(EstadosFlujosCajasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadosFlujosCajas(this.estadosflujoscajas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadosFlujosCajas(this.estadosflujoscajas);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadosflujoscajasAnterior!=null) {
						this.estadosflujoscajas=this.estadosflujoscajasAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadosflujoscajasSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadosflujoscajasSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadosflujoscajasReturnGeneral.getEstadosFlujosCajas(),estadosflujoscajasLogic.getEstadosFlujosCajass());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadosflujoscajasReturnGeneral.getEstadosFlujosCajas(),this.estadosflujoscajass);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadosFlujosCajas.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadosFlujosCajas.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadosFlujosCajas();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadosFlujosCajas() throws Exception {
		
		EstadosFlujosCajasModel estadosflujoscajasModel=(EstadosFlujosCajasModel)this.jTableDatosEstadosFlujosCajas.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadosflujoscajasModel.estadosflujoscajass=this.estadosflujoscajasLogic.getEstadosFlujosCajass();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadosflujoscajasModel.estadosflujoscajass=this.estadosflujoscajass;
		}
		
		
		((EstadosFlujosCajasModel) this.jTableDatosEstadosFlujosCajas.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadosFlujosCajas() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadosflujoscajasAnterior(),this.estadosflujoscajasLogic.getEstadosFlujosCajass());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadosflujoscajasAnterior(),this.estadosflujoscajass);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadosFlujosCajas();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadosFlujosCajas(EstadosFlujosCajas estadosflujoscajas,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
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
										
				EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadosflujoscajas,new Object(),generalEntityParameterGeneral,this.estadosflujoscajasReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadosflujoscajasSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadosFlujosCajasConstantesFunciones.getClassesRelationshipsOfEstadosFlujosCajas(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadosFlujosCajasConstantesFunciones.getClassesRelationshipsFromStringsOfEstadosFlujosCajas(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadosFlujosCajas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadosFlujosCajasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadosflujoscajas,new Object(),generalEntityParameterGeneral,this.estadosflujoscajasReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadosFlujosCajas(EstadosFlujosCajasBean estadosflujoscajasBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadosFlujosCajas(ArrayList<Classe> classes,EstadosFlujosCajasReturnGeneral estadosflujoscajasReturnGeneral,EstadosFlujosCajasBean estadosflujoscajasBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadosFlujosCajas(EstadosFlujosCajas estadosflujoscajas,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.estadosflujoscajas)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadosFlujosCajas = new EstadosFlujosCajasDetalleFormJInternalFrame(jDesktopPane,this.estadosflujoscajasSessionBean.getConGuardarRelaciones(),this.estadosflujoscajasSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadosFlujosCajas);
		this.jInternalFrameDetalleFormEstadosFlujosCajas.setVisible(false);
		this.jInternalFrameDetalleFormEstadosFlujosCajas.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadosFlujosCajas.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadosFlujosCajas.estadosflujoscajasLogic=this.estadosflujoscajasLogic;
		
		this.cargarCombosFrameForeignKeyEstadosFlujosCajas("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadosFlujosCajas();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadosFlujosCajas();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadosFlujosCajas("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadosFlujosCajas();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadosFlujosCajas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadosFlujosCajas"));
		
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonModificarEstadosFlujosCajas.addActionListener(new ButtonActionListener(this,"ModificarEstadosFlujosCajas"));

		
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonModificarToolBarEstadosFlujosCajas.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadosFlujosCajas"));
					
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jMenuItemModificarEstadosFlujosCajas.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadosFlujosCajas"));		
		
		
		
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonActualizarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"ActualizarEstadosFlujosCajas"));
		
		
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonActualizarToolBarEstadosFlujosCajas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadosFlujosCajas"));
						
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jMenuItemActualizarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadosFlujosCajas"));		
		
		
		
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonEliminarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"EliminarEstadosFlujosCajas"));
		
		
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonEliminarToolBarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadosFlujosCajas"));
								
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jMenuItemEliminarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadosFlujosCajas"));		
		
		
		
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonCancelarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"CancelarEstadosFlujosCajas"));
		
		
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonCancelarToolBarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadosFlujosCajas"));
					
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jMenuItemCancelarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadosFlujosCajas"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jMenuItemDetalleCerrarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadosFlujosCajas"));		
		
		
		
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonGuardarCambiosToolBarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadosFlujosCajas"));
		
		
		
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonGuardarCambiosToolBarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadosFlujosCajas"));
		
		
		
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxTiposAccionesFormularioEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadosFlujosCajas"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonidEstadosFlujosCajasBusqueda.addActionListener(new ButtonActionListener(this,"idEstadosFlujosCajasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonid_empresaEstadosFlujosCajasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEstadosFlujosCajasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonid_empresaEstadosFlujosCajasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEstadosFlujosCajasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonid_ejercicioEstadosFlujosCajasUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioEstadosFlujosCajasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonid_ejercicioEstadosFlujosCajasBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioEstadosFlujosCajasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonid_periodoEstadosFlujosCajasUpdate.addActionListener(new ButtonActionListener(this,"id_periodoEstadosFlujosCajasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonid_periodoEstadosFlujosCajasBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoEstadosFlujosCajasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonid_centro_actividadEstadosFlujosCajasUpdate.addActionListener(new ButtonActionListener(this,"id_centro_actividadEstadosFlujosCajasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonid_centro_actividadEstadosFlujosCajasBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_actividadEstadosFlujosCajasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonnombre_centro_actividadEstadosFlujosCajasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_centro_actividadEstadosFlujosCajasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtoncodigo_centro_actividadEstadosFlujosCajasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_centro_actividadEstadosFlujosCajasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonmensualEstadosFlujosCajasBusqueda.addActionListener(new ButtonActionListener(this,"mensualEstadosFlujosCajasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonacumuladoEstadosFlujosCajasBusqueda.addActionListener(new ButtonActionListener(this,"acumuladoEstadosFlujosCajasBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jTabbedPaneRelacionesEstadosFlujosCajas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadosFlujosCajas"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadosFlujosCajas"));
		
		if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadosFlujosCajas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadosFlujosCajas"));
		}
		
		this.jTableDatosEstadosFlujosCajas.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadosFlujosCajas"));
		
		this.jTableDatosEstadosFlujosCajas.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadosFlujosCajas"));
		
		this.jButtonNuevoEstadosFlujosCajas.addActionListener(new ButtonActionListener(this,"NuevoEstadosFlujosCajas"));
		
		this.jButtonDuplicarEstadosFlujosCajas.addActionListener(new ButtonActionListener(this,"DuplicarEstadosFlujosCajas"));
		
		this.jButtonCopiarEstadosFlujosCajas.addActionListener(new ButtonActionListener(this,"CopiarEstadosFlujosCajas"));
		
		this.jButtonVerFormEstadosFlujosCajas.addActionListener(new ButtonActionListener(this,"VerFormEstadosFlujosCajas"));
		
		
		this.jButtonNuevoToolBarEstadosFlujosCajas.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadosFlujosCajas"));
			
		this.jButtonDuplicarToolBarEstadosFlujosCajas.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadosFlujosCajas"));
			
		this.jMenuItemNuevoEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadosFlujosCajas"));
			
		this.jMenuItemDuplicarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadosFlujosCajas"));		
		
		
		this.jButtonNuevoRelacionesEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadosFlujosCajas"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadosFlujosCajas.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadosFlujosCajas"));
			
		this.jMenuItemNuevoRelacionesEstadosFlujosCajas.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadosFlujosCajas"));		
		
		
		if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonModificarEstadosFlujosCajas.addActionListener(new ButtonActionListener(this,"ModificarEstadosFlujosCajas"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonModificarToolBarEstadosFlujosCajas.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadosFlujosCajas"));
			
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jMenuItemModificarEstadosFlujosCajas.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadosFlujosCajas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonActualizarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"ActualizarEstadosFlujosCajas"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonActualizarToolBarEstadosFlujosCajas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadosFlujosCajas"));
				
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jMenuItemActualizarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadosFlujosCajas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonEliminarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"EliminarEstadosFlujosCajas"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonEliminarToolBarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadosFlujosCajas"));
						
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jMenuItemEliminarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadosFlujosCajas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonCancelarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"CancelarEstadosFlujosCajas"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonCancelarToolBarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadosFlujosCajas"));
			
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jMenuItemCancelarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadosFlujosCajas"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadosFlujosCajas"));		
		
		
		this.jButtonCerrarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"CerrarEstadosFlujosCajas"));
		
		
		this.jButtonCerrarToolBarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadosFlujosCajas"));
			
		this.jMenuItemCerrarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadosFlujosCajas"));
			
		if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jMenuItemDetalleCerrarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadosFlujosCajas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonGuardarCambiosEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadosFlujosCajas"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonGuardarCambiosToolBarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadosFlujosCajas"));
		}
		
		this.jButtonCopiarToolBarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadosFlujosCajas"));
			
		this.jButtonVerFormToolBarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadosFlujosCajas"));
		
		this.jMenuItemGuardarCambiosEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadosFlujosCajas"));
			
		this.jMenuItemCopiarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadosFlujosCajas"));		
		
		this.jMenuItemVerFormEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadosFlujosCajas"));		
		
		
		this.jButtonGuardarCambiosTablaEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadosFlujosCajas"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadosFlujosCajas"));
			
		this.jMenuItemGuardarCambiosTablaEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadosFlujosCajas"));		
		
		
		
		this.jButtonRecargarInformacionEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadosFlujosCajas"));
					
		this.jButtonRecargarInformacionToolBarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadosFlujosCajas"));
		
		this.jMenuItemRecargarInformacionEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadosFlujosCajas"));		
		
		
		
		this.jButtonAnterioresEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"AnterioresEstadosFlujosCajas"));
		
		
		this.jButtonAnterioresToolBarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadosFlujosCajas"));
		
		this.jMenuItemAnterioresEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadosFlujosCajas"));		
		
		
		this.jButtonSiguientesEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"SiguientesEstadosFlujosCajas"));
		
		
		this.jButtonSiguientesToolBarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadosFlujosCajas"));
			
		this.jMenuItemSiguientesEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadosFlujosCajas"));
			
		this.jMenuItemAbrirOrderByEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadosFlujosCajas"));
			
		this.jMenuItemMostrarOcultarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadosFlujosCajas"));
			
		this.jMenuItemDetalleAbrirOrderByEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadosFlujosCajas"));
			
		this.jMenuItemDetalleMostarOcultarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadosFlujosCajas"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadosFlujosCajas"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadosFlujosCajas"));
			
		this.jMenuItemNuevoGuardarCambiosEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadosFlujosCajas"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadosFlujosCajas.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadosFlujosCajas"));

		this.jCheckBoxSeleccionadosEstadosFlujosCajas.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadosFlujosCajas"));
		
		if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxTiposAccionesFormularioEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadosFlujosCajas"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadosFlujosCajas"));
			
		this.jComboBoxTiposAccionesEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadosFlujosCajas"));
					
		this.jComboBoxTiposSeleccionarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadosFlujosCajas"));
			
		this.jTextFieldValorCampoGeneralEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadosFlujosCajas"));		
		
		
		if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonidEstadosFlujosCajasBusqueda.addActionListener(new ButtonActionListener(this,"idEstadosFlujosCajasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonid_empresaEstadosFlujosCajasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEstadosFlujosCajasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonid_empresaEstadosFlujosCajasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEstadosFlujosCajasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonid_ejercicioEstadosFlujosCajasUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioEstadosFlujosCajasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonid_ejercicioEstadosFlujosCajasBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioEstadosFlujosCajasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonid_periodoEstadosFlujosCajasUpdate.addActionListener(new ButtonActionListener(this,"id_periodoEstadosFlujosCajasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonid_periodoEstadosFlujosCajasBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoEstadosFlujosCajasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonid_centro_actividadEstadosFlujosCajasUpdate.addActionListener(new ButtonActionListener(this,"id_centro_actividadEstadosFlujosCajasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonid_centro_actividadEstadosFlujosCajasBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_actividadEstadosFlujosCajasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonnombre_centro_actividadEstadosFlujosCajasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_centro_actividadEstadosFlujosCajasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtoncodigo_centro_actividadEstadosFlujosCajasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_centro_actividadEstadosFlujosCajasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonmensualEstadosFlujosCajasBusqueda.addActionListener(new ButtonActionListener(this,"mensualEstadosFlujosCajasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonacumuladoEstadosFlujosCajasBusqueda.addActionListener(new ButtonActionListener(this,"acumuladoEstadosFlujosCajasBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaEstadosFlujosCajasEstadosFlujosCajas.addActionListener(new ButtonActionListener(this,"BusquedaEstadosFlujosCajasEstadosFlujosCajas"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadosFlujosCajas!=null) {
				this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadosFlujosCajas"));
				this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadosFlujosCajas"));
				this.jInternalFrameReporteDinamicoEstadosFlujosCajas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadosFlujosCajas"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadosFlujosCajas"));				
			//this.jButtonGenerarReporteDinamicoEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadosFlujosCajas"));
			//this.jButtonGenerarExcelReporteDinamicoEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadosFlujosCajas"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadosFlujosCajas!=null) {
				this.jInternalFrameImportacionEstadosFlujosCajas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadosFlujosCajas"));
				this.jInternalFrameImportacionEstadosFlujosCajas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadosFlujosCajas"));
				this.jInternalFrameImportacionEstadosFlujosCajas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadosFlujosCajas"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadosFlujosCajas"));
			
			this.jButtonAbrirOrderByToolBarEstadosFlujosCajas.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadosFlujosCajas"));			
			
			if(this.jInternalFrameOrderByEstadosFlujosCajas!=null) {
				this.jInternalFrameOrderByEstadosFlujosCajas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadosFlujosCajas"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadosFlujosCajas.jTabbedPaneRelacionesEstadosFlujosCajas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadosFlujosCajas"));
		
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
            		closingInternalFrameEstadosFlujosCajas();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadosFlujosCajas.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadosFlujosCajas = (JInternalFrameBase)event.getSource();
	            	
	            EstadosFlujosCajasBeanSwingJInternalFrame jInternalFrameParent=(EstadosFlujosCajasBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadosFlujosCajas.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadosFlujosCajasActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadosFlujosCajas.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadosFlujosCajasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadosFlujosCajas.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadosFlujosCajas.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadosFlujosCajasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadosFlujosCajasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadosFlujosCajasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadosFlujosCajas";
		inputMap = this.jButtonNuevoEstadosFlujosCajas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadosFlujosCajas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadosFlujosCajasActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadosFlujosCajasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadosFlujosCajasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadosFlujosCajasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadosFlujosCajas";
		inputMap = this.jButtonNuevoRelacionesEstadosFlujosCajas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadosFlujosCajas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadosFlujosCajasActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadosFlujosCajas";
		inputMap = this.jButtonModificarEstadosFlujosCajas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadosFlujosCajas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadosFlujosCajasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadosFlujosCajas";
		inputMap = this.jButtonActualizarEstadosFlujosCajas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadosFlujosCajas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadosFlujosCajasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadosFlujosCajas";
		inputMap = this.jButtonEliminarEstadosFlujosCajas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadosFlujosCajas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadosFlujosCajasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadosFlujosCajas";
		inputMap = this.jButtonCancelarEstadosFlujosCajas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadosFlujosCajas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadosFlujosCajasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadosFlujosCajas";
		inputMap = this.jButtonCerrarEstadosFlujosCajas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadosFlujosCajas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadosFlujosCajasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonGuardarCambiosEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadosFlujosCajas";
		inputMap = this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonGuardarCambiosEstadosFlujosCajas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonGuardarCambiosEstadosFlujosCajas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadosFlujosCajasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadosFlujosCajas.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadosFlujosCajasItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadosFlujosCajas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadosFlujosCajasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadosFlujosCajas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadosFlujosCajasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadosFlujosCajas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadosFlujosCajasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonidEstadosFlujosCajasBusqueda.addActionListener(new ButtonActionListener(this,"idEstadosFlujosCajasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonid_empresaEstadosFlujosCajasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEstadosFlujosCajasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonid_empresaEstadosFlujosCajasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEstadosFlujosCajasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonid_ejercicioEstadosFlujosCajasUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioEstadosFlujosCajasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonid_ejercicioEstadosFlujosCajasBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioEstadosFlujosCajasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonid_periodoEstadosFlujosCajasUpdate.addActionListener(new ButtonActionListener(this,"id_periodoEstadosFlujosCajasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonid_periodoEstadosFlujosCajasBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoEstadosFlujosCajasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonid_centro_actividadEstadosFlujosCajasUpdate.addActionListener(new ButtonActionListener(this,"id_centro_actividadEstadosFlujosCajasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonid_centro_actividadEstadosFlujosCajasBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_actividadEstadosFlujosCajasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonnombre_centro_actividadEstadosFlujosCajasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_centro_actividadEstadosFlujosCajasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtoncodigo_centro_actividadEstadosFlujosCajasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_centro_actividadEstadosFlujosCajasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonmensualEstadosFlujosCajasBusqueda.addActionListener(new ButtonActionListener(this,"mensualEstadosFlujosCajasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jButtonacumuladoEstadosFlujosCajasBusqueda.addActionListener(new ButtonActionListener(this,"acumuladoEstadosFlujosCajasBusqueda"));
		
		
		this.jButtonBusquedaEstadosFlujosCajasEstadosFlujosCajas.addActionListener(new ButtonActionListener(this,"BusquedaEstadosFlujosCajasEstadosFlujosCajas"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadosFlujosCajas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadosFlujosCajasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadosFlujosCajasActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadosFlujosCajas.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadosFlujosCajas(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadosFlujosCajas estadosflujoscajasAux:this.estadosflujoscajasLogic.getEstadosFlujosCajass()) {
					estadosflujoscajasAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadosFlujosCajas estadosflujoscajasAux:estadosflujoscajass) {
					estadosflujoscajasAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadosFlujosCajasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadosFlujosCajas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadosFlujosCajas estadosflujoscajasAux:this.estadosflujoscajasLogic.getEstadosFlujosCajass()) {
						estadosflujoscajasAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadosFlujosCajas estadosflujoscajasAux:estadosflujoscajass) {
						estadosflujoscajasAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadosFlujosCajas estadosflujoscajasAux:this.estadosflujoscajasLogic.getEstadosFlujosCajass()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadosFlujosCajas estadosflujoscajasAux:estadosflujoscajass) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadosFlujosCajas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadosFlujosCajas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadosFlujosCajas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadosFlujosCajas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadosFlujosCajasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadosFlujosCajas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadosFlujosCajas.getSelectedRows();
			
			EstadosFlujosCajas estadosflujoscajasLocal=new EstadosFlujosCajas();
			
			//this.seleccionarTodosEstadosFlujosCajas(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadosflujoscajasLocal =(EstadosFlujosCajas) this.estadosflujoscajasLogic.getEstadosFlujosCajass().toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadosflujoscajasLocal =(EstadosFlujosCajas) this.estadosflujoscajass.toArray()[this.jTableDatosEstadosFlujosCajas.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadosflujoscajasLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadosFlujosCajas estadosflujoscajasAux:this.estadosflujoscajasLogic.getEstadosFlujosCajass()) {
						estadosflujoscajasAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadosFlujosCajas estadosflujoscajasAux:estadosflujoscajass) {
						estadosflujoscajasAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadosFlujosCajas(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadosFlujosCajas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadosFlujosCajas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadosFlujosCajas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadosFlujosCajasItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadosFlujosCajasParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadosFlujosCajasActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadosFlujosCajas(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadosFlujosCajas.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadosFlujosCajas estadosflujoscajasAux:this.estadosflujoscajasLogic.getEstadosFlujosCajass()) {
				
						if(sTipoSeleccionar.equals(EstadosFlujosCajasConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD)) {
							existe=true;
							estadosflujoscajasAux.setnombre_centro_actividad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadosFlujosCajasConstantesFunciones.LABEL_CODIGOCENTROACTIVIDAD)) {
							existe=true;
							estadosflujoscajasAux.setcodigo_centro_actividad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadosFlujosCajasConstantesFunciones.LABEL_MENSUAL)) {
							existe=true;
							estadosflujoscajasAux.setmensual(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EstadosFlujosCajasConstantesFunciones.LABEL_ACUMULADO)) {
							existe=true;
							estadosflujoscajasAux.setacumulado(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadosFlujosCajas estadosflujoscajasAux:estadosflujoscajass) {
					
						if(sTipoSeleccionar.equals(EstadosFlujosCajasConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD)) {
							existe=true;
							estadosflujoscajasAux.setnombre_centro_actividad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadosFlujosCajasConstantesFunciones.LABEL_CODIGOCENTROACTIVIDAD)) {
							existe=true;
							estadosflujoscajasAux.setcodigo_centro_actividad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadosFlujosCajasConstantesFunciones.LABEL_MENSUAL)) {
							existe=true;
							estadosflujoscajasAux.setmensual(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EstadosFlujosCajasConstantesFunciones.LABEL_ACUMULADO)) {
							existe=true;
							estadosflujoscajasAux.setacumulado(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadosFlujosCajas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadosFlujosCajasActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadosFlujosCajas(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadosFlujosCajas=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadosFlujosCajas.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxTiposAccionesFormularioEstadosFlujosCajas.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadosFlujosCajas) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadosFlujosCajas(conSplash);
				
					this.generarReporteEstadosFlujosCajassSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadosFlujosCajas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxTiposAccionesFormularioEstadosFlujosCajas.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadosFlujosCajassSeleccionados();
				//this.jComboBoxTiposAccionesEstadosFlujosCajas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadosFlujosCajassSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadosFlujosCajas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadosFlujosCajassSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadosFlujosCajas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadosFlujosCajas();
				
				this.exportarEstadosFlujosCajassSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadosFlujosCajas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxTiposAccionesFormularioEstadosFlujosCajas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadosFlujosCajass();
				//this.importarEstadosFlujosCajass();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadosFlujosCajas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxTiposAccionesFormularioEstadosFlujosCajas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadosFlujosCajas();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadosFlujosCajassSeleccionados();
				//this.jComboBoxTiposAccionesEstadosFlujosCajas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estados Flujos Cajas", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadosFlujosCajas();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadosFlujosCajas)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadosFlujosCajas(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estados Flujos Cajas",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadosFlujosCajas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxTiposAccionesFormularioEstadosFlujosCajas.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadosFlujosCajasBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadosFlujosCajas) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadosFlujosCajas(conSplash);
					
						//this.actualizarParametrosGeneralEstadosFlujosCajas();
						
						this.generarReporteProcesoAccionEstadosFlujosCajassSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadosFlujosCajas.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxTiposAccionesFormularioEstadosFlujosCajas.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadosFlujosCajasBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estados Flujos CajasES SELECCIONADOS?", "MANTENIMIENTO DE Estados Flujos Cajas", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadosFlujosCajas();
				
						this.actualizarParametrosGeneralEstadosFlujosCajas();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadosflujoscajasReturnGeneral=estadosflujoscajasLogic.procesarAccionEstadosFlujosCajassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadosflujoscajasLogic.getEstadosFlujosCajass(),this.estadosflujoscajasParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadosFlujosCajasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadosFlujosCajas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxTiposAccionesFormularioEstadosFlujosCajas.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadosFlujosCajas();
					
					EstadosFlujosCajasBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadosFlujosCajasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadosFlujosCajas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxTiposAccionesFormularioEstadosFlujosCajas.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadosFlujosCajas(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadosFlujosCajasActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadosFlujosCajas();
			
			if(this.jInternalFrameDetalleFormEstadosFlujosCajas==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadosFlujosCajas> estadosflujoscajassSeleccionados=new ArrayList<EstadosFlujosCajas>();		
			EstadosFlujosCajas estadosflujoscajas=new EstadosFlujosCajas();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadosFlujosCajas(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadosFlujosCajas.getSelectedItem();
			
			
			
			
			estadosflujoscajassSeleccionados=this.getEstadosFlujosCajassSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadosflujoscajassSeleccionados.size()==1) {
				for(EstadosFlujosCajas estadosflujoscajasAux:estadosflujoscajassSeleccionados) {
					estadosflujoscajas=estadosflujoscajasAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadosFlujosCajas();
			
      		//this.finishProcessEstadosFlujosCajas(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadosFlujosCajasReturnGeneral() throws Exception {
		if(this.estadosflujoscajasReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadosflujoscajasReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadosflujoscajasReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadosflujoscajasReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadosflujoscajasReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadosflujoscajasReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadosFlujosCajas(false);
		}
		
		if(this.estadosflujoscajasReturnGeneral.getConRetornoLista() || this.estadosflujoscajasReturnGeneral.getConRetornoObjeto()) {
			if(this.estadosflujoscajasReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadosflujoscajasLogic.setEstadosFlujosCajass(this.estadosflujoscajasReturnGeneral.getEstadosFlujosCajass());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingEstadosFlujosCajas(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadosFlujosCajas() throws Exception {
		
		
	}
	
	public ArrayList<EstadosFlujosCajas> getEstadosFlujosCajassSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadosFlujosCajas> estadosflujoscajassSeleccionados=new ArrayList<EstadosFlujosCajas>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadosFlujosCajas) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadosFlujosCajas estadosflujoscajasAux:estadosflujoscajasLogic.getEstadosFlujosCajass()) {
					if(estadosflujoscajasAux.getIsSelected()) {
						estadosflujoscajassSeleccionados.add(estadosflujoscajasAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadosFlujosCajas estadosflujoscajasAux:this.estadosflujoscajass) {
					if(estadosflujoscajasAux.getIsSelected()) {
						estadosflujoscajassSeleccionados.add(estadosflujoscajasAux);				
					}
				}
			}
			
			if(estadosflujoscajassSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadosflujoscajassSeleccionados.addAll(this.estadosflujoscajasLogic.getEstadosFlujosCajass());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadosflujoscajassSeleccionados.addAll(this.estadosflujoscajass);				
					}
				}
			}
		} else {
			estadosflujoscajassSeleccionados.add(this.estadosflujoscajas);
		}
		
		return estadosflujoscajassSeleccionados;
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
	
	public void generarReporteEstadosFlujosCajassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadosFlujosCajassSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadosFlujosCajassSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadosFlujosCajassSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadosFlujosCajassSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estados Flujos Cajas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadosFlujosCajassSeleccionados() throws Exception {
		ArrayList<EstadosFlujosCajas> estadosflujoscajassSeleccionados=new ArrayList<EstadosFlujosCajas>();		
		
		estadosflujoscajassSeleccionados=this.getEstadosFlujosCajassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadosFlujosCajass("Todos",estadosflujoscajassSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadosFlujosCajassSeleccionados() throws Exception {
		ArrayList<EstadosFlujosCajas> estadosflujoscajassSeleccionados=new ArrayList<EstadosFlujosCajas>();		
		
		estadosflujoscajassSeleccionados=this.getEstadosFlujosCajassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadosFlujosCajass("Todos",estadosflujoscajassSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadosFlujosCajassSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadosFlujosCajas> estadosflujoscajassSeleccionados=new ArrayList<EstadosFlujosCajas>();
		
		estadosflujoscajassSeleccionados=this.getEstadosFlujosCajassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadosFlujosCajass("Todos",estadosflujoscajassSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadosFlujosCajassSeleccionados() throws Exception {
		ArrayList<EstadosFlujosCajas> estadosflujoscajassSeleccionados=new ArrayList<EstadosFlujosCajas>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadosFlujosCajas();
		
		
		estadosflujoscajassSeleccionados=this.getEstadosFlujosCajassSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadosFlujosCajas();
		
		
		//this.generarReporteEstadosFlujosCajass("Todos",estadosflujoscajassSeleccionados ,estadosflujoscajasImplementable,estadosflujoscajasImplementableHome);
	}
	
	public void mostrarImportacionEstadosFlujosCajass() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadosFlujosCajas();
		
		this.abrirFrameImportacionEstadosFlujosCajas();		
		
			
		//this.generarReporteEstadosFlujosCajass("Todos",estadosflujoscajassSeleccionados ,estadosflujoscajasImplementable,estadosflujoscajasImplementableHome);
	}
	
	public void importarEstadosFlujosCajass() throws Exception {		
	
	}
	
	public void exportarEstadosFlujosCajassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadosFlujosCajassSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadosFlujosCajassSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadosFlujosCajassSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estados Flujos Cajas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadosFlujosCajassSeleccionados() throws Exception {
		ArrayList<EstadosFlujosCajas> estadosflujoscajassSeleccionados=new ArrayList<EstadosFlujosCajas>();		
		
		estadosflujoscajassSeleccionados=this.getEstadosFlujosCajassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadosflujoscajas."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadosFlujosCajas(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadosFlujosCajas estadosflujoscajasAux:estadosflujoscajassSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadosFlujosCajas(estadosflujoscajasAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadosflujoscajasAux.setsDetalleGeneralEntityReporte(estadosflujoscajasAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estados Flujos Cajas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadosFlujosCajas(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadosFlujosCajasConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadosFlujosCajasConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadosFlujosCajasConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadosFlujosCajasConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadosFlujosCajasConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadosFlujosCajasConstantesFunciones.LABEL_IDCENTROACTIVIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadosFlujosCajasConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadosFlujosCajasConstantesFunciones.LABEL_CODIGOCENTROACTIVIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadosFlujosCajasConstantesFunciones.LABEL_MENSUAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadosFlujosCajasConstantesFunciones.LABEL_ACUMULADO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadosFlujosCajas(EstadosFlujosCajas estadosflujoscajas,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadosflujoscajas.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadosflujoscajas.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadosflujoscajas.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadosflujoscajas.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadosflujoscajas.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadosflujoscajas.getcentroactividad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadosflujoscajas.getnombre_centro_actividad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadosflujoscajas.getcodigo_centro_actividad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadosflujoscajas.getmensual().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadosflujoscajas.getacumulado().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadosFlujosCajassSeleccionados() throws Exception {
		ArrayList<EstadosFlujosCajas> estadosflujoscajassSeleccionados=new ArrayList<EstadosFlujosCajas>();		
		
		estadosflujoscajassSeleccionados=this.getEstadosFlujosCajassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadosflujoscajas.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadosFlujosCajass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadosFlujosCajas(row);				
				iRow++;
			}				
			
			for(EstadosFlujosCajas estadosflujoscajasAux:estadosflujoscajassSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadosFlujosCajas(estadosflujoscajasAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estados Flujos Cajas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadosFlujosCajassSeleccionados() throws Exception {
		ArrayList<EstadosFlujosCajas> estadosflujoscajassSeleccionados=new ArrayList<EstadosFlujosCajas>();		
		
		estadosflujoscajassSeleccionados=this.getEstadosFlujosCajassSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadosflujoscajas.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadosflujoscajass");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadosflujoscajas");
			//elementRoot.appendChild(element);
		
			for(EstadosFlujosCajas estadosflujoscajasAux:estadosflujoscajassSeleccionados) {
				element = document.createElement("estadosflujoscajas");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadosFlujosCajas(estadosflujoscajasAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estados Flujos Cajas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadosFlujosCajas(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadosFlujosCajasConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadosFlujosCajasConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadosFlujosCajasConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadosFlujosCajasConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadosFlujosCajasConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadosFlujosCajasConstantesFunciones.LABEL_IDCENTROACTIVIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadosFlujosCajasConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadosFlujosCajasConstantesFunciones.LABEL_CODIGOCENTROACTIVIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadosFlujosCajasConstantesFunciones.LABEL_MENSUAL);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadosFlujosCajasConstantesFunciones.LABEL_ACUMULADO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadosFlujosCajas(EstadosFlujosCajas estadosflujoscajas,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadosflujoscajas.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadosflujoscajas.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(estadosflujoscajas.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(estadosflujoscajas.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(estadosflujoscajas.getcentroactividad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(estadosflujoscajas.getnombre_centro_actividad());
		cell = row.createCell(iColumn++);cell.setCellValue(estadosflujoscajas.getcodigo_centro_actividad());
		cell = row.createCell(iColumn++);cell.setCellValue(estadosflujoscajas.getmensual());
		cell = row.createCell(iColumn++);cell.setCellValue(estadosflujoscajas.getacumulado());				
	}
	
	public void setFilaDatosExportarXmlEstadosFlujosCajas(EstadosFlujosCajas estadosflujoscajas,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadosFlujosCajasConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadosflujoscajas.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadosFlujosCajasConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadosflujoscajas.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(EstadosFlujosCajasConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(estadosflujoscajas.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementejercicio_descripcion = document.createElement(EstadosFlujosCajasConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(estadosflujoscajas.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(EstadosFlujosCajasConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(estadosflujoscajas.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementcentroactividad_descripcion = document.createElement(EstadosFlujosCajasConstantesFunciones.IDCENTROACTIVIDAD);
		elementcentroactividad_descripcion.appendChild(document.createTextNode(estadosflujoscajas.getcentroactividad_descripcion()));
		element.appendChild(elementcentroactividad_descripcion);

		Element elementnombre_centro_actividad = document.createElement(EstadosFlujosCajasConstantesFunciones.NOMBRECENTROACTIVIDAD);
		elementnombre_centro_actividad.appendChild(document.createTextNode(estadosflujoscajas.getnombre_centro_actividad().trim()));
		element.appendChild(elementnombre_centro_actividad);

		Element elementcodigo_centro_actividad = document.createElement(EstadosFlujosCajasConstantesFunciones.CODIGOCENTROACTIVIDAD);
		elementcodigo_centro_actividad.appendChild(document.createTextNode(estadosflujoscajas.getcodigo_centro_actividad().trim()));
		element.appendChild(elementcodigo_centro_actividad);

		Element elementmensual = document.createElement(EstadosFlujosCajasConstantesFunciones.MENSUAL);
		elementmensual.appendChild(document.createTextNode(estadosflujoscajas.getmensual().toString().trim()));
		element.appendChild(elementmensual);

		Element elementacumulado = document.createElement(EstadosFlujosCajasConstantesFunciones.ACUMULADO);
		elementacumulado.appendChild(document.createTextNode(estadosflujoscajas.getacumulado().toString().trim()));
		element.appendChild(elementacumulado);
	}
	
	public void generarReporteGroupGenericoEstadosFlujosCajassSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadosFlujosCajas> estadosflujoscajassSeleccionados=new ArrayList<EstadosFlujosCajas>();
		
		estadosflujoscajassSeleccionados=this.getEstadosFlujosCajassSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadosFlujosCajas(estadosflujoscajassSeleccionados);
		
		this.generarReporteEstadosFlujosCajass("Todos",estadosflujoscajassSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadosFlujosCajas(ArrayList<EstadosFlujosCajas> estadosflujoscajassSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadosFlujosCajas estadosflujoscajasAux:estadosflujoscajassSeleccionados) {
				estadosflujoscajasAux.setsDetalleGeneralEntityReporte(estadosflujoscajasAux.toString());
			
				if(sTipoSeleccionar.equals(EstadosFlujosCajasConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					estadosflujoscajasAux.setsDescripcionGeneralEntityReporte1(estadosflujoscajasAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EstadosFlujosCajasConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					estadosflujoscajasAux.setsDescripcionGeneralEntityReporte1(estadosflujoscajasAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EstadosFlujosCajasConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					estadosflujoscajasAux.setsDescripcionGeneralEntityReporte1(estadosflujoscajasAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EstadosFlujosCajasConstantesFunciones.LABEL_IDCENTROACTIVIDAD)) {
					existe=true;
					estadosflujoscajasAux.setsDescripcionGeneralEntityReporte1(estadosflujoscajasAux.getcentroactividad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EstadosFlujosCajasConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD)) {
					existe=true;
					estadosflujoscajasAux.setsDescripcionGeneralEntityReporte1(estadosflujoscajasAux.getnombre_centro_actividad());
				}
				 else if(sTipoSeleccionar.equals(EstadosFlujosCajasConstantesFunciones.LABEL_CODIGOCENTROACTIVIDAD)) {
					existe=true;
					estadosflujoscajasAux.setsDescripcionGeneralEntityReporte1(estadosflujoscajasAux.getcodigo_centro_actividad());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadosFlujosCajasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadosFlujosCajas(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadosFlujosCajas=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadosFlujosCajas=true;
				this.isVisibilidadCeldaGuardarCambiosEstadosFlujosCajas=true;
			}
			
			this.isVisibilidadCeldaModificarEstadosFlujosCajas=false;
			this.isVisibilidadCeldaActualizarEstadosFlujosCajas=false;
			this.isVisibilidadCeldaEliminarEstadosFlujosCajas=false;
			this.isVisibilidadCeldaCancelarEstadosFlujosCajas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadosFlujosCajas=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadosFlujosCajas=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadosFlujosCajas=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadosFlujosCajas=false;
			this.isVisibilidadCeldaGuardarCambiosEstadosFlujosCajas=false;
			this.isVisibilidadCeldaModificarEstadosFlujosCajas=false;
			this.isVisibilidadCeldaActualizarEstadosFlujosCajas=true;
			this.isVisibilidadCeldaEliminarEstadosFlujosCajas=false;
			this.isVisibilidadCeldaCancelarEstadosFlujosCajas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadosFlujosCajas=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadosFlujosCajas=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadosFlujosCajas=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadosFlujosCajas=false;
			this.isVisibilidadCeldaGuardarCambiosEstadosFlujosCajas=false;
			this.isVisibilidadCeldaModificarEstadosFlujosCajas=false;
			this.isVisibilidadCeldaActualizarEstadosFlujosCajas=true;
			this.isVisibilidadCeldaEliminarEstadosFlujosCajas=true;
			this.isVisibilidadCeldaCancelarEstadosFlujosCajas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadosFlujosCajas=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadosFlujosCajas=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadosFlujosCajas=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadosFlujosCajas=false;
			this.isVisibilidadCeldaGuardarCambiosEstadosFlujosCajas=false;
			this.isVisibilidadCeldaModificarEstadosFlujosCajas=false;
			this.isVisibilidadCeldaActualizarEstadosFlujosCajas=true;
			this.isVisibilidadCeldaEliminarEstadosFlujosCajas=false;
			this.isVisibilidadCeldaCancelarEstadosFlujosCajas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadosFlujosCajas=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadosFlujosCajas=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadosFlujosCajas=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadosFlujosCajas=true;
			this.isVisibilidadCeldaGuardarCambiosEstadosFlujosCajas=true;
			this.isVisibilidadCeldaModificarEstadosFlujosCajas=false;
			this.isVisibilidadCeldaActualizarEstadosFlujosCajas=false;
			this.isVisibilidadCeldaEliminarEstadosFlujosCajas=false;
			this.isVisibilidadCeldaCancelarEstadosFlujosCajas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadosFlujosCajas=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadosFlujosCajas=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadosFlujosCajas=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadosFlujosCajas=false;
			this.isVisibilidadCeldaGuardarCambiosEstadosFlujosCajas=false;
			this.isVisibilidadCeldaActualizarEstadosFlujosCajas=false;
			this.isVisibilidadCeldaEliminarEstadosFlujosCajas=false;
			this.isVisibilidadCeldaCancelarEstadosFlujosCajas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadosFlujosCajas=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadosFlujosCajas=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadosFlujosCajas=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadosFlujosCajas=false;
			this.isVisibilidadCeldaGuardarCambiosEstadosFlujosCajas=false;
			this.isVisibilidadCeldaModificarEstadosFlujosCajas=true;
			this.isVisibilidadCeldaActualizarEstadosFlujosCajas=false;
			this.isVisibilidadCeldaEliminarEstadosFlujosCajas=false;
			this.isVisibilidadCeldaCancelarEstadosFlujosCajas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadosFlujosCajas=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadosFlujosCajas=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadosFlujosCajasJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadosFlujosCajas=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadosFlujosCajas=true;
			this.isVisibilidadCeldaGuardarCambiosEstadosFlujosCajas=true;
		} else {
			this.actualizarEstadoPanelsEstadosFlujosCajas(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadosFlujosCajas=false;
			//this.isVisibilidadCeldaVerFormEstadosFlujosCajas=false;
			this.isVisibilidadCeldaDuplicarEstadosFlujosCajas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadosflujoscajasSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadosFlujosCajas=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadosFlujosCajas=false;
			this.isVisibilidadCeldaGuardarCambiosEstadosFlujosCajas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {
			if(!estadosflujoscajasSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadosFlujosCajas=false;												
			}
			
			this.jButtonCerrarEstadosFlujosCajas.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadosFlujosCajas=false;
		}
		
		if(!this.permiteMantenimiento(this.estadosflujoscajas)) {
			this.isVisibilidadCeldaActualizarEstadosFlujosCajas=false;
			this.isVisibilidadCeldaEliminarEstadosFlujosCajas=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoEstadosFlujosCajas=false;
		this.isVisibilidadCeldaNuevoRelacionesEstadosFlujosCajas=false;
		this.isVisibilidadCeldaGuardarCambiosEstadosFlujosCajas=false;
		//this.isVisibilidadCeldaModificarEstadosFlujosCajas=true;
		this.isVisibilidadCeldaActualizarEstadosFlujosCajas=false;
		this.isVisibilidadCeldaEliminarEstadosFlujosCajas=false;
		//this.isVisibilidadCeldaCancelarEstadosFlujosCajas=true;			
		this.isVisibilidadCeldaGuardarEstadosFlujosCajas=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadosFlujosCajas() {
	}
	
	public void actualizarEstadoPanelsEstadosFlujosCajas(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadosFlujosCajas!=null) {
				this.jScrollPanelDatosEdicionEstadosFlujosCajas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadosFlujosCajas!=null) {
				this.jTabbedPaneBusquedasEstadosFlujosCajas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadosFlujosCajas!=null) {
				this.jScrollPanelDatosEstadosFlujosCajas.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadosFlujosCajas!=null) {
				this.jPanelPaginacionEstadosFlujosCajas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadosFlujosCajas!=null) {
				this.jPanelParametrosReportesEstadosFlujosCajas.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadosFlujosCajas!=null) {
				this.jScrollPanelDatosEdicionEstadosFlujosCajas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadosFlujosCajas!=null) {
				this.jTabbedPaneBusquedasEstadosFlujosCajas.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadosFlujosCajas!=null) {
				this.jScrollPanelDatosEstadosFlujosCajas.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadosFlujosCajas!=null) {
				this.jPanelPaginacionEstadosFlujosCajas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadosFlujosCajas!=null) {
				this.jPanelParametrosReportesEstadosFlujosCajas.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadosFlujosCajas!=null) {
				this.jScrollPanelDatosEdicionEstadosFlujosCajas.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadosFlujosCajas!=null) {
				this.jTabbedPaneBusquedasEstadosFlujosCajas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadosFlujosCajas!=null) {
				this.jScrollPanelDatosEstadosFlujosCajas.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadosFlujosCajas!=null) {
				this.jPanelPaginacionEstadosFlujosCajas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadosFlujosCajas!=null) {
				this.jPanelParametrosReportesEstadosFlujosCajas.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadosFlujosCajas!=null) {
				this.jScrollPanelDatosEdicionEstadosFlujosCajas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadosFlujosCajas!=null) {
				this.jTabbedPaneBusquedasEstadosFlujosCajas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadosFlujosCajas!=null) {
				this.jScrollPanelDatosEstadosFlujosCajas.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadosFlujosCajas!=null) {
				this.jPanelPaginacionEstadosFlujosCajas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadosFlujosCajas!=null) {
				this.jPanelParametrosReportesEstadosFlujosCajas.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadosFlujosCajas!=null) {
				this.jScrollPanelDatosEdicionEstadosFlujosCajas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadosFlujosCajas!=null) {
				this.jTabbedPaneBusquedasEstadosFlujosCajas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadosFlujosCajas!=null) {
				this.jScrollPanelDatosEstadosFlujosCajas.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadosFlujosCajas!=null) {
				this.jPanelPaginacionEstadosFlujosCajas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadosFlujosCajas!=null) {
				this.jPanelParametrosReportesEstadosFlujosCajas.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadosFlujosCajas!=null) {
				this.jScrollPanelDatosEdicionEstadosFlujosCajas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadosFlujosCajas!=null) {
				this.jTabbedPaneBusquedasEstadosFlujosCajas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadosFlujosCajas!=null) {
				this.jScrollPanelDatosEstadosFlujosCajas.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadosFlujosCajas!=null) {
				this.jPanelPaginacionEstadosFlujosCajas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadosFlujosCajas!=null) {
				this.jPanelParametrosReportesEstadosFlujosCajas.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadosFlujosCajas!=null) {
				this.jScrollPanelDatosEdicionEstadosFlujosCajas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadosFlujosCajas!=null) {
				this.jTabbedPaneBusquedasEstadosFlujosCajas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadosFlujosCajas!=null) {
				this.jScrollPanelDatosEstadosFlujosCajas.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadosFlujosCajas!=null) {
				this.jPanelPaginacionEstadosFlujosCajas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadosFlujosCajas!=null) {
				this.jPanelParametrosReportesEstadosFlujosCajas.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEstadosFlujosCajas!=null) {
					this.jTabbedPaneBusquedasEstadosFlujosCajas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEstadosFlujosCajas!=null) {
				this.jPanelParametrosReportesEstadosFlujosCajas.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadosFlujosCajas!=null) {
				this.jTabbedPaneBusquedasEstadosFlujosCajas.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEstadosFlujosCajas!=null) {
				this.jPanelParametrosReportesEstadosFlujosCajas.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaEstadosFlujosCajas=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaEstadosFlujosCajas) {this.jTabbedPaneBusquedasEstadosFlujosCajas.remove(jPanelBusquedaEstadosFlujosCajasEstadosFlujosCajas);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaEstadosFlujosCajas=isParaEjercicio;
			if(!this.isVisibilidadBusquedaEstadosFlujosCajas) {this.jTabbedPaneBusquedasEstadosFlujosCajas.remove(jPanelBusquedaEstadosFlujosCajasEstadosFlujosCajas);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadBusquedaEstadosFlujosCajas=isParaPeriodo;
			if(!this.isVisibilidadBusquedaEstadosFlujosCajas) {this.jTabbedPaneBusquedasEstadosFlujosCajas.remove(jPanelBusquedaEstadosFlujosCajasEstadosFlujosCajas);}
		}
		
	}

	public void setVisibilidadBusquedasParaCentroActividad(Boolean isParaCentroActividad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCentroActividadNegation=!isParaCentroActividad;

			this.isVisibilidadBusquedaEstadosFlujosCajas=isParaCentroActividad;
			if(!this.isVisibilidadBusquedaEstadosFlujosCajas) {this.jTabbedPaneBusquedasEstadosFlujosCajas.remove(jPanelBusquedaEstadosFlujosCajasEstadosFlujosCajas);}
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
			
			this.inicializarActualizarBindingTablaEstadosFlujosCajas(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadosFlujosCajas() {
		this.updateBorderResaltarBusquedasFormularioEstadosFlujosCajas();
		this.updateVisibilidadBusquedasFormularioEstadosFlujosCajas();
		this.updateHabilitarBusquedasFormularioEstadosFlujosCajas();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadosFlujosCajas() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEstadosFlujosCajas.getComponents().length>0) {
	

		if(this.estadosflujoscajasConstantesFunciones.resaltarBusquedaEstadosFlujosCajasEstadosFlujosCajas!=null) {
			index= this.jTabbedPaneBusquedasEstadosFlujosCajas.indexOfComponent(this.jPanelBusquedaEstadosFlujosCajasEstadosFlujosCajas);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEstadosFlujosCajas.getComponent(index);
				jPanel.setBorder(this.estadosflujoscajasConstantesFunciones.resaltarBusquedaEstadosFlujosCajasEstadosFlujosCajas);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEstadosFlujosCajas() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEstadosFlujosCajas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEstadosFlujosCajas.indexOfComponent(this.jPanelBusquedaEstadosFlujosCajasEstadosFlujosCajas);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEstadosFlujosCajas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.estadosflujoscajasConstantesFunciones.mostrarBusquedaEstadosFlujosCajasEstadosFlujosCajas);
			if(!this.estadosflujoscajasConstantesFunciones.mostrarBusquedaEstadosFlujosCajasEstadosFlujosCajas && index>-1) {
				this.jTabbedPaneBusquedasEstadosFlujosCajas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEstadosFlujosCajas() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEstadosFlujosCajas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEstadosFlujosCajas.indexOfComponent(this.jPanelBusquedaEstadosFlujosCajasEstadosFlujosCajas);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEstadosFlujosCajas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.estadosflujoscajasConstantesFunciones.activarBusquedaEstadosFlujosCajasEstadosFlujosCajas);
				this.jTabbedPaneBusquedasEstadosFlujosCajas.setEnabledAt(index,this.estadosflujoscajasConstantesFunciones.activarBusquedaEstadosFlujosCajasEstadosFlujosCajas);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEstadosFlujosCajas(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaEstadosFlujosCajas")) {
			index= this.jTabbedPaneBusquedasEstadosFlujosCajas.indexOfComponent(this.jPanelBusquedaEstadosFlujosCajasEstadosFlujosCajas);

			this.jTabbedPaneBusquedasEstadosFlujosCajas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEstadosFlujosCajas.getComponent(index);

			this.estadosflujoscajasConstantesFunciones.setResaltarBusquedaEstadosFlujosCajasEstadosFlujosCajas(resaltar);

			jPanel.setBorder(this.estadosflujoscajasConstantesFunciones.resaltarBusquedaEstadosFlujosCajasEstadosFlujosCajas);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEstadosFlujosCajas.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEstadosFlujosCajas() throws Exception {

		if(this.jInternalFrameDetalleFormEstadosFlujosCajas==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadosFlujosCajas();
		this.updateVisibilidadResaltarControlesFormularioEstadosFlujosCajas();
		this.updateHabilitarResaltarControlesFormularioEstadosFlujosCajas();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadosFlujosCajas() throws Exception {
		if(this.jInternalFrameDetalleFormEstadosFlujosCajas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadosflujoscajasConstantesFunciones.resaltaridEstadosFlujosCajas!=null && this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {this.jInternalFrameDetalleFormEstadosFlujosCajas.jLabelidEstadosFlujosCajas.setBorder(this.estadosflujoscajasConstantesFunciones.resaltaridEstadosFlujosCajas);}
		if(this.estadosflujoscajasConstantesFunciones.resaltarid_empresaEstadosFlujosCajas!=null && this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_empresaEstadosFlujosCajas.setBorder(this.estadosflujoscajasConstantesFunciones.resaltarid_empresaEstadosFlujosCajas);}
		if(this.estadosflujoscajasConstantesFunciones.resaltarid_ejercicioEstadosFlujosCajas!=null && this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_ejercicioEstadosFlujosCajas.setBorder(this.estadosflujoscajasConstantesFunciones.resaltarid_ejercicioEstadosFlujosCajas);}
		if(this.estadosflujoscajasConstantesFunciones.resaltarid_periodoEstadosFlujosCajas!=null && this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_periodoEstadosFlujosCajas.setBorder(this.estadosflujoscajasConstantesFunciones.resaltarid_periodoEstadosFlujosCajas);}
		if(this.estadosflujoscajasConstantesFunciones.resaltarid_centro_actividadEstadosFlujosCajas!=null && this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_centro_actividadEstadosFlujosCajas.setBorder(this.estadosflujoscajasConstantesFunciones.resaltarid_centro_actividadEstadosFlujosCajas);}
		if(this.estadosflujoscajasConstantesFunciones.resaltarnombre_centro_actividadEstadosFlujosCajas!=null && this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextAreanombre_centro_actividadEstadosFlujosCajas.setBorder(this.estadosflujoscajasConstantesFunciones.resaltarnombre_centro_actividadEstadosFlujosCajas);}
		if(this.estadosflujoscajasConstantesFunciones.resaltarcodigo_centro_actividadEstadosFlujosCajas!=null && this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextFieldcodigo_centro_actividadEstadosFlujosCajas.setBorder(this.estadosflujoscajasConstantesFunciones.resaltarcodigo_centro_actividadEstadosFlujosCajas);}
		if(this.estadosflujoscajasConstantesFunciones.resaltarmensualEstadosFlujosCajas!=null && this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextFieldmensualEstadosFlujosCajas.setBorder(this.estadosflujoscajasConstantesFunciones.resaltarmensualEstadosFlujosCajas);}
		if(this.estadosflujoscajasConstantesFunciones.resaltaracumuladoEstadosFlujosCajas!=null && this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextFieldacumuladoEstadosFlujosCajas.setBorder(this.estadosflujoscajasConstantesFunciones.resaltaracumuladoEstadosFlujosCajas);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadosFlujosCajas() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadosFlujosCajas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
	
		//this.jInternalFrameDetalleFormEstadosFlujosCajas.jLabelidEstadosFlujosCajas.setVisible(this.estadosflujoscajasConstantesFunciones.mostraridEstadosFlujosCajas);
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jPanelidEstadosFlujosCajas.setVisible(this.estadosflujoscajasConstantesFunciones.mostraridEstadosFlujosCajas);
		//this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_empresaEstadosFlujosCajas.setVisible(this.estadosflujoscajasConstantesFunciones.mostrarid_empresaEstadosFlujosCajas);
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jPanelid_empresaEstadosFlujosCajas.setVisible(this.estadosflujoscajasConstantesFunciones.mostrarid_empresaEstadosFlujosCajas);
		//this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_ejercicioEstadosFlujosCajas.setVisible(this.estadosflujoscajasConstantesFunciones.mostrarid_ejercicioEstadosFlujosCajas);
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jPanelid_ejercicioEstadosFlujosCajas.setVisible(this.estadosflujoscajasConstantesFunciones.mostrarid_ejercicioEstadosFlujosCajas);
		//this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_periodoEstadosFlujosCajas.setVisible(this.estadosflujoscajasConstantesFunciones.mostrarid_periodoEstadosFlujosCajas);
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jPanelid_periodoEstadosFlujosCajas.setVisible(this.estadosflujoscajasConstantesFunciones.mostrarid_periodoEstadosFlujosCajas);
		//this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_centro_actividadEstadosFlujosCajas.setVisible(this.estadosflujoscajasConstantesFunciones.mostrarid_centro_actividadEstadosFlujosCajas);
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jPanelid_centro_actividadEstadosFlujosCajas.setVisible(this.estadosflujoscajasConstantesFunciones.mostrarid_centro_actividadEstadosFlujosCajas);
		//this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextAreanombre_centro_actividadEstadosFlujosCajas.setVisible(this.estadosflujoscajasConstantesFunciones.mostrarnombre_centro_actividadEstadosFlujosCajas);
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jPanelnombre_centro_actividadEstadosFlujosCajas.setVisible(this.estadosflujoscajasConstantesFunciones.mostrarnombre_centro_actividadEstadosFlujosCajas);
		//this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextFieldcodigo_centro_actividadEstadosFlujosCajas.setVisible(this.estadosflujoscajasConstantesFunciones.mostrarcodigo_centro_actividadEstadosFlujosCajas);
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jPanelcodigo_centro_actividadEstadosFlujosCajas.setVisible(this.estadosflujoscajasConstantesFunciones.mostrarcodigo_centro_actividadEstadosFlujosCajas);
		//this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextFieldmensualEstadosFlujosCajas.setVisible(this.estadosflujoscajasConstantesFunciones.mostrarmensualEstadosFlujosCajas);
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jPanelmensualEstadosFlujosCajas.setVisible(this.estadosflujoscajasConstantesFunciones.mostrarmensualEstadosFlujosCajas);
		//this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextFieldacumuladoEstadosFlujosCajas.setVisible(this.estadosflujoscajasConstantesFunciones.mostraracumuladoEstadosFlujosCajas);
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jPanelacumuladoEstadosFlujosCajas.setVisible(this.estadosflujoscajasConstantesFunciones.mostraracumuladoEstadosFlujosCajas);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadosFlujosCajas() throws Exception {
		if(this.jInternalFrameDetalleFormEstadosFlujosCajas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadosFlujosCajas!=null) {
	
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jLabelidEstadosFlujosCajas.setEnabled(this.estadosflujoscajasConstantesFunciones.activaridEstadosFlujosCajas);
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_empresaEstadosFlujosCajas.setEnabled(this.estadosflujoscajasConstantesFunciones.activarid_empresaEstadosFlujosCajas);
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_ejercicioEstadosFlujosCajas.setEnabled(this.estadosflujoscajasConstantesFunciones.activarid_ejercicioEstadosFlujosCajas);
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_periodoEstadosFlujosCajas.setEnabled(this.estadosflujoscajasConstantesFunciones.activarid_periodoEstadosFlujosCajas);
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jComboBoxid_centro_actividadEstadosFlujosCajas.setEnabled(this.estadosflujoscajasConstantesFunciones.activarid_centro_actividadEstadosFlujosCajas);
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextAreanombre_centro_actividadEstadosFlujosCajas.setEnabled(this.estadosflujoscajasConstantesFunciones.activarnombre_centro_actividadEstadosFlujosCajas);
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextFieldcodigo_centro_actividadEstadosFlujosCajas.setEnabled(this.estadosflujoscajasConstantesFunciones.activarcodigo_centro_actividadEstadosFlujosCajas);
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextFieldmensualEstadosFlujosCajas.setEnabled(this.estadosflujoscajasConstantesFunciones.activarmensualEstadosFlujosCajas);
		this.jInternalFrameDetalleFormEstadosFlujosCajas.jTextFieldacumuladoEstadosFlujosCajas.setEnabled(this.estadosflujoscajasConstantesFunciones.activaracumuladoEstadosFlujosCajas);
		}
	}
	
		
}