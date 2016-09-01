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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.cartera.util.CobrarAnalisisCarterasConstantesFunciones;
import com.bydan.erp.cartera.util.report.CobrarAnalisisCarterasParameterReturnGeneral;
//import com.bydan.erp.cartera.util.report.CobrarAnalisisCarterasParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.report.CobrarAnalisisCarterasBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.cartera.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.cartera.util.*;

import com.bydan.erp.cartera.util.report.*;
import com.bydan.erp.cartera.business.logic.report.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.business.entity.report.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;

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
public class CobrarAnalisisCarterasBeanSwingJInternalFrame extends CobrarAnalisisCarterasJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CobrarAnalisisCarterasBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CobrarAnalisisCarteras> cobraranalisiscarterasValidator = new ClassValidator<CobrarAnalisisCarteras>(CobrarAnalisisCarteras.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CobrarAnalisisCarteras cobraranalisiscarteras;	
	public CobrarAnalisisCarteras cobraranalisiscarterasAux;
	public CobrarAnalisisCarteras cobraranalisiscarterasAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CobrarAnalisisCarteras cobraranalisiscarterasTotales;
	public Long idCobrarAnalisisCarterasActual;
	public Long iIdNuevoCobrarAnalisisCarteras=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	
	
	
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
	
	public Boolean isPermisoTodoCobrarAnalisisCarteras;
	public Boolean isPermisoNuevoCobrarAnalisisCarteras;
	public Boolean isPermisoActualizarCobrarAnalisisCarteras;
	public Boolean isPermisoActualizarOriginalCobrarAnalisisCarteras;
	public Boolean isPermisoEliminarCobrarAnalisisCarteras;
	public Boolean isPermisoGuardarCambiosCobrarAnalisisCarteras;
	public Boolean isPermisoConsultaCobrarAnalisisCarteras;
	public Boolean isPermisoBusquedaCobrarAnalisisCarteras;
	public Boolean isPermisoReporteCobrarAnalisisCarteras;
	public Boolean isPermisoPaginacionMedioCobrarAnalisisCarteras;
	public Boolean isPermisoPaginacionAltoCobrarAnalisisCarteras;
	public Boolean isPermisoPaginacionTodoCobrarAnalisisCarteras;
	public Boolean isPermisoCopiarCobrarAnalisisCarteras;
	public Boolean isPermisoVerFormCobrarAnalisisCarteras;
	public Boolean isPermisoDuplicarCobrarAnalisisCarteras;
	public Boolean isPermisoOrdenCobrarAnalisisCarteras;
	
	
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
	
	public CobrarAnalisisCarterasParameterReturnGeneral cobraranalisiscarterasReturnGeneral;
	public CobrarAnalisisCarterasParameterReturnGeneral cobraranalisiscarterasParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCobrarAnalisisCarteras=false;
	public Boolean esParaAccionDesdeFormularioCobrarAnalisisCarteras=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CobrarAnalisisCarterasSessionBeanAdditional cobraranalisiscarterasSessionBeanAdditional=null;
	
	public CobrarAnalisisCarterasSessionBeanAdditional getCobrarAnalisisCarterasSessionBeanAdditional() {
		return this.cobraranalisiscarterasSessionBeanAdditional;
	}
	
	public void setCobrarAnalisisCarterasSessionBeanAdditional(CobrarAnalisisCarterasSessionBeanAdditional cobraranalisiscarterasSessionBeanAdditional) {
		try {
			this.cobraranalisiscarterasSessionBeanAdditional=cobraranalisiscarterasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional cobraranalisiscarterasBeanSwingJInternalFrameAdditional=null;
	//public class CobrarAnalisisCarterasBeanSwingJInternalFrame
	
	public CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional getCobrarAnalisisCarterasBeanSwingJInternalFrameAdditional() {
		return this.cobraranalisiscarterasBeanSwingJInternalFrameAdditional;
	}
	
	public void setCobrarAnalisisCarterasBeanSwingJInternalFrameAdditional(CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional cobraranalisiscarterasBeanSwingJInternalFrameAdditional) {
		try {
			this.cobraranalisiscarterasBeanSwingJInternalFrameAdditional=cobraranalisiscarterasBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CobrarAnalisisCarterasLogic cobraranalisiscarterasLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CobrarAnalisisCarteras cobraranalisiscarterasBean;
	public CobrarAnalisisCarterasConstantesFunciones cobraranalisiscarterasConstantesFunciones;
	//public CobrarAnalisisCarterasParameterReturnGeneral cobraranalisiscarterasReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<CobrarAnalisisCarteras> cobraranalisiscarterass;	
	//public List<CobrarAnalisisCarteras> cobraranalisiscarterassEliminados;
	//public List<CobrarAnalisisCarteras> cobraranalisiscarterassAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCobrarAnalisisCarteras=false;
	public Boolean isVisibilidadCeldaDuplicarCobrarAnalisisCarteras=true;
	public Boolean isVisibilidadCeldaCopiarCobrarAnalisisCarteras=true;
	public Boolean isVisibilidadCeldaVerFormCobrarAnalisisCarteras=true;
	public Boolean isVisibilidadCeldaOrdenCobrarAnalisisCarteras=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCobrarAnalisisCarteras=false;
	public Boolean isVisibilidadCeldaModificarCobrarAnalisisCarteras=false;
	public Boolean isVisibilidadCeldaActualizarCobrarAnalisisCarteras=false;
	public Boolean isVisibilidadCeldaEliminarCobrarAnalisisCarteras=false;
	public Boolean isVisibilidadCeldaCancelarCobrarAnalisisCarteras=false;
	public Boolean isVisibilidadCeldaGuardarCobrarAnalisisCarteras=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCobrarAnalisisCarteras=false;	
	
	
	public Boolean isVisibilidadBusquedaCobrarAnalisisCarteras=false;
	
	public Long getiIdNuevoCobrarAnalisisCarteras() {
		return this.iIdNuevoCobrarAnalisisCarteras;
	}

	public void setiIdNuevoCobrarAnalisisCarteras(Long iIdNuevoCobrarAnalisisCarteras) {
		this.iIdNuevoCobrarAnalisisCarteras = iIdNuevoCobrarAnalisisCarteras;
	}
	
	public Long getidCobrarAnalisisCarterasActual() {
		return this.idCobrarAnalisisCarterasActual;
	}

	public void setidCobrarAnalisisCarterasActual(Long idCobrarAnalisisCarterasActual) {
		this.idCobrarAnalisisCarterasActual = idCobrarAnalisisCarterasActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CobrarAnalisisCarteras getcobraranalisiscarteras() {
		return this.cobraranalisiscarteras;
	}

	public void setcobraranalisiscarteras(CobrarAnalisisCarteras cobraranalisiscarteras) {
		this.cobraranalisiscarteras = cobraranalisiscarteras;
	}
	
	public CobrarAnalisisCarteras getcobraranalisiscarterasAux() {
		return this.cobraranalisiscarterasAux;
	}

	public void setcobraranalisiscarterasAux(CobrarAnalisisCarteras cobraranalisiscarterasAux) {
		this.cobraranalisiscarterasAux = cobraranalisiscarterasAux;
	}				
	
	public CobrarAnalisisCarteras getcobraranalisiscarterasAnterior() {
		return this.cobraranalisiscarterasAnterior;
	}

	public void setcobraranalisiscarterasAnterior(CobrarAnalisisCarteras cobraranalisiscarterasAnterior) {
		this.cobraranalisiscarterasAnterior = cobraranalisiscarterasAnterior;
	}	
	
	public CobrarAnalisisCarteras getcobraranalisiscarterasTotales() {
		return this.cobraranalisiscarterasTotales;
	}

	public void setcobraranalisiscarterasTotales(CobrarAnalisisCarteras cobraranalisiscarterasTotales) {
		this.cobraranalisiscarterasTotales = cobraranalisiscarterasTotales;
	}	
	
	public CobrarAnalisisCarteras getcobraranalisiscarterasBean() {
		return this.cobraranalisiscarterasBean;
	}

	public void setcobraranalisiscarterasBean(CobrarAnalisisCarteras cobraranalisiscarterasBean) {
		this.cobraranalisiscarterasBean = cobraranalisiscarterasBean;
	}	
	
	public CobrarAnalisisCarterasParameterReturnGeneral getcobraranalisiscarterasReturnGeneral() {
		return this.cobraranalisiscarterasReturnGeneral;
	}

	public void setcobraranalisiscarterasReturnGeneral(CobrarAnalisisCarterasParameterReturnGeneral cobraranalisiscarterasReturnGeneral) {
		this.cobraranalisiscarterasReturnGeneral = cobraranalisiscarterasReturnGeneral;
	}	
	
	
	public Long idBusquedaCobrarAnalisisCarteras=0L;

	public Long getidBusquedaCobrarAnalisisCarteras() {
		return this.idBusquedaCobrarAnalisisCarteras;
	}

	public void setidBusquedaCobrarAnalisisCarteras(Long idBusquedaCobrarAnalisisCarteras) {
		this.idBusquedaCobrarAnalisisCarteras = idBusquedaCobrarAnalisisCarteras;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CobrarAnalisisCarterasLogic getCobrarAnalisisCarterasLogic()	{		
		return cobraranalisiscarterasLogic;
	}

	public void setCobrarAnalisisCarterasLogic(CobrarAnalisisCarterasLogic cobraranalisiscarterasLogic) {
		this.cobraranalisiscarterasLogic = cobraranalisiscarterasLogic;
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
	
	public Boolean getIsEsNuevoCobrarAnalisisCarteras() {
		return isEsNuevoCobrarAnalisisCarteras;
	}

	public void setIsEsNuevoCobrarAnalisisCarteras(Boolean isEsNuevoCobrarAnalisisCarteras) {
		this.isEsNuevoCobrarAnalisisCarteras = isEsNuevoCobrarAnalisisCarteras;
	}

	public Boolean getEsParaAccionDesdeFormularioCobrarAnalisisCarteras() {
		return esParaAccionDesdeFormularioCobrarAnalisisCarteras;
	}
	
	public void setEsParaAccionDesdeFormularioCobrarAnalisisCarteras(Boolean esParaAccionDesdeFormularioCobrarAnalisisCarteras) {
		this.esParaAccionDesdeFormularioCobrarAnalisisCarteras = esParaAccionDesdeFormularioCobrarAnalisisCarteras;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesCobrarAnalisisCarteras() throws Exception {
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
		
	public CobrarAnalisisCarterasParameterReturnGeneral getCobrarAnalisisCarterasParameterGeneral() {
		return this.cobraranalisiscarterasParameterGeneral;
	}
	
	public void setCobrarAnalisisCarterasParameterGeneral(CobrarAnalisisCarterasParameterReturnGeneral cobraranalisiscarterasParameterGeneral) {
		this.cobraranalisiscarterasParameterGeneral = cobraranalisiscarterasParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCobrarAnalisisCarteras() {
		return isPermisoTodoCobrarAnalisisCarteras;
	}

	public void setIsPermisoTodoCobrarAnalisisCarteras(Boolean isPermisoTodoCobrarAnalisisCarteras) {
		this.isPermisoTodoCobrarAnalisisCarteras = isPermisoTodoCobrarAnalisisCarteras;
	}

	public Boolean getIsPermisoNuevoCobrarAnalisisCarteras() {
		return isPermisoNuevoCobrarAnalisisCarteras;
	}

	public void setIsPermisoNuevoCobrarAnalisisCarteras(Boolean isPermisoNuevoCobrarAnalisisCarteras) {
		this.isPermisoNuevoCobrarAnalisisCarteras = isPermisoNuevoCobrarAnalisisCarteras;
	}

	public Boolean getIsPermisoActualizarCobrarAnalisisCarteras() {
		return isPermisoActualizarCobrarAnalisisCarteras;
	}

	public void setIsPermisoActualizarCobrarAnalisisCarteras(Boolean isPermisoActualizarCobrarAnalisisCarteras) {
		this.isPermisoActualizarCobrarAnalisisCarteras = isPermisoActualizarCobrarAnalisisCarteras;
	}

	public Boolean getIsPermisoEliminarCobrarAnalisisCarteras() {
		return isPermisoEliminarCobrarAnalisisCarteras;
	}

	public void setIsPermisoEliminarCobrarAnalisisCarteras(Boolean isPermisoEliminarCobrarAnalisisCarteras) {
		this.isPermisoEliminarCobrarAnalisisCarteras = isPermisoEliminarCobrarAnalisisCarteras;
	}

	public Boolean getIsPermisoGuardarCambiosCobrarAnalisisCarteras() {
		return isPermisoGuardarCambiosCobrarAnalisisCarteras;
	}

	public void setIsPermisoGuardarCambiosCobrarAnalisisCarteras(Boolean isPermisoGuardarCambiosCobrarAnalisisCarteras) {
		this.isPermisoGuardarCambiosCobrarAnalisisCarteras = isPermisoGuardarCambiosCobrarAnalisisCarteras;
	}
	
	public Boolean getIsPermisoConsultaCobrarAnalisisCarteras() {
		return isPermisoConsultaCobrarAnalisisCarteras;
	}

	public void setIsPermisoConsultaCobrarAnalisisCarteras(Boolean isPermisoConsultaCobrarAnalisisCarteras) {
		this.isPermisoConsultaCobrarAnalisisCarteras = isPermisoConsultaCobrarAnalisisCarteras;
	}

	public Boolean getIsPermisoBusquedaCobrarAnalisisCarteras() {
		return isPermisoBusquedaCobrarAnalisisCarteras;
	}

	public void setIsPermisoBusquedaCobrarAnalisisCarteras(Boolean isPermisoBusquedaCobrarAnalisisCarteras) {
		this.isPermisoBusquedaCobrarAnalisisCarteras = isPermisoBusquedaCobrarAnalisisCarteras;
	}

	public Boolean getIsPermisoReporteCobrarAnalisisCarteras() {
		return isPermisoReporteCobrarAnalisisCarteras;
	}

	public void setIsPermisoReporteCobrarAnalisisCarteras(Boolean isPermisoReporteCobrarAnalisisCarteras) {
		this.isPermisoReporteCobrarAnalisisCarteras = isPermisoReporteCobrarAnalisisCarteras;
	}
	
	public Boolean getIsPermisoPaginacionMedioCobrarAnalisisCarteras() {
		return isPermisoPaginacionMedioCobrarAnalisisCarteras;
	}

	public void setIsPermisoPaginacionMedioCobrarAnalisisCarteras(Boolean isPermisoPaginacionMedioCobrarAnalisisCarteras) {
		this.isPermisoPaginacionMedioCobrarAnalisisCarteras = isPermisoPaginacionMedioCobrarAnalisisCarteras;
	}
	
	public Boolean getIsPermisoPaginacionTodoCobrarAnalisisCarteras() {
		return isPermisoPaginacionTodoCobrarAnalisisCarteras;
	}

	public void setIsPermisoPaginacionTodoCobrarAnalisisCarteras(Boolean isPermisoPaginacionTodoCobrarAnalisisCarteras) {
		this.isPermisoPaginacionTodoCobrarAnalisisCarteras = isPermisoPaginacionTodoCobrarAnalisisCarteras;
	}
	
	public Boolean getIsPermisoPaginacionAltoCobrarAnalisisCarteras() {
		return isPermisoPaginacionAltoCobrarAnalisisCarteras;
	}

	public void setIsPermisoPaginacionAltoCobrarAnalisisCarteras(Boolean isPermisoPaginacionAltoCobrarAnalisisCarteras) {
		this.isPermisoPaginacionAltoCobrarAnalisisCarteras = isPermisoPaginacionAltoCobrarAnalisisCarteras;
	}
	
	public Boolean getIsPermisoCopiarCobrarAnalisisCarteras() {
		return isPermisoCopiarCobrarAnalisisCarteras;
	}

	public void setIsPermisoCopiarCobrarAnalisisCarteras(Boolean isPermisoCopiarCobrarAnalisisCarteras) {
		this.isPermisoCopiarCobrarAnalisisCarteras = isPermisoCopiarCobrarAnalisisCarteras;
	}
	
	public Boolean getIsPermisoVerFormCobrarAnalisisCarteras() {
		return isPermisoVerFormCobrarAnalisisCarteras;
	}

	public void setIsPermisoVerFormCobrarAnalisisCarteras(Boolean isPermisoVerFormCobrarAnalisisCarteras) {
		this.isPermisoVerFormCobrarAnalisisCarteras = isPermisoVerFormCobrarAnalisisCarteras;
	}
	
	public Boolean getIsPermisoDuplicarCobrarAnalisisCarteras() {
		return isPermisoDuplicarCobrarAnalisisCarteras;
	}

	public void setIsPermisoDuplicarCobrarAnalisisCarteras(Boolean isPermisoDuplicarCobrarAnalisisCarteras) {
		this.isPermisoDuplicarCobrarAnalisisCarteras = isPermisoDuplicarCobrarAnalisisCarteras;
	}
	
	public Boolean getIsPermisoOrdenCobrarAnalisisCarteras() {
		return isPermisoOrdenCobrarAnalisisCarteras;
	}

	public void setIsPermisoOrdenCobrarAnalisisCarteras(Boolean isPermisoOrdenCobrarAnalisisCarteras) {
		this.isPermisoOrdenCobrarAnalisisCarteras = isPermisoOrdenCobrarAnalisisCarteras;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCobrarAnalisisCarteras() {
		return isVisibilidadCeldaNuevoCobrarAnalisisCarteras;
	}

	public void setIsVisibilidadCeldaNuevoCobrarAnalisisCarteras(Boolean isVisibilidadCeldaNuevoCobrarAnalisisCarteras) {
		this.isVisibilidadCeldaNuevoCobrarAnalisisCarteras = isVisibilidadCeldaNuevoCobrarAnalisisCarteras;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCobrarAnalisisCarteras() {
		return isVisibilidadCeldaDuplicarCobrarAnalisisCarteras;
	}

	public void setIsVisibilidadCeldaDuplicarCobrarAnalisisCarteras(Boolean isVisibilidadCeldaDuplicarCobrarAnalisisCarteras) {
		this.isVisibilidadCeldaDuplicarCobrarAnalisisCarteras = isVisibilidadCeldaDuplicarCobrarAnalisisCarteras;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCobrarAnalisisCarteras() {
		return isVisibilidadCeldaCopiarCobrarAnalisisCarteras;
	}

	public void setIsVisibilidadCeldaCopiarCobrarAnalisisCarteras(Boolean isVisibilidadCeldaCopiarCobrarAnalisisCarteras) {
		this.isVisibilidadCeldaCopiarCobrarAnalisisCarteras = isVisibilidadCeldaCopiarCobrarAnalisisCarteras;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCobrarAnalisisCarteras() {
		return isVisibilidadCeldaVerFormCobrarAnalisisCarteras;
	}

	public void setIsVisibilidadCeldaVerFormCobrarAnalisisCarteras(Boolean isVisibilidadCeldaVerFormCobrarAnalisisCarteras) {
		this.isVisibilidadCeldaVerFormCobrarAnalisisCarteras = isVisibilidadCeldaVerFormCobrarAnalisisCarteras;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCobrarAnalisisCarteras() {
		return isVisibilidadCeldaOrdenCobrarAnalisisCarteras;
	}

	public void setIsVisibilidadCeldaOrdenCobrarAnalisisCarteras(Boolean isVisibilidadCeldaOrdenCobrarAnalisisCarteras) {
		this.isVisibilidadCeldaOrdenCobrarAnalisisCarteras = isVisibilidadCeldaOrdenCobrarAnalisisCarteras;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCobrarAnalisisCarteras() {
		return isVisibilidadCeldaNuevoRelacionesCobrarAnalisisCarteras;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCobrarAnalisisCarteras(Boolean isVisibilidadCeldaNuevoRelacionesCobrarAnalisisCarteras) {
		this.isVisibilidadCeldaNuevoRelacionesCobrarAnalisisCarteras = isVisibilidadCeldaNuevoRelacionesCobrarAnalisisCarteras;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCobrarAnalisisCarteras() {
		return isVisibilidadCeldaModificarCobrarAnalisisCarteras;
	}

	public void setIsVisibilidadCeldaModificarCobrarAnalisisCarteras(Boolean isVisibilidadCeldaModificarCobrarAnalisisCarteras) {
		this.isVisibilidadCeldaModificarCobrarAnalisisCarteras = isVisibilidadCeldaModificarCobrarAnalisisCarteras;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCobrarAnalisisCarteras() {
		return isVisibilidadCeldaActualizarCobrarAnalisisCarteras;
	}

	public void setIsVisibilidadCeldaActualizarCobrarAnalisisCarteras(Boolean isVisibilidadCeldaActualizarCobrarAnalisisCarteras) {
		this.isVisibilidadCeldaActualizarCobrarAnalisisCarteras = isVisibilidadCeldaActualizarCobrarAnalisisCarteras;
	}

	public Boolean getIsVisibilidadCeldaEliminarCobrarAnalisisCarteras() {
		return isVisibilidadCeldaEliminarCobrarAnalisisCarteras;
	}

	public void setIsVisibilidadCeldaEliminarCobrarAnalisisCarteras(Boolean isVisibilidadCeldaEliminarCobrarAnalisisCarteras) {
		this.isVisibilidadCeldaEliminarCobrarAnalisisCarteras = isVisibilidadCeldaEliminarCobrarAnalisisCarteras;
	}

	public Boolean getIsVisibilidadCeldaCancelarCobrarAnalisisCarteras() {
		return isVisibilidadCeldaCancelarCobrarAnalisisCarteras;
	}

	public void setIsVisibilidadCeldaCancelarCobrarAnalisisCarteras(Boolean isVisibilidadCeldaCancelarCobrarAnalisisCarteras) {
		this.isVisibilidadCeldaCancelarCobrarAnalisisCarteras = isVisibilidadCeldaCancelarCobrarAnalisisCarteras;
	}

	public Boolean getIsVisibilidadCeldaGuardarCobrarAnalisisCarteras() {
		return isVisibilidadCeldaGuardarCobrarAnalisisCarteras;
	}

	public void setIsVisibilidadCeldaGuardarCobrarAnalisisCarteras(Boolean isVisibilidadCeldaGuardarCobrarAnalisisCarteras) {
		this.isVisibilidadCeldaGuardarCobrarAnalisisCarteras = isVisibilidadCeldaGuardarCobrarAnalisisCarteras;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCobrarAnalisisCarteras() {
		return isVisibilidadCeldaGuardarCambiosCobrarAnalisisCarteras;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCobrarAnalisisCarteras(Boolean isVisibilidadCeldaGuardarCambiosCobrarAnalisisCarteras) {
		this.isVisibilidadCeldaGuardarCambiosCobrarAnalisisCarteras = isVisibilidadCeldaGuardarCambiosCobrarAnalisisCarteras;
	}
		
	public CobrarAnalisisCarterasSessionBean getcobraranalisiscarterasSessionBean() {
		return this.cobraranalisiscarterasSessionBean;
	}
	
	public void setcobraranalisiscarterasSessionBean(CobrarAnalisisCarterasSessionBean cobraranalisiscarterasSessionBean) {
		this.cobraranalisiscarterasSessionBean=cobraranalisiscarterasSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaCobrarAnalisisCarteras() {
		return this.isVisibilidadBusquedaCobrarAnalisisCarteras;
	}

	public void setisVisibilidadBusquedaCobrarAnalisisCarteras(Boolean isVisibilidadBusquedaCobrarAnalisisCarteras) {
		this.isVisibilidadBusquedaCobrarAnalisisCarteras=isVisibilidadBusquedaCobrarAnalisisCarteras;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCobrarAnalisisCarteras(CobrarAnalisisCarteras cobraranalisiscarteras)throws Exception {
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
	
	public void bugActualizarReferenciaActual(CobrarAnalisisCarteras cobraranalisiscarteras,CobrarAnalisisCarteras cobraranalisiscarterasAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCobrarAnalisisCarteras(cobraranalisiscarteras);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cobraranalisiscarterasAux.setId(cobraranalisiscarteras.getId());
		cobraranalisiscarterasAux.setVersionRow(cobraranalisiscarteras.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(CobrarAnalisisCarteras cobraranalisiscarterasLocal) throws Exception {
		
		if(this.cobraranalisiscarterasSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CobrarAnalisisCarteras cobraranalisiscarterasLocal) throws Exception {	
		if(this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarCobrarAnalisisCarterasActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCobrarAnalisisCarteras.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobraranalisiscarteras =(CobrarAnalisisCarteras) this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cobraranalisiscarteras =(CobrarAnalisisCarteras) this.cobraranalisiscarterass.toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cobraranalisiscarterasValidator.getInvalidValues(this.cobraranalisiscarteras);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CobrarAnalisisCarteras cobraranalisiscarteras,List<CobrarAnalisisCarteras> cobraranalisiscarterass) throws Exception {
	}		
	
	public void actualizarSelectedLista(CobrarAnalisisCarteras cobraranalisiscarteras,List<CobrarAnalisisCarteras> cobraranalisiscarterass) throws Exception {
		try	{			
			CobrarAnalisisCarterasConstantesFunciones.actualizarSelectedLista(cobraranalisiscarteras,cobraranalisiscarterass);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CobrarAnalisisCarteras> cobraranalisiscarterassLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cobraranalisiscarterassLocal=this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cobraranalisiscarterassLocal=this.cobraranalisiscarterass;
			}
			//ARCHITECTURE
		
			for(CobrarAnalisisCarteras cobraranalisiscarterasLocal:cobraranalisiscarterassLocal) {
				if(this.permiteMantenimiento(cobraranalisiscarterasLocal) && cobraranalisiscarterasLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CobrarAnalisisCarterasConstantesFunciones.getCobrarAnalisisCarterasLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CobrarAnalisisCarterasConstantesFunciones.NOMBRETIPORADIOVENCI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jLabelnombre_tipo_radio_venciCobrarAnalisisCarteras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarAnalisisCarterasConstantesFunciones.DIADESDE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jLabeldia_desdeCobrarAnalisisCarteras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarAnalisisCarterasConstantesFunciones.DIAHASTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jLabeldia_hastaCobrarAnalisisCarteras,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jLabelnombre_tipo_radio_venciCobrarAnalisisCarteras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jLabeldia_desdeCobrarAnalisisCarteras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jLabeldia_hastaCobrarAnalisisCarteras,"");
		
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
		this.iIdNuevoCobrarAnalisisCarteras--;	
		
		
		this.cobraranalisiscarterasAux=new CobrarAnalisisCarteras();
		
		this.cobraranalisiscarterasAux.setId(this.iIdNuevoCobrarAnalisisCarteras);
		this.cobraranalisiscarterasAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().add(this.cobraranalisiscarterasAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cobraranalisiscarterass.add(this.cobraranalisiscarterasAux);
		}
		//ARCHITECTURE
		
		this.cobraranalisiscarteras=this.cobraranalisiscarterasAux;
		
		if(CobrarAnalisisCarterasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCobrarAnalisisCarteras(this.cobraranalisiscarteras);
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarAnalisisCarteras(this.cobraranalisiscarteras);
		}
				
		//this.setDefaultControlesCobrarAnalisisCarteras();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCobrarAnalisisCarteras();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCobrarAnalisisCarteras();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarAnalisisCarteras();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarAnalisisCarteras(this.cobraranalisiscarterasBean,this.cobraranalisiscarteras,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarAnalisisCarteras(this.cobraranalisiscarteras);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCobrarAnalisisCarteras(this.cobraranalisiscarterasReturnGeneral,this.cobraranalisiscarterasBean,false);
		
		if(this.cobraranalisiscarterasReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarAnalisisCarteras(this.cobraranalisiscarterasReturnGeneral.getCobrarAnalisisCarteras());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCobrarAnalisisCarteras(this.cobraranalisiscarterasReturnGeneral.getCobrarAnalisisCarteras());
		}
		
		if(this.cobraranalisiscarterasReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCobrarAnalisisCarteras(this.cobraranalisiscarterasReturnGeneral.getCobrarAnalisisCarteras(),classes);//this.cobraranalisiscarterasBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCobrarAnalisisCarteras(this.cobraranalisiscarteras,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCobrarAnalisisCarteras();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCobrarAnalisisCarteras();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.RecargarFormCobrarAnalisisCarteras(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCobrarAnalisisCarteras(false);
						
			if(cobraranalisiscarterasSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CobrarAnalisisCarterasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarAnalisisCarteras();
			}
			
			this.actualizarVisualTableDatosCobrarAnalisisCarteras();
			
			this.jTableDatosCobrarAnalisisCarteras.setRowSelectionInterval(this.getIndiceNuevoCobrarAnalisisCarteras(), this.getIndiceNuevoCobrarAnalisisCarteras());
			
			this.seleccionarFilaTablaCobrarAnalisisCarterasActual();
						
			this.actualizarEstadoCeldasBotonesCobrarAnalisisCarteras("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCobrarAnalisisCarteras(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTextFieldid_empresaCobrarAnalisisCarteras.setEnabled(isHabilitar && this.cobraranalisiscarterasConstantesFunciones.activarid_empresaCobrarAnalisisCarteras);
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTextAreanombre_tipo_radio_venciCobrarAnalisisCarteras.setEnabled(isHabilitar && this.cobraranalisiscarterasConstantesFunciones.activarnombre_tipo_radio_venciCobrarAnalisisCarteras);
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTextFielddia_desdeCobrarAnalisisCarteras.setEnabled(isHabilitar && this.cobraranalisiscarterasConstantesFunciones.activardia_desdeCobrarAnalisisCarteras);
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTextFielddia_hastaCobrarAnalisisCarteras.setEnabled(isHabilitar && this.cobraranalisiscarterasConstantesFunciones.activardia_hastaCobrarAnalisisCarteras);	
		
	};
	
	public void setDefaultControlesCobrarAnalisisCarteras() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCobrarAnalisisCarteras(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cobraranalisiscarterasSessionBean.setConGuardarRelaciones(true);			
			this.cobraranalisiscarterasSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTabbedPaneRelacionesCobrarAnalisisCarteras.setVisible(true);
			
					
		} else {
			//this.cobraranalisiscarterasSessionBean.setConGuardarRelaciones(false);			
			this.cobraranalisiscarterasSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTabbedPaneRelacionesCobrarAnalisisCarteras.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCobrarAnalisisCarteras() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarAnalisisCarteras cobraranalisiscarterasAux:this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass()) {
				if(cobraranalisiscarterasAux.getId().equals(this.iIdNuevoCobrarAnalisisCarteras)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarAnalisisCarteras cobraranalisiscarterasAux:this.cobraranalisiscarterass) {
				if(cobraranalisiscarterasAux.getId().equals(this.iIdNuevoCobrarAnalisisCarteras)) {
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
	
	public int getIndiceActualCobrarAnalisisCarteras(CobrarAnalisisCarteras cobraranalisiscarteras,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarAnalisisCarteras cobraranalisiscarterasAux:this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass()) {
				if(cobraranalisiscarterasAux.getId().equals(cobraranalisiscarteras.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarAnalisisCarteras cobraranalisiscarterasAux:this.cobraranalisiscarterass) {
				if(cobraranalisiscarterasAux.getId().equals(cobraranalisiscarteras.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCobrarAnalisisCarteras(CobrarAnalisisCarteras cobraranalisiscarterasOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarAnalisisCarteras cobraranalisiscarterasAux:this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass()) {
				if(cobraranalisiscarterasAux.getCobrarAnalisisCarterasOriginal().getId().equals(cobraranalisiscarterasOriginal.getId())) {
					existe=true;
					cobraranalisiscarterasOriginal.setId(cobraranalisiscarterasAux.getId());
					cobraranalisiscarterasOriginal.setVersionRow(cobraranalisiscarterasAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarAnalisisCarteras cobraranalisiscarterasAux:this.cobraranalisiscarterass) {
				if(cobraranalisiscarterasAux.getCobrarAnalisisCarterasOriginal().getId().equals(cobraranalisiscarterasOriginal.getId())) {
					existe=true;
					cobraranalisiscarterasOriginal.setId(cobraranalisiscarterasAux.getId());
					cobraranalisiscarterasOriginal.setVersionRow(cobraranalisiscarterasAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCobrarAnalisisCarteras(Boolean esParaCancelar) throws Exception {
		cobraranalisiscarterassAux=new ArrayList<CobrarAnalisisCarteras>();
		cobraranalisiscarterasAux=new CobrarAnalisisCarteras();
		
		if(!this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarAnalisisCarteras cobraranalisiscarterasAux:this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass()) {
					if(cobraranalisiscarterasAux.getId()<0) {
						cobraranalisiscarterassAux.add(cobraranalisiscarterasAux);
					}		
				}
				this.iIdNuevoCobrarAnalisisCarteras=0L;
				this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().removeAll(cobraranalisiscarterassAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarAnalisisCarteras cobraranalisiscarterasAux:this.cobraranalisiscarterass) {
					if(cobraranalisiscarterasAux.getId()<0) {
						cobraranalisiscarterassAux.add(cobraranalisiscarterasAux);
					}		
				}
				this.iIdNuevoCobrarAnalisisCarteras=0L;
				this.cobraranalisiscarterass.removeAll(cobraranalisiscarterassAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCobrarAnalisisCarteras 
					&& this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().size()>0
					) {
					cobraranalisiscarterasAux=this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().get(this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().size() - 1);
				
					if(cobraranalisiscarterasAux.getId()<0) {
						this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().remove(cobraranalisiscarterasAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCobrarAnalisisCarteras && this.cobraranalisiscarterass.size()>0) {
					cobraranalisiscarterasAux=this.cobraranalisiscarterass.get(this.cobraranalisiscarterass.size() - 1);
				
					if(cobraranalisiscarterasAux.getId()<0) {
						this.cobraranalisiscarterass.remove(cobraranalisiscarterasAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCobrarAnalisisCarteras(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cobraranalisiscarteras.getId()<0) {
				this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().remove(this.cobraranalisiscarteras);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cobraranalisiscarteras.getId()<0) {
				this.cobraranalisiscarterass.remove(this.cobraranalisiscarteras);
			}
		}			
	}
	
	public void setEstadosInicialesCobrarAnalisisCarteras(List<CobrarAnalisisCarteras> cobraranalisiscarterassAux) throws Exception {
		CobrarAnalisisCarterasConstantesFunciones.setEstadosInicialesCobrarAnalisisCarteras(cobraranalisiscarterassAux);
	}
	
	public void setEstadosInicialesCobrarAnalisisCarteras(CobrarAnalisisCarteras cobraranalisiscarterasAux) throws Exception {
		CobrarAnalisisCarterasConstantesFunciones.setEstadosInicialesCobrarAnalisisCarteras(cobraranalisiscarterasAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCobrarAnalisisCarterasActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCobrarAnalisisCarteras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCobrarAnalisisCarterasActual()) {
				if(!this.isEsNuevoCobrarAnalisisCarteras) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCobrarAnalisisCarteras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCobrarAnalisisCarteras=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCobrarAnalisisCarterasActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cobrar Analisis Carteras ?", "MANTENIMIENTO DE Cobrar Analisis Carteras", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCobrarAnalisisCarteras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CobrarAnalisisCarteras cobraranalisiscarteras) throws Exception {
		CobrarAnalisisCarterasConstantesFunciones.seleccionarAsignar(this.cobraranalisiscarteras,cobraranalisiscarteras);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCobrarAnalisisCarteras=this.isPermisoActualizarOriginalCobrarAnalisisCarteras;
			
			
			this.seleccionarAsignar(cobraranalisiscarteras);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesCobrarAnalisisCarteras("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cobraranalisiscarterasSessionBean.setsFuncionBusquedaRapida(this.cobraranalisiscarterasSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCobrarAnalisisCarteras) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCobrarAnalisisCarteras(esParaCancelar);				
				this.cancelarNuevoCobrarAnalisisCarteras(esParaCancelar);								
			}
			
			this.cobraranalisiscarteras=new CobrarAnalisisCarteras();
			
			this.inicializarCobrarAnalisisCarteras();
			
			this.actualizarEstadoCeldasBotonesCobrarAnalisisCarteras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCobrarAnalisisCarteras() throws Exception {
		try {
			CobrarAnalisisCarterasConstantesFunciones.inicializarCobrarAnalisisCarteras(this.cobraranalisiscarteras);
			
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
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCobrarAnalisisCarterass(String sAccionBusqueda,List<CobrarAnalisisCarteras> cobraranalisiscarterassParaReportes) throws Exception {
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
					sPathReporteFinal="CobrarAnalisisCarteras"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CobrarAnalisisCarterasMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CobrarAnalisisCarterasMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CobrarAnalisisCarteras"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cobrar Analisis Carterases");		
		parameters.put("busquedapor", CobrarAnalisisCarterasConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCobrarAnalisisCarteras=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CobrarAnalisisCarterasConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CobrarAnalisisCarterasConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCobrarAnalisisCarteras=new JRBeanArrayDataSource(CobrarAnalisisCarterasJInternalFrame.TraerCobrarAnalisisCarterasBeans(cobraranalisiscarterassParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCobrarAnalisisCarteras);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CobrarAnalisisCarterasConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CobrarAnalisisCarterasConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CobrarAnalisisCarterasBean.TraerCobrarAnalisisCarterasBeans(cobraranalisiscarterassParaReportes).toArray()));
							
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
				this.generarExcelReporteCobrarAnalisisCarterass(sAccionBusqueda,sTipoArchivoReporte,cobraranalisiscarterassParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCobrarAnalisisCarterass(sAccionBusqueda,sTipoArchivoReporte,cobraranalisiscarterassParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCobrarAnalisisCarterasActionPerformed(null);
					//this.generarExcelReporteCobrarAnalisisCarterass(sAccionBusqueda,sTipoArchivoReporte,cobraranalisiscarterassParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCobrarAnalisisCarterass(sAccionBusqueda,sTipoArchivoReporte,cobraranalisiscarterassParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCobrarAnalisisCarterass(sAccionBusqueda,sTipoArchivoReporte,cobraranalisiscarterassParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCobrarAnalisisCarterass(sAccionBusqueda,sTipoArchivoReporte,cobraranalisiscarterassParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCobrarAnalisisCarterass(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarAnalisisCarteras> cobraranalisiscarterassParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobraranalisiscarteras";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarAnalisisCarterass");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarAnalisisCarteras("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CobrarAnalisisCarteras cobraranalisiscarteras : cobraranalisiscarterassParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CobrarAnalisisCarterasConstantesFunciones.generarExcelReporteDataCobrarAnalisisCarteras("NORMAL",row,workbook,cobraranalisiscarteras,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Analisis Carteras",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCobrarAnalisisCarteras(String sTipo,Row row,Workbook workbook) {
		
		CobrarAnalisisCarterasConstantesFunciones.generarExcelReporteHeaderCobrarAnalisisCarteras(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCobrarAnalisisCarterass(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarAnalisisCarteras> cobraranalisiscarterassParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobraranalisiscarteras_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarAnalisisCarterass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CobrarAnalisisCarteras cobraranalisiscarteras : cobraranalisiscarterassParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CobrarAnalisisCarterasConstantesFunciones.getCobrarAnalisisCarterasDescripcion(cobraranalisiscarteras));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarAnalisisCarterasConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarAnalisisCarterasConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobraranalisiscarteras.getid_empresa());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarAnalisisCarterasConstantesFunciones.LABEL_NOMBRETIPORADIOVENCI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarAnalisisCarterasConstantesFunciones.LABEL_NOMBRETIPORADIOVENCI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobraranalisiscarteras.getnombre_tipo_radio_venci());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarAnalisisCarterasConstantesFunciones.LABEL_DIADESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarAnalisisCarterasConstantesFunciones.LABEL_DIADESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobraranalisiscarteras.getdia_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarAnalisisCarterasConstantesFunciones.LABEL_DIAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarAnalisisCarterasConstantesFunciones.LABEL_DIAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobraranalisiscarteras.getdia_hasta());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Analisis Carteras",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCobrarAnalisisCarterass(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarAnalisisCarteras> cobraranalisiscarterassParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CobrarAnalisisCarteras> cobraranalisiscarterassRespaldo=null;
		
		classes=CobrarAnalisisCarterasConstantesFunciones.getClassesRelationshipsOfCobrarAnalisisCarteras(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cobraranalisiscarterasLogic.setDatosCliente(this.datosCliente);
		this.cobraranalisiscarterasLogic.setDatosDeep(this.datosDeep);
		this.cobraranalisiscarterasLogic.setIsConDeep(true);
		
		cobraranalisiscarterassRespaldo=this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass();
		
		this.cobraranalisiscarterasLogic.setCobrarAnalisisCarterass(cobraranalisiscarterassParaReportes);	
		this.cobraranalisiscarterasLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cobraranalisiscarterassParaReportes=this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass();
		this.cobraranalisiscarterasLogic.setCobrarAnalisisCarterass(cobraranalisiscarterassRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobraranalisiscarteras_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarAnalisisCarterass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarAnalisisCarteras("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CobrarAnalisisCarteras cobraranalisiscarteras : cobraranalisiscarterassParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCobrarAnalisisCarteras("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CobrarAnalisisCarterasConstantesFunciones.generarExcelReporteDataCobrarAnalisisCarteras("NORMAL",row,workbook,cobraranalisiscarteras,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CobrarAnalisisCarterasConstantesFunciones.getCobrarAnalisisCarterasDescripcion(cobraranalisiscarteras));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Analisis Carteras",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCobrarAnalisisCarteras() throws Exception {		
		this.startProcessCobrarAnalisisCarteras(true);
	}
	
	public void startProcessCobrarAnalisisCarteras(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCobrarAnalisisCarteras ,this.jPanelParametrosReportesCobrarAnalisisCarteras, this.jScrollPanelDatosCobrarAnalisisCarteras,this.jPanelPaginacionCobrarAnalisisCarteras, this.jScrollPanelDatosEdicionCobrarAnalisisCarteras, this.jPanelAccionesCobrarAnalisisCarteras,this.jPanelAccionesFormularioCobrarAnalisisCarteras,this.jmenuBarCobrarAnalisisCarteras,this.jmenuBarDetalleCobrarAnalisisCarteras,this.jTtoolBarCobrarAnalisisCarteras,this.jTtoolBarDetalleCobrarAnalisisCarteras);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarAnalisisCarteras=this.jTabbedPaneBusquedasCobrarAnalisisCarteras; 
		
		final JPanel jPanelParametrosReportesCobrarAnalisisCarteras=this.jPanelParametrosReportesCobrarAnalisisCarteras;
		//final JScrollPane jScrollPanelDatosCobrarAnalisisCarteras=this.jScrollPanelDatosCobrarAnalisisCarteras;
		final JTable jTableDatosCobrarAnalisisCarteras=this.jTableDatosCobrarAnalisisCarteras;		
		final JPanel jPanelPaginacionCobrarAnalisisCarteras=this.jPanelPaginacionCobrarAnalisisCarteras;
		//final JScrollPane jScrollPanelDatosEdicionCobrarAnalisisCarteras=this.jScrollPanelDatosEdicionCobrarAnalisisCarteras;
		final JPanel jPanelAccionesCobrarAnalisisCarteras=this.jPanelAccionesCobrarAnalisisCarteras;
		
		JPanel jPanelCamposAuxiliarCobrarAnalisisCarteras=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCobrarAnalisisCarteras=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) {
			jPanelCamposAuxiliarCobrarAnalisisCarteras=this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jPanelCamposCobrarAnalisisCarteras;
			jPanelAccionesFormularioAuxiliarCobrarAnalisisCarteras=this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jPanelAccionesFormularioCobrarAnalisisCarteras;
		}
		
		final JPanel jPanelCamposCobrarAnalisisCarteras=jPanelCamposAuxiliarCobrarAnalisisCarteras;
		final JPanel jPanelAccionesFormularioCobrarAnalisisCarteras=jPanelAccionesFormularioAuxiliarCobrarAnalisisCarteras;
		
		
		final JMenuBar jmenuBarCobrarAnalisisCarteras=this.jmenuBarCobrarAnalisisCarteras;
		final JToolBar jTtoolBarCobrarAnalisisCarteras=this.jTtoolBarCobrarAnalisisCarteras;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCobrarAnalisisCarteras=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarAnalisisCarteras=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) {
			jmenuBarDetalleAuxiliarCobrarAnalisisCarteras=this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jmenuBarDetalleCobrarAnalisisCarteras;
			jTtoolBarDetalleAuxiliarCobrarAnalisisCarteras=this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTtoolBarDetalleCobrarAnalisisCarteras;
		}
		
		final JMenuBar jmenuBarDetalleCobrarAnalisisCarteras=jmenuBarDetalleAuxiliarCobrarAnalisisCarteras;
		final JToolBar jTtoolBarDetalleCobrarAnalisisCarteras=jTtoolBarDetalleAuxiliarCobrarAnalisisCarteras;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarAnalisisCarteras;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarAnalisisCarteras;
			processRunnable.jTableDatos=jTableDatosCobrarAnalisisCarteras;
			processRunnable.jPanelCampos=jPanelCamposCobrarAnalisisCarteras;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarAnalisisCarteras;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarAnalisisCarteras;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarAnalisisCarteras;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarAnalisisCarteras;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarAnalisisCarteras;
			processRunnable.jTtoolBar=jTtoolBarCobrarAnalisisCarteras;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarAnalisisCarteras;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarAnalisisCarteras ,jPanelParametrosReportesCobrarAnalisisCarteras,jTableDatosCobrarAnalisisCarteras, /*jScrollPanelDatosCobrarAnalisisCarteras,*/jPanelCamposCobrarAnalisisCarteras,jPanelPaginacionCobrarAnalisisCarteras, /*jScrollPanelDatosEdicionCobrarAnalisisCarteras,*/ jPanelAccionesCobrarAnalisisCarteras,jPanelAccionesFormularioCobrarAnalisisCarteras,jmenuBarCobrarAnalisisCarteras,jmenuBarDetalleCobrarAnalisisCarteras,jTtoolBarCobrarAnalisisCarteras,jTtoolBarDetalleCobrarAnalisisCarteras);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarAnalisisCarteras ,jPanelParametrosReportesCobrarAnalisisCarteras, jScrollPanelDatosCobrarAnalisisCarteras,jPanelPaginacionCobrarAnalisisCarteras, jScrollPanelDatosEdicionCobrarAnalisisCarteras, jPanelAccionesCobrarAnalisisCarteras,jPanelAccionesFormularioCobrarAnalisisCarteras,jmenuBarCobrarAnalisisCarteras,jmenuBarDetalleCobrarAnalisisCarteras,jTtoolBarCobrarAnalisisCarteras,jTtoolBarDetalleCobrarAnalisisCarteras);
						
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
	
	public void finishProcessCobrarAnalisisCarteras() {// throws Exception 
		this.finishProcessCobrarAnalisisCarteras(true);
	}
	
	public void finishProcessCobrarAnalisisCarteras(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCobrarAnalisisCarteras ,this.jPanelParametrosReportesCobrarAnalisisCarteras, this.jScrollPanelDatosCobrarAnalisisCarteras,this.jPanelPaginacionCobrarAnalisisCarteras, this.jScrollPanelDatosEdicionCobrarAnalisisCarteras, this.jPanelAccionesCobrarAnalisisCarteras,this.jPanelAccionesFormularioCobrarAnalisisCarteras,this.jmenuBarCobrarAnalisisCarteras,this.jmenuBarDetalleCobrarAnalisisCarteras,this.jTtoolBarCobrarAnalisisCarteras,this.jTtoolBarDetalleCobrarAnalisisCarteras);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarAnalisisCarteras=this.jTabbedPaneBusquedasCobrarAnalisisCarteras; 
		
		final JPanel jPanelParametrosReportesCobrarAnalisisCarteras=this.jPanelParametrosReportesCobrarAnalisisCarteras;
		//final JScrollPane jScrollPanelDatosCobrarAnalisisCarteras=this.jScrollPanelDatosCobrarAnalisisCarteras;
		final JTable jTableDatosCobrarAnalisisCarteras=this.jTableDatosCobrarAnalisisCarteras;		
		final JPanel jPanelPaginacionCobrarAnalisisCarteras=this.jPanelPaginacionCobrarAnalisisCarteras;
		//final JScrollPane jScrollPanelDatosEdicionCobrarAnalisisCarteras=this.jScrollPanelDatosEdicionCobrarAnalisisCarteras;
		final JPanel jPanelAccionesCobrarAnalisisCarteras=this.jPanelAccionesCobrarAnalisisCarteras;
		
		JPanel jPanelCamposAuxiliarCobrarAnalisisCarteras=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCobrarAnalisisCarteras=new JPanel();
		
		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) {
			jPanelCamposAuxiliarCobrarAnalisisCarteras=this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jPanelCamposCobrarAnalisisCarteras;
			jPanelAccionesFormularioAuxiliarCobrarAnalisisCarteras=this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jPanelAccionesFormularioCobrarAnalisisCarteras;
		}
		
		final JPanel jPanelCamposCobrarAnalisisCarteras=jPanelCamposAuxiliarCobrarAnalisisCarteras;
		final JPanel jPanelAccionesFormularioCobrarAnalisisCarteras=jPanelAccionesFormularioAuxiliarCobrarAnalisisCarteras;
		
		
		final JMenuBar jmenuBarCobrarAnalisisCarteras=this.jmenuBarCobrarAnalisisCarteras;		
		final JToolBar jTtoolBarCobrarAnalisisCarteras=this.jTtoolBarCobrarAnalisisCarteras;
				
		JMenuBar jmenuBarDetalleAuxiliarCobrarAnalisisCarteras=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarAnalisisCarteras=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) {
			jmenuBarDetalleAuxiliarCobrarAnalisisCarteras=this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jmenuBarDetalleCobrarAnalisisCarteras;
			jTtoolBarDetalleAuxiliarCobrarAnalisisCarteras=this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTtoolBarDetalleCobrarAnalisisCarteras;		
		}
		
		final JMenuBar jmenuBarDetalleCobrarAnalisisCarteras=jmenuBarDetalleAuxiliarCobrarAnalisisCarteras;
		final JToolBar jTtoolBarDetalleCobrarAnalisisCarteras=jTtoolBarDetalleAuxiliarCobrarAnalisisCarteras;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarAnalisisCarteras;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarAnalisisCarteras;
			processRunnable.jTableDatos=jTableDatosCobrarAnalisisCarteras;
			processRunnable.jPanelCampos=jPanelCamposCobrarAnalisisCarteras;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarAnalisisCarteras;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarAnalisisCarteras;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarAnalisisCarteras;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarAnalisisCarteras;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarAnalisisCarteras;
			processRunnable.jTtoolBar=jTtoolBarCobrarAnalisisCarteras;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarAnalisisCarteras;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCobrarAnalisisCarteras ,jPanelParametrosReportesCobrarAnalisisCarteras, jTableDatosCobrarAnalisisCarteras,/*jScrollPanelDatosCobrarAnalisisCarteras,*/jPanelCamposCobrarAnalisisCarteras,jPanelPaginacionCobrarAnalisisCarteras, /*jScrollPanelDatosEdicionCobrarAnalisisCarteras,*/ jPanelAccionesCobrarAnalisisCarteras,jPanelAccionesFormularioCobrarAnalisisCarteras,jmenuBarCobrarAnalisisCarteras,jmenuBarDetalleCobrarAnalisisCarteras,jTtoolBarCobrarAnalisisCarteras,jTtoolBarDetalleCobrarAnalisisCarteras));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCobrarAnalisisCarteras(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCobrarAnalisisCarteras(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCobrarAnalisisCarteras(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCobrarAnalisisCarteras(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCobrarAnalisisCarteras,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCobrarAnalisisCarteras,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCobrarAnalisisCarteras(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCobrarAnalisisCarteras,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCobrarAnalisisCarteras,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cobraranalisiscarterasConstantesFunciones.getsFinalQueryCobrarAnalisisCarteras();
		String  finalQueryPaginacionTodos=this.cobraranalisiscarterasConstantesFunciones.getsFinalQueryCobrarAnalisisCarteras();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CobrarAnalisisCarterasConstantesFunciones.getArrayColumnasGlobalesNoCobrarAnalisisCarteras(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CobrarAnalisisCarterasConstantesFunciones.getArrayColumnasGlobalesCobrarAnalisisCarteras(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CobrarAnalisisCarterasConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cobraranalisiscarterassEliminados= new ArrayList<CobrarAnalisisCarteras>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCobrarAnalisisCarteras();
		
				///*CobrarAnalisisCarterasSessionBean*/this.cobraranalisiscarterasSessionBean=new CobrarAnalisisCarterasSessionBean();
			
			if(this.cobraranalisiscarterasSessionBean==null) {
				this.cobraranalisiscarterasSessionBean=new CobrarAnalisisCarterasSessionBean();
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
					this.iNumeroPaginacion=CobrarAnalisisCarterasConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CobrarAnalisisCarterasConstantesFunciones.getClassesForeignKeysOfCobrarAnalisisCarteras(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cobraranalisiscarteras."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cobraranalisiscarterassAux= new ArrayList<CobrarAnalisisCarteras>();
			
				
			cobraranalisiscarterasLogic.setDatosCliente(this.datosCliente);
			cobraranalisiscarterasLogic.setDatosDeep(this.datosDeep);
			cobraranalisiscarterasLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaCobrarAnalisisCarteras")) {
				this.sDetalleReporte=CobrarAnalisisCarterasConstantesFunciones.getDetalleIndiceBusquedaCobrarAnalisisCarteras(idBusquedaCobrarAnalisisCarteras);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cobraranalisiscarterasLogic.getCobrarAnalisisCarterassBusquedaCobrarAnalisisCarteras(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaCobrarAnalisisCarteras);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarAnalisisCarterasConstantesFunciones.getDetalleIndiceBusquedaCobrarAnalisisCarteras(idBusquedaCobrarAnalisisCarteras);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarAnalisisCarterasConstantesFunciones.getDetalleIndiceBusquedaCobrarAnalisisCarteras(idBusquedaCobrarAnalisisCarteras);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cobraranalisiscarterasLogic.getCobrarAnalisisCarterass()==null||cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cobraranalisiscarterass==null|| cobraranalisiscarterass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cobraranalisiscarterassAux=new ArrayList<CobrarAnalisisCarteras>();
						cobraranalisiscarterassAux.addAll(cobraranalisiscarterasLogic.getCobrarAnalisisCarterass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobraranalisiscarterassAux=new ArrayList<CobrarAnalisisCarteras>();
							cobraranalisiscarterassAux.addAll(cobraranalisiscarterass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cobraranalisiscarterasLogic.getCobrarAnalisisCarterassBusquedaCobrarAnalisisCarteras(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaCobrarAnalisisCarteras);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarAnalisisCarterasConstantesFunciones.getDetalleIndiceBusquedaCobrarAnalisisCarteras(idBusquedaCobrarAnalisisCarteras);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarAnalisisCarterasConstantesFunciones.getDetalleIndiceBusquedaCobrarAnalisisCarteras(idBusquedaCobrarAnalisisCarteras);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCobrarAnalisisCarterass("BusquedaCobrarAnalisisCarteras",cobraranalisiscarterasLogic.getCobrarAnalisisCarterass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCobrarAnalisisCarterass("BusquedaCobrarAnalisisCarteras",cobraranalisiscarterass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cobraranalisiscarterasLogic.setCobrarAnalisisCarterass(new ArrayList<CobrarAnalisisCarteras>());
						cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().addAll(cobraranalisiscarterassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobraranalisiscarterass=new ArrayList<CobrarAnalisisCarteras>();
							cobraranalisiscarterass.addAll(cobraranalisiscarterassAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCobrarAnalisisCarteras();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCobrarAnalisisCarteras();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobraranalisiscarterass.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobraranalisiscarterass.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CobrarAnalisisCarteras cobraranalisiscarteras) {
		Boolean permite=true;
		
		if(this.cobraranalisiscarteras.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CobrarAnalisisCarterasConstantesFunciones.getOrderByListaCobrarAnalisisCarteras();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CobrarAnalisisCarterasConstantesFunciones.getOrderByListaCobrarAnalisisCarteras();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarAnalisisCarteras cobraranalisiscarteras:cobraranalisiscarterasLogic.getCobrarAnalisisCarterass()) {
				if(cobraranalisiscarteras.getsType().equals(Constantes2.S_TOTALES)) {
					cobraranalisiscarterasTotales=cobraranalisiscarteras;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarAnalisisCarteras cobraranalisiscarteras:this.cobraranalisiscarterass) {
				if(cobraranalisiscarteras.getsType().equals(Constantes2.S_TOTALES)) {
					cobraranalisiscarterasTotales=cobraranalisiscarteras;
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
			this.cobraranalisiscarterasAux=new CobrarAnalisisCarteras();
			this.cobraranalisiscarterasAux.setsType(Constantes2.S_TOTALES);
			this.cobraranalisiscarterasAux.setIsNew(false);
			this.cobraranalisiscarterasAux.setIsChanged(false);
			this.cobraranalisiscarterasAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//CobrarAnalisisCarterasConstantesFunciones.TotalizarValoresFilaCobrarAnalisisCarteras(this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass(),this.cobraranalisiscarterasAux);
				
				//this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().add(this.cobraranalisiscarterasAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CobrarAnalisisCarterasConstantesFunciones.TotalizarValoresFilaCobrarAnalisisCarteras(this.cobraranalisiscarterass,this.cobraranalisiscarterasAux);
				
				this.cobraranalisiscarterass.add(this.cobraranalisiscarterasAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cobraranalisiscarterasTotales=new CobrarAnalisisCarteras();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().remove(cobraranalisiscarterasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobraranalisiscarterass.remove(cobraranalisiscarterasTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cobraranalisiscarterasTotales=new CobrarAnalisisCarteras();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarAnalisisCarteras cobraranalisiscarteras:cobraranalisiscarterasLogic.getCobrarAnalisisCarterass()) {
				if(cobraranalisiscarteras.getsType().equals(Constantes2.S_TOTALES)) {
					cobraranalisiscarterasTotales=cobraranalisiscarteras;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarAnalisisCarterasConstantesFunciones.TotalizarValoresFilaCobrarAnalisisCarteras(this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass(),cobraranalisiscarterasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarAnalisisCarteras cobraranalisiscarteras:this.cobraranalisiscarterass) {
				if(cobraranalisiscarteras.getsType().equals(Constantes2.S_TOTALES)) {
					cobraranalisiscarterasTotales=cobraranalisiscarteras;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarAnalisisCarterasConstantesFunciones.TotalizarValoresFilaCobrarAnalisisCarteras(this.cobraranalisiscarterass,cobraranalisiscarterasTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCobrarAnalisisCarterassBusquedaCobrarAnalisisCarteras()throws Exception {
		try {
			sAccionBusqueda="BusquedaCobrarAnalisisCarteras";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCobrarAnalisisCarterassBusquedaCobrarAnalisisCarteras(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobraranalisiscarterasLogic.getCobrarAnalisisCarterassBusquedaCobrarAnalisisCarteras(sFinalQuery,this.pagination,id);
				
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
	
	public void inicializarPermisosCobrarAnalisisCarteras() {
		this.isPermisoTodoCobrarAnalisisCarteras=false;
		this.isPermisoNuevoCobrarAnalisisCarteras=false;
		this.isPermisoActualizarCobrarAnalisisCarteras=false;
		this.isPermisoActualizarOriginalCobrarAnalisisCarteras=false;
		this.isPermisoEliminarCobrarAnalisisCarteras=false;
		this.isPermisoGuardarCambiosCobrarAnalisisCarteras=false;
		this.isPermisoConsultaCobrarAnalisisCarteras=true;
		this.isPermisoBusquedaCobrarAnalisisCarteras=true;
		this.isPermisoReporteCobrarAnalisisCarteras=true;
		this.isPermisoOrdenCobrarAnalisisCarteras=false;		
		this.isPermisoPaginacionMedioCobrarAnalisisCarteras=false;		
		this.isPermisoPaginacionAltoCobrarAnalisisCarteras=false;		
		this.isPermisoPaginacionTodoCobrarAnalisisCarteras=false;		
		this.isPermisoCopiarCobrarAnalisisCarteras=false;		
		this.isPermisoVerFormCobrarAnalisisCarteras=false;		
		this.isPermisoDuplicarCobrarAnalisisCarteras=false;
		this.isPermisoOrdenCobrarAnalisisCarteras=false;
	}
	
	public void setPermisosUsuarioCobrarAnalisisCarteras(Boolean isPermiso) {
		this.isPermisoTodoCobrarAnalisisCarteras=isPermiso;
		this.isPermisoNuevoCobrarAnalisisCarteras=isPermiso;
		this.isPermisoActualizarCobrarAnalisisCarteras=isPermiso;
		this.isPermisoActualizarOriginalCobrarAnalisisCarteras=isPermiso;
		this.isPermisoEliminarCobrarAnalisisCarteras=isPermiso;
		this.isPermisoGuardarCambiosCobrarAnalisisCarteras=isPermiso;
		this.isPermisoConsultaCobrarAnalisisCarteras=isPermiso;
		this.isPermisoBusquedaCobrarAnalisisCarteras=isPermiso;
		this.isPermisoReporteCobrarAnalisisCarteras=isPermiso;
		this.isPermisoOrdenCobrarAnalisisCarteras=isPermiso;		
		this.isPermisoPaginacionMedioCobrarAnalisisCarteras=isPermiso;		
		this.isPermisoPaginacionAltoCobrarAnalisisCarteras=isPermiso;		
		this.isPermisoPaginacionTodoCobrarAnalisisCarteras=isPermiso;		
		this.isPermisoCopiarCobrarAnalisisCarteras=isPermiso;		
		this.isPermisoVerFormCobrarAnalisisCarteras=isPermiso;		
		this.isPermisoDuplicarCobrarAnalisisCarteras=isPermiso;
		this.isPermisoOrdenCobrarAnalisisCarteras=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCobrarAnalisisCarteras(Boolean isPermiso) {
		//this.isPermisoTodoCobrarAnalisisCarteras=isPermiso;
		this.isPermisoNuevoCobrarAnalisisCarteras=isPermiso;
		this.isPermisoActualizarCobrarAnalisisCarteras=isPermiso;
		this.isPermisoActualizarOriginalCobrarAnalisisCarteras=isPermiso;
		this.isPermisoEliminarCobrarAnalisisCarteras=isPermiso;
		this.isPermisoGuardarCambiosCobrarAnalisisCarteras=isPermiso;
		//this.isPermisoConsultaCobrarAnalisisCarteras=isPermiso;
		//this.isPermisoBusquedaCobrarAnalisisCarteras=isPermiso;
		//this.isPermisoReporteCobrarAnalisisCarteras=isPermiso;
		//this.isPermisoOrdenCobrarAnalisisCarteras=isPermiso;		
		//this.isPermisoPaginacionMedioCobrarAnalisisCarteras=isPermiso;		
		//this.isPermisoPaginacionAltoCobrarAnalisisCarteras=isPermiso;		
		//this.isPermisoPaginacionTodoCobrarAnalisisCarteras=isPermiso;		
		//this.isPermisoCopiarCobrarAnalisisCarteras=isPermiso;		
		//this.isPermisoDuplicarCobrarAnalisisCarteras=isPermiso;
		//this.isPermisoOrdenCobrarAnalisisCarteras=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCobrarAnalisisCarterasClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CobrarAnalisisCarterasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCobrarAnalisisCarteras(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCobrarAnalisisCarterasClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCobrarAnalisisCarterasClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCobrarAnalisisCarterasClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCobrarAnalisisCarterasClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCobrarAnalisisCarteras() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CobrarAnalisisCarterasJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CobrarAnalisisCarterasConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCobrarAnalisisCarteras=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCobrarAnalisisCarteras=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCobrarAnalisisCarteras=this.isPermisoActualizarCobrarAnalisisCarteras;
			this.isPermisoEliminarCobrarAnalisisCarteras=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCobrarAnalisisCarteras=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCobrarAnalisisCarteras=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCobrarAnalisisCarteras=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCobrarAnalisisCarteras=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCobrarAnalisisCarteras=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarAnalisisCarteras=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCobrarAnalisisCarteras=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCobrarAnalisisCarteras=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCobrarAnalisisCarteras=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCobrarAnalisisCarteras=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCobrarAnalisisCarteras=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCobrarAnalisisCarteras=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarAnalisisCarteras=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCobrarAnalisisCarteras.setToolTipText(this.jTableDatosCobrarAnalisisCarteras.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCobrarAnalisisCarteras(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCobrarAnalisisCarteras(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CobrarAnalisisCarterasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CobrarAnalisisCarterasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCobrarAnalisisCarteras() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyCobrarAnalisisCarterasListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCobrarAnalisisCarterasListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CobrarAnalisisCarterasJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	
	public void addItemDefectoCombosTodosForeignKeyCobrarAnalisisCarteras()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyCobrarAnalisisCarteras()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCobrarAnalisisCarteras(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCobrarAnalisisCarteras()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarAnalisisCarteras();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCobrarAnalisisCarteras(CobrarAnalisisCarteras cobraranalisiscarteras)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCobrarAnalisisCarteras(CobrarAnalisisCarteras cobraranalisiscarteras,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCobrarAnalisisCarteras()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarAnalisisCarteras()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCobrarAnalisisCarteras()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCobrarAnalisisCarteras()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCobrarAnalisisCarteras()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCobrarAnalisisCarteras()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCobrarAnalisisCarteras(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCobrarAnalisisCarteras()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public CobrarAnalisisCarterasBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CobrarAnalisisCarterasBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CobrarAnalisisCarterasBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cobraranalisiscarterasSessionBean=new CobrarAnalisisCarterasSessionBean(); 
		this.cobraranalisiscarterasConstantesFunciones=new CobrarAnalisisCarterasConstantesFunciones(); 
		this.cobraranalisiscarterasBean=new CobrarAnalisisCarteras();//(this.cobraranalisiscarterasConstantesFunciones); 		
		this.cobraranalisiscarterasReturnGeneral=new CobrarAnalisisCarterasParameterReturnGeneral(); 
		
		this.cobraranalisiscarterasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobraranalisiscarterasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CobrarAnalisisCarterasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CobrarAnalisisCarterasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CobrarAnalisisCarterasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCobrarAnalisisCarteras(true);
			
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
			
			this.cobraranalisiscarterasConstantesFunciones=new CobrarAnalisisCarterasConstantesFunciones(); 
			this.cobraranalisiscarterasBean=new CobrarAnalisisCarteras();//this.cobraranalisiscarterasConstantesFunciones); 			
			this.cobraranalisiscarterasReturnGeneral=new CobrarAnalisisCarterasParameterReturnGeneral(); 
		
			CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Analisis Carteras Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.cobraranalisiscarteras=new CobrarAnalisisCarteras();
			this.cobraranalisiscarterass = new ArrayList<CobrarAnalisisCarteras>();
			this.cobraranalisiscarterassAux = new ArrayList<CobrarAnalisisCarteras>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic=new CobrarAnalisisCarterasLogic();
				this.cobraranalisiscarterasLogic.getNewConnexionToDeep("");
			}
			
			//this.cobraranalisiscarterasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cobraranalisiscarterasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCobrarAnalisisCarteras);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras);	
					}
					
					if(this.jInternalFrameImportacionCobrarAnalisisCarteras!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarAnalisisCarteras);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCobrarAnalisisCarteras!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCobrarAnalisisCarteras);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarAnalisisCarteras);
				this.jInternalFrameDetalleFormCobrarAnalisisCarteras.setVisible(false);
				this.jInternalFrameDetalleFormCobrarAnalisisCarteras.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras);
					this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.setVisible(false);
					this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCobrarAnalisisCarteras!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCobrarAnalisisCarteras);
					this.jInternalFrameImportacionCobrarAnalisisCarteras.setVisible(false);
					this.jInternalFrameImportacionCobrarAnalisisCarteras.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCobrarAnalisisCarteras!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCobrarAnalisisCarteras);
					this.jInternalFrameOrderByCobrarAnalisisCarteras.setVisible(false);
					this.jInternalFrameOrderByCobrarAnalisisCarteras.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCobrarAnalisisCarterasActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CobrarAnalisisCarterasConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cobraranalisiscarterasReturnGeneral=new CobrarAnalisisCarterasParameterReturnGeneral();
			
			this.cobraranalisiscarterasParameterGeneral=new CobrarAnalisisCarterasParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cobraranalisiscarterasLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CobrarAnalisisCarterasJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarAnalisisCarterasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado(),this.cobraranalisiscarterasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarAnalisisCarterasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado(),this.cobraranalisiscarterasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaDuplicarCobrarAnalisisCarteras=true;
			this.isVisibilidadCeldaCopiarCobrarAnalisisCarteras=true;
			this.isVisibilidadCeldaVerFormCobrarAnalisisCarteras=true;
			this.isVisibilidadCeldaOrdenCobrarAnalisisCarteras=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaModificarCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaActualizarCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaEliminarCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaCancelarCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaGuardarCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarAnalisisCarteras=false;
			
			
			this.isVisibilidadBusquedaCobrarAnalisisCarteras=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCobrarAnalisisCarteras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCobrarAnalisisCarteras();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCobrarAnalisisCarteras(false);
			
			this.setPermisosUsuarioCobrarAnalisisCarteras();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado() 
				|| (this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado() && this.cobraranalisiscarterasSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCobrarAnalisisCarterasClasesRelacionadas();
			}
			
			if(this.cobraranalisiscarterasSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCobrarAnalisisCarterasClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CobrarAnalisisCarterasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCobrarAnalisisCarteras();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCobrarAnalisisCarteras();
			}
			
			if(!this.isPermisoBusquedaCobrarAnalisisCarteras) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCobrarAnalisisCarteras.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CobrarAnalisisCarterasConstantesFunciones.getTiposSeleccionarCobrarAnalisisCarteras());
				
				this.tiposColumnasSelect=CobrarAnalisisCarterasConstantesFunciones.getTiposSeleccionarCobrarAnalisisCarteras(true);
				
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
			//if(!this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCobrarAnalisisCarteras();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioCobrarAnalisisCarteras(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioCobrarAnalisisCarteras(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarAnalisisCarteras() ;
			
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
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cobraranalisiscarterasImplementable= (CobrarAnalisisCarterasImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarAnalisisCarterasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cobraranalisiscarterasImplementableHome= (CobrarAnalisisCarterasImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarAnalisisCarterasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cobraranalisiscarterass= new ArrayList<CobrarAnalisisCarteras>();
			this.cobraranalisiscarterassEliminados= new ArrayList<CobrarAnalisisCarteras>();
						
			this.isEsNuevoCobrarAnalisisCarteras=false;
			this.esParaAccionDesdeFormularioCobrarAnalisisCarteras=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCobrarAnalisisCarteras(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCobrarAnalisisCarteras();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CobrarAnalisisCarterasConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCobrarAnalisisCarteras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCobrarAnalisisCarteras(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCobrarAnalisisCarteras();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCobrarAnalisisCarteras();
			}
			
			CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCobrarAnalisisCarteras.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCobrarAnalisisCarteras.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCobrarAnalisisCarteras.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCobrarAnalisisCarteras(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CobrarAnalisisCarteras: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCobrarAnalisisCarteras() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCobrarAnalisisCarteras")) {
				iIndex=this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTabbedPaneRelacionesCobrarAnalisisCarteras.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTabbedPaneRelacionesCobrarAnalisisCarteras.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCobrarAnalisisCarteras.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCobrarAnalisisCarteras();	
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
	
	public void cargarCombosForeignKeyCobrarAnalisisCarteras(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCobrarAnalisisCarteras(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCobrarAnalisisCarteras(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCobrarAnalisisCarterasListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCobrarAnalisisCarteras();
		
		this.cargarCombosFrameForeignKeyCobrarAnalisisCarteras();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCobrarAnalisisCarteras();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCobrarAnalisisCarteras();
		}
	}
	
	
	
	public void jButtonNuevoCobrarAnalisisCarterasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cobraranalisiscarterasSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
			
			
			if(jTableDatosCobrarAnalisisCarteras.getRowCount()>=1) {
				jTableDatosCobrarAnalisisCarteras.removeRowSelectionInterval(0, jTableDatosCobrarAnalisisCarteras.getRowCount()-1);						
			}
			
			this.isEsNuevoCobrarAnalisisCarteras=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCobrarAnalisisCarteras(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCobrarAnalisisCarteras(true);			
			//this.cobraranalisiscarteras=new CobrarAnalisisCarteras();
			//this.cobraranalisiscarteras.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarAnalisisCarteras(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarAnalisisCarteras() ;
			
			if(CobrarAnalisisCarterasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarAnalisisCarteras(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cobraranalisiscarteras);	
			this.actualizarInformacion("INFO_PADRE",false,this.cobraranalisiscarteras);				
			
			CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
			
			if(this.cobraranalisiscarterasSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CobrarAnalisisCarteras: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCobrarAnalisisCarterasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CobrarAnalisisCarteras> cobraranalisiscarterassSeleccionados=new ArrayList<CobrarAnalisisCarteras>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCobrarAnalisisCarteras.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCobrarAnalisisCarteras.getSelectedRows().length;			
			}
			
			cobraranalisiscarterassSeleccionados=this.getCobrarAnalisisCarterassSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCobrarAnalisisCarteras--;			
				//CobrarAnalisisCarteras cobraranalisiscarterasAux= new CobrarAnalisisCarteras();			
				//cobraranalisiscarterasAux.setId(this.iIdNuevoCobrarAnalisisCarteras);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CobrarAnalisisCarteras cobraranalisiscarterasOrigen=new CobrarAnalisisCarteras();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CobrarAnalisisCarteras cobraranalisiscarterasOrigen : cobraranalisiscarterassSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCobrarAnalisisCarteras.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cobraranalisiscarterasOrigen =(CobrarAnalisisCarteras) this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobraranalisiscarterasOrigen =(CobrarAnalisisCarteras) this.cobraranalisiscarterass.toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCobrarAnalisisCarteras();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cobraranalisiscarteras.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCobrarAnalisisCarteras(cobraranalisiscarterasOrigen,this.cobraranalisiscarteras,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarAnalisisCarteras(this.cobraranalisiscarteras);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().add(this.cobraranalisiscarterasAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobraranalisiscarterass.add(this.cobraranalisiscarterasAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCobrarAnalisisCarteras(false);
				
				this.jTableDatosCobrarAnalisisCarteras.setRowSelectionInterval(this.getIndiceNuevoCobrarAnalisisCarteras(), this.getIndiceNuevoCobrarAnalisisCarteras());
				
				int iLastRow =  this.jTableDatosCobrarAnalisisCarteras.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarAnalisisCarteras.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarAnalisisCarteras.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarAnalisisCarteras(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCobrarAnalisisCarterasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CobrarAnalisisCarteras> cobraranalisiscarterassSeleccionados=new ArrayList<CobrarAnalisisCarteras>();									
		
			CobrarAnalisisCarteras cobraranalisiscarterasOrigen=new CobrarAnalisisCarteras();
			CobrarAnalisisCarteras cobraranalisiscarterasDestino=new CobrarAnalisisCarteras();
				
			cobraranalisiscarterassSeleccionados=this.getCobrarAnalisisCarterassSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCobrarAnalisisCarteras.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cobraranalisiscarterassSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCobrarAnalisisCarteras.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobraranalisiscarterasOrigen =(CobrarAnalisisCarteras) this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobraranalisiscarterasOrigen =(CobrarAnalisisCarteras) this.cobraranalisiscarterass.toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobraranalisiscarterasDestino =(CobrarAnalisisCarteras) this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobraranalisiscarterasDestino =(CobrarAnalisisCarteras) this.cobraranalisiscarterass.toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cobraranalisiscarterasOrigen =cobraranalisiscarterassSeleccionados.get(0);
				cobraranalisiscarterasDestino =cobraranalisiscarterassSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCobrarAnalisisCarteras(cobraranalisiscarterasOrigen,cobraranalisiscarterasDestino,true,false);
				
				cobraranalisiscarterasDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cobraranalisiscarterasDestino,cobraranalisiscarterasLogic.getCobrarAnalisisCarterass());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cobraranalisiscarterasDestino,cobraranalisiscarterass);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCobrarAnalisisCarteras(false);
				
				//this.jTableDatosCobrarAnalisisCarteras.setRowSelectionInterval(this.getIndiceNuevoCobrarAnalisisCarteras(), this.getIndiceNuevoCobrarAnalisisCarteras());
				
				int iLastRow =  this.jTableDatosCobrarAnalisisCarteras.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarAnalisisCarteras.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarAnalisisCarteras.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarAnalisisCarteras(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCobrarAnalisisCarterasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCobrarAnalisisCarterasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCobrarAnalisisCarteras.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCobrarAnalisisCarteras.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCobrarAnalisisCarteras.setVisible(!isVisible);
			this.jPanelPaginacionCobrarAnalisisCarteras.setVisible(!isVisible);
			this.jPanelAccionesCobrarAnalisisCarteras.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCobrarAnalisisCarterasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCobrarAnalisisCarteras();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCobrarAnalisisCarterasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCobrarAnalisisCarteras();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCobrarAnalisisCarterasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCobrarAnalisisCarteras();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCobrarAnalisisCarterasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCobrarAnalisisCarteras();
			
			this.abrirFrameOrderByCobrarAnalisisCarteras();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCobrarAnalisisCarterasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCobrarAnalisisCarteras();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCobrarAnalisisCarteras(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarAnalisisCarteras);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras.isMaximum()) {
					this.jInternalFrameDetalleFormCobrarAnalisisCarteras.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.setSize(this.jInternalFrameDetalleFormCobrarAnalisisCarteras.iWidthFormulario,this.jInternalFrameDetalleFormCobrarAnalisisCarteras.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCobrarAnalisisCarteras.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCobrarAnalisisCarteras.isMaximum()) {
						this.jInternalFrameDetalleFormCobrarAnalisisCarteras.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jContentPaneDetalleCobrarAnalisisCarteras.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTabbedPaneRelacionesCobrarAnalisisCarteras.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jContentPaneDetalleCobrarAnalisisCarteras.getWidth(),CobrarAnalisisCarterasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTabbedPaneRelacionesCobrarAnalisisCarteras.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jContentPaneDetalleCobrarAnalisisCarteras.getWidth(),CobrarAnalisisCarterasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTabbedPaneRelacionesCobrarAnalisisCarteras.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jContentPaneDetalleCobrarAnalisisCarteras.getWidth(),CobrarAnalisisCarterasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCobrarAnalisisCarteras.setVisible(true);
	        this.jInternalFrameDetalleFormCobrarAnalisisCarteras.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCobrarAnalisisCarteras() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCobrarAnalisisCarteras==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCobrarAnalisisCarteras=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarAnalisisCarteras,false,this);
				} else {
					this.jInternalFrameOrderByCobrarAnalisisCarteras=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarAnalisisCarteras,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCobrarAnalisisCarteras);
				this.jInternalFrameOrderByCobrarAnalisisCarteras.setVisible(false);
				this.jInternalFrameOrderByCobrarAnalisisCarteras.setSelected(false);
				
				this.jInternalFrameOrderByCobrarAnalisisCarteras.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarAnalisisCarteras"));
				
				this.inicializarActualizarBindingTablaOrderByCobrarAnalisisCarteras();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCobrarAnalisisCarteras() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCobrarAnalisisCarteras==null) {
				
				this.jInternalFrameImportacionCobrarAnalisisCarteras=new ImportacionJInternalFrame(CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarAnalisisCarteras);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCobrarAnalisisCarteras);
				this.jInternalFrameImportacionCobrarAnalisisCarteras.setVisible(false);
				this.jInternalFrameImportacionCobrarAnalisisCarteras.setSelected(false);


				this.jInternalFrameImportacionCobrarAnalisisCarteras.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarAnalisisCarteras"));
				this.jInternalFrameImportacionCobrarAnalisisCarteras.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarAnalisisCarteras"));
				this.jInternalFrameImportacionCobrarAnalisisCarteras.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarAnalisisCarteras"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCobrarAnalisisCarteras() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras==null) {
				this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras=new ReporteDinamicoJInternalFrame(CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras);
				this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.setVisible(false);
				this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarAnalisisCarteras"));
				this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarAnalisisCarteras"));
				this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarAnalisisCarteras"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarAnalisisCarteras();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCobrarAnalisisCarteras() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarAnalisisCarteras);
			
	       	this.jInternalFrameDetalleFormCobrarAnalisisCarteras.setVisible(false);
	        this.jInternalFrameDetalleFormCobrarAnalisisCarteras.setSelected(false);
			
			//this.jInternalFrameDetalleFormCobrarAnalisisCarteras.dispose();
			//this.jInternalFrameDetalleFormCobrarAnalisisCarteras=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCobrarAnalisisCarteras() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.setVisible(true);
	        this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCobrarAnalisisCarteras() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCobrarAnalisisCarteras.setVisible(true);
	        this.jInternalFrameImportacionCobrarAnalisisCarteras.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCobrarAnalisisCarteras() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCobrarAnalisisCarteras.setVisible(true);
	        this.jInternalFrameOrderByCobrarAnalisisCarteras.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCobrarAnalisisCarteras() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCobrarAnalisisCarteras.setVisible(false);
	        this.jInternalFrameOrderByCobrarAnalisisCarteras.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCobrarAnalisisCarteras() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.setVisible(false);
	        this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCobrarAnalisisCarteras() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCobrarAnalisisCarteras.setVisible(false);
	        this.jInternalFrameImportacionCobrarAnalisisCarteras.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCobrarAnalisisCarterasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCobrarAnalisisCarteras(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCobrarAnalisisCarteras(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarAnalisisCarteras.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCobrarAnalisisCarteras(true);
			//this.isEsNuevoCobrarAnalisisCarteras=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarteras =(CobrarAnalisisCarteras) this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobraranalisiscarteras =(CobrarAnalisisCarteras) this.cobraranalisiscarterass.toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCobrarAnalisisCarteras("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarAnalisisCarteras(false) ;
			
			if(cobraranalisiscarterasSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CobrarAnalisisCarterasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarAnalisisCarteras(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarAnalisisCarteras(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCobrarAnalisisCarterasActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCobrarAnalisisCarteras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarteras =(CobrarAnalisisCarteras) this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobraranalisiscarteras =(CobrarAnalisisCarteras) this.cobraranalisiscarterass.toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCobrarAnalisisCarteras(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarAnalisisCarteras.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCobrarAnalisisCarteras(true);
			//this.isEsNuevoCobrarAnalisisCarteras=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarteras =(CobrarAnalisisCarteras) this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobraranalisiscarteras =(CobrarAnalisisCarteras) this.cobraranalisiscarterass.toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cobraranalisiscarteras.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCobrarAnalisisCarteras("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCobrarAnalisisCarteras(false) ;
			
			if(CobrarAnalisisCarterasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarAnalisisCarteras(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarAnalisisCarteras(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarCobrarAnalisisCarterasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCobrarAnalisisCarteras(false);
			
			//if(!this.isEsNuevoCobrarAnalisisCarteras) {								
				int intSelectedRow = this.jTableDatosCobrarAnalisisCarteras.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarteras =(CobrarAnalisisCarteras) this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobraranalisiscarteras =(CobrarAnalisisCarteras) this.cobraranalisiscarterass.toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CobrarAnalisisCarterasJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCobrarAnalisisCarteras(this.cobraranalisiscarteras,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarAnalisisCarteras(this.cobraranalisiscarteras);
				
			}
			
			if(this.permiteMantenimiento(this.cobraranalisiscarteras)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCobrarAnalisisCarteras=true;
					this.inicializarActualizarBindingTablaCobrarAnalisisCarteras(false);
					this.isEsNuevoCobrarAnalisisCarteras=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCobrarAnalisisCarteras=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCobrarAnalisisCarteras=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarAnalisisCarteras(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarAnalisisCarteras(false);
				
				this.habilitarDeshabilitarControlesCobrarAnalisisCarteras(false);
			
												
				
				if(CobrarAnalisisCarterasJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCobrarAnalisisCarteras();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCobrarAnalisisCarterasActionPerformed(evt,cobraranalisiscarterasSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCobrarAnalisisCarteras(this.cobraranalisiscarteras,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCobrarAnalisisCarteras.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cobraranalisiscarterasSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cobraranalisiscarteras.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CobrarAnalisisCarteras.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarAnalisisCarteras.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCobrarAnalisisCarterasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCobrarAnalisisCarteras.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarteras =(CobrarAnalisisCarteras) this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
				this.cobraranalisiscarteras.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobraranalisiscarteras =(CobrarAnalisisCarteras) this.cobraranalisiscarterass.toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
				this.cobraranalisiscarteras.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cobraranalisiscarteras)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CobrarAnalisisCarterasModel) this.jTableDatosCobrarAnalisisCarteras.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCobrarAnalisisCarteras=true;
				this.inicializarActualizarBindingTablaCobrarAnalisisCarteras(false);
				this.isEsNuevoCobrarAnalisisCarteras=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarAnalisisCarteras(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarAnalisisCarteras(false);
				
				this.habilitarDeshabilitarControlesCobrarAnalisisCarteras(false);
				
				
				
				if(CobrarAnalisisCarterasJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCobrarAnalisisCarteras();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCobrarAnalisisCarterasActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCobrarAnalisisCarteras.getRowCount()>=1) {
				jTableDatosCobrarAnalisisCarteras.removeRowSelectionInterval(0, jTableDatosCobrarAnalisisCarteras.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCobrarAnalisisCarteras(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCobrarAnalisisCarteras(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarAnalisisCarteras(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarAnalisisCarteras(false) ;
			
			this.isEsNuevoCobrarAnalisisCarteras=false;
			
			if(CobrarAnalisisCarterasJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCobrarAnalisisCarteras();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCobrarAnalisisCarterasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCobrarAnalisisCarteras(false);
				
				//SI ES MANUAL
				if(CobrarAnalisisCarterasJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCobrarAnalisisCarteras();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCobrarAnalisisCarterasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCobrarAnalisisCarteras--;			
			//CobrarAnalisisCarteras cobraranalisiscarterasAux= new CobrarAnalisisCarteras();			
			//cobraranalisiscarterasAux.setId(this.iIdNuevoCobrarAnalisisCarteras);
			
			if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCobrarAnalisisCarteras();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCobrarAnalisisCarteras(this.cobraranalisiscarteras);
			
			this.cobraranalisiscarteras.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().add(this.cobraranalisiscarterasAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cobraranalisiscarterass.add(this.cobraranalisiscarterasAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCobrarAnalisisCarteras(false);
			
			this.jTableDatosCobrarAnalisisCarteras.setRowSelectionInterval(this.getIndiceNuevoCobrarAnalisisCarteras(), this.getIndiceNuevoCobrarAnalisisCarteras());
			
			int iLastRow =  this.jTableDatosCobrarAnalisisCarteras.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCobrarAnalisisCarteras.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCobrarAnalisisCarteras.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCobrarAnalisisCarteras(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCobrarAnalisisCarterasActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCobrarAnalisisCarteras(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarAnalisisCarteras(false);
			
			//SI ES MANUAL
			if(CobrarAnalisisCarterasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarAnalisisCarteras();
			}
			
			//this.abrirFrameTreeCobrarAnalisisCarteras();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCobrarAnalisisCarterasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCobrarAnalisisCarterasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCobrarAnalisisCarteras.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCobrarAnalisisCarteras.setFileImportacion(this.jInternalFrameImportacionCobrarAnalisisCarteras.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCobrarAnalisisCarteras.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCobrarAnalisisCarteras.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCobrarAnalisisCarteras.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCobrarAnalisisCarteras.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCobrarAnalisisCarterasActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CobrarAnalisisCarteras> cobraranalisiscarterassSeleccionados=new ArrayList<CobrarAnalisisCarteras>();		

		cobraranalisiscarterassSeleccionados=this.getCobrarAnalisisCarterassSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CobrarAnalisisCarterasBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CobrarAnalisisCarterasBaseDesign.jrxml";
			
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
			
			this.generarReporteCobrarAnalisisCarterass("Todos",cobraranalisiscarterassSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Analisis Carteras",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarAnalisisCarterasConstantesFunciones.LABEL_NOMBRETIPORADIOVENCI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTipoRadioVenci_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTipoRadioVenci_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTipoRadioVenci_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTipoRadioVenci_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarAnalisisCarterasConstantesFunciones.LABEL_DIADESDE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_aDesde_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_aDesde_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_aDesde_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_aDesde_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarAnalisisCarterasConstantesFunciones.LABEL_DIAHASTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_aHasta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_aHasta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_aHasta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_aHasta_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CobrarAnalisisCarterasConstantesFunciones.LABEL_NOMBRETIPORADIOVENCI:
					sNombreCampoCategoria="nombre_tipo_radio_venci";
					break;

				case CobrarAnalisisCarterasConstantesFunciones.LABEL_DIADESDE:
					sNombreCampoCategoria="dia_desde";
					break;

				case CobrarAnalisisCarterasConstantesFunciones.LABEL_DIAHASTA:
					sNombreCampoCategoria="dia_hasta";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CobrarAnalisisCarterasConstantesFunciones.LABEL_NOMBRETIPORADIOVENCI:
					sNombreCampoCategoriaValor="nombre_tipo_radio_venci";
					break;

				case CobrarAnalisisCarterasConstantesFunciones.LABEL_DIADESDE:
					sNombreCampoCategoriaValor="dia_desde";
					break;

				case CobrarAnalisisCarterasConstantesFunciones.LABEL_DIAHASTA:
					sNombreCampoCategoriaValor="dia_hasta";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarAnalisisCarterasConstantesFunciones.LABEL_NOMBRETIPORADIOVENCI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Tipo Radio Venci",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_tipo_radio_venci");
					break;

				case CobrarAnalisisCarterasConstantesFunciones.LABEL_DIADESDE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dia Desde",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dia_desde");
					break;

				case CobrarAnalisisCarterasConstantesFunciones.LABEL_DIAHASTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dia Hasta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dia_hasta");
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
	
	public void jButtonGenerarExcelReporteDinamicoCobrarAnalisisCarterasActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CobrarAnalisisCarteras> cobraranalisiscarterassSeleccionados=new ArrayList<CobrarAnalisisCarteras>();		
		
		cobraranalisiscarterassSeleccionados=this.getCobrarAnalisisCarterassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobraranalisiscarteras";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CobrarAnalisisCarterass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CobrarAnalisisCarterasConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarAnalisisCarterasConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CobrarAnalisisCarteras cobraranalisiscarteras:cobraranalisiscarterassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobraranalisiscarteras.getid_empresa());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarAnalisisCarterasConstantesFunciones.LABEL_NOMBRETIPORADIOVENCI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarAnalisisCarterasConstantesFunciones.LABEL_NOMBRETIPORADIOVENCI);
					iRow++;

					for(CobrarAnalisisCarteras cobraranalisiscarteras:cobraranalisiscarterassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobraranalisiscarteras.getnombre_tipo_radio_venci());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarAnalisisCarterasConstantesFunciones.LABEL_DIADESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarAnalisisCarterasConstantesFunciones.LABEL_DIADESDE);
					iRow++;

					for(CobrarAnalisisCarteras cobraranalisiscarteras:cobraranalisiscarterassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobraranalisiscarteras.getdia_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarAnalisisCarterasConstantesFunciones.LABEL_DIAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarAnalisisCarterasConstantesFunciones.LABEL_DIAHASTA);
					iRow++;

					for(CobrarAnalisisCarteras cobraranalisiscarteras:cobraranalisiscarterassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobraranalisiscarteras.getdia_hasta());
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
			//	this.getFilaCabeceraExportarExcelCobrarAnalisisCarteras(row);				
			//	iRow++;
			//}				
			
			//for(CobrarAnalisisCarteras cobraranalisiscarterasAux:cobraranalisiscarterassSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCobrarAnalisisCarteras(cobraranalisiscarterasAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Analisis Carteras",JOptionPane.INFORMATION_MESSAGE);
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
				this.cobraranalisiscarterasLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarAnalisisCarteras(false);
			
			//SI ES MANUAL
			if(CobrarAnalisisCarterasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarAnalisisCarteras();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCobrarAnalisisCarterasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarAnalisisCarteras(false);
			
			//SI ES MANUAL
			if(CobrarAnalisisCarterasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarAnalisisCarteras();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCobrarAnalisisCarterasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarAnalisisCarteras(false);
			
			//SI ES MANUAL
			if(CobrarAnalisisCarterasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarAnalisisCarteras();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCobrarAnalisisCarteras() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCobrarAnalisisCarteras.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCobrarAnalisisCarteras.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCobrarAnalisisCarteras.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCobrarAnalisisCarteras.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCobrarAnalisisCarteras.setMinimumSize(dimensionMinimum);
		this.jTableDatosCobrarAnalisisCarteras.setMaximumSize(dimensionMaximum);
		this.jTableDatosCobrarAnalisisCarteras.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCobrarAnalisisCarteras(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCobrarAnalisisCarteras(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCobrarAnalisisCarteras(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCobrarAnalisisCarteras(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCobrarAnalisisCarteras(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCobrarAnalisisCarteras(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarAnalisisCarteras(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCobrarAnalisisCarteras(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CobrarAnalisisCarterasJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CobrarAnalisisCarterasJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCobrarAnalisisCarteras() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCobrarAnalisisCarteras();
		
		this.inicializarActualizarBindingBotonesManualCobrarAnalisisCarteras(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarAnalisisCarteras();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarAnalisisCarteras() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarAnalisisCarteras(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarAnalisisCarteras(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCobrarAnalisisCarteras.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCobrarAnalisisCarteras.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCobrarAnalisisCarteras.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jCheckBoxPostAccionNuevoCobrarAnalisisCarteras.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jCheckBoxPostAccionSinCerrarCobrarAnalisisCarteras.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jCheckBoxPostAccionSinMensajeCobrarAnalisisCarteras.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCobrarAnalisisCarteras.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCobrarAnalisisCarteras.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCobrarAnalisisCarteras.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) {
				this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jCheckBoxPostAccionNuevoCobrarAnalisisCarteras.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jCheckBoxPostAccionSinCerrarCobrarAnalisisCarteras.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jCheckBoxPostAccionSinMensajeCobrarAnalisisCarteras.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCobrarAnalisisCarteras.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCobrarAnalisisCarteras.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jComboBoxTiposAccionesFormularioCobrarAnalisisCarteras.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCobrarAnalisisCarteras.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCobrarAnalisisCarteras.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCobrarAnalisisCarteras.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCobrarAnalisisCarteras.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCobrarAnalisisCarteras.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCobrarAnalisisCarteras.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCobrarAnalisisCarteras.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCobrarAnalisisCarteras(Boolean esInicializar) throws Exception {
		try	{	
			if(CobrarAnalisisCarterasJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarAnalisisCarteras(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCobrarAnalisisCarteras() throws Exception {
		try	{
			if(CobrarAnalisisCarterasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarAnalisisCarteras();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarAnalisisCarteras() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jComboBoxTiposAccionesFormularioCobrarAnalisisCarteras.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jComboBoxTiposAccionesFormularioCobrarAnalisisCarteras.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarAnalisisCarteras() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCobrarAnalisisCarteras.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCobrarAnalisisCarteras.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCobrarAnalisisCarteras.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCobrarAnalisisCarteras.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCobrarAnalisisCarteras.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCobrarAnalisisCarteras.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCobrarAnalisisCarteras.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCobrarAnalisisCarteras.addItem(reporte);
			}
			
			
			if(!this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCobrarAnalisisCarteras.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCobrarAnalisisCarteras.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCobrarAnalisisCarteras.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCobrarAnalisisCarteras.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCobrarAnalisisCarteras.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCobrarAnalisisCarteras.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jComboBoxTiposAccionesFormularioCobrarAnalisisCarteras.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jComboBoxTiposAccionesFormularioCobrarAnalisisCarteras.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCobrarAnalisisCarteras.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCobrarAnalisisCarteras.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCobrarAnalisisCarteras.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarAnalisisCarteras();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarAnalisisCarteras() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras!=null) {
				this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras!=null) {
				this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras!=null) {
				
				if(this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCobrarAnalisisCarteras()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaCobrarAnalisisCarteras=Long.parseLong(this.jLabelidCobrarAnalisisCarterasBusquedaCobrarAnalisisCarteras.getText());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCobrarAnalisisCarteras(Boolean esInicializar) throws Exception {				
		if(CobrarAnalisisCarterasJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarAnalisisCarteras();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCobrarAnalisisCarteras() throws Exception {
		this.inicializarActualizarBindingTablaCobrarAnalisisCarteras(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCobrarAnalisisCarteras() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCobrarAnalisisCarteras.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCobrarAnalisisCarteras.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarAnalisisCarteras.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CobrarAnalisisCarterasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCobrarAnalisisCarteras.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarAnalisisCarteras.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CobrarAnalisisCarterasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCobrarAnalisisCarterasOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarAnalisisCarterasOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CobrarAnalisisCarterasPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCobrarAnalisisCarteras.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarAnalisisCarteras.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CobrarAnalisisCarterasPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCobrarAnalisisCarteras.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCobrarAnalisisCarteras(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cobraranalisiscarterass.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CobrarAnalisisCarterasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCobrarAnalisisCarteras.setModel(new CobrarAnalisisCarterasModel(this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCobrarAnalisisCarteras.setModel(new CobrarAnalisisCarterasModel(this.cobraranalisiscarterass,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCobrarAnalisisCarteras!=null && this.jInternalFrameOrderByCobrarAnalisisCarteras.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCobrarAnalisisCarteras();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCobrarAnalisisCarteras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarAnalisisCarteras,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CobrarAnalisisCarterasPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO,cobraranalisiscarterasConstantesFunciones.resaltarSeleccionarCobrarAnalisisCarteras,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CobrarAnalisisCarterasConstantesFunciones.SCLASSWEBTITULO,cobraranalisiscarterasConstantesFunciones.resaltarSeleccionarCobrarAnalisisCarteras,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCobrarAnalisisCarteras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarAnalisisCarteras,CobrarAnalisisCarterasConstantesFunciones.LABEL_NOMBRETIPORADIOVENCI));

		if(this.cobraranalisiscarterasConstantesFunciones.mostrarnombre_tipo_radio_venciCobrarAnalisisCarteras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarAnalisisCarterasConstantesFunciones.LABEL_NOMBRETIPORADIOVENCI,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobraranalisiscarterasConstantesFunciones.resaltarnombre_tipo_radio_venciCobrarAnalisisCarteras,this.cobraranalisiscarterasConstantesFunciones.activarnombre_tipo_radio_venciCobrarAnalisisCarteras,this,true,"nombre_tipo_radio_venciCobrarAnalisisCarteras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobraranalisiscarterasConstantesFunciones.resaltarnombre_tipo_radio_venciCobrarAnalisisCarteras,this.cobraranalisiscarterasConstantesFunciones.activarnombre_tipo_radio_venciCobrarAnalisisCarteras,this,true,"nombre_tipo_radio_venciCobrarAnalisisCarteras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarAnalisisCarterasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarAnalisisCarteras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarAnalisisCarteras,CobrarAnalisisCarterasConstantesFunciones.LABEL_DIADESDE));

		if(this.cobraranalisiscarterasConstantesFunciones.mostrardia_desdeCobrarAnalisisCarteras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarAnalisisCarterasConstantesFunciones.LABEL_DIADESDE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobraranalisiscarterasConstantesFunciones.resaltardia_desdeCobrarAnalisisCarteras,this.cobraranalisiscarterasConstantesFunciones.activardia_desdeCobrarAnalisisCarteras,this,true,"dia_desdeCobrarAnalisisCarteras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobraranalisiscarterasConstantesFunciones.resaltardia_desdeCobrarAnalisisCarteras,this.cobraranalisiscarterasConstantesFunciones.activardia_desdeCobrarAnalisisCarteras,this,true,"dia_desdeCobrarAnalisisCarteras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarAnalisisCarterasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarAnalisisCarteras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarAnalisisCarteras,CobrarAnalisisCarterasConstantesFunciones.LABEL_DIAHASTA));

		if(this.cobraranalisiscarterasConstantesFunciones.mostrardia_hastaCobrarAnalisisCarteras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarAnalisisCarterasConstantesFunciones.LABEL_DIAHASTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobraranalisiscarterasConstantesFunciones.resaltardia_hastaCobrarAnalisisCarteras,this.cobraranalisiscarterasConstantesFunciones.activardia_hastaCobrarAnalisisCarteras,this,true,"dia_hastaCobrarAnalisisCarteras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobraranalisiscarterasConstantesFunciones.resaltardia_hastaCobrarAnalisisCarteras,this.cobraranalisiscarterasConstantesFunciones.activardia_hastaCobrarAnalisisCarteras,this,true,"dia_hastaCobrarAnalisisCarteras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarAnalisisCarterasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarAnalisisCarteras.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarAnalisisCarteras.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCobrarAnalisisCarteras && this.isPermisoGuardarCambiosCobrarAnalisisCarteras) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCobrarAnalisisCarteras.addColumn(tableColumn);
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
			
			this.jTableDatosCobrarAnalisisCarteras.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarAnalisisCarteras && this.isPermisoGuardarCambiosCobrarAnalisisCarteras) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarAnalisisCarteras && this.isPermisoGuardarCambiosCobrarAnalisisCarteras) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCobrarAnalisisCarteras.moveColumn(this.jTableDatosCobrarAnalisisCarteras.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCobrarAnalisisCarteras.moveColumn(this.jTableDatosCobrarAnalisisCarteras.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCobrarAnalisisCarteras.moveColumn(this.jTableDatosCobrarAnalisisCarteras.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCobrarAnalisisCarteras.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCobrarAnalisisCarteras.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCobrarAnalisisCarteras,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CobrarAnalisisCarterasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCobrarAnalisisCarteras.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCobrarAnalisisCarteras.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CobrarAnalisisCarterasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CobrarAnalisisCarterasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCobrarAnalisisCarteras.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCobrarAnalisisCarteras.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCobrarAnalisisCarteras.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cobraranalisiscarterass.size()-1;
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
		//this.jTableDatosCobrarAnalisisCarteras.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCobrarAnalisisCarteras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCobrarAnalisisCarteras();
			
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
				
				//this.isEsNuevoCobrarAnalisisCarteras=false;
					
				CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
			
				if(this.cobraranalisiscarterasSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarAnalisisCarteras.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarAnalisisCarteras.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarteras =(CobrarAnalisisCarteras) this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobraranalisiscarteras =(CobrarAnalisisCarteras) this.cobraranalisiscarterass.toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cobraranalisiscarteras.getsType().equals("DUPLICADO")
				   || this.cobraranalisiscarteras.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCobrarAnalisisCarteras=true;
				
				} else {
					this.isEsNuevoCobrarAnalisisCarteras=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {
					if(this.cobraranalisiscarteras.getId()>=0 && !this.cobraranalisiscarteras.getIsNew()) {						
						this.isEsNuevoCobrarAnalisisCarteras=false;
						
					} else {
						this.isEsNuevoCobrarAnalisisCarteras=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCobrarAnalisisCarteras(esRelaciones);						
				
				this.seleccionarCobrarAnalisisCarteras(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cobraranalisiscarteras.getId()<0) {
					this.isEsNuevoCobrarAnalisisCarteras=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCobrarAnalisisCarteras(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCobrarAnalisisCarteras(evt,rowIndex);
				}	
				
				if(this.cobraranalisiscarterasSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CobrarAnalisisCarteras: " + this.dDif); 
					}
				}								
				
				CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCobrarAnalisisCarteras(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cobraranalisiscarteras)) {
					if(this.cobraranalisiscarteras.getId()>0) {
						this.cobraranalisiscarteras.setIsDeleted(true);
						
						this.cobraranalisiscarterassEliminados.add(this.cobraranalisiscarteras);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().remove(this.cobraranalisiscarteras);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobraranalisiscarterass.remove(this.cobraranalisiscarteras);				
					}
					
					
					((CobrarAnalisisCarterasModel) this.jTableDatosCobrarAnalisisCarteras.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarAnalisisCarteras(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCobrarAnalisisCarteras(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCobrarAnalisisCarteras) {
			
			if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarAnalisisCarteras.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarAnalisisCarteras.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarteras =(CobrarAnalisisCarteras) this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobraranalisiscarteras =(CobrarAnalisisCarteras) this.cobraranalisiscarterass.toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CobrarAnalisisCarterasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCobrarAnalisisCarteras(this.cobraranalisiscarteras);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCobrarAnalisisCarteras("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCobrarAnalisisCarteras(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarAnalisisCarteras() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarAnalisisCarteras(CobrarAnalisisCarteras cobraranalisiscarteras) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCobrarAnalisisCarteras(cobraranalisiscarteras,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarAnalisisCarteras(CobrarAnalisisCarteras cobraranalisiscarteras,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCobrarAnalisisCarteras(cobraranalisiscarteras);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCobrarAnalisisCarteras(cobraranalisiscarteras,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCobrarAnalisisCarteras(cobraranalisiscarteras);
	}
	
	public void setVariablesObjetoActualToFormularioCobrarAnalisisCarteras(CobrarAnalisisCarteras cobraranalisiscarteras) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTextAreanombre_tipo_radio_venciCobrarAnalisisCarteras.setText(cobraranalisiscarteras.getnombre_tipo_radio_venci());
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTextFielddia_desdeCobrarAnalisisCarteras.setText(cobraranalisiscarteras.getdia_desde().toString());
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTextFielddia_hastaCobrarAnalisisCarteras.setText(cobraranalisiscarteras.getdia_hasta().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CobrarAnalisisCarteras cobraranalisiscarterasLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cobraranalisiscarterasLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CobrarAnalisisCarteras cobraranalisiscarterasLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cobraranalisiscarterasLocal=this.cobraranalisiscarteras;
			} else {
				cobraranalisiscarterasLocal=this.cobraranalisiscarterasAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cobraranalisiscarterasLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCobrarAnalisisCarteras(cobraranalisiscarterasLocal,true);
					
					if(cobraranalisiscarterasSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cobraranalisiscarterasLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cobraranalisiscarterasLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCobrarAnalisisCarteras(CobrarAnalisisCarteras cobraranalisiscarteras,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarAnalisisCarteras(cobraranalisiscarteras,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarAnalisisCarteras(cobraranalisiscarteras);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarAnalisisCarteras(CobrarAnalisisCarteras cobraranalisiscarteras,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarAnalisisCarteras(cobraranalisiscarteras,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarAnalisisCarteras(CobrarAnalisisCarteras cobraranalisiscarteras,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			cobraranalisiscarteras.setnombre_tipo_radio_venci(this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTextAreanombre_tipo_radio_venciCobrarAnalisisCarteras.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarAnalisisCarterasConstantesFunciones.LABEL_NOMBRETIPORADIOVENCI+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jLabelnombre_tipo_radio_venciCobrarAnalisisCarteras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobraranalisiscarteras.setdia_desde(Integer.parseInt(this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTextFielddia_desdeCobrarAnalisisCarteras.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarAnalisisCarterasConstantesFunciones.LABEL_DIADESDE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jLabeldia_desdeCobrarAnalisisCarteras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobraranalisiscarteras.setdia_hasta(Integer.parseInt(this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTextFielddia_hastaCobrarAnalisisCarteras.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarAnalisisCarterasConstantesFunciones.LABEL_DIAHASTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jLabeldia_hastaCobrarAnalisisCarteras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarAnalisisCarteras(CobrarAnalisisCarteras cobraranalisiscarterasBean,CobrarAnalisisCarteras cobraranalisiscarteras,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCobrarAnalisisCarteras(CobrarAnalisisCarteras cobraranalisiscarterasOrigen,CobrarAnalisisCarteras cobraranalisiscarteras,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobraranalisiscarterasOrigen.getId()!=null && !cobraranalisiscarterasOrigen.getId().equals(0L))) {cobraranalisiscarteras.setId(cobraranalisiscarterasOrigen.getId());}}
			if(conDefault || (!conDefault && cobraranalisiscarterasOrigen.getid_empresa()!=null && !cobraranalisiscarterasOrigen.getid_empresa().equals(0L))) {cobraranalisiscarteras.setid_empresa(cobraranalisiscarterasOrigen.getid_empresa());}
			if(conDefault || (!conDefault && cobraranalisiscarterasOrigen.getnombre_tipo_radio_venci()!=null && !cobraranalisiscarterasOrigen.getnombre_tipo_radio_venci().equals(""))) {cobraranalisiscarteras.setnombre_tipo_radio_venci(cobraranalisiscarterasOrigen.getnombre_tipo_radio_venci());}
			if(conDefault || (!conDefault && cobraranalisiscarterasOrigen.getdia_desde()!=null && !cobraranalisiscarterasOrigen.getdia_desde().equals(0))) {cobraranalisiscarteras.setdia_desde(cobraranalisiscarterasOrigen.getdia_desde());}
			if(conDefault || (!conDefault && cobraranalisiscarterasOrigen.getdia_hasta()!=null && !cobraranalisiscarterasOrigen.getdia_hasta().equals(0))) {cobraranalisiscarteras.setdia_hasta(cobraranalisiscarterasOrigen.getdia_hasta());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarAnalisisCarteras(CobrarAnalisisCarteras cobraranalisiscarteras) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTextAreanombre_tipo_radio_venciCobrarAnalisisCarteras.setText(cobraranalisiscarteras.getnombre_tipo_radio_venci());
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTextFielddia_desdeCobrarAnalisisCarteras.setText(cobraranalisiscarteras.getdia_desde().toString());
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTextFielddia_hastaCobrarAnalisisCarteras.setText(cobraranalisiscarteras.getdia_hasta().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarAnalisisCarteras(CobrarAnalisisCarterasBean cobraranalisiscarterasBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTextAreanombre_tipo_radio_venciCobrarAnalisisCarteras.setText(cobraranalisiscarterasBean.getnombre_tipo_radio_venci());
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTextFielddia_desdeCobrarAnalisisCarteras.setText(cobraranalisiscarterasBean.getdia_desde().toString());
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTextFielddia_hastaCobrarAnalisisCarteras.setText(cobraranalisiscarterasBean.getdia_hasta().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCobrarAnalisisCarteras(CobrarAnalisisCarterasParameterReturnGeneral cobraranalisiscarterasReturnGeneral,CobrarAnalisisCarterasBean cobraranalisiscarterasBean,Boolean conDefault) throws Exception { 
		try {
			CobrarAnalisisCarteras cobraranalisiscarterasLocal=new CobrarAnalisisCarteras();
			
			cobraranalisiscarterasLocal=cobraranalisiscarterasReturnGeneral.getCobrarAnalisisCarteras();
			
			
			if(conDefault || (!conDefault && cobraranalisiscarterasLocal.getnombre_tipo_radio_venci()!=null && !cobraranalisiscarterasLocal.getnombre_tipo_radio_venci().equals(""))) {cobraranalisiscarterasBean.setnombre_tipo_radio_venci(cobraranalisiscarterasLocal.getnombre_tipo_radio_venci());}
			if(conDefault || (!conDefault && cobraranalisiscarterasLocal.getdia_desde()!=null && !cobraranalisiscarterasLocal.getdia_desde().equals(0))) {cobraranalisiscarterasBean.setdia_desde(cobraranalisiscarterasLocal.getdia_desde());}
			if(conDefault || (!conDefault && cobraranalisiscarterasLocal.getdia_hasta()!=null && !cobraranalisiscarterasLocal.getdia_hasta().equals(0))) {cobraranalisiscarterasBean.setdia_hasta(cobraranalisiscarterasLocal.getdia_hasta());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCobrarAnalisisCarterasGenerico(Long idCobrarAnalisisCarterasSeleccionado,JComboBox jComboBoxCobrarAnalisisCarteras,List<CobrarAnalisisCarteras> cobraranalisiscarterassLocal)throws Exception {
		try {
			CobrarAnalisisCarteras  cobraranalisiscarterasTemp=null;

			for(CobrarAnalisisCarteras cobraranalisiscarterasAux:cobraranalisiscarterassLocal) {
				if(cobraranalisiscarterasAux.getId()!=null && cobraranalisiscarterasAux.getId().equals(idCobrarAnalisisCarterasSeleccionado)) {
					cobraranalisiscarterasTemp=cobraranalisiscarterasAux;
					break;
				}
			}

			jComboBoxCobrarAnalisisCarteras.setSelectedItem(cobraranalisiscarterasTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCobrarAnalisisCarterasGenerico(JComboBox jComboBoxCobrarAnalisisCarteras,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCobrarAnalisisCarteras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarAnalisisCarteras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCobrarAnalisisCarteras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarAnalisisCarteras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarAnalisisCarteras.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCobrarAnalisisCarteras.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarAnalisisCarteras.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCobrarAnalisisCarteras.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCobrarAnalisisCarteras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCobrarAnalisisCarteras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobraranalisiscarteras=(CobrarAnalisisCarteras) cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobraranalisiscarteras =(CobrarAnalisisCarteras) cobraranalisiscarterass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CobrarAnalisisCarteras cobraranalisiscarterasRow=new CobrarAnalisisCarteras();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobraranalisiscarterasRow=(CobrarAnalisisCarteras) cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobraranalisiscarterasRow=(CobrarAnalisisCarteras) cobraranalisiscarterass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCobrarAnalisisCarteras(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaNuevoCobrarAnalisisCarteras && this.isPermisoNuevoCobrarAnalisisCarteras));			
			this.jButtonDuplicarCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaDuplicarCobrarAnalisisCarteras && this.isPermisoDuplicarCobrarAnalisisCarteras));			
			this.jButtonCopiarCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaCopiarCobrarAnalisisCarteras && this.isPermisoCopiarCobrarAnalisisCarteras));
			this.jButtonVerFormCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaVerFormCobrarAnalisisCarteras && this.isPermisoVerFormCobrarAnalisisCarteras));
			
			this.jButtonAbrirOrderByCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaOrdenCobrarAnalisisCarteras && this.isPermisoOrdenCobrarAnalisisCarteras));			
			
			this.jButtonNuevoRelacionesCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarAnalisisCarteras && this.isPermisoNuevoCobrarAnalisisCarteras));			
			this.jButtonNuevoGuardarCambiosCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaNuevoCobrarAnalisisCarteras && this.isPermisoNuevoCobrarAnalisisCarteras && this.isPermisoGuardarCambiosCobrarAnalisisCarteras));
			
			if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) {
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonModificarCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaModificarCobrarAnalisisCarteras && this.isPermisoActualizarCobrarAnalisisCarteras));	
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonActualizarCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaActualizarCobrarAnalisisCarteras && this.isPermisoActualizarCobrarAnalisisCarteras));	
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonEliminarCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaEliminarCobrarAnalisisCarteras && this.isPermisoEliminarCobrarAnalisisCarteras));
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonCancelarCobrarAnalisisCarteras.setVisible(this.isVisibilidadCeldaCancelarCobrarAnalisisCarteras);							
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonGuardarCambiosCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaGuardarCobrarAnalisisCarteras && this.isPermisoGuardarCambiosCobrarAnalisisCarteras));			
			
			}
						
			this.jButtonGuardarCambiosTablaCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarAnalisisCarteras && this.isPermisoGuardarCambiosCobrarAnalisisCarteras));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaNuevoCobrarAnalisisCarteras && this.isPermisoNuevoCobrarAnalisisCarteras));						
			this.jButtonDuplicarToolBarCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaDuplicarCobrarAnalisisCarteras && this.isPermisoDuplicarCobrarAnalisisCarteras));						
			this.jButtonCopiarToolBarCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaCopiarCobrarAnalisisCarteras && this.isPermisoCopiarCobrarAnalisisCarteras));			
			this.jButtonVerFormToolBarCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaVerFormCobrarAnalisisCarteras && this.isPermisoVerFormCobrarAnalisisCarteras));			
			this.jButtonAbrirOrderByToolBarCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaOrdenCobrarAnalisisCarteras && this.isPermisoOrdenCobrarAnalisisCarteras));
			this.jButtonNuevoRelacionesToolBarCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarAnalisisCarteras && this.isPermisoNuevoCobrarAnalisisCarteras));			
			this.jButtonNuevoGuardarCambiosToolBarCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaNuevoCobrarAnalisisCarteras && this.isPermisoNuevoCobrarAnalisisCarteras && this.isPermisoGuardarCambiosCobrarAnalisisCarteras));			
			
			if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) {
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonModificarToolBarCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaModificarCobrarAnalisisCarteras && this.isPermisoActualizarCobrarAnalisisCarteras));	
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonActualizarToolBarCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaActualizarCobrarAnalisisCarteras  && this.isPermisoActualizarCobrarAnalisisCarteras));	
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonEliminarToolBarCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaEliminarCobrarAnalisisCarteras && this.isPermisoEliminarCobrarAnalisisCarteras));
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonCancelarToolBarCobrarAnalisisCarteras.setVisible(this.isVisibilidadCeldaCancelarCobrarAnalisisCarteras);				
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonGuardarCambiosToolBarCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaGuardarCobrarAnalisisCarteras && this.isPermisoGuardarCambiosCobrarAnalisisCarteras));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarAnalisisCarteras && this.isPermisoGuardarCambiosCobrarAnalisisCarteras));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaNuevoCobrarAnalisisCarteras && this.isPermisoNuevoCobrarAnalisisCarteras));			
			this.jMenuItemDuplicarCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaDuplicarCobrarAnalisisCarteras && this.isPermisoDuplicarCobrarAnalisisCarteras));			
			this.jMenuItemCopiarCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaCopiarCobrarAnalisisCarteras && this.isPermisoCopiarCobrarAnalisisCarteras));			
			this.jMenuItemVerFormCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaVerFormCobrarAnalisisCarteras && this.isPermisoVerFormCobrarAnalisisCarteras));			
			this.jMenuItemAbrirOrderByCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaOrdenCobrarAnalisisCarteras && this.isPermisoOrdenCobrarAnalisisCarteras));			
			//this.jMenuItemMostrarOcultarCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaOrdenCobrarAnalisisCarteras && this.isPermisoOrdenCobrarAnalisisCarteras));
			this.jMenuItemDetalleAbrirOrderByCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaOrdenCobrarAnalisisCarteras && this.isPermisoOrdenCobrarAnalisisCarteras));			
			//this.jMenuItemDetalleMostrarOcultarCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaOrdenCobrarAnalisisCarteras && this.isPermisoOrdenCobrarAnalisisCarteras));			
			this.jMenuItemNuevoRelacionesCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarAnalisisCarteras && this.isPermisoNuevoCobrarAnalisisCarteras));			
			this.jMenuItemNuevoGuardarCambiosCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaNuevoCobrarAnalisisCarteras && this.isPermisoNuevoCobrarAnalisisCarteras && this.isPermisoGuardarCambiosCobrarAnalisisCarteras));									
			
			if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) {
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jMenuItemModificarCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaModificarCobrarAnalisisCarteras && this.isPermisoActualizarCobrarAnalisisCarteras));	
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jMenuItemActualizarCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaActualizarCobrarAnalisisCarteras && this.isPermisoActualizarCobrarAnalisisCarteras));	
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jMenuItemEliminarCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaEliminarCobrarAnalisisCarteras && this.isPermisoEliminarCobrarAnalisisCarteras));
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jMenuItemCancelarCobrarAnalisisCarteras.setVisible(this.isVisibilidadCeldaCancelarCobrarAnalisisCarteras);				
			}
			
			this.jMenuItemGuardarCambiosCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaGuardarCobrarAnalisisCarteras && this.isPermisoGuardarCambiosCobrarAnalisisCarteras));						
			this.jMenuItemGuardarCambiosTablaCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarAnalisisCarteras && this.isPermisoGuardarCambiosCobrarAnalisisCarteras));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCobrarAnalisisCarteras=this.jButtonNuevoCobrarAnalisisCarteras.isVisible();
			this.isVisibilidadCeldaDuplicarCobrarAnalisisCarteras=this.jButtonDuplicarCobrarAnalisisCarteras.isVisible();
			this.isVisibilidadCeldaCopiarCobrarAnalisisCarteras=this.jButtonCopiarCobrarAnalisisCarteras.isVisible();
			this.isVisibilidadCeldaVerFormCobrarAnalisisCarteras=this.jButtonVerFormCobrarAnalisisCarteras.isVisible();
			
			this.isVisibilidadCeldaOrdenCobrarAnalisisCarteras=this.jButtonAbrirOrderByCobrarAnalisisCarteras.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCobrarAnalisisCarteras=this.jButtonNuevoRelacionesCobrarAnalisisCarteras.isVisible();
			this.isVisibilidadCeldaModificarCobrarAnalisisCarteras=this.jButtonModificarCobrarAnalisisCarteras.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) {
			this.isVisibilidadCeldaActualizarCobrarAnalisisCarteras=this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonActualizarCobrarAnalisisCarteras.isVisible();
			this.isVisibilidadCeldaEliminarCobrarAnalisisCarteras=this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonEliminarCobrarAnalisisCarteras.isVisible();
			this.isVisibilidadCeldaCancelarCobrarAnalisisCarteras=this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonCancelarCobrarAnalisisCarteras.isVisible();
			this.isVisibilidadCeldaGuardarCobrarAnalisisCarteras=this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonGuardarCambiosCobrarAnalisisCarteras.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCobrarAnalisisCarteras=this.jButtonGuardarCambiosTablaCobrarAnalisisCarteras.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCobrarAnalisisCarteras=this.jButtonNuevoToolBarCobrarAnalisisCarteras.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarAnalisisCarteras=this.jButtonNuevoRelacionesToolBarCobrarAnalisisCarteras.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) {
			this.isVisibilidadCeldaModificarCobrarAnalisisCarteras=this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonModificarToolBarCobrarAnalisisCarteras.isVisible();
			this.isVisibilidadCeldaActualizarCobrarAnalisisCarteras=this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonActualizarToolBarCobrarAnalisisCarteras.isVisible();
			this.isVisibilidadCeldaEliminarCobrarAnalisisCarteras=this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonEliminarToolBarCobrarAnalisisCarteras.isVisible();
			this.isVisibilidadCeldaCancelarCobrarAnalisisCarteras=this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonCancelarToolBarCobrarAnalisisCarteras.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarAnalisisCarteras=this.jButtonGuardarCambiosToolBarCobrarAnalisisCarteras.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarAnalisisCarteras=this.jButtonGuardarCambiosTablaToolBarCobrarAnalisisCarteras.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCobrarAnalisisCarteras=this.jMenuItemNuevoCobrarAnalisisCarteras.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarAnalisisCarteras=this.jMenuItemNuevoRelacionesCobrarAnalisisCarteras.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) {
			this.isVisibilidadCeldaModificarCobrarAnalisisCarteras=this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jMenuItemModificarCobrarAnalisisCarteras.isVisible();
			this.isVisibilidadCeldaActualizarCobrarAnalisisCarteras=this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jMenuItemActualizarCobrarAnalisisCarteras.isVisible();
			this.isVisibilidadCeldaEliminarCobrarAnalisisCarteras=this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jMenuItemEliminarCobrarAnalisisCarteras.isVisible();
			this.isVisibilidadCeldaCancelarCobrarAnalisisCarteras=this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jMenuItemCancelarCobrarAnalisisCarteras.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarAnalisisCarteras=this.jMenuItemGuardarCambiosCobrarAnalisisCarteras.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarAnalisisCarteras=this.jMenuItemGuardarCambiosTablaCobrarAnalisisCarteras.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCobrarAnalisisCarteras(Boolean esInicializar) {
		if(CobrarAnalisisCarterasJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cobraranalisiscarterasSessionBean.getConGuardarRelaciones()) {
				//if(this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarAnalisisCarteras();
			}
			
			this.inicializarActualizarBindingBotonesManualCobrarAnalisisCarteras(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCobrarAnalisisCarteras() {
		this.jButtonNuevoCobrarAnalisisCarteras.setVisible(this.isPermisoNuevoCobrarAnalisisCarteras);			
		this.jButtonDuplicarCobrarAnalisisCarteras.setVisible(this.isPermisoDuplicarCobrarAnalisisCarteras);			
		this.jButtonCopiarCobrarAnalisisCarteras.setVisible(this.isPermisoCopiarCobrarAnalisisCarteras);			
		this.jButtonVerFormCobrarAnalisisCarteras.setVisible(this.isPermisoVerFormCobrarAnalisisCarteras);			
		
		this.jButtonAbrirOrderByCobrarAnalisisCarteras.setVisible(this.isPermisoOrdenCobrarAnalisisCarteras);					
		
		this.jButtonNuevoRelacionesCobrarAnalisisCarteras.setVisible(this.isPermisoNuevoCobrarAnalisisCarteras);			
		
		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonModificarCobrarAnalisisCarteras.setVisible(this.isPermisoActualizarCobrarAnalisisCarteras);	
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonActualizarCobrarAnalisisCarteras.setVisible(this.isPermisoActualizarCobrarAnalisisCarteras);	
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonEliminarCobrarAnalisisCarteras.setVisible(this.isPermisoEliminarCobrarAnalisisCarteras);
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonCancelarCobrarAnalisisCarteras.setVisible(this.isVisibilidadCeldaCancelarCobrarAnalisisCarteras);						
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonGuardarCambiosCobrarAnalisisCarteras.setVisible(this.isPermisoGuardarCambiosCobrarAnalisisCarteras);							
		}
		
		this.jButtonGuardarCambiosTablaCobrarAnalisisCarteras.setVisible(this.isPermisoActualizarCobrarAnalisisCarteras);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarAnalisisCarteras() {
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonModificarCobrarAnalisisCarteras.setVisible(this.isPermisoActualizarCobrarAnalisisCarteras);	
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonActualizarCobrarAnalisisCarteras.setVisible(this.isPermisoActualizarCobrarAnalisisCarteras);	
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonEliminarCobrarAnalisisCarteras.setVisible(this.isPermisoEliminarCobrarAnalisisCarteras);
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonCancelarCobrarAnalisisCarteras.setVisible(this.isVisibilidadCeldaCancelarCobrarAnalisisCarteras);							
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonGuardarCambiosCobrarAnalisisCarteras.setVisible((this.isVisibilidadCeldaGuardarCobrarAnalisisCarteras && this.isPermisoGuardarCambiosCobrarAnalisisCarteras));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCobrarAnalisisCarteras() {
		if(CobrarAnalisisCarterasJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCobrarAnalisisCarteras();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCobrarAnalisisCarteras() {
	}
	
	public void jTableDatosCobrarAnalisisCarterasListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCobrarAnalisisCarteras(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCobrarAnalisisCarterasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarterasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarAnalisisCarteras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarAnalisisCarteras(this.getcobraranalisiscarteras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarAnalisisCarteras(this.cobraranalisiscarteras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobraranalisiscarteras =(CobrarAnalisisCarteras) this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobraranalisiscarteras =(CobrarAnalisisCarteras) this.cobraranalisiscarterass.toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobraranalisiscarteras==null) {
						this.cobraranalisiscarteras = new CobrarAnalisisCarteras();
					}

					this.setVariablesFormularioToObjetoActualCobrarAnalisisCarteras(this.cobraranalisiscarteras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarAnalisisCarteras(this.cobraranalisiscarteras);
				}

				if(this.cobraranalisiscarteras.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cobraranalisiscarteras.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarAnalisisCarteras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarterasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarterasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarterasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCobrarAnalisisCarterasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarterasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarAnalisisCarteras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarAnalisisCarteras(this.getcobraranalisiscarteras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarAnalisisCarteras(this.cobraranalisiscarteras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobraranalisiscarteras =(CobrarAnalisisCarteras) this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobraranalisiscarteras =(CobrarAnalisisCarteras) this.cobraranalisiscarterass.toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobraranalisiscarteras==null) {
						this.cobraranalisiscarteras = new CobrarAnalisisCarteras();
					}

					this.setVariablesFormularioToObjetoActualCobrarAnalisisCarteras(this.cobraranalisiscarteras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarAnalisisCarteras(this.cobraranalisiscarteras);
				}

				if(this.cobraranalisiscarteras.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cobraranalisiscarteras.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarAnalisisCarteras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarterasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarterasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarterasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_tipo_radio_venciCobrarAnalisisCarterasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarterasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarAnalisisCarteras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarAnalisisCarteras(this.getcobraranalisiscarteras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarAnalisisCarteras(this.cobraranalisiscarteras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobraranalisiscarteras =(CobrarAnalisisCarteras) this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobraranalisiscarteras =(CobrarAnalisisCarteras) this.cobraranalisiscarterass.toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobraranalisiscarteras==null) {
						this.cobraranalisiscarteras = new CobrarAnalisisCarteras();
					}

					this.setVariablesFormularioToObjetoActualCobrarAnalisisCarteras(this.cobraranalisiscarteras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarAnalisisCarteras(this.cobraranalisiscarteras);
				}

				if(this.cobraranalisiscarteras.getnombre_tipo_radio_venci()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_tipo_radio_venci like '%"+this.cobraranalisiscarteras.getnombre_tipo_radio_venci()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarAnalisisCarteras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarterasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarterasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarterasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondia_desdeCobrarAnalisisCarterasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarterasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarAnalisisCarteras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarAnalisisCarteras(this.getcobraranalisiscarteras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarAnalisisCarteras(this.cobraranalisiscarteras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobraranalisiscarteras =(CobrarAnalisisCarteras) this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobraranalisiscarteras =(CobrarAnalisisCarteras) this.cobraranalisiscarterass.toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobraranalisiscarteras==null) {
						this.cobraranalisiscarteras = new CobrarAnalisisCarteras();
					}

					this.setVariablesFormularioToObjetoActualCobrarAnalisisCarteras(this.cobraranalisiscarteras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarAnalisisCarteras(this.cobraranalisiscarteras);
				}

				if(this.cobraranalisiscarteras.getdia_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dia_desde = "+this.cobraranalisiscarteras.getdia_desde().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarAnalisisCarteras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarterasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarterasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarterasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondia_hastaCobrarAnalisisCarterasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarterasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarAnalisisCarteras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarAnalisisCarteras(this.getcobraranalisiscarteras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarAnalisisCarteras(this.cobraranalisiscarteras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobraranalisiscarteras =(CobrarAnalisisCarteras) this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobraranalisiscarteras =(CobrarAnalisisCarteras) this.cobraranalisiscarterass.toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobraranalisiscarteras==null) {
						this.cobraranalisiscarteras = new CobrarAnalisisCarteras();
					}

					this.setVariablesFormularioToObjetoActualCobrarAnalisisCarteras(this.cobraranalisiscarteras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarAnalisisCarteras(this.cobraranalisiscarteras);
				}

				if(this.cobraranalisiscarteras.getdia_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dia_hasta = "+this.cobraranalisiscarteras.getdia_hasta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarAnalisisCarteras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarterasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarterasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarterasLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaCobrarAnalisisCarterasCobrarAnalisisCarterasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarAnalisisCarteras(false,false);

			this.getCobrarAnalisisCarterassBusquedaCobrarAnalisisCarteras();

			this.inicializarActualizarBindingCobrarAnalisisCarteras(false);

			//if(CobrarAnalisisCarterasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarAnalisisCarteras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobraranalisiscarterasLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCobrarAnalisisCarteras() {
		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) {
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.setVisible(false);	    			
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.dispose();
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras!=null) {
			this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.dispose();
			this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras=null;
		}
		
		if(this.jInternalFrameImportacionCobrarAnalisisCarteras!=null) {
			this.jInternalFrameImportacionCobrarAnalisisCarteras.setVisible(false);	    			
			this.jInternalFrameImportacionCobrarAnalisisCarteras.dispose();
			this.jInternalFrameImportacionCobrarAnalisisCarteras=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCobrarAnalisisCarteras();
			
			CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
			
			
			if(sTipo.equals("NuevoCobrarAnalisisCarteras")) {
				jButtonNuevoCobrarAnalisisCarterasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCobrarAnalisisCarteras")) {
				jButtonDuplicarCobrarAnalisisCarterasActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCobrarAnalisisCarteras")) {
				jButtonCopiarCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("VerFormCobrarAnalisisCarteras")) {
				jButtonVerFormCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCobrarAnalisisCarteras")) {
				jButtonNuevoCobrarAnalisisCarterasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCobrarAnalisisCarteras")) {
				jButtonDuplicarCobrarAnalisisCarterasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCobrarAnalisisCarteras")) {
				jButtonNuevoCobrarAnalisisCarterasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCobrarAnalisisCarteras")) {
				jButtonDuplicarCobrarAnalisisCarterasActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCobrarAnalisisCarteras")) {
				jButtonNuevoCobrarAnalisisCarterasActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCobrarAnalisisCarteras")) {
				jButtonNuevoCobrarAnalisisCarterasActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCobrarAnalisisCarteras")) {
				jButtonNuevoCobrarAnalisisCarterasActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCobrarAnalisisCarteras")) {
				jButtonModificarCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCobrarAnalisisCarteras")) {
				jButtonModificarCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCobrarAnalisisCarteras")) {
				jButtonModificarCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCobrarAnalisisCarteras")) {
				jButtonActualizarCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCobrarAnalisisCarteras")) {
				jButtonActualizarCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCobrarAnalisisCarteras")) {
				jButtonActualizarCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("EliminarCobrarAnalisisCarteras")) {
				jButtonEliminarCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCobrarAnalisisCarteras")) {
				jButtonEliminarCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCobrarAnalisisCarteras")) {
				jButtonEliminarCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("CancelarCobrarAnalisisCarteras")) {
				jButtonCancelarCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCobrarAnalisisCarteras")) {
				jButtonCancelarCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCobrarAnalisisCarteras")) {
				jButtonCancelarCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("CerrarCobrarAnalisisCarteras")) {
				jButtonCerrarCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCobrarAnalisisCarteras")) {
				jButtonCerrarCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCobrarAnalisisCarteras")) {
				jButtonCerrarCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCobrarAnalisisCarteras")) {
				jButtonMostrarOcultarCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCobrarAnalisisCarteras")) {
				jButtonCancelarCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCobrarAnalisisCarteras")) {
				jButtonGuardarCambiosCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCobrarAnalisisCarteras")) {
				jButtonGuardarCambiosCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCobrarAnalisisCarteras")) {
				jButtonCopiarCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCobrarAnalisisCarteras")) {
				jButtonVerFormCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCobrarAnalisisCarteras")) {
				jButtonGuardarCambiosCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCobrarAnalisisCarteras")) {
				jButtonCopiarCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCobrarAnalisisCarteras")) {
				jButtonVerFormCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCobrarAnalisisCarteras")) {
				jButtonGuardarCambiosCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCobrarAnalisisCarteras")) {
				jButtonGuardarCambiosCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCobrarAnalisisCarteras")) {
				jButtonGuardarCambiosCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCobrarAnalisisCarteras")) {
				jButtonRecargarInformacionCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCobrarAnalisisCarteras")) {
				jButtonRecargarInformacionCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCobrarAnalisisCarteras")) {
				jButtonRecargarInformacionCobrarAnalisisCarterasActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCobrarAnalisisCarteras")) {
				jButtonAnterioresCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCobrarAnalisisCarteras")) {
				jButtonAnterioresCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCobrarAnalisisCarteras")) {
				jButtonAnterioresCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCobrarAnalisisCarteras")) {
				jButtonSiguientesCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCobrarAnalisisCarteras")) {
				jButtonSiguientesCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCobrarAnalisisCarteras")) {
				jButtonSiguientesCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCobrarAnalisisCarteras") || sTipo.equals("MenuItemDetalleAbrirOrderByCobrarAnalisisCarteras")) {
				jButtonAbrirOrderByCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCobrarAnalisisCarteras") || sTipo.equals("MenuItemDetalleMostrarOcultarCobrarAnalisisCarteras")) {
				jButtonMostrarOcultarCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarAnalisisCarteras")) {
				jButtonNuevoGuardarCambiosCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCobrarAnalisisCarteras")) {
				jButtonNuevoGuardarCambiosCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCobrarAnalisisCarteras")) {
				jButtonNuevoGuardarCambiosCobrarAnalisisCarterasActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCobrarAnalisisCarteras")) {
				jButtonCerrarReporteDinamicoCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCobrarAnalisisCarteras")) {
				jButtonGenerarReporteDinamicoCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCobrarAnalisisCarteras")) {
				
				jButtonGenerarExcelReporteDinamicoCobrarAnalisisCarterasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCobrarAnalisisCarteras")) {
				jButtonCerrarImportacionCobrarAnalisisCarterasActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCobrarAnalisisCarteras")) {
				
				jButtonGenerarImportacionCobrarAnalisisCarterasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCobrarAnalisisCarteras")) {
				
				jButtonAbrirImportacionCobrarAnalisisCarterasActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCobrarAnalisisCarteras")) {
				jComboBoxTiposAccionesCobrarAnalisisCarterasActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCobrarAnalisisCarteras")) {
				jComboBoxTiposRelacionesCobrarAnalisisCarterasActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCobrarAnalisisCarteras")) {
				jComboBoxTiposAccionesCobrarAnalisisCarterasActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCobrarAnalisisCarteras")) {
				
				jComboBoxTiposSeleccionarCobrarAnalisisCarterasActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCobrarAnalisisCarteras")) {
				jTextFieldValorCampoGeneralCobrarAnalisisCarterasActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCobrarAnalisisCarteras")) {
				jButtonAbrirOrderByCobrarAnalisisCarterasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCobrarAnalisisCarteras")) {
				jButtonAbrirOrderByCobrarAnalisisCarterasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCobrarAnalisisCarteras")) {
				jButtonCerrarOrderByCobrarAnalisisCarterasActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarAnalisisCarterasBusqueda")) {
				this.jButtonidCobrarAnalisisCarterasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarAnalisisCarterasBusqueda")) {
				this.jButtonid_empresaCobrarAnalisisCarterasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_radio_venciCobrarAnalisisCarterasBusqueda")) {
				this.jButtonnombre_tipo_radio_venciCobrarAnalisisCarterasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_desdeCobrarAnalisisCarterasBusqueda")) {
				this.jButtondia_desdeCobrarAnalisisCarterasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_hastaCobrarAnalisisCarterasBusqueda")) {
				this.jButtondia_hastaCobrarAnalisisCarterasBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras")) {
				this.jButtonBusquedaCobrarAnalisisCarterasCobrarAnalisisCarterasActionPerformed(evt);
			}
			
			;
			
			
			CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCobrarAnalisisCarteras();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarAnalisisCarterasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobraranalisiscarteras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobraranalisiscarteras);
				
				CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
				
				


				
				CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarAnalisisCarteras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarAnalisisCarteras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CobrarAnalisisCarteras cobraranalisiscarterasLocal=null;
			
			if(!this.getEsControlTabla()) {
				cobraranalisiscarterasLocal=this.cobraranalisiscarteras;
			} else {
				cobraranalisiscarterasLocal=this.cobraranalisiscarterasAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobraranalisiscarteras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobraranalisiscarteras);
				
				CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
							
				
				


				
				CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarAnalisisCarteras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarAnalisisCarteras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarAnalisisCarterasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarAnalisisCarteras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarterasAnterior =(CobrarAnalisisCarteras) this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobraranalisiscarterasAnterior =(CobrarAnalisisCarteras) this.cobraranalisiscarterass.toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
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
			
			CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
			
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
			
			


			
			CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarAnalisisCarterasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobraranalisiscarteras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobraranalisiscarteras);
				
				CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
								
						
				


				
				CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarAnalisisCarteras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarAnalisisCarteras.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobraranalisiscarteras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobraranalisiscarteras);
				
				CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
								
				
				


				
				CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarAnalisisCarteras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarAnalisisCarteras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarAnalisisCarterasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarAnalisisCarteras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarterasAnterior =(CobrarAnalisisCarteras) this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobraranalisiscarterasAnterior =(CobrarAnalisisCarteras) this.cobraranalisiscarterass.toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobraranalisiscarteras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobraranalisiscarteras);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarAnalisisCarterasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarAnalisisCarteras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarterasAnterior =(CobrarAnalisisCarteras) this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobraranalisiscarterasAnterior =(CobrarAnalisisCarteras) this.cobraranalisiscarterass.toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarAnalisisCarterasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobraranalisiscarteras);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobraranalisiscarteras);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobraranalisiscarteras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobraranalisiscarteras);
				
				CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
							
				
				


				
				CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarAnalisisCarteras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarAnalisisCarteras.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarAnalisisCarterasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarAnalisisCarteras.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobraranalisiscarterasAnterior =(CobrarAnalisisCarteras) this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobraranalisiscarterasAnterior =(CobrarAnalisisCarteras) this.cobraranalisiscarterass.toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
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
			
			CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
			
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
			
			


			
			CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarAnalisisCarterasActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobraranalisiscarteras);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobraranalisiscarteras);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobraranalisiscarteras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobraranalisiscarteras);
				
				CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
								
				
				


				
				CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarAnalisisCarteras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarAnalisisCarteras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarAnalisisCarterasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarAnalisisCarteras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarterasAnterior =(CobrarAnalisisCarteras) this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobraranalisiscarterasAnterior =(CobrarAnalisisCarteras) this.cobraranalisiscarterass.toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarAnalisisCarterasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobraranalisiscarteras);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobraranalisiscarteras);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarAnalisisCarterasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobraranalisiscarteras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobraranalisiscarteras);
				
				CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCobrarAnalisisCarteras")) {
					jCheckBoxSeleccionarTodosCobrarAnalisisCarterasItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCobrarAnalisisCarteras")) {
					jCheckBoxSeleccionadosCobrarAnalisisCarterasItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCobrarAnalisisCarteras")) {
					
				}
				
				


				
				
				CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarAnalisisCarteras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarAnalisisCarteras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cobraranalisiscarteras);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cobraranalisiscarteras);
				
				CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
												
				
				


				
				
				CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarAnalisisCarteras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarAnalisisCarteras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarAnalisisCarterasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarAnalisisCarteras.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobraranalisiscarterasAnterior =(CobrarAnalisisCarteras) this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobraranalisiscarterasAnterior =(CobrarAnalisisCarteras) this.cobraranalisiscarterass.toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarAnalisisCarterasActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobraranalisiscarteras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobraranalisiscarteras);
				
				CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
				
				
				CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
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
			
			CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
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
			
			


			
			CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarAnalisisCarterasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobraranalisiscarteras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobraranalisiscarteras);
				
				CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarAnalisisCarteras.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarAnalisisCarteras.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobraranalisiscarteras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobraranalisiscarteras);
				
				CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
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
				
				


				
				CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarAnalisisCarteras.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarAnalisisCarteras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarAnalisisCarterasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarAnalisisCarteras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobraranalisiscarterasAnterior =(CobrarAnalisisCarteras) this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobraranalisiscarterasAnterior =(CobrarAnalisisCarteras) this.cobraranalisiscarterass.toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCobrarAnalisisCarteras")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCobrarAnalisisCarterasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCobrarAnalisisCarteras.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cobraranalisiscarteras =(CobrarAnalisisCarteras) this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cobraranalisiscarteras =(CobrarAnalisisCarteras) this.cobraranalisiscarterass.toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cobraranalisiscarteras);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCobrarAnalisisCarteras")) {
				
				}
				
				CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCobrarAnalisisCarteras")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCobrarAnalisisCarteras.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCobrarAnalisisCarteras")) {
			
			}
			
			CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCobrarAnalisisCarteras();
			
			CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
			
			if(sTipo.equals("NuevoCobrarAnalisisCarteras")) {
				jButtonNuevoCobrarAnalisisCarterasActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCobrarAnalisisCarteras")) {
				jButtonDuplicarCobrarAnalisisCarterasActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCobrarAnalisisCarteras")) {
				jButtonCopiarCobrarAnalisisCarterasActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCobrarAnalisisCarteras")) {
				jButtonVerFormCobrarAnalisisCarterasActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCobrarAnalisisCarteras")) {
				jButtonNuevoCobrarAnalisisCarterasActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCobrarAnalisisCarteras")) {
				jButtonModificarCobrarAnalisisCarterasActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCobrarAnalisisCarteras")) {
				jButtonActualizarCobrarAnalisisCarterasActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCobrarAnalisisCarteras")) {
				jButtonEliminarCobrarAnalisisCarterasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCobrarAnalisisCarteras")) {
				jButtonGuardarCambiosCobrarAnalisisCarterasActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCobrarAnalisisCarteras")) {
				jButtonCancelarCobrarAnalisisCarterasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCobrarAnalisisCarteras")) {
				jButtonCerrarCobrarAnalisisCarterasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCobrarAnalisisCarteras")) {
				jButtonGuardarCambiosCobrarAnalisisCarterasActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarAnalisisCarteras")) {
				jButtonNuevoGuardarCambiosCobrarAnalisisCarterasActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCobrarAnalisisCarteras")) {
				jButtonAbrirOrderByCobrarAnalisisCarterasActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCobrarAnalisisCarteras")) {
				jButtonRecargarInformacionCobrarAnalisisCarterasActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCobrarAnalisisCarteras")) {
				jButtonAnterioresCobrarAnalisisCarterasActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCobrarAnalisisCarteras")) {
				jButtonSiguientesCobrarAnalisisCarterasActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarAnalisisCarterasBusqueda")) {
				this.jButtonidCobrarAnalisisCarterasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarAnalisisCarterasBusqueda")) {
				this.jButtonid_empresaCobrarAnalisisCarterasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_radio_venciCobrarAnalisisCarterasBusqueda")) {
				this.jButtonnombre_tipo_radio_venciCobrarAnalisisCarterasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_desdeCobrarAnalisisCarterasBusqueda")) {
				this.jButtondia_desdeCobrarAnalisisCarterasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_hastaCobrarAnalisisCarterasBusqueda")) {
				this.jButtondia_hastaCobrarAnalisisCarterasBusquedaActionPerformed(evt);
			}
			
			CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCobrarAnalisisCarteras();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCobrarAnalisisCarteras")) {
				closingInternalFrameCobrarAnalisisCarteras();
				
			} else if(sTipo.equals("jButtonCancelarCobrarAnalisisCarteras")) {
				JInternalFrameBase jInternalFrameDetalleFormCobrarAnalisisCarteras = (JInternalFrameBase)evt.getSource();
	            	
	            CobrarAnalisisCarterasBeanSwingJInternalFrame jInternalFrameParent=(CobrarAnalisisCarterasBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarAnalisisCarteras.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCobrarAnalisisCarterasActionPerformed(null);
			}
			
			CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobraranalisiscarteras,new Object(),this.cobraranalisiscarterasParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCobrarAnalisisCarteras(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCobrarAnalisisCarteras(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCobrarAnalisisCarteras(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cobraranalisiscarteras)) {
			if(!esControlTabla) {
				if(CobrarAnalisisCarterasJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCobrarAnalisisCarteras(this.cobraranalisiscarteras,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarAnalisisCarteras(this.cobraranalisiscarteras);			
				}
				
				if(this.cobraranalisiscarterasSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCobrarAnalisisCarteras(this.cobraranalisiscarteras,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCobrarAnalisisCarteras(this.cobraranalisiscarterasReturnGeneral,this.cobraranalisiscarterasBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cobraranalisiscarterasSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCobrarAnalisisCarteras(classes,this.cobraranalisiscarterasReturnGeneral,this.cobraranalisiscarterasBean,false);
					}
						
					if(this.cobraranalisiscarterasReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCobrarAnalisisCarteras(this.cobraranalisiscarterasReturnGeneral.getCobrarAnalisisCarteras());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCobrarAnalisisCarteras(this.cobraranalisiscarterasReturnGeneral.getCobrarAnalisisCarteras());	
					}
						
					if(this.cobraranalisiscarterasReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCobrarAnalisisCarteras(this.cobraranalisiscarterasReturnGeneral.getCobrarAnalisisCarteras(),classes);//this.cobraranalisiscarterasBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCobrarAnalisisCarteras(this.cobraranalisiscarteras,classes);//this.cobraranalisiscarterasBean);									
				}
			
				if(CobrarAnalisisCarterasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCobrarAnalisisCarteras(this.cobraranalisiscarteras,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarAnalisisCarteras(this.cobraranalisiscarteras);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cobraranalisiscarterasAnterior!=null) {
						this.cobraranalisiscarteras=this.cobraranalisiscarterasAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cobraranalisiscarterasSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cobraranalisiscarterasReturnGeneral.getCobrarAnalisisCarteras(),cobraranalisiscarterasLogic.getCobrarAnalisisCarterass());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cobraranalisiscarterasReturnGeneral.getCobrarAnalisisCarteras(),this.cobraranalisiscarterass);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCobrarAnalisisCarteras.repaint();
				
				//((AbstractTableModel) this.jTableDatosCobrarAnalisisCarteras.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCobrarAnalisisCarteras();
			}
		}
	}
	
	public void actualizarVisualTableDatosCobrarAnalisisCarteras() throws Exception {
		
		CobrarAnalisisCarterasModel cobraranalisiscarterasModel=(CobrarAnalisisCarterasModel)this.jTableDatosCobrarAnalisisCarteras.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobraranalisiscarterasModel.cobraranalisiscarterass=this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cobraranalisiscarterasModel.cobraranalisiscarterass=this.cobraranalisiscarterass;
		}
		
		
		((CobrarAnalisisCarterasModel) this.jTableDatosCobrarAnalisisCarteras.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCobrarAnalisisCarteras() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcobraranalisiscarterasAnterior(),this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcobraranalisiscarterasAnterior(),this.cobraranalisiscarterass);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCobrarAnalisisCarteras();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCobrarAnalisisCarteras(CobrarAnalisisCarteras cobraranalisiscarteras,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
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
										
				CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobraranalisiscarteras,new Object(),generalEntityParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cobraranalisiscarterasSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CobrarAnalisisCarterasConstantesFunciones.getClassesRelationshipsOfCobrarAnalisisCarteras(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CobrarAnalisisCarterasConstantesFunciones.getClassesRelationshipsFromStringsOfCobrarAnalisisCarteras(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCobrarAnalisisCarteras(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobraranalisiscarteras,new Object(),generalEntityParameterGeneral,this.cobraranalisiscarterasReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCobrarAnalisisCarteras(CobrarAnalisisCarterasBean cobraranalisiscarterasBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCobrarAnalisisCarteras(ArrayList<Classe> classes,CobrarAnalisisCarterasReturnGeneral cobraranalisiscarterasReturnGeneral,CobrarAnalisisCarterasBean cobraranalisiscarterasBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCobrarAnalisisCarteras(CobrarAnalisisCarteras cobraranalisiscarteras,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cobraranalisiscarteras)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras = new CobrarAnalisisCarterasDetalleFormJInternalFrame(jDesktopPane,this.cobraranalisiscarterasSessionBean.getConGuardarRelaciones(),this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarAnalisisCarteras);
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.setVisible(false);
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.setSelected(false);						
		
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.cobraranalisiscarterasLogic=this.cobraranalisiscarterasLogic;
		
		this.cargarCombosFrameForeignKeyCobrarAnalisisCarteras("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarAnalisisCarteras();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarAnalisisCarteras();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCobrarAnalisisCarteras("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCobrarAnalisisCarteras();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarAnalisisCarteras"));
		
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonModificarCobrarAnalisisCarteras.addActionListener(new ButtonActionListener(this,"ModificarCobrarAnalisisCarteras"));

		
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonModificarToolBarCobrarAnalisisCarteras.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarAnalisisCarteras"));
					
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jMenuItemModificarCobrarAnalisisCarteras.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarAnalisisCarteras"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonActualizarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"ActualizarCobrarAnalisisCarteras"));
		
		
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonActualizarToolBarCobrarAnalisisCarteras.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarAnalisisCarteras"));
						
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jMenuItemActualizarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarAnalisisCarteras"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonEliminarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"EliminarCobrarAnalisisCarteras"));
		
		
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonEliminarToolBarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarAnalisisCarteras"));
								
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jMenuItemEliminarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarAnalisisCarteras"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonCancelarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"CancelarCobrarAnalisisCarteras"));
		
		
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonCancelarToolBarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarAnalisisCarteras"));
					
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jMenuItemCancelarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarAnalisisCarteras"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jMenuItemDetalleCerrarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarAnalisisCarteras"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonGuardarCambiosToolBarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarAnalisisCarteras"));
		
		
		
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonGuardarCambiosToolBarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarAnalisisCarteras"));
		
		
		
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jComboBoxTiposAccionesFormularioCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarAnalisisCarteras"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonidCobrarAnalisisCarterasBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarAnalisisCarterasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonid_empresaCobrarAnalisisCarterasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarAnalisisCarterasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonnombre_tipo_radio_venciCobrarAnalisisCarterasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_radio_venciCobrarAnalisisCarterasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtondia_desdeCobrarAnalisisCarterasBusqueda.addActionListener(new ButtonActionListener(this,"dia_desdeCobrarAnalisisCarterasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtondia_hastaCobrarAnalisisCarterasBusqueda.addActionListener(new ButtonActionListener(this,"dia_hastaCobrarAnalisisCarterasBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTabbedPaneRelacionesCobrarAnalisisCarteras.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarAnalisisCarteras"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCobrarAnalisisCarteras"));
		
		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarAnalisisCarteras"));
		}
		
		this.jTableDatosCobrarAnalisisCarteras.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCobrarAnalisisCarteras"));
		
		this.jTableDatosCobrarAnalisisCarteras.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCobrarAnalisisCarteras"));
		
		this.jButtonNuevoCobrarAnalisisCarteras.addActionListener(new ButtonActionListener(this,"NuevoCobrarAnalisisCarteras"));
		
		this.jButtonDuplicarCobrarAnalisisCarteras.addActionListener(new ButtonActionListener(this,"DuplicarCobrarAnalisisCarteras"));
		
		this.jButtonCopiarCobrarAnalisisCarteras.addActionListener(new ButtonActionListener(this,"CopiarCobrarAnalisisCarteras"));
		
		this.jButtonVerFormCobrarAnalisisCarteras.addActionListener(new ButtonActionListener(this,"VerFormCobrarAnalisisCarteras"));
		
		
		this.jButtonNuevoToolBarCobrarAnalisisCarteras.addActionListener(new ButtonActionListener(this,"NuevoToolBarCobrarAnalisisCarteras"));
			
		this.jButtonDuplicarToolBarCobrarAnalisisCarteras.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCobrarAnalisisCarteras"));
			
		this.jMenuItemNuevoCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCobrarAnalisisCarteras"));
			
		this.jMenuItemDuplicarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCobrarAnalisisCarteras"));		
		
		
		this.jButtonNuevoRelacionesCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCobrarAnalisisCarteras"));
		
		
		this.jButtonNuevoRelacionesToolBarCobrarAnalisisCarteras.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCobrarAnalisisCarteras"));
			
		this.jMenuItemNuevoRelacionesCobrarAnalisisCarteras.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCobrarAnalisisCarteras"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonModificarCobrarAnalisisCarteras.addActionListener(new ButtonActionListener(this,"ModificarCobrarAnalisisCarteras"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonModificarToolBarCobrarAnalisisCarteras.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarAnalisisCarteras"));
			
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jMenuItemModificarCobrarAnalisisCarteras.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarAnalisisCarteras"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonActualizarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"ActualizarCobrarAnalisisCarteras"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonActualizarToolBarCobrarAnalisisCarteras.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarAnalisisCarteras"));
				
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jMenuItemActualizarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarAnalisisCarteras"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonEliminarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"EliminarCobrarAnalisisCarteras"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonEliminarToolBarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarAnalisisCarteras"));
						
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jMenuItemEliminarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarAnalisisCarteras"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonCancelarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"CancelarCobrarAnalisisCarteras"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonCancelarToolBarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarAnalisisCarteras"));
			
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jMenuItemCancelarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarAnalisisCarteras"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCobrarAnalisisCarteras"));		
		
		
		this.jButtonCerrarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"CerrarCobrarAnalisisCarteras"));
		
		
		this.jButtonCerrarToolBarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"CerrarToolBarCobrarAnalisisCarteras"));
			
		this.jMenuItemCerrarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCobrarAnalisisCarteras"));
			
		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jMenuItemDetalleCerrarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarAnalisisCarteras"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonGuardarCambiosCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"GuardarCambiosCobrarAnalisisCarteras"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonGuardarCambiosToolBarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarAnalisisCarteras"));
		}
		
		this.jButtonCopiarToolBarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"CopiarToolBarCobrarAnalisisCarteras"));
			
		this.jButtonVerFormToolBarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"VerFormToolBarCobrarAnalisisCarteras"));
		
		this.jMenuItemGuardarCambiosCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCobrarAnalisisCarteras"));
			
		this.jMenuItemCopiarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCobrarAnalisisCarteras"));		
		
		this.jMenuItemVerFormCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCobrarAnalisisCarteras"));		
		
		
		this.jButtonGuardarCambiosTablaCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarAnalisisCarteras"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCobrarAnalisisCarteras"));
			
		this.jMenuItemGuardarCambiosTablaCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarAnalisisCarteras"));		
		
		
		
		this.jButtonRecargarInformacionCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"RecargarInformacionCobrarAnalisisCarteras"));
					
		this.jButtonRecargarInformacionToolBarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCobrarAnalisisCarteras"));
		
		this.jMenuItemRecargarInformacionCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCobrarAnalisisCarteras"));		
		
		
		
		this.jButtonAnterioresCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"AnterioresCobrarAnalisisCarteras"));
		
		
		this.jButtonAnterioresToolBarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCobrarAnalisisCarteras"));
		
		this.jMenuItemAnterioresCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCobrarAnalisisCarteras"));		
		
		
		this.jButtonSiguientesCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"SiguientesCobrarAnalisisCarteras"));
		
		
		this.jButtonSiguientesToolBarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCobrarAnalisisCarteras"));
			
		this.jMenuItemSiguientesCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCobrarAnalisisCarteras"));
			
		this.jMenuItemAbrirOrderByCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCobrarAnalisisCarteras"));
			
		this.jMenuItemMostrarOcultarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCobrarAnalisisCarteras"));
			
		this.jMenuItemDetalleAbrirOrderByCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCobrarAnalisisCarteras"));
			
		this.jMenuItemDetalleMostarOcultarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCobrarAnalisisCarteras"));		
		
		
		this.jButtonNuevoGuardarCambiosCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCobrarAnalisisCarteras"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCobrarAnalisisCarteras"));
			
		this.jMenuItemNuevoGuardarCambiosCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCobrarAnalisisCarteras"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCobrarAnalisisCarteras.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCobrarAnalisisCarteras"));

		this.jCheckBoxSeleccionadosCobrarAnalisisCarteras.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCobrarAnalisisCarteras"));
		
		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jComboBoxTiposAccionesFormularioCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarAnalisisCarteras"));
		}
		
		
		this.jComboBoxTiposRelacionesCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"TiposRelacionesCobrarAnalisisCarteras"));
			
		this.jComboBoxTiposAccionesCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"TiposAccionesCobrarAnalisisCarteras"));
					
		this.jComboBoxTiposSeleccionarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCobrarAnalisisCarteras"));
			
		this.jTextFieldValorCampoGeneralCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCobrarAnalisisCarteras"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonidCobrarAnalisisCarterasBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarAnalisisCarterasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonid_empresaCobrarAnalisisCarterasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarAnalisisCarterasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonnombre_tipo_radio_venciCobrarAnalisisCarterasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_radio_venciCobrarAnalisisCarterasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtondia_desdeCobrarAnalisisCarterasBusqueda.addActionListener(new ButtonActionListener(this,"dia_desdeCobrarAnalisisCarterasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtondia_hastaCobrarAnalisisCarterasBusqueda.addActionListener(new ButtonActionListener(this,"dia_hastaCobrarAnalisisCarterasBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras.addActionListener(new ButtonActionListener(this,"BusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras!=null) {
				this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarAnalisisCarteras"));
				this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarAnalisisCarteras"));
				this.jInternalFrameReporteDinamicoCobrarAnalisisCarteras.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarAnalisisCarteras"));
			}
			
			//this.jButtonCerrarReporteDinamicoCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarAnalisisCarteras"));				
			//this.jButtonGenerarReporteDinamicoCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarAnalisisCarteras"));
			//this.jButtonGenerarExcelReporteDinamicoCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarAnalisisCarteras"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCobrarAnalisisCarteras!=null) {
				this.jInternalFrameImportacionCobrarAnalisisCarteras.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarAnalisisCarteras"));
				this.jInternalFrameImportacionCobrarAnalisisCarteras.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarAnalisisCarteras"));
				this.jInternalFrameImportacionCobrarAnalisisCarteras.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarAnalisisCarteras"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"AbrirOrderByCobrarAnalisisCarteras"));
			
			this.jButtonAbrirOrderByToolBarCobrarAnalisisCarteras.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCobrarAnalisisCarteras"));			
			
			if(this.jInternalFrameOrderByCobrarAnalisisCarteras!=null) {
				this.jInternalFrameOrderByCobrarAnalisisCarteras.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarAnalisisCarteras"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTabbedPaneRelacionesCobrarAnalisisCarteras.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarAnalisisCarteras"));
		
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
            		closingInternalFrameCobrarAnalisisCarteras();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCobrarAnalisisCarteras = (JInternalFrameBase)event.getSource();
	            	
	            CobrarAnalisisCarterasBeanSwingJInternalFrame jInternalFrameParent=(CobrarAnalisisCarterasBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarAnalisisCarteras.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCobrarAnalisisCarterasActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCobrarAnalisisCarteras.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCobrarAnalisisCarterasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCobrarAnalisisCarteras.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCobrarAnalisisCarteras.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarAnalisisCarterasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarAnalisisCarterasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarAnalisisCarterasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCobrarAnalisisCarteras";
		inputMap = this.jButtonNuevoCobrarAnalisisCarteras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCobrarAnalisisCarteras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarAnalisisCarterasActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarAnalisisCarterasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarAnalisisCarterasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarAnalisisCarterasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCobrarAnalisisCarteras";
		inputMap = this.jButtonNuevoRelacionesCobrarAnalisisCarteras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCobrarAnalisisCarteras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarAnalisisCarterasActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCobrarAnalisisCarteras";
		inputMap = this.jButtonModificarCobrarAnalisisCarteras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCobrarAnalisisCarteras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCobrarAnalisisCarterasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCobrarAnalisisCarteras";
		inputMap = this.jButtonActualizarCobrarAnalisisCarteras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCobrarAnalisisCarteras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCobrarAnalisisCarterasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCobrarAnalisisCarteras";
		inputMap = this.jButtonEliminarCobrarAnalisisCarteras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCobrarAnalisisCarteras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCobrarAnalisisCarterasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCobrarAnalisisCarteras";
		inputMap = this.jButtonCancelarCobrarAnalisisCarteras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCobrarAnalisisCarteras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCobrarAnalisisCarterasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCobrarAnalisisCarteras";
		inputMap = this.jButtonCerrarCobrarAnalisisCarteras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCobrarAnalisisCarteras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCobrarAnalisisCarterasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonGuardarCambiosCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCobrarAnalisisCarteras";
		inputMap = this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonGuardarCambiosCobrarAnalisisCarteras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonGuardarCambiosCobrarAnalisisCarteras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCobrarAnalisisCarterasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCobrarAnalisisCarteras.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCobrarAnalisisCarterasItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCobrarAnalisisCarteras.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCobrarAnalisisCarterasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCobrarAnalisisCarteras.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCobrarAnalisisCarterasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCobrarAnalisisCarteras.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCobrarAnalisisCarterasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonidCobrarAnalisisCarterasBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarAnalisisCarterasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonid_empresaCobrarAnalisisCarterasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarAnalisisCarterasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtonnombre_tipo_radio_venciCobrarAnalisisCarterasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_radio_venciCobrarAnalisisCarterasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtondia_desdeCobrarAnalisisCarterasBusqueda.addActionListener(new ButtonActionListener(this,"dia_desdeCobrarAnalisisCarterasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jButtondia_hastaCobrarAnalisisCarterasBusqueda.addActionListener(new ButtonActionListener(this,"dia_hastaCobrarAnalisisCarterasBusqueda"));
		
		
		this.jButtonBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras.addActionListener(new ButtonActionListener(this,"BusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCobrarAnalisisCarteras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCobrarAnalisisCarterasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCobrarAnalisisCarterasActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCobrarAnalisisCarteras.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCobrarAnalisisCarteras(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CobrarAnalisisCarteras cobraranalisiscarterasAux:this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass()) {
					cobraranalisiscarterasAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarAnalisisCarteras cobraranalisiscarterasAux:cobraranalisiscarterass) {
					cobraranalisiscarterasAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCobrarAnalisisCarterasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarAnalisisCarteras(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarAnalisisCarteras cobraranalisiscarterasAux:this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass()) {
						cobraranalisiscarterasAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarAnalisisCarteras cobraranalisiscarterasAux:cobraranalisiscarterass) {
						cobraranalisiscarterasAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CobrarAnalisisCarteras cobraranalisiscarterasAux:this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarAnalisisCarteras cobraranalisiscarterasAux:cobraranalisiscarterass) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarAnalisisCarteras(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarAnalisisCarteras.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarAnalisisCarteras.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarAnalisisCarteras,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCobrarAnalisisCarterasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarAnalisisCarteras(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCobrarAnalisisCarteras.getSelectedRows();
			
			CobrarAnalisisCarteras cobraranalisiscarterasLocal=new CobrarAnalisisCarteras();
			
			//this.seleccionarTodosCobrarAnalisisCarteras(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cobraranalisiscarterasLocal =(CobrarAnalisisCarteras) this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass().toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cobraranalisiscarterasLocal =(CobrarAnalisisCarteras) this.cobraranalisiscarterass.toArray()[this.jTableDatosCobrarAnalisisCarteras.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cobraranalisiscarterasLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarAnalisisCarteras cobraranalisiscarterasAux:this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass()) {
						cobraranalisiscarterasAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarAnalisisCarteras cobraranalisiscarterasAux:cobraranalisiscarterass) {
						cobraranalisiscarterasAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCobrarAnalisisCarteras(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarAnalisisCarteras.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarAnalisisCarteras.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarAnalisisCarteras,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCobrarAnalisisCarterasItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCobrarAnalisisCarterasParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCobrarAnalisisCarterasActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCobrarAnalisisCarteras(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCobrarAnalisisCarteras.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarAnalisisCarteras cobraranalisiscarterasAux:this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass()) {
				
						if(sTipoSeleccionar.equals(CobrarAnalisisCarterasConstantesFunciones.LABEL_IDEMPRESA)) {
							existe=true;
							cobraranalisiscarterasAux.setid_empresa(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarAnalisisCarterasConstantesFunciones.LABEL_NOMBRETIPORADIOVENCI)) {
							existe=true;
							cobraranalisiscarterasAux.setnombre_tipo_radio_venci(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarAnalisisCarterasConstantesFunciones.LABEL_DIADESDE)) {
							existe=true;
							cobraranalisiscarterasAux.setdia_desde(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarAnalisisCarterasConstantesFunciones.LABEL_DIAHASTA)) {
							existe=true;
							cobraranalisiscarterasAux.setdia_hasta(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarAnalisisCarteras cobraranalisiscarterasAux:cobraranalisiscarterass) {
					
						if(sTipoSeleccionar.equals(CobrarAnalisisCarterasConstantesFunciones.LABEL_IDEMPRESA)) {
							existe=true;
							cobraranalisiscarterasAux.setid_empresa(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarAnalisisCarterasConstantesFunciones.LABEL_NOMBRETIPORADIOVENCI)) {
							existe=true;
							cobraranalisiscarterasAux.setnombre_tipo_radio_venci(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarAnalisisCarterasConstantesFunciones.LABEL_DIADESDE)) {
							existe=true;
							cobraranalisiscarterasAux.setdia_desde(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarAnalisisCarterasConstantesFunciones.LABEL_DIAHASTA)) {
							existe=true;
							cobraranalisiscarterasAux.setdia_hasta(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarAnalisisCarteras(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCobrarAnalisisCarterasActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCobrarAnalisisCarteras(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCobrarAnalisisCarteras=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCobrarAnalisisCarteras.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jComboBoxTiposAccionesFormularioCobrarAnalisisCarteras.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCobrarAnalisisCarteras) {				
					conSplash=true;//false;										
					
					//this.startProcessCobrarAnalisisCarteras(conSplash);
				
					this.generarReporteCobrarAnalisisCarterassSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarAnalisisCarteras.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jComboBoxTiposAccionesFormularioCobrarAnalisisCarteras.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCobrarAnalisisCarterassSeleccionados();
				//this.jComboBoxTiposAccionesCobrarAnalisisCarteras.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarAnalisisCarterassSeleccionados(false);
				//this.jComboBoxTiposAccionesCobrarAnalisisCarteras.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarAnalisisCarterassSeleccionados(true);
				//this.jComboBoxTiposAccionesCobrarAnalisisCarteras.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarAnalisisCarteras();
				
				this.exportarCobrarAnalisisCarterassSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarAnalisisCarteras.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jComboBoxTiposAccionesFormularioCobrarAnalisisCarteras.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCobrarAnalisisCarterass();
				//this.importarCobrarAnalisisCarterass();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarAnalisisCarteras.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jComboBoxTiposAccionesFormularioCobrarAnalisisCarteras.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarAnalisisCarteras();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCobrarAnalisisCarterassSeleccionados();
				//this.jComboBoxTiposAccionesCobrarAnalisisCarteras.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cobrar Analisis Carteras", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCobrarAnalisisCarteras();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCobrarAnalisisCarteras)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCobrarAnalisisCarteras(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cobrar Analisis Carteras",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarAnalisisCarteras.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jComboBoxTiposAccionesFormularioCobrarAnalisisCarteras.setSelectedIndex(0);					
				}	
			} 			
			else if(CobrarAnalisisCarterasBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCobrarAnalisisCarteras) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCobrarAnalisisCarteras(conSplash);
					
						//this.actualizarParametrosGeneralCobrarAnalisisCarteras();
						
						this.generarReporteProcesoAccionCobrarAnalisisCarterassSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCobrarAnalisisCarteras.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jComboBoxTiposAccionesFormularioCobrarAnalisisCarteras.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cobrar Analisis CarterasES SELECCIONADOS?", "MANTENIMIENTO DE Cobrar Analisis Carteras", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCobrarAnalisisCarteras();
				
						this.actualizarParametrosGeneralCobrarAnalisisCarteras();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cobraranalisiscarterasReturnGeneral=cobraranalisiscarterasLogic.procesarAccionCobrarAnalisisCarterassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass(),this.cobraranalisiscarterasParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCobrarAnalisisCarterasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarAnalisisCarteras.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jComboBoxTiposAccionesFormularioCobrarAnalisisCarteras.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCobrarAnalisisCarteras();
					
					CobrarAnalisisCarterasBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCobrarAnalisisCarterasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarAnalisisCarteras.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jComboBoxTiposAccionesFormularioCobrarAnalisisCarteras.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCobrarAnalisisCarteras(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCobrarAnalisisCarterasActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCobrarAnalisisCarteras();
			
			if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CobrarAnalisisCarteras> cobraranalisiscarterassSeleccionados=new ArrayList<CobrarAnalisisCarteras>();		
			CobrarAnalisisCarteras cobraranalisiscarteras=new CobrarAnalisisCarteras();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCobrarAnalisisCarteras(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCobrarAnalisisCarteras.getSelectedItem();
			
			
			
			
			cobraranalisiscarterassSeleccionados=this.getCobrarAnalisisCarterassSeleccionados(true);
			//this.sTipoAccion;
			
			if(cobraranalisiscarterassSeleccionados.size()==1) {
				for(CobrarAnalisisCarteras cobraranalisiscarterasAux:cobraranalisiscarterassSeleccionados) {
					cobraranalisiscarteras=cobraranalisiscarterasAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCobrarAnalisisCarteras();
			
      		//this.finishProcessCobrarAnalisisCarteras(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCobrarAnalisisCarterasReturnGeneral() throws Exception {
		if(this.cobraranalisiscarterasReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cobraranalisiscarterasReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cobraranalisiscarterasReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cobraranalisiscarterasReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cobraranalisiscarterasReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cobraranalisiscarterasReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCobrarAnalisisCarteras(false);
		}
		
		if(this.cobraranalisiscarterasReturnGeneral.getConRetornoLista() || this.cobraranalisiscarterasReturnGeneral.getConRetornoObjeto()) {
			if(this.cobraranalisiscarterasReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cobraranalisiscarterasLogic.setCobrarAnalisisCarterass(this.cobraranalisiscarterasReturnGeneral.getCobrarAnalisisCarterass());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingCobrarAnalisisCarteras(false);
		}
	}
	
	public void actualizarParametrosGeneralCobrarAnalisisCarteras() throws Exception {
		
		
	}
	
	public ArrayList<CobrarAnalisisCarteras> getCobrarAnalisisCarterassSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CobrarAnalisisCarteras> cobraranalisiscarterassSeleccionados=new ArrayList<CobrarAnalisisCarteras>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCobrarAnalisisCarteras) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CobrarAnalisisCarteras cobraranalisiscarterasAux:cobraranalisiscarterasLogic.getCobrarAnalisisCarterass()) {
					if(cobraranalisiscarterasAux.getIsSelected()) {
						cobraranalisiscarterassSeleccionados.add(cobraranalisiscarterasAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarAnalisisCarteras cobraranalisiscarterasAux:this.cobraranalisiscarterass) {
					if(cobraranalisiscarterasAux.getIsSelected()) {
						cobraranalisiscarterassSeleccionados.add(cobraranalisiscarterasAux);				
					}
				}
			}
			
			if(cobraranalisiscarterassSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cobraranalisiscarterassSeleccionados.addAll(this.cobraranalisiscarterasLogic.getCobrarAnalisisCarterass());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cobraranalisiscarterassSeleccionados.addAll(this.cobraranalisiscarterass);				
					}
				}
			}
		} else {
			cobraranalisiscarterassSeleccionados.add(this.cobraranalisiscarteras);
		}
		
		return cobraranalisiscarterassSeleccionados;
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
	
	public void generarReporteCobrarAnalisisCarterassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCobrarAnalisisCarterassSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCobrarAnalisisCarterassSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarAnalisisCarterassSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarAnalisisCarterassSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cobrar Analisis Carteras",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCobrarAnalisisCarterassSeleccionados() throws Exception {
		ArrayList<CobrarAnalisisCarteras> cobraranalisiscarterassSeleccionados=new ArrayList<CobrarAnalisisCarteras>();		
		
		cobraranalisiscarterassSeleccionados=this.getCobrarAnalisisCarterassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCobrarAnalisisCarterass("Todos",cobraranalisiscarterassSeleccionados);
		
	}	
	
	public void generarReporteNormalCobrarAnalisisCarterassSeleccionados() throws Exception {
		ArrayList<CobrarAnalisisCarteras> cobraranalisiscarterassSeleccionados=new ArrayList<CobrarAnalisisCarteras>();		
		
		cobraranalisiscarterassSeleccionados=this.getCobrarAnalisisCarterassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCobrarAnalisisCarterass("Todos",cobraranalisiscarterassSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCobrarAnalisisCarterassSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CobrarAnalisisCarteras> cobraranalisiscarterassSeleccionados=new ArrayList<CobrarAnalisisCarteras>();
		
		cobraranalisiscarterassSeleccionados=this.getCobrarAnalisisCarterassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCobrarAnalisisCarterass("Todos",cobraranalisiscarterassSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCobrarAnalisisCarterassSeleccionados() throws Exception {
		ArrayList<CobrarAnalisisCarteras> cobraranalisiscarterassSeleccionados=new ArrayList<CobrarAnalisisCarteras>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCobrarAnalisisCarteras();
		
		
		cobraranalisiscarterassSeleccionados=this.getCobrarAnalisisCarterassSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCobrarAnalisisCarteras();
		
		
		//this.generarReporteCobrarAnalisisCarterass("Todos",cobraranalisiscarterassSeleccionados ,cobraranalisiscarterasImplementable,cobraranalisiscarterasImplementableHome);
	}
	
	public void mostrarImportacionCobrarAnalisisCarterass() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCobrarAnalisisCarteras();
		
		this.abrirFrameImportacionCobrarAnalisisCarteras();		
		
			
		//this.generarReporteCobrarAnalisisCarterass("Todos",cobraranalisiscarterassSeleccionados ,cobraranalisiscarterasImplementable,cobraranalisiscarterasImplementableHome);
	}
	
	public void importarCobrarAnalisisCarterass() throws Exception {		
	
	}
	
	public void exportarCobrarAnalisisCarterassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCobrarAnalisisCarterassSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCobrarAnalisisCarterassSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCobrarAnalisisCarterassSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cobrar Analisis Carteras",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCobrarAnalisisCarterassSeleccionados() throws Exception {
		ArrayList<CobrarAnalisisCarteras> cobraranalisiscarterassSeleccionados=new ArrayList<CobrarAnalisisCarteras>();		
		
		cobraranalisiscarterassSeleccionados=this.getCobrarAnalisisCarterassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobraranalisiscarteras."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCobrarAnalisisCarteras(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CobrarAnalisisCarteras cobraranalisiscarterasAux:cobraranalisiscarterassSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCobrarAnalisisCarteras(cobraranalisiscarterasAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cobraranalisiscarterasAux.setsDetalleGeneralEntityReporte(cobraranalisiscarterasAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Analisis Carteras",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCobrarAnalisisCarteras(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CobrarAnalisisCarterasConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarAnalisisCarterasConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarAnalisisCarterasConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarAnalisisCarterasConstantesFunciones.LABEL_NOMBRETIPORADIOVENCI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarAnalisisCarterasConstantesFunciones.LABEL_DIADESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarAnalisisCarterasConstantesFunciones.LABEL_DIAHASTA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCobrarAnalisisCarteras(CobrarAnalisisCarteras cobraranalisiscarteras,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cobraranalisiscarteras.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cobraranalisiscarteras.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobraranalisiscarteras.getid_empresa().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobraranalisiscarteras.getnombre_tipo_radio_venci();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobraranalisiscarteras.getdia_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobraranalisiscarteras.getdia_hasta().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCobrarAnalisisCarterassSeleccionados() throws Exception {
		ArrayList<CobrarAnalisisCarteras> cobraranalisiscarterassSeleccionados=new ArrayList<CobrarAnalisisCarteras>();		
		
		cobraranalisiscarterassSeleccionados=this.getCobrarAnalisisCarterassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobraranalisiscarteras.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CobrarAnalisisCarterass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCobrarAnalisisCarteras(row);				
				iRow++;
			}				
			
			for(CobrarAnalisisCarteras cobraranalisiscarterasAux:cobraranalisiscarterassSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCobrarAnalisisCarteras(cobraranalisiscarterasAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Analisis Carteras",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCobrarAnalisisCarterassSeleccionados() throws Exception {
		ArrayList<CobrarAnalisisCarteras> cobraranalisiscarterassSeleccionados=new ArrayList<CobrarAnalisisCarteras>();		
		
		cobraranalisiscarterassSeleccionados=this.getCobrarAnalisisCarterassSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobraranalisiscarteras.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cobraranalisiscarterass");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cobraranalisiscarteras");
			//elementRoot.appendChild(element);
		
			for(CobrarAnalisisCarteras cobraranalisiscarterasAux:cobraranalisiscarterassSeleccionados) {
				element = document.createElement("cobraranalisiscarteras");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCobrarAnalisisCarteras(cobraranalisiscarterasAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Analisis Carteras",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCobrarAnalisisCarteras(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarAnalisisCarterasConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarAnalisisCarterasConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CobrarAnalisisCarterasConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarAnalisisCarterasConstantesFunciones.LABEL_NOMBRETIPORADIOVENCI);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarAnalisisCarterasConstantesFunciones.LABEL_DIADESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarAnalisisCarterasConstantesFunciones.LABEL_DIAHASTA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCobrarAnalisisCarteras(CobrarAnalisisCarteras cobraranalisiscarteras,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cobraranalisiscarteras.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cobraranalisiscarteras.getid_empresa());
		cell = row.createCell(iColumn++);cell.setCellValue(cobraranalisiscarteras.getnombre_tipo_radio_venci());
		cell = row.createCell(iColumn++);cell.setCellValue(cobraranalisiscarteras.getdia_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(cobraranalisiscarteras.getdia_hasta());				
	}
	
	public void setFilaDatosExportarXmlCobrarAnalisisCarteras(CobrarAnalisisCarteras cobraranalisiscarteras,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CobrarAnalisisCarterasConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cobraranalisiscarteras.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CobrarAnalisisCarterasConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cobraranalisiscarteras.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementid_empresa = document.createElement(CobrarAnalisisCarterasConstantesFunciones.IDEMPRESA);
		elementid_empresa.appendChild(document.createTextNode(cobraranalisiscarteras.getid_empresa().toString().trim()));
		element.appendChild(elementid_empresa);

		Element elementnombre_tipo_radio_venci = document.createElement(CobrarAnalisisCarterasConstantesFunciones.NOMBRETIPORADIOVENCI);
		elementnombre_tipo_radio_venci.appendChild(document.createTextNode(cobraranalisiscarteras.getnombre_tipo_radio_venci().trim()));
		element.appendChild(elementnombre_tipo_radio_venci);

		Element elementdia_desde = document.createElement(CobrarAnalisisCarterasConstantesFunciones.DIADESDE);
		elementdia_desde.appendChild(document.createTextNode(cobraranalisiscarteras.getdia_desde().toString().trim()));
		element.appendChild(elementdia_desde);

		Element elementdia_hasta = document.createElement(CobrarAnalisisCarterasConstantesFunciones.DIAHASTA);
		elementdia_hasta.appendChild(document.createTextNode(cobraranalisiscarteras.getdia_hasta().toString().trim()));
		element.appendChild(elementdia_hasta);
	}
	
	public void generarReporteGroupGenericoCobrarAnalisisCarterassSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CobrarAnalisisCarteras> cobraranalisiscarterassSeleccionados=new ArrayList<CobrarAnalisisCarteras>();
		
		cobraranalisiscarterassSeleccionados=this.getCobrarAnalisisCarterassSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCobrarAnalisisCarteras(cobraranalisiscarterassSeleccionados);
		
		this.generarReporteCobrarAnalisisCarterass("Todos",cobraranalisiscarterassSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCobrarAnalisisCarteras(ArrayList<CobrarAnalisisCarteras> cobraranalisiscarterassSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CobrarAnalisisCarteras cobraranalisiscarterasAux:cobraranalisiscarterassSeleccionados) {
				cobraranalisiscarterasAux.setsDetalleGeneralEntityReporte(cobraranalisiscarterasAux.toString());
			
				if(sTipoSeleccionar.equals(CobrarAnalisisCarterasConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cobraranalisiscarterasAux.setsDescripcionGeneralEntityReporte1(cobraranalisiscarterasAux.getid_empresa().toString());
				}
				 else if(sTipoSeleccionar.equals(CobrarAnalisisCarterasConstantesFunciones.LABEL_NOMBRETIPORADIOVENCI)) {
					existe=true;
					cobraranalisiscarterasAux.setsDescripcionGeneralEntityReporte1(cobraranalisiscarterasAux.getnombre_tipo_radio_venci());
				}
				 else if(sTipoSeleccionar.equals(CobrarAnalisisCarterasConstantesFunciones.LABEL_DIADESDE)) {
					existe=true;
					cobraranalisiscarterasAux.setsDescripcionGeneralEntityReporte1(cobraranalisiscarterasAux.getdia_desde().toString());
				}
				 else if(sTipoSeleccionar.equals(CobrarAnalisisCarterasConstantesFunciones.LABEL_DIAHASTA)) {
					existe=true;
					cobraranalisiscarterasAux.setsDescripcionGeneralEntityReporte1(cobraranalisiscarterasAux.getdia_hasta().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarAnalisisCarterasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCobrarAnalisisCarteras(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCobrarAnalisisCarteras=true;
				this.isVisibilidadCeldaNuevoRelacionesCobrarAnalisisCarteras=true;
				this.isVisibilidadCeldaGuardarCambiosCobrarAnalisisCarteras=true;
			}
			
			this.isVisibilidadCeldaModificarCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaActualizarCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaEliminarCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaCancelarCobrarAnalisisCarteras=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarAnalisisCarteras=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarAnalisisCarteras=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaModificarCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaActualizarCobrarAnalisisCarteras=true;
			this.isVisibilidadCeldaEliminarCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaCancelarCobrarAnalisisCarteras=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarAnalisisCarteras=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarAnalisisCarteras=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaModificarCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaActualizarCobrarAnalisisCarteras=true;
			this.isVisibilidadCeldaEliminarCobrarAnalisisCarteras=true;
			this.isVisibilidadCeldaCancelarCobrarAnalisisCarteras=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarAnalisisCarteras=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarAnalisisCarteras=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaModificarCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaActualizarCobrarAnalisisCarteras=true;
			this.isVisibilidadCeldaEliminarCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaCancelarCobrarAnalisisCarteras=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarAnalisisCarteras=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarAnalisisCarteras=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCobrarAnalisisCarteras=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarAnalisisCarteras=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarAnalisisCarteras=true;
			this.isVisibilidadCeldaModificarCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaActualizarCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaEliminarCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaCancelarCobrarAnalisisCarteras=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarAnalisisCarteras=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarAnalisisCarteras=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaActualizarCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaEliminarCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaCancelarCobrarAnalisisCarteras=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarAnalisisCarteras=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarAnalisisCarteras=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaModificarCobrarAnalisisCarteras=true;
			this.isVisibilidadCeldaActualizarCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaEliminarCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaCancelarCobrarAnalisisCarteras=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarAnalisisCarteras=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarAnalisisCarteras=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CobrarAnalisisCarterasJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCobrarAnalisisCarteras=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarAnalisisCarteras=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarAnalisisCarteras=true;
		} else {
			this.actualizarEstadoPanelsCobrarAnalisisCarteras(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCobrarAnalisisCarteras=false;
			//this.isVisibilidadCeldaVerFormCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaDuplicarCobrarAnalisisCarteras=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cobraranalisiscarterasSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarAnalisisCarteras=false;
		} else {
			this.isVisibilidadCeldaNuevoCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarAnalisisCarteras=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {
			if(!cobraranalisiscarterasSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCobrarAnalisisCarteras=false;												
			}
			
			this.jButtonCerrarCobrarAnalisisCarteras.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarAnalisisCarteras=false;
		}
		
		if(!this.permiteMantenimiento(this.cobraranalisiscarteras)) {
			this.isVisibilidadCeldaActualizarCobrarAnalisisCarteras=false;
			this.isVisibilidadCeldaEliminarCobrarAnalisisCarteras=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoCobrarAnalisisCarteras=false;
		this.isVisibilidadCeldaNuevoRelacionesCobrarAnalisisCarteras=false;
		this.isVisibilidadCeldaGuardarCambiosCobrarAnalisisCarteras=false;
		//this.isVisibilidadCeldaModificarCobrarAnalisisCarteras=true;
		this.isVisibilidadCeldaActualizarCobrarAnalisisCarteras=false;
		this.isVisibilidadCeldaEliminarCobrarAnalisisCarteras=false;
		//this.isVisibilidadCeldaCancelarCobrarAnalisisCarteras=true;			
		this.isVisibilidadCeldaGuardarCobrarAnalisisCarteras=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarAnalisisCarteras() {
	}
	
	public void actualizarEstadoPanelsCobrarAnalisisCarteras(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCobrarAnalisisCarteras!=null) {
				this.jScrollPanelDatosEdicionCobrarAnalisisCarteras.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarAnalisisCarteras!=null) {
				this.jTabbedPaneBusquedasCobrarAnalisisCarteras.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarAnalisisCarteras!=null) {
				this.jScrollPanelDatosCobrarAnalisisCarteras.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarAnalisisCarteras!=null) {
				this.jPanelPaginacionCobrarAnalisisCarteras.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarAnalisisCarteras!=null) {
				this.jPanelParametrosReportesCobrarAnalisisCarteras.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCobrarAnalisisCarteras!=null) {
				this.jScrollPanelDatosEdicionCobrarAnalisisCarteras.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarAnalisisCarteras!=null) {
				this.jTabbedPaneBusquedasCobrarAnalisisCarteras.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCobrarAnalisisCarteras!=null) {
				this.jScrollPanelDatosCobrarAnalisisCarteras.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarAnalisisCarteras!=null) {
				this.jPanelPaginacionCobrarAnalisisCarteras.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarAnalisisCarteras!=null) {
				this.jPanelParametrosReportesCobrarAnalisisCarteras.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCobrarAnalisisCarteras!=null) {
				this.jScrollPanelDatosEdicionCobrarAnalisisCarteras.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarAnalisisCarteras!=null) {
				this.jTabbedPaneBusquedasCobrarAnalisisCarteras.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarAnalisisCarteras!=null) {
				this.jScrollPanelDatosCobrarAnalisisCarteras.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarAnalisisCarteras!=null) {
				this.jPanelPaginacionCobrarAnalisisCarteras.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarAnalisisCarteras!=null) {
				this.jPanelParametrosReportesCobrarAnalisisCarteras.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCobrarAnalisisCarteras!=null) {
				this.jScrollPanelDatosEdicionCobrarAnalisisCarteras.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarAnalisisCarteras!=null) {
				this.jTabbedPaneBusquedasCobrarAnalisisCarteras.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarAnalisisCarteras!=null) {
				this.jScrollPanelDatosCobrarAnalisisCarteras.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarAnalisisCarteras!=null) {
				this.jPanelPaginacionCobrarAnalisisCarteras.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarAnalisisCarteras!=null) {
				this.jPanelParametrosReportesCobrarAnalisisCarteras.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCobrarAnalisisCarteras!=null) {
				this.jScrollPanelDatosEdicionCobrarAnalisisCarteras.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarAnalisisCarteras!=null) {
				this.jTabbedPaneBusquedasCobrarAnalisisCarteras.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarAnalisisCarteras!=null) {
				this.jScrollPanelDatosCobrarAnalisisCarteras.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarAnalisisCarteras!=null) {
				this.jPanelPaginacionCobrarAnalisisCarteras.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarAnalisisCarteras!=null) {
				this.jPanelParametrosReportesCobrarAnalisisCarteras.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCobrarAnalisisCarteras!=null) {
				this.jScrollPanelDatosEdicionCobrarAnalisisCarteras.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarAnalisisCarteras!=null) {
				this.jTabbedPaneBusquedasCobrarAnalisisCarteras.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarAnalisisCarteras!=null) {
				this.jScrollPanelDatosCobrarAnalisisCarteras.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarAnalisisCarteras!=null) {
				this.jPanelPaginacionCobrarAnalisisCarteras.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarAnalisisCarteras!=null) {
				this.jPanelParametrosReportesCobrarAnalisisCarteras.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCobrarAnalisisCarteras!=null) {
				this.jScrollPanelDatosEdicionCobrarAnalisisCarteras.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarAnalisisCarteras!=null) {
				this.jTabbedPaneBusquedasCobrarAnalisisCarteras.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarAnalisisCarteras!=null) {
				this.jScrollPanelDatosCobrarAnalisisCarteras.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarAnalisisCarteras!=null) {
				this.jPanelPaginacionCobrarAnalisisCarteras.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarAnalisisCarteras!=null) {
				this.jPanelParametrosReportesCobrarAnalisisCarteras.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCobrarAnalisisCarteras!=null) {
					this.jTabbedPaneBusquedasCobrarAnalisisCarteras.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCobrarAnalisisCarteras!=null) {
				this.jPanelParametrosReportesCobrarAnalisisCarteras.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cobraranalisiscarterasSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarAnalisisCarteras!=null) {
				this.jTabbedPaneBusquedasCobrarAnalisisCarteras.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCobrarAnalisisCarteras!=null) {
				this.jPanelParametrosReportesCobrarAnalisisCarteras.setVisible(true);
			}
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
			
			this.inicializarActualizarBindingTablaCobrarAnalisisCarteras(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCobrarAnalisisCarteras() {
		this.updateBorderResaltarBusquedasFormularioCobrarAnalisisCarteras();
		this.updateVisibilidadBusquedasFormularioCobrarAnalisisCarteras();
		this.updateHabilitarBusquedasFormularioCobrarAnalisisCarteras();
	}
	
	public void updateBorderResaltarBusquedasFormularioCobrarAnalisisCarteras() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCobrarAnalisisCarteras.getComponents().length>0) {
	

		if(this.cobraranalisiscarterasConstantesFunciones.resaltarBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras!=null) {
			index= this.jTabbedPaneBusquedasCobrarAnalisisCarteras.indexOfComponent(this.jPanelBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarAnalisisCarteras.getComponent(index);
				jPanel.setBorder(this.cobraranalisiscarterasConstantesFunciones.resaltarBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCobrarAnalisisCarteras() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCobrarAnalisisCarteras.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarAnalisisCarteras.indexOfComponent(this.jPanelBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarAnalisisCarteras.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cobraranalisiscarterasConstantesFunciones.mostrarBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras);
			if(!this.cobraranalisiscarterasConstantesFunciones.mostrarBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras && index>-1) {
				this.jTabbedPaneBusquedasCobrarAnalisisCarteras.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCobrarAnalisisCarteras() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCobrarAnalisisCarteras.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarAnalisisCarteras.indexOfComponent(this.jPanelBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarAnalisisCarteras.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cobraranalisiscarterasConstantesFunciones.activarBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras);
				this.jTabbedPaneBusquedasCobrarAnalisisCarteras.setEnabledAt(index,this.cobraranalisiscarterasConstantesFunciones.activarBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCobrarAnalisisCarteras(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaCobrarAnalisisCarteras")) {
			index= this.jTabbedPaneBusquedasCobrarAnalisisCarteras.indexOfComponent(this.jPanelBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras);

			this.jTabbedPaneBusquedasCobrarAnalisisCarteras.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarAnalisisCarteras.getComponent(index);

			this.cobraranalisiscarterasConstantesFunciones.setResaltarBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras(resaltar);

			jPanel.setBorder(this.cobraranalisiscarterasConstantesFunciones.resaltarBusquedaCobrarAnalisisCarterasCobrarAnalisisCarteras);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCobrarAnalisisCarteras.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCobrarAnalisisCarteras() throws Exception {

		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCobrarAnalisisCarteras();
		this.updateVisibilidadResaltarControlesFormularioCobrarAnalisisCarteras();
		this.updateHabilitarResaltarControlesFormularioCobrarAnalisisCarteras();
		
	}
	
	public void updateBorderResaltarControlesFormularioCobrarAnalisisCarteras() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cobraranalisiscarterasConstantesFunciones.resaltaridCobrarAnalisisCarteras!=null && this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) {this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jLabelidCobrarAnalisisCarteras.setBorder(this.cobraranalisiscarterasConstantesFunciones.resaltaridCobrarAnalisisCarteras);}
		if(this.cobraranalisiscarterasConstantesFunciones.resaltarid_empresaCobrarAnalisisCarteras!=null && this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) {this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTextFieldid_empresaCobrarAnalisisCarteras.setBorder(this.cobraranalisiscarterasConstantesFunciones.resaltarid_empresaCobrarAnalisisCarteras);}
		if(this.cobraranalisiscarterasConstantesFunciones.resaltarnombre_tipo_radio_venciCobrarAnalisisCarteras!=null && this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) {this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTextAreanombre_tipo_radio_venciCobrarAnalisisCarteras.setBorder(this.cobraranalisiscarterasConstantesFunciones.resaltarnombre_tipo_radio_venciCobrarAnalisisCarteras);}
		if(this.cobraranalisiscarterasConstantesFunciones.resaltardia_desdeCobrarAnalisisCarteras!=null && this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) {this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTextFielddia_desdeCobrarAnalisisCarteras.setBorder(this.cobraranalisiscarterasConstantesFunciones.resaltardia_desdeCobrarAnalisisCarteras);}
		if(this.cobraranalisiscarterasConstantesFunciones.resaltardia_hastaCobrarAnalisisCarteras!=null && this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) {this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTextFielddia_hastaCobrarAnalisisCarteras.setBorder(this.cobraranalisiscarterasConstantesFunciones.resaltardia_hastaCobrarAnalisisCarteras);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCobrarAnalisisCarteras() throws Exception {		
		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) {
	
		//this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jLabelidCobrarAnalisisCarteras.setVisible(this.cobraranalisiscarterasConstantesFunciones.mostraridCobrarAnalisisCarteras);
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jPanelidCobrarAnalisisCarteras.setVisible(this.cobraranalisiscarterasConstantesFunciones.mostraridCobrarAnalisisCarteras);
		//this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTextFieldid_empresaCobrarAnalisisCarteras.setVisible(this.cobraranalisiscarterasConstantesFunciones.mostrarid_empresaCobrarAnalisisCarteras);
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jPanelid_empresaCobrarAnalisisCarteras.setVisible(this.cobraranalisiscarterasConstantesFunciones.mostrarid_empresaCobrarAnalisisCarteras);
		//this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTextAreanombre_tipo_radio_venciCobrarAnalisisCarteras.setVisible(this.cobraranalisiscarterasConstantesFunciones.mostrarnombre_tipo_radio_venciCobrarAnalisisCarteras);
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jPanelnombre_tipo_radio_venciCobrarAnalisisCarteras.setVisible(this.cobraranalisiscarterasConstantesFunciones.mostrarnombre_tipo_radio_venciCobrarAnalisisCarteras);
		//this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTextFielddia_desdeCobrarAnalisisCarteras.setVisible(this.cobraranalisiscarterasConstantesFunciones.mostrardia_desdeCobrarAnalisisCarteras);
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jPaneldia_desdeCobrarAnalisisCarteras.setVisible(this.cobraranalisiscarterasConstantesFunciones.mostrardia_desdeCobrarAnalisisCarteras);
		//this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTextFielddia_hastaCobrarAnalisisCarteras.setVisible(this.cobraranalisiscarterasConstantesFunciones.mostrardia_hastaCobrarAnalisisCarteras);
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jPaneldia_hastaCobrarAnalisisCarteras.setVisible(this.cobraranalisiscarterasConstantesFunciones.mostrardia_hastaCobrarAnalisisCarteras);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCobrarAnalisisCarteras() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarAnalisisCarteras!=null) {
	
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jLabelidCobrarAnalisisCarteras.setEnabled(this.cobraranalisiscarterasConstantesFunciones.activaridCobrarAnalisisCarteras);
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTextFieldid_empresaCobrarAnalisisCarteras.setEnabled(this.cobraranalisiscarterasConstantesFunciones.activarid_empresaCobrarAnalisisCarteras);
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTextAreanombre_tipo_radio_venciCobrarAnalisisCarteras.setEnabled(this.cobraranalisiscarterasConstantesFunciones.activarnombre_tipo_radio_venciCobrarAnalisisCarteras);
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTextFielddia_desdeCobrarAnalisisCarteras.setEnabled(this.cobraranalisiscarterasConstantesFunciones.activardia_desdeCobrarAnalisisCarteras);
		this.jInternalFrameDetalleFormCobrarAnalisisCarteras.jTextFielddia_hastaCobrarAnalisisCarteras.setEnabled(this.cobraranalisiscarterasConstantesFunciones.activardia_hastaCobrarAnalisisCarteras);
		}
	}
	
		
}