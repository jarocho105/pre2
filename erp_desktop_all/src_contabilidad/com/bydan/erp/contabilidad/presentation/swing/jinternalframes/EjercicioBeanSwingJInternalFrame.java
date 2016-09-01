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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;




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

import com.bydan.erp.contabilidad.util.EjercicioConstantesFunciones;
import com.bydan.erp.contabilidad.util.EjercicioParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.EjercicioParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.EjercicioBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
public class EjercicioBeanSwingJInternalFrame extends EjercicioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EjercicioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Ejercicio> ejercicioValidator = new ClassValidator<Ejercicio>(Ejercicio.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Ejercicio ejercicio;	
	public Ejercicio ejercicioAux;
	public Ejercicio ejercicioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Ejercicio ejercicioTotales;
	public Long idEjercicioActual;
	public Long iIdNuevoEjercicio=0L;
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

	public String sFinalQueryComboAnio="";

	public List<Anio> aniosForeignKey;

	public List<Anio> getaniosForeignKey() {
		return aniosForeignKey;
	}

	public void setaniosForeignKey(List<Anio> aniosForeignKey) {
		this.aniosForeignKey = aniosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Anio anioForeignKey;

	public Anio getanioForeignKey() {
		return anioForeignKey;
	}

	public void setanioForeignKey(Anio anioForeignKey) {
		this.anioForeignKey = anioForeignKey;
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
	
	public Boolean isPermisoTodoEjercicio;
	public Boolean isPermisoNuevoEjercicio;
	public Boolean isPermisoActualizarEjercicio;
	public Boolean isPermisoActualizarOriginalEjercicio;
	public Boolean isPermisoEliminarEjercicio;
	public Boolean isPermisoGuardarCambiosEjercicio;
	public Boolean isPermisoConsultaEjercicio;
	public Boolean isPermisoBusquedaEjercicio;
	public Boolean isPermisoReporteEjercicio;
	public Boolean isPermisoPaginacionMedioEjercicio;
	public Boolean isPermisoPaginacionAltoEjercicio;
	public Boolean isPermisoPaginacionTodoEjercicio;
	public Boolean isPermisoCopiarEjercicio;
	public Boolean isPermisoVerFormEjercicio;
	public Boolean isPermisoDuplicarEjercicio;
	public Boolean isPermisoOrdenEjercicio;
	
	
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
	
	public EjercicioParameterReturnGeneral ejercicioReturnGeneral;
	public EjercicioParameterReturnGeneral ejercicioParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEjercicio=false;
	public Boolean esParaAccionDesdeFormularioEjercicio=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EjercicioSessionBeanAdditional ejercicioSessionBeanAdditional=null;
	
	public EjercicioSessionBeanAdditional getEjercicioSessionBeanAdditional() {
		return this.ejercicioSessionBeanAdditional;
	}
	
	public void setEjercicioSessionBeanAdditional(EjercicioSessionBeanAdditional ejercicioSessionBeanAdditional) {
		try {
			this.ejercicioSessionBeanAdditional=ejercicioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EjercicioBeanSwingJInternalFrameAdditional ejercicioBeanSwingJInternalFrameAdditional=null;
	//public class EjercicioBeanSwingJInternalFrame
	
	public EjercicioBeanSwingJInternalFrameAdditional getEjercicioBeanSwingJInternalFrameAdditional() {
		return this.ejercicioBeanSwingJInternalFrameAdditional;
	}
	
	public void setEjercicioBeanSwingJInternalFrameAdditional(EjercicioBeanSwingJInternalFrameAdditional ejercicioBeanSwingJInternalFrameAdditional) {
		try {
			this.ejercicioBeanSwingJInternalFrameAdditional=ejercicioBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EjercicioLogic ejercicioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Ejercicio ejercicioBean;
	public EjercicioConstantesFunciones ejercicioConstantesFunciones;
	//public EjercicioParameterReturnGeneral ejercicioReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public AnioLogic anioLogic;
	
	//PARAMETROS
	
	
	//public List<Ejercicio> ejercicios;	
	//public List<Ejercicio> ejerciciosEliminados;
	//public List<Ejercicio> ejerciciosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEjercicio=false;
	public Boolean isVisibilidadCeldaDuplicarEjercicio=true;
	public Boolean isVisibilidadCeldaCopiarEjercicio=true;
	public Boolean isVisibilidadCeldaVerFormEjercicio=true;
	public Boolean isVisibilidadCeldaOrdenEjercicio=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEjercicio=false;
	public Boolean isVisibilidadCeldaModificarEjercicio=false;
	public Boolean isVisibilidadCeldaActualizarEjercicio=false;
	public Boolean isVisibilidadCeldaEliminarEjercicio=false;
	public Boolean isVisibilidadCeldaCancelarEjercicio=false;
	public Boolean isVisibilidadCeldaGuardarEjercicio=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEjercicio=false;	
	
	
	public Boolean isVisibilidadBusquedaPorFechaInicio=false;
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoEjercicio() {
		return this.iIdNuevoEjercicio;
	}

	public void setiIdNuevoEjercicio(Long iIdNuevoEjercicio) {
		this.iIdNuevoEjercicio = iIdNuevoEjercicio;
	}
	
	public Long getidEjercicioActual() {
		return this.idEjercicioActual;
	}

	public void setidEjercicioActual(Long idEjercicioActual) {
		this.idEjercicioActual = idEjercicioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Ejercicio getejercicio() {
		return this.ejercicio;
	}

	public void setejercicio(Ejercicio ejercicio) {
		this.ejercicio = ejercicio;
	}
	
	public Ejercicio getejercicioAux() {
		return this.ejercicioAux;
	}

	public void setejercicioAux(Ejercicio ejercicioAux) {
		this.ejercicioAux = ejercicioAux;
	}				
	
	public Ejercicio getejercicioAnterior() {
		return this.ejercicioAnterior;
	}

	public void setejercicioAnterior(Ejercicio ejercicioAnterior) {
		this.ejercicioAnterior = ejercicioAnterior;
	}	
	
	public Ejercicio getejercicioTotales() {
		return this.ejercicioTotales;
	}

	public void setejercicioTotales(Ejercicio ejercicioTotales) {
		this.ejercicioTotales = ejercicioTotales;
	}	
	
	public Ejercicio getejercicioBean() {
		return this.ejercicioBean;
	}

	public void setejercicioBean(Ejercicio ejercicioBean) {
		this.ejercicioBean = ejercicioBean;
	}	
	
	public EjercicioParameterReturnGeneral getejercicioReturnGeneral() {
		return this.ejercicioReturnGeneral;
	}

	public void setejercicioReturnGeneral(EjercicioParameterReturnGeneral ejercicioReturnGeneral) {
		this.ejercicioReturnGeneral = ejercicioReturnGeneral;
	}	
	
	
	public Date fecha_inicioBusquedaPorFechaInicio=new Date();

	public Date getfecha_inicioBusquedaPorFechaInicio() {
		return this.fecha_inicioBusquedaPorFechaInicio;
	}

	public void setfecha_inicioBusquedaPorFechaInicio(Date fecha_inicioBusquedaPorFechaInicio) {
		this.fecha_inicioBusquedaPorFechaInicio = fecha_inicioBusquedaPorFechaInicio;
	}

	public Long id_anioFK_IdAnio=-1L;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EjercicioLogic getEjercicioLogic()	{		
		return ejercicioLogic;
	}

	public void setEjercicioLogic(EjercicioLogic ejercicioLogic) {
		this.ejercicioLogic = ejercicioLogic;
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
	
	public Boolean getIsEsNuevoEjercicio() {
		return isEsNuevoEjercicio;
	}

	public void setIsEsNuevoEjercicio(Boolean isEsNuevoEjercicio) {
		this.isEsNuevoEjercicio = isEsNuevoEjercicio;
	}

	public Boolean getEsParaAccionDesdeFormularioEjercicio() {
		return esParaAccionDesdeFormularioEjercicio;
	}
	
	public void setEsParaAccionDesdeFormularioEjercicio(Boolean esParaAccionDesdeFormularioEjercicio) {
		this.esParaAccionDesdeFormularioEjercicio = esParaAccionDesdeFormularioEjercicio;
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

			if(this.ejercicioSessionBean==null) {
				this.ejercicioSessionBean=new EjercicioSessionBean();
			}

			if(!this.ejercicioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(ejercicioSessionBean.getlidEmpresaActual());
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

	public void cargarCombosAniosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.aniosForeignKey=new ArrayList<Anio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AnioLogic anioLogic=new AnioLogic();

			//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.ejercicioSessionBean==null) {
				this.ejercicioSessionBean=new EjercicioSessionBean();
			}

			if(!this.ejercicioSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

					anioLogic.getTodosAniosWithConnection(sFinalQuery,new Pagination());

					this.aniosForeignKey=anioLogic.getAnios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAnio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getEntityWithConnection(ejercicioSessionBean.getlidAnioActual());
					this.aniosForeignKey.add(anioLogic.getAnio());
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

					if(this.ejercicio!=null) {
						this.ejercicio.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEjercicio!=null) {
						this.jInternalFrameDetalleFormEjercicio.jComboBoxid_empresaEjercicio.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEjercicio.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEjercicio!=null) {
						if(this.jInternalFrameDetalleFormEjercicio.jComboBoxid_empresaEjercicio.getItemCount()>0) {
							this.jInternalFrameDetalleFormEjercicio.jComboBoxid_empresaEjercicio.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEjercicioGenerico)throws Exception
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
				jComboBoxid_empresaEjercicioGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEjercicioGenerico!=null && jComboBoxid_empresaEjercicioGenerico.getItemCount()>0) {
					jComboBoxid_empresaEjercicioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAnioForeignKey(Long idAnioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(anioTemp!=null) {

					if(this.ejercicio!=null) {
						this.ejercicio.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormEjercicio!=null) {
						this.jInternalFrameDetalleFormEjercicio.jComboBoxid_anioEjercicio.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioEjercicio.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormEjercicio!=null) {
						if(this.jInternalFrameDetalleFormEjercicio.jComboBoxid_anioEjercicio.getItemCount()>0) {
							this.jInternalFrameDetalleFormEjercicio.jComboBoxid_anioEjercicio.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioFK_IdAnioEjercicio!=null) {
						jComboBoxid_anioFK_IdAnioEjercicio.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioFK_IdAnioEjercicio!=null) {
							//jComboBoxid_anioFK_IdAnioEjercicio.setSelectedItem(anioTemp);
							if(jComboBoxid_anioFK_IdAnioEjercicio.getItemCount()>0) {
								jComboBoxid_anioFK_IdAnioEjercicio.setSelectedIndex(0);
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

	public String getActualAnioForeignKeyDescripcion(Long idAnioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}


			sDescripcion=AnioConstantesFunciones.getAnioDescripcion(anioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioEjercicioGenerico)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(anioTemp!=null) {
				jComboBoxid_anioEjercicioGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioEjercicioGenerico!=null && jComboBoxid_anioEjercicioGenerico.getItemCount()>0) {
					jComboBoxid_anioEjercicioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Ejercicio ejercicio,JComboBox jComboBoxid_empresaEjercicioGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEjercicioGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEjercicio.jComboBoxid_empresaEjercicio.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEjercicioGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				ejercicio.setid_empresa(empresaAux.getId());
				ejercicio.setempresa_descripcion(EjercicioConstantesFunciones.getEmpresaDescripcion(empresaAux));
				ejercicio.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(Ejercicio ejercicio,JComboBox jComboBoxid_anioEjercicioGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioEjercicioGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormEjercicio.jComboBoxid_anioEjercicio.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioEjercicioGenerico.getSelectedItem();
			}

			if(anioAux!=null && anioAux.getId()!=null) {
				ejercicio.setid_anio(anioAux.getId());
				ejercicio.setanio_descripcion(EjercicioConstantesFunciones.getAnioDescripcion(anioAux));
				ejercicio.setAnio(anioAux);			}
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

					if(!EjercicioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEjercicio!=null) { 
							this.jInternalFrameDetalleFormEjercicio.jComboBoxid_empresaEjercicio.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEjercicio.jComboBoxid_empresaEjercicio.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEjercicio!=null) { 
					}

					if(!EjercicioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAniosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EjercicioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEjercicio!=null) { 
							this.jInternalFrameDetalleFormEjercicio.jComboBoxid_anioEjercicio.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormEjercicio.jComboBoxid_anioEjercicio.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEjercicio!=null) { 
					}

					if(!EjercicioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EjercicioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioFK_IdAnioEjercicio.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioFK_IdAnioEjercicio.addItem(anio);
							}
						}

						if(!EjercicioJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormEjercicio!=null) {
							this.jInternalFrameDetalleFormEjercicio.jComboBoxid_empresaEjercicio.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEjercicio!=null) {
							this.jInternalFrameDetalleFormEjercicio.jComboBoxid_empresaEjercicio.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEjercicio!=null) {
							this.jInternalFrameDetalleFormEjercicio.jComboBoxid_anioEjercicio.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormEjercicio!=null) {
							this.jInternalFrameDetalleFormEjercicio.jComboBoxid_anioEjercicio.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anioFK_IdAnioEjercicio.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioFK_IdAnioEjercicio.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesEjercicio() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EjercicioConstantesFunciones.refrescarForeignKeysDescripcionesEjercicio(this.ejercicioLogic.getEjercicios());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EjercicioConstantesFunciones.refrescarForeignKeysDescripcionesEjercicio(this.ejercicios);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Anio.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//ejercicioLogic.setEjercicios(this.ejercicios);
			ejercicioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EjercicioParameterReturnGeneral getEjercicioParameterGeneral() {
		return this.ejercicioParameterGeneral;
	}
	
	public void setEjercicioParameterGeneral(EjercicioParameterReturnGeneral ejercicioParameterGeneral) {
		this.ejercicioParameterGeneral = ejercicioParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEjercicio() {
		return isPermisoTodoEjercicio;
	}

	public void setIsPermisoTodoEjercicio(Boolean isPermisoTodoEjercicio) {
		this.isPermisoTodoEjercicio = isPermisoTodoEjercicio;
	}

	public Boolean getIsPermisoNuevoEjercicio() {
		return isPermisoNuevoEjercicio;
	}

	public void setIsPermisoNuevoEjercicio(Boolean isPermisoNuevoEjercicio) {
		this.isPermisoNuevoEjercicio = isPermisoNuevoEjercicio;
	}

	public Boolean getIsPermisoActualizarEjercicio() {
		return isPermisoActualizarEjercicio;
	}

	public void setIsPermisoActualizarEjercicio(Boolean isPermisoActualizarEjercicio) {
		this.isPermisoActualizarEjercicio = isPermisoActualizarEjercicio;
	}

	public Boolean getIsPermisoEliminarEjercicio() {
		return isPermisoEliminarEjercicio;
	}

	public void setIsPermisoEliminarEjercicio(Boolean isPermisoEliminarEjercicio) {
		this.isPermisoEliminarEjercicio = isPermisoEliminarEjercicio;
	}

	public Boolean getIsPermisoGuardarCambiosEjercicio() {
		return isPermisoGuardarCambiosEjercicio;
	}

	public void setIsPermisoGuardarCambiosEjercicio(Boolean isPermisoGuardarCambiosEjercicio) {
		this.isPermisoGuardarCambiosEjercicio = isPermisoGuardarCambiosEjercicio;
	}
	
	public Boolean getIsPermisoConsultaEjercicio() {
		return isPermisoConsultaEjercicio;
	}

	public void setIsPermisoConsultaEjercicio(Boolean isPermisoConsultaEjercicio) {
		this.isPermisoConsultaEjercicio = isPermisoConsultaEjercicio;
	}

	public Boolean getIsPermisoBusquedaEjercicio() {
		return isPermisoBusquedaEjercicio;
	}

	public void setIsPermisoBusquedaEjercicio(Boolean isPermisoBusquedaEjercicio) {
		this.isPermisoBusquedaEjercicio = isPermisoBusquedaEjercicio;
	}

	public Boolean getIsPermisoReporteEjercicio() {
		return isPermisoReporteEjercicio;
	}

	public void setIsPermisoReporteEjercicio(Boolean isPermisoReporteEjercicio) {
		this.isPermisoReporteEjercicio = isPermisoReporteEjercicio;
	}
	
	public Boolean getIsPermisoPaginacionMedioEjercicio() {
		return isPermisoPaginacionMedioEjercicio;
	}

	public void setIsPermisoPaginacionMedioEjercicio(Boolean isPermisoPaginacionMedioEjercicio) {
		this.isPermisoPaginacionMedioEjercicio = isPermisoPaginacionMedioEjercicio;
	}
	
	public Boolean getIsPermisoPaginacionTodoEjercicio() {
		return isPermisoPaginacionTodoEjercicio;
	}

	public void setIsPermisoPaginacionTodoEjercicio(Boolean isPermisoPaginacionTodoEjercicio) {
		this.isPermisoPaginacionTodoEjercicio = isPermisoPaginacionTodoEjercicio;
	}
	
	public Boolean getIsPermisoPaginacionAltoEjercicio() {
		return isPermisoPaginacionAltoEjercicio;
	}

	public void setIsPermisoPaginacionAltoEjercicio(Boolean isPermisoPaginacionAltoEjercicio) {
		this.isPermisoPaginacionAltoEjercicio = isPermisoPaginacionAltoEjercicio;
	}
	
	public Boolean getIsPermisoCopiarEjercicio() {
		return isPermisoCopiarEjercicio;
	}

	public void setIsPermisoCopiarEjercicio(Boolean isPermisoCopiarEjercicio) {
		this.isPermisoCopiarEjercicio = isPermisoCopiarEjercicio;
	}
	
	public Boolean getIsPermisoVerFormEjercicio() {
		return isPermisoVerFormEjercicio;
	}

	public void setIsPermisoVerFormEjercicio(Boolean isPermisoVerFormEjercicio) {
		this.isPermisoVerFormEjercicio = isPermisoVerFormEjercicio;
	}
	
	public Boolean getIsPermisoDuplicarEjercicio() {
		return isPermisoDuplicarEjercicio;
	}

	public void setIsPermisoDuplicarEjercicio(Boolean isPermisoDuplicarEjercicio) {
		this.isPermisoDuplicarEjercicio = isPermisoDuplicarEjercicio;
	}
	
	public Boolean getIsPermisoOrdenEjercicio() {
		return isPermisoOrdenEjercicio;
	}

	public void setIsPermisoOrdenEjercicio(Boolean isPermisoOrdenEjercicio) {
		this.isPermisoOrdenEjercicio = isPermisoOrdenEjercicio;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEjercicio() {
		return isVisibilidadCeldaNuevoEjercicio;
	}

	public void setIsVisibilidadCeldaNuevoEjercicio(Boolean isVisibilidadCeldaNuevoEjercicio) {
		this.isVisibilidadCeldaNuevoEjercicio = isVisibilidadCeldaNuevoEjercicio;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEjercicio() {
		return isVisibilidadCeldaDuplicarEjercicio;
	}

	public void setIsVisibilidadCeldaDuplicarEjercicio(Boolean isVisibilidadCeldaDuplicarEjercicio) {
		this.isVisibilidadCeldaDuplicarEjercicio = isVisibilidadCeldaDuplicarEjercicio;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEjercicio() {
		return isVisibilidadCeldaCopiarEjercicio;
	}

	public void setIsVisibilidadCeldaCopiarEjercicio(Boolean isVisibilidadCeldaCopiarEjercicio) {
		this.isVisibilidadCeldaCopiarEjercicio = isVisibilidadCeldaCopiarEjercicio;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEjercicio() {
		return isVisibilidadCeldaVerFormEjercicio;
	}

	public void setIsVisibilidadCeldaVerFormEjercicio(Boolean isVisibilidadCeldaVerFormEjercicio) {
		this.isVisibilidadCeldaVerFormEjercicio = isVisibilidadCeldaVerFormEjercicio;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEjercicio() {
		return isVisibilidadCeldaOrdenEjercicio;
	}

	public void setIsVisibilidadCeldaOrdenEjercicio(Boolean isVisibilidadCeldaOrdenEjercicio) {
		this.isVisibilidadCeldaOrdenEjercicio = isVisibilidadCeldaOrdenEjercicio;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEjercicio() {
		return isVisibilidadCeldaNuevoRelacionesEjercicio;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEjercicio(Boolean isVisibilidadCeldaNuevoRelacionesEjercicio) {
		this.isVisibilidadCeldaNuevoRelacionesEjercicio = isVisibilidadCeldaNuevoRelacionesEjercicio;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEjercicio() {
		return isVisibilidadCeldaModificarEjercicio;
	}

	public void setIsVisibilidadCeldaModificarEjercicio(Boolean isVisibilidadCeldaModificarEjercicio) {
		this.isVisibilidadCeldaModificarEjercicio = isVisibilidadCeldaModificarEjercicio;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEjercicio() {
		return isVisibilidadCeldaActualizarEjercicio;
	}

	public void setIsVisibilidadCeldaActualizarEjercicio(Boolean isVisibilidadCeldaActualizarEjercicio) {
		this.isVisibilidadCeldaActualizarEjercicio = isVisibilidadCeldaActualizarEjercicio;
	}

	public Boolean getIsVisibilidadCeldaEliminarEjercicio() {
		return isVisibilidadCeldaEliminarEjercicio;
	}

	public void setIsVisibilidadCeldaEliminarEjercicio(Boolean isVisibilidadCeldaEliminarEjercicio) {
		this.isVisibilidadCeldaEliminarEjercicio = isVisibilidadCeldaEliminarEjercicio;
	}

	public Boolean getIsVisibilidadCeldaCancelarEjercicio() {
		return isVisibilidadCeldaCancelarEjercicio;
	}

	public void setIsVisibilidadCeldaCancelarEjercicio(Boolean isVisibilidadCeldaCancelarEjercicio) {
		this.isVisibilidadCeldaCancelarEjercicio = isVisibilidadCeldaCancelarEjercicio;
	}

	public Boolean getIsVisibilidadCeldaGuardarEjercicio() {
		return isVisibilidadCeldaGuardarEjercicio;
	}

	public void setIsVisibilidadCeldaGuardarEjercicio(Boolean isVisibilidadCeldaGuardarEjercicio) {
		this.isVisibilidadCeldaGuardarEjercicio = isVisibilidadCeldaGuardarEjercicio;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEjercicio() {
		return isVisibilidadCeldaGuardarCambiosEjercicio;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEjercicio(Boolean isVisibilidadCeldaGuardarCambiosEjercicio) {
		this.isVisibilidadCeldaGuardarCambiosEjercicio = isVisibilidadCeldaGuardarCambiosEjercicio;
	}
		
	public EjercicioSessionBean getejercicioSessionBean() {
		return this.ejercicioSessionBean;
	}
	
	public void setejercicioSessionBean(EjercicioSessionBean ejercicioSessionBean) {
		this.ejercicioSessionBean=ejercicioSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorFechaInicio() {
		return this.isVisibilidadBusquedaPorFechaInicio;
	}

	public void setisVisibilidadBusquedaPorFechaInicio(Boolean isVisibilidadBusquedaPorFechaInicio) {
		this.isVisibilidadBusquedaPorFechaInicio=isVisibilidadBusquedaPorFechaInicio;
	}

	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEjercicio(Ejercicio ejercicio)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(ejercicio,null);
				this.setActualParaGuardarAnioForeignKey(ejercicio,null);
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
	
	public void bugActualizarReferenciaActual(Ejercicio ejercicio,Ejercicio ejercicioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEjercicio(ejercicio);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		ejercicioAux.setId(ejercicio.getId());
		ejercicioAux.setVersionRow(ejercicio.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEjercicio();
		
			int intSelectedRow = this.jTableDatosEjercicio.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicio =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.ejercicio =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EjercicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEjercicio(this.ejercicio,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEjercicio(this.ejercicio);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = ejercicioValidator.getInvalidValues(this.ejercicio);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			ejercicioLogic.setDatosCliente(datosCliente);
			ejercicioLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				ejercicioAux=new  Ejercicio();
				
				ejercicioAux.setIsNew(true);
				ejercicioAux.setIsChanged(true);
				
				ejercicioAux.setEjercicioOriginal(this.ejercicio);
				
				ejercicioAux.setId(this.ejercicio.getId());	
				ejercicioAux.setVersionRow(this.ejercicio.getVersionRow());	
				ejercicioAux.setid_empresa(this.ejercicio.getid_empresa());	
				ejercicioAux.setid_anio(this.ejercicio.getid_anio());	
				ejercicioAux.setfecha_inicio(this.ejercicio.getfecha_inicio());	
				ejercicioAux.setfecha_fin(this.ejercicio.getfecha_fin());	
				ejercicioAux.setesta_activo(this.ejercicio.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.ejercicioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.ejercicioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(ejercicioAux,ejercicioLogic.getEjercicios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ejercicioAux,ejercicios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.ejercicioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.ejercicioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ejercicioLogic.saveEjercicios();//WithConnection
						//ejercicioLogic.getSetVersionRowEjercicios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.ejercicio,ejercicioAux);
					
					this.refrescarForeignKeysDescripcionesEjercicio();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				ejercicioAux=new  Ejercicio();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.ejercicioSessionBean.getEsGuardarRelacionado() 
					|| (this.ejercicioSessionBean.getEsGuardarRelacionado() && this.ejercicio.getId()>=0)) {
						
					ejercicioAux.setIsNew(false);
				}
				
				ejercicioAux.setIsDeleted(false);
			
				ejercicioAux.setId(this.ejercicio.getId());	
				ejercicioAux.setVersionRow(this.ejercicio.getVersionRow());	
				ejercicioAux.setid_empresa(this.ejercicio.getid_empresa());	
				ejercicioAux.setid_anio(this.ejercicio.getid_anio());	
				ejercicioAux.setfecha_inicio(this.ejercicio.getfecha_inicio());	
				ejercicioAux.setfecha_fin(this.ejercicio.getfecha_fin());	
				ejercicioAux.setesta_activo(this.ejercicio.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(ejercicioAux,ejercicioLogic.getEjercicios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ejercicioAux,ejercicios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.ejercicioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.ejercicioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ejercicioLogic.saveEjercicios();//WithConnection
						//ejercicioLogic.getSetVersionRowEjercicios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.ejercicio,ejercicioAux);
					
					this.refrescarForeignKeysDescripcionesEjercicio();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				ejercicioAux=new  Ejercicio();
				
				ejercicioAux.setIsNew(false);
				ejercicioAux.setIsChanged(false);
				
				ejercicioAux.setIsDeleted(true);
				
				ejercicioAux.setId(this.ejercicio.getId());	
				ejercicioAux.setVersionRow(this.ejercicio.getVersionRow());	
				ejercicioAux.setid_empresa(this.ejercicio.getid_empresa());	
				ejercicioAux.setid_anio(this.ejercicio.getid_anio());	
				ejercicioAux.setfecha_inicio(this.ejercicio.getfecha_inicio());	
				ejercicioAux.setfecha_fin(this.ejercicio.getfecha_fin());	
				ejercicioAux.setesta_activo(this.ejercicio.getesta_activo());	
				
				if(this.ejercicioSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.ejercicioAux.getId()>=0) {	
						this.ejerciciosEliminados.add(ejercicioAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(ejercicioAux,ejercicioLogic.getEjercicios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ejercicioAux,ejercicios);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.ejercicioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.ejercicioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ejercicioLogic.saveEjercicios();//WithConnection
						//ejercicioLogic.getSetVersionRowEjercicios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioLogic.getEjercicios().addAll(this.ejerciciosEliminados);
					
					ejercicioLogic.saveEjercicios();//WithConnection
					//ejercicioLogic.getSetVersionRowEjercicios();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesEjercicio();
				
				this.ejerciciosEliminados= new ArrayList<Ejercicio>();		
			}
			
			if(this.ejercicioSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ejercicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Ejercicio GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Ejercicio",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.ejercicio=ejercicioAux;
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
      		//this.finishProcessEjercicio();
      	}
		
	}	
	
	public void actualizarRelaciones(Ejercicio ejercicioLocal) throws Exception {
		
		if(this.ejercicioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Ejercicio ejercicioLocal) throws Exception {	
		if(this.ejercicioSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				ejercicioLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				ejercicioLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEjercicioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEjercicio.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ejercicio =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.ejercicio =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = ejercicioValidator.getInvalidValues(this.ejercicio);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Ejercicio ejercicio,List<Ejercicio> ejercicios) throws Exception {
		try	{		
			EjercicioConstantesFunciones.actualizarLista(ejercicio,ejercicios,this.ejercicioSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Ejercicio ejercicio,List<Ejercicio> ejercicios) throws Exception {
		try	{			
			EjercicioConstantesFunciones.actualizarSelectedLista(ejercicio,ejercicios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Ejercicio> ejerciciosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ejerciciosLocal=this.ejercicioLogic.getEjercicios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ejerciciosLocal=this.ejercicios;
			}
			//ARCHITECTURE
		
			for(Ejercicio ejercicioLocal:ejerciciosLocal) {
				if(this.permiteMantenimiento(ejercicioLocal) && ejercicioLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EjercicioConstantesFunciones.getEjercicioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EjercicioConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEjercicio.jLabelid_empresaEjercicio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EjercicioConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEjercicio.jLabelid_anioEjercicio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EjercicioConstantesFunciones.FECHAINICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEjercicio.jLabelfecha_inicioEjercicio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EjercicioConstantesFunciones.FECHAFIN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEjercicio.jLabelfecha_finEjercicio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EjercicioConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEjercicio.jLabelesta_activoEjercicio,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEjercicio!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEjercicio.jLabelid_empresaEjercicio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEjercicio.jLabelid_anioEjercicio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEjercicio.jLabelfecha_inicioEjercicio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEjercicio.jLabelfecha_finEjercicio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEjercicio.jLabelesta_activoEjercicio,"");
		
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
		this.iIdNuevoEjercicio--;	
		
		
		this.ejercicioAux=new Ejercicio();
		
		this.ejercicioAux.setId(this.iIdNuevoEjercicio);
		this.ejercicioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ejercicioLogic.getEjercicios().add(this.ejercicioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.ejercicios.add(this.ejercicioAux);
		}
		//ARCHITECTURE
		
		this.ejercicio=this.ejercicioAux;
		
		if(EjercicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEjercicio(this.ejercicio);
			this.setVariablesObjetoActualToFormularioForeignKeyEjercicio(this.ejercicio);
		}
				
		//this.setDefaultControlesEjercicio();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEjercicio();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEjercicio();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEjercicio();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEjercicio(this.ejercicioBean,this.ejercicio,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEjercicio(this.ejercicio);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EjercicioConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.ejercicioSessionBean.getConGuardarRelaciones()) {
			classes=EjercicioConstantesFunciones.getClassesRelationshipsOfEjercicio(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.ejercicioReturnGeneral=ejercicioLogic.procesarEventosEjerciciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ejercicioLogic.getEjercicios(),this.ejercicio,this.ejercicioParameterGeneral,this.isEsNuevoEjercicio,classes);//this.ejercicioLogic.getEjercicio()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEjercicio(this.ejercicioReturnGeneral,this.ejercicioBean,false);
		
		if(this.ejercicioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEjercicio(this.ejercicioReturnGeneral.getEjercicio());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEjercicio(this.ejercicioReturnGeneral.getEjercicio());
		}
		
		if(this.ejercicioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEjercicio(this.ejercicioReturnGeneral.getEjercicio(),classes);//this.ejercicioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEjercicio(this.ejercicio,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEjercicio();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEjercicio();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EjercicioBeanSwingJInternalFrameAdditional.RecargarFormEjercicio(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEjercicio(false);
						
			if(ejercicioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EjercicioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEjercicio();
			}
			
			this.actualizarVisualTableDatosEjercicio();
			
			this.jTableDatosEjercicio.setRowSelectionInterval(this.getIndiceNuevoEjercicio(), this.getIndiceNuevoEjercicio());
			
			this.seleccionarFilaTablaEjercicioActual();
						
			this.actualizarEstadoCeldasBotonesEjercicio("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEjercicio(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEjercicio.jDateChooserfecha_inicioEjercicio.setEnabled(isHabilitar && this.ejercicioConstantesFunciones.activarfecha_inicioEjercicio);
		this.jInternalFrameDetalleFormEjercicio.jDateChooserfecha_finEjercicio.setEnabled(isHabilitar && this.ejercicioConstantesFunciones.activarfecha_finEjercicio);
		this.jInternalFrameDetalleFormEjercicio.jCheckBoxesta_activoEjercicio.setEnabled(isHabilitar && this.ejercicioConstantesFunciones.activaresta_activoEjercicio);	
		//
		this.jInternalFrameDetalleFormEjercicio.jComboBoxid_empresaEjercicio.setEnabled(isHabilitar && this.ejercicioConstantesFunciones.activarid_empresaEjercicio);
		this.jInternalFrameDetalleFormEjercicio.jComboBoxid_anioEjercicio.setEnabled(isHabilitar && this.ejercicioConstantesFunciones.activarid_anioEjercicio);
	};
	
	public void setDefaultControlesEjercicio() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEjercicio(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.ejercicioSessionBean.setConGuardarRelaciones(true);			
			this.ejercicioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEjercicio.jTabbedPaneRelacionesEjercicio.setVisible(true);
			
					
		} else {
			//this.ejercicioSessionBean.setConGuardarRelaciones(false);			
			this.ejercicioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEjercicio.jTabbedPaneRelacionesEjercicio.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEjercicio() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Ejercicio ejercicioAux:this.ejercicioLogic.getEjercicios()) {
				if(ejercicioAux.getId().equals(this.iIdNuevoEjercicio)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Ejercicio ejercicioAux:this.ejercicios) {
				if(ejercicioAux.getId().equals(this.iIdNuevoEjercicio)) {
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
	
	public int getIndiceActualEjercicio(Ejercicio ejercicio,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Ejercicio ejercicioAux:this.ejercicioLogic.getEjercicios()) {
				if(ejercicioAux.getId().equals(ejercicio.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Ejercicio ejercicioAux:this.ejercicios) {
				if(ejercicioAux.getId().equals(ejercicio.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEjercicio(Ejercicio ejercicioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Ejercicio ejercicioAux:this.ejercicioLogic.getEjercicios()) {
				if(ejercicioAux.getEjercicioOriginal().getId().equals(ejercicioOriginal.getId())) {
					existe=true;
					ejercicioOriginal.setId(ejercicioAux.getId());
					ejercicioOriginal.setVersionRow(ejercicioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Ejercicio ejercicioAux:this.ejercicios) {
				if(ejercicioAux.getEjercicioOriginal().getId().equals(ejercicioOriginal.getId())) {
					existe=true;
					ejercicioOriginal.setId(ejercicioAux.getId());
					ejercicioOriginal.setVersionRow(ejercicioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEjercicio(Boolean esParaCancelar) throws Exception {
		ejerciciosAux=new ArrayList<Ejercicio>();
		ejercicioAux=new Ejercicio();
		
		if(!this.ejercicioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Ejercicio ejercicioAux:this.ejercicioLogic.getEjercicios()) {
					if(ejercicioAux.getId()<0) {
						ejerciciosAux.add(ejercicioAux);
					}		
				}
				this.iIdNuevoEjercicio=0L;
				this.ejercicioLogic.getEjercicios().removeAll(ejerciciosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Ejercicio ejercicioAux:this.ejercicios) {
					if(ejercicioAux.getId()<0) {
						ejerciciosAux.add(ejercicioAux);
					}		
				}
				this.iIdNuevoEjercicio=0L;
				this.ejercicios.removeAll(ejerciciosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEjercicio 
					&& this.ejercicioLogic.getEjercicios().size()>0
					) {
					ejercicioAux=this.ejercicioLogic.getEjercicios().get(this.ejercicioLogic.getEjercicios().size() - 1);
				
					if(ejercicioAux.getId()<0) {
						this.ejercicioLogic.getEjercicios().remove(ejercicioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEjercicio && this.ejercicios.size()>0) {
					ejercicioAux=this.ejercicios.get(this.ejercicios.size() - 1);
				
					if(ejercicioAux.getId()<0) {
						this.ejercicios.remove(ejercicioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEjercicio(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(ejercicio.getId()<0) {
				this.ejercicioLogic.getEjercicios().remove(this.ejercicio);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(ejercicio.getId()<0) {
				this.ejercicios.remove(this.ejercicio);
			}
		}			
	}
	
	public void setEstadosInicialesEjercicio(List<Ejercicio> ejerciciosAux) throws Exception {
		EjercicioConstantesFunciones.setEstadosInicialesEjercicio(ejerciciosAux);
	}
	
	public void setEstadosInicialesEjercicio(Ejercicio ejercicioAux) throws Exception {
		EjercicioConstantesFunciones.setEstadosInicialesEjercicio(ejercicioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEjercicioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEjercicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEjercicioActual()) {
				if(!this.isEsNuevoEjercicio) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEjercicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEjercicio=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEjercicioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Ejercicio ?", "MANTENIMIENTO DE Ejercicio", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEjercicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Ejercicio ejercicio) throws Exception {
		EjercicioConstantesFunciones.seleccionarAsignar(this.ejercicio,ejercicio);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEjercicio=this.isPermisoActualizarOriginalEjercicio;
			
			
			this.seleccionarAsignar(ejercicio);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EjercicioConstantesFunciones.quitarEspaciosEjercicio(this.ejercicio,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEjercicio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.ejercicioSessionBean.setsFuncionBusquedaRapida(this.ejercicioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEjercicio) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEjercicio(esParaCancelar);				
				this.cancelarNuevoEjercicio(esParaCancelar);								
			}
			
			this.ejercicio=new Ejercicio();
			
			this.inicializarEjercicio();
			
			this.actualizarEstadoCeldasBotonesEjercicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEjercicio() throws Exception {
		try {
			EjercicioConstantesFunciones.inicializarEjercicio(this.ejercicio);
			
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
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.ejercicioLogic.getEjercicios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEjercicios(String sAccionBusqueda,List<Ejercicio> ejerciciosParaReportes) throws Exception {
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
					sPathReporteFinal="Ejercicio"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EjercicioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EjercicioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Ejercicio"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Ejercicios");		
		parameters.put("busquedapor", EjercicioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEjercicio=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EjercicioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EjercicioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEjercicio=new JRBeanArrayDataSource(EjercicioJInternalFrame.TraerEjercicioBeans(ejerciciosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEjercicio);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EjercicioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EjercicioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EjercicioBean.TraerEjercicioBeans(ejerciciosParaReportes).toArray()));
							
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
				this.generarExcelReporteEjercicios(sAccionBusqueda,sTipoArchivoReporte,ejerciciosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEjercicios(sAccionBusqueda,sTipoArchivoReporte,ejerciciosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEjercicioActionPerformed(null);
					//this.generarExcelReporteEjercicios(sAccionBusqueda,sTipoArchivoReporte,ejerciciosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEjercicios(sAccionBusqueda,sTipoArchivoReporte,ejerciciosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEjercicios(sAccionBusqueda,sTipoArchivoReporte,ejerciciosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEjercicios(sAccionBusqueda,sTipoArchivoReporte,ejerciciosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEjercicios(String sAccionBusqueda,String sTipoArchivoReporte,List<Ejercicio> ejerciciosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ejercicio";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Ejercicios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEjercicio("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Ejercicio ejercicio : ejerciciosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EjercicioConstantesFunciones.generarExcelReporteDataEjercicio("NORMAL",row,workbook,ejercicio,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ejercicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEjercicio(String sTipo,Row row,Workbook workbook) {
		
		EjercicioConstantesFunciones.generarExcelReporteHeaderEjercicio(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEjercicios(String sAccionBusqueda,String sTipoArchivoReporte,List<Ejercicio> ejerciciosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ejercicio_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Ejercicios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Ejercicio ejercicio : ejerciciosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EjercicioConstantesFunciones.getEjercicioDescripcion(ejercicio));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EjercicioConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EjercicioConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ejercicio.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EjercicioConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EjercicioConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ejercicio.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EjercicioConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EjercicioConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ejercicio.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EjercicioConstantesFunciones.LABEL_FECHAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EjercicioConstantesFunciones.LABEL_FECHAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ejercicio.getfecha_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EjercicioConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EjercicioConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(ejercicio.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ejercicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEjercicios(String sAccionBusqueda,String sTipoArchivoReporte,List<Ejercicio> ejerciciosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Ejercicio> ejerciciosRespaldo=null;
		
		classes=EjercicioConstantesFunciones.getClassesRelationshipsOfEjercicio(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.ejercicioLogic.setDatosCliente(this.datosCliente);
		this.ejercicioLogic.setDatosDeep(this.datosDeep);
		this.ejercicioLogic.setIsConDeep(true);
		
		ejerciciosRespaldo=this.ejercicioLogic.getEjercicios();
		
		this.ejercicioLogic.setEjercicios(ejerciciosParaReportes);	
		this.ejercicioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		ejerciciosParaReportes=this.ejercicioLogic.getEjercicios();
		this.ejercicioLogic.setEjercicios(ejerciciosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ejercicio_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Ejercicios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEjercicio("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Ejercicio ejercicio : ejerciciosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEjercicio("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EjercicioConstantesFunciones.generarExcelReporteDataEjercicio("NORMAL",row,workbook,ejercicio,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EjercicioConstantesFunciones.getEjercicioDescripcion(ejercicio));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ejercicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEjercicio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEjercicio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEjercicio.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEjercicio.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEjercicio() throws Exception {		
		this.startProcessEjercicio(true);
	}
	
	public void startProcessEjercicio(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEjercicio ,this.jPanelParametrosReportesEjercicio, this.jScrollPanelDatosEjercicio,this.jPanelPaginacionEjercicio, this.jScrollPanelDatosEdicionEjercicio, this.jPanelAccionesEjercicio,this.jPanelAccionesFormularioEjercicio,this.jmenuBarEjercicio,this.jmenuBarDetalleEjercicio,this.jTtoolBarEjercicio,this.jTtoolBarDetalleEjercicio);		
		
		final JTabbedPane jTabbedPaneBusquedasEjercicio=this.jTabbedPaneBusquedasEjercicio; 
		
		final JPanel jPanelParametrosReportesEjercicio=this.jPanelParametrosReportesEjercicio;
		//final JScrollPane jScrollPanelDatosEjercicio=this.jScrollPanelDatosEjercicio;
		final JTable jTableDatosEjercicio=this.jTableDatosEjercicio;		
		final JPanel jPanelPaginacionEjercicio=this.jPanelPaginacionEjercicio;
		//final JScrollPane jScrollPanelDatosEdicionEjercicio=this.jScrollPanelDatosEdicionEjercicio;
		final JPanel jPanelAccionesEjercicio=this.jPanelAccionesEjercicio;
		
		JPanel jPanelCamposAuxiliarEjercicio=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEjercicio=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEjercicio!=null) {
			jPanelCamposAuxiliarEjercicio=this.jInternalFrameDetalleFormEjercicio.jPanelCamposEjercicio;
			jPanelAccionesFormularioAuxiliarEjercicio=this.jInternalFrameDetalleFormEjercicio.jPanelAccionesFormularioEjercicio;
		}
		
		final JPanel jPanelCamposEjercicio=jPanelCamposAuxiliarEjercicio;
		final JPanel jPanelAccionesFormularioEjercicio=jPanelAccionesFormularioAuxiliarEjercicio;
		
		
		final JMenuBar jmenuBarEjercicio=this.jmenuBarEjercicio;
		final JToolBar jTtoolBarEjercicio=this.jTtoolBarEjercicio;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEjercicio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEjercicio=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEjercicio!=null) {
			jmenuBarDetalleAuxiliarEjercicio=this.jInternalFrameDetalleFormEjercicio.jmenuBarDetalleEjercicio;
			jTtoolBarDetalleAuxiliarEjercicio=this.jInternalFrameDetalleFormEjercicio.jTtoolBarDetalleEjercicio;
		}
		
		final JMenuBar jmenuBarDetalleEjercicio=jmenuBarDetalleAuxiliarEjercicio;
		final JToolBar jTtoolBarDetalleEjercicio=jTtoolBarDetalleAuxiliarEjercicio;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEjercicio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEjercicio;
			processRunnable.jTableDatos=jTableDatosEjercicio;
			processRunnable.jPanelCampos=jPanelCamposEjercicio;
			processRunnable.jPanelPaginacion=jPanelPaginacionEjercicio;
			processRunnable.jPanelAcciones=jPanelAccionesEjercicio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEjercicio;
			
			
			processRunnable.jmenuBar=jmenuBarEjercicio;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEjercicio;
			processRunnable.jTtoolBar=jTtoolBarEjercicio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEjercicio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEjercicio ,jPanelParametrosReportesEjercicio,jTableDatosEjercicio, /*jScrollPanelDatosEjercicio,*/jPanelCamposEjercicio,jPanelPaginacionEjercicio, /*jScrollPanelDatosEdicionEjercicio,*/ jPanelAccionesEjercicio,jPanelAccionesFormularioEjercicio,jmenuBarEjercicio,jmenuBarDetalleEjercicio,jTtoolBarEjercicio,jTtoolBarDetalleEjercicio);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEjercicio ,jPanelParametrosReportesEjercicio, jScrollPanelDatosEjercicio,jPanelPaginacionEjercicio, jScrollPanelDatosEdicionEjercicio, jPanelAccionesEjercicio,jPanelAccionesFormularioEjercicio,jmenuBarEjercicio,jmenuBarDetalleEjercicio,jTtoolBarEjercicio,jTtoolBarDetalleEjercicio);
						
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
	
	public void finishProcessEjercicio() {// throws Exception 
		this.finishProcessEjercicio(true);
	}
	
	public void finishProcessEjercicio(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEjercicio ,this.jPanelParametrosReportesEjercicio, this.jScrollPanelDatosEjercicio,this.jPanelPaginacionEjercicio, this.jScrollPanelDatosEdicionEjercicio, this.jPanelAccionesEjercicio,this.jPanelAccionesFormularioEjercicio,this.jmenuBarEjercicio,this.jmenuBarDetalleEjercicio,this.jTtoolBarEjercicio,this.jTtoolBarDetalleEjercicio);		
		
		final JTabbedPane jTabbedPaneBusquedasEjercicio=this.jTabbedPaneBusquedasEjercicio; 
		
		final JPanel jPanelParametrosReportesEjercicio=this.jPanelParametrosReportesEjercicio;
		//final JScrollPane jScrollPanelDatosEjercicio=this.jScrollPanelDatosEjercicio;
		final JTable jTableDatosEjercicio=this.jTableDatosEjercicio;		
		final JPanel jPanelPaginacionEjercicio=this.jPanelPaginacionEjercicio;
		//final JScrollPane jScrollPanelDatosEdicionEjercicio=this.jScrollPanelDatosEdicionEjercicio;
		final JPanel jPanelAccionesEjercicio=this.jPanelAccionesEjercicio;
		
		JPanel jPanelCamposAuxiliarEjercicio=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEjercicio=new JPanel();
		
		if(this.jInternalFrameDetalleFormEjercicio!=null) {
			jPanelCamposAuxiliarEjercicio=this.jInternalFrameDetalleFormEjercicio.jPanelCamposEjercicio;
			jPanelAccionesFormularioAuxiliarEjercicio=this.jInternalFrameDetalleFormEjercicio.jPanelAccionesFormularioEjercicio;
		}
		
		final JPanel jPanelCamposEjercicio=jPanelCamposAuxiliarEjercicio;
		final JPanel jPanelAccionesFormularioEjercicio=jPanelAccionesFormularioAuxiliarEjercicio;
		
		
		final JMenuBar jmenuBarEjercicio=this.jmenuBarEjercicio;		
		final JToolBar jTtoolBarEjercicio=this.jTtoolBarEjercicio;
				
		JMenuBar jmenuBarDetalleAuxiliarEjercicio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEjercicio=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEjercicio!=null) {
			jmenuBarDetalleAuxiliarEjercicio=this.jInternalFrameDetalleFormEjercicio.jmenuBarDetalleEjercicio;
			jTtoolBarDetalleAuxiliarEjercicio=this.jInternalFrameDetalleFormEjercicio.jTtoolBarDetalleEjercicio;		
		}
		
		final JMenuBar jmenuBarDetalleEjercicio=jmenuBarDetalleAuxiliarEjercicio;
		final JToolBar jTtoolBarDetalleEjercicio=jTtoolBarDetalleAuxiliarEjercicio;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEjercicio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEjercicio;
			processRunnable.jTableDatos=jTableDatosEjercicio;
			processRunnable.jPanelCampos=jPanelCamposEjercicio;
			processRunnable.jPanelPaginacion=jPanelPaginacionEjercicio;
			processRunnable.jPanelAcciones=jPanelAccionesEjercicio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEjercicio;
			
			
			processRunnable.jmenuBar=jmenuBarEjercicio;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEjercicio;
			processRunnable.jTtoolBar=jTtoolBarEjercicio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEjercicio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEjercicio ,jPanelParametrosReportesEjercicio, jTableDatosEjercicio,/*jScrollPanelDatosEjercicio,*/jPanelCamposEjercicio,jPanelPaginacionEjercicio, /*jScrollPanelDatosEdicionEjercicio,*/ jPanelAccionesEjercicio,jPanelAccionesFormularioEjercicio,jmenuBarEjercicio,jmenuBarDetalleEjercicio,jTtoolBarEjercicio,jTtoolBarDetalleEjercicio));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEjercicio(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEjercicio(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEjercicio(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEjercicio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEjercicio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEjercicio,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEjercicio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEjercicio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEjercicio,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.ejercicioConstantesFunciones.getsFinalQueryEjercicio();
		String  finalQueryPaginacionTodos=this.ejercicioConstantesFunciones.getsFinalQueryEjercicio();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EjercicioConstantesFunciones.getArrayColumnasGlobalesNoEjercicio(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.ejerciciosEliminados= new ArrayList<Ejercicio>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEjercicio();
		
				///*EjercicioSessionBean*/this.ejercicioSessionBean=new EjercicioSessionBean();
			
			if(this.ejercicioSessionBean==null) {
				this.ejercicioSessionBean=new EjercicioSessionBean();
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
					this.iNumeroPaginacion=EjercicioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EjercicioConstantesFunciones.getClassesForeignKeysOfEjercicio(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/ejercicio."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			ejerciciosAux= new ArrayList<Ejercicio>();
			
				
			ejercicioLogic.setDatosCliente(this.datosCliente);
			ejercicioLogic.setDatosDeep(this.datosDeep);
			ejercicioLogic.setIsConDeep(true);
			
			
			ejercicioLogic.getEjercicioDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					ejercicioLogic.getTodosEjercicios(finalQueryGlobal,pagination);
					
					//ejercicioLogic.getTodosEjerciciosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(ejercicioLogic.getEjercicios()==null|| ejercicioLogic.getEjercicios().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							ejerciciosAux= new ArrayList<Ejercicio>();
							ejerciciosAux.addAll(ejercicioLogic.getEjercicios());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ejerciciosAux= new ArrayList<Ejercicio>();
							ejerciciosAux.addAll(ejercicios);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							ejercicioLogic.getTodosEjercicios(finalQueryGlobal+"",this.pagination);												
							
							//ejercicioLogic.getTodosEjerciciosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEjercicios("Todos",ejercicioLogic.getEjercicios() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							ejercicioLogic.setEjercicios(new ArrayList<Ejercicio>());					
							ejercicioLogic.getEjercicios().addAll(ejerciciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ejercicios=new ArrayList<Ejercicio>();
							ejercicios.addAll(ejerciciosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEjercicio=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEjercicio=this.idActual;
				
				} else if(this.idEjercicioActual!=null && this.idEjercicioActual!=0L) {
					idEjercicio=idEjercicioActual;
				}
				
					
				this.sDetalleReporte=EjercicioConstantesFunciones.getDetalleIndicePorId(idEjercicio);
				
				this.ejercicios=new ArrayList<Ejercicio>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					ejercicioLogic.getEntity(idEjercicio);
					
					//ejercicioLogic.getEntityWithConnection(idEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.setEjercicios(new ArrayList<Ejercicio>());
					ejercicioLogic.getEjercicios().add(ejercicioLogic.getEjercicio());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ejercicios=new ArrayList<Ejercicio>();
					this.ejercicios.add(ejercicio);
				}
				
				if(ejercicioLogic.getEjercicio()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorFechaInicio")) {
				this.sDetalleReporte=EjercicioConstantesFunciones.getDetalleIndiceBusquedaPorFechaInicio(fecha_inicioBusquedaPorFechaInicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ejercicioLogic.getEjerciciosBusquedaPorFechaInicio(finalQueryGlobal,pagination,fecha_inicioBusquedaPorFechaInicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EjercicioConstantesFunciones.getDetalleIndiceBusquedaPorFechaInicio(fecha_inicioBusquedaPorFechaInicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EjercicioConstantesFunciones.getDetalleIndiceBusquedaPorFechaInicio(fecha_inicioBusquedaPorFechaInicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ejercicioLogic.getEjercicios()==null||ejercicioLogic.getEjercicios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ejercicios==null|| ejercicios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ejerciciosAux=new ArrayList<Ejercicio>();
						ejerciciosAux.addAll(ejercicioLogic.getEjercicios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ejerciciosAux=new ArrayList<Ejercicio>();
							ejerciciosAux.addAll(ejercicios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ejercicioLogic.getEjerciciosBusquedaPorFechaInicio(finalQueryGlobal,pagination,fecha_inicioBusquedaPorFechaInicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EjercicioConstantesFunciones.getDetalleIndiceBusquedaPorFechaInicio(fecha_inicioBusquedaPorFechaInicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EjercicioConstantesFunciones.getDetalleIndiceBusquedaPorFechaInicio(fecha_inicioBusquedaPorFechaInicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEjercicios("BusquedaPorFechaInicio",ejercicioLogic.getEjercicios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEjercicios("BusquedaPorFechaInicio",ejercicios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ejercicioLogic.setEjercicios(new ArrayList<Ejercicio>());
						ejercicioLogic.getEjercicios().addAll(ejerciciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ejercicios=new ArrayList<Ejercicio>();
							ejercicios.addAll(ejerciciosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdAnio")) {
				this.sDetalleReporte=EjercicioConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ejercicioLogic.getEjerciciosFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EjercicioConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EjercicioConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ejercicioLogic.getEjercicios()==null||ejercicioLogic.getEjercicios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ejercicios==null|| ejercicios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ejerciciosAux=new ArrayList<Ejercicio>();
						ejerciciosAux.addAll(ejercicioLogic.getEjercicios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ejerciciosAux=new ArrayList<Ejercicio>();
							ejerciciosAux.addAll(ejercicios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ejercicioLogic.getEjerciciosFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EjercicioConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EjercicioConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEjercicios("FK_IdAnio",ejercicioLogic.getEjercicios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEjercicios("FK_IdAnio",ejercicios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ejercicioLogic.setEjercicios(new ArrayList<Ejercicio>());
						ejercicioLogic.getEjercicios().addAll(ejerciciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ejercicios=new ArrayList<Ejercicio>();
							ejercicios.addAll(ejerciciosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=EjercicioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ejercicioLogic.getEjerciciosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EjercicioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EjercicioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ejercicioLogic.getEjercicios()==null||ejercicioLogic.getEjercicios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ejercicios==null|| ejercicios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ejerciciosAux=new ArrayList<Ejercicio>();
						ejerciciosAux.addAll(ejercicioLogic.getEjercicios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ejerciciosAux=new ArrayList<Ejercicio>();
							ejerciciosAux.addAll(ejercicios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ejercicioLogic.getEjerciciosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EjercicioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EjercicioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEjercicios("FK_IdEmpresa",ejercicioLogic.getEjercicios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEjercicios("FK_IdEmpresa",ejercicios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ejercicioLogic.setEjercicios(new ArrayList<Ejercicio>());
						ejercicioLogic.getEjercicios().addAll(ejerciciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ejercicios=new ArrayList<Ejercicio>();
							ejercicios.addAll(ejerciciosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEjercicio();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEjercicio();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ejercicioLogic.getEjercicios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ejercicios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ejercicioLogic.getEjercicios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ejercicios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Ejercicio ejercicio) {
		Boolean permite=true;
		
		if(this.ejercicio.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EjercicioConstantesFunciones.getOrderByListaEjercicio();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EjercicioConstantesFunciones.getOrderByListaEjercicio();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Ejercicio ejercicio:ejercicioLogic.getEjercicios()) {
				if(ejercicio.getsType().equals(Constantes2.S_TOTALES)) {
					ejercicioTotales=ejercicio;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Ejercicio ejercicio:this.ejercicios) {
				if(ejercicio.getsType().equals(Constantes2.S_TOTALES)) {
					ejercicioTotales=ejercicio;
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
			this.ejercicioAux=new Ejercicio();
			this.ejercicioAux.setsType(Constantes2.S_TOTALES);
			this.ejercicioAux.setIsNew(false);
			this.ejercicioAux.setIsChanged(false);
			this.ejercicioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EjercicioConstantesFunciones.TotalizarValoresFilaEjercicio(this.ejercicioLogic.getEjercicios(),this.ejercicioAux);
				
				this.ejercicioLogic.getEjercicios().add(this.ejercicioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EjercicioConstantesFunciones.TotalizarValoresFilaEjercicio(this.ejercicios,this.ejercicioAux);
				
				this.ejercicios.add(this.ejercicioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		ejercicioTotales=new Ejercicio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ejercicioLogic.getEjercicios().remove(ejercicioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ejercicios.remove(ejercicioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		ejercicioTotales=new Ejercicio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Ejercicio ejercicio:ejercicioLogic.getEjercicios()) {
				if(ejercicio.getsType().equals(Constantes2.S_TOTALES)) {
					ejercicioTotales=ejercicio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EjercicioConstantesFunciones.TotalizarValoresFilaEjercicio(this.ejercicioLogic.getEjercicios(),ejercicioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Ejercicio ejercicio:this.ejercicios) {
				if(ejercicio.getsType().equals(Constantes2.S_TOTALES)) {
					ejercicioTotales=ejercicio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EjercicioConstantesFunciones.TotalizarValoresFilaEjercicio(this.ejercicios,ejercicioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEjerciciosBusquedaPorFechaInicio()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorFechaInicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEjerciciosFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEjerciciosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEjercicioPorEmpresaPorAnio()throws Exception {
		try {
			sAccionBusqueda="PorEmpresaPorAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	public void getEjercicioPorIdPorEmpresaPorAnio()throws Exception {
		try {
			sAccionBusqueda="PorIdPorEmpresaPorAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getEjerciciosBusquedaPorFechaInicio(String sFinalQuery,Date fecha_inicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEjerciciosBusquedaPorFechaInicio(sFinalQuery,this.pagination,fecha_inicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEjerciciosFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEjerciciosFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEjerciciosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEjerciciosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEjercicioPorEmpresaPorAnio(Long id_empresa,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEjercicioPorEmpresaPorAnio(id_empresa,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEjercicioPorIdPorEmpresaPorAnio(Long id,Long id_empresa,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEjercicioPorIdPorEmpresaPorAnio(id,id_empresa,id_anio);
				
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
	
	public void inicializarPermisosEjercicio() {
		this.isPermisoTodoEjercicio=false;
		this.isPermisoNuevoEjercicio=false;
		this.isPermisoActualizarEjercicio=false;
		this.isPermisoActualizarOriginalEjercicio=false;
		this.isPermisoEliminarEjercicio=false;
		this.isPermisoGuardarCambiosEjercicio=false;
		this.isPermisoConsultaEjercicio=false;
		this.isPermisoBusquedaEjercicio=false;
		this.isPermisoReporteEjercicio=false;		
		this.isPermisoOrdenEjercicio=false;		
		this.isPermisoPaginacionMedioEjercicio=false;		
		this.isPermisoPaginacionAltoEjercicio=false;
		this.isPermisoPaginacionTodoEjercicio=false;
		this.isPermisoCopiarEjercicio=false;		
		this.isPermisoVerFormEjercicio=false;		
		this.isPermisoDuplicarEjercicio=false;		
		this.isPermisoOrdenEjercicio=false;		
	}
	
	public void setPermisosUsuarioEjercicio(Boolean isPermiso) {
		this.isPermisoTodoEjercicio=isPermiso;
		this.isPermisoNuevoEjercicio=isPermiso;
		this.isPermisoActualizarEjercicio=isPermiso;
		this.isPermisoActualizarOriginalEjercicio=isPermiso;
		this.isPermisoEliminarEjercicio=isPermiso;
		this.isPermisoGuardarCambiosEjercicio=isPermiso;
		this.isPermisoConsultaEjercicio=isPermiso;
		this.isPermisoBusquedaEjercicio=isPermiso;
		this.isPermisoReporteEjercicio=isPermiso;
		this.isPermisoOrdenEjercicio=isPermiso;		
		this.isPermisoPaginacionMedioEjercicio=isPermiso;		
		this.isPermisoPaginacionAltoEjercicio=isPermiso;		
		this.isPermisoPaginacionTodoEjercicio=isPermiso;		
		this.isPermisoCopiarEjercicio=isPermiso;		
		this.isPermisoVerFormEjercicio=isPermiso;		
		this.isPermisoDuplicarEjercicio=isPermiso;
		this.isPermisoOrdenEjercicio=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEjercicio(Boolean isPermiso) {
		//this.isPermisoTodoEjercicio=isPermiso;
		this.isPermisoNuevoEjercicio=isPermiso;
		this.isPermisoActualizarEjercicio=isPermiso;
		this.isPermisoActualizarOriginalEjercicio=isPermiso;
		this.isPermisoEliminarEjercicio=isPermiso;
		this.isPermisoGuardarCambiosEjercicio=isPermiso;
		//this.isPermisoConsultaEjercicio=isPermiso;
		//this.isPermisoBusquedaEjercicio=isPermiso;
		//this.isPermisoReporteEjercicio=isPermiso;
		//this.isPermisoOrdenEjercicio=isPermiso;		
		//this.isPermisoPaginacionMedioEjercicio=isPermiso;		
		//this.isPermisoPaginacionAltoEjercicio=isPermiso;		
		//this.isPermisoPaginacionTodoEjercicio=isPermiso;		
		//this.isPermisoCopiarEjercicio=isPermiso;		
		//this.isPermisoDuplicarEjercicio=isPermiso;
		//this.isPermisoOrdenEjercicio=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEjercicioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EjercicioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebEjercicio(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEjercicioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEjercicioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEjercicioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEjercicioClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEjercicio() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EjercicioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.ejercicioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EjercicioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEjercicio=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEjercicio=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEjercicio=this.isPermisoActualizarEjercicio;
			this.isPermisoEliminarEjercicio=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEjercicio=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEjercicio=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEjercicio=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEjercicio=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEjercicio=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEjercicio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEjercicio=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEjercicio=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEjercicio=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEjercicio=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEjercicio=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEjercicio=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEjercicio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.ejercicioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEjercicio.setToolTipText(this.jTableDatosEjercicio.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEjercicio(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEjercicio(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EjercicioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EjercicioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEjercicio() throws Exception {
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
	public void inicializarCombosForeignKeyEjercicioListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEjercicioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EjercicioJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEjercicioListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyAnioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AnioConstantesFunciones.SFINALQUERY;

				this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyEjercicioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			EjercicioParameterReturnGeneral ejercicioReturnGeneral=new EjercicioParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.ejercicioConstantesFunciones.cargarid_empresaEjercicio)
					 || (this.esRecargarFks && this.ejercicioConstantesFunciones.cargarid_empresaEjercicio)) {

					if(!this.ejercicioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+ejercicioSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.ejercicioConstantesFunciones.cargarid_anioEjercicio)
					 || (this.esRecargarFks && this.ejercicioConstantesFunciones.cargarid_anioEjercicio)) {

					if(!this.ejercicioSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+ejercicioSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				ejercicioReturnGeneral=ejercicioLogic.cargarCombosLoteForeignKeyEjercicio(finalQueryGlobalEmpresa,finalQueryGlobalAnio);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=ejercicioReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=ejercicioReturnGeneral.getaniosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEjercicio()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyAnio();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.ejercicioSessionBean==null) {
				this.ejercicioSessionBean=new EjercicioSessionBean();
			}

			if(!this.ejercicioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.ejercicioSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				Anio anio=new Anio();
				AnioConstantesFunciones.setAnioDescripcion(anio,Constantes.SMENSAJE_ESCOJA_OPCION);
				anio.setId(null);

				if(!AnioConstantesFunciones.ExisteEnLista(this.aniosForeignKey,anio,true)) {

					this.aniosForeignKey.add(0,anio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyEjercicio()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEjercicio(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEjercicio()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
				this.ejercicio.setfecha_inicio(this.parametroGeneralUsuario.getfecha_sistema());
				this.ejercicio.setfecha_fin(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEjercicio();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEjercicio(Ejercicio ejercicio)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEjercicio(Ejercicio ejercicio,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEjercicio()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEjercicio()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEjercicio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEjercicio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEjercicio()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEjercicio()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEjercicio(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEjercicio.jComboBoxid_empresaEjercicio!=null && this.jInternalFrameDetalleFormEjercicio.jComboBoxid_empresaEjercicio.getItemCount()>0) {
				this.jInternalFrameDetalleFormEjercicio.jComboBoxid_empresaEjercicio.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEjercicio.jComboBoxid_anioEjercicio!=null && this.jInternalFrameDetalleFormEjercicio.jComboBoxid_anioEjercicio.getItemCount()>0) {
				this.jInternalFrameDetalleFormEjercicio.jComboBoxid_anioEjercicio.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public EjercicioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EjercicioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EjercicioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.ejercicioSessionBean=new EjercicioSessionBean(); 
		this.ejercicioConstantesFunciones=new EjercicioConstantesFunciones(); 
		this.ejercicioBean=new Ejercicio();//(this.ejercicioConstantesFunciones); 		
		this.ejercicioReturnGeneral=new EjercicioParameterReturnGeneral(); 
		
		this.ejercicioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ejercicioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EjercicioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EjercicioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EjercicioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEjercicio(true);
			
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
			
			this.ejercicioConstantesFunciones=new EjercicioConstantesFunciones(); 
			this.ejercicioBean=new Ejercicio();//this.ejercicioConstantesFunciones); 			
			this.ejercicioReturnGeneral=new EjercicioParameterReturnGeneral(); 
		
			EjercicioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ejercicio Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.ejercicio=new Ejercicio();
			this.ejercicios = new ArrayList<Ejercicio>();
			this.ejerciciosAux = new ArrayList<Ejercicio>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic=new EjercicioLogic();
				this.ejercicioLogic.getNewConnexionToDeep("");
			}
			
			//this.ejercicioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.ejercicioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEjercicio);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEjercicio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEjercicio);	
					}
					
					if(this.jInternalFrameImportacionEjercicio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEjercicio);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEjercicio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEjercicio);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEjercicio!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEjercicio);
				this.jInternalFrameDetalleFormEjercicio.setVisible(false);
				this.jInternalFrameDetalleFormEjercicio.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEjercicio!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEjercicio);
					this.jInternalFrameReporteDinamicoEjercicio.setVisible(false);
					this.jInternalFrameReporteDinamicoEjercicio.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEjercicio!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEjercicio);
					this.jInternalFrameImportacionEjercicio.setVisible(false);
					this.jInternalFrameImportacionEjercicio.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEjercicio!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEjercicio);
					this.jInternalFrameOrderByEjercicio.setVisible(false);
					this.jInternalFrameOrderByEjercicio.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEjercicioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EjercicioConstantesFunciones.INUMEROPAGINACION;
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
			
			this.ejercicioReturnGeneral=new EjercicioParameterReturnGeneral();
			
			this.ejercicioParameterGeneral=new EjercicioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.ejercicioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.ejercicioSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EjercicioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.ejercicioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EjercicioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ejercicioSessionBean.getEsGuardarRelacionado(),this.ejercicioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EjercicioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ejercicioSessionBean.getEsGuardarRelacionado(),this.ejercicioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEjercicio=false;
			this.isVisibilidadCeldaDuplicarEjercicio=true;
			this.isVisibilidadCeldaCopiarEjercicio=true;
			this.isVisibilidadCeldaVerFormEjercicio=true;
			this.isVisibilidadCeldaOrdenEjercicio=true;
			this.isVisibilidadCeldaNuevoRelacionesEjercicio=false;
			this.isVisibilidadCeldaModificarEjercicio=false;
			this.isVisibilidadCeldaActualizarEjercicio=false;
			this.isVisibilidadCeldaEliminarEjercicio=false;
			this.isVisibilidadCeldaCancelarEjercicio=false;
			this.isVisibilidadCeldaGuardarEjercicio=false;
			this.isVisibilidadCeldaGuardarCambiosEjercicio=false;
			
			
			this.isVisibilidadBusquedaPorFechaInicio=true;
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEjercicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEjercicio();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEjercicio(false);
			
			this.setPermisosUsuarioEjercicio();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ejercicioSessionBean.getEsGuardarRelacionado() 
				|| (this.ejercicioSessionBean.getEsGuardarRelacionado() && this.ejercicioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEjercicioClasesRelacionadas();
			}
			
			if(this.ejercicioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEjercicioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EjercicioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEjercicio();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEjercicio();
			}
			
			if(!this.isPermisoBusquedaEjercicio) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEjercicio.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ejercicioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEjercicio,this.isPermisoPaginacionMedioEjercicio,this.isPermisoPaginacionTodoEjercicio);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EjercicioConstantesFunciones.getTiposSeleccionarEjercicio());
				
				this.tiposColumnasSelect=EjercicioConstantesFunciones.getTiposSeleccionarEjercicio(true);
				
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
			//if(!this.ejercicioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEjercicio();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioEjercicio(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioEjercicio(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEjercicio() ;
			
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
			this.anioLogic=new AnioLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				ejercicioImplementable= (EjercicioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EjercicioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				ejercicioImplementableHome= (EjercicioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EjercicioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.ejercicios= new ArrayList<Ejercicio>();
			this.ejerciciosEliminados= new ArrayList<Ejercicio>();
						
			this.isEsNuevoEjercicio=false;
			this.esParaAccionDesdeFormularioEjercicio=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEjercicio(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEjercicio();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ejercicioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EjercicioBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EjercicioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEjercicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEjercicio(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEjercicio!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEjercicio();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEjercicio();
			}
			
			EjercicioBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEjercicio.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEjercicio.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEjercicio.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEjercicio(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Ejercicio: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEjercicio() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEjercicio")) {
				iIndex=this.jInternalFrameDetalleFormEjercicio.jTabbedPaneRelacionesEjercicio.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEjercicio.jTabbedPaneRelacionesEjercicio.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEjercicio.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEjercicio();	
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
	
	public void cargarCombosForeignKeyEjercicio(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEjercicio(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEjercicio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEjercicioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEjercicio();
		
		this.cargarCombosFrameForeignKeyEjercicio();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEjercicio();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEjercicio();
		}
	}
	
	

	public void cargarCombosForeignKeyAnio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAnio(this.aniosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoEjercicioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.ejercicioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEjercicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
			
			
			if(jTableDatosEjercicio.getRowCount()>=1) {
				jTableDatosEjercicio.removeRowSelectionInterval(0, jTableDatosEjercicio.getRowCount()-1);						
			}
			
			this.isEsNuevoEjercicio=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEjercicio(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEjercicio(true);			
			//this.ejercicio=new Ejercicio();
			//this.ejercicio.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEjercicio(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEjercicio() ;
			
			if(EjercicioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEjercicio(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.ejercicio);	
			this.actualizarInformacion("INFO_PADRE",false,this.ejercicio);				
			
			EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
			
			if(this.ejercicioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Ejercicio: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEjercicioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Ejercicio> ejerciciosSeleccionados=new ArrayList<Ejercicio>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEjercicio.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEjercicio.getSelectedRows().length;			
			}
			
			ejerciciosSeleccionados=this.getEjerciciosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEjercicio--;			
				//Ejercicio ejercicioAux= new Ejercicio();			
				//ejercicioAux.setId(this.iIdNuevoEjercicio);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Ejercicio ejercicioOrigen=new Ejercicio();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Ejercicio ejercicioOrigen : ejerciciosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEjercicio.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							ejercicioOrigen =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ejercicioOrigen =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEjercicio();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.ejercicio.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEjercicio(ejercicioOrigen,this.ejercicio,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEjercicio(this.ejercicio);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ejercicioLogic.getEjercicios().add(this.ejercicioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ejercicios.add(this.ejercicioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEjercicio(false);
				
				this.jTableDatosEjercicio.setRowSelectionInterval(this.getIndiceNuevoEjercicio(), this.getIndiceNuevoEjercicio());
				
				int iLastRow =  this.jTableDatosEjercicio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEjercicio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEjercicio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEjercicio(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEjercicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Ejercicio> ejerciciosSeleccionados=new ArrayList<Ejercicio>();									
		
			Ejercicio ejercicioOrigen=new Ejercicio();
			Ejercicio ejercicioDestino=new Ejercicio();
				
			ejerciciosSeleccionados=this.getEjerciciosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEjercicio.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || ejerciciosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEjercicio.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ejercicioOrigen =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ejercicioOrigen =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ejercicioDestino =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ejercicioDestino =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				ejercicioOrigen =ejerciciosSeleccionados.get(0);
				ejercicioDestino =ejerciciosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEjercicio(ejercicioOrigen,ejercicioDestino,true,false);
				
				ejercicioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(ejercicioDestino,ejercicioLogic.getEjercicios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ejercicioDestino,ejercicios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEjercicio(false);
				
				//this.jTableDatosEjercicio.setRowSelectionInterval(this.getIndiceNuevoEjercicio(), this.getIndiceNuevoEjercicio());
				
				int iLastRow =  this.jTableDatosEjercicio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEjercicio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEjercicio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEjercicio(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEjercicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEjercicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEjercicio.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEjercicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEjercicio.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEjercicio.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEjercicio.setVisible(!isVisible);
			this.jPanelPaginacionEjercicio.setVisible(!isVisible);
			this.jPanelAccionesEjercicio.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEjercicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEjercicio();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEjercicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEjercicio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEjercicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEjercicio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEjercicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEjercicio();
			
			this.abrirFrameOrderByEjercicio();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEjercicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEjercicio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEjercicio(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEjercicio);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEjercicio.isMaximum()) {
					this.jInternalFrameDetalleFormEjercicio.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEjercicio.setSize(this.jInternalFrameDetalleFormEjercicio.iWidthFormulario,this.jInternalFrameDetalleFormEjercicio.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEjercicio.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEjercicio.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEjercicio.isMaximum()) {
						this.jInternalFrameDetalleFormEjercicio.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEjercicio.jContentPaneDetalleEjercicio.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEjercicio.jTabbedPaneRelacionesEjercicio.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEjercicio.jContentPaneDetalleEjercicio.getWidth(),EjercicioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEjercicio.jTabbedPaneRelacionesEjercicio.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEjercicio.jContentPaneDetalleEjercicio.getWidth(),EjercicioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEjercicio.jTabbedPaneRelacionesEjercicio.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEjercicio.jContentPaneDetalleEjercicio.getWidth(),EjercicioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEjercicio.setVisible(true);
	        this.jInternalFrameDetalleFormEjercicio.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEjercicio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEjercicio==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEjercicio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEjercicio,false,this);
				} else {
					this.jInternalFrameOrderByEjercicio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEjercicio,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEjercicio);
				this.jInternalFrameOrderByEjercicio.setVisible(false);
				this.jInternalFrameOrderByEjercicio.setSelected(false);
				
				this.jInternalFrameOrderByEjercicio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEjercicio"));
				
				this.inicializarActualizarBindingTablaOrderByEjercicio();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEjercicio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEjercicio==null) {
				
				this.jInternalFrameImportacionEjercicio=new ImportacionJInternalFrame(EjercicioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEjercicio);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEjercicio);
				this.jInternalFrameImportacionEjercicio.setVisible(false);
				this.jInternalFrameImportacionEjercicio.setSelected(false);


				this.jInternalFrameImportacionEjercicio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEjercicio"));
				this.jInternalFrameImportacionEjercicio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEjercicio"));
				this.jInternalFrameImportacionEjercicio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEjercicio"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEjercicio() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEjercicio==null) {
				this.jInternalFrameReporteDinamicoEjercicio=new ReporteDinamicoJInternalFrame(EjercicioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEjercicio);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEjercicio);
				this.jInternalFrameReporteDinamicoEjercicio.setVisible(false);
				this.jInternalFrameReporteDinamicoEjercicio.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEjercicio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEjercicio"));
				this.jInternalFrameReporteDinamicoEjercicio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEjercicio"));
				this.jInternalFrameReporteDinamicoEjercicio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEjercicio"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEjercicio();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleEjercicio() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEjercicio);
			
	       	this.jInternalFrameDetalleFormEjercicio.setVisible(false);
	        this.jInternalFrameDetalleFormEjercicio.setSelected(false);
			
			//this.jInternalFrameDetalleFormEjercicio.dispose();
			//this.jInternalFrameDetalleFormEjercicio=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEjercicio() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEjercicio.setVisible(true);
	        this.jInternalFrameReporteDinamicoEjercicio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEjercicio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEjercicio.setVisible(true);
	        this.jInternalFrameImportacionEjercicio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEjercicio() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEjercicio.setVisible(true);
	        this.jInternalFrameOrderByEjercicio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEjercicio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEjercicio.setVisible(false);
	        this.jInternalFrameOrderByEjercicio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEjercicio() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEjercicio.setVisible(false);
	        this.jInternalFrameReporteDinamicoEjercicio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEjercicio() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEjercicio.setVisible(false);
	        this.jInternalFrameImportacionEjercicio.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEjercicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEjercicio(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEjercicio(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEjercicio.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEjercicio(true);
			//this.isEsNuevoEjercicio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicio =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ejercicio =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEjercicio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEjercicio(false) ;
			
			if(ejercicioSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EjercicioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEjercicio(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEjercicio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEjercicioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEjercicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicio =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ejercicio =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEjercicio(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEjercicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEjercicio.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEjercicio(true);
			//this.isEsNuevoEjercicio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicio =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ejercicio =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.ejercicio.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEjercicio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEjercicio(false) ;
			
			if(EjercicioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEjercicio(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEjercicio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosEjercicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEjercicio,EjercicioConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEjercicio.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarEjercicioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEjercicio(false);
			
			//if(!this.isEsNuevoEjercicio) {								
				int intSelectedRow = this.jTableDatosEjercicio.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicio =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ejercicio =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EjercicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEjercicio(this.ejercicio,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEjercicio(this.ejercicio);
				
			}
			
			if(this.permiteMantenimiento(this.ejercicio)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.ejercicioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEjercicio=true;
					this.inicializarActualizarBindingTablaEjercicio(false);
					this.isEsNuevoEjercicio=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEjercicio=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEjercicio=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEjercicio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEjercicio(false);
				
				this.habilitarDeshabilitarControlesEjercicio(false);
			
												
				
				if(EjercicioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEjercicio();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEjercicioActionPerformed(evt,ejercicioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEjercicio(this.ejercicio,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEjercicio.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,ejercicioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.ejercicio.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Ejercicio.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ejercicio.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEjercicioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEjercicio.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicio =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
				this.ejercicio.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ejercicio =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
				this.ejercicio.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.ejercicio)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.ejercicioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EjercicioModel) this.jTableDatosEjercicio.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEjercicio=true;
				this.inicializarActualizarBindingTablaEjercicio(false);
				this.isEsNuevoEjercicio=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEjercicio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEjercicio(false);
				
				this.habilitarDeshabilitarControlesEjercicio(false);
				
				
				
				if(EjercicioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEjercicio();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEjercicioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEjercicio.getRowCount()>=1) {
				jTableDatosEjercicio.removeRowSelectionInterval(0, jTableDatosEjercicio.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEjercicio(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEjercicio(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEjercicio(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEjercicio(false) ;
			
			this.isEsNuevoEjercicio=false;
			
			if(EjercicioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEjercicio();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEjercicioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEjercicio(false);
				
				//SI ES MANUAL
				if(EjercicioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEjercicio();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEjercicioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEjercicio--;			
			//Ejercicio ejercicioAux= new Ejercicio();			
			//ejercicioAux.setId(this.iIdNuevoEjercicio);
			
			if(this.jInternalFrameDetalleFormEjercicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEjercicio();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEjercicio(this.ejercicio);
			
			this.ejercicio.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.ejercicioLogic.getEjercicios().add(this.ejercicioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.ejercicios.add(this.ejercicioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEjercicio(false);
			
			this.jTableDatosEjercicio.setRowSelectionInterval(this.getIndiceNuevoEjercicio(), this.getIndiceNuevoEjercicio());
			
			int iLastRow =  this.jTableDatosEjercicio.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEjercicio.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEjercicio.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEjercicio(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEjercicioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEjercicio(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEjercicio(false);
			
			//SI ES MANUAL
			if(EjercicioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEjercicio();
			}
			
			//this.abrirFrameTreeEjercicio();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEjercicioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE EjercicioS ?", "MANTENIMIENTO DE Ejercicio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEjercicio.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEjercicio();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.ejercicioReturnGeneral=ejercicioLogic.procesarImportacionEjerciciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.ejercicioParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEjercicioReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEjercicioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEjercicio.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEjercicio.setFileImportacion(this.jInternalFrameImportacionEjercicio.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEjercicio.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEjercicio.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEjercicio.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEjercicio.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEjercicioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Ejercicio> ejerciciosSeleccionados=new ArrayList<Ejercicio>();		

		ejerciciosSeleccionados=this.getEjerciciosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEjercicio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEjercicio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EjercicioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EjercicioBaseDesign.jrxml";
			
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
			
			this.generarReporteEjercicios("Todos",ejerciciosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ejercicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ejercicio",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEjercicio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEjercicio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EjercicioConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EjercicioConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EjercicioConstantesFunciones.LABEL_FECHAINICIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaInicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaInicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaInicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaInicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EjercicioConstantesFunciones.LABEL_FECHAFIN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaFin_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaFin_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaFin_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaFin_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EjercicioConstantesFunciones.LABEL_ESTAACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taActivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taActivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taActivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taActivo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoEjercicio.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEjercicio.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEjercicio.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EjercicioConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case EjercicioConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case EjercicioConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoria="fecha_inicio";
					break;

				case EjercicioConstantesFunciones.LABEL_FECHAFIN:
					sNombreCampoCategoria="fecha_fin";
					break;

				case EjercicioConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEjercicio.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EjercicioConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case EjercicioConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case EjercicioConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoriaValor="fecha_inicio";
					break;

				case EjercicioConstantesFunciones.LABEL_FECHAFIN:
					sNombreCampoCategoriaValor="fecha_fin";
					break;

				case EjercicioConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEjercicio.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEjercicio.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EjercicioConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case EjercicioConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case EjercicioConstantesFunciones.LABEL_FECHAINICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Inicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_inicio");
					break;

				case EjercicioConstantesFunciones.LABEL_FECHAFIN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Fin",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_fin");
					break;

				case EjercicioConstantesFunciones.LABEL_ESTAACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esta_activo");
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
	
	public void jButtonGenerarExcelReporteDinamicoEjercicioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Ejercicio> ejerciciosSeleccionados=new ArrayList<Ejercicio>();		
		
		ejerciciosSeleccionados=this.getEjerciciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ejercicio";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Ejercicios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEjercicio.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEjercicio.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EjercicioConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EjercicioConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Ejercicio ejercicio:ejerciciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ejercicio.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EjercicioConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EjercicioConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(Ejercicio ejercicio:ejerciciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ejercicio.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EjercicioConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EjercicioConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(Ejercicio ejercicio:ejerciciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ejercicio.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EjercicioConstantesFunciones.LABEL_FECHAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EjercicioConstantesFunciones.LABEL_FECHAFIN);
					iRow++;

					for(Ejercicio ejercicio:ejerciciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ejercicio.getfecha_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EjercicioConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EjercicioConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(Ejercicio ejercicio:ejerciciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ejercicio.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelEjercicio(row);				
			//	iRow++;
			//}				
			
			//for(Ejercicio ejercicioAux:ejerciciosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEjercicio(ejercicioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ejercicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ejercicio",JOptionPane.INFORMATION_MESSAGE);
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
				this.ejercicioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEjercicio(false);
			
			//SI ES MANUAL
			if(EjercicioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEjercicio();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEjercicioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEjercicio(false);
			
			//SI ES MANUAL
			if(EjercicioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEjercicio();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEjercicioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEjercicio(false);
			
			//SI ES MANUAL
			if(EjercicioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEjercicio();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEjercicio() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEjercicio.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEjercicio.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEjercicio.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEjercicio.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEjercicio.setMinimumSize(dimensionMinimum);
		this.jTableDatosEjercicio.setMaximumSize(dimensionMaximum);
		this.jTableDatosEjercicio.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEjercicio(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEjercicio(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEjercicio(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEjercicio(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEjercicio(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ejercicioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEjercicio(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEjercicio(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEjercicio(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EjercicioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EjercicioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEjercicio() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEjercicio();
		
		this.inicializarActualizarBindingBotonesManualEjercicio(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ejercicioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEjercicio();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEjercicio() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEjercicio(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEjercicio(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEjercicio.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEjercicio.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEjercicio.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEjercicio!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEjercicio.jCheckBoxPostAccionNuevoEjercicio.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEjercicio.jCheckBoxPostAccionSinCerrarEjercicio.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEjercicio.jCheckBoxPostAccionSinMensajeEjercicio.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEjercicio.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEjercicio.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEjercicio.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEjercicio!=null) {
				this.jInternalFrameDetalleFormEjercicio.jCheckBoxPostAccionNuevoEjercicio.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEjercicio.jCheckBoxPostAccionSinCerrarEjercicio.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEjercicio.jCheckBoxPostAccionSinMensajeEjercicio.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEjercicio.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEjercicio.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEjercicio!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEjercicio.jComboBoxTiposAccionesFormularioEjercicio.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEjercicio.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEjercicio!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEjercicio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEjercicio.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEjercicio.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEjercicio.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEjercicio.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEjercicio!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEjercicio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEjercicio.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEjercicio.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEjercicio(Boolean esInicializar) throws Exception {
		try	{	
			if(EjercicioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEjercicio(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEjercicio() throws Exception {
		try	{
			if(EjercicioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEjercicio();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEjercicio() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEjercicio.jComboBoxTiposAccionesFormularioEjercicio.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEjercicio.jComboBoxTiposAccionesFormularioEjercicio.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEjercicio() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEjercicio.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEjercicio.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEjercicio.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEjercicio.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEjercicio.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEjercicio.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEjercicio.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEjercicio.addItem(reporte);
			}
			
			
			if(!this.ejercicioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEjercicio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEjercicio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEjercicio.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEjercicio.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEjercicio.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEjercicio.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEjercicio!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEjercicio.jComboBoxTiposAccionesFormularioEjercicio.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEjercicio.jComboBoxTiposAccionesFormularioEjercicio.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEjercicio.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEjercicio.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEjercicio.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEjercicio();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEjercicio() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEjercicio!=null) {
				this.jInternalFrameReporteDinamicoEjercicio.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEjercicio.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEjercicio!=null) {
				this.jInternalFrameReporteDinamicoEjercicio.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEjercicio.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEjercicio!=null) {
				
				if(this.jInternalFrameReporteDinamicoEjercicio.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEjercicio.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEjercicio.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEjercicio.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEjercicio.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEjercicio.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEjercicio()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_inicioBusquedaPorFechaInicio=new Date(this.jDateChooserfecha_inicioBusquedaPorFechaInicioEjercicio.getDate().getTime());
		if(this.jComboBoxid_anioFK_IdAnioEjercicio.getSelectedItem()!=null){this.id_anioFK_IdAnio=((Anio)this.jComboBoxid_anioFK_IdAnioEjercicio.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEjercicio(Boolean esInicializar) throws Exception {				
		if(EjercicioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEjercicio();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEjercicio() throws Exception {
		this.inicializarActualizarBindingTablaEjercicio(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEjercicio() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEjercicio.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEjercicio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEjercicio.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EjercicioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEjercicio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEjercicio.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EjercicioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEjercicioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEjercicioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EjercicioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEjercicio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEjercicio.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EjercicioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEjercicio.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEjercicio(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=ejercicioLogic.getEjercicios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=ejercicios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EjercicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEjercicio.setModel(new EjercicioModel(this.ejercicioLogic.getEjercicios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEjercicio.setModel(new EjercicioModel(this.ejercicios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEjercicio!=null && this.jInternalFrameOrderByEjercicio.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEjercicio();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEjercicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEjercicio,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EjercicioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EjercicioConstantesFunciones.SCLASSWEBTITULO,ejercicioConstantesFunciones.resaltarSeleccionarEjercicio,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EjercicioConstantesFunciones.SCLASSWEBTITULO,ejercicioConstantesFunciones.resaltarSeleccionarEjercicio,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEjercicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEjercicio,EjercicioConstantesFunciones.LABEL_ID));

		if(this.ejercicioConstantesFunciones.mostraridEjercicio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EjercicioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ejercicioConstantesFunciones.resaltaridEjercicio,this.ejercicioConstantesFunciones.activaridEjercicio,this,true,"idEjercicio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ejercicioConstantesFunciones.resaltaridEjercicio,this.ejercicioConstantesFunciones.activaridEjercicio,this,true,"idEjercicio","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEjercicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEjercicio,EjercicioConstantesFunciones.LABEL_IDEMPRESA));

		if(this.ejercicioConstantesFunciones.mostrarid_empresaEjercicio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EjercicioConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.ejercicioConstantesFunciones.resaltarid_empresaEjercicio,this,this.ejercicioConstantesFunciones.activarid_empresaEjercicio));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.ejercicioConstantesFunciones.resaltarid_empresaEjercicio,this,this.ejercicioConstantesFunciones.activarid_empresaEjercicio,false,"id_empresaEjercicio","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EjercicioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEjercicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEjercicio,EjercicioConstantesFunciones.LABEL_IDANIO));

		if(this.ejercicioConstantesFunciones.mostrarid_anioEjercicio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EjercicioConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.ejercicioConstantesFunciones.resaltarid_anioEjercicio,this,this.ejercicioConstantesFunciones.activarid_anioEjercicio));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.ejercicioConstantesFunciones.resaltarid_anioEjercicio,this,this.ejercicioConstantesFunciones.activarid_anioEjercicio,true,"id_anioEjercicio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EjercicioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEjercicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEjercicio,EjercicioConstantesFunciones.LABEL_FECHAINICIO));

		if(this.ejercicioConstantesFunciones.mostrarfecha_inicioEjercicio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EjercicioConstantesFunciones.LABEL_FECHAINICIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.ejercicioConstantesFunciones.resaltarfecha_inicioEjercicio,this.ejercicioConstantesFunciones.activarfecha_inicioEjercicio,this,true,"fecha_inicioEjercicio","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.ejercicioConstantesFunciones.resaltarfecha_inicioEjercicio,this.ejercicioConstantesFunciones.activarfecha_inicioEjercicio,this,true,"fecha_inicioEjercicio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new EjercicioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEjercicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEjercicio,EjercicioConstantesFunciones.LABEL_FECHAFIN));

		if(this.ejercicioConstantesFunciones.mostrarfecha_finEjercicio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EjercicioConstantesFunciones.LABEL_FECHAFIN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.ejercicioConstantesFunciones.resaltarfecha_finEjercicio,this.ejercicioConstantesFunciones.activarfecha_finEjercicio,this,true,"fecha_finEjercicio","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.ejercicioConstantesFunciones.resaltarfecha_finEjercicio,this.ejercicioConstantesFunciones.activarfecha_finEjercicio,this,true,"fecha_finEjercicio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new EjercicioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEjercicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEjercicio,EjercicioConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.ejercicioConstantesFunciones.mostraresta_activoEjercicio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EjercicioConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.ejercicioConstantesFunciones.resaltaresta_activoEjercicio,this.ejercicioConstantesFunciones.activaresta_activoEjercicio));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.ejercicioConstantesFunciones.resaltaresta_activoEjercicio,this.ejercicioConstantesFunciones.activaresta_activoEjercicio,this,true,"esta_activoEjercicio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EjercicioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.ejercicioSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ejercicioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ejercicioSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEjercicio.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ejercicioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ejercicioSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEjercicio.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEjercicio && this.isPermisoGuardarCambiosEjercicio) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.ejercicioSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.ejercicioSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEjercicio.addColumn(tableColumn);
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
			
			this.jTableDatosEjercicio.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEjercicio && this.isPermisoGuardarCambiosEjercicio) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEjercicio && this.isPermisoGuardarCambiosEjercicio) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEjercicio.moveColumn(this.jTableDatosEjercicio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEjercicio.moveColumn(this.jTableDatosEjercicio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEjercicio.moveColumn(this.jTableDatosEjercicio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEjercicio.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEjercicio.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEjercicio,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EjercicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEjercicio.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEjercicio.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EjercicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EjercicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEjercicio.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEjercicio.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEjercicio.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=ejercicioLogic.getEjercicios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=ejercicios.size()-1;
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
		//this.jTableDatosEjercicio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEjercicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEjercicio();
			
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
				
				//this.isEsNuevoEjercicio=false;
					
				EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
			
				if(this.ejercicioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEjercicio==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEjercicio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEjercicio.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicio =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ejercicio =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.ejercicio.getsType().equals("DUPLICADO")
				   || this.ejercicio.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEjercicio=true;
				
				} else {
					this.isEsNuevoEjercicio=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.ejercicioSessionBean.getEsGuardarRelacionado()) {
					if(this.ejercicio.getId()>=0 && !this.ejercicio.getIsNew()) {						
						this.isEsNuevoEjercicio=false;
						
					} else {
						this.isEsNuevoEjercicio=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEjercicio(esRelaciones);						
				
				this.seleccionarEjercicio(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.ejercicio.getId()<0) {
					this.isEsNuevoEjercicio=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEjercicio(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEjercicio(evt,rowIndex);
				}	
				
				if(this.ejercicioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Ejercicio: " + this.dDif); 
					}
				}								
				
				EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEjercicio(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.ejercicio)) {
					if(this.ejercicio.getId()>0) {
						this.ejercicio.setIsDeleted(true);
						
						this.ejerciciosEliminados.add(this.ejercicio);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ejercicioLogic.getEjercicios().remove(this.ejercicio);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ejercicios.remove(this.ejercicio);				
					}
					
					
					((EjercicioModel) this.jTableDatosEjercicio.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEjercicio(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEjercicio(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEjercicio) {
			
			if(this.jInternalFrameDetalleFormEjercicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEjercicio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEjercicio.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicio =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ejercicio =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EjercicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEjercicio(this.ejercicio);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.ejercicioConstantesFunciones.cargarid_empresaEjercicio || this.ejercicioConstantesFunciones.event_dependid_empresaEjercicio) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.ejercicio.getid_empresa());
									//this.inicializarActualizarBindingEjercicio(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(ejercicio.getEmpresa()!=null) {
							this.empresasForeignKey.add(ejercicio.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.ejercicio.getid_empresa(),false,"Formulario");

					//Anio
					if(!this.ejercicioConstantesFunciones.cargarid_anioEjercicio || this.ejercicioConstantesFunciones.event_dependid_anioEjercicio) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.ejercicio.getid_anio());
									//this.inicializarActualizarBindingEjercicio(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(ejercicio.getAnio()!=null) {
							this.aniosForeignKey.add(ejercicio.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.ejercicio.getid_anio(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEjercicio("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEjercicio(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEjercicio() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEjercicio(Ejercicio ejercicio) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEjercicio(ejercicio,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEjercicio(Ejercicio ejercicio,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEjercicio(ejercicio);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEjercicio(ejercicio,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEjercicio(ejercicio);
	}
	
	public void setVariablesObjetoActualToFormularioEjercicio(Ejercicio ejercicio) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEjercicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEjercicio.jLabelidEjercicio.setText(ejercicio.getId().toString());
			this.jInternalFrameDetalleFormEjercicio.jDateChooserfecha_inicioEjercicio.setDate(ejercicio.getfecha_inicio());
			this.jInternalFrameDetalleFormEjercicio.jDateChooserfecha_finEjercicio.setDate(ejercicio.getfecha_fin());
			this.jInternalFrameDetalleFormEjercicio.jCheckBoxesta_activoEjercicio.setSelected(ejercicio.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Ejercicio ejercicioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,ejercicioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Ejercicio ejercicioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				ejercicioLocal=this.ejercicio;
			} else {
				ejercicioLocal=this.ejercicioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(ejercicioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioLocal,true);
					
					if(ejercicioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(ejercicioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.ejercicioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(ejercicioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEjercicio(Ejercicio ejercicio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEjercicio(ejercicio,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEjercicio(ejercicio);
	}
	
	public void setVariablesFormularioToObjetoActualEjercicio(Ejercicio ejercicio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEjercicio(ejercicio,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEjercicio(Ejercicio ejercicio,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEjercicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEjercicio.jLabelidEjercicio.getText()==null || this.jInternalFrameDetalleFormEjercicio.jLabelidEjercicio.getText()=="" || this.jInternalFrameDetalleFormEjercicio.jLabelidEjercicio.getText()=="Id") {
				this.jInternalFrameDetalleFormEjercicio.jLabelidEjercicio.setText("0");
			}

			if(conColumnasBase) {ejercicio.setId(Long.parseLong(this.jInternalFrameDetalleFormEjercicio.jLabelidEjercicio.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EjercicioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEjercicio.jLabelIdEjercicio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ejercicio.setfecha_inicio(this.jInternalFrameDetalleFormEjercicio.jDateChooserfecha_inicioEjercicio.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EjercicioConstantesFunciones.LABEL_FECHAINICIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEjercicio.jLabelfecha_inicioEjercicio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ejercicio.setfecha_fin(this.jInternalFrameDetalleFormEjercicio.jDateChooserfecha_finEjercicio.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EjercicioConstantesFunciones.LABEL_FECHAFIN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEjercicio.jLabelfecha_finEjercicio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ejercicio.setesta_activo(this.jInternalFrameDetalleFormEjercicio.jCheckBoxesta_activoEjercicio.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EjercicioConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEjercicio.jLabelesta_activoEjercicio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEjercicio(Ejercicio ejercicioBean,Ejercicio ejercicio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEjercicio(Ejercicio ejercicioOrigen,Ejercicio ejercicio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ejercicioOrigen.getId()!=null && !ejercicioOrigen.getId().equals(0L))) {ejercicio.setId(ejercicioOrigen.getId());}}
			if(conDefault || (!conDefault && ejercicioOrigen.getfecha_inicio()!=null && !ejercicioOrigen.getfecha_inicio().equals(new Date()))) {ejercicio.setfecha_inicio(ejercicioOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && ejercicioOrigen.getfecha_fin()!=null && !ejercicioOrigen.getfecha_fin().equals(new Date()))) {ejercicio.setfecha_fin(ejercicioOrigen.getfecha_fin());}
			if(conDefault || (!conDefault && ejercicioOrigen.getesta_activo()!=null && !ejercicioOrigen.getesta_activo().equals(false))) {ejercicio.setesta_activo(ejercicioOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEjercicio(Ejercicio ejercicio) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEjercicio.jLabelidEjercicio.setText(ejercicio.getId().toString());
			this.jInternalFrameDetalleFormEjercicio.jDateChooserfecha_inicioEjercicio.setDate(ejercicio.getfecha_inicio());
			this.jInternalFrameDetalleFormEjercicio.jDateChooserfecha_finEjercicio.setDate(ejercicio.getfecha_fin());
			this.jInternalFrameDetalleFormEjercicio.jCheckBoxesta_activoEjercicio.setSelected(ejercicio.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEjercicio(EjercicioBean ejercicioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEjercicio.jLabelidEjercicio.setText(ejercicioBean.getId().toString());
			this.jInternalFrameDetalleFormEjercicio.jDateChooserfecha_inicioEjercicio.setDate(ejercicioBean.getfecha_inicio());
			this.jInternalFrameDetalleFormEjercicio.jDateChooserfecha_finEjercicio.setDate(ejercicioBean.getfecha_fin());
			this.jInternalFrameDetalleFormEjercicio.jCheckBoxesta_activoEjercicio.setSelected(ejercicioBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEjercicio(EjercicioParameterReturnGeneral ejercicioReturnGeneral,EjercicioBean ejercicioBean,Boolean conDefault) throws Exception { 
		try {
			Ejercicio ejercicioLocal=new Ejercicio();
			
			ejercicioLocal=ejercicioReturnGeneral.getEjercicio();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ejercicioLocal.getId()!=null && !ejercicioLocal.getId().equals(0L))) {ejercicioBean.setId(ejercicioLocal.getId());}}
			if(conDefault || (!conDefault && ejercicioLocal.getfecha_inicio()!=null && !ejercicioLocal.getfecha_inicio().equals(new Date()))) {ejercicioBean.setfecha_inicio(ejercicioLocal.getfecha_inicio());}
			if(conDefault || (!conDefault && ejercicioLocal.getfecha_fin()!=null && !ejercicioLocal.getfecha_fin().equals(new Date()))) {ejercicioBean.setfecha_fin(ejercicioLocal.getfecha_fin());}
			if(conDefault || (!conDefault && ejercicioLocal.getesta_activo()!=null && !ejercicioLocal.getesta_activo().equals(false))) {ejercicioBean.setesta_activo(ejercicioLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEjercicioGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxEjercicio,List<Ejercicio> ejerciciosLocal)throws Exception {
		try {
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosLocal) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			jComboBoxEjercicio.setSelectedItem(ejercicioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEjercicioGenerico(JComboBox jComboBoxEjercicio,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEjercicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEjercicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEjercicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEjercicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEjercicio.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEjercicio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEjercicio.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEjercicio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEjercicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEjercicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ejercicio=(Ejercicio) ejercicioLogic.getEjercicios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ejercicio =(Ejercicio) ejercicios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!ejercicio.getIsNew() && !ejercicio.getIsChanged() && !ejercicio.getIsDeleted()) {
				sDescripcion=ejercicio.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=ejercicio.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!ejercicio.getIsNew() && !ejercicio.getIsChanged() && !ejercicio.getIsDeleted()) {
				sDescripcion=ejercicio.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=ejercicio.getanio_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Ejercicio ejercicioRow=new Ejercicio();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ejercicioRow=(Ejercicio) ejercicioLogic.getEjercicios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ejercicioRow=(Ejercicio) ejercicios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEjercicio(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEjercicio.setVisible((this.isVisibilidadCeldaNuevoEjercicio && this.isPermisoNuevoEjercicio));			
			this.jButtonDuplicarEjercicio.setVisible((this.isVisibilidadCeldaDuplicarEjercicio && this.isPermisoDuplicarEjercicio));			
			this.jButtonCopiarEjercicio.setVisible((this.isVisibilidadCeldaCopiarEjercicio && this.isPermisoCopiarEjercicio));
			this.jButtonVerFormEjercicio.setVisible((this.isVisibilidadCeldaVerFormEjercicio && this.isPermisoVerFormEjercicio));
			
			this.jButtonAbrirOrderByEjercicio.setVisible((this.isVisibilidadCeldaOrdenEjercicio && this.isPermisoOrdenEjercicio));			
			
			this.jButtonNuevoRelacionesEjercicio.setVisible((this.isVisibilidadCeldaNuevoRelacionesEjercicio && this.isPermisoNuevoEjercicio));			
			this.jButtonNuevoGuardarCambiosEjercicio.setVisible((this.isVisibilidadCeldaNuevoEjercicio && this.isPermisoNuevoEjercicio && this.isPermisoGuardarCambiosEjercicio));
			
			if(this.jInternalFrameDetalleFormEjercicio!=null) {
			this.jInternalFrameDetalleFormEjercicio.jButtonModificarEjercicio.setVisible((this.isVisibilidadCeldaModificarEjercicio && this.isPermisoActualizarEjercicio));	
			this.jInternalFrameDetalleFormEjercicio.jButtonActualizarEjercicio.setVisible((this.isVisibilidadCeldaActualizarEjercicio && this.isPermisoActualizarEjercicio));	
			this.jInternalFrameDetalleFormEjercicio.jButtonEliminarEjercicio.setVisible((this.isVisibilidadCeldaEliminarEjercicio && this.isPermisoEliminarEjercicio));
			this.jInternalFrameDetalleFormEjercicio.jButtonCancelarEjercicio.setVisible(this.isVisibilidadCeldaCancelarEjercicio);							
			this.jInternalFrameDetalleFormEjercicio.jButtonGuardarCambiosEjercicio.setVisible((this.isVisibilidadCeldaGuardarEjercicio && this.isPermisoGuardarCambiosEjercicio));			
			
			}
						
			this.jButtonGuardarCambiosTablaEjercicio.setVisible((this.isVisibilidadCeldaGuardarCambiosEjercicio && this.isPermisoGuardarCambiosEjercicio));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEjercicio.setVisible((this.isVisibilidadCeldaNuevoEjercicio && this.isPermisoNuevoEjercicio));						
			this.jButtonDuplicarToolBarEjercicio.setVisible((this.isVisibilidadCeldaDuplicarEjercicio && this.isPermisoDuplicarEjercicio));						
			this.jButtonCopiarToolBarEjercicio.setVisible((this.isVisibilidadCeldaCopiarEjercicio && this.isPermisoCopiarEjercicio));			
			this.jButtonVerFormToolBarEjercicio.setVisible((this.isVisibilidadCeldaVerFormEjercicio && this.isPermisoVerFormEjercicio));			
			this.jButtonAbrirOrderByToolBarEjercicio.setVisible((this.isVisibilidadCeldaOrdenEjercicio && this.isPermisoOrdenEjercicio));
			this.jButtonNuevoRelacionesToolBarEjercicio.setVisible((this.isVisibilidadCeldaNuevoRelacionesEjercicio && this.isPermisoNuevoEjercicio));			
			this.jButtonNuevoGuardarCambiosToolBarEjercicio.setVisible((this.isVisibilidadCeldaNuevoEjercicio && this.isPermisoNuevoEjercicio && this.isPermisoGuardarCambiosEjercicio));			
			
			if(this.jInternalFrameDetalleFormEjercicio!=null) {
			this.jInternalFrameDetalleFormEjercicio.jButtonModificarToolBarEjercicio.setVisible((this.isVisibilidadCeldaModificarEjercicio && this.isPermisoActualizarEjercicio));	
			this.jInternalFrameDetalleFormEjercicio.jButtonActualizarToolBarEjercicio.setVisible((this.isVisibilidadCeldaActualizarEjercicio  && this.isPermisoActualizarEjercicio));	
			this.jInternalFrameDetalleFormEjercicio.jButtonEliminarToolBarEjercicio.setVisible((this.isVisibilidadCeldaEliminarEjercicio && this.isPermisoEliminarEjercicio));
			this.jInternalFrameDetalleFormEjercicio.jButtonCancelarToolBarEjercicio.setVisible(this.isVisibilidadCeldaCancelarEjercicio);				
			this.jInternalFrameDetalleFormEjercicio.jButtonGuardarCambiosToolBarEjercicio.setVisible((this.isVisibilidadCeldaGuardarEjercicio && this.isPermisoGuardarCambiosEjercicio));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEjercicio.setVisible((this.isVisibilidadCeldaGuardarCambiosEjercicio && this.isPermisoGuardarCambiosEjercicio));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEjercicio.setVisible((this.isVisibilidadCeldaNuevoEjercicio && this.isPermisoNuevoEjercicio));			
			this.jMenuItemDuplicarEjercicio.setVisible((this.isVisibilidadCeldaDuplicarEjercicio && this.isPermisoDuplicarEjercicio));			
			this.jMenuItemCopiarEjercicio.setVisible((this.isVisibilidadCeldaCopiarEjercicio && this.isPermisoCopiarEjercicio));			
			this.jMenuItemVerFormEjercicio.setVisible((this.isVisibilidadCeldaVerFormEjercicio && this.isPermisoVerFormEjercicio));			
			this.jMenuItemAbrirOrderByEjercicio.setVisible((this.isVisibilidadCeldaOrdenEjercicio && this.isPermisoOrdenEjercicio));			
			//this.jMenuItemMostrarOcultarEjercicio.setVisible((this.isVisibilidadCeldaOrdenEjercicio && this.isPermisoOrdenEjercicio));
			this.jMenuItemDetalleAbrirOrderByEjercicio.setVisible((this.isVisibilidadCeldaOrdenEjercicio && this.isPermisoOrdenEjercicio));			
			//this.jMenuItemDetalleMostrarOcultarEjercicio.setVisible((this.isVisibilidadCeldaOrdenEjercicio && this.isPermisoOrdenEjercicio));			
			this.jMenuItemNuevoRelacionesEjercicio.setVisible((this.isVisibilidadCeldaNuevoRelacionesEjercicio && this.isPermisoNuevoEjercicio));			
			this.jMenuItemNuevoGuardarCambiosEjercicio.setVisible((this.isVisibilidadCeldaNuevoEjercicio && this.isPermisoNuevoEjercicio && this.isPermisoGuardarCambiosEjercicio));									
			
			if(this.jInternalFrameDetalleFormEjercicio!=null) {
			this.jInternalFrameDetalleFormEjercicio.jMenuItemModificarEjercicio.setVisible((this.isVisibilidadCeldaModificarEjercicio && this.isPermisoActualizarEjercicio));	
			this.jInternalFrameDetalleFormEjercicio.jMenuItemActualizarEjercicio.setVisible((this.isVisibilidadCeldaActualizarEjercicio && this.isPermisoActualizarEjercicio));	
			this.jInternalFrameDetalleFormEjercicio.jMenuItemEliminarEjercicio.setVisible((this.isVisibilidadCeldaEliminarEjercicio && this.isPermisoEliminarEjercicio));
			this.jInternalFrameDetalleFormEjercicio.jMenuItemCancelarEjercicio.setVisible(this.isVisibilidadCeldaCancelarEjercicio);				
			}
			
			this.jMenuItemGuardarCambiosEjercicio.setVisible((this.isVisibilidadCeldaGuardarEjercicio && this.isPermisoGuardarCambiosEjercicio));						
			this.jMenuItemGuardarCambiosTablaEjercicio.setVisible((this.isVisibilidadCeldaGuardarCambiosEjercicio && this.isPermisoGuardarCambiosEjercicio));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEjercicio=this.jButtonNuevoEjercicio.isVisible();
			this.isVisibilidadCeldaDuplicarEjercicio=this.jButtonDuplicarEjercicio.isVisible();
			this.isVisibilidadCeldaCopiarEjercicio=this.jButtonCopiarEjercicio.isVisible();
			this.isVisibilidadCeldaVerFormEjercicio=this.jButtonVerFormEjercicio.isVisible();
			
			this.isVisibilidadCeldaOrdenEjercicio=this.jButtonAbrirOrderByEjercicio.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEjercicio=this.jButtonNuevoRelacionesEjercicio.isVisible();
			this.isVisibilidadCeldaModificarEjercicio=this.jButtonModificarEjercicio.isVisible();
			
			if(this.jInternalFrameDetalleFormEjercicio!=null) {
			this.isVisibilidadCeldaActualizarEjercicio=this.jInternalFrameDetalleFormEjercicio.jButtonActualizarEjercicio.isVisible();
			this.isVisibilidadCeldaEliminarEjercicio=this.jInternalFrameDetalleFormEjercicio.jButtonEliminarEjercicio.isVisible();
			this.isVisibilidadCeldaCancelarEjercicio=this.jInternalFrameDetalleFormEjercicio.jButtonCancelarEjercicio.isVisible();
			this.isVisibilidadCeldaGuardarEjercicio=this.jInternalFrameDetalleFormEjercicio.jButtonGuardarCambiosEjercicio.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEjercicio=this.jButtonGuardarCambiosTablaEjercicio.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEjercicio=this.jButtonNuevoToolBarEjercicio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEjercicio=this.jButtonNuevoRelacionesToolBarEjercicio.isVisible();
			
			if(this.jInternalFrameDetalleFormEjercicio!=null) {
			this.isVisibilidadCeldaModificarEjercicio=this.jInternalFrameDetalleFormEjercicio.jButtonModificarToolBarEjercicio.isVisible();
			this.isVisibilidadCeldaActualizarEjercicio=this.jInternalFrameDetalleFormEjercicio.jButtonActualizarToolBarEjercicio.isVisible();
			this.isVisibilidadCeldaEliminarEjercicio=this.jInternalFrameDetalleFormEjercicio.jButtonEliminarToolBarEjercicio.isVisible();
			this.isVisibilidadCeldaCancelarEjercicio=this.jInternalFrameDetalleFormEjercicio.jButtonCancelarToolBarEjercicio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEjercicio=this.jButtonGuardarCambiosToolBarEjercicio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEjercicio=this.jButtonGuardarCambiosTablaToolBarEjercicio.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEjercicio=this.jMenuItemNuevoEjercicio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEjercicio=this.jMenuItemNuevoRelacionesEjercicio.isVisible();
			
			if(this.jInternalFrameDetalleFormEjercicio!=null) {
			this.isVisibilidadCeldaModificarEjercicio=this.jInternalFrameDetalleFormEjercicio.jMenuItemModificarEjercicio.isVisible();
			this.isVisibilidadCeldaActualizarEjercicio=this.jInternalFrameDetalleFormEjercicio.jMenuItemActualizarEjercicio.isVisible();
			this.isVisibilidadCeldaEliminarEjercicio=this.jInternalFrameDetalleFormEjercicio.jMenuItemEliminarEjercicio.isVisible();
			this.isVisibilidadCeldaCancelarEjercicio=this.jInternalFrameDetalleFormEjercicio.jMenuItemCancelarEjercicio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEjercicio=this.jMenuItemGuardarCambiosEjercicio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEjercicio=this.jMenuItemGuardarCambiosTablaEjercicio.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEjercicio(Boolean esInicializar) {
		if(EjercicioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.ejercicioSessionBean.getConGuardarRelaciones()) {
				//if(this.ejercicioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEjercicio();
			}
			
			this.inicializarActualizarBindingBotonesManualEjercicio(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEjercicio() {
		this.jButtonNuevoEjercicio.setVisible(this.isPermisoNuevoEjercicio);			
		this.jButtonDuplicarEjercicio.setVisible(this.isPermisoDuplicarEjercicio);			
		this.jButtonCopiarEjercicio.setVisible(this.isPermisoCopiarEjercicio);			
		this.jButtonVerFormEjercicio.setVisible(this.isPermisoVerFormEjercicio);			
		
		this.jButtonAbrirOrderByEjercicio.setVisible(this.isPermisoOrdenEjercicio);					
		
		this.jButtonNuevoRelacionesEjercicio.setVisible(this.isPermisoNuevoEjercicio);			
		
		if(this.jInternalFrameDetalleFormEjercicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEjercicio.jButtonModificarEjercicio.setVisible(this.isPermisoActualizarEjercicio);	
			this.jInternalFrameDetalleFormEjercicio.jButtonActualizarEjercicio.setVisible(this.isPermisoActualizarEjercicio);	
			this.jInternalFrameDetalleFormEjercicio.jButtonEliminarEjercicio.setVisible(this.isPermisoEliminarEjercicio);
			this.jInternalFrameDetalleFormEjercicio.jButtonCancelarEjercicio.setVisible(this.isVisibilidadCeldaCancelarEjercicio);						
			this.jInternalFrameDetalleFormEjercicio.jButtonGuardarCambiosEjercicio.setVisible(this.isPermisoGuardarCambiosEjercicio);							
		}
		
		this.jButtonGuardarCambiosTablaEjercicio.setVisible(this.isPermisoActualizarEjercicio);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEjercicio() {
		this.jInternalFrameDetalleFormEjercicio.jButtonModificarEjercicio.setVisible(this.isPermisoActualizarEjercicio);	
		this.jInternalFrameDetalleFormEjercicio.jButtonActualizarEjercicio.setVisible(this.isPermisoActualizarEjercicio);	
		this.jInternalFrameDetalleFormEjercicio.jButtonEliminarEjercicio.setVisible(this.isPermisoEliminarEjercicio);
		this.jInternalFrameDetalleFormEjercicio.jButtonCancelarEjercicio.setVisible(this.isVisibilidadCeldaCancelarEjercicio);							
		this.jInternalFrameDetalleFormEjercicio.jButtonGuardarCambiosEjercicio.setVisible((this.isVisibilidadCeldaGuardarEjercicio && this.isPermisoGuardarCambiosEjercicio));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEjercicio() {
		if(EjercicioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEjercicio();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEjercicio() {
	}
	
	public void jTableDatosEjercicioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEjercicio(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEjercicioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEjercicio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEjercicio(this.getejercicio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEjercicio(this.ejercicio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ejercicio =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ejercicio =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ejercicio==null) {
						this.ejercicio = new Ejercicio();
					}

					this.setVariablesFormularioToObjetoActualEjercicio(this.ejercicio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEjercicio(this.ejercicio);
				}

				if(this.ejercicio.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.ejercicio.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEjercicio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEjercicioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEjercicio(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEjercicio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEjercicio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEjercicio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicio =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ejercicio =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEjercicio(this.getejercicio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEjercicio(this.ejercicio);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.ejercicioLogic.getConnexion());

				if(this.ejercicio.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.ejercicio.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEjercicio=(TitledBorder)this.jScrollPanelDatosEjercicio.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEjercicio.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEjercicioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEjercicio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEjercicio(this.getejercicio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEjercicio(this.ejercicio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ejercicio =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ejercicio =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ejercicio==null) {
						this.ejercicio = new Ejercicio();
					}

					this.setVariablesFormularioToObjetoActualEjercicio(this.ejercicio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEjercicio(this.ejercicio);
				}

				if(this.ejercicio.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.ejercicio.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEjercicio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioEjercicioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebEjercicio(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEjercicio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEjercicio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEjercicio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicio =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ejercicio =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEjercicio(this.getejercicio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEjercicio(this.ejercicio);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.ejercicioLogic.getConnexion());

				if(this.ejercicio.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.ejercicio.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEjercicio=(TitledBorder)this.jScrollPanelDatosEjercicio.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderEjercicio.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioEjercicioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEjercicio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEjercicio(this.getejercicio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEjercicio(this.ejercicio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ejercicio =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ejercicio =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ejercicio==null) {
						this.ejercicio = new Ejercicio();
					}

					this.setVariablesFormularioToObjetoActualEjercicio(this.ejercicio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEjercicio(this.ejercicio);
				}

				if(this.ejercicio.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.ejercicio.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEjercicio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioEjercicioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEjercicio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEjercicio(this.getejercicio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEjercicio(this.ejercicio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ejercicio =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ejercicio =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ejercicio==null) {
						this.ejercicio = new Ejercicio();
					}

					this.setVariablesFormularioToObjetoActualEjercicio(this.ejercicio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEjercicio(this.ejercicio);
				}

				if(this.ejercicio.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.ejercicio.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEjercicio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finEjercicioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEjercicio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEjercicio(this.getejercicio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEjercicio(this.ejercicio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ejercicio =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ejercicio =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ejercicio==null) {
						this.ejercicio = new Ejercicio();
					}

					this.setVariablesFormularioToObjetoActualEjercicio(this.ejercicio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEjercicio(this.ejercicio);
				}

				if(this.ejercicio.getfecha_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_fin = '"+Funciones2.getStringPostgresDate(this.ejercicio.getfecha_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEjercicio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoEjercicioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEjercicio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEjercicio(this.getejercicio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEjercicio(this.ejercicio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ejercicio =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ejercicio =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ejercicio==null) {
						this.ejercicio = new Ejercicio();
					}

					this.setVariablesFormularioToObjetoActualEjercicio(this.ejercicio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEjercicio(this.ejercicio);
				}

				if(this.ejercicio.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.ejercicio.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEjercicio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorFechaInicioEjercicioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEjercicio(false,false);

			this.getEjerciciosBusquedaPorFechaInicio();

			this.inicializarActualizarBindingEjercicio(false);

			//if(EjercicioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEjercicio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdAnioEjercicioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEjercicio(false,false);

			this.getEjerciciosFK_IdAnio();

			this.inicializarActualizarBindingEjercicio(false);

			//if(EjercicioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEjercicio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaEjercicioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEjercicio(false,false);

			this.getEjerciciosFK_IdEmpresa();

			this.inicializarActualizarBindingEjercicio(false);

			//if(EjercicioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEjercicio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ejercicioLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEjercicio() {
		if(this.jInternalFrameDetalleFormEjercicio!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEjercicio!=null) {
			this.jInternalFrameDetalleFormEjercicio.setVisible(false);	    			
			this.jInternalFrameDetalleFormEjercicio.dispose();
			this.jInternalFrameDetalleFormEjercicio=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEjercicio!=null) {
			this.jInternalFrameReporteDinamicoEjercicio.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEjercicio.dispose();
			this.jInternalFrameReporteDinamicoEjercicio=null;
		}
		
		if(this.jInternalFrameImportacionEjercicio!=null) {
			this.jInternalFrameImportacionEjercicio.setVisible(false);	    			
			this.jInternalFrameImportacionEjercicio.dispose();
			this.jInternalFrameImportacionEjercicio=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEjercicio();
			
			EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
			
			
			if(sTipo.equals("NuevoEjercicio")) {
				jButtonNuevoEjercicioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEjercicio")) {
				jButtonDuplicarEjercicioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEjercicio")) {
				jButtonCopiarEjercicioActionPerformed(evt);
			} else if(sTipo.equals("VerFormEjercicio")) {
				jButtonVerFormEjercicioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEjercicio")) {
				jButtonNuevoEjercicioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEjercicio")) {
				jButtonDuplicarEjercicioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEjercicio")) {
				jButtonNuevoEjercicioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEjercicio")) {
				jButtonDuplicarEjercicioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEjercicio")) {
				jButtonNuevoEjercicioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEjercicio")) {
				jButtonNuevoEjercicioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEjercicio")) {
				jButtonNuevoEjercicioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEjercicio")) {
				jButtonModificarEjercicioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEjercicio")) {
				jButtonModificarEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEjercicio")) {
				jButtonModificarEjercicioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEjercicio")) {
				jButtonActualizarEjercicioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEjercicio")) {
				jButtonActualizarEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEjercicio")) {
				jButtonActualizarEjercicioActionPerformed(evt);
			} else if(sTipo.equals("EliminarEjercicio")) {
				jButtonEliminarEjercicioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEjercicio")) {
				jButtonEliminarEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEjercicio")) {
				jButtonEliminarEjercicioActionPerformed(evt);
			} else if(sTipo.equals("CancelarEjercicio")) {
				jButtonCancelarEjercicioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEjercicio")) {
				jButtonCancelarEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEjercicio")) {
				jButtonCancelarEjercicioActionPerformed(evt);
			} else if(sTipo.equals("CerrarEjercicio")) {
				jButtonCerrarEjercicioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEjercicio")) {
				jButtonCerrarEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEjercicio")) {
				jButtonCerrarEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEjercicio")) {
				jButtonMostrarOcultarEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEjercicio")) {
				jButtonCancelarEjercicioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEjercicio")) {
				jButtonGuardarCambiosEjercicioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEjercicio")) {
				jButtonGuardarCambiosEjercicioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEjercicio")) {
				jButtonCopiarEjercicioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEjercicio")) {
				jButtonVerFormEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEjercicio")) {
				jButtonGuardarCambiosEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEjercicio")) {
				jButtonCopiarEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEjercicio")) {
				jButtonVerFormEjercicioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEjercicio")) {
				jButtonGuardarCambiosEjercicioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEjercicio")) {
				jButtonGuardarCambiosEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEjercicio")) {
				jButtonGuardarCambiosEjercicioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEjercicio")) {
				jButtonRecargarInformacionEjercicioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEjercicio")) {
				jButtonRecargarInformacionEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEjercicio")) {
				jButtonRecargarInformacionEjercicioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEjercicio")) {
				jButtonAnterioresEjercicioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEjercicio")) {
				jButtonAnterioresEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEjercicio")) {
				jButtonAnterioresEjercicioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEjercicio")) {
				jButtonSiguientesEjercicioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEjercicio")) {
				jButtonSiguientesEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEjercicio")) {
				jButtonSiguientesEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEjercicio") || sTipo.equals("MenuItemDetalleAbrirOrderByEjercicio")) {
				jButtonAbrirOrderByEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEjercicio") || sTipo.equals("MenuItemDetalleMostrarOcultarEjercicio")) {
				jButtonMostrarOcultarEjercicioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEjercicio")) {
				jButtonNuevoGuardarCambiosEjercicioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEjercicio")) {
				jButtonNuevoGuardarCambiosEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEjercicio")) {
				jButtonNuevoGuardarCambiosEjercicioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEjercicio")) {
				jButtonCerrarReporteDinamicoEjercicioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEjercicio")) {
				jButtonGenerarReporteDinamicoEjercicioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEjercicio")) {
				
				jButtonGenerarExcelReporteDinamicoEjercicioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEjercicio")) {
				jButtonCerrarImportacionEjercicioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEjercicio")) {
				
				jButtonGenerarImportacionEjercicioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEjercicio")) {
				
				jButtonAbrirImportacionEjercicioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEjercicio")) {
				jComboBoxTiposAccionesEjercicioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEjercicio")) {
				jComboBoxTiposRelacionesEjercicioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEjercicio")) {
				jComboBoxTiposAccionesEjercicioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEjercicio")) {
				
				jComboBoxTiposSeleccionarEjercicioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEjercicio")) {
				jTextFieldValorCampoGeneralEjercicioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEjercicio")) {
				jButtonAbrirOrderByEjercicioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEjercicio")) {
				jButtonAbrirOrderByEjercicioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEjercicio")) {
				jButtonCerrarOrderByEjercicioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEjercicioBusqueda")) {
				this.jButtonidEjercicioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEjercicioUpdate")) {
				this.jButtonid_empresaEjercicioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEjercicioBusqueda")) {
				this.jButtonid_empresaEjercicioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioEjercicioUpdate")) {
				this.jButtonid_anioEjercicioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioEjercicioBusqueda")) {
				this.jButtonid_anioEjercicioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioEjercicioBusqueda")) {
				this.jButtonfecha_inicioEjercicioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finEjercicioBusqueda")) {
				this.jButtonfecha_finEjercicioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoEjercicioBusqueda")) {
				this.jButtonesta_activoEjercicioBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorFechaInicioEjercicio")) {
				this.jButtonBusquedaPorFechaInicioEjercicioActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdAnioEjercicio")) {
				this.jButtonFK_IdAnioEjercicioActionPerformed(evt);
			}
			
			;
			
			
			EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEjercicio();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEjercicioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ejercicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ejercicio);
				
				EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
				
				


				
				EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ejercicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ejercicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Ejercicio ejercicioLocal=null;
			
			if(!this.getEsControlTabla()) {
				ejercicioLocal=this.ejercicio;
			} else {
				ejercicioLocal=this.ejercicioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ejercicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ejercicio);
				
				EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
							
				
				


				
				EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ejercicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ejercicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEjercicioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEjercicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioAnterior =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ejercicioAnterior =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
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
			
			EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
			
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
			
			


			
			EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEjercicioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ejercicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ejercicio);
				
				EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
								
						
				


				
				EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ejercicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ejercicio.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ejercicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ejercicio);
				
				EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
								
				
				


				
				EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ejercicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ejercicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEjercicioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEjercicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioAnterior =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ejercicioAnterior =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ejercicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ejercicio);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEjercicioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEjercicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioAnterior =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ejercicioAnterior =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEjercicioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ejercicio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ejercicio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ejercicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ejercicio);
				
				EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
							
				
				


				
				EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ejercicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ejercicio.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEjercicioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEjercicio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ejercicioAnterior =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ejercicioAnterior =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
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
			
			EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
			
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
			
			


			
			EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEjercicioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ejercicio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ejercicio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ejercicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ejercicio);
				
				EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
								
				
				


				
				EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ejercicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ejercicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEjercicioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEjercicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioAnterior =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ejercicioAnterior =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEjercicioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ejercicio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ejercicio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEjercicioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ejercicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ejercicio);
				
				EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEjercicio")) {
					jCheckBoxSeleccionarTodosEjercicioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEjercicio")) {
					jCheckBoxSeleccionadosEjercicioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEjercicio")) {
					
				}
				
				


				
				
				EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ejercicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ejercicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.ejercicio);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.ejercicio);
				
				EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
												
				
				


				
				
				EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ejercicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ejercicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEjercicioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEjercicio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ejercicioAnterior =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ejercicioAnterior =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEjercicioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ejercicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ejercicio);
				
				EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
				
				
				EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
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
			
			EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
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
			
			


			
			EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEjercicioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ejercicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ejercicio);
				
				EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ejercicio.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ejercicio.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ejercicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ejercicio);
				
				EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
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
				
				


				
				EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ejercicio.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ejercicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEjercicioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEjercicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ejercicioAnterior =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ejercicioAnterior =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEjercicio")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEjercicioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEjercicio.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.ejercicio =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.ejercicio =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.ejercicio);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEjercicio")) {
				
				}
				
				EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEjercicio")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEjercicio.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEjercicio")) {
			
			}
			
			EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEjercicio();
			
			EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
			
			if(sTipo.equals("NuevoEjercicio")) {
				jButtonNuevoEjercicioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEjercicio")) {
				jButtonDuplicarEjercicioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEjercicio")) {
				jButtonCopiarEjercicioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEjercicio")) {
				jButtonVerFormEjercicioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEjercicio")) {
				jButtonNuevoEjercicioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEjercicio")) {
				jButtonModificarEjercicioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEjercicio")) {
				jButtonActualizarEjercicioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEjercicio")) {
				jButtonEliminarEjercicioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEjercicio")) {
				jButtonGuardarCambiosEjercicioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEjercicio")) {
				jButtonCancelarEjercicioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEjercicio")) {
				jButtonCerrarEjercicioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEjercicio")) {
				jButtonGuardarCambiosEjercicioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEjercicio")) {
				jButtonNuevoGuardarCambiosEjercicioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEjercicio")) {
				jButtonAbrirOrderByEjercicioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEjercicio")) {
				jButtonRecargarInformacionEjercicioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEjercicio")) {
				jButtonAnterioresEjercicioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEjercicio")) {
				jButtonSiguientesEjercicioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEjercicioBusqueda")) {
				this.jButtonidEjercicioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEjercicioUpdate")) {
				this.jButtonid_empresaEjercicioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEjercicioBusqueda")) {
				this.jButtonid_empresaEjercicioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioEjercicioUpdate")) {
				this.jButtonid_anioEjercicioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioEjercicioBusqueda")) {
				this.jButtonid_anioEjercicioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioEjercicioBusqueda")) {
				this.jButtonfecha_inicioEjercicioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finEjercicioBusqueda")) {
				this.jButtonfecha_finEjercicioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoEjercicioBusqueda")) {
				this.jButtonesta_activoEjercicioBusquedaActionPerformed(evt);
			}
			
			EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEjercicio();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEjercicio")) {
				closingInternalFrameEjercicio();
				
			} else if(sTipo.equals("jButtonCancelarEjercicio")) {
				JInternalFrameBase jInternalFrameDetalleFormEjercicio = (JInternalFrameBase)evt.getSource();
	            	
	            EjercicioBeanSwingJInternalFrame jInternalFrameParent=(EjercicioBeanSwingJInternalFrame)jInternalFrameDetalleFormEjercicio.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEjercicioActionPerformed(null);
			}
			
			EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ejercicio,new Object(),this.ejercicioParameterGeneral,this.ejercicioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEjercicio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEjercicio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEjercicio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.ejercicio)) {
			if(!esControlTabla) {
				if(EjercicioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEjercicio(this.ejercicio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEjercicio(this.ejercicio);			
				}
				
				if(this.ejercicioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEjercicio(this.ejercicio,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.ejercicioReturnGeneral=ejercicioLogic.procesarEventosEjerciciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ejercicioLogic.getEjercicios(),this.ejercicio,this.ejercicioParameterGeneral,this.isEsNuevoEjercicio,classes);//this.ejercicioLogic.getEjercicio()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEjercicio(this.ejercicioReturnGeneral,this.ejercicioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.ejercicioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEjercicio(classes,this.ejercicioReturnGeneral,this.ejercicioBean,false);
					}
						
					if(this.ejercicioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEjercicio(this.ejercicioReturnGeneral.getEjercicio());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEjercicio(this.ejercicioReturnGeneral.getEjercicio());	
					}
						
					if(this.ejercicioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEjercicio(this.ejercicioReturnGeneral.getEjercicio(),classes);//this.ejercicioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEjercicio(this.ejercicio,classes);//this.ejercicioBean);									
				}
			
				if(EjercicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEjercicio(this.ejercicio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEjercicio(this.ejercicio);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.ejercicioAnterior!=null) {
						this.ejercicio=this.ejercicioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.ejercicioReturnGeneral=ejercicioLogic.procesarEventosEjerciciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ejercicioLogic.getEjercicios(),this.ejercicio,this.ejercicioParameterGeneral,this.isEsNuevoEjercicio,classes);//this.ejercicioLogic.getEjercicio()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.ejercicioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.ejercicioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.ejercicioReturnGeneral.getEjercicio(),ejercicioLogic.getEjercicios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.ejercicioReturnGeneral.getEjercicio(),this.ejercicios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEjercicio.repaint();
				
				//((AbstractTableModel) this.jTableDatosEjercicio.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEjercicio();
			}
		}
	}
	
	public void actualizarVisualTableDatosEjercicio() throws Exception {
		
		EjercicioModel ejercicioModel=(EjercicioModel)this.jTableDatosEjercicio.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ejercicioModel.ejercicios=this.ejercicioLogic.getEjercicios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			ejercicioModel.ejercicios=this.ejercicios;
		}
		
		
		((EjercicioModel) this.jTableDatosEjercicio.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEjercicio() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getejercicioAnterior(),this.ejercicioLogic.getEjercicios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getejercicioAnterior(),this.ejercicios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEjercicio();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEjercicio(Ejercicio ejercicio,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
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
										
				EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ejercicio,new Object(),generalEntityParameterGeneral,this.ejercicioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.ejercicioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EjercicioConstantesFunciones.getClassesRelationshipsOfEjercicio(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EjercicioConstantesFunciones.getClassesRelationshipsFromStringsOfEjercicio(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEjercicio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ejercicio,new Object(),generalEntityParameterGeneral,this.ejercicioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEjercicio(EjercicioBean ejercicioBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEjercicio(ArrayList<Classe> classes,EjercicioReturnGeneral ejercicioReturnGeneral,EjercicioBean ejercicioBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEjercicio(Ejercicio ejercicio,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.ejercicio)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEjercicio = new EjercicioDetalleFormJInternalFrame(jDesktopPane,this.ejercicioSessionBean.getConGuardarRelaciones(),this.ejercicioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEjercicio);
		this.jInternalFrameDetalleFormEjercicio.setVisible(false);
		this.jInternalFrameDetalleFormEjercicio.setSelected(false);						
		
		this.jInternalFrameDetalleFormEjercicio.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEjercicio.ejercicioLogic=this.ejercicioLogic;
		
		this.cargarCombosFrameForeignKeyEjercicio("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEjercicio();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEjercicio();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEjercicio("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEjercicio();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEjercicio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEjercicio"));
		
		this.jInternalFrameDetalleFormEjercicio.jButtonModificarEjercicio.addActionListener(new ButtonActionListener(this,"ModificarEjercicio"));

		
		this.jInternalFrameDetalleFormEjercicio.jButtonModificarToolBarEjercicio.addActionListener(new ButtonActionListener(this,"ModificarToolBarEjercicio"));
					
		this.jInternalFrameDetalleFormEjercicio.jMenuItemModificarEjercicio.addActionListener(new ButtonActionListener(this,"MenuItemModificarEjercicio"));		
		
		
		
		this.jInternalFrameDetalleFormEjercicio.jButtonActualizarEjercicio.addActionListener (new ButtonActionListener(this,"ActualizarEjercicio"));
		
		
		this.jInternalFrameDetalleFormEjercicio.jButtonActualizarToolBarEjercicio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEjercicio"));
						
		this.jInternalFrameDetalleFormEjercicio.jMenuItemActualizarEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEjercicio"));		
		
		
		
		this.jInternalFrameDetalleFormEjercicio.jButtonEliminarEjercicio.addActionListener (new ButtonActionListener(this,"EliminarEjercicio"));
		
		
		this.jInternalFrameDetalleFormEjercicio.jButtonEliminarToolBarEjercicio.addActionListener (new ButtonActionListener(this,"EliminarToolBarEjercicio"));
								
		this.jInternalFrameDetalleFormEjercicio.jMenuItemEliminarEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEjercicio"));		
		
		
		
		this.jInternalFrameDetalleFormEjercicio.jButtonCancelarEjercicio.addActionListener (new ButtonActionListener(this,"CancelarEjercicio"));
		
		
		this.jInternalFrameDetalleFormEjercicio.jButtonCancelarToolBarEjercicio.addActionListener (new ButtonActionListener(this,"CancelarToolBarEjercicio"));
					
		this.jInternalFrameDetalleFormEjercicio.jMenuItemCancelarEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEjercicio"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEjercicio.jMenuItemDetalleCerrarEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEjercicio"));		
		
		
		
		this.jInternalFrameDetalleFormEjercicio.jButtonGuardarCambiosToolBarEjercicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEjercicio"));
		
		
		
		this.jInternalFrameDetalleFormEjercicio.jButtonGuardarCambiosToolBarEjercicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEjercicio"));
		
		
		
		this.jInternalFrameDetalleFormEjercicio.jComboBoxTiposAccionesFormularioEjercicio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEjercicio"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEjercicio.jButtonidEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"idEjercicioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEjercicio.jButtonid_empresaEjercicioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEjercicioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEjercicio.jButtonid_empresaEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEjercicioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEjercicio.jButtonid_anioEjercicioUpdate.addActionListener(new ButtonActionListener(this,"id_anioEjercicioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEjercicio.jButtonid_anioEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"id_anioEjercicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEjercicio.jButtonfecha_inicioEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioEjercicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEjercicio.jButtonfecha_finEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finEjercicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEjercicio.jButtonesta_activoEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoEjercicioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEjercicio.jTabbedPaneRelacionesEjercicio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEjercicio"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEjercicio"));
		
		if(this.jInternalFrameDetalleFormEjercicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEjercicio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEjercicio"));
		}
		
		this.jTableDatosEjercicio.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEjercicio"));
		
		this.jTableDatosEjercicio.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEjercicio"));
		
		this.jButtonNuevoEjercicio.addActionListener(new ButtonActionListener(this,"NuevoEjercicio"));
		
		this.jButtonDuplicarEjercicio.addActionListener(new ButtonActionListener(this,"DuplicarEjercicio"));
		
		this.jButtonCopiarEjercicio.addActionListener(new ButtonActionListener(this,"CopiarEjercicio"));
		
		this.jButtonVerFormEjercicio.addActionListener(new ButtonActionListener(this,"VerFormEjercicio"));
		
		
		this.jButtonNuevoToolBarEjercicio.addActionListener(new ButtonActionListener(this,"NuevoToolBarEjercicio"));
			
		this.jButtonDuplicarToolBarEjercicio.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEjercicio"));
			
		this.jMenuItemNuevoEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEjercicio"));
			
		this.jMenuItemDuplicarEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEjercicio"));		
		
		
		this.jButtonNuevoRelacionesEjercicio.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEjercicio"));
		
		
		this.jButtonNuevoRelacionesToolBarEjercicio.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEjercicio"));
			
		this.jMenuItemNuevoRelacionesEjercicio.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEjercicio"));		
		
		
		if(this.jInternalFrameDetalleFormEjercicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEjercicio.jButtonModificarEjercicio.addActionListener(new ButtonActionListener(this,"ModificarEjercicio"));
		}
		
		
		if(this.jInternalFrameDetalleFormEjercicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEjercicio.jButtonModificarToolBarEjercicio.addActionListener(new ButtonActionListener(this,"ModificarToolBarEjercicio"));
			
			this.jInternalFrameDetalleFormEjercicio.jMenuItemModificarEjercicio.addActionListener(new ButtonActionListener(this,"MenuItemModificarEjercicio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEjercicio!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEjercicio.jButtonActualizarEjercicio.addActionListener (new ButtonActionListener(this,"ActualizarEjercicio"));
		}
		
		
		if(this.jInternalFrameDetalleFormEjercicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEjercicio.jButtonActualizarToolBarEjercicio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEjercicio"));
				
			this.jInternalFrameDetalleFormEjercicio.jMenuItemActualizarEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEjercicio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEjercicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEjercicio.jButtonEliminarEjercicio.addActionListener (new ButtonActionListener(this,"EliminarEjercicio"));
		}
		
		
		if(this.jInternalFrameDetalleFormEjercicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEjercicio.jButtonEliminarToolBarEjercicio.addActionListener (new ButtonActionListener(this,"EliminarToolBarEjercicio"));
						
			this.jInternalFrameDetalleFormEjercicio.jMenuItemEliminarEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEjercicio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEjercicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEjercicio.jButtonCancelarEjercicio.addActionListener (new ButtonActionListener(this,"CancelarEjercicio"));
		}
		
		
		if(this.jInternalFrameDetalleFormEjercicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEjercicio.jButtonCancelarToolBarEjercicio.addActionListener (new ButtonActionListener(this,"CancelarToolBarEjercicio"));
			
			this.jInternalFrameDetalleFormEjercicio.jMenuItemCancelarEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEjercicio"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEjercicio.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEjercicio"));		
		
		
		this.jButtonCerrarEjercicio.addActionListener (new ButtonActionListener(this,"CerrarEjercicio"));
		
		
		this.jButtonCerrarToolBarEjercicio.addActionListener (new ButtonActionListener(this,"CerrarToolBarEjercicio"));
			
		this.jMenuItemCerrarEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEjercicio"));
			
		if(this.jInternalFrameDetalleFormEjercicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEjercicio.jMenuItemDetalleCerrarEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEjercicio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEjercicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEjercicio.jButtonGuardarCambiosEjercicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosEjercicio"));
		}
		
		
		if(this.jInternalFrameDetalleFormEjercicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEjercicio.jButtonGuardarCambiosToolBarEjercicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEjercicio"));
		}
		
		this.jButtonCopiarToolBarEjercicio.addActionListener (new ButtonActionListener(this,"CopiarToolBarEjercicio"));
			
		this.jButtonVerFormToolBarEjercicio.addActionListener (new ButtonActionListener(this,"VerFormToolBarEjercicio"));
		
		this.jMenuItemGuardarCambiosEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEjercicio"));
			
		this.jMenuItemCopiarEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEjercicio"));		
		
		this.jMenuItemVerFormEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEjercicio"));		
		
		
		this.jButtonGuardarCambiosTablaEjercicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEjercicio"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEjercicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEjercicio"));
			
		this.jMenuItemGuardarCambiosTablaEjercicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEjercicio"));		
		
		
		
		this.jButtonRecargarInformacionEjercicio.addActionListener (new ButtonActionListener(this,"RecargarInformacionEjercicio"));
					
		this.jButtonRecargarInformacionToolBarEjercicio.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEjercicio"));
		
		this.jMenuItemRecargarInformacionEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEjercicio"));		
		
		
		
		this.jButtonAnterioresEjercicio.addActionListener (new ButtonActionListener(this,"AnterioresEjercicio"));
		
		
		this.jButtonAnterioresToolBarEjercicio.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEjercicio"));
		
		this.jMenuItemAnterioresEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEjercicio"));		
		
		
		this.jButtonSiguientesEjercicio.addActionListener (new ButtonActionListener(this,"SiguientesEjercicio"));
		
		
		this.jButtonSiguientesToolBarEjercicio.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEjercicio"));
			
		this.jMenuItemSiguientesEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEjercicio"));
			
		this.jMenuItemAbrirOrderByEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEjercicio"));
			
		this.jMenuItemMostrarOcultarEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEjercicio"));
			
		this.jMenuItemDetalleAbrirOrderByEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEjercicio"));
			
		this.jMenuItemDetalleMostarOcultarEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEjercicio"));		
		
		
		this.jButtonNuevoGuardarCambiosEjercicio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEjercicio"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEjercicio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEjercicio"));
			
		this.jMenuItemNuevoGuardarCambiosEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEjercicio"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEjercicio.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEjercicio"));

		this.jCheckBoxSeleccionadosEjercicio.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEjercicio"));
		
		if(this.jInternalFrameDetalleFormEjercicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEjercicio.jComboBoxTiposAccionesFormularioEjercicio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEjercicio"));
		}
		
		
		this.jComboBoxTiposRelacionesEjercicio.addActionListener (new ButtonActionListener(this,"TiposRelacionesEjercicio"));
			
		this.jComboBoxTiposAccionesEjercicio.addActionListener (new ButtonActionListener(this,"TiposAccionesEjercicio"));
					
		this.jComboBoxTiposSeleccionarEjercicio.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEjercicio"));
			
		this.jTextFieldValorCampoGeneralEjercicio.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEjercicio"));		
		
		
		if(this.jInternalFrameDetalleFormEjercicio!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEjercicio.jButtonidEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"idEjercicioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEjercicio.jButtonid_empresaEjercicioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEjercicioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEjercicio.jButtonid_empresaEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEjercicioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEjercicio.jButtonid_anioEjercicioUpdate.addActionListener(new ButtonActionListener(this,"id_anioEjercicioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEjercicio.jButtonid_anioEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"id_anioEjercicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEjercicio.jButtonfecha_inicioEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioEjercicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEjercicio.jButtonfecha_finEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finEjercicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEjercicio.jButtonesta_activoEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoEjercicioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorFechaInicioEjercicio.addActionListener(new ButtonActionListener(this,"BusquedaPorFechaInicioEjercicio"));

			this.jButtonFK_IdAnioEjercicio.addActionListener(new ButtonActionListener(this,"FK_IdAnioEjercicio"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEjercicio!=null) {
				this.jInternalFrameReporteDinamicoEjercicio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEjercicio"));
				this.jInternalFrameReporteDinamicoEjercicio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEjercicio"));
				this.jInternalFrameReporteDinamicoEjercicio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEjercicio"));
			}
			
			//this.jButtonCerrarReporteDinamicoEjercicio.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEjercicio"));				
			//this.jButtonGenerarReporteDinamicoEjercicio.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEjercicio"));
			//this.jButtonGenerarExcelReporteDinamicoEjercicio.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEjercicio"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEjercicio!=null) {
				this.jInternalFrameImportacionEjercicio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEjercicio"));
				this.jInternalFrameImportacionEjercicio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEjercicio"));
				this.jInternalFrameImportacionEjercicio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEjercicio"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEjercicio.addActionListener (new ButtonActionListener(this,"AbrirOrderByEjercicio"));
			
			this.jButtonAbrirOrderByToolBarEjercicio.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEjercicio"));			
			
			if(this.jInternalFrameOrderByEjercicio!=null) {
				this.jInternalFrameOrderByEjercicio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEjercicio"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEjercicio!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEjercicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEjercicio.jTabbedPaneRelacionesEjercicio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEjercicio"));
		
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
            		closingInternalFrameEjercicio();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEjercicio.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEjercicio = (JInternalFrameBase)event.getSource();
	            	
	            EjercicioBeanSwingJInternalFrame jInternalFrameParent=(EjercicioBeanSwingJInternalFrame)jInternalFrameDetalleFormEjercicio.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEjercicioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEjercicio.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEjercicioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEjercicio.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEjercicio.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEjercicioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEjercicioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEjercicioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEjercicio";
		inputMap = this.jButtonNuevoEjercicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEjercicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEjercicioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEjercicioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEjercicioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEjercicioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEjercicio";
		inputMap = this.jButtonNuevoRelacionesEjercicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEjercicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEjercicioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEjercicio";
		inputMap = this.jButtonModificarEjercicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEjercicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEjercicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEjercicio";
		inputMap = this.jButtonActualizarEjercicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEjercicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEjercicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEjercicio";
		inputMap = this.jButtonEliminarEjercicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEjercicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEjercicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEjercicio";
		inputMap = this.jButtonCancelarEjercicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEjercicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEjercicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEjercicio";
		inputMap = this.jButtonCerrarEjercicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEjercicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEjercicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEjercicio.jButtonGuardarCambiosEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEjercicio";
		inputMap = this.jInternalFrameDetalleFormEjercicio.jButtonGuardarCambiosEjercicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEjercicio.jButtonGuardarCambiosEjercicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEjercicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEjercicio.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEjercicioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEjercicio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEjercicioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEjercicio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEjercicioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEjercicio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEjercicioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEjercicio.jButtonidEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"idEjercicioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEjercicio.jButtonid_empresaEjercicioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEjercicioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEjercicio.jButtonid_empresaEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEjercicioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEjercicio.jButtonid_anioEjercicioUpdate.addActionListener(new ButtonActionListener(this,"id_anioEjercicioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEjercicio.jButtonid_anioEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"id_anioEjercicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEjercicio.jButtonfecha_inicioEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioEjercicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEjercicio.jButtonfecha_finEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finEjercicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEjercicio.jButtonesta_activoEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoEjercicioBusqueda"));
		
		
		this.jButtonBusquedaPorFechaInicioEjercicio.addActionListener(new ButtonActionListener(this,"BusquedaPorFechaInicioEjercicio"));

		this.jButtonFK_IdAnioEjercicio.addActionListener(new ButtonActionListener(this,"FK_IdAnioEjercicio"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEjercicioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEjercicio.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEjercicio(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Ejercicio ejercicioAux:this.ejercicioLogic.getEjercicios()) {
					ejercicioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Ejercicio ejercicioAux:ejercicios) {
					ejercicioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEjercicioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEjercicio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Ejercicio ejercicioAux:this.ejercicioLogic.getEjercicios()) {
						ejercicioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Ejercicio ejercicioAux:ejercicios) {
						ejercicioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Ejercicio ejercicioAux:this.ejercicioLogic.getEjercicios()) {
					
						if(sTipoSeleccionar.equals(EjercicioConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							ejercicioAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Ejercicio ejercicioAux:ejercicios) {
						
						if(sTipoSeleccionar.equals(EjercicioConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							ejercicioAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEjercicio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEjercicio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEjercicio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEjercicio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEjercicioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEjercicio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEjercicio.getSelectedRows();
			
			Ejercicio ejercicioLocal=new Ejercicio();
			
			//this.seleccionarTodosEjercicio(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLocal =(Ejercicio) this.ejercicioLogic.getEjercicios().toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					ejercicioLocal =(Ejercicio) this.ejercicios.toArray()[this.jTableDatosEjercicio.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				ejercicioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Ejercicio ejercicioAux:this.ejercicioLogic.getEjercicios()) {
						ejercicioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Ejercicio ejercicioAux:ejercicios) {
						ejercicioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEjercicio(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEjercicio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEjercicio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEjercicio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEjercicioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEjercicioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEjercicioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEjercicio(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEjercicio.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Ejercicio ejercicioAux:this.ejercicioLogic.getEjercicios()) {
				
						if(sTipoSeleccionar.equals(EjercicioConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							ejercicioAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EjercicioConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							ejercicioAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Ejercicio ejercicioAux:ejercicios) {
					
						if(sTipoSeleccionar.equals(EjercicioConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							ejercicioAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EjercicioConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							ejercicioAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEjercicio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEjercicioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEjercicio(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEjercicio=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEjercicio.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEjercicio.jComboBoxTiposAccionesFormularioEjercicio.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEjercicio) {				
					conSplash=true;//false;										
					
					//this.startProcessEjercicio(conSplash);
				
					this.generarReporteEjerciciosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEjercicio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEjercicio.jComboBoxTiposAccionesFormularioEjercicio.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEjerciciosSeleccionados();
				//this.jComboBoxTiposAccionesEjercicio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEjerciciosSeleccionados(false);
				//this.jComboBoxTiposAccionesEjercicio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEjerciciosSeleccionados(true);
				//this.jComboBoxTiposAccionesEjercicio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEjercicio();
				
				this.exportarEjerciciosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEjercicio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEjercicio.jComboBoxTiposAccionesFormularioEjercicio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEjercicios();
				//this.importarEjercicios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEjercicio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEjercicio.jComboBoxTiposAccionesFormularioEjercicio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEjercicio();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEjerciciosSeleccionados();
				//this.jComboBoxTiposAccionesEjercicio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Ejercicio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEjercicio();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEjercicio)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEjercicio(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Ejercicio",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEjercicio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEjercicio.jComboBoxTiposAccionesFormularioEjercicio.setSelectedIndex(0);					
				}	
			} 			
			else if(EjercicioBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEjercicio) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEjercicio(conSplash);
					
						//this.actualizarParametrosGeneralEjercicio();
						
						this.generarReporteProcesoAccionEjerciciosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEjercicio.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEjercicio.jComboBoxTiposAccionesFormularioEjercicio.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EjercicioBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO EjercicioS SELECCIONADOS?", "MANTENIMIENTO DE Ejercicio", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEjercicio();
				
						this.actualizarParametrosGeneralEjercicio();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.ejercicioReturnGeneral=ejercicioLogic.procesarAccionEjerciciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.ejercicioLogic.getEjercicios(),this.ejercicioParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEjercicioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEjercicio.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEjercicio.jComboBoxTiposAccionesFormularioEjercicio.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEjercicio();
					
					EjercicioBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEjercicioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEjercicio.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEjercicio.jComboBoxTiposAccionesFormularioEjercicio.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEjercicio(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEjercicioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEjercicio();
			
			if(this.jInternalFrameDetalleFormEjercicio==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Ejercicio> ejerciciosSeleccionados=new ArrayList<Ejercicio>();		
			Ejercicio ejercicio=new Ejercicio();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEjercicio(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEjercicio.getSelectedItem();
			
			
			
			
			ejerciciosSeleccionados=this.getEjerciciosSeleccionados(true);
			//this.sTipoAccion;
			
			if(ejerciciosSeleccionados.size()==1) {
				for(Ejercicio ejercicioAux:ejerciciosSeleccionados) {
					ejercicio=ejercicioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEjercicio();
			
      		//this.finishProcessEjercicio(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEjercicioReturnGeneral() throws Exception {
		if(this.ejercicioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.ejercicioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.ejercicioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.ejercicioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.ejercicioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.ejercicioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEjercicio(false);
		}
		
		if(this.ejercicioReturnGeneral.getConRetornoLista() || this.ejercicioReturnGeneral.getConRetornoObjeto()) {
			if(this.ejercicioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.ejercicioLogic.setEjercicios(this.ejercicioReturnGeneral.getEjercicios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.ejercicioReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.ejercicioLogic.setEjercicio(this.ejercicioReturnGeneral.getEjercicio());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEjercicio(false);
		}
	}
	
	public void actualizarParametrosGeneralEjercicio() throws Exception {
		
		
	}
	
	public ArrayList<Ejercicio> getEjerciciosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Ejercicio> ejerciciosSeleccionados=new ArrayList<Ejercicio>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEjercicio) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Ejercicio ejercicioAux:ejercicioLogic.getEjercicios()) {
					if(ejercicioAux.getIsSelected()) {
						ejerciciosSeleccionados.add(ejercicioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Ejercicio ejercicioAux:this.ejercicios) {
					if(ejercicioAux.getIsSelected()) {
						ejerciciosSeleccionados.add(ejercicioAux);				
					}
				}
			}
			
			if(ejerciciosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						ejerciciosSeleccionados.addAll(this.ejercicioLogic.getEjercicios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						ejerciciosSeleccionados.addAll(this.ejercicios);				
					}
				}
			}
		} else {
			ejerciciosSeleccionados.add(this.ejercicio);
		}
		
		return ejerciciosSeleccionados;
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
	
	public void generarReporteEjerciciosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEjerciciosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEjerciciosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEjerciciosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEjerciciosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Ejercicio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEjerciciosSeleccionados() throws Exception {
		ArrayList<Ejercicio> ejerciciosSeleccionados=new ArrayList<Ejercicio>();		
		
		ejerciciosSeleccionados=this.getEjerciciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEjercicios("Todos",ejerciciosSeleccionados);
		
	}	
	
	public void generarReporteNormalEjerciciosSeleccionados() throws Exception {
		ArrayList<Ejercicio> ejerciciosSeleccionados=new ArrayList<Ejercicio>();		
		
		ejerciciosSeleccionados=this.getEjerciciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEjercicios("Todos",ejerciciosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEjerciciosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Ejercicio> ejerciciosSeleccionados=new ArrayList<Ejercicio>();
		
		ejerciciosSeleccionados=this.getEjerciciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEjercicios("Todos",ejerciciosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEjerciciosSeleccionados() throws Exception {
		ArrayList<Ejercicio> ejerciciosSeleccionados=new ArrayList<Ejercicio>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEjercicio();
		
		
		ejerciciosSeleccionados=this.getEjerciciosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEjercicio();
		
		
		//this.generarReporteEjercicios("Todos",ejerciciosSeleccionados ,ejercicioImplementable,ejercicioImplementableHome);
	}
	
	public void mostrarImportacionEjercicios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEjercicio();
		
		this.abrirFrameImportacionEjercicio();		
		
			
		//this.generarReporteEjercicios("Todos",ejerciciosSeleccionados ,ejercicioImplementable,ejercicioImplementableHome);
	}
	
	public void importarEjercicios() throws Exception {		
	
	}
	
	public void exportarEjerciciosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEjerciciosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEjerciciosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEjerciciosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Ejercicio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEjerciciosSeleccionados() throws Exception {
		ArrayList<Ejercicio> ejerciciosSeleccionados=new ArrayList<Ejercicio>();		
		
		ejerciciosSeleccionados=this.getEjerciciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ejercicio."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEjercicio(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Ejercicio ejercicioAux:ejerciciosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEjercicio(ejercicioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//ejercicioAux.setsDetalleGeneralEntityReporte(ejercicioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ejercicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ejercicio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEjercicio(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EjercicioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EjercicioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EjercicioConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EjercicioConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EjercicioConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EjercicioConstantesFunciones.LABEL_FECHAFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EjercicioConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEjercicio(Ejercicio ejercicio,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=ejercicio.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=ejercicio.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=ejercicio.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ejercicio.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ejercicio.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ejercicio.getfecha_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ejercicio.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEjerciciosSeleccionados() throws Exception {
		ArrayList<Ejercicio> ejerciciosSeleccionados=new ArrayList<Ejercicio>();		
		
		ejerciciosSeleccionados=this.getEjerciciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ejercicio.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Ejercicios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEjercicio(row);				
				iRow++;
			}				
			
			for(Ejercicio ejercicioAux:ejerciciosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEjercicio(ejercicioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ejercicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ejercicio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEjerciciosSeleccionados() throws Exception {
		ArrayList<Ejercicio> ejerciciosSeleccionados=new ArrayList<Ejercicio>();		
		
		ejerciciosSeleccionados=this.getEjerciciosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ejercicio.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("ejercicios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("ejercicio");
			//elementRoot.appendChild(element);
		
			for(Ejercicio ejercicioAux:ejerciciosSeleccionados) {
				element = document.createElement("ejercicio");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEjercicio(ejercicioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ejercicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ejercicio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEjercicio(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EjercicioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EjercicioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EjercicioConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EjercicioConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(EjercicioConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(EjercicioConstantesFunciones.LABEL_FECHAFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(EjercicioConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEjercicio(Ejercicio ejercicio,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ejercicio.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(ejercicio.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ejercicio.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ejercicio.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(ejercicio.getfecha_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(ejercicio.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlEjercicio(Ejercicio ejercicio,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EjercicioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(ejercicio.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EjercicioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(ejercicio.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(EjercicioConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(ejercicio.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementanio_descripcion = document.createElement(EjercicioConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(ejercicio.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementfecha_inicio = document.createElement(EjercicioConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(ejercicio.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_fin = document.createElement(EjercicioConstantesFunciones.FECHAFIN);
		elementfecha_fin.appendChild(document.createTextNode(ejercicio.getfecha_fin().toString().trim()));
		element.appendChild(elementfecha_fin);

		Element elementesta_activo = document.createElement(EjercicioConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(ejercicio.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoEjerciciosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Ejercicio> ejerciciosSeleccionados=new ArrayList<Ejercicio>();
		
		ejerciciosSeleccionados=this.getEjerciciosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEjercicio(ejerciciosSeleccionados);
		
		this.generarReporteEjercicios("Todos",ejerciciosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEjercicio(ArrayList<Ejercicio> ejerciciosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Ejercicio ejercicioAux:ejerciciosSeleccionados) {
				ejercicioAux.setsDetalleGeneralEntityReporte(ejercicioAux.toString());
			
				if(sTipoSeleccionar.equals(EjercicioConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					ejercicioAux.setsDescripcionGeneralEntityReporte1(ejercicioAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EjercicioConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					ejercicioAux.setsDescripcionGeneralEntityReporte1(ejercicioAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EjercicioConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					ejercicioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ejercicioAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(EjercicioConstantesFunciones.LABEL_FECHAFIN)) {
					existe=true;
					ejercicioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ejercicioAux.getfecha_fin()));
				}
				 else if(sTipoSeleccionar.equals(EjercicioConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					ejercicioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(ejercicioAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEjercicio(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEjercicio=true;
				this.isVisibilidadCeldaNuevoRelacionesEjercicio=true;
				this.isVisibilidadCeldaGuardarCambiosEjercicio=true;
			}
			
			this.isVisibilidadCeldaModificarEjercicio=false;
			this.isVisibilidadCeldaActualizarEjercicio=false;
			this.isVisibilidadCeldaEliminarEjercicio=false;
			this.isVisibilidadCeldaCancelarEjercicio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEjercicio=true;
				} else {
					this.isVisibilidadCeldaGuardarEjercicio=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEjercicio=false;
			this.isVisibilidadCeldaNuevoRelacionesEjercicio=false;
			this.isVisibilidadCeldaGuardarCambiosEjercicio=false;
			this.isVisibilidadCeldaModificarEjercicio=false;
			this.isVisibilidadCeldaActualizarEjercicio=true;
			this.isVisibilidadCeldaEliminarEjercicio=false;
			this.isVisibilidadCeldaCancelarEjercicio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEjercicio=true;
				} else {
					this.isVisibilidadCeldaGuardarEjercicio=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEjercicio=false;
			this.isVisibilidadCeldaNuevoRelacionesEjercicio=false;
			this.isVisibilidadCeldaGuardarCambiosEjercicio=false;
			this.isVisibilidadCeldaModificarEjercicio=false;
			this.isVisibilidadCeldaActualizarEjercicio=true;
			this.isVisibilidadCeldaEliminarEjercicio=true;
			this.isVisibilidadCeldaCancelarEjercicio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEjercicio=true;
				} else {
					this.isVisibilidadCeldaGuardarEjercicio=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEjercicio=false;
			this.isVisibilidadCeldaNuevoRelacionesEjercicio=false;
			this.isVisibilidadCeldaGuardarCambiosEjercicio=false;
			this.isVisibilidadCeldaModificarEjercicio=false;
			this.isVisibilidadCeldaActualizarEjercicio=true;
			this.isVisibilidadCeldaEliminarEjercicio=false;
			this.isVisibilidadCeldaCancelarEjercicio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEjercicio=false;
				} else {
					this.isVisibilidadCeldaGuardarEjercicio=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEjercicio=true;
			this.isVisibilidadCeldaNuevoRelacionesEjercicio=true;
			this.isVisibilidadCeldaGuardarCambiosEjercicio=true;
			this.isVisibilidadCeldaModificarEjercicio=false;
			this.isVisibilidadCeldaActualizarEjercicio=false;
			this.isVisibilidadCeldaEliminarEjercicio=false;
			this.isVisibilidadCeldaCancelarEjercicio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEjercicio=true;
				} else {
					this.isVisibilidadCeldaGuardarEjercicio=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEjercicio=false;
			this.isVisibilidadCeldaNuevoRelacionesEjercicio=false;
			this.isVisibilidadCeldaGuardarCambiosEjercicio=false;
			this.isVisibilidadCeldaActualizarEjercicio=false;
			this.isVisibilidadCeldaEliminarEjercicio=false;
			this.isVisibilidadCeldaCancelarEjercicio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEjercicio=false;
				} else {
					this.isVisibilidadCeldaGuardarEjercicio=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEjercicio=false;
			this.isVisibilidadCeldaNuevoRelacionesEjercicio=false;
			this.isVisibilidadCeldaGuardarCambiosEjercicio=false;
			this.isVisibilidadCeldaModificarEjercicio=true;
			this.isVisibilidadCeldaActualizarEjercicio=false;
			this.isVisibilidadCeldaEliminarEjercicio=false;
			this.isVisibilidadCeldaCancelarEjercicio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEjercicio=false;
				} else {
					this.isVisibilidadCeldaGuardarEjercicio=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EjercicioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEjercicio=true;
			this.isVisibilidadCeldaNuevoRelacionesEjercicio=true;
			this.isVisibilidadCeldaGuardarCambiosEjercicio=true;
		} else {
			this.actualizarEstadoPanelsEjercicio(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEjercicio=false;
			//this.isVisibilidadCeldaVerFormEjercicio=false;
			this.isVisibilidadCeldaDuplicarEjercicio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!ejercicioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEjercicio=false;
		} else {
			this.isVisibilidadCeldaNuevoEjercicio=false;
			this.isVisibilidadCeldaGuardarCambiosEjercicio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(ejercicioSessionBean.getEsGuardarRelacionado()) {
			if(!ejercicioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEjercicio=false;												
			}
			
			this.jButtonCerrarEjercicio.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEjercicio=false;
		}
		
		if(!this.permiteMantenimiento(this.ejercicio)) {
			this.isVisibilidadCeldaActualizarEjercicio=false;
			this.isVisibilidadCeldaEliminarEjercicio=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEjercicio() {
	}
	
	public void actualizarEstadoPanelsEjercicio(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEjercicio!=null) {
				this.jScrollPanelDatosEdicionEjercicio.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEjercicio!=null) {
				this.jTabbedPaneBusquedasEjercicio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEjercicio!=null) {
				this.jScrollPanelDatosEjercicio.setVisible(true);
			}
			
			if(this.jPanelPaginacionEjercicio!=null) {
				this.jPanelPaginacionEjercicio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEjercicio!=null) {
				this.jPanelParametrosReportesEjercicio.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEjercicio!=null) {
				this.jScrollPanelDatosEdicionEjercicio.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEjercicio!=null) {
				this.jTabbedPaneBusquedasEjercicio.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEjercicio!=null) {
				this.jScrollPanelDatosEjercicio.setVisible(false);
			}
			
			if(this.jPanelPaginacionEjercicio!=null) {
				this.jPanelPaginacionEjercicio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEjercicio!=null) {
				this.jPanelParametrosReportesEjercicio.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEjercicio!=null) {
				this.jScrollPanelDatosEdicionEjercicio.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEjercicio!=null) {
				this.jTabbedPaneBusquedasEjercicio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEjercicio!=null) {
				this.jScrollPanelDatosEjercicio.setVisible(false);
			}
			
			if(this.jPanelPaginacionEjercicio!=null) {
				this.jPanelPaginacionEjercicio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEjercicio!=null) {
				this.jPanelParametrosReportesEjercicio.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEjercicio!=null) {
				this.jScrollPanelDatosEdicionEjercicio.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEjercicio!=null) {
				this.jTabbedPaneBusquedasEjercicio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEjercicio!=null) {
				this.jScrollPanelDatosEjercicio.setVisible(false);
			}
			
			if(this.jPanelPaginacionEjercicio!=null) {
				this.jPanelPaginacionEjercicio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEjercicio!=null) {
				this.jPanelParametrosReportesEjercicio.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEjercicio!=null) {
				this.jScrollPanelDatosEdicionEjercicio.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEjercicio!=null) {
				this.jTabbedPaneBusquedasEjercicio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEjercicio!=null) {
				this.jScrollPanelDatosEjercicio.setVisible(true);
			}
			
			if(this.jPanelPaginacionEjercicio!=null) {
				this.jPanelPaginacionEjercicio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEjercicio!=null) {
				this.jPanelParametrosReportesEjercicio.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEjercicio!=null) {
				this.jScrollPanelDatosEdicionEjercicio.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEjercicio!=null) {
				this.jTabbedPaneBusquedasEjercicio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEjercicio!=null) {
				this.jScrollPanelDatosEjercicio.setVisible(true);
			}
			
			if(this.jPanelPaginacionEjercicio!=null) {
				this.jPanelPaginacionEjercicio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEjercicio!=null) {
				this.jPanelParametrosReportesEjercicio.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEjercicio!=null) {
				this.jScrollPanelDatosEdicionEjercicio.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEjercicio!=null) {
				this.jTabbedPaneBusquedasEjercicio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEjercicio!=null) {
				this.jScrollPanelDatosEjercicio.setVisible(true);
			}
			
			if(this.jPanelPaginacionEjercicio!=null) {
				this.jPanelPaginacionEjercicio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEjercicio!=null) {
				this.jPanelParametrosReportesEjercicio.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.ejercicioSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEjercicio!=null) {
					this.jTabbedPaneBusquedasEjercicio.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEjercicio!=null) {
				this.jPanelParametrosReportesEjercicio.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.ejercicioSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEjercicio!=null) {
				this.jTabbedPaneBusquedasEjercicio.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEjercicio!=null) {
				this.jPanelParametrosReportesEjercicio.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorFechaInicio=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorFechaInicio) {this.jTabbedPaneBusquedasEjercicio.remove(jPanelBusquedaPorFechaInicioEjercicio);}

			this.isVisibilidadFK_IdAnio=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasEjercicio.remove(jPanelFK_IdAnioEjercicio);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadBusquedaPorFechaInicio=isParaAnioNegation;
			if(!this.isVisibilidadBusquedaPorFechaInicio) {this.jTabbedPaneBusquedasEjercicio.remove(jPanelBusquedaPorFechaInicioEjercicio);}

			this.isVisibilidadFK_IdAnio=isParaAnio;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasEjercicio.remove(jPanelFK_IdAnioEjercicio);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EjercicioSessionBean ejercicioSessionBean=new EjercicioSessionBean();
		
		if(this.ejercicioSessionBean==null) {
			this.ejercicioSessionBean=new EjercicioSessionBean();
		}
		
		this.ejercicioSessionBean.setsUltimaBusquedaEjercicio(this.getsAccionBusqueda());
		this.ejercicioSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.ejercicioSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorFechaInicio")) {
			ejercicioSessionBean.setfecha_inicio(this.getfecha_inicioBusquedaPorFechaInicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
			ejercicioSessionBean.setid_anio(this.getid_anioFK_IdAnio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			ejercicioSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EjercicioSessionBean ejercicioSessionBean=new EjercicioSessionBean();
		
		if(this.ejercicioSessionBean==null) {
			this.ejercicioSessionBean=new EjercicioSessionBean();
		}
		
		if(this.ejercicioSessionBean.getsUltimaBusquedaEjercicio()!=null&&!this.ejercicioSessionBean.getsUltimaBusquedaEjercicio().equals("")) {
			this.setsAccionBusqueda(ejercicioSessionBean.getsUltimaBusquedaEjercicio());
			this.setiNumeroPaginacion(ejercicioSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(ejercicioSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorFechaInicio")) {
				this.setfecha_inicioBusquedaPorFechaInicio(ejercicioSessionBean.getfecha_inicio());
				ejercicioSessionBean.setfecha_inicio(new Date());
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
				this.setid_anioFK_IdAnio(ejercicioSessionBean.getid_anio());
				ejercicioSessionBean.setid_anio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(ejercicioSessionBean.getid_empresa());
				ejercicioSessionBean.setid_empresa(-1L);
			}
		}
		
		this.ejercicioSessionBean.setsUltimaBusquedaEjercicio("");
		this.ejercicioSessionBean.setiNumeroPaginacion(EjercicioConstantesFunciones.INUMEROPAGINACION);
		this.ejercicioSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEjercicio(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEjercicio() {
		this.updateBorderResaltarBusquedasFormularioEjercicio();
		this.updateVisibilidadBusquedasFormularioEjercicio();
		this.updateHabilitarBusquedasFormularioEjercicio();
	}
	
	public void updateBorderResaltarBusquedasFormularioEjercicio() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEjercicio.getComponents().length>0) {
	

		if(this.ejercicioConstantesFunciones.resaltarBusquedaPorFechaInicioEjercicio!=null) {
			index= this.jTabbedPaneBusquedasEjercicio.indexOfComponent(this.jPanelBusquedaPorFechaInicioEjercicio);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEjercicio.getComponent(index);
				jPanel.setBorder(this.ejercicioConstantesFunciones.resaltarBusquedaPorFechaInicioEjercicio);
			}
		}

		if(this.ejercicioConstantesFunciones.resaltarFK_IdAnioEjercicio!=null) {
			index= this.jTabbedPaneBusquedasEjercicio.indexOfComponent(this.jPanelFK_IdAnioEjercicio);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEjercicio.getComponent(index);
				jPanel.setBorder(this.ejercicioConstantesFunciones.resaltarFK_IdAnioEjercicio);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEjercicio() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEjercicio.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEjercicio.indexOfComponent(this.jPanelBusquedaPorFechaInicioEjercicio);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEjercicio.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ejercicioConstantesFunciones.mostrarBusquedaPorFechaInicioEjercicio);
			if(!this.ejercicioConstantesFunciones.mostrarBusquedaPorFechaInicioEjercicio && index>-1) {
				this.jTabbedPaneBusquedasEjercicio.remove(index);
			}

			index= this.jTabbedPaneBusquedasEjercicio.indexOfComponent(this.jPanelFK_IdAnioEjercicio);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEjercicio.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ejercicioConstantesFunciones.mostrarFK_IdAnioEjercicio);
			if(!this.ejercicioConstantesFunciones.mostrarFK_IdAnioEjercicio && index>-1) {
				this.jTabbedPaneBusquedasEjercicio.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEjercicio() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEjercicio.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEjercicio.indexOfComponent(this.jPanelBusquedaPorFechaInicioEjercicio);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEjercicio.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ejercicioConstantesFunciones.activarBusquedaPorFechaInicioEjercicio);
				this.jTabbedPaneBusquedasEjercicio.setEnabledAt(index,this.ejercicioConstantesFunciones.activarBusquedaPorFechaInicioEjercicio);
			}

			index= this.jTabbedPaneBusquedasEjercicio.indexOfComponent(this.jPanelFK_IdAnioEjercicio);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEjercicio.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ejercicioConstantesFunciones.activarFK_IdAnioEjercicio);
				this.jTabbedPaneBusquedasEjercicio.setEnabledAt(index,this.ejercicioConstantesFunciones.activarFK_IdAnioEjercicio);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEjercicio(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorFechaInicio")) {
			index= this.jTabbedPaneBusquedasEjercicio.indexOfComponent(this.jPanelBusquedaPorFechaInicioEjercicio);

			this.jTabbedPaneBusquedasEjercicio.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEjercicio.getComponent(index);

			this.ejercicioConstantesFunciones.setResaltarBusquedaPorFechaInicioEjercicio(resaltar);

			jPanel.setBorder(this.ejercicioConstantesFunciones.resaltarBusquedaPorFechaInicioEjercicio);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdAnio")) {
			index= this.jTabbedPaneBusquedasEjercicio.indexOfComponent(this.jPanelFK_IdAnioEjercicio);

			this.jTabbedPaneBusquedasEjercicio.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEjercicio.getComponent(index);

			this.ejercicioConstantesFunciones.setResaltarFK_IdAnioEjercicio(resaltar);

			jPanel.setBorder(this.ejercicioConstantesFunciones.resaltarFK_IdAnioEjercicio);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEjercicio.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEjercicio() throws Exception {

		if(this.jInternalFrameDetalleFormEjercicio==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEjercicio();
		this.updateVisibilidadResaltarControlesFormularioEjercicio();
		this.updateHabilitarResaltarControlesFormularioEjercicio();
		
	}
	
	public void updateBorderResaltarControlesFormularioEjercicio() throws Exception {
		if(this.jInternalFrameDetalleFormEjercicio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.ejercicioConstantesFunciones.resaltaridEjercicio!=null && this.jInternalFrameDetalleFormEjercicio!=null) {this.jInternalFrameDetalleFormEjercicio.jLabelidEjercicio.setBorder(this.ejercicioConstantesFunciones.resaltaridEjercicio);}
		if(this.ejercicioConstantesFunciones.resaltarid_empresaEjercicio!=null && this.jInternalFrameDetalleFormEjercicio!=null) {this.jInternalFrameDetalleFormEjercicio.jComboBoxid_empresaEjercicio.setBorder(this.ejercicioConstantesFunciones.resaltarid_empresaEjercicio);}
		if(this.ejercicioConstantesFunciones.resaltarid_anioEjercicio!=null && this.jInternalFrameDetalleFormEjercicio!=null) {this.jInternalFrameDetalleFormEjercicio.jComboBoxid_anioEjercicio.setBorder(this.ejercicioConstantesFunciones.resaltarid_anioEjercicio);}
		if(this.ejercicioConstantesFunciones.resaltarfecha_inicioEjercicio!=null && this.jInternalFrameDetalleFormEjercicio!=null) {this.jInternalFrameDetalleFormEjercicio.jDateChooserfecha_inicioEjercicio.setBorder(this.ejercicioConstantesFunciones.resaltarfecha_inicioEjercicio);}
		if(this.ejercicioConstantesFunciones.resaltarfecha_finEjercicio!=null && this.jInternalFrameDetalleFormEjercicio!=null) {this.jInternalFrameDetalleFormEjercicio.jDateChooserfecha_finEjercicio.setBorder(this.ejercicioConstantesFunciones.resaltarfecha_finEjercicio);}
		if(this.ejercicioConstantesFunciones.resaltaresta_activoEjercicio!=null && this.jInternalFrameDetalleFormEjercicio!=null) {this.jInternalFrameDetalleFormEjercicio.jCheckBoxesta_activoEjercicio.setBorderPainted(true);this.jInternalFrameDetalleFormEjercicio.jCheckBoxesta_activoEjercicio.setBorder(this.ejercicioConstantesFunciones.resaltaresta_activoEjercicio);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEjercicio() throws Exception {		
		if(this.jInternalFrameDetalleFormEjercicio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEjercicio!=null) {
	
		//this.jInternalFrameDetalleFormEjercicio.jLabelidEjercicio.setVisible(this.ejercicioConstantesFunciones.mostraridEjercicio);
		this.jInternalFrameDetalleFormEjercicio.jPanelidEjercicio.setVisible(this.ejercicioConstantesFunciones.mostraridEjercicio);
		//this.jInternalFrameDetalleFormEjercicio.jComboBoxid_empresaEjercicio.setVisible(this.ejercicioConstantesFunciones.mostrarid_empresaEjercicio);
		this.jInternalFrameDetalleFormEjercicio.jPanelid_empresaEjercicio.setVisible(this.ejercicioConstantesFunciones.mostrarid_empresaEjercicio);
		//this.jInternalFrameDetalleFormEjercicio.jComboBoxid_anioEjercicio.setVisible(this.ejercicioConstantesFunciones.mostrarid_anioEjercicio);
		this.jInternalFrameDetalleFormEjercicio.jPanelid_anioEjercicio.setVisible(this.ejercicioConstantesFunciones.mostrarid_anioEjercicio);
		//this.jInternalFrameDetalleFormEjercicio.jDateChooserfecha_inicioEjercicio.setVisible(this.ejercicioConstantesFunciones.mostrarfecha_inicioEjercicio);
		this.jInternalFrameDetalleFormEjercicio.jPanelfecha_inicioEjercicio.setVisible(this.ejercicioConstantesFunciones.mostrarfecha_inicioEjercicio);
		//this.jInternalFrameDetalleFormEjercicio.jDateChooserfecha_finEjercicio.setVisible(this.ejercicioConstantesFunciones.mostrarfecha_finEjercicio);
		this.jInternalFrameDetalleFormEjercicio.jPanelfecha_finEjercicio.setVisible(this.ejercicioConstantesFunciones.mostrarfecha_finEjercicio);
		//this.jInternalFrameDetalleFormEjercicio.jCheckBoxesta_activoEjercicio.setVisible(this.ejercicioConstantesFunciones.mostraresta_activoEjercicio);
		this.jInternalFrameDetalleFormEjercicio.jPanelesta_activoEjercicio.setVisible(this.ejercicioConstantesFunciones.mostraresta_activoEjercicio);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEjercicio() throws Exception {
		if(this.jInternalFrameDetalleFormEjercicio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEjercicio!=null) {
	
		this.jInternalFrameDetalleFormEjercicio.jLabelidEjercicio.setEnabled(this.ejercicioConstantesFunciones.activaridEjercicio);
		this.jInternalFrameDetalleFormEjercicio.jComboBoxid_empresaEjercicio.setEnabled(this.ejercicioConstantesFunciones.activarid_empresaEjercicio);
		this.jInternalFrameDetalleFormEjercicio.jComboBoxid_anioEjercicio.setEnabled(this.ejercicioConstantesFunciones.activarid_anioEjercicio);
		this.jInternalFrameDetalleFormEjercicio.jDateChooserfecha_inicioEjercicio.setEnabled(this.ejercicioConstantesFunciones.activarfecha_inicioEjercicio);
		this.jInternalFrameDetalleFormEjercicio.jDateChooserfecha_finEjercicio.setEnabled(this.ejercicioConstantesFunciones.activarfecha_finEjercicio);
		this.jInternalFrameDetalleFormEjercicio.jCheckBoxesta_activoEjercicio.setEnabled(this.ejercicioConstantesFunciones.activaresta_activoEjercicio);
		}
	}
	
		
}