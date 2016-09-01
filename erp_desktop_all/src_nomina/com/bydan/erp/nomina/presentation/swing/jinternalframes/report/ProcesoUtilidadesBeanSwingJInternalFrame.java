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

//import com.bydan.erp.nomina.util.ProcesoUtilidadesConstantesFunciones;
import com.bydan.erp.nomina.util.report.ProcesoUtilidadesParameterReturnGeneral;
//import com.bydan.erp.nomina.util.report.ProcesoUtilidadesParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.report.ProcesoUtilidadesBean;
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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProcesoUtilidadesBeanSwingJInternalFrame extends ProcesoUtilidadesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoUtilidadesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoUtilidades> procesoutilidadesValidator = new ClassValidator<ProcesoUtilidades>(ProcesoUtilidades.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoUtilidades procesoutilidades;	
	public ProcesoUtilidades procesoutilidadesAux;
	public ProcesoUtilidades procesoutilidadesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoUtilidades procesoutilidadesTotales;
	public Long idProcesoUtilidadesActual;
	public Long iIdNuevoProcesoUtilidades=0L;
	public int rowIndexActual=0;
	
	
	
	
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
	
	public Boolean isPermisoTodoProcesoUtilidades;
	public Boolean isPermisoNuevoProcesoUtilidades;
	public Boolean isPermisoActualizarProcesoUtilidades;
	public Boolean isPermisoActualizarOriginalProcesoUtilidades;
	public Boolean isPermisoEliminarProcesoUtilidades;
	public Boolean isPermisoGuardarCambiosProcesoUtilidades;
	public Boolean isPermisoConsultaProcesoUtilidades;
	public Boolean isPermisoBusquedaProcesoUtilidades;
	public Boolean isPermisoReporteProcesoUtilidades;
	public Boolean isPermisoPaginacionMedioProcesoUtilidades;
	public Boolean isPermisoPaginacionAltoProcesoUtilidades;
	public Boolean isPermisoPaginacionTodoProcesoUtilidades;
	public Boolean isPermisoCopiarProcesoUtilidades;
	public Boolean isPermisoVerFormProcesoUtilidades;
	public Boolean isPermisoDuplicarProcesoUtilidades;
	public Boolean isPermisoOrdenProcesoUtilidades;
	
	
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
	
	public ProcesoUtilidadesParameterReturnGeneral procesoutilidadesReturnGeneral;
	public ProcesoUtilidadesParameterReturnGeneral procesoutilidadesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoUtilidades=false;
	public Boolean esParaAccionDesdeFormularioProcesoUtilidades=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoUtilidadesSessionBeanAdditional procesoutilidadesSessionBeanAdditional=null;
	
	public ProcesoUtilidadesSessionBeanAdditional getProcesoUtilidadesSessionBeanAdditional() {
		return this.procesoutilidadesSessionBeanAdditional;
	}
	
	public void setProcesoUtilidadesSessionBeanAdditional(ProcesoUtilidadesSessionBeanAdditional procesoutilidadesSessionBeanAdditional) {
		try {
			this.procesoutilidadesSessionBeanAdditional=procesoutilidadesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoUtilidadesBeanSwingJInternalFrameAdditional procesoutilidadesBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoUtilidadesBeanSwingJInternalFrame
	
	public ProcesoUtilidadesBeanSwingJInternalFrameAdditional getProcesoUtilidadesBeanSwingJInternalFrameAdditional() {
		return this.procesoutilidadesBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoUtilidadesBeanSwingJInternalFrameAdditional(ProcesoUtilidadesBeanSwingJInternalFrameAdditional procesoutilidadesBeanSwingJInternalFrameAdditional) {
		try {
			this.procesoutilidadesBeanSwingJInternalFrameAdditional=procesoutilidadesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoUtilidadesLogic procesoutilidadesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoUtilidades procesoutilidadesBean;
	public ProcesoUtilidadesConstantesFunciones procesoutilidadesConstantesFunciones;
	//public ProcesoUtilidadesParameterReturnGeneral procesoutilidadesReturnGeneral;
	
	//FK
	
	public AnioLogic anioLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoUtilidades> procesoutilidadess;	
	//public List<ProcesoUtilidades> procesoutilidadessEliminados;
	//public List<ProcesoUtilidades> procesoutilidadessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoUtilidades=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoUtilidades=true;
	public Boolean isVisibilidadCeldaCopiarProcesoUtilidades=true;
	public Boolean isVisibilidadCeldaVerFormProcesoUtilidades=true;
	public Boolean isVisibilidadCeldaOrdenProcesoUtilidades=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoUtilidades=false;
	public Boolean isVisibilidadCeldaModificarProcesoUtilidades=false;
	public Boolean isVisibilidadCeldaActualizarProcesoUtilidades=false;
	public Boolean isVisibilidadCeldaEliminarProcesoUtilidades=false;
	public Boolean isVisibilidadCeldaCancelarProcesoUtilidades=false;
	public Boolean isVisibilidadCeldaGuardarProcesoUtilidades=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoUtilidades=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoUtilidades=false;
	public Boolean isVisibilidadFK_IdAnio=false;
	
	public Long getiIdNuevoProcesoUtilidades() {
		return this.iIdNuevoProcesoUtilidades;
	}

	public void setiIdNuevoProcesoUtilidades(Long iIdNuevoProcesoUtilidades) {
		this.iIdNuevoProcesoUtilidades = iIdNuevoProcesoUtilidades;
	}
	
	public Long getidProcesoUtilidadesActual() {
		return this.idProcesoUtilidadesActual;
	}

	public void setidProcesoUtilidadesActual(Long idProcesoUtilidadesActual) {
		this.idProcesoUtilidadesActual = idProcesoUtilidadesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoUtilidades getprocesoutilidades() {
		return this.procesoutilidades;
	}

	public void setprocesoutilidades(ProcesoUtilidades procesoutilidades) {
		this.procesoutilidades = procesoutilidades;
	}
	
	public ProcesoUtilidades getprocesoutilidadesAux() {
		return this.procesoutilidadesAux;
	}

	public void setprocesoutilidadesAux(ProcesoUtilidades procesoutilidadesAux) {
		this.procesoutilidadesAux = procesoutilidadesAux;
	}				
	
	public ProcesoUtilidades getprocesoutilidadesAnterior() {
		return this.procesoutilidadesAnterior;
	}

	public void setprocesoutilidadesAnterior(ProcesoUtilidades procesoutilidadesAnterior) {
		this.procesoutilidadesAnterior = procesoutilidadesAnterior;
	}	
	
	public ProcesoUtilidades getprocesoutilidadesTotales() {
		return this.procesoutilidadesTotales;
	}

	public void setprocesoutilidadesTotales(ProcesoUtilidades procesoutilidadesTotales) {
		this.procesoutilidadesTotales = procesoutilidadesTotales;
	}	
	
	public ProcesoUtilidades getprocesoutilidadesBean() {
		return this.procesoutilidadesBean;
	}

	public void setprocesoutilidadesBean(ProcesoUtilidades procesoutilidadesBean) {
		this.procesoutilidadesBean = procesoutilidadesBean;
	}	
	
	public ProcesoUtilidadesParameterReturnGeneral getprocesoutilidadesReturnGeneral() {
		return this.procesoutilidadesReturnGeneral;
	}

	public void setprocesoutilidadesReturnGeneral(ProcesoUtilidadesParameterReturnGeneral procesoutilidadesReturnGeneral) {
		this.procesoutilidadesReturnGeneral = procesoutilidadesReturnGeneral;
	}	
	
	
	public Long id_anioBusquedaProcesoUtilidades=null;

	public Long getid_anioBusquedaProcesoUtilidades() {
		return this.id_anioBusquedaProcesoUtilidades;
	}

	public void setid_anioBusquedaProcesoUtilidades(Long id_anioBusquedaProcesoUtilidades) {
		this.id_anioBusquedaProcesoUtilidades = id_anioBusquedaProcesoUtilidades;
	}

;
	public Double valorBusquedaProcesoUtilidades=0.0;

	public Double getvalorBusquedaProcesoUtilidades() {
		return this.valorBusquedaProcesoUtilidades;
	}

	public void setvalorBusquedaProcesoUtilidades(Double valorBusquedaProcesoUtilidades) {
		this.valorBusquedaProcesoUtilidades = valorBusquedaProcesoUtilidades;
	}

	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProcesoUtilidadesLogic getProcesoUtilidadesLogic()	{		
		return procesoutilidadesLogic;
	}

	public void setProcesoUtilidadesLogic(ProcesoUtilidadesLogic procesoutilidadesLogic) {
		this.procesoutilidadesLogic = procesoutilidadesLogic;
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
	
	public Boolean getIsEsNuevoProcesoUtilidades() {
		return isEsNuevoProcesoUtilidades;
	}

	public void setIsEsNuevoProcesoUtilidades(Boolean isEsNuevoProcesoUtilidades) {
		this.isEsNuevoProcesoUtilidades = isEsNuevoProcesoUtilidades;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoUtilidades() {
		return esParaAccionDesdeFormularioProcesoUtilidades;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoUtilidades(Boolean esParaAccionDesdeFormularioProcesoUtilidades) {
		this.esParaAccionDesdeFormularioProcesoUtilidades = esParaAccionDesdeFormularioProcesoUtilidades;
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

			anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.procesoutilidadesSessionBean==null) {
				this.procesoutilidadesSessionBean=new ProcesoUtilidadesSessionBean();
			}

			if(!this.procesoutilidadesSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

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
					anioLogic.getEntityWithConnection(procesoutilidadesSessionBean.getlidAnioActual());
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

					if(this.procesoutilidades!=null) {
						this.procesoutilidades.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) {
						this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxid_anioProcesoUtilidades.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioProcesoUtilidades.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) {
						if(this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxid_anioProcesoUtilidades.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxid_anioProcesoUtilidades.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoUtilidades") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioBusquedaProcesoUtilidadesProcesoUtilidades!=null) {
						jComboBoxid_anioBusquedaProcesoUtilidadesProcesoUtilidades.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioBusquedaProcesoUtilidadesProcesoUtilidades!=null) {
							//jComboBoxid_anioBusquedaProcesoUtilidadesProcesoUtilidades.setSelectedItem(anioTemp);
							if(jComboBoxid_anioBusquedaProcesoUtilidadesProcesoUtilidades.getItemCount()>0) {
								jComboBoxid_anioBusquedaProcesoUtilidadesProcesoUtilidades.setSelectedIndex(0);
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
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioProcesoUtilidadesGenerico)throws Exception
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
				jComboBoxid_anioProcesoUtilidadesGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioProcesoUtilidadesGenerico!=null && jComboBoxid_anioProcesoUtilidadesGenerico.getItemCount()>0) {
					jComboBoxid_anioProcesoUtilidadesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(ProcesoUtilidades procesoutilidades,JComboBox jComboBoxid_anioProcesoUtilidadesGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioProcesoUtilidadesGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxid_anioProcesoUtilidades.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioProcesoUtilidadesGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				procesoutilidades.setid_anio(anioAux.getId());
				procesoutilidades.setanio_descripcion(ProcesoUtilidadesConstantesFunciones.getAnioDescripcion(anioAux));
				procesoutilidades.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAniosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoUtilidadesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) { 
							this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxid_anioProcesoUtilidades.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxid_anioProcesoUtilidades.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) { 
					}

					if(!ProcesoUtilidadesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoUtilidades") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoUtilidadesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioBusquedaProcesoUtilidadesProcesoUtilidades.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioBusquedaProcesoUtilidadesProcesoUtilidades.addItem(anio);
							}
						}

						if(!ProcesoUtilidadesJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) {
							this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxid_anioProcesoUtilidades.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) {
							this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxid_anioProcesoUtilidades.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anioBusquedaProcesoUtilidadesProcesoUtilidades.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioBusquedaProcesoUtilidadesProcesoUtilidades.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoUtilidades() throws Exception {
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
		
	public ProcesoUtilidadesParameterReturnGeneral getProcesoUtilidadesParameterGeneral() {
		return this.procesoutilidadesParameterGeneral;
	}
	
	public void setProcesoUtilidadesParameterGeneral(ProcesoUtilidadesParameterReturnGeneral procesoutilidadesParameterGeneral) {
		this.procesoutilidadesParameterGeneral = procesoutilidadesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoUtilidades() {
		return isPermisoTodoProcesoUtilidades;
	}

	public void setIsPermisoTodoProcesoUtilidades(Boolean isPermisoTodoProcesoUtilidades) {
		this.isPermisoTodoProcesoUtilidades = isPermisoTodoProcesoUtilidades;
	}

	public Boolean getIsPermisoNuevoProcesoUtilidades() {
		return isPermisoNuevoProcesoUtilidades;
	}

	public void setIsPermisoNuevoProcesoUtilidades(Boolean isPermisoNuevoProcesoUtilidades) {
		this.isPermisoNuevoProcesoUtilidades = isPermisoNuevoProcesoUtilidades;
	}

	public Boolean getIsPermisoActualizarProcesoUtilidades() {
		return isPermisoActualizarProcesoUtilidades;
	}

	public void setIsPermisoActualizarProcesoUtilidades(Boolean isPermisoActualizarProcesoUtilidades) {
		this.isPermisoActualizarProcesoUtilidades = isPermisoActualizarProcesoUtilidades;
	}

	public Boolean getIsPermisoEliminarProcesoUtilidades() {
		return isPermisoEliminarProcesoUtilidades;
	}

	public void setIsPermisoEliminarProcesoUtilidades(Boolean isPermisoEliminarProcesoUtilidades) {
		this.isPermisoEliminarProcesoUtilidades = isPermisoEliminarProcesoUtilidades;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoUtilidades() {
		return isPermisoGuardarCambiosProcesoUtilidades;
	}

	public void setIsPermisoGuardarCambiosProcesoUtilidades(Boolean isPermisoGuardarCambiosProcesoUtilidades) {
		this.isPermisoGuardarCambiosProcesoUtilidades = isPermisoGuardarCambiosProcesoUtilidades;
	}
	
	public Boolean getIsPermisoConsultaProcesoUtilidades() {
		return isPermisoConsultaProcesoUtilidades;
	}

	public void setIsPermisoConsultaProcesoUtilidades(Boolean isPermisoConsultaProcesoUtilidades) {
		this.isPermisoConsultaProcesoUtilidades = isPermisoConsultaProcesoUtilidades;
	}

	public Boolean getIsPermisoBusquedaProcesoUtilidades() {
		return isPermisoBusquedaProcesoUtilidades;
	}

	public void setIsPermisoBusquedaProcesoUtilidades(Boolean isPermisoBusquedaProcesoUtilidades) {
		this.isPermisoBusquedaProcesoUtilidades = isPermisoBusquedaProcesoUtilidades;
	}

	public Boolean getIsPermisoReporteProcesoUtilidades() {
		return isPermisoReporteProcesoUtilidades;
	}

	public void setIsPermisoReporteProcesoUtilidades(Boolean isPermisoReporteProcesoUtilidades) {
		this.isPermisoReporteProcesoUtilidades = isPermisoReporteProcesoUtilidades;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoUtilidades() {
		return isPermisoPaginacionMedioProcesoUtilidades;
	}

	public void setIsPermisoPaginacionMedioProcesoUtilidades(Boolean isPermisoPaginacionMedioProcesoUtilidades) {
		this.isPermisoPaginacionMedioProcesoUtilidades = isPermisoPaginacionMedioProcesoUtilidades;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoUtilidades() {
		return isPermisoPaginacionTodoProcesoUtilidades;
	}

	public void setIsPermisoPaginacionTodoProcesoUtilidades(Boolean isPermisoPaginacionTodoProcesoUtilidades) {
		this.isPermisoPaginacionTodoProcesoUtilidades = isPermisoPaginacionTodoProcesoUtilidades;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoUtilidades() {
		return isPermisoPaginacionAltoProcesoUtilidades;
	}

	public void setIsPermisoPaginacionAltoProcesoUtilidades(Boolean isPermisoPaginacionAltoProcesoUtilidades) {
		this.isPermisoPaginacionAltoProcesoUtilidades = isPermisoPaginacionAltoProcesoUtilidades;
	}
	
	public Boolean getIsPermisoCopiarProcesoUtilidades() {
		return isPermisoCopiarProcesoUtilidades;
	}

	public void setIsPermisoCopiarProcesoUtilidades(Boolean isPermisoCopiarProcesoUtilidades) {
		this.isPermisoCopiarProcesoUtilidades = isPermisoCopiarProcesoUtilidades;
	}
	
	public Boolean getIsPermisoVerFormProcesoUtilidades() {
		return isPermisoVerFormProcesoUtilidades;
	}

	public void setIsPermisoVerFormProcesoUtilidades(Boolean isPermisoVerFormProcesoUtilidades) {
		this.isPermisoVerFormProcesoUtilidades = isPermisoVerFormProcesoUtilidades;
	}
	
	public Boolean getIsPermisoDuplicarProcesoUtilidades() {
		return isPermisoDuplicarProcesoUtilidades;
	}

	public void setIsPermisoDuplicarProcesoUtilidades(Boolean isPermisoDuplicarProcesoUtilidades) {
		this.isPermisoDuplicarProcesoUtilidades = isPermisoDuplicarProcesoUtilidades;
	}
	
	public Boolean getIsPermisoOrdenProcesoUtilidades() {
		return isPermisoOrdenProcesoUtilidades;
	}

	public void setIsPermisoOrdenProcesoUtilidades(Boolean isPermisoOrdenProcesoUtilidades) {
		this.isPermisoOrdenProcesoUtilidades = isPermisoOrdenProcesoUtilidades;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoUtilidades() {
		return isVisibilidadCeldaNuevoProcesoUtilidades;
	}

	public void setIsVisibilidadCeldaNuevoProcesoUtilidades(Boolean isVisibilidadCeldaNuevoProcesoUtilidades) {
		this.isVisibilidadCeldaNuevoProcesoUtilidades = isVisibilidadCeldaNuevoProcesoUtilidades;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoUtilidades() {
		return isVisibilidadCeldaDuplicarProcesoUtilidades;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoUtilidades(Boolean isVisibilidadCeldaDuplicarProcesoUtilidades) {
		this.isVisibilidadCeldaDuplicarProcesoUtilidades = isVisibilidadCeldaDuplicarProcesoUtilidades;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoUtilidades() {
		return isVisibilidadCeldaCopiarProcesoUtilidades;
	}

	public void setIsVisibilidadCeldaCopiarProcesoUtilidades(Boolean isVisibilidadCeldaCopiarProcesoUtilidades) {
		this.isVisibilidadCeldaCopiarProcesoUtilidades = isVisibilidadCeldaCopiarProcesoUtilidades;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoUtilidades() {
		return isVisibilidadCeldaVerFormProcesoUtilidades;
	}

	public void setIsVisibilidadCeldaVerFormProcesoUtilidades(Boolean isVisibilidadCeldaVerFormProcesoUtilidades) {
		this.isVisibilidadCeldaVerFormProcesoUtilidades = isVisibilidadCeldaVerFormProcesoUtilidades;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoUtilidades() {
		return isVisibilidadCeldaOrdenProcesoUtilidades;
	}

	public void setIsVisibilidadCeldaOrdenProcesoUtilidades(Boolean isVisibilidadCeldaOrdenProcesoUtilidades) {
		this.isVisibilidadCeldaOrdenProcesoUtilidades = isVisibilidadCeldaOrdenProcesoUtilidades;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoUtilidades() {
		return isVisibilidadCeldaNuevoRelacionesProcesoUtilidades;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoUtilidades(Boolean isVisibilidadCeldaNuevoRelacionesProcesoUtilidades) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoUtilidades = isVisibilidadCeldaNuevoRelacionesProcesoUtilidades;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoUtilidades() {
		return isVisibilidadCeldaModificarProcesoUtilidades;
	}

	public void setIsVisibilidadCeldaModificarProcesoUtilidades(Boolean isVisibilidadCeldaModificarProcesoUtilidades) {
		this.isVisibilidadCeldaModificarProcesoUtilidades = isVisibilidadCeldaModificarProcesoUtilidades;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoUtilidades() {
		return isVisibilidadCeldaActualizarProcesoUtilidades;
	}

	public void setIsVisibilidadCeldaActualizarProcesoUtilidades(Boolean isVisibilidadCeldaActualizarProcesoUtilidades) {
		this.isVisibilidadCeldaActualizarProcesoUtilidades = isVisibilidadCeldaActualizarProcesoUtilidades;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoUtilidades() {
		return isVisibilidadCeldaEliminarProcesoUtilidades;
	}

	public void setIsVisibilidadCeldaEliminarProcesoUtilidades(Boolean isVisibilidadCeldaEliminarProcesoUtilidades) {
		this.isVisibilidadCeldaEliminarProcesoUtilidades = isVisibilidadCeldaEliminarProcesoUtilidades;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoUtilidades() {
		return isVisibilidadCeldaCancelarProcesoUtilidades;
	}

	public void setIsVisibilidadCeldaCancelarProcesoUtilidades(Boolean isVisibilidadCeldaCancelarProcesoUtilidades) {
		this.isVisibilidadCeldaCancelarProcesoUtilidades = isVisibilidadCeldaCancelarProcesoUtilidades;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoUtilidades() {
		return isVisibilidadCeldaGuardarProcesoUtilidades;
	}

	public void setIsVisibilidadCeldaGuardarProcesoUtilidades(Boolean isVisibilidadCeldaGuardarProcesoUtilidades) {
		this.isVisibilidadCeldaGuardarProcesoUtilidades = isVisibilidadCeldaGuardarProcesoUtilidades;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoUtilidades() {
		return isVisibilidadCeldaGuardarCambiosProcesoUtilidades;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoUtilidades(Boolean isVisibilidadCeldaGuardarCambiosProcesoUtilidades) {
		this.isVisibilidadCeldaGuardarCambiosProcesoUtilidades = isVisibilidadCeldaGuardarCambiosProcesoUtilidades;
	}
		
	public ProcesoUtilidadesSessionBean getprocesoutilidadesSessionBean() {
		return this.procesoutilidadesSessionBean;
	}
	
	public void setprocesoutilidadesSessionBean(ProcesoUtilidadesSessionBean procesoutilidadesSessionBean) {
		this.procesoutilidadesSessionBean=procesoutilidadesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoUtilidades() {
		return this.isVisibilidadBusquedaProcesoUtilidades;
	}

	public void setisVisibilidadBusquedaProcesoUtilidades(Boolean isVisibilidadBusquedaProcesoUtilidades) {
		this.isVisibilidadBusquedaProcesoUtilidades=isVisibilidadBusquedaProcesoUtilidades;
	}

	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoUtilidades(ProcesoUtilidades procesoutilidades)throws Exception {
		try {
			
				this.setActualParaGuardarAnioForeignKey(procesoutilidades,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoUtilidades procesoutilidades,ProcesoUtilidades procesoutilidadesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoUtilidades(procesoutilidades);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesoutilidadesAux.setId(procesoutilidades.getId());
		procesoutilidadesAux.setVersionRow(procesoutilidades.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoUtilidades procesoutilidadesLocal) throws Exception {
		
		if(this.procesoutilidadesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoUtilidades procesoutilidadesLocal) throws Exception {	
		if(this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				procesoutilidadesLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoUtilidadesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoUtilidades.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesoutilidades =(ProcesoUtilidades) this.procesoutilidadesLogic.getProcesoUtilidadess().toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesoutilidades =(ProcesoUtilidades) this.procesoutilidadess.toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesoutilidadesValidator.getInvalidValues(this.procesoutilidades);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoUtilidades procesoutilidades,List<ProcesoUtilidades> procesoutilidadess) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoUtilidades procesoutilidades,List<ProcesoUtilidades> procesoutilidadess) throws Exception {
		try	{			
			ProcesoUtilidadesConstantesFunciones.actualizarSelectedLista(procesoutilidades,procesoutilidadess);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoUtilidades> procesoutilidadessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesoutilidadessLocal=this.procesoutilidadesLogic.getProcesoUtilidadess();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesoutilidadessLocal=this.procesoutilidadess;
			}
			//ARCHITECTURE
		
			for(ProcesoUtilidades procesoutilidadesLocal:procesoutilidadessLocal) {
				if(this.permiteMantenimiento(procesoutilidadesLocal) && procesoutilidadesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoUtilidadesConstantesFunciones.getProcesoUtilidadesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoUtilidadesConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoUtilidades.jLabelid_anioProcesoUtilidades,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoUtilidadesConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoUtilidades.jLabelvalorProcesoUtilidades,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoUtilidades.jLabelid_anioProcesoUtilidades,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoUtilidades.jLabelvalorProcesoUtilidades,"");
		
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
		this.iIdNuevoProcesoUtilidades--;	
		
		
		this.procesoutilidadesAux=new ProcesoUtilidades();
		
		this.procesoutilidadesAux.setId(this.iIdNuevoProcesoUtilidades);
		this.procesoutilidadesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesoutilidadesLogic.getProcesoUtilidadess().add(this.procesoutilidadesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesoutilidadess.add(this.procesoutilidadesAux);
		}
		//ARCHITECTURE
		
		this.procesoutilidades=this.procesoutilidadesAux;
		
		if(ProcesoUtilidadesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoUtilidades(this.procesoutilidades);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoUtilidades(this.procesoutilidades);
		}
				
		//this.setDefaultControlesProcesoUtilidades();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoUtilidades();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoUtilidades();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoUtilidades();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoUtilidades(this.procesoutilidadesBean,this.procesoutilidades,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoUtilidades(this.procesoutilidades);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoUtilidades(this.procesoutilidadesReturnGeneral,this.procesoutilidadesBean,false);
		
		if(this.procesoutilidadesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoUtilidades(this.procesoutilidadesReturnGeneral.getProcesoUtilidades());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoUtilidades(this.procesoutilidadesReturnGeneral.getProcesoUtilidades());
		}
		
		if(this.procesoutilidadesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoUtilidades(this.procesoutilidadesReturnGeneral.getProcesoUtilidades(),classes);//this.procesoutilidadesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoUtilidades(this.procesoutilidades,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoUtilidades();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoUtilidades();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoUtilidadesBeanSwingJInternalFrameAdditional.RecargarFormProcesoUtilidades(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoUtilidades(false);
						
			if(procesoutilidadesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoUtilidadesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoUtilidades();
			}
			
			this.actualizarVisualTableDatosProcesoUtilidades();
			
			this.jTableDatosProcesoUtilidades.setRowSelectionInterval(this.getIndiceNuevoProcesoUtilidades(), this.getIndiceNuevoProcesoUtilidades());
			
			this.seleccionarFilaTablaProcesoUtilidadesActual();
						
			this.actualizarEstadoCeldasBotonesProcesoUtilidades("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoUtilidades(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProcesoUtilidades.jTextFieldvalorProcesoUtilidades.setEnabled(isHabilitar && this.procesoutilidadesConstantesFunciones.activarvalorProcesoUtilidades);	
		
		this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxid_anioProcesoUtilidades.setEnabled(isHabilitar && this.procesoutilidadesConstantesFunciones.activarid_anioProcesoUtilidades);
	};
	
	public void setDefaultControlesProcesoUtilidades() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoUtilidades(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesoutilidadesSessionBean.setConGuardarRelaciones(true);			
			this.procesoutilidadesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoUtilidades.jTabbedPaneRelacionesProcesoUtilidades.setVisible(true);
			
					
		} else {
			//this.procesoutilidadesSessionBean.setConGuardarRelaciones(false);			
			this.procesoutilidadesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoUtilidades.jTabbedPaneRelacionesProcesoUtilidades.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoUtilidades() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoUtilidades procesoutilidadesAux:this.procesoutilidadesLogic.getProcesoUtilidadess()) {
				if(procesoutilidadesAux.getId().equals(this.iIdNuevoProcesoUtilidades)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoUtilidades procesoutilidadesAux:this.procesoutilidadess) {
				if(procesoutilidadesAux.getId().equals(this.iIdNuevoProcesoUtilidades)) {
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
	
	public int getIndiceActualProcesoUtilidades(ProcesoUtilidades procesoutilidades,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoUtilidades procesoutilidadesAux:this.procesoutilidadesLogic.getProcesoUtilidadess()) {
				if(procesoutilidadesAux.getId().equals(procesoutilidades.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoUtilidades procesoutilidadesAux:this.procesoutilidadess) {
				if(procesoutilidadesAux.getId().equals(procesoutilidades.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoUtilidades(ProcesoUtilidades procesoutilidadesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoUtilidades procesoutilidadesAux:this.procesoutilidadesLogic.getProcesoUtilidadess()) {
				if(procesoutilidadesAux.getProcesoUtilidadesOriginal().getId().equals(procesoutilidadesOriginal.getId())) {
					existe=true;
					procesoutilidadesOriginal.setId(procesoutilidadesAux.getId());
					procesoutilidadesOriginal.setVersionRow(procesoutilidadesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoUtilidades procesoutilidadesAux:this.procesoutilidadess) {
				if(procesoutilidadesAux.getProcesoUtilidadesOriginal().getId().equals(procesoutilidadesOriginal.getId())) {
					existe=true;
					procesoutilidadesOriginal.setId(procesoutilidadesAux.getId());
					procesoutilidadesOriginal.setVersionRow(procesoutilidadesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoUtilidades(Boolean esParaCancelar) throws Exception {
		procesoutilidadessAux=new ArrayList<ProcesoUtilidades>();
		procesoutilidadesAux=new ProcesoUtilidades();
		
		if(!this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoUtilidades procesoutilidadesAux:this.procesoutilidadesLogic.getProcesoUtilidadess()) {
					if(procesoutilidadesAux.getId()<0) {
						procesoutilidadessAux.add(procesoutilidadesAux);
					}		
				}
				this.iIdNuevoProcesoUtilidades=0L;
				this.procesoutilidadesLogic.getProcesoUtilidadess().removeAll(procesoutilidadessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoUtilidades procesoutilidadesAux:this.procesoutilidadess) {
					if(procesoutilidadesAux.getId()<0) {
						procesoutilidadessAux.add(procesoutilidadesAux);
					}		
				}
				this.iIdNuevoProcesoUtilidades=0L;
				this.procesoutilidadess.removeAll(procesoutilidadessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoUtilidades 
					&& this.procesoutilidadesLogic.getProcesoUtilidadess().size()>0
					) {
					procesoutilidadesAux=this.procesoutilidadesLogic.getProcesoUtilidadess().get(this.procesoutilidadesLogic.getProcesoUtilidadess().size() - 1);
				
					if(procesoutilidadesAux.getId()<0) {
						this.procesoutilidadesLogic.getProcesoUtilidadess().remove(procesoutilidadesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoUtilidades && this.procesoutilidadess.size()>0) {
					procesoutilidadesAux=this.procesoutilidadess.get(this.procesoutilidadess.size() - 1);
				
					if(procesoutilidadesAux.getId()<0) {
						this.procesoutilidadess.remove(procesoutilidadesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoUtilidades(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesoutilidades.getId()<0) {
				this.procesoutilidadesLogic.getProcesoUtilidadess().remove(this.procesoutilidades);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesoutilidades.getId()<0) {
				this.procesoutilidadess.remove(this.procesoutilidades);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoUtilidades(List<ProcesoUtilidades> procesoutilidadessAux) throws Exception {
		ProcesoUtilidadesConstantesFunciones.setEstadosInicialesProcesoUtilidades(procesoutilidadessAux);
	}
	
	public void setEstadosInicialesProcesoUtilidades(ProcesoUtilidades procesoutilidadesAux) throws Exception {
		ProcesoUtilidadesConstantesFunciones.setEstadosInicialesProcesoUtilidades(procesoutilidadesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoUtilidadesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoUtilidades("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoUtilidadesActual()) {
				if(!this.isEsNuevoProcesoUtilidades) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoUtilidades("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoUtilidades=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoUtilidadesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Utilidades ?", "MANTENIMIENTO DE Proceso Utilidades", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoUtilidades("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoUtilidades procesoutilidades) throws Exception {
		ProcesoUtilidadesConstantesFunciones.seleccionarAsignar(this.procesoutilidades,procesoutilidades);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoUtilidades=this.isPermisoActualizarOriginalProcesoUtilidades;
			
			
			this.seleccionarAsignar(procesoutilidades);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoUtilidades("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesoutilidadesSessionBean.setsFuncionBusquedaRapida(this.procesoutilidadesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoUtilidades) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoUtilidades(esParaCancelar);				
				this.cancelarNuevoProcesoUtilidades(esParaCancelar);								
			}
			
			this.procesoutilidades=new ProcesoUtilidades();
			
			this.inicializarProcesoUtilidades();
			
			this.actualizarEstadoCeldasBotonesProcesoUtilidades("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoUtilidades() throws Exception {
		try {
			ProcesoUtilidadesConstantesFunciones.inicializarProcesoUtilidades(this.procesoutilidades);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesoutilidadesLogic.getProcesoUtilidadess().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoUtilidadess(String sAccionBusqueda,List<ProcesoUtilidades> procesoutilidadessParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoUtilidades"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoUtilidadesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoUtilidadesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoUtilidades"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Utilidadeses");		
		parameters.put("busquedapor", ProcesoUtilidadesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoUtilidades=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
		} else {
		}
		
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoUtilidades);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoUtilidadesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoUtilidadesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoUtilidadesBean.TraerProcesoUtilidadesBeans(procesoutilidadessParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoUtilidadess(sAccionBusqueda,sTipoArchivoReporte,procesoutilidadessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoUtilidadess(sAccionBusqueda,sTipoArchivoReporte,procesoutilidadessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoUtilidadesActionPerformed(null);
					//this.generarExcelReporteProcesoUtilidadess(sAccionBusqueda,sTipoArchivoReporte,procesoutilidadessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoUtilidadess(sAccionBusqueda,sTipoArchivoReporte,procesoutilidadessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoUtilidadess(sAccionBusqueda,sTipoArchivoReporte,procesoutilidadessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoUtilidadess(sAccionBusqueda,sTipoArchivoReporte,procesoutilidadessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoUtilidadess(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoUtilidades> procesoutilidadessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoutilidades";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoUtilidadess");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoUtilidades("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoUtilidades procesoutilidades : procesoutilidadessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoUtilidadesConstantesFunciones.generarExcelReporteDataProcesoUtilidades("NORMAL",row,workbook,procesoutilidades,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Utilidades",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoUtilidades(String sTipo,Row row,Workbook workbook) {
		
		ProcesoUtilidadesConstantesFunciones.generarExcelReporteHeaderProcesoUtilidades(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoUtilidadess(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoUtilidades> procesoutilidadessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoutilidades_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoUtilidadess");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoUtilidades procesoutilidades : procesoutilidadessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoUtilidadesConstantesFunciones.getProcesoUtilidadesDescripcion(procesoutilidades));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoUtilidadesConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoUtilidadesConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesoutilidades.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoUtilidadesConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoUtilidadesConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesoutilidades.getvalor());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Utilidades",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoUtilidadess(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoUtilidades> procesoutilidadessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoUtilidades> procesoutilidadessRespaldo=null;
		
		classes=ProcesoUtilidadesConstantesFunciones.getClassesRelationshipsOfProcesoUtilidades(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesoutilidadesLogic.setDatosCliente(this.datosCliente);
		this.procesoutilidadesLogic.setDatosDeep(this.datosDeep);
		this.procesoutilidadesLogic.setIsConDeep(true);
		
		procesoutilidadessRespaldo=this.procesoutilidadesLogic.getProcesoUtilidadess();
		
		this.procesoutilidadesLogic.setProcesoUtilidadess(procesoutilidadessParaReportes);	
		this.procesoutilidadesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesoutilidadessParaReportes=this.procesoutilidadesLogic.getProcesoUtilidadess();
		this.procesoutilidadesLogic.setProcesoUtilidadess(procesoutilidadessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoutilidades_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoUtilidadess");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoUtilidades("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoUtilidades procesoutilidades : procesoutilidadessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoUtilidades("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoUtilidadesConstantesFunciones.generarExcelReporteDataProcesoUtilidades("NORMAL",row,workbook,procesoutilidades,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoUtilidadesConstantesFunciones.getProcesoUtilidadesDescripcion(procesoutilidades));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Utilidades",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoUtilidades.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoUtilidades.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoUtilidades.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoUtilidades.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoUtilidades() throws Exception {		
		this.startProcessProcesoUtilidades(true);
	}
	
	public void startProcessProcesoUtilidades(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoUtilidades ,this.jPanelParametrosReportesProcesoUtilidades, this.jScrollPanelDatosProcesoUtilidades,this.jPanelPaginacionProcesoUtilidades, this.jScrollPanelDatosEdicionProcesoUtilidades, this.jPanelAccionesProcesoUtilidades,this.jPanelAccionesFormularioProcesoUtilidades,this.jmenuBarProcesoUtilidades,this.jmenuBarDetalleProcesoUtilidades,this.jTtoolBarProcesoUtilidades,this.jTtoolBarDetalleProcesoUtilidades);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoUtilidades=this.jTabbedPaneBusquedasProcesoUtilidades; 
		
		final JPanel jPanelParametrosReportesProcesoUtilidades=this.jPanelParametrosReportesProcesoUtilidades;
		//final JScrollPane jScrollPanelDatosProcesoUtilidades=this.jScrollPanelDatosProcesoUtilidades;
		final JTable jTableDatosProcesoUtilidades=this.jTableDatosProcesoUtilidades;		
		final JPanel jPanelPaginacionProcesoUtilidades=this.jPanelPaginacionProcesoUtilidades;
		//final JScrollPane jScrollPanelDatosEdicionProcesoUtilidades=this.jScrollPanelDatosEdicionProcesoUtilidades;
		final JPanel jPanelAccionesProcesoUtilidades=this.jPanelAccionesProcesoUtilidades;
		
		JPanel jPanelCamposAuxiliarProcesoUtilidades=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoUtilidades=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) {
			jPanelCamposAuxiliarProcesoUtilidades=this.jInternalFrameDetalleFormProcesoUtilidades.jPanelCamposProcesoUtilidades;
			jPanelAccionesFormularioAuxiliarProcesoUtilidades=this.jInternalFrameDetalleFormProcesoUtilidades.jPanelAccionesFormularioProcesoUtilidades;
		}
		
		final JPanel jPanelCamposProcesoUtilidades=jPanelCamposAuxiliarProcesoUtilidades;
		final JPanel jPanelAccionesFormularioProcesoUtilidades=jPanelAccionesFormularioAuxiliarProcesoUtilidades;
		
		
		final JMenuBar jmenuBarProcesoUtilidades=this.jmenuBarProcesoUtilidades;
		final JToolBar jTtoolBarProcesoUtilidades=this.jTtoolBarProcesoUtilidades;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoUtilidades=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoUtilidades=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) {
			jmenuBarDetalleAuxiliarProcesoUtilidades=this.jInternalFrameDetalleFormProcesoUtilidades.jmenuBarDetalleProcesoUtilidades;
			jTtoolBarDetalleAuxiliarProcesoUtilidades=this.jInternalFrameDetalleFormProcesoUtilidades.jTtoolBarDetalleProcesoUtilidades;
		}
		
		final JMenuBar jmenuBarDetalleProcesoUtilidades=jmenuBarDetalleAuxiliarProcesoUtilidades;
		final JToolBar jTtoolBarDetalleProcesoUtilidades=jTtoolBarDetalleAuxiliarProcesoUtilidades;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoUtilidades;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoUtilidades;
			processRunnable.jTableDatos=jTableDatosProcesoUtilidades;
			processRunnable.jPanelCampos=jPanelCamposProcesoUtilidades;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoUtilidades;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoUtilidades;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoUtilidades;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoUtilidades;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoUtilidades;
			processRunnable.jTtoolBar=jTtoolBarProcesoUtilidades;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoUtilidades;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoUtilidades ,jPanelParametrosReportesProcesoUtilidades,jTableDatosProcesoUtilidades, /*jScrollPanelDatosProcesoUtilidades,*/jPanelCamposProcesoUtilidades,jPanelPaginacionProcesoUtilidades, /*jScrollPanelDatosEdicionProcesoUtilidades,*/ jPanelAccionesProcesoUtilidades,jPanelAccionesFormularioProcesoUtilidades,jmenuBarProcesoUtilidades,jmenuBarDetalleProcesoUtilidades,jTtoolBarProcesoUtilidades,jTtoolBarDetalleProcesoUtilidades);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoUtilidades ,jPanelParametrosReportesProcesoUtilidades, jScrollPanelDatosProcesoUtilidades,jPanelPaginacionProcesoUtilidades, jScrollPanelDatosEdicionProcesoUtilidades, jPanelAccionesProcesoUtilidades,jPanelAccionesFormularioProcesoUtilidades,jmenuBarProcesoUtilidades,jmenuBarDetalleProcesoUtilidades,jTtoolBarProcesoUtilidades,jTtoolBarDetalleProcesoUtilidades);
						
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
	
	public void finishProcessProcesoUtilidades() {// throws Exception 
		this.finishProcessProcesoUtilidades(true);
	}
	
	public void finishProcessProcesoUtilidades(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoUtilidades ,this.jPanelParametrosReportesProcesoUtilidades, this.jScrollPanelDatosProcesoUtilidades,this.jPanelPaginacionProcesoUtilidades, this.jScrollPanelDatosEdicionProcesoUtilidades, this.jPanelAccionesProcesoUtilidades,this.jPanelAccionesFormularioProcesoUtilidades,this.jmenuBarProcesoUtilidades,this.jmenuBarDetalleProcesoUtilidades,this.jTtoolBarProcesoUtilidades,this.jTtoolBarDetalleProcesoUtilidades);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoUtilidades=this.jTabbedPaneBusquedasProcesoUtilidades; 
		
		final JPanel jPanelParametrosReportesProcesoUtilidades=this.jPanelParametrosReportesProcesoUtilidades;
		//final JScrollPane jScrollPanelDatosProcesoUtilidades=this.jScrollPanelDatosProcesoUtilidades;
		final JTable jTableDatosProcesoUtilidades=this.jTableDatosProcesoUtilidades;		
		final JPanel jPanelPaginacionProcesoUtilidades=this.jPanelPaginacionProcesoUtilidades;
		//final JScrollPane jScrollPanelDatosEdicionProcesoUtilidades=this.jScrollPanelDatosEdicionProcesoUtilidades;
		final JPanel jPanelAccionesProcesoUtilidades=this.jPanelAccionesProcesoUtilidades;
		
		JPanel jPanelCamposAuxiliarProcesoUtilidades=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoUtilidades=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) {
			jPanelCamposAuxiliarProcesoUtilidades=this.jInternalFrameDetalleFormProcesoUtilidades.jPanelCamposProcesoUtilidades;
			jPanelAccionesFormularioAuxiliarProcesoUtilidades=this.jInternalFrameDetalleFormProcesoUtilidades.jPanelAccionesFormularioProcesoUtilidades;
		}
		
		final JPanel jPanelCamposProcesoUtilidades=jPanelCamposAuxiliarProcesoUtilidades;
		final JPanel jPanelAccionesFormularioProcesoUtilidades=jPanelAccionesFormularioAuxiliarProcesoUtilidades;
		
		
		final JMenuBar jmenuBarProcesoUtilidades=this.jmenuBarProcesoUtilidades;		
		final JToolBar jTtoolBarProcesoUtilidades=this.jTtoolBarProcesoUtilidades;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoUtilidades=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoUtilidades=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) {
			jmenuBarDetalleAuxiliarProcesoUtilidades=this.jInternalFrameDetalleFormProcesoUtilidades.jmenuBarDetalleProcesoUtilidades;
			jTtoolBarDetalleAuxiliarProcesoUtilidades=this.jInternalFrameDetalleFormProcesoUtilidades.jTtoolBarDetalleProcesoUtilidades;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoUtilidades=jmenuBarDetalleAuxiliarProcesoUtilidades;
		final JToolBar jTtoolBarDetalleProcesoUtilidades=jTtoolBarDetalleAuxiliarProcesoUtilidades;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoUtilidades;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoUtilidades;
			processRunnable.jTableDatos=jTableDatosProcesoUtilidades;
			processRunnable.jPanelCampos=jPanelCamposProcesoUtilidades;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoUtilidades;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoUtilidades;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoUtilidades;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoUtilidades;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoUtilidades;
			processRunnable.jTtoolBar=jTtoolBarProcesoUtilidades;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoUtilidades;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoUtilidades ,jPanelParametrosReportesProcesoUtilidades, jTableDatosProcesoUtilidades,/*jScrollPanelDatosProcesoUtilidades,*/jPanelCamposProcesoUtilidades,jPanelPaginacionProcesoUtilidades, /*jScrollPanelDatosEdicionProcesoUtilidades,*/ jPanelAccionesProcesoUtilidades,jPanelAccionesFormularioProcesoUtilidades,jmenuBarProcesoUtilidades,jmenuBarDetalleProcesoUtilidades,jTtoolBarProcesoUtilidades,jTtoolBarDetalleProcesoUtilidades));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoUtilidades(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoUtilidades(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoUtilidades(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoUtilidades(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoUtilidades,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoUtilidades,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoUtilidades(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoUtilidades,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoUtilidades,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesoutilidadesConstantesFunciones.getsFinalQueryProcesoUtilidades();
		String  finalQueryPaginacionTodos=this.procesoutilidadesConstantesFunciones.getsFinalQueryProcesoUtilidades();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoUtilidadesConstantesFunciones.getArrayColumnasGlobalesNoProcesoUtilidades(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoUtilidadesConstantesFunciones.getArrayColumnasGlobalesProcesoUtilidades(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoUtilidadesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesoutilidadessEliminados= new ArrayList<ProcesoUtilidades>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoUtilidades();
		
				///*ProcesoUtilidadesSessionBean*/this.procesoutilidadesSessionBean=new ProcesoUtilidadesSessionBean();
			
			if(this.procesoutilidadesSessionBean==null) {
				this.procesoutilidadesSessionBean=new ProcesoUtilidadesSessionBean();
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
					this.iNumeroPaginacion=ProcesoUtilidadesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoUtilidadesConstantesFunciones.getClassesForeignKeysOfProcesoUtilidades(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesoutilidades."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesoutilidadessAux= new ArrayList<ProcesoUtilidades>();
			
				
			procesoutilidadesLogic.setDatosCliente(this.datosCliente);
			procesoutilidadesLogic.setDatosDeep(this.datosDeep);
			procesoutilidadesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoUtilidades")) {
				this.sDetalleReporte=ProcesoUtilidadesConstantesFunciones.getDetalleIndiceBusquedaProcesoUtilidades(id_anioBusquedaProcesoUtilidades,valorBusquedaProcesoUtilidades);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesoutilidadesLogic.getProcesoUtilidadessBusquedaProcesoUtilidades(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_anioBusquedaProcesoUtilidades,valorBusquedaProcesoUtilidades);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoUtilidadesConstantesFunciones.getDetalleIndiceBusquedaProcesoUtilidades(id_anioBusquedaProcesoUtilidades,valorBusquedaProcesoUtilidades);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoUtilidadesConstantesFunciones.getDetalleIndiceBusquedaProcesoUtilidades(id_anioBusquedaProcesoUtilidades,valorBusquedaProcesoUtilidades);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesoutilidadesLogic.getProcesoUtilidadess()==null||procesoutilidadesLogic.getProcesoUtilidadess().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesoutilidadess==null|| procesoutilidadess.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesoutilidadessAux=new ArrayList<ProcesoUtilidades>();
						procesoutilidadessAux.addAll(procesoutilidadesLogic.getProcesoUtilidadess());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesoutilidadessAux=new ArrayList<ProcesoUtilidades>();
							procesoutilidadessAux.addAll(procesoutilidadess);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesoutilidadesLogic.getProcesoUtilidadessBusquedaProcesoUtilidades(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_anioBusquedaProcesoUtilidades,valorBusquedaProcesoUtilidades);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoUtilidadesConstantesFunciones.getDetalleIndiceBusquedaProcesoUtilidades(id_anioBusquedaProcesoUtilidades,valorBusquedaProcesoUtilidades);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoUtilidadesConstantesFunciones.getDetalleIndiceBusquedaProcesoUtilidades(id_anioBusquedaProcesoUtilidades,valorBusquedaProcesoUtilidades);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoUtilidadess("BusquedaProcesoUtilidades",procesoutilidadesLogic.getProcesoUtilidadess());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoUtilidadess("BusquedaProcesoUtilidades",procesoutilidadess);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesoutilidadesLogic.setProcesoUtilidadess(new ArrayList<ProcesoUtilidades>());
						procesoutilidadesLogic.getProcesoUtilidadess().addAll(procesoutilidadessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesoutilidadess=new ArrayList<ProcesoUtilidades>();
							procesoutilidadess.addAll(procesoutilidadessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoUtilidades();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","PROCESOS",JOptionPane.INFORMATION_MESSAGE);
		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoUtilidades();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesoutilidadesLogic.getProcesoUtilidadess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesoutilidadess.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesoutilidadesLogic.getProcesoUtilidadess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesoutilidadess.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoUtilidades procesoutilidades) {
		Boolean permite=true;
		
		if(this.procesoutilidades.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoUtilidadesConstantesFunciones.getOrderByListaProcesoUtilidades();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoUtilidadesConstantesFunciones.getOrderByListaProcesoUtilidades();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoUtilidades procesoutilidades:procesoutilidadesLogic.getProcesoUtilidadess()) {
				if(procesoutilidades.getsType().equals(Constantes2.S_TOTALES)) {
					procesoutilidadesTotales=procesoutilidades;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoUtilidades procesoutilidades:this.procesoutilidadess) {
				if(procesoutilidades.getsType().equals(Constantes2.S_TOTALES)) {
					procesoutilidadesTotales=procesoutilidades;
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
			this.procesoutilidadesAux=new ProcesoUtilidades();
			this.procesoutilidadesAux.setsType(Constantes2.S_TOTALES);
			this.procesoutilidadesAux.setIsNew(false);
			this.procesoutilidadesAux.setIsChanged(false);
			this.procesoutilidadesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoUtilidadesConstantesFunciones.TotalizarValoresFilaProcesoUtilidades(this.procesoutilidadesLogic.getProcesoUtilidadess(),this.procesoutilidadesAux);
				
				//this.procesoutilidadesLogic.getProcesoUtilidadess().add(this.procesoutilidadesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoUtilidadesConstantesFunciones.TotalizarValoresFilaProcesoUtilidades(this.procesoutilidadess,this.procesoutilidadesAux);
				
				this.procesoutilidadess.add(this.procesoutilidadesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesoutilidadesTotales=new ProcesoUtilidades();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesoutilidadesLogic.getProcesoUtilidadess().remove(procesoutilidadesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesoutilidadess.remove(procesoutilidadesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesoutilidadesTotales=new ProcesoUtilidades();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoUtilidades procesoutilidades:procesoutilidadesLogic.getProcesoUtilidadess()) {
				if(procesoutilidades.getsType().equals(Constantes2.S_TOTALES)) {
					procesoutilidadesTotales=procesoutilidades;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoUtilidadesConstantesFunciones.TotalizarValoresFilaProcesoUtilidades(this.procesoutilidadesLogic.getProcesoUtilidadess(),procesoutilidadesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoUtilidades procesoutilidades:this.procesoutilidadess) {
				if(procesoutilidades.getsType().equals(Constantes2.S_TOTALES)) {
					procesoutilidadesTotales=procesoutilidades;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoUtilidadesConstantesFunciones.TotalizarValoresFilaProcesoUtilidades(this.procesoutilidadess,procesoutilidadesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoUtilidadessBusquedaProcesoUtilidades()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoUtilidades";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoUtilidadessFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoUtilidadessBusquedaProcesoUtilidades(String sFinalQuery,Long id_anio,Double valor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesoutilidadesLogic.getProcesoUtilidadessBusquedaProcesoUtilidades(sFinalQuery,this.pagination,id_anio,valor);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoUtilidadessFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesoutilidadesLogic.getProcesoUtilidadessFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
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
	
	public void inicializarPermisosProcesoUtilidades() {
		this.isPermisoTodoProcesoUtilidades=false;
		this.isPermisoNuevoProcesoUtilidades=false;
		this.isPermisoActualizarProcesoUtilidades=false;
		this.isPermisoActualizarOriginalProcesoUtilidades=false;
		this.isPermisoEliminarProcesoUtilidades=false;
		this.isPermisoGuardarCambiosProcesoUtilidades=false;
		this.isPermisoConsultaProcesoUtilidades=true;
		this.isPermisoBusquedaProcesoUtilidades=true;
		this.isPermisoReporteProcesoUtilidades=true;
		this.isPermisoOrdenProcesoUtilidades=false;		
		this.isPermisoPaginacionMedioProcesoUtilidades=false;		
		this.isPermisoPaginacionAltoProcesoUtilidades=false;		
		this.isPermisoPaginacionTodoProcesoUtilidades=false;		
		this.isPermisoCopiarProcesoUtilidades=false;		
		this.isPermisoVerFormProcesoUtilidades=false;		
		this.isPermisoDuplicarProcesoUtilidades=false;
		this.isPermisoOrdenProcesoUtilidades=false;
	}
	
	public void setPermisosUsuarioProcesoUtilidades(Boolean isPermiso) {
		this.isPermisoTodoProcesoUtilidades=isPermiso;
		this.isPermisoNuevoProcesoUtilidades=isPermiso;
		this.isPermisoActualizarProcesoUtilidades=isPermiso;
		this.isPermisoActualizarOriginalProcesoUtilidades=isPermiso;
		this.isPermisoEliminarProcesoUtilidades=isPermiso;
		this.isPermisoGuardarCambiosProcesoUtilidades=isPermiso;
		this.isPermisoConsultaProcesoUtilidades=isPermiso;
		this.isPermisoBusquedaProcesoUtilidades=isPermiso;
		this.isPermisoReporteProcesoUtilidades=isPermiso;
		this.isPermisoOrdenProcesoUtilidades=isPermiso;		
		this.isPermisoPaginacionMedioProcesoUtilidades=isPermiso;		
		this.isPermisoPaginacionAltoProcesoUtilidades=isPermiso;		
		this.isPermisoPaginacionTodoProcesoUtilidades=isPermiso;		
		this.isPermisoCopiarProcesoUtilidades=isPermiso;		
		this.isPermisoVerFormProcesoUtilidades=isPermiso;		
		this.isPermisoDuplicarProcesoUtilidades=isPermiso;
		this.isPermisoOrdenProcesoUtilidades=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoUtilidades(Boolean isPermiso) {
		//this.isPermisoTodoProcesoUtilidades=isPermiso;
		this.isPermisoNuevoProcesoUtilidades=isPermiso;
		this.isPermisoActualizarProcesoUtilidades=isPermiso;
		this.isPermisoActualizarOriginalProcesoUtilidades=isPermiso;
		this.isPermisoEliminarProcesoUtilidades=isPermiso;
		this.isPermisoGuardarCambiosProcesoUtilidades=isPermiso;
		//this.isPermisoConsultaProcesoUtilidades=isPermiso;
		//this.isPermisoBusquedaProcesoUtilidades=isPermiso;
		//this.isPermisoReporteProcesoUtilidades=isPermiso;
		//this.isPermisoOrdenProcesoUtilidades=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoUtilidades=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoUtilidades=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoUtilidades=isPermiso;		
		//this.isPermisoCopiarProcesoUtilidades=isPermiso;		
		//this.isPermisoDuplicarProcesoUtilidades=isPermiso;
		//this.isPermisoOrdenProcesoUtilidades=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoUtilidadesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoUtilidadesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoUtilidades(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoUtilidadesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoUtilidadesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoUtilidadesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoUtilidadesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoUtilidades() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoUtilidadesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoUtilidadesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoUtilidades=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoUtilidades=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoUtilidades=this.isPermisoActualizarProcesoUtilidades;
			this.isPermisoEliminarProcesoUtilidades=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoUtilidades=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoUtilidades=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoUtilidades=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoUtilidades=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoUtilidades=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoUtilidades=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoUtilidades=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoUtilidades=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoUtilidades=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoUtilidades=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoUtilidades=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoUtilidades=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoUtilidades=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoUtilidades.setToolTipText(this.jTableDatosProcesoUtilidades.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoUtilidades(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoUtilidades(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoUtilidadesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoUtilidadesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoUtilidades() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoUtilidadesListas()throws Exception {
		try	{						
			
				this.aniosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoUtilidadesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoUtilidadesJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoUtilidades()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyAnio();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {
			if(this.procesoutilidadesSessionBean==null) {
				this.procesoutilidadesSessionBean=new ProcesoUtilidadesSessionBean();
			}

			if(!this.procesoutilidadesSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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
	
	public void initActionsCombosTodosForeignKeyProcesoUtilidades()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoUtilidades(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoUtilidades()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoUtilidades();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoUtilidades(ProcesoUtilidades procesoutilidades)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoUtilidades(ProcesoUtilidades procesoutilidades,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoUtilidades()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoUtilidades()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoUtilidades()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoUtilidades()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoUtilidades()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoUtilidades()throws Exception {
		try {
			

			this.cargarCombosFrameAniosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoUtilidades(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoUtilidades()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxid_anioProcesoUtilidades!=null && this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxid_anioProcesoUtilidades.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxid_anioProcesoUtilidades.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public ProcesoUtilidadesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoUtilidadesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoUtilidadesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesoutilidadesSessionBean=new ProcesoUtilidadesSessionBean(); 
		this.procesoutilidadesConstantesFunciones=new ProcesoUtilidadesConstantesFunciones(); 
		this.procesoutilidadesBean=new ProcesoUtilidades();//(this.procesoutilidadesConstantesFunciones); 		
		this.procesoutilidadesReturnGeneral=new ProcesoUtilidadesParameterReturnGeneral(); 
		
		this.procesoutilidadesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesoutilidadesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoUtilidadesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoUtilidadesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoUtilidadesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoUtilidades(true);
			
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
			
			this.procesoutilidadesConstantesFunciones=new ProcesoUtilidadesConstantesFunciones(); 
			this.procesoutilidadesBean=new ProcesoUtilidades();//this.procesoutilidadesConstantesFunciones); 			
			this.procesoutilidadesReturnGeneral=new ProcesoUtilidadesParameterReturnGeneral(); 
		
			ProcesoUtilidadesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Utilidades Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.procesoutilidades=new ProcesoUtilidades();
			this.procesoutilidadess = new ArrayList<ProcesoUtilidades>();
			this.procesoutilidadessAux = new ArrayList<ProcesoUtilidades>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic=new ProcesoUtilidadesLogic();
				this.procesoutilidadesLogic.getNewConnexionToDeep("");
			}
			
			//this.procesoutilidadesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesoutilidadesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoUtilidades);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoUtilidades!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoUtilidades);	
					}
					
					if(this.jInternalFrameImportacionProcesoUtilidades!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoUtilidades);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoUtilidades!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoUtilidades);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoUtilidades);
				this.jInternalFrameDetalleFormProcesoUtilidades.setVisible(false);
				this.jInternalFrameDetalleFormProcesoUtilidades.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoUtilidades!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoUtilidades);
					this.jInternalFrameReporteDinamicoProcesoUtilidades.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoUtilidades.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoUtilidades!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoUtilidades);
					this.jInternalFrameImportacionProcesoUtilidades.setVisible(false);
					this.jInternalFrameImportacionProcesoUtilidades.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoUtilidades!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoUtilidades);
					this.jInternalFrameOrderByProcesoUtilidades.setVisible(false);
					this.jInternalFrameOrderByProcesoUtilidades.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoUtilidadesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoUtilidadesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesoutilidadesReturnGeneral=new ProcesoUtilidadesParameterReturnGeneral();
			
			this.procesoutilidadesParameterGeneral=new ProcesoUtilidadesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesoutilidadesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoUtilidadesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoUtilidadesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesoutilidadesSessionBean.getEsGuardarRelacionado(),this.procesoutilidadesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoUtilidadesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesoutilidadesSessionBean.getEsGuardarRelacionado(),this.procesoutilidadesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoUtilidades=false;
			this.isVisibilidadCeldaDuplicarProcesoUtilidades=true;
			this.isVisibilidadCeldaCopiarProcesoUtilidades=true;
			this.isVisibilidadCeldaVerFormProcesoUtilidades=true;
			this.isVisibilidadCeldaOrdenProcesoUtilidades=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoUtilidades=false;
			this.isVisibilidadCeldaModificarProcesoUtilidades=false;
			this.isVisibilidadCeldaActualizarProcesoUtilidades=false;
			this.isVisibilidadCeldaEliminarProcesoUtilidades=false;
			this.isVisibilidadCeldaCancelarProcesoUtilidades=false;
			this.isVisibilidadCeldaGuardarProcesoUtilidades=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoUtilidades=false;
			
			
			this.isVisibilidadBusquedaProcesoUtilidades=true;
			this.isVisibilidadFK_IdAnio=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoUtilidades("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoUtilidades();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoUtilidades(false);
			
			this.setPermisosUsuarioProcesoUtilidades();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesoutilidadesSessionBean.getEsGuardarRelacionado() 
				|| (this.procesoutilidadesSessionBean.getEsGuardarRelacionado() && this.procesoutilidadesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoUtilidadesClasesRelacionadas();
			}
			
			if(this.procesoutilidadesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoUtilidadesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoUtilidadesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoUtilidades();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoUtilidades();
			}
			
			if(!this.isPermisoBusquedaProcesoUtilidades) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoUtilidades.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoUtilidadesConstantesFunciones.getTiposSeleccionarProcesoUtilidades());
				
				this.tiposColumnasSelect=ProcesoUtilidadesConstantesFunciones.getTiposSeleccionarProcesoUtilidades(true);
				
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
			//if(!this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoUtilidades();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioProcesoUtilidades(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioProcesoUtilidades(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoUtilidades() ;
			
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
				procesoutilidadesImplementable= (ProcesoUtilidadesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoUtilidadesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesoutilidadesImplementableHome= (ProcesoUtilidadesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoUtilidadesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesoutilidadess= new ArrayList<ProcesoUtilidades>();
			this.procesoutilidadessEliminados= new ArrayList<ProcesoUtilidades>();
						
			this.isEsNuevoProcesoUtilidades=false;
			this.esParaAccionDesdeFormularioProcesoUtilidades=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.aniosForeignKey=new ArrayList<Anio>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoUtilidades(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoUtilidades();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoUtilidadesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoUtilidadesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoUtilidades("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoUtilidades(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoUtilidades();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoUtilidades();
			}
			
			ProcesoUtilidadesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoUtilidades.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoUtilidades.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoUtilidades.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoUtilidades(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoUtilidades: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoUtilidades() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoUtilidades")) {
				iIndex=this.jInternalFrameDetalleFormProcesoUtilidades.jTabbedPaneRelacionesProcesoUtilidades.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoUtilidades.jTabbedPaneRelacionesProcesoUtilidades.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoUtilidades.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoUtilidades();	
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
	
	public void cargarCombosForeignKeyProcesoUtilidades(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoUtilidades(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoUtilidades(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoUtilidadesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoUtilidades();
		
		this.cargarCombosFrameForeignKeyProcesoUtilidades();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoUtilidades();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoUtilidades();
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
	
	public void jButtonNuevoProcesoUtilidadesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesoutilidadesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoUtilidades==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
			
			
			if(jTableDatosProcesoUtilidades.getRowCount()>=1) {
				jTableDatosProcesoUtilidades.removeRowSelectionInterval(0, jTableDatosProcesoUtilidades.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoUtilidades=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoUtilidades(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoUtilidades(true);			
			//this.procesoutilidades=new ProcesoUtilidades();
			//this.procesoutilidades.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoUtilidades(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoUtilidades() ;
			
			if(ProcesoUtilidadesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoUtilidades(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesoutilidades);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesoutilidades);				
			
			ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
			
			if(this.procesoutilidadesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoUtilidades: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoUtilidadesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoUtilidades> procesoutilidadessSeleccionados=new ArrayList<ProcesoUtilidades>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoUtilidades.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoUtilidades.getSelectedRows().length;			
			}
			
			procesoutilidadessSeleccionados=this.getProcesoUtilidadessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoUtilidades--;			
				//ProcesoUtilidades procesoutilidadesAux= new ProcesoUtilidades();			
				//procesoutilidadesAux.setId(this.iIdNuevoProcesoUtilidades);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoUtilidades procesoutilidadesOrigen=new ProcesoUtilidades();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoUtilidades procesoutilidadesOrigen : procesoutilidadessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoUtilidades.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesoutilidadesOrigen =(ProcesoUtilidades) this.procesoutilidadesLogic.getProcesoUtilidadess().toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesoutilidadesOrigen =(ProcesoUtilidades) this.procesoutilidadess.toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoUtilidades();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesoutilidades.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoUtilidades(procesoutilidadesOrigen,this.procesoutilidades,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoUtilidades(this.procesoutilidades);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesoutilidadesLogic.getProcesoUtilidadess().add(this.procesoutilidadesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesoutilidadess.add(this.procesoutilidadesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoUtilidades(false);
				
				this.jTableDatosProcesoUtilidades.setRowSelectionInterval(this.getIndiceNuevoProcesoUtilidades(), this.getIndiceNuevoProcesoUtilidades());
				
				int iLastRow =  this.jTableDatosProcesoUtilidades.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoUtilidades.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoUtilidades.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoUtilidades(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoUtilidadesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoUtilidades> procesoutilidadessSeleccionados=new ArrayList<ProcesoUtilidades>();									
		
			ProcesoUtilidades procesoutilidadesOrigen=new ProcesoUtilidades();
			ProcesoUtilidades procesoutilidadesDestino=new ProcesoUtilidades();
				
			procesoutilidadessSeleccionados=this.getProcesoUtilidadessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoUtilidades.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesoutilidadessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoUtilidades.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesoutilidadesOrigen =(ProcesoUtilidades) this.procesoutilidadesLogic.getProcesoUtilidadess().toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesoutilidadesOrigen =(ProcesoUtilidades) this.procesoutilidadess.toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesoutilidadesDestino =(ProcesoUtilidades) this.procesoutilidadesLogic.getProcesoUtilidadess().toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesoutilidadesDestino =(ProcesoUtilidades) this.procesoutilidadess.toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesoutilidadesOrigen =procesoutilidadessSeleccionados.get(0);
				procesoutilidadesDestino =procesoutilidadessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoUtilidades(procesoutilidadesOrigen,procesoutilidadesDestino,true,false);
				
				procesoutilidadesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesoutilidadesDestino,procesoutilidadesLogic.getProcesoUtilidadess());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesoutilidadesDestino,procesoutilidadess);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoUtilidades(false);
				
				//this.jTableDatosProcesoUtilidades.setRowSelectionInterval(this.getIndiceNuevoProcesoUtilidades(), this.getIndiceNuevoProcesoUtilidades());
				
				int iLastRow =  this.jTableDatosProcesoUtilidades.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoUtilidades.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoUtilidades.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoUtilidades(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoUtilidadesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoUtilidades==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoUtilidades.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoUtilidadesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoUtilidades.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoUtilidades.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoUtilidades.setVisible(!isVisible);
			this.jPanelPaginacionProcesoUtilidades.setVisible(!isVisible);
			this.jPanelAccionesProcesoUtilidades.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoUtilidadesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoUtilidades();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoUtilidadesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoUtilidades();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoUtilidadesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoUtilidades();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoUtilidadesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoUtilidades();
			
			this.abrirFrameOrderByProcesoUtilidades();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoUtilidadesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoUtilidades();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoUtilidades(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoUtilidades);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoUtilidades.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoUtilidades.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoUtilidades.setSize(this.jInternalFrameDetalleFormProcesoUtilidades.iWidthFormulario,this.jInternalFrameDetalleFormProcesoUtilidades.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoUtilidades.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoUtilidades.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoUtilidades.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoUtilidades.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoUtilidades.jContentPaneDetalleProcesoUtilidades.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoUtilidades.jTabbedPaneRelacionesProcesoUtilidades.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoUtilidades.jContentPaneDetalleProcesoUtilidades.getWidth(),ProcesoUtilidadesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoUtilidades.jTabbedPaneRelacionesProcesoUtilidades.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoUtilidades.jContentPaneDetalleProcesoUtilidades.getWidth(),ProcesoUtilidadesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoUtilidades.jTabbedPaneRelacionesProcesoUtilidades.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoUtilidades.jContentPaneDetalleProcesoUtilidades.getWidth(),ProcesoUtilidadesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoUtilidades.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoUtilidades.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoUtilidades() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoUtilidades==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoUtilidades=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoUtilidades,false,this);
				} else {
					this.jInternalFrameOrderByProcesoUtilidades=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoUtilidades,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoUtilidades);
				this.jInternalFrameOrderByProcesoUtilidades.setVisible(false);
				this.jInternalFrameOrderByProcesoUtilidades.setSelected(false);
				
				this.jInternalFrameOrderByProcesoUtilidades.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoUtilidades"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoUtilidades();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoUtilidades() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoUtilidades==null) {
				
				this.jInternalFrameImportacionProcesoUtilidades=new ImportacionJInternalFrame(ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoUtilidades);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoUtilidades);
				this.jInternalFrameImportacionProcesoUtilidades.setVisible(false);
				this.jInternalFrameImportacionProcesoUtilidades.setSelected(false);


				this.jInternalFrameImportacionProcesoUtilidades.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoUtilidades"));
				this.jInternalFrameImportacionProcesoUtilidades.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoUtilidades"));
				this.jInternalFrameImportacionProcesoUtilidades.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoUtilidades"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoUtilidades() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoUtilidades==null) {
				this.jInternalFrameReporteDinamicoProcesoUtilidades=new ReporteDinamicoJInternalFrame(ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoUtilidades);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoUtilidades);
				this.jInternalFrameReporteDinamicoProcesoUtilidades.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoUtilidades.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoUtilidades.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoUtilidades"));
				this.jInternalFrameReporteDinamicoProcesoUtilidades.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoUtilidades"));
				this.jInternalFrameReporteDinamicoProcesoUtilidades.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoUtilidades"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoUtilidades();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoUtilidades() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoUtilidades);
			
	       	this.jInternalFrameDetalleFormProcesoUtilidades.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoUtilidades.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoUtilidades.dispose();
			//this.jInternalFrameDetalleFormProcesoUtilidades=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoUtilidades() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoUtilidades.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoUtilidades.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoUtilidades() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoUtilidades.setVisible(true);
	        this.jInternalFrameImportacionProcesoUtilidades.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoUtilidades() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoUtilidades.setVisible(true);
	        this.jInternalFrameOrderByProcesoUtilidades.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoUtilidades() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoUtilidades.setVisible(false);
	        this.jInternalFrameOrderByProcesoUtilidades.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoUtilidades() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoUtilidades.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoUtilidades.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoUtilidades() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoUtilidades.setVisible(false);
	        this.jInternalFrameImportacionProcesoUtilidades.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoUtilidadesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoUtilidades(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoUtilidades(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoUtilidades.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoUtilidades(true);
			//this.isEsNuevoProcesoUtilidades=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidades =(ProcesoUtilidades) this.procesoutilidadesLogic.getProcesoUtilidadess().toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesoutilidades =(ProcesoUtilidades) this.procesoutilidadess.toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoUtilidades("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoUtilidades(false) ;
			
			if(procesoutilidadesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoUtilidadesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoUtilidades(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoUtilidades(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoUtilidadesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoUtilidades.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoutilidades =(ProcesoUtilidades) this.procesoutilidadesLogic.getProcesoUtilidadess().toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoutilidades =(ProcesoUtilidades) this.procesoutilidadess.toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoUtilidades(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoUtilidades==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoUtilidades.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoUtilidades(true);
			//this.isEsNuevoProcesoUtilidades=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidades =(ProcesoUtilidades) this.procesoutilidadesLogic.getProcesoUtilidadess().toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesoutilidades =(ProcesoUtilidades) this.procesoutilidadess.toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesoutilidades.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoUtilidades("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoUtilidades(false) ;
			
			if(ProcesoUtilidadesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoUtilidades(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoUtilidades(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosProcesoUtilidades.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoUtilidades,ProcesoUtilidadesConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoUtilidades.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesoUtilidadesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoUtilidades(false);
			
			//if(!this.isEsNuevoProcesoUtilidades) {								
				int intSelectedRow = this.jTableDatosProcesoUtilidades.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoutilidades =(ProcesoUtilidades) this.procesoutilidadesLogic.getProcesoUtilidadess().toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesoutilidades =(ProcesoUtilidades) this.procesoutilidadess.toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoUtilidadesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoUtilidades(this.procesoutilidades,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoUtilidades(this.procesoutilidades);
				
			}
			
			if(this.permiteMantenimiento(this.procesoutilidades)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoUtilidades=true;
					this.inicializarActualizarBindingTablaProcesoUtilidades(false);
					this.isEsNuevoProcesoUtilidades=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoUtilidades=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoUtilidades=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoUtilidades(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoUtilidades(false);
				
				this.habilitarDeshabilitarControlesProcesoUtilidades(false);
			
												
				
				if(ProcesoUtilidadesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoUtilidades();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoUtilidadesActionPerformed(evt,procesoutilidadesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoUtilidades(this.procesoutilidades,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoUtilidades.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesoutilidadesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesoutilidades.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoUtilidades.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoUtilidades.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoUtilidadesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoUtilidades.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidades =(ProcesoUtilidades) this.procesoutilidadesLogic.getProcesoUtilidadess().toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
				this.procesoutilidades.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesoutilidades =(ProcesoUtilidades) this.procesoutilidadess.toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
				this.procesoutilidades.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesoutilidades)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoUtilidadesModel) this.jTableDatosProcesoUtilidades.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoUtilidades=true;
				this.inicializarActualizarBindingTablaProcesoUtilidades(false);
				this.isEsNuevoProcesoUtilidades=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoUtilidades(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoUtilidades(false);
				
				this.habilitarDeshabilitarControlesProcesoUtilidades(false);
				
				
				
				if(ProcesoUtilidadesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoUtilidades();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoUtilidadesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoUtilidades.getRowCount()>=1) {
				jTableDatosProcesoUtilidades.removeRowSelectionInterval(0, jTableDatosProcesoUtilidades.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoUtilidades(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoUtilidades(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoUtilidades(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoUtilidades(false) ;
			
			this.isEsNuevoProcesoUtilidades=false;
			
			if(ProcesoUtilidadesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoUtilidades();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoUtilidadesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoUtilidades(false);
				
				//SI ES MANUAL
				if(ProcesoUtilidadesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoUtilidades();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoUtilidadesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoUtilidades--;			
			//ProcesoUtilidades procesoutilidadesAux= new ProcesoUtilidades();			
			//procesoutilidadesAux.setId(this.iIdNuevoProcesoUtilidades);
			
			if(this.jInternalFrameDetalleFormProcesoUtilidades==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoUtilidades();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoUtilidades(this.procesoutilidades);
			
			this.procesoutilidades.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesoutilidadesLogic.getProcesoUtilidadess().add(this.procesoutilidadesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesoutilidadess.add(this.procesoutilidadesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoUtilidades(false);
			
			this.jTableDatosProcesoUtilidades.setRowSelectionInterval(this.getIndiceNuevoProcesoUtilidades(), this.getIndiceNuevoProcesoUtilidades());
			
			int iLastRow =  this.jTableDatosProcesoUtilidades.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoUtilidades.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoUtilidades.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoUtilidades(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoUtilidadesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoUtilidades(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoUtilidades(false);
			
			//SI ES MANUAL
			if(ProcesoUtilidadesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoUtilidades();
			}
			
			//this.abrirFrameTreeProcesoUtilidades();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoUtilidadesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoUtilidadesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoUtilidades.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoUtilidades.setFileImportacion(this.jInternalFrameImportacionProcesoUtilidades.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoUtilidades.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoUtilidades.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoUtilidades.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoUtilidades.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoUtilidadesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoUtilidades> procesoutilidadessSeleccionados=new ArrayList<ProcesoUtilidades>();		

		procesoutilidadessSeleccionados=this.getProcesoUtilidadessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoUtilidades.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoUtilidades.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoUtilidadesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoUtilidadesBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoUtilidadess("Todos",procesoutilidadessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Utilidades",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoUtilidades.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoUtilidades.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoUtilidadesConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoUtilidadesConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesoUtilidades.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoUtilidades.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoUtilidades.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoUtilidadesConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case ProcesoUtilidadesConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoUtilidades.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoUtilidadesConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case ProcesoUtilidadesConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoUtilidades.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoUtilidades.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoUtilidadesConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case ProcesoUtilidadesConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoUtilidadesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoUtilidades> procesoutilidadessSeleccionados=new ArrayList<ProcesoUtilidades>();		
		
		procesoutilidadessSeleccionados=this.getProcesoUtilidadessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoutilidades";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoUtilidadess");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoUtilidades.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoUtilidades.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoUtilidadesConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoUtilidadesConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(ProcesoUtilidades procesoutilidades:procesoutilidadessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesoutilidades.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoUtilidadesConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoUtilidadesConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(ProcesoUtilidades procesoutilidades:procesoutilidadessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesoutilidades.getvalor());
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
			//	this.getFilaCabeceraExportarExcelProcesoUtilidades(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoUtilidades procesoutilidadesAux:procesoutilidadessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoUtilidades(procesoutilidadesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Utilidades",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionProcesoUtilidadesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			ProcesoUtilidadesBeanSwingJInternalFrameAdditional.ProcesarInformacionProcesoUtilidades(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoUtilidades(false);
			
			//SI ES MANUAL
			if(ProcesoUtilidadesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoUtilidades();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoUtilidadesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoUtilidades(false);
			
			//SI ES MANUAL
			if(ProcesoUtilidadesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoUtilidades();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoUtilidadesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoUtilidades(false);
			
			//SI ES MANUAL
			if(ProcesoUtilidadesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoUtilidades();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoUtilidades() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoUtilidades.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoUtilidades.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoUtilidades.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoUtilidades.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoUtilidades.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoUtilidades.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoUtilidades.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoUtilidades(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoUtilidades(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoUtilidades(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoUtilidades(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoUtilidades(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoUtilidades(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoUtilidades(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoUtilidades(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoUtilidadesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoUtilidadesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoUtilidades() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoUtilidades();
		
		this.inicializarActualizarBindingBotonesManualProcesoUtilidades(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoUtilidades();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoUtilidades() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoUtilidades(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoUtilidades(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoUtilidades.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoUtilidades.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoUtilidades.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoUtilidades.jCheckBoxPostAccionNuevoProcesoUtilidades.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoUtilidades.jCheckBoxPostAccionSinCerrarProcesoUtilidades.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoUtilidades.jCheckBoxPostAccionSinMensajeProcesoUtilidades.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoUtilidades.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoUtilidades.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoUtilidades.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) {
				this.jInternalFrameDetalleFormProcesoUtilidades.jCheckBoxPostAccionNuevoProcesoUtilidades.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoUtilidades.jCheckBoxPostAccionSinCerrarProcesoUtilidades.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoUtilidades.jCheckBoxPostAccionSinMensajeProcesoUtilidades.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoUtilidades.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoUtilidades.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxTiposAccionesFormularioProcesoUtilidades.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoUtilidades.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoUtilidades!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoUtilidades.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoUtilidades.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoUtilidades.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoUtilidades.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoUtilidades.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoUtilidades!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoUtilidades.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoUtilidades.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoUtilidades.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoUtilidades(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoUtilidadesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoUtilidades(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoUtilidades() throws Exception {
		try	{
			if(ProcesoUtilidadesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoUtilidades();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoUtilidades() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxTiposAccionesFormularioProcesoUtilidades.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxTiposAccionesFormularioProcesoUtilidades.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoUtilidades() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoUtilidades.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoUtilidades.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoUtilidades.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoUtilidades.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoUtilidades.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoUtilidades.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoUtilidades.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoUtilidades.addItem(reporte);
			}
			
			
			if(!this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoUtilidades.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoUtilidades.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoUtilidades.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoUtilidades.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoUtilidades.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoUtilidades.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxTiposAccionesFormularioProcesoUtilidades.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxTiposAccionesFormularioProcesoUtilidades.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoUtilidades.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoUtilidades.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoUtilidades.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoUtilidades();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoUtilidades() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoUtilidades!=null) {
				this.jInternalFrameReporteDinamicoProcesoUtilidades.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoUtilidades.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoUtilidades!=null) {
				this.jInternalFrameReporteDinamicoProcesoUtilidades.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoUtilidades.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoUtilidades!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoUtilidades.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoUtilidades.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoUtilidades.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoUtilidades.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoUtilidades.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoUtilidades.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoUtilidades.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoUtilidades.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProcesoUtilidadesConstantesFunciones.getTiposSeleccionarProcesoUtilidades(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProcesoUtilidades.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoUtilidades.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProcesoUtilidades.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProcesoUtilidadesConstantesFunciones.getTiposSeleccionarProcesoUtilidades(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProcesoUtilidades.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProcesoUtilidades.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoUtilidades.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProcesoUtilidadesConstantesFunciones.getTiposSeleccionarProcesoUtilidades(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoUtilidades.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProcesoUtilidades.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoUtilidades.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProcesoUtilidades.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoUtilidades()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_anioBusquedaProcesoUtilidadesProcesoUtilidades.getSelectedItem()!=null){this.id_anioBusquedaProcesoUtilidades=((Anio)this.jComboBoxid_anioBusquedaProcesoUtilidadesProcesoUtilidades.getSelectedItem()).getId();}
		this.valorBusquedaProcesoUtilidades=Double.parseDouble(this.jTextFieldvalorBusquedaProcesoUtilidadesProcesoUtilidades.getText());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoUtilidades(Boolean esInicializar) throws Exception {				
		if(ProcesoUtilidadesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoUtilidades();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoUtilidades() throws Exception {
		this.inicializarActualizarBindingTablaProcesoUtilidades(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoUtilidades() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoUtilidades.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoUtilidades.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoUtilidades.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoUtilidadesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoUtilidades.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoUtilidades.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoUtilidadesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoUtilidadesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoUtilidadesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoUtilidadesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoUtilidades.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoUtilidades.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoUtilidadesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoUtilidades.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoUtilidades(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesoutilidadesLogic.getProcesoUtilidadess().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesoutilidadess.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoUtilidadesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoUtilidades.setModel(new ProcesoUtilidadesModel(this.procesoutilidadesLogic.getProcesoUtilidadess(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoUtilidades.setModel(new ProcesoUtilidadesModel(this.procesoutilidadess,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoUtilidades!=null && this.jInternalFrameOrderByProcesoUtilidades.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoUtilidades();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoUtilidades.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoUtilidades,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoUtilidadesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO,procesoutilidadesConstantesFunciones.resaltarSeleccionarProcesoUtilidades,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO,procesoutilidadesConstantesFunciones.resaltarSeleccionarProcesoUtilidades,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoUtilidades.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoUtilidades,ProcesoUtilidadesConstantesFunciones.LABEL_ID));

		if(this.procesoutilidadesConstantesFunciones.mostraridProcesoUtilidades && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoUtilidadesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesoutilidadesConstantesFunciones.resaltaridProcesoUtilidades,this.procesoutilidadesConstantesFunciones.activaridProcesoUtilidades,iSizeTabla,this,true,"idProcesoUtilidades","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesoutilidadesConstantesFunciones.resaltaridProcesoUtilidades,this.procesoutilidadesConstantesFunciones.activaridProcesoUtilidades,this,true,"idProcesoUtilidades","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoUtilidades.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoUtilidades,ProcesoUtilidadesConstantesFunciones.LABEL_IDANIO));

		if(this.procesoutilidadesConstantesFunciones.mostrarid_anioProcesoUtilidades && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoUtilidadesConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.procesoutilidadesConstantesFunciones.resaltarid_anioProcesoUtilidades,this,this.procesoutilidadesConstantesFunciones.activarid_anioProcesoUtilidades,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.procesoutilidadesConstantesFunciones.resaltarid_anioProcesoUtilidades,this,this.procesoutilidadesConstantesFunciones.activarid_anioProcesoUtilidades,true,"id_anioProcesoUtilidades","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoUtilidadesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoUtilidades.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoUtilidades,ProcesoUtilidadesConstantesFunciones.LABEL_VALOR));

		if(this.procesoutilidadesConstantesFunciones.mostrarvalorProcesoUtilidades && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoUtilidadesConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesoutilidadesConstantesFunciones.resaltarvalorProcesoUtilidades,this.procesoutilidadesConstantesFunciones.activarvalorProcesoUtilidades,iSizeTabla,this,true,"valorProcesoUtilidades","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesoutilidadesConstantesFunciones.resaltarvalorProcesoUtilidades,this.procesoutilidadesConstantesFunciones.activarvalorProcesoUtilidades,this,true,"valorProcesoUtilidades","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoUtilidadesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesoutilidadesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesoutilidadesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesoutilidadesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoUtilidades.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesoutilidadesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesoutilidadesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoUtilidades.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoUtilidades && this.isPermisoGuardarCambiosProcesoUtilidades) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesoutilidadesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesoutilidadesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoUtilidades.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoUtilidades.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoUtilidades && this.isPermisoGuardarCambiosProcesoUtilidades) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoUtilidades && this.isPermisoGuardarCambiosProcesoUtilidades) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoUtilidades.moveColumn(this.jTableDatosProcesoUtilidades.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoUtilidades.moveColumn(this.jTableDatosProcesoUtilidades.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoUtilidades.moveColumn(this.jTableDatosProcesoUtilidades.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoUtilidades.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoUtilidades.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoUtilidades,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoUtilidadesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoUtilidades.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoUtilidades.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoUtilidadesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoUtilidadesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoUtilidades.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoUtilidades.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoUtilidades.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesoutilidadesLogic.getProcesoUtilidadess().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesoutilidadess.size()-1;
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
		//this.jTableDatosProcesoUtilidades.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoUtilidades.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoUtilidades();
			
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
				
				//this.isEsNuevoProcesoUtilidades=false;
					
				ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
			
				if(this.procesoutilidadesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoUtilidades==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoUtilidades.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoUtilidades.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoutilidades =(ProcesoUtilidades) this.procesoutilidadesLogic.getProcesoUtilidadess().toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoutilidades =(ProcesoUtilidades) this.procesoutilidadess.toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesoutilidades.getsType().equals("DUPLICADO")
				   || this.procesoutilidades.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoUtilidades=true;
				
				} else {
					this.isEsNuevoProcesoUtilidades=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {
					if(this.procesoutilidades.getId()>=0 && !this.procesoutilidades.getIsNew()) {						
						this.isEsNuevoProcesoUtilidades=false;
						
					} else {
						this.isEsNuevoProcesoUtilidades=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoUtilidades(esRelaciones);						
				
				this.seleccionarProcesoUtilidades(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesoutilidades.getId()<0) {
					this.isEsNuevoProcesoUtilidades=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoUtilidades(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoUtilidades(evt,rowIndex);
				}	
				
				if(this.procesoutilidadesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoUtilidades: " + this.dDif); 
					}
				}								
				
				ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoUtilidades(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesoutilidades)) {
					if(this.procesoutilidades.getId()>0) {
						this.procesoutilidades.setIsDeleted(true);
						
						this.procesoutilidadessEliminados.add(this.procesoutilidades);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesoutilidadesLogic.getProcesoUtilidadess().remove(this.procesoutilidades);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesoutilidadess.remove(this.procesoutilidades);				
					}
					
					
					((ProcesoUtilidadesModel) this.jTableDatosProcesoUtilidades.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoUtilidades(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoUtilidades(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoUtilidades) {
			
			if(this.jInternalFrameDetalleFormProcesoUtilidades==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoUtilidades.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoUtilidades.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoutilidades =(ProcesoUtilidades) this.procesoutilidadesLogic.getProcesoUtilidadess().toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoutilidades =(ProcesoUtilidades) this.procesoutilidadess.toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoUtilidadesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoUtilidades(this.procesoutilidades);
				}
				
				//ARCHITECTURE
				try {
					

					//Anio
					if(!this.procesoutilidadesConstantesFunciones.cargarid_anioProcesoUtilidades || this.procesoutilidadesConstantesFunciones.event_dependid_anioProcesoUtilidades) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.procesoutilidades.getid_anio());
									//this.inicializarActualizarBindingProcesoUtilidades(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(procesoutilidades.getAnio()!=null) {
							this.aniosForeignKey.add(procesoutilidades.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.procesoutilidades.getid_anio(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoUtilidades("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoUtilidades(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoUtilidades() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoUtilidades(ProcesoUtilidades procesoutilidades) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoUtilidades(procesoutilidades,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoUtilidades(ProcesoUtilidades procesoutilidades,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoUtilidades(procesoutilidades);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoUtilidades(procesoutilidades,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoUtilidades(procesoutilidades);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoUtilidades(ProcesoUtilidades procesoutilidades) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoUtilidades==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoUtilidades.jLabelidProcesoUtilidades.setText(procesoutilidades.getId().toString());
			this.jInternalFrameDetalleFormProcesoUtilidades.jTextFieldvalorProcesoUtilidades.setText(procesoutilidades.getvalor().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoUtilidades procesoutilidadesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesoutilidadesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoUtilidades procesoutilidadesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesoutilidadesLocal=this.procesoutilidades;
			} else {
				procesoutilidadesLocal=this.procesoutilidadesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesoutilidadesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoUtilidades(procesoutilidadesLocal,true);
					
					if(procesoutilidadesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesoutilidadesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesoutilidadesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoUtilidades(ProcesoUtilidades procesoutilidades,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoUtilidades(procesoutilidades,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoUtilidades(procesoutilidades);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoUtilidades(ProcesoUtilidades procesoutilidades,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoUtilidades(procesoutilidades,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoUtilidades(ProcesoUtilidades procesoutilidades,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoUtilidades==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoUtilidades.jLabelidProcesoUtilidades.getText()==null || this.jInternalFrameDetalleFormProcesoUtilidades.jLabelidProcesoUtilidades.getText()=="" || this.jInternalFrameDetalleFormProcesoUtilidades.jLabelidProcesoUtilidades.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoUtilidades.jLabelidProcesoUtilidades.setText("0");
			}

			if(conColumnasBase) {procesoutilidades.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoUtilidades.jLabelidProcesoUtilidades.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoUtilidadesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoUtilidades.jLabelIdProcesoUtilidades,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesoutilidades.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormProcesoUtilidades.jTextFieldvalorProcesoUtilidades.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoUtilidadesConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoUtilidades.jLabelvalorProcesoUtilidades,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoUtilidades(ProcesoUtilidades procesoutilidadesBean,ProcesoUtilidades procesoutilidades,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoUtilidades(ProcesoUtilidades procesoutilidadesOrigen,ProcesoUtilidades procesoutilidades,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesoutilidadesOrigen.getId()!=null && !procesoutilidadesOrigen.getId().equals(0L))) {procesoutilidades.setId(procesoutilidadesOrigen.getId());}}
			if(conDefault || (!conDefault && procesoutilidadesOrigen.getvalor()!=null && !procesoutilidadesOrigen.getvalor().equals(0.0))) {procesoutilidades.setvalor(procesoutilidadesOrigen.getvalor());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoUtilidades(ProcesoUtilidades procesoutilidades) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoUtilidades.jLabelidProcesoUtilidades.setText(procesoutilidades.getId().toString());
			this.jInternalFrameDetalleFormProcesoUtilidades.jTextFieldvalorProcesoUtilidades.setText(procesoutilidades.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoUtilidades(ProcesoUtilidadesBean procesoutilidadesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoUtilidades.jLabelidProcesoUtilidades.setText(procesoutilidadesBean.getId().toString());
			this.jInternalFrameDetalleFormProcesoUtilidades.jTextFieldvalorProcesoUtilidades.setText(procesoutilidadesBean.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoUtilidades(ProcesoUtilidadesParameterReturnGeneral procesoutilidadesReturnGeneral,ProcesoUtilidadesBean procesoutilidadesBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoUtilidades procesoutilidadesLocal=new ProcesoUtilidades();
			
			procesoutilidadesLocal=procesoutilidadesReturnGeneral.getProcesoUtilidades();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesoutilidadesLocal.getId()!=null && !procesoutilidadesLocal.getId().equals(0L))) {procesoutilidadesBean.setId(procesoutilidadesLocal.getId());}}
			if(conDefault || (!conDefault && procesoutilidadesLocal.getvalor()!=null && !procesoutilidadesLocal.getvalor().equals(0.0))) {procesoutilidadesBean.setvalor(procesoutilidadesLocal.getvalor());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoUtilidadesGenerico(Long idProcesoUtilidadesSeleccionado,JComboBox jComboBoxProcesoUtilidades,List<ProcesoUtilidades> procesoutilidadessLocal)throws Exception {
		try {
			ProcesoUtilidades  procesoutilidadesTemp=null;

			for(ProcesoUtilidades procesoutilidadesAux:procesoutilidadessLocal) {
				if(procesoutilidadesAux.getId()!=null && procesoutilidadesAux.getId().equals(idProcesoUtilidadesSeleccionado)) {
					procesoutilidadesTemp=procesoutilidadesAux;
					break;
				}
			}

			jComboBoxProcesoUtilidades.setSelectedItem(procesoutilidadesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoUtilidadesGenerico(JComboBox jComboBoxProcesoUtilidades,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoUtilidades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoUtilidades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoUtilidades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoUtilidades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoUtilidades.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoUtilidades.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoUtilidades.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoUtilidades.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoUtilidades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoUtilidades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesoutilidades=(ProcesoUtilidades) procesoutilidadesLogic.getProcesoUtilidadess().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesoutilidades =(ProcesoUtilidades) procesoutilidadess.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!procesoutilidades.getIsNew() && !procesoutilidades.getIsChanged() && !procesoutilidades.getIsDeleted()) {
				sDescripcion=procesoutilidades.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=procesoutilidades.getanio_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoUtilidades procesoutilidadesRow=new ProcesoUtilidades();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesoutilidadesRow=(ProcesoUtilidades) procesoutilidadesLogic.getProcesoUtilidadess().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesoutilidadesRow=(ProcesoUtilidades) procesoutilidadess.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoUtilidades(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoUtilidades.setVisible((this.isVisibilidadCeldaNuevoProcesoUtilidades && this.isPermisoNuevoProcesoUtilidades));			
			this.jButtonDuplicarProcesoUtilidades.setVisible((this.isVisibilidadCeldaDuplicarProcesoUtilidades && this.isPermisoDuplicarProcesoUtilidades));			
			this.jButtonCopiarProcesoUtilidades.setVisible((this.isVisibilidadCeldaCopiarProcesoUtilidades && this.isPermisoCopiarProcesoUtilidades));
			this.jButtonVerFormProcesoUtilidades.setVisible((this.isVisibilidadCeldaVerFormProcesoUtilidades && this.isPermisoVerFormProcesoUtilidades));
			
			this.jButtonAbrirOrderByProcesoUtilidades.setVisible((this.isVisibilidadCeldaOrdenProcesoUtilidades && this.isPermisoOrdenProcesoUtilidades));			
			
			this.jButtonNuevoRelacionesProcesoUtilidades.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoUtilidades && this.isPermisoNuevoProcesoUtilidades));			
			this.jButtonNuevoGuardarCambiosProcesoUtilidades.setVisible((this.isVisibilidadCeldaNuevoProcesoUtilidades && this.isPermisoNuevoProcesoUtilidades && this.isPermisoGuardarCambiosProcesoUtilidades));
			
			if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) {
			this.jInternalFrameDetalleFormProcesoUtilidades.jButtonModificarProcesoUtilidades.setVisible((this.isVisibilidadCeldaModificarProcesoUtilidades && this.isPermisoActualizarProcesoUtilidades));	
			this.jInternalFrameDetalleFormProcesoUtilidades.jButtonActualizarProcesoUtilidades.setVisible((this.isVisibilidadCeldaActualizarProcesoUtilidades && this.isPermisoActualizarProcesoUtilidades));	
			this.jInternalFrameDetalleFormProcesoUtilidades.jButtonEliminarProcesoUtilidades.setVisible((this.isVisibilidadCeldaEliminarProcesoUtilidades && this.isPermisoEliminarProcesoUtilidades));
			this.jInternalFrameDetalleFormProcesoUtilidades.jButtonCancelarProcesoUtilidades.setVisible(this.isVisibilidadCeldaCancelarProcesoUtilidades);							
			this.jInternalFrameDetalleFormProcesoUtilidades.jButtonGuardarCambiosProcesoUtilidades.setVisible((this.isVisibilidadCeldaGuardarProcesoUtilidades && this.isPermisoGuardarCambiosProcesoUtilidades));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoUtilidades.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoUtilidades && this.isPermisoGuardarCambiosProcesoUtilidades));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoUtilidades.setVisible((this.isVisibilidadCeldaNuevoProcesoUtilidades && this.isPermisoNuevoProcesoUtilidades));						
			this.jButtonDuplicarToolBarProcesoUtilidades.setVisible((this.isVisibilidadCeldaDuplicarProcesoUtilidades && this.isPermisoDuplicarProcesoUtilidades));						
			this.jButtonCopiarToolBarProcesoUtilidades.setVisible((this.isVisibilidadCeldaCopiarProcesoUtilidades && this.isPermisoCopiarProcesoUtilidades));			
			this.jButtonVerFormToolBarProcesoUtilidades.setVisible((this.isVisibilidadCeldaVerFormProcesoUtilidades && this.isPermisoVerFormProcesoUtilidades));			
			this.jButtonAbrirOrderByToolBarProcesoUtilidades.setVisible((this.isVisibilidadCeldaOrdenProcesoUtilidades && this.isPermisoOrdenProcesoUtilidades));
			this.jButtonNuevoRelacionesToolBarProcesoUtilidades.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoUtilidades && this.isPermisoNuevoProcesoUtilidades));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoUtilidades.setVisible((this.isVisibilidadCeldaNuevoProcesoUtilidades && this.isPermisoNuevoProcesoUtilidades && this.isPermisoGuardarCambiosProcesoUtilidades));			
			
			if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) {
			this.jInternalFrameDetalleFormProcesoUtilidades.jButtonModificarToolBarProcesoUtilidades.setVisible((this.isVisibilidadCeldaModificarProcesoUtilidades && this.isPermisoActualizarProcesoUtilidades));	
			this.jInternalFrameDetalleFormProcesoUtilidades.jButtonActualizarToolBarProcesoUtilidades.setVisible((this.isVisibilidadCeldaActualizarProcesoUtilidades  && this.isPermisoActualizarProcesoUtilidades));	
			this.jInternalFrameDetalleFormProcesoUtilidades.jButtonEliminarToolBarProcesoUtilidades.setVisible((this.isVisibilidadCeldaEliminarProcesoUtilidades && this.isPermisoEliminarProcesoUtilidades));
			this.jInternalFrameDetalleFormProcesoUtilidades.jButtonCancelarToolBarProcesoUtilidades.setVisible(this.isVisibilidadCeldaCancelarProcesoUtilidades);				
			this.jInternalFrameDetalleFormProcesoUtilidades.jButtonGuardarCambiosToolBarProcesoUtilidades.setVisible((this.isVisibilidadCeldaGuardarProcesoUtilidades && this.isPermisoGuardarCambiosProcesoUtilidades));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoUtilidades.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoUtilidades && this.isPermisoGuardarCambiosProcesoUtilidades));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoUtilidades.setVisible((this.isVisibilidadCeldaNuevoProcesoUtilidades && this.isPermisoNuevoProcesoUtilidades));			
			this.jMenuItemDuplicarProcesoUtilidades.setVisible((this.isVisibilidadCeldaDuplicarProcesoUtilidades && this.isPermisoDuplicarProcesoUtilidades));			
			this.jMenuItemCopiarProcesoUtilidades.setVisible((this.isVisibilidadCeldaCopiarProcesoUtilidades && this.isPermisoCopiarProcesoUtilidades));			
			this.jMenuItemVerFormProcesoUtilidades.setVisible((this.isVisibilidadCeldaVerFormProcesoUtilidades && this.isPermisoVerFormProcesoUtilidades));			
			this.jMenuItemAbrirOrderByProcesoUtilidades.setVisible((this.isVisibilidadCeldaOrdenProcesoUtilidades && this.isPermisoOrdenProcesoUtilidades));			
			//this.jMenuItemMostrarOcultarProcesoUtilidades.setVisible((this.isVisibilidadCeldaOrdenProcesoUtilidades && this.isPermisoOrdenProcesoUtilidades));
			this.jMenuItemDetalleAbrirOrderByProcesoUtilidades.setVisible((this.isVisibilidadCeldaOrdenProcesoUtilidades && this.isPermisoOrdenProcesoUtilidades));			
			//this.jMenuItemDetalleMostrarOcultarProcesoUtilidades.setVisible((this.isVisibilidadCeldaOrdenProcesoUtilidades && this.isPermisoOrdenProcesoUtilidades));			
			this.jMenuItemNuevoRelacionesProcesoUtilidades.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoUtilidades && this.isPermisoNuevoProcesoUtilidades));			
			this.jMenuItemNuevoGuardarCambiosProcesoUtilidades.setVisible((this.isVisibilidadCeldaNuevoProcesoUtilidades && this.isPermisoNuevoProcesoUtilidades && this.isPermisoGuardarCambiosProcesoUtilidades));									
			
			if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) {
			this.jInternalFrameDetalleFormProcesoUtilidades.jMenuItemModificarProcesoUtilidades.setVisible((this.isVisibilidadCeldaModificarProcesoUtilidades && this.isPermisoActualizarProcesoUtilidades));	
			this.jInternalFrameDetalleFormProcesoUtilidades.jMenuItemActualizarProcesoUtilidades.setVisible((this.isVisibilidadCeldaActualizarProcesoUtilidades && this.isPermisoActualizarProcesoUtilidades));	
			this.jInternalFrameDetalleFormProcesoUtilidades.jMenuItemEliminarProcesoUtilidades.setVisible((this.isVisibilidadCeldaEliminarProcesoUtilidades && this.isPermisoEliminarProcesoUtilidades));
			this.jInternalFrameDetalleFormProcesoUtilidades.jMenuItemCancelarProcesoUtilidades.setVisible(this.isVisibilidadCeldaCancelarProcesoUtilidades);				
			}
			
			this.jMenuItemGuardarCambiosProcesoUtilidades.setVisible((this.isVisibilidadCeldaGuardarProcesoUtilidades && this.isPermisoGuardarCambiosProcesoUtilidades));						
			this.jMenuItemGuardarCambiosTablaProcesoUtilidades.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoUtilidades && this.isPermisoGuardarCambiosProcesoUtilidades));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoUtilidades=this.jButtonNuevoProcesoUtilidades.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoUtilidades=this.jButtonDuplicarProcesoUtilidades.isVisible();
			this.isVisibilidadCeldaCopiarProcesoUtilidades=this.jButtonCopiarProcesoUtilidades.isVisible();
			this.isVisibilidadCeldaVerFormProcesoUtilidades=this.jButtonVerFormProcesoUtilidades.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoUtilidades=this.jButtonAbrirOrderByProcesoUtilidades.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoUtilidades=this.jButtonNuevoRelacionesProcesoUtilidades.isVisible();
			this.isVisibilidadCeldaModificarProcesoUtilidades=this.jButtonModificarProcesoUtilidades.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) {
			this.isVisibilidadCeldaActualizarProcesoUtilidades=this.jInternalFrameDetalleFormProcesoUtilidades.jButtonActualizarProcesoUtilidades.isVisible();
			this.isVisibilidadCeldaEliminarProcesoUtilidades=this.jInternalFrameDetalleFormProcesoUtilidades.jButtonEliminarProcesoUtilidades.isVisible();
			this.isVisibilidadCeldaCancelarProcesoUtilidades=this.jInternalFrameDetalleFormProcesoUtilidades.jButtonCancelarProcesoUtilidades.isVisible();
			this.isVisibilidadCeldaGuardarProcesoUtilidades=this.jInternalFrameDetalleFormProcesoUtilidades.jButtonGuardarCambiosProcesoUtilidades.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoUtilidades=this.jButtonGuardarCambiosTablaProcesoUtilidades.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoUtilidades=this.jButtonNuevoToolBarProcesoUtilidades.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoUtilidades=this.jButtonNuevoRelacionesToolBarProcesoUtilidades.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) {
			this.isVisibilidadCeldaModificarProcesoUtilidades=this.jInternalFrameDetalleFormProcesoUtilidades.jButtonModificarToolBarProcesoUtilidades.isVisible();
			this.isVisibilidadCeldaActualizarProcesoUtilidades=this.jInternalFrameDetalleFormProcesoUtilidades.jButtonActualizarToolBarProcesoUtilidades.isVisible();
			this.isVisibilidadCeldaEliminarProcesoUtilidades=this.jInternalFrameDetalleFormProcesoUtilidades.jButtonEliminarToolBarProcesoUtilidades.isVisible();
			this.isVisibilidadCeldaCancelarProcesoUtilidades=this.jInternalFrameDetalleFormProcesoUtilidades.jButtonCancelarToolBarProcesoUtilidades.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoUtilidades=this.jButtonGuardarCambiosToolBarProcesoUtilidades.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoUtilidades=this.jButtonGuardarCambiosTablaToolBarProcesoUtilidades.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoUtilidades=this.jMenuItemNuevoProcesoUtilidades.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoUtilidades=this.jMenuItemNuevoRelacionesProcesoUtilidades.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) {
			this.isVisibilidadCeldaModificarProcesoUtilidades=this.jInternalFrameDetalleFormProcesoUtilidades.jMenuItemModificarProcesoUtilidades.isVisible();
			this.isVisibilidadCeldaActualizarProcesoUtilidades=this.jInternalFrameDetalleFormProcesoUtilidades.jMenuItemActualizarProcesoUtilidades.isVisible();
			this.isVisibilidadCeldaEliminarProcesoUtilidades=this.jInternalFrameDetalleFormProcesoUtilidades.jMenuItemEliminarProcesoUtilidades.isVisible();
			this.isVisibilidadCeldaCancelarProcesoUtilidades=this.jInternalFrameDetalleFormProcesoUtilidades.jMenuItemCancelarProcesoUtilidades.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoUtilidades=this.jMenuItemGuardarCambiosProcesoUtilidades.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoUtilidades=this.jMenuItemGuardarCambiosTablaProcesoUtilidades.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoUtilidades(Boolean esInicializar) {
		if(ProcesoUtilidadesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesoutilidadesSessionBean.getConGuardarRelaciones()) {
				//if(this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoUtilidades();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoUtilidades(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoUtilidades() {
		this.jButtonNuevoProcesoUtilidades.setVisible(this.isPermisoNuevoProcesoUtilidades);			
		this.jButtonDuplicarProcesoUtilidades.setVisible(this.isPermisoDuplicarProcesoUtilidades);			
		this.jButtonCopiarProcesoUtilidades.setVisible(this.isPermisoCopiarProcesoUtilidades);			
		this.jButtonVerFormProcesoUtilidades.setVisible(this.isPermisoVerFormProcesoUtilidades);			
		
		this.jButtonAbrirOrderByProcesoUtilidades.setVisible(this.isPermisoOrdenProcesoUtilidades);					
		
		this.jButtonNuevoRelacionesProcesoUtilidades.setVisible(this.isPermisoNuevoProcesoUtilidades);			
		
		if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoUtilidades.jButtonModificarProcesoUtilidades.setVisible(this.isPermisoActualizarProcesoUtilidades);	
			this.jInternalFrameDetalleFormProcesoUtilidades.jButtonActualizarProcesoUtilidades.setVisible(this.isPermisoActualizarProcesoUtilidades);	
			this.jInternalFrameDetalleFormProcesoUtilidades.jButtonEliminarProcesoUtilidades.setVisible(this.isPermisoEliminarProcesoUtilidades);
			this.jInternalFrameDetalleFormProcesoUtilidades.jButtonCancelarProcesoUtilidades.setVisible(this.isVisibilidadCeldaCancelarProcesoUtilidades);						
			this.jInternalFrameDetalleFormProcesoUtilidades.jButtonGuardarCambiosProcesoUtilidades.setVisible(this.isPermisoGuardarCambiosProcesoUtilidades);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoUtilidades.setVisible(this.isPermisoActualizarProcesoUtilidades);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoUtilidades() {
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonModificarProcesoUtilidades.setVisible(this.isPermisoActualizarProcesoUtilidades);	
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonActualizarProcesoUtilidades.setVisible(this.isPermisoActualizarProcesoUtilidades);	
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonEliminarProcesoUtilidades.setVisible(this.isPermisoEliminarProcesoUtilidades);
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonCancelarProcesoUtilidades.setVisible(this.isVisibilidadCeldaCancelarProcesoUtilidades);							
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonGuardarCambiosProcesoUtilidades.setVisible((this.isVisibilidadCeldaGuardarProcesoUtilidades && this.isPermisoGuardarCambiosProcesoUtilidades));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoUtilidades() {
		if(ProcesoUtilidadesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoUtilidades();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoUtilidades() {
	}
	
	public void jTableDatosProcesoUtilidadesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoUtilidades(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoUtilidadesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoutilidadesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoUtilidades.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoUtilidades(this.getprocesoutilidades(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoUtilidades(this.procesoutilidades);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoutilidades =(ProcesoUtilidades) this.procesoutilidadesLogic.getProcesoUtilidadess().toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesoutilidades =(ProcesoUtilidades) this.procesoutilidadess.toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesoutilidades==null) {
						this.procesoutilidades = new ProcesoUtilidades();
					}

					this.setVariablesFormularioToObjetoActualProcesoUtilidades(this.procesoutilidades,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoUtilidades(this.procesoutilidades);
				}

				if(this.procesoutilidades.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesoutilidades.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoUtilidades(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoutilidadesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoutilidadesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoutilidadesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioProcesoUtilidadesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebProcesoUtilidades(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoUtilidades.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoUtilidades.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoUtilidades.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoutilidades =(ProcesoUtilidades) this.procesoutilidadesLogic.getProcesoUtilidadess().toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesoutilidades =(ProcesoUtilidades) this.procesoutilidadess.toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoUtilidades(this.getprocesoutilidades(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoUtilidades(this.procesoutilidades);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.procesoutilidadesLogic.getConnexion());

				if(this.procesoutilidades.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.procesoutilidades.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoUtilidades=(TitledBorder)this.jScrollPanelDatosProcesoUtilidades.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderProcesoUtilidades.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioProcesoUtilidadesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoutilidadesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoUtilidades.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoUtilidades(this.getprocesoutilidades(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoUtilidades(this.procesoutilidades);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoutilidades =(ProcesoUtilidades) this.procesoutilidadesLogic.getProcesoUtilidadess().toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesoutilidades =(ProcesoUtilidades) this.procesoutilidadess.toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesoutilidades==null) {
						this.procesoutilidades = new ProcesoUtilidades();
					}

					this.setVariablesFormularioToObjetoActualProcesoUtilidades(this.procesoutilidades,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoUtilidades(this.procesoutilidades);
				}

				if(this.procesoutilidades.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.procesoutilidades.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoUtilidades(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoutilidadesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoutilidadesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoutilidadesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorProcesoUtilidadesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoutilidadesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoUtilidades.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoUtilidades(this.getprocesoutilidades(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoUtilidades(this.procesoutilidades);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoutilidades =(ProcesoUtilidades) this.procesoutilidadesLogic.getProcesoUtilidadess().toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesoutilidades =(ProcesoUtilidades) this.procesoutilidadess.toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesoutilidades==null) {
						this.procesoutilidades = new ProcesoUtilidades();
					}

					this.setVariablesFormularioToObjetoActualProcesoUtilidades(this.procesoutilidades,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoUtilidades(this.procesoutilidades);
				}

				if(this.procesoutilidades.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.procesoutilidades.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoUtilidades(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoutilidadesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoutilidadesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoutilidadesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoUtilidadesProcesoUtilidadesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoUtilidades(false,false);

			this.getProcesoUtilidadessBusquedaProcesoUtilidades();

			this.inicializarActualizarBindingProcesoUtilidades(false);

			//if(ProcesoUtilidadesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoUtilidades(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdAnioProcesoUtilidadesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoUtilidades(false,false);

			this.getProcesoUtilidadessFK_IdAnio();

			this.inicializarActualizarBindingProcesoUtilidades(false);

			//if(ProcesoUtilidadesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoUtilidades(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoutilidadesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoUtilidades() {
		if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) {
			this.jInternalFrameDetalleFormProcesoUtilidades.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoUtilidades.dispose();
			this.jInternalFrameDetalleFormProcesoUtilidades=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoUtilidades!=null) {
			this.jInternalFrameReporteDinamicoProcesoUtilidades.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoUtilidades.dispose();
			this.jInternalFrameReporteDinamicoProcesoUtilidades=null;
		}
		
		if(this.jInternalFrameImportacionProcesoUtilidades!=null) {
			this.jInternalFrameImportacionProcesoUtilidades.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoUtilidades.dispose();
			this.jInternalFrameImportacionProcesoUtilidades=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoUtilidades();
			
			ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoUtilidades")) {
				jButtonNuevoProcesoUtilidadesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoUtilidades")) {
				jButtonDuplicarProcesoUtilidadesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoUtilidades")) {
				jButtonCopiarProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoUtilidades")) {
				jButtonVerFormProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoUtilidades")) {
				jButtonNuevoProcesoUtilidadesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoUtilidades")) {
				jButtonDuplicarProcesoUtilidadesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoUtilidades")) {
				jButtonNuevoProcesoUtilidadesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoUtilidades")) {
				jButtonDuplicarProcesoUtilidadesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoUtilidades")) {
				jButtonNuevoProcesoUtilidadesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoUtilidades")) {
				jButtonNuevoProcesoUtilidadesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoUtilidades")) {
				jButtonNuevoProcesoUtilidadesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoUtilidades")) {
				jButtonModificarProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoUtilidades")) {
				jButtonModificarProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoUtilidades")) {
				jButtonModificarProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoUtilidades")) {
				jButtonActualizarProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoUtilidades")) {
				jButtonActualizarProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoUtilidades")) {
				jButtonActualizarProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoUtilidades")) {
				jButtonEliminarProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoUtilidades")) {
				jButtonEliminarProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoUtilidades")) {
				jButtonEliminarProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoUtilidades")) {
				jButtonCancelarProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoUtilidades")) {
				jButtonCancelarProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoUtilidades")) {
				jButtonCancelarProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoUtilidades")) {
				jButtonCerrarProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoUtilidades")) {
				jButtonCerrarProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoUtilidades")) {
				jButtonCerrarProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoUtilidades")) {
				jButtonMostrarOcultarProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoUtilidades")) {
				jButtonCancelarProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoUtilidades")) {
				jButtonGuardarCambiosProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoUtilidades")) {
				jButtonGuardarCambiosProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoUtilidades")) {
				jButtonCopiarProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoUtilidades")) {
				jButtonVerFormProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoUtilidades")) {
				jButtonGuardarCambiosProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoUtilidades")) {
				jButtonCopiarProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoUtilidades")) {
				jButtonVerFormProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoUtilidades")) {
				jButtonGuardarCambiosProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoUtilidades")) {
				jButtonGuardarCambiosProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoUtilidades")) {
				jButtonGuardarCambiosProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoUtilidades")) {
				jButtonRecargarInformacionProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoUtilidades")) {
				jButtonRecargarInformacionProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoUtilidades")) {
				jButtonRecargarInformacionProcesoUtilidadesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoUtilidades")) {
				jButtonAnterioresProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoUtilidades")) {
				jButtonAnterioresProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoUtilidades")) {
				jButtonAnterioresProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoUtilidades")) {
				jButtonSiguientesProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoUtilidades")) {
				jButtonSiguientesProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoUtilidades")) {
				jButtonSiguientesProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoUtilidades") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoUtilidades")) {
				jButtonAbrirOrderByProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoUtilidades") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoUtilidades")) {
				jButtonMostrarOcultarProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoUtilidades")) {
				jButtonNuevoGuardarCambiosProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoUtilidades")) {
				jButtonNuevoGuardarCambiosProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoUtilidades")) {
				jButtonNuevoGuardarCambiosProcesoUtilidadesActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionProcesoUtilidades")) {
				jButtonProcesarInformacionProcesoUtilidadesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoUtilidades")) {
				jButtonCerrarReporteDinamicoProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoUtilidades")) {
				jButtonGenerarReporteDinamicoProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoUtilidades")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoUtilidadesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoUtilidades")) {
				jButtonCerrarImportacionProcesoUtilidadesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoUtilidades")) {
				
				jButtonGenerarImportacionProcesoUtilidadesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoUtilidades")) {
				
				jButtonAbrirImportacionProcesoUtilidadesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoUtilidades")) {
				jComboBoxTiposAccionesProcesoUtilidadesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoUtilidades")) {
				jComboBoxTiposRelacionesProcesoUtilidadesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoUtilidades")) {
				jComboBoxTiposAccionesProcesoUtilidadesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoUtilidades")) {
				
				jComboBoxTiposSeleccionarProcesoUtilidadesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoUtilidades")) {
				jTextFieldValorCampoGeneralProcesoUtilidadesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoUtilidades")) {
				jButtonAbrirOrderByProcesoUtilidadesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoUtilidades")) {
				jButtonAbrirOrderByProcesoUtilidadesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoUtilidades")) {
				jButtonCerrarOrderByProcesoUtilidadesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoUtilidadesBusqueda")) {
				this.jButtonidProcesoUtilidadesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioProcesoUtilidadesUpdate")) {
				this.jButtonid_anioProcesoUtilidadesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioProcesoUtilidadesBusqueda")) {
				this.jButtonid_anioProcesoUtilidadesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorProcesoUtilidadesBusqueda")) {
				this.jButtonvalorProcesoUtilidadesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoUtilidadesProcesoUtilidades")) {
				this.jButtonBusquedaProcesoUtilidadesProcesoUtilidadesActionPerformed(evt);
			}
			
			;
			
			
			ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoUtilidades();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoUtilidadesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoutilidades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoutilidades);
				
				ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
				
				


				
				ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoUtilidades.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoUtilidades.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoUtilidades procesoutilidadesLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesoutilidadesLocal=this.procesoutilidades;
			} else {
				procesoutilidadesLocal=this.procesoutilidadesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoutilidades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoutilidades);
				
				ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
							
				
				


				
				ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoUtilidades.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoUtilidades.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoUtilidadesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoUtilidades.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoutilidadesAnterior =(ProcesoUtilidades) this.procesoutilidadesLogic.getProcesoUtilidadess().toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoutilidadesAnterior =(ProcesoUtilidades) this.procesoutilidadess.toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
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
			
			ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
			
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
			
			


			
			ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoUtilidadesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoutilidades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoutilidades);
				
				ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
								
						
				


				
				ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoUtilidades.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoUtilidades.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoutilidades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoutilidades);
				
				ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
								
				
				


				
				ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoUtilidades.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoUtilidades.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoUtilidadesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoUtilidades.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoutilidadesAnterior =(ProcesoUtilidades) this.procesoutilidadesLogic.getProcesoUtilidadess().toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoutilidadesAnterior =(ProcesoUtilidades) this.procesoutilidadess.toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoutilidades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoutilidades);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoUtilidadesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoUtilidades.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoutilidadesAnterior =(ProcesoUtilidades) this.procesoutilidadesLogic.getProcesoUtilidadess().toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoutilidadesAnterior =(ProcesoUtilidades) this.procesoutilidadess.toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoUtilidadesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoutilidades);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesoutilidades);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoutilidades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoutilidades);
				
				ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
							
				
				


				
				ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoUtilidades.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoUtilidades.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoUtilidadesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoUtilidades.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoutilidadesAnterior =(ProcesoUtilidades) this.procesoutilidadesLogic.getProcesoUtilidadess().toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesoutilidadesAnterior =(ProcesoUtilidades) this.procesoutilidadess.toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
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
			
			ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
			
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
			
			


			
			ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoUtilidadesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoutilidades);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesoutilidades);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoutilidades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoutilidades);
				
				ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
								
				
				


				
				ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoUtilidades.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoUtilidades.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoUtilidadesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoUtilidades.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoutilidadesAnterior =(ProcesoUtilidades) this.procesoutilidadesLogic.getProcesoUtilidadess().toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoutilidadesAnterior =(ProcesoUtilidades) this.procesoutilidadess.toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoUtilidadesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoutilidades);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesoutilidades);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoUtilidadesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoutilidades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoutilidades);
				
				ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoUtilidades")) {
					jCheckBoxSeleccionarTodosProcesoUtilidadesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoUtilidades")) {
					jCheckBoxSeleccionadosProcesoUtilidadesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoUtilidades")) {
					
				}
				
				


				
				
				ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoUtilidades.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoUtilidades.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoutilidades);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesoutilidades);
				
				ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
												
				
				


				
				
				ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoUtilidades.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoUtilidades.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoUtilidadesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoUtilidades.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoutilidadesAnterior =(ProcesoUtilidades) this.procesoutilidadesLogic.getProcesoUtilidadess().toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesoutilidadesAnterior =(ProcesoUtilidades) this.procesoutilidadess.toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoUtilidadesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoutilidades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoutilidades);
				
				ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
				
				
				ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
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
			
			ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
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
			
			


			
			ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoUtilidadesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoutilidades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoutilidades);
				
				ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoUtilidades.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoUtilidades.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoutilidades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoutilidades);
				
				ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
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
				
				


				
				ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoUtilidades.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoUtilidades.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoUtilidadesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoUtilidades.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoutilidadesAnterior =(ProcesoUtilidades) this.procesoutilidadesLogic.getProcesoUtilidadess().toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoutilidadesAnterior =(ProcesoUtilidades) this.procesoutilidadess.toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoUtilidades")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoUtilidadesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoUtilidades.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesoutilidades =(ProcesoUtilidades) this.procesoutilidadesLogic.getProcesoUtilidadess().toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesoutilidades =(ProcesoUtilidades) this.procesoutilidadess.toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesoutilidades);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoUtilidades")) {
				
				}
				
				ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoUtilidades")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoUtilidades.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoUtilidades")) {
			
			}
			
			ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoUtilidades();
			
			ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoUtilidades")) {
				jButtonNuevoProcesoUtilidadesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoUtilidades")) {
				jButtonDuplicarProcesoUtilidadesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoUtilidades")) {
				jButtonCopiarProcesoUtilidadesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoUtilidades")) {
				jButtonVerFormProcesoUtilidadesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoUtilidades")) {
				jButtonNuevoProcesoUtilidadesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoUtilidades")) {
				jButtonModificarProcesoUtilidadesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoUtilidades")) {
				jButtonActualizarProcesoUtilidadesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoUtilidades")) {
				jButtonEliminarProcesoUtilidadesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoUtilidades")) {
				jButtonGuardarCambiosProcesoUtilidadesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoUtilidades")) {
				jButtonCancelarProcesoUtilidadesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoUtilidades")) {
				jButtonCerrarProcesoUtilidadesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoUtilidades")) {
				jButtonGuardarCambiosProcesoUtilidadesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoUtilidades")) {
				jButtonNuevoGuardarCambiosProcesoUtilidadesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoUtilidades")) {
				jButtonAbrirOrderByProcesoUtilidadesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoUtilidades")) {
				jButtonRecargarInformacionProcesoUtilidadesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoUtilidades")) {
				jButtonAnterioresProcesoUtilidadesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoUtilidades")) {
				jButtonSiguientesProcesoUtilidadesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoUtilidadesBusqueda")) {
				this.jButtonidProcesoUtilidadesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioProcesoUtilidadesUpdate")) {
				this.jButtonid_anioProcesoUtilidadesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioProcesoUtilidadesBusqueda")) {
				this.jButtonid_anioProcesoUtilidadesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorProcesoUtilidadesBusqueda")) {
				this.jButtonvalorProcesoUtilidadesBusquedaActionPerformed(evt);
			}
			
			ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoUtilidades();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoUtilidades")) {
				closingInternalFrameProcesoUtilidades();
				
			} else if(sTipo.equals("jButtonCancelarProcesoUtilidades")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoUtilidades = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoUtilidadesBeanSwingJInternalFrame jInternalFrameParent=(ProcesoUtilidadesBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoUtilidades.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoUtilidadesActionPerformed(null);
			}
			
			ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesoutilidades,new Object(),this.procesoutilidadesParameterGeneral,this.procesoutilidadesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoUtilidades(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoUtilidades(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoUtilidades(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesoutilidades)) {
			if(!esControlTabla) {
				if(ProcesoUtilidadesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoUtilidades(this.procesoutilidades,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoUtilidades(this.procesoutilidades);			
				}
				
				if(this.procesoutilidadesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoUtilidades(this.procesoutilidades,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoUtilidades(this.procesoutilidadesReturnGeneral,this.procesoutilidadesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesoutilidadesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoUtilidades(classes,this.procesoutilidadesReturnGeneral,this.procesoutilidadesBean,false);
					}
						
					if(this.procesoutilidadesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoUtilidades(this.procesoutilidadesReturnGeneral.getProcesoUtilidades());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoUtilidades(this.procesoutilidadesReturnGeneral.getProcesoUtilidades());	
					}
						
					if(this.procesoutilidadesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoUtilidades(this.procesoutilidadesReturnGeneral.getProcesoUtilidades(),classes);//this.procesoutilidadesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoUtilidades(this.procesoutilidades,classes);//this.procesoutilidadesBean);									
				}
			
				if(ProcesoUtilidadesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoUtilidades(this.procesoutilidades,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoUtilidades(this.procesoutilidades);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesoutilidadesAnterior!=null) {
						this.procesoutilidades=this.procesoutilidadesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesoutilidadesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesoutilidadesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesoutilidadesReturnGeneral.getProcesoUtilidades(),procesoutilidadesLogic.getProcesoUtilidadess());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesoutilidadesReturnGeneral.getProcesoUtilidades(),this.procesoutilidadess);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoUtilidades.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoUtilidades.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoUtilidades();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoUtilidades() throws Exception {
		
		ProcesoUtilidadesModel procesoutilidadesModel=(ProcesoUtilidadesModel)this.jTableDatosProcesoUtilidades.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesoutilidadesModel.procesoutilidadess=this.procesoutilidadesLogic.getProcesoUtilidadess();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesoutilidadesModel.procesoutilidadess=this.procesoutilidadess;
		}
		
		
		((ProcesoUtilidadesModel) this.jTableDatosProcesoUtilidades.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoUtilidades() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesoutilidadesAnterior(),this.procesoutilidadesLogic.getProcesoUtilidadess());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesoutilidadesAnterior(),this.procesoutilidadess);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoUtilidades();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoUtilidades(ProcesoUtilidades procesoutilidades,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
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
										
				ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesoutilidades,new Object(),generalEntityParameterGeneral,this.procesoutilidadesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesoutilidadesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoUtilidadesConstantesFunciones.getClassesRelationshipsOfProcesoUtilidades(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoUtilidadesConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoUtilidades(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoUtilidades(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoUtilidadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesoutilidades,new Object(),generalEntityParameterGeneral,this.procesoutilidadesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoUtilidades(ProcesoUtilidadesBean procesoutilidadesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoUtilidades(ArrayList<Classe> classes,ProcesoUtilidadesReturnGeneral procesoutilidadesReturnGeneral,ProcesoUtilidadesBean procesoutilidadesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoUtilidades(ProcesoUtilidades procesoutilidades,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesoutilidades)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoUtilidades = new ProcesoUtilidadesDetalleFormJInternalFrame(jDesktopPane,this.procesoutilidadesSessionBean.getConGuardarRelaciones(),this.procesoutilidadesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoUtilidades);
		this.jInternalFrameDetalleFormProcesoUtilidades.setVisible(false);
		this.jInternalFrameDetalleFormProcesoUtilidades.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoUtilidades.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoUtilidades.procesoutilidadesLogic=this.procesoutilidadesLogic;
		
		this.cargarCombosFrameForeignKeyProcesoUtilidades("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoUtilidades();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoUtilidades();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoUtilidades("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoUtilidades();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoUtilidades.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoUtilidades"));
		
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonModificarProcesoUtilidades.addActionListener(new ButtonActionListener(this,"ModificarProcesoUtilidades"));

		
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonModificarToolBarProcesoUtilidades.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoUtilidades"));
					
		this.jInternalFrameDetalleFormProcesoUtilidades.jMenuItemModificarProcesoUtilidades.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoUtilidades"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonActualizarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"ActualizarProcesoUtilidades"));
		
		
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonActualizarToolBarProcesoUtilidades.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoUtilidades"));
						
		this.jInternalFrameDetalleFormProcesoUtilidades.jMenuItemActualizarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoUtilidades"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonEliminarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"EliminarProcesoUtilidades"));
		
		
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonEliminarToolBarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoUtilidades"));
								
		this.jInternalFrameDetalleFormProcesoUtilidades.jMenuItemEliminarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoUtilidades"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonCancelarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"CancelarProcesoUtilidades"));
		
		
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonCancelarToolBarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoUtilidades"));
					
		this.jInternalFrameDetalleFormProcesoUtilidades.jMenuItemCancelarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoUtilidades"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoUtilidades.jMenuItemDetalleCerrarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoUtilidades"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonGuardarCambiosToolBarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoUtilidades"));
		
		
		
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonGuardarCambiosToolBarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoUtilidades"));
		
		
		
		this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxTiposAccionesFormularioProcesoUtilidades.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoUtilidades"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonidProcesoUtilidadesBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoUtilidadesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonid_anioProcesoUtilidadesUpdate.addActionListener(new ButtonActionListener(this,"id_anioProcesoUtilidadesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonid_anioProcesoUtilidadesBusqueda.addActionListener(new ButtonActionListener(this,"id_anioProcesoUtilidadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonvalorProcesoUtilidadesBusqueda.addActionListener(new ButtonActionListener(this,"valorProcesoUtilidadesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoUtilidades.jTabbedPaneRelacionesProcesoUtilidades.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoUtilidades"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoUtilidades"));
		
		if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoUtilidades.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoUtilidades"));
		}
		
		this.jTableDatosProcesoUtilidades.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoUtilidades"));
		
		this.jTableDatosProcesoUtilidades.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoUtilidades"));
		
		this.jButtonNuevoProcesoUtilidades.addActionListener(new ButtonActionListener(this,"NuevoProcesoUtilidades"));
		
		this.jButtonDuplicarProcesoUtilidades.addActionListener(new ButtonActionListener(this,"DuplicarProcesoUtilidades"));
		
		this.jButtonCopiarProcesoUtilidades.addActionListener(new ButtonActionListener(this,"CopiarProcesoUtilidades"));
		
		this.jButtonVerFormProcesoUtilidades.addActionListener(new ButtonActionListener(this,"VerFormProcesoUtilidades"));
		
		
		this.jButtonNuevoToolBarProcesoUtilidades.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoUtilidades"));
			
		this.jButtonDuplicarToolBarProcesoUtilidades.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoUtilidades"));
			
		this.jMenuItemNuevoProcesoUtilidades.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoUtilidades"));
			
		this.jMenuItemDuplicarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoUtilidades"));		
		
		
		this.jButtonNuevoRelacionesProcesoUtilidades.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoUtilidades"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoUtilidades.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoUtilidades"));
			
		this.jMenuItemNuevoRelacionesProcesoUtilidades.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoUtilidades"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoUtilidades.jButtonModificarProcesoUtilidades.addActionListener(new ButtonActionListener(this,"ModificarProcesoUtilidades"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoUtilidades.jButtonModificarToolBarProcesoUtilidades.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoUtilidades"));
			
			this.jInternalFrameDetalleFormProcesoUtilidades.jMenuItemModificarProcesoUtilidades.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoUtilidades"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoUtilidades.jButtonActualizarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"ActualizarProcesoUtilidades"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoUtilidades.jButtonActualizarToolBarProcesoUtilidades.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoUtilidades"));
				
			this.jInternalFrameDetalleFormProcesoUtilidades.jMenuItemActualizarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoUtilidades"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoUtilidades.jButtonEliminarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"EliminarProcesoUtilidades"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoUtilidades.jButtonEliminarToolBarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoUtilidades"));
						
			this.jInternalFrameDetalleFormProcesoUtilidades.jMenuItemEliminarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoUtilidades"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoUtilidades.jButtonCancelarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"CancelarProcesoUtilidades"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoUtilidades.jButtonCancelarToolBarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoUtilidades"));
			
			this.jInternalFrameDetalleFormProcesoUtilidades.jMenuItemCancelarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoUtilidades"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoUtilidades"));		
		
		
		this.jButtonCerrarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"CerrarProcesoUtilidades"));
		
		
		this.jButtonCerrarToolBarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoUtilidades"));
			
		this.jMenuItemCerrarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoUtilidades"));
			
		if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoUtilidades.jMenuItemDetalleCerrarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoUtilidades"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoUtilidades.jButtonGuardarCambiosProcesoUtilidades.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoUtilidades"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoUtilidades.jButtonGuardarCambiosToolBarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoUtilidades"));
		}
		
		this.jButtonCopiarToolBarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoUtilidades"));
			
		this.jButtonVerFormToolBarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoUtilidades"));
		
		this.jMenuItemGuardarCambiosProcesoUtilidades.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoUtilidades"));
			
		this.jMenuItemCopiarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoUtilidades"));		
		
		this.jMenuItemVerFormProcesoUtilidades.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoUtilidades"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoUtilidades.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoUtilidades"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoUtilidades"));
			
		this.jMenuItemGuardarCambiosTablaProcesoUtilidades.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoUtilidades"));		
		
		
		
		this.jButtonRecargarInformacionProcesoUtilidades.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoUtilidades"));
					
		this.jButtonRecargarInformacionToolBarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoUtilidades"));
		
		this.jMenuItemRecargarInformacionProcesoUtilidades.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoUtilidades"));		
		
		
		
		this.jButtonAnterioresProcesoUtilidades.addActionListener (new ButtonActionListener(this,"AnterioresProcesoUtilidades"));
		
		
		this.jButtonAnterioresToolBarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoUtilidades"));
		
		this.jMenuItemAnterioresProcesoUtilidades.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoUtilidades"));		
		
		
		this.jButtonSiguientesProcesoUtilidades.addActionListener (new ButtonActionListener(this,"SiguientesProcesoUtilidades"));
		
		
		this.jButtonSiguientesToolBarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoUtilidades"));
			
		this.jMenuItemSiguientesProcesoUtilidades.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoUtilidades"));
			
		this.jMenuItemAbrirOrderByProcesoUtilidades.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoUtilidades"));
			
		this.jMenuItemMostrarOcultarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoUtilidades"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoUtilidades.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoUtilidades"));
			
		this.jMenuItemDetalleMostarOcultarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoUtilidades"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoUtilidades.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoUtilidades"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoUtilidades"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoUtilidades.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoUtilidades"));		
		
		
		this.jButtonProcesarInformacionProcesoUtilidades.addActionListener (new ButtonActionListener(this,"ProcesarInformacionProcesoUtilidades"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoUtilidades.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoUtilidades"));

		this.jCheckBoxSeleccionadosProcesoUtilidades.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoUtilidades"));
		
		if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxTiposAccionesFormularioProcesoUtilidades.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoUtilidades"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoUtilidades.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoUtilidades"));
			
		this.jComboBoxTiposAccionesProcesoUtilidades.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoUtilidades"));
					
		this.jComboBoxTiposSeleccionarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoUtilidades"));
			
		this.jTextFieldValorCampoGeneralProcesoUtilidades.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoUtilidades"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonidProcesoUtilidadesBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoUtilidadesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonid_anioProcesoUtilidadesUpdate.addActionListener(new ButtonActionListener(this,"id_anioProcesoUtilidadesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonid_anioProcesoUtilidadesBusqueda.addActionListener(new ButtonActionListener(this,"id_anioProcesoUtilidadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonvalorProcesoUtilidadesBusqueda.addActionListener(new ButtonActionListener(this,"valorProcesoUtilidadesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoUtilidadesProcesoUtilidades.addActionListener(new ButtonActionListener(this,"BusquedaProcesoUtilidadesProcesoUtilidades"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoUtilidades!=null) {
				this.jInternalFrameReporteDinamicoProcesoUtilidades.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoUtilidades"));
				this.jInternalFrameReporteDinamicoProcesoUtilidades.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoUtilidades"));
				this.jInternalFrameReporteDinamicoProcesoUtilidades.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoUtilidades"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoUtilidades.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoUtilidades"));				
			//this.jButtonGenerarReporteDinamicoProcesoUtilidades.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoUtilidades"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoUtilidades.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoUtilidades"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoUtilidades!=null) {
				this.jInternalFrameImportacionProcesoUtilidades.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoUtilidades"));
				this.jInternalFrameImportacionProcesoUtilidades.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoUtilidades"));
				this.jInternalFrameImportacionProcesoUtilidades.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoUtilidades"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoUtilidades.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoUtilidades"));
			
			this.jButtonAbrirOrderByToolBarProcesoUtilidades.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoUtilidades"));			
			
			if(this.jInternalFrameOrderByProcesoUtilidades!=null) {
				this.jInternalFrameOrderByProcesoUtilidades.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoUtilidades"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoUtilidades.jTabbedPaneRelacionesProcesoUtilidades.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoUtilidades"));
		
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
            		closingInternalFrameProcesoUtilidades();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoUtilidades.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoUtilidades = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoUtilidadesBeanSwingJInternalFrame jInternalFrameParent=(ProcesoUtilidadesBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoUtilidades.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoUtilidadesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoUtilidades.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoUtilidadesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoUtilidades.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoUtilidades.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoUtilidadesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoUtilidadesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoUtilidadesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoUtilidades";
		inputMap = this.jButtonNuevoProcesoUtilidades.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoUtilidades.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoUtilidadesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoUtilidadesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoUtilidadesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoUtilidadesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoUtilidades";
		inputMap = this.jButtonNuevoRelacionesProcesoUtilidades.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoUtilidades.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoUtilidadesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoUtilidades";
		inputMap = this.jButtonModificarProcesoUtilidades.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoUtilidades.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoUtilidadesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoUtilidades";
		inputMap = this.jButtonActualizarProcesoUtilidades.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoUtilidades.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoUtilidadesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoUtilidades";
		inputMap = this.jButtonEliminarProcesoUtilidades.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoUtilidades.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoUtilidadesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoUtilidades";
		inputMap = this.jButtonCancelarProcesoUtilidades.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoUtilidades.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoUtilidadesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoUtilidades";
		inputMap = this.jButtonCerrarProcesoUtilidades.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoUtilidades.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoUtilidadesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonGuardarCambiosProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoUtilidades";
		inputMap = this.jInternalFrameDetalleFormProcesoUtilidades.jButtonGuardarCambiosProcesoUtilidades.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonGuardarCambiosProcesoUtilidades.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoUtilidadesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoUtilidades.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoUtilidadesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoUtilidades.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoUtilidadesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoUtilidades.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoUtilidadesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoUtilidades.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoUtilidadesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonidProcesoUtilidadesBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoUtilidadesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonid_anioProcesoUtilidadesUpdate.addActionListener(new ButtonActionListener(this,"id_anioProcesoUtilidadesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonid_anioProcesoUtilidadesBusqueda.addActionListener(new ButtonActionListener(this,"id_anioProcesoUtilidadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoUtilidades.jButtonvalorProcesoUtilidadesBusqueda.addActionListener(new ButtonActionListener(this,"valorProcesoUtilidadesBusqueda"));
		
		
		this.jButtonBusquedaProcesoUtilidadesProcesoUtilidades.addActionListener(new ButtonActionListener(this,"BusquedaProcesoUtilidadesProcesoUtilidades"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoUtilidades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoUtilidadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoUtilidadesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoUtilidades.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoUtilidades(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoUtilidades procesoutilidadesAux:this.procesoutilidadesLogic.getProcesoUtilidadess()) {
					procesoutilidadesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoUtilidades procesoutilidadesAux:procesoutilidadess) {
					procesoutilidadesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoUtilidadesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoUtilidades(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoUtilidades procesoutilidadesAux:this.procesoutilidadesLogic.getProcesoUtilidadess()) {
						procesoutilidadesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoUtilidades procesoutilidadesAux:procesoutilidadess) {
						procesoutilidadesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoUtilidades procesoutilidadesAux:this.procesoutilidadesLogic.getProcesoUtilidadess()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoUtilidades procesoutilidadesAux:procesoutilidadess) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoUtilidades(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoUtilidades.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoUtilidades.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoUtilidades,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoUtilidadesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoUtilidades(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoUtilidades.getSelectedRows();
			
			ProcesoUtilidades procesoutilidadesLocal=new ProcesoUtilidades();
			
			//this.seleccionarTodosProcesoUtilidades(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesoutilidadesLocal =(ProcesoUtilidades) this.procesoutilidadesLogic.getProcesoUtilidadess().toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesoutilidadesLocal =(ProcesoUtilidades) this.procesoutilidadess.toArray()[this.jTableDatosProcesoUtilidades.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesoutilidadesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoUtilidades procesoutilidadesAux:this.procesoutilidadesLogic.getProcesoUtilidadess()) {
						procesoutilidadesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoUtilidades procesoutilidadesAux:procesoutilidadess) {
						procesoutilidadesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoUtilidades(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoUtilidades.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoUtilidades.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoUtilidades,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoUtilidadesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoUtilidadesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoUtilidadesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoUtilidades(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoUtilidades.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoUtilidades procesoutilidadesAux:this.procesoutilidadesLogic.getProcesoUtilidadess()) {
				
						if(sTipoSeleccionar.equals(ProcesoUtilidadesConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							procesoutilidadesAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoUtilidades procesoutilidadesAux:procesoutilidadess) {
					
						if(sTipoSeleccionar.equals(ProcesoUtilidadesConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							procesoutilidadesAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoUtilidades(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoUtilidadesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoUtilidades(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoUtilidades=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoUtilidades.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxTiposAccionesFormularioProcesoUtilidades.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoUtilidades) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoUtilidades(conSplash);
				
					this.generarReporteProcesoUtilidadessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoUtilidades.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxTiposAccionesFormularioProcesoUtilidades.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoUtilidadessSeleccionados();
				//this.jComboBoxTiposAccionesProcesoUtilidades.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoUtilidadessSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoUtilidades.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoUtilidadessSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoUtilidades.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoUtilidades();
				
				this.exportarProcesoUtilidadessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoUtilidades.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxTiposAccionesFormularioProcesoUtilidades.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoUtilidadess();
				//this.importarProcesoUtilidadess();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoUtilidades.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxTiposAccionesFormularioProcesoUtilidades.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoUtilidades();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoUtilidadessSeleccionados();
				//this.jComboBoxTiposAccionesProcesoUtilidades.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Utilidades", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoUtilidades();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoUtilidades)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoUtilidades(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Utilidades",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoUtilidades.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxTiposAccionesFormularioProcesoUtilidades.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoUtilidadesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoUtilidades) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoUtilidades(conSplash);
					
						//this.actualizarParametrosGeneralProcesoUtilidades();
						
						this.generarReporteProcesoAccionProcesoUtilidadessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoUtilidades.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxTiposAccionesFormularioProcesoUtilidades.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoUtilidadesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso UtilidadesES SELECCIONADOS?", "MANTENIMIENTO DE Proceso Utilidades", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoUtilidades();
				
						this.actualizarParametrosGeneralProcesoUtilidades();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesoutilidadesReturnGeneral=procesoutilidadesLogic.procesarAccionProcesoUtilidadessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesoutilidadesLogic.getProcesoUtilidadess(),this.procesoutilidadesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoUtilidadesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoUtilidades.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxTiposAccionesFormularioProcesoUtilidades.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoUtilidades();
					
					ProcesoUtilidadesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoUtilidadesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoUtilidades.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxTiposAccionesFormularioProcesoUtilidades.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoUtilidades(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoUtilidadesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoUtilidades();
			
			if(this.jInternalFrameDetalleFormProcesoUtilidades==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoUtilidades> procesoutilidadessSeleccionados=new ArrayList<ProcesoUtilidades>();		
			ProcesoUtilidades procesoutilidades=new ProcesoUtilidades();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoUtilidades(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoUtilidades.getSelectedItem();
			
			
			
			
			procesoutilidadessSeleccionados=this.getProcesoUtilidadessSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesoutilidadessSeleccionados.size()==1) {
				for(ProcesoUtilidades procesoutilidadesAux:procesoutilidadessSeleccionados) {
					procesoutilidades=procesoutilidadesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoUtilidades();
			
      		//this.finishProcessProcesoUtilidades(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoUtilidadesReturnGeneral() throws Exception {
		if(this.procesoutilidadesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesoutilidadesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesoutilidadesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesoutilidadesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesoutilidadesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesoutilidadesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoUtilidades(false);
		}
		
		if(this.procesoutilidadesReturnGeneral.getConRetornoLista() || this.procesoutilidadesReturnGeneral.getConRetornoObjeto()) {
			if(this.procesoutilidadesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.procesoutilidadesLogic.setProcesoUtilidadess(this.procesoutilidadesReturnGeneral.getProcesoUtilidadess());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoUtilidades(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoUtilidades() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoUtilidades> getProcesoUtilidadessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoUtilidades> procesoutilidadessSeleccionados=new ArrayList<ProcesoUtilidades>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoUtilidades) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoUtilidades procesoutilidadesAux:procesoutilidadesLogic.getProcesoUtilidadess()) {
					if(procesoutilidadesAux.getIsSelected()) {
						procesoutilidadessSeleccionados.add(procesoutilidadesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoUtilidades procesoutilidadesAux:this.procesoutilidadess) {
					if(procesoutilidadesAux.getIsSelected()) {
						procesoutilidadessSeleccionados.add(procesoutilidadesAux);				
					}
				}
			}
			
			if(procesoutilidadessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesoutilidadessSeleccionados.addAll(this.procesoutilidadesLogic.getProcesoUtilidadess());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesoutilidadessSeleccionados.addAll(this.procesoutilidadess);				
					}
				}
			}
		} else {
			procesoutilidadessSeleccionados.add(this.procesoutilidades);
		}
		
		return procesoutilidadessSeleccionados;
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
	
	public void generarReporteProcesoUtilidadessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoUtilidadessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoUtilidadessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoUtilidadessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoUtilidadessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Utilidades",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoUtilidadessSeleccionados() throws Exception {
		ArrayList<ProcesoUtilidades> procesoutilidadessSeleccionados=new ArrayList<ProcesoUtilidades>();		
		
		procesoutilidadessSeleccionados=this.getProcesoUtilidadessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoUtilidadess("Todos",procesoutilidadessSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoUtilidadessSeleccionados() throws Exception {
		ArrayList<ProcesoUtilidades> procesoutilidadessSeleccionados=new ArrayList<ProcesoUtilidades>();		
		
		procesoutilidadessSeleccionados=this.getProcesoUtilidadessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoUtilidadess("Todos",procesoutilidadessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoUtilidadessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoUtilidades> procesoutilidadessSeleccionados=new ArrayList<ProcesoUtilidades>();
		
		procesoutilidadessSeleccionados=this.getProcesoUtilidadessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoUtilidadess("Todos",procesoutilidadessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoUtilidadessSeleccionados() throws Exception {
		ArrayList<ProcesoUtilidades> procesoutilidadessSeleccionados=new ArrayList<ProcesoUtilidades>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoUtilidades();
		
		
		procesoutilidadessSeleccionados=this.getProcesoUtilidadessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoUtilidades();
		
		
		//this.generarReporteProcesoUtilidadess("Todos",procesoutilidadessSeleccionados ,procesoutilidadesImplementable,procesoutilidadesImplementableHome);
	}
	
	public void mostrarImportacionProcesoUtilidadess() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoUtilidades();
		
		this.abrirFrameImportacionProcesoUtilidades();		
		
			
		//this.generarReporteProcesoUtilidadess("Todos",procesoutilidadessSeleccionados ,procesoutilidadesImplementable,procesoutilidadesImplementableHome);
	}
	
	public void importarProcesoUtilidadess() throws Exception {		
	
	}
	
	public void exportarProcesoUtilidadessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoUtilidadessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoUtilidadessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoUtilidadessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Utilidades",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoUtilidadessSeleccionados() throws Exception {
		ArrayList<ProcesoUtilidades> procesoutilidadessSeleccionados=new ArrayList<ProcesoUtilidades>();		
		
		procesoutilidadessSeleccionados=this.getProcesoUtilidadessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoutilidades."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoUtilidades(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoUtilidades procesoutilidadesAux:procesoutilidadessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoUtilidades(procesoutilidadesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesoutilidadesAux.setsDetalleGeneralEntityReporte(procesoutilidadesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Utilidades",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoUtilidades(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoUtilidadesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoUtilidadesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoUtilidadesConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoUtilidadesConstantesFunciones.LABEL_VALOR;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoUtilidades(ProcesoUtilidades procesoutilidades,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesoutilidades.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesoutilidades.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesoutilidades.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesoutilidades.getvalor().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoUtilidadessSeleccionados() throws Exception {
		ArrayList<ProcesoUtilidades> procesoutilidadessSeleccionados=new ArrayList<ProcesoUtilidades>();		
		
		procesoutilidadessSeleccionados=this.getProcesoUtilidadessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoutilidades.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoUtilidadess");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoUtilidades(row);				
				iRow++;
			}				
			
			for(ProcesoUtilidades procesoutilidadesAux:procesoutilidadessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoUtilidades(procesoutilidadesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Utilidades",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoUtilidadessSeleccionados() throws Exception {
		ArrayList<ProcesoUtilidades> procesoutilidadessSeleccionados=new ArrayList<ProcesoUtilidades>();		
		
		procesoutilidadessSeleccionados=this.getProcesoUtilidadessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoutilidades.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesoutilidadess");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesoutilidades");
			//elementRoot.appendChild(element);
		
			for(ProcesoUtilidades procesoutilidadesAux:procesoutilidadessSeleccionados) {
				element = document.createElement("procesoutilidades");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoUtilidades(procesoutilidadesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Utilidades",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoUtilidades(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoUtilidadesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoUtilidadesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoUtilidadesConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoUtilidadesConstantesFunciones.LABEL_VALOR);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoUtilidades(ProcesoUtilidades procesoutilidades,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesoutilidades.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesoutilidades.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesoutilidades.getvalor());				
	}
	
	public void setFilaDatosExportarXmlProcesoUtilidades(ProcesoUtilidades procesoutilidades,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoUtilidadesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesoutilidades.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoUtilidadesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesoutilidades.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementanio_descripcion = document.createElement(ProcesoUtilidadesConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(procesoutilidades.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementvalor = document.createElement(ProcesoUtilidadesConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(procesoutilidades.getvalor().toString().trim()));
		element.appendChild(elementvalor);
	}
	
	public void generarReporteGroupGenericoProcesoUtilidadessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoUtilidades> procesoutilidadessSeleccionados=new ArrayList<ProcesoUtilidades>();
		
		procesoutilidadessSeleccionados=this.getProcesoUtilidadessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoUtilidades(procesoutilidadessSeleccionados);
		
		this.generarReporteProcesoUtilidadess("Todos",procesoutilidadessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoUtilidades(ArrayList<ProcesoUtilidades> procesoutilidadessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoUtilidades procesoutilidadesAux:procesoutilidadessSeleccionados) {
				procesoutilidadesAux.setsDetalleGeneralEntityReporte(procesoutilidadesAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoUtilidadesConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					procesoutilidadesAux.setsDescripcionGeneralEntityReporte1(procesoutilidadesAux.getanio_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoUtilidadesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoUtilidades(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoUtilidades=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoUtilidades=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoUtilidades=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoUtilidades=false;
			this.isVisibilidadCeldaActualizarProcesoUtilidades=false;
			this.isVisibilidadCeldaEliminarProcesoUtilidades=false;
			this.isVisibilidadCeldaCancelarProcesoUtilidades=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoUtilidades=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoUtilidades=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoUtilidades=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoUtilidades=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoUtilidades=false;
			this.isVisibilidadCeldaModificarProcesoUtilidades=false;
			this.isVisibilidadCeldaActualizarProcesoUtilidades=true;
			this.isVisibilidadCeldaEliminarProcesoUtilidades=false;
			this.isVisibilidadCeldaCancelarProcesoUtilidades=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoUtilidades=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoUtilidades=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoUtilidades=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoUtilidades=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoUtilidades=false;
			this.isVisibilidadCeldaModificarProcesoUtilidades=false;
			this.isVisibilidadCeldaActualizarProcesoUtilidades=true;
			this.isVisibilidadCeldaEliminarProcesoUtilidades=true;
			this.isVisibilidadCeldaCancelarProcesoUtilidades=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoUtilidades=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoUtilidades=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoUtilidades=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoUtilidades=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoUtilidades=false;
			this.isVisibilidadCeldaModificarProcesoUtilidades=false;
			this.isVisibilidadCeldaActualizarProcesoUtilidades=true;
			this.isVisibilidadCeldaEliminarProcesoUtilidades=false;
			this.isVisibilidadCeldaCancelarProcesoUtilidades=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoUtilidades=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoUtilidades=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoUtilidades=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoUtilidades=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoUtilidades=true;
			this.isVisibilidadCeldaModificarProcesoUtilidades=false;
			this.isVisibilidadCeldaActualizarProcesoUtilidades=false;
			this.isVisibilidadCeldaEliminarProcesoUtilidades=false;
			this.isVisibilidadCeldaCancelarProcesoUtilidades=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoUtilidades=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoUtilidades=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoUtilidades=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoUtilidades=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoUtilidades=false;
			this.isVisibilidadCeldaActualizarProcesoUtilidades=false;
			this.isVisibilidadCeldaEliminarProcesoUtilidades=false;
			this.isVisibilidadCeldaCancelarProcesoUtilidades=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoUtilidades=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoUtilidades=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoUtilidades=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoUtilidades=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoUtilidades=false;
			this.isVisibilidadCeldaModificarProcesoUtilidades=true;
			this.isVisibilidadCeldaActualizarProcesoUtilidades=false;
			this.isVisibilidadCeldaEliminarProcesoUtilidades=false;
			this.isVisibilidadCeldaCancelarProcesoUtilidades=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoUtilidades=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoUtilidades=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoUtilidadesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoUtilidades=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoUtilidades=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoUtilidades=true;
		} else {
			this.actualizarEstadoPanelsProcesoUtilidades(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoUtilidades=false;
			//this.isVisibilidadCeldaVerFormProcesoUtilidades=false;
			this.isVisibilidadCeldaDuplicarProcesoUtilidades=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesoutilidadesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoUtilidades=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoUtilidades=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoUtilidades=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesoutilidadesSessionBean.getEsGuardarRelacionado()) {
			if(!procesoutilidadesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoUtilidades=false;												
			}
			
			this.jButtonCerrarProcesoUtilidades.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoUtilidades=false;
		}
		
		if(!this.permiteMantenimiento(this.procesoutilidades)) {
			this.isVisibilidadCeldaActualizarProcesoUtilidades=false;
			this.isVisibilidadCeldaEliminarProcesoUtilidades=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoUtilidades=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoUtilidades=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoUtilidades=false;
		//this.isVisibilidadCeldaModificarProcesoUtilidades=true;
		this.isVisibilidadCeldaActualizarProcesoUtilidades=false;
		this.isVisibilidadCeldaEliminarProcesoUtilidades=false;
		//this.isVisibilidadCeldaCancelarProcesoUtilidades=true;			
		this.isVisibilidadCeldaGuardarProcesoUtilidades=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoUtilidades() {
	}
	
	public void actualizarEstadoPanelsProcesoUtilidades(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoUtilidades!=null) {
				this.jScrollPanelDatosEdicionProcesoUtilidades.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoUtilidades!=null) {
				this.jTabbedPaneBusquedasProcesoUtilidades.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoUtilidades!=null) {
				this.jScrollPanelDatosProcesoUtilidades.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoUtilidades!=null) {
				this.jPanelPaginacionProcesoUtilidades.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoUtilidades!=null) {
				this.jPanelParametrosReportesProcesoUtilidades.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoUtilidades!=null) {
				this.jScrollPanelDatosEdicionProcesoUtilidades.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoUtilidades!=null) {
				this.jTabbedPaneBusquedasProcesoUtilidades.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoUtilidades!=null) {
				this.jScrollPanelDatosProcesoUtilidades.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoUtilidades!=null) {
				this.jPanelPaginacionProcesoUtilidades.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoUtilidades!=null) {
				this.jPanelParametrosReportesProcesoUtilidades.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoUtilidades!=null) {
				this.jScrollPanelDatosEdicionProcesoUtilidades.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoUtilidades!=null) {
				this.jTabbedPaneBusquedasProcesoUtilidades.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoUtilidades!=null) {
				this.jScrollPanelDatosProcesoUtilidades.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoUtilidades!=null) {
				this.jPanelPaginacionProcesoUtilidades.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoUtilidades!=null) {
				this.jPanelParametrosReportesProcesoUtilidades.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoUtilidades!=null) {
				this.jScrollPanelDatosEdicionProcesoUtilidades.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoUtilidades!=null) {
				this.jTabbedPaneBusquedasProcesoUtilidades.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoUtilidades!=null) {
				this.jScrollPanelDatosProcesoUtilidades.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoUtilidades!=null) {
				this.jPanelPaginacionProcesoUtilidades.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoUtilidades!=null) {
				this.jPanelParametrosReportesProcesoUtilidades.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoUtilidades!=null) {
				this.jScrollPanelDatosEdicionProcesoUtilidades.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoUtilidades!=null) {
				this.jTabbedPaneBusquedasProcesoUtilidades.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoUtilidades!=null) {
				this.jScrollPanelDatosProcesoUtilidades.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoUtilidades!=null) {
				this.jPanelPaginacionProcesoUtilidades.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoUtilidades!=null) {
				this.jPanelParametrosReportesProcesoUtilidades.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoUtilidades!=null) {
				this.jScrollPanelDatosEdicionProcesoUtilidades.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoUtilidades!=null) {
				this.jTabbedPaneBusquedasProcesoUtilidades.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoUtilidades!=null) {
				this.jScrollPanelDatosProcesoUtilidades.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoUtilidades!=null) {
				this.jPanelPaginacionProcesoUtilidades.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoUtilidades!=null) {
				this.jPanelParametrosReportesProcesoUtilidades.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoUtilidades!=null) {
				this.jScrollPanelDatosEdicionProcesoUtilidades.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoUtilidades!=null) {
				this.jTabbedPaneBusquedasProcesoUtilidades.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoUtilidades!=null) {
				this.jScrollPanelDatosProcesoUtilidades.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoUtilidades!=null) {
				this.jPanelPaginacionProcesoUtilidades.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoUtilidades!=null) {
				this.jPanelParametrosReportesProcesoUtilidades.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoUtilidades!=null) {
					this.jTabbedPaneBusquedasProcesoUtilidades.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoUtilidades!=null) {
				this.jPanelParametrosReportesProcesoUtilidades.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoUtilidades!=null) {
				this.jTabbedPaneBusquedasProcesoUtilidades.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoUtilidades!=null) {
				this.jPanelParametrosReportesProcesoUtilidades.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadBusquedaProcesoUtilidades=isParaAnio;
			if(!this.isVisibilidadBusquedaProcesoUtilidades) {this.jTabbedPaneBusquedasProcesoUtilidades.remove(jPanelBusquedaProcesoUtilidadesProcesoUtilidades);}
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
			
			this.inicializarActualizarBindingTablaProcesoUtilidades(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoUtilidades() {
		this.updateBorderResaltarBusquedasFormularioProcesoUtilidades();
		this.updateVisibilidadBusquedasFormularioProcesoUtilidades();
		this.updateHabilitarBusquedasFormularioProcesoUtilidades();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoUtilidades() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoUtilidades.getComponents().length>0) {
	

		if(this.procesoutilidadesConstantesFunciones.resaltarBusquedaProcesoUtilidadesProcesoUtilidades!=null) {
			index= this.jTabbedPaneBusquedasProcesoUtilidades.indexOfComponent(this.jPanelBusquedaProcesoUtilidadesProcesoUtilidades);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoUtilidades.getComponent(index);
				jPanel.setBorder(this.procesoutilidadesConstantesFunciones.resaltarBusquedaProcesoUtilidadesProcesoUtilidades);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoUtilidades() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoUtilidades.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoUtilidades.indexOfComponent(this.jPanelBusquedaProcesoUtilidadesProcesoUtilidades);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoUtilidades.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesoutilidadesConstantesFunciones.mostrarBusquedaProcesoUtilidadesProcesoUtilidades);
			if(!this.procesoutilidadesConstantesFunciones.mostrarBusquedaProcesoUtilidadesProcesoUtilidades && index>-1) {
				this.jTabbedPaneBusquedasProcesoUtilidades.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoUtilidades() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoUtilidades.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoUtilidades.indexOfComponent(this.jPanelBusquedaProcesoUtilidadesProcesoUtilidades);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoUtilidades.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesoutilidadesConstantesFunciones.activarBusquedaProcesoUtilidadesProcesoUtilidades);
				this.jTabbedPaneBusquedasProcesoUtilidades.setEnabledAt(index,this.procesoutilidadesConstantesFunciones.activarBusquedaProcesoUtilidadesProcesoUtilidades);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoUtilidades(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoUtilidades")) {
			index= this.jTabbedPaneBusquedasProcesoUtilidades.indexOfComponent(this.jPanelBusquedaProcesoUtilidadesProcesoUtilidades);

			this.jTabbedPaneBusquedasProcesoUtilidades.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoUtilidades.getComponent(index);

			this.procesoutilidadesConstantesFunciones.setResaltarBusquedaProcesoUtilidadesProcesoUtilidades(resaltar);

			jPanel.setBorder(this.procesoutilidadesConstantesFunciones.resaltarBusquedaProcesoUtilidadesProcesoUtilidades);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoUtilidades.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoUtilidades() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoUtilidades==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoUtilidades();
		this.updateVisibilidadResaltarControlesFormularioProcesoUtilidades();
		this.updateHabilitarResaltarControlesFormularioProcesoUtilidades();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoUtilidades() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoUtilidades==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesoutilidadesConstantesFunciones.resaltaridProcesoUtilidades!=null && this.jInternalFrameDetalleFormProcesoUtilidades!=null) {this.jInternalFrameDetalleFormProcesoUtilidades.jLabelidProcesoUtilidades.setBorder(this.procesoutilidadesConstantesFunciones.resaltaridProcesoUtilidades);}
		if(this.procesoutilidadesConstantesFunciones.resaltarid_anioProcesoUtilidades!=null && this.jInternalFrameDetalleFormProcesoUtilidades!=null) {this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxid_anioProcesoUtilidades.setBorder(this.procesoutilidadesConstantesFunciones.resaltarid_anioProcesoUtilidades);}
		if(this.procesoutilidadesConstantesFunciones.resaltarvalorProcesoUtilidades!=null && this.jInternalFrameDetalleFormProcesoUtilidades!=null) {this.jInternalFrameDetalleFormProcesoUtilidades.jTextFieldvalorProcesoUtilidades.setBorder(this.procesoutilidadesConstantesFunciones.resaltarvalorProcesoUtilidades);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoUtilidades() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoUtilidades==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) {
	
		//this.jInternalFrameDetalleFormProcesoUtilidades.jLabelidProcesoUtilidades.setVisible(this.procesoutilidadesConstantesFunciones.mostraridProcesoUtilidades);
		this.jInternalFrameDetalleFormProcesoUtilidades.jPanelidProcesoUtilidades.setVisible(this.procesoutilidadesConstantesFunciones.mostraridProcesoUtilidades);
		//this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxid_anioProcesoUtilidades.setVisible(this.procesoutilidadesConstantesFunciones.mostrarid_anioProcesoUtilidades);
		this.jInternalFrameDetalleFormProcesoUtilidades.jPanelid_anioProcesoUtilidades.setVisible(this.procesoutilidadesConstantesFunciones.mostrarid_anioProcesoUtilidades);
		//this.jInternalFrameDetalleFormProcesoUtilidades.jTextFieldvalorProcesoUtilidades.setVisible(this.procesoutilidadesConstantesFunciones.mostrarvalorProcesoUtilidades);
		this.jInternalFrameDetalleFormProcesoUtilidades.jPanelvalorProcesoUtilidades.setVisible(this.procesoutilidadesConstantesFunciones.mostrarvalorProcesoUtilidades);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoUtilidades() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoUtilidades==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoUtilidades!=null) {
	
		this.jInternalFrameDetalleFormProcesoUtilidades.jLabelidProcesoUtilidades.setEnabled(this.procesoutilidadesConstantesFunciones.activaridProcesoUtilidades);
		this.jInternalFrameDetalleFormProcesoUtilidades.jComboBoxid_anioProcesoUtilidades.setEnabled(this.procesoutilidadesConstantesFunciones.activarid_anioProcesoUtilidades);
		this.jInternalFrameDetalleFormProcesoUtilidades.jTextFieldvalorProcesoUtilidades.setEnabled(this.procesoutilidadesConstantesFunciones.activarvalorProcesoUtilidades);
		}
	}
	
		
}